package com.amazonaws.mobileconnectors.s3.transferutility;

import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.ObjectMetadata;

/**
 * A class that can hold all of the optional parameters (bucket, metadata, cannedAcl, transferListener).
 */
public class UploadOptions {
    private String bucket;
    private ObjectMetadata metadata;
    private CannedAccessControlList cannedAcl;
    private TransferListener listener;

    /**
     * Constructor.
     *
     * @param bucket        The bucket name
     * @param metadata      The S3 metadata to associate with this object
     * @param cannedAcl     The canned ACL to associate with this object
     * @param listener      The listener to attach to transfer observer
     */
    public UploadOptions(String bucket, ObjectMetadata metadata, CannedAccessControlList cannedAcl, TransferListener listener) {
        this.bucket = bucket;
        this.metadata = metadata;
        this.cannedAcl = cannedAcl;
        this.listener = listener;
    }

    public String getBucket() {
        return this.bucket;
    }

    public ObjectMetadata getMetadata() {
        return this.metadata;
    }

    public CannedAccessControlList getCannedAcl() {
        return this.cannedAcl;
    }

    public TransferListener getTransferListener() {
        return this.listener;
    }

    /**
     * Builder class for UploadOptions
     */
    public static class Builder {
        private String bucket;
        private ObjectMetadata metadata;
        private CannedAccessControlList cannedAcl;
        private TransferListener listener;

        public Builder() {
        }

        /**
         * Sets the bucket used for upload.
         *
         * @param bucket The bucket name
         * @return builder
         */
        public Builder bucket(final String bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
         * Sets the metadata of the object to upload.
         *
         * @param metadata The S3 metadata to associate with this object
         * @return builder
         */
        public Builder objectMetadata(final ObjectMetadata metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the canned ACL of the object to upload.
         *
         * @param cannedAcl The canned ACL to associate with this object
         * @return builder
         */
        public Builder cannedAcl(final CannedAccessControlList cannedAcl) {
            this.cannedAcl = cannedAcl;
            return this;
        }

        /**
         * Sets the listener to an upload task.
         *
         * @param listener The listener to attach to transfer observer
         * @return builder
         */
        public Builder transferListener(final TransferListener listener) {
            this.listener = listener;
            return this;
        }

        /**
         * @return UploadOptions
         */
        public UploadOptions build() {
            return new UploadOptions(bucket, metadata, cannedAcl, listener);
        }
    }

    /**
     * Minimum calls required.
     * UploadOptions.builder().bucket(bucket)
     *                        .objectMetadata(metadata)
     *                        .cannedAcl(cannedAcl)
     *                        .transferListener(transferListener)
     *                        .build());
     *
     * @return The builder object to construct a UploadOptions.
     */
    public static Builder builder() {
        return new Builder();
    }

}
