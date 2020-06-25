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

import android.util.Base64;
import android.util.Log;

import com.amazonaws.mobileconnectors.cognitoidentityprovider.exceptions.CognitoNotAuthorizedException;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.tokens.CognitoAccessToken;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.tokens.CognitoIdToken;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.tokens.CognitoRefreshToken;

import org.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

@Ignore("These tests require significant hand crafting of backend infrastructure that isn't documented. TODO: Rewrite these tests to arrange more of their state themselves, and add the base infrastructure to amplify-ci-support.")
public class SignInPersistenceIntegrationTest extends CognitoUserPoolsIntegrationTestBase {

    private CognitoUserPool cognitoUserPool;
    private CognitoUser cognitoUser;

    @Before
    public void setUp() {
        super.setUp();

        cognitoUserPool = super.getUserPool();
        cognitoUser = super.getUser();

        cognitoUser.signOut();
        verifyCognitoUserSessionForSignedOutUser();
    }

    @After
    public void tearDown() {
        cognitoUser.signOut();
        verifyCognitoUserSessionForSignedOutUser();

        super.tearDown();

        deleteAllEncryptionKeys();
    }

    @Test
    public void testSignIn() {
        CognitoUserSession userSession = super.signIn();
        verifyCognitoUserSessionForSignedInUser(userSession);
    }

    @Test
    public void testSignInAfterEncryptionKeyIsLostAndAppIsReopened() {
        CognitoUserSession userSession = super.signIn();
        verifyCognitoUserSessionForSignedInUser(userSession);

        deleteAllEncryptionKeys();

        cognitoUserPool = createCognitoUserPool();
        cognitoUser = cognitoUserPool.getUser(getUserName());
        verifyCognitoUserSessionForSignedOutUser();
        userSession = super.signIn();
        verifyCognitoUserSessionForSignedInUser(userSession);
    }

    @Test
    public void testSignIn_EncryptionKeyIsLostAndAppIsInMemory_SignOut_SignIn() {
        CognitoUserSession userSession = super.signIn();
        verifyCognitoUserSessionForSignedInUser(userSession);

        deleteAllEncryptionKeys();

        super.signOut();
        verifyCognitoUserSessionForSignedOutUser();
        userSession = super.signIn();
        verifyCognitoUserSessionForSignedInUser(userSession);
    }

    @Test
    public void testSignIn_EncryptionKeyIsLostAndAppIsInMemory_SignIn() {
        CognitoUserSession userSession = super.signIn();
        verifyCognitoUserSessionForSignedInUser(userSession);

        deleteAllEncryptionKeys();

        userSession = super.signIn();
        verifyCognitoUserSessionForSignedInUser(userSession);
    }

    @Test
    public void testSignInInALoop() {
        for (int iterator = 0; iterator < 5; iterator++) {
            CognitoUserSession userSession = super.signIn();
            verifyCognitoUserSessionForSignedInUser(userSession);
        }
    }

    @Test
    public void testSignInSignOutInALoop() {
        for (int iterator = 0; iterator < 5; iterator++) {
            CognitoUserSession userSession = super.signIn();
            verifyCognitoUserSessionForSignedInUser(userSession);
            super.signOut();
            verifyCognitoUserSessionForSignedOutUser();
        }
    }

    @Test
    public void testIdAndAccessTokensCorrupted() {
        // SignIn the user.
        CognitoUserSession userSessionBeforeTokenExpired = super.signIn();
        verifyCognitoUserSessionForSignedInUser(userSessionBeforeTokenExpired);

        CognitoUserSession expiredSession = new CognitoUserSession(
                new CognitoIdToken("DummyIdToken"),
                new CognitoAccessToken("DummyAccessToken"),
                userSessionBeforeTokenExpired.getRefreshToken());
        cognitoUser.cacheTokens(expiredSession);

        cognitoUser = null;
        cognitoUserPool = null;

        cognitoUserPool = createCognitoUserPool();
        cognitoUser = cognitoUserPool.getUser(getUserName());

        // Getting the cached session will refresh the id and access tokens
        // using the refresh token.
        try {
            CognitoUserSession userSessionAfterRefresh = cognitoUser.getCachedSession();
            assertNotNull(userSessionAfterRefresh);
            assertTrue(userSessionAfterRefresh.isValid());
            assertTrue(userSessionAfterRefresh.isValidForThreshold());
        } catch (Exception ex) {
            fail("Error in refreshing the Id and Access tokens " +
                    "with a valid refresh token. " + ex);
        }
    }

    @Test
    public void testAllTokensCorrupted() {
        // SignIn the user.
        CognitoUserSession userSessionBeforeTokenExpired = super.signIn();
        verifyCognitoUserSessionForSignedInUser(userSessionBeforeTokenExpired);

        // Expire the tokens by writing dummy values
        // for token in the SharedPreferences.
        CognitoUserSession expiredSession = new CognitoUserSession(
                new CognitoIdToken("DummyIdToken"),
                new CognitoAccessToken("DummyAccessToken"),
                new CognitoRefreshToken("DummyRefreshToken"));
        cognitoUser.cacheTokens(expiredSession);

        cognitoUser = null;
        cognitoUserPool = null;

        cognitoUserPool = createCognitoUserPool();
        cognitoUser = cognitoUserPool.getUser(getUserName());
        verifyCognitoUserSessionForSignedOutUser();

        CognitoUserSession userSessionAfterTokenExpired = super.signIn();
        verifyCognitoUserSessionForSignedInUser(userSessionAfterTokenExpired);
    }

    @Test
    public void testIdAndAccessTokensExpired() {
        // SignIn the user.
        CognitoUserSession userSessionBeforeTokenExpired = super.signIn();
        verifyCognitoUserSessionForSignedInUser(userSessionBeforeTokenExpired);

        // Expire the token for client-side validation.
        String idTokenExpired = expireJWTToken(userSessionBeforeTokenExpired.getIdToken().getJWTToken(), 3600);
        String accessTokenExpired = expireJWTToken(userSessionBeforeTokenExpired.getAccessToken().getJWTToken(), 3600);

        // Construct a session using the expired objects and persist them on disk.
        CognitoUserSession expiredSession = new CognitoUserSession(
                new CognitoIdToken(idTokenExpired),
                new CognitoAccessToken(accessTokenExpired),
                userSessionBeforeTokenExpired.getRefreshToken());
        cognitoUser.cacheTokens(expiredSession);

        // Set to null to mimic app restartability
        cognitoUser = null;
        cognitoUserPool = null;

        // Now, create new CognitoUserPool and CognitoUser objects and retrieve
        // the cached session which will refresh the expired tokens.
        cognitoUserPool = createCognitoUserPool();
        cognitoUser = cognitoUserPool.getUser(getUserName());
        verifyCognitoUserSessionForSignedInUser(cognitoUser.getCachedSession());
    }

    @Test
    public void testAllTokensExpired() {
        // SignIn the user.
        CognitoUserSession userSessionBeforeTokenExpired = super.signIn();
        verifyCognitoUserSessionForSignedInUser(userSessionBeforeTokenExpired);

        // Expire the tokens by marking the exp value in the token.
        String idTokenExpired = expireJWTToken(userSessionBeforeTokenExpired.getIdToken().getJWTToken(), 3600);
        String accessTokenExpired = expireJWTToken(userSessionBeforeTokenExpired.getAccessToken().getJWTToken(), 3600);
        String refreshTokenExpired = expireJWTToken(userSessionBeforeTokenExpired.getRefreshToken().getToken(), 3600);

        CognitoUserSession expiredSession = new CognitoUserSession(
                new CognitoIdToken(idTokenExpired),
                new CognitoAccessToken(accessTokenExpired),
                new CognitoRefreshToken(refreshTokenExpired));
        cognitoUser.cacheTokens(expiredSession);

        cognitoUser = null;
        cognitoUserPool = null;

        cognitoUserPool = createCognitoUserPool();
        cognitoUser = cognitoUserPool.getUser(getUserName());
        try {
            cognitoUser.getCachedSession();
            fail("Expecting getCachedSession to throw CognitoNotAuthorizedException.");
        } catch (Exception ex) {
            assertTrue(ex instanceof CognitoNotAuthorizedException);
            assertEquals("User is not authenticated", ex.getLocalizedMessage());
        }

        CognitoUserSession userSessionAfterTokenExpired = super.signIn();
        verifyCognitoUserSessionForSignedInUser(userSessionAfterTokenExpired);
    }

    @Test
    public void testNoTokens() {
        // SignIn the user.
        CognitoUserSession userSessionBeforeTokenExpired = super.signIn();
        verifyCognitoUserSessionForSignedInUser(userSessionBeforeTokenExpired);

        // Expire the tokens by writing dummy values
        // for token in the SharedPreferences.
        CognitoUserSession expiredSession = new CognitoUserSession(
                null,
                null,
                null);
        cognitoUser.cacheTokens(expiredSession);

        cognitoUser = null;
        cognitoUserPool = null;

        cognitoUserPool = createCognitoUserPool();
        cognitoUser = cognitoUserPool.getUser(getUserName());
        verifyCognitoUserSessionForSignedOutUser();

        CognitoUserSession userSessionAfterTokenExpired = super.signIn();
        verifyCognitoUserSessionForSignedInUser(userSessionAfterTokenExpired);
    }

    @Test
    public void testNoIdToken() {
        // SignIn the user.
        CognitoUserSession userSessionBeforeTokenExpired = super.signIn();
        verifyCognitoUserSessionForSignedInUser(userSessionBeforeTokenExpired);

        CognitoUserSession expiredSession = new CognitoUserSession(
                null,
                userSessionBeforeTokenExpired.getAccessToken(),
                userSessionBeforeTokenExpired.getRefreshToken());
        cognitoUser.cacheTokens(expiredSession);

        cognitoUser = null;
        cognitoUserPool = null;

        cognitoUserPool = createCognitoUserPool();
        cognitoUser = cognitoUserPool.getUser(getUserName());
        verifyCognitoUserSessionForSignedInUser(cognitoUser.getCachedSession());
    }

    @Test
    public void testNoAccessToken() {
        // SignIn the user.
        CognitoUserSession userSessionBeforeTokenExpired = super.signIn();
        verifyCognitoUserSessionForSignedInUser(userSessionBeforeTokenExpired);

        CognitoUserSession expiredSession = new CognitoUserSession(
                userSessionBeforeTokenExpired.getIdToken(),
                null,
                userSessionBeforeTokenExpired.getRefreshToken());
        cognitoUser.cacheTokens(expiredSession);

        cognitoUser = null;
        cognitoUserPool = null;

        cognitoUserPool = createCognitoUserPool();
        cognitoUser = cognitoUserPool.getUser(getUserName());

        CognitoUserSession cognitoUserSession = cognitoUser.getCachedSession();
        assertNotNull(cognitoUserSession);

        CognitoUserSession userSessionAfterNoAccessToken = super.signIn();
        verifyCognitoUserSessionForSignedInUser(userSessionAfterNoAccessToken);
    }

    @Test
    public void testIdAndAccessTokenAreValidNoRefreshToken() throws Exception {
        // SignIn the user.
        CognitoUserSession userSessionBeforeTokenExpired = super.signIn();
        verifyCognitoUserSessionForSignedInUser(userSessionBeforeTokenExpired);

        CognitoUserSession expiredSession = new CognitoUserSession(
                userSessionBeforeTokenExpired.getIdToken(),
                userSessionBeforeTokenExpired.getAccessToken(),
                null);
        cognitoUser.cacheTokens(expiredSession);

        cognitoUser = null;
        cognitoUserPool = null;

        cognitoUserPool = createCognitoUserPool();
        cognitoUser = cognitoUserPool.getUser(getUserName());

        CognitoUserSession userSession = cognitoUser.getCachedSession();

        assertNotNull(userSession);

        assertEquals(getUserName(), userSession.getUsername());
        assertTrue(userSession.isValid());
        assertTrue(userSession.isValidForThreshold());

        assertNotNull(userSession.getAccessToken());
        assertNotNull(userSession.getAccessToken().getExpiration());
        assertNotNull(userSession.getAccessToken().getJWTToken());
        assertNotNull(userSession.getAccessToken().getUsername());
        assertEquals(getUserName(), userSession.getAccessToken().getUsername());

        assertNotNull(userSession.getIdToken());
        assertNotNull(userSession.getIdToken().getExpiration());
        assertNotNull(userSession.getIdToken().getJWTToken());
    }

    @Test
    public void testIdAndAccessTokenExpiredAndNoRefreshToken() {
        // SignIn the user.
        CognitoUserSession userSessionBeforeTokenExpired = super.signIn();
        verifyCognitoUserSessionForSignedInUser(userSessionBeforeTokenExpired);

        // Expire the token for client-side validation.
        String idTokenExpired = expireJWTToken(userSessionBeforeTokenExpired.getIdToken().getJWTToken(), 3600);
        String accessTokenExpired = expireJWTToken(userSessionBeforeTokenExpired.getAccessToken().getJWTToken(), 3600);

        CognitoUserSession expiredSession = new CognitoUserSession(
                new CognitoIdToken(idTokenExpired),
                new CognitoAccessToken(accessTokenExpired),
                null);
        cognitoUser.cacheTokens(expiredSession);

        cognitoUser = null;
        cognitoUserPool = null;

        cognitoUserPool = createCognitoUserPool();
        cognitoUser = cognitoUserPool.getUser(getUserName());
        verifyCognitoUserSessionForSignedOutUser();
    }

    private void verifyCognitoUserSessionForSignedInUser(final CognitoUserSession userSession) {
        try {
            assertNotNull(userSession);

            assertEquals(getUserName(), userSession.getUsername());
            assertTrue(userSession.isValid());
            assertTrue(userSession.isValidForThreshold());

            assertNotNull(userSession.getAccessToken());
            assertNotNull(userSession.getAccessToken().getExpiration());
            assertNotNull(userSession.getAccessToken().getJWTToken());
            assertNotNull(userSession.getAccessToken().getUsername());
            assertEquals(getUserName(), userSession.getAccessToken().getUsername());

            assertNotNull(userSession.getIdToken());
            assertNotNull(userSession.getIdToken().getExpiration());
            assertNotNull(userSession.getIdToken().getJWTToken());

            assertNotNull(userSession.getRefreshToken());
            assertNotNull(userSession.getRefreshToken().getToken());
        } catch (Exception ex) {
            fail("Error in verifying the Cognito User Session for the signed-in user. " + ex);
        }
    }

    private void verifyCognitoUserSessionForSignedOutUser() {
        try {
            cognitoUser.getCachedSession();
            fail("Error in verifying the Cognito User Session for the signed-out user.");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private String expireJWTToken(String token, int expireBySeconds) {
        if (token == null) {
            return null;
        }

        try {
            byte[] base64DecodedToken = Base64.decode(token, Base64.DEFAULT);
            String tokenInStringFormat = new String(base64DecodedToken);
            JSONObject jsonObject = new JSONObject(tokenInStringFormat);
            jsonObject.getString("auth_time");
            String expirationTime = jsonObject.getString("exp");
            expirationTime = String.valueOf(Integer.parseInt(expirationTime) - expireBySeconds);
            jsonObject.put("exp", expirationTime);
            byte[] expiredBase64EncodedToken = Base64.encode(jsonObject.toString().getBytes(), Base64.DEFAULT);
            return new String(expiredBase64EncodedToken);
        } catch (Exception ex) {
            Log.e(TAG, "Error in expiring the JWTToken. ", ex);
            return null;
        }
    }
}
