/**
 * Copyright 2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.ObjectMetadata;

import java.util.Objects;

/**
 * A class that can hold all of the optional parameters (bucket, metadata, cannedAcl, transferListener).
 */
public final class UploadOptions {
    // These attributes are all optional
    private final String bucket;
    private final ObjectMetadata metadata;
    private final CannedAccessControlList cannedAcl;
    private final TransferListener listener;

    /**
     * Constructor.
     */
    public UploadOptions(UploadOptionsBuilder builder) {
        this.bucket = builder.bucket;
        this.metadata = builder.metadata;
        this.cannedAcl = builder.cannedAcl;
        this.listener = builder.listener;
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
    public static final class UploadOptionsBuilder {
        private String bucket;
        private ObjectMetadata metadata;
        private CannedAccessControlList cannedAcl;
        private TransferListener listener;

        private UploadOptionsBuilder() {
        }

        /**
         * Sets the bucket used for upload.
         *
         * @param bucket The bucket name
         * @return builder
         */
        public UploadOptionsBuilder bucket(final String bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
         * Sets the metadata of the object to upload.
         *
         * @param metadata The S3 metadata to associate with this object
         * @return builder
         */
        public UploadOptionsBuilder objectMetadata(final ObjectMetadata metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the canned ACL of the object to upload.
         *
         * @param cannedAcl The canned ACL to associate with this object
         * @return builder
         */
        public UploadOptionsBuilder cannedAcl(final CannedAccessControlList cannedAcl) {
            this.cannedAcl = cannedAcl;
            return this;
        }

        /**
         * Sets the listener to an upload task.
         *
         * @param listener The listener to attach to transfer observer
         * @return builder
         */
        public UploadOptionsBuilder transferListener(final TransferListener listener) {
            this.listener = listener;
            return this;
        }

        /**
         * Return the finally constructed UploadOptions.
         * @return UploadOptions
         */
        public UploadOptions build() {
            return new UploadOptions(this);
        }
    }

    /**
     * @return The builder object to construct a UploadOptions.
     */
    public static UploadOptionsBuilder builder() {
        return new UploadOptionsBuilder();
    }

    @Override
    public String toString() {
        return "UploadOptions{" +
                "bucket='" + bucket + '\'' +
                ", metadata=" + metadata +
                ", cannedAcl=" + cannedAcl +
                ", listener=" + listener +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UploadOptions that = (UploadOptions) o;
        return Objects.equals(bucket, that.bucket) &&
                Objects.equals(metadata, that.metadata) &&
                cannedAcl == that.cannedAcl &&
                Objects.equals(listener, that.listener);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucket, metadata, cannedAcl, listener);
    }
}
