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

package com.amazonaws.services.rekognition.model.transform;

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
import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateProjectVersionRequest
 */
public class CreateProjectVersionRequestMarshaller implements
        Marshaller<Request<CreateProjectVersionRequest>, CreateProjectVersionRequest> {

    public Request<CreateProjectVersionRequest> marshall(
            CreateProjectVersionRequest createProjectVersionRequest) {
        if (createProjectVersionRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateProjectVersionRequest)");
        }

        Request<CreateProjectVersionRequest> request = new DefaultRequest<CreateProjectVersionRequest>(
                createProjectVersionRequest, "AmazonRekognition");
        String target = "RekognitionService.CreateProjectVersion";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createProjectVersionRequest.getProjectArn() != null) {
                String projectArn = createProjectVersionRequest.getProjectArn();
                jsonWriter.name("ProjectArn");
                jsonWriter.value(projectArn);
            }
            if (createProjectVersionRequest.getVersionName() != null) {
                String versionName = createProjectVersionRequest.getVersionName();
                jsonWriter.name("VersionName");
                jsonWriter.value(versionName);
            }
            if (createProjectVersionRequest.getOutputConfig() != null) {
                OutputConfig outputConfig = createProjectVersionRequest.getOutputConfig();
                jsonWriter.name("OutputConfig");
                OutputConfigJsonMarshaller.getInstance().marshall(outputConfig, jsonWriter);
            }
            if (createProjectVersionRequest.getTrainingData() != null) {
                TrainingData trainingData = createProjectVersionRequest.getTrainingData();
                jsonWriter.name("TrainingData");
                TrainingDataJsonMarshaller.getInstance().marshall(trainingData, jsonWriter);
            }
            if (createProjectVersionRequest.getTestingData() != null) {
                TestingData testingData = createProjectVersionRequest.getTestingData();
                jsonWriter.name("TestingData");
                TestingDataJsonMarshaller.getInstance().marshall(testingData, jsonWriter);
            }
            if (createProjectVersionRequest.getTags() != null) {
                java.util.Map<String, String> tags = createProjectVersionRequest.getTags();
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
            if (createProjectVersionRequest.getKmsKeyId() != null) {
                String kmsKeyId = createProjectVersionRequest.getKmsKeyId();
                jsonWriter.name("KmsKeyId");
                jsonWriter.value(kmsKeyId);
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
