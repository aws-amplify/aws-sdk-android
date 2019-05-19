/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model.transform;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO VpcConfig
 */
class VpcConfigJsonMarshaller {

    public void marshall(VpcConfig vpcConfig, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (vpcConfig.getSecurityGroupIds() != null) {
            java.util.List<String> securityGroupIds = vpcConfig.getSecurityGroupIds();
            jsonWriter.name("SecurityGroupIds");
            jsonWriter.beginArray();
            for (String securityGroupIdsItem : securityGroupIds) {
                if (securityGroupIdsItem != null) {
                    jsonWriter.value(securityGroupIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (vpcConfig.getSubnets() != null) {
            java.util.List<String> subnets = vpcConfig.getSubnets();
            jsonWriter.name("Subnets");
            jsonWriter.beginArray();
            for (String subnetsItem : subnets) {
                if (subnetsItem != null) {
                    jsonWriter.value(subnetsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static VpcConfigJsonMarshaller instance;

    public static VpcConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VpcConfigJsonMarshaller();
        return instance;
    }
}
