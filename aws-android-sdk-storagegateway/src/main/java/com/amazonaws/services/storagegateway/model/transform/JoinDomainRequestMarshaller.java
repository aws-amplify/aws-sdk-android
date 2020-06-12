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

package com.amazonaws.services.storagegateway.model.transform;

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
import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for JoinDomainRequest
 */
public class JoinDomainRequestMarshaller implements
        Marshaller<Request<JoinDomainRequest>, JoinDomainRequest> {

    public Request<JoinDomainRequest> marshall(JoinDomainRequest joinDomainRequest) {
        if (joinDomainRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(JoinDomainRequest)");
        }

        Request<JoinDomainRequest> request = new DefaultRequest<JoinDomainRequest>(
                joinDomainRequest, "AWSStorageGateway");
        String target = "StorageGateway_20130630.JoinDomain";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (joinDomainRequest.getGatewayARN() != null) {
                String gatewayARN = joinDomainRequest.getGatewayARN();
                jsonWriter.name("GatewayARN");
                jsonWriter.value(gatewayARN);
            }
            if (joinDomainRequest.getDomainName() != null) {
                String domainName = joinDomainRequest.getDomainName();
                jsonWriter.name("DomainName");
                jsonWriter.value(domainName);
            }
            if (joinDomainRequest.getOrganizationalUnit() != null) {
                String organizationalUnit = joinDomainRequest.getOrganizationalUnit();
                jsonWriter.name("OrganizationalUnit");
                jsonWriter.value(organizationalUnit);
            }
            if (joinDomainRequest.getDomainControllers() != null) {
                java.util.List<String> domainControllers = joinDomainRequest.getDomainControllers();
                jsonWriter.name("DomainControllers");
                jsonWriter.beginArray();
                for (String domainControllersItem : domainControllers) {
                    if (domainControllersItem != null) {
                        jsonWriter.value(domainControllersItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (joinDomainRequest.getTimeoutInSeconds() != null) {
                Integer timeoutInSeconds = joinDomainRequest.getTimeoutInSeconds();
                jsonWriter.name("TimeoutInSeconds");
                jsonWriter.value(timeoutInSeconds);
            }
            if (joinDomainRequest.getUserName() != null) {
                String userName = joinDomainRequest.getUserName();
                jsonWriter.name("UserName");
                jsonWriter.value(userName);
            }
            if (joinDomainRequest.getPassword() != null) {
                String password = joinDomainRequest.getPassword();
                jsonWriter.name("Password");
                jsonWriter.value(password);
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
