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

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

import com.amazonaws.services.s3.model.PartETag;
import com.amazonaws.services.s3.model.UploadPartRequest;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Provides methods to conveniently perform database operations.
 */
class TransferDBUtil {

    /**
     * transferDBBase is a basic helper for accessing the database
     */
    private static TransferDBBase transferDBBase;

    /**
     * mapLastBytes is used to store the last updated bytes of each transfer
     * record
     */
    private final Map<Integer, Long> mapLastBytes;

    /**
     * mapLastUploadTime is used to store the last updated time of each transfer
     * record
     */
    private final Map<Integer, Long> mapLastUploadTime;

    /**
     * Constructs a TransferDBUtil with the given Context.
     *
     * @param context An instance of Context.
     */
    public TransferDBUtil(Context context) {
        if (transferDBBase == null) {
            transferDBBase = new TransferDBBase(context);
        }
        mapLastBytes = new HashMap<Integer, Long>();
        mapLastUploadTime = new HashMap<Integer, Long>();
    }

    /**
     * Closes the DB Connection
     */
    public void closeDB() {
        if (transferDBBase != null) {
            transferDBBase.closeDBHelper();
        }
    }

    /**
     * Inserts a part upload record into database with the given values.
     *
     * @param bucket The name of the bucket to upload to.
     * @param key The key in the specified bucket by which to store the new
     *            object.
     * @param file The file to upload.
     * @param fileOffset The byte offset for the file to upload.
     * @param partNumber The part number of this part.
     * @param uploadId The multipart upload id of the upload.
     * @param bytesTotal The Total bytes of the file.
     * @param isLastPart Whether this part is the last part of the upload.
     * @param isEncrypted Whether the upload is encrypted.
     * @return An Uri of the record inserted.
     */
    public Uri insertMultipartUploadRecord(String bucket, String key, File file,
            long fileOffset, int partNumber, String uploadId, long bytesTotal, int isLastPart,
            int isEncrypted) {
        ContentValues values = generateContentValuesForMultiPartUpload(bucket, key, file,
                fileOffset, partNumber, uploadId, bytesTotal, isLastPart, isEncrypted);
        return transferDBBase.insert(transferDBBase.getContentUri(), values);
    }

    /**
     * Inserts a transfer record into database with the given values.
     *
     * @param type The type of the transfer, can be "upload" or "download".
     * @param bucket The name of the bucket to upload to.
     * @param key The key in the specified bucket by which to store the new
     *            object.
     * @param file The file to upload.
     * @param isEncrypted Whether the transfer is encrypted.
     * @return An Uri of the record inserted.
     */
    public Uri insertSingleTransferRecord(TransferType type, String bucket, String key, File file,
            int isEncrypted) {
        ContentValues values = generateContentValuesForSinglePartTransfer(type, bucket, key, file,
                isEncrypted);
        return transferDBBase.insert(transferDBBase.getContentUri(), values);
    }

    /**
     * Inserts multiple records at a time.
     *
     * @param valuesArray An array of values to insert.
     * @return The mainUploadId of the multipart records
     */
    public int bulkInsertTransferRecords(ContentValues[] valuesArray) {
        return transferDBBase.bulkInsert(transferDBBase.getContentUri(), valuesArray);
    }

    /**
     * Updates the current bytes of a transfer record, but calling this method
     * may not cause the actual update. If last updated time is less than 1
     * second from now, or change of bytes is less than 10*1024, the update
     * request will be discarded. If forceUpdate is set to true, then it will
     * update the DB despite the limitation above.
     *
     * @param id The id of the transfer
     * @param bytes The bytes currently transferred
     * @param forceUpdate Whether to update now
     * @return Number of rows updated.
     */
    public int updateBytesTransferred(int id, long bytes, boolean forceUpdate) {
        long timeInMillis = System.currentTimeMillis();
        if (forceUpdate
                || !mapLastBytes.containsKey(id)
                || !mapLastUploadTime.containsKey(id)
                || (bytes - mapLastBytes.get(id) > 10 * 1024 && timeInMillis
                        - mapLastUploadTime.get(id) > 1000)) {
            ContentValues values = new ContentValues();
            values.put(TransferTable.COLUMN_BYTES_CURRENT, bytes);
            mapLastBytes.put(id, bytes);
            mapLastUploadTime.put(id, timeInMillis);
            return transferDBBase.update(getRecordUri(id), values, null, null);
        }
        return 0;
    }

    /**
     * Updates the total bytes of a download record.
     *
     * @param id The id of the transfer
     * @param bytes The total bytes of the download.
     * @return Number of rows updated.
     */
    public int updateBytesTotalForDownload(int id, long bytes) {
        ContentValues values = new ContentValues();
        values.put(TransferTable.COLUMN_BYTES_TOTAL, bytes);
        return transferDBBase.update(getRecordUri(id), values, null, null);
    }

    /**
     * Updates the state but do not notify TransferService to refresh its
     * transfer record list. Therefore, only TransferObserver knows the state
     * change of the transfer record. If the new state is STATE_FAILED, we need
     * to check the original state, because "pause", "cancel" and
     * "disconnect network" actions may also cause failure message of the
     * threads, but these are not actual failure of transfers.
     *
     * @param id The id of the transfer.
     * @param state The new state of the transfer.
     * @return Number of rows updated.
     */
    public int updateState(int id, TransferState state) {
        ContentValues values = new ContentValues();
        values.put(TransferTable.COLUMN_STATE, state.toString());
        if (TransferState.FAILED.equals(state)) {
            return transferDBBase.update(getRecordUri(id), values, TransferTable.COLUMN_STATE
                    + " not in (?,?,?,?,?) ", new String[] {
                    TransferState.COMPLETED.toString(),
                    TransferState.PENDING_NETWORK_DISCONNECT.toString(),
                    TransferState.PAUSED.toString(),
                    TransferState.CANCELED.toString(),
                    TransferState.WAITING_FOR_NETWORK.toString()
            });
        } else {
            return transferDBBase.update(getRecordUri(id), values, null, null);
        }
    }

    /**
     * Updates the state and also notify TransferService to refresh its transfer
     * record list. The method is called by TransferUtility, more typically, by
     * applications to perform "pause" or "resume" actions, so it needs to
     * explicitly notify the Service after updating the database.
     *
     * @param id The id of the transfer.
     * @param state The new state of the transfer.
     * @return Number of rows updated.
     */
    public int updateStateAndNotifyUpdate(int id, TransferState state) {
        ContentValues values = new ContentValues();
        values.put(TransferTable.COLUMN_STATE, state.toString());
        return transferDBBase.update(transferDBBase.getContentUri(), values,
                TransferTable.COLUMN_ID + "=" + id, null);
    }

    /**
     * Updates the multipart id of the transfer record.
     *
     * @param id The id of the transfer.
     * @param multipartId The multipart id of the transfer.
     * @return Number of rows updated.
     */
    public int updateMultipartId(int id, String multipartId) {
        ContentValues values = new ContentValues();
        values.put(TransferTable.COLUMN_MULTIPART_ID, multipartId);
        return transferDBBase.update(getRecordUri(id), values, null, null);
    }

    /**
     * Updates the Etag of the transfer record.
     *
     * @param id The id of the transfer.
     * @param etag The Etag of the transfer.
     * @return Number of rows updated.
     */
    public int updateETag(int id, String etag) {
        ContentValues values = new ContentValues();
        values.put(TransferTable.COLUMN_ETAG, etag);
        return transferDBBase.update(getRecordUri(id), values, null, null);
    }

    /**
     * Updates states of all transfer records which are "running" and "waiting"
     * to "network disconnect"
     *
     * @return Number of rows updated.
     */
    public int updateNetworkDisconnected() {
        ContentValues values = new ContentValues();
        values.put(TransferTable.COLUMN_STATE,
                TransferState.PENDING_NETWORK_DISCONNECT.toString());
        return transferDBBase.update(transferDBBase.getContentUri(), values,
                TransferTable.COLUMN_STATE
                        + " in (?,?,?)", new String[] {
                        TransferState.IN_PROGRESS.toString(),
                        TransferState.RESUMED_WAITING.toString(),
                        TransferState.WAITING.toString()
                });
    }

    /**
     * Updates states of all transfer records which are "waiting for network" to
     * "waiting to resume"
     *
     * @return Number of rows updated.
     */
    public int updateNetworkConnected() {
        ContentValues values = new ContentValues();
        values.put(TransferTable.COLUMN_STATE, TransferState.RESUMED_WAITING.toString());
        return transferDBBase.update(transferDBBase.getContentUri(), values,
                TransferTable.COLUMN_STATE
                        + " in (?,?)", new String[] {
                        TransferState.PENDING_NETWORK_DISCONNECT.toString(),
                        TransferState.WAITING_FOR_NETWORK.toString()
                });
    }

    /**
     * Updates states of all transfer records which are "running" and "waiting"
     * to "paused"
     *
     * @return Number of rows updated.
     */
    public int setAllRunningRecordsToPausedBeforeShutdownService() {
        ContentValues values = new ContentValues();
        values.put(TransferTable.COLUMN_STATE, TransferState.PAUSED.toString());
        return transferDBBase.update(
                transferDBBase.getContentUri(),
                values,
                TransferTable.COLUMN_STATE
                        + " in (?,?,?,?)",
                new String[] {
                        TransferState.IN_PROGRESS.toString(),
                        TransferState.PENDING_PAUSE.toString(),
                        TransferState.RESUMED_WAITING.toString(),
                        TransferState.WAITING.toString()
                });
    }

    /**
     * Updates states of all transfer records with the specified type which are
     * "running" and "waiting" to "pending pause".
     *
     * @param TransferType The type of transfers to query for.
     * @return Number of rows updated.
     */
    public int pauseAllWithType(TransferType type) {
        ContentValues values = new ContentValues();
        values.put(TransferTable.COLUMN_STATE, TransferState.PENDING_PAUSE.toString());
        String selection = null;
        String[] selectionArgs = null;
        if (type == TransferType.ANY) {
            selection = TransferTable.COLUMN_STATE + " in (?,?,?)";
            selectionArgs = new String[] {
                    TransferState.IN_PROGRESS.toString(),
                    TransferState.RESUMED_WAITING.toString(),
                    TransferState.WAITING.toString()
            };
        } else {
            selection = TransferTable.COLUMN_STATE + " in (?,?,?) and " + TransferTable.COLUMN_TYPE
                    + "=?";
            selectionArgs = new String[] {
                    TransferState.IN_PROGRESS.toString(),
                    TransferState.RESUMED_WAITING.toString(),
                    TransferState.WAITING.toString(),
                    type.toString()
            };
        }
        return transferDBBase.update(transferDBBase.getContentUri(), values, selection,
                selectionArgs);
    }

    /**
     * Updates states of all transfer records with the specified which are
     * "running" and "waiting" to "pending cancel"
     *
     * @param TransferType The type of transfers to cancel
     * @return Number of rows updated.
     */
    public int cancelAllWithType(TransferType type) {
        ContentValues values = new ContentValues();
        values.put(TransferTable.COLUMN_STATE, TransferState.PENDING_CANCEL.toString());
        String selection = null;
        String[] selectionArgs = null;
        if (type == TransferType.ANY) {
            selection = TransferTable.COLUMN_STATE + " in (?,?,?,?,?)";
            selectionArgs = new String[] {
                    TransferState.IN_PROGRESS.toString(),
                    TransferState.RESUMED_WAITING.toString(),
                    TransferState.WAITING.toString(),
                    TransferState.PAUSED.toString(),
                    TransferState.WAITING_FOR_NETWORK.toString()
            };
        } else {
            selection = TransferTable.COLUMN_STATE + " in (?,?,?,?,?) and "
                    + TransferTable.COLUMN_TYPE + "=?";
            selectionArgs = new String[] {
                    TransferState.IN_PROGRESS.toString(),
                    TransferState.RESUMED_WAITING.toString(),
                    TransferState.WAITING.toString(),
                    TransferState.PAUSED.toString(),
                    TransferState.WAITING_FOR_NETWORK.toString(),
                    type.toString()
            };
        }
        return transferDBBase.update(transferDBBase.getContentUri(), values, selection,
                selectionArgs);
    }

    /**
     * Queries all the records which have the given type.
     *
     * @param TransferType The type of transfers to query for.
     * @return A Cursor pointing to records in the database with the given type.
     */
    public Cursor queryAllTransfersWithType(TransferType type) {
        if (type == TransferType.ANY) {
            return transferDBBase.query(transferDBBase.getContentUri(), null, null, null, null);
        } else {
            return transferDBBase.query(transferDBBase.getContentUri(), null,
                    TransferTable.COLUMN_TYPE + "=?", new String[] {
                        type.toString()
                    }, null);
        }
    }

    /**
     * Queries all the records which have the given type and state.
     *
     * @param TransferType The type of transfers to query for.
     * @param TransferState The state of the transfer.
     * @return A Cursor pointing to records in the database with the given type
     *         and state.
     */
    public Cursor queryTransfersWithTypeAndState(TransferType type, TransferState state) {
        if (type == TransferType.ANY) {
            return transferDBBase.query(getStateUri(state), null, null,
                    null, null);
        } else {
            return transferDBBase.query(getStateUri(state), null, TransferTable.COLUMN_TYPE + "=?",
                    new String[] {
                        type.toString()
                    }, null);
        }
    }

    /**
     * Queries the transfer record specified by id.
     *
     * @param id The id of the transfer.
     * @return The result Cursor of the query.
     */
    public Cursor queryTransferById(int id) {
        return transferDBBase.query(getRecordUri(id), null, null, null, null);
    }

    /**
     * Queries the transfer record specified by main upload id.
     *
     * @param mainUploadId The mainUploadId of a multipart upload task
     * @return The bytes already uploaded for this multipart upload task
     */
    public long queryBytesTransferredByMainUploadId(int mainUploadId) {
        Cursor c = transferDBBase.query(getPartUri(mainUploadId), null, null, null, null);
        long bytesTotal = 0;
        while (c.moveToNext()) {
            String state = c.getString(c.getColumnIndexOrThrow(TransferTable.COLUMN_STATE));
            if (TransferState.PART_COMPLETED.equals(TransferState.getState(state))) {
                bytesTotal += c.getLong(c
                        .getColumnIndexOrThrow(TransferTable.COLUMN_BYTES_TOTAL));
            }
        }
        c.close();
        return bytesTotal;
    }

    /**
     * Deletes the record with the given id.
     *
     * @param id The id of the transfer to be deleted.
     * @return Number of rows deleted.
     */
    public int deleteTransferRecords(int id) {
        return transferDBBase.delete(getRecordUri(id), null, null);
    }

    /**
     * Queries all the PartETags of completed parts from the multipart upload
     * specified by the mainUploadId. The list of PartETags is used to complete
     * a multiart upload, so it's usually called after all partUpload tasks are
     * finished.
     *
     * @param mainUploadId The mainUploadId of a multipart upload task
     * @return A list of PartEtag of completed parts
     */
    public List<PartETag> queryPartETagsOfUpload(int mainUploadId) {
        List<PartETag> partETags = new ArrayList<PartETag>();
        Cursor c = transferDBBase.query(getPartUri(mainUploadId), null, null, null, null);
        int partNum = 0;
        String eTag = null;
        while (c.moveToNext()) {
            partNum = c.getInt(c.getColumnIndexOrThrow(TransferTable.COLUMN_PART_NUM));
            eTag = c.getString(c.getColumnIndexOrThrow(TransferTable.COLUMN_ETAG));
            partETags.add(new PartETag(partNum, eTag));
        }
        c.close();
        return partETags;
    }

    /**
     * Queries uncompleted partUpload tasks of a multipart upload and constructs
     * a UploadPartRequest for each task. It's used when resuming a multipart
     * upload
     *
     * @param mainUploadId The mainUploadId of a multipart upload task
     * @param multipartId The multipartId of a multipart upload task
     * @return A list of UploadPartRequest
     */
    public List<UploadPartRequest> getNonCompletedPartRequestsFromDB(int mainUploadId,
            String multipartId) {
        ArrayList<UploadPartRequest> list = new ArrayList<UploadPartRequest>();
        Cursor c = transferDBBase.query(getPartUri(mainUploadId), null, null, null, null);
        while (c.moveToNext()) {
            if (TransferState.PART_COMPLETED.equals(TransferState.getState(c.getString(c
                    .getColumnIndexOrThrow(TransferTable.COLUMN_STATE))))) {
                continue;
            }
            UploadPartRequest putPartRequest = new UploadPartRequest()
                    .withId(c.getInt(c.getColumnIndexOrThrow(TransferTable.COLUMN_ID)))
                    .withMainUploadId(
                            c.getInt(c.getColumnIndexOrThrow(TransferTable.COLUMN_MAIN_UPLOAD_ID)))
                    .withBucketName(
                            c.getString(c.getColumnIndexOrThrow(TransferTable.COLUMN_BUCKET_NAME)))
                    .withKey(c.getString(c.getColumnIndexOrThrow(TransferTable.COLUMN_KEY)))
                    .withUploadId(multipartId)
                    .withFile(new File(
                            c.getString(c.getColumnIndexOrThrow(TransferTable.COLUMN_FILE))))
                    .withFileOffset(
                            c.getLong(c.getColumnIndexOrThrow(TransferTable.COLUMN_FILE_OFFSET)))
                    .withPartNumber(
                            c.getInt(c.getColumnIndexOrThrow(TransferTable.COLUMN_PART_NUM)))
                    .withPartSize(
                            c.getLong(c.getColumnIndexOrThrow(TransferTable.COLUMN_BYTES_TOTAL)))
                    .withLastPart(1 == c.getInt(c
                            .getColumnIndexOrThrow(TransferTable.COLUMN_IS_LAST_PART)));
            list.add(putPartRequest);
        }
        c.close();
        return list;
    }

    /**
     * Generates a ContentValues object to insert into the database with the
     * given values for a multipart upload record.
     *
     * @param bucket The name of the bucket to upload to.
     * @param key The key in the specified bucket by which to store the new
     *            object.
     * @param file The file to upload.
     * @param fileOffset The byte offset for the file to upload.
     * @param partNumber The part number of this part.
     * @param uploadId The multipart upload id of the upload.
     * @param bytesTotal The Total bytes of the file.
     * @param isLastPart Whether this part is the last part of the upload.
     * @param isEncrypted Whether the upload is encrypted.
     * @return The ContentValues object generated.
     */
    public ContentValues generateContentValuesForMultiPartUpload(String bucket,
            String key, File file, long fileOffset, int partNumber, String uploadId,
            long bytesTotal, int isLastPart, int isEncrypted) {
        ContentValues values = new ContentValues();
        values.put(TransferTable.COLUMN_TYPE, TransferType.UPLOAD.toString());
        values.put(TransferTable.COLUMN_STATE, TransferState.WAITING.toString());
        values.put(TransferTable.COLUMN_BUCKET_NAME, bucket);
        values.put(TransferTable.COLUMN_KEY, key);
        values.put(TransferTable.COLUMN_FILE, file.getAbsolutePath());
        values.put(TransferTable.COLUMN_BYTES_CURRENT, 0l);
        values.put(TransferTable.COLUMN_BYTES_TOTAL, bytesTotal);
        values.put(TransferTable.COLUMN_IS_MULTIPART, 1);
        values.put(TransferTable.COLUMN_PART_NUM, partNumber);
        values.put(TransferTable.COLUMN_FILE_OFFSET, fileOffset);
        values.put(TransferTable.COLUMN_MULTIPART_ID, uploadId);
        values.put(TransferTable.COLUMN_IS_LAST_PART, isLastPart);
        values.put(TransferTable.COLUMN_IS_ENCRYPTED, isEncrypted);
        return values;
    }

    /**
     * Generates a ContentValues object to insert into the database with the
     * given values for a single chunk upload or download.
     *
     * @param type The type of the transfer, can be "upload" or "download".
     * @param bucket The name of the bucket to upload to.
     * @param key The key in the specified bucket by which to store the new
     *            object.
     * @param file The file to upload.
     * @param isEncrypted Whether the transfer is encrypted.
     * @return The ContentValues object generated.
     */
    private ContentValues generateContentValuesForSinglePartTransfer(TransferType type,
            String bucket, String key, File file, int isEncrypted) {
        ContentValues values = new ContentValues();
        values.put(TransferTable.COLUMN_TYPE, type.toString());
        values.put(TransferTable.COLUMN_STATE, TransferState.WAITING.toString());
        values.put(TransferTable.COLUMN_BUCKET_NAME, bucket);
        values.put(TransferTable.COLUMN_KEY, key);
        values.put(TransferTable.COLUMN_FILE, file.getAbsolutePath());
        values.put(TransferTable.COLUMN_BYTES_CURRENT, 0l);
        if (type.equals(TransferType.UPLOAD))
            values.put(TransferTable.COLUMN_BYTES_TOTAL, file == null ? 0l : file.length());
        values.put(TransferTable.COLUMN_IS_MULTIPART, 0);
        values.put(TransferTable.COLUMN_PART_NUM, 0);
        values.put(TransferTable.COLUMN_IS_ENCRYPTED, isEncrypted);
        return values;
    }

    /**
     * Gets the Uri of the transfer record table.
     *
     * @return The Uri of a table.
     */
    public Uri getContentUri() {
        return transferDBBase.getContentUri();
    }

    /**
     * Gets the Uri of a record.
     *
     * @param id The id of the transfer.
     * @return The Uri of the record specified by the id.
     */
    public Uri getRecordUri(int id) {
        return Uri.parse(transferDBBase.getContentUri() + "/" + id);
    }

    /**
     * Gets the Uri of part records of a multipart upload.
     *
     * @param mainUploadId The main upload id of the transfer.
     * @return The Uri of the part upload records that have the given
     *         mainUploadId value.
     */
    public Uri getPartUri(int mainUploadId) {
        return Uri.parse(transferDBBase.getContentUri() + "/part/" + mainUploadId);
    }

    /**
     * Gets the Uri of the records that have the given state.
     *
     * @param state The state of transfers
     * @return The Uri that is used to query transfer records with the given
     *         state.
     */
    public Uri getStateUri(TransferState state) {
        return Uri.parse(transferDBBase.getContentUri() + "/state/" + state.toString());
    }
}
