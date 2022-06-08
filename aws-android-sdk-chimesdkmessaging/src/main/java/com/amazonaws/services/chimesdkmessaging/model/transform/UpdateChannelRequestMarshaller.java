/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON request marshaller for UpdateChannelRequest
 */
public class UpdateChannelRequestMarshaller implements
        Marshaller<Request<UpdateChannelRequest>, UpdateChannelRequest> {

    public Request<UpdateChannelRequest> marshall(UpdateChannelRequest updateChannelRequest) {
        if (updateChannelRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateChannelRequest)");
        }

        Request<UpdateChannelRequest> request = new DefaultRequest<UpdateChannelRequest>(
                updateChannelRequest, "AmazonChimeSDKMessaging");
        request.setHttpMethod(HttpMethodName.PUT);

        if (updateChannelRequest.getChimeBearer() != null) {
            request.addHeader("x-amz-chime-bearer",
                    StringUtils.fromString(updateChannelRequest.getChimeBearer()));
        }
        String uriResourcePath = "/channels/{channelArn}";
        uriResourcePath = uriResourcePath.replace(
                "{channelArn}",
                (updateChannelRequest.getChannelArn() == null) ? "" : StringUtils
                        .fromString(updateChannelRequest.getChannelArn()));
        request.setResourcePath(uriResourcePath);
        String encodedUriResourcePath = "/channels/{channelArn}";
        encodedUriResourcePath = encodedUriResourcePath.replace(
                "{channelArn}",
                (updateChannelRequest.getChannelArn() == null) ? "" : Uri.encode(StringUtils
                        .fromString(updateChannelRequest.getChannelArn())));
        request.setEncodedResourcePath(encodedUriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateChannelRequest.getName() != null) {
                String name = updateChannelRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (updateChannelRequest.getMode() != null) {
                String mode = updateChannelRequest.getMode();
                jsonWriter.name("Mode");
                jsonWriter.value(mode);
            }
            if (updateChannelRequest.getMetadata() != null) {
                String metadata = updateChannelRequest.getMetadata();
                jsonWriter.name("Metadata");
                jsonWriter.value(metadata);
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
