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

package com.amazonaws.services.firewallmanagementservice.model.transform;

import com.amazonaws.services.firewallmanagementservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Policy
 */
class PolicyJsonUnmarshaller implements Unmarshaller<Policy, JsonUnmarshallerContext> {

    public Policy unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Policy policy = new Policy();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("PolicyId")) {
                policy.setPolicyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PolicyName")) {
                policy.setPolicyName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PolicyUpdateToken")) {
                policy.setPolicyUpdateToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SecurityServicePolicyData")) {
                policy.setSecurityServicePolicyData(SecurityServicePolicyDataJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ResourceType")) {
                policy.setResourceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ResourceTypeList")) {
                policy.setResourceTypeList(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ResourceTags")) {
                policy.setResourceTags(new ListUnmarshaller<ResourceTag>(
                        ResourceTagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ExcludeResourceTags")) {
                policy.setExcludeResourceTags(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RemediationEnabled")) {
                policy.setRemediationEnabled(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IncludeMap")) {
                policy.setIncludeMap(new MapUnmarshaller<java.util.List<String>>(
                        new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
                        )
                        )
                                .unmarshall(context));
            } else if (name.equals("ExcludeMap")) {
                policy.setExcludeMap(new MapUnmarshaller<java.util.List<String>>(
                        new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
                        )
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return policy;
    }

    private static PolicyJsonUnmarshaller instance;

    public static PolicyJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PolicyJsonUnmarshaller();
        return instance;
    }
}
