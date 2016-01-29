/**
 * Copyright 2015-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.s3.transferutility;

import android.util.Log;

import com.amazonaws.AbortedException;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.GetObjectMetadataRequest;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;

import java.io.File;
import java.io.InterruptedIOException;
import java.util.concurrent.Callable;

/**
 * Performs download operation and returns a Boolean value indicating whether
 * the file has been downloaded successfully.
 */
class DownloadTask implements Callable<Boolean> {

    private static final String TAG = "DownloadTask";

    private final AmazonS3 s3;
    private final TransferRecord download;
    private final TransferStatusUpdater updater;

    /**
     * Constructs a DownloadTask with the given download info and S3 client.
     *
     * @param download A TransferRecord object storing all the information of
     *            the download
     * @param s3 Low-level S3 client
     */
    public DownloadTask(TransferRecord download, AmazonS3 s3, TransferStatusUpdater updater) {
        this.download = download;
        this.s3 = s3;
        this.updater = updater;
    }

    /**
     * Runs download task and returns whether successfully downloaded.
     */
    @Override
    public Boolean call() throws Exception {
        updater.updateState(download.id, TransferState.IN_PROGRESS);

        File file = new File(download.file);
        try {
            // Constructs a request and fetch total bytes.
            GetObjectMetadataRequest getObjectMetadataRequest = new GetObjectMetadataRequest(
                    download.bucketName, download.key);
            TransferUtility.appendTransferServiceUserAgentString(getObjectMetadataRequest);
            ObjectMetadata objectMetadata = s3.getObjectMetadata(getObjectMetadataRequest);
            final long bytesTotal = objectMetadata.getContentLength();

            long bytesCurrent = file.length();
            if (bytesCurrent > bytesTotal) {
                throw new IllegalStateException(
                        "Unable to determine the range for download operation.");
            }

            final GetObjectRequest getObjectRequest = new GetObjectRequest(download.bucketName,
                    download.key);
            TransferUtility.appendTransferServiceUserAgentString(getObjectRequest);
            if (bytesCurrent > 0) {
                Log.d(TAG, String.format("Resume transfer %d from %d bytes", download.id, bytesCurrent));
                getObjectRequest.setRange(bytesCurrent, bytesTotal - 1);
            }

            updater.updateProgress(download.id, bytesCurrent, bytesTotal);
            getObjectRequest.setGeneralProgressListener(updater.newProgressListener(download.id,
                    bytesCurrent, bytesTotal));
            ObjectMetadata metadata = s3.getObject(getObjectRequest, file);
            if (metadata == null) {
                updater.throwError(download.id, new IllegalStateException(
                        "AmazonS3.getObject returns null"));
                updater.updateState(download.id, TransferState.FAILED);
            } else {
                updater.updateProgress(download.id, bytesTotal, bytesTotal);
                updater.updateState(download.id, TransferState.COMPLETED);
                return true;
            }
        } catch (Exception e) {
            if (e instanceof AbortedException
                    || e.getCause() != null && (e.getCause() instanceof InterruptedIOException
                    || e.getCause() instanceof InterruptedException)) {
                // thread interrupted by user
                Log.d(TAG, "Transfer " + download.id + " is interrupted by user");
                // don't update the state as it's set by caller who interrupted
                // the transfer
            } else {
                Log.e(TAG, "Failed to download: " + download.id + " due to " + e.getMessage());
                updater.throwError(download.id, e);
                updater.updateState(download.id, TransferState.FAILED);
            }
        }
        return false;
    }
}
