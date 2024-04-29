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
 * JSON request marshaller for StartMedicalScribeJobRequest
 */
public class StartMedicalScribeJobRequestMarshaller implements
        Marshaller<Request<StartMedicalScribeJobRequest>, StartMedicalScribeJobRequest> {

    public Request<StartMedicalScribeJobRequest> marshall(
            StartMedicalScribeJobRequest startMedicalScribeJobRequest) {
        if (startMedicalScribeJobRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(StartMedicalScribeJobRequest)");
        }

        Request<StartMedicalScribeJobRequest> request = new DefaultRequest<StartMedicalScribeJobRequest>(
                startMedicalScribeJobRequest, "AmazonTranscribe");
        String target = "Transcribe.StartMedicalScribeJob";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (startMedicalScribeJobRequest.getMedicalScribeJobName() != null) {
                String medicalScribeJobName = startMedicalScribeJobRequest
                        .getMedicalScribeJobName();
                jsonWriter.name("MedicalScribeJobName");
                jsonWriter.value(medicalScribeJobName);
            }
            if (startMedicalScribeJobRequest.getMedia() != null) {
                Media media = startMedicalScribeJobRequest.getMedia();
                jsonWriter.name("Media");
                MediaJsonMarshaller.getInstance().marshall(media, jsonWriter);
            }
            if (startMedicalScribeJobRequest.getOutputBucketName() != null) {
                String outputBucketName = startMedicalScribeJobRequest.getOutputBucketName();
                jsonWriter.name("OutputBucketName");
                jsonWriter.value(outputBucketName);
            }
            if (startMedicalScribeJobRequest.getOutputEncryptionKMSKeyId() != null) {
                String outputEncryptionKMSKeyId = startMedicalScribeJobRequest
                        .getOutputEncryptionKMSKeyId();
                jsonWriter.name("OutputEncryptionKMSKeyId");
                jsonWriter.value(outputEncryptionKMSKeyId);
            }
            if (startMedicalScribeJobRequest.getKMSEncryptionContext() != null) {
                java.util.Map<String, String> kMSEncryptionContext = startMedicalScribeJobRequest
                        .getKMSEncryptionContext();
                jsonWriter.name("KMSEncryptionContext");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> kMSEncryptionContextEntry : kMSEncryptionContext
                        .entrySet()) {
                    String kMSEncryptionContextValue = kMSEncryptionContextEntry.getValue();
                    if (kMSEncryptionContextValue != null) {
                        jsonWriter.name(kMSEncryptionContextEntry.getKey());
                        jsonWriter.value(kMSEncryptionContextValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (startMedicalScribeJobRequest.getDataAccessRoleArn() != null) {
                String dataAccessRoleArn = startMedicalScribeJobRequest.getDataAccessRoleArn();
                jsonWriter.name("DataAccessRoleArn");
                jsonWriter.value(dataAccessRoleArn);
            }
            if (startMedicalScribeJobRequest.getSettings() != null) {
                MedicalScribeSettings settings = startMedicalScribeJobRequest.getSettings();
                jsonWriter.name("Settings");
                MedicalScribeSettingsJsonMarshaller.getInstance().marshall(settings, jsonWriter);
            }
            if (startMedicalScribeJobRequest.getChannelDefinitions() != null) {
                java.util.List<MedicalScribeChannelDefinition> channelDefinitions = startMedicalScribeJobRequest
                        .getChannelDefinitions();
                jsonWriter.name("ChannelDefinitions");
                jsonWriter.beginArray();
                for (MedicalScribeChannelDefinition channelDefinitionsItem : channelDefinitions) {
                    if (channelDefinitionsItem != null) {
                        MedicalScribeChannelDefinitionJsonMarshaller.getInstance().marshall(
                                channelDefinitionsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (startMedicalScribeJobRequest.getTags() != null) {
                java.util.List<Tag> tags = startMedicalScribeJobRequest.getTags();
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
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
