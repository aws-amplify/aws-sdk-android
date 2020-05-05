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
 * JSON unmarshaller for POJO ClientVpnEndpoint
 */
class ClientVpnEndpointJsonUnmarshaller implements
        Unmarshaller<ClientVpnEndpoint, JsonUnmarshallerContext> {

    public ClientVpnEndpoint unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ClientVpnEndpoint clientVpnEndpoint = new ClientVpnEndpoint();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ClientVpnEndpointId")) {
                clientVpnEndpoint.setClientVpnEndpointId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                clientVpnEndpoint.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                clientVpnEndpoint.setStatus(ClientVpnEndpointStatusJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                clientVpnEndpoint.setCreationTime(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeletionTime")) {
                clientVpnEndpoint.setDeletionTime(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DnsName")) {
                clientVpnEndpoint.setDnsName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ClientCidrBlock")) {
                clientVpnEndpoint.setClientCidrBlock(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DnsServers")) {
                clientVpnEndpoint.setDnsServers(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SplitTunnel")) {
                clientVpnEndpoint.setSplitTunnel(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VpnProtocol")) {
                clientVpnEndpoint.setVpnProtocol(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TransportProtocol")) {
                clientVpnEndpoint.setTransportProtocol(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VpnPort")) {
                clientVpnEndpoint.setVpnPort(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AssociatedTargetNetworks")) {
                clientVpnEndpoint
                        .setAssociatedTargetNetworks(new ListUnmarshaller<AssociatedTargetNetwork>(
                                AssociatedTargetNetworkJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ServerCertificateArn")) {
                clientVpnEndpoint.setServerCertificateArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AuthenticationOptions")) {
                clientVpnEndpoint
                        .setAuthenticationOptions(new ListUnmarshaller<ClientVpnAuthentication>(
                                ClientVpnAuthenticationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ConnectionLogOptions")) {
                clientVpnEndpoint
                        .setConnectionLogOptions(ConnectionLogResponseOptionsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("Tags")) {
                clientVpnEndpoint.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SecurityGroupIds")) {
                clientVpnEndpoint.setSecurityGroupIds(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("VpcId")) {
                clientVpnEndpoint.setVpcId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return clientVpnEndpoint;
    }

    private static ClientVpnEndpointJsonUnmarshaller instance;

    public static ClientVpnEndpointJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ClientVpnEndpointJsonUnmarshaller();
        return instance;
    }
}
