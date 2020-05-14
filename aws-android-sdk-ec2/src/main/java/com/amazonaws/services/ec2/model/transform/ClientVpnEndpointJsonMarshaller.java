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
 * JSON marshaller for POJO ClientVpnEndpoint
 */
class ClientVpnEndpointJsonMarshaller {

    public void marshall(ClientVpnEndpoint clientVpnEndpoint, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (clientVpnEndpoint.getClientVpnEndpointId() != null) {
            String clientVpnEndpointId = clientVpnEndpoint.getClientVpnEndpointId();
            jsonWriter.name("ClientVpnEndpointId");
            jsonWriter.value(clientVpnEndpointId);
        }
        if (clientVpnEndpoint.getDescription() != null) {
            String description = clientVpnEndpoint.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (clientVpnEndpoint.getStatus() != null) {
            ClientVpnEndpointStatus status = clientVpnEndpoint.getStatus();
            jsonWriter.name("Status");
            ClientVpnEndpointStatusJsonMarshaller.getInstance().marshall(status, jsonWriter);
        }
        if (clientVpnEndpoint.getCreationTime() != null) {
            String creationTime = clientVpnEndpoint.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (clientVpnEndpoint.getDeletionTime() != null) {
            String deletionTime = clientVpnEndpoint.getDeletionTime();
            jsonWriter.name("DeletionTime");
            jsonWriter.value(deletionTime);
        }
        if (clientVpnEndpoint.getDnsName() != null) {
            String dnsName = clientVpnEndpoint.getDnsName();
            jsonWriter.name("DnsName");
            jsonWriter.value(dnsName);
        }
        if (clientVpnEndpoint.getClientCidrBlock() != null) {
            String clientCidrBlock = clientVpnEndpoint.getClientCidrBlock();
            jsonWriter.name("ClientCidrBlock");
            jsonWriter.value(clientCidrBlock);
        }
        if (clientVpnEndpoint.getDnsServers() != null) {
            java.util.List<String> dnsServers = clientVpnEndpoint.getDnsServers();
            jsonWriter.name("DnsServers");
            jsonWriter.beginArray();
            for (String dnsServersItem : dnsServers) {
                if (dnsServersItem != null) {
                    jsonWriter.value(dnsServersItem);
                }
            }
            jsonWriter.endArray();
        }
        if (clientVpnEndpoint.getSplitTunnel() != null) {
            Boolean splitTunnel = clientVpnEndpoint.getSplitTunnel();
            jsonWriter.name("SplitTunnel");
            jsonWriter.value(splitTunnel);
        }
        if (clientVpnEndpoint.getVpnProtocol() != null) {
            String vpnProtocol = clientVpnEndpoint.getVpnProtocol();
            jsonWriter.name("VpnProtocol");
            jsonWriter.value(vpnProtocol);
        }
        if (clientVpnEndpoint.getTransportProtocol() != null) {
            String transportProtocol = clientVpnEndpoint.getTransportProtocol();
            jsonWriter.name("TransportProtocol");
            jsonWriter.value(transportProtocol);
        }
        if (clientVpnEndpoint.getVpnPort() != null) {
            Integer vpnPort = clientVpnEndpoint.getVpnPort();
            jsonWriter.name("VpnPort");
            jsonWriter.value(vpnPort);
        }
        if (clientVpnEndpoint.getAssociatedTargetNetworks() != null) {
            java.util.List<AssociatedTargetNetwork> associatedTargetNetworks = clientVpnEndpoint
                    .getAssociatedTargetNetworks();
            jsonWriter.name("AssociatedTargetNetworks");
            jsonWriter.beginArray();
            for (AssociatedTargetNetwork associatedTargetNetworksItem : associatedTargetNetworks) {
                if (associatedTargetNetworksItem != null) {
                    AssociatedTargetNetworkJsonMarshaller.getInstance().marshall(
                            associatedTargetNetworksItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (clientVpnEndpoint.getServerCertificateArn() != null) {
            String serverCertificateArn = clientVpnEndpoint.getServerCertificateArn();
            jsonWriter.name("ServerCertificateArn");
            jsonWriter.value(serverCertificateArn);
        }
        if (clientVpnEndpoint.getAuthenticationOptions() != null) {
            java.util.List<ClientVpnAuthentication> authenticationOptions = clientVpnEndpoint
                    .getAuthenticationOptions();
            jsonWriter.name("AuthenticationOptions");
            jsonWriter.beginArray();
            for (ClientVpnAuthentication authenticationOptionsItem : authenticationOptions) {
                if (authenticationOptionsItem != null) {
                    ClientVpnAuthenticationJsonMarshaller.getInstance().marshall(
                            authenticationOptionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (clientVpnEndpoint.getConnectionLogOptions() != null) {
            ConnectionLogResponseOptions connectionLogOptions = clientVpnEndpoint
                    .getConnectionLogOptions();
            jsonWriter.name("ConnectionLogOptions");
            ConnectionLogResponseOptionsJsonMarshaller.getInstance().marshall(connectionLogOptions,
                    jsonWriter);
        }
        if (clientVpnEndpoint.getTags() != null) {
            java.util.List<Tag> tags = clientVpnEndpoint.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (clientVpnEndpoint.getSecurityGroupIds() != null) {
            java.util.List<String> securityGroupIds = clientVpnEndpoint.getSecurityGroupIds();
            jsonWriter.name("SecurityGroupIds");
            jsonWriter.beginArray();
            for (String securityGroupIdsItem : securityGroupIds) {
                if (securityGroupIdsItem != null) {
                    jsonWriter.value(securityGroupIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (clientVpnEndpoint.getVpcId() != null) {
            String vpcId = clientVpnEndpoint.getVpcId();
            jsonWriter.name("VpcId");
            jsonWriter.value(vpcId);
        }
        jsonWriter.endObject();
    }

    private static ClientVpnEndpointJsonMarshaller instance;

    public static ClientVpnEndpointJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ClientVpnEndpointJsonMarshaller();
        return instance;
    }
}
