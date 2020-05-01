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
 * JSON request marshaller for CreateAccessPointRequest
 */
public class CreateAccessPointRequestMarshaller implements
        Marshaller<Request<CreateAccessPointRequest>, CreateAccessPointRequest> {

    public Request<CreateAccessPointRequest> marshall(
            CreateAccessPointRequest createAccessPointRequest) {
        if (createAccessPointRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateAccessPointRequest)");
        }

        Request<CreateAccessPointRequest> request = new DefaultRequest<CreateAccessPointRequest>(
                createAccessPointRequest, "AmazonElasticFileSystem");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/2015-02-01/access-points";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createAccessPointRequest.getClientToken() != null) {
                String clientToken = createAccessPointRequest.getClientToken();
                jsonWriter.name("ClientToken");
                jsonWriter.value(clientToken);
            }
            if (createAccessPointRequest.getTags() != null) {
                java.util.List<Tag> tags = createAccessPointRequest.getTags();
                jsonWriter.name("Tags");
                jsonWriter.beginArray();
                for (Tag tagsItem : tags) {
                    if (tagsItem != null) {
                        TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createAccessPointRequest.getFileSystemId() != null) {
                String fileSystemId = createAccessPointRequest.getFileSystemId();
                jsonWriter.name("FileSystemId");
                jsonWriter.value(fileSystemId);
            }
            if (createAccessPointRequest.getPosixUser() != null) {
                PosixUser posixUser = createAccessPointRequest.getPosixUser();
                jsonWriter.name("PosixUser");
                PosixUserJsonMarshaller.getInstance().marshall(posixUser, jsonWriter);
            }
            if (createAccessPointRequest.getRootDirectory() != null) {
                RootDirectory rootDirectory = createAccessPointRequest.getRootDirectory();
                jsonWriter.name("RootDirectory");
                RootDirectoryJsonMarshaller.getInstance().marshall(rootDirectory, jsonWriter);
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
