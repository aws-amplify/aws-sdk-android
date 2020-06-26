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

package com.amazonaws.services.quicksight.model.transform;

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
import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateDashboardRequest
 */
public class CreateDashboardRequestMarshaller implements
        Marshaller<Request<CreateDashboardRequest>, CreateDashboardRequest> {

    public Request<CreateDashboardRequest> marshall(CreateDashboardRequest createDashboardRequest) {
        if (createDashboardRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateDashboardRequest)");
        }

        Request<CreateDashboardRequest> request = new DefaultRequest<CreateDashboardRequest>(
                createDashboardRequest, "AmazonQuickSight");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/accounts/{AwsAccountId}/dashboards/{DashboardId}";
        uriResourcePath = uriResourcePath.replace(
                "{AwsAccountId}",
                (createDashboardRequest.getAwsAccountId() == null) ? "" : StringUtils
                        .fromString(createDashboardRequest.getAwsAccountId()));
        uriResourcePath = uriResourcePath.replace(
                "{DashboardId}",
                (createDashboardRequest.getDashboardId() == null) ? "" : StringUtils
                        .fromString(createDashboardRequest.getDashboardId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createDashboardRequest.getName() != null) {
                String name = createDashboardRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (createDashboardRequest.getParameters() != null) {
                Parameters parameters = createDashboardRequest.getParameters();
                jsonWriter.name("Parameters");
                ParametersJsonMarshaller.getInstance().marshall(parameters, jsonWriter);
            }
            if (createDashboardRequest.getPermissions() != null) {
                java.util.List<ResourcePermission> permissions = createDashboardRequest
                        .getPermissions();
                jsonWriter.name("Permissions");
                jsonWriter.beginArray();
                for (ResourcePermission permissionsItem : permissions) {
                    if (permissionsItem != null) {
                        ResourcePermissionJsonMarshaller.getInstance().marshall(permissionsItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createDashboardRequest.getSourceEntity() != null) {
                DashboardSourceEntity sourceEntity = createDashboardRequest.getSourceEntity();
                jsonWriter.name("SourceEntity");
                DashboardSourceEntityJsonMarshaller.getInstance()
                        .marshall(sourceEntity, jsonWriter);
            }
            if (createDashboardRequest.getTags() != null) {
                java.util.List<Tag> tags = createDashboardRequest.getTags();
                jsonWriter.name("Tags");
                jsonWriter.beginArray();
                for (Tag tagsItem : tags) {
                    if (tagsItem != null) {
                        TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createDashboardRequest.getVersionDescription() != null) {
                String versionDescription = createDashboardRequest.getVersionDescription();
                jsonWriter.name("VersionDescription");
                jsonWriter.value(versionDescription);
            }
            if (createDashboardRequest.getDashboardPublishOptions() != null) {
                DashboardPublishOptions dashboardPublishOptions = createDashboardRequest
                        .getDashboardPublishOptions();
                jsonWriter.name("DashboardPublishOptions");
                DashboardPublishOptionsJsonMarshaller.getInstance().marshall(
                        dashboardPublishOptions, jsonWriter);
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
