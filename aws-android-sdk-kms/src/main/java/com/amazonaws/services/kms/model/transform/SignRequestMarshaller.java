/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import android.text.TextUtils;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.kms.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for SignRequest
 */
public class SignRequestMarshaller implements Marshaller<Request<SignRequest>, SignRequest> {

    public Request<SignRequest> marshall(SignRequest signRequest) {
        if (signRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(SignRequest)");
        }

        Request<SignRequest> request = new DefaultRequest<SignRequest>(signRequest, "AWSKMS");
        String target = "TrentService.Sign";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (signRequest.getKeyId() != null) {
                String keyId = signRequest.getKeyId();
                jsonWriter.name("KeyId");
                jsonWriter.value(keyId);
            }
            if (signRequest.getMessage() != null) {
                java.nio.ByteBuffer message = signRequest.getMessage();
                jsonWriter.name("Message");
                jsonWriter.value(message);
            }
            if (signRequest.getMessageType() != null) {
                String messageType = signRequest.getMessageType();
                jsonWriter.name("MessageType");
                jsonWriter.value(messageType);
            }
            if (signRequest.getGrantTokens() != null) {
                java.util.List<String> grantTokens = signRequest.getGrantTokens();
                jsonWriter.name("GrantTokens");
                jsonWriter.beginArray();
                for (String grantTokensItem : grantTokens) {
                    if (grantTokensItem != null) {
                        jsonWriter.value(grantTokensItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (signRequest.getSigningAlgorithm() != null) {
                String signingAlgorithm = signRequest.getSigningAlgorithm();
                jsonWriter.name("SigningAlgorithm");
                jsonWriter.value(signingAlgorithm);
            }
            if (signRequest.getDryRun() != null) {
                Boolean dryRun = signRequest.getDryRun();
                jsonWriter.name("DryRun");
                jsonWriter.value(dryRun);
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
