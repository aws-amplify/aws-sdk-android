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

package com.amazonaws.services.awsdatabasemigrationservice.model.transform;

import com.amazonaws.services.awsdatabasemigrationservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO S3Settings
 */
class S3SettingsJsonMarshaller {

    public void marshall(S3Settings s3Settings, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (s3Settings.getServiceAccessRoleArn() != null) {
            String serviceAccessRoleArn = s3Settings.getServiceAccessRoleArn();
            jsonWriter.name("ServiceAccessRoleArn");
            jsonWriter.value(serviceAccessRoleArn);
        }
        if (s3Settings.getExternalTableDefinition() != null) {
            String externalTableDefinition = s3Settings.getExternalTableDefinition();
            jsonWriter.name("ExternalTableDefinition");
            jsonWriter.value(externalTableDefinition);
        }
        if (s3Settings.getCsvRowDelimiter() != null) {
            String csvRowDelimiter = s3Settings.getCsvRowDelimiter();
            jsonWriter.name("CsvRowDelimiter");
            jsonWriter.value(csvRowDelimiter);
        }
        if (s3Settings.getCsvDelimiter() != null) {
            String csvDelimiter = s3Settings.getCsvDelimiter();
            jsonWriter.name("CsvDelimiter");
            jsonWriter.value(csvDelimiter);
        }
        if (s3Settings.getBucketFolder() != null) {
            String bucketFolder = s3Settings.getBucketFolder();
            jsonWriter.name("BucketFolder");
            jsonWriter.value(bucketFolder);
        }
        if (s3Settings.getBucketName() != null) {
            String bucketName = s3Settings.getBucketName();
            jsonWriter.name("BucketName");
            jsonWriter.value(bucketName);
        }
        if (s3Settings.getCompressionType() != null) {
            String compressionType = s3Settings.getCompressionType();
            jsonWriter.name("CompressionType");
            jsonWriter.value(compressionType);
        }
        if (s3Settings.getEncryptionMode() != null) {
            String encryptionMode = s3Settings.getEncryptionMode();
            jsonWriter.name("EncryptionMode");
            jsonWriter.value(encryptionMode);
        }
        if (s3Settings.getServerSideEncryptionKmsKeyId() != null) {
            String serverSideEncryptionKmsKeyId = s3Settings.getServerSideEncryptionKmsKeyId();
            jsonWriter.name("ServerSideEncryptionKmsKeyId");
            jsonWriter.value(serverSideEncryptionKmsKeyId);
        }
        if (s3Settings.getDataFormat() != null) {
            String dataFormat = s3Settings.getDataFormat();
            jsonWriter.name("DataFormat");
            jsonWriter.value(dataFormat);
        }
        if (s3Settings.getEncodingType() != null) {
            String encodingType = s3Settings.getEncodingType();
            jsonWriter.name("EncodingType");
            jsonWriter.value(encodingType);
        }
        if (s3Settings.getDictPageSizeLimit() != null) {
            Integer dictPageSizeLimit = s3Settings.getDictPageSizeLimit();
            jsonWriter.name("DictPageSizeLimit");
            jsonWriter.value(dictPageSizeLimit);
        }
        if (s3Settings.getRowGroupLength() != null) {
            Integer rowGroupLength = s3Settings.getRowGroupLength();
            jsonWriter.name("RowGroupLength");
            jsonWriter.value(rowGroupLength);
        }
        if (s3Settings.getDataPageSize() != null) {
            Integer dataPageSize = s3Settings.getDataPageSize();
            jsonWriter.name("DataPageSize");
            jsonWriter.value(dataPageSize);
        }
        if (s3Settings.getParquetVersion() != null) {
            String parquetVersion = s3Settings.getParquetVersion();
            jsonWriter.name("ParquetVersion");
            jsonWriter.value(parquetVersion);
        }
        if (s3Settings.getEnableStatistics() != null) {
            Boolean enableStatistics = s3Settings.getEnableStatistics();
            jsonWriter.name("EnableStatistics");
            jsonWriter.value(enableStatistics);
        }
        if (s3Settings.getIncludeOpForFullLoad() != null) {
            Boolean includeOpForFullLoad = s3Settings.getIncludeOpForFullLoad();
            jsonWriter.name("IncludeOpForFullLoad");
            jsonWriter.value(includeOpForFullLoad);
        }
        if (s3Settings.getCdcInsertsOnly() != null) {
            Boolean cdcInsertsOnly = s3Settings.getCdcInsertsOnly();
            jsonWriter.name("CdcInsertsOnly");
            jsonWriter.value(cdcInsertsOnly);
        }
        if (s3Settings.getTimestampColumnName() != null) {
            String timestampColumnName = s3Settings.getTimestampColumnName();
            jsonWriter.name("TimestampColumnName");
            jsonWriter.value(timestampColumnName);
        }
        if (s3Settings.getParquetTimestampInMillisecond() != null) {
            Boolean parquetTimestampInMillisecond = s3Settings.getParquetTimestampInMillisecond();
            jsonWriter.name("ParquetTimestampInMillisecond");
            jsonWriter.value(parquetTimestampInMillisecond);
        }
        if (s3Settings.getCdcInsertsAndUpdates() != null) {
            Boolean cdcInsertsAndUpdates = s3Settings.getCdcInsertsAndUpdates();
            jsonWriter.name("CdcInsertsAndUpdates");
            jsonWriter.value(cdcInsertsAndUpdates);
        }
        jsonWriter.endObject();
    }

    private static S3SettingsJsonMarshaller instance;

    public static S3SettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3SettingsJsonMarshaller();
        return instance;
    }
}
