/**
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.services.translate;

import com.amazonaws.services.translate.model.*;

import org.junit.Test;

import static org.junit.Assert.*;

public class TranslateIntegrationTest extends TranslateIntegrationTestBase {

    @Test
    public void testTranslateText() {
        TranslateTextRequest translateTextRequest = new TranslateTextRequest()
            .withText("Hello, world")
            .withSourceLanguageCode("en")
            .withTargetLanguageCode("es");
        TranslateTextResult translateTextResult = translateClient.translateText(translateTextRequest);
        assertNotNull(translateTextResult);
        assertNotNull(translateTextResult.getTranslatedText());
        assertEquals(translateTextResult.getSourceLanguageCode(), translateTextRequest.getSourceLanguageCode());
        assertEquals(translateTextResult.getTargetLanguageCode(), translateTextRequest.getTargetLanguageCode());
        assertEquals(translateTextResult.getTranslatedText(), "Hola, mundo");
        System.out.println(translateTextResult.getTranslatedText());
    }

    @Test
    public void testTranslateTextSameLanguageCode() {
        final String text = "Hello, world";
        final String languageCode = "en";

        TranslateTextRequest translateTextRequest = new TranslateTextRequest()
            .withText(text)
            .withSourceLanguageCode(languageCode)
            .withTargetLanguageCode(languageCode);
        TranslateTextResult translateTextResult = translateClient.translateText(translateTextRequest);
        assertNotNull(translateTextResult);
        assertNotNull(translateTextResult.getTranslatedText());
        assertEquals(translateTextResult.getSourceLanguageCode(), translateTextRequest.getSourceLanguageCode());
        assertEquals(translateTextResult.getTargetLanguageCode(), translateTextRequest.getTargetLanguageCode());
        assertEquals(translateTextResult.getTranslatedText(), translateTextRequest.getText());
        assertEquals(translateTextResult.getTranslatedText(), "Hello, world");
        System.out.println(translateTextResult.getTranslatedText());
    }

    @Test
    public void testTranslateTextWrongLanguageCode() {
        final String text = "Hello, world";
        final String languageCode = "es";

        TranslateTextRequest translateTextRequest = new TranslateTextRequest()
            .withText(text)
            .withSourceLanguageCode(languageCode)
            .withTargetLanguageCode(languageCode);
        TranslateTextResult translateTextResult = translateClient.translateText(translateTextRequest);
        assertNotNull(translateTextResult);
        assertNotNull(translateTextResult.getTranslatedText());
        assertEquals(translateTextResult.getSourceLanguageCode(), translateTextRequest.getSourceLanguageCode());
        assertEquals(translateTextResult.getTargetLanguageCode(), translateTextRequest.getTargetLanguageCode());
        assertEquals(translateTextResult.getTranslatedText(), translateTextRequest.getText());
        System.out.println(translateTextResult.getTranslatedText());
    }

    @Test
    public void testTranslateLargerText() {
        StringBuffer text = new StringBuffer(); 
        for (int i = 0; i < 100; i++) {
            text.append("Hola, mundo. ");
        }

        TranslateTextRequest translateTextRequest = new TranslateTextRequest()
            .withText(text.toString())
            .withSourceLanguageCode("es")
            .withTargetLanguageCode("en");
        TranslateTextResult translateTextResult = translateClient.translateText(translateTextRequest);
        assertNotNull(translateTextResult);
        assertNotNull(translateTextResult.getTranslatedText());
        assertEquals(translateTextResult.getSourceLanguageCode(), translateTextRequest.getSourceLanguageCode());
        assertEquals(translateTextResult.getTargetLanguageCode(), translateTextRequest.getTargetLanguageCode());
    }
}
