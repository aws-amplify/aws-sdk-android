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

import android.content.Context;
import androidx.test.core.app.ApplicationProvider;

import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.AuthenticationContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.AuthenticationDetails;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.ChallengeContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.MultiFactorAuthenticationContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.AuthenticationHandler;
import com.amazonaws.regions.Regions;
import com.amazonaws.testutils.AWSTestBase;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.*;

public abstract class CognitoUserPoolsIntegrationTestBase extends AWSTestBase {

    private Context appContext;
    private CognitoUserPool cognitoUserPool;
    private String userName;
    private String password;
    private String userEmail;
    protected static final int TIMEOUT_IN_SECONDS = 60;

    private CognitoUserPool customAuthUserPool;
    protected String customAuthUsername;

    private JSONObject getPackageConfigure()  {
        return getPackageConfigure("CognitoUserPools");
    }

    void setUp() {
        try {
            appContext = ApplicationProvider.getApplicationContext();
            userName = getPackageConfigure().getString("UserName");
            password = getPackageConfigure().getString("Password");
            userEmail = getPackageConfigure().getString("UserEmail");

            cognitoUserPool = new CognitoUserPool(appContext,
                    getPackageConfigure().getString("UserPoolId"),
                    getPackageConfigure().getString("AppClientId"),
                    getPackageConfigure().getString("AppClientSecret"), Regions.US_EAST_1);

            customAuthUsername = getPackageConfigure().getString("customAuthUserName");
            customAuthUserPool = new CognitoUserPool(appContext,
                    getPackageConfigure().getString("customAuthPoolId"),
                    getPackageConfigure().getString("customAuthAppClientId"),
                    getPackageConfigure().getString("customAuthAppClientSecret"), Regions.US_EAST_1);
        } catch (Exception ex) {
            fail("Error in reading CognitoUserPools test configuration. Please check " + super.TEST_CONFIGURATION_FILENAME + " file."
                    + ex);
        }
    }

    void tearDown() {
        try {
            cognitoUserPool.awsKeyValueStore.clear();
        } catch (Exception ex) {
            ex.printStackTrace();
            fail ("Error in wiping off data stored on disk by CognitoUserPools." + ex);
        }
    }

    CognitoUserSession signIn() {
        final CountDownLatch signInLatch = new CountDownLatch(1);
        final ArrayList<CognitoUserSession> listSessions = new ArrayList<CognitoUserSession>();

        cognitoUserPool.getUser(userName).getSession(new AuthenticationHandler() {
            @Override
            public void onSuccess(CognitoUserSession userSession, CognitoDevice newDevice) {
                listSessions.add(userSession);
                signInLatch.countDown();
            }

            @Override
            public void getAuthenticationDetails(AuthenticationContinuation authenticationContinuation, String userId) {
                AuthenticationDetails authenticationDetails = new AuthenticationDetails(userName, password, null);
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
                fail("Tests are not configured to work with additional challenges. " +
                        "Either create a CognitoUserPool without additional challenges or update the test.");
                signInLatch.countDown();
            }

            @Override
            public void onFailure(Exception exception) {
                fail("Error while signing-in. " + exception.getLocalizedMessage());
                signInLatch.countDown();
            }
        });

        try {
            signInLatch.await(TIMEOUT_IN_SECONDS, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals(1, listSessions.size());

        return listSessions.get(0);
    }

    void signOut() {
        getUser().signOut();
    }

    CognitoUserPool createCognitoUserPool() {
        try {
            return new CognitoUserPool(appContext,
                    getPackageConfigure().getString("UserPoolId"),
                    getPackageConfigure().getString("AppClientId"),
                    getPackageConfigure().getString("AppClientSecret"));
        } catch (Exception ex) {
            fail("Error in constructing a CognitoUserPool object.");
            return null;
        }
    }

    public CognitoUserPool getUserPool() {
        return cognitoUserPool;
    }


    public CognitoUserPool getCustomAuthUserPool() {
        return customAuthUserPool;
    }

    public CognitoUser getUser() {
        return cognitoUserPool.getUser(userName);
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getUserEmail() {
        return userEmail;
    }
}
