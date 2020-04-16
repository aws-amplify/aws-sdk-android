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

package com.amazonaws.services.amazonimportexportsnowball.model.transform;

import com.amazonaws.services.amazonimportexportsnowball.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DataTransfer
 */
class DataTransferJsonMarshaller {

    public void marshall(DataTransfer dataTransfer, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (dataTransfer.getBytesTransferred() != null) {
            Long bytesTransferred = dataTransfer.getBytesTransferred();
            jsonWriter.name("BytesTransferred");
            jsonWriter.value(bytesTransferred);
        }
        if (dataTransfer.getObjectsTransferred() != null) {
            Long objectsTransferred = dataTransfer.getObjectsTransferred();
            jsonWriter.name("ObjectsTransferred");
            jsonWriter.value(objectsTransferred);
        }
        if (dataTransfer.getTotalBytes() != null) {
            Long totalBytes = dataTransfer.getTotalBytes();
            jsonWriter.name("TotalBytes");
            jsonWriter.value(totalBytes);
        }
        if (dataTransfer.getTotalObjects() != null) {
            Long totalObjects = dataTransfer.getTotalObjects();
            jsonWriter.name("TotalObjects");
            jsonWriter.value(totalObjects);
        }
        jsonWriter.endObject();
    }

    private static DataTransferJsonMarshaller instance;

    public static DataTransferJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DataTransferJsonMarshaller();
        return instance;
    }
}
