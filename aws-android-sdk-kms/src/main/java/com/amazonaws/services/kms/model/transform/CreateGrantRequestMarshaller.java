/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kms.model.transform;

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
import com.amazonaws.services.kms.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateGrantRequest
 */
public class CreateGrantRequestMarshaller implements
        Marshaller<Request<CreateGrantRequest>, CreateGrantRequest> {

    public Request<CreateGrantRequest> marshall(CreateGrantRequest createGrantRequest) {
        if (createGrantRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateGrantRequest)");
        }

        Request<CreateGrantRequest> request = new DefaultRequest<CreateGrantRequest>(
                createGrantRequest, "AWSKMS");
        String target = "TrentService.CreateGrant";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createGrantRequest.getKeyId() != null) {
                String keyId = createGrantRequest.getKeyId();
                jsonWriter.name("KeyId");
                jsonWriter.value(keyId);
            }
            if (createGrantRequest.getGranteePrincipal() != null) {
                String granteePrincipal = createGrantRequest.getGranteePrincipal();
                jsonWriter.name("GranteePrincipal");
                jsonWriter.value(granteePrincipal);
            }
            if (createGrantRequest.getRetiringPrincipal() != null) {
                String retiringPrincipal = createGrantRequest.getRetiringPrincipal();
                jsonWriter.name("RetiringPrincipal");
                jsonWriter.value(retiringPrincipal);
            }
            if (createGrantRequest.getOperations() != null) {
                java.util.List<String> operations = createGrantRequest.getOperations();
                jsonWriter.name("Operations");
                jsonWriter.beginArray();
                for (String operationsItem : operations) {
                    if (operationsItem != null) {
                        jsonWriter.value(operationsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createGrantRequest.getConstraints() != null) {
                GrantConstraints constraints = createGrantRequest.getConstraints();
                jsonWriter.name("Constraints");
                GrantConstraintsJsonMarshaller.getInstance().marshall(constraints, jsonWriter);
            }
            if (createGrantRequest.getGrantTokens() != null) {
                java.util.List<String> grantTokens = createGrantRequest.getGrantTokens();
                jsonWriter.name("GrantTokens");
                jsonWriter.beginArray();
                for (String grantTokensItem : grantTokens) {
                    if (grantTokensItem != null) {
                        jsonWriter.value(grantTokensItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createGrantRequest.getName() != null) {
                String name = createGrantRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
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
