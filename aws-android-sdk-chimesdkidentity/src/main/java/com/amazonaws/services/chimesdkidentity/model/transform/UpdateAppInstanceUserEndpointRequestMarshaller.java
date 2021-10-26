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

package com.amazonaws.services.chimesdkidentity.model.transform;

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
import com.amazonaws.services.chimesdkidentity.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

import android.net.Uri;

/**
 * JSON request marshaller for UpdateAppInstanceUserEndpointRequest
 */
public class UpdateAppInstanceUserEndpointRequestMarshaller
        implements
        Marshaller<Request<UpdateAppInstanceUserEndpointRequest>, UpdateAppInstanceUserEndpointRequest> {

    public Request<UpdateAppInstanceUserEndpointRequest> marshall(
            UpdateAppInstanceUserEndpointRequest updateAppInstanceUserEndpointRequest) {
        if (updateAppInstanceUserEndpointRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateAppInstanceUserEndpointRequest)");
        }

        Request<UpdateAppInstanceUserEndpointRequest> request = new DefaultRequest<UpdateAppInstanceUserEndpointRequest>(
                updateAppInstanceUserEndpointRequest, "AmazonChimeSDKIdentity");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/app-instance-users/{appInstanceUserArn}/endpoints/{endpointId}";
        uriResourcePath = uriResourcePath.replace(
                "{appInstanceUserArn}",
                (updateAppInstanceUserEndpointRequest.getAppInstanceUserArn() == null) ? ""
                        : StringUtils.fromString(updateAppInstanceUserEndpointRequest
                                .getAppInstanceUserArn()));
        uriResourcePath = uriResourcePath.replace(
                "{endpointId}",
                (updateAppInstanceUserEndpointRequest.getEndpointId() == null) ? "" : StringUtils
                        .fromString(updateAppInstanceUserEndpointRequest.getEndpointId()));
        request.setResourcePath(uriResourcePath);
        String encodedUriResourcePath = "/app-instance-users/{appInstanceUserArn}/endpoints/{endpointId}";
        encodedUriResourcePath = encodedUriResourcePath.replace(
                "{appInstanceUserArn}",
                (updateAppInstanceUserEndpointRequest.getAppInstanceUserArn() == null) ? "" : Uri
                        .encode(StringUtils.fromString(updateAppInstanceUserEndpointRequest
                                .getAppInstanceUserArn())));
        encodedUriResourcePath = encodedUriResourcePath.replace(
                "{endpointId}",
                (updateAppInstanceUserEndpointRequest.getEndpointId() == null) ? "" : Uri
                        .encode(StringUtils.fromString(updateAppInstanceUserEndpointRequest
                                .getEndpointId())));
        request.setEncodedResourcePath(encodedUriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateAppInstanceUserEndpointRequest.getName() != null) {
                String name = updateAppInstanceUserEndpointRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (updateAppInstanceUserEndpointRequest.getAllowMessages() != null) {
                String allowMessages = updateAppInstanceUserEndpointRequest.getAllowMessages();
                jsonWriter.name("AllowMessages");
                jsonWriter.value(allowMessages);
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
