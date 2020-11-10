/**
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.auth;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.SDKGlobalConfiguration;
import com.amazonaws.mobile.config.AWSConfiguration;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.cognitoidentity.AmazonCognitoIdentity;
import com.amazonaws.services.cognitoidentity.AmazonCognitoIdentityClient;
import com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityRequest;
import com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityResult;
import com.amazonaws.services.cognitoidentity.model.ResourceNotFoundException;
import com.amazonaws.services.securitytoken.AWSSecurityTokenService;
import com.amazonaws.services.securitytoken.AWSSecurityTokenServiceClient;
import com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityRequest;
import com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityResult;
import com.amazonaws.services.securitytoken.model.Credentials;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import org.json.JSONObject;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * AWSCredentialsProvider implementation that uses the Amazon Cognito Identity
 * service and AWS Security Token Service to create temporary, short-lived
 * sessions to use for authentication
 */
public class CognitoCredentialsProvider implements AWSCredentialsProvider {
    private static final Log log = LogFactory.getLog(AWSCredentialsProviderChain.class);

    /** The name of the AWS region where the Cognito Identity pool is hosted. */
    private final String region;

    /** Used in the enhanced get credentials flow */
    private AmazonCognitoIdentity cib;

    /** Handle the identity-specific interactions */
    private final AWSCognitoIdentityProvider identityProvider;

    /** Default duration for started sessions */
    public static final int DEFAULT_DURATION_SECONDS = 3600;

    /** Default threshold for refreshing session credentials */
    public static final int DEFAULT_THRESHOLD_SECONDS = 500;

    /** The current session credentials */
    protected AWSSessionCredentials sessionCredentials;

    /** The expiration time for the current session credentials */
    protected Date sessionCredentialsExpiration;

    /** The current Token */
    protected String token;

    /**
     * The client for starting STS sessions, used in the basic (non-enhanced
     * flow)
     */
    protected AWSSecurityTokenService securityTokenService;

    protected int sessionDuration;
    protected int refreshThreshold;
    protected String unauthRoleArn;
    protected String authRoleArn;
    protected String customRoleArn;

    protected final boolean useEnhancedFlow;

    protected final ReentrantReadWriteLock credentialsLock;

    /**
     * Constructs a new {@link CognitoCredentialsProvider}, which will use the
     * specified Amazon Cognito identity pool to make a request, using the basic
     * authentication flow, to the AWS Security Token Service (STS) to request
     * short-lived session credentials, which will then be returned by this
     * class's {@link #getCredentials()} method.
     *
     * @param accountId The AWS accountId for the account with Amazon Cognito
     * @param identityPoolId The Amazon Cogntio identity pool to use
     * @param unauthRoleArn The ARN of the IAM Role that will be assumed when
     *            unauthenticated
     * @param authRoleArn The ARN of the IAM Role that will be assumed when
     *            authenticated
     * @param region The region to use when contacting Cognito Identity
     */
    public CognitoCredentialsProvider(String accountId, String identityPoolId,
                                      String unauthRoleArn, String authRoleArn, Regions region) {
        this(accountId, identityPoolId, unauthRoleArn, authRoleArn, region,
                new ClientConfiguration());
    }

    /**
     * Constructs a new {@link CognitoCredentialsProvider}, which will use the
     * specified Amazon Cognito identity pool to make a request, using the basic
     * authentication flow, to the AWS Security Token Service (STS) to request
     * short-lived session credentials, which will then be returned by this
     * class's {@link #getCredentials()} method.
     * <p>
     * This version of the constructor allows you to specify a client
     * configuration for the Amazon Cognito and STS clients.
     * </p>
     *
     * @param accountId The AWS accountId for the account with Amazon Cognito
     * @param identityPoolId The Amazon Cognito identity pool to use
     * @param unauthRoleArn The ARN of the IAM Role that will be assumed when
     *            unauthenticated
     * @param authRoleArn The ARN of the IAM Role that will be assumed when
     *            authenticated
     * @param region The region to use when contacting Cognito Identity
     * @param clientConfiguration Configuration to apply to service clients
     *            created
     */
    public CognitoCredentialsProvider(String accountId, String identityPoolId,
                                      String unauthRoleArn, String authRoleArn, Regions region,
                                      ClientConfiguration clientConfiguration) {
        this(accountId, identityPoolId, unauthRoleArn, authRoleArn,
                createIdentityClient(clientConfiguration, region),
                (unauthRoleArn == null && authRoleArn == null) ?
                        null : new AWSSecurityTokenServiceClient(new AnonymousAWSCredentials(), clientConfiguration));
    }

    private static AmazonCognitoIdentityClient createIdentityClient(ClientConfiguration clientConfiguration,
                                                                    final Regions region) {
        AmazonCognitoIdentityClient identityClient = new AmazonCognitoIdentityClient(new AnonymousAWSCredentials(), clientConfiguration);
        identityClient.setRegion(Region.getRegion(region));
        return identityClient;
    }

    /**
     * Constructs a new {@link CognitoCredentialsProvider}, which will use the
     * specified Amazon Cognito identity pool to make a request to Cognito,
     * using the enhanced flow, to get short lived session credentials, which
     * will then be returned by this class's {@link #getCredentials()} method.
     *
     * Example json file:
     * {
     *     "CredentialsProvider": {
     *         "CognitoIdentity": {
     *             "Default": {
     *                 "PoolId": "us-east-1:example-pool-id1234",
     *                 "Region": "us-east-1"
     *             }
     *         }
     *     }
     * }
     *
     * @param awsConfiguration The configuration holding you identity pool id
     *                         and the region to use when contacting
     *                         Cognito Identity
     */
    public CognitoCredentialsProvider(AWSConfiguration awsConfiguration) {
        this(null, getIdentityPoolId(awsConfiguration), null, null, getRegions(awsConfiguration), getClientConfiguration(awsConfiguration));
    }

    private static String getIdentityPoolId(AWSConfiguration awsConfiguration) {
        try {
            final JSONObject ccpConfig = awsConfiguration.optJsonObject("CredentialsProvider")
                    .optJSONObject("CognitoIdentity")
                    .getJSONObject(awsConfiguration.getConfiguration());
            return ccpConfig.getString("PoolId");
        } catch (Exception e) {
            throw new IllegalArgumentException("Failed to read CognitoIdentity please check your setup or awsconfiguration.json file", e);
        }
    }

    private static Regions getRegions(AWSConfiguration awsConfiguration) {
        try {
            final JSONObject ccpConfig = awsConfiguration.optJsonObject("CredentialsProvider")
                    .optJSONObject("CognitoIdentity")
                    .getJSONObject(awsConfiguration.getConfiguration());
            return Regions.fromName(ccpConfig.getString("Region"));
        } catch (Exception e) {
            throw new IllegalArgumentException("Failed to read CognitoIdentity please check your setup or awsconfiguration.json file", e);
        }
    }

    private static ClientConfiguration getClientConfiguration(AWSConfiguration awsConfiguration) {
        final ClientConfiguration clientConfig = new ClientConfiguration();
        clientConfig.setUserAgent(awsConfiguration.getUserAgent());
        return clientConfig;
    }

    /**
     * Constructs a new {@link CognitoCredentialsProvider}, which will use the
     * specified Amazon Cognito identity pool to make a request to Cognito,
     * using the enhanced flow, to get short lived session credentials, which
     * will then be returned by this class's {@link #getCredentials()} method.
     *
     * @param identityPoolId The Amazon Cognito identity pool to use
     * @param region The region to use when contacting Cognito Identity
     */
    public CognitoCredentialsProvider(String identityPoolId, Regions region) {
        this(null, identityPoolId, null, null, region, new ClientConfiguration());
    }

    /**
     * Constructs a new {@link CognitoCredentialsProvider}, which will use the
     * specified Amazon Cognito identity pool to make a request to Cognito,
     * using the enhanced flow, to get short lived session credentials, which
     * will then be returned by this class's {@link #getCredentials()} method.
     * <p>
     * This version of the constructor allows you to specify a client
     * configuration for the Amazon Cognito client.
     * </p>
     *
     * @param identityPoolId The Amazon Cognito identity pool to use
     * @param region The region to use when contacting Cognito Identity
     * @param clientConfiguration Configuration to apply to service clients
     *            created
     */
    public CognitoCredentialsProvider(String identityPoolId, Regions region,
                                      ClientConfiguration clientConfiguration) {
        this(null, identityPoolId, null, null, region, clientConfiguration);
    }

    /**
     * Constructs a new {@link CognitoCredentialsProvider}, which will use the
     * specified Amazon Cognito identity pool to make a request to the AWS
     * Security Token Service (STS) to get short-lived session credentials,
     * which will then be returned by this class's {@link #getCredentials()}
     * method.
     * <p>
     * This version of the constructor allows you to specify the Amazon Cognito
     * and STS client to use.
     * </p>
     * <p>
     * Set the roles and stsClient to null to use the enhanced authentication
     * flow, not contacting STS. Otherwise the basic flow will be used.
     * </p>
     *
     * @param accountId The AWS accountId for the account with Amazon Cognito
     * @param identityPoolId The Amazon Cogntio identity pool to use
     * @param unauthRoleArn The ARN of the IAM Role that will be assumed when
     *            unauthenticated
     * @param authRoleArn The ARN of the IAM Role that will be assumed when
     *            authenticated
     * @param cibClient Preconfigured CognitoIdentity client to make requests
     *            with
     * @param stsClient Preconfigured STS client to make requests with
     */
    public CognitoCredentialsProvider(String accountId, String identityPoolId,
                                      String unauthRoleArn, String authRoleArn, AmazonCognitoIdentityClient cibClient,
                                      AWSSecurityTokenService stsClient) {

        // No need to specify parameters for Region and ClientConfig because we
        // don't create the clients
        this.cib = cibClient;
        this.region = cibClient.getRegions().getName();
        this.securityTokenService = stsClient;

        this.unauthRoleArn = unauthRoleArn;
        this.authRoleArn = authRoleArn;
        this.sessionDuration = DEFAULT_DURATION_SECONDS;
        this.refreshThreshold = DEFAULT_THRESHOLD_SECONDS;

        this.useEnhancedFlow = (unauthRoleArn == null && authRoleArn == null);

        if (this.useEnhancedFlow) {
            this.identityProvider = new AWSEnhancedCognitoIdentityProvider(accountId,
                    identityPoolId,
                    cibClient);
        } else {
            this.identityProvider = new AWSBasicCognitoIdentityProvider(accountId, identityPoolId,
                    cibClient);
        }
        this.credentialsLock = new ReentrantReadWriteLock(true);
    }

    /**
     * Constructs a new CognitoCredentialsProvider, which will set up a link to
     * the provider passed in using the basic authentication flow to get get
     * short-lived credentials from STS, which can be retrieved from
     * {@link #getCredentials()}
     * <p>
     * This version of the constructor allows you to specify your own Identity
     * Provider class.
     * </p>
     *
     * @param provider a reference to the provider in question, including what's
     *            needed to interact with it to later connect with STS
     * @param unauthArn the unauthArn, for use with the STS call
     * @param authArn the authArn, for use with the STS call
     */
    public CognitoCredentialsProvider(AWSCognitoIdentityProvider provider,
                                      String unauthArn, String authArn) {
        this(provider, unauthArn, authArn, new AWSSecurityTokenServiceClient(
                new AnonymousAWSCredentials(), new ClientConfiguration()));
    }

    /**
     * Constructs a new CognitoCredentialsProvider, which will set up a link to
     * the provider passed in to use the basic authentication flow to get
     * short-lived credentials from STS, which can be retrieved from
     * {@link #getCredentials()}
     * <p>
     * This version of the constructor allows you to specify your own Identity
     * Provider class, and the STS client to use.
     * </p>
     *
     * @param provider a reference to the provider in question, including what's
     *            needed to interact with it to later connect with STS
     * @param unauthArn the unauthArn, for use with the STS call
     * @param authArn the authArn, for use with the STS call
     * @param stsClient the sts endpoint to get session credentials from
     */
    public CognitoCredentialsProvider(AWSCognitoIdentityProvider provider,
                                      String unauthArn, String authArn, AWSSecurityTokenService stsClient) {
        this.identityProvider = provider;

        if (provider instanceof AWSAbstractCognitoIdentityProvider
                && ((AWSAbstractCognitoIdentityProvider) provider).cib instanceof AmazonWebServiceClient
                && ((AmazonWebServiceClient) ((AWSAbstractCognitoIdentityProvider) provider).cib).getRegions() != null) {
            this.region = ((AmazonWebServiceClient) ((AWSAbstractCognitoIdentityProvider) provider).cib).getRegions().getName();
        } else {
            log.warn("Could not determine region of the Cognito Identity client, using default us-east-1");
            this.region = Regions.US_EAST_1.getName();
        }
        this.unauthRoleArn = unauthArn;
        this.authRoleArn = authArn;
        this.securityTokenService = stsClient;
        this.sessionDuration = DEFAULT_DURATION_SECONDS;
        this.refreshThreshold = DEFAULT_THRESHOLD_SECONDS;
        this.useEnhancedFlow = false;
        this.credentialsLock = new ReentrantReadWriteLock(true);
    }

    /**
     * Constructs a new CognitoCredentialsProvider, which will set up a link to
     * the provider passed in using the enhanced authentication flow to get
     * short-lived credentials from Amazon Cognito, which can be retrieved from
     * {@link #getCredentials()}
     * <p>
     * This version of the constructor allows you to specify your own Identity
     * Provider class.
     * </p>
     *
     * @param provider a reference to the provider in question, including what's
     *            needed to interact with it to later connect with Amazon
     *            Cognito
     * @param region The region to use when contacting Cognito
     */
    public CognitoCredentialsProvider(AWSCognitoIdentityProvider provider, Regions region) {
        this(provider, region, new ClientConfiguration());
    }

    /**
     * Constructs a new CognitoCredentialsProvider, which will set up a link to
     * the provider passed in using the enhanced authentication flow to get
     * short-lived credentials from Amazon Cognito, which can be retrieved from
     * {@link #getCredentials()}
     * <p>
     * This version of the constructor allows you to specify your own Identity
     * Provider class and the configuration for the Amazon Cognito client.
     * </p>
     *
     * @param provider a reference to the provider in question, including what's
     *            needed to interact with it to later connect with Amazon
     *            Cognito
     * @param clientConfiguration Configuration to apply to service clients
     *            created
     * @param region The region to use when contacting Cognito Identity
     */
    public CognitoCredentialsProvider(AWSCognitoIdentityProvider provider,
                                      Regions region, ClientConfiguration clientConfiguration) {
        this(provider, createIdentityClient(clientConfiguration, region));
    }

    /**
     * Constructs a new CognitoCredentialsProvider, which will set up a link to
     * the provider passed in using the enhanced authentication flow to get
     * short-lived credentials from Amazon Cognito, which can be retrieved from
     * {@link #getCredentials()}
     * <p>
     * This version of the constructor allows you to specify your own Identity
     * Provider class and the Amazon Cognito client.
     * </p>
     *
     * @param provider a reference to the provider in question, including what's
     *            needed to interact with it to later connect with Amazon
     *            Cognito
     * @param cibClient Preconfigured CognitoIdentity client to make requests
     *            with
     */
    public CognitoCredentialsProvider(AWSCognitoIdentityProvider provider,
                                      AmazonCognitoIdentityClient cibClient) {

        this.cib = cibClient;
        this.region = cibClient.getRegions().getName();
        this.identityProvider = provider;
        this.unauthRoleArn = null;
        this.authRoleArn = null;
        this.securityTokenService = null;
        this.sessionDuration = DEFAULT_DURATION_SECONDS;
        this.refreshThreshold = DEFAULT_THRESHOLD_SECONDS;
        this.useEnhancedFlow = true;
        this.credentialsLock = new ReentrantReadWriteLock(true);
    }

    public String getIdentityId() {
        return identityProvider.getIdentityId();
    }

    public String getToken() {
        return identityProvider.getToken();
    }

    public AWSIdentityProvider getIdentityProvider() {
        return identityProvider;
    }

    public void setSessionCredentialsExpiration(Date expiration) {
        credentialsLock.writeLock().lock();
        try {
            sessionCredentialsExpiration = expiration;
        } finally {
            credentialsLock.writeLock().unlock();
        }
    }

    public Date getSessionCredentialsExpiration() {
        credentialsLock.readLock().lock();
        try {
            return sessionCredentialsExpiration;
        } finally {
            credentialsLock.readLock().unlock();
        }
    }

    /** 
     * @deprecated Use {@link #getSessionCredentialsExpiration()} instead. 
     */
    @Deprecated
    public Date getSessionCredentitalsExpiration() {
        return getSessionCredentialsExpiration();
    }

    public String getIdentityPoolId() {
        return identityProvider.getIdentityPoolId();
    }

    /**
     * If the current session has expired/credentials are invalid, a new session
     * is started, establishing the credentials. In either case, those
     * credentials are returned
     */
    @Override
    public AWSSessionCredentials getCredentials() {
        credentialsLock.writeLock().lock();
        try {
            if (needsNewSession()) {
                startSession();
            }
            return sessionCredentials;
        } finally {
            credentialsLock.writeLock().unlock();
        }
    }

    /**
     * Set the duration of the session credentials created by this client in
     * seconds. Values must be supported by AssumeRoleWithWebIdentityRequest.
     *
     * @see com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityRequest
     * @param sessionDuration The new duration for session credentials created
     *            by this provider
     */
    public void setSessionDuration(int sessionDuration) {
        this.sessionDuration = sessionDuration;
    }

    /**
     * Set the duration of the session credentials created by this client in
     * seconds. Values must be supported by AssumeRoleWithWebIdentityRequest.
     * Returns reference to object so methods can be chained together.
     *
     * @see com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityRequest
     * @param sessionDuration The new duration for session credentials created
     *            by this provider
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CognitoCredentialsProvider withSessionDuration(int sessionDuration) {
        this.setSessionDuration(sessionDuration);
        return this;
    }

    /**
     * Get the duration of the session credentials created by this client in
     * seconds. Values must be supported by AssumeRoleWithWebIdentityRequest.
     *
     * @see com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityRequest
     * @return The duration for session credentials created by this provider
     */
    public int getSessionDuration() {
        return this.sessionDuration;
    }

    /**
     * Set the refresh threshold for the session credentials created by this
     * client in seconds. This value will be used internally to determine if new
     * credentials should be fetched from STS.
     *
     * @see com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityRequest
     * @param refreshThreshold The new refresh threshold for session credentials
     *            created by this provider
     */
    public void setRefreshThreshold(int refreshThreshold) {
        this.refreshThreshold = refreshThreshold;
    }

    /**
     * Set the refresh threshold for the session credentials created by this
     * client in seconds. This value will be used internally to determine if new
     * credentials should be fetched from STS. Returns a reference to the object
     * so methods can be chained.
     *
     * @see com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityRequest
     * @param refreshThreshold The new refresh threshold for session credentials
     *            created by this provider
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CognitoCredentialsProvider withRefreshThreshold(int refreshThreshold) {
        this.setRefreshThreshold(refreshThreshold);
        return this;
    }

    /**
     * Get the refresh threshold for the session credentials created by this
     * client in seconds. This value will be used internally to determine if new
     * credentials should be fetched from STS.
     *
     * @see com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityRequest
     * @return The refresh threshold for session credentials created by this
     *         provider
     */
    public int getRefreshThreshold() {
        return this.refreshThreshold;
    }

    protected void setIdentityId(String identityId) {
        identityProvider.identityChanged(identityId);
    }

    /**
     * Set the logins map used to authenticated with Amazon Cognito. Note: You
     * should manually call refresh on on the credentials provider after adding
     * logins to the provider as your Identity Id may have changed.
     *
     * @param logins The new logins map (providerName, providerToken) to use to
     *            communicate with Amazon Cognito
     */
    public void setLogins(Map<String, String> logins) {
        credentialsLock.writeLock().lock();
        try {
            identityProvider.setLogins(logins);
            clearCredentials();
        } finally {
            credentialsLock.writeLock().unlock();
        }
    }


    /**
     * Get the custom role arn associated with the credentials provider.
     *
     * @return Custom role arn.
     */
    public String getCustomRoleArn() {
        return customRoleArn;
    }

    /**
     * Set the custom role arn that will be used to get credentials with Amazon
     * Cognito. This parameter needs to be set when idp provides roles in the
     * token (eg: SAML Assertion) and there are multiple roles. Roles set by the
     * method will be assumed when it matches with the roles received in the
     * token from IdP.
     *
     * @param customRoleArn The role arn to be used to get the credentials.
     */
    public void setCustomRoleArn(String customRoleArn) {
        this.customRoleArn = customRoleArn;
    }

    /**
     * Set the logins map used to authenticated with Amazon Cognito. Returns a
     * reference to the object so methods can be chained. Note: You should
     * manually call refresh on on the credentials provider after adding logins
     * to the provider as your Identity Id may have changed.
     *
     * @see com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityRequest
     * @param logins The new logins map (providerName, providerToken) to use to
     *            communicate with Amazon Cognito
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AWSCredentialsProvider withLogins(Map<String, String> logins) {
        this.setLogins(logins);
        return this;
    }

    /**
     * Get the logins map used to authenticated with Amazon Cognito
     *
     * @return The logins map (providerName, providerToken) to use to
     *         communicate with Amazon Cognito
     */
    public Map<String, String> getLogins() {
        return identityProvider.getLogins();
    }

    @Override
    public void refresh() {
        credentialsLock.writeLock().lock();
        try {
            startSession();
        } finally {
            credentialsLock.writeLock().unlock();
        }
    }

    /**
     * Clear all in-memory and saved state for the credentials provider. Will
     * destroy any saved Amazon Cognito Identity Id and associated AWS
     * credentials.
     */
    public void clear() {
        credentialsLock.writeLock().lock();
        try {
            clearCredentials();
            setIdentityId(null);
            identityProvider.setLogins(new HashMap<String, String>());
        } finally {
            credentialsLock.writeLock().unlock();
        }
    }

    /**
     * Clear credentials. This will destroy all the saved AWS credentials but
     * not the identity Id.
     */
    public void clearCredentials() {
        credentialsLock.writeLock().lock();
        try {
            sessionCredentials = null;
            sessionCredentialsExpiration = null;
        } finally {
            credentialsLock.writeLock().unlock();
        }
    }

    /**
     * Starts a new session by getting short lived session credentials.
     */
    protected void startSession() {

        // make sure we have an identityId. In the case of cognito identity,
        // the try catch will handle a deleted or corrupted id.
        // Developer authenticated won't throw amazon exceptions,
        // and for 2hop, it will be handled below, as the getId call
        // won't fail since it is set.
        try {
            token = identityProvider.refresh();
        } catch (ResourceNotFoundException rnfe) {
            // If the identity id or identity pool is non-existant, this is
            // thrown
            token = retryRefresh();
        } catch (AmazonServiceException ase) {
            // If it's a corrupt id, then a validation exception is thrown
            if (ase.getErrorCode().equals("ValidationException")) {
                token = retryRefresh();
            }
            else {
                throw ase;
            }
        }

        if (useEnhancedFlow) {
            populateCredentialsWithCognito(token);
        } else {
            populateCredentialsWithSts(token);
        }

    }

    /**
     * To be used to call the provider back end to get identifiers.
     * Specifically, this is the helper that handles the case for when a refresh
     * call ran into the corrupt identity id case, either a deleted id or a
     * malformed id. If that happens, this is called, a new id and token are
     * fetched, and the process is resumed.
     *
     * @return the new token gotten by the service
     */
    private String retryRefresh() {

        // Ensure we get a new id and token
        setIdentityId(null);
        token = identityProvider.refresh();
        return token;
    }

    /**
     * Determines the logins key for the token.
     * This currently varies for cn-north-1 region only.
     *
     * @return logins key used in the logins map
     */
    protected String getLoginsKey() {
        if (Regions.CN_NORTH_1.getName().equals(this.region)) {
            return "cognito-identity.cn-north-1.amazonaws.com.cn";
        } else {
            return "cognito-identity.amazonaws.com";
        }
    }

    /**
     * To be used to help the calling of the 2hop flow in event of the identity
     * id being either missing or deleted. Once that is caught as having
     * happened, this call is made, which will clear the old id, get a new
     * one/token, and get the flow going back to where it was with a new request
     *
     * @return the result of the new request
     */
    private GetCredentialsForIdentityResult retryGetCredentialsForIdentity() {
        token = retryRefresh();

        Map<String, String> logins;
        if (token != null && !token.isEmpty()) {
            logins = new HashMap<String, String>();
            logins.put(getLoginsKey(), token);
        } else {
            logins = getLogins();
        }

        GetCredentialsForIdentityRequest request = new GetCredentialsForIdentityRequest()
                .withIdentityId(getIdentityId())
                .withLogins(logins).withCustomRoleArn(customRoleArn);

        return cib.getCredentialsForIdentity(request);
    }

    /**
     * Gets the session credentials from Amazon Cognito.
     */
    private void populateCredentialsWithCognito(String token) {

        // For Cognito-authenticated identities token will always be null, but
        // for developer-authenticated identities, refresh() may return a token
        // that the the developer backend has received from Cognito and we have
        // to send back in our request.
        Map<String, String> logins;
        if (token != null && !token.isEmpty()) {
            logins = new HashMap<String, String>();
            logins.put(getLoginsKey(), token);
        } else {
            logins = getLogins();
        }

        GetCredentialsForIdentityRequest request = new GetCredentialsForIdentityRequest()
                .withIdentityId(getIdentityId())
                .withLogins(logins).withCustomRoleArn(customRoleArn);

        GetCredentialsForIdentityResult result = null;

        try {
            result = cib.getCredentialsForIdentity(request);
        } catch (ResourceNotFoundException rnfe) {
            // If the identity id or identity pool is non-existant, this is
            // thrown
            result = retryGetCredentialsForIdentity();
        } catch (AmazonServiceException ase) {
            // If it's a corrupt id, then a validation exception is thrown
            if (ase.getErrorCode().equals("ValidationException")) {
                result = retryGetCredentialsForIdentity();
            }
            else {
                throw ase;
            }
        }

        com.amazonaws.services.cognitoidentity.model.Credentials credentials = result
                .getCredentials();
        sessionCredentials = new BasicSessionCredentials(credentials.getAccessKeyId(),
                credentials.getSecretKey(), credentials.getSessionToken());
        setSessionCredentialsExpiration(credentials.getExpiration());

        if (!result.getIdentityId().equals(getIdentityId())) {
            setIdentityId(result.getIdentityId());
        }

    }

    /**
     * Gets the session credentials by requesting an OpenId Connect token from
     * Amazon Cognito and then trading it with AWS Secure Token Service for the
     * short lived session credentials.
     */
    private void populateCredentialsWithSts(String token) {

        boolean isAuthenticated = identityProvider.isAuthenticated();
        String roleArn = (isAuthenticated) ? authRoleArn : unauthRoleArn;

        AssumeRoleWithWebIdentityRequest sessionTokenRequest = new AssumeRoleWithWebIdentityRequest()
                .withWebIdentityToken(token)
                .withRoleArn(roleArn)
                .withRoleSessionName("ProviderSession")
                .withDurationSeconds(sessionDuration);
        appendUserAgent(sessionTokenRequest, getUserAgent());
        AssumeRoleWithWebIdentityResult sessionTokenResult = securityTokenService
                .assumeRoleWithWebIdentity(sessionTokenRequest);
        Credentials stsCredentials = sessionTokenResult.getCredentials();

        sessionCredentials = new BasicSessionCredentials(
                stsCredentials.getAccessKeyId(),
                stsCredentials.getSecretAccessKey(),
                stsCredentials.getSessionToken());
        setSessionCredentialsExpiration(stsCredentials.getExpiration());

    }

    /**
     * Returns true if a new STS session needs to be started. A new STS session
     * is needed when no session has been started yet, or if the last session is
     * within the configured refresh threshold.
     *
     * @return True if a new STS session needs to be started.
     */
    protected boolean needsNewSession() {
        // NOTE: Do not try to acquire a lock in this method. A thread calling this
        // method can already have a read or a write lock.
        if (sessionCredentials == null) {
            return true;
        }
        long currentTime = System.currentTimeMillis()
                - SDKGlobalConfiguration.getGlobalTimeOffset() * 1000;
        long timeRemaining = sessionCredentialsExpiration.getTime()
                - currentTime;
        return timeRemaining < (refreshThreshold * 1000);
    }

    /**
     * Append user agent string to the request. The final string is what is set
     * in the ClientCofniguration concatenated with the given userAgent string.
     *
     * @param request the request object to be appended
     * @param userAgent additional user agent string to append
     */
    private void appendUserAgent(AmazonWebServiceRequest request,
                                 String userAgent) {
        request.getRequestClientOptions().appendUserAgent(userAgent);
    }

    /**
     * Gets the user agent string to append to all requests made by this
     * provider. Default is an empty string.
     *
     * @return the user agent string
     */
    protected String getUserAgent() {
        return "";
    }

    /**
     * Adds a new identity changed listener to process some event when the 
     * identity has changed. 
     *
     * @param listener the listener to be triggered on id change
     */
    public void registerIdentityChangedListener(IdentityChangedListener listener) {
        identityProvider.registerIdentityChangedListener(listener);
    }

    /**
     * Removes an identity changed listener from being triggered when the 
     * identity has changed. 
     *
     * @param listener the listener to be removed
     */
    public void unregisterIdentityChangedListener(IdentityChangedListener listener) {
        identityProvider.unregisterIdentityChangedListener(listener);
    }
}
