/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PutAssetPropertyValueEntry
 */
class PutAssetPropertyValueEntryJsonMarshaller {

    public void marshall(PutAssetPropertyValueEntry putAssetPropertyValueEntry,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (putAssetPropertyValueEntry.getEntryId() != null) {
            String entryId = putAssetPropertyValueEntry.getEntryId();
            jsonWriter.name("entryId");
            jsonWriter.value(entryId);
        }
        if (putAssetPropertyValueEntry.getAssetId() != null) {
            String assetId = putAssetPropertyValueEntry.getAssetId();
            jsonWriter.name("assetId");
            jsonWriter.value(assetId);
        }
        if (putAssetPropertyValueEntry.getPropertyId() != null) {
            String propertyId = putAssetPropertyValueEntry.getPropertyId();
            jsonWriter.name("propertyId");
            jsonWriter.value(propertyId);
        }
        if (putAssetPropertyValueEntry.getPropertyAlias() != null) {
            String propertyAlias = putAssetPropertyValueEntry.getPropertyAlias();
            jsonWriter.name("propertyAlias");
            jsonWriter.value(propertyAlias);
        }
        if (putAssetPropertyValueEntry.getPropertyValues() != null) {
            java.util.List<AssetPropertyValue> propertyValues = putAssetPropertyValueEntry
                    .getPropertyValues();
            jsonWriter.name("propertyValues");
            jsonWriter.beginArray();
            for (AssetPropertyValue propertyValuesItem : propertyValues) {
                if (propertyValuesItem != null) {
                    AssetPropertyValueJsonMarshaller.getInstance().marshall(propertyValuesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static PutAssetPropertyValueEntryJsonMarshaller instance;

    public static PutAssetPropertyValueEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PutAssetPropertyValueEntryJsonMarshaller();
        return instance;
    }
}
