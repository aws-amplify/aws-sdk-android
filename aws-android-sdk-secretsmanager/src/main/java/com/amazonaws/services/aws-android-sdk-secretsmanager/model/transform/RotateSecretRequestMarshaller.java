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
package com.amazonaws.services.aws-android-sdk-secretsmanager.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;

import android.text.TextUtils;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.aws-android-sdk-secretsmanager.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;


/**
 * JSON request marshaller for RotateSecretRequest
 */
public class RotateSecretRequestMarshaller implements Marshaller<Request<RotateSecretRequest>, RotateSecretRequest> {

    public Request<RotateSecretRequest> marshall(RotateSecretRequest rotateSecretRequest) {
        if (rotateSecretRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(RotateSecretRequest)");
        }

        Request<RotateSecretRequest> request = new DefaultRequest<RotateSecretRequest>(rotateSecretRequest, "AWSSecretsManager");
        String target = "secretsmanager.RotateSecret";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (rotateSecretRequest.getSecretId() != null) {
                String secretId = rotateSecretRequest.getSecretId();
                jsonWriter.name("SecretId");
            jsonWriter.value(secretId);
            }
            if (rotateSecretRequest.getClientRequestToken() != null) {
                String clientRequestToken = rotateSecretRequest.getClientRequestToken();
                jsonWriter.name("ClientRequestToken");
            jsonWriter.value(clientRequestToken);
            }
            if (rotateSecretRequest.getRotationLambdaARN() != null) {
                String rotationLambdaARN = rotateSecretRequest.getRotationLambdaARN();
                jsonWriter.name("RotationLambdaARN");
            jsonWriter.value(rotationLambdaARN);
            }
            if (rotateSecretRequest.getRotationRules() != null) {
                RotationRulesType rotationRules = rotateSecretRequest.getRotationRules();
                jsonWriter.name("RotationRules");
            RotationRulesTypeJsonMarshaller.getInstance().marshall(rotationRules, jsonWriter);
            }

            jsonWriter.endObject();
            jsonWriter.close();
            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length", Integer.toString(content.length));
        } catch(Throwable t) {
            throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
