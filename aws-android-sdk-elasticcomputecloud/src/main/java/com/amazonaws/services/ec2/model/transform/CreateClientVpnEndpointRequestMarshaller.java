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

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateClientVpnEndpointRequest
 */
public class CreateClientVpnEndpointRequestMarshaller implements
        Marshaller<Request<CreateClientVpnEndpointRequest>, CreateClientVpnEndpointRequest> {

    public Request<CreateClientVpnEndpointRequest> marshall(
            CreateClientVpnEndpointRequest createClientVpnEndpointRequest) {
        if (createClientVpnEndpointRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateClientVpnEndpointRequest)");
        }

        Request<CreateClientVpnEndpointRequest> request = new DefaultRequest<CreateClientVpnEndpointRequest>(
                createClientVpnEndpointRequest, "AmazonElasticComputeCloud");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createClientVpnEndpointRequest.getClientCidrBlock() != null) {
                String clientCidrBlock = createClientVpnEndpointRequest.getClientCidrBlock();
                jsonWriter.name("ClientCidrBlock");
                jsonWriter.value(clientCidrBlock);
            }
            if (createClientVpnEndpointRequest.getServerCertificateArn() != null) {
                String serverCertificateArn = createClientVpnEndpointRequest
                        .getServerCertificateArn();
                jsonWriter.name("ServerCertificateArn");
                jsonWriter.value(serverCertificateArn);
            }
            if (createClientVpnEndpointRequest.getAuthenticationOptions() != null) {
                java.util.List<ClientVpnAuthenticationRequest> authenticationOptions = createClientVpnEndpointRequest
                        .getAuthenticationOptions();
                jsonWriter.name("AuthenticationOptions");
                jsonWriter.beginArray();
                for (ClientVpnAuthenticationRequest authenticationOptionsItem : authenticationOptions) {
                    if (authenticationOptionsItem != null) {
                        ClientVpnAuthenticationRequestJsonMarshaller.getInstance().marshall(
                                authenticationOptionsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createClientVpnEndpointRequest.getConnectionLogOptions() != null) {
                ConnectionLogOptions connectionLogOptions = createClientVpnEndpointRequest
                        .getConnectionLogOptions();
                jsonWriter.name("ConnectionLogOptions");
                ConnectionLogOptionsJsonMarshaller.getInstance().marshall(connectionLogOptions,
                        jsonWriter);
            }
            if (createClientVpnEndpointRequest.getDnsServers() != null) {
                java.util.List<String> dnsServers = createClientVpnEndpointRequest.getDnsServers();
                jsonWriter.name("DnsServers");
                jsonWriter.beginArray();
                for (String dnsServersItem : dnsServers) {
                    if (dnsServersItem != null) {
                        jsonWriter.value(dnsServersItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createClientVpnEndpointRequest.getTransportProtocol() != null) {
                String transportProtocol = createClientVpnEndpointRequest.getTransportProtocol();
                jsonWriter.name("TransportProtocol");
                jsonWriter.value(transportProtocol);
            }
            if (createClientVpnEndpointRequest.getVpnPort() != null) {
                Integer vpnPort = createClientVpnEndpointRequest.getVpnPort();
                jsonWriter.name("VpnPort");
                jsonWriter.value(vpnPort);
            }
            if (createClientVpnEndpointRequest.getDescription() != null) {
                String description = createClientVpnEndpointRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (createClientVpnEndpointRequest.getSplitTunnel() != null) {
                Boolean splitTunnel = createClientVpnEndpointRequest.getSplitTunnel();
                jsonWriter.name("SplitTunnel");
                jsonWriter.value(splitTunnel);
            }
            if (createClientVpnEndpointRequest.getDryRun() != null) {
                Boolean dryRun = createClientVpnEndpointRequest.getDryRun();
                jsonWriter.name("DryRun");
                jsonWriter.value(dryRun);
            }
            if (createClientVpnEndpointRequest.getClientToken() != null) {
                String clientToken = createClientVpnEndpointRequest.getClientToken();
                jsonWriter.name("ClientToken");
                jsonWriter.value(clientToken);
            }
            if (createClientVpnEndpointRequest.getTagSpecifications() != null) {
                java.util.List<TagSpecification> tagSpecifications = createClientVpnEndpointRequest
                        .getTagSpecifications();
                jsonWriter.name("TagSpecifications");
                jsonWriter.beginArray();
                for (TagSpecification tagSpecificationsItem : tagSpecifications) {
                    if (tagSpecificationsItem != null) {
                        TagSpecificationJsonMarshaller.getInstance().marshall(
                                tagSpecificationsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createClientVpnEndpointRequest.getSecurityGroupIds() != null) {
                java.util.List<String> securityGroupIds = createClientVpnEndpointRequest
                        .getSecurityGroupIds();
                jsonWriter.name("SecurityGroupIds");
                jsonWriter.beginArray();
                for (String securityGroupIdsItem : securityGroupIds) {
                    if (securityGroupIdsItem != null) {
                        jsonWriter.value(securityGroupIdsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createClientVpnEndpointRequest.getVpcId() != null) {
                String vpcId = createClientVpnEndpointRequest.getVpcId();
                jsonWriter.name("VpcId");
                jsonWriter.value(vpcId);
            }

            jsonWriter.endObject();
            jsonWriter.close();
            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length", Integer.toString(content.length));
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
