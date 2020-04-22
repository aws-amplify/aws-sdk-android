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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Policy
 */
class PolicyJsonMarshaller {

    public void marshall(Policy policy, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (policy.getPolicyId() != null) {
            String policyId = policy.getPolicyId();
            jsonWriter.name("PolicyId");
            jsonWriter.value(policyId);
        }
        if (policy.getPolicyName() != null) {
            String policyName = policy.getPolicyName();
            jsonWriter.name("PolicyName");
            jsonWriter.value(policyName);
        }
        if (policy.getPolicyUpdateToken() != null) {
            String policyUpdateToken = policy.getPolicyUpdateToken();
            jsonWriter.name("PolicyUpdateToken");
            jsonWriter.value(policyUpdateToken);
        }
        if (policy.getSecurityServicePolicyData() != null) {
            SecurityServicePolicyData securityServicePolicyData = policy
                    .getSecurityServicePolicyData();
            jsonWriter.name("SecurityServicePolicyData");
            SecurityServicePolicyDataJsonMarshaller.getInstance().marshall(
                    securityServicePolicyData, jsonWriter);
        }
        if (policy.getResourceType() != null) {
            String resourceType = policy.getResourceType();
            jsonWriter.name("ResourceType");
            jsonWriter.value(resourceType);
        }
        if (policy.getResourceTypeList() != null) {
            java.util.List<String> resourceTypeList = policy.getResourceTypeList();
            jsonWriter.name("ResourceTypeList");
            jsonWriter.beginArray();
            for (String resourceTypeListItem : resourceTypeList) {
                if (resourceTypeListItem != null) {
                    jsonWriter.value(resourceTypeListItem);
                }
            }
            jsonWriter.endArray();
        }
        if (policy.getResourceTags() != null) {
            java.util.List<ResourceTag> resourceTags = policy.getResourceTags();
            jsonWriter.name("ResourceTags");
            jsonWriter.beginArray();
            for (ResourceTag resourceTagsItem : resourceTags) {
                if (resourceTagsItem != null) {
                    ResourceTagJsonMarshaller.getInstance().marshall(resourceTagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (policy.getExcludeResourceTags() != null) {
            Boolean excludeResourceTags = policy.getExcludeResourceTags();
            jsonWriter.name("ExcludeResourceTags");
            jsonWriter.value(excludeResourceTags);
        }
        if (policy.getRemediationEnabled() != null) {
            Boolean remediationEnabled = policy.getRemediationEnabled();
            jsonWriter.name("RemediationEnabled");
            jsonWriter.value(remediationEnabled);
        }
        if (policy.getIncludeMap() != null) {
            java.util.Map<String, java.util.List<String>> includeMap = policy.getIncludeMap();
            jsonWriter.name("IncludeMap");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, java.util.List<String>> includeMapEntry : includeMap
                    .entrySet()) {
                java.util.List<String> includeMapValue = includeMapEntry.getValue();
                if (includeMapValue != null) {
                    jsonWriter.name(includeMapEntry.getKey());
                    jsonWriter.beginArray();
                    for (String includeMapValueItem : includeMapValue) {
                        if (includeMapValueItem != null) {
                            jsonWriter.value(includeMapValueItem);
                        }
                    }
                    jsonWriter.endArray();
                }
            }
            jsonWriter.endObject();
        }
        if (policy.getExcludeMap() != null) {
            java.util.Map<String, java.util.List<String>> excludeMap = policy.getExcludeMap();
            jsonWriter.name("ExcludeMap");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, java.util.List<String>> excludeMapEntry : excludeMap
                    .entrySet()) {
                java.util.List<String> excludeMapValue = excludeMapEntry.getValue();
                if (excludeMapValue != null) {
                    jsonWriter.name(excludeMapEntry.getKey());
                    jsonWriter.beginArray();
                    for (String excludeMapValueItem : excludeMapValue) {
                        if (excludeMapValueItem != null) {
                            jsonWriter.value(excludeMapValueItem);
                        }
                    }
                    jsonWriter.endArray();
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static PolicyJsonMarshaller instance;

    public static PolicyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PolicyJsonMarshaller();
        return instance;
    }
}
