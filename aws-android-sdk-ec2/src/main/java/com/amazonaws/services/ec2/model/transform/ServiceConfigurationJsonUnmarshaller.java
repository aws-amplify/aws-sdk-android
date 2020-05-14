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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ServiceConfiguration
 */
class ServiceConfigurationJsonUnmarshaller implements
        Unmarshaller<ServiceConfiguration, JsonUnmarshallerContext> {

    public ServiceConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ServiceConfiguration serviceConfiguration = new ServiceConfiguration();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ServiceType")) {
                serviceConfiguration.setServiceType(new ListUnmarshaller<ServiceTypeDetail>(
                        ServiceTypeDetailJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ServiceId")) {
                serviceConfiguration.setServiceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ServiceName")) {
                serviceConfiguration.setServiceName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ServiceState")) {
                serviceConfiguration.setServiceState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AvailabilityZones")) {
                serviceConfiguration.setAvailabilityZones(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("AcceptanceRequired")) {
                serviceConfiguration.setAcceptanceRequired(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ManagesVpcEndpoints")) {
                serviceConfiguration.setManagesVpcEndpoints(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NetworkLoadBalancerArns")) {
                serviceConfiguration.setNetworkLoadBalancerArns(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("BaseEndpointDnsNames")) {
                serviceConfiguration.setBaseEndpointDnsNames(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("PrivateDnsName")) {
                serviceConfiguration.setPrivateDnsName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PrivateDnsNameConfiguration")) {
                serviceConfiguration
                        .setPrivateDnsNameConfiguration(PrivateDnsNameConfigurationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("Tags")) {
                serviceConfiguration.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return serviceConfiguration;
    }

    private static ServiceConfigurationJsonUnmarshaller instance;

    public static ServiceConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ServiceConfigurationJsonUnmarshaller();
        return instance;
    }
}
