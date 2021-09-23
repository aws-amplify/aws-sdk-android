/*
 * Copyright 2020-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import android.content.Context;

import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserPool;
import com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider;
import com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProviderClient;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;

/**
 * Unit test cases for checking the custom end points for Cognito User Identity Pool
 */
public class CognitoIdentityProviderCustomEndPointTest {

    private CognitoUserPool testPool;
    public static final String TEST_USER_POOL           = "us-east-1_xxxxx";
    public static final String TEST_CLIENT_ID           = "DummyClientId";
    public static final String TEST_CLIENT_SECRET       = "DummyClientSecret";
    public static final String TEST_PINPOINT_APP_ID     = "DummyPinpointAppId";
    public static final String DUMMY_CUSTOM_ENDPOINT    = "my-custom-endpoint.amazon.com";

    @Mock
    private AmazonCognitoIdentityProviderClient mockCustomEndpointClient;

    @Mock
    private Context appContext;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    /**
     * Test that end point is set for the {@link AmazonCognitoIdentityProviderClient } with correct value
     * when {@link CognitoUserPool#CognitoUserPool(Context, String, String, String, AmazonCognitoIdentityProvider, String, String)} is called
     * with a valid endpoint
     */
    @Test
    public void testForCustomEndpoint() {
        testPool = new CognitoUserPool(appContext, TEST_USER_POOL, TEST_CLIENT_ID, TEST_CLIENT_SECRET, mockCustomEndpointClient, TEST_PINPOINT_APP_ID, DUMMY_CUSTOM_ENDPOINT);
        verify(mockCustomEndpointClient).setEndpoint(DUMMY_CUSTOM_ENDPOINT);
    }

    /**
     * Test that end point is not set for the {@link AmazonCognitoIdentityProviderClient }
     * when {@link CognitoUserPool#CognitoUserPool(Context, String, String, String, AmazonCognitoIdentityProvider, String, String)} is called
     * with a null endpoint
     */
    @Test
    public void testForCustomEndpointWhenNull() {
        testPool = new CognitoUserPool(appContext, TEST_USER_POOL, TEST_CLIENT_ID, TEST_CLIENT_SECRET, mockCustomEndpointClient, TEST_PINPOINT_APP_ID, null);
        verifyZeroInteractions(mockCustomEndpointClient);
    }

    /**
     * Test that end point is not set for the {@link AmazonCognitoIdentityProviderClient }
     * when {@link CognitoUserPool#CognitoUserPool(Context, String, String, String, AmazonCognitoIdentityProvider, String, String)} is called
     * with an empty endpoint
     */
    @Test
    public void testForCustomEndpointWhenEmpty() {
        testPool = new CognitoUserPool(appContext, TEST_USER_POOL, TEST_CLIENT_ID, TEST_CLIENT_SECRET, mockCustomEndpointClient, TEST_PINPOINT_APP_ID, "");
        verifyZeroInteractions(mockCustomEndpointClient);
    }


}
