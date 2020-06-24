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

package com.amazonaws.services.codecommit.model.transform;

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
import com.amazonaws.services.codecommit.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for GetDifferencesRequest
 */
public class GetDifferencesRequestMarshaller implements
        Marshaller<Request<GetDifferencesRequest>, GetDifferencesRequest> {

    public Request<GetDifferencesRequest> marshall(GetDifferencesRequest getDifferencesRequest) {
        if (getDifferencesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetDifferencesRequest)");
        }

        Request<GetDifferencesRequest> request = new DefaultRequest<GetDifferencesRequest>(
                getDifferencesRequest, "AWSCodeCommit");
        String target = "CodeCommit_20150413.GetDifferences";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (getDifferencesRequest.getRepositoryName() != null) {
                String repositoryName = getDifferencesRequest.getRepositoryName();
                jsonWriter.name("repositoryName");
                jsonWriter.value(repositoryName);
            }
            if (getDifferencesRequest.getBeforeCommitSpecifier() != null) {
                String beforeCommitSpecifier = getDifferencesRequest.getBeforeCommitSpecifier();
                jsonWriter.name("beforeCommitSpecifier");
                jsonWriter.value(beforeCommitSpecifier);
            }
            if (getDifferencesRequest.getAfterCommitSpecifier() != null) {
                String afterCommitSpecifier = getDifferencesRequest.getAfterCommitSpecifier();
                jsonWriter.name("afterCommitSpecifier");
                jsonWriter.value(afterCommitSpecifier);
            }
            if (getDifferencesRequest.getBeforePath() != null) {
                String beforePath = getDifferencesRequest.getBeforePath();
                jsonWriter.name("beforePath");
                jsonWriter.value(beforePath);
            }
            if (getDifferencesRequest.getAfterPath() != null) {
                String afterPath = getDifferencesRequest.getAfterPath();
                jsonWriter.name("afterPath");
                jsonWriter.value(afterPath);
            }
            if (getDifferencesRequest.getMaxResults() != null) {
                Integer maxResults = getDifferencesRequest.getMaxResults();
                jsonWriter.name("MaxResults");
                jsonWriter.value(maxResults);
            }
            if (getDifferencesRequest.getNextToken() != null) {
                String nextToken = getDifferencesRequest.getNextToken();
                jsonWriter.name("NextToken");
                jsonWriter.value(nextToken);
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
