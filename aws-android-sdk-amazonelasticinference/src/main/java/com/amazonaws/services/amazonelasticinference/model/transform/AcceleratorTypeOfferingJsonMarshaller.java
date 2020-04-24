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

package com.amazonaws.services.amazonelasticinference.model.transform;

import com.amazonaws.services.amazonelasticinference.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AcceleratorTypeOffering
 */
class AcceleratorTypeOfferingJsonMarshaller {

    public void marshall(AcceleratorTypeOffering acceleratorTypeOffering, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (acceleratorTypeOffering.getAcceleratorType() != null) {
            String acceleratorType = acceleratorTypeOffering.getAcceleratorType();
            jsonWriter.name("acceleratorType");
            jsonWriter.value(acceleratorType);
        }
        if (acceleratorTypeOffering.getLocationType() != null) {
            String locationType = acceleratorTypeOffering.getLocationType();
            jsonWriter.name("locationType");
            jsonWriter.value(locationType);
        }
        if (acceleratorTypeOffering.getLocation() != null) {
            String location = acceleratorTypeOffering.getLocation();
            jsonWriter.name("location");
            jsonWriter.value(location);
        }
        jsonWriter.endObject();
    }

    private static AcceleratorTypeOfferingJsonMarshaller instance;

    public static AcceleratorTypeOfferingJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AcceleratorTypeOfferingJsonMarshaller();
        return instance;
    }
}
