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

package com.amazonaws.services.amazonpinpoint.model.transform;

import com.amazonaws.services.amazonpinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CustomDeliveryConfiguration
 */
class CustomDeliveryConfigurationJsonMarshaller {

    public void marshall(CustomDeliveryConfiguration customDeliveryConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (customDeliveryConfiguration.getDeliveryUri() != null) {
            String deliveryUri = customDeliveryConfiguration.getDeliveryUri();
            jsonWriter.name("DeliveryUri");
            jsonWriter.value(deliveryUri);
        }
        if (customDeliveryConfiguration.getEndpointTypes() != null) {
            java.util.List<String> endpointTypes = customDeliveryConfiguration.getEndpointTypes();
            jsonWriter.name("EndpointTypes");
            jsonWriter.beginArray();
            for (String endpointTypesItem : endpointTypes) {
                if (endpointTypesItem != null) {
                    jsonWriter.value(endpointTypesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static CustomDeliveryConfigurationJsonMarshaller instance;

    public static CustomDeliveryConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CustomDeliveryConfigurationJsonMarshaller();
        return instance;
    }
}
