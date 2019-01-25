/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DeviceType
 */
class DeviceTypeJsonMarshaller {

    public void marshall(DeviceType deviceType, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (deviceType.getDeviceKey() != null) {
            String deviceKey = deviceType.getDeviceKey();
            jsonWriter.name("DeviceKey");
            jsonWriter.value(deviceKey);
        }
        if (deviceType.getDeviceAttributes() != null) {
            java.util.List<AttributeType> deviceAttributes = deviceType.getDeviceAttributes();
            jsonWriter.name("DeviceAttributes");
            jsonWriter.beginArray();
            for (AttributeType deviceAttributesItem : deviceAttributes) {
                if (deviceAttributesItem != null) {
                    AttributeTypeJsonMarshaller.getInstance().marshall(deviceAttributesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (deviceType.getDeviceCreateDate() != null) {
            java.util.Date deviceCreateDate = deviceType.getDeviceCreateDate();
            jsonWriter.name("DeviceCreateDate");
            jsonWriter.value(deviceCreateDate);
        }
        if (deviceType.getDeviceLastModifiedDate() != null) {
            java.util.Date deviceLastModifiedDate = deviceType.getDeviceLastModifiedDate();
            jsonWriter.name("DeviceLastModifiedDate");
            jsonWriter.value(deviceLastModifiedDate);
        }
        if (deviceType.getDeviceLastAuthenticatedDate() != null) {
            java.util.Date deviceLastAuthenticatedDate = deviceType
                    .getDeviceLastAuthenticatedDate();
            jsonWriter.name("DeviceLastAuthenticatedDate");
            jsonWriter.value(deviceLastAuthenticatedDate);
        }
        jsonWriter.endObject();
    }

    private static DeviceTypeJsonMarshaller instance;

    public static DeviceTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeviceTypeJsonMarshaller();
        return instance;
    }
}
