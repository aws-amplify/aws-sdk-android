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
 * JSON request marshaller for UpdateIAMPolicyAssignmentRequest
 */
public class UpdateIAMPolicyAssignmentRequestMarshaller implements
        Marshaller<Request<UpdateIAMPolicyAssignmentRequest>, UpdateIAMPolicyAssignmentRequest> {

    public Request<UpdateIAMPolicyAssignmentRequest> marshall(
            UpdateIAMPolicyAssignmentRequest updateIAMPolicyAssignmentRequest) {
        if (updateIAMPolicyAssignmentRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateIAMPolicyAssignmentRequest)");
        }

        Request<UpdateIAMPolicyAssignmentRequest> request = new DefaultRequest<UpdateIAMPolicyAssignmentRequest>(
                updateIAMPolicyAssignmentRequest, "AmazonQuickSight");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/accounts/{AwsAccountId}/namespaces/{Namespace}/iam-policy-assignments/{AssignmentName}";
        uriResourcePath = uriResourcePath.replace(
                "{AwsAccountId}",
                (updateIAMPolicyAssignmentRequest.getAwsAccountId() == null) ? "" : StringUtils
                        .fromString(updateIAMPolicyAssignmentRequest.getAwsAccountId()));
        uriResourcePath = uriResourcePath.replace(
                "{AssignmentName}",
                (updateIAMPolicyAssignmentRequest.getAssignmentName() == null) ? "" : StringUtils
                        .fromString(updateIAMPolicyAssignmentRequest.getAssignmentName()));
        uriResourcePath = uriResourcePath.replace(
                "{Namespace}",
                (updateIAMPolicyAssignmentRequest.getNamespace() == null) ? "" : StringUtils
                        .fromString(updateIAMPolicyAssignmentRequest.getNamespace()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateIAMPolicyAssignmentRequest.getAssignmentStatus() != null) {
                String assignmentStatus = updateIAMPolicyAssignmentRequest.getAssignmentStatus();
                jsonWriter.name("AssignmentStatus");
                jsonWriter.value(assignmentStatus);
            }
            if (updateIAMPolicyAssignmentRequest.getPolicyArn() != null) {
                String policyArn = updateIAMPolicyAssignmentRequest.getPolicyArn();
                jsonWriter.name("PolicyArn");
                jsonWriter.value(policyArn);
            }
            if (updateIAMPolicyAssignmentRequest.getIdentities() != null) {
                java.util.Map<String, java.util.List<String>> identities = updateIAMPolicyAssignmentRequest
                        .getIdentities();
                jsonWriter.name("Identities");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, java.util.List<String>> identitiesEntry : identities
                        .entrySet()) {
                    java.util.List<String> identitiesValue = identitiesEntry.getValue();
                    if (identitiesValue != null) {
                        jsonWriter.name(identitiesEntry.getKey());
                        jsonWriter.beginArray();
                        for (String identitiesValueItem : identitiesValue) {
                            if (identitiesValueItem != null) {
                                jsonWriter.value(identitiesValueItem);
                            }
                        }
                        jsonWriter.endArray();
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
