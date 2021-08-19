/**
 * Copyright 2017-2018 Amazon.com,
 * Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Amazon Software License (the "License").
 * You may not use this file except in compliance with the
 * License. A copy of the License is located at
 *
 *     http://aws.amazon.com/asl/
 *
 * or in the "license" file accompanying this file. This file is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, express or implied. See the License
 * for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.mobileconnectors.kinesisvideo.auth;

import androidx.annotation.NonNull;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSSessionCredentials;
import com.amazonaws.auth.CognitoCredentialsProvider;
import com.amazonaws.kinesisvideo.auth.AbstractKinesisVideoCredentialsProvider;
import com.amazonaws.kinesisvideo.auth.KinesisVideoCredentials;
import com.amazonaws.kinesisvideo.common.exception.KinesisVideoException;
import com.amazonaws.kinesisvideo.common.logging.Log;
import com.amazonaws.kinesisvideo.common.preconditions.Preconditions;
import com.amazonaws.mobile.client.AWSMobileClient;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Implementation of the AWS Credentials Provider wrapper for Android
 */
public class KinesisVideoCredentialsProviderImpl extends AbstractKinesisVideoCredentialsProvider {

    private final AWSCredentialsProvider credentialsProvider;
    private final Log log;

    public KinesisVideoCredentialsProviderImpl(@NonNull final AWSCredentialsProvider awsCredentialsProvider,
            @NonNull final Log log) {
        this.credentialsProvider = Preconditions.checkNotNull(awsCredentialsProvider);
        this.log = Preconditions.checkNotNull(log);
    }

    @Override
    protected KinesisVideoCredentials updateCredentials() throws KinesisVideoException {
        // Refresh the token first
        log.debug("Refreshing credentials");
        credentialsProvider.refresh();

        // Get the AWS credentials and create Kinesis Video Credentials
        final AWSCredentials awsCredentials = credentialsProvider.getCredentials();

        String sessionToken = null;
        if (awsCredentials instanceof AWSSessionCredentials) {
            final AWSSessionCredentials sessionCredentials = (AWSSessionCredentials) awsCredentials;
            sessionToken = sessionCredentials.getSessionToken();
        }

        Date expiration = KinesisVideoCredentials.CREDENTIALS_NEVER_EXPIRE;
        if (credentialsProvider instanceof CognitoCredentialsProvider) {
            final CognitoCredentialsProvider cognitoCredentialsProvider =
                    (CognitoCredentialsProvider) credentialsProvider;

            expiration = cognitoCredentialsProvider.getSessionCredentialsExpiration();
            log.debug("Refreshed token expiration is %s", expiration);
        } else if (credentialsProvider instanceof AWSMobileClient) {
            AWSMobileClient awsMobileClient = (AWSMobileClient) credentialsProvider;
            try {
                expiration = awsMobileClient.getTokens().getAccessToken().getExpiration();
                log.debug("Refreshed token expiration is %s", expiration);
            } catch (Exception e) {
                throw new KinesisVideoException("Failed to refresh! " + e.getMessage());
            }
        }

        log.debug("Returning %scredentials with expiration %s",
                sessionToken == null ? "" : "session ",
                expiration);

        return new KinesisVideoCredentials(awsCredentials.getAWSAccessKeyId(),
                awsCredentials.getAWSSecretKey(),
                sessionToken,
                expiration);
    }
}
