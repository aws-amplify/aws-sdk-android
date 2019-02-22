/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.transcribe;

import com.amazonaws.services.transcribe.model.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

import org.json.JSONException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.amazonaws.AmazonServiceException;

import static org.junit.Assert.*;

public class TranscribeIntegrationTests extends TranscribeIntegrationTestBase {

    private static String VOCABULARY_NAME_PREFIX = "hello-amazon-transcribe-";

    private String vocabularyName;

    @Before
    public void setUp() throws IOException {
        super.setUp();
        vocabularyName = VOCABULARY_NAME_PREFIX + UUID.randomUUID().toString();

        ListVocabulariesRequest listVocabulariesRequest = new ListVocabulariesRequest();
        ListVocabulariesResult listVocabulariesResult = transcribeClient.listVocabularies(listVocabulariesRequest);
        for (VocabularyInfo vocabInfo : listVocabulariesResult.getVocabularies()) {
            deleteVocabularyWithRetry(vocabInfo.getVocabularyName());
        }
    }

    private void deleteVocabularyWithRetry(final String vocabularyName) {
        int tryCount = 0;
        while (tryCount < 3) {
            tryCount++;
            try {
                System.out.println("DeleteVocabularyRequest for " + vocabularyName);
                DeleteVocabularyRequest deleteVocabularyRequest = new DeleteVocabularyRequest();
                deleteVocabularyRequest.setVocabularyName(vocabularyName);
                transcribeClient.deleteVocabulary(deleteVocabularyRequest);
                break;
            } catch (final AmazonServiceException e) {
                if ("ThrottlingException".equals(e.getErrorCode())) {
                    try {
                        System.out.println("ThrottlingException detected.");
                        Thread.sleep(30 * 1000);
                    } catch (InterruptedException ie) {
                        System.out.println("Sleep for ThrottlingException interrupted: " + ie.getLocalizedMessage());
                    }
                    continue;
                } else {
                    e.printStackTrace();
                    break;
                }
            }
        }
    }

    @After
    public void tearDown() {
        deleteVocabularyWithRetry(vocabularyName);
    }

    @Test
    public void testListTranscriptionJobs() {
        ListTranscriptionJobsRequest listTranscriptionJobsRequest = new ListTranscriptionJobsRequest();
        listTranscriptionJobsRequest.setMaxResults(3);
        
        ListTranscriptionJobsResult listTranscriptionJobsResult = transcribeClient.listTranscriptionJobs(listTranscriptionJobsRequest);
        assertNotNull(listTranscriptionJobsResult);
        System.out.println(listTranscriptionJobsResult.toString());
        assertTrue(listTranscriptionJobsResult.getTranscriptionJobSummaries().size() >= 0);
    }

    @Test
    public void testVocabularyCreateListDeleteWithPending() {
        CreateVocabularyRequest createVocabularyRequest = new CreateVocabularyRequest();
        createVocabularyRequest.setLanguageCode("en-US");
        createVocabularyRequest.setPhrases(Arrays.asList("hello", "transcribe"));
        createVocabularyRequest.setVocabularyName(vocabularyName);

        CreateVocabularyResult createVocabularyResult = transcribeClient.createVocabulary(createVocabularyRequest);
        assertNotNull(createVocabularyResult);
        System.out.println(createVocabularyResult.toString());
        assertTrue("Language code should be en-US", createVocabularyResult.getLanguageCode().equals("en-US"));
        assertTrue("Vocabulary names should be same",
                createVocabularyResult.getVocabularyName().equals(vocabularyName));

        ListVocabulariesRequest listVocabulariesRequest = new ListVocabulariesRequest();
        ListVocabulariesResult listVocabulariesResult = transcribeClient.listVocabularies(listVocabulariesRequest);
        assertNotNull(listVocabulariesResult);
        System.out.println(listVocabulariesResult.toString());
        assertTrue("Expecting 1 vocabulary", listVocabulariesResult.getVocabularies().size() >= 1);

        deleteVocabularyWithRetry(vocabularyName);
    }

    @Test
    public void testVocabularyCreateListDelete() {
        CreateVocabularyRequest createVocabularyRequest = new CreateVocabularyRequest();
        createVocabularyRequest.setLanguageCode("en-US");
        createVocabularyRequest.setPhrases(Arrays.asList("hello", "transcribe"));
        createVocabularyRequest.setVocabularyName(vocabularyName);

        CreateVocabularyResult createVocabularyResult = transcribeClient.createVocabulary(createVocabularyRequest);
        assertNotNull(createVocabularyResult);
        System.out.println(createVocabularyResult.toString());
        assertTrue("Language code should be en-US", createVocabularyResult.getLanguageCode().equals("en-US"));
        assertTrue("Vocabulary names should be same", createVocabularyResult.getVocabularyName().equals(vocabularyName));

        waitTillVocabularyReady(75 * 1000, vocabularyName, VocabularyState.READY);

        ListVocabulariesRequest listVocabulariesRequest = new ListVocabulariesRequest();
        ListVocabulariesResult listVocabulariesResult = transcribeClient.listVocabularies(listVocabulariesRequest);
        assertNotNull(listVocabulariesResult);
        System.out.println(listVocabulariesResult.toString());
        assertTrue("Expecting 1 vocabulary", listVocabulariesResult.getVocabularies().size() >= 1);

        deleteVocabularyWithRetry(vocabularyName);
    }

    @Test
    public void testStartTranscriptionJobs() throws JSONException {
        String transcriptionJobName = "hello-amazon-transcribe-job-" + UUID.randomUUID().toString();

        Media media = new Media();
        media.setMediaFileUri(getPackageConfigure().getString("media_file_uri"));

        StartTranscriptionJobRequest startTranscriptionJobRequest = new StartTranscriptionJobRequest();
        startTranscriptionJobRequest.setLanguageCode("en-US");
        startTranscriptionJobRequest.setMediaFormat("mp3");
        startTranscriptionJobRequest.setTranscriptionJobName(transcriptionJobName);
        startTranscriptionJobRequest.setMedia(media);

        StartTranscriptionJobResult startTranscriptionJobResult = transcribeClient.startTranscriptionJob(startTranscriptionJobRequest);
        assertNotNull(startTranscriptionJobResult);
        System.out.println(startTranscriptionJobResult.toString());
        
        GetTranscriptionJobRequest getTranscriptionJobRequest = new GetTranscriptionJobRequest();
        getTranscriptionJobRequest.setTranscriptionJobName(transcriptionJobName);
        waitTillTranscriptionJobStatus(75 * 1000, getTranscriptionJobRequest, TranscriptionJobStatus.COMPLETED);

        TranscriptionJob transcriptionJob = transcribeClient.getTranscriptionJob(getTranscriptionJobRequest).getTranscriptionJob();
        if (TranscriptionJobStatus.COMPLETED.toString().equals(transcriptionJob.getTranscriptionJobStatus())) {
            System.out.println("Transcript File URI: " + transcriptionJob.getTranscript().getTranscriptFileUri());
        } else if (TranscriptionJobStatus.FAILED.toString().equals(transcriptionJob.getTranscriptionJobStatus())) {
            assertTrue("Transcription job failed", false);
        } else {
            assertTrue("Transcription job still in progress", false);
        }
    }

    private void waitTillVocabularyReady(long timeout, String vocabularyName, VocabularyState expectedState) {
        GetVocabularyRequest getVocabularyRequest = new GetVocabularyRequest();
        getVocabularyRequest.setVocabularyName(vocabularyName);
        while (timeout > 0) {
            GetVocabularyResult getVocabularyResult = transcribeClient.getVocabulary(getVocabularyRequest);
            assertNotNull(getVocabularyResult);
            System.out.println(getVocabularyResult);
            if (expectedState.toString().equals(getVocabularyResult.getVocabularyState().toString())) {
                assertTrue("Expected Vocabulary State reached.",
                    expectedState.toString().equals(getVocabularyResult.getVocabularyState().toString()));
                break;
            }

            System.out.println("wait till vocabulary state is: " + expectedState + " current state: "
                    + getVocabularyResult.getVocabularyState().toString());
            timeout -= 5000;
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ie) {
                System.out.println("Waiting for vocabulary state interrupted" + ie.getLocalizedMessage());
            }
        }
    }

    private void waitTillTranscriptionJobStatus(long timeout, GetTranscriptionJobRequest getTranscriptionJobRequest,
            TranscriptionJobStatus expectedJobStatus) {
        TranscriptionJob transcriptionJob;
        while (timeout > 0) {
            transcriptionJob = transcribeClient.getTranscriptionJob(getTranscriptionJobRequest).getTranscriptionJob();
            if (expectedJobStatus.toString().equals(transcriptionJob.getTranscriptionJobStatus())) {
                assertTrue("Transcription Job status",
                        expectedJobStatus.toString().equals(transcriptionJob.getTranscriptionJobStatus()));
                System.out.println("Status = " + transcriptionJob.getTranscriptionJobStatus());
                break;
            }
            System.out.println("wait till transcription job status is: " 
                + expectedJobStatus + " current status: " + transcriptionJob.getTranscriptionJobStatus());
            timeout -= 5000;
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ie) {
                System.out.println("Waiting for transcription job status interrupted" + ie.getLocalizedMessage());
            }
        }
    }
}