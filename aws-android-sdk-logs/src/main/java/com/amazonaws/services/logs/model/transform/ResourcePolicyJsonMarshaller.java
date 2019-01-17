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

package com.amazonaws.services.logs.model.transform;

import com.amazonaws.services.logs.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ResourcePolicy
 */
class ResourcePolicyJsonMarshaller {

    public void marshall(ResourcePolicy resourcePolicy, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (resourcePolicy.getPolicyName() != null) {
            String policyName = resourcePolicy.getPolicyName();
            jsonWriter.name("policyName");
            jsonWriter.value(policyName);
        }
        if (resourcePolicy.getPolicyDocument() != null) {
            String policyDocument = resourcePolicy.getPolicyDocument();
            jsonWriter.name("policyDocument");
            jsonWriter.value(policyDocument);
        }
        if (resourcePolicy.getLastUpdatedTime() != null) {
            Long lastUpdatedTime = resourcePolicy.getLastUpdatedTime();
            jsonWriter.name("lastUpdatedTime");
            jsonWriter.value(lastUpdatedTime);
        }
        jsonWriter.endObject();
    }

    private static ResourcePolicyJsonMarshaller instance;

    public static ResourcePolicyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResourcePolicyJsonMarshaller();
        return instance;
    }
}
