/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.awswafregional.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The operation failed due to a problem with the migration. The failure cause
 * is provided in the exception, in the <code>MigrationErrorType</code>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>ENTITY_NOT_SUPPORTED</code> - The web ACL has an unsupported entity but
 * the <code>IgnoreUnsupportedType</code> is not set to true.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ENTITY_NOT_FOUND</code> - The web ACL doesn't exist.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>S3_BUCKET_NO_PERMISSION</code> - You don't have permission to perform
 * the <code>PutObject</code> action to the specified Amazon S3 bucket.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>S3_BUCKET_NOT_ACCESSIBLE</code> - The bucket policy doesn't allow AWS
 * WAF to perform the <code>PutObject</code> action in the bucket.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>S3_BUCKET_NOT_FOUND</code> - The S3 bucket doesn't exist.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>S3_BUCKET_INVALID_REGION</code> - The S3 bucket is not in the same
 * Region as the web ACL.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>S3_INTERNAL_ERROR</code> - AWS WAF failed to create the template in the
 * S3 bucket for another reason.
 * </p>
 * </li>
 * </ul>
 */
public class WAFEntityMigrationException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    private String migrationErrorType;

    private String migrationErrorReason;

    /**
     * Constructs a new WAFEntityMigrationException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public WAFEntityMigrationException(String message) {
        super(message);
    }

    /**
     * Returns the value of the migrationErrorType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENTITY_NOT_SUPPORTED, ENTITY_NOT_FOUND,
     * S3_BUCKET_NO_PERMISSION, S3_BUCKET_NOT_ACCESSIBLE, S3_BUCKET_NOT_FOUND,
     * S3_BUCKET_INVALID_REGION, S3_INTERNAL_ERROR
     *
     * @return The value of the migrationErrorType property for this object.
     * @see MigrationErrorType
     */
    public String getMigrationErrorType() {
        return migrationErrorType;
    }

    /**
     * Sets the value of migrationErrorType
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENTITY_NOT_SUPPORTED, ENTITY_NOT_FOUND,
     * S3_BUCKET_NO_PERMISSION, S3_BUCKET_NOT_ACCESSIBLE, S3_BUCKET_NOT_FOUND,
     * S3_BUCKET_INVALID_REGION, S3_INTERNAL_ERROR
     *
     * @param migrationErrorType The new value for the migrationErrorType
     *            property for this object.
     * @see MigrationErrorType
     */
    public void setMigrationErrorType(String migrationErrorType) {
        this.migrationErrorType = migrationErrorType;
    }

    /**
     * Returns the value of the migrationErrorReason property for this object.
     *
     * @return The value of the migrationErrorReason property for this object.
     */
    public String getMigrationErrorReason() {
        return migrationErrorReason;
    }

    /**
     * Sets the value of migrationErrorReason
     *
     * @param migrationErrorReason The new value for the migrationErrorReason
     *            property for this object.
     */
    public void setMigrationErrorReason(String migrationErrorReason) {
        this.migrationErrorReason = migrationErrorReason;
    }
}
