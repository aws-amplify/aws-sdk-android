/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model.transform;

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
import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateFlywheelRequest
 */
public class CreateFlywheelRequestMarshaller implements
        Marshaller<Request<CreateFlywheelRequest>, CreateFlywheelRequest> {

    public Request<CreateFlywheelRequest> marshall(CreateFlywheelRequest createFlywheelRequest) {
        if (createFlywheelRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateFlywheelRequest)");
        }

        Request<CreateFlywheelRequest> request = new DefaultRequest<CreateFlywheelRequest>(
                createFlywheelRequest, "AmazonComprehend");
        String target = "Comprehend_20171127.CreateFlywheel";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createFlywheelRequest.getFlywheelName() != null) {
                String flywheelName = createFlywheelRequest.getFlywheelName();
                jsonWriter.name("FlywheelName");
                jsonWriter.value(flywheelName);
            }
            if (createFlywheelRequest.getActiveModelArn() != null) {
                String activeModelArn = createFlywheelRequest.getActiveModelArn();
                jsonWriter.name("ActiveModelArn");
                jsonWriter.value(activeModelArn);
            }
            if (createFlywheelRequest.getDataAccessRoleArn() != null) {
                String dataAccessRoleArn = createFlywheelRequest.getDataAccessRoleArn();
                jsonWriter.name("DataAccessRoleArn");
                jsonWriter.value(dataAccessRoleArn);
            }
            if (createFlywheelRequest.getTaskConfig() != null) {
                TaskConfig taskConfig = createFlywheelRequest.getTaskConfig();
                jsonWriter.name("TaskConfig");
                TaskConfigJsonMarshaller.getInstance().marshall(taskConfig, jsonWriter);
            }
            if (createFlywheelRequest.getModelType() != null) {
                String modelType = createFlywheelRequest.getModelType();
                jsonWriter.name("ModelType");
                jsonWriter.value(modelType);
            }
            if (createFlywheelRequest.getDataLakeS3Uri() != null) {
                String dataLakeS3Uri = createFlywheelRequest.getDataLakeS3Uri();
                jsonWriter.name("DataLakeS3Uri");
                jsonWriter.value(dataLakeS3Uri);
            }
            if (createFlywheelRequest.getDataSecurityConfig() != null) {
                DataSecurityConfig dataSecurityConfig = createFlywheelRequest
                        .getDataSecurityConfig();
                jsonWriter.name("DataSecurityConfig");
                DataSecurityConfigJsonMarshaller.getInstance().marshall(dataSecurityConfig,
                        jsonWriter);
            }
            if (createFlywheelRequest.getClientRequestToken() != null) {
                String clientRequestToken = createFlywheelRequest.getClientRequestToken();
                jsonWriter.name("ClientRequestToken");
                jsonWriter.value(clientRequestToken);
            }
            if (createFlywheelRequest.getTags() != null) {
                java.util.List<Tag> tags = createFlywheelRequest.getTags();
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
