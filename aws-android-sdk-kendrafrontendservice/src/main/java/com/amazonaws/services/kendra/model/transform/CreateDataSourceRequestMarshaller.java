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

package com.amazonaws.services.kendra.model.transform;

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
import com.amazonaws.services.kendra.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateDataSourceRequest
 */
public class CreateDataSourceRequestMarshaller implements
        Marshaller<Request<CreateDataSourceRequest>, CreateDataSourceRequest> {

    public Request<CreateDataSourceRequest> marshall(CreateDataSourceRequest createDataSourceRequest) {
        if (createDataSourceRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateDataSourceRequest)");
        }

        Request<CreateDataSourceRequest> request = new DefaultRequest<CreateDataSourceRequest>(
                createDataSourceRequest, "AWSKendraFrontendService");
        String target = "AWSKendraFrontendService.CreateDataSource";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createDataSourceRequest.getName() != null) {
                String name = createDataSourceRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (createDataSourceRequest.getIndexId() != null) {
                String indexId = createDataSourceRequest.getIndexId();
                jsonWriter.name("IndexId");
                jsonWriter.value(indexId);
            }
            if (createDataSourceRequest.getType() != null) {
                String type = createDataSourceRequest.getType();
                jsonWriter.name("Type");
                jsonWriter.value(type);
            }
            if (createDataSourceRequest.getConfiguration() != null) {
                DataSourceConfiguration configuration = createDataSourceRequest.getConfiguration();
                jsonWriter.name("Configuration");
                DataSourceConfigurationJsonMarshaller.getInstance().marshall(configuration,
                        jsonWriter);
            }
            if (createDataSourceRequest.getDescription() != null) {
                String description = createDataSourceRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (createDataSourceRequest.getSchedule() != null) {
                String schedule = createDataSourceRequest.getSchedule();
                jsonWriter.name("Schedule");
                jsonWriter.value(schedule);
            }
            if (createDataSourceRequest.getRoleArn() != null) {
                String roleArn = createDataSourceRequest.getRoleArn();
                jsonWriter.name("RoleArn");
                jsonWriter.value(roleArn);
            }
            if (createDataSourceRequest.getTags() != null) {
                java.util.List<Tag> tags = createDataSourceRequest.getTags();
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
