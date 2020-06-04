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
 * JSON marshaller for POJO SpotPlacement
 */
class SpotPlacementJsonMarshaller {

    public void marshall(SpotPlacement spotPlacement, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (spotPlacement.getAvailabilityZone() != null) {
            String availabilityZone = spotPlacement.getAvailabilityZone();
            jsonWriter.name("AvailabilityZone");
            jsonWriter.value(availabilityZone);
        }
        if (spotPlacement.getGroupName() != null) {
            String groupName = spotPlacement.getGroupName();
            jsonWriter.name("GroupName");
            jsonWriter.value(groupName);
        }
        if (spotPlacement.getTenancy() != null) {
            String tenancy = spotPlacement.getTenancy();
            jsonWriter.name("Tenancy");
            jsonWriter.value(tenancy);
        }
        jsonWriter.endObject();
    }

    private static SpotPlacementJsonMarshaller instance;

    public static SpotPlacementJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SpotPlacementJsonMarshaller();
        return instance;
    }
}
