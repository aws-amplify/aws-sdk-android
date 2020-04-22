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

package com.amazonaws.services.amazonelasticsearchservice.model.transform;

import com.amazonaws.services.amazonelasticsearchservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO StorageType
 */
class StorageTypeJsonMarshaller {

    public void marshall(StorageType storageType, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (storageType.getStorageTypeName() != null) {
            String storageTypeName = storageType.getStorageTypeName();
            jsonWriter.name("StorageTypeName");
            jsonWriter.value(storageTypeName);
        }
        if (storageType.getStorageSubTypeName() != null) {
            String storageSubTypeName = storageType.getStorageSubTypeName();
            jsonWriter.name("StorageSubTypeName");
            jsonWriter.value(storageSubTypeName);
        }
        if (storageType.getStorageTypeLimits() != null) {
            java.util.List<StorageTypeLimit> storageTypeLimits = storageType.getStorageTypeLimits();
            jsonWriter.name("StorageTypeLimits");
            jsonWriter.beginArray();
            for (StorageTypeLimit storageTypeLimitsItem : storageTypeLimits) {
                if (storageTypeLimitsItem != null) {
                    StorageTypeLimitJsonMarshaller.getInstance().marshall(storageTypeLimitsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static StorageTypeJsonMarshaller instance;

    public static StorageTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StorageTypeJsonMarshaller();
        return instance;
    }
}
