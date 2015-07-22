/**
 * Copyright 2015-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonClientException;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.GetObjectMetadataRequest;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;

import java.io.File;
import java.util.concurrent.Callable;

/**
 * Performs download operation and returns a Boolean value indicating whether
 * the file has been downloaded successfully.
 */
class DownloadTask implements Callable<Boolean> {

    private final AmazonS3 s3;
    private final TransferRecord download;
    private final TransferProgress transferProgress;
    TransferDBUtil dbUtil;

    /**
     * Constructs a DownloadTask with the given download info and S3 client.
     *
     * @param DownloadInfo A TransferRecord object storing all the information
     *            of the download
     * @param s3 Low-level S3 client
     */
    public DownloadTask(TransferRecord DownloadInfo, AmazonS3 s3, TransferDBUtil dbUtil) {
        this.download = DownloadInfo;
        this.s3 = s3;
        this.transferProgress = new TransferProgress();
        this.dbUtil = dbUtil;
    }

    /*
     * Runs download task and returns whether successfully downloaded.
     */
    @Override
    public Boolean call() {
        return downloadAndWaitForCompletion();
    }

    /**
     * Starts downloading, blocks the current thread and wait for completion.
     *
     * @return Whether the file has been downloaded successfully.
     */
    private Boolean downloadAndWaitForCompletion() {
        dbUtil.updateState(download.id, TransferState.IN_PROGRESS);
        final GetObjectRequest getObjectRequest = new GetObjectRequest(download.bucketName,
                download.key);
        File file = new File(download.file);
        TransferUtility.appendTransferServiceUserAgentString(getObjectRequest);

        // Constructs a request and fetch total bytes.
        GetObjectMetadataRequest getObjectMetadataRequest = new GetObjectMetadataRequest(
                getObjectRequest.getBucketName(), getObjectRequest.getKey());
        if (getObjectRequest.getSSECustomerKey() != null) {
            getObjectMetadataRequest.setSSECustomerKey(getObjectRequest.getSSECustomerKey());
        }
        ObjectMetadata objectMetadata = null;

        try {
            TransferUtility.appendTransferServiceUserAgentString(getObjectMetadataRequest);
            objectMetadata = s3.getObjectMetadata(getObjectMetadataRequest);
        } catch (AmazonClientException ase) {
            writeFailureInfo();
            return false;
        }

        long startingByte = 0;
        long lastByte = objectMetadata.getContentLength() - 1;
        long totalBytesOfFile = lastByte - startingByte + 1;
        long totalBytesToDownload = totalBytesOfFile;
        transferProgress.setTotalBytesToTransfer(totalBytesOfFile);
        dbUtil.updateBytesTotalForDownload(download.id, totalBytesOfFile);

        // Checks if it's a resumed download.
        if (download.bytesCurrent > 0) {
            if (file.exists()) {
                long numberOfBytesRead = file.length();
                if (numberOfBytesRead != download.bytesCurrent) {
                    dbUtil.updateBytesTransferred(download.id, numberOfBytesRead, true);
                }
                startingByte = startingByte + numberOfBytesRead;
                getObjectRequest.setRange(startingByte, lastByte);
                transferProgress.updateProgress(Math.min(numberOfBytesRead,
                        totalBytesOfFile));
                totalBytesToDownload = lastByte - startingByte + 1;
            }
        }

        if (totalBytesToDownload < 0) {
            throw new IllegalArgumentException(
                    "Unable to determine the range for download operation.");
        }

        getObjectRequest.setGeneralProgressListener(new TransferProgressUpdatingListener(
                transferProgress) {
            @Override
            public void progressChanged(ProgressEvent progressEvent) {
                super.progressChanged(progressEvent);
                if (download.bytesCurrent != transferProgress.getBytesTransferred()) {
                    dbUtil.updateBytesTransferred(download.id,
                            transferProgress.getBytesTransferred(),
                            false);
                }
            }
        });

        try {
            ObjectMetadata metadata = s3.getObject(getObjectRequest, file);
            if (metadata == null) {
                writeFailureInfo();
                return false;
            } else {
                writeSuccessInfo(totalBytesOfFile);
                return true;
            }
        } catch (Exception e) {
            writeFailureInfo();
            return false;
        }
    }

    /**
     * Updates the download record with success state and total bytes.
     *
     * @param totalBytesOfFile The total bytes of the downloaded file.
     */
    private void writeSuccessInfo(long totalBytesOfFile) {
        dbUtil.updateBytesTransferred(download.id, totalBytesOfFile, true);
        dbUtil.updateState(download.id, TransferState.COMPLETED);
    }

    /**
     * Updates the download record with failure state.
     */
    private void writeFailureInfo() {
        dbUtil.updateState(download.id, TransferState.FAILED);
    }
}
