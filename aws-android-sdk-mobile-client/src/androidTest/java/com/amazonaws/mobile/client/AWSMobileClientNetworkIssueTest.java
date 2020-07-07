/*
 * Copyright 2019 Amazon.com, Inc. or its affiliates.
 * All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.mobile.client;

import android.content.Context;
import androidx.test.core.app.ApplicationProvider;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.AWSAbstractCognitoIdentityProvider;
import com.amazonaws.auth.CognitoCredentialsProvider;
import com.amazonaws.internal.keyvaluestore.AWSKeyValueStore;
import com.amazonaws.mobile.config.AWSConfiguration;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserPool;
import com.amazonaws.services.cognitoidentity.AmazonCognitoIdentity;
import com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityRequest;
import com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityResult;
import com.amazonaws.services.cognitoidentity.model.GetIdRequest;
import com.amazonaws.services.cognitoidentity.model.GetIdResult;
import com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider;
import com.amazonaws.services.cognitoidentityprovider.model.InitiateAuthRequest;
import com.amazonaws.services.cognitoidentityprovider.model.InitiateAuthResult;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.Field;
import java.net.UnknownHostException;
import java.util.Random;
import java.util.concurrent.CountDownLatch;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Userpool and identity pool were create with Amplify CLI 0.1.23 Default configuration
 */
public class AWSMobileClientNetworkIssueTest extends AWSMobileClientTestBase {
    private static final String EMAIL = "success+user@simulator.amazonses.com";
    private static final String USERNAME = "somebody";
    public static final String PASSWORD = "1234Password!";

    private Context appContext;
    private AWSMobileClient auth;
    private UserStateListener listener;
    private String username;

    @BeforeClass
    public static void beforeClass() throws Exception {
        Context appContext = ApplicationProvider.getApplicationContext();

        // Initialize
        final CountDownLatch latch = new CountDownLatch(1);
        AWSMobileClient.getInstance().initialize(appContext, new Callback<UserStateDetails>() {
            @Override
            public void onResult(UserStateDetails result) {
                latch.countDown();
            }

            @Override
            public void onError(Exception e) {
                latch.countDown();
            }
        });
        latch.await();

        final AWSConfiguration awsConfiguration = new AWSConfiguration(appContext);

        JSONObject userPoolConfig = awsConfiguration.optJsonObject("CognitoUserPool");
        assertNotNull(userPoolConfig);

        JSONObject identityPoolConfig =
                awsConfiguration.optJsonObject("CredentialsProvider").getJSONObject(
                        "CognitoIdentity").getJSONObject("Default");
        assertNotNull(identityPoolConfig);
    }

    @Before
    public void before() throws InterruptedException {
        appContext = ApplicationProvider.getApplicationContext();
        auth = AWSMobileClient.getInstance();
        auth.signOut();

        username = "testUser" + System.currentTimeMillis() + new Random().nextInt();
    }

    @After
    public void after() {
        auth.removeUserStateListener(listener);
        auth.listeners.clear();
        auth.signOut();
    }

    /**
     * This set of tests mocks internal components, so it is necessary to re-initialize
     * the client to create working internal components.
     * @throws InterruptedException
     */
    public void reinitialize() throws InterruptedException {
        // Reset initialization of client
        AWSMobileClient.getInstance().awsConfiguration = null;

        // Initialize
        final CountDownLatch latch = new CountDownLatch(1);
        AWSMobileClient.getInstance().initialize(appContext, new Callback<UserStateDetails>() {
            @Override
            public void onResult(UserStateDetails result) {
                latch.countDown();
            }

            @Override
            public void onError(Exception e) {
                latch.countDown();
            }
        });
        latch.await();
    }

    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = ApplicationProvider.getApplicationContext();

        final AWSConfiguration awsConfiguration = new AWSConfiguration(appContext);

        assertNotNull(awsConfiguration.optJsonObject("CognitoUserPool"));
        assertEquals("us-west-2", awsConfiguration.optJsonObject("CognitoUserPool").getString("Region"));

        assertEquals("com.amazonaws.mobile.client.test", appContext.getPackageName());
    }

    @Test
    public void testGetConfiguration() {
        final AWSConfiguration awsConfiguration = AWSMobileClient.getInstance().getConfiguration();

        assertNotNull(awsConfiguration.optJsonObject("CognitoUserPool"));
        try {
            assertEquals("us-west-2", awsConfiguration.optJsonObject("CognitoUserPool").getString("Region"));
        } catch (JSONException e) {
            e.printStackTrace();
            fail(e.getMessage());
        }
    }

    @Test
    public void testNetworkExceptionPropagation_getUserAttributes() throws Exception {
        reinitialize();
        final AWSKeyValueStore awsKeyValueStore = new AWSKeyValueStore(appContext,
                AWSMobileClient.SHARED_PREFERENCES_KEY,
                true);
        awsKeyValueStore.put(AWSMobileClient.PROVIDER_KEY, AWSMobileClient.getInstance().getLoginKey());
        awsKeyValueStore.put(AWSMobileClient.TOKEN_KEY, getValidJWT(-3600L));
        awsKeyValueStore.put(AWSMobileClient.IDENTITY_ID_KEY, "");
        writeUserPoolsTokens(appContext, auth.getConfiguration().optJsonObject("CognitoUserPool").getString("AppClientId"), username, -3600L);

        Object originalClient = getField(auth.userpool, CognitoUserPool.class, "client");
        setField(auth.userpool, CognitoUserPool.class, "client", mockLowLevel);

        try {
            auth.getUserAttributes();
            fail("Should throw exception for network issue");
        } catch (Exception e) {
            assertTrue("Deep cause should be network exception", e.getCause().getCause() instanceof UnknownHostException);
        } finally {
            setField(auth.userpool, CognitoUserPool.class, "client", originalClient);
        }
    }

    @Test
    public void testNetworkExceptionPropagation_getTokens() throws Exception {
        reinitialize();
        final AWSKeyValueStore awsKeyValueStore = new AWSKeyValueStore(appContext,
                AWSMobileClient.SHARED_PREFERENCES_KEY,
                true);
        awsKeyValueStore.put(AWSMobileClient.PROVIDER_KEY, AWSMobileClient.getInstance().getLoginKey());
        awsKeyValueStore.put(AWSMobileClient.TOKEN_KEY, getValidJWT(-3600L));
        awsKeyValueStore.put(AWSMobileClient.IDENTITY_ID_KEY, "");
        writeUserPoolsTokens(appContext, auth.getConfiguration().optJsonObject("CognitoUserPool").getString("AppClientId"), username, -3600L);
        Field f1 = CognitoUserPool.class.getDeclaredField("client");
        f1.setAccessible(true);
        f1.set(auth.userpool, mockLowLevel);
        try {
            auth.getTokens();
            fail("Should throw exception for network issue");
        } catch (Exception e) {
            assertTrue("Deep cause should be network exception", e.getCause().getCause().getCause() instanceof UnknownHostException);
        }
    }

    @Test
    public void testNetworkExceptionPropagation_getTokens_federationStep1() throws Exception {
        reinitialize();
        auth.signIn(USERNAME, PASSWORD, null);

        Object originalCib = getField(auth.provider, AWSAbstractCognitoIdentityProvider.class, "cib");
        setField(auth.provider, AWSAbstractCognitoIdentityProvider.class, "cib", mockIdentityLowLevelGetId);

        Object originalIdentityId = getField(auth.provider, AWSAbstractCognitoIdentityProvider.class, "identityId");
        setField(auth.provider, AWSAbstractCognitoIdentityProvider.class, "identityId", null);

        auth.mFederatedLoginsMap.clear();
        try {
            auth.getCredentials();
            fail("Should throw exception for network issue");
        } catch (Exception e) {
            assertTrue("Deep cause should be network exception", e.getCause().getCause() instanceof UnknownHostException);
        } finally {
            setField(auth.provider, AWSAbstractCognitoIdentityProvider.class, "cib", originalCib);
            setField(auth.provider, AWSAbstractCognitoIdentityProvider.class, "identityId", originalIdentityId);
        }
    }

    @Test
    public void testNetworkExceptionPropagation_getTokens_federationStep2() throws Exception {
        reinitialize();
        auth.signIn(USERNAME, PASSWORD, null);

        Object originalCib = getField(auth.cognitoIdentity, CognitoCredentialsProvider.class, "cib");
        setField(auth.cognitoIdentity, CognitoCredentialsProvider.class, "cib", mockIdentityLowLevelGetIdAndGetCredentials);

        auth.mFederatedLoginsMap.clear();
        try {
            auth.getCredentials();
            fail("Should throw exception for network issue");
        } catch (Exception e) {
            assertTrue("Deep cause should be network exception", e.getCause().getCause() instanceof UnknownHostException);
        } finally {
            setField(auth.cognitoIdentity, CognitoCredentialsProvider.class, "cib", originalCib);
        }
    }

    public static Object getField(Object obj, Class clazz, String fieldName) throws NoSuchFieldException, IllegalAccessException {
        Field field = clazz.getDeclaredField(fieldName);
        field.setAccessible(true);
        Object o = field.get(obj);
        return o;
    }

    public static void setField(Object obj, Class clazz, String fieldName, Object value) throws NoSuchFieldException, IllegalAccessException {
        Field field = clazz.getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(obj, value);
    }

    AmazonCognitoIdentityProvider mockLowLevel = new AbstractAmazonCognitoIdentityProvider() {
        @Override
        public InitiateAuthResult initiateAuth(InitiateAuthRequest initiateAuthRequest) throws AmazonClientException, AmazonServiceException {
            throw new AmazonClientException("Unable to execute HTTP request: Unable to resolve " +
                    "host \"cognito-idp.us-west-2.amazonaws.com\": No address associated with " +
                    "hostname", new UnknownHostException("Unable to resolve host \"cognito-idp" +
                    ".us-west-2.amazonaws.com\": No address associated with hostname"));
        }
    };

    AmazonCognitoIdentity mockIdentityLowLevelGetId = new AbstractAmazonCognitoIdentity() {
        @Override
        public GetIdResult getId(GetIdRequest getIdRequest) throws AmazonClientException, AmazonServiceException {
            throw new AmazonClientException("Unable to execute HTTP request: Unable to resolve " +
                    "host \"cognito-idp.us-west-2.amazonaws.com\": No address associated with " +
                    "hostname", new UnknownHostException("Unable to resolve host \"cognito-idp" +
                    ".us-west-2.amazonaws.com\": No address associated with hostname"));
        }
    };

    AmazonCognitoIdentity mockIdentityLowLevelGetIdAndGetCredentials = new AbstractAmazonCognitoIdentity() {
        @Override
        public GetCredentialsForIdentityResult getCredentialsForIdentity(GetCredentialsForIdentityRequest getCredentialsForIdentityRequest) throws AmazonClientException, AmazonServiceException {
            throw new AmazonClientException("Unable to execute HTTP request: Unable to resolve " +
                    "host \"cognito-idp.us-west-2.amazonaws.com\": No address associated with " +
                    "hostname", new UnknownHostException("Unable to resolve host \"cognito-idp" +
                    ".us-west-2.amazonaws.com\": No address associated with hostname")); // TODO secondary
        }

        @Override
        public GetIdResult getId(GetIdRequest getIdRequest) throws AmazonClientException, AmazonServiceException {
            return new GetIdResult().withIdentityId("mocked-id");
        }
    };

}
