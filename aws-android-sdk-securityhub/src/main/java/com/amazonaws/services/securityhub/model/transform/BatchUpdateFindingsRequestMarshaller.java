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

package com.amazonaws.services.securityhub.model.transform;

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
import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for BatchUpdateFindingsRequest
 */
public class BatchUpdateFindingsRequestMarshaller implements
        Marshaller<Request<BatchUpdateFindingsRequest>, BatchUpdateFindingsRequest> {

    public Request<BatchUpdateFindingsRequest> marshall(
            BatchUpdateFindingsRequest batchUpdateFindingsRequest) {
        if (batchUpdateFindingsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(BatchUpdateFindingsRequest)");
        }

        Request<BatchUpdateFindingsRequest> request = new DefaultRequest<BatchUpdateFindingsRequest>(
                batchUpdateFindingsRequest, "AWSSecurityHub");
        request.setHttpMethod(HttpMethodName.PATCH);

        String uriResourcePath = "/findings/batchupdate";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (batchUpdateFindingsRequest.getFindingIdentifiers() != null) {
                java.util.List<AwsSecurityFindingIdentifier> findingIdentifiers = batchUpdateFindingsRequest
                        .getFindingIdentifiers();
                jsonWriter.name("FindingIdentifiers");
                jsonWriter.beginArray();
                for (AwsSecurityFindingIdentifier findingIdentifiersItem : findingIdentifiers) {
                    if (findingIdentifiersItem != null) {
                        AwsSecurityFindingIdentifierJsonMarshaller.getInstance().marshall(
                                findingIdentifiersItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (batchUpdateFindingsRequest.getNote() != null) {
                NoteUpdate note = batchUpdateFindingsRequest.getNote();
                jsonWriter.name("Note");
                NoteUpdateJsonMarshaller.getInstance().marshall(note, jsonWriter);
            }
            if (batchUpdateFindingsRequest.getSeverity() != null) {
                SeverityUpdate severity = batchUpdateFindingsRequest.getSeverity();
                jsonWriter.name("Severity");
                SeverityUpdateJsonMarshaller.getInstance().marshall(severity, jsonWriter);
            }
            if (batchUpdateFindingsRequest.getVerificationState() != null) {
                String verificationState = batchUpdateFindingsRequest.getVerificationState();
                jsonWriter.name("VerificationState");
                jsonWriter.value(verificationState);
            }
            if (batchUpdateFindingsRequest.getConfidence() != null) {
                Integer confidence = batchUpdateFindingsRequest.getConfidence();
                jsonWriter.name("Confidence");
                jsonWriter.value(confidence);
            }
            if (batchUpdateFindingsRequest.getCriticality() != null) {
                Integer criticality = batchUpdateFindingsRequest.getCriticality();
                jsonWriter.name("Criticality");
                jsonWriter.value(criticality);
            }
            if (batchUpdateFindingsRequest.getTypes() != null) {
                java.util.List<String> types = batchUpdateFindingsRequest.getTypes();
                jsonWriter.name("Types");
                jsonWriter.beginArray();
                for (String typesItem : types) {
                    if (typesItem != null) {
                        jsonWriter.value(typesItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (batchUpdateFindingsRequest.getUserDefinedFields() != null) {
                java.util.Map<String, String> userDefinedFields = batchUpdateFindingsRequest
                        .getUserDefinedFields();
                jsonWriter.name("UserDefinedFields");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> userDefinedFieldsEntry : userDefinedFields
                        .entrySet()) {
                    String userDefinedFieldsValue = userDefinedFieldsEntry.getValue();
                    if (userDefinedFieldsValue != null) {
                        jsonWriter.name(userDefinedFieldsEntry.getKey());
                        jsonWriter.value(userDefinedFieldsValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (batchUpdateFindingsRequest.getWorkflow() != null) {
                WorkflowUpdate workflow = batchUpdateFindingsRequest.getWorkflow();
                jsonWriter.name("Workflow");
                WorkflowUpdateJsonMarshaller.getInstance().marshall(workflow, jsonWriter);
            }
            if (batchUpdateFindingsRequest.getRelatedFindings() != null) {
                java.util.List<RelatedFinding> relatedFindings = batchUpdateFindingsRequest
                        .getRelatedFindings();
                jsonWriter.name("RelatedFindings");
                jsonWriter.beginArray();
                for (RelatedFinding relatedFindingsItem : relatedFindings) {
                    if (relatedFindingsItem != null) {
                        RelatedFindingJsonMarshaller.getInstance().marshall(relatedFindingsItem,
                                jsonWriter);
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
