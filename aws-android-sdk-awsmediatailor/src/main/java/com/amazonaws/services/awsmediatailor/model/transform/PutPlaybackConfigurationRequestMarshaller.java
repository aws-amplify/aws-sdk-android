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

package com.amazonaws.services.awsmediatailor.model.transform;

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
import com.amazonaws.services.awsmediatailor.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for PutPlaybackConfigurationRequest
 */
public class PutPlaybackConfigurationRequestMarshaller implements
        Marshaller<Request<PutPlaybackConfigurationRequest>, PutPlaybackConfigurationRequest> {

    public Request<PutPlaybackConfigurationRequest> marshall(
            PutPlaybackConfigurationRequest putPlaybackConfigurationRequest) {
        if (putPlaybackConfigurationRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(PutPlaybackConfigurationRequest)");
        }

        Request<PutPlaybackConfigurationRequest> request = new DefaultRequest<PutPlaybackConfigurationRequest>(
                putPlaybackConfigurationRequest, "AWSMediaTailor");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/playbackConfiguration";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (putPlaybackConfigurationRequest.getAdDecisionServerUrl() != null) {
                String adDecisionServerUrl = putPlaybackConfigurationRequest
                        .getAdDecisionServerUrl();
                jsonWriter.name("AdDecisionServerUrl");
                jsonWriter.value(adDecisionServerUrl);
            }
            if (putPlaybackConfigurationRequest.getAvailSuppression() != null) {
                AvailSuppression availSuppression = putPlaybackConfigurationRequest
                        .getAvailSuppression();
                jsonWriter.name("AvailSuppression");
                AvailSuppressionJsonMarshaller.getInstance().marshall(availSuppression, jsonWriter);
            }
            if (putPlaybackConfigurationRequest.getCdnConfiguration() != null) {
                CdnConfiguration cdnConfiguration = putPlaybackConfigurationRequest
                        .getCdnConfiguration();
                jsonWriter.name("CdnConfiguration");
                CdnConfigurationJsonMarshaller.getInstance().marshall(cdnConfiguration, jsonWriter);
            }
            if (putPlaybackConfigurationRequest.getDashConfiguration() != null) {
                DashConfigurationForPut dashConfiguration = putPlaybackConfigurationRequest
                        .getDashConfiguration();
                jsonWriter.name("DashConfiguration");
                DashConfigurationForPutJsonMarshaller.getInstance().marshall(dashConfiguration,
                        jsonWriter);
            }
            if (putPlaybackConfigurationRequest.getLivePreRollConfiguration() != null) {
                LivePreRollConfiguration livePreRollConfiguration = putPlaybackConfigurationRequest
                        .getLivePreRollConfiguration();
                jsonWriter.name("LivePreRollConfiguration");
                LivePreRollConfigurationJsonMarshaller.getInstance().marshall(
                        livePreRollConfiguration, jsonWriter);
            }
            if (putPlaybackConfigurationRequest.getName() != null) {
                String name = putPlaybackConfigurationRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (putPlaybackConfigurationRequest.getPersonalizationThresholdSeconds() != null) {
                Integer personalizationThresholdSeconds = putPlaybackConfigurationRequest
                        .getPersonalizationThresholdSeconds();
                jsonWriter.name("PersonalizationThresholdSeconds");
                jsonWriter.value(personalizationThresholdSeconds);
            }
            if (putPlaybackConfigurationRequest.getSlateAdUrl() != null) {
                String slateAdUrl = putPlaybackConfigurationRequest.getSlateAdUrl();
                jsonWriter.name("SlateAdUrl");
                jsonWriter.value(slateAdUrl);
            }
            if (putPlaybackConfigurationRequest.getTags() != null) {
                java.util.Map<String, String> tags = putPlaybackConfigurationRequest.getTags();
                jsonWriter.name("Tags");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                    String tagsValue = tagsEntry.getValue();
                    if (tagsValue != null) {
                        jsonWriter.name(tagsEntry.getKey());
                        jsonWriter.value(tagsValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (putPlaybackConfigurationRequest.getTranscodeProfileName() != null) {
                String transcodeProfileName = putPlaybackConfigurationRequest
                        .getTranscodeProfileName();
                jsonWriter.name("TranscodeProfileName");
                jsonWriter.value(transcodeProfileName);
            }
            if (putPlaybackConfigurationRequest.getVideoContentSourceUrl() != null) {
                String videoContentSourceUrl = putPlaybackConfigurationRequest
                        .getVideoContentSourceUrl();
                jsonWriter.name("VideoContentSourceUrl");
                jsonWriter.value(videoContentSourceUrl);
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
