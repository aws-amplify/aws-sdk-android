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
 * JSON request marshaller for CreatePatchBaselineRequest
 */
public class CreatePatchBaselineRequestMarshaller implements
        Marshaller<Request<CreatePatchBaselineRequest>, CreatePatchBaselineRequest> {

    public Request<CreatePatchBaselineRequest> marshall(
            CreatePatchBaselineRequest createPatchBaselineRequest) {
        if (createPatchBaselineRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreatePatchBaselineRequest)");
        }

        Request<CreatePatchBaselineRequest> request = new DefaultRequest<CreatePatchBaselineRequest>(
                createPatchBaselineRequest, "AmazonSSM");
        String target = "AmazonSSM.CreatePatchBaseline";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createPatchBaselineRequest.getOperatingSystem() != null) {
                String operatingSystem = createPatchBaselineRequest.getOperatingSystem();
                jsonWriter.name("OperatingSystem");
                jsonWriter.value(operatingSystem);
            }
            if (createPatchBaselineRequest.getName() != null) {
                String name = createPatchBaselineRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (createPatchBaselineRequest.getGlobalFilters() != null) {
                PatchFilterGroup globalFilters = createPatchBaselineRequest.getGlobalFilters();
                jsonWriter.name("GlobalFilters");
                PatchFilterGroupJsonMarshaller.getInstance().marshall(globalFilters, jsonWriter);
            }
            if (createPatchBaselineRequest.getApprovalRules() != null) {
                PatchRuleGroup approvalRules = createPatchBaselineRequest.getApprovalRules();
                jsonWriter.name("ApprovalRules");
                PatchRuleGroupJsonMarshaller.getInstance().marshall(approvalRules, jsonWriter);
            }
            if (createPatchBaselineRequest.getApprovedPatches() != null) {
                java.util.List<String> approvedPatches = createPatchBaselineRequest
                        .getApprovedPatches();
                jsonWriter.name("ApprovedPatches");
                jsonWriter.beginArray();
                for (String approvedPatchesItem : approvedPatches) {
                    if (approvedPatchesItem != null) {
                        jsonWriter.value(approvedPatchesItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createPatchBaselineRequest.getApprovedPatchesComplianceLevel() != null) {
                String approvedPatchesComplianceLevel = createPatchBaselineRequest
                        .getApprovedPatchesComplianceLevel();
                jsonWriter.name("ApprovedPatchesComplianceLevel");
                jsonWriter.value(approvedPatchesComplianceLevel);
            }
            if (createPatchBaselineRequest.getApprovedPatchesEnableNonSecurity() != null) {
                Boolean approvedPatchesEnableNonSecurity = createPatchBaselineRequest
                        .getApprovedPatchesEnableNonSecurity();
                jsonWriter.name("ApprovedPatchesEnableNonSecurity");
                jsonWriter.value(approvedPatchesEnableNonSecurity);
            }
            if (createPatchBaselineRequest.getRejectedPatches() != null) {
                java.util.List<String> rejectedPatches = createPatchBaselineRequest
                        .getRejectedPatches();
                jsonWriter.name("RejectedPatches");
                jsonWriter.beginArray();
                for (String rejectedPatchesItem : rejectedPatches) {
                    if (rejectedPatchesItem != null) {
                        jsonWriter.value(rejectedPatchesItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createPatchBaselineRequest.getRejectedPatchesAction() != null) {
                String rejectedPatchesAction = createPatchBaselineRequest
                        .getRejectedPatchesAction();
                jsonWriter.name("RejectedPatchesAction");
                jsonWriter.value(rejectedPatchesAction);
            }
            if (createPatchBaselineRequest.getDescription() != null) {
                String description = createPatchBaselineRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (createPatchBaselineRequest.getSources() != null) {
                java.util.List<PatchSource> sources = createPatchBaselineRequest.getSources();
                jsonWriter.name("Sources");
                jsonWriter.beginArray();
                for (PatchSource sourcesItem : sources) {
                    if (sourcesItem != null) {
                        PatchSourceJsonMarshaller.getInstance().marshall(sourcesItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createPatchBaselineRequest.getClientToken() != null) {
                String clientToken = createPatchBaselineRequest.getClientToken();
                jsonWriter.name("ClientToken");
                jsonWriter.value(clientToken);
            }
            if (createPatchBaselineRequest.getTags() != null) {
                java.util.List<Tag> tags = createPatchBaselineRequest.getTags();
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
