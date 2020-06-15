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

package com.amazonaws.services.a4b.model.transform;

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
import com.amazonaws.services.a4b.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateNetworkProfileRequest
 */
public class CreateNetworkProfileRequestMarshaller implements
        Marshaller<Request<CreateNetworkProfileRequest>, CreateNetworkProfileRequest> {

    public Request<CreateNetworkProfileRequest> marshall(
            CreateNetworkProfileRequest createNetworkProfileRequest) {
        if (createNetworkProfileRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateNetworkProfileRequest)");
        }

        Request<CreateNetworkProfileRequest> request = new DefaultRequest<CreateNetworkProfileRequest>(
                createNetworkProfileRequest, "AlexaForBusiness");
        String target = "AlexaForBusiness.CreateNetworkProfile";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createNetworkProfileRequest.getNetworkProfileName() != null) {
                String networkProfileName = createNetworkProfileRequest.getNetworkProfileName();
                jsonWriter.name("NetworkProfileName");
                jsonWriter.value(networkProfileName);
            }
            if (createNetworkProfileRequest.getDescription() != null) {
                String description = createNetworkProfileRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (createNetworkProfileRequest.getSsid() != null) {
                String ssid = createNetworkProfileRequest.getSsid();
                jsonWriter.name("Ssid");
                jsonWriter.value(ssid);
            }
            if (createNetworkProfileRequest.getSecurityType() != null) {
                String securityType = createNetworkProfileRequest.getSecurityType();
                jsonWriter.name("SecurityType");
                jsonWriter.value(securityType);
            }
            if (createNetworkProfileRequest.getEapMethod() != null) {
                String eapMethod = createNetworkProfileRequest.getEapMethod();
                jsonWriter.name("EapMethod");
                jsonWriter.value(eapMethod);
            }
            if (createNetworkProfileRequest.getCurrentPassword() != null) {
                String currentPassword = createNetworkProfileRequest.getCurrentPassword();
                jsonWriter.name("CurrentPassword");
                jsonWriter.value(currentPassword);
            }
            if (createNetworkProfileRequest.getNextPassword() != null) {
                String nextPassword = createNetworkProfileRequest.getNextPassword();
                jsonWriter.name("NextPassword");
                jsonWriter.value(nextPassword);
            }
            if (createNetworkProfileRequest.getCertificateAuthorityArn() != null) {
                String certificateAuthorityArn = createNetworkProfileRequest
                        .getCertificateAuthorityArn();
                jsonWriter.name("CertificateAuthorityArn");
                jsonWriter.value(certificateAuthorityArn);
            }
            if (createNetworkProfileRequest.getTrustAnchors() != null) {
                java.util.List<String> trustAnchors = createNetworkProfileRequest.getTrustAnchors();
                jsonWriter.name("TrustAnchors");
                jsonWriter.beginArray();
                for (String trustAnchorsItem : trustAnchors) {
                    if (trustAnchorsItem != null) {
                        jsonWriter.value(trustAnchorsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createNetworkProfileRequest.getClientRequestToken() != null) {
                String clientRequestToken = createNetworkProfileRequest.getClientRequestToken();
                jsonWriter.name("ClientRequestToken");
                jsonWriter.value(clientRequestToken);
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
