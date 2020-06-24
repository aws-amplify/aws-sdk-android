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
 * JSON request marshaller for GetMergeConflictsRequest
 */
public class GetMergeConflictsRequestMarshaller implements
        Marshaller<Request<GetMergeConflictsRequest>, GetMergeConflictsRequest> {

    public Request<GetMergeConflictsRequest> marshall(
            GetMergeConflictsRequest getMergeConflictsRequest) {
        if (getMergeConflictsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetMergeConflictsRequest)");
        }

        Request<GetMergeConflictsRequest> request = new DefaultRequest<GetMergeConflictsRequest>(
                getMergeConflictsRequest, "AWSCodeCommit");
        String target = "CodeCommit_20150413.GetMergeConflicts";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (getMergeConflictsRequest.getRepositoryName() != null) {
                String repositoryName = getMergeConflictsRequest.getRepositoryName();
                jsonWriter.name("repositoryName");
                jsonWriter.value(repositoryName);
            }
            if (getMergeConflictsRequest.getDestinationCommitSpecifier() != null) {
                String destinationCommitSpecifier = getMergeConflictsRequest
                        .getDestinationCommitSpecifier();
                jsonWriter.name("destinationCommitSpecifier");
                jsonWriter.value(destinationCommitSpecifier);
            }
            if (getMergeConflictsRequest.getSourceCommitSpecifier() != null) {
                String sourceCommitSpecifier = getMergeConflictsRequest.getSourceCommitSpecifier();
                jsonWriter.name("sourceCommitSpecifier");
                jsonWriter.value(sourceCommitSpecifier);
            }
            if (getMergeConflictsRequest.getMergeOption() != null) {
                String mergeOption = getMergeConflictsRequest.getMergeOption();
                jsonWriter.name("mergeOption");
                jsonWriter.value(mergeOption);
            }
            if (getMergeConflictsRequest.getConflictDetailLevel() != null) {
                String conflictDetailLevel = getMergeConflictsRequest.getConflictDetailLevel();
                jsonWriter.name("conflictDetailLevel");
                jsonWriter.value(conflictDetailLevel);
            }
            if (getMergeConflictsRequest.getMaxConflictFiles() != null) {
                Integer maxConflictFiles = getMergeConflictsRequest.getMaxConflictFiles();
                jsonWriter.name("maxConflictFiles");
                jsonWriter.value(maxConflictFiles);
            }
            if (getMergeConflictsRequest.getConflictResolutionStrategy() != null) {
                String conflictResolutionStrategy = getMergeConflictsRequest
                        .getConflictResolutionStrategy();
                jsonWriter.name("conflictResolutionStrategy");
                jsonWriter.value(conflictResolutionStrategy);
            }
            if (getMergeConflictsRequest.getNextToken() != null) {
                String nextToken = getMergeConflictsRequest.getNextToken();
                jsonWriter.name("nextToken");
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
