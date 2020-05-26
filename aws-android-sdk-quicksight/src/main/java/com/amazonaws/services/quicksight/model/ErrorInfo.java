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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

/**
 * <p>
 * Error information for the SPICE ingestion of a dataset.
 * </p>
 */
public class ErrorInfo implements Serializable {
    /**
     * <p>
     * Error type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAILURE_TO_ASSUME_ROLE, INGESTION_SUPERSEDED,
     * INGESTION_CANCELED, DATA_SET_DELETED, DATA_SET_NOT_SPICE,
     * S3_UPLOADED_FILE_DELETED, S3_MANIFEST_ERROR, DATA_TOLERANCE_EXCEPTION,
     * SPICE_TABLE_NOT_FOUND, DATA_SET_SIZE_LIMIT_EXCEEDED,
     * ROW_SIZE_LIMIT_EXCEEDED, ACCOUNT_CAPACITY_LIMIT_EXCEEDED, CUSTOMER_ERROR,
     * DATA_SOURCE_NOT_FOUND, IAM_ROLE_NOT_AVAILABLE, CONNECTION_FAILURE,
     * SQL_TABLE_NOT_FOUND, PERMISSION_DENIED,
     * SSL_CERTIFICATE_VALIDATION_FAILURE, OAUTH_TOKEN_FAILURE,
     * SOURCE_API_LIMIT_EXCEEDED_FAILURE, PASSWORD_AUTHENTICATION_FAILURE,
     * SQL_SCHEMA_MISMATCH_ERROR, INVALID_DATE_FORMAT, INVALID_DATAPREP_SYNTAX,
     * SOURCE_RESOURCE_LIMIT_EXCEEDED, SQL_INVALID_PARAMETER_VALUE,
     * QUERY_TIMEOUT, SQL_NUMERIC_OVERFLOW, UNRESOLVABLE_HOST, UNROUTABLE_HOST,
     * SQL_EXCEPTION, S3_FILE_INACCESSIBLE, IOT_FILE_NOT_FOUND,
     * IOT_DATA_SET_FILE_EMPTY, INVALID_DATA_SOURCE_CONFIG,
     * DATA_SOURCE_AUTH_FAILED, DATA_SOURCE_CONNECTION_FAILED,
     * FAILURE_TO_PROCESS_JSON_FILE, INTERNAL_SERVICE_ERROR
     */
    private String type;

    /**
     * <p>
     * Error message.
     * </p>
     */
    private String message;

    /**
     * <p>
     * Error type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAILURE_TO_ASSUME_ROLE, INGESTION_SUPERSEDED,
     * INGESTION_CANCELED, DATA_SET_DELETED, DATA_SET_NOT_SPICE,
     * S3_UPLOADED_FILE_DELETED, S3_MANIFEST_ERROR, DATA_TOLERANCE_EXCEPTION,
     * SPICE_TABLE_NOT_FOUND, DATA_SET_SIZE_LIMIT_EXCEEDED,
     * ROW_SIZE_LIMIT_EXCEEDED, ACCOUNT_CAPACITY_LIMIT_EXCEEDED, CUSTOMER_ERROR,
     * DATA_SOURCE_NOT_FOUND, IAM_ROLE_NOT_AVAILABLE, CONNECTION_FAILURE,
     * SQL_TABLE_NOT_FOUND, PERMISSION_DENIED,
     * SSL_CERTIFICATE_VALIDATION_FAILURE, OAUTH_TOKEN_FAILURE,
     * SOURCE_API_LIMIT_EXCEEDED_FAILURE, PASSWORD_AUTHENTICATION_FAILURE,
     * SQL_SCHEMA_MISMATCH_ERROR, INVALID_DATE_FORMAT, INVALID_DATAPREP_SYNTAX,
     * SOURCE_RESOURCE_LIMIT_EXCEEDED, SQL_INVALID_PARAMETER_VALUE,
     * QUERY_TIMEOUT, SQL_NUMERIC_OVERFLOW, UNRESOLVABLE_HOST, UNROUTABLE_HOST,
     * SQL_EXCEPTION, S3_FILE_INACCESSIBLE, IOT_FILE_NOT_FOUND,
     * IOT_DATA_SET_FILE_EMPTY, INVALID_DATA_SOURCE_CONFIG,
     * DATA_SOURCE_AUTH_FAILED, DATA_SOURCE_CONNECTION_FAILED,
     * FAILURE_TO_PROCESS_JSON_FILE, INTERNAL_SERVICE_ERROR
     *
     * @return <p>
     *         Error type.
     *         </p>
     * @see IngestionErrorType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * Error type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAILURE_TO_ASSUME_ROLE, INGESTION_SUPERSEDED,
     * INGESTION_CANCELED, DATA_SET_DELETED, DATA_SET_NOT_SPICE,
     * S3_UPLOADED_FILE_DELETED, S3_MANIFEST_ERROR, DATA_TOLERANCE_EXCEPTION,
     * SPICE_TABLE_NOT_FOUND, DATA_SET_SIZE_LIMIT_EXCEEDED,
     * ROW_SIZE_LIMIT_EXCEEDED, ACCOUNT_CAPACITY_LIMIT_EXCEEDED, CUSTOMER_ERROR,
     * DATA_SOURCE_NOT_FOUND, IAM_ROLE_NOT_AVAILABLE, CONNECTION_FAILURE,
     * SQL_TABLE_NOT_FOUND, PERMISSION_DENIED,
     * SSL_CERTIFICATE_VALIDATION_FAILURE, OAUTH_TOKEN_FAILURE,
     * SOURCE_API_LIMIT_EXCEEDED_FAILURE, PASSWORD_AUTHENTICATION_FAILURE,
     * SQL_SCHEMA_MISMATCH_ERROR, INVALID_DATE_FORMAT, INVALID_DATAPREP_SYNTAX,
     * SOURCE_RESOURCE_LIMIT_EXCEEDED, SQL_INVALID_PARAMETER_VALUE,
     * QUERY_TIMEOUT, SQL_NUMERIC_OVERFLOW, UNRESOLVABLE_HOST, UNROUTABLE_HOST,
     * SQL_EXCEPTION, S3_FILE_INACCESSIBLE, IOT_FILE_NOT_FOUND,
     * IOT_DATA_SET_FILE_EMPTY, INVALID_DATA_SOURCE_CONFIG,
     * DATA_SOURCE_AUTH_FAILED, DATA_SOURCE_CONNECTION_FAILED,
     * FAILURE_TO_PROCESS_JSON_FILE, INTERNAL_SERVICE_ERROR
     *
     * @param type <p>
     *            Error type.
     *            </p>
     * @see IngestionErrorType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Error type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAILURE_TO_ASSUME_ROLE, INGESTION_SUPERSEDED,
     * INGESTION_CANCELED, DATA_SET_DELETED, DATA_SET_NOT_SPICE,
     * S3_UPLOADED_FILE_DELETED, S3_MANIFEST_ERROR, DATA_TOLERANCE_EXCEPTION,
     * SPICE_TABLE_NOT_FOUND, DATA_SET_SIZE_LIMIT_EXCEEDED,
     * ROW_SIZE_LIMIT_EXCEEDED, ACCOUNT_CAPACITY_LIMIT_EXCEEDED, CUSTOMER_ERROR,
     * DATA_SOURCE_NOT_FOUND, IAM_ROLE_NOT_AVAILABLE, CONNECTION_FAILURE,
     * SQL_TABLE_NOT_FOUND, PERMISSION_DENIED,
     * SSL_CERTIFICATE_VALIDATION_FAILURE, OAUTH_TOKEN_FAILURE,
     * SOURCE_API_LIMIT_EXCEEDED_FAILURE, PASSWORD_AUTHENTICATION_FAILURE,
     * SQL_SCHEMA_MISMATCH_ERROR, INVALID_DATE_FORMAT, INVALID_DATAPREP_SYNTAX,
     * SOURCE_RESOURCE_LIMIT_EXCEEDED, SQL_INVALID_PARAMETER_VALUE,
     * QUERY_TIMEOUT, SQL_NUMERIC_OVERFLOW, UNRESOLVABLE_HOST, UNROUTABLE_HOST,
     * SQL_EXCEPTION, S3_FILE_INACCESSIBLE, IOT_FILE_NOT_FOUND,
     * IOT_DATA_SET_FILE_EMPTY, INVALID_DATA_SOURCE_CONFIG,
     * DATA_SOURCE_AUTH_FAILED, DATA_SOURCE_CONNECTION_FAILED,
     * FAILURE_TO_PROCESS_JSON_FILE, INTERNAL_SERVICE_ERROR
     *
     * @param type <p>
     *            Error type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IngestionErrorType
     */
    public ErrorInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * Error type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAILURE_TO_ASSUME_ROLE, INGESTION_SUPERSEDED,
     * INGESTION_CANCELED, DATA_SET_DELETED, DATA_SET_NOT_SPICE,
     * S3_UPLOADED_FILE_DELETED, S3_MANIFEST_ERROR, DATA_TOLERANCE_EXCEPTION,
     * SPICE_TABLE_NOT_FOUND, DATA_SET_SIZE_LIMIT_EXCEEDED,
     * ROW_SIZE_LIMIT_EXCEEDED, ACCOUNT_CAPACITY_LIMIT_EXCEEDED, CUSTOMER_ERROR,
     * DATA_SOURCE_NOT_FOUND, IAM_ROLE_NOT_AVAILABLE, CONNECTION_FAILURE,
     * SQL_TABLE_NOT_FOUND, PERMISSION_DENIED,
     * SSL_CERTIFICATE_VALIDATION_FAILURE, OAUTH_TOKEN_FAILURE,
     * SOURCE_API_LIMIT_EXCEEDED_FAILURE, PASSWORD_AUTHENTICATION_FAILURE,
     * SQL_SCHEMA_MISMATCH_ERROR, INVALID_DATE_FORMAT, INVALID_DATAPREP_SYNTAX,
     * SOURCE_RESOURCE_LIMIT_EXCEEDED, SQL_INVALID_PARAMETER_VALUE,
     * QUERY_TIMEOUT, SQL_NUMERIC_OVERFLOW, UNRESOLVABLE_HOST, UNROUTABLE_HOST,
     * SQL_EXCEPTION, S3_FILE_INACCESSIBLE, IOT_FILE_NOT_FOUND,
     * IOT_DATA_SET_FILE_EMPTY, INVALID_DATA_SOURCE_CONFIG,
     * DATA_SOURCE_AUTH_FAILED, DATA_SOURCE_CONNECTION_FAILED,
     * FAILURE_TO_PROCESS_JSON_FILE, INTERNAL_SERVICE_ERROR
     *
     * @param type <p>
     *            Error type.
     *            </p>
     * @see IngestionErrorType
     */
    public void setType(IngestionErrorType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * Error type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAILURE_TO_ASSUME_ROLE, INGESTION_SUPERSEDED,
     * INGESTION_CANCELED, DATA_SET_DELETED, DATA_SET_NOT_SPICE,
     * S3_UPLOADED_FILE_DELETED, S3_MANIFEST_ERROR, DATA_TOLERANCE_EXCEPTION,
     * SPICE_TABLE_NOT_FOUND, DATA_SET_SIZE_LIMIT_EXCEEDED,
     * ROW_SIZE_LIMIT_EXCEEDED, ACCOUNT_CAPACITY_LIMIT_EXCEEDED, CUSTOMER_ERROR,
     * DATA_SOURCE_NOT_FOUND, IAM_ROLE_NOT_AVAILABLE, CONNECTION_FAILURE,
     * SQL_TABLE_NOT_FOUND, PERMISSION_DENIED,
     * SSL_CERTIFICATE_VALIDATION_FAILURE, OAUTH_TOKEN_FAILURE,
     * SOURCE_API_LIMIT_EXCEEDED_FAILURE, PASSWORD_AUTHENTICATION_FAILURE,
     * SQL_SCHEMA_MISMATCH_ERROR, INVALID_DATE_FORMAT, INVALID_DATAPREP_SYNTAX,
     * SOURCE_RESOURCE_LIMIT_EXCEEDED, SQL_INVALID_PARAMETER_VALUE,
     * QUERY_TIMEOUT, SQL_NUMERIC_OVERFLOW, UNRESOLVABLE_HOST, UNROUTABLE_HOST,
     * SQL_EXCEPTION, S3_FILE_INACCESSIBLE, IOT_FILE_NOT_FOUND,
     * IOT_DATA_SET_FILE_EMPTY, INVALID_DATA_SOURCE_CONFIG,
     * DATA_SOURCE_AUTH_FAILED, DATA_SOURCE_CONNECTION_FAILED,
     * FAILURE_TO_PROCESS_JSON_FILE, INTERNAL_SERVICE_ERROR
     *
     * @param type <p>
     *            Error type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IngestionErrorType
     */
    public ErrorInfo withType(IngestionErrorType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Error message.
     * </p>
     *
     * @return <p>
     *         Error message.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * Error message.
     * </p>
     *
     * @param message <p>
     *            Error message.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Error message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            Error message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ErrorInfo withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ErrorInfo == false)
            return false;
        ErrorInfo other = (ErrorInfo) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }
}
