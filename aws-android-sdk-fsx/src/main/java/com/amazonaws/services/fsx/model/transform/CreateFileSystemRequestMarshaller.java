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

package com.amazonaws.services.fsx.model.transform;

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
import com.amazonaws.services.fsx.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateFileSystemRequest
 */
public class CreateFileSystemRequestMarshaller implements
        Marshaller<Request<CreateFileSystemRequest>, CreateFileSystemRequest> {

    public Request<CreateFileSystemRequest> marshall(CreateFileSystemRequest createFileSystemRequest) {
        if (createFileSystemRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateFileSystemRequest)");
        }

        Request<CreateFileSystemRequest> request = new DefaultRequest<CreateFileSystemRequest>(
                createFileSystemRequest, "AmazonFSx");
        String target = "AWSSimbaAPIService_v20180301.CreateFileSystem";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createFileSystemRequest.getClientRequestToken() != null) {
                String clientRequestToken = createFileSystemRequest.getClientRequestToken();
                jsonWriter.name("ClientRequestToken");
                jsonWriter.value(clientRequestToken);
            }
            if (createFileSystemRequest.getFileSystemType() != null) {
                String fileSystemType = createFileSystemRequest.getFileSystemType();
                jsonWriter.name("FileSystemType");
                jsonWriter.value(fileSystemType);
            }
            if (createFileSystemRequest.getStorageCapacity() != null) {
                Integer storageCapacity = createFileSystemRequest.getStorageCapacity();
                jsonWriter.name("StorageCapacity");
                jsonWriter.value(storageCapacity);
            }
            if (createFileSystemRequest.getStorageType() != null) {
                String storageType = createFileSystemRequest.getStorageType();
                jsonWriter.name("StorageType");
                jsonWriter.value(storageType);
            }
            if (createFileSystemRequest.getSubnetIds() != null) {
                java.util.List<String> subnetIds = createFileSystemRequest.getSubnetIds();
                jsonWriter.name("SubnetIds");
                jsonWriter.beginArray();
                for (String subnetIdsItem : subnetIds) {
                    if (subnetIdsItem != null) {
                        jsonWriter.value(subnetIdsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createFileSystemRequest.getSecurityGroupIds() != null) {
                java.util.List<String> securityGroupIds = createFileSystemRequest
                        .getSecurityGroupIds();
                jsonWriter.name("SecurityGroupIds");
                jsonWriter.beginArray();
                for (String securityGroupIdsItem : securityGroupIds) {
                    if (securityGroupIdsItem != null) {
                        jsonWriter.value(securityGroupIdsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createFileSystemRequest.getTags() != null) {
                java.util.List<Tag> tags = createFileSystemRequest.getTags();
                jsonWriter.name("Tags");
                jsonWriter.beginArray();
                for (Tag tagsItem : tags) {
                    if (tagsItem != null) {
                        TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createFileSystemRequest.getKmsKeyId() != null) {
                String kmsKeyId = createFileSystemRequest.getKmsKeyId();
                jsonWriter.name("KmsKeyId");
                jsonWriter.value(kmsKeyId);
            }
            if (createFileSystemRequest.getWindowsConfiguration() != null) {
                CreateFileSystemWindowsConfiguration windowsConfiguration = createFileSystemRequest
                        .getWindowsConfiguration();
                jsonWriter.name("WindowsConfiguration");
                CreateFileSystemWindowsConfigurationJsonMarshaller.getInstance().marshall(
                        windowsConfiguration, jsonWriter);
            }
            if (createFileSystemRequest.getLustreConfiguration() != null) {
                CreateFileSystemLustreConfiguration lustreConfiguration = createFileSystemRequest
                        .getLustreConfiguration();
                jsonWriter.name("LustreConfiguration");
                CreateFileSystemLustreConfigurationJsonMarshaller.getInstance().marshall(
                        lustreConfiguration, jsonWriter);
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
