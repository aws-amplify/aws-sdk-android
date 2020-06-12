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

package com.amazonaws.services.apigateway.model.transform;

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
import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateDomainNameRequest
 */
public class CreateDomainNameRequestMarshaller implements
        Marshaller<Request<CreateDomainNameRequest>, CreateDomainNameRequest> {

    public Request<CreateDomainNameRequest> marshall(CreateDomainNameRequest createDomainNameRequest) {
        if (createDomainNameRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateDomainNameRequest)");
        }

        Request<CreateDomainNameRequest> request = new DefaultRequest<CreateDomainNameRequest>(
                createDomainNameRequest, "AmazonAPIGateway");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/domainnames";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createDomainNameRequest.getDomainName() != null) {
                String domainName = createDomainNameRequest.getDomainName();
                jsonWriter.name("domainName");
                jsonWriter.value(domainName);
            }
            if (createDomainNameRequest.getCertificateName() != null) {
                String certificateName = createDomainNameRequest.getCertificateName();
                jsonWriter.name("certificateName");
                jsonWriter.value(certificateName);
            }
            if (createDomainNameRequest.getCertificateBody() != null) {
                String certificateBody = createDomainNameRequest.getCertificateBody();
                jsonWriter.name("certificateBody");
                jsonWriter.value(certificateBody);
            }
            if (createDomainNameRequest.getCertificatePrivateKey() != null) {
                String certificatePrivateKey = createDomainNameRequest.getCertificatePrivateKey();
                jsonWriter.name("certificatePrivateKey");
                jsonWriter.value(certificatePrivateKey);
            }
            if (createDomainNameRequest.getCertificateChain() != null) {
                String certificateChain = createDomainNameRequest.getCertificateChain();
                jsonWriter.name("certificateChain");
                jsonWriter.value(certificateChain);
            }
            if (createDomainNameRequest.getCertificateArn() != null) {
                String certificateArn = createDomainNameRequest.getCertificateArn();
                jsonWriter.name("certificateArn");
                jsonWriter.value(certificateArn);
            }
            if (createDomainNameRequest.getRegionalCertificateName() != null) {
                String regionalCertificateName = createDomainNameRequest
                        .getRegionalCertificateName();
                jsonWriter.name("regionalCertificateName");
                jsonWriter.value(regionalCertificateName);
            }
            if (createDomainNameRequest.getRegionalCertificateArn() != null) {
                String regionalCertificateArn = createDomainNameRequest.getRegionalCertificateArn();
                jsonWriter.name("regionalCertificateArn");
                jsonWriter.value(regionalCertificateArn);
            }
            if (createDomainNameRequest.getEndpointConfiguration() != null) {
                EndpointConfiguration endpointConfiguration = createDomainNameRequest
                        .getEndpointConfiguration();
                jsonWriter.name("endpointConfiguration");
                EndpointConfigurationJsonMarshaller.getInstance().marshall(endpointConfiguration,
                        jsonWriter);
            }
            if (createDomainNameRequest.getTags() != null) {
                java.util.Map<String, String> tags = createDomainNameRequest.getTags();
                jsonWriter.name("tags");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                    String tagsValue = tagsEntry.getValue();
                    if (tagsValue != null) {
                        jsonWriter.name(tagsEntry.getKey());
                        jsonWriter.value(tagsValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (createDomainNameRequest.getSecurityPolicy() != null) {
                String securityPolicy = createDomainNameRequest.getSecurityPolicy();
                jsonWriter.name("securityPolicy");
                jsonWriter.value(securityPolicy);
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
