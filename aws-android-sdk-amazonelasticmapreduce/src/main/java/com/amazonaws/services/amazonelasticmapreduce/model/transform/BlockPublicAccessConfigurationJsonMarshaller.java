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

package com.amazonaws.services.amazonelasticmapreduce.model.transform;

import com.amazonaws.services.amazonelasticmapreduce.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO BlockPublicAccessConfiguration
 */
class BlockPublicAccessConfigurationJsonMarshaller {

    public void marshall(BlockPublicAccessConfiguration blockPublicAccessConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (blockPublicAccessConfiguration.getBlockPublicSecurityGroupRules() != null) {
            Boolean blockPublicSecurityGroupRules = blockPublicAccessConfiguration
                    .getBlockPublicSecurityGroupRules();
            jsonWriter.name("BlockPublicSecurityGroupRules");
            jsonWriter.value(blockPublicSecurityGroupRules);
        }
        if (blockPublicAccessConfiguration.getPermittedPublicSecurityGroupRuleRanges() != null) {
            java.util.List<PortRange> permittedPublicSecurityGroupRuleRanges = blockPublicAccessConfiguration
                    .getPermittedPublicSecurityGroupRuleRanges();
            jsonWriter.name("PermittedPublicSecurityGroupRuleRanges");
            jsonWriter.beginArray();
            for (PortRange permittedPublicSecurityGroupRuleRangesItem : permittedPublicSecurityGroupRuleRanges) {
                if (permittedPublicSecurityGroupRuleRangesItem != null) {
                    PortRangeJsonMarshaller.getInstance().marshall(
                            permittedPublicSecurityGroupRuleRangesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static BlockPublicAccessConfigurationJsonMarshaller instance;

    public static BlockPublicAccessConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BlockPublicAccessConfigurationJsonMarshaller();
        return instance;
    }
}
