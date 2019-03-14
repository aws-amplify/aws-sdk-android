/*
 * Copyright 2013-2017 Amazon.com, Inc. or its affiliates.
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

package com.amazonaws.mobileconnectors.cognitoauth.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.amazonaws.internal.keyvaluestore.AWSKeyValueStore;
import com.amazonaws.mobileconnectors.cognitoauth.tokens.AccessToken;
import com.amazonaws.mobileconnectors.cognitoauth.tokens.IdToken;
import com.amazonaws.mobileconnectors.cognitoauth.tokens.RefreshToken;
import com.amazonaws.mobileconnectors.cognitoauth.AuthUserSession;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/**
 * Handles tokens caching in the device local storage.
 * <p>
 *     Uses SharedPreferences in Android for local storage.
 * </p>
 * Uses {@link SharedPreferences} to cache tokens.
 */
public final class LocalDataManager {
    final static String TAG = LocalDataManager.class.getSimpleName();

    /**
     * Returns the last authenticated user on this device.
     * @param context Required, Android application {@link Context}.
     * @param clientId Required, User Pool App Domain.
     * @return the last authenticated user on this device.
     */
    public static String getLastAuthUser(final Context context, final String clientId) {
        if (context == null || clientId == null) {
            throw new InvalidParameterException(
                    "Application context, and application domain cannot be null");
        }

        try {
            SharedPreferences localCache
                    = context.getSharedPreferences(ClientConstants.APP_LOCAL_CACHE, Context.MODE_PRIVATE);
            String lastAuthUserKey = String.format(Locale.US, "%s.%s.%s",
                    ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, clientId, ClientConstants.APP_LAST_AUTH_USER);
            return localCache.getString(lastAuthUserKey, null);
        } catch (Exception e) {
            Log.e(TAG, "Failed to read from SharedPreferences", e);
        }
        return null;
    }

    /**
     * Returns the last authenticated user on this device.
     * @param context Required, Android application {@link Context}.
     * @param clientId Required, User Pool App Domain.
     * @return the last authenticated user on this device.
     */
    public static String getLastAuthUser(AWSKeyValueStore awsKeyValueStore, final Context context, final String clientId) {
        if (context == null || clientId == null) {
            throw new InvalidParameterException(
                    "Application context, and application domain cannot be null");
        }

        try {
            String lastAuthUserKey = String.format(Locale.US, "%s.%s.%s",
                    ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, clientId, ClientConstants.APP_LAST_AUTH_USER);
            return awsKeyValueStore.get(lastAuthUserKey);
        } catch (Exception e) {
            Log.e(TAG, "Failed to read from SharedPreferences", e);
        }
        return null;
    }

    /**
     * Returns cached tokens for a user as a {@link AuthUserSession}.
     * @param context Required: The host application {@link Context}.
     * @param clientId Required: Cognito App/Client Id.
     * @param username Required: The username.
     * @return {@link AuthUserSession}.
     */
    public static AuthUserSession getCachedSession(final Context context,
                                                   final String clientId,
                                                   final String username,
                                                   final Set<String> scopes) {
        AuthUserSession session = new AuthUserSession(null, null, null);
        if (username != null) {
            if (context == null || clientId == null || clientId.isEmpty()) {
                throw new InvalidParameterException(
                        "Application context, and application domain cannot be null");
            }

            String cachedIdTokenKey = String.format(Locale.US, "%s.%s.%s.%s",
                    ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, clientId, username, ClientConstants.TOKEN_TYPE_ID);
            String cachedAccessTokenKey = String.format(Locale.US, "%s.%s.%s.%s",
                    ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, clientId, username, ClientConstants.TOKEN_TYPE_ACCESS);
            String cachedRefreshTokenKey = String.format(Locale.US, "%s.%s.%s.%s",
                    ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, clientId, username, ClientConstants.TOKEN_TYPE_REFRESH);
            String cachedTokenScopes = String.format(Locale.US, "%s.%s.%s.%s",
                    ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, clientId, username, ClientConstants.TOKEN_KEY_SCOPES);

            try {
                SharedPreferences localCache =
                        context.getSharedPreferences(ClientConstants.APP_LOCAL_CACHE, Context.MODE_PRIVATE);
                Set<String> cachedScopes = localCache.getStringSet(cachedTokenScopes, new HashSet<String>());

                // Check if the requested scopes match scopes of the cached tokens.
                if (!cachedScopes.equals(scopes)) {
                    return session;
                }

                // Scopes match, return the cached tokens
                IdToken idToken =
                        new IdToken(localCache.getString(cachedIdTokenKey, null));

                AccessToken accessToken =
                        new AccessToken(localCache.getString(cachedAccessTokenKey, null));

                RefreshToken refreshToken =
                        new RefreshToken(localCache.getString(cachedRefreshTokenKey, null));

                session = new AuthUserSession(idToken, accessToken, refreshToken);

            } catch (Exception e) {
                Log.e(TAG, "Failed to read from SharedPreferences", e);
            }
        }
        return session;
    }

    /**
     * Returns cached tokens for a user as a {@link AuthUserSession}.
     * @param context Required: The host application {@link Context}.
     * @param clientId Required: Cognito App/Client Id.
     * @param username Required: The username.
     * @return {@link AuthUserSession}.
     */
    public static AuthUserSession getCachedSession(final AWSKeyValueStore awsKeyValueStore,
                                                   final Context context,
                                                   final String clientId,
                                                   final String username,
                                                   final Set<String> scopes) {
        AuthUserSession session = new AuthUserSession(null, null, null);
        if (username != null) {
            if (context == null || clientId == null || clientId.isEmpty()) {
                throw new InvalidParameterException(
                        "Application context, and application domain cannot be null");
            }

            String cachedIdTokenKey = String.format(Locale.US, "%s.%s.%s.%s",
                    ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, clientId, username, ClientConstants.TOKEN_TYPE_ID);
            String cachedAccessTokenKey = String.format(Locale.US, "%s.%s.%s.%s",
                    ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, clientId, username, ClientConstants.TOKEN_TYPE_ACCESS);
            String cachedRefreshTokenKey = String.format(Locale.US, "%s.%s.%s.%s",
                    ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, clientId, username, ClientConstants.TOKEN_TYPE_REFRESH);
            String cachedTokenScopes = String.format(Locale.US, "%s.%s.%s.%s",
                    ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, clientId, username, ClientConstants.TOKEN_KEY_SCOPES);

            try {
                String cachedSetString = awsKeyValueStore.get(cachedTokenScopes);
                Set<String> cachedScopes = setFromString(cachedSetString);

                // Check if the requested scopes match scopes of the cached tokens.
                if (!cachedScopes.equals(scopes)) {
                    return session;
                }

                // Scopes match, return the cached tokens
                IdToken idToken =
                        new IdToken(awsKeyValueStore.get(cachedIdTokenKey));

                AccessToken accessToken =
                        new AccessToken(awsKeyValueStore.get(cachedAccessTokenKey));

                RefreshToken refreshToken =
                        new RefreshToken(awsKeyValueStore.get(cachedRefreshTokenKey));

                session = new AuthUserSession(idToken, accessToken, refreshToken);
            } catch (Exception e) {
                Log.e(TAG, "Failed to read from SharedPreferences", e);
            }
        }
        return session;
    }

    /**
     * Caches tokens for a user.
     * @param context Required: Android application {@link Context}.
     * @param clientId Required: Cognito App/Client Id.
     * @param username Required: The username.
     * @param session Required: User tokens as {@link AuthUserSession}.
     */
    public static void cacheSession(final Context context,
                                    final String clientId,
                                    final String username,
                                    final AuthUserSession session,
                                    final Set<String> scopes) {
        if (context == null || clientId == null || clientId.isEmpty() || username == null || session == null) {
            Log.e (TAG, "Application context, and application domain cannot be null");
            return;
        }

        String cachedIdTokenKey = String.format(Locale.US, "%s.%s.%s.%s",
                ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, clientId, username, ClientConstants.TOKEN_TYPE_ID);
        String cachedAccessTokenKey = String.format(Locale.US, "%s.%s.%s.%s",
                ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, clientId, username, ClientConstants.TOKEN_TYPE_ACCESS);
        String cachedRefreshTokenKey = String.format(Locale.US, "%s.%s.%s.%s",
                ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, clientId, username, ClientConstants.TOKEN_TYPE_REFRESH);
        String cachedTokenTypeKey = String.format(Locale.US, "%s.%s.%s.%s",
                ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, clientId, username, ClientConstants.TOKEN_KEY_TYPE);
        String cachedTokenScopes = String.format(Locale.US, "%s.%s.%s.%s",
                ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, clientId, username, ClientConstants.TOKEN_KEY_SCOPES);
        String lastAuthUserKey = String.format(Locale.US, "%s.%s.%s",
                ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, clientId, ClientConstants.APP_LAST_AUTH_USER);

        try {
            SharedPreferences.Editor localCacheEditor =
                    context.getSharedPreferences(ClientConstants.APP_LOCAL_CACHE, Context.MODE_PRIVATE).edit();
            localCacheEditor.putString(cachedTokenTypeKey, ClientConstants.SESSION_TYPE_JWT);
            localCacheEditor.putString(cachedIdTokenKey, session.getIdToken().getJWTToken());
            localCacheEditor.putString(cachedAccessTokenKey, session.getAccessToken().getJWTToken());
            localCacheEditor.putString(cachedRefreshTokenKey, session.getRefreshToken().getToken());
            if (scopes != null && scopes.size() > 0) {
                localCacheEditor.putStringSet(cachedTokenScopes, scopes);
            }
            localCacheEditor.putString(lastAuthUserKey, username).apply();
        } catch (Exception e) {
            Log.e(TAG, "Failed while writing to SharedPreferences", e);
        }
    }

    /**
     * Caches tokens for a user.
     * @param context Required: Android application {@link Context}.
     * @param clientId Required: Cognito App/Client Id.
     * @param username Required: The username.
     * @param session Required: User tokens as {@link AuthUserSession}.
     */
    public static void cacheSession(final AWSKeyValueStore awsKeyValueStore,
                                    final Context context,
                                    final String clientId,
                                    final String username,
                                    final AuthUserSession session,
                                    final Set<String> scopes) {
        if (context == null || clientId == null || clientId.isEmpty() || username == null || session == null) {
            Log.e (TAG, "Application context, and application domain cannot be null");
            return;
        }

        String cachedIdTokenKey = String.format(Locale.US, "%s.%s.%s.%s",
                ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, clientId, username, ClientConstants.TOKEN_TYPE_ID);
        String cachedAccessTokenKey = String.format(Locale.US, "%s.%s.%s.%s",
                ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, clientId, username, ClientConstants.TOKEN_TYPE_ACCESS);
        String cachedRefreshTokenKey = String.format(Locale.US, "%s.%s.%s.%s",
                ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, clientId, username, ClientConstants.TOKEN_TYPE_REFRESH);
        String cachedTokenTypeKey = String.format(Locale.US, "%s.%s.%s.%s",
                ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, clientId, username, ClientConstants.TOKEN_KEY_TYPE);
        String cachedTokenScopes = String.format(Locale.US, "%s.%s.%s.%s",
                ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, clientId, username, ClientConstants.TOKEN_KEY_SCOPES);
        String lastAuthUserKey = String.format(Locale.US, "%s.%s.%s",
                ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, clientId, ClientConstants.APP_LAST_AUTH_USER);

        try {
            awsKeyValueStore.put(cachedTokenTypeKey, ClientConstants.SESSION_TYPE_JWT);
            awsKeyValueStore.put(cachedIdTokenKey, session.getIdToken().getJWTToken());
            awsKeyValueStore.put(cachedAccessTokenKey, session.getAccessToken().getJWTToken());
            awsKeyValueStore.put(cachedRefreshTokenKey, session.getRefreshToken().getToken());
            if (scopes != null && scopes.size() > 0) {
                awsKeyValueStore.put(cachedTokenScopes, setToString(scopes));
            }
            awsKeyValueStore.put(lastAuthUserKey, username);
        } catch (Exception e) {
            Log.e(TAG, "Failed while writing to SharedPreferences", e);
        }
    }

    /**
     * Caches proof key.
     * @param context Required: The host application {@link Context}.
     * @param key Required: The mapped key.
     * @param proofKey Required: The generated proof-key for token exchange.
     * @param scopes Required: Scopes for the current token request.
     */
    public static void cacheState(final Context context, final String key, final String proofKey, final Set<String> scopes) {
        try {
            SharedPreferences.Editor localCacheEditor =
                    context.getSharedPreferences(ClientConstants.APP_LOCAL_CACHE, Context.MODE_PRIVATE).edit();

            localCacheEditor.putString(key+ ClientConstants.DOMAIN_QUERY_PARAM_CODE_CHALLENGE, proofKey);
            localCacheEditor.putStringSet(key+ ClientConstants.DOMAIN_QUERY_PARAM_SCOPES, scopes).apply();
        } catch (Exception e) {
            Log.e(TAG, "Failed while writing to SharedPreferences", e);
        }
    }

    /**
     * Caches proof key.
     * @param context Required: The host application {@link Context}.
     * @param key Required: The mapped key.
     * @param proofKey Required: The generated proof-key for token exchange.
     * @param scopes Required: Scopes for the current token request.
     */
    public static void cacheState(final AWSKeyValueStore awsKeyValueStore,
                                  final Context context,
                                  final String key,
                                  final String proofKey,
                                  final Set<String> scopes) {
        try {
            awsKeyValueStore.put(key + ClientConstants.DOMAIN_QUERY_PARAM_CODE_CHALLENGE, proofKey);
            awsKeyValueStore.put(key + ClientConstants.DOMAIN_QUERY_PARAM_SCOPES, setToString(scopes));
        } catch (Exception e) {
            Log.e(TAG, "Failed while writing to SharedPreferences", e);
        }
    }

    /**
     * Returns proof-key for current token request.
     * @param context Required: The host application {@link Context}.
     * @param key Required: The mapped key.
     * @return Cached proof-key.
     */
    public static String getCachedProofKey(final Context context, final String key) {
        try {
            SharedPreferences localCache =
                    context.getSharedPreferences(ClientConstants.APP_LOCAL_CACHE, 0);
            return localCache.getString(key+ ClientConstants.DOMAIN_QUERY_PARAM_CODE_CHALLENGE, null);
        } catch (Exception e) {
            Log.e(TAG, "Failed to read from SharedPreferences", e);
        }
        return null;
    }

    /**
     * Returns proof-key for current token request.
     * @param context Required: The host application {@link Context}.
     * @param key Required: The mapped key.
     * @return Cached proof-key.
     */
    public static String getCachedProofKey(final AWSKeyValueStore awsKeyValueStore,
                                           final Context context,
                                           final String key) {
        try {
            return awsKeyValueStore.get(key + ClientConstants.DOMAIN_QUERY_PARAM_CODE_CHALLENGE);
        } catch (Exception e) {
            Log.e(TAG, "Failed to read from SharedPreferences", e);
        }
        return null;
    }

    /**
     * Returns scopes for a request.
     * @param context Required: The host application {@link Context}.
     * @param key Required: The mapped key.
     * @return Cached scopes.
     */
    public static Set<String> getCachedScopes(final Context context, final String key) {
        Set<String> cachedSet = new HashSet<String>();
        try {
            SharedPreferences localCache =
                    context.getSharedPreferences(ClientConstants.APP_LOCAL_CACHE, 0);
            return localCache.getStringSet(key+ ClientConstants.DOMAIN_QUERY_PARAM_SCOPES, cachedSet);
        } catch (Exception e) {
            Log.e(TAG, "Failed to read from SharedPreferences", e);
        }
        return cachedSet;
    }


    /**
     * Returns scopes for a request.
     * @param context Required: The host application {@link Context}.
     * @param key Required: The mapped key.
     * @return Cached scopes.
     */
    public static Set<String> getCachedScopes(final AWSKeyValueStore awsKeyValueStore,
                                              final Context context,
                                              final String key) {
        Set<String> cachedSet = new HashSet<String>();
        try {
            String cachedSetString = awsKeyValueStore.get(key + ClientConstants.DOMAIN_QUERY_PARAM_SCOPES);
            return setFromString(cachedSetString);
        } catch (Exception e) {
            Log.e(TAG, "Failed to read from SharedPreferences", e);
        }
        return cachedSet;
    }

    /**
     * Clears all cached tokens for a user.
     * @param context Required: The host application {@link Context}.
     * @param clientId Required: Cognito App/Client Id.
     * @param username Required: The username.
     */
    public static void clearCache(final Context context, final String clientId, final String username) {
        if (username == null) {
            return;
        }

        String cachedIdTokenKey = String.format(Locale.US, "%s.%s.%s.%s",
                ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, clientId, username, ClientConstants.TOKEN_TYPE_ID);
        String cachedAccessTokenKey = String.format(Locale.US, "%s.%s.%s.%s",
                ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, clientId, username, ClientConstants.TOKEN_TYPE_ACCESS);
        String cachedRefreshTokenKey = String.format(Locale.US, "%s.%s.%s.%s",
                ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, clientId, username, ClientConstants.TOKEN_TYPE_REFRESH);
        String cachedTokenTypeKey = String.format(Locale.US, "%s.%s.%s.%s",
                ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, clientId, username, ClientConstants.TOKEN_KEY_TYPE);
        String cachedTokenScopes = String.format(Locale.US, "%s.%s.%s.%s",
                ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, clientId, username, ClientConstants.TOKEN_KEY_SCOPES);
        String lastAuthUserKey = String.format(Locale.US, "%s.%s.%s",
                ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, clientId, ClientConstants.APP_LAST_AUTH_USER);

        try {
            SharedPreferences.Editor localCacheEditor =
                    context.getSharedPreferences(ClientConstants.APP_LOCAL_CACHE, Context.MODE_PRIVATE).edit();
            localCacheEditor.remove(cachedIdTokenKey);
            localCacheEditor.remove(cachedAccessTokenKey);
            localCacheEditor.remove(cachedRefreshTokenKey);
            localCacheEditor.remove(cachedTokenTypeKey);
            localCacheEditor.remove(cachedTokenScopes);
            localCacheEditor.remove(lastAuthUserKey).apply();
        } catch (Exception e) {
            Log.e(TAG, "Failed while writing to SharedPreferences", e);
        }
    }

    /**
     * Clears all cached tokens for a user.
     * @param context Required: The host application {@link Context}.
     * @param clientId Required: Cognito App/Client Id.
     * @param username Required: The username.
     */
    public static void clearCache(final AWSKeyValueStore awsKeyValueStore,
                                  final Context context,
                                  final String clientId,
                                  final String username) {
        if (username == null) {
            return;
        }

        String cachedIdTokenKey = String.format(Locale.US, "%s.%s.%s.%s",
                ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, clientId, username, ClientConstants.TOKEN_TYPE_ID);
        String cachedAccessTokenKey = String.format(Locale.US, "%s.%s.%s.%s",
                ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, clientId, username, ClientConstants.TOKEN_TYPE_ACCESS);
        String cachedRefreshTokenKey = String.format(Locale.US, "%s.%s.%s.%s",
                ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, clientId, username, ClientConstants.TOKEN_TYPE_REFRESH);
        String cachedTokenTypeKey = String.format(Locale.US, "%s.%s.%s.%s",
                ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, clientId, username, ClientConstants.TOKEN_KEY_TYPE);
        String cachedTokenScopes = String.format(Locale.US, "%s.%s.%s.%s",
                ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, clientId, username, ClientConstants.TOKEN_KEY_SCOPES);
        String lastAuthUserKey = String.format(Locale.US, "%s.%s.%s",
                ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, clientId, ClientConstants.APP_LAST_AUTH_USER);

        try {
            awsKeyValueStore.remove(cachedIdTokenKey);
            awsKeyValueStore.remove(cachedAccessTokenKey);
            awsKeyValueStore.remove(cachedRefreshTokenKey);
            awsKeyValueStore.remove(cachedTokenTypeKey);
            awsKeyValueStore.remove(cachedTokenScopes);
            awsKeyValueStore.remove(lastAuthUserKey);
        } catch (Exception e) {
            Log.e(TAG, "Failed while writing to SharedPreferences", e);
        }
    }

    /*
     * Clears all cached tokens for everyone
     * @param context Required: The host application {@link Context}.
     */
    public static void clearCacheAll(final AWSKeyValueStore awsKeyValueStore) {
        try {
            awsKeyValueStore.clear();
        } catch (Exception e) {
            Log.e(TAG, "Failed while clearing data from SharedPreferences", e);
        }
    }

    static String setToString(Set<String> stringSet) {
        StringBuilder strBuilder = new StringBuilder();
        int index = 0;
        for (String str: stringSet) {
            strBuilder.append(str);
            if (index++ < stringSet.size() - 1) {
                strBuilder.append(",");
            }
        }
        return strBuilder.toString();
    }

    static Set<String> setFromString(String str) {
        String[] stringArray = str.split(",");
        return new HashSet<String>(Arrays.asList(stringArray));
    }
}
