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
 * JSON request marshaller for UpdateDashboardRequest
 */
public class UpdateDashboardRequestMarshaller implements
        Marshaller<Request<UpdateDashboardRequest>, UpdateDashboardRequest> {

    public Request<UpdateDashboardRequest> marshall(UpdateDashboardRequest updateDashboardRequest) {
        if (updateDashboardRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateDashboardRequest)");
        }

        Request<UpdateDashboardRequest> request = new DefaultRequest<UpdateDashboardRequest>(
                updateDashboardRequest, "AmazonQuickSight");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/accounts/{AwsAccountId}/dashboards/{DashboardId}";
        uriResourcePath = uriResourcePath.replace(
                "{AwsAccountId}",
                (updateDashboardRequest.getAwsAccountId() == null) ? "" : StringUtils
                        .fromString(updateDashboardRequest.getAwsAccountId()));
        uriResourcePath = uriResourcePath.replace(
                "{DashboardId}",
                (updateDashboardRequest.getDashboardId() == null) ? "" : StringUtils
                        .fromString(updateDashboardRequest.getDashboardId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateDashboardRequest.getName() != null) {
                String name = updateDashboardRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (updateDashboardRequest.getSourceEntity() != null) {
                DashboardSourceEntity sourceEntity = updateDashboardRequest.getSourceEntity();
                jsonWriter.name("SourceEntity");
                DashboardSourceEntityJsonMarshaller.getInstance()
                        .marshall(sourceEntity, jsonWriter);
            }
            if (updateDashboardRequest.getParameters() != null) {
                Parameters parameters = updateDashboardRequest.getParameters();
                jsonWriter.name("Parameters");
                ParametersJsonMarshaller.getInstance().marshall(parameters, jsonWriter);
            }
            if (updateDashboardRequest.getVersionDescription() != null) {
                String versionDescription = updateDashboardRequest.getVersionDescription();
                jsonWriter.name("VersionDescription");
                jsonWriter.value(versionDescription);
            }
            if (updateDashboardRequest.getDashboardPublishOptions() != null) {
                DashboardPublishOptions dashboardPublishOptions = updateDashboardRequest
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
