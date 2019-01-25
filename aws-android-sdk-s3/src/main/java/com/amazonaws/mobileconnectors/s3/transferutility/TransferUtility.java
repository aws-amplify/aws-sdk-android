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

import static com.amazonaws.services.s3.internal.Constants.MAXIMUM_UPLOAD_PARTS;
import static com.amazonaws.services.s3.internal.Constants.MB;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import org.json.JSONObject;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.mobile.config.AWSConfiguration;
import com.amazonaws.regions.Region;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.util.VersionInfoUtils;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * The transfer utility is a high-level class for applications to upload and
 * download files. It inserts upload and download records into the database and
 * starts a Service to execute the tasks in the background. Here is the usage:
 *
 * <pre>
 * // Initializes TransferUtility
 * TransferUtility transferUtility = new TransferUtility(s3, getApplicationContext());
 * // Starts a download
 * TransferObserver observer = transferUtility.download(&quot;bucket_name&quot;, &quot;key&quot;, file);
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
 * transferUtility.pause(id);
 * 
 * // Pause all the transfers.
 * transferUtility.pauseAllWithType(TransferType.ANY);
 *
 * // Resumes the transfer.
 * transferUtility.resume(id);
 * 
 * // Resume all the transfers.
 * transferUtility.resumeAllWithType(TransferType.ANY);
 * 
 * </pre>
 * 
 * For canceling and deleting tasks:
 *
 * <pre>
 * // Cancels the transfer.
 * transferUtility.cancel(id);
 * 
 * // Cancel all the transfers.
 * transferUtility.cancelAllWithType(TransferType.ANY);
 *
 * // Deletes the transfer.
 * transferUtility.delete(id);
 * </pre>
 */
public class TransferUtility {

    private static final Log LOGGER = LogFactory.getLog(TransferUtility.class);

    /**
     * The status updater that updates the state and the progress of the transfer in
     * memory and persists to the database.
     */
    private TransferStatusUpdater updater;

    /**
     * The dbUtil instance.
     */
    private TransferDBUtil dbUtil;

    /**
     * Lock to synchronize access to the user-agent-string.
     */
    private static final Object LOCK = new Object();

    /**
     * Constants that indicate the type of the transfer operation.
     */
    private static final String TRANSFER_ADD = "add_transfer";
    private static final String TRANSFER_PAUSE = "pause_transfer";
    private static final String TRANSFER_RESUME = "resume_transfer";
    private static final String TRANSFER_CANCEL = "cancel_transfer";

    /**
     * Default minimum part size for upload parts. Anything below this will use a
     * single upload
     */
    static final int MINIMUM_UPLOAD_PART_SIZE = 5 * MB;

    private static String userAgentFromConfig = "";

    private static void setUserAgentFromConfig(String userAgent) {
        synchronized (LOCK) {
            TransferUtility.userAgentFromConfig = userAgent;
        }
    }

    private static String getUserAgentFromConfig() {
        synchronized (LOCK) {
            if (TransferUtility.userAgentFromConfig == null || TransferUtility.userAgentFromConfig.trim().isEmpty()) {
                return "";
            }
            return TransferUtility.userAgentFromConfig.trim() + "/";
        }
    }

    private final AmazonS3 s3;
    private final String defaultBucket;
    private final TransferUtilityOptions transferUtilityOptions;

    /**
     * Builder class for TransferUtility
     */
    public static class Builder {
        private AmazonS3 s3;
        private Context appContext;
        private String defaultBucket;
        private AWSConfiguration awsConfig;
        private TransferUtilityOptions transferUtilityOptions;

        protected Builder() {
        }

        /**
         * Sets the underlying S3 client used for transfers.
         * 
         * @param s3Client The S3 client.
         * @return builder
         */
        public Builder s3Client(final AmazonS3 s3Client) {
            this.s3 = s3Client;
            return this;
        }

        /**
         * Sets the context used.
         * 
         * @param applicationContext The application context.
         * @return builder
         */
        public Builder context(final Context applicationContext) {
            this.appContext = applicationContext.getApplicationContext();
            return this;
        }

        /**
         * Sets the default bucket used for uploads and downloads. This allows you to
         * use the corresponding methods that do not require the bucket name to be
         * specified.
         * 
         * @param bucket The bucket name.
         * @return builder
         */
        public Builder defaultBucket(final String bucket) {
            this.defaultBucket = bucket;
            return this;
        }

        /**
         * Sets the region of the underlying S3 client and the default bucket used for
         * uploads and downloads. This allows you to use the corresponding methods that
         * do not require the bucket name to be specified. These values are retrieved
         * from the AWSConfiguration argument.
         * 
         * Example awsconfiguration.json contents: { "S3TransferUtility": { "Default": {
         * "Bucket": "exampleBucket", "Region": "us-east-1" } } }
         * 
         * @param awsConfiguration The configuration.
         * @return builder
         */
        public Builder awsConfiguration(AWSConfiguration awsConfiguration) {
            this.awsConfig = awsConfiguration;
            return this;
        }

        /**
         * Sets the TransferUtilityOptions for this TransferUtility instance. Currently,
         * this includes the option to override the time interval to periodically resume
         * unfinished transfers by the TransferService and the size of the transfer
         * thread pool which is shared across the different transfers.
         * 
         * Example:
         * 
         * TransferUtilityOptions tuOptions = new TransferUtilityOptions();
         * tuConfig.setTransferServiceCheckTimeInterval(5);
         * tuConfig.setTransferThreadPoolSize(10);
         * 
         * TransferUtility tu = TransferUtility .builder()
         * .transferUtilityOptions(tuOptions) .build();
         * 
         * @param tuOptions The TransferUtility Options object
         * @return builder
         */
        public Builder transferUtilityOptions(final TransferUtilityOptions tuOptions) {
            this.transferUtilityOptions = tuOptions;
            return this;
        }

        /**
         * 
         * @return TransferUtility
         */
        public TransferUtility build() {
            if (this.s3 == null) {
                throw new IllegalArgumentException(
                        "AmazonS3 client is required please set using .s3Client(yourClient)");
            } else if (this.appContext == null) {
                throw new IllegalArgumentException("Context is required please set using .context(applicationContext)");
            }

            if (this.awsConfig != null) {
                try {
                    final JSONObject tuConfig = this.awsConfig.optJsonObject("S3TransferUtility");
                    this.s3.setRegion(Region.getRegion(tuConfig.getString("Region")));
                    this.defaultBucket = tuConfig.getString("Bucket");

                    TransferUtility.setUserAgentFromConfig(this.awsConfig.getUserAgent());
                } catch (Exception e) {
                    throw new IllegalArgumentException("Failed to read S3TransferUtility "
                            + "please check your setup or awsconfiguration.json file", e);
                }
            }

            if (this.transferUtilityOptions == null) {
                this.transferUtilityOptions = new TransferUtilityOptions();
            }

            return new TransferUtility(this.s3, this.appContext, this.defaultBucket, this.transferUtilityOptions);
        }
    }

    /**
     * Minimum calls required.
     * TransferUtility.builder().s3Client(s3).context(context).build()
     * 
     * @return The builder object to construct a TransferUtility.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Constructor.
     * 
     * @param s3            The client to use when making requests to Amazon S3
     * @param context       The current context
     * @param defaultBucket The name of the default S3 bucket
     * @param tuOptions     The TransferUtility Options object
     */
    private TransferUtility(AmazonS3 s3, Context context, String defaultBucket, TransferUtilityOptions tuOptions) {
        this.s3 = s3;
        this.defaultBucket = defaultBucket;
        this.transferUtilityOptions = tuOptions;
        this.dbUtil = new TransferDBUtil(context.getApplicationContext());
        this.updater = TransferStatusUpdater.getInstance(context.getApplicationContext());
        TransferThreadPool.init(this.transferUtilityOptions.getTransferThreadPoolSize());
    }

    /**
     * Constructs a new TransferUtility specifying the client to use and initializes
     * configuration of TransferUtility and a key for S3 client weak reference.
     *
     * @param s3      The client to use when making requests to Amazon S3
     * @param context The current context
     * 
     * @deprecated Please use
     *             TransferUtility.builder().s3Client(s3).context(context).build()
     */
    @Deprecated
    public TransferUtility(AmazonS3 s3, Context context) {
        this.s3 = s3;
        this.defaultBucket = null;
        this.transferUtilityOptions = new TransferUtilityOptions();
        this.dbUtil = new TransferDBUtil(context.getApplicationContext());
        this.updater = TransferStatusUpdater.getInstance(context.getApplicationContext());
        TransferThreadPool.init(this.transferUtilityOptions.getTransferThreadPoolSize());
    }

    private String getDefaultBucketOrThrow() {
        if (this.defaultBucket == null) {
            throw new IllegalArgumentException(
                    "TransferUtility has not been " + "configured with a default bucket. Please use the "
                            + "corresponding method that specifies bucket name or "
                            + "configure the default bucket name in construction of "
                            + "the object. See TransferUtility.builder().defaultBucket() "
                            + "or TransferUtility.builder().awsConfiguration()");
        }
        return this.defaultBucket;
    }

    /**
     * Starts downloading the S3 object specified by the bucket and the key to the
     * given file. The file must be a valid file. Directory isn't supported. Note
     * that if the given file exists, it'll be overwritten.
     *
     * @param bucket The name of the bucket containing the object to download.
     * @param key    The key under which the object to download is stored.
     * @param file   The file to download the object's data to.
     * @return A TransferObserver used to track download progress and state
     */
    public TransferObserver download(String bucket, String key, File file) {
        return download(bucket, key, file, null);
    }

    /**
     * Starts downloading the S3 object specified by the <b>default</b> bucket and
     * the key to the given file. The file must be a valid file. Directory isn't
     * supported. Note that if the given file exists, it'll be overwritten.
     *
     * @param key  The key under which the object to download is stored.
     * @param file The file to download the object's data to.
     * @return A TransferObserver used to track download progress and state
     */
    public TransferObserver download(String key, File file) {
        return download(getDefaultBucketOrThrow(), key, file, null);
    }

    /**
     * Starts downloading the S3 object specified by the bucket and the key to the
     * given file. The file must be a valid file. Directory isn't supported. Note
     * that if the given file exists, it'll be overwritten.
     *
     * @param bucket   The name of the bucket containing the object to download.
     * @param key      The key under which the object to download is stored.
     * @param file     The file to download the object's data to.
     * @param listener a listener to attach to transfer observer.
     * @return A TransferObserver used to track download progress and state
     */
    public TransferObserver download(String bucket, String key, File file, TransferListener listener) {
        if (file == null || file.isDirectory()) {
            throw new IllegalArgumentException("Invalid file: " + file);
        }
        final Uri uri = dbUtil.insertSingleTransferRecord(TransferType.DOWNLOAD, bucket, key, file);
        final int recordId = Integer.parseInt(uri.getLastPathSegment());
        if (file.isFile()) {
            LOGGER.warn("Overwrite existing file: " + file);
            file.delete();
        }

        submitTransferJob(TRANSFER_ADD, recordId);
        return new TransferObserver(recordId, dbUtil, bucket, key, file, listener);
    }

    /**
     * Starts downloading the S3 object specified by the <b>default</b> bucket and
     * the key to the given file. The file must be a valid file. Directory isn't
     * supported. Note that if the given file exists, it'll be overwritten.
     *
     * @param key      The key under which the object to download is stored.
     * @param file     The file to download the object's data to.
     * @param listener a listener to attach to transfer observer.
     * @return A TransferObserver used to track download progress and state
     */
    public TransferObserver download(String key, File file, TransferListener listener) {
        return download(getDefaultBucketOrThrow(), key, file, listener);
    }

    /**
     * Starts uploading the file to the given bucket, using the given key. The file
     * must be a valid file. Directory isn't supported.
     *
     * @param bucket The name of the bucket to upload the new object to.
     * @param key    The key in the specified bucket by which to store the new
     *               object.
     * @param file   The file to upload.
     * @return A TransferObserver used to track upload progress and state
     */
    public TransferObserver upload(String bucket, String key, File file) {
        return upload(bucket, key, file, new ObjectMetadata());
    }

    /**
     * Starts uploading the file to the <b>default</b> bucket, using the given key.
     * The file must be a valid file. Directory isn't supported.
     *
     * @param key  The key in the specified bucket by which to store the new object.
     * @param file The file to upload.
     * @return A TransferObserver used to track upload progress and state
     */
    public TransferObserver upload(String key, File file) {
        return upload(getDefaultBucketOrThrow(), key, file, new ObjectMetadata());
    }

    /**
     * Starts uploading the file to the given bucket, using the given key. The file
     * must be a valid file. Directory isn't supported.
     *
     * @param bucket    The name of the bucket to upload the new object to.
     * @param key       The key in the specified bucket by which to store the new
     *                  object.
     * @param file      The file to upload.
     * @param cannedAcl The canned ACL to associate with this object
     * @return A TransferObserver used to track upload progress and state
     */
    public TransferObserver upload(String bucket, String key, File file, CannedAccessControlList cannedAcl) {
        return upload(bucket, key, file, new ObjectMetadata(), cannedAcl);
    }

    /**
     * Starts uploading the file to the <b>default</b> bucket, using the given key.
     * The file must be a valid file. Directory isn't supported.
     *
     * @param key       The key in the specified bucket by which to store the new
     *                  object.
     * @param file      The file to upload.
     * @param cannedAcl The canned ACL to associate with this object
     * @return A TransferObserver used to track upload progress and state
     */
    public TransferObserver upload(String key, File file, CannedAccessControlList cannedAcl) {
        return upload(getDefaultBucketOrThrow(), key, file, new ObjectMetadata(), cannedAcl);
    }

    /**
     * Starts uploading the file to the given bucket, using the given key. The file
     * must be a valid file. Directory isn't supported.
     *
     * @param bucket   The name of the bucket to upload the new object to.
     * @param key      The key in the specified bucket by which to store the new
     *                 object.
     * @param file     The file to upload.
     * @param metadata The S3 metadata to associate with this object
     * @return A TransferObserver used to track upload progress and state
     */
    public TransferObserver upload(String bucket, String key, File file, ObjectMetadata metadata) {
        return upload(bucket, key, file, metadata, null);
    }

    /**
     * Starts uploading the file to the <b>default</b> bucket, using the given key.
     * The file must be a valid file. Directory isn't supported.
     *
     * @param key      The key in the specified bucket by which to store the new
     *                 object.
     * @param file     The file to upload.
     * @param metadata The S3 metadata to associate with this object
     * @return A TransferObserver used to track upload progress and state
     */
    public TransferObserver upload(String key, File file, ObjectMetadata metadata) {
        return upload(getDefaultBucketOrThrow(), key, file, metadata, null);
    }

    /**
     * Starts uploading the file to the given bucket, using the given key. The file
     * must be a valid file. Directory isn't supported.
     *
     * @param bucket    The name of the bucket to upload the new object to.
     * @param key       The key in the specified bucket by which to store the new
     *                  object.
     * @param file      The file to upload.
     * @param metadata  The S3 metadata to associate with this object
     * @param cannedAcl The canned ACL to associate with this object
     * @return A TransferObserver used to track upload progress and state
     */
    public TransferObserver upload(String bucket, String key, File file, ObjectMetadata metadata,
            CannedAccessControlList cannedAcl) {
        return upload(bucket, key, file, metadata, cannedAcl, null);
    }

    /**
     * Starts uploading the file to the <b>default</b> bucket, using the given key.
     * The file must be a valid file. Directory isn't supported.
     *
     * @param key       The key in the specified bucket by which to store the new
     *                  object.
     * @param file      The file to upload.
     * @param metadata  The S3 metadata to associate with this object
     * @param cannedAcl The canned ACL to associate with this object
     * @return A TransferObserver used to track upload progress and state
     */
    public TransferObserver upload(String key, File file, ObjectMetadata metadata, CannedAccessControlList cannedAcl) {
        return upload(getDefaultBucketOrThrow(), key, file, metadata, cannedAcl, null);
    }

    /**
     * Starts uploading the file to the given bucket, using the given key. The file
     * must be a valid file. Directory isn't supported.
     *
     * @param bucket    The name of the bucket to upload the new object to.
     * @param key       The key in the specified bucket by which to store the new
     *                  object.
     * @param file      The file to upload.
     * @param metadata  The S3 metadata to associate with this object
     * @param cannedAcl The canned ACL to associate with this object
     * @param listener  a listener to attach to transfer observer.
     * @return A TransferObserver used to track upload progress and state
     */
    public TransferObserver upload(String bucket, String key, File file, ObjectMetadata metadata,
            CannedAccessControlList cannedAcl, TransferListener listener) {
        if (file == null || file.isDirectory() || !file.exists()) {
            throw new IllegalArgumentException("Invalid file: " + file);
        }
        int recordId;
        if (shouldUploadInMultipart(file)) {
            recordId = createMultipartUploadRecords(bucket, key, file, metadata, cannedAcl);
        } else {

            final Uri uri = dbUtil.insertSingleTransferRecord(TransferType.UPLOAD, bucket, key, file, metadata,
                    cannedAcl);
            recordId = Integer.parseInt(uri.getLastPathSegment());
        }

        submitTransferJob(TRANSFER_ADD, recordId);
        return new TransferObserver(recordId, dbUtil, bucket, key, file, listener);
    }

    /**
     * Starts uploading the file to the <b>default</b> bucket, using the given key.
     * The file must be a valid file. Directory isn't supported.
     *
     * @param key       The key in the specified bucket by which to store the new
     *                  object.
     * @param file      The file to upload.
     * @param metadata  The S3 metadata to associate with this object
     * @param cannedAcl The canned ACL to associate with this object
     * @param listener  a listener to attach to transfer observer.
     * @return A TransferObserver used to track upload progress and state
     */
    public TransferObserver upload(String key, File file, ObjectMetadata metadata, CannedAccessControlList cannedAcl,
            TransferListener listener) {
        return upload(getDefaultBucketOrThrow(), key, file, metadata, cannedAcl, listener);
    }

    /**
     * Gets a TransferObserver instance to track the record with the given id.
     *
     * @param id A transfer id.
     * @return The TransferObserver instance which is observing the record.
     */
    public TransferObserver getTransferById(int id) {
        Cursor c = null;
        try {
            c = dbUtil.queryTransferById(id);
            if (c.moveToNext()) {
                final TransferObserver to = new TransferObserver(id, dbUtil);
                to.updateFromDB(c);
                return to;
            }
        } finally {
            if (c != null) {
                c.close();
            }
        }

        return null;
    }

    /**
     * Gets a list of TransferObserver instances which are observing records with
     * the given type.
     *
     * @param type The type of the transfer "any".
     * @return A list of TransferObserver instances.
     */
    public List<TransferObserver> getTransfersWithType(TransferType type) {
        final List<TransferObserver> transferObservers = new ArrayList<TransferObserver>();
        Cursor c = null;
        try {
            c = dbUtil.queryAllTransfersWithType(type);
            while (c.moveToNext()) {
                final int id = c.getInt(c.getColumnIndexOrThrow(TransferTable.COLUMN_ID));
                final TransferObserver to = new TransferObserver(id, dbUtil);
                to.updateFromDB(c);
                transferObservers.add(to);
            }
        } finally {
            if (c != null) {
                c.close();
            }
        }
        return transferObservers;
    }

    /**
     * Gets a list of TransferObserver instances which are observing records with
     * the given type.
     *
     * @param type  The type of the transfer.
     * @param state The state of the transfer.
     * @return A list of TransferObserver of transfer records with the given type
     *         and state.
     */
    public List<TransferObserver> getTransfersWithTypeAndState(TransferType type, TransferState state) {
        return getTransfersWithTypeAndStates(type, new TransferState[] {state});
    }

    /**
     * Gets a list of TransferObserver instances which are observing records with
     * the given type.
     *
     * @param type   The type of the transfer.
     * @param states A list of the the transfer states.
     * @return A list of TransferObserver of transfer records with the given type
     *         and state.
     */
    public List<TransferObserver> getTransfersWithTypeAndStates(TransferType type, TransferState[] states) {
        final List<TransferObserver> transferObservers = new ArrayList<TransferObserver>();
        Cursor c = null;
        try {
            c = dbUtil.queryTransfersWithTypeAndStates(type, states);
            while (c.moveToNext()) {
                final int partNum = c.getInt(c.getColumnIndexOrThrow(TransferTable.COLUMN_PART_NUM));
                if (partNum != 0) {
                    // skip parts of a multipart upload
                    continue;
                }
                final int id = c.getInt(c.getColumnIndexOrThrow(TransferTable.COLUMN_ID));
                final TransferObserver to = new TransferObserver(id, dbUtil);
                to.updateFromDB(c);
                transferObservers.add(to);
            }
        } finally {
            if (c != null) {
                c.close();
            }
        }
        return transferObservers;
    }

    /**
     * Gets a list of TransferObserver instances which are observing records with
     * the given type.
     *
     * @param type   The type of the transfer.
     * @param states A list of the the transfer states.
     * @return A list of transfer ids that identifies the transfer records
     */
    private List<Integer> getTransferIdsWithTypeAndStates(TransferType type, TransferState[] states) {
        List<Integer> transferIds = new ArrayList<Integer>();
        Cursor c = null;
        try {
            c = dbUtil.queryTransfersWithTypeAndStates(type, states);
            while (c.moveToNext()) {
                final int partNum = c.getInt(c.getColumnIndexOrThrow(TransferTable.COLUMN_PART_NUM));
                if (partNum != 0) {
                    // skip parts of a multipart upload
                    continue;
                }
                final int id = c.getInt(c.getColumnIndexOrThrow(TransferTable.COLUMN_ID));
                transferIds.add(id);
            }
        } finally {
            if (c != null) {
                c.close();
            }
        }
        return transferIds;
    }

    /**
     * Inserts a multipart summary record and actual part records into database
     *
     * @param bucket The name of the bucket to upload the new object to.
     * @param key    The key in the specified bucket by which to store the new
     *               object.
     * @param file   The file to upload.
     * @return Number of records created in database
     */
    private int createMultipartUploadRecords(String bucket, String key, File file, ObjectMetadata metadata,
            CannedAccessControlList cannedAcl) {
        long remainingLenth = file.length();
        double partSize = (double) remainingLenth / (double) MAXIMUM_UPLOAD_PARTS;
        partSize = Math.ceil(partSize);
        final long optimalPartSize = (long) Math.max(partSize, MINIMUM_UPLOAD_PART_SIZE);
        long fileOffset = 0;
        int partNumber = 1;

        // the number of parts
        final int partCount = (int) Math.ceil((double) remainingLenth / (double) optimalPartSize);

        /*
         * the size of valuesArray is partCount + 1, one for a multipart upload summary,
         * others are actual parts to be uploaded
         */
        final ContentValues[] valuesArray = new ContentValues[partCount + 1];
        valuesArray[0] = dbUtil.generateContentValuesForMultiPartUpload(bucket, key, file, fileOffset, 0, "",
                file.length(), 0, metadata, cannedAcl);
        for (int i = 1; i < partCount + 1; i++) {
            final long bytesForPart = Math.min(optimalPartSize, remainingLenth);
            valuesArray[i] = dbUtil.generateContentValuesForMultiPartUpload(bucket, key, file, fileOffset, partNumber,
                    "", bytesForPart, remainingLenth - optimalPartSize <= 0 ? 1 : 0, metadata, cannedAcl);
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
        submitTransferJob(TRANSFER_PAUSE, id);
        return true;
    }

    /**
     * Pauses all transfers which have the given type.
     *
     * @param type The type of transfers
     */
    public void pauseAllWithType(TransferType type) {
        Cursor c = null;
        try {
            c = dbUtil.queryAllTransfersWithType(type);
            while (c.moveToNext()) {
                final int id = c.getInt(c.getColumnIndexOrThrow(TransferTable.COLUMN_ID));
                pause(id);
            }
        } finally {
            if (c != null) {
                c.close();
            }
        }
    }

    /**
     * Resumes the transfer task with the given id. You can resume a transfer in
     * paused, canceled or failed state. If a transfer is in waiting or in progress
     * state but it isn't actually running, this operation will force it to run.
     *
     * @param id A transfer id specifying the transfer to be resumed
     * @return A TransferObserver of the resumed upload/download or null if the ID
     *         does not represent a paused transfer
     */
    public TransferObserver resume(int id) {
        submitTransferJob(TRANSFER_RESUME, id);
        return getTransferById(id);
    }

    /**
     * Resume all the transfers which are not finished. You can resume a transfer in
     * paused, canceled or failed state. If a transfer is in waiting or in progress
     * state but it isn't actually running, this operation will force it to run.
     *
     * @param type The type of transfers
     * @return A list of TransferObserver objects of the resumed upload/download or
     *         null if the ID does not represent a paused transfer
     */
    public List<TransferObserver> resumeAllWithType(final TransferType type) {
        List<TransferObserver> observers = new ArrayList<TransferObserver>();
        final List<Integer> transferIds = getTransferIdsWithTypeAndStates(type,
                new TransferState[] {TransferState.PAUSED, 
                    TransferState.FAILED, 
                    TransferState.CANCELED});

        for (final Integer transferId : transferIds) {
            observers.add(resume(transferId));
        }

        return observers;
    }

    /**
     * Sets a transfer to be canceled. Note the TransferState must be
     * TransferState.CANCELED before the transfer is guaranteed to have stopped, and
     * can be safely deleted
     *
     * @param id A transfer id specifying the transfer to be canceled
     * @return Whether the transfer was set to be canceled.
     */
    public boolean cancel(int id) {
        submitTransferJob(TRANSFER_CANCEL, id);
        return true;
    }

    /**
     * Sets all transfers which have the given type to be canceled. Note the
     * TransferState must be TransferState.CANCELED before the transfer is
     * guaranteed to have stopped, and can be safely deleted
     *
     * @param type The type of transfers
     */
    public void cancelAllWithType(TransferType type) {
        Cursor c = null;
        try {
            c = dbUtil.queryAllTransfersWithType(type);
            while (c.moveToNext()) {
                final int id = c.getInt(c.getColumnIndexOrThrow(TransferTable.COLUMN_ID));
                cancel(id);
            }
        } finally {
            if (c != null) {
                c.close();
            }
        }
    }

    /**
     * Deletes a transfer record with the given id. It just deletes the record but
     * does not stop the running thread, so you must cancel the task before deleting
     * the record.
     *
     * @param id A transfer id specifying the transfer to be deleted.
     * @return true if at least one record was deleted
     */
    public boolean deleteTransferRecord(int id) {
        cancel(id);
        return dbUtil.deleteTransferRecords(id) > 0;
    }

    /**
     * Start a transfer operation by submitting a job to the ThreadPool. This method
     * will retrieve the transfer record from the database and add it to the updater
     * to track and notify the state, progress and error. Then it will start the
     * transfer operation by calling the appropriate method in the
     * {@code TransferRecord}.
     *
     * @param action action to perform
     * @param id     id of the transfer
     */
    private synchronized void submitTransferJob(String action, int id) {
        // Add the AmazonS3Client to the S3ClientReference map
        // sp the TransferStatusUpdater can use the client.
        S3ClientReference.put(id, s3);

        // Find the transfer record in memory, if present use it
        // Else read the transfer record from database and
        // add it to the in memory updater.
        TransferRecord transfer = updater.getTransfer(id);
        if (transfer == null) {
            transfer = dbUtil.getTransferById(id);
            if (transfer == null) {
                LOGGER.error("Cannot find transfer with id: " + id);
                return;
            }
            updater.addTransfer(transfer);
        } else {
            // transfer is not null here. Check if the operation is to
            // start a transfer. If so, skip the transfer.
            if (TRANSFER_ADD.equals(action)) {
                LOGGER.warn("Transfer has already been added: " + id);
                return;
            }
        }

        if (TRANSFER_ADD.equals(action) || TRANSFER_RESUME.equals(action)) {
            transfer.start(s3, dbUtil, updater);
        } else if (TRANSFER_PAUSE.equals(action)) {
            transfer.pause(s3, updater);
        } else if (TRANSFER_CANCEL.equals(action)) {
            transfer.cancel(s3, updater);
        } else {
            LOGGER.error("Unknown action: " + action);
        }
    }

    private boolean shouldUploadInMultipart(File file) {
        return (file != null && file.length() > MINIMUM_UPLOAD_PART_SIZE);
    }

    static <X extends AmazonWebServiceRequest> X appendTransferServiceUserAgentString(final X request) {
        request.getRequestClientOptions().appendUserAgent(
                "TransferService/" + TransferUtility.getUserAgentFromConfig() + VersionInfoUtils.getVersion());
        return request;
    }

    static <X extends AmazonWebServiceRequest> X appendMultipartTransferServiceUserAgentString(final X request) {
        request.getRequestClientOptions().appendUserAgent("TransferService_multipart/"
                + TransferUtility.getUserAgentFromConfig() + VersionInfoUtils.getVersion());
        return request;
    }

    TransferDBUtil getDbUtil() {
        return dbUtil;
    }

}
