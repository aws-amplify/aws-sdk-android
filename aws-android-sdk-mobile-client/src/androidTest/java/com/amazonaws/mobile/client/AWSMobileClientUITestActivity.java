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

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

public class AWSMobileClientUITestActivity extends AppCompatActivity {
    public static final String TAG = AWSMobileClientUITestActivity.class.getSimpleName();
    private AWSMobileClient auth;
    public static ArrayList<Intent> intents = new ArrayList<Intent>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.amazonaws.mobile.client.test.R.layout.activity_awsmobileclient_ui_test);
    }

    public void showDropInUI(final View view) {
        Log.d(TAG, "showDropInUI: ");
        auth.showSignIn(this, new Callback<UserStateDetails>() {
            @Override
            public void onResult(UserStateDetails result) {

            }

            @Override
            public void onError(Exception e) {

            }
        });
    }

    public void showHostedUI(final View view) {
        Log.d(TAG, "showHostedUI: ");
        final HostedUIOptions hostedUIOptions = HostedUIOptions.builder().build();
        final SignInUIOptions signInUIOptions = SignInUIOptions.builder()
                .hostedUIOptions(hostedUIOptions)
                .build();
        auth.showSignIn(this, signInUIOptions, new Callback<UserStateDetails>() {
            @Override
            public void onResult(UserStateDetails result) {

            }

            @Override
            public void onError(Exception e) {

            }
        });
    }

    public void signOut(final View view) {
        Log.d(TAG, "signOut: ");
        auth.signOut();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume: " + getIntent().getDataString());
        Intent activityIntent = getIntent();
        //  -- Call Auth.getTokens() to get Cognito JWT --
        if (activityIntent.getData() != null &&
                "awsmobileclient".equals(activityIntent.getData().getScheme())) {
            intents.add(activityIntent);
//            auth.handleAuthResponse(activityIntent);
        }
    }
}
