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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Region
 */
class RegionJsonMarshaller {

    public void marshall(Region region, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (region.getEndpoint() != null) {
            String endpoint = region.getEndpoint();
            jsonWriter.name("Endpoint");
            jsonWriter.value(endpoint);
        }
        if (region.getRegionName() != null) {
            String regionName = region.getRegionName();
            jsonWriter.name("RegionName");
            jsonWriter.value(regionName);
        }
        if (region.getOptInStatus() != null) {
            String optInStatus = region.getOptInStatus();
            jsonWriter.name("OptInStatus");
            jsonWriter.value(optInStatus);
        }
        jsonWriter.endObject();
    }

    private static RegionJsonMarshaller instance;

    public static RegionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RegionJsonMarshaller();
        return instance;
    }
}
