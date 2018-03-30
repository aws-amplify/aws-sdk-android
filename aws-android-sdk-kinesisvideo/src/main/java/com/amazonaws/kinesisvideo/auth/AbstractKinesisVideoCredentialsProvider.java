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

/**
 * Interface to mimic the credentials provider in AWS SDKs.
 */
public abstract class AbstractKinesisVideoCredentialsProvider implements KinesisVideoCredentialsProvider {
    private KinesisVideoCredentials credentials;
    private Object syncObj;

    protected AbstractKinesisVideoCredentialsProvider() {
        credentials = null;
        syncObj = new Object();
    }

    @Override
    public KinesisVideoCredentials getCredentials() throws KinesisVideoException {
        synchronized (syncObj) {
            refreshCredentials(false);
            return credentials;
        }
    }

    @Override
    public KinesisVideoCredentials getUpdatedCredentials() throws KinesisVideoException {
        synchronized (syncObj) {
            refreshCredentials(true);
            return credentials;
        }
    }

    private void refreshCredentials(boolean forceUpdate) throws KinesisVideoException {
        final long currentMillis = System.currentTimeMillis();
        if (null == credentials
                || forceUpdate
                || currentMillis <= credentials.getExpiration().getTime()) {
            // Force update the credentials which in derived classes will actually retrieve new credentials.
            credentials = updateCredentials();
        }
    }

    protected abstract KinesisVideoCredentials updateCredentials() throws KinesisVideoException;
}
