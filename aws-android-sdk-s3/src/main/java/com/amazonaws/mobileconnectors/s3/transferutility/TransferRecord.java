/**
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import android.database.Cursor;
import android.net.ConnectivityManager;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.util.json.JsonUtils;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;

import com.google.gson.Gson;

import java.io.File;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * TransferRecord is used to store all the information of a transfer and
 * start/stop the a thread for the transfer task.
 */
@SuppressWarnings("checkstyle:visibilitymodifier")
class TransferRecord {
    private static final Log LOGGER = LogFactory.getLog(TransferRecord.class);

    public int id;
    public int mainUploadId;
    public int isRequesterPays;
    public int isMultipart;
    public int isLastPart;
    public int isEncrypted;
    public int partNumber;
    public long bytesTotal;
    public long bytesCurrent;
    public long speed;
    public long rangeStart;
    public long rangeLast;
    public long fileOffset;
    public TransferType type;
    public TransferState state;
    public String bucketName;
    public String key;
    public String versionId;
    public String file;
    public String multipartId;
    public String eTag;
    public String headerContentType;
    public String headerContentLanguage;
    public String headerContentDisposition;
    public String headerContentEncoding;
    public String headerCacheControl;
    public String headerExpire;
    public String headerStorageClass;

    /**
     * The following were added in 2.2.6 to support object metdata
     */
    public Map<String, String> userMetadata;
    public String expirationTimeRuleId;
    // This is a long representing a date, however it may be null
    public String httpExpires;
    public String sseAlgorithm;
    public String sseKMSKey;
    public String md5;
    public String cannedAcl;

    public TransferUtilityOptions transferUtilityOptions;

    private Future<?> submittedTask;

    private Gson gson = new Gson();

    /**
     * Constructs a TransferRecord and initializes the transfer id and S3
     * client.
     *
     * @param id The id of a transfer.
     */
    public TransferRecord(int id) {
        this.id = id;
    }

    /**
     * Updates all the fields from database using the given Cursor.
     *
     * @param c A Cursor pointing to a transfer record.
     */
    public void updateFromDB(Cursor c) {
        this.id = c.getInt(c.getColumnIndexOrThrow(TransferTable.COLUMN_ID));
        this.mainUploadId = c.getInt(c.getColumnIndexOrThrow(TransferTable.COLUMN_MAIN_UPLOAD_ID));
        this.type = TransferType.getType(c.getString(c
                .getColumnIndexOrThrow(TransferTable.COLUMN_TYPE)));
        this.state = TransferState.getState(c.getString(c
                .getColumnIndexOrThrow(TransferTable.COLUMN_STATE)));
        this.bucketName = c.getString(c.getColumnIndexOrThrow(TransferTable.COLUMN_BUCKET_NAME));
        this.key = c.getString(c.getColumnIndexOrThrow(TransferTable.COLUMN_KEY));
        this.versionId = c.getString(c.getColumnIndexOrThrow(TransferTable.COLUMN_VERSION_ID));
        this.bytesTotal = c.getLong(c.getColumnIndexOrThrow(TransferTable.COLUMN_BYTES_TOTAL));
        this.bytesCurrent = c.getLong(c.getColumnIndexOrThrow(TransferTable.COLUMN_BYTES_CURRENT));
        this.speed = c.getLong(c.getColumnIndexOrThrow(TransferTable.COLUMN_SPEED));
        this.isRequesterPays = c.getInt(c
                .getColumnIndexOrThrow(TransferTable.COLUMN_IS_REQUESTER_PAYS));
        this.isMultipart = c.getInt(c.getColumnIndexOrThrow(TransferTable.COLUMN_IS_MULTIPART));
        this.isLastPart = c.getInt(c.getColumnIndexOrThrow(TransferTable.COLUMN_IS_LAST_PART));
        this.isEncrypted = c.getInt(c.getColumnIndexOrThrow(TransferTable.COLUMN_IS_ENCRYPTED));
        this.partNumber = c.getInt(c.getColumnIndexOrThrow(TransferTable.COLUMN_PART_NUM));
        this.eTag = c.getString(c.getColumnIndexOrThrow(TransferTable.COLUMN_ETAG));
        this.file = c.getString(c.getColumnIndexOrThrow(TransferTable.COLUMN_FILE));
        this.multipartId = c.getString(c.getColumnIndexOrThrow(TransferTable.COLUMN_MULTIPART_ID));
        this.rangeStart = c
                .getLong(c.getColumnIndexOrThrow(TransferTable.COLUMN_DATA_RANGE_START));
        this.rangeLast = c.getLong(c.getColumnIndexOrThrow(TransferTable.COLUMN_DATA_RANGE_LAST));
        this.fileOffset = c.getLong(c.getColumnIndexOrThrow(TransferTable.COLUMN_FILE_OFFSET));
        this.headerContentType = c.getString(c
                .getColumnIndexOrThrow(TransferTable.COLUMN_HEADER_CONTENT_TYPE));
        this.headerContentLanguage = c.getString(c
                .getColumnIndexOrThrow(TransferTable.COLUMN_HEADER_CONTENT_LANGUAGE));
        this.headerContentDisposition = c.getString(c
                .getColumnIndexOrThrow(TransferTable.COLUMN_HEADER_CONTENT_DISPOSITION));
        this.headerContentEncoding = c.getString(c
                .getColumnIndexOrThrow(TransferTable.COLUMN_HEADER_CONTENT_ENCODING));
        this.headerCacheControl = c.getString(c
                .getColumnIndexOrThrow(TransferTable.COLUMN_HEADER_CACHE_CONTROL));
        this.headerExpire = c.getString(c
                .getColumnIndexOrThrow(TransferTable.COLUMN_HEADER_EXPIRE));
        this.userMetadata = JsonUtils.jsonToMap(c.getString(c
                .getColumnIndexOrThrow(TransferTable.COLUMN_USER_METADATA)));
        this.expirationTimeRuleId = c.getString(c
                .getColumnIndexOrThrow(TransferTable.COLUMN_EXPIRATION_TIME_RULE_ID));
        this.httpExpires = c.getString(c
                .getColumnIndexOrThrow(TransferTable.COLUMN_HTTP_EXPIRES_DATE));
        this.sseAlgorithm = c
                .getString(c.getColumnIndexOrThrow(TransferTable.COLUMN_SSE_ALGORITHM));
        this.sseKMSKey = c.getString(c.getColumnIndexOrThrow(TransferTable.COLUMN_SSE_KMS_KEY));
        this.md5 = c.getString(c.getColumnIndexOrThrow(TransferTable.COLUMN_CONTENT_MD5));
        this.cannedAcl = c.getString(c.getColumnIndexOrThrow(TransferTable.COLUMN_CANNED_ACL));
        this.headerStorageClass = c
                .getString(c.getColumnIndexOrThrow(TransferTable.COLUMN_HEADER_STORAGE_CLASS));
        this.transferUtilityOptions = gson.fromJson(c.getString(c
                .getColumnIndexOrThrow(TransferTable.COLUMN_TRANSFER_UTILITY_OPTIONS)), TransferUtilityOptions.class);
    }

    /**
     * Start a new transfer when 
     * 1) there is no existing transfer for the same transfer record
     * 2) the transfer is not completed
     * 3) the preferred network is available
     *
     * @param s3 s3 instance
     * @param dbUtil database util
     * @param updater status updater
     * @param connManager the android network connectivity manager
     * @return Whether the task is running.
     */
    public boolean start(final AmazonS3 s3, 
                         final TransferDBUtil dbUtil, 
                         final TransferStatusUpdater updater,
                         final ConnectivityManager connManager) {
        if (!isRunning() && 
            checkIsReadyToRun() && 
            checkPreferredNetworkAvailability(updater, connManager)) {
            if (type.equals(TransferType.DOWNLOAD)) {
                submittedTask = TransferThreadPool
                        .submitTask(new DownloadTask(this, s3, updater));
            } else {
                submittedTask = TransferThreadPool
                        .submitTask(new UploadTask(this, s3, dbUtil, updater));
            }
            return true;
        }
        return false;
    }

    /**
     * Pauses a running transfer.
     *
     * @param s3 s3 instance
     * @param updater status updater
     * @return true if the transfer is running and is paused successfully, false
     *         otherwise
     */
    public boolean pause(final AmazonS3 s3,
                         final TransferStatusUpdater updater) {
        if (!isFinalState(state)
                && !TransferState.PAUSED.equals(state)
                && !TransferState.PENDING_PAUSE.equals(state)) {
            updater.updateState(id, TransferState.PENDING_PAUSE);
            if (isRunning()) {
                submittedTask.cancel(true);
            }
            return true;
        }
        return false;
    }

    /**
     * Pauses a running transfer if the preferred network is not available.
     *
     * @param s3 s3 instance
     * @param updater status updater
     * @param connManager the android network connectivity manager
     * @return true if the transfer is running and is paused successfully, false
     *         otherwise
     */
    boolean pauseIfRequiredForNetworkInterruption(final AmazonS3 s3, 
                                final TransferStatusUpdater updater,
                                final ConnectivityManager connManager) {
        // Check if the transfer needs to be paused 
        if (!checkPreferredNetworkAvailability(updater, connManager)) {
            // the preferred network is not available. pause the transfer.
            if (!isFinalState(state)) {
                if (isRunning()) {
                    submittedTask.cancel(true);
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /**
     * Cancels a running transfer.
     * 
     * @param s3 s3 instance
     * @param updater status updater
     * @return true if the transfer is running and is canceled successfully,
     *         false otherwise
     */
    public boolean cancel(final AmazonS3 s3, 
                          final TransferStatusUpdater updater) {
        if (!isFinalState(state)) {
            // Update the state to PENDING_CANCEL in the TransferStatusUpdater
            // and TransferDBUtil and involves the onStateChanged callback.
            updater.updateState(id, TransferState.PENDING_CANCEL);
            if (isRunning()) {
                // State will update to CANCELED upon encountering S3 exception
                submittedTask.cancel(true);
            }
            // additional cleanup
            if (TransferType.UPLOAD.equals(type) &&
                isMultipart == 1) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            // abort the multi part upload operation
                            s3.abortMultipartUpload(
                                new AbortMultipartUploadRequest(bucketName, 
                                    key, 
                                    multipartId));
                            LOGGER.debug("Successfully clean up multipart upload: " + id);
                        } catch (final AmazonClientException e) {
                            LOGGER.debug("Failed to abort multiplart upload: " + id, e);
                        }
                    }
                }).start();
            } else if (TransferType.DOWNLOAD.equals(type)) {
                // remove the partially download file
                new File(file).delete();
            }
            return true;
        }
        return false;
    }

    /**
     * Checks whether the transfer is actively running
     *
     * @return true if the transfer is running
     */
    boolean isRunning() {
        return submittedTask != null && !submittedTask.isDone();
    }

    /**
     * Wait till transfer finishes. This method is used for testing purposes.
     *
     * @param timeout the maximum time to wait in milliseconds
     * @throws InterruptedException
     * @throws ExecutionException
     * @throws TimeoutException
     */
    void waitTillFinish(long timeout) throws InterruptedException, ExecutionException,
            TimeoutException {
        if (isRunning()) {
            submittedTask.get(timeout, TimeUnit.MILLISECONDS);
        }
    }

    /**
     * Determines whether a transfer state is a final state.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    private boolean isFinalState(TransferState state) {
        return TransferState.COMPLETED.equals(state)
                || TransferState.FAILED.equals(state)
                || TransferState.CANCELED.equals(state);
    }

    private boolean checkIsReadyToRun() {
        return partNumber == 0 && !TransferState.COMPLETED.equals(state);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("[")
                .append("id:").append(id).append(",")
                .append("bucketName:").append(bucketName).append(",")
                .append("key:").append(key).append(",")
                .append("file:").append(file).append(",")
                .append("type:").append(type).append(",")
                .append("bytesTotal:").append(bytesTotal).append(",")
                .append("bytesCurrent:").append(bytesCurrent).append(",")
                .append("fileOffset:").append(fileOffset).append(",")
                .append("state:").append(state).append(",")
                .append("cannedAcl:").append(cannedAcl).append(",")
                .append("mainUploadId:").append(mainUploadId).append(",")
                .append("isMultipart:").append(isMultipart).append(",")
                .append("isLastPart:").append(isLastPart).append(",")
                .append("partNumber:").append(partNumber).append(",")
                .append("multipartId:").append(multipartId).append(",")
                .append("eTag:").append(eTag).append(",")
                .append("storageClass:").append(headerStorageClass).append(",")
                .append("userMetadata:").append(userMetadata.toString()).append(",")
                .append("transferUtilityOptions:").append(gson.toJson(transferUtilityOptions))
                .append("]");
        return sb.toString();
    }

    /**
     * Checks if the preferred network is available. Updates state to WAITING_FOR_NETWORK if
     * the preferred network is not available
     *
     * @param updater the transfer status updater object
     * @param connManager the android connectivity manager
     * @return true if the preferred network is available, false otherwise.
     */
    protected boolean checkPreferredNetworkAvailability(final TransferStatusUpdater updater,
                                                      final ConnectivityManager connManager) {

        if (connManager == null) { 
            // Unable to get the details of the network, we will start the transfer.
            return true;
        }

        if (transferUtilityOptions != null && transferUtilityOptions.getTransferNetworkConnectionType() != null && !transferUtilityOptions.getTransferNetworkConnectionType().isConnected(connManager)) {
            // the network that is configured in the TransferUtilityOptions is not available.
            // we will set the state to WAITING_FOR_NETWORK. The transfer will be started
            // when a future notification is received for the desired network.
            LOGGER.info("Network Connection " + transferUtilityOptions.getTransferNetworkConnectionType() + " is not available.");
            updater.updateState(id, TransferState.WAITING_FOR_NETWORK);
            return false;
        }
        // Either TransferUtilityOptions was not set (in case of an upgrade)
        // or the preferred network is available. Start the transfer.
        return true;
    }
}
