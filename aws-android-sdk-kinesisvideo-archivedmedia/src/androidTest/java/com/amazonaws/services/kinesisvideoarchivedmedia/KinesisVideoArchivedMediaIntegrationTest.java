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
import com.amazonaws.services.kinesisvideoarchivedmedia.model.GetHLSStreamingSessionURLRequest;
import com.amazonaws.services.kinesisvideoarchivedmedia.model.GetHLSStreamingSessionURLResult;
import com.amazonaws.services.kinesisvideoarchivedmedia.model.PlaybackMode;

import java.net.MalformedURLException;
import java.net.URL;

public class KinesisVideoArchivedMediaIntegrationTest extends KinesisVideoArchivedMediaIntegrationTestBase {
    private static final String streamName = "kinesisvideoarchivedmedia-integration-test-do-not-delete";

    @After
    public void tearDown() {
    }

    @Test
    public void testGetHLSStreamingSessionURL() throws JSONException {
        String endpoint = getPackageConfigure().getString("endpoint");

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