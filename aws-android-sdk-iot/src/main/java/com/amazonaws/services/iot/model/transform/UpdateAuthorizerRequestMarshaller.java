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

package com.amazonaws.services.iot.model.transform;

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
import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for UpdateAuthorizerRequest
 */
public class UpdateAuthorizerRequestMarshaller implements
        Marshaller<Request<UpdateAuthorizerRequest>, UpdateAuthorizerRequest> {

    public Request<UpdateAuthorizerRequest> marshall(UpdateAuthorizerRequest updateAuthorizerRequest) {
        if (updateAuthorizerRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateAuthorizerRequest)");
        }

        Request<UpdateAuthorizerRequest> request = new DefaultRequest<UpdateAuthorizerRequest>(
                updateAuthorizerRequest, "AWSIot");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/authorizer/{authorizerName}";
        uriResourcePath = uriResourcePath.replace(
                "{authorizerName}",
                (updateAuthorizerRequest.getAuthorizerName() == null) ? "" : StringUtils
                        .fromString(updateAuthorizerRequest.getAuthorizerName()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateAuthorizerRequest.getAuthorizerFunctionArn() != null) {
                String authorizerFunctionArn = updateAuthorizerRequest.getAuthorizerFunctionArn();
                jsonWriter.name("authorizerFunctionArn");
                jsonWriter.value(authorizerFunctionArn);
            }
            if (updateAuthorizerRequest.getTokenKeyName() != null) {
                String tokenKeyName = updateAuthorizerRequest.getTokenKeyName();
                jsonWriter.name("tokenKeyName");
                jsonWriter.value(tokenKeyName);
            }
            if (updateAuthorizerRequest.getTokenSigningPublicKeys() != null) {
                java.util.Map<String, String> tokenSigningPublicKeys = updateAuthorizerRequest
                        .getTokenSigningPublicKeys();
                jsonWriter.name("tokenSigningPublicKeys");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> tokenSigningPublicKeysEntry : tokenSigningPublicKeys
                        .entrySet()) {
                    String tokenSigningPublicKeysValue = tokenSigningPublicKeysEntry.getValue();
                    if (tokenSigningPublicKeysValue != null) {
                        jsonWriter.name(tokenSigningPublicKeysEntry.getKey());
                        jsonWriter.value(tokenSigningPublicKeysValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (updateAuthorizerRequest.getStatus() != null) {
                String status = updateAuthorizerRequest.getStatus();
                jsonWriter.name("status");
                jsonWriter.value(status);
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
