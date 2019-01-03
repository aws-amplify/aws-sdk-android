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
 * JSON marshaller for POJO NewDeviceMetadataType
 */
class NewDeviceMetadataTypeJsonMarshaller {

    public void marshall(NewDeviceMetadataType newDeviceMetadataType, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (newDeviceMetadataType.getDeviceKey() != null) {
            String deviceKey = newDeviceMetadataType.getDeviceKey();
            jsonWriter.name("DeviceKey");
            jsonWriter.value(deviceKey);
        }
        if (newDeviceMetadataType.getDeviceGroupKey() != null) {
            String deviceGroupKey = newDeviceMetadataType.getDeviceGroupKey();
            jsonWriter.name("DeviceGroupKey");
            jsonWriter.value(deviceGroupKey);
        }
        jsonWriter.endObject();
    }

    private static NewDeviceMetadataTypeJsonMarshaller instance;

    public static NewDeviceMetadataTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NewDeviceMetadataTypeJsonMarshaller();
        return instance;
    }
}
