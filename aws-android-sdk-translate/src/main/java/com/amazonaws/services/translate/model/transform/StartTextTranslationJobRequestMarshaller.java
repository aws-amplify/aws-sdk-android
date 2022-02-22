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

package com.amazonaws.services.translate.model.transform;

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
import com.amazonaws.services.translate.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for StartTextTranslationJobRequest
 */
public class StartTextTranslationJobRequestMarshaller implements
        Marshaller<Request<StartTextTranslationJobRequest>, StartTextTranslationJobRequest> {

    public Request<StartTextTranslationJobRequest> marshall(
            StartTextTranslationJobRequest startTextTranslationJobRequest) {
        if (startTextTranslationJobRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(StartTextTranslationJobRequest)");
        }

        Request<StartTextTranslationJobRequest> request = new DefaultRequest<StartTextTranslationJobRequest>(
                startTextTranslationJobRequest, "AmazonTranslate");
        String target = "AWSShineFrontendService_20170701.StartTextTranslationJob";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (startTextTranslationJobRequest.getJobName() != null) {
                String jobName = startTextTranslationJobRequest.getJobName();
                jsonWriter.name("JobName");
                jsonWriter.value(jobName);
            }
            if (startTextTranslationJobRequest.getInputDataConfig() != null) {
                InputDataConfig inputDataConfig = startTextTranslationJobRequest
                        .getInputDataConfig();
                jsonWriter.name("InputDataConfig");
                InputDataConfigJsonMarshaller.getInstance().marshall(inputDataConfig, jsonWriter);
            }
            if (startTextTranslationJobRequest.getOutputDataConfig() != null) {
                OutputDataConfig outputDataConfig = startTextTranslationJobRequest
                        .getOutputDataConfig();
                jsonWriter.name("OutputDataConfig");
                OutputDataConfigJsonMarshaller.getInstance().marshall(outputDataConfig, jsonWriter);
            }
            if (startTextTranslationJobRequest.getDataAccessRoleArn() != null) {
                String dataAccessRoleArn = startTextTranslationJobRequest.getDataAccessRoleArn();
                jsonWriter.name("DataAccessRoleArn");
                jsonWriter.value(dataAccessRoleArn);
            }
            if (startTextTranslationJobRequest.getSourceLanguageCode() != null) {
                String sourceLanguageCode = startTextTranslationJobRequest.getSourceLanguageCode();
                jsonWriter.name("SourceLanguageCode");
                jsonWriter.value(sourceLanguageCode);
            }
            if (startTextTranslationJobRequest.getTargetLanguageCodes() != null) {
                java.util.List<String> targetLanguageCodes = startTextTranslationJobRequest
                        .getTargetLanguageCodes();
                jsonWriter.name("TargetLanguageCodes");
                jsonWriter.beginArray();
                for (String targetLanguageCodesItem : targetLanguageCodes) {
                    if (targetLanguageCodesItem != null) {
                        jsonWriter.value(targetLanguageCodesItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (startTextTranslationJobRequest.getTerminologyNames() != null) {
                java.util.List<String> terminologyNames = startTextTranslationJobRequest
                        .getTerminologyNames();
                jsonWriter.name("TerminologyNames");
                jsonWriter.beginArray();
                for (String terminologyNamesItem : terminologyNames) {
                    if (terminologyNamesItem != null) {
                        jsonWriter.value(terminologyNamesItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (startTextTranslationJobRequest.getParallelDataNames() != null) {
                java.util.List<String> parallelDataNames = startTextTranslationJobRequest
                        .getParallelDataNames();
                jsonWriter.name("ParallelDataNames");
                jsonWriter.beginArray();
                for (String parallelDataNamesItem : parallelDataNames) {
                    if (parallelDataNamesItem != null) {
                        jsonWriter.value(parallelDataNamesItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (startTextTranslationJobRequest.getClientToken() != null) {
                String clientToken = startTextTranslationJobRequest.getClientToken();
                jsonWriter.name("ClientToken");
                jsonWriter.value(clientToken);
            }
            if (startTextTranslationJobRequest.getSettings() != null) {
                TranslationSettings settings = startTextTranslationJobRequest.getSettings();
                jsonWriter.name("Settings");
                TranslationSettingsJsonMarshaller.getInstance().marshall(settings, jsonWriter);
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
