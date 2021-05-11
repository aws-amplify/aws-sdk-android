package com.amazonaws.mobile.client.activities;

import android.app.Activity;
import android.os.Bundle;

import com.amazonaws.mobile.client.AWSMobileClient;
import com.amazonaws.mobileconnectors.cognitoauth.activities.CustomTabsManagerActivity;

/**
 * Handles auth redirect for sign-in and sign-out.
 */
public final class CustomTabsRedirectActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceBundle) {
        super.onCreate(savedInstanceBundle);
        startActivity(CustomTabsManagerActivity.createResponseHandlingIntent(
                this, getIntent().getData()));
    }

    @Override
    public void onResume() {
        super.onResume();
        AWSMobileClient.getInstance().handleAuthResponse(getIntent());
        finish();
    }
}
