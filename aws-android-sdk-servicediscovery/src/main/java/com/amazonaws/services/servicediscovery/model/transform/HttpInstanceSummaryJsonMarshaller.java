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

package com.amazonaws.services.servicediscovery.model.transform;

import com.amazonaws.services.servicediscovery.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HttpInstanceSummary
 */
class HttpInstanceSummaryJsonMarshaller {

    public void marshall(HttpInstanceSummary httpInstanceSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (httpInstanceSummary.getInstanceId() != null) {
            String instanceId = httpInstanceSummary.getInstanceId();
            jsonWriter.name("InstanceId");
            jsonWriter.value(instanceId);
        }
        if (httpInstanceSummary.getNamespaceName() != null) {
            String namespaceName = httpInstanceSummary.getNamespaceName();
            jsonWriter.name("NamespaceName");
            jsonWriter.value(namespaceName);
        }
        if (httpInstanceSummary.getServiceName() != null) {
            String serviceName = httpInstanceSummary.getServiceName();
            jsonWriter.name("ServiceName");
            jsonWriter.value(serviceName);
        }
        if (httpInstanceSummary.getHealthStatus() != null) {
            String healthStatus = httpInstanceSummary.getHealthStatus();
            jsonWriter.name("HealthStatus");
            jsonWriter.value(healthStatus);
        }
        if (httpInstanceSummary.getAttributes() != null) {
            java.util.Map<String, String> attributes = httpInstanceSummary.getAttributes();
            jsonWriter.name("Attributes");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> attributesEntry : attributes.entrySet()) {
                String attributesValue = attributesEntry.getValue();
                if (attributesValue != null) {
                    jsonWriter.name(attributesEntry.getKey());
                    jsonWriter.value(attributesValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static HttpInstanceSummaryJsonMarshaller instance;

    public static HttpInstanceSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HttpInstanceSummaryJsonMarshaller();
        return instance;
    }
}
