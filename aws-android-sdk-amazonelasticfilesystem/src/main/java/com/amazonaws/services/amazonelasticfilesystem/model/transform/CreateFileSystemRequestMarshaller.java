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

package com.amazonaws.services.amazonelasticfilesystem.model.transform;

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
import com.amazonaws.services.amazonelasticfilesystem.model.*;
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
                createFileSystemRequest, "AmazonElasticFileSystem");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/2015-02-01/file-systems";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createFileSystemRequest.getCreationToken() != null) {
                String creationToken = createFileSystemRequest.getCreationToken();
                jsonWriter.name("CreationToken");
                jsonWriter.value(creationToken);
            }
            if (createFileSystemRequest.getPerformanceMode() != null) {
                String performanceMode = createFileSystemRequest.getPerformanceMode();
                jsonWriter.name("PerformanceMode");
                jsonWriter.value(performanceMode);
            }
            if (createFileSystemRequest.getEncrypted() != null) {
                Boolean encrypted = createFileSystemRequest.getEncrypted();
                jsonWriter.name("Encrypted");
                jsonWriter.value(encrypted);
            }
            if (createFileSystemRequest.getKmsKeyId() != null) {
                String kmsKeyId = createFileSystemRequest.getKmsKeyId();
                jsonWriter.name("KmsKeyId");
                jsonWriter.value(kmsKeyId);
            }
            if (createFileSystemRequest.getThroughputMode() != null) {
                String throughputMode = createFileSystemRequest.getThroughputMode();
                jsonWriter.name("ThroughputMode");
                jsonWriter.value(throughputMode);
            }
            if (createFileSystemRequest.getProvisionedThroughputInMibps() != null) {
                Double provisionedThroughputInMibps = createFileSystemRequest
                        .getProvisionedThroughputInMibps();
                jsonWriter.name("ProvisionedThroughputInMibps");
                jsonWriter.value(provisionedThroughputInMibps);
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
