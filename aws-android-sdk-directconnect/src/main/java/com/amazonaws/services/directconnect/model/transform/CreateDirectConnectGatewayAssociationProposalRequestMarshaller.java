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

package com.amazonaws.services.directconnect.model.transform;

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
import com.amazonaws.services.directconnect.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for
 * CreateDirectConnectGatewayAssociationProposalRequest
 */
public class CreateDirectConnectGatewayAssociationProposalRequestMarshaller
        implements
        Marshaller<Request<CreateDirectConnectGatewayAssociationProposalRequest>, CreateDirectConnectGatewayAssociationProposalRequest> {

    public Request<CreateDirectConnectGatewayAssociationProposalRequest> marshall(
            CreateDirectConnectGatewayAssociationProposalRequest createDirectConnectGatewayAssociationProposalRequest) {
        if (createDirectConnectGatewayAssociationProposalRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateDirectConnectGatewayAssociationProposalRequest)");
        }

        Request<CreateDirectConnectGatewayAssociationProposalRequest> request = new DefaultRequest<CreateDirectConnectGatewayAssociationProposalRequest>(
                createDirectConnectGatewayAssociationProposalRequest, "AWSDirectConnect");
        String target = "OvertureService.CreateDirectConnectGatewayAssociationProposal";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createDirectConnectGatewayAssociationProposalRequest.getDirectConnectGatewayId() != null) {
                String directConnectGatewayId = createDirectConnectGatewayAssociationProposalRequest
                        .getDirectConnectGatewayId();
                jsonWriter.name("directConnectGatewayId");
                jsonWriter.value(directConnectGatewayId);
            }
            if (createDirectConnectGatewayAssociationProposalRequest
                    .getDirectConnectGatewayOwnerAccount() != null) {
                String directConnectGatewayOwnerAccount = createDirectConnectGatewayAssociationProposalRequest
                        .getDirectConnectGatewayOwnerAccount();
                jsonWriter.name("directConnectGatewayOwnerAccount");
                jsonWriter.value(directConnectGatewayOwnerAccount);
            }
            if (createDirectConnectGatewayAssociationProposalRequest.getGatewayId() != null) {
                String gatewayId = createDirectConnectGatewayAssociationProposalRequest
                        .getGatewayId();
                jsonWriter.name("gatewayId");
                jsonWriter.value(gatewayId);
            }
            if (createDirectConnectGatewayAssociationProposalRequest
                    .getAddAllowedPrefixesToDirectConnectGateway() != null) {
                java.util.List<RouteFilterPrefix> addAllowedPrefixesToDirectConnectGateway = createDirectConnectGatewayAssociationProposalRequest
                        .getAddAllowedPrefixesToDirectConnectGateway();
                jsonWriter.name("addAllowedPrefixesToDirectConnectGateway");
                jsonWriter.beginArray();
                for (RouteFilterPrefix addAllowedPrefixesToDirectConnectGatewayItem : addAllowedPrefixesToDirectConnectGateway) {
                    if (addAllowedPrefixesToDirectConnectGatewayItem != null) {
                        RouteFilterPrefixJsonMarshaller.getInstance().marshall(
                                addAllowedPrefixesToDirectConnectGatewayItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createDirectConnectGatewayAssociationProposalRequest
                    .getRemoveAllowedPrefixesToDirectConnectGateway() != null) {
                java.util.List<RouteFilterPrefix> removeAllowedPrefixesToDirectConnectGateway = createDirectConnectGatewayAssociationProposalRequest
                        .getRemoveAllowedPrefixesToDirectConnectGateway();
                jsonWriter.name("removeAllowedPrefixesToDirectConnectGateway");
                jsonWriter.beginArray();
                for (RouteFilterPrefix removeAllowedPrefixesToDirectConnectGatewayItem : removeAllowedPrefixesToDirectConnectGateway) {
                    if (removeAllowedPrefixesToDirectConnectGatewayItem != null) {
                        RouteFilterPrefixJsonMarshaller.getInstance().marshall(
                                removeAllowedPrefixesToDirectConnectGatewayItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
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
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
