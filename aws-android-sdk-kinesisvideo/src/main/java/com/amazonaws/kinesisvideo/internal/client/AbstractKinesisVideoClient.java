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

package com.amazonaws.kinesisvideo.internal.client;

import com.amazonaws.kinesisvideo.client.KinesisVideoClient;
import com.amazonaws.kinesisvideo.internal.client.mediasource.MediaSource;
import com.amazonaws.kinesisvideo.common.exception.KinesisVideoException;
import com.amazonaws.kinesisvideo.common.logging.Log;
import com.amazonaws.kinesisvideo.common.preconditions.Preconditions;
import com.amazonaws.kinesisvideo.producer.DeviceInfo;

import android.support.annotation.NonNull;
//import javax.annotation.concurrent.NotThreadSafe;

import static com.amazonaws.kinesisvideo.common.preconditions.Preconditions.checkState;

import java.util.ArrayList;
import java.util.List;

/**
 * Abstract Kinesis Video Client implementation which handles some of the common pieces
 * and delegates platform specifics to the implementations.
 */
//@NotThreadSafe
public abstract class AbstractKinesisVideoClient implements KinesisVideoClient {

    /**
     * Stores the list of streams
     */
    protected final List<MediaSource> mMediaSources = new ArrayList<MediaSource>();

    /**
     * Whether the object has been initialized
     */
    protected boolean mIsInitialized = false;

    /**
     * Logging through this object
     */
    protected final Log mLog;

    public AbstractKinesisVideoClient(@NonNull final Log log) {
        mLog = Preconditions.checkNotNull(log);
    }

    /**
     * Returns whether the client has been initialized
     */
    @Override
    public boolean isInitialized() {
        return mIsInitialized;
    }

    /**
     * Initializes the client object.
     */
    @Override
    public void initialize(@NonNull final DeviceInfo deviceInfo) throws KinesisVideoException
    {
        mLog.info("Initializing Kinesis Video client");

        // Make sure we are not yet initialized
        checkState(!mIsInitialized, "Already initialized");

        // The actual initialization happens in the derived classes.
        mIsInitialized = true;
    }

    /**
     * Resumes the processing
     */
    @Override
    public void startAllMediaSources() throws KinesisVideoException {
        mLog.verbose("Resuming Kinesis Video client");

        checkState(isInitialized(), "Must initialize first.");
        for (final MediaSource mediaSource : mMediaSources) {
            mediaSource.start();
        }
    }

    /**
     * Pauses the processing
     */
    @Override
    public void stopAllMediaSources() throws KinesisVideoException {
        mLog.verbose("Pausing Kinesis Video client");

        if (!isInitialized()) {
            // Idempotent call
            return;
        }

        for (final MediaSource mediaSource : mMediaSources) {
            mediaSource.stop();
        }
    }

    /**
     * Stops the streams and frees/releases the underlying object
     */
    @Override
    public void free() throws KinesisVideoException {
        mLog.verbose("Releasing Kinesis Video client");

        if (!isInitialized()) {
            // Idempotent call
            return;
        }

        for (final MediaSource mediaSource : mMediaSources) {
            if (!mediaSource.isStopped()) {
                mediaSource.stop();
            }

            mediaSource.free();
        }

        // Clean the list
        mMediaSources.clear();
    }

    /**
     * Register a media source. The media source will be binding to kinesis video producer stream
     * to send out data from media source.
     *
     * @param mediaSource media source binding to kinesis video producer stream
     * @throws KinesisVideoException
     */
    @Override
    public void registerMediaSource(@NonNull final MediaSource mediaSource) throws KinesisVideoException {
        // The actual media source creation happens in the derived class
        mMediaSources.add(mediaSource);
    }

    /**
     * Un-Register a media source. The media source will stop binding to kinesis video producer stream
     * and it cannot send data via producer stream afterwards until register again.
     *
     * @param mediaSource media source to stop binding to kinesis video producer stream
     * @throws KinesisVideoException
     */
    @Override
    public void unregisterMediaSource(@NonNull final MediaSource mediaSource) throws KinesisVideoException {
        mMediaSources.remove(mediaSource);
    }
}
