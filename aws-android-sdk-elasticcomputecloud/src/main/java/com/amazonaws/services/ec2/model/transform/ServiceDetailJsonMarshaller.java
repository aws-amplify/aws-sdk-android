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
 * JSON marshaller for POJO ServiceDetail
 */
class ServiceDetailJsonMarshaller {

    public void marshall(ServiceDetail serviceDetail, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (serviceDetail.getServiceName() != null) {
            String serviceName = serviceDetail.getServiceName();
            jsonWriter.name("ServiceName");
            jsonWriter.value(serviceName);
        }
        if (serviceDetail.getServiceId() != null) {
            String serviceId = serviceDetail.getServiceId();
            jsonWriter.name("ServiceId");
            jsonWriter.value(serviceId);
        }
        if (serviceDetail.getServiceType() != null) {
            java.util.List<ServiceTypeDetail> serviceType = serviceDetail.getServiceType();
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
        if (serviceDetail.getAvailabilityZones() != null) {
            java.util.List<String> availabilityZones = serviceDetail.getAvailabilityZones();
            jsonWriter.name("AvailabilityZones");
            jsonWriter.beginArray();
            for (String availabilityZonesItem : availabilityZones) {
                if (availabilityZonesItem != null) {
                    jsonWriter.value(availabilityZonesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (serviceDetail.getOwner() != null) {
            String owner = serviceDetail.getOwner();
            jsonWriter.name("Owner");
            jsonWriter.value(owner);
        }
        if (serviceDetail.getBaseEndpointDnsNames() != null) {
            java.util.List<String> baseEndpointDnsNames = serviceDetail.getBaseEndpointDnsNames();
            jsonWriter.name("BaseEndpointDnsNames");
            jsonWriter.beginArray();
            for (String baseEndpointDnsNamesItem : baseEndpointDnsNames) {
                if (baseEndpointDnsNamesItem != null) {
                    jsonWriter.value(baseEndpointDnsNamesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (serviceDetail.getPrivateDnsName() != null) {
            String privateDnsName = serviceDetail.getPrivateDnsName();
            jsonWriter.name("PrivateDnsName");
            jsonWriter.value(privateDnsName);
        }
        if (serviceDetail.getVpcEndpointPolicySupported() != null) {
            Boolean vpcEndpointPolicySupported = serviceDetail.getVpcEndpointPolicySupported();
            jsonWriter.name("VpcEndpointPolicySupported");
            jsonWriter.value(vpcEndpointPolicySupported);
        }
        if (serviceDetail.getAcceptanceRequired() != null) {
            Boolean acceptanceRequired = serviceDetail.getAcceptanceRequired();
            jsonWriter.name("AcceptanceRequired");
            jsonWriter.value(acceptanceRequired);
        }
        if (serviceDetail.getManagesVpcEndpoints() != null) {
            Boolean managesVpcEndpoints = serviceDetail.getManagesVpcEndpoints();
            jsonWriter.name("ManagesVpcEndpoints");
            jsonWriter.value(managesVpcEndpoints);
        }
        if (serviceDetail.getTags() != null) {
            java.util.List<Tag> tags = serviceDetail.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (serviceDetail.getPrivateDnsNameVerificationState() != null) {
            String privateDnsNameVerificationState = serviceDetail
                    .getPrivateDnsNameVerificationState();
            jsonWriter.name("PrivateDnsNameVerificationState");
            jsonWriter.value(privateDnsNameVerificationState);
        }
        jsonWriter.endObject();
    }

    private static ServiceDetailJsonMarshaller instance;

    public static ServiceDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ServiceDetailJsonMarshaller();
        return instance;
    }
}
