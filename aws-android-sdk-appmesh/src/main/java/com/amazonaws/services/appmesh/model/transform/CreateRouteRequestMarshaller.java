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

package com.amazonaws.services.appmesh.model.transform;

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
import com.amazonaws.services.appmesh.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateRouteRequest
 */
public class CreateRouteRequestMarshaller implements
        Marshaller<Request<CreateRouteRequest>, CreateRouteRequest> {

    public Request<CreateRouteRequest> marshall(CreateRouteRequest createRouteRequest) {
        if (createRouteRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateRouteRequest)");
        }

        Request<CreateRouteRequest> request = new DefaultRequest<CreateRouteRequest>(
                createRouteRequest, "AWSAppMesh");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/v20190125/meshes/{meshName}/virtualRouter/{virtualRouterName}/routes";
        uriResourcePath = uriResourcePath.replace(
                "{meshName}",
                (createRouteRequest.getMeshName() == null) ? "" : StringUtils
                        .fromString(createRouteRequest.getMeshName()));
        if (createRouteRequest.getMeshOwner() != null) {
            request.addParameter("meshOwner",
                    StringUtils.fromString(createRouteRequest.getMeshOwner()));
        }
        uriResourcePath = uriResourcePath.replace(
                "{virtualRouterName}",
                (createRouteRequest.getVirtualRouterName() == null) ? "" : StringUtils
                        .fromString(createRouteRequest.getVirtualRouterName()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createRouteRequest.getClientToken() != null) {
                String clientToken = createRouteRequest.getClientToken();
                jsonWriter.name("clientToken");
                jsonWriter.value(clientToken);
            }
            if (createRouteRequest.getRouteName() != null) {
                String routeName = createRouteRequest.getRouteName();
                jsonWriter.name("routeName");
                jsonWriter.value(routeName);
            }
            if (createRouteRequest.getSpec() != null) {
                RouteSpec spec = createRouteRequest.getSpec();
                jsonWriter.name("spec");
                RouteSpecJsonMarshaller.getInstance().marshall(spec, jsonWriter);
            }
            if (createRouteRequest.getTags() != null) {
                java.util.List<TagRef> tags = createRouteRequest.getTags();
                jsonWriter.name("tags");
                jsonWriter.beginArray();
                for (TagRef tagsItem : tags) {
                    if (tagsItem != null) {
                        TagRefJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
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
