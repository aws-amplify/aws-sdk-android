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

package com.amazonaws.services.kinesisvideosignaling;

import android.util.Log;

import com.amazonaws.regions.Region;
import com.amazonaws.services.kinesisvideo.AWSKinesisVideoClient;
import com.amazonaws.services.kinesisvideo.model.ChannelRole;
import com.amazonaws.services.kinesisvideo.model.DescribeSignalingChannelRequest;
import com.amazonaws.services.kinesisvideo.model.DescribeSignalingChannelResult;
import com.amazonaws.services.kinesisvideo.model.GetSignalingChannelEndpointRequest;
import com.amazonaws.services.kinesisvideo.model.GetSignalingChannelEndpointResult;
import com.amazonaws.services.kinesisvideo.model.ResourceEndpointListItem;
import com.amazonaws.services.kinesisvideo.model.SingleMasterChannelEndpointConfiguration;
import com.amazonaws.services.kinesisvideosignaling.model.GetIceServerConfigRequest;
import com.amazonaws.services.kinesisvideosignaling.model.GetIceServerConfigResult;
import com.amazonaws.services.kinesisvideosignaling.model.IceServer;
import com.amazonaws.testutils.AWSTestBase;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class KinesisVideoSignalingInstrumentedTest extends AWSTestBase {

    private String TAG = KinesisVideoSignalingInstrumentedTest.class.getSimpleName();

    private final List<IceServer> iceServerList = new ArrayList<>();
    private final List<ResourceEndpointListItem> endpointList = new ArrayList<>();

    private AWSKinesisVideoClient kvClient;
    private AWSKinesisVideoSignalingClient signalingClient;

    private String region;
    private String channelName;
    private String channelArn;

    @Before
    public void setUp() throws Exception {
        setUpCredentials();

        region = getPackageConfigure("kinesis-video-signaling").getString("region");
        channelName = getPackageConfigure("kinesis-video-signaling").getString("channel_name");
        channelArn = getPackageConfigure("kinesis-video-signaling").getString("channel_arn");

        kvClient = new AWSKinesisVideoClient(credentials);
        kvClient.setRegion(Region.getRegion(region));
    }

    @Test
    public void testSignalingClient() {
        ChannelRole role = ChannelRole.VIEWER;
        GetSignalingChannelEndpointResult getSignalingChannelEndpointResult = kvClient.getSignalingChannelEndpoint(
                new GetSignalingChannelEndpointRequest()
                        .withChannelARN(channelArn)
                        .withSingleMasterChannelEndpointConfiguration(
                                new SingleMasterChannelEndpointConfiguration()
                                        .withProtocols("WSS", "HTTPS")
                                        .withRole(role)));

        Log.i(TAG, "Endpoints " + getSignalingChannelEndpointResult.toString());
        endpointList.addAll(getSignalingChannelEndpointResult.getResourceEndpointList());
        assertFalse(endpointList.isEmpty());

        String endpoint = null;
        for (ResourceEndpointListItem resourceEndpoint : endpointList) {
            if (resourceEndpoint.getProtocol().equals("HTTPS")) {
                endpoint = resourceEndpoint.getResourceEndpoint();
            }
        }
        assertNotNull(endpoint);
        signalingClient = getSignalingClient(region, endpoint);

        GetIceServerConfigResult getIceServerConfigResult = signalingClient.getIceServerConfig(
                new GetIceServerConfigRequest()
                        .withChannelARN(channelArn)
                        .withClientId(role.name()));

        assertNotNull(getIceServerConfigResult);
        iceServerList.addAll(getIceServerConfigResult.getIceServerList());
        assertFalse(iceServerList.isEmpty());
    }

    @Test
    public void testSignalingChannelDescription() {
        DescribeSignalingChannelResult describeSignalingChannelResult = kvClient.describeSignalingChannel(
                new DescribeSignalingChannelRequest()
                        .withChannelName(channelName));

        assertNotNull(describeSignalingChannelResult);
        assertNotNull(describeSignalingChannelResult.getChannelInfo());
        String channelArnResult = describeSignalingChannelResult.getChannelInfo().getChannelARN();
        assertEquals(channelArn, channelArnResult);
        Log.i(TAG, "Channel ARN is " + channelArnResult);
    }

    private AWSKinesisVideoSignalingClient getSignalingClient(final String region, final String endpoint) {
        final AWSKinesisVideoSignalingClient client = new AWSKinesisVideoSignalingClient(credentials);
        client.setRegion(Region.getRegion(region));
        client.setEndpoint(endpoint);
        return client;
    }
}
