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

/**
 * The optional fields that can be included in the inventory results.
 */
public enum InventoryOptionalField {

    /** Size. */
    Size("Size"),

    /** LastModifiedDate. */
    LastModifiedDate("LastModifiedDate"),

    /** StorageClass. */
    StorageClass("StorageClass"),

    /** ETag. */
    ETag("ETag"),

    /** IsMultipartUploaded. */
    IsMultipartUploaded("IsMultipartUploaded"),

    /** ReplicationStatus. */
    ReplicationStatus("ReplicationStatus");

    private final String field;

    private InventoryOptionalField(String field) {
        this.field = field;
    }

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return field;
    }
}
