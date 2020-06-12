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

package com.amazonaws.services.storagegateway.model.transform;

import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO FileShareInfo
 */
class FileShareInfoJsonMarshaller {

    public void marshall(FileShareInfo fileShareInfo, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (fileShareInfo.getFileShareType() != null) {
            String fileShareType = fileShareInfo.getFileShareType();
            jsonWriter.name("FileShareType");
            jsonWriter.value(fileShareType);
        }
        if (fileShareInfo.getFileShareARN() != null) {
            String fileShareARN = fileShareInfo.getFileShareARN();
            jsonWriter.name("FileShareARN");
            jsonWriter.value(fileShareARN);
        }
        if (fileShareInfo.getFileShareId() != null) {
            String fileShareId = fileShareInfo.getFileShareId();
            jsonWriter.name("FileShareId");
            jsonWriter.value(fileShareId);
        }
        if (fileShareInfo.getFileShareStatus() != null) {
            String fileShareStatus = fileShareInfo.getFileShareStatus();
            jsonWriter.name("FileShareStatus");
            jsonWriter.value(fileShareStatus);
        }
        if (fileShareInfo.getGatewayARN() != null) {
            String gatewayARN = fileShareInfo.getGatewayARN();
            jsonWriter.name("GatewayARN");
            jsonWriter.value(gatewayARN);
        }
        jsonWriter.endObject();
    }

    private static FileShareInfoJsonMarshaller instance;

    public static FileShareInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FileShareInfoJsonMarshaller();
        return instance;
    }
}
