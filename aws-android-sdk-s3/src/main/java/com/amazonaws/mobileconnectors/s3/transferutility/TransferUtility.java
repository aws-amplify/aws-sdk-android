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

import static com.amazonaws.services.s3.internal.Constants.MAXIMUM_UPLOAD_PARTS;
import static com.amazonaws.services.s3.internal.Constants.MB;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3EncryptionClient;
import com.amazonaws.util.VersionInfoUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * The transfer manager is a high-level class for applications to upload and
 * download files. It inserts upload and download records into the database and
 * starts a Service to execute the tasks in the background. Here is the usage:
 *
 * <pre>
 * // Initializes TransferUtility
 * TransferUtility transferManager = new TransferUtility(s3, getApplicationContext());
 * // Starts a download
 * TransferObserver observer = transferManager.download(&quot;bucket_name&quot;, &quot;key&quot;, file);
 * observer.setTransferListener(new TransferListener() {
 *     public void onStateChanged(int id, String newState) {
 *         // Do something in the callback.
 *     }
 * 
 *     public void onProgressChanged(int id, long bytesCurrent, long bytesTotal) {
 *         // Do something in the callback.
 *     }
 * 
 *     public void onError(int id, Exception e) {
 *         // Do something in the callback.
 *     }
 * });
 * </pre>
 *
 * For pausing and resuming tasks:
 *
 * <pre>
 * // Gets id of the transfer.
 * int id = observer.getId();
 * 
 * // Pauses the transfer.
 * transferManager.pause(id);
 * 
 * // Resumes the transfer.
 * transferManager.resume(id);
 * </pre>
 *
 * For cancelling and deleting tasks:
 *
 * <pre>
 * // Cancels the transfer.
 * transferManager.cancel(id);
 * 
 * // Deletes the transfer.
 * transferManager.delete(id);
 * </pre>
 */
public class TransferUtility {

    static final String KEY_FOR_S3_WEAK_REFERENCE = "keyForS3WeakReference";

    private final AmazonS3 s3;
    private final Context appContext;
    private final String s3WeakReferenceMapKey;
    private final TransferDBUtil dbUtil;

    /**
     * Default minimum part size for upload parts. Anything below this will use
     * a single upload
     */
    static final int MINIMUM_UPLOAD_PART_SIZE = 5 * MB;

    /**
     * Constructs a new TransferUtility specifying the client to use and
     * initializes configuration of TransferUtility and a key for S3 client weak
     * reference.
     *
     * @param s3 The client to use when making requests to Amazon S3
     * @param context The application context
     * @param configuration Configuration parameters for this TransferUtility
     */
    public TransferUtility(AmazonS3 s3, Context context) {
        this.s3 = s3;
        this.s3WeakReferenceMapKey = UUID.randomUUID().toString();
        S3ClientWeakReference.put(s3WeakReferenceMapKey, s3);
        this.appContext = context.getApplicationContext();
        this.dbUtil = new TransferDBUtil(context);
    }

    /**
     * Starts downloading the file specified by the bucket and the key.
     *
     * @param bucket The name of the bucket containing the object to download.
     * @param key The key under which the object to download is stored.
     * @param file The file to download the object's data to.
     * @return A TransferObserver used to track download progress and state
     */
    public TransferObserver download(String bucket, String key, File file) {
        Intent intent = new Intent(appContext, TransferService.class);
        intent.putExtra(KEY_FOR_S3_WEAK_REFERENCE, s3WeakReferenceMapKey);
        appContext.startService(intent);
        boolean isUsingEncryption = s3 instanceof AmazonS3EncryptionClient;
        Uri uri = dbUtil.insertSingleTransferRecord(TransferType.DOWNLOAD,
                bucket, key, file, isUsingEncryption ? 1 : 0);
        int recordId = Integer.parseInt(uri.getLastPathSegment());
        return new TransferObserver(recordId, appContext, 0);
    }

    /**
     * Starts uploading the file to the position specified by the given bucket
     * and key.
     *
     * @param bucket The name of the bucket to upload the new object to.
     * @param key The key in the specified bucket by which to store the new
     *            object.
     * @param file The file to upload.
     * @return A TransferObserver used to track upload progress and state
     */
    public TransferObserver upload(String bucket, String key, File file) {

        Intent intent = new Intent(appContext, TransferService.class);
        intent.putExtra(KEY_FOR_S3_WEAK_REFERENCE, s3WeakReferenceMapKey);
        appContext.startService(intent);
        int recordId = 0;
        boolean isUsingEncryption = false;
        if (shouldUploadInMultipart(file)) {
            recordId = createMultipartUploadRecords(bucket, key, file, isUsingEncryption);
        } else {

            Uri uri = dbUtil.insertSingleTransferRecord(TransferType.UPLOAD,
                    bucket, key, file, isUsingEncryption ? 1 : 0);
            recordId = Integer.parseInt(uri.getLastPathSegment());
        }
        return new TransferObserver(recordId, appContext, file.length());
    }

    /**
     * Gets a TransferObserver instance to track the record with the given id.
     *
     * @param id A transfer id.
     * @return The TransferObserver instance which is observing the record.
     */
    public TransferObserver getTransferById(int id) {
        Cursor c = dbUtil.queryTransferById(id);
        if (c == null)
            return null;
        c.moveToFirst();
        long totalBytesOfFile = c
                .getLong(c.getColumnIndexOrThrow(TransferTable.COLUMN_BYTES_TOTAL));
        c.close();
        return new TransferObserver(id, appContext, totalBytesOfFile);
    }

    /**
     * Gets a list of TransferObserver instances which are observing records
     * with the given type.
     *
     * @param type The type of the transfer "any".
     * @return A list of TransferObserver instances.
     */
    public List<TransferObserver> getTransfersWithType(TransferType type) {
        List<TransferObserver> transferObservers = new ArrayList<TransferObserver>();
        Cursor c = dbUtil.queryAllTransfersWithType(type);
        if (c == null) {
            return transferObservers;
        }
        while (c.moveToNext()) {
            transferObservers.add(new TransferObserver((int) c.getLong(c
                    .getColumnIndexOrThrow(TransferTable.COLUMN_ID)), appContext, c.getLong(c
                    .getColumnIndexOrThrow(TransferTable.COLUMN_BYTES_TOTAL))));
        }
        c.close();
        return transferObservers;
    }

    /**
     * Gets a list of TransferObserver instances which are observing records
     * with the given type.
     *
     * @param type The type of the transfer.
     * @param state The state of the transfer.
     * @return A list of TransferObserver of transfer records with the given
     *         type and state.
     */
    public List<TransferObserver> getTransfersWithTypeAndState(TransferType type,
            TransferState state) {
        List<TransferObserver> transferObservers = new ArrayList<TransferObserver>();
        Cursor c = dbUtil.queryTransfersWithTypeAndState(type, state);
        if (c == null) {
            return transferObservers;
        }
        while (c.moveToNext()) {
            transferObservers.add(new TransferObserver((int) c.getLong(c
                    .getColumnIndexOrThrow(TransferTable.COLUMN_ID)), appContext, c.getLong(c
                    .getColumnIndexOrThrow(TransferTable.COLUMN_BYTES_TOTAL))));
        }
        c.close();
        return transferObservers;
    }

    /**
     * Inserts a multipart summary record and actual part records into database
     *
     * @param bucket The name of the bucket to upload the new object to.
     * @param key The key in the specified bucket by which to store the new
     *            object.
     * @param file The file to upload.
     * @param isUsingEncryption Whether the upload is encrypted.
     * @return Number of records created in database
     */
    private int createMultipartUploadRecords(String bucket, String key, File file,
            boolean isUsingEncryption) {
        long remainingLenth = file.length();
        double partSize = (double) remainingLenth / (double) MAXIMUM_UPLOAD_PARTS;
        partSize = Math.ceil(partSize);
        long optimalPartSize = (long) Math.max(partSize, MINIMUM_UPLOAD_PART_SIZE);
        if (isUsingEncryption && optimalPartSize % 32 > 0) {
            /*
             * When using encryption, parts must line up correctly along cipher
             * block boundaries
             */
            optimalPartSize = optimalPartSize - (optimalPartSize % 32) + 32;
        }
        long fileOffset = 0;
        int partNumber = 1;

        // the number of parts
        int partCount = (int) Math.ceil((double) remainingLenth / (double) optimalPartSize);

        /*
         * the size of valuesArray is partCount + 1, one for a multipart upload
         * summary, others are actual parts to be uploaded
         */
        ContentValues[] valuesArray = new ContentValues[partCount + 1];
        valuesArray[0] = dbUtil.generateContentValuesForMultiPartUpload(bucket, key,
                file, fileOffset, 0, "", file.length(), 0, isUsingEncryption ? 1 : 0);
        for (int i = 1; i < partCount + 1; i++) {
            long bytesForPart = Math.min(optimalPartSize, remainingLenth);
            valuesArray[i] = dbUtil.generateContentValuesForMultiPartUpload(bucket, key,
                    file, fileOffset, partNumber, "", bytesForPart, remainingLenth
                            - optimalPartSize <= 0 ? 1 : 0, isUsingEncryption ? 1 : 0);
            fileOffset += optimalPartSize;
            remainingLenth -= optimalPartSize;
            partNumber++;
        }
        return dbUtil.bulkInsertTransferRecords(valuesArray);
    }

    /**
     * Pauses a transfer task with the given id.
     *
     * @param id A transfer id specifying the transfer to be paused
     * @return Whether successfully paused
     */
    public boolean pause(int id) {
        Cursor c = dbUtil.queryTransferById(id);
        if (c == null) {
            return false;
        }
        c.moveToFirst();
        TransferState state = TransferState.getState(c.getString(c
                .getColumnIndexOrThrow(TransferTable.COLUMN_STATE)));
        c.close();
        if (TransferState.IN_PROGRESS.equals(state)
                || TransferState.RESUMED_WAITING.equals(state)
                || TransferState.WAITING.equals(state)) {
            return dbUtil.updateStateAndNotifyUpdate(id,
                    TransferState.PENDING_PAUSE) > 0;
        }
        return false;
    }

    /**
     * Pauses all transfers which have the given type.
     *
     * @param type The type of transfers
     */
    public void pauseAllWithType(TransferType type) {
        dbUtil.pauseAllWithType(type);
    }

    /**
     * Resumes the transfer task with the given id.
     *
     * @param id A transfer id specifying the transfer to be resumed
     * @return A TransferObserver of the resumed upload/download or null if the
     *         ID does not represent a paused transfer
     */
    public TransferObserver resume(int id) {
        Intent intent = new Intent(appContext, TransferService.class);
        intent.putExtra(KEY_FOR_S3_WEAK_REFERENCE, s3WeakReferenceMapKey);
        appContext.startService(intent);
        Cursor c = dbUtil.queryTransferById(id);
        if (c == null) {
            return null;
        }
        c.moveToFirst();
        TransferState state = TransferState.getState(c.getString(c
                .getColumnIndexOrThrow(TransferTable.COLUMN_STATE)));
        c.close();
        if (TransferState.PAUSED.equals(state)) {
            if (dbUtil.updateStateAndNotifyUpdate(id,
                    TransferState.RESUMED_WAITING) > 0) {
                return getTransferById(id);
            }
        }
        return null;
    }

    /**
     * Cancels the transfer task with the given id.
     *
     * @param id A transfer id specifying the transfer to be canceled
     * @return Whether successfully canceled
     */
    public boolean cancel(int id) {
        Cursor c = dbUtil.queryTransferById(id);
        if (c == null) {
            return false;
        }
        c.moveToFirst();
        TransferState state = TransferState.getState(c.getString(c
                .getColumnIndexOrThrow(TransferTable.COLUMN_STATE)));
        c.close();
        if (TransferState.IN_PROGRESS.equals(state)
                || TransferState.RESUMED_WAITING.equals(state)
                || TransferState.WAITING.equals(state)
                || TransferState.PAUSED.equals(state)
                || TransferState.WAITING_FOR_NETWORK.equals(state)) {
            return dbUtil.updateStateAndNotifyUpdate(id,
                    TransferState.PENDING_CANCEL) > 0;
        }
        return false;
    }

    /**
     * Cancels all transfers which have the given type.
     *
     * @param type The type of transfers
     */
    public void cancelAllWithType(TransferType type) {
        dbUtil.cancelAllWithType(type);
    }

    /**
     * Deletes a transfer record with the given id. It just deletes the record
     * but does not stop the running thread, so you must cancel the task before
     * deleting the record.
     *
     * @param id A transfer id specifying the transfer to be deleted.
     * @return true if at least one record was deleted
     */
    public boolean deleteTransferRecord(int id) {
        return dbUtil.deleteTransferRecords(id) > 0;
    }

    private boolean shouldUploadInMultipart(File file) {
        if (file != null
                && file.length() > MINIMUM_UPLOAD_PART_SIZE) {
            return true;
        } else {
            return false;
        }
    }

    static <X extends AmazonWebServiceRequest> X appendTransferServiceUserAgentString(X request) {
        request.getRequestClientOptions().appendUserAgent("TransferService/"
                + VersionInfoUtils.getVersion());
        return request;
    }

    static <X extends AmazonWebServiceRequest> X appendMultipartTransferServiceUserAgentString(
            X request) {
        request.getRequestClientOptions().appendUserAgent("TransferService_multipart/"
                + VersionInfoUtils.getVersion());
        return request;
    }

}
