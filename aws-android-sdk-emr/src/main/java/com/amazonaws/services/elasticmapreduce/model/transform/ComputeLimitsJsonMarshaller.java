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

package com.amazonaws.services.elasticmapreduce.model.transform;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ComputeLimits
 */
class ComputeLimitsJsonMarshaller {

    public void marshall(ComputeLimits computeLimits, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (computeLimits.getUnitType() != null) {
            String unitType = computeLimits.getUnitType();
            jsonWriter.name("UnitType");
            jsonWriter.value(unitType);
        }
        if (computeLimits.getMinimumCapacityUnits() != null) {
            Integer minimumCapacityUnits = computeLimits.getMinimumCapacityUnits();
            jsonWriter.name("MinimumCapacityUnits");
            jsonWriter.value(minimumCapacityUnits);
        }
        if (computeLimits.getMaximumCapacityUnits() != null) {
            Integer maximumCapacityUnits = computeLimits.getMaximumCapacityUnits();
            jsonWriter.name("MaximumCapacityUnits");
            jsonWriter.value(maximumCapacityUnits);
        }
        if (computeLimits.getMaximumOnDemandCapacityUnits() != null) {
            Integer maximumOnDemandCapacityUnits = computeLimits.getMaximumOnDemandCapacityUnits();
            jsonWriter.name("MaximumOnDemandCapacityUnits");
            jsonWriter.value(maximumOnDemandCapacityUnits);
        }
        jsonWriter.endObject();
    }

    private static ComputeLimitsJsonMarshaller instance;

    public static ComputeLimitsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ComputeLimitsJsonMarshaller();
        return instance;
    }
}
