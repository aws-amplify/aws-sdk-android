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
 * JSON request marshaller for CreateAssociationRequest
 */
public class CreateAssociationRequestMarshaller implements
        Marshaller<Request<CreateAssociationRequest>, CreateAssociationRequest> {

    public Request<CreateAssociationRequest> marshall(
            CreateAssociationRequest createAssociationRequest) {
        if (createAssociationRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateAssociationRequest)");
        }

        Request<CreateAssociationRequest> request = new DefaultRequest<CreateAssociationRequest>(
                createAssociationRequest, "AmazonSimpleSystemsManager(SSM)");
        String target = "AmazonSSM.CreateAssociation";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createAssociationRequest.getName() != null) {
                String name = createAssociationRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (createAssociationRequest.getDocumentVersion() != null) {
                String documentVersion = createAssociationRequest.getDocumentVersion();
                jsonWriter.name("DocumentVersion");
                jsonWriter.value(documentVersion);
            }
            if (createAssociationRequest.getInstanceId() != null) {
                String instanceId = createAssociationRequest.getInstanceId();
                jsonWriter.name("InstanceId");
                jsonWriter.value(instanceId);
            }
            if (createAssociationRequest.getParameters() != null) {
                java.util.Map<String, java.util.List<String>> parameters = createAssociationRequest
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
            if (createAssociationRequest.getTargets() != null) {
                java.util.List<Target> targets = createAssociationRequest.getTargets();
                jsonWriter.name("Targets");
                jsonWriter.beginArray();
                for (Target targetsItem : targets) {
                    if (targetsItem != null) {
                        TargetJsonMarshaller.getInstance().marshall(targetsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createAssociationRequest.getScheduleExpression() != null) {
                String scheduleExpression = createAssociationRequest.getScheduleExpression();
                jsonWriter.name("ScheduleExpression");
                jsonWriter.value(scheduleExpression);
            }
            if (createAssociationRequest.getOutputLocation() != null) {
                InstanceAssociationOutputLocation outputLocation = createAssociationRequest
                        .getOutputLocation();
                jsonWriter.name("OutputLocation");
                InstanceAssociationOutputLocationJsonMarshaller.getInstance().marshall(
                        outputLocation, jsonWriter);
            }
            if (createAssociationRequest.getAssociationName() != null) {
                String associationName = createAssociationRequest.getAssociationName();
                jsonWriter.name("AssociationName");
                jsonWriter.value(associationName);
            }
            if (createAssociationRequest.getAutomationTargetParameterName() != null) {
                String automationTargetParameterName = createAssociationRequest
                        .getAutomationTargetParameterName();
                jsonWriter.name("AutomationTargetParameterName");
                jsonWriter.value(automationTargetParameterName);
            }
            if (createAssociationRequest.getMaxErrors() != null) {
                String maxErrors = createAssociationRequest.getMaxErrors();
                jsonWriter.name("MaxErrors");
                jsonWriter.value(maxErrors);
            }
            if (createAssociationRequest.getMaxConcurrency() != null) {
                String maxConcurrency = createAssociationRequest.getMaxConcurrency();
                jsonWriter.name("MaxConcurrency");
                jsonWriter.value(maxConcurrency);
            }
            if (createAssociationRequest.getComplianceSeverity() != null) {
                String complianceSeverity = createAssociationRequest.getComplianceSeverity();
                jsonWriter.name("ComplianceSeverity");
                jsonWriter.value(complianceSeverity);
            }
            if (createAssociationRequest.getSyncCompliance() != null) {
                String syncCompliance = createAssociationRequest.getSyncCompliance();
                jsonWriter.name("SyncCompliance");
                jsonWriter.value(syncCompliance);
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
