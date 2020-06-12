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

package com.amazonaws.services.apigateway.model.transform;

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
import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateUsagePlanRequest
 */
public class CreateUsagePlanRequestMarshaller implements
        Marshaller<Request<CreateUsagePlanRequest>, CreateUsagePlanRequest> {

    public Request<CreateUsagePlanRequest> marshall(CreateUsagePlanRequest createUsagePlanRequest) {
        if (createUsagePlanRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateUsagePlanRequest)");
        }

        Request<CreateUsagePlanRequest> request = new DefaultRequest<CreateUsagePlanRequest>(
                createUsagePlanRequest, "AmazonAPIGateway");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/usageplans";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createUsagePlanRequest.getName() != null) {
                String name = createUsagePlanRequest.getName();
                jsonWriter.name("name");
                jsonWriter.value(name);
            }
            if (createUsagePlanRequest.getDescription() != null) {
                String description = createUsagePlanRequest.getDescription();
                jsonWriter.name("description");
                jsonWriter.value(description);
            }
            if (createUsagePlanRequest.getApiStages() != null) {
                java.util.List<ApiStage> apiStages = createUsagePlanRequest.getApiStages();
                jsonWriter.name("apiStages");
                jsonWriter.beginArray();
                for (ApiStage apiStagesItem : apiStages) {
                    if (apiStagesItem != null) {
                        ApiStageJsonMarshaller.getInstance().marshall(apiStagesItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createUsagePlanRequest.getThrottle() != null) {
                ThrottleSettings throttle = createUsagePlanRequest.getThrottle();
                jsonWriter.name("throttle");
                ThrottleSettingsJsonMarshaller.getInstance().marshall(throttle, jsonWriter);
            }
            if (createUsagePlanRequest.getQuota() != null) {
                QuotaSettings quota = createUsagePlanRequest.getQuota();
                jsonWriter.name("quota");
                QuotaSettingsJsonMarshaller.getInstance().marshall(quota, jsonWriter);
            }
            if (createUsagePlanRequest.getTags() != null) {
                java.util.Map<String, String> tags = createUsagePlanRequest.getTags();
                jsonWriter.name("tags");
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
