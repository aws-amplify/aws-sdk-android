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

import com.amazonaws.kinesisvideo.common.exception.KinesisVideoException;
import com.amazonaws.kinesisvideo.common.preconditions.Preconditions;

import androidx.annotation.NonNull;

/**
 * Empty credentials provider
 */
public final class StaticCredentialsProvider implements KinesisVideoCredentialsProvider {
    private final KinesisVideoCredentials credentials;

    public StaticCredentialsProvider(@NonNull KinesisVideoCredentials credentials) {
        this.credentials = Preconditions.checkNotNull(credentials);
    }

    @Override
    public KinesisVideoCredentials getCredentials() throws KinesisVideoException {
        return credentials;
    }

    @Override
    public KinesisVideoCredentials getUpdatedCredentials() throws KinesisVideoException {
        return credentials;
    }
}
