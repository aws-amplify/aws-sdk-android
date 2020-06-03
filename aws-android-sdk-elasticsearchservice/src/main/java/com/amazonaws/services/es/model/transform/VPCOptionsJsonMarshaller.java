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
 * JSON marshaller for POJO VPCOptions
 */
class VPCOptionsJsonMarshaller {

    public void marshall(VPCOptions vPCOptions, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (vPCOptions.getSubnetIds() != null) {
            java.util.List<String> subnetIds = vPCOptions.getSubnetIds();
            jsonWriter.name("SubnetIds");
            jsonWriter.beginArray();
            for (String subnetIdsItem : subnetIds) {
                if (subnetIdsItem != null) {
                    jsonWriter.value(subnetIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (vPCOptions.getSecurityGroupIds() != null) {
            java.util.List<String> securityGroupIds = vPCOptions.getSecurityGroupIds();
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

    private static VPCOptionsJsonMarshaller instance;

    public static VPCOptionsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VPCOptionsJsonMarshaller();
        return instance;
    }
}
