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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LoadBalancer
 */
class LoadBalancerJsonMarshaller {

    public void marshall(LoadBalancer loadBalancer, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (loadBalancer.getName() != null) {
            String name = loadBalancer.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (loadBalancer.getArn() != null) {
            String arn = loadBalancer.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (loadBalancer.getSupportCode() != null) {
            String supportCode = loadBalancer.getSupportCode();
            jsonWriter.name("supportCode");
            jsonWriter.value(supportCode);
        }
        if (loadBalancer.getCreatedAt() != null) {
            java.util.Date createdAt = loadBalancer.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (loadBalancer.getLocation() != null) {
            ResourceLocation location = loadBalancer.getLocation();
            jsonWriter.name("location");
            ResourceLocationJsonMarshaller.getInstance().marshall(location, jsonWriter);
        }
        if (loadBalancer.getResourceType() != null) {
            String resourceType = loadBalancer.getResourceType();
            jsonWriter.name("resourceType");
            jsonWriter.value(resourceType);
        }
        if (loadBalancer.getTags() != null) {
            java.util.List<Tag> tags = loadBalancer.getTags();
            jsonWriter.name("tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (loadBalancer.getDnsName() != null) {
            String dnsName = loadBalancer.getDnsName();
            jsonWriter.name("dnsName");
            jsonWriter.value(dnsName);
        }
        if (loadBalancer.getState() != null) {
            String state = loadBalancer.getState();
            jsonWriter.name("state");
            jsonWriter.value(state);
        }
        if (loadBalancer.getProtocol() != null) {
            String protocol = loadBalancer.getProtocol();
            jsonWriter.name("protocol");
            jsonWriter.value(protocol);
        }
        if (loadBalancer.getPublicPorts() != null) {
            java.util.List<Integer> publicPorts = loadBalancer.getPublicPorts();
            jsonWriter.name("publicPorts");
            jsonWriter.beginArray();
            for (Integer publicPortsItem : publicPorts) {
                if (publicPortsItem != null) {
                    jsonWriter.value(publicPortsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (loadBalancer.getHealthCheckPath() != null) {
            String healthCheckPath = loadBalancer.getHealthCheckPath();
            jsonWriter.name("healthCheckPath");
            jsonWriter.value(healthCheckPath);
        }
        if (loadBalancer.getInstancePort() != null) {
            Integer instancePort = loadBalancer.getInstancePort();
            jsonWriter.name("instancePort");
            jsonWriter.value(instancePort);
        }
        if (loadBalancer.getInstanceHealthSummary() != null) {
            java.util.List<InstanceHealthSummary> instanceHealthSummary = loadBalancer
                    .getInstanceHealthSummary();
            jsonWriter.name("instanceHealthSummary");
            jsonWriter.beginArray();
            for (InstanceHealthSummary instanceHealthSummaryItem : instanceHealthSummary) {
                if (instanceHealthSummaryItem != null) {
                    InstanceHealthSummaryJsonMarshaller.getInstance().marshall(
                            instanceHealthSummaryItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (loadBalancer.getTlsCertificateSummaries() != null) {
            java.util.List<LoadBalancerTlsCertificateSummary> tlsCertificateSummaries = loadBalancer
                    .getTlsCertificateSummaries();
            jsonWriter.name("tlsCertificateSummaries");
            jsonWriter.beginArray();
            for (LoadBalancerTlsCertificateSummary tlsCertificateSummariesItem : tlsCertificateSummaries) {
                if (tlsCertificateSummariesItem != null) {
                    LoadBalancerTlsCertificateSummaryJsonMarshaller.getInstance().marshall(
                            tlsCertificateSummariesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (loadBalancer.getConfigurationOptions() != null) {
            java.util.Map<String, String> configurationOptions = loadBalancer
                    .getConfigurationOptions();
            jsonWriter.name("configurationOptions");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> configurationOptionsEntry : configurationOptions
                    .entrySet()) {
                String configurationOptionsValue = configurationOptionsEntry.getValue();
                if (configurationOptionsValue != null) {
                    jsonWriter.name(configurationOptionsEntry.getKey());
                    jsonWriter.value(configurationOptionsValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static LoadBalancerJsonMarshaller instance;

    public static LoadBalancerJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LoadBalancerJsonMarshaller();
        return instance;
    }
}
