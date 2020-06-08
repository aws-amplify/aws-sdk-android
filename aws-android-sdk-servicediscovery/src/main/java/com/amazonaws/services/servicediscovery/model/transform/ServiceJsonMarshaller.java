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
 * JSON marshaller for POJO Service
 */
class ServiceJsonMarshaller {

    public void marshall(Service service, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (service.getId() != null) {
            String id = service.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (service.getArn() != null) {
            String arn = service.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (service.getName() != null) {
            String name = service.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (service.getNamespaceId() != null) {
            String namespaceId = service.getNamespaceId();
            jsonWriter.name("NamespaceId");
            jsonWriter.value(namespaceId);
        }
        if (service.getDescription() != null) {
            String description = service.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (service.getInstanceCount() != null) {
            Integer instanceCount = service.getInstanceCount();
            jsonWriter.name("InstanceCount");
            jsonWriter.value(instanceCount);
        }
        if (service.getDnsConfig() != null) {
            DnsConfig dnsConfig = service.getDnsConfig();
            jsonWriter.name("DnsConfig");
            DnsConfigJsonMarshaller.getInstance().marshall(dnsConfig, jsonWriter);
        }
        if (service.getHealthCheckConfig() != null) {
            HealthCheckConfig healthCheckConfig = service.getHealthCheckConfig();
            jsonWriter.name("HealthCheckConfig");
            HealthCheckConfigJsonMarshaller.getInstance().marshall(healthCheckConfig, jsonWriter);
        }
        if (service.getHealthCheckCustomConfig() != null) {
            HealthCheckCustomConfig healthCheckCustomConfig = service.getHealthCheckCustomConfig();
            jsonWriter.name("HealthCheckCustomConfig");
            HealthCheckCustomConfigJsonMarshaller.getInstance().marshall(healthCheckCustomConfig,
                    jsonWriter);
        }
        if (service.getCreateDate() != null) {
            java.util.Date createDate = service.getCreateDate();
            jsonWriter.name("CreateDate");
            jsonWriter.value(createDate);
        }
        if (service.getCreatorRequestId() != null) {
            String creatorRequestId = service.getCreatorRequestId();
            jsonWriter.name("CreatorRequestId");
            jsonWriter.value(creatorRequestId);
        }
        jsonWriter.endObject();
    }

    private static ServiceJsonMarshaller instance;

    public static ServiceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ServiceJsonMarshaller();
        return instance;
    }
}
