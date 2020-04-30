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

package com.amazonaws.services.awsiotevents.model.transform;

import com.amazonaws.services.awsiotevents.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO IotSiteWiseAction
 */
class IotSiteWiseActionJsonMarshaller {

    public void marshall(IotSiteWiseAction iotSiteWiseAction, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (iotSiteWiseAction.getEntryId() != null) {
            String entryId = iotSiteWiseAction.getEntryId();
            jsonWriter.name("entryId");
            jsonWriter.value(entryId);
        }
        if (iotSiteWiseAction.getAssetId() != null) {
            String assetId = iotSiteWiseAction.getAssetId();
            jsonWriter.name("assetId");
            jsonWriter.value(assetId);
        }
        if (iotSiteWiseAction.getPropertyId() != null) {
            String propertyId = iotSiteWiseAction.getPropertyId();
            jsonWriter.name("propertyId");
            jsonWriter.value(propertyId);
        }
        if (iotSiteWiseAction.getPropertyAlias() != null) {
            String propertyAlias = iotSiteWiseAction.getPropertyAlias();
            jsonWriter.name("propertyAlias");
            jsonWriter.value(propertyAlias);
        }
        if (iotSiteWiseAction.getPropertyValue() != null) {
            AssetPropertyValue propertyValue = iotSiteWiseAction.getPropertyValue();
            jsonWriter.name("propertyValue");
            AssetPropertyValueJsonMarshaller.getInstance().marshall(propertyValue, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static IotSiteWiseActionJsonMarshaller instance;

    public static IotSiteWiseActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new IotSiteWiseActionJsonMarshaller();
        return instance;
    }
}
