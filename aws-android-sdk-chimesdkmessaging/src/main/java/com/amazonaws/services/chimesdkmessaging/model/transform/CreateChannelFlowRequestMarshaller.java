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
 * JSON request marshaller for CreateChannelFlowRequest
 */
public class CreateChannelFlowRequestMarshaller implements
        Marshaller<Request<CreateChannelFlowRequest>, CreateChannelFlowRequest> {

    public Request<CreateChannelFlowRequest> marshall(
            CreateChannelFlowRequest createChannelFlowRequest) {
        if (createChannelFlowRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateChannelFlowRequest)");
        }

        Request<CreateChannelFlowRequest> request = new DefaultRequest<CreateChannelFlowRequest>(
                createChannelFlowRequest, "AmazonChimeSDKMessaging");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/channel-flows";
        request.setResourcePath(uriResourcePath);
        String encodedUriResourcePath = "/channel-flows";
        request.setEncodedResourcePath(encodedUriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createChannelFlowRequest.getAppInstanceArn() != null) {
                String appInstanceArn = createChannelFlowRequest.getAppInstanceArn();
                jsonWriter.name("AppInstanceArn");
                jsonWriter.value(appInstanceArn);
            }
            if (createChannelFlowRequest.getProcessors() != null) {
                java.util.List<Processor> processors = createChannelFlowRequest.getProcessors();
                jsonWriter.name("Processors");
                jsonWriter.beginArray();
                for (Processor processorsItem : processors) {
                    if (processorsItem != null) {
                        ProcessorJsonMarshaller.getInstance().marshall(processorsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createChannelFlowRequest.getName() != null) {
                String name = createChannelFlowRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (createChannelFlowRequest.getTags() != null) {
                java.util.List<Tag> tags = createChannelFlowRequest.getTags();
                jsonWriter.name("Tags");
                jsonWriter.beginArray();
                for (Tag tagsItem : tags) {
                    if (tagsItem != null) {
                        TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createChannelFlowRequest.getClientRequestToken() != null) {
                String clientRequestToken = createChannelFlowRequest.getClientRequestToken();
                jsonWriter.name("ClientRequestToken");
                jsonWriter.value(clientRequestToken);
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
