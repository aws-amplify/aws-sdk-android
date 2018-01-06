/*
 * Copyright 2011-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Information about where to publish the inventory results.
 */
public class InventoryDestination implements Serializable {

    /**
     * Contains the S3 destination information of where inventory results are published.
     */
    private InventoryS3BucketDestination s3BucketDestination;

    /**
     * @return the {@link InventoryS3BucketDestination} which contains S3 bucket destination information
     * of where inventory results are published.
     */
    public InventoryS3BucketDestination getS3BucketDestination() {
        return s3BucketDestination;
    }

    /**
     * @param s3BucketDestination  the {@link InventoryS3BucketDestination} which contains S3 bucket destination information
     * of where inventory results are published.
     */
    public void setS3BucketDestination(InventoryS3BucketDestination s3BucketDestination) {
        this.s3BucketDestination = s3BucketDestination;
    }

    /**
     * @param s3BucketDestination  the {@link InventoryS3BucketDestination} which contains S3 bucket destination information
     * of where inventory results are published.
     * @return this {@link InventoryDestination} object is returned for method chaining.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public InventoryDestination withS3BucketDestination(InventoryS3BucketDestination s3BucketDestination) {
        setS3BucketDestination(s3BucketDestination);
        return this;
    }
}
