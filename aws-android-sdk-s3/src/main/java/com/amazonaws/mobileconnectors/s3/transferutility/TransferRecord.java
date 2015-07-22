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

import android.database.Cursor;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;

import java.util.concurrent.Future;

/**
 * TransferRecord is used to store all the information of a transfer and
 * start/stop the a thread for the transfer task.
 */
class TransferRecord {
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

    private final AmazonS3 s3;
    private Future<?> submittedTask;

    /**
     * Constructs a TransferRecord and initializes the transfer id and S3
     * client.
     *
     * @param id The id of a transfer.
     * @param s3 A low-level S3 client.
     */
    public TransferRecord(int id, AmazonS3 s3) {
        this.id = id;
        this.s3 = s3;
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
    }

    /**
     * Checks the state of the transfer and starts a thread to run the transfer
     * task if possible.
     *
     * @return Whether the task is running.
     */
    public boolean startIfReady(TransferDBUtil dbUtil) {
        boolean isReady = checkIsReadyToRun();
        boolean isActive = submittedTask != null && !submittedTask.isDone();
        if (isReady && !isActive) {
            if (type.equals(TransferType.DOWNLOAD)) {
                submittedTask = TransferThreadPool.submitTask(new DownloadTask(this, s3, dbUtil));
            } else {
                submittedTask = TransferThreadPool.submitTask(new UploadTask(this, s3, dbUtil));
            }
        }
        return isReady || isActive;
    }

    /**
     * Checks the state of the transfer and stops the running thread if needed.
     *
     * @return Whether the transfer task is stopped.
     */
    public boolean pauseOrCancelIfRequested(TransferDBUtil dbUtil) {
        if (state.equals(TransferState.PENDING_PAUSE)) {
            dbUtil.updateState(id, TransferState.PAUSED);
            cancelTask();
            return true;
        } else if (state.equals(TransferState.PENDING_NETWORK_DISCONNECT)) {
            dbUtil.updateState(id, TransferState.WAITING_FOR_NETWORK);
            cancelTask();
            return true;
        } else if (state.equals(TransferState.PENDING_CANCEL)) {
            cancelTask();
            if (isMultipart == 1) {
                try {
                    s3.abortMultipartUpload(new AbortMultipartUploadRequest(bucketName, key,
                            multipartId));
                } catch (Exception e) {
                    return false;
                }
                // Make sure the abortMultipartUpload doesn't throw an exception
                // before we mark it as fully canceled
                dbUtil.updateState(id, TransferState.CANCELED);

            } else {
                dbUtil.updateState(id, TransferState.CANCELED);
            }
            return true;
        }
        return false;
    }

    private void cancelTask() {
        if (submittedTask != null && !submittedTask.isDone()) {
            submittedTask.cancel(true);
        }
    }

    private boolean checkIsReadyToRun() {
        if (partNumber > 0) {
            return false;
        }
        if (state.equals(TransferState.WAITING)) {
            return true;
        } else if (state.equals(TransferState.RESUMED_WAITING)) {
            return true;
        } else {
            return false;
        }
    }
}
