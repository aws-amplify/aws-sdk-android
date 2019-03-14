package com.amazonaws.mobile.client.internal.oauth2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.CustomTabsCallback;
import android.support.customtabs.CustomTabsClient;
import android.support.customtabs.CustomTabsIntent;
import android.support.customtabs.CustomTabsServiceConnection;
import android.support.customtabs.CustomTabsSession;
import android.util.Log;

import com.amazonaws.internal.keyvaluestore.AWSKeyValueStore;
import com.amazonaws.mobile.client.AWSMobileClient;
import com.amazonaws.mobile.client.Callback;
import com.amazonaws.mobileconnectors.cognitoauth.exceptions.AuthClientException;
import com.amazonaws.mobileconnectors.cognitoauth.exceptions.AuthServiceException;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.amazonaws.mobileconnectors.cognitoauth.util.Pkce;
import com.amazonaws.util.StringUtils;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import javax.net.ssl.HttpsURLConnection;

import static com.amazonaws.mobile.client.internal.oauth2.OAuth2Client.CREATE_DATE;
import static com.amazonaws.mobile.client.internal.oauth2.OAuth2Constants.*;

public class OAuth2Client {
    public static final String TAG = OAuth2Client.class.getSimpleName();

    public static final String CUSTOM_TABS_PACKAGE_NAME = "com.android.chrome";
    public static final String SHARED_PREFERENCES_KEY = "com.amazonaws.mobile.client.oauth2";
    /// Defined in seconds
    private static final long REFRESH_THRESHOLD = 60 * 1000;
    public static final String TOKEN_URI_KEY = "tokenUri";
    public static final String CREATE_DATE = "createDate";
    public static final String SIGN_OUT_REDIRECT_URI_KEY = "signOutRedirectUri";
    public static final String SIGN_IN_REDIRECT_URI_KEY = "signInRedirectUri";
    final AWSMobileClient mMobileClient;
    final CustomTabsServiceConnection mCustomTabsServiceConnection;
    final Context mContext;
    private final OAuth2ClientStore mStore;
    boolean mIsPersistenceEnabled;
    CustomTabsClient mCustomTabsClient;
    CustomTabsSession mCustomTabsSession;
    CustomTabsCallback mCustomTabsCallback;
    PKCEMode mPKCEMode;
    Callback<AuthorizeResponse> mAuthorizeCallback;
    String mState;
    private String mClientId;
    private String mError;
    private String mErrorDescription;
    private String mErrorUriString;
    private Callback<Void> mSignOutCallback;
    private boolean mAuthorizeOrSignOutRedirectReceived;

    public OAuth2Client(final Context context, final AWSMobileClient mobileClient) {
        mMobileClient = mobileClient;
        mContext = context;
        mPKCEMode = PKCEMode.S256;
        mStore = new OAuth2ClientStore(this);
        mCustomTabsCallback = new CustomTabsCallback() {
            @Override
            public void onNavigationEvent(int navigationEvent, Bundle extras) {
                super.onNavigationEvent(navigationEvent, extras);

                if (navigationEvent == TAB_HIDDEN && !mAuthorizeOrSignOutRedirectReceived) {
                    if (mSignOutCallback != null) {
                        mSignOutCallback.onError(new Exception("User cancelled flow or flow interrupted."));
                        mSignOutCallback = null;
                    } else if (mAuthorizeCallback != null) {
                        mAuthorizeCallback.onError(new Exception("User cancelled flow or flow interrupted."));
                        mAuthorizeCallback = null;
                    }
                }
            }
        };
        mCustomTabsServiceConnection = new CustomTabsServiceConnection() {
            @Override
            public void onCustomTabsServiceConnected(final ComponentName name,
                                                     final CustomTabsClient client) {
                mCustomTabsClient = client;
                mCustomTabsClient.warmup(0L);
                mCustomTabsSession = mCustomTabsClient.newSession(mCustomTabsCallback);
            }

            @Override
            public void onServiceDisconnected(final ComponentName name) {
                mCustomTabsClient = null;
            }
        };
        if (!CustomTabsClient.bindCustomTabsService(mContext, CUSTOM_TABS_PACKAGE_NAME,
                mCustomTabsServiceConnection)) {
            Log.d(TAG, "OAuth2Client: Failed to pre-warm custom tab, first page load may be " +
                    "slower");
        }
    }

    public void setPersistenceEnabled(final boolean isPersistenceEnabled) {
        mIsPersistenceEnabled = isPersistenceEnabled;
        mStore.setPersistenceEnabled(isPersistenceEnabled);
    }

    public void signOut(final Uri signOutUri, final Callback<Void> callback) {
        this.mSignOutCallback = callback;
        final String redirectUri = signOutUri.getQueryParameter("redirect_uri");
        if (redirectUri == null) {
            throw new IllegalArgumentException("The sign-out URI must contain a redirect_uri");
        }
        mStore.set(SIGN_OUT_REDIRECT_URI_KEY, redirectUri);
        Uri.parse(redirectUri);
        open(signOutUri);
    }

    public void signOut() {
        mStore.clear();
        mSignOutCallback = null;
        mAuthorizeCallback = null;
        mPKCEMode = PKCEMode.S256;
        mState = null;
        mClientId = null;
        mError = null;
        mErrorDescription = null;
        mErrorUriString = null;
    }

    public enum PKCEMode {
        NONE(""),
        S256("S256");

        private String encode;

        PKCEMode(final String encode) {
            this.encode = encode;
        }

        public String toString() {
            return encode;
        }

        public boolean equals(final PKCEMode other) {
            return other.encode.equals(encode);
        }
    }

    public void setPKCEMode(final PKCEMode pkceMode) {
        this.mPKCEMode = pkceMode;
    }

    public void authorize(final Uri authorizeUri, final Callback<AuthorizeResponse> callback) {
        mAuthorizeCallback = callback;
        try {
            Uri.Builder authorizeUriBuilder = authorizeUri.buildUpon();

            switch (mPKCEMode) {
                case S256:
                    final String proofKey = Pkce.generateRandom();
                    final String proofKeyHash = Pkce.generateHash(proofKey);
                    mStore.set("proofKey", proofKey);
                    mStore.set("proofKeyHash", proofKeyHash);
                    authorizeUriBuilder
                            .appendQueryParameter("code_challenge_method", mPKCEMode.toString())
                            .appendQueryParameter("code_challenge", proofKeyHash)
                            .build();
                    break;
                case NONE:
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported PKCE mode was chosen, please " +
                            "choose another");
            }

            final Uri validating = authorizeUriBuilder.build();
            mClientId = validating.getQueryParameter("client_id");
            if (mClientId == null) {
                throw new IllegalArgumentException("The authorize URI must contain a client_id");
            }
            final String redirectUri = validating.getQueryParameter("redirect_uri");
            if (redirectUri == null) {
                throw new IllegalArgumentException("The authorize URI must contain a redirect_uri");
            }
            mStore.set(SIGN_IN_REDIRECT_URI_KEY, redirectUri);
            Uri.parse(redirectUri);
            if (validating.getQueryParameter("response_type") == null) {
                authorizeUriBuilder
                        .appendQueryParameter("response_type", "code")
                        .build();
            }
            mState = validating.getQueryParameter("state");
            if (mState == null) {
                mState = Pkce.generateRandom();
                authorizeUriBuilder
                        .appendQueryParameter("state", mState)
                        .build();
            }
            mStore.set("state", mState);
            open(authorizeUriBuilder.build());
        } catch (Exception e) {
            callback.onError(e);
        }
    }

    public void open(final Uri uri) {
        CustomTabsIntent customTabsIntent =
                new CustomTabsIntent.Builder(mCustomTabsSession).build();
        customTabsIntent.intent.setPackage(ClientConstants.CHROME_PACKAGE);
        customTabsIntent.intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        customTabsIntent.intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        mAuthorizeOrSignOutRedirectReceived = false;
        customTabsIntent.launchUrl(mContext, uri);
    }

    public boolean handleRedirect(final Uri uri) {
        if (uri == null) {
            return false;
        }
        final String signInRedirectUriString = mStore.get(SIGN_IN_REDIRECT_URI_KEY);
        final String signOutRedirectUriString = mStore.get(SIGN_OUT_REDIRECT_URI_KEY);
        if (signInRedirectUriString != null) {
            Uri signInRedirectUri = Uri.parse(signInRedirectUriString);
            if (uri.getScheme().equals(signInRedirectUri.getScheme())
                    && uri.getAuthority().equals(signInRedirectUri.getAuthority())
                    && uri.getPath().equals(signInRedirectUri.getPath())
                    && uri.getQueryParameterNames().containsAll(signInRedirectUri.getQueryParameterNames())) {
                final String code = uri.getQueryParameter("code");
                final String state = uri.getQueryParameter("state");
                if (!mStore.get("state").equals(state)) {
                    return false;
                }
                mError = uri.getQueryParameter("error");
                mErrorDescription = uri.getQueryParameter("error_description");
                mErrorUriString = uri.getQueryParameter("error_uri");
                mAuthorizeOrSignOutRedirectReceived = true;

                if (mError != null) {
                    if (mAuthorizeCallback != null) {
                        mAuthorizeCallback.onError(new OAuth2Exception("Authorization call failed" +
                                " with response from authorization server", mError, mErrorDescription
                                , mErrorUriString));
                        mAuthorizeCallback = null;
                    }
                    return true;
                } else if (code != null) {
                    if (mAuthorizeCallback != null) {
                        final AuthorizeResponse result = new AuthorizeResponse();
                        result.code = code;
                        result.responseUri = uri;
                        mAuthorizeCallback.onResult(result);
                        mAuthorizeCallback = null;
                    }
                    return true;
                }
                return false;
            }
        }
        if (signOutRedirectUriString != null) {
            Uri signOutRedirectUri = Uri.parse(signOutRedirectUriString);
            if (uri.getScheme().equals(signOutRedirectUri.getScheme())
                    && uri.getAuthority().equals(signOutRedirectUri.getAuthority())
                    && uri.getPath().equals(signOutRedirectUri.getPath())
                    && uri.getQueryParameterNames().containsAll(signOutRedirectUri.getQueryParameterNames())) {
                mAuthorizeOrSignOutRedirectReceived = true;
                if (mSignOutCallback != null) {
                    mSignOutCallback.onResult(null);
                    mSignOutCallback = null;
                }
                return true;
            }
        }
        return false;
    }

    public void requestTokens(final Uri tokenUri,
                              final Map<String, String> headers,
                              final Map<String, String> body,
                              final String code,
                              final Callback<OAuth2Tokens> callback) {
        final String proofKey = mStore.get("proofKey");

        if (proofKey == null && !mPKCEMode.equals(PKCEMode.NONE)) {
            // The state value is unknown, exit.
            callback.onError(new Exception("Proof key could not be found from current session."));
        }

        // Make http POST call
        try {
            if (body.get("client_id") == null) {
                throw new IllegalArgumentException("The token exchange must contain a client_id");
            }
            if (body.get("redirect_uri") == null) {
                throw new IllegalArgumentException("The token exchange must contain a " +
                        "redirect_uri");
            }
            if (body.get("code") == null) {
                if (code == null) {
                    throw new IllegalArgumentException("The token exchange must contain a code");
                }
                body.put("code", code);
            }
            if (body.get("code_verifier") == null) {
                if (proofKey == null) {
                    throw new IllegalStateException("The token exchange must contain a code verifier");
                }
                body.put("code_verifier", proofKey);
            }
            if (body.get(GRANT_TYPE) == null) {
                body.put(GRANT_TYPE, GrantTypes.AUTHORIZATION_CODE.toString());
            }
            mStore.set(TOKEN_URI_KEY, tokenUri.toString());

            String response = HTTPUtil.httpPost(new URL(tokenUri.toString()), headers, body);
            final OAuth2Tokens tokens = HTTPUtil.parseHttpResponse(response);
            mStore.set(tokens);
            callback.onResult(tokens);
        } catch (final Exception e) {
            callback.onError(new Exception("Failed to exchange code for tokens", e));
        }
    }

    public void refresh(final Uri tokenUri, final Map<String, String> headers, final Map<String,
            String> body, final Callback<OAuth2Tokens> callback) {
        final String refreshToken = mStore.get(TokenResponseFields.REFRESH_TOKEN.toString());
        if (refreshToken == null) {
            callback.onError(new IllegalStateException("Refresh called without refresh token " +
                    "available"));
        }

        try {
            if (body.get(GRANT_TYPE) == null) {
                body.put(GRANT_TYPE, GrantTypes.REFRESH_TOKEN.toString());
            }
            if (body.get("refresh_token") == null) {
                if (refreshToken == null) {
                    throw new IllegalArgumentException("The refresh flow must contain a " +
                            "refresh_token");
                }
                body.put("refresh_token", refreshToken);
            }
            final String response = HTTPUtil.httpPost(new URL(tokenUri.toString()), headers, body);
            final OAuth2Tokens tokens = HTTPUtil.parseHttpResponse(response);
            mStore.set(tokens);
            callback.onResult(tokens);
        } catch (Exception e) {
            callback.onError(new Exception("Failed to refresh tokens with service", e));
        }
    }

    public void getTokens(final Callback<OAuth2Tokens> callback) {
        try {
            final OAuth2Tokens tokens = mStore.getTokens();
            final String tokenUriString;
            // If expiry was given, check expiry
            if (tokens.expiresIn != null) {
                final long timeToExpiry = tokens.createDate + tokens.expiresIn - System.currentTimeMillis();
                if (timeToExpiry < REFRESH_THRESHOLD) {
                    // If refresh mechanism given, refresh
                    if (tokens.refreshToken != null && (tokenUriString = mStore.get(TOKEN_URI_KEY)) != null) {
                        refresh(Uri.parse(tokenUriString), new HashMap<String, String>(), new HashMap<String, String>(), callback);
                    } else {
                        callback.onError(new Exception("No cached tokens available, refresh not available."));
                    }
                }
            }
            callback.onResult(tokens);
        } catch (Exception e) {
            callback.onError(e);
        }
    }

}

class OAuth2ClientStore {
    private final AWSKeyValueStore mKeyValueStore;
    ReadWriteLock mReadWriteLock = new ReentrantReadWriteLock();

    OAuth2ClientStore(OAuth2Client client) {
        mKeyValueStore = new AWSKeyValueStore(client.mContext, OAuth2Client.SHARED_PREFERENCES_KEY, client.mIsPersistenceEnabled);
    }

    void set(final OAuth2Tokens tokens) {
        try {
            mReadWriteLock.writeLock().lock();
            mKeyValueStore.put(TokenResponseFields.ACCESS_TOKEN.toString(), tokens.getAccessToken());
            mKeyValueStore.put(TokenResponseFields.ID_TOKEN.toString(), tokens.getIdToken());
            mKeyValueStore.put(TokenResponseFields.REFRESH_TOKEN.toString(), tokens.getRefreshToken());
            mKeyValueStore.put(TokenResponseFields.EXPIRES_IN.toString(), tokens.getExpiresIn() == null ? null :
                    tokens.getExpiresIn().toString());
            mKeyValueStore.put(CREATE_DATE, tokens.getCreateDate().toString());
        } finally {
            mReadWriteLock.writeLock().unlock();
        }
    }

    /**
     * Tokens are retrieved
     * @return
     */
    OAuth2Tokens getTokens() {
        try {
            mReadWriteLock.readLock().lock();
            final String expires_in = mKeyValueStore.get(TokenResponseFields.EXPIRES_IN.toString());
            final Long expiresIn = expires_in == null ? null : Long.decode(expires_in);
            return new OAuth2Tokens(
                    mKeyValueStore.get(TokenResponseFields.ACCESS_TOKEN.toString()),
                    mKeyValueStore.get(TokenResponseFields.ID_TOKEN.toString()),
                    mKeyValueStore.get(TokenResponseFields.REFRESH_TOKEN.toString()),
                    mKeyValueStore.get(TokenResponseFields.TOKEN_TYPE.toString()),
                    expiresIn,
                    Long.valueOf(mKeyValueStore.get(CREATE_DATE)),
                    mKeyValueStore.get(TokenResponseFields.SCOPES.toString()));
        } finally {
            mReadWriteLock.readLock().unlock();
        }
    }

    Map<String, String> get(final String... keys) {
        try {
            mReadWriteLock.readLock().lock();
            HashMap<String, String> attributes = new HashMap<String, String>();
            for (String key : keys) {
                attributes.put(key, mKeyValueStore.get(key));
            }
            return attributes;
        } finally {
            mReadWriteLock.readLock().unlock();
        }
    }

    String get(final String key) {
        try {
            mReadWriteLock.readLock().lock();
            return mKeyValueStore.get(key);
        } finally {
            mReadWriteLock.readLock().unlock();
        }
    }

    void set(final Map<String, String> attributes) {
        try {
            mReadWriteLock.writeLock().lock();
            for (String key : attributes.keySet()) {
                mKeyValueStore.put(key, attributes.get(key));
            }
        } finally {
            mReadWriteLock.writeLock().unlock();
        }
    }

    void set(final String key, final String value) {
        try {
            mReadWriteLock.writeLock().lock();
            mKeyValueStore.put(key, value);
        } finally {
            mReadWriteLock.writeLock().unlock();
        }
    }

    void clear() {
        mKeyValueStore.clear();
    }

    public void setPersistenceEnabled(boolean isPersistenceEnabled) {
        mKeyValueStore.setPersistenceEnabled(isPersistenceEnabled);
    }
}

class HTTPUtil {
    public static String httpPost(final URL uri, final Map<String, String> headerParams,
                                  final Map<String, String> bodyParams) throws Exception {
        if (uri == null || bodyParams == null || bodyParams.size() < 1) {
            throw new AuthClientException("Invalid http request parameters");
        }

        final HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uri.openConnection();
        DataOutputStream httpOutputStream = null;
        BufferedReader br = null;
        try {
            // Request header
            httpsURLConnection.setRequestMethod(ClientConstants.HTTP_REQUEST_TYPE_POST);
            httpsURLConnection.setDoOutput(true);
            for (Map.Entry<String, String> param : headerParams.entrySet()) {
                httpsURLConnection.addRequestProperty(param.getKey(), param.getValue());
            }
            httpsURLConnection.addRequestProperty("x-amz-user-agent", AWSMobileClient.USER_AGENT);
            httpsURLConnection.setRequestProperty("User-Agent",
                    httpsURLConnection.getRequestProperty("User-Agent") + " " + AWSMobileClient.USER_AGENT);

            // Request body
            StringBuilder reqBuilder = new StringBuilder();
            int index = bodyParams.size();
            for (Map.Entry<String, String> param : bodyParams.entrySet()) {
                reqBuilder.append(URLEncoder.encode(param.getKey(), "UTF-8")).append('=').append(URLEncoder.encode(param.getValue(), "UTF-8"));
                if (index-- > 1) {
                    reqBuilder.append('&');
                }
            }
            String requestBody = reqBuilder.toString();

            httpOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());

            httpOutputStream.writeBytes(requestBody);
            httpOutputStream.flush();

            // Parse response
            Map<String, List<String>> respHeaders = httpsURLConnection.getHeaderFields();

            int responseCode = httpsURLConnection.getResponseCode();

            if (responseCode >= HttpURLConnection.HTTP_OK &&
                    responseCode < HttpURLConnection.HTTP_INTERNAL_ERROR) {

                // Return response from the http call
                InputStream httpDataStream;
                if (responseCode < HttpURLConnection.HTTP_BAD_REQUEST) {
                    httpDataStream = httpsURLConnection.getInputStream();
                } else {
                    httpDataStream = httpsURLConnection.getErrorStream();
                }
                br = new BufferedReader(new InputStreamReader(httpDataStream));

                String line;
                StringBuilder responseOutput = new StringBuilder();
                while ((line = br.readLine()) != null) {
                    responseOutput.append(line);
                }

                return responseOutput.toString();
            } else {
                // Throw a Cognito Client Exception
                throw new AuthServiceException(httpsURLConnection.getResponseMessage());
            }

        } catch (final Exception e) {
            throw e;
        } finally {
            if (httpOutputStream != null) {
                httpOutputStream.close();
            }
            if (br != null) {
                br.close();
            }
        }
    }

    public static OAuth2Tokens parseHttpResponse(String responseStr) throws JSONException {
        if (responseStr == null || responseStr.isEmpty()) {
            throw new IllegalArgumentException(
                    "Invalid (null) response from Amazon Cognito Auth endpoint");
        }

        JSONObject responseJson = new JSONObject(responseStr);

        final String error = responseJson.optString(TokenResponseFields.ERROR.toString(), null);
        final String errorDescription = responseJson.optString(TokenResponseFields.ERROR_DESCRIPTION.toString(), null);
        final String errorUri = responseJson.optString(TokenResponseFields.ERROR_URI.toString(), null);

        if (error != null) {
            throw new OAuth2Exception("Failed to exchange code for tokens", error,
                    errorDescription, errorUri);
        }

        final String expires_in = responseJson.optString(TokenResponseFields.EXPIRES_IN.toString());
        Long expiresIn = null;
        if (!StringUtils.isBlank(expires_in)) {
            expiresIn = Long.parseLong(expires_in);
        }
        return new OAuth2Tokens(
                responseJson.getString(TokenResponseFields.ACCESS_TOKEN.toString()),
                responseJson.optString(TokenResponseFields.ID_TOKEN.toString(), null), // Not part of OAuth2.0 but common (OIDC)
                responseJson.optString(TokenResponseFields.REFRESH_TOKEN.toString(), null),
                responseJson.getString(TokenResponseFields.TOKEN_TYPE.toString()),
                expiresIn,
                System.currentTimeMillis() / 1000L,
                responseJson.optString(SCOPES, null)
        );
    }
}

class OAuth2Constants {
    public static final String SCOPES = "scopes";
    public static final String GRANT_TYPE = "grant_type";

    enum TokenResponseFields {
        ACCESS_TOKEN("access_token"),
        ID_TOKEN("id_token"),
        REFRESH_TOKEN("refresh_token"),
        TOKEN_TYPE("token_type"),
        EXPIRES_IN("expires_in"),
        SCOPES("scopes"),
        ERROR("error"),
        ERROR_DESCRIPTION("error_description"),
        ERROR_URI("error_uri"),
        ;

        private final String value;

        TokenResponseFields(final String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    enum TokenRequestFields {
        ACCESS_TOKEN("access_token"),
        ID_TOKEN("id_token"),
        ;

        private final String value;

        TokenRequestFields(final String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    enum GrantTypes {
        AUTHORIZATION_CODE("authorization_code"),
        REFRESH_TOKEN("refresh_token"),
        ;

        private final String value;

        GrantTypes(final String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

}