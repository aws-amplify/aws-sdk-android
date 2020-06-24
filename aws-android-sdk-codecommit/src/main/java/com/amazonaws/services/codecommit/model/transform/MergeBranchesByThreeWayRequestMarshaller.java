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
 * JSON request marshaller for MergeBranchesByThreeWayRequest
 */
public class MergeBranchesByThreeWayRequestMarshaller implements
        Marshaller<Request<MergeBranchesByThreeWayRequest>, MergeBranchesByThreeWayRequest> {

    public Request<MergeBranchesByThreeWayRequest> marshall(
            MergeBranchesByThreeWayRequest mergeBranchesByThreeWayRequest) {
        if (mergeBranchesByThreeWayRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(MergeBranchesByThreeWayRequest)");
        }

        Request<MergeBranchesByThreeWayRequest> request = new DefaultRequest<MergeBranchesByThreeWayRequest>(
                mergeBranchesByThreeWayRequest, "AWSCodeCommit");
        String target = "CodeCommit_20150413.MergeBranchesByThreeWay";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (mergeBranchesByThreeWayRequest.getRepositoryName() != null) {
                String repositoryName = mergeBranchesByThreeWayRequest.getRepositoryName();
                jsonWriter.name("repositoryName");
                jsonWriter.value(repositoryName);
            }
            if (mergeBranchesByThreeWayRequest.getSourceCommitSpecifier() != null) {
                String sourceCommitSpecifier = mergeBranchesByThreeWayRequest
                        .getSourceCommitSpecifier();
                jsonWriter.name("sourceCommitSpecifier");
                jsonWriter.value(sourceCommitSpecifier);
            }
            if (mergeBranchesByThreeWayRequest.getDestinationCommitSpecifier() != null) {
                String destinationCommitSpecifier = mergeBranchesByThreeWayRequest
                        .getDestinationCommitSpecifier();
                jsonWriter.name("destinationCommitSpecifier");
                jsonWriter.value(destinationCommitSpecifier);
            }
            if (mergeBranchesByThreeWayRequest.getTargetBranch() != null) {
                String targetBranch = mergeBranchesByThreeWayRequest.getTargetBranch();
                jsonWriter.name("targetBranch");
                jsonWriter.value(targetBranch);
            }
            if (mergeBranchesByThreeWayRequest.getConflictDetailLevel() != null) {
                String conflictDetailLevel = mergeBranchesByThreeWayRequest
                        .getConflictDetailLevel();
                jsonWriter.name("conflictDetailLevel");
                jsonWriter.value(conflictDetailLevel);
            }
            if (mergeBranchesByThreeWayRequest.getConflictResolutionStrategy() != null) {
                String conflictResolutionStrategy = mergeBranchesByThreeWayRequest
                        .getConflictResolutionStrategy();
                jsonWriter.name("conflictResolutionStrategy");
                jsonWriter.value(conflictResolutionStrategy);
            }
            if (mergeBranchesByThreeWayRequest.getAuthorName() != null) {
                String authorName = mergeBranchesByThreeWayRequest.getAuthorName();
                jsonWriter.name("authorName");
                jsonWriter.value(authorName);
            }
            if (mergeBranchesByThreeWayRequest.getEmail() != null) {
                String email = mergeBranchesByThreeWayRequest.getEmail();
                jsonWriter.name("email");
                jsonWriter.value(email);
            }
            if (mergeBranchesByThreeWayRequest.getCommitMessage() != null) {
                String commitMessage = mergeBranchesByThreeWayRequest.getCommitMessage();
                jsonWriter.name("commitMessage");
                jsonWriter.value(commitMessage);
            }
            if (mergeBranchesByThreeWayRequest.getKeepEmptyFolders() != null) {
                Boolean keepEmptyFolders = mergeBranchesByThreeWayRequest.getKeepEmptyFolders();
                jsonWriter.name("keepEmptyFolders");
                jsonWriter.value(keepEmptyFolders);
            }
            if (mergeBranchesByThreeWayRequest.getConflictResolution() != null) {
                ConflictResolution conflictResolution = mergeBranchesByThreeWayRequest
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
