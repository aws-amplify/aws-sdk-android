/*
 *  Copyright 2013-2019 Amazon.com,
 *  Inc. or its affiliates. All Rights Reserved.
 *
 *  Licensed under the Amazon Software License (the "License").
 *  You may not use this file except in compliance with the
 *  License. A copy of the License is located at
 *
 *      http://aws.amazon.com/asl/
 *
 *  or in the "license" file accompanying this file. This file is
 *  distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 *  CONDITIONS OF ANY KIND, express or implied. See the License
 *  for the specific language governing permissions and
 *  limitations under the License.
 */

package com.amazonaws.mobileconnectors.cognitoidentityprovider;

import android.content.Context;
import android.os.Handler;

import androidx.annotation.VisibleForTesting;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AnonymousAWSCredentials;
import com.amazonaws.internal.keyvaluestore.AWSKeyValueStore;
import com.amazonaws.cognito.clientcontext.data.UserContextDataProvider;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.mobile.config.AWSConfiguration;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.AuthenticationHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.SignUpHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.util.CognitoDeviceHelper;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.util.CognitoPinpointSharedContext;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.util.CognitoSecretHash;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider;
import com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProviderClient;
import com.amazonaws.services.cognitoidentityprovider.model.AnalyticsMetadataType;
import com.amazonaws.services.cognitoidentityprovider.model.AttributeType;
import com.amazonaws.services.cognitoidentityprovider.model.SignUpRequest;
import com.amazonaws.services.cognitoidentityprovider.model.SignUpResult;
import com.amazonaws.services.cognitoidentityprovider.model.UserContextDataType;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * This represents a user-pool in a Cognito identity provider account. The user-pools are called as
 * <b>Cognito User Identity Pool</b> or <b>User Identity Pool</b> or <b>User Pool</b>. All of these
 * terms represent the same entity, which is a pool of users in your account.
 * <p>
 *     A user-pool can have these:
 *
 *     1) User pool ID, {@code userPoolId}. This is an unique identifier for your user pool. This is
 *     a required parameter to use the SDK.
 *
 *     2) Client identifier, {@code clientId}. This is generated for a user pool and each user pool
 *     can have several of these. A client identifier will associated with one, and only one, user
 *     pool. This is required to use the SDK. A client identifier can have one or no client secrets.
 *
 *     3) Client secret, {@code clientSecret}. This is generated for a Client identified. A client
 *     identifier may have a client secret, it is not necessary to generate a client secret for all
 *     client identifiers. However if a client identifier has a client secret then this client secret
 *     has to be used, along with the client identifier, in the SDK.
 * </p>
 *
 * On a user-pool new user's can sign-up and create new {@link CognitoUser}.
 */
public class CognitoUserPool {

    private static final Log logger = LogFactory.getLog(CognitoUserPool.class);

    private static final int USER_POOL_ID_MAX_LENGTH = 55;
    private static final String USER_POOL_ID_PATTERN = "^[\\w-]+_[0-9a-zA-Z]+$";

    /**
     * Cognito Your Identity Pool ID
     */
    private final String userPoolId;

    /**
     * Client ID created for your pool {@code userPoolId}.
     */
    private final String clientId;

    /**
     * Client secret generated for this {@code clientId}, this may be {@code null} if a secret is not
     * generated for the {@code clientId}.
     */
    private final String clientSecret;

    /**
     * Application context.
     */
    private final Context context;

    /**
     * CIP low-level client.
     */
    private AmazonCognitoIdentityProvider client;

    /**
     * Calculated with {@code userId}, {@code clientId} and {@code clientSecret}
     */
    private String secretHash;

    /**
     * Pinpoint Endpoint Id
     */
    private String pinpointEndpointId;

    /**
     * This flag indicates if the data collection is allowed. This is enabled by default.
     */
    private boolean advancedSecurityDataCollectionFlag = true;

    /**
     * This flag indicates if the tokens are being cached on the device in SharedPreferences.
     * This is enabled by default.
     */
    private boolean isPersistenceEnabled = true;

    /**
     * This is the key of the namespace in SharedPreferences where the tokens are being cached.
     */
    private static final String DEFAULT_SHARED_PREFERENCES_NAME = "CognitoIdentityProviderCache";

    /**
     * Reference to the store which manages secure storage of tokens.
     */
    AWSKeyValueStore awsKeyValueStore;

    /**
     * @deprecated use {@link CognitoUserPool#CognitoUserPool(Context, String, String, String, ClientConfiguration, Regions)}
     * <p>
     * Constructs a user-pool with a developer specified {@link ClientConfiguration} and default AWS region {@link Regions}.
     * Region defaults to US-EAST-1.
     * </p>
     * @param context               REQUIRED: Android application context
     * @param userPoolId            REQUIRED: User-pool-Id of the user-pool
     * @param clientId              REQUIRED: Client-Id generated for this app and user-pool at the
     *                              Cognito Identity Provider developer console
     * @param clientSecret          REQUIRED: Client Secret generated for this app and user-pool at
     *                              the Cognito Identity Provider developer console
     * @param clientConfiguration   REQUIRED: The client configuration options controlling how this
     *                              client connects to Cognito Identity Provider Service (e.g. proxy settings,
     *                              retry counts, etc.).
     */
    @Deprecated()
    public CognitoUserPool(Context context, String userPoolId, String clientId, String clientSecret,
                           ClientConfiguration clientConfiguration) {
        this(context, userPoolId, clientId, clientSecret, clientConfiguration, Regions.US_EAST_1);
    }

    /**
     * @deprecated use {@link CognitoUserPool#CognitoUserPool(Context, String, String, String, ClientConfiguration, Regions)}
     * <p>
     * Constructs a user-pool with default {@link ClientConfiguration} and default AWS region {@link Regions}.
     * Region defaults to US-EAST-1.
     * </p>
     * @param context               REQUIRED: Android application context.
     * @param userPoolId            REQUIRED: User-pool-Id of the user-pool.
     * @param clientId              REQUIRED: Client-Id generated for this app and user-pool at the
     *                              Cognito Identity Provider developer console.
     * @param clientSecret          REQUIRED: Client Secret generated for this app and user-pool at
     *                              the Cognito Identity Provider developer console.
     */
    @Deprecated()
    public CognitoUserPool(Context context, String userPoolId, String clientId, String clientSecret) {
        this(context, userPoolId, clientId, clientSecret, new ClientConfiguration(), Regions.US_EAST_1);
    }

    /**
     * Constructs a user-pool with default {@link ClientConfiguration}.
     *
     * @param context               REQUIRED: Android application context.
     * @param awsConfiguration      REQUIRED: Holds the configuration read from awsconfiguration.json
     */
    public CognitoUserPool(Context context, AWSConfiguration awsConfiguration) {
        try {
            initialize(context);

            final JSONObject userPoolConfiguration = awsConfiguration.optJsonObject("CognitoUserPool");
            this.context = context;
            this.userPoolId = userPoolConfiguration.getString("PoolId");
            this.clientId = userPoolConfiguration.getString("AppClientId");
            this.clientSecret = userPoolConfiguration.optString("AppClientSecret");
            this.pinpointEndpointId = CognitoPinpointSharedContext.getPinpointEndpoint(context, userPoolConfiguration.optString("PinpointAppId"));

            final ClientConfiguration clientConfig = new ClientConfiguration();
            clientConfig.setUserAgent(awsConfiguration.getUserAgent());
            clientConfig.setUserAgentOverride(awsConfiguration.getUserAgentOverride());
            this.client = new AmazonCognitoIdentityProviderClient(new AnonymousAWSCredentials(), clientConfig);
            this.client.setRegion(com.amazonaws.regions.Region.getRegion(Regions.fromName(userPoolConfiguration.getString("Region"))));
        } catch (Exception e) {
            throw new IllegalArgumentException("Failed to read PoolId, AppClientId, "
                    + "AppClientSecret, or Region from AWSConfiguration please check your setup "
                    + "or awsconfiguration.json file", e);
        }
    }

    /**
     * Constructs a user-pool with default {@link ClientConfiguration}.
     *
     * @param context               REQUIRED: Android application context.
     * @param userPoolId            REQUIRED: User-pool-Id of the user-pool.
     * @param clientId              REQUIRED: Client-Id generated for this app and user-pool at the
     *                              Cognito Identity Provider developer console.
     * @param clientSecret          REQUIRED: Client Secret generated for this app and user-pool at
     *                              the Cognito Identity Provider developer console.
     * @param region                REQUIRED: AWS region {@link Regions}.
     */
    public CognitoUserPool(Context context, String userPoolId, String clientId, String clientSecret, Regions region) {
        this(context, userPoolId, clientId, clientSecret, new ClientConfiguration(), region);
    }
    
    /**
     * Constructs a user-pool with default {@link ClientConfiguration}.
     *
     * @param context               REQUIRED: Android application context.
     * @param userPoolId            REQUIRED: User-pool-Id of the user-pool.
     * @param clientId              REQUIRED: Client-Id generated for this app and user-pool at the
     *                              Cognito Identity Provider developer console.
     * @param clientSecret          REQUIRED: Client Secret generated for this app and user-pool at
     *                              the Cognito Identity Provider developer console.
     * @param region                REQUIRED: AWS region {@link Regions}.
     * @param pinpointAppId         REQUIRED: AWS Pinpoint App Id for analytics.
     */
    public CognitoUserPool(Context context, String userPoolId, String clientId, String clientSecret, Regions region, String pinpointAppId) {
        this(context, userPoolId, clientId, clientSecret, new ClientConfiguration(), region, pinpointAppId);
    }

    /**
     * Constructs a user-pool.
     *
     * @param context               REQUIRED: Android application context.
     * @param userPoolId            REQUIRED: User-pool-Id of the user-pool.
     * @param clientId              REQUIRED: Client-Id generated for this app and user-pool at the
     *                              Cognito Identity Provider developer console.
     * @param clientSecret          REQUIRED: Client Secret generated for this app and user-pool at
     *                              the Cognito Identity Provider developer console.
     * @param clientConfiguration   REQUIRED: The client configuration options controlling how this
     *                              client connects to Cognito Identity Provider Service (e.g. proxy settings,
     *                              retry counts, etc.).
     * @param region                REQUIRED: AWS region {@link Regions}.
     */
    public CognitoUserPool(Context context, String userPoolId, String clientId, String clientSecret, ClientConfiguration clientConfiguration, Regions region) {
        this(context, userPoolId, clientId, clientSecret, clientConfiguration, region, null);
    }
    
    /**
     * Constructs a user-pool with integrated Pinpoint analytics.
     *
     * @param context               REQUIRED: Android application context.
     * @param userPoolId            REQUIRED: User-pool-Id of the user-pool.
     * @param clientId              REQUIRED: Client-Id generated for this app and user-pool at the
     *                              Cognito Identity Provider developer console.
     * @param clientSecret          REQUIRED: Client Secret generated for this app and user-pool at
     *                              the Cognito Identity Provider developer console.
     * @param clientConfiguration   REQUIRED: The client configuration options controlling how this
     *                              client connects to Cognito Identity Provider Service (e.g. proxy settings,
     *                              retry counts, etc.).
     * @param region                REQUIRED: AWS region {@link Regions}.
     * @param pinpointAppId         REQUIRED: AWS Pinpoint App Id for analytics.
     */
    public CognitoUserPool(Context context, String userPoolId, String clientId, String clientSecret, ClientConfiguration clientConfiguration, Regions region, String pinpointAppId) {
        initialize(context);
        this.context = context;
        if (userPoolId.isEmpty() || clientId.isEmpty()) {
            throw new IllegalArgumentException("Both UserPoolId and ClientId are required.");
        }
        if (userPoolId.length() > USER_POOL_ID_MAX_LENGTH || !Pattern.matches(USER_POOL_ID_PATTERN, userPoolId)) {
            throw new IllegalArgumentException("Invalid userPoolId format.");
        }
        this.userPoolId = userPoolId;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.client = new AmazonCognitoIdentityProviderClient(new AnonymousAWSCredentials(), clientConfiguration);
        this.client.setRegion(com.amazonaws.regions.Region.getRegion(region));
        this.pinpointEndpointId = CognitoPinpointSharedContext.getPinpointEndpoint(context, pinpointAppId);
    }

    /**
     * Constructs a user-pool with default {@link ClientConfiguration}.
     *
     * @param context               REQUIRED: Android application context.
     * @param userPoolId            REQUIRED: User-pool-Id of the user-pool.
     * @param clientId              REQUIRED: Client-Id generated for this app and user-pool at the
     *                              Cognito Identity Provider developer console.
     * @param clientSecret          REQUIRED: Client Secret generated for this app and user-pool at
     *                              the Cognito Identity Provider developer console.
     * @param client                REQUIRED: AWS low-level Cognito Identity Provider Client.
     */
    public CognitoUserPool(Context context, String userPoolId, String clientId, String clientSecret, AmazonCognitoIdentityProvider client) {
        this(context, userPoolId, clientId, clientSecret, client, null);
    }
    
    /**
     * Constructs a user-pool with default {@link ClientConfiguration} and integrated analytics.
     *
     * @param context               REQUIRED: Android application context.
     * @param userPoolId            REQUIRED: User-pool-Id of the user-pool.
     * @param clientId              REQUIRED: Client-Id generated for this app and user-pool at the
     *                              Cognito Identity Provider developer console.
     * @param clientSecret          REQUIRED: Client Secret generated for this app and user-pool at
     *                              the Cognito Identity Provider developer console.
     * @param client                REQUIRED: AWS low-level Cognito Identity Provider Client.
     * @param pinpointAppId         REQUIRED: AWS Pinpoint App Id for analytics.
     */
    public CognitoUserPool(Context context, String userPoolId, String clientId, String clientSecret, AmazonCognitoIdentityProvider client, String pinpointAppId) {
        this(context, userPoolId, clientId, clientSecret, client, pinpointAppId, null);
    }

    /**
     * Constructs a user-pool with custom endpoint for Cognito User Pool
     *
     * @param context               REQUIRED: Android application context.
     * @param userPoolId            REQUIRED: User-pool-Id of the user-pool.
     * @param clientId              REQUIRED: Client-Id generated for this app and user-pool at the
     *                              Cognito Identity Provider developer console.
     * @param clientSecret          REQUIRED: Client Secret generated for this app and user-pool at
     *                              the Cognito Identity Provider developer console.
     * @param pinpointAppId         REQUIRED: AWS Pinpoint App Id for analytics.
     * @param cognitoUserPoolCustomEndpoint REQUIRED: Custom endpoint for Cognito Userpool
     */
    public CognitoUserPool(Context context, String userPoolId, String clientId, String clientSecret, AmazonCognitoIdentityProvider client, String pinpointAppId, String cognitoUserPoolCustomEndpoint) {
        initialize(context);
        this.context = context;
        if (userPoolId.isEmpty() || clientId.isEmpty()) {
            throw new IllegalArgumentException("Both UserPoolId and ClientId are required.");
        }
        if (userPoolId.length() > USER_POOL_ID_MAX_LENGTH || !Pattern.matches(USER_POOL_ID_PATTERN, userPoolId)) {
            throw new IllegalArgumentException("Invalid userPoolId format.");
        }
        this.userPoolId = userPoolId;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.client = client;
        this.pinpointEndpointId = CognitoPinpointSharedContext.getPinpointEndpoint(context, pinpointAppId);

        // check if the custom endpoint is not empty
        if(cognitoUserPoolCustomEndpoint != null && !cognitoUserPoolCustomEndpoint.isEmpty()) {
            this.client.setEndpoint(cognitoUserPoolCustomEndpoint);
        }
    }

    @VisibleForTesting
    void setIdentityProvider(AmazonCognitoIdentityProvider userpool) {
        this.client = userpool;
    }


    private void initialize(final Context context) {
        this.awsKeyValueStore = new AWSKeyValueStore(context,
                DEFAULT_SHARED_PREFERENCES_NAME,
                isPersistenceEnabled);
        CognitoDeviceHelper.setPersistenceEnabled(isPersistenceEnabled);
    }

    /**
     * Returns Client ID set for this pool.
     *
     * @return Client ID.
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Returns Pool ID of this pool.
     *
     * @return Your User Pool ID.
     */
    public String getUserPoolId() {
        return userPoolId;
    }

    /**
     * This method sets context data collection for the user. This data is
     * sent to the server for risk evaluation. By default data collection
     * is enabled.
     *
     * @param isEnabled if the data collection is enabled.
     */
    public void setAdvancedSecurityDataCollectionFlag(boolean isEnabled) {
        this.advancedSecurityDataCollectionFlag = isEnabled;
    }

    /**
     * Enable or disable persistence
     * @param isPersistenceEnabled flag if true indicates tokens are persisted.
     */
    public void setPersistenceEnabled(boolean isPersistenceEnabled) {
        this.isPersistenceEnabled = isPersistenceEnabled;
        awsKeyValueStore.setPersistenceEnabled(this.isPersistenceEnabled);
        CognitoDeviceHelper.setPersistenceEnabled(isPersistenceEnabled);
    }

    /**
     * Runs user registration in background.
     *
     * @param userId            REQUIRED: userId for this user
     * @param password          REQUIRED: Password for this user
     * @param userAttributes    REQUIRED: Contains all attributes for this user
     * @param validationData    REQUIRED: Parameters for lambda function for user registration
     * @param callback          REQUIRED: callback, must not be null
     */
    public void signUpInBackground(final String userId, final String password,
                                   final CognitoUserAttributes userAttributes,
                                   final Map<String, String> validationData,
                                   final SignUpHandler callback) {
        signUpInBackground(userId, password, userAttributes, validationData, Collections.<String, String>emptyMap(), callback);
    }

    /**
     * Runs user registration in current thread.
     * <p>
     *      <b>Note:</b> This method will perform network operations. Calling this method in
     *     applications' main thread will cause Android to throw NetworkOnMainThreadException.
     * </p>
     *
     * @param userId            REQUIRED: userId for this user
     * @param password          REQUIRED: Password for this user
     * @param userAttributes    REQUIRED: Contains all attributes for this user
     * @param validationData    REQUIRED: Parameters for lambda function for user registration
     * @param callback          REQUIRED: callback, must not be null
     */
    public void signUp(final String userId, final String password,
                       final CognitoUserAttributes userAttributes,
                       final Map<String, String> validationData,
                       final SignUpHandler callback) {
        signUp(userId, password, userAttributes, validationData, Collections.<String, String>emptyMap(), callback);
    }

    /**
     * Runs user registration in background.
     *
     * @param userId            REQUIRED: userId for this user
     * @param password          REQUIRED: Password for this user
     * @param userAttributes    REQUIRED: Contains all attributes for this user
     * @param validationData    REQUIRED: Parameters for lambda function for user registration
     * @param clientMetadata    Client metadata for lambda function for user registration
     * @param callback          REQUIRED: callback, must not be null
     */
    public void signUpInBackground(final String userId, final String password,
                                         final CognitoUserAttributes userAttributes,
                                         final Map<String, String> validationData,
                                         final Map<String, String> clientMetadata,
                                         final SignUpHandler callback) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                final Handler handler = new Handler(context.getMainLooper());
                Runnable returnCallback;
                try {
                    final SignUpResult signUpResult = signUpInternal(userId, password,
                            userAttributes, validationData, clientMetadata);
                    final CognitoUser user = getUser(userId);
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onSuccess(user, signUpResult);
                        }
                    };
                } catch (final Exception e) {
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onFailure(e);
                        }
                    };
                }
                handler.post(returnCallback);
            }
        }).start();
    }

    /**
     * Runs user registration in current thread.
     * <p>
     *      <b>Note:</b> This method will perform network operations. Calling this method in
     *     applications' main thread will cause Android to throw NetworkOnMainThreadException.
     * </p>
     *
     * @param userId            REQUIRED: userId for this user
     * @param password          REQUIRED: Password for this user
     * @param userAttributes    REQUIRED: Contains all attributes for this user
     * @param validationData    REQUIRED: Parameters for lambda function for user registration
     * @param clientMetadata    Client metadata for lambda function for user registration
     * @param callback          REQUIRED: callback, must not be null
     */
    public void signUp(final String userId, final String password,
            final CognitoUserAttributes userAttributes,
            final Map<String, String> validationData,
            final Map<String, String> clientMetadata,
            final SignUpHandler callback) {
        try {
            final SignUpResult signUpResult = signUpInternal(userId, password, userAttributes,
                    validationData, clientMetadata);
            final CognitoUser user = getUser(userId);
            callback.onSuccess(user, signUpResult);
        } catch (final Exception e) {
            callback.onFailure(e);
        }
    }

    /**
     * Internal method to sign-up a new user in Cognito Identity Provider user pool.
     *
     * @param userId            REQUIRED: The new user userId.
     * @param password          REQUIRED: Password you want to associate to this use.
     * @param userAttributes    REQUIRED: User attributes.
     * @param validationData    REQUIRED: Validation key value pairs, these will be passed to pre
     *                          and post registration lambda functions.
     * @param clientMetadata    Client metadata for lambda function for user registration
     * @return SignUpResult
     */
    private SignUpResult signUpInternal(String userId, String password,
                                        CognitoUserAttributes userAttributes,
                                        Map<String, String> validationData,
                                        final Map<String, String> clientMetadata) {

        // Create a list of {@link AttributeType} from {@code userAttributes}
        List<AttributeType> validationDataList = null;
        if (validationData != null) {
            validationDataList = new ArrayList<AttributeType>();
            for (final Map.Entry<String, String> data : validationData.entrySet()) {
                final AttributeType validation = new AttributeType();
                validation.setName(data.getKey());
                validation.setValue(data.getValue());
                validationDataList.add(validation);
            }
        }

        // Generate Client secret hash
        secretHash = CognitoSecretHash.getSecretHash(userId, clientId, clientSecret);

        // Create User registration request
        final SignUpRequest signUpUserRequest = new SignUpRequest()
                .withUsername(userId)
                .withPassword(password)
                .withClientId(clientId)
                .withSecretHash(secretHash)
                .withUserAttributes(userAttributes.getAttributesList())
                .withValidationData(validationDataList)
                .withClientMetadata(clientMetadata)
                .withUserContextData(getUserContextData(userId));
        String ppEndpoint = getPinpointEndpointId();
        if (ppEndpoint != null) {
            AnalyticsMetadataType amd = new AnalyticsMetadataType();
            amd.setAnalyticsEndpointId(ppEndpoint);
            signUpUserRequest.setAnalyticsMetadata(amd);
        }
        return client.signUp(signUpUserRequest);
    }

    /**
     * Returns last authenticated user on this device in this user pool.
     *
     * @return An instance of the {@link CognitoUser} for last authenticated, cached on this device
     */
    public CognitoUser getCurrentUser() {
        final String csiLastUserKey = "CognitoIdentityProvider." + clientId + ".LastAuthUser";

        if (awsKeyValueStore.contains(csiLastUserKey)) {
            return getUser(awsKeyValueStore.get(csiLastUserKey));
        } else {
            return getUser();
        }
    }

    /**
     * Returns a {@link CognitoUser} with no username set.
     *
     * @return {@link CognitoUser}.
     */
    public CognitoUser getUser() {
        return new CognitoUser(this, null, clientId, clientSecret, null, client, context);
    }

    /**
     * Returns a CognitoUser with userId {@code userId}
     * <p>
     *     This CognitoUser is not authenticated. Call {@link CognitoUser#getSession(AuthenticationHandler)}
     *     to get valid tokens {@link CognitoUserSession}
     * </p>
     *
     * @param userId            Can be null
     * @return a new CognitoUser instance with userId {@code userId}
     */
    public CognitoUser getUser(String userId) {

        if (userId == null) {
            return getUser();
        }

        if (userId.isEmpty()) {
            return getUser();
        }

        return new CognitoUser(this, userId, clientId, clientSecret,
                CognitoSecretHash.getSecretHash(userId, clientId, clientSecret),
                client, context);
    }

    /**
     * Returns the current Pinpoint app id.
     * @return current pinpoint app id.
     */
    protected String getPinpointEndpointId() {
        return pinpointEndpointId;
    }

    /**
     * Generates user context data.
     * @param userId Required: The current user.
     * @return Encoded user context.
     */
    protected UserContextDataType getUserContextData(String userId) {
        UserContextDataType contextData = null;
        if (this.advancedSecurityDataCollectionFlag) {
            UserContextDataProvider provider = UserContextDataProvider.getInstance();
            String encodedData = provider.getEncodedContextData(context, userId, this.getUserPoolId(), clientId);

            contextData = new UserContextDataType();
            contextData.setEncodedData(encodedData);
        }
        return contextData;
    }
}
