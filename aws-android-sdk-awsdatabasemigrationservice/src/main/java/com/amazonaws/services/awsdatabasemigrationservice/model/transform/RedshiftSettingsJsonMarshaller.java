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
 * JSON marshaller for POJO RedshiftSettings
 */
class RedshiftSettingsJsonMarshaller {

    public void marshall(RedshiftSettings redshiftSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (redshiftSettings.getAcceptAnyDate() != null) {
            Boolean acceptAnyDate = redshiftSettings.getAcceptAnyDate();
            jsonWriter.name("AcceptAnyDate");
            jsonWriter.value(acceptAnyDate);
        }
        if (redshiftSettings.getAfterConnectScript() != null) {
            String afterConnectScript = redshiftSettings.getAfterConnectScript();
            jsonWriter.name("AfterConnectScript");
            jsonWriter.value(afterConnectScript);
        }
        if (redshiftSettings.getBucketFolder() != null) {
            String bucketFolder = redshiftSettings.getBucketFolder();
            jsonWriter.name("BucketFolder");
            jsonWriter.value(bucketFolder);
        }
        if (redshiftSettings.getBucketName() != null) {
            String bucketName = redshiftSettings.getBucketName();
            jsonWriter.name("BucketName");
            jsonWriter.value(bucketName);
        }
        if (redshiftSettings.getConnectionTimeout() != null) {
            Integer connectionTimeout = redshiftSettings.getConnectionTimeout();
            jsonWriter.name("ConnectionTimeout");
            jsonWriter.value(connectionTimeout);
        }
        if (redshiftSettings.getDatabaseName() != null) {
            String databaseName = redshiftSettings.getDatabaseName();
            jsonWriter.name("DatabaseName");
            jsonWriter.value(databaseName);
        }
        if (redshiftSettings.getDateFormat() != null) {
            String dateFormat = redshiftSettings.getDateFormat();
            jsonWriter.name("DateFormat");
            jsonWriter.value(dateFormat);
        }
        if (redshiftSettings.getEmptyAsNull() != null) {
            Boolean emptyAsNull = redshiftSettings.getEmptyAsNull();
            jsonWriter.name("EmptyAsNull");
            jsonWriter.value(emptyAsNull);
        }
        if (redshiftSettings.getEncryptionMode() != null) {
            String encryptionMode = redshiftSettings.getEncryptionMode();
            jsonWriter.name("EncryptionMode");
            jsonWriter.value(encryptionMode);
        }
        if (redshiftSettings.getFileTransferUploadStreams() != null) {
            Integer fileTransferUploadStreams = redshiftSettings.getFileTransferUploadStreams();
            jsonWriter.name("FileTransferUploadStreams");
            jsonWriter.value(fileTransferUploadStreams);
        }
        if (redshiftSettings.getLoadTimeout() != null) {
            Integer loadTimeout = redshiftSettings.getLoadTimeout();
            jsonWriter.name("LoadTimeout");
            jsonWriter.value(loadTimeout);
        }
        if (redshiftSettings.getMaxFileSize() != null) {
            Integer maxFileSize = redshiftSettings.getMaxFileSize();
            jsonWriter.name("MaxFileSize");
            jsonWriter.value(maxFileSize);
        }
        if (redshiftSettings.getPassword() != null) {
            String password = redshiftSettings.getPassword();
            jsonWriter.name("Password");
            jsonWriter.value(password);
        }
        if (redshiftSettings.getPort() != null) {
            Integer port = redshiftSettings.getPort();
            jsonWriter.name("Port");
            jsonWriter.value(port);
        }
        if (redshiftSettings.getRemoveQuotes() != null) {
            Boolean removeQuotes = redshiftSettings.getRemoveQuotes();
            jsonWriter.name("RemoveQuotes");
            jsonWriter.value(removeQuotes);
        }
        if (redshiftSettings.getReplaceInvalidChars() != null) {
            String replaceInvalidChars = redshiftSettings.getReplaceInvalidChars();
            jsonWriter.name("ReplaceInvalidChars");
            jsonWriter.value(replaceInvalidChars);
        }
        if (redshiftSettings.getReplaceChars() != null) {
            String replaceChars = redshiftSettings.getReplaceChars();
            jsonWriter.name("ReplaceChars");
            jsonWriter.value(replaceChars);
        }
        if (redshiftSettings.getServerName() != null) {
            String serverName = redshiftSettings.getServerName();
            jsonWriter.name("ServerName");
            jsonWriter.value(serverName);
        }
        if (redshiftSettings.getServiceAccessRoleArn() != null) {
            String serviceAccessRoleArn = redshiftSettings.getServiceAccessRoleArn();
            jsonWriter.name("ServiceAccessRoleArn");
            jsonWriter.value(serviceAccessRoleArn);
        }
        if (redshiftSettings.getServerSideEncryptionKmsKeyId() != null) {
            String serverSideEncryptionKmsKeyId = redshiftSettings
                    .getServerSideEncryptionKmsKeyId();
            jsonWriter.name("ServerSideEncryptionKmsKeyId");
            jsonWriter.value(serverSideEncryptionKmsKeyId);
        }
        if (redshiftSettings.getTimeFormat() != null) {
            String timeFormat = redshiftSettings.getTimeFormat();
            jsonWriter.name("TimeFormat");
            jsonWriter.value(timeFormat);
        }
        if (redshiftSettings.getTrimBlanks() != null) {
            Boolean trimBlanks = redshiftSettings.getTrimBlanks();
            jsonWriter.name("TrimBlanks");
            jsonWriter.value(trimBlanks);
        }
        if (redshiftSettings.getTruncateColumns() != null) {
            Boolean truncateColumns = redshiftSettings.getTruncateColumns();
            jsonWriter.name("TruncateColumns");
            jsonWriter.value(truncateColumns);
        }
        if (redshiftSettings.getUsername() != null) {
            String username = redshiftSettings.getUsername();
            jsonWriter.name("Username");
            jsonWriter.value(username);
        }
        if (redshiftSettings.getWriteBufferSize() != null) {
            Integer writeBufferSize = redshiftSettings.getWriteBufferSize();
            jsonWriter.name("WriteBufferSize");
            jsonWriter.value(writeBufferSize);
        }
        jsonWriter.endObject();
    }

    private static RedshiftSettingsJsonMarshaller instance;

    public static RedshiftSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RedshiftSettingsJsonMarshaller();
        return instance;
    }
}
