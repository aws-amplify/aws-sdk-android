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

package com.amazonaws.services.ssm.model.transform;

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
import com.amazonaws.services.ssm.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for UpdateAssociationRequest
 */
public class UpdateAssociationRequestMarshaller implements
        Marshaller<Request<UpdateAssociationRequest>, UpdateAssociationRequest> {

    public Request<UpdateAssociationRequest> marshall(
            UpdateAssociationRequest updateAssociationRequest) {
        if (updateAssociationRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateAssociationRequest)");
        }

        Request<UpdateAssociationRequest> request = new DefaultRequest<UpdateAssociationRequest>(
                updateAssociationRequest, "AmazonSSM");
        String target = "AmazonSSM.UpdateAssociation";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateAssociationRequest.getAssociationId() != null) {
                String associationId = updateAssociationRequest.getAssociationId();
                jsonWriter.name("AssociationId");
                jsonWriter.value(associationId);
            }
            if (updateAssociationRequest.getParameters() != null) {
                java.util.Map<String, java.util.List<String>> parameters = updateAssociationRequest
                        .getParameters();
                jsonWriter.name("Parameters");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, java.util.List<String>> parametersEntry : parameters
                        .entrySet()) {
                    java.util.List<String> parametersValue = parametersEntry.getValue();
                    if (parametersValue != null) {
                        jsonWriter.name(parametersEntry.getKey());
                        jsonWriter.beginArray();
                        for (String parametersValueItem : parametersValue) {
                            if (parametersValueItem != null) {
                                jsonWriter.value(parametersValueItem);
                            }
                        }
                        jsonWriter.endArray();
                    }
                }
                jsonWriter.endObject();
            }
            if (updateAssociationRequest.getDocumentVersion() != null) {
                String documentVersion = updateAssociationRequest.getDocumentVersion();
                jsonWriter.name("DocumentVersion");
                jsonWriter.value(documentVersion);
            }
            if (updateAssociationRequest.getScheduleExpression() != null) {
                String scheduleExpression = updateAssociationRequest.getScheduleExpression();
                jsonWriter.name("ScheduleExpression");
                jsonWriter.value(scheduleExpression);
            }
            if (updateAssociationRequest.getOutputLocation() != null) {
                InstanceAssociationOutputLocation outputLocation = updateAssociationRequest
                        .getOutputLocation();
                jsonWriter.name("OutputLocation");
                InstanceAssociationOutputLocationJsonMarshaller.getInstance().marshall(
                        outputLocation, jsonWriter);
            }
            if (updateAssociationRequest.getName() != null) {
                String name = updateAssociationRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (updateAssociationRequest.getTargets() != null) {
                java.util.List<Target> targets = updateAssociationRequest.getTargets();
                jsonWriter.name("Targets");
                jsonWriter.beginArray();
                for (Target targetsItem : targets) {
                    if (targetsItem != null) {
                        TargetJsonMarshaller.getInstance().marshall(targetsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateAssociationRequest.getAssociationName() != null) {
                String associationName = updateAssociationRequest.getAssociationName();
                jsonWriter.name("AssociationName");
                jsonWriter.value(associationName);
            }
            if (updateAssociationRequest.getAssociationVersion() != null) {
                String associationVersion = updateAssociationRequest.getAssociationVersion();
                jsonWriter.name("AssociationVersion");
                jsonWriter.value(associationVersion);
            }
            if (updateAssociationRequest.getAutomationTargetParameterName() != null) {
                String automationTargetParameterName = updateAssociationRequest
                        .getAutomationTargetParameterName();
                jsonWriter.name("AutomationTargetParameterName");
                jsonWriter.value(automationTargetParameterName);
            }
            if (updateAssociationRequest.getMaxErrors() != null) {
                String maxErrors = updateAssociationRequest.getMaxErrors();
                jsonWriter.name("MaxErrors");
                jsonWriter.value(maxErrors);
            }
            if (updateAssociationRequest.getMaxConcurrency() != null) {
                String maxConcurrency = updateAssociationRequest.getMaxConcurrency();
                jsonWriter.name("MaxConcurrency");
                jsonWriter.value(maxConcurrency);
            }
            if (updateAssociationRequest.getComplianceSeverity() != null) {
                String complianceSeverity = updateAssociationRequest.getComplianceSeverity();
                jsonWriter.name("ComplianceSeverity");
                jsonWriter.value(complianceSeverity);
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
