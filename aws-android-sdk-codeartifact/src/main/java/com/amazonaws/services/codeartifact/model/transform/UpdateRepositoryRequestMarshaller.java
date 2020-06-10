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

package com.amazonaws.services.codeartifact.model.transform;

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
import com.amazonaws.services.codeartifact.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for UpdateRepositoryRequest
 */
public class UpdateRepositoryRequestMarshaller implements
        Marshaller<Request<UpdateRepositoryRequest>, UpdateRepositoryRequest> {

    public Request<UpdateRepositoryRequest> marshall(UpdateRepositoryRequest updateRepositoryRequest) {
        if (updateRepositoryRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateRepositoryRequest)");
        }

        Request<UpdateRepositoryRequest> request = new DefaultRequest<UpdateRepositoryRequest>(
                updateRepositoryRequest, "CodeArtifact");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/v1/repository";
        if (updateRepositoryRequest.getDomain() != null) {
            request.addParameter("domain",
                    StringUtils.fromString(updateRepositoryRequest.getDomain()));
        }
        if (updateRepositoryRequest.getDomainOwner() != null) {
            request.addParameter("domain-owner",
                    StringUtils.fromString(updateRepositoryRequest.getDomainOwner()));
        }
        if (updateRepositoryRequest.getRepository() != null) {
            request.addParameter("repository",
                    StringUtils.fromString(updateRepositoryRequest.getRepository()));
        }
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateRepositoryRequest.getDescription() != null) {
                String description = updateRepositoryRequest.getDescription();
                jsonWriter.name("description");
                jsonWriter.value(description);
            }
            if (updateRepositoryRequest.getUpstreams() != null) {
                java.util.List<UpstreamRepository> upstreams = updateRepositoryRequest
                        .getUpstreams();
                jsonWriter.name("upstreams");
                jsonWriter.beginArray();
                for (UpstreamRepository upstreamsItem : upstreams) {
                    if (upstreamsItem != null) {
                        UpstreamRepositoryJsonMarshaller.getInstance().marshall(upstreamsItem,
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
