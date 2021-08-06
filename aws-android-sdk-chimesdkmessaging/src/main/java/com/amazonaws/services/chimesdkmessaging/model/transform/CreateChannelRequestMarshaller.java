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

package com.amazonaws.services.chimesdkmessaging.model.transform;

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
import com.amazonaws.services.chimesdkmessaging.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

import android.net.Uri;

/**
 * JSON request marshaller for CreateChannelRequest
 */
public class CreateChannelRequestMarshaller implements
        Marshaller<Request<CreateChannelRequest>, CreateChannelRequest> {

    public Request<CreateChannelRequest> marshall(CreateChannelRequest createChannelRequest) {
        if (createChannelRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateChannelRequest)");
        }

        Request<CreateChannelRequest> request = new DefaultRequest<CreateChannelRequest>(
                createChannelRequest, "AmazonChimeSDKMessaging");
        request.setHttpMethod(HttpMethodName.POST);

        if (createChannelRequest.getChimeBearer() != null) {
            request.addHeader("x-amz-chime-bearer",
                    StringUtils.fromString(createChannelRequest.getChimeBearer()));
        }
        String uriResourcePath = "/channels";
        request.setResourcePath(uriResourcePath);
        String encodedUriResourcePath = "/channels";
        request.setEncodedResourcePath(encodedUriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createChannelRequest.getAppInstanceArn() != null) {
                String appInstanceArn = createChannelRequest.getAppInstanceArn();
                jsonWriter.name("AppInstanceArn");
                jsonWriter.value(appInstanceArn);
            }
            if (createChannelRequest.getName() != null) {
                String name = createChannelRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (createChannelRequest.getMode() != null) {
                String mode = createChannelRequest.getMode();
                jsonWriter.name("Mode");
                jsonWriter.value(mode);
            }
            if (createChannelRequest.getPrivacy() != null) {
                String privacy = createChannelRequest.getPrivacy();
                jsonWriter.name("Privacy");
                jsonWriter.value(privacy);
            }
            if (createChannelRequest.getMetadata() != null) {
                String metadata = createChannelRequest.getMetadata();
                jsonWriter.name("Metadata");
                jsonWriter.value(metadata);
            }
            if (createChannelRequest.getClientRequestToken() != null) {
                String clientRequestToken = createChannelRequest.getClientRequestToken();
                jsonWriter.name("ClientRequestToken");
                jsonWriter.value(clientRequestToken);
            }
            if (createChannelRequest.getTags() != null) {
                java.util.List<Tag> tags = createChannelRequest.getTags();
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
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
