/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model.transform;

import com.amazonaws.services.geo.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TruckDimensions
 */
class TruckDimensionsJsonMarshaller {

    public void marshall(TruckDimensions truckDimensions, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (truckDimensions.getHeight() != null) {
            Double height = truckDimensions.getHeight();
            jsonWriter.name("Height");
            jsonWriter.value(height);
        }
        if (truckDimensions.getLength() != null) {
            Double length = truckDimensions.getLength();
            jsonWriter.name("Length");
            jsonWriter.value(length);
        }
        if (truckDimensions.getUnit() != null) {
            String unit = truckDimensions.getUnit();
            jsonWriter.name("Unit");
            jsonWriter.value(unit);
        }
        if (truckDimensions.getWidth() != null) {
            Double width = truckDimensions.getWidth();
            jsonWriter.name("Width");
            jsonWriter.value(width);
        }
        jsonWriter.endObject();
    }

    private static TruckDimensionsJsonMarshaller instance;

    public static TruckDimensionsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TruckDimensionsJsonMarshaller();
        return instance;
    }
}
