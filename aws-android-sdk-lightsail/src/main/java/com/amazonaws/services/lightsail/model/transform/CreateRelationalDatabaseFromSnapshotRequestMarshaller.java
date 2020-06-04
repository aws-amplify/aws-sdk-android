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

package com.amazonaws.services.lightsail.model.transform;

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
import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateRelationalDatabaseFromSnapshotRequest
 */
public class CreateRelationalDatabaseFromSnapshotRequestMarshaller
        implements
        Marshaller<Request<CreateRelationalDatabaseFromSnapshotRequest>, CreateRelationalDatabaseFromSnapshotRequest> {

    public Request<CreateRelationalDatabaseFromSnapshotRequest> marshall(
            CreateRelationalDatabaseFromSnapshotRequest createRelationalDatabaseFromSnapshotRequest) {
        if (createRelationalDatabaseFromSnapshotRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateRelationalDatabaseFromSnapshotRequest)");
        }

        Request<CreateRelationalDatabaseFromSnapshotRequest> request = new DefaultRequest<CreateRelationalDatabaseFromSnapshotRequest>(
                createRelationalDatabaseFromSnapshotRequest, "AmazonLightsail");
        String target = "Lightsail_20161128.CreateRelationalDatabaseFromSnapshot";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createRelationalDatabaseFromSnapshotRequest.getRelationalDatabaseName() != null) {
                String relationalDatabaseName = createRelationalDatabaseFromSnapshotRequest
                        .getRelationalDatabaseName();
                jsonWriter.name("relationalDatabaseName");
                jsonWriter.value(relationalDatabaseName);
            }
            if (createRelationalDatabaseFromSnapshotRequest.getAvailabilityZone() != null) {
                String availabilityZone = createRelationalDatabaseFromSnapshotRequest
                        .getAvailabilityZone();
                jsonWriter.name("availabilityZone");
                jsonWriter.value(availabilityZone);
            }
            if (createRelationalDatabaseFromSnapshotRequest.getPubliclyAccessible() != null) {
                Boolean publiclyAccessible = createRelationalDatabaseFromSnapshotRequest
                        .getPubliclyAccessible();
                jsonWriter.name("publiclyAccessible");
                jsonWriter.value(publiclyAccessible);
            }
            if (createRelationalDatabaseFromSnapshotRequest.getRelationalDatabaseSnapshotName() != null) {
                String relationalDatabaseSnapshotName = createRelationalDatabaseFromSnapshotRequest
                        .getRelationalDatabaseSnapshotName();
                jsonWriter.name("relationalDatabaseSnapshotName");
                jsonWriter.value(relationalDatabaseSnapshotName);
            }
            if (createRelationalDatabaseFromSnapshotRequest.getRelationalDatabaseBundleId() != null) {
                String relationalDatabaseBundleId = createRelationalDatabaseFromSnapshotRequest
                        .getRelationalDatabaseBundleId();
                jsonWriter.name("relationalDatabaseBundleId");
                jsonWriter.value(relationalDatabaseBundleId);
            }
            if (createRelationalDatabaseFromSnapshotRequest.getSourceRelationalDatabaseName() != null) {
                String sourceRelationalDatabaseName = createRelationalDatabaseFromSnapshotRequest
                        .getSourceRelationalDatabaseName();
                jsonWriter.name("sourceRelationalDatabaseName");
                jsonWriter.value(sourceRelationalDatabaseName);
            }
            if (createRelationalDatabaseFromSnapshotRequest.getRestoreTime() != null) {
                java.util.Date restoreTime = createRelationalDatabaseFromSnapshotRequest
                        .getRestoreTime();
                jsonWriter.name("restoreTime");
                jsonWriter.value(restoreTime);
            }
            if (createRelationalDatabaseFromSnapshotRequest.getUseLatestRestorableTime() != null) {
                Boolean useLatestRestorableTime = createRelationalDatabaseFromSnapshotRequest
                        .getUseLatestRestorableTime();
                jsonWriter.name("useLatestRestorableTime");
                jsonWriter.value(useLatestRestorableTime);
            }
            if (createRelationalDatabaseFromSnapshotRequest.getTags() != null) {
                java.util.List<Tag> tags = createRelationalDatabaseFromSnapshotRequest.getTags();
                jsonWriter.name("tags");
                jsonWriter.beginArray();
                for (Tag tagsItem : tags) {
                    if (tagsItem != null) {
                        TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
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
