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
 * JSON marshaller for POJO VpcEndpointConnection
 */
class VpcEndpointConnectionJsonMarshaller {

    public void marshall(VpcEndpointConnection vpcEndpointConnection, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (vpcEndpointConnection.getServiceId() != null) {
            String serviceId = vpcEndpointConnection.getServiceId();
            jsonWriter.name("ServiceId");
            jsonWriter.value(serviceId);
        }
        if (vpcEndpointConnection.getVpcEndpointId() != null) {
            String vpcEndpointId = vpcEndpointConnection.getVpcEndpointId();
            jsonWriter.name("VpcEndpointId");
            jsonWriter.value(vpcEndpointId);
        }
        if (vpcEndpointConnection.getVpcEndpointOwner() != null) {
            String vpcEndpointOwner = vpcEndpointConnection.getVpcEndpointOwner();
            jsonWriter.name("VpcEndpointOwner");
            jsonWriter.value(vpcEndpointOwner);
        }
        if (vpcEndpointConnection.getVpcEndpointState() != null) {
            String vpcEndpointState = vpcEndpointConnection.getVpcEndpointState();
            jsonWriter.name("VpcEndpointState");
            jsonWriter.value(vpcEndpointState);
        }
        if (vpcEndpointConnection.getCreationTimestamp() != null) {
            java.util.Date creationTimestamp = vpcEndpointConnection.getCreationTimestamp();
            jsonWriter.name("CreationTimestamp");
            jsonWriter.value(creationTimestamp);
        }
        if (vpcEndpointConnection.getDnsEntries() != null) {
            java.util.List<DnsEntry> dnsEntries = vpcEndpointConnection.getDnsEntries();
            jsonWriter.name("DnsEntries");
            jsonWriter.beginArray();
            for (DnsEntry dnsEntriesItem : dnsEntries) {
                if (dnsEntriesItem != null) {
                    DnsEntryJsonMarshaller.getInstance().marshall(dnsEntriesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (vpcEndpointConnection.getNetworkLoadBalancerArns() != null) {
            java.util.List<String> networkLoadBalancerArns = vpcEndpointConnection
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
        jsonWriter.endObject();
    }

    private static VpcEndpointConnectionJsonMarshaller instance;

    public static VpcEndpointConnectionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VpcEndpointConnectionJsonMarshaller();
        return instance;
    }
}
