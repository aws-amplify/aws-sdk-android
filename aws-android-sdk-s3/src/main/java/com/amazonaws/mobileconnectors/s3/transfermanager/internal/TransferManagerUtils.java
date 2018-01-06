/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import static com.amazonaws.services.s3.internal.Constants.MAXIMUM_UPLOAD_PARTS;

import com.amazonaws.mobileconnectors.s3.transfermanager.PauseStatus;
import com.amazonaws.mobileconnectors.s3.transfermanager.Transfer.TransferState;
import com.amazonaws.mobileconnectors.s3.transfermanager.TransferManagerConfiguration;
import com.amazonaws.services.s3.model.CopyObjectRequest;
import com.amazonaws.services.s3.model.PutObjectRequest;

import java.io.File;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Internal utilities for multipart uploads with TransferManager.
 */
public class TransferManagerUtils {

    /**
     * Returns a new thread pool configured with the default settings.
     *
     * @return A new thread pool configured with the default settings.
     */
    public static ThreadPoolExecutor createDefaultExecutorService() {
        ThreadFactory threadFactory = new ThreadFactory() {
            private int threadCount = 1;

            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                thread.setName("s3-transfer-manager-worker-" + threadCount++);
                return thread;
            }
        };
        return (ThreadPoolExecutor) Executors.newFixedThreadPool(10, threadFactory);
    }

    /**
     * Returns true if the specified upload request can use parallel part
     * uploads for increased performance.
     *
     * @param putObjectRequest The request to check.
     * @param isUsingEncryption True if the upload is an encrypted upload,
     *            otherwise false.
     * @return True if this request can use parallel part uploads for faster
     *         uploads.
     */
    public static boolean isUploadParallelizable(final PutObjectRequest putObjectRequest,
            final boolean isUsingEncryption) {
        // Each uploaded part in an encrypted upload depends on the encryption
        // context
        // from the previous upload, so we cannot parallelize encrypted upload
        // parts.
        if (isUsingEncryption)
            return false;

        // Otherwise, if there's a file, we can process the uploads
        // concurrently.
        return (getRequestFile(putObjectRequest) != null);
    }

    /**
     * Returns the size of the data in this request, otherwise -1 if the content
     * length is unknown.
     *
     * @param putObjectRequest The request to check.
     * @return The size of the data in this request, otherwise -1 if the size of
     *         the data is unknown.
     */
    public static long getContentLength(PutObjectRequest putObjectRequest) {
        File file = getRequestFile(putObjectRequest);
        if (file != null)
            return file.length();

        if (putObjectRequest.getInputStream() != null) {
            if (putObjectRequest.getMetadata().getContentLength() > 0) {
                return putObjectRequest.getMetadata().getContentLength();
            }
        }

        return -1;
    }

    /**
     * Returns the optimal part size, in bytes, for each individual part upload
     * in a multipart upload.
     *
     * @param putObjectRequest The request containing all the details of the
     *            upload.
     * @param configuration Configuration values to use when calculating size.
     * @return The optimal part size, in bytes, for each individual part upload
     *         in a multipart upload.
     */
    public static long calculateOptimalPartSize(PutObjectRequest putObjectRequest,
            TransferManagerConfiguration configuration) {
        double contentLength = TransferManagerUtils.getContentLength(putObjectRequest);
        double optimalPartSize = contentLength / MAXIMUM_UPLOAD_PARTS;
        // round up so we don't push the upload over the maximum number of parts
        optimalPartSize = Math.ceil(optimalPartSize);
        return (long) Math.max(optimalPartSize, configuration.getMinimumUploadPartSize());
    }

    /**
     * Returns true if the the specified request should be processed as a
     * multipart upload (instead of a single part upload).
     *
     * @param putObjectRequest The request containing all the details of the
     *            upload.
     * @param configuration Configuration settings controlling how transfer
     *            manager processes requests.
     * @return True if the the specified request should be processed as a
     *         multipart upload.
     */
    public static boolean shouldUseMultipartUpload(PutObjectRequest putObjectRequest,
            TransferManagerConfiguration configuration) {
        long contentLength = TransferManagerUtils.getContentLength(putObjectRequest);
        return (contentLength > configuration.getMultipartUploadThreshold());
    }

    /**
     * Convenience method for getting the file specified in a request.
     */
    public static File getRequestFile(final PutObjectRequest putObjectRequest) {
        if (putObjectRequest.getFile() != null)
            return putObjectRequest.getFile();
        return null;
    }

    /**
     * Calculates the optimal part size of each part request if the copy
     * operation is carried out as multi-part copy.
     *
     * @param copyObjectRequest the original request.
     * @param configuration configuration containing the default part size.
     * @param contentLengthOfSource content length of the Amazon S3 object.
     * @return the optimal part size for a copy part request.
     */
    public static long calculateOptimalPartSizeForCopy(
            CopyObjectRequest copyObjectRequest,
            TransferManagerConfiguration configuration,
            long contentLengthOfSource) {
        double optimalPartSize = (double) contentLengthOfSource
                / (double) MAXIMUM_UPLOAD_PARTS;
        // round up so we don't push the copy over the maximum number of parts
        optimalPartSize = Math.ceil(optimalPartSize);
        return (long) Math.max(optimalPartSize,
                configuration.getMultipartCopyPartSize());
    }

    /**
     * Determines the pause status based on the current state of transfer.
     */
    public static PauseStatus determinePauseStatus(TransferState transferState,
            boolean forceCancel) {

        if (forceCancel) {
            if (transferState == TransferState.Waiting) {
                return PauseStatus.CANCELLED_BEFORE_START;
            } else if (transferState == TransferState.InProgress) {
                return PauseStatus.CANCELLED;
            }
        }
        if (transferState == TransferState.Waiting) {
            return PauseStatus.NOT_STARTED;
        }
        return PauseStatus.NO_EFFECT;
    }

}
