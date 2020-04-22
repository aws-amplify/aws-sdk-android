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

package com.amazonaws.services.amazonelasticsearchservice.model.transform;

import com.amazonaws.services.amazonelasticsearchservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO VPCDerivedInfo
 */
class VPCDerivedInfoJsonMarshaller {

    public void marshall(VPCDerivedInfo vPCDerivedInfo, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (vPCDerivedInfo.getVPCId() != null) {
            String vPCId = vPCDerivedInfo.getVPCId();
            jsonWriter.name("VPCId");
            jsonWriter.value(vPCId);
        }
        if (vPCDerivedInfo.getSubnetIds() != null) {
            java.util.List<String> subnetIds = vPCDerivedInfo.getSubnetIds();
            jsonWriter.name("SubnetIds");
            jsonWriter.beginArray();
            for (String subnetIdsItem : subnetIds) {
                if (subnetIdsItem != null) {
                    jsonWriter.value(subnetIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (vPCDerivedInfo.getAvailabilityZones() != null) {
            java.util.List<String> availabilityZones = vPCDerivedInfo.getAvailabilityZones();
            jsonWriter.name("AvailabilityZones");
            jsonWriter.beginArray();
            for (String availabilityZonesItem : availabilityZones) {
                if (availabilityZonesItem != null) {
                    jsonWriter.value(availabilityZonesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (vPCDerivedInfo.getSecurityGroupIds() != null) {
            java.util.List<String> securityGroupIds = vPCDerivedInfo.getSecurityGroupIds();
            jsonWriter.name("SecurityGroupIds");
            jsonWriter.beginArray();
            for (String securityGroupIdsItem : securityGroupIds) {
                if (securityGroupIdsItem != null) {
                    jsonWriter.value(securityGroupIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static VPCDerivedInfoJsonMarshaller instance;

    public static VPCDerivedInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VPCDerivedInfoJsonMarshaller();
        return instance;
    }
}
