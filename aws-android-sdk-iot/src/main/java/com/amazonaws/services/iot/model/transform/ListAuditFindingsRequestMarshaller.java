/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

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
import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for ListAuditFindingsRequest
 */
public class ListAuditFindingsRequestMarshaller implements
        Marshaller<Request<ListAuditFindingsRequest>, ListAuditFindingsRequest> {

    public Request<ListAuditFindingsRequest> marshall(
            ListAuditFindingsRequest listAuditFindingsRequest) {
        if (listAuditFindingsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListAuditFindingsRequest)");
        }

        Request<ListAuditFindingsRequest> request = new DefaultRequest<ListAuditFindingsRequest>(
                listAuditFindingsRequest, "AWSIot");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/audit/findings";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (listAuditFindingsRequest.getTaskId() != null) {
                String taskId = listAuditFindingsRequest.getTaskId();
                jsonWriter.name("taskId");
                jsonWriter.value(taskId);
            }
            if (listAuditFindingsRequest.getCheckName() != null) {
                String checkName = listAuditFindingsRequest.getCheckName();
                jsonWriter.name("checkName");
                jsonWriter.value(checkName);
            }
            if (listAuditFindingsRequest.getResourceIdentifier() != null) {
                ResourceIdentifier resourceIdentifier = listAuditFindingsRequest
                        .getResourceIdentifier();
                jsonWriter.name("resourceIdentifier");
                ResourceIdentifierJsonMarshaller.getInstance().marshall(resourceIdentifier,
                        jsonWriter);
            }
            if (listAuditFindingsRequest.getMaxResults() != null) {
                Integer maxResults = listAuditFindingsRequest.getMaxResults();
                jsonWriter.name("maxResults");
                jsonWriter.value(maxResults);
            }
            if (listAuditFindingsRequest.getNextToken() != null) {
                String nextToken = listAuditFindingsRequest.getNextToken();
                jsonWriter.name("nextToken");
                jsonWriter.value(nextToken);
            }
            if (listAuditFindingsRequest.getStartTime() != null) {
                java.util.Date startTime = listAuditFindingsRequest.getStartTime();
                jsonWriter.name("startTime");
                jsonWriter.value(startTime);
            }
            if (listAuditFindingsRequest.getEndTime() != null) {
                java.util.Date endTime = listAuditFindingsRequest.getEndTime();
                jsonWriter.name("endTime");
                jsonWriter.value(endTime);
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
