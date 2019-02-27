/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.polly;

import android.support.test.InstrumentationRegistry;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.polly.model.*;
import com.amazonaws.testutils.AWSTestBase;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class PollyPresigningIntegrationTest extends AWSTestBase {
    private final int MAX_LEXICONS_FOR_SPEECH_SYNTHESIS_REQUEST = 5;
    private final int MAX_LEXICONS_FOR_GET_PRESIGNED_SYNTHESIZE_SPEECH_URL = 1;

    private static final String LEXICON_NAME_FORMAT = new Date().getTime() + "Test%d";
    private static final String LEXICON_CONTENT_FORMAT =
    "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
    "<lexicon version=\"1.0\" " +
        "xmlns=\"http://www.w3.org/2005/01/pronunciation-lexicon\" " +
        "xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" " +
        "xsi:schemaLocation=\"http://www.w3.org/2005/01/pronunciation-lexicon " +
            "http://www.w3.org/TR/2007/CR-pronunciation-lexicon-20071212/pls.xsd\" " +
        "alphabet=\"ipa\" xml:lang=\"en-GB\">" +
        "<lexeme>" +
            "<grapheme>Newton%d</grapheme>" +
            "<phoneme>ˈnjuːtən</phoneme>" +
            "<phoneme>ˈnuːtən</phoneme> " +
        "</lexeme>" +
    "</lexicon>";

    private AmazonPollyPresigningClient client;
    private AmazonPollyClient pollyClient;

    @BeforeClass
    public static void setupClass() throws Exception {
        setUpCredentials();
    }

    @Before
    public void setup() {
        client = new AmazonPollyPresigningClient(
                new StaticCredentialsProvider(credentials));
        pollyClient = new AmazonPollyClient(
                new StaticCredentialsProvider(credentials));
    }

    @After
    public void destroy() {
        String nextToken = null;
        do {
            final ListLexiconsRequest listLexiconsRequest = new ListLexiconsRequest()
                    .withNextToken(nextToken);
            final ListLexiconsResult listLexiconsResult = client.listLexicons(listLexiconsRequest);
            final List<LexiconDescription> lexicons = listLexiconsResult.getLexicons();
            for (final LexiconDescription lexiconDescription : lexicons) {
                client.deleteLexicon(
                        new DeleteLexiconRequest().withName(lexiconDescription.getName()));
            }
            nextToken = listLexiconsResult.getNextToken();
        } while (nextToken != null);
    }

    private void checkDescribeVoicesResult(LanguageCode languageCode, DescribeVoicesResult result) {
        Assert.assertNotNull(result);
        Assert.assertNotEquals("Language Code: " + languageCode.toString() + "VoiceId: " + result.getVoices().toString() + "result: " + result.getVoices().size() , 0, result.getVoices().size());
    }

    private void checkDescribeVoicesResult(DescribeVoicesResult result) {
        Assert.assertNotNull(result);
        Assert.assertNotEquals("VoiceId: " + result.getVoices().toString() + "result: " + result.getVoices().size() , 0, result.getVoices().size());
    }

    @Test
    public void testDescribeVoices() {
        final DescribeVoicesRequest request = new DescribeVoicesRequest();
        Assert.assertNotNull(request);
        final DescribeVoicesResult result = client.describeVoices(request);

        checkDescribeVoicesResult(result);
    }

    @Test
    public void testDescribeVoicesWithLanguageCode() {
        final DescribeVoicesRequest request = new DescribeVoicesRequest();
        Assert.assertNotNull(request);

        for (final LanguageCode languageCode : LanguageCode.values()) {
            request.setLanguageCode(languageCode);
            request.setIncludeAdditionalLanguageCodes(true);
            Assert.assertEquals(languageCode.toString(), request.getLanguageCode());

            final DescribeVoicesResult result = client.describeVoices(request);
            Assert.assertEquals(languageCode.toString(), request.getLanguageCode());

            checkDescribeVoicesResult(languageCode, result);
        }
    }

    @Test(expected=AmazonServiceException.class)
    public void testPutEmptyLexicon() {
        final PutLexiconRequest request = new PutLexiconRequest()
                .withName(String.format(LEXICON_NAME_FORMAT, 1));

        client.putLexicon(request);
    }

    @Test(expected=LexiconNotFoundException.class)
    public void testGetNonexistingLexicon() {
        final GetLexiconRequest getLexiconRequest = new GetLexiconRequest()
                .withName(String.format(LEXICON_NAME_FORMAT, 9));
        final GetLexiconResult getLexiconResult = client.getLexicon(getLexiconRequest);
    }

    @Test(expected=InvalidLexiconException.class)
    public void testPutInvalidLexicon() {
        final PutLexiconRequest putLexiconRequest = new PutLexiconRequest()
                .withName("foo")
                .withContent("bar");

        client.putLexicon(putLexiconRequest);
    }

    @Test(expected=AmazonServiceException.class)
    public void testPutTooLongNameLexicon() {
        final PutLexiconRequest putLexiconRequest = new PutLexiconRequest()
                .withName("012345678901234567890")
                .withContent(String.format(LEXICON_CONTENT_FORMAT, 0));

        client.putLexicon(putLexiconRequest);
    }

    private void putLexicons(int startInclusive, int endExclusive) {
        for (int i = startInclusive; i < endExclusive; i++) {
            final PutLexiconRequest putLexiconRequest = new PutLexiconRequest()
                    .withName(String.format(LEXICON_NAME_FORMAT, i))
                    .withContent(lexiconContent(i));

            client.putLexicon(putLexiconRequest);
        }
    }

    private void deleteLexicons(int startInclusive, int endExclusive) {
        for (int i = startInclusive; i < endExclusive; i++) {
            final DeleteLexiconRequest deleteLexiconRequest = new DeleteLexiconRequest()
                    .withName(lexiconName(i));
            final DeleteLexiconResult deleteLexiconResult = client.deleteLexicon(deleteLexiconRequest);
            Assert.assertNotNull(deleteLexiconResult);
        }
    }

    private String lexiconName(int index) {
        return String.format(LEXICON_NAME_FORMAT, index);
    }

    private String lexiconContent(int index) {
        return String.format(LEXICON_CONTENT_FORMAT, index);
    }

    @Test
    public void testManageLexicons() {
        final int lexiconRangeStart = 50;
        final int numberOfLexiconsToTest = 5;

        ListLexiconsRequest listLexiconsRequest = new ListLexiconsRequest();
        ListLexiconsResult listLexiconsResult = client.listLexicons(listLexiconsRequest);
        Assert.assertNotNull(listLexiconsResult);

        final int initialNumberOfLexicons = listLexiconsResult.getLexicons().size();

        putLexicons(lexiconRangeStart, lexiconRangeStart + numberOfLexiconsToTest);

        listLexiconsRequest = new ListLexiconsRequest();
        listLexiconsResult = client.listLexicons(listLexiconsRequest);

        Assert.assertEquals(
                initialNumberOfLexicons + numberOfLexiconsToTest,
                listLexiconsResult.getLexicons().size());

        check_next_lexicon:
        for (int i = lexiconRangeStart; i < lexiconRangeStart + numberOfLexiconsToTest; i++) {
            final String name = lexiconName(i);
            for (final LexiconDescription lexiconDescription : listLexiconsResult.getLexicons()) {
                if (lexiconDescription.getName().equals(name)) {
                    break check_next_lexicon;
                }
            }
            Assert.fail("Lexicon " + name + " not found in the result!");
        }

        for (int i = lexiconRangeStart; i < lexiconRangeStart + numberOfLexiconsToTest; i++) {
            final String name = lexiconName(i);
            final GetLexiconRequest getLexiconRequest = new GetLexiconRequest()
                    .withName(name);
            final GetLexiconResult getLexiconResult = client.getLexicon(getLexiconRequest);

            Assert.assertEquals(name, getLexiconResult.getLexicon().getName());
            Assert.assertEquals(
                    lexiconContent(i),
                    getLexiconResult.getLexicon().getContent());
        }

        deleteLexicons(lexiconRangeStart, lexiconRangeStart + numberOfLexiconsToTest);

        listLexiconsRequest = new ListLexiconsRequest();
        listLexiconsResult = client.listLexicons(listLexiconsRequest);
        Assert.assertEquals(initialNumberOfLexicons, listLexiconsResult.getLexicons().size());
    }

    @Test(expected=AmazonServiceException.class)
    public void testSynthesizeSpeechNoVoice() {
        final SynthesizeSpeechRequest synthesizeSpeechRequest = new SynthesizeSpeechRequest()
                .withText("1 2 3")
                .withOutputFormat(OutputFormat.Mp3);
        final SynthesizeSpeechResult synthesizeSpeechResult = client.synthesizeSpeech(synthesizeSpeechRequest);
    }

    @Test(expected=AmazonServiceException.class)
    public void testSynthesizeSpeechNoText() {
        final SynthesizeSpeechRequest synthesizeSpeechRequest = new SynthesizeSpeechRequest()
                .withVoiceId("Joanna")
                .withOutputFormat(OutputFormat.Mp3);
        final SynthesizeSpeechResult synthesizeSpeechResult = client.synthesizeSpeech(synthesizeSpeechRequest);
    }

    @Test(expected=AmazonServiceException.class)
    public void testSynthesizeSpeechNoOutputFormat() {
        final SynthesizeSpeechRequest synthesizeSpeechRequest = new SynthesizeSpeechRequest()
                .withVoiceId("Joanna");
        final SynthesizeSpeechResult synthesizeSpeechResult = client.synthesizeSpeech(synthesizeSpeechRequest);
    }

    private SynthesizeSpeechRequest prepareValidSynthesizeSpeechRequest() {
        return new SynthesizeSpeechRequest()
                .withVoiceId("Joanna")
                .withText("1 2 3")
                .withOutputFormat(OutputFormat.Mp3);
    }

    @Test
    public void testSynthesizeSpeech() {
        final SynthesizeSpeechRequest synthesizeSpeechRequest = prepareValidSynthesizeSpeechRequest();
        final SynthesizeSpeechResult synthesizeSpeechResult = client.synthesizeSpeech(synthesizeSpeechRequest);
        Assert.assertNotNull(synthesizeSpeechResult);
    }

    @Test
    public void testSynthesizeSpeechWithMultipleLexicons() throws IOException {
        String one = readResourceFileToString("one-to-two.pls");
        String four = readResourceFileToString("four-to-eight.pls");

        client.putLexicon(new PutLexiconRequest()
                .withName("one")
                .withContent(one));
        client.putLexicon(new PutLexiconRequest()
                .withName("four")
                .withContent(four));
        
        final SynthesizeSpeechPresignRequest synthesizeSpeechRequest = new SynthesizeSpeechPresignRequest()
                .withLexiconNames("one")
                .withLexiconNames("four")
                .withOutputFormat(OutputFormat.Mp3)
                .withText("one plus four equals ten")
                .withVoiceId(VoiceId.Joey);

        URL presignedURL = client
                .getPresignedSynthesizeSpeechUrl(synthesizeSpeechRequest);
        checkUrl(presignedURL);

        BufferedReader responseStream = null;

        try {
            responseStream = new BufferedReader(new InputStreamReader(
                    presignedURL.openStream()));
            StringBuilder sb = new StringBuilder();
            String s = null;
            while ((s = responseStream.readLine()) != null) {
                sb.append(s);
            }
            Assert.assertTrue(sb.toString().length() > 0);
        } finally {
            if (responseStream != null) {
                responseStream.close();
            }
        }
    }

    @Test
    public void testSynthesisTask() throws IOException {
        String one = readResourceFileToString("one-to-two.pls");
        String four = readResourceFileToString("four-to-eight.pls");

        client.putLexicon(new PutLexiconRequest()
                .withName("one")
                .withContent(one));
        client.putLexicon(new PutLexiconRequest()
                .withName("four")
                .withContent(four));

        final SynthesizeSpeechPresignRequest synthesizeSpeechRequest = new SynthesizeSpeechPresignRequest()
                .withLexiconNames("one")
                .withLexiconNames("four")
                .withOutputFormat(OutputFormat.Mp3)
                .withText("one plus four equals ten")
                .withVoiceId(VoiceId.Joey);

        StartSpeechSynthesisTaskRequest request = new StartSpeechSynthesisTaskRequest()
                .withLexiconNames("one")
                .withLexiconNames("four")
                .withOutputS3BucketName("test-bucket")
                .withOutputFormat(OutputFormat.Mp3)
                .withOutputS3KeyPrefix("polly-output.mp3")
                .withVoiceId(VoiceId.Joey)
                .withText("one plus four equals ten")
                .withTextType(TextType.Text);


        StartSpeechSynthesisTaskResult result = pollyClient.startSpeechSynthesisTask(request);
        Assert.assertTrue(result.getSynthesisTask().getTaskId().length() > 0);
        Assert.assertTrue(result.getSynthesisTask().getLexiconNames().size() == 2);

        String taskId = result.getSynthesisTask().getTaskId();

        GetSpeechSynthesisTaskRequest request1 = new GetSpeechSynthesisTaskRequest()
                .withTaskId(taskId);

        GetSpeechSynthesisTaskResult result1 = pollyClient.getSpeechSynthesisTask(request1);
        Assert.assertTrue(result1.getSynthesisTask().getTaskId().length() > 0);
        Assert.assertTrue(result1.getSynthesisTask().getLexiconNames().size() == 2);

    }
    
    private static String readResourceFileToString(String fileName) {
        final Class<PollyPresigningIntegrationTest> thisClass = PollyPresigningIntegrationTest.class;
        InputStream inputStream = null;
        Scanner in = null;
        try {
            inputStream = InstrumentationRegistry.getContext().getResources().getAssets().open(fileName);
            in = new Scanner(inputStream, "UTF-8").useDelimiter("\\A");
            return in.next();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    @Test
    public void testSynthesizeSpeechWithSpeechMarkTypes() throws IOException {
        final SynthesizeSpeechPresignRequest synthesizeSpeechRequest = new SynthesizeSpeechPresignRequest()
                .withOutputFormat(OutputFormat.Json)
                .withSpeechMarkTypes(SpeechMarkType.Word.toString())
                .withSpeechMarkTypes(SpeechMarkType.Sentence.toString())
                .withText("one plus four equals ten")
                .withVoiceId(VoiceId.Joey);

        URL presignedURL = client
                .getPresignedSynthesizeSpeechUrl(synthesizeSpeechRequest);
        checkUrl(presignedURL);

        BufferedReader responseStream = null;

        try {
            responseStream = new BufferedReader(new InputStreamReader(
                    presignedURL.openStream()));
            StringBuilder sb = new StringBuilder();
            String s = null;
            int lineCount = 0;
            while ((s = responseStream.readLine()) != null) {
                sb.append(s);
                ++lineCount;
            }
            Assert.assertEquals(6, lineCount);
            Assert.assertTrue("Response does not contain 'word's", sb.toString().contains("\"type\":\"word\""));
            Assert.assertTrue("Response does not contain 'word's", sb.toString().contains("\"type\":\"sentence\""));
        } finally {
            if (responseStream != null) {
                responseStream.close();
            }
        }
    }
    
    @Test
    public void testSynthesizeSpeechWithLexicons() throws InterruptedException {
        final int lexiconRangeStart = 10;

        putLexicons(lexiconRangeStart, lexiconRangeStart + MAX_LEXICONS_FOR_SPEECH_SYNTHESIS_REQUEST);
        for (int i = lexiconRangeStart; i < lexiconRangeStart + MAX_LEXICONS_FOR_SPEECH_SYNTHESIS_REQUEST; i++) {
            SynthesizeSpeechRequest synthesizeSpeechRequest = prepareValidSynthesizeSpeechRequest();
            for (int j = lexiconRangeStart; j < i; j++) {
                synthesizeSpeechRequest.withLexiconNames(lexiconName(j));
            }
            SynthesizeSpeechResult synthesizeSpeechResult = client.synthesizeSpeech(synthesizeSpeechRequest);
            Assert.assertNotNull(synthesizeSpeechResult);

            final ArrayList<String> lexiconList = new ArrayList<String>();
            for (int j = lexiconRangeStart; j < i; j++) {
                lexiconList.add(lexiconName(j));
            }
            synthesizeSpeechRequest = prepareValidSynthesizeSpeechRequest()
                    .withLexiconNames(lexiconList);
            synthesizeSpeechResult = client.synthesizeSpeech(synthesizeSpeechRequest);
            Assert.assertNotNull(synthesizeSpeechResult);
        }
        deleteLexicons(lexiconRangeStart, lexiconRangeStart + MAX_LEXICONS_FOR_SPEECH_SYNTHESIS_REQUEST);
    }

    @Test(expected=LexiconNotFoundException.class)
    public void testSynthesizeSpeechWithInvalidLexicon() throws InterruptedException {
        SynthesizeSpeechRequest synthesizeSpeechRequest;

        synthesizeSpeechRequest = prepareValidSynthesizeSpeechRequest()
                .withLexiconNames(lexiconName(42));
        client.synthesizeSpeech(synthesizeSpeechRequest);
    }

    @Test(expected=AmazonServiceException.class)
    public void testSynthesizeSpeechWithTooManyLexiconsStrings() {
        SynthesizeSpeechRequest synthesizeSpeechRequest;

        synthesizeSpeechRequest = prepareValidSynthesizeSpeechRequest();
        for (int j = 0; j < MAX_LEXICONS_FOR_SPEECH_SYNTHESIS_REQUEST + 1; j++) {
            synthesizeSpeechRequest.withLexiconNames(lexiconName(j));
        }
        client.synthesizeSpeech(synthesizeSpeechRequest);
    }

    @Test(expected=AmazonServiceException.class)
    public void testSynthesizeSpeechWithTooManyLexiconsList() {
        SynthesizeSpeechRequest synthesizeSpeechRequest;

        synthesizeSpeechRequest = prepareValidSynthesizeSpeechRequest();
        final ArrayList<String> lexiconList = new ArrayList<String>();
        for (int j = 0; j < MAX_LEXICONS_FOR_SPEECH_SYNTHESIS_REQUEST + 1; j++) {
            lexiconList.add(lexiconName(j));
        }
        synthesizeSpeechRequest.withLexiconNames(lexiconList);
        client.synthesizeSpeech(synthesizeSpeechRequest);
    }

    private SynthesizeSpeechPresignRequest prepareValidSynthesizeSpeechPresignRequest() {
        return new SynthesizeSpeechPresignRequest()
                .withVoiceId("Joanna")
                .withText("1 2 3")
                .withOutputFormat(OutputFormat.Mp3);
    }

    private void checkUrl(URL url) throws IOException {
        final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setInstanceFollowRedirects(false);
        connection.connect();

        Assert.assertEquals(HttpURLConnection.HTTP_OK, connection.getResponseCode());
    }

    @Test
    public void testGetPresignedSynthesizeSpeechUrlMiscellaneous() throws IOException {
        final int lexiconRangeStart = 20;
        final AmazonPollyPresigningClient customPollyClient = new AmazonPollyPresigningClient(new StaticCredentialsProvider(credentials));
        customPollyClient.setRegion(Region.getRegion(Regions.AP_NORTHEAST_1));

        putLexicons(lexiconRangeStart, lexiconRangeStart + MAX_LEXICONS_FOR_GET_PRESIGNED_SYNTHESIZE_SPEECH_URL);

        for (int i = lexiconRangeStart; i < lexiconRangeStart + MAX_LEXICONS_FOR_GET_PRESIGNED_SYNTHESIZE_SPEECH_URL; i++) {
            SynthesizeSpeechPresignRequest synthesizeSpeechPresignRequest = prepareValidSynthesizeSpeechPresignRequest();
            for (int j = lexiconRangeStart; j < i; j++) {
                synthesizeSpeechPresignRequest.withLexiconNames(lexiconName(j));
            }
            URL presignedURL = client.getPresignedSynthesizeSpeechUrl(synthesizeSpeechPresignRequest);
            checkUrl(presignedURL);

            final ArrayList<String> lexiconList = new ArrayList<String>();
            for (int j = lexiconRangeStart; j < i; j++) {
                lexiconList.add(lexiconName(j));
            }
            synthesizeSpeechPresignRequest = prepareValidSynthesizeSpeechPresignRequest()
                    .withVoiceId("Matthew")
                    .withLexiconNames(lexiconList);
            presignedURL = customPollyClient.getPresignedSynthesizeSpeechUrl(synthesizeSpeechPresignRequest);
            System.out.println("Matthew: " + presignedURL);
            checkUrl(presignedURL);

            synthesizeSpeechPresignRequest = prepareValidSynthesizeSpeechPresignRequest()
                    .withVoiceId("Takumi")
                    .withLexiconNames(lexiconList);
            presignedURL = customPollyClient.getPresignedSynthesizeSpeechUrl(synthesizeSpeechPresignRequest);
            System.out.println("Takumi: " + presignedURL);
            checkUrl(presignedURL);

            synthesizeSpeechPresignRequest = prepareValidSynthesizeSpeechPresignRequest()
                    .withVoiceId(VoiceId.Seoyeon)
                    .withLexiconNames(lexiconList);
            presignedURL = customPollyClient.getPresignedSynthesizeSpeechUrl(synthesizeSpeechPresignRequest);
            System.out.println("Seoyeon: " + presignedURL);
            checkUrl(presignedURL);

            synthesizeSpeechPresignRequest = prepareValidSynthesizeSpeechPresignRequest()
                    .withVoiceId(VoiceId.Aditi)
                    .withLexiconNames(lexiconList);
            presignedURL = customPollyClient.getPresignedSynthesizeSpeechUrl(synthesizeSpeechPresignRequest);
            System.out.println("Aditi: " + presignedURL);
            checkUrl(presignedURL);

            synthesizeSpeechPresignRequest = prepareValidSynthesizeSpeechPresignRequest().withVoiceId(VoiceId.Lea)
                    .withLexiconNames(lexiconList);
            presignedURL = customPollyClient.getPresignedSynthesizeSpeechUrl(synthesizeSpeechPresignRequest);
            System.out.println("Lea: " + presignedURL);
            checkUrl(presignedURL);

            synthesizeSpeechPresignRequest = prepareValidSynthesizeSpeechPresignRequest().withVoiceId(VoiceId.Bianca)
                    .withLexiconNames(lexiconList);
            presignedURL = customPollyClient.getPresignedSynthesizeSpeechUrl(synthesizeSpeechPresignRequest);
            System.out.println("Bianca: " + presignedURL);
            checkUrl(presignedURL);

            synthesizeSpeechPresignRequest = prepareValidSynthesizeSpeechPresignRequest().withVoiceId(VoiceId.Lucia)
                    .withLexiconNames(lexiconList);
            presignedURL = customPollyClient.getPresignedSynthesizeSpeechUrl(synthesizeSpeechPresignRequest);
            System.out.println("Lucia: " + presignedURL);
            checkUrl(presignedURL);

            synthesizeSpeechPresignRequest = prepareValidSynthesizeSpeechPresignRequest().withVoiceId(VoiceId.Mia)
                    .withLexiconNames(lexiconList);
            presignedURL = customPollyClient.getPresignedSynthesizeSpeechUrl(synthesizeSpeechPresignRequest);
            System.out.println("Mia: " + presignedURL);
            checkUrl(presignedURL);
        }
        deleteLexicons(lexiconRangeStart, lexiconRangeStart + MAX_LEXICONS_FOR_GET_PRESIGNED_SYNTHESIZE_SPEECH_URL);
    }

    @Test
    public void testGetPresignedSynthesizeSpeechUrlWithLexicon() throws IOException {
        final int lexiconRangeStart = 20;

        putLexicons(lexiconRangeStart, lexiconRangeStart + MAX_LEXICONS_FOR_GET_PRESIGNED_SYNTHESIZE_SPEECH_URL);

        for (int i = lexiconRangeStart; i < lexiconRangeStart + MAX_LEXICONS_FOR_GET_PRESIGNED_SYNTHESIZE_SPEECH_URL; i++) {
            SynthesizeSpeechPresignRequest synthesizeSpeechPresignRequest = prepareValidSynthesizeSpeechPresignRequest();
            for (int j = lexiconRangeStart; j < i; j++) {
                synthesizeSpeechPresignRequest.withLexiconNames(lexiconName(j));
            }
            URL presignedURL = client.getPresignedSynthesizeSpeechUrl(synthesizeSpeechPresignRequest);
            checkUrl(presignedURL);

            final ArrayList<String> lexiconList = new ArrayList<String>();
            for (int j = lexiconRangeStart; j < i; j++) {
                lexiconList.add(lexiconName(j));
            }
            synthesizeSpeechPresignRequest = prepareValidSynthesizeSpeechPresignRequest()
                    .withLexiconNames(lexiconList);
            presignedURL = client.getPresignedSynthesizeSpeechUrl(synthesizeSpeechPresignRequest);
            checkUrl(presignedURL);
        }
        deleteLexicons(lexiconRangeStart, lexiconRangeStart + MAX_LEXICONS_FOR_GET_PRESIGNED_SYNTHESIZE_SPEECH_URL);
    }

    @Test
    public void testGetPresignedSynthesizeSpeechUrlWithLanguageCode() throws IOException {

        SynthesizeSpeechPresignRequest synthesizeSpeechPresignRequest = prepareValidSynthesizeSpeechPresignRequest();
        synthesizeSpeechPresignRequest.setText("नमस्ते आप कैसे हैं");
        synthesizeSpeechPresignRequest.setVoiceId(VoiceId.Aditi);
        URL presignedURL = client.getPresignedSynthesizeSpeechUrl(synthesizeSpeechPresignRequest);
        checkUrl(presignedURL);
    }

    @Test
    public void testGetPresignedSynthesizeSpeechUrlWithManyLexiconsStringsConsecutively() {
        SynthesizeSpeechPresignRequest synthesizeSpeechPresignRequest;

        synthesizeSpeechPresignRequest = prepareValidSynthesizeSpeechPresignRequest();
        for (int j = 0; j < MAX_LEXICONS_FOR_GET_PRESIGNED_SYNTHESIZE_SPEECH_URL + 1; j++) {
            synthesizeSpeechPresignRequest.withLexiconNames(lexiconName(j));
        }
        client.getPresignedSynthesizeSpeechUrl(synthesizeSpeechPresignRequest);
    }

    @Test
    public void testGetPresignedSynthesizeSpeechUrlWithManyLexiconsStringsAtOnce() {
        SynthesizeSpeechPresignRequest synthesizeSpeechPresignRequest;

        synthesizeSpeechPresignRequest = prepareValidSynthesizeSpeechPresignRequest();
        synthesizeSpeechPresignRequest.withLexiconNames(lexiconName(0), lexiconName(1));
    }

    @Test
    public void testGetPresignedSynthesizeSpeechUrlWithManyLexiconsList() {
        SynthesizeSpeechPresignRequest synthesizeSpeechPresignRequest;

        synthesizeSpeechPresignRequest = prepareValidSynthesizeSpeechPresignRequest();
        final ArrayList<String> lexiconList = new ArrayList<String>();
        for (int j = 0; j < MAX_LEXICONS_FOR_GET_PRESIGNED_SYNTHESIZE_SPEECH_URL + 1; j++) {
            lexiconList.add(lexiconName(j));
        }
        synthesizeSpeechPresignRequest.withLexiconNames(lexiconList);
        client.getPresignedSynthesizeSpeechUrl(synthesizeSpeechPresignRequest);
    }
}
