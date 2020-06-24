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
 * JSON request marshaller for CreateCommitRequest
 */
public class CreateCommitRequestMarshaller implements
        Marshaller<Request<CreateCommitRequest>, CreateCommitRequest> {

    public Request<CreateCommitRequest> marshall(CreateCommitRequest createCommitRequest) {
        if (createCommitRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateCommitRequest)");
        }

        Request<CreateCommitRequest> request = new DefaultRequest<CreateCommitRequest>(
                createCommitRequest, "AWSCodeCommit");
        String target = "CodeCommit_20150413.CreateCommit";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createCommitRequest.getRepositoryName() != null) {
                String repositoryName = createCommitRequest.getRepositoryName();
                jsonWriter.name("repositoryName");
                jsonWriter.value(repositoryName);
            }
            if (createCommitRequest.getBranchName() != null) {
                String branchName = createCommitRequest.getBranchName();
                jsonWriter.name("branchName");
                jsonWriter.value(branchName);
            }
            if (createCommitRequest.getParentCommitId() != null) {
                String parentCommitId = createCommitRequest.getParentCommitId();
                jsonWriter.name("parentCommitId");
                jsonWriter.value(parentCommitId);
            }
            if (createCommitRequest.getAuthorName() != null) {
                String authorName = createCommitRequest.getAuthorName();
                jsonWriter.name("authorName");
                jsonWriter.value(authorName);
            }
            if (createCommitRequest.getEmail() != null) {
                String email = createCommitRequest.getEmail();
                jsonWriter.name("email");
                jsonWriter.value(email);
            }
            if (createCommitRequest.getCommitMessage() != null) {
                String commitMessage = createCommitRequest.getCommitMessage();
                jsonWriter.name("commitMessage");
                jsonWriter.value(commitMessage);
            }
            if (createCommitRequest.getKeepEmptyFolders() != null) {
                Boolean keepEmptyFolders = createCommitRequest.getKeepEmptyFolders();
                jsonWriter.name("keepEmptyFolders");
                jsonWriter.value(keepEmptyFolders);
            }
            if (createCommitRequest.getPutFiles() != null) {
                java.util.List<PutFileEntry> putFiles = createCommitRequest.getPutFiles();
                jsonWriter.name("putFiles");
                jsonWriter.beginArray();
                for (PutFileEntry putFilesItem : putFiles) {
                    if (putFilesItem != null) {
                        PutFileEntryJsonMarshaller.getInstance().marshall(putFilesItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createCommitRequest.getDeleteFiles() != null) {
                java.util.List<DeleteFileEntry> deleteFiles = createCommitRequest.getDeleteFiles();
                jsonWriter.name("deleteFiles");
                jsonWriter.beginArray();
                for (DeleteFileEntry deleteFilesItem : deleteFiles) {
                    if (deleteFilesItem != null) {
                        DeleteFileEntryJsonMarshaller.getInstance().marshall(deleteFilesItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createCommitRequest.getSetFileModes() != null) {
                java.util.List<SetFileModeEntry> setFileModes = createCommitRequest
                        .getSetFileModes();
                jsonWriter.name("setFileModes");
                jsonWriter.beginArray();
                for (SetFileModeEntry setFileModesItem : setFileModes) {
                    if (setFileModesItem != null) {
                        SetFileModeEntryJsonMarshaller.getInstance().marshall(setFileModesItem,
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
