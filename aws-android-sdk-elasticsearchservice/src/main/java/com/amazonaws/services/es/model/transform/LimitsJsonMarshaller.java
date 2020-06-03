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

package com.amazonaws.services.es.model.transform;

import com.amazonaws.services.es.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Limits
 */
class LimitsJsonMarshaller {

    public void marshall(Limits limits, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (limits.getStorageTypes() != null) {
            java.util.List<StorageType> storageTypes = limits.getStorageTypes();
            jsonWriter.name("StorageTypes");
            jsonWriter.beginArray();
            for (StorageType storageTypesItem : storageTypes) {
                if (storageTypesItem != null) {
                    StorageTypeJsonMarshaller.getInstance().marshall(storageTypesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (limits.getInstanceLimits() != null) {
            InstanceLimits instanceLimits = limits.getInstanceLimits();
            jsonWriter.name("InstanceLimits");
            InstanceLimitsJsonMarshaller.getInstance().marshall(instanceLimits, jsonWriter);
        }
        if (limits.getAdditionalLimits() != null) {
            java.util.List<AdditionalLimit> additionalLimits = limits.getAdditionalLimits();
            jsonWriter.name("AdditionalLimits");
            jsonWriter.beginArray();
            for (AdditionalLimit additionalLimitsItem : additionalLimits) {
                if (additionalLimitsItem != null) {
                    AdditionalLimitJsonMarshaller.getInstance().marshall(additionalLimitsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static LimitsJsonMarshaller instance;

    public static LimitsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LimitsJsonMarshaller();
        return instance;
    }
}
