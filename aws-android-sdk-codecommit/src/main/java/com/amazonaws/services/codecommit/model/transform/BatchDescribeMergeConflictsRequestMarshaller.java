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
 * JSON request marshaller for BatchDescribeMergeConflictsRequest
 */
public class BatchDescribeMergeConflictsRequestMarshaller implements
        Marshaller<Request<BatchDescribeMergeConflictsRequest>, BatchDescribeMergeConflictsRequest> {

    public Request<BatchDescribeMergeConflictsRequest> marshall(
            BatchDescribeMergeConflictsRequest batchDescribeMergeConflictsRequest) {
        if (batchDescribeMergeConflictsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(BatchDescribeMergeConflictsRequest)");
        }

        Request<BatchDescribeMergeConflictsRequest> request = new DefaultRequest<BatchDescribeMergeConflictsRequest>(
                batchDescribeMergeConflictsRequest, "AWSCodeCommit");
        String target = "CodeCommit_20150413.BatchDescribeMergeConflicts";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (batchDescribeMergeConflictsRequest.getRepositoryName() != null) {
                String repositoryName = batchDescribeMergeConflictsRequest.getRepositoryName();
                jsonWriter.name("repositoryName");
                jsonWriter.value(repositoryName);
            }
            if (batchDescribeMergeConflictsRequest.getDestinationCommitSpecifier() != null) {
                String destinationCommitSpecifier = batchDescribeMergeConflictsRequest
                        .getDestinationCommitSpecifier();
                jsonWriter.name("destinationCommitSpecifier");
                jsonWriter.value(destinationCommitSpecifier);
            }
            if (batchDescribeMergeConflictsRequest.getSourceCommitSpecifier() != null) {
                String sourceCommitSpecifier = batchDescribeMergeConflictsRequest
                        .getSourceCommitSpecifier();
                jsonWriter.name("sourceCommitSpecifier");
                jsonWriter.value(sourceCommitSpecifier);
            }
            if (batchDescribeMergeConflictsRequest.getMergeOption() != null) {
                String mergeOption = batchDescribeMergeConflictsRequest.getMergeOption();
                jsonWriter.name("mergeOption");
                jsonWriter.value(mergeOption);
            }
            if (batchDescribeMergeConflictsRequest.getMaxMergeHunks() != null) {
                Integer maxMergeHunks = batchDescribeMergeConflictsRequest.getMaxMergeHunks();
                jsonWriter.name("maxMergeHunks");
                jsonWriter.value(maxMergeHunks);
            }
            if (batchDescribeMergeConflictsRequest.getMaxConflictFiles() != null) {
                Integer maxConflictFiles = batchDescribeMergeConflictsRequest.getMaxConflictFiles();
                jsonWriter.name("maxConflictFiles");
                jsonWriter.value(maxConflictFiles);
            }
            if (batchDescribeMergeConflictsRequest.getFilePaths() != null) {
                java.util.List<String> filePaths = batchDescribeMergeConflictsRequest
                        .getFilePaths();
                jsonWriter.name("filePaths");
                jsonWriter.beginArray();
                for (String filePathsItem : filePaths) {
                    if (filePathsItem != null) {
                        jsonWriter.value(filePathsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (batchDescribeMergeConflictsRequest.getConflictDetailLevel() != null) {
                String conflictDetailLevel = batchDescribeMergeConflictsRequest
                        .getConflictDetailLevel();
                jsonWriter.name("conflictDetailLevel");
                jsonWriter.value(conflictDetailLevel);
            }
            if (batchDescribeMergeConflictsRequest.getConflictResolutionStrategy() != null) {
                String conflictResolutionStrategy = batchDescribeMergeConflictsRequest
                        .getConflictResolutionStrategy();
                jsonWriter.name("conflictResolutionStrategy");
                jsonWriter.value(conflictResolutionStrategy);
            }
            if (batchDescribeMergeConflictsRequest.getNextToken() != null) {
                String nextToken = batchDescribeMergeConflictsRequest.getNextToken();
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
