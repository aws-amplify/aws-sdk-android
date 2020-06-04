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

package com.amazonaws.services.lightsail.model.transform;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO LoadBalancer
 */
class LoadBalancerJsonUnmarshaller implements Unmarshaller<LoadBalancer, JsonUnmarshallerContext> {

    public LoadBalancer unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        LoadBalancer loadBalancer = new LoadBalancer();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("name")) {
                loadBalancer.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("arn")) {
                loadBalancer.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("supportCode")) {
                loadBalancer.setSupportCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createdAt")) {
                loadBalancer.setCreatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("location")) {
                loadBalancer.setLocation(ResourceLocationJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("resourceType")) {
                loadBalancer.setResourceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                loadBalancer.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("dnsName")) {
                loadBalancer.setDnsName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("state")) {
                loadBalancer.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("protocol")) {
                loadBalancer.setProtocol(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("publicPorts")) {
                loadBalancer.setPublicPorts(new ListUnmarshaller<Integer>(IntegerJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("healthCheckPath")) {
                loadBalancer.setHealthCheckPath(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("instancePort")) {
                loadBalancer.setInstancePort(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("instanceHealthSummary")) {
                loadBalancer.setInstanceHealthSummary(new ListUnmarshaller<InstanceHealthSummary>(
                        InstanceHealthSummaryJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("tlsCertificateSummaries")) {
                loadBalancer
                        .setTlsCertificateSummaries(new ListUnmarshaller<LoadBalancerTlsCertificateSummary>(
                                LoadBalancerTlsCertificateSummaryJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("configurationOptions")) {
                loadBalancer.setConfigurationOptions(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return loadBalancer;
    }

    private static LoadBalancerJsonUnmarshaller instance;

    public static LoadBalancerJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LoadBalancerJsonUnmarshaller();
        return instance;
    }
}
