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

package com.amazonaws.services.glue.model.transform;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PhysicalConnectionRequirements
 */
class PhysicalConnectionRequirementsJsonMarshaller {

    public void marshall(PhysicalConnectionRequirements physicalConnectionRequirements,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (physicalConnectionRequirements.getSubnetId() != null) {
            String subnetId = physicalConnectionRequirements.getSubnetId();
            jsonWriter.name("SubnetId");
            jsonWriter.value(subnetId);
        }
        if (physicalConnectionRequirements.getSecurityGroupIdList() != null) {
            java.util.List<String> securityGroupIdList = physicalConnectionRequirements
                    .getSecurityGroupIdList();
            jsonWriter.name("SecurityGroupIdList");
            jsonWriter.beginArray();
            for (String securityGroupIdListItem : securityGroupIdList) {
                if (securityGroupIdListItem != null) {
                    jsonWriter.value(securityGroupIdListItem);
                }
            }
            jsonWriter.endArray();
        }
        if (physicalConnectionRequirements.getAvailabilityZone() != null) {
            String availabilityZone = physicalConnectionRequirements.getAvailabilityZone();
            jsonWriter.name("AvailabilityZone");
            jsonWriter.value(availabilityZone);
        }
        jsonWriter.endObject();
    }

    private static PhysicalConnectionRequirementsJsonMarshaller instance;

    public static PhysicalConnectionRequirementsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PhysicalConnectionRequirementsJsonMarshaller();
        return instance;
    }
}
