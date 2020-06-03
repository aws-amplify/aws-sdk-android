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
 * JSON marshaller for POJO ZoneAwarenessConfig
 */
class ZoneAwarenessConfigJsonMarshaller {

    public void marshall(ZoneAwarenessConfig zoneAwarenessConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (zoneAwarenessConfig.getAvailabilityZoneCount() != null) {
            Integer availabilityZoneCount = zoneAwarenessConfig.getAvailabilityZoneCount();
            jsonWriter.name("AvailabilityZoneCount");
            jsonWriter.value(availabilityZoneCount);
        }
        jsonWriter.endObject();
    }

    private static ZoneAwarenessConfigJsonMarshaller instance;

    public static ZoneAwarenessConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ZoneAwarenessConfigJsonMarshaller();
        return instance;
    }
}
