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
import com.amazonaws.kinesisvideo.common.logging.Log;
import com.amazonaws.kinesisvideo.common.preconditions.Preconditions;
import com.amazonaws.kinesisvideo.producer.AuthCallbacks;
import com.amazonaws.kinesisvideo.producer.AuthInfo;
import com.amazonaws.kinesisvideo.producer.AuthInfoType;
import com.amazonaws.kinesisvideo.producer.Time;

import android.support.annotation.Nullable;
import android.support.annotation.NonNull;

import java.io.*;
import java.util.concurrent.*;

/**
 * Default AuthCallbacks implementation based on the credentials provider
 */
public class DefaultAuthCallbacks implements AuthCallbacks {
    /**
     * Default timeout for the credentials
     */
    private static final int CREDENTIALS_UPDATE_TIMEOUT_MILLIS = 10000;

    /**
     * A sentinel value indicating the credentials never expire
     */
    public static final long CREDENTIALS_NEVER_EXPIRE = Long.MAX_VALUE;

    /**
     * Stored credentials provider
     */
    private final KinesisVideoCredentialsProvider credentialsProvider;

    /**
     * Executor service to use as the calls can come in on the main thread.
     */
    private final ScheduledExecutorService executor;

    /**
     * Used for logging
     */
    private final Log log;

    /**
     * Stores the serialized credentials
     */
    private byte[] serializedCredentials;

    /**
     * Expiration of the credentials
     */
    private long expiration;

    public DefaultAuthCallbacks(@NonNull KinesisVideoCredentialsProvider credentialsProvider,
                                @NonNull final ScheduledExecutorService executor,
                                @NonNull Log log) {
        this.credentialsProvider = Preconditions.checkNotNull(credentialsProvider);
        this.executor = Preconditions.checkNotNull(executor);
        this.log = Preconditions.checkNotNull(log);
    }

    @Nullable
    @Override
    public AuthInfo getDeviceCertificate() {
        throw new RuntimeException("Certificate integration is not implemented");
    }

    @Nullable
    @Override
    public AuthInfo getSecurityToken() {
        final Runnable task = new Runnable() {
            @Override
            public void run() {
                // Get the updated credentials and serialize it

                final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    final KinesisVideoCredentials credentials = credentialsProvider.getUpdatedCredentials();
                    expiration = credentials.getExpiration().getTime() * Time.HUNDREDS_OF_NANOS_IN_A_MILLISECOND;

                    final ObjectOutput outputStream = new ObjectOutputStream(byteArrayOutputStream);
                    outputStream.writeObject(credentials);
                    outputStream.flush();
                    serializedCredentials = byteArrayOutputStream.toByteArray();
                    outputStream.close();
                } catch (final IOException e) {
                    // return null
                    serializedCredentials = null;
                    expiration = 0;
                    log.exception(e, "Exception was thrown trying to get updated credentials");
                } catch (final KinesisVideoException e) {
                    // return null
                    serializedCredentials = null;
                    expiration = 0;
                    log.exception(e, "Exception was thrown trying to get updated credentials");
                } finally {
                    try {
                        byteArrayOutputStream.close();
                    }
                    catch(final IOException e) {
                        // Do nothing
                        log.exception(e, "Closing the byte array stream threw an exception");
                    }
                }
            }
        };

        final ScheduledFuture<?> future = executor.schedule(task, 0, TimeUnit.NANOSECONDS);

        // Await for the future to complete
        try {
            future.get(CREDENTIALS_UPDATE_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);
        } catch (final InterruptedException e) {
            log.exception(e, "Awaiting for the credentials update threw an exception");
        } catch (final ExecutionException e) {
            log.exception(e, "Awaiting for the credentials update threw an exception");
        } catch (final TimeoutException e) {
            log.exception(e, "Awaiting for the credentials update threw an exception");
        }

        return new AuthInfo(
                AuthInfoType.SECURITY_TOKEN,
                serializedCredentials,
                expiration);
    }

    @Nullable
    @Override
    public String getDeviceFingerprint() {
        throw new RuntimeException("Provisioning is not implemented");
    }
}
