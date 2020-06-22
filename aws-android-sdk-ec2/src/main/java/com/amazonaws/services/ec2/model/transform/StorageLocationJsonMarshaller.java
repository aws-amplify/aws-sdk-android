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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO StorageLocation
 */
class StorageLocationJsonMarshaller {

    public void marshall(StorageLocation storageLocation, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (storageLocation.getBucket() != null) {
            String bucket = storageLocation.getBucket();
            jsonWriter.name("Bucket");
            jsonWriter.value(bucket);
        }
        if (storageLocation.getKey() != null) {
            String key = storageLocation.getKey();
            jsonWriter.name("Key");
            jsonWriter.value(key);
        }
        jsonWriter.endObject();
    }

    private static StorageLocationJsonMarshaller instance;

    public static StorageLocationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StorageLocationJsonMarshaller();
        return instance;
    }
}
