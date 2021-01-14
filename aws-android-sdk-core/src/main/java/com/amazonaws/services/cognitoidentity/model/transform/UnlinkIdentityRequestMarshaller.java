/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentity.model.transform;

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
import com.amazonaws.services.cognitoidentity.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for UnlinkIdentityRequest
 */
public class UnlinkIdentityRequestMarshaller implements
        Marshaller<Request<UnlinkIdentityRequest>, UnlinkIdentityRequest> {

    public Request<UnlinkIdentityRequest> marshall(UnlinkIdentityRequest unlinkIdentityRequest) {
        if (unlinkIdentityRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UnlinkIdentityRequest)");
        }

        Request<UnlinkIdentityRequest> request = new DefaultRequest<UnlinkIdentityRequest>(
                unlinkIdentityRequest, "AmazonCognitoIdentity");
        String target = "AWSCognitoIdentityService.UnlinkIdentity";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (unlinkIdentityRequest.getIdentityId() != null) {
                String identityId = unlinkIdentityRequest.getIdentityId();
                jsonWriter.name("IdentityId");
                jsonWriter.value(identityId);
            }
            if (unlinkIdentityRequest.getLogins() != null) {
                java.util.Map<String, String> logins = unlinkIdentityRequest.getLogins();
                jsonWriter.name("Logins");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> loginsEntry : logins.entrySet()) {
                    String loginsValue = loginsEntry.getValue();
                    if (loginsValue != null) {
                        jsonWriter.name(loginsEntry.getKey());
                        jsonWriter.value(loginsValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (unlinkIdentityRequest.getLoginsToRemove() != null) {
                java.util.List<String> loginsToRemove = unlinkIdentityRequest.getLoginsToRemove();
                jsonWriter.name("LoginsToRemove");
                jsonWriter.beginArray();
                for (String loginsToRemoveItem : loginsToRemove) {
                    if (loginsToRemoveItem != null) {
                        jsonWriter.value(loginsToRemoveItem);
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
