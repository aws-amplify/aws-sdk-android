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
 * JSON request marshaller for StartTranscriptionJobRequest
 */
public class StartTranscriptionJobRequestMarshaller implements
        Marshaller<Request<StartTranscriptionJobRequest>, StartTranscriptionJobRequest> {

    public Request<StartTranscriptionJobRequest> marshall(
            StartTranscriptionJobRequest startTranscriptionJobRequest) {
        if (startTranscriptionJobRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(StartTranscriptionJobRequest)");
        }

        Request<StartTranscriptionJobRequest> request = new DefaultRequest<StartTranscriptionJobRequest>(
                startTranscriptionJobRequest, "AmazonTranscribe");
        String target = "Transcribe.StartTranscriptionJob";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (startTranscriptionJobRequest.getTranscriptionJobName() != null) {
                String transcriptionJobName = startTranscriptionJobRequest
                        .getTranscriptionJobName();
                jsonWriter.name("TranscriptionJobName");
                jsonWriter.value(transcriptionJobName);
            }
            if (startTranscriptionJobRequest.getLanguageCode() != null) {
                String languageCode = startTranscriptionJobRequest.getLanguageCode();
                jsonWriter.name("LanguageCode");
                jsonWriter.value(languageCode);
            }
            if (startTranscriptionJobRequest.getMediaSampleRateHertz() != null) {
                Integer mediaSampleRateHertz = startTranscriptionJobRequest
                        .getMediaSampleRateHertz();
                jsonWriter.name("MediaSampleRateHertz");
                jsonWriter.value(mediaSampleRateHertz);
            }
            if (startTranscriptionJobRequest.getMediaFormat() != null) {
                String mediaFormat = startTranscriptionJobRequest.getMediaFormat();
                jsonWriter.name("MediaFormat");
                jsonWriter.value(mediaFormat);
            }
            if (startTranscriptionJobRequest.getMedia() != null) {
                Media media = startTranscriptionJobRequest.getMedia();
                jsonWriter.name("Media");
                MediaJsonMarshaller.getInstance().marshall(media, jsonWriter);
            }
            if (startTranscriptionJobRequest.getOutputBucketName() != null) {
                String outputBucketName = startTranscriptionJobRequest.getOutputBucketName();
                jsonWriter.name("OutputBucketName");
                jsonWriter.value(outputBucketName);
            }
            if (startTranscriptionJobRequest.getOutputKey() != null) {
                String outputKey = startTranscriptionJobRequest.getOutputKey();
                jsonWriter.name("OutputKey");
                jsonWriter.value(outputKey);
            }
            if (startTranscriptionJobRequest.getOutputEncryptionKMSKeyId() != null) {
                String outputEncryptionKMSKeyId = startTranscriptionJobRequest
                        .getOutputEncryptionKMSKeyId();
                jsonWriter.name("OutputEncryptionKMSKeyId");
                jsonWriter.value(outputEncryptionKMSKeyId);
            }
            if (startTranscriptionJobRequest.getKMSEncryptionContext() != null) {
                java.util.Map<String, String> kMSEncryptionContext = startTranscriptionJobRequest
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
            if (startTranscriptionJobRequest.getSettings() != null) {
                Settings settings = startTranscriptionJobRequest.getSettings();
                jsonWriter.name("Settings");
                SettingsJsonMarshaller.getInstance().marshall(settings, jsonWriter);
            }
            if (startTranscriptionJobRequest.getModelSettings() != null) {
                ModelSettings modelSettings = startTranscriptionJobRequest.getModelSettings();
                jsonWriter.name("ModelSettings");
                ModelSettingsJsonMarshaller.getInstance().marshall(modelSettings, jsonWriter);
            }
            if (startTranscriptionJobRequest.getJobExecutionSettings() != null) {
                JobExecutionSettings jobExecutionSettings = startTranscriptionJobRequest
                        .getJobExecutionSettings();
                jsonWriter.name("JobExecutionSettings");
                JobExecutionSettingsJsonMarshaller.getInstance().marshall(jobExecutionSettings,
                        jsonWriter);
            }
            if (startTranscriptionJobRequest.getContentRedaction() != null) {
                ContentRedaction contentRedaction = startTranscriptionJobRequest
                        .getContentRedaction();
                jsonWriter.name("ContentRedaction");
                ContentRedactionJsonMarshaller.getInstance().marshall(contentRedaction, jsonWriter);
            }
            if (startTranscriptionJobRequest.getIdentifyLanguage() != null) {
                Boolean identifyLanguage = startTranscriptionJobRequest.getIdentifyLanguage();
                jsonWriter.name("IdentifyLanguage");
                jsonWriter.value(identifyLanguage);
            }
            if (startTranscriptionJobRequest.getLanguageOptions() != null) {
                java.util.List<String> languageOptions = startTranscriptionJobRequest
                        .getLanguageOptions();
                jsonWriter.name("LanguageOptions");
                jsonWriter.beginArray();
                for (String languageOptionsItem : languageOptions) {
                    if (languageOptionsItem != null) {
                        jsonWriter.value(languageOptionsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (startTranscriptionJobRequest.getSubtitles() != null) {
                Subtitles subtitles = startTranscriptionJobRequest.getSubtitles();
                jsonWriter.name("Subtitles");
                SubtitlesJsonMarshaller.getInstance().marshall(subtitles, jsonWriter);
            }
            if (startTranscriptionJobRequest.getTags() != null) {
                java.util.List<Tag> tags = startTranscriptionJobRequest.getTags();
                jsonWriter.name("Tags");
                jsonWriter.beginArray();
                for (Tag tagsItem : tags) {
                    if (tagsItem != null) {
                        TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (startTranscriptionJobRequest.getLanguageIdSettings() != null) {
                java.util.Map<String, LanguageIdSettings> languageIdSettings = startTranscriptionJobRequest
                        .getLanguageIdSettings();
                jsonWriter.name("LanguageIdSettings");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, LanguageIdSettings> languageIdSettingsEntry : languageIdSettings
                        .entrySet()) {
                    LanguageIdSettings languageIdSettingsValue = languageIdSettingsEntry.getValue();
                    if (languageIdSettingsValue != null) {
                        jsonWriter.name(languageIdSettingsEntry.getKey());
                        LanguageIdSettingsJsonMarshaller.getInstance().marshall(
                                languageIdSettingsValue, jsonWriter);
                    }
                }
                jsonWriter.endObject();
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
