package com.amazonaws.mobile.client.activities;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.amazonaws.mobile.client.AWSMobileClient;
import com.amazonaws.mobileconnectors.cognitoauth.activities.CustomTabsManagerActivity;

/**
 * Handles auth redirect for sign-in and sign-out.
 */
public final class HostedUIRedirectActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceBundle) {
        super.onCreate(savedInstanceBundle);
        startActivity(CustomTabsManagerActivity.createResponseHandlingIntent(
                this, getIntent().getData()));
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("AuthClient", "Handling auth redirect response");
        AWSMobileClient.getInstance().handleAuthResponse(getIntent());
        finish();
    }
}
