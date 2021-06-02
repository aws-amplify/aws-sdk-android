package com.amazonaws.mobileconnectors.cognitoauth.activities;

import android.app.Activity;
import android.os.Bundle;

/**
 * Handles auth redirect for sign-in and sign-out.
 *
 * If cognitoauth module is being used in conjunction with AWSMobileClient, then use
 * com.amazonaws.mobile.client.activities.HostedUIRedirectActivity instead of this.
 */
public final class CustomTabsRedirectActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceBundle) {
        super.onCreate(savedInstanceBundle);

        // This ensures that the browser tab is removed from the back stack.
        startActivity(CustomTabsManagerActivity.createResponseHandlingIntent(
                this, getIntent().getData()));
        finish();
    }
}
