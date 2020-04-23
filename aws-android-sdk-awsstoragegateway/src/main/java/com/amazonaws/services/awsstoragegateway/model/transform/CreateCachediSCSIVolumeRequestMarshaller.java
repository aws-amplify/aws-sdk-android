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

package com.amazonaws.services.awsstoragegateway.model.transform;

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
import com.amazonaws.services.awsstoragegateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateCachediSCSIVolumeRequest
 */
public class CreateCachediSCSIVolumeRequestMarshaller implements
        Marshaller<Request<CreateCachediSCSIVolumeRequest>, CreateCachediSCSIVolumeRequest> {

    public Request<CreateCachediSCSIVolumeRequest> marshall(
            CreateCachediSCSIVolumeRequest createCachediSCSIVolumeRequest) {
        if (createCachediSCSIVolumeRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateCachediSCSIVolumeRequest)");
        }

        Request<CreateCachediSCSIVolumeRequest> request = new DefaultRequest<CreateCachediSCSIVolumeRequest>(
                createCachediSCSIVolumeRequest, "AWSStorageGateway");
        String target = "StorageGateway_20130630.CreateCachediSCSIVolume";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createCachediSCSIVolumeRequest.getGatewayARN() != null) {
                String gatewayARN = createCachediSCSIVolumeRequest.getGatewayARN();
                jsonWriter.name("GatewayARN");
                jsonWriter.value(gatewayARN);
            }
            if (createCachediSCSIVolumeRequest.getVolumeSizeInBytes() != null) {
                Long volumeSizeInBytes = createCachediSCSIVolumeRequest.getVolumeSizeInBytes();
                jsonWriter.name("VolumeSizeInBytes");
                jsonWriter.value(volumeSizeInBytes);
            }
            if (createCachediSCSIVolumeRequest.getSnapshotId() != null) {
                String snapshotId = createCachediSCSIVolumeRequest.getSnapshotId();
                jsonWriter.name("SnapshotId");
                jsonWriter.value(snapshotId);
            }
            if (createCachediSCSIVolumeRequest.getTargetName() != null) {
                String targetName = createCachediSCSIVolumeRequest.getTargetName();
                jsonWriter.name("TargetName");
                jsonWriter.value(targetName);
            }
            if (createCachediSCSIVolumeRequest.getSourceVolumeARN() != null) {
                String sourceVolumeARN = createCachediSCSIVolumeRequest.getSourceVolumeARN();
                jsonWriter.name("SourceVolumeARN");
                jsonWriter.value(sourceVolumeARN);
            }
            if (createCachediSCSIVolumeRequest.getNetworkInterfaceId() != null) {
                String networkInterfaceId = createCachediSCSIVolumeRequest.getNetworkInterfaceId();
                jsonWriter.name("NetworkInterfaceId");
                jsonWriter.value(networkInterfaceId);
            }
            if (createCachediSCSIVolumeRequest.getClientToken() != null) {
                String clientToken = createCachediSCSIVolumeRequest.getClientToken();
                jsonWriter.name("ClientToken");
                jsonWriter.value(clientToken);
            }
            if (createCachediSCSIVolumeRequest.getKMSEncrypted() != null) {
                Boolean kMSEncrypted = createCachediSCSIVolumeRequest.getKMSEncrypted();
                jsonWriter.name("KMSEncrypted");
                jsonWriter.value(kMSEncrypted);
            }
            if (createCachediSCSIVolumeRequest.getKMSKey() != null) {
                String kMSKey = createCachediSCSIVolumeRequest.getKMSKey();
                jsonWriter.name("KMSKey");
                jsonWriter.value(kMSKey);
            }
            if (createCachediSCSIVolumeRequest.getTags() != null) {
                java.util.List<Tag> tags = createCachediSCSIVolumeRequest.getTags();
                jsonWriter.name("Tags");
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
