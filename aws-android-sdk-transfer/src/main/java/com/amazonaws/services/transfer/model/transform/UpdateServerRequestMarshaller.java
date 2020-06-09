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

package com.amazonaws.services.transfer.model.transform;

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
import com.amazonaws.services.transfer.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for UpdateServerRequest
 */
public class UpdateServerRequestMarshaller implements
        Marshaller<Request<UpdateServerRequest>, UpdateServerRequest> {

    public Request<UpdateServerRequest> marshall(UpdateServerRequest updateServerRequest) {
        if (updateServerRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateServerRequest)");
        }

        Request<UpdateServerRequest> request = new DefaultRequest<UpdateServerRequest>(
                updateServerRequest, "AWSTransferFamily");
        String target = "TransferService.UpdateServer";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateServerRequest.getCertificate() != null) {
                String certificate = updateServerRequest.getCertificate();
                jsonWriter.name("Certificate");
                jsonWriter.value(certificate);
            }
            if (updateServerRequest.getEndpointDetails() != null) {
                EndpointDetails endpointDetails = updateServerRequest.getEndpointDetails();
                jsonWriter.name("EndpointDetails");
                EndpointDetailsJsonMarshaller.getInstance().marshall(endpointDetails, jsonWriter);
            }
            if (updateServerRequest.getEndpointType() != null) {
                String endpointType = updateServerRequest.getEndpointType();
                jsonWriter.name("EndpointType");
                jsonWriter.value(endpointType);
            }
            if (updateServerRequest.getHostKey() != null) {
                String hostKey = updateServerRequest.getHostKey();
                jsonWriter.name("HostKey");
                jsonWriter.value(hostKey);
            }
            if (updateServerRequest.getIdentityProviderDetails() != null) {
                IdentityProviderDetails identityProviderDetails = updateServerRequest
                        .getIdentityProviderDetails();
                jsonWriter.name("IdentityProviderDetails");
                IdentityProviderDetailsJsonMarshaller.getInstance().marshall(
                        identityProviderDetails, jsonWriter);
            }
            if (updateServerRequest.getLoggingRole() != null) {
                String loggingRole = updateServerRequest.getLoggingRole();
                jsonWriter.name("LoggingRole");
                jsonWriter.value(loggingRole);
            }
            if (updateServerRequest.getProtocols() != null) {
                java.util.List<String> protocols = updateServerRequest.getProtocols();
                jsonWriter.name("Protocols");
                jsonWriter.beginArray();
                for (String protocolsItem : protocols) {
                    if (protocolsItem != null) {
                        jsonWriter.value(protocolsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateServerRequest.getServerId() != null) {
                String serverId = updateServerRequest.getServerId();
                jsonWriter.name("ServerId");
                jsonWriter.value(serverId);
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
