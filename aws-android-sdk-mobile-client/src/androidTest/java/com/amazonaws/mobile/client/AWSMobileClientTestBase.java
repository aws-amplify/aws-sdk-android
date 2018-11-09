package com.amazonaws.mobile.client;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.WifiManager;
import android.support.test.runner.AndroidJUnit4;
import android.util.Base64;

import com.amazonaws.util.StringUtils;

import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class AWSMobileClientTestBase {
    public static void setWifi(final Context appContext, final boolean wifiState) {
        WifiManager wifiManager = (WifiManager) appContext.getSystemService(Context.WIFI_SERVICE);
        wifiManager.setWifiEnabled(wifiState);
    }

    public static void setTokensDirectly(final Context appContext, final String providerKey, final String token, final String identityId) {
        SharedPreferences sharedPreferences = appContext.getSharedPreferences(AWSMobileClient.SHARED_PREFERENCES_KEY, Context.MODE_PRIVATE);
        sharedPreferences.edit()
                .putString(AWSMobileClient.PROVIDER_KEY, providerKey)
                .putString(AWSMobileClient.TOKEN_KEY, token)
                .putString(AWSMobileClient.IDENTITY_ID_KEY, identityId)
                .apply();
    }

    public static void writeUserpoolsTokens(final Context appContext, final String clientId, final String username, final long expiryFromNow) {
        // Store tokens in shared preferences
        SharedPreferences sharedPreferences =
                appContext.getSharedPreferences("CognitoIdentityProviderCache", Context.MODE_PRIVATE);
        String storeFieldPrefix = "CognitoIdentityProvider." + clientId + "." + username + ".";
        sharedPreferences.edit().putString(storeFieldPrefix + "idToken", getValidJWT(expiryFromNow)).commit();
        sharedPreferences.edit().putString(storeFieldPrefix +"accessToken", getValidJWT(expiryFromNow)).commit();
        sharedPreferences.edit().putString(storeFieldPrefix +"refreshToken", "DummyRefresh").commit();
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
