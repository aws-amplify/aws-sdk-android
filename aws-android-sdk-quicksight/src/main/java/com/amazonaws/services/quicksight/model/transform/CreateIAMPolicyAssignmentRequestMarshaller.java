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
 * JSON request marshaller for CreateIAMPolicyAssignmentRequest
 */
public class CreateIAMPolicyAssignmentRequestMarshaller implements
        Marshaller<Request<CreateIAMPolicyAssignmentRequest>, CreateIAMPolicyAssignmentRequest> {

    public Request<CreateIAMPolicyAssignmentRequest> marshall(
            CreateIAMPolicyAssignmentRequest createIAMPolicyAssignmentRequest) {
        if (createIAMPolicyAssignmentRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateIAMPolicyAssignmentRequest)");
        }

        Request<CreateIAMPolicyAssignmentRequest> request = new DefaultRequest<CreateIAMPolicyAssignmentRequest>(
                createIAMPolicyAssignmentRequest, "AmazonQuickSight");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/accounts/{AwsAccountId}/namespaces/{Namespace}/iam-policy-assignments/";
        uriResourcePath = uriResourcePath.replace(
                "{AwsAccountId}",
                (createIAMPolicyAssignmentRequest.getAwsAccountId() == null) ? "" : StringUtils
                        .fromString(createIAMPolicyAssignmentRequest.getAwsAccountId()));
        uriResourcePath = uriResourcePath.replace(
                "{Namespace}",
                (createIAMPolicyAssignmentRequest.getNamespace() == null) ? "" : StringUtils
                        .fromString(createIAMPolicyAssignmentRequest.getNamespace()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createIAMPolicyAssignmentRequest.getAssignmentName() != null) {
                String assignmentName = createIAMPolicyAssignmentRequest.getAssignmentName();
                jsonWriter.name("AssignmentName");
                jsonWriter.value(assignmentName);
            }
            if (createIAMPolicyAssignmentRequest.getAssignmentStatus() != null) {
                String assignmentStatus = createIAMPolicyAssignmentRequest.getAssignmentStatus();
                jsonWriter.name("AssignmentStatus");
                jsonWriter.value(assignmentStatus);
            }
            if (createIAMPolicyAssignmentRequest.getPolicyArn() != null) {
                String policyArn = createIAMPolicyAssignmentRequest.getPolicyArn();
                jsonWriter.name("PolicyArn");
                jsonWriter.value(policyArn);
            }
            if (createIAMPolicyAssignmentRequest.getIdentities() != null) {
                java.util.Map<String, java.util.List<String>> identities = createIAMPolicyAssignmentRequest
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
