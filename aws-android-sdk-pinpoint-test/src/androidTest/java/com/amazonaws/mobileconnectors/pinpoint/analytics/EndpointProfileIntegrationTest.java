/*
 * Copyright 2019-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.pinpoint.analytics;

import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.mobileconnectors.pinpoint.PinpointConfiguration;
import com.amazonaws.mobileconnectors.pinpoint.PinpointManager;
import com.amazonaws.mobileconnectors.pinpoint.targeting.TargetingClient;
import com.amazonaws.mobileconnectors.pinpoint.targeting.endpointProfile.EndpointProfile;
import com.amazonaws.mobileconnectors.pinpoint.targeting.endpointProfile.EndpointProfileUser;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.pinpoint.model.ChannelType;
import com.amazonaws.testutils.AWSTestBase;

import org.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;

import static androidx.test.core.app.ApplicationProvider.getApplicationContext;
import static com.amazonaws.testutils.util.InternetConnectivity.goOnline;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class EndpointProfileIntegrationTest extends AWSTestBase {
    private PinpointManager pinpointManager;
    private CognitoCachingCredentialsProvider credentialsProvider;

    @Before
    public void setUp() throws Exception {
        JSONObject testConfig = getPackageConfigure("pinpoint");
        String identityPoolId = testConfig.getString("identity_pool_id");
        String appId = testConfig.getString("AppId");
        Regions regions = Regions.fromName(testConfig.getString("Region"));

        getApplicationContext().deleteDatabase("awspinpoint.db");
        goOnline();

        credentialsProvider =
            new CognitoCachingCredentialsProvider(getApplicationContext(), identityPoolId, regions);
        PinpointConfiguration pinpointConfiguration =
            new PinpointConfiguration(getApplicationContext(), appId, regions, ChannelType.GCM, credentialsProvider);
        pinpointManager = new PinpointManager(pinpointConfiguration);
    }

    @After
    public void tearDown() {
        goOnline();
        pinpointManager.getAnalyticsClient().closeDB();
        getApplicationContext().deleteDatabase("awspinpoint.db");
    }

    @Test
    public void testEndpointProfileUpdate() {
        TargetingClient targetingClient = pinpointManager.getTargetingClient();
        assertNotNull(targetingClient);

        targetingClient.updateEndpointProfile();
        EndpointProfile endpointProfile = targetingClient.currentEndpoint();
        assertNotNull(endpointProfile);
        assertNull(endpointProfile.getUser().getUserId());
        assertNull(endpointProfile.getUser().getUserAttributes());

        EndpointProfileUser user = new EndpointProfileUser();
        user.setUserId(credentialsProvider.getIdentityId());
        user.addUserAttribute("user-key", Collections.singletonList("user-value"));
        endpointProfile.setUser(user);

        targetingClient.updateEndpointProfile();
        endpointProfile = targetingClient.currentEndpoint();
        assertNotNull(endpointProfile);
        assertEquals(credentialsProvider.getIdentityId(), endpointProfile.getUser().getUserId());
        assertNotNull(endpointProfile.getUser().getUserAttributes());
        assertEquals(
            Collections.singletonMap("user-key", Collections.singletonList("user-value")),
            endpointProfile.getUser().getUserAttributes()
        );

        endpointProfile.addAttribute("key", Collections.singletonList("value"));
        targetingClient.updateEndpointProfile();
        endpointProfile = targetingClient.currentEndpoint();
        assertNotNull(endpointProfile);
        assertEquals(credentialsProvider.getIdentityId(), endpointProfile.getUser().getUserId());
        assertEquals(Collections.singletonList("value"), endpointProfile.getAllAttributes().get("key"));
    }
}
