package com.amazonaws.mobile.client;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.support.test.InstrumentationRegistry;
import android.util.Base64;

import com.amazonaws.internal.keyvaluestore.AWSKeyValueStore;
import com.amazonaws.testutils.AWSTestBase;
import com.amazonaws.util.StringUtils;

import org.json.JSONObject;

public abstract class AWSMobileClientTestBase extends AWSTestBase {

    /** Package name in testconfiguration.json */
    protected static final String PACKAGE_NAME = InstrumentationRegistry.getTargetContext().
            getResources().getString(R.string.package_name);

    public static JSONObject getPackageConfigure()  {
        return getPackageConfigure(PACKAGE_NAME);
    }

    public static void setWifi(final Context appContext, final boolean wifiState) {
        WifiManager wifiManager = (WifiManager) appContext.getSystemService(Context.WIFI_SERVICE);
        wifiManager.setWifiEnabled(wifiState);
    }

    public static void setTokensDirectly(final Context appContext,
                                         final String providerKey,
                                         final String token,
                                         final String identityId) {
        final AWSKeyValueStore awsKeyValueStore = new AWSKeyValueStore(appContext,
                AWSMobileClient.SHARED_PREFERENCES_KEY,
                true);
        awsKeyValueStore.put(AWSMobileClient.PROVIDER_KEY, providerKey);
        awsKeyValueStore.put(AWSMobileClient.TOKEN_KEY, token);
        awsKeyValueStore.put(AWSMobileClient.IDENTITY_ID_KEY, identityId);
    }

    public static void writeUserpoolsTokens(final Context appContext, final String clientId, final String username, final long expiryFromNow) {
        // Store tokens in shared preferences
        final AWSKeyValueStore awsKeyValueStore = new AWSKeyValueStore(appContext,
                "CognitoIdentityProviderCache",
                true);
        String storeFieldPrefix = "CognitoIdentityProvider." + clientId + "." + username + ".";
        awsKeyValueStore.put(storeFieldPrefix + "idToken", getValidJWT(expiryFromNow));
        awsKeyValueStore.put(storeFieldPrefix + "accessToken", getValidJWT(expiryFromNow));
        awsKeyValueStore.put(storeFieldPrefix + "refreshToken", "DummyRefresh");
    }

    public static void writeUserpoolsTokens(final Context appContext,
                                            final String clientId,
                                            final String userId,
                                            final String accessToken,
                                            final String idToken,
                                            final String refreshToken) {
        final AWSKeyValueStore awsKeyValueStore = new AWSKeyValueStore(
                appContext,
                "CognitoIdentityProviderCache",
                true);

        // Create keys to look for cached tokens
        final String csiIdTokenKey = "CognitoIdentityProvider." + clientId + "." + userId
                + ".idToken";
        final String csiAccessTokenKey = "CognitoIdentityProvider." + clientId + "." + userId
                + ".accessToken";
        final String csiRefreshTokenKey = "CognitoIdentityProvider." + clientId + "." + userId
                + ".refreshToken";
        final String csiLastUserKey = "CognitoIdentityProvider." + clientId + ".LastAuthUser";

        // Store the data in Shared Preferences
        awsKeyValueStore.put(csiAccessTokenKey, accessToken);
        awsKeyValueStore.put(csiIdTokenKey, idToken);
        awsKeyValueStore.put(csiRefreshTokenKey, refreshToken);
        awsKeyValueStore.put(csiLastUserKey, userId);
    }

    // Create valid access tokens
    public static String getValidJWT(long expiryInSecs){
        long epoch = System.currentTimeMillis()/1000L;
        epoch = epoch + expiryInSecs;
        String accessToken_p1_Base64 = "eyJ0eXAiOiAiSldUIiwgImFsZyI6IlJTMjU2In0=";
        String accessToken_p3_Base64 = "e0VuY3J5cHRlZF9LZXl9";
        String accessToken_p2_Str = "{\"iss\": \"userPoolId\",\"sub\": \"my@email.com\",\"aud\": \"https:aws.cognito.com\",\"exp\": \"" + String.valueOf(epoch) + "\"}";
        byte[] accessToken_p2_UTF8 = accessToken_p2_Str.getBytes(StringUtils.UTF8);
        //String accessToken_p2_Base64 = Base64.encodeToString(accessToken_p2_UTF8, Base64.DEFAULT);
        String accessToken_p2_Base64 = new String(Base64.encode(accessToken_p2_UTF8, Base64.DEFAULT));
        String validAccessToken = accessToken_p1_Base64+"."+accessToken_p2_Base64+"."+accessToken_p3_Base64;
        return validAccessToken;
    }
}
