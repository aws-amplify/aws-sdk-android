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

package com.amazonaws.services.ec2.model.transform;

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
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateInstanceExportTaskRequest
 */
public class CreateInstanceExportTaskRequestMarshaller implements
        Marshaller<Request<CreateInstanceExportTaskRequest>, CreateInstanceExportTaskRequest> {

    public Request<CreateInstanceExportTaskRequest> marshall(
            CreateInstanceExportTaskRequest createInstanceExportTaskRequest) {
        if (createInstanceExportTaskRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateInstanceExportTaskRequest)");
        }

        Request<CreateInstanceExportTaskRequest> request = new DefaultRequest<CreateInstanceExportTaskRequest>(
                createInstanceExportTaskRequest, "AmazonElasticComputeCloud");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createInstanceExportTaskRequest.getDescription() != null) {
                String description = createInstanceExportTaskRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (createInstanceExportTaskRequest.getExportToS3Task() != null) {
                ExportToS3TaskSpecification exportToS3Task = createInstanceExportTaskRequest
                        .getExportToS3Task();
                jsonWriter.name("ExportToS3Task");
                ExportToS3TaskSpecificationJsonMarshaller.getInstance().marshall(exportToS3Task,
                        jsonWriter);
            }
            if (createInstanceExportTaskRequest.getInstanceId() != null) {
                String instanceId = createInstanceExportTaskRequest.getInstanceId();
                jsonWriter.name("InstanceId");
                jsonWriter.value(instanceId);
            }
            if (createInstanceExportTaskRequest.getTargetEnvironment() != null) {
                String targetEnvironment = createInstanceExportTaskRequest.getTargetEnvironment();
                jsonWriter.name("TargetEnvironment");
                jsonWriter.value(targetEnvironment);
            }
            if (createInstanceExportTaskRequest.getTagSpecifications() != null) {
                java.util.List<TagSpecification> tagSpecifications = createInstanceExportTaskRequest
                        .getTagSpecifications();
                jsonWriter.name("TagSpecifications");
                jsonWriter.beginArray();
                for (TagSpecification tagSpecificationsItem : tagSpecifications) {
                    if (tagSpecificationsItem != null) {
                        TagSpecificationJsonMarshaller.getInstance().marshall(
                                tagSpecificationsItem, jsonWriter);
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
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
