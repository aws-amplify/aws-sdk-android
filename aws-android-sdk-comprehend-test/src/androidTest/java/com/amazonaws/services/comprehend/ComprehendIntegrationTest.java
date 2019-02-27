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

package com.amazonaws.services.comprehend;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.testutils.AWSTestBase;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComprehendIntegrationTest extends AWSTestBase {

    /** The Comprehend client for all tests to use */
    protected static AmazonComprehendClient comprehendClient;

    private static final String ENGLISH_TEXT = "Sun sometimes shines in Seattle";

    private static final String SPANISH_TEXT = "Sun a veces brilla en Seattle";

    /**
     * Loads the AWS account info for the integration tests and creates a Comprehend
     * client for tests to use.
     */
    @Before
    public void setUp() throws IOException {
        setUpCredentials();
        comprehendClient = new AmazonComprehendClient(credentials);
    }

    @Test
    public void testDetectDominantLanguageEnglish() {
        DetectDominantLanguageRequest detectDominantLanguageRequest = new DetectDominantLanguageRequest()
                .withText(ENGLISH_TEXT);
        DetectDominantLanguageResult detectDominantLanguageResult = comprehendClient
                .detectDominantLanguage(detectDominantLanguageRequest);
        assertNotNull(detectDominantLanguageResult);
        assertNotNull(detectDominantLanguageResult.getLanguages());
        System.out.println(detectDominantLanguageResult.getLanguages());
        assertEquals("en", detectDominantLanguageResult.getLanguages().get(0).getLanguageCode());
    }

    @Test
    public void testDetectDominantLanguageSpanish() {
        final String text = "Sun a veces brilla en Seattle";
        DetectDominantLanguageRequest detectDominantLanguageRequest = new DetectDominantLanguageRequest()
                .withText(SPANISH_TEXT);
        DetectDominantLanguageResult detectDominantLanguageResult = comprehendClient
                .detectDominantLanguage(detectDominantLanguageRequest);
        assertNotNull(detectDominantLanguageResult);
        assertNotNull(detectDominantLanguageResult.getLanguages());
        System.out.println(detectDominantLanguageResult.getLanguages());
        assertEquals("es", detectDominantLanguageResult.getLanguages().get(0).getLanguageCode());
    }

    @Test
    public void testDetectNamedEntities() {
        DetectEntitiesRequest detectEntitiesRequest = new DetectEntitiesRequest()
            .withText(ENGLISH_TEXT)
            .withLanguageCode("en");
        DetectEntitiesResult detectEntitiesResult = comprehendClient.detectEntities(detectEntitiesRequest);
        assertNotNull(detectEntitiesResult.getEntities());
        System.out.println(detectEntitiesResult.getEntities());
        assertEquals("Seattle", detectEntitiesResult.getEntities().get(0).getText());
    }

    @Test
    public void testDetectKeyPhrases() {
        DetectKeyPhrasesRequest detectKeyPhrasesRequest = new DetectKeyPhrasesRequest()
            .withText(ENGLISH_TEXT)
            .withLanguageCode("en");
        DetectKeyPhrasesResult detectKeyPhrasesResult = comprehendClient.detectKeyPhrases(detectKeyPhrasesRequest);
        assertNotNull(detectKeyPhrasesResult);
        System.out.println(detectKeyPhrasesResult);
        assertNotNull(detectKeyPhrasesResult.getKeyPhrases());
        assert(detectKeyPhrasesResult.getKeyPhrases().size() > 0);
    }

    @Test
    public void testDetectSentimentPositive() {
        DetectSentimentRequest detectSentimentRequest = new DetectSentimentRequest()
            .withText(ENGLISH_TEXT)
            .withLanguageCode("en");
        DetectSentimentResult detectSentimentResult = comprehendClient.detectSentiment(detectSentimentRequest);
        assertNotNull(detectSentimentResult);
        System.out.println(detectSentimentResult);
        assertNotNull(detectSentimentResult.getSentimentScore());
        assertEquals("POSITIVE", detectSentimentResult.getSentiment());
        assert (detectSentimentResult.getSentimentScore().getPositive() > detectSentimentResult.getSentimentScore()
                .getNegative());
        assert (detectSentimentResult.getSentimentScore().getPositive() > detectSentimentResult.getSentimentScore()
                .getMixed());
        assert (detectSentimentResult.getSentimentScore().getPositive() > detectSentimentResult.getSentimentScore()
                .getNeutral());
    }

    @Test
    public void testDetectSentimentNeutral() {
        DetectSentimentRequest detectSentimentRequest = new DetectSentimentRequest()
            .withText("It is raining today in Seattle.")
            .withLanguageCode("en");
        DetectSentimentResult detectSentimentResult = comprehendClient.detectSentiment(detectSentimentRequest);
        assertNotNull(detectSentimentResult);
        System.out.println(detectSentimentResult);
        assertNotNull(detectSentimentResult.getSentimentScore());
        assertEquals("NEUTRAL", detectSentimentResult.getSentiment());
        assert (detectSentimentResult.getSentimentScore().getNeutral() > detectSentimentResult.getSentimentScore()
                .getNegative());
        assert (detectSentimentResult.getSentimentScore().getNeutral() > detectSentimentResult.getSentimentScore()
                .getMixed());
        assert (detectSentimentResult.getSentimentScore().getNeutral() > detectSentimentResult.getSentimentScore()
                .getPositive());
    }

    @Test
    public void testDetectSentimentNegative() {
        DetectSentimentRequest detectSentimentRequest = new DetectSentimentRequest()
                .withText("This view is horrible.")
                .withLanguageCode("en");
        DetectSentimentResult detectSentimentResult = comprehendClient.detectSentiment(detectSentimentRequest);
        assertNotNull(detectSentimentResult);
        System.out.println(detectSentimentResult);
        assertNotNull(detectSentimentResult.getSentimentScore());
        assertEquals("NEGATIVE", detectSentimentResult.getSentiment());
        assert (detectSentimentResult.getSentimentScore().getNegative() > detectSentimentResult.getSentimentScore()
                .getPositive());
        assert (detectSentimentResult.getSentimentScore().getNegative() > detectSentimentResult.getSentimentScore()
                .getMixed());
        assert (detectSentimentResult.getSentimentScore().getNegative() > detectSentimentResult.getSentimentScore()
                .getNeutral());
    }

    @Test
    public void testTopicModeling() throws Exception {
        final String inputS3Uri = "s3://comprehend-android-sdk-test/comprehend-input.txt";
        final InputFormat inputDocFormat = InputFormat.ONE_DOC_PER_FILE;
        final String outputS3Uri = "s3://comprehend-android-sdk-test/comprehend-output.txt";
        final String dataAccessRoleArn = "arn:aws:iam::467018229527:role/android-assume-role-test";
        final int numberOfTopics = 10;

        final StartTopicsDetectionJobRequest startTopicsDetectionJobRequest = new StartTopicsDetectionJobRequest()
                .withInputDataConfig(new InputDataConfig().withS3Uri(inputS3Uri).withInputFormat(inputDocFormat))
                .withOutputDataConfig(new OutputDataConfig().withS3Uri(outputS3Uri))
                .withDataAccessRoleArn(dataAccessRoleArn).withNumberOfTopics(numberOfTopics);

        final StartTopicsDetectionJobResult startTopicsDetectionJobResult = comprehendClient
                .startTopicsDetectionJob(startTopicsDetectionJobRequest);

        final String jobId = startTopicsDetectionJobResult.getJobId();
        System.out.println("JobId: " + jobId);

        final DescribeTopicsDetectionJobRequest describeTopicsDetectionJobRequest = new DescribeTopicsDetectionJobRequest()
                .withJobId(jobId);

        DescribeTopicsDetectionJobResult describeTopicsDetectionJobResult = comprehendClient
                .describeTopicsDetectionJob(describeTopicsDetectionJobRequest);
        assertNotNull(describeTopicsDetectionJobResult);
        assertEquals("SUBMITTED", 
            describeTopicsDetectionJobResult
                .getTopicsDetectionJobProperties()
                .getJobStatus()
                .toString());
        System.out.println("describeTopicsDetectionJobResult: " + describeTopicsDetectionJobResult);

        ListTopicsDetectionJobsResult listTopicsDetectionJobsResult = comprehendClient
                .listTopicsDetectionJobs(new ListTopicsDetectionJobsRequest());
        System.out.println("listTopicsDetectionJobsResult: " + listTopicsDetectionJobsResult);

        int timeout = 1200 * 1000; // 20-minute timeout
        boolean isCompleted = false;
        while (!isCompleted && timeout > 0) {
            describeTopicsDetectionJobResult = comprehendClient
                .describeTopicsDetectionJob(describeTopicsDetectionJobRequest);
            System.out.println("Expected Status: COMPLETED; " +
                "Current Status: " + describeTopicsDetectionJobResult
                    .getTopicsDetectionJobProperties()
                    .getJobStatus());
            if ("COMPLETED"
                    .equals(describeTopicsDetectionJobResult
                        .getTopicsDetectionJobProperties()
                        .getJobStatus()
                        .toString())) {
                isCompleted = true;
            }
            Thread.sleep(30 * 1000); // Sleep for 30-seconds
            timeout -= (30 * 1000);
        }
        assertEquals("COMPLETED", 
            describeTopicsDetectionJobResult
                .getTopicsDetectionJobProperties()
                .getJobStatus()
                .toString());
    }

    @Test
    public void testBatchDetectEntities() throws Exception {
        final String[] textList = {
            "I love AWS Mobile SDK", 
            "Today is Sunday",
            "Tomorrow is Monday",
            "I love AWS Amplify"
        };

        BatchDetectEntitiesRequest batchDetectEntitiesRequest = new BatchDetectEntitiesRequest()
            .withTextList(textList)
            .withLanguageCode("en");
        BatchDetectEntitiesResult batchDetectEntitiesResult = comprehendClient.batchDetectEntities(batchDetectEntitiesRequest);
        assertNotNull(batchDetectEntitiesResult);
        assertNotNull(batchDetectEntitiesResult.getResultList());
        for (BatchDetectEntitiesItemResult item : batchDetectEntitiesResult.getResultList()) {
            assertNotNull(item);
            assert(item.getEntities().size() >= 0);
            System.out.println(item);
        }

        // check if we need to retry failed requests
        int timeout = 60 * 1000;
        while (batchDetectEntitiesResult.getErrorList().size() > 0 && timeout > 0) {
            System.out.println("Retrying Failed Requests");
            ArrayList<String> textToRetry = new ArrayList<String>();
            for (BatchItemError errorItem : batchDetectEntitiesResult.getErrorList()) {
                textToRetry.add(textList[errorItem.getIndex()]);
            }

            batchDetectEntitiesRequest = new BatchDetectEntitiesRequest()
                .withTextList(textToRetry)
                .withLanguageCode("en");
            batchDetectEntitiesResult = comprehendClient.batchDetectEntities(batchDetectEntitiesRequest);
            assertNotNull(batchDetectEntitiesResult);

            for (BatchDetectEntitiesItemResult item : batchDetectEntitiesResult.getResultList()) {
                assertNotNull(item);
                assert(item.getEntities().size() > 0);
                System.out.println(item);
            }

            Thread.sleep(2000);
            timeout -= 2000;
        }

        assertEquals(textList.length, batchDetectEntitiesResult.getResultList().size());
    }
}