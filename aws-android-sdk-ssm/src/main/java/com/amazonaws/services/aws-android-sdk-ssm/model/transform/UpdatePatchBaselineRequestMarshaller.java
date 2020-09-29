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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

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
import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;


/**
 * JSON request marshaller for UpdatePatchBaselineRequest
 */
public class UpdatePatchBaselineRequestMarshaller implements Marshaller<Request<UpdatePatchBaselineRequest>, UpdatePatchBaselineRequest> {

    public Request<UpdatePatchBaselineRequest> marshall(UpdatePatchBaselineRequest updatePatchBaselineRequest) {
        if (updatePatchBaselineRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(UpdatePatchBaselineRequest)");
        }

        Request<UpdatePatchBaselineRequest> request = new DefaultRequest<UpdatePatchBaselineRequest>(updatePatchBaselineRequest, "AmazonSimpleSystemsManager(SSM)");
        String target = "AmazonSSM.UpdatePatchBaseline";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updatePatchBaselineRequest.getBaselineId() != null) {
                String baselineId = updatePatchBaselineRequest.getBaselineId();
                jsonWriter.name("BaselineId");
            jsonWriter.value(baselineId);
            }
            if (updatePatchBaselineRequest.getName() != null) {
                String name = updatePatchBaselineRequest.getName();
                jsonWriter.name("Name");
            jsonWriter.value(name);
            }
            if (updatePatchBaselineRequest.getGlobalFilters() != null) {
                PatchFilterGroup globalFilters = updatePatchBaselineRequest.getGlobalFilters();
                jsonWriter.name("GlobalFilters");
            PatchFilterGroupJsonMarshaller.getInstance().marshall(globalFilters, jsonWriter);
            }
            if (updatePatchBaselineRequest.getApprovalRules() != null) {
                PatchRuleGroup approvalRules = updatePatchBaselineRequest.getApprovalRules();
                jsonWriter.name("ApprovalRules");
            PatchRuleGroupJsonMarshaller.getInstance().marshall(approvalRules, jsonWriter);
            }
            if (updatePatchBaselineRequest.getApprovedPatches() != null) {
                java.util.List<String> approvedPatches = updatePatchBaselineRequest.getApprovedPatches();
                jsonWriter.name("ApprovedPatches");
            jsonWriter.beginArray();
            for (String approvedPatchesItem : approvedPatches) {
                if (approvedPatchesItem != null) {
            jsonWriter.value(approvedPatchesItem);
                    }
            }
            jsonWriter.endArray();
            }
            if (updatePatchBaselineRequest.getApprovedPatchesComplianceLevel() != null) {
                String approvedPatchesComplianceLevel = updatePatchBaselineRequest.getApprovedPatchesComplianceLevel();
                jsonWriter.name("ApprovedPatchesComplianceLevel");
            jsonWriter.value(approvedPatchesComplianceLevel);
            }
            if (updatePatchBaselineRequest.getApprovedPatchesEnableNonSecurity() != null) {
                Boolean approvedPatchesEnableNonSecurity = updatePatchBaselineRequest.getApprovedPatchesEnableNonSecurity();
                jsonWriter.name("ApprovedPatchesEnableNonSecurity");
            jsonWriter.value(approvedPatchesEnableNonSecurity);
            }
            if (updatePatchBaselineRequest.getRejectedPatches() != null) {
                java.util.List<String> rejectedPatches = updatePatchBaselineRequest.getRejectedPatches();
                jsonWriter.name("RejectedPatches");
            jsonWriter.beginArray();
            for (String rejectedPatchesItem : rejectedPatches) {
                if (rejectedPatchesItem != null) {
            jsonWriter.value(rejectedPatchesItem);
                    }
            }
            jsonWriter.endArray();
            }
            if (updatePatchBaselineRequest.getRejectedPatchesAction() != null) {
                String rejectedPatchesAction = updatePatchBaselineRequest.getRejectedPatchesAction();
                jsonWriter.name("RejectedPatchesAction");
            jsonWriter.value(rejectedPatchesAction);
            }
            if (updatePatchBaselineRequest.getDescription() != null) {
                String description = updatePatchBaselineRequest.getDescription();
                jsonWriter.name("Description");
            jsonWriter.value(description);
            }
            if (updatePatchBaselineRequest.getSources() != null) {
                java.util.List<PatchSource> sources = updatePatchBaselineRequest.getSources();
                jsonWriter.name("Sources");
            jsonWriter.beginArray();
            for (PatchSource sourcesItem : sources) {
                if (sourcesItem != null) {
            PatchSourceJsonMarshaller.getInstance().marshall(sourcesItem, jsonWriter);
                    }
            }
            jsonWriter.endArray();
            }
            if (updatePatchBaselineRequest.getReplace() != null) {
                Boolean replace = updatePatchBaselineRequest.getReplace();
                jsonWriter.name("Replace");
            jsonWriter.value(replace);
            }

            jsonWriter.endObject();
            jsonWriter.close();
            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length", Integer.toString(content.length));
        } catch(Throwable t) {
            throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
