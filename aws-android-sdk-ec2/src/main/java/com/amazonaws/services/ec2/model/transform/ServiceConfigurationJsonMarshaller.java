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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ServiceConfiguration
 */
class ServiceConfigurationJsonMarshaller {

    public void marshall(ServiceConfiguration serviceConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (serviceConfiguration.getServiceType() != null) {
            java.util.List<ServiceTypeDetail> serviceType = serviceConfiguration.getServiceType();
            jsonWriter.name("ServiceType");
            jsonWriter.beginArray();
            for (ServiceTypeDetail serviceTypeItem : serviceType) {
                if (serviceTypeItem != null) {
                    ServiceTypeDetailJsonMarshaller.getInstance().marshall(serviceTypeItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (serviceConfiguration.getServiceId() != null) {
            String serviceId = serviceConfiguration.getServiceId();
            jsonWriter.name("ServiceId");
            jsonWriter.value(serviceId);
        }
        if (serviceConfiguration.getServiceName() != null) {
            String serviceName = serviceConfiguration.getServiceName();
            jsonWriter.name("ServiceName");
            jsonWriter.value(serviceName);
        }
        if (serviceConfiguration.getServiceState() != null) {
            String serviceState = serviceConfiguration.getServiceState();
            jsonWriter.name("ServiceState");
            jsonWriter.value(serviceState);
        }
        if (serviceConfiguration.getAvailabilityZones() != null) {
            java.util.List<String> availabilityZones = serviceConfiguration.getAvailabilityZones();
            jsonWriter.name("AvailabilityZones");
            jsonWriter.beginArray();
            for (String availabilityZonesItem : availabilityZones) {
                if (availabilityZonesItem != null) {
                    jsonWriter.value(availabilityZonesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (serviceConfiguration.getAcceptanceRequired() != null) {
            Boolean acceptanceRequired = serviceConfiguration.getAcceptanceRequired();
            jsonWriter.name("AcceptanceRequired");
            jsonWriter.value(acceptanceRequired);
        }
        if (serviceConfiguration.getManagesVpcEndpoints() != null) {
            Boolean managesVpcEndpoints = serviceConfiguration.getManagesVpcEndpoints();
            jsonWriter.name("ManagesVpcEndpoints");
            jsonWriter.value(managesVpcEndpoints);
        }
        if (serviceConfiguration.getNetworkLoadBalancerArns() != null) {
            java.util.List<String> networkLoadBalancerArns = serviceConfiguration
                    .getNetworkLoadBalancerArns();
            jsonWriter.name("NetworkLoadBalancerArns");
            jsonWriter.beginArray();
            for (String networkLoadBalancerArnsItem : networkLoadBalancerArns) {
                if (networkLoadBalancerArnsItem != null) {
                    jsonWriter.value(networkLoadBalancerArnsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (serviceConfiguration.getBaseEndpointDnsNames() != null) {
            java.util.List<String> baseEndpointDnsNames = serviceConfiguration
                    .getBaseEndpointDnsNames();
            jsonWriter.name("BaseEndpointDnsNames");
            jsonWriter.beginArray();
            for (String baseEndpointDnsNamesItem : baseEndpointDnsNames) {
                if (baseEndpointDnsNamesItem != null) {
                    jsonWriter.value(baseEndpointDnsNamesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (serviceConfiguration.getPrivateDnsName() != null) {
            String privateDnsName = serviceConfiguration.getPrivateDnsName();
            jsonWriter.name("PrivateDnsName");
            jsonWriter.value(privateDnsName);
        }
        if (serviceConfiguration.getPrivateDnsNameConfiguration() != null) {
            PrivateDnsNameConfiguration privateDnsNameConfiguration = serviceConfiguration
                    .getPrivateDnsNameConfiguration();
            jsonWriter.name("PrivateDnsNameConfiguration");
            PrivateDnsNameConfigurationJsonMarshaller.getInstance().marshall(
                    privateDnsNameConfiguration, jsonWriter);
        }
        if (serviceConfiguration.getTags() != null) {
            java.util.List<Tag> tags = serviceConfiguration.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ServiceConfigurationJsonMarshaller instance;

    public static ServiceConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ServiceConfigurationJsonMarshaller();
        return instance;
    }
}
