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

package com.amazonaws.kinesisvideo.auth;

//import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.amazonaws.kinesisvideo.common.preconditions.Preconditions;

import java.io.Serializable;
import java.util.Date;

//@SuppressFBWarnings("EI_EXPOSE_REP")
public class KinesisVideoCredentials implements Serializable{
    /**
     * Sentinel value indicating the credentials never expire
     */
    public static final Date CREDENTIALS_NEVER_EXPIRE = new Date(Long.MAX_VALUE);

    public static final KinesisVideoCredentials EMPTY_KINESIS_VIDEO_CREDENTIALS = new KinesisVideoCredentials("","");

    private final String accessKey;
    private final String secretKey;
    private final String sessionToken;
    private final Date expiration;

    public KinesisVideoCredentials(@NonNull final String accessKey,
                             @NonNull final String secretKey) {
        this(accessKey, secretKey, null, CREDENTIALS_NEVER_EXPIRE);
    }

    public KinesisVideoCredentials(@NonNull final String accessKey,
                             @NonNull final String secretKey,
                             @Nullable final String sessionToken,
                             @NonNull final Date expiration) {
        this.accessKey = Preconditions.checkNotNull(accessKey);
        this.secretKey = Preconditions.checkNotNull(secretKey);
        this.sessionToken = sessionToken;
        this.expiration = expiration;
    }

    @NonNull
    public String getAccessKey() {
        return accessKey;
    }

    @NonNull
    public String getSecretKey() {
        return secretKey;
    }

    @Nullable
    public String getSessionToken() {
        return sessionToken;
    }

    @NonNull
    public Date getExpiration() {
        return expiration;
    }
}
