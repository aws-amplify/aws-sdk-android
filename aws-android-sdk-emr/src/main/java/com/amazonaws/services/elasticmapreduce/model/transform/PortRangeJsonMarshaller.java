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
 * JSON marshaller for POJO PortRange
 */
class PortRangeJsonMarshaller {

    public void marshall(PortRange portRange, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (portRange.getMinRange() != null) {
            Integer minRange = portRange.getMinRange();
            jsonWriter.name("MinRange");
            jsonWriter.value(minRange);
        }
        if (portRange.getMaxRange() != null) {
            Integer maxRange = portRange.getMaxRange();
            jsonWriter.name("MaxRange");
            jsonWriter.value(maxRange);
        }
        jsonWriter.endObject();
    }

    private static PortRangeJsonMarshaller instance;

    public static PortRangeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PortRangeJsonMarshaller();
        return instance;
    }
}
