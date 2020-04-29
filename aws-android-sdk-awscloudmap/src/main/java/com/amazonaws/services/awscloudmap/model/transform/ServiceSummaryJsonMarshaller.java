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

package com.amazonaws.services.awscloudmap.model.transform;

import com.amazonaws.services.awscloudmap.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ServiceSummary
 */
class ServiceSummaryJsonMarshaller {

    public void marshall(ServiceSummary serviceSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (serviceSummary.getId() != null) {
            String id = serviceSummary.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (serviceSummary.getArn() != null) {
            String arn = serviceSummary.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (serviceSummary.getName() != null) {
            String name = serviceSummary.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (serviceSummary.getDescription() != null) {
            String description = serviceSummary.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (serviceSummary.getInstanceCount() != null) {
            Integer instanceCount = serviceSummary.getInstanceCount();
            jsonWriter.name("InstanceCount");
            jsonWriter.value(instanceCount);
        }
        if (serviceSummary.getDnsConfig() != null) {
            DnsConfig dnsConfig = serviceSummary.getDnsConfig();
            jsonWriter.name("DnsConfig");
            DnsConfigJsonMarshaller.getInstance().marshall(dnsConfig, jsonWriter);
        }
        if (serviceSummary.getHealthCheckConfig() != null) {
            HealthCheckConfig healthCheckConfig = serviceSummary.getHealthCheckConfig();
            jsonWriter.name("HealthCheckConfig");
            HealthCheckConfigJsonMarshaller.getInstance().marshall(healthCheckConfig, jsonWriter);
        }
        if (serviceSummary.getHealthCheckCustomConfig() != null) {
            HealthCheckCustomConfig healthCheckCustomConfig = serviceSummary
                    .getHealthCheckCustomConfig();
            jsonWriter.name("HealthCheckCustomConfig");
            HealthCheckCustomConfigJsonMarshaller.getInstance().marshall(healthCheckCustomConfig,
                    jsonWriter);
        }
        if (serviceSummary.getCreateDate() != null) {
            java.util.Date createDate = serviceSummary.getCreateDate();
            jsonWriter.name("CreateDate");
            jsonWriter.value(createDate);
        }
        jsonWriter.endObject();
    }

    private static ServiceSummaryJsonMarshaller instance;

    public static ServiceSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ServiceSummaryJsonMarshaller();
        return instance;
    }
}
