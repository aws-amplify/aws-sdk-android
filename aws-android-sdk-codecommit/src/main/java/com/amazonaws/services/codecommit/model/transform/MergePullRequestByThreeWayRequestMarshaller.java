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
 * JSON request marshaller for MergePullRequestByThreeWayRequest
 */
public class MergePullRequestByThreeWayRequestMarshaller implements
        Marshaller<Request<MergePullRequestByThreeWayRequest>, MergePullRequestByThreeWayRequest> {

    public Request<MergePullRequestByThreeWayRequest> marshall(
            MergePullRequestByThreeWayRequest mergePullRequestByThreeWayRequest) {
        if (mergePullRequestByThreeWayRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(MergePullRequestByThreeWayRequest)");
        }

        Request<MergePullRequestByThreeWayRequest> request = new DefaultRequest<MergePullRequestByThreeWayRequest>(
                mergePullRequestByThreeWayRequest, "AWSCodeCommit");
        String target = "CodeCommit_20150413.MergePullRequestByThreeWay";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (mergePullRequestByThreeWayRequest.getPullRequestId() != null) {
                String pullRequestId = mergePullRequestByThreeWayRequest.getPullRequestId();
                jsonWriter.name("pullRequestId");
                jsonWriter.value(pullRequestId);
            }
            if (mergePullRequestByThreeWayRequest.getRepositoryName() != null) {
                String repositoryName = mergePullRequestByThreeWayRequest.getRepositoryName();
                jsonWriter.name("repositoryName");
                jsonWriter.value(repositoryName);
            }
            if (mergePullRequestByThreeWayRequest.getSourceCommitId() != null) {
                String sourceCommitId = mergePullRequestByThreeWayRequest.getSourceCommitId();
                jsonWriter.name("sourceCommitId");
                jsonWriter.value(sourceCommitId);
            }
            if (mergePullRequestByThreeWayRequest.getConflictDetailLevel() != null) {
                String conflictDetailLevel = mergePullRequestByThreeWayRequest
                        .getConflictDetailLevel();
                jsonWriter.name("conflictDetailLevel");
                jsonWriter.value(conflictDetailLevel);
            }
            if (mergePullRequestByThreeWayRequest.getConflictResolutionStrategy() != null) {
                String conflictResolutionStrategy = mergePullRequestByThreeWayRequest
                        .getConflictResolutionStrategy();
                jsonWriter.name("conflictResolutionStrategy");
                jsonWriter.value(conflictResolutionStrategy);
            }
            if (mergePullRequestByThreeWayRequest.getCommitMessage() != null) {
                String commitMessage = mergePullRequestByThreeWayRequest.getCommitMessage();
                jsonWriter.name("commitMessage");
                jsonWriter.value(commitMessage);
            }
            if (mergePullRequestByThreeWayRequest.getAuthorName() != null) {
                String authorName = mergePullRequestByThreeWayRequest.getAuthorName();
                jsonWriter.name("authorName");
                jsonWriter.value(authorName);
            }
            if (mergePullRequestByThreeWayRequest.getEmail() != null) {
                String email = mergePullRequestByThreeWayRequest.getEmail();
                jsonWriter.name("email");
                jsonWriter.value(email);
            }
            if (mergePullRequestByThreeWayRequest.getKeepEmptyFolders() != null) {
                Boolean keepEmptyFolders = mergePullRequestByThreeWayRequest.getKeepEmptyFolders();
                jsonWriter.name("keepEmptyFolders");
                jsonWriter.value(keepEmptyFolders);
            }
            if (mergePullRequestByThreeWayRequest.getConflictResolution() != null) {
                ConflictResolution conflictResolution = mergePullRequestByThreeWayRequest
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
