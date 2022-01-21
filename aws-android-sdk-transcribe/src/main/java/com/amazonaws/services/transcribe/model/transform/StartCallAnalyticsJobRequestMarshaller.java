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

package com.amazonaws.services.transcribe.model.transform;

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
import com.amazonaws.services.transcribe.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for StartCallAnalyticsJobRequest
 */
public class StartCallAnalyticsJobRequestMarshaller implements
        Marshaller<Request<StartCallAnalyticsJobRequest>, StartCallAnalyticsJobRequest> {

    public Request<StartCallAnalyticsJobRequest> marshall(
            StartCallAnalyticsJobRequest startCallAnalyticsJobRequest) {
        if (startCallAnalyticsJobRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(StartCallAnalyticsJobRequest)");
        }

        Request<StartCallAnalyticsJobRequest> request = new DefaultRequest<StartCallAnalyticsJobRequest>(
                startCallAnalyticsJobRequest, "AmazonTranscribe");
        String target = "Transcribe.StartCallAnalyticsJob";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (startCallAnalyticsJobRequest.getCallAnalyticsJobName() != null) {
                String callAnalyticsJobName = startCallAnalyticsJobRequest
                        .getCallAnalyticsJobName();
                jsonWriter.name("CallAnalyticsJobName");
                jsonWriter.value(callAnalyticsJobName);
            }
            if (startCallAnalyticsJobRequest.getMedia() != null) {
                Media media = startCallAnalyticsJobRequest.getMedia();
                jsonWriter.name("Media");
                MediaJsonMarshaller.getInstance().marshall(media, jsonWriter);
            }
            if (startCallAnalyticsJobRequest.getOutputLocation() != null) {
                String outputLocation = startCallAnalyticsJobRequest.getOutputLocation();
                jsonWriter.name("OutputLocation");
                jsonWriter.value(outputLocation);
            }
            if (startCallAnalyticsJobRequest.getOutputEncryptionKMSKeyId() != null) {
                String outputEncryptionKMSKeyId = startCallAnalyticsJobRequest
                        .getOutputEncryptionKMSKeyId();
                jsonWriter.name("OutputEncryptionKMSKeyId");
                jsonWriter.value(outputEncryptionKMSKeyId);
            }
            if (startCallAnalyticsJobRequest.getDataAccessRoleArn() != null) {
                String dataAccessRoleArn = startCallAnalyticsJobRequest.getDataAccessRoleArn();
                jsonWriter.name("DataAccessRoleArn");
                jsonWriter.value(dataAccessRoleArn);
            }
            if (startCallAnalyticsJobRequest.getSettings() != null) {
                CallAnalyticsJobSettings settings = startCallAnalyticsJobRequest.getSettings();
                jsonWriter.name("Settings");
                CallAnalyticsJobSettingsJsonMarshaller.getInstance().marshall(settings, jsonWriter);
            }
            if (startCallAnalyticsJobRequest.getChannelDefinitions() != null) {
                java.util.List<ChannelDefinition> channelDefinitions = startCallAnalyticsJobRequest
                        .getChannelDefinitions();
                jsonWriter.name("ChannelDefinitions");
                jsonWriter.beginArray();
                for (ChannelDefinition channelDefinitionsItem : channelDefinitions) {
                    if (channelDefinitionsItem != null) {
                        ChannelDefinitionJsonMarshaller.getInstance().marshall(
                                channelDefinitionsItem, jsonWriter);
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
