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
 * JSON request marshaller for CreateNetworkInterfaceRequest
 */
public class CreateNetworkInterfaceRequestMarshaller implements
        Marshaller<Request<CreateNetworkInterfaceRequest>, CreateNetworkInterfaceRequest> {

    public Request<CreateNetworkInterfaceRequest> marshall(
            CreateNetworkInterfaceRequest createNetworkInterfaceRequest) {
        if (createNetworkInterfaceRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateNetworkInterfaceRequest)");
        }

        Request<CreateNetworkInterfaceRequest> request = new DefaultRequest<CreateNetworkInterfaceRequest>(
                createNetworkInterfaceRequest, "AmazonElasticComputeCloud");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createNetworkInterfaceRequest.getDescription() != null) {
                String description = createNetworkInterfaceRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (createNetworkInterfaceRequest.getDryRun() != null) {
                Boolean dryRun = createNetworkInterfaceRequest.getDryRun();
                jsonWriter.name("DryRun");
                jsonWriter.value(dryRun);
            }
            if (createNetworkInterfaceRequest.getGroups() != null) {
                java.util.List<String> groups = createNetworkInterfaceRequest.getGroups();
                jsonWriter.name("Groups");
                jsonWriter.beginArray();
                for (String groupsItem : groups) {
                    if (groupsItem != null) {
                        jsonWriter.value(groupsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createNetworkInterfaceRequest.getIpv6AddressCount() != null) {
                Integer ipv6AddressCount = createNetworkInterfaceRequest.getIpv6AddressCount();
                jsonWriter.name("Ipv6AddressCount");
                jsonWriter.value(ipv6AddressCount);
            }
            if (createNetworkInterfaceRequest.getIpv6Addresses() != null) {
                java.util.List<InstanceIpv6Address> ipv6Addresses = createNetworkInterfaceRequest
                        .getIpv6Addresses();
                jsonWriter.name("Ipv6Addresses");
                jsonWriter.beginArray();
                for (InstanceIpv6Address ipv6AddressesItem : ipv6Addresses) {
                    if (ipv6AddressesItem != null) {
                        InstanceIpv6AddressJsonMarshaller.getInstance().marshall(ipv6AddressesItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createNetworkInterfaceRequest.getPrivateIpAddress() != null) {
                String privateIpAddress = createNetworkInterfaceRequest.getPrivateIpAddress();
                jsonWriter.name("PrivateIpAddress");
                jsonWriter.value(privateIpAddress);
            }
            if (createNetworkInterfaceRequest.getPrivateIpAddresses() != null) {
                java.util.List<PrivateIpAddressSpecification> privateIpAddresses = createNetworkInterfaceRequest
                        .getPrivateIpAddresses();
                jsonWriter.name("PrivateIpAddresses");
                jsonWriter.beginArray();
                for (PrivateIpAddressSpecification privateIpAddressesItem : privateIpAddresses) {
                    if (privateIpAddressesItem != null) {
                        PrivateIpAddressSpecificationJsonMarshaller.getInstance().marshall(
                                privateIpAddressesItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createNetworkInterfaceRequest.getSecondaryPrivateIpAddressCount() != null) {
                Integer secondaryPrivateIpAddressCount = createNetworkInterfaceRequest
                        .getSecondaryPrivateIpAddressCount();
                jsonWriter.name("SecondaryPrivateIpAddressCount");
                jsonWriter.value(secondaryPrivateIpAddressCount);
            }
            if (createNetworkInterfaceRequest.getInterfaceType() != null) {
                String interfaceType = createNetworkInterfaceRequest.getInterfaceType();
                jsonWriter.name("InterfaceType");
                jsonWriter.value(interfaceType);
            }
            if (createNetworkInterfaceRequest.getSubnetId() != null) {
                String subnetId = createNetworkInterfaceRequest.getSubnetId();
                jsonWriter.name("SubnetId");
                jsonWriter.value(subnetId);
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
