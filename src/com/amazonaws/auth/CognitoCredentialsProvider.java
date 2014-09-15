/*
 * Copyright 2011-2014 Amazon Technologies, Inc.
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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.SDKGlobalConfiguration;
import com.amazonaws.services.cognitoidentity.AmazonCognitoIdentity;
import com.amazonaws.services.cognitoidentity.AmazonCognitoIdentityClient;
import com.amazonaws.services.cognitoidentity.model.GetIdRequest;
import com.amazonaws.services.cognitoidentity.model.GetIdResult;
import com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenRequest;
import com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenResult;
import com.amazonaws.services.securitytoken.AWSSecurityTokenService;
import com.amazonaws.services.securitytoken.AWSSecurityTokenServiceClient;
import com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityRequest;
import com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityResult;
import com.amazonaws.services.securitytoken.model.Credentials;

import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * AWSCredentialsProvider implementation that uses the Amazon Cognito Identity
 * Service and AWS Security Token Service to create temporary, short-lived
 * sessions to use for authentication.
 */
public class CognitoCredentialsProvider implements AWSCredentialsProvider {

    /** Default duration for started sessions */
    public static final int DEFAULT_DURATION_SECONDS = 3600;

    /** Default threshold for refreshing session credentials */
    public static final int DEFAULT_THRESHOLD_SECONDS = 500;

    /** The client for communitation with Cognito */
    protected final AmazonCognitoIdentity cib;

    /** The client for starting STS sessions */
    protected final AWSSecurityTokenService securityTokenService;

    /** The current session credentials */
    protected AWSSessionCredentials sessionCredentials;

    /** The expiration time for the current session credentials */
    protected Date sessionCredentialsExpiration;

    /** The current OpenId Connect Token */
    protected String openIdConnectToken;

    /** The identity ID returned from Cognito */
    protected String identityId;

    /** A set of listeners can be registered */
    protected Set<IdentityChangedListener> listeners;

    protected final String accountId;
    protected final String identityPoolId;
    protected final String unauthRoleArn;
    protected final String authRoleArn;
    protected Map<String, String> logins;
    protected int sessionDuration;
    protected int refreshThreshold;

    /**
     * Constructs a new {@link CognitoCredentialsProvider}, which will use the
     * specified Amazon Cognito identity pool to make a request to the AWS
     * Security Token Service (STS) to request short lived session credentials,
     * which will then be returned by this class's {@link #getCredentials()}
     * method.
     * 
     * @param accountId The AWS accountId for the account with Amazon Cognito
     * @param identityPoolId The Amazon Cogntio identity pool to use
     * @param unauthRoleArn The ARN of the IAM Role that will be assumed when
     *            unauthenticated
     * @param authRoleArn The ARN of the IAM Role that will be assumed when
     *            authenticated
     * @param region The region to use when contacting Cognito Identity, and STS
     *  (if STS supports the provided regions, otherwise STS will be contacted using the
     *  US_EAST_1 region)
     */
    public CognitoCredentialsProvider(String accountId, String identityPoolId,
            String unauthRoleArn, String authRoleArn, Regions region) {
        this(accountId, identityPoolId, unauthRoleArn, authRoleArn, region, new ClientConfiguration());
    }

    /**
     * Constructs a new {@link CognitoCredentialsProvider}, which will use the
     * specified Amazon Cognito identity pool to make a request to the AWS
     * Security Token Service (STS) to request short lived session credentials,
     * which will then be returned by this class's {@link #getCredentials()}
     * method.
     * 
     * @param accountId The AWS accountId for the account with Amazon Cognito
     * @param identityPoolId The Amazon Cognito identity pool to use
     * @param unauthRoleArn The ARN of the IAM Role that will be assumed when
     *            unauthenticated
     * @param authRoleArn The ARN of the IAM Role that will be assumed when
     *            authenticated
     * @param clientConfiguration Configuration to apply to service clients
     *            created
     * @param region The region to use when contacting Cognito Identity, and STS
     *  (if STS supports the provided regions, otherwise STS will be contacted using the
     *  US_EAST_1 region)
     */
    public CognitoCredentialsProvider(String accountId, String identityPoolId,
            String unauthRoleArn, String authRoleArn, Regions region, ClientConfiguration clientConfiguration) {

        this.cib = new AmazonCognitoIdentityClient(new AnonymousAWSCredentials(),
                        clientConfiguration);
        cib.setRegion(Region.getRegion(region));
         //TODO: set STS if applicable
        this.securityTokenService = new AWSSecurityTokenServiceClient(new AnonymousAWSCredentials(),
                        clientConfiguration);
        this.accountId = accountId;
        this.identityPoolId = identityPoolId;
        this.unauthRoleArn = unauthRoleArn;
        this.authRoleArn = authRoleArn;
        this.sessionDuration = DEFAULT_DURATION_SECONDS;
        this.refreshThreshold = DEFAULT_THRESHOLD_SECONDS;
        this.listeners = new HashSet<IdentityChangedListener>();
    }

    /**
     * Constructs a new {@link CognitoCredentialsProvider}, which will use the
     * specified Amazon Cognito identity pool to make a request to the AWS
     * Security Token Service (STS) to request short lived session credentials,
     * which will then be returned by this class's {@link #getCredentials()}
     * method.
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
            String unauthRoleArn, String authRoleArn, AmazonCognitoIdentity cibClient,
            AWSSecurityTokenService stsClient) {
        this.cib = cibClient;
        this.securityTokenService = stsClient;
        this.accountId = accountId;
        this.identityPoolId = identityPoolId;
        this.unauthRoleArn = unauthRoleArn;
        this.authRoleArn = authRoleArn;
        this.sessionDuration = DEFAULT_DURATION_SECONDS;
        this.refreshThreshold = DEFAULT_THRESHOLD_SECONDS;
        this.listeners = new HashSet<IdentityChangedListener>();
    }

    @Override
    public AWSSessionCredentials getCredentials() {
        if (needsNewSession())
            startSession();

        return sessionCredentials;
    }

    @Override
    public void refresh() {
        startSession();
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

    /**
     * Set the logins map used to authenticated with Amazon Cognito.
     * 
     * Note: You should manually call refresh on on the credentials provider
     * after adding logins to the provider as your Identity Id may have changed.
     * 
     * @param logins The new logins map (providerName, providerToken) to use to
     *            communicate with Amazon Cognito
     */
    public void setLogins(Map<String, String> logins) {
        this.logins = logins;
        // invalidate credentials to force a refresh
        this.sessionCredentials = null;
    }

    /**
     * Set the logins map used to authenticated with Amazon Cognito. Returns a
     * reference to the object so methods can be chained.
     * 
     * Note: You should manually call refresh on on the credentials provider
     * after adding logins to the provider as your Identity Id may have changed.
     * 
     * @see com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityRequest
     * @param logins The new logins map (providerName, providerToken) to use to
     *            communicate with Amazon Cognito
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CognitoCredentialsProvider withLogins(Map<String, String> logins) {
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
        return this.logins;
    }

    /**
     * Clear all in-memory and saved state for the credentials provider.
     * 
     * Will destroy any saved Amazon Cognito Identity Id and associated 
     * AWS credentials.
     * 
     */
    public void clear() {
        identityId = null;
        sessionCredentials = null;
        sessionCredentialsExpiration = null;
    }

    public String getIdentityId() {
        if (identityId == null) {
            GetIdRequest getIdRequest = new GetIdRequest().withAccountId(accountId)
                            .withIdentityPoolId(identityPoolId)
                            .withLogins(logins);
            appendUserAgent(getIdRequest, getUserAgent());
            GetIdResult getIdResult = cib.getId(getIdRequest);

            if (getIdResult.getIdentityId() != null) {
                identityChanged(getIdResult.getIdentityId());
            }
        }

        return identityId;
    }

    /**
     * Starts a new session by getting an OpenId Connect token from Amazon
     * Cognito and then trading with AWS Secure Token Service. This class then
     * vends the short lived session credentials sent back from STS.
     */
    protected void startSession() {

        // make sure we have an identityId
        getIdentityId();

        GetOpenIdTokenRequest getTokenRequest = new GetOpenIdTokenRequest()
                        .withIdentityId(identityId)
                        .withLogins(logins);
        appendUserAgent(getTokenRequest, getUserAgent());
        GetOpenIdTokenResult getTokenResult = cib.getOpenIdToken(getTokenRequest);

        openIdConnectToken = getTokenResult.getToken();

        if (!getTokenResult.getIdentityId().equals(identityId)) {
            identityChanged(getTokenResult.getIdentityId());
        }

        String roleArn = unauthRoleArn;
        if ((logins != null) && (logins.size() > 0)) {
            roleArn = authRoleArn;
        }

        AssumeRoleWithWebIdentityRequest sessionTokenRequest = new AssumeRoleWithWebIdentityRequest()
                        .withWebIdentityToken(openIdConnectToken)
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
        sessionCredentialsExpiration = stsCredentials.getExpiration();
    }

    /**
     * Returns true if a new STS session needs to be started. A new STS session
     * is needed when no session has been started yet, or if the last session is
     * within the configured refresh threshold.
     * 
     * @return True if a new STS session needs to be started.
     */
    protected boolean needsNewSession() {
        if (sessionCredentials == null)
            return true;

        long currentTime = System.currentTimeMillis()
                - SDKGlobalConfiguration.getGlobalTimeOffset() * 1000;
        long timeRemaining = sessionCredentialsExpiration.getTime() - currentTime;
        return timeRemaining < (refreshThreshold * 1000);
    }

    /**
     * Registers a new listener that will be informed when the identityId for
     * this provider changes.
     * 
     * @param listener The listener to register for notifications.
     */
    public void registerIdentityChangedListener(IdentityChangedListener listener) {
        listeners.add(listener);
    }

    /**
     * Unregisters a listener from being informed when the identityId for this
     * provider changes.
     * 
     * @param listener The listener to unregister for notifications.
     */
    public void unregisterIdentityChangedListener(IdentityChangedListener listener) {
        listeners.remove(listener);
    }

    /**
     * Helper to call all registered listeners
     * 
     * @param newIdentityId The new identity id
     */
    private void identityChanged(String newIdentityId) {
        String oldIdentityId = identityId;
        identityId = newIdentityId;
        for (IdentityChangedListener listener : listeners) {
            listener.identityChanged(oldIdentityId, identityId);
        }

    }

    /**
     * Append user agent string to the request. The final string is what is set
     * in the ClientCofniguration concatenated with the given userAgent string.
     * 
     * @param request the request object to be appended
     * @param userAgent additional user agent string to append
     */
    private void appendUserAgent(AmazonWebServiceRequest request, String userAgent) {
        request.getRequestClientOptions().appendUserAgent(userAgent);
    }

    /**
     * Gets the user agent string to append to all requests made by this
     * provider. Default is an empty string.
     */
    protected String getUserAgent() {
        return "";
    }
}

