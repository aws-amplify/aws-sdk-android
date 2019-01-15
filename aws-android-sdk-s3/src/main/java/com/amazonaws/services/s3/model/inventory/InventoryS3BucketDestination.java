/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.s3.model.inventory;

import java.io.Serializable;

/**
 * Contains the bucket name, file format, bucket owner (optional),
 * and prefix (optional) where inventory results are published.
 */
public class InventoryS3BucketDestination implements Serializable {

    private String accountId;

    private String bucketArn;

    private String format;

    private String prefix;

    /**
     * @return the account ID that owns the destination bucket.
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * @param accountId  the account ID that owns the destination bucket.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * @param accountId  the account ID that owns the destination bucket
     * @return this {@link InventoryS3BucketDestination} object
     * for method chaining.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public InventoryS3BucketDestination withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * @return the Amazon resource name (ARN) of the bucket where inventory results will be published.
     */
    public String getBucketArn() {
        return bucketArn;
    }

    /**
     * @param bucketArn  the Amazon resource name (ARN) of the bucket where inventory results will be published.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public void setBucketArn(String bucketArn) {
        this.bucketArn = bucketArn;
    }

    /**
     * @param bucketArn  the Amazon resource name (ARN) of the bucket where inventory results will be published.
     *
     * @return this {@link InventoryS3BucketDestination} object is returned for method chaining.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public InventoryS3BucketDestination withBucketArn(String bucketArn) {
        setBucketArn(bucketArn);
        return this;
    }

    /**
     * @return the output format of the inventory results.
     */
    public String getFormat() {
        return format;
    }

    /**
     * @param format  the output format of the inventory results.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * @param format  the output format of the inventory results.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public void setFormat(InventoryFormat format) {
        setFormat(format == null ? (String) null : format.toString());
    }

    /**
     * @param format  the output format of the inventory results
     * @return this {@link InventoryS3BucketDestination} object
     * for method chaining.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public InventoryS3BucketDestination withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * @param format  the output format of the inventory results
     * @return this {@link InventoryS3BucketDestination} object
     * for method chaining.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public InventoryS3BucketDestination withFormat(InventoryFormat format) {
        setFormat(format);
        return this;
    }

    /**
     * @return the prefix that is prepended to all inventory results.
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * @param prefix  the prefix that is prepended to all inventory results.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * @param prefix  the prefix that is prepended to all inventory results
     * @return this {@link InventoryS3BucketDestination} object
     * for method chaining.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public InventoryS3BucketDestination withPrefix(String prefix) {
        setPrefix(prefix);
        return this;
    }
}
