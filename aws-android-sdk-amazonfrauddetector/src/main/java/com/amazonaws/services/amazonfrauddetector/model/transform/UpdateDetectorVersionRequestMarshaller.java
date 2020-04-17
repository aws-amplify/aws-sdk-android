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

package com.amazonaws.services.amazonfrauddetector.model.transform;

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
import com.amazonaws.services.amazonfrauddetector.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for UpdateDetectorVersionRequest
 */
public class UpdateDetectorVersionRequestMarshaller implements
        Marshaller<Request<UpdateDetectorVersionRequest>, UpdateDetectorVersionRequest> {

    public Request<UpdateDetectorVersionRequest> marshall(
            UpdateDetectorVersionRequest updateDetectorVersionRequest) {
        if (updateDetectorVersionRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateDetectorVersionRequest)");
        }

        Request<UpdateDetectorVersionRequest> request = new DefaultRequest<UpdateDetectorVersionRequest>(
                updateDetectorVersionRequest, "AmazonFraudDetector");
        String target = "AWSHawksNestServiceFacade.UpdateDetectorVersion";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateDetectorVersionRequest.getDetectorId() != null) {
                String detectorId = updateDetectorVersionRequest.getDetectorId();
                jsonWriter.name("detectorId");
                jsonWriter.value(detectorId);
            }
            if (updateDetectorVersionRequest.getDetectorVersionId() != null) {
                String detectorVersionId = updateDetectorVersionRequest.getDetectorVersionId();
                jsonWriter.name("detectorVersionId");
                jsonWriter.value(detectorVersionId);
            }
            if (updateDetectorVersionRequest.getExternalModelEndpoints() != null) {
                java.util.List<String> externalModelEndpoints = updateDetectorVersionRequest
                        .getExternalModelEndpoints();
                jsonWriter.name("externalModelEndpoints");
                jsonWriter.beginArray();
                for (String externalModelEndpointsItem : externalModelEndpoints) {
                    if (externalModelEndpointsItem != null) {
                        jsonWriter.value(externalModelEndpointsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateDetectorVersionRequest.getRules() != null) {
                java.util.List<Rule> rules = updateDetectorVersionRequest.getRules();
                jsonWriter.name("rules");
                jsonWriter.beginArray();
                for (Rule rulesItem : rules) {
                    if (rulesItem != null) {
                        RuleJsonMarshaller.getInstance().marshall(rulesItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateDetectorVersionRequest.getDescription() != null) {
                String description = updateDetectorVersionRequest.getDescription();
                jsonWriter.name("description");
                jsonWriter.value(description);
            }
            if (updateDetectorVersionRequest.getModelVersions() != null) {
                java.util.List<ModelVersion> modelVersions = updateDetectorVersionRequest
                        .getModelVersions();
                jsonWriter.name("modelVersions");
                jsonWriter.beginArray();
                for (ModelVersion modelVersionsItem : modelVersions) {
                    if (modelVersionsItem != null) {
                        ModelVersionJsonMarshaller.getInstance().marshall(modelVersionsItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateDetectorVersionRequest.getRuleExecutionMode() != null) {
                String ruleExecutionMode = updateDetectorVersionRequest.getRuleExecutionMode();
                jsonWriter.name("ruleExecutionMode");
                jsonWriter.value(ruleExecutionMode);
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
