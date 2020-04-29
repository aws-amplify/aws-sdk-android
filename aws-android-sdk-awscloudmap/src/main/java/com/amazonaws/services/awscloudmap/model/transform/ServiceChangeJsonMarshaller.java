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
 * JSON marshaller for POJO ServiceChange
 */
class ServiceChangeJsonMarshaller {

    public void marshall(ServiceChange serviceChange, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (serviceChange.getDescription() != null) {
            String description = serviceChange.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (serviceChange.getDnsConfig() != null) {
            DnsConfigChange dnsConfig = serviceChange.getDnsConfig();
            jsonWriter.name("DnsConfig");
            DnsConfigChangeJsonMarshaller.getInstance().marshall(dnsConfig, jsonWriter);
        }
        if (serviceChange.getHealthCheckConfig() != null) {
            HealthCheckConfig healthCheckConfig = serviceChange.getHealthCheckConfig();
            jsonWriter.name("HealthCheckConfig");
            HealthCheckConfigJsonMarshaller.getInstance().marshall(healthCheckConfig, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ServiceChangeJsonMarshaller instance;

    public static ServiceChangeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ServiceChangeJsonMarshaller();
        return instance;
    }
}
