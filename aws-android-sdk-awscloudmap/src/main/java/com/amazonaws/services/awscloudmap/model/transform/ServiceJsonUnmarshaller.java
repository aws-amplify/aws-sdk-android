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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Service
 */
class ServiceJsonUnmarshaller implements Unmarshaller<Service, JsonUnmarshallerContext> {

    public Service unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Service service = new Service();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Id")) {
                service.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Arn")) {
                service.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                service.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NamespaceId")) {
                service.setNamespaceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                service.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceCount")) {
                service.setInstanceCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DnsConfig")) {
                service.setDnsConfig(DnsConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HealthCheckConfig")) {
                service.setHealthCheckConfig(HealthCheckConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HealthCheckCustomConfig")) {
                service.setHealthCheckCustomConfig(HealthCheckCustomConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreateDate")) {
                service.setCreateDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatorRequestId")) {
                service.setCreatorRequestId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return service;
    }

    private static ServiceJsonUnmarshaller instance;

    public static ServiceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ServiceJsonUnmarshaller();
        return instance;
    }
}
