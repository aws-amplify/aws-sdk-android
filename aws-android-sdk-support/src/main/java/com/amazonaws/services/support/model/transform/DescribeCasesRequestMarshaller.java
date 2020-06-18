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

package com.amazonaws.services.support.model.transform;

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
import com.amazonaws.services.support.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for DescribeCasesRequest
 */
public class DescribeCasesRequestMarshaller implements
        Marshaller<Request<DescribeCasesRequest>, DescribeCasesRequest> {

    public Request<DescribeCasesRequest> marshall(DescribeCasesRequest describeCasesRequest) {
        if (describeCasesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeCasesRequest)");
        }

        Request<DescribeCasesRequest> request = new DefaultRequest<DescribeCasesRequest>(
                describeCasesRequest, "AWSSupport");
        String target = "AWSSupport_20130415.DescribeCases";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (describeCasesRequest.getCaseIdList() != null) {
                java.util.List<String> caseIdList = describeCasesRequest.getCaseIdList();
                jsonWriter.name("caseIdList");
                jsonWriter.beginArray();
                for (String caseIdListItem : caseIdList) {
                    if (caseIdListItem != null) {
                        jsonWriter.value(caseIdListItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (describeCasesRequest.getDisplayId() != null) {
                String displayId = describeCasesRequest.getDisplayId();
                jsonWriter.name("displayId");
                jsonWriter.value(displayId);
            }
            if (describeCasesRequest.getAfterTime() != null) {
                String afterTime = describeCasesRequest.getAfterTime();
                jsonWriter.name("afterTime");
                jsonWriter.value(afterTime);
            }
            if (describeCasesRequest.getBeforeTime() != null) {
                String beforeTime = describeCasesRequest.getBeforeTime();
                jsonWriter.name("beforeTime");
                jsonWriter.value(beforeTime);
            }
            if (describeCasesRequest.getIncludeResolvedCases() != null) {
                Boolean includeResolvedCases = describeCasesRequest.getIncludeResolvedCases();
                jsonWriter.name("includeResolvedCases");
                jsonWriter.value(includeResolvedCases);
            }
            if (describeCasesRequest.getNextToken() != null) {
                String nextToken = describeCasesRequest.getNextToken();
                jsonWriter.name("nextToken");
                jsonWriter.value(nextToken);
            }
            if (describeCasesRequest.getMaxResults() != null) {
                Integer maxResults = describeCasesRequest.getMaxResults();
                jsonWriter.name("maxResults");
                jsonWriter.value(maxResults);
            }
            if (describeCasesRequest.getLanguage() != null) {
                String language = describeCasesRequest.getLanguage();
                jsonWriter.name("language");
                jsonWriter.value(language);
            }
            if (describeCasesRequest.getIncludeCommunications() != null) {
                Boolean includeCommunications = describeCasesRequest.getIncludeCommunications();
                jsonWriter.name("includeCommunications");
                jsonWriter.value(includeCommunications);
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
