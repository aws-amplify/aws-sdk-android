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
 * JSON marshaller for POJO VpcEndpoint
 */
class VpcEndpointJsonMarshaller {

    public void marshall(VpcEndpoint vpcEndpoint, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (vpcEndpoint.getVpcEndpointId() != null) {
            String vpcEndpointId = vpcEndpoint.getVpcEndpointId();
            jsonWriter.name("VpcEndpointId");
            jsonWriter.value(vpcEndpointId);
        }
        if (vpcEndpoint.getVpcEndpointType() != null) {
            String vpcEndpointType = vpcEndpoint.getVpcEndpointType();
            jsonWriter.name("VpcEndpointType");
            jsonWriter.value(vpcEndpointType);
        }
        if (vpcEndpoint.getVpcId() != null) {
            String vpcId = vpcEndpoint.getVpcId();
            jsonWriter.name("VpcId");
            jsonWriter.value(vpcId);
        }
        if (vpcEndpoint.getServiceName() != null) {
            String serviceName = vpcEndpoint.getServiceName();
            jsonWriter.name("ServiceName");
            jsonWriter.value(serviceName);
        }
        if (vpcEndpoint.getState() != null) {
            String state = vpcEndpoint.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (vpcEndpoint.getPolicyDocument() != null) {
            String policyDocument = vpcEndpoint.getPolicyDocument();
            jsonWriter.name("PolicyDocument");
            jsonWriter.value(policyDocument);
        }
        if (vpcEndpoint.getRouteTableIds() != null) {
            java.util.List<String> routeTableIds = vpcEndpoint.getRouteTableIds();
            jsonWriter.name("RouteTableIds");
            jsonWriter.beginArray();
            for (String routeTableIdsItem : routeTableIds) {
                if (routeTableIdsItem != null) {
                    jsonWriter.value(routeTableIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (vpcEndpoint.getSubnetIds() != null) {
            java.util.List<String> subnetIds = vpcEndpoint.getSubnetIds();
            jsonWriter.name("SubnetIds");
            jsonWriter.beginArray();
            for (String subnetIdsItem : subnetIds) {
                if (subnetIdsItem != null) {
                    jsonWriter.value(subnetIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (vpcEndpoint.getGroups() != null) {
            java.util.List<SecurityGroupIdentifier> groups = vpcEndpoint.getGroups();
            jsonWriter.name("Groups");
            jsonWriter.beginArray();
            for (SecurityGroupIdentifier groupsItem : groups) {
                if (groupsItem != null) {
                    SecurityGroupIdentifierJsonMarshaller.getInstance().marshall(groupsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (vpcEndpoint.getPrivateDnsEnabled() != null) {
            Boolean privateDnsEnabled = vpcEndpoint.getPrivateDnsEnabled();
            jsonWriter.name("PrivateDnsEnabled");
            jsonWriter.value(privateDnsEnabled);
        }
        if (vpcEndpoint.getRequesterManaged() != null) {
            Boolean requesterManaged = vpcEndpoint.getRequesterManaged();
            jsonWriter.name("RequesterManaged");
            jsonWriter.value(requesterManaged);
        }
        if (vpcEndpoint.getNetworkInterfaceIds() != null) {
            java.util.List<String> networkInterfaceIds = vpcEndpoint.getNetworkInterfaceIds();
            jsonWriter.name("NetworkInterfaceIds");
            jsonWriter.beginArray();
            for (String networkInterfaceIdsItem : networkInterfaceIds) {
                if (networkInterfaceIdsItem != null) {
                    jsonWriter.value(networkInterfaceIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (vpcEndpoint.getDnsEntries() != null) {
            java.util.List<DnsEntry> dnsEntries = vpcEndpoint.getDnsEntries();
            jsonWriter.name("DnsEntries");
            jsonWriter.beginArray();
            for (DnsEntry dnsEntriesItem : dnsEntries) {
                if (dnsEntriesItem != null) {
                    DnsEntryJsonMarshaller.getInstance().marshall(dnsEntriesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (vpcEndpoint.getCreationTimestamp() != null) {
            java.util.Date creationTimestamp = vpcEndpoint.getCreationTimestamp();
            jsonWriter.name("CreationTimestamp");
            jsonWriter.value(creationTimestamp);
        }
        if (vpcEndpoint.getTags() != null) {
            java.util.List<Tag> tags = vpcEndpoint.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (vpcEndpoint.getOwnerId() != null) {
            String ownerId = vpcEndpoint.getOwnerId();
            jsonWriter.name("OwnerId");
            jsonWriter.value(ownerId);
        }
        if (vpcEndpoint.getLastError() != null) {
            LastError lastError = vpcEndpoint.getLastError();
            jsonWriter.name("LastError");
            LastErrorJsonMarshaller.getInstance().marshall(lastError, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static VpcEndpointJsonMarshaller instance;

    public static VpcEndpointJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VpcEndpointJsonMarshaller();
        return instance;
    }
}
