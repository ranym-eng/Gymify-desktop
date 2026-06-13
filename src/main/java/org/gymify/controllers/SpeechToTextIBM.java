package org.gymify.controllers;

import com.ibm.watson.speech_to_text.v1.SpeechToText;
import com.ibm.watson.speech_to_text.v1.model.RecognizeOptions;
import com.ibm.watson.speech_to_text.v1.model.SpeechRecognitionResults;
import com.ibm.cloud.sdk.core.security.IamAuthenticator;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class SpeechToTextIBM {

    private static final String API_KEY = System.getenv("IBM_WATSON_SPEECH_TO_TEXT_API_KEY");
    private static final String SERVICE_URL = System.getenv("IBM_WATSON_SPEECH_TO_TEXT_URL");

    public static String transcribeAudio(File audioFile) throws IOException {
        if (API_KEY == null || API_KEY.isBlank() || SERVICE_URL == null || SERVICE_URL.isBlank()) {
            throw new IOException("IBM Watson Speech to Text environment variables are not configured.");
        }
        IamAuthenticator authenticator = new IamAuthenticator(API_KEY);
        SpeechToText speechToText = new SpeechToText(authenticator);
        speechToText.setServiceUrl(SERVICE_URL);

        RecognizeOptions options = new RecognizeOptions.Builder()
                .audio(new FileInputStream(audioFile))
                .contentType("audio/mp3") // Adaptable selon le format audio
                .model("fr-FR_BroadbandModel") // Modèle pour le français
                .build();

        SpeechRecognitionResults transcript = speechToText.recognize(options).execute().getResult();
        return transcript.getResults().get(0).getAlternatives().get(0).getTranscript();
    }
}
