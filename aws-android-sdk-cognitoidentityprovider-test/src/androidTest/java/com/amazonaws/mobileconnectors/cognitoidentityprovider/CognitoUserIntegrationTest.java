/*
 * Copyright 2019-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.cognitoidentityprovider;

import android.util.Log;

import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.AuthenticationContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.AuthenticationDetails;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.ChallengeContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.MultiFactorAuthenticationContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.AuthenticationHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.util.CognitoServiceConstants;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

@Ignore("This test requires significant hand crafting of backend infrastructure that isn't documented. TODO: Rewrite this test to arrange more of its state itself, and add the base infrastructure to amplify-ci-support.")
public class CognitoUserIntegrationTest extends CognitoUserPoolsIntegrationTestBase {

    private CognitoUserPool cognitoUserPool;

    @Before
    public void setUp() {
        super.setUp();
        cognitoUserPool = super.getCustomAuthUserPool();
        cognitoUserPool.getCurrentUser().signOut();
        verifyCognitoUserSessionForSignedOutUser();
    }

    void tearDown() {
        try {
            cognitoUserPool.awsKeyValueStore.clear();
        } catch (Exception ex) {
            ex.printStackTrace();
            fail ("Error in wiping off data stored on disk by CognitoUserPools." + ex);
        }
    }

    @Test
    public void testCustomAuth(){
        final CountDownLatch signInLatch = new CountDownLatch(1);
        final ArrayList<CognitoUserSession> userSessions = new ArrayList();

        AuthenticationHandler authenticationHandler = new AuthenticationHandler() {
            @Override
            public void onSuccess(CognitoUserSession userSession, CognitoDevice newDevice) {
                userSessions.add(userSession);
                signInLatch.countDown();
            }

            @Override
            public void getAuthenticationDetails(AuthenticationContinuation authenticationContinuation, String userId) {
                final HashMap<String, String> authParameters = new HashMap<>();
                // This is a passwordless flow, hance passing a dummy password.
                AuthenticationDetails authenticationDetails = new AuthenticationDetails(customAuthUsername, "", authParameters, null);
                authenticationContinuation.setAuthenticationDetails(authenticationDetails);
                authenticationContinuation.continueTask();
            }

            @Override
            public void getMFACode(MultiFactorAuthenticationContinuation continuation) {
                fail("Tests are not configured to work with MFA. " +
                        "Either create a CognitoUserPool without MFA or update the test.");
                signInLatch.countDown();
            }

            @Override
            public void authenticationChallenge(ChallengeContinuation continuation) {
                Log.d(TAG, "Yo, Authentication Chanllenge is called Passwordless");
                continuation.setChallengeResponse(CognitoServiceConstants.CHLG_RESP_ANSWER, "1133");
                continuation.continueTask();
            }

            @Override
            public void onFailure(Exception exception) {
                fail("Error while signing-in. " + exception.getLocalizedMessage());
                signInLatch.countDown();
            }
        };

        cognitoUserPool.getUser(customAuthUsername).getSessionInBackground(authenticationHandler);

        try {
            signInLatch.await(TIMEOUT_IN_SECONDS, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals(1, userSessions.size());
        // Verify that the sign-in was successful
        verifyCognitoUserSessionForSignedInUser(userSessions.get(0));
    }


    private void verifyCognitoUserSessionForSignedOutUser() {
        try {
            cognitoUserPool.getCurrentUser().getCachedSession();
            fail("Error in verifying the Cognito User Session for the signed-out user.");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void verifyCognitoUserSessionForSignedInUser(final CognitoUserSession userSession) {
        try {
            assertNotNull(userSession);

            assertTrue(userSession.isValid());
            assertTrue(userSession.isValidForThreshold());

            assertNotNull(userSession.getAccessToken());
            assertNotNull(userSession.getAccessToken().getExpiration());
            assertNotNull(userSession.getAccessToken().getJWTToken());
            assertNotNull(userSession.getAccessToken().getUsername());

            assertNotNull(userSession.getIdToken());
            assertNotNull(userSession.getIdToken().getExpiration());
            assertNotNull(userSession.getIdToken().getJWTToken());

            assertNotNull(userSession.getRefreshToken());
            assertNotNull(userSession.getRefreshToken().getToken());
        } catch (Exception ex) {
            fail("Error in verifying the Cognito User Session for the signed-in user. " + ex);
        }
    }
}
