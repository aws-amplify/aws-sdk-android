/**
 * Copyright 2015-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonClientException;
import com.amazonaws.mobileconnectors.s3.receiver.NetworkInfoReceiver;
import com.amazonaws.retry.RetryUtils;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.S3Object;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
    private final NetworkInfoReceiver networkInfo;

    /**
     * Constructs a DownloadTask with the given download info and S3 client.
     *
     * @param download A TransferRecord object storing all the information of
     *            the download
     * @param s3 Low-level S3 client
     * @param updater status updater
     * @param networkInfo network info
     */
    public DownloadTask(TransferRecord download, AmazonS3 s3, TransferStatusUpdater updater,
            NetworkInfoReceiver networkInfo) {
        this.download = download;
        this.s3 = s3;
        this.updater = updater;
        this.networkInfo = networkInfo;
    }

    /**
     * Runs download task and returns whether successfully downloaded.
     */
    @Override
    public Boolean call() throws Exception {
        if (!networkInfo.isNetworkConnected()) {
            updater.updateState(download.id, TransferState.WAITING_FOR_NETWORK);
            return false;
        }
        updater.updateState(download.id, TransferState.IN_PROGRESS);

        final GetObjectRequest getObjectRequest = new GetObjectRequest(download.bucketName,
                download.key);
        TransferUtility.appendTransferServiceUserAgentString(getObjectRequest);
        File file = new File(download.file);
        long bytesCurrent = file.length();
        if (bytesCurrent > 0) {
            Log.d(TAG, String.format("Resume transfer %d from %d bytes", download.id,
                    bytesCurrent));
            /*
             * Setting the last byte position to －1 means downloading the object
             * from bytesCurrent to the end.
             */
            getObjectRequest.setRange(bytesCurrent, -1);
        }
        getObjectRequest.setGeneralProgressListener(updater.newProgressListener(download.id));

        try {
            S3Object object = s3.getObject(getObjectRequest);
            if (object == null) {
                updater.throwError(download.id, new IllegalStateException(
                        "AmazonS3.getObject returns null"));
                updater.updateState(download.id, TransferState.FAILED);
                return false;
            }

            long bytesTotal = object.getObjectMetadata().getInstanceLength();
            updater.updateProgress(download.id, bytesCurrent, bytesTotal);
            saveToFile(object.getObjectContent(), file);
            updater.updateProgress(download.id, bytesTotal, bytesTotal);
            updater.updateState(download.id, TransferState.COMPLETED);
            return true;
        } catch (Exception e) {
            if (RetryUtils.isInterrupted(e)) {
                /*
                 * thread is interrupted by user. don't update the state as it's
                 * set by caller who interrupted
                 */
                Log.d(TAG, "Transfer " + download.id + " is interrupted by user");
            } else if (e.getCause() != null && e.getCause() instanceof IOException
                    && !networkInfo.isNetworkConnected()) {
                Log.d(TAG, "Transfer " + download.id + " waits for network");
                updater.updateState(download.id, TransferState.WAITING_FOR_NETWORK);
            } else {
                Log.e(TAG, "Failed to download: " + download.id + " due to " + e.getMessage());
                updater.throwError(download.id, e);
                updater.updateState(download.id, TransferState.FAILED);
            }
        }
        return false;
    }

    /**
     * Writes stream data into a file.
     *
     * @param is input stream
     * @param file file to be written
     */
    private void saveToFile(InputStream is, File file) {
        // attempt to create the parent if it doesn't exist
        File parentDirectory = file.getParentFile();
        if (parentDirectory != null && !parentDirectory.exists()) {
            parentDirectory.mkdirs();
        }

        boolean append = file.length() > 0;
        OutputStream os = null;
        try {
            os = new BufferedOutputStream(new FileOutputStream(file, append));
            byte[] buffer = new byte[1024 * 16];
            int bytesRead;
            while ((bytesRead = is.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            throw new AmazonClientException(
                    "Unable to store object contents to disk: " + e.getMessage(), e);
        } finally {
            try {
                if (os != null) {
                    os.close();
                }
            } catch (IOException ioe) {
                // ignore
            }
            try {
                is.close();
            } catch (IOException ioe) {
                // ignore
            }
        }
    }
}
