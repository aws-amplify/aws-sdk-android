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
 * JSON request marshaller for UpdateChannelFlowRequest
 */
public class UpdateChannelFlowRequestMarshaller implements
        Marshaller<Request<UpdateChannelFlowRequest>, UpdateChannelFlowRequest> {

    public Request<UpdateChannelFlowRequest> marshall(
            UpdateChannelFlowRequest updateChannelFlowRequest) {
        if (updateChannelFlowRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateChannelFlowRequest)");
        }

        Request<UpdateChannelFlowRequest> request = new DefaultRequest<UpdateChannelFlowRequest>(
                updateChannelFlowRequest, "AmazonChimeSDKMessaging");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/channel-flows/{channelFlowArn}";
        uriResourcePath = uriResourcePath.replace(
                "{channelFlowArn}",
                (updateChannelFlowRequest.getChannelFlowArn() == null) ? "" : StringUtils
                        .fromString(updateChannelFlowRequest.getChannelFlowArn()));
        request.setResourcePath(uriResourcePath);
        String encodedUriResourcePath = "/channel-flows/{channelFlowArn}";
        encodedUriResourcePath = encodedUriResourcePath.replace(
                "{channelFlowArn}",
                (updateChannelFlowRequest.getChannelFlowArn() == null) ? ""
                        : Uri.encode(StringUtils.fromString(updateChannelFlowRequest
                                .getChannelFlowArn())));
        request.setEncodedResourcePath(encodedUriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateChannelFlowRequest.getProcessors() != null) {
                java.util.List<Processor> processors = updateChannelFlowRequest.getProcessors();
                jsonWriter.name("Processors");
                jsonWriter.beginArray();
                for (Processor processorsItem : processors) {
                    if (processorsItem != null) {
                        ProcessorJsonMarshaller.getInstance().marshall(processorsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateChannelFlowRequest.getName() != null) {
                String name = updateChannelFlowRequest.getName();
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
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
