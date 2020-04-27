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
 * JSON unmarshaller for POJO RedshiftSettings
 */
class RedshiftSettingsJsonUnmarshaller implements
        Unmarshaller<RedshiftSettings, JsonUnmarshallerContext> {

    public RedshiftSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        RedshiftSettings redshiftSettings = new RedshiftSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AcceptAnyDate")) {
                redshiftSettings.setAcceptAnyDate(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AfterConnectScript")) {
                redshiftSettings.setAfterConnectScript(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BucketFolder")) {
                redshiftSettings.setBucketFolder(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BucketName")) {
                redshiftSettings.setBucketName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ConnectionTimeout")) {
                redshiftSettings.setConnectionTimeout(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DatabaseName")) {
                redshiftSettings.setDatabaseName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DateFormat")) {
                redshiftSettings.setDateFormat(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EmptyAsNull")) {
                redshiftSettings.setEmptyAsNull(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EncryptionMode")) {
                redshiftSettings.setEncryptionMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FileTransferUploadStreams")) {
                redshiftSettings.setFileTransferUploadStreams(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LoadTimeout")) {
                redshiftSettings.setLoadTimeout(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxFileSize")) {
                redshiftSettings.setMaxFileSize(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Password")) {
                redshiftSettings.setPassword(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Port")) {
                redshiftSettings.setPort(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RemoveQuotes")) {
                redshiftSettings.setRemoveQuotes(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ReplaceInvalidChars")) {
                redshiftSettings.setReplaceInvalidChars(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ReplaceChars")) {
                redshiftSettings.setReplaceChars(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ServerName")) {
                redshiftSettings.setServerName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ServiceAccessRoleArn")) {
                redshiftSettings.setServiceAccessRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ServerSideEncryptionKmsKeyId")) {
                redshiftSettings.setServerSideEncryptionKmsKeyId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TimeFormat")) {
                redshiftSettings.setTimeFormat(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TrimBlanks")) {
                redshiftSettings.setTrimBlanks(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TruncateColumns")) {
                redshiftSettings.setTruncateColumns(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Username")) {
                redshiftSettings.setUsername(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("WriteBufferSize")) {
                redshiftSettings.setWriteBufferSize(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return redshiftSettings;
    }

    private static RedshiftSettingsJsonUnmarshaller instance;

    public static RedshiftSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RedshiftSettingsJsonUnmarshaller();
        return instance;
    }
}
