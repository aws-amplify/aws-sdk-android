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
 * JSON request marshaller for CreateUnreferencedMergeCommitRequest
 */
public class CreateUnreferencedMergeCommitRequestMarshaller
        implements
        Marshaller<Request<CreateUnreferencedMergeCommitRequest>, CreateUnreferencedMergeCommitRequest> {

    public Request<CreateUnreferencedMergeCommitRequest> marshall(
            CreateUnreferencedMergeCommitRequest createUnreferencedMergeCommitRequest) {
        if (createUnreferencedMergeCommitRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateUnreferencedMergeCommitRequest)");
        }

        Request<CreateUnreferencedMergeCommitRequest> request = new DefaultRequest<CreateUnreferencedMergeCommitRequest>(
                createUnreferencedMergeCommitRequest, "AWSCodeCommit");
        String target = "CodeCommit_20150413.CreateUnreferencedMergeCommit";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createUnreferencedMergeCommitRequest.getRepositoryName() != null) {
                String repositoryName = createUnreferencedMergeCommitRequest.getRepositoryName();
                jsonWriter.name("repositoryName");
                jsonWriter.value(repositoryName);
            }
            if (createUnreferencedMergeCommitRequest.getSourceCommitSpecifier() != null) {
                String sourceCommitSpecifier = createUnreferencedMergeCommitRequest
                        .getSourceCommitSpecifier();
                jsonWriter.name("sourceCommitSpecifier");
                jsonWriter.value(sourceCommitSpecifier);
            }
            if (createUnreferencedMergeCommitRequest.getDestinationCommitSpecifier() != null) {
                String destinationCommitSpecifier = createUnreferencedMergeCommitRequest
                        .getDestinationCommitSpecifier();
                jsonWriter.name("destinationCommitSpecifier");
                jsonWriter.value(destinationCommitSpecifier);
            }
            if (createUnreferencedMergeCommitRequest.getMergeOption() != null) {
                String mergeOption = createUnreferencedMergeCommitRequest.getMergeOption();
                jsonWriter.name("mergeOption");
                jsonWriter.value(mergeOption);
            }
            if (createUnreferencedMergeCommitRequest.getConflictDetailLevel() != null) {
                String conflictDetailLevel = createUnreferencedMergeCommitRequest
                        .getConflictDetailLevel();
                jsonWriter.name("conflictDetailLevel");
                jsonWriter.value(conflictDetailLevel);
            }
            if (createUnreferencedMergeCommitRequest.getConflictResolutionStrategy() != null) {
                String conflictResolutionStrategy = createUnreferencedMergeCommitRequest
                        .getConflictResolutionStrategy();
                jsonWriter.name("conflictResolutionStrategy");
                jsonWriter.value(conflictResolutionStrategy);
            }
            if (createUnreferencedMergeCommitRequest.getAuthorName() != null) {
                String authorName = createUnreferencedMergeCommitRequest.getAuthorName();
                jsonWriter.name("authorName");
                jsonWriter.value(authorName);
            }
            if (createUnreferencedMergeCommitRequest.getEmail() != null) {
                String email = createUnreferencedMergeCommitRequest.getEmail();
                jsonWriter.name("email");
                jsonWriter.value(email);
            }
            if (createUnreferencedMergeCommitRequest.getCommitMessage() != null) {
                String commitMessage = createUnreferencedMergeCommitRequest.getCommitMessage();
                jsonWriter.name("commitMessage");
                jsonWriter.value(commitMessage);
            }
            if (createUnreferencedMergeCommitRequest.getKeepEmptyFolders() != null) {
                Boolean keepEmptyFolders = createUnreferencedMergeCommitRequest
                        .getKeepEmptyFolders();
                jsonWriter.name("keepEmptyFolders");
                jsonWriter.value(keepEmptyFolders);
            }
            if (createUnreferencedMergeCommitRequest.getConflictResolution() != null) {
                ConflictResolution conflictResolution = createUnreferencedMergeCommitRequest
                        .getConflictResolution();
                jsonWriter.name("conflictResolution");
                ConflictResolutionJsonMarshaller.getInstance().marshall(conflictResolution,
                        jsonWriter);
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
