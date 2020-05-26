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

import java.util.HashMap;
import java.util.Map;

/**
 * Ingestion Error Type
 */
public enum IngestionErrorType {

    FAILURE_TO_ASSUME_ROLE("FAILURE_TO_ASSUME_ROLE"),
    INGESTION_SUPERSEDED("INGESTION_SUPERSEDED"),
    INGESTION_CANCELED("INGESTION_CANCELED"),
    DATA_SET_DELETED("DATA_SET_DELETED"),
    DATA_SET_NOT_SPICE("DATA_SET_NOT_SPICE"),
    S3_UPLOADED_FILE_DELETED("S3_UPLOADED_FILE_DELETED"),
    S3_MANIFEST_ERROR("S3_MANIFEST_ERROR"),
    DATA_TOLERANCE_EXCEPTION("DATA_TOLERANCE_EXCEPTION"),
    SPICE_TABLE_NOT_FOUND("SPICE_TABLE_NOT_FOUND"),
    DATA_SET_SIZE_LIMIT_EXCEEDED("DATA_SET_SIZE_LIMIT_EXCEEDED"),
    ROW_SIZE_LIMIT_EXCEEDED("ROW_SIZE_LIMIT_EXCEEDED"),
    ACCOUNT_CAPACITY_LIMIT_EXCEEDED("ACCOUNT_CAPACITY_LIMIT_EXCEEDED"),
    CUSTOMER_ERROR("CUSTOMER_ERROR"),
    DATA_SOURCE_NOT_FOUND("DATA_SOURCE_NOT_FOUND"),
    IAM_ROLE_NOT_AVAILABLE("IAM_ROLE_NOT_AVAILABLE"),
    CONNECTION_FAILURE("CONNECTION_FAILURE"),
    SQL_TABLE_NOT_FOUND("SQL_TABLE_NOT_FOUND"),
    PERMISSION_DENIED("PERMISSION_DENIED"),
    SSL_CERTIFICATE_VALIDATION_FAILURE("SSL_CERTIFICATE_VALIDATION_FAILURE"),
    OAUTH_TOKEN_FAILURE("OAUTH_TOKEN_FAILURE"),
    SOURCE_API_LIMIT_EXCEEDED_FAILURE("SOURCE_API_LIMIT_EXCEEDED_FAILURE"),
    PASSWORD_AUTHENTICATION_FAILURE("PASSWORD_AUTHENTICATION_FAILURE"),
    SQL_SCHEMA_MISMATCH_ERROR("SQL_SCHEMA_MISMATCH_ERROR"),
    INVALID_DATE_FORMAT("INVALID_DATE_FORMAT"),
    INVALID_DATAPREP_SYNTAX("INVALID_DATAPREP_SYNTAX"),
    SOURCE_RESOURCE_LIMIT_EXCEEDED("SOURCE_RESOURCE_LIMIT_EXCEEDED"),
    SQL_INVALID_PARAMETER_VALUE("SQL_INVALID_PARAMETER_VALUE"),
    QUERY_TIMEOUT("QUERY_TIMEOUT"),
    SQL_NUMERIC_OVERFLOW("SQL_NUMERIC_OVERFLOW"),
    UNRESOLVABLE_HOST("UNRESOLVABLE_HOST"),
    UNROUTABLE_HOST("UNROUTABLE_HOST"),
    SQL_EXCEPTION("SQL_EXCEPTION"),
    S3_FILE_INACCESSIBLE("S3_FILE_INACCESSIBLE"),
    IOT_FILE_NOT_FOUND("IOT_FILE_NOT_FOUND"),
    IOT_DATA_SET_FILE_EMPTY("IOT_DATA_SET_FILE_EMPTY"),
    INVALID_DATA_SOURCE_CONFIG("INVALID_DATA_SOURCE_CONFIG"),
    DATA_SOURCE_AUTH_FAILED("DATA_SOURCE_AUTH_FAILED"),
    DATA_SOURCE_CONNECTION_FAILED("DATA_SOURCE_CONNECTION_FAILED"),
    FAILURE_TO_PROCESS_JSON_FILE("FAILURE_TO_PROCESS_JSON_FILE"),
    INTERNAL_SERVICE_ERROR("INTERNAL_SERVICE_ERROR");

    private String value;

    private IngestionErrorType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, IngestionErrorType> enumMap;
    static {
        enumMap = new HashMap<String, IngestionErrorType>();
        enumMap.put("FAILURE_TO_ASSUME_ROLE", FAILURE_TO_ASSUME_ROLE);
        enumMap.put("INGESTION_SUPERSEDED", INGESTION_SUPERSEDED);
        enumMap.put("INGESTION_CANCELED", INGESTION_CANCELED);
        enumMap.put("DATA_SET_DELETED", DATA_SET_DELETED);
        enumMap.put("DATA_SET_NOT_SPICE", DATA_SET_NOT_SPICE);
        enumMap.put("S3_UPLOADED_FILE_DELETED", S3_UPLOADED_FILE_DELETED);
        enumMap.put("S3_MANIFEST_ERROR", S3_MANIFEST_ERROR);
        enumMap.put("DATA_TOLERANCE_EXCEPTION", DATA_TOLERANCE_EXCEPTION);
        enumMap.put("SPICE_TABLE_NOT_FOUND", SPICE_TABLE_NOT_FOUND);
        enumMap.put("DATA_SET_SIZE_LIMIT_EXCEEDED", DATA_SET_SIZE_LIMIT_EXCEEDED);
        enumMap.put("ROW_SIZE_LIMIT_EXCEEDED", ROW_SIZE_LIMIT_EXCEEDED);
        enumMap.put("ACCOUNT_CAPACITY_LIMIT_EXCEEDED", ACCOUNT_CAPACITY_LIMIT_EXCEEDED);
        enumMap.put("CUSTOMER_ERROR", CUSTOMER_ERROR);
        enumMap.put("DATA_SOURCE_NOT_FOUND", DATA_SOURCE_NOT_FOUND);
        enumMap.put("IAM_ROLE_NOT_AVAILABLE", IAM_ROLE_NOT_AVAILABLE);
        enumMap.put("CONNECTION_FAILURE", CONNECTION_FAILURE);
        enumMap.put("SQL_TABLE_NOT_FOUND", SQL_TABLE_NOT_FOUND);
        enumMap.put("PERMISSION_DENIED", PERMISSION_DENIED);
        enumMap.put("SSL_CERTIFICATE_VALIDATION_FAILURE", SSL_CERTIFICATE_VALIDATION_FAILURE);
        enumMap.put("OAUTH_TOKEN_FAILURE", OAUTH_TOKEN_FAILURE);
        enumMap.put("SOURCE_API_LIMIT_EXCEEDED_FAILURE", SOURCE_API_LIMIT_EXCEEDED_FAILURE);
        enumMap.put("PASSWORD_AUTHENTICATION_FAILURE", PASSWORD_AUTHENTICATION_FAILURE);
        enumMap.put("SQL_SCHEMA_MISMATCH_ERROR", SQL_SCHEMA_MISMATCH_ERROR);
        enumMap.put("INVALID_DATE_FORMAT", INVALID_DATE_FORMAT);
        enumMap.put("INVALID_DATAPREP_SYNTAX", INVALID_DATAPREP_SYNTAX);
        enumMap.put("SOURCE_RESOURCE_LIMIT_EXCEEDED", SOURCE_RESOURCE_LIMIT_EXCEEDED);
        enumMap.put("SQL_INVALID_PARAMETER_VALUE", SQL_INVALID_PARAMETER_VALUE);
        enumMap.put("QUERY_TIMEOUT", QUERY_TIMEOUT);
        enumMap.put("SQL_NUMERIC_OVERFLOW", SQL_NUMERIC_OVERFLOW);
        enumMap.put("UNRESOLVABLE_HOST", UNRESOLVABLE_HOST);
        enumMap.put("UNROUTABLE_HOST", UNROUTABLE_HOST);
        enumMap.put("SQL_EXCEPTION", SQL_EXCEPTION);
        enumMap.put("S3_FILE_INACCESSIBLE", S3_FILE_INACCESSIBLE);
        enumMap.put("IOT_FILE_NOT_FOUND", IOT_FILE_NOT_FOUND);
        enumMap.put("IOT_DATA_SET_FILE_EMPTY", IOT_DATA_SET_FILE_EMPTY);
        enumMap.put("INVALID_DATA_SOURCE_CONFIG", INVALID_DATA_SOURCE_CONFIG);
        enumMap.put("DATA_SOURCE_AUTH_FAILED", DATA_SOURCE_AUTH_FAILED);
        enumMap.put("DATA_SOURCE_CONNECTION_FAILED", DATA_SOURCE_CONNECTION_FAILED);
        enumMap.put("FAILURE_TO_PROCESS_JSON_FILE", FAILURE_TO_PROCESS_JSON_FILE);
        enumMap.put("INTERNAL_SERVICE_ERROR", INTERNAL_SERVICE_ERROR);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return IngestionErrorType corresponding to the value
     */
    public static IngestionErrorType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
