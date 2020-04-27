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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO S3Settings
 */
class S3SettingsJsonUnmarshaller implements Unmarshaller<S3Settings, JsonUnmarshallerContext> {

    public S3Settings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        S3Settings s3Settings = new S3Settings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ServiceAccessRoleArn")) {
                s3Settings.setServiceAccessRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExternalTableDefinition")) {
                s3Settings.setExternalTableDefinition(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CsvRowDelimiter")) {
                s3Settings.setCsvRowDelimiter(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CsvDelimiter")) {
                s3Settings.setCsvDelimiter(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BucketFolder")) {
                s3Settings.setBucketFolder(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BucketName")) {
                s3Settings.setBucketName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CompressionType")) {
                s3Settings.setCompressionType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EncryptionMode")) {
                s3Settings.setEncryptionMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ServerSideEncryptionKmsKeyId")) {
                s3Settings.setServerSideEncryptionKmsKeyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DataFormat")) {
                s3Settings.setDataFormat(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EncodingType")) {
                s3Settings.setEncodingType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DictPageSizeLimit")) {
                s3Settings.setDictPageSizeLimit(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RowGroupLength")) {
                s3Settings.setRowGroupLength(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DataPageSize")) {
                s3Settings.setDataPageSize(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ParquetVersion")) {
                s3Settings.setParquetVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EnableStatistics")) {
                s3Settings.setEnableStatistics(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IncludeOpForFullLoad")) {
                s3Settings.setIncludeOpForFullLoad(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CdcInsertsOnly")) {
                s3Settings.setCdcInsertsOnly(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TimestampColumnName")) {
                s3Settings.setTimestampColumnName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ParquetTimestampInMillisecond")) {
                s3Settings.setParquetTimestampInMillisecond(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CdcInsertsAndUpdates")) {
                s3Settings.setCdcInsertsAndUpdates(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return s3Settings;
    }

    private static S3SettingsJsonUnmarshaller instance;

    public static S3SettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new S3SettingsJsonUnmarshaller();
        return instance;
    }
}
