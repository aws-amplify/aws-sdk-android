/**
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
import com.amazonaws.SDKGlobalConfiguration;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.cognitoidentity.AmazonCognitoIdentity;
import com.amazonaws.services.cognitoidentity.AmazonCognitoIdentityClient;
import com.amazonaws.services.securitytoken.AWSSecurityTokenService;
import com.amazonaws.services.securitytoken.AWSSecurityTokenServiceClient;
import com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityRequest;
import com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityResult;
import com.amazonaws.services.securitytoken.model.Credentials;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * AWSCredentialsProvider implementation that uses the Amazon Cognito Identity
 * service and AWS Security Token Service to create temporary, short-lived
 * sessions to use for authentication
 */
public class CognitoCredentialsProvider implements AWSCredentialsProvider {

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

    /** The client for starting STS sessions */
    protected AWSSecurityTokenService securityTokenService;

    protected int sessionDuration;
    protected int refreshThreshold;
    protected String unauthRoleArn;
    protected String authRoleArn;
    


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
        AmazonCognitoIdentity cib = new AmazonCognitoIdentityClient(
                new AnonymousAWSCredentials(), clientConfiguration);
        cib.setRegion(Region.getRegion(region));
        this.identityProvider = new AWSBasicCognitoIdentityProvider(accountId, identityPoolId, cib);
        this.unauthRoleArn = unauthRoleArn;
        this.authRoleArn = authRoleArn;
        this.securityTokenService = new AWSSecurityTokenServiceClient(
                new AnonymousAWSCredentials(), clientConfiguration);
        this.sessionDuration = DEFAULT_DURATION_SECONDS;
        this.refreshThreshold = DEFAULT_THRESHOLD_SECONDS;
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
            String unauthRoleArn, String authRoleArn, AmazonCognitoIdentityClient cib,
            AWSSecurityTokenService sts) {
        this(new AWSBasicCognitoIdentityProvider(accountId, identityPoolId, cib),
                unauthRoleArn, authRoleArn, sts);
    }

    /**
     * Constructs a new CognitoCredentialsProvider, which will set up a link to
     * the provider passed in, using that to get short-lived credentials from
     * STS, which can be retrieved from {@link #getCredentials()}
     * 
     * @param provider a reference to the provider in question, including what's
     *            needed to interact with it to later connect with STS
     * @param unauthArn the unauthArn, for use with the STS call
     * @param authArn the authArn, for use with the STS call
     * @param stsClient the sts endpoint to get session credentials from
     */
    public CognitoCredentialsProvider(AWSCognitoIdentityProvider provider, String unauthArn,
            String authArn, AWSSecurityTokenService stsClient) {
        identityProvider = provider;
        unauthRoleArn = unauthArn;
        authRoleArn = authArn;
        securityTokenService = stsClient;
        sessionDuration = DEFAULT_DURATION_SECONDS;
        refreshThreshold = DEFAULT_THRESHOLD_SECONDS;

    }

    /**
     * Constructs a new CognitoCredentialsProvider, which will set up a link to
     * the provider passed in, using that to get short-lived credentials from
     * STS, which can be retrieved from {@link #getCredentials()}
     * 
     * @param provider a reference to the provider in question, including what's
     *            needed to interact with it to later connect with STS
     * @param unauthArn the unauthArn, for use with the STS call
     * @param authArn the authArn, for use with the STS call
     */
    public CognitoCredentialsProvider(AWSCognitoIdentityProvider provider, String unauthArn,
            String authArn) {
        identityProvider = provider;
        unauthRoleArn = unauthArn;
        authRoleArn = authArn;
        securityTokenService = new AWSSecurityTokenServiceClient(
                new AnonymousAWSCredentials(),
                new ClientConfiguration());
        sessionDuration = DEFAULT_DURATION_SECONDS;
        refreshThreshold = DEFAULT_THRESHOLD_SECONDS;
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
        sessionCredentialsExpiration = expiration;
    }

    public Date getSessionCredentitalsExpiration() {
        return sessionCredentialsExpiration;
    }

    /**
     * If the current session has expired/credentials are invalid, a new session
     * is started, establishing the credentials. In either case, those
     * credentials are returned
     */
    @Override
    public AWSSessionCredentials getCredentials() {
        if (needsNewSession()) {
            startSession();
        }
        return sessionCredentials;
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

    protected void setIdentityId(String identityId){
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
        identityProvider.setLogins(logins);
        this.sessionCredentials = null;
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
        startSession();
    }

    /**
     * Clear all in-memory and saved state for the credentials provider. Will
     * destroy any saved Amazon Cognito Identity Id and associated AWS
     * credentials.
     */
    public void clear() {
        sessionCredentials = null;
        sessionCredentialsExpiration = null;
        identityProvider.clearListeners();
        setIdentityId(null);
        identityProvider.setLogins(new HashMap<String, String>());
    }

    /**
     * Starts a new session by getting an OpenId Connect token from Amazon
     * Cognito and then trading with AWS Secure Token Service. This class then
     * vends the short lived session credentials sent back from STS.
     */
    protected void startSession() {
        // make sure we have an identityId
        token = identityProvider.refresh();

        String roleArn = unauthRoleArn;
        Map<String, String> logins = identityProvider.getLogins();
        if ((logins != null) && (logins.size() > 0)) {
            roleArn = authRoleArn;
        }
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
        if (sessionCredentials == null) {
            return true;
        }
        long currentTime = System.currentTimeMillis()
                - SDKGlobalConfiguration.getGlobalTimeOffset() * 1000;
        long timeRemaining = sessionCredentialsExpiration.getTime() - currentTime;
        return timeRemaining < (refreshThreshold * 1000);
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

    public void registerIdentityChangedListener(IdentityChangedListener listener) {
        identityProvider.registerIdentityChangedListener(listener);
    }

    public void unregisterIdentityChangedListener(
            IdentityChangedListener listener) {
        identityProvider.unregisterIdentityChangedListener(listener);
    }

}
