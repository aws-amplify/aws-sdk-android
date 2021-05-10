package com.amazonaws.mobileconnectors.cognitoauth.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

public final class CustomTabsManagerActivity extends Activity {
    private static final String TAG = "AuthClient"; // This activity is used for HostedUI auth flow
    static final String CUSTOM_TABS_LAUNCHED_KEY = "customTabsLaunched";
    static final String CUSTOM_TABS_INTENT_KEY = "customTabsIntent";

    private boolean customTabsLaunched = false;
    private Intent customTabsIntent;

    /**
     * Creates an intent to start an OAuth2 flow in Chrome custom tabs.
     * @param context the package context for the app.
     * @param customTabsIntent the intent for the Chrome custom tab.
     */
    public static Intent createStartIntent(
            Context context,
            Intent customTabsIntent
    ) {
        Intent intent = createBaseIntent(context);
        intent.putExtra(CUSTOM_TABS_INTENT_KEY, customTabsIntent);
        return intent;
    }

    /**
     * Creates an intent to handle the completion of an authorization flow. This restores
     * the original CustomTabsManagerActivity that was created at the start of the flow.
     * @param context the package context for the app.
     * @param responseUri the response URI, which carries the parameters describing the response.
     */
    public static Intent createResponseHandlingIntent(Context context, Uri responseUri) {
        Intent intent = createBaseIntent(context);
        intent.setData(responseUri);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        return intent;
    }

    private static Intent createBaseIntent(Context context) {
        return new Intent(context, CustomTabsManagerActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            extractState(getIntent().getExtras());
        } else {
            extractState(savedInstanceState);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

        /*
         * If this is the first run of the activity, launch the custom Chrome tab with HostedUI.
         * Note that we do not finish the activity at this point, in order to remain on the back
         * stack underneath the Chrome tab where they are going through the HostedUI flow.
         */
        if (!customTabsLaunched) {
            startActivity(customTabsIntent);
            customTabsLaunched = true;
            return;
        }

        /*
         * If we are resuming this activity and the chrome tab has already been launched, this could be
         * due to HostedUI calling our internal link, or the user canceling the authorization flow. These
         * cases may be distinguished by checking whether a response URI is available, which would be provided
         * by CustomTabsRedirectActivity. If it is not, we have returned here due to the user
         * closing out of the custom Chrome tab which means we should return a user cancelled error.
         */

        if (getIntent().getData() != null) {
            handleAuthorizationComplete();
        } else {
            handleAuthorizationCanceled();
        }
        finish();
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBoolean(CUSTOM_TABS_LAUNCHED_KEY, customTabsLaunched);
        outState.putParcelable(CUSTOM_TABS_INTENT_KEY, customTabsIntent);
    }

    private void handleAuthorizationComplete() {
        Log.d(TAG, "Authorization flow completed successfully");
        setResult(RESULT_OK, getIntent());
    }

    private void handleAuthorizationCanceled() {
        Log.d(TAG, "Authorization flow canceled by user");
        setResult(RESULT_CANCELED);
    }

    private void extractState(Bundle state) {
        if (state == null) {
            Log.d(TAG, "CustomTabsManagerActivity was created with a null state.");
            finish();
            return;
        }

        customTabsIntent = state.getParcelable(CUSTOM_TABS_INTENT_KEY);
        customTabsLaunched = state.getBoolean(CUSTOM_TABS_LAUNCHED_KEY, false);
    }
}
