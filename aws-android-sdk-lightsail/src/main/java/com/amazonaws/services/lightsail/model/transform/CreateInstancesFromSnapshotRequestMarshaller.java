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
 * JSON request marshaller for CreateInstancesFromSnapshotRequest
 */
public class CreateInstancesFromSnapshotRequestMarshaller implements
        Marshaller<Request<CreateInstancesFromSnapshotRequest>, CreateInstancesFromSnapshotRequest> {

    public Request<CreateInstancesFromSnapshotRequest> marshall(
            CreateInstancesFromSnapshotRequest createInstancesFromSnapshotRequest) {
        if (createInstancesFromSnapshotRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateInstancesFromSnapshotRequest)");
        }

        Request<CreateInstancesFromSnapshotRequest> request = new DefaultRequest<CreateInstancesFromSnapshotRequest>(
                createInstancesFromSnapshotRequest, "AmazonLightsail");
        String target = "Lightsail_20161128.CreateInstancesFromSnapshot";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createInstancesFromSnapshotRequest.getInstanceNames() != null) {
                java.util.List<String> instanceNames = createInstancesFromSnapshotRequest
                        .getInstanceNames();
                jsonWriter.name("instanceNames");
                jsonWriter.beginArray();
                for (String instanceNamesItem : instanceNames) {
                    if (instanceNamesItem != null) {
                        jsonWriter.value(instanceNamesItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createInstancesFromSnapshotRequest.getAttachedDiskMapping() != null) {
                java.util.Map<String, java.util.List<DiskMap>> attachedDiskMapping = createInstancesFromSnapshotRequest
                        .getAttachedDiskMapping();
                jsonWriter.name("attachedDiskMapping");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, java.util.List<DiskMap>> attachedDiskMappingEntry : attachedDiskMapping
                        .entrySet()) {
                    java.util.List<DiskMap> attachedDiskMappingValue = attachedDiskMappingEntry
                            .getValue();
                    if (attachedDiskMappingValue != null) {
                        jsonWriter.name(attachedDiskMappingEntry.getKey());
                        jsonWriter.beginArray();
                        for (DiskMap attachedDiskMappingValueItem : attachedDiskMappingValue) {
                            if (attachedDiskMappingValueItem != null) {
                                DiskMapJsonMarshaller.getInstance().marshall(
                                        attachedDiskMappingValueItem, jsonWriter);
                            }
                        }
                        jsonWriter.endArray();
                    }
                }
                jsonWriter.endObject();
            }
            if (createInstancesFromSnapshotRequest.getAvailabilityZone() != null) {
                String availabilityZone = createInstancesFromSnapshotRequest.getAvailabilityZone();
                jsonWriter.name("availabilityZone");
                jsonWriter.value(availabilityZone);
            }
            if (createInstancesFromSnapshotRequest.getInstanceSnapshotName() != null) {
                String instanceSnapshotName = createInstancesFromSnapshotRequest
                        .getInstanceSnapshotName();
                jsonWriter.name("instanceSnapshotName");
                jsonWriter.value(instanceSnapshotName);
            }
            if (createInstancesFromSnapshotRequest.getBundleId() != null) {
                String bundleId = createInstancesFromSnapshotRequest.getBundleId();
                jsonWriter.name("bundleId");
                jsonWriter.value(bundleId);
            }
            if (createInstancesFromSnapshotRequest.getUserData() != null) {
                String userData = createInstancesFromSnapshotRequest.getUserData();
                jsonWriter.name("userData");
                jsonWriter.value(userData);
            }
            if (createInstancesFromSnapshotRequest.getKeyPairName() != null) {
                String keyPairName = createInstancesFromSnapshotRequest.getKeyPairName();
                jsonWriter.name("keyPairName");
                jsonWriter.value(keyPairName);
            }
            if (createInstancesFromSnapshotRequest.getTags() != null) {
                java.util.List<Tag> tags = createInstancesFromSnapshotRequest.getTags();
                jsonWriter.name("tags");
                jsonWriter.beginArray();
                for (Tag tagsItem : tags) {
                    if (tagsItem != null) {
                        TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createInstancesFromSnapshotRequest.getAddOns() != null) {
                java.util.List<AddOnRequest> addOns = createInstancesFromSnapshotRequest
                        .getAddOns();
                jsonWriter.name("addOns");
                jsonWriter.beginArray();
                for (AddOnRequest addOnsItem : addOns) {
                    if (addOnsItem != null) {
                        AddOnRequestJsonMarshaller.getInstance().marshall(addOnsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createInstancesFromSnapshotRequest.getSourceInstanceName() != null) {
                String sourceInstanceName = createInstancesFromSnapshotRequest
                        .getSourceInstanceName();
                jsonWriter.name("sourceInstanceName");
                jsonWriter.value(sourceInstanceName);
            }
            if (createInstancesFromSnapshotRequest.getRestoreDate() != null) {
                String restoreDate = createInstancesFromSnapshotRequest.getRestoreDate();
                jsonWriter.name("restoreDate");
                jsonWriter.value(restoreDate);
            }
            if (createInstancesFromSnapshotRequest.getUseLatestRestorableAutoSnapshot() != null) {
                Boolean useLatestRestorableAutoSnapshot = createInstancesFromSnapshotRequest
                        .getUseLatestRestorableAutoSnapshot();
                jsonWriter.name("useLatestRestorableAutoSnapshot");
                jsonWriter.value(useLatestRestorableAutoSnapshot);
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
