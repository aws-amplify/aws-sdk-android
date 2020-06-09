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
 * JSON request marshaller for CreateServerRequest
 */
public class CreateServerRequestMarshaller implements
        Marshaller<Request<CreateServerRequest>, CreateServerRequest> {

    public Request<CreateServerRequest> marshall(CreateServerRequest createServerRequest) {
        if (createServerRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateServerRequest)");
        }

        Request<CreateServerRequest> request = new DefaultRequest<CreateServerRequest>(
                createServerRequest, "AWSTransferFamily");
        String target = "TransferService.CreateServer";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createServerRequest.getCertificate() != null) {
                String certificate = createServerRequest.getCertificate();
                jsonWriter.name("Certificate");
                jsonWriter.value(certificate);
            }
            if (createServerRequest.getEndpointDetails() != null) {
                EndpointDetails endpointDetails = createServerRequest.getEndpointDetails();
                jsonWriter.name("EndpointDetails");
                EndpointDetailsJsonMarshaller.getInstance().marshall(endpointDetails, jsonWriter);
            }
            if (createServerRequest.getEndpointType() != null) {
                String endpointType = createServerRequest.getEndpointType();
                jsonWriter.name("EndpointType");
                jsonWriter.value(endpointType);
            }
            if (createServerRequest.getHostKey() != null) {
                String hostKey = createServerRequest.getHostKey();
                jsonWriter.name("HostKey");
                jsonWriter.value(hostKey);
            }
            if (createServerRequest.getIdentityProviderDetails() != null) {
                IdentityProviderDetails identityProviderDetails = createServerRequest
                        .getIdentityProviderDetails();
                jsonWriter.name("IdentityProviderDetails");
                IdentityProviderDetailsJsonMarshaller.getInstance().marshall(
                        identityProviderDetails, jsonWriter);
            }
            if (createServerRequest.getIdentityProviderType() != null) {
                String identityProviderType = createServerRequest.getIdentityProviderType();
                jsonWriter.name("IdentityProviderType");
                jsonWriter.value(identityProviderType);
            }
            if (createServerRequest.getLoggingRole() != null) {
                String loggingRole = createServerRequest.getLoggingRole();
                jsonWriter.name("LoggingRole");
                jsonWriter.value(loggingRole);
            }
            if (createServerRequest.getProtocols() != null) {
                java.util.List<String> protocols = createServerRequest.getProtocols();
                jsonWriter.name("Protocols");
                jsonWriter.beginArray();
                for (String protocolsItem : protocols) {
                    if (protocolsItem != null) {
                        jsonWriter.value(protocolsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createServerRequest.getTags() != null) {
                java.util.List<Tag> tags = createServerRequest.getTags();
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
