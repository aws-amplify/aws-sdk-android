/**
 * Copyright 2013-2018 Amazon.com, 
 * Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Amazon Software License (the "License"). 
 * You may not use this file except in compliance with the 
 * License. A copy of the License is located at
 * 
 *     http://aws.amazon.com/asl/
 * 
 * or in the "license" file accompanying this file. This file is 
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, express or implied. See the License 
 * for the specific language governing permissions and 
 * limitations under the License.
 */

package com.amazonaws.mobileconnectors.cognito;

import java.util.Date;

/**
 * The metadata of a {@link Dataset}, including name, server sync count, last
 * modified date. The is the cached information of a dataset. It might not
 * reflect the most up-to-date information stored remotely. Please call
 * {@link CognitoSyncManager#refreshDatasetMetadata()} to pull the latest
 * information.
 * @deprecated The Amazon Cognito Sync SDK for Android is deprecated as of release 2.9.0. Please use the AWS AppSync SDK for Android along with AWS AppSync service instead.
 */
@Deprecated
public final class DatasetMetadata {
    /**
     * Non empty String name of the dataset
     */
    private final String datasetName;
    /**
     * Date when the dataset is created
     */
    private final Date creationDate;
    /**
     * Date when the dataset is last modified
     */
    private final Date lastModifiedDate;
    /**
     * The device that made the last modification
     */
    private final String lastModifiedBy;
    /**
     * The storage size in bytes of the dataset
     */
    private final long storageSizeBytes;
    /**
     * Number of records in the dataset
     */
    private final long recordCount;

    /**
     * Gets the name of this dataset.
     * 
     * @return non empty String name of this dataset
     */
    public String getDatasetName() {
        return datasetName;
    }

    /**
     * Gets the creation date of this dataset.
     * 
     * @return creation date
     */
    public Date getCreationDate() {
        return new Date(creationDate.getTime());
    }

    /**
     * Gets last modified date of this dataset.
     * 
     * @return date when this dataset is last modified
     */
    public Date getLastModifiedDate() {
        return new Date(lastModifiedDate.getTime());
    }

    /**
     * Gets the device that made the last modification to the dataset.
     * 
     * @return the device that made the last modification, or null if unknown.
     */
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * Gets the storage size in bytes of this dataset. It equals the sum of
     * UTF-8 encoded string length of record keys and values.
     * 
     * @return storage size in bytes
     */
    public long getStorageSizeBytes() {
        return storageSizeBytes;
    }

    /**
     * Gets the number of records in this dataset.
     * 
     * @return number of records
     */
    public long getRecordCount() {
        return recordCount;
    }

    /**
     * Private constructor of {@link DatasetMetadata}.
     * 
     * @param builder builder object
     */
    private DatasetMetadata(Builder builder) {
        this.datasetName = builder.datasetName;
        this.lastModifiedBy = builder.lastModifiedBy;
        this.creationDate = builder.creationDate == null
                ? new Date(0) : new
                Date(builder.creationDate.getTime());
        this.lastModifiedDate =
                builder.lastModifiedDate == null
                        ? new Date() // default is current time
                        : new Date(builder.lastModifiedDate.getTime());
        this.storageSizeBytes = builder.storageSizeBytes;
        this.recordCount = builder.recordCount;
    }

    /**
     * The builder to construct {@link DatasetMetadata} object.
     */
    public static final class Builder {
        private final String datasetName;
        private Date creationDate;
        private Date lastModifiedDate;
        private String lastModifiedBy;
        private long storageSizeBytes;
        private long recordCount;

        /**
         * Constructs a {@link Builder} object with initial dataset name.
         * 
         * @param datasetName name of the dataset to be constructed
         */
        public Builder(String datasetName) {
            this.datasetName = datasetName;
        }

        /**
         * Sets the creation date of this dataset. Default is 0 (unknown).
         * 
         * @param nCreationDate creation date of this dataset.
         * @return builder itself
         */
        public Builder creationDate(Date nCreationDate) {
            this.creationDate = nCreationDate;
            return this;
        }

        /**
         * Sets the last modified date. Default is current date.
         * 
         * @param nLastModifiedDate last modified date
         * @return builder itself.
         */
        public Builder lastModifiedDate(Date nLastModifiedDate) {
            this.lastModifiedDate = nLastModifiedDate;
            return this;
        }

        /**
         * Sets the device which made the last modification. Default is null.
         * 
         * @param nLastModifiedBy device which made the last modification
         * @return builder itself
         */
        public Builder lastModifiedBy(String nLastModifiedBy) {
            this.lastModifiedBy = nLastModifiedBy;
            return this;
        }

        /**
         * Set the storage size in bytes of this dataset. Default is 0.
         * 
         * @param nStorageSizeBytes storage size in bytes
         * @return builder itself
         */
        public Builder storageSizeBytes(long nStorageSizeBytes) {
            if (nStorageSizeBytes < 0) {
                throw new IllegalArgumentException("Storage size can't be negative");
            }
            this.storageSizeBytes = nStorageSizeBytes;
            return this;
        }

        /**
         * Sets the number of records in this dataset. Default is 0.
         * 
         * @param nRecordCount number of records
         * @return builder itself
         */
        public Builder recordCount(long nRecordCount) {
            if (nRecordCount < 0) {
                throw new IllegalArgumentException("Number of records can't be negative");
            }
            this.recordCount = nRecordCount;
            return this;
        }

        /**
         * Builds the {@link DatasetMetadata} object.
         * 
         * @return DatasetMetadata object
         */
        public DatasetMetadata build() {
            return new DatasetMetadata(this);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("dataset_name:[").append(datasetName).append("],")
                .append("creation_date:[").append(creationDate).append("],")
                .append("last_modified_date:[").append(lastModifiedDate).append("],")
                .append("last_modified_by:[").append(lastModifiedBy).append("],")
                .append("storage_size_bytes:[").append(storageSizeBytes).append("],")
                .append("record_count:[").append(recordCount).append("]");
        return sb.toString();
    }
}
