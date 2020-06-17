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

package com.amazonaws.services.ec2.model.transform;

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
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CopySnapshotRequest
 */
public class CopySnapshotRequestMarshaller implements
        Marshaller<Request<CopySnapshotRequest>, CopySnapshotRequest> {

    public Request<CopySnapshotRequest> marshall(CopySnapshotRequest copySnapshotRequest) {
        if (copySnapshotRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CopySnapshotRequest)");
        }

        Request<CopySnapshotRequest> request = new DefaultRequest<CopySnapshotRequest>(
                copySnapshotRequest, "AmazonElasticComputeCloud");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (copySnapshotRequest.getDescription() != null) {
                String description = copySnapshotRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (copySnapshotRequest.getDestinationRegion() != null) {
                String destinationRegion = copySnapshotRequest.getDestinationRegion();
                jsonWriter.name("DestinationRegion");
                jsonWriter.value(destinationRegion);
            }
            if (copySnapshotRequest.getEncrypted() != null) {
                Boolean encrypted = copySnapshotRequest.getEncrypted();
                jsonWriter.name("Encrypted");
                jsonWriter.value(encrypted);
            }
            if (copySnapshotRequest.getKmsKeyId() != null) {
                String kmsKeyId = copySnapshotRequest.getKmsKeyId();
                jsonWriter.name("KmsKeyId");
                jsonWriter.value(kmsKeyId);
            }
            if (copySnapshotRequest.getPresignedUrl() != null) {
                String presignedUrl = copySnapshotRequest.getPresignedUrl();
                jsonWriter.name("PresignedUrl");
                jsonWriter.value(presignedUrl);
            }
            if (copySnapshotRequest.getSourceRegion() != null) {
                String sourceRegion = copySnapshotRequest.getSourceRegion();
                jsonWriter.name("SourceRegion");
                jsonWriter.value(sourceRegion);
            }
            if (copySnapshotRequest.getSourceSnapshotId() != null) {
                String sourceSnapshotId = copySnapshotRequest.getSourceSnapshotId();
                jsonWriter.name("SourceSnapshotId");
                jsonWriter.value(sourceSnapshotId);
            }
            if (copySnapshotRequest.getTagSpecifications() != null) {
                java.util.List<TagSpecification> tagSpecifications = copySnapshotRequest
                        .getTagSpecifications();
                jsonWriter.name("TagSpecifications");
                jsonWriter.beginArray();
                for (TagSpecification tagSpecificationsItem : tagSpecifications) {
                    if (tagSpecificationsItem != null) {
                        TagSpecificationJsonMarshaller.getInstance().marshall(
                                tagSpecificationsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (copySnapshotRequest.getDryRun() != null) {
                Boolean dryRun = copySnapshotRequest.getDryRun();
                jsonWriter.name("DryRun");
                jsonWriter.value(dryRun);
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
