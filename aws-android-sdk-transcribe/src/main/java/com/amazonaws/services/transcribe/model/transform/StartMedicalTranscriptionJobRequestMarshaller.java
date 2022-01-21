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
 * JSON request marshaller for StartMedicalTranscriptionJobRequest
 */
public class StartMedicalTranscriptionJobRequestMarshaller
        implements
        Marshaller<Request<StartMedicalTranscriptionJobRequest>, StartMedicalTranscriptionJobRequest> {

    public Request<StartMedicalTranscriptionJobRequest> marshall(
            StartMedicalTranscriptionJobRequest startMedicalTranscriptionJobRequest) {
        if (startMedicalTranscriptionJobRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(StartMedicalTranscriptionJobRequest)");
        }

        Request<StartMedicalTranscriptionJobRequest> request = new DefaultRequest<StartMedicalTranscriptionJobRequest>(
                startMedicalTranscriptionJobRequest, "AmazonTranscribe");
        String target = "Transcribe.StartMedicalTranscriptionJob";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (startMedicalTranscriptionJobRequest.getMedicalTranscriptionJobName() != null) {
                String medicalTranscriptionJobName = startMedicalTranscriptionJobRequest
                        .getMedicalTranscriptionJobName();
                jsonWriter.name("MedicalTranscriptionJobName");
                jsonWriter.value(medicalTranscriptionJobName);
            }
            if (startMedicalTranscriptionJobRequest.getLanguageCode() != null) {
                String languageCode = startMedicalTranscriptionJobRequest.getLanguageCode();
                jsonWriter.name("LanguageCode");
                jsonWriter.value(languageCode);
            }
            if (startMedicalTranscriptionJobRequest.getMediaSampleRateHertz() != null) {
                Integer mediaSampleRateHertz = startMedicalTranscriptionJobRequest
                        .getMediaSampleRateHertz();
                jsonWriter.name("MediaSampleRateHertz");
                jsonWriter.value(mediaSampleRateHertz);
            }
            if (startMedicalTranscriptionJobRequest.getMediaFormat() != null) {
                String mediaFormat = startMedicalTranscriptionJobRequest.getMediaFormat();
                jsonWriter.name("MediaFormat");
                jsonWriter.value(mediaFormat);
            }
            if (startMedicalTranscriptionJobRequest.getMedia() != null) {
                Media media = startMedicalTranscriptionJobRequest.getMedia();
                jsonWriter.name("Media");
                MediaJsonMarshaller.getInstance().marshall(media, jsonWriter);
            }
            if (startMedicalTranscriptionJobRequest.getOutputBucketName() != null) {
                String outputBucketName = startMedicalTranscriptionJobRequest.getOutputBucketName();
                jsonWriter.name("OutputBucketName");
                jsonWriter.value(outputBucketName);
            }
            if (startMedicalTranscriptionJobRequest.getOutputKey() != null) {
                String outputKey = startMedicalTranscriptionJobRequest.getOutputKey();
                jsonWriter.name("OutputKey");
                jsonWriter.value(outputKey);
            }
            if (startMedicalTranscriptionJobRequest.getOutputEncryptionKMSKeyId() != null) {
                String outputEncryptionKMSKeyId = startMedicalTranscriptionJobRequest
                        .getOutputEncryptionKMSKeyId();
                jsonWriter.name("OutputEncryptionKMSKeyId");
                jsonWriter.value(outputEncryptionKMSKeyId);
            }
            if (startMedicalTranscriptionJobRequest.getKMSEncryptionContext() != null) {
                java.util.Map<String, String> kMSEncryptionContext = startMedicalTranscriptionJobRequest
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
            if (startMedicalTranscriptionJobRequest.getSettings() != null) {
                MedicalTranscriptionSetting settings = startMedicalTranscriptionJobRequest
                        .getSettings();
                jsonWriter.name("Settings");
                MedicalTranscriptionSettingJsonMarshaller.getInstance().marshall(settings,
                        jsonWriter);
            }
            if (startMedicalTranscriptionJobRequest.getContentIdentificationType() != null) {
                String contentIdentificationType = startMedicalTranscriptionJobRequest
                        .getContentIdentificationType();
                jsonWriter.name("ContentIdentificationType");
                jsonWriter.value(contentIdentificationType);
            }
            if (startMedicalTranscriptionJobRequest.getSpecialty() != null) {
                String specialty = startMedicalTranscriptionJobRequest.getSpecialty();
                jsonWriter.name("Specialty");
                jsonWriter.value(specialty);
            }
            if (startMedicalTranscriptionJobRequest.getType() != null) {
                String type = startMedicalTranscriptionJobRequest.getType();
                jsonWriter.name("Type");
                jsonWriter.value(type);
            }
            if (startMedicalTranscriptionJobRequest.getTags() != null) {
                java.util.List<Tag> tags = startMedicalTranscriptionJobRequest.getTags();
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
