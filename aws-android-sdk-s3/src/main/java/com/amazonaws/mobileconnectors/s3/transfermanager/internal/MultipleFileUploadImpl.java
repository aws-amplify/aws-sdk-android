/*
 * Copyright 2012-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.s3.transfermanager.internal;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.event.ProgressListenerChain;
import com.amazonaws.mobileconnectors.s3.transfermanager.MultipleFileUpload;
import com.amazonaws.mobileconnectors.s3.transfermanager.TransferProgress;
import com.amazonaws.mobileconnectors.s3.transfermanager.Upload;

import java.util.Collection;
import java.util.Collections;

/**
 * Multiple file upload when uploading an entire directory.
 */
public class MultipleFileUploadImpl extends MultipleFileTransfer<Upload> implements
        MultipleFileUpload {

    private final String keyPrefix;
    private final String bucketName;

    public MultipleFileUploadImpl(String description, TransferProgress transferProgress,
            ProgressListenerChain progressListenerChain, String keyPrefix, String bucketName,
            Collection<? extends Upload> subTransfers) {
        super(description, transferProgress, progressListenerChain, subTransfers);
        this.keyPrefix = keyPrefix;
        this.bucketName = bucketName;
    }

    /**
     * Returns the key prefix of the virtual directory being uploaded to.
     */
    @Override
    public String getKeyPrefix() {
        return keyPrefix;
    }

    /**
     * Returns the name of the bucket to which files are uploaded.
     */
    @Override
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Waits for this transfer to complete. This is a blocking call; the current
     * thread is suspended until this transfer completes.
     *
     * @throws AmazonClientException If any errors were encountered in the
     *             client while making the request or handling the response.
     * @throws AmazonServiceException If any errors occurred in Amazon S3 while
     *             processing the request.
     * @throws InterruptedException If this thread is interrupted while waiting
     *             for the transfer to complete.
     */
    @Override
    public void waitForCompletion()
            throws AmazonClientException, AmazonServiceException, InterruptedException {
        if (subTransfers.isEmpty())
            return;
        super.waitForCompletion();
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.mobileconnectors.s3.transfermanager.MultipleFileUpload#
     * getSubTransfers()
     */
    @Override
    public Collection<? extends Upload> getSubTransfers() {
        return Collections.unmodifiableCollection(subTransfers);
    }

}
