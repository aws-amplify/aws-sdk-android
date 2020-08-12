package com.amazonaws.mobileconnectors.cognitoauth.activities;

import android.app.Activity;
import android.os.Bundle;

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
