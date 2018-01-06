/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.s3.transfermanager.internal;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListenerChain;
import com.amazonaws.mobileconnectors.s3.transfermanager.Download;
import com.amazonaws.mobileconnectors.s3.transfermanager.PersistableDownload;
import com.amazonaws.mobileconnectors.s3.transfermanager.TransferProgress;
import com.amazonaws.mobileconnectors.s3.transfermanager.exception.PauseException;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.S3Object;

import java.io.File;
import java.io.IOException;

public class DownloadImpl extends AbstractTransfer implements Download {

    S3Object s3Object;

    /**
     * Information to resume if the download is paused.
     */
    private final PersistableDownload persistableDownload;

    public DownloadImpl(String description, TransferProgress transferProgress,
            ProgressListenerChain progressListenerChain, S3Object s3Object,
            TransferStateChangeListener listener,
            GetObjectRequest getObjectRequest, File file) {
        super(description, transferProgress, progressListenerChain, listener);
        this.s3Object = s3Object;
        this.persistableDownload = captureDownloadState(getObjectRequest, file);
        S3ProgressPublisher.publishTransferPersistable(progressListenerChain,
                persistableDownload);
    }

    /**
     * Returns the ObjectMetadata for the object being downloaded.
     *
     * @return The ObjectMetadata for the object being downloaded.
     */
    @Override
    public ObjectMetadata getObjectMetadata() {
        return s3Object.getObjectMetadata();
    }

    /**
     * The name of the bucket where the object is being downloaded from.
     *
     * @return The name of the bucket where the object is being downloaded from.
     */
    @Override
    public String getBucketName() {
        return s3Object.getBucketName();
    }

    /**
     * The key under which this object was stored in Amazon S3.
     *
     * @return The key under which this object was stored in Amazon S3.
     */
    @Override
    public String getKey() {
        return s3Object.getKey();
    }

    /**
     * Cancels this download.
     *
     * @throws IOException
     */
    @Override
    public synchronized void abort() throws IOException {

        this.monitor.getFuture().cancel(true);

        if (s3Object != null) {
            s3Object.getObjectContent().abort();
        }
        setState(TransferState.Canceled);
    }

    /**
     * Cancels this download, but skip notifying the state change listeners.
     *
     * @throws IOException
     */
    public synchronized void abortWithoutNotifyingStateChangeListener() throws IOException {

        this.monitor.getFuture().cancel(true);

        synchronized (this) {
            this.state = TransferState.Canceled;
        }
    }

    /**
     * Set the S3 object to download.
     */
    public synchronized void setS3Object(S3Object s3Object) {
        this.s3Object = s3Object;
    }

    /**
     * This method is also responsible for firing COMPLETED signal to the
     * listeners.
     */
    @Override
    public void setState(TransferState state) {
        super.setState(state);

        if (state == TransferState.Completed) {
            fireProgressEvent(ProgressEvent.COMPLETED_EVENT_CODE);
        }
    }

    /**
     * Returns the captured state of the download; or null if it should not be
     * captured (for security reason).
     */
    private PersistableDownload captureDownloadState(
            final GetObjectRequest getObjectRequest, final File file) {
        if (getObjectRequest.getSSECustomerKey() == null) {
            return new PersistableDownload(
                    getObjectRequest.getBucketName(),
                    getObjectRequest.getKey(), getObjectRequest.getVersionId(),
                    getObjectRequest.getRange(),
                    getObjectRequest.getResponseHeaders(),
                    getObjectRequest.isRequesterPays(), file.getAbsolutePath());
        }
        return null;
    }

    /*
     * (non-Javadoc)
     * @see com.amazonaws.mobileconnectors.s3.transfermanager.Download#pause()
     */
    @Override
    public PersistableDownload pause() throws PauseException {
        boolean forceCancel = true;
        TransferState currentState = getState();
        this.monitor.getFuture().cancel(true);

        if (persistableDownload == null) {
            throw new PauseException(TransferManagerUtils.determinePauseStatus(
                    currentState, forceCancel));
        }
        return persistableDownload;
    }
}
