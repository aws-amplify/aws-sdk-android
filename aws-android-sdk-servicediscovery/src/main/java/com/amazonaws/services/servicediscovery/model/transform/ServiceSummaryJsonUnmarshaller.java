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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ServiceSummary
 */
class ServiceSummaryJsonUnmarshaller implements
        Unmarshaller<ServiceSummary, JsonUnmarshallerContext> {

    public ServiceSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ServiceSummary serviceSummary = new ServiceSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Id")) {
                serviceSummary.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Arn")) {
                serviceSummary.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                serviceSummary.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                serviceSummary.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceCount")) {
                serviceSummary.setInstanceCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DnsConfig")) {
                serviceSummary.setDnsConfig(DnsConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HealthCheckConfig")) {
                serviceSummary.setHealthCheckConfig(HealthCheckConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HealthCheckCustomConfig")) {
                serviceSummary.setHealthCheckCustomConfig(HealthCheckCustomConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreateDate")) {
                serviceSummary.setCreateDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return serviceSummary;
    }

    private static ServiceSummaryJsonUnmarshaller instance;

    public static ServiceSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ServiceSummaryJsonUnmarshaller();
        return instance;
    }
}
