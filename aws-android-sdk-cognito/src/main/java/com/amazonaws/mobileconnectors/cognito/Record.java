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

import com.amazonaws.mobileconnectors.cognito.internal.util.StringUtils;

import java.util.Date;

/**
 * A Record is the element stored in a {@link Dataset}. There can be up to 1k
 * records or up to 1 MB in size in a {@link Dataset}.
 * @deprecated The Amazon Cognito Sync SDK for Android is deprecated as of release 2.9.0. Please use the AWS AppSync SDK for Android along with AWS AppSync service instead.
 */
@Deprecated
public final class Record {
    /**
     * The key of this record. It's a non empty string.
     */
    private final String key;
    /**
     * The value of this record. If it's null, then the record is considered as
     * deleted.
     */
    private final String value;
    /**
     * Equivalent to the version of this record. It's a increasing non negative
     * long number. The value is returned from server. Do not set this value
     * arbitrarily, or else update may fail.
     */
    private final long syncCount;
    /**
     * The server timestamp of this record when it was last modified.
     */
    private final Date lastModifiedDate;
    /**
     * An identifier of the user or device which modified this record last.
     */
    private final String lastModifiedBy;
    /**
     * The local timestamp of this record when it was last modified.
     */
    private final Date deviceLastModifiedDate;
    /**
     * A flag that indicates whether this record is modified locally but hasn't
     * been synced.
     */
    private final boolean modified;

    /**
     * Gets the key of this record. It's a non empty string.
     * 
     * @return key of this record
     */
    public String getKey() {
        return key;
    }

    /**
     * Gets the value of this record. If it's null, then the record is
     * considered as deleted.
     * 
     * @return nullable String value of this record
     */
    public String getValue() {
        return value;
    }

    /**
     * Gets the sync count of this record. It's equivalent to the version of
     * this record. It's a increasing non negative long number. The value is
     * returned from server. Do not set this value arbitrarily, or else update
     * may fail.
     * 
     * @return sync count of this record
     */
    public long getSyncCount() {
        return syncCount;
    }

    /**
     * Gets the server timestamp of this record when it was last modified.
     * 
     * @return the server timestamp when it was last modified.
     */
    public Date getLastModifiedDate() {
        return new Date(lastModifiedDate.getTime());
    }

    /**
     * Gets the identifier of the user or device which modified this record
     * last.
     * 
     * @return an identifier of the user or device which made the last
     *         modification
     */
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * Gets the local timestamp of this record when it was last modified.
     * 
     * @return the local timestamp of the device that made the last modification
     */
    public Date getDeviceLastModifiedDate() {
        return new Date(deviceLastModifiedDate.getTime());
    }

    /**
     * Gets a flag that indicates whether this record is modified locally but
     * hasn't been synced.
     * 
     * @return the modified flag of this record
     */
    public boolean isModified() {
        return modified;
    }

    /**
     * Gets whether the record is marked as deleted. True if value is null,
     * false otherwise.
     * 
     * @return true if the record is marked as deleted, false otherwise.
     */
    public boolean isDeleted() {
        return value == null;
    }

    /**
     * A private constructor for the {@link Builder} to build a new Record
     * object.
     * 
     * @param builder a {@link Builder} object
     */
    private Record(Builder builder) {
        key = builder.key;
        value = builder.value;
        syncCount = builder.syncCount;
        lastModifiedDate = builder.lastModifiedDate == null
                ? new Date()
                : new Date(builder.lastModifiedDate.getTime());
        lastModifiedBy = builder.lastModifiedBy;
        deviceLastModifiedDate = builder.deviceLastModifiedDate == null
                ? new Date()
                : new Date(builder.deviceLastModifiedDate.getTime());
        modified = builder.modified;
    }

    /**
     * A Builder class that helps build an immutable {@link Record} object.
     */
    public static final class Builder {
        private final String key;
        private String value;
        private long syncCount;
        private Date lastModifiedDate;
        private String lastModifiedBy;
        private Date deviceLastModifiedDate;
        private boolean modified;

        /**
         * Construct a builder object for the new {@link Record} with given key.
         * 
         * @param key Non empty String key of the record
         */
        public Builder(String key) {
            if (StringUtils.isEmpty(key)) {
                throw new IllegalArgumentException("key can't be empty");
            }
            this.key = key;
        }

        /**
         * Sets the value of the new {@link Record}. Default is null, aka
         * deleted record.
         * 
         * @param nValue nullable String value of this record
         * @return builder itself
         */
        public Builder value(String nValue) {
            this.value = nValue;
            return this;
        }

        /**
         * Sets the syncCount of the new {@link Record}. Default is the current
         * time.
         * 
         * @param nSyncCount non negative long value
         * @return builder itself
         */
        public Builder syncCount(long nSyncCount) {
            if (nSyncCount < 0) {
                throw new IllegalArgumentException("sync count can't be negative");
            }
            this.syncCount = nSyncCount;
            return this;
        }

        /**
         * Sets the last modified date of this {@link Record}. Default is the
         * current time.
         * 
         * @param nLastModifiedDate last modified date of this record
         * @return builder itself
         */
        public Builder lastModifiedDate(Date nLastModifiedDate) {
            this.lastModifiedDate = nLastModifiedDate;
            return this;
        }

        /**
         * Sets the last modified by of this {@link Record}. Default is empty
         * string.
         * 
         * @param nLastModifiedBy device name or user name that last modified
         *            this record.
         * @return builder itself
         */
        public Builder lastModifiedBy(String nLastModifiedBy) {
            this.lastModifiedBy = nLastModifiedBy;
            return this;
        }

        /**
         * Sets the device last modified date of this {@link Record}. It's the
         * local date of the device that modified this record. Default is the
         * current date.
         * 
         * @param nDeviceLastModifiedDate device last modified date
         * @return builder itself
         */
        public Builder deviceLastModifiedDate(Date nDeviceLastModifiedDate) {
            this.deviceLastModifiedDate = nDeviceLastModifiedDate;
            return this;
        }

        /**
         * Sets whether this {@link Record} has local modification.
         * 
         * @param nModified a flag that indicates whether the record has local
         *            modification
         * @return builder itself
         */
        public Builder modified(boolean nModified) {
            this.modified = nModified;
            return this;
        }

        /**
         * Builds a new {@link Record}.
         * 
         * @return a new {@link Record} object
         */
        public Record build() {
            return new Record(this);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("key:[").append(key).append("],")
                .append("value:[").append(value).append("],")
                .append("sync_count:[").append(syncCount).append("],")
                .append("last_modified_date:[").append(lastModifiedDate).append("],")
                .append("last_modified_by:[").append(lastModifiedBy).append("],")
                .append("device_last_modified_date:[").append(deviceLastModifiedDate).append("],")
                .append("last_modified_by:[").append(lastModifiedBy).append("],")
                .append("is_modified:[").append(modified).append("]");
        return sb.toString();
    }
}
