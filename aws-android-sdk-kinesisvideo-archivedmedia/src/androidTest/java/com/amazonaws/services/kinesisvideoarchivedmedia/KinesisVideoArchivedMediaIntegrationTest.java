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

package com.amazonaws.services.kinesisvideoarchivedmedia;

import org.json.JSONException;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.kinesisvideo.model.APIName;
import com.amazonaws.services.kinesisvideo.model.ComparisonOperator;
import com.amazonaws.services.kinesisvideo.model.CreateStreamRequest;
import com.amazonaws.services.kinesisvideo.model.CreateStreamResult;
import com.amazonaws.services.kinesisvideo.model.DeleteStreamRequest;
import com.amazonaws.services.kinesisvideo.model.GetDataEndpointRequest;
import com.amazonaws.services.kinesisvideo.model.GetDataEndpointResult;
import com.amazonaws.services.kinesisvideo.model.ListStreamsRequest;
import com.amazonaws.services.kinesisvideo.model.ListStreamsResult;
import com.amazonaws.services.kinesisvideo.model.StreamInfo;
import com.amazonaws.services.kinesisvideo.model.StreamNameCondition;
import com.amazonaws.services.kinesisvideoarchivedmedia.model.GetHLSStreamingSessionURLRequest;
import com.amazonaws.services.kinesisvideoarchivedmedia.model.GetHLSStreamingSessionURLResult;
import com.amazonaws.services.kinesisvideoarchivedmedia.model.PlaybackMode;

import java.net.MalformedURLException;
import java.net.URL;

public class KinesisVideoArchivedMediaIntegrationTest extends KinesisVideoArchivedMediaIntegrationTestBase {
    private static final String streamPrefix = "kinesisvideoarchivedmedia-integration-test-";

    @After
    public void tearDown() {
        String currentNextToken = null;

        do {
            ListStreamsResult listStreamsResult = kvClient.listStreams(new ListStreamsRequest()
                    .withStreamNameCondition(new StreamNameCondition()
                            .withComparisonOperator(ComparisonOperator.BEGINS_WITH)
                            .withComparisonValue(streamPrefix))
                    .withNextToken(currentNextToken));
            currentNextToken = listStreamsResult.getNextToken();

            for (StreamInfo info : listStreamsResult.getStreamInfoList()) {
                if (info.getStreamName().startsWith(streamPrefix)) {
                    kvClient.deleteStream(new DeleteStreamRequest()
                            .withStreamARN(info.getStreamARN()));
                }
            }
        } while (currentNextToken != null);
    }

    @Test
    public void testGetHLSStreamingSessionURL() {

        String streamName = streamPrefix + System.currentTimeMillis();

        CreateStreamResult createStreamResult = kvClient.createStream(new CreateStreamRequest()
                .withStreamName(streamName)
                .withDataRetentionInHours(2)
                .withDeviceName("integration-test-device")
                .withMediaType("video/h264"));

        GetDataEndpointResult dataEndpoint = kvClient.getDataEndpoint(new GetDataEndpointRequest()
                .withStreamName(streamName)
                .withAPIName(APIName.GET_HLS_STREAMING_SESSION_URL));

        String endpoint = dataEndpoint.getDataEndpoint();

        try {
            // URL construction checks for malformed URL
            new URL(endpoint);
        } catch (MalformedURLException e) {
            fail("Data endpoint is not a valid URL");
        }

         final AWSKinesisVideoArchivedMediaClient kvamClient =
                new AWSKinesisVideoArchivedMediaClient(this.credentials);
         kvamClient.setEndpoint(endpoint);

        try {
            final GetHLSStreamingSessionURLResult streamURL = kvamClient.getHLSStreamingSessionURL(
                new GetHLSStreamingSessionURLRequest()
                    .withStreamName(streamName)
                    .withPlaybackMode(PlaybackMode.LIVE)
            );
        } catch (AmazonClientException e) {
            e.printStackTrace();
            // Nothing will be streaming during the test
            // This error differentiates between another that says stream does not exist
            assertTrue("Exception should have said no fragments are found",
                    e.getMessage().contains("No fragments found in the stream for the HLS streaming request"));
        }
    }
}