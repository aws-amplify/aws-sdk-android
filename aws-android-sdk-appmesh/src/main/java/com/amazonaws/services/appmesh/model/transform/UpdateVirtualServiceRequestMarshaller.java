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
 * JSON request marshaller for UpdateVirtualServiceRequest
 */
public class UpdateVirtualServiceRequestMarshaller implements
        Marshaller<Request<UpdateVirtualServiceRequest>, UpdateVirtualServiceRequest> {

    public Request<UpdateVirtualServiceRequest> marshall(
            UpdateVirtualServiceRequest updateVirtualServiceRequest) {
        if (updateVirtualServiceRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateVirtualServiceRequest)");
        }

        Request<UpdateVirtualServiceRequest> request = new DefaultRequest<UpdateVirtualServiceRequest>(
                updateVirtualServiceRequest, "AWSAppMesh");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/v20190125/meshes/{meshName}/virtualServices/{virtualServiceName}";
        uriResourcePath = uriResourcePath.replace(
                "{meshName}",
                (updateVirtualServiceRequest.getMeshName() == null) ? "" : StringUtils
                        .fromString(updateVirtualServiceRequest.getMeshName()));
        if (updateVirtualServiceRequest.getMeshOwner() != null) {
            request.addParameter("meshOwner",
                    StringUtils.fromString(updateVirtualServiceRequest.getMeshOwner()));
        }
        uriResourcePath = uriResourcePath.replace(
                "{virtualServiceName}",
                (updateVirtualServiceRequest.getVirtualServiceName() == null) ? "" : StringUtils
                        .fromString(updateVirtualServiceRequest.getVirtualServiceName()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateVirtualServiceRequest.getClientToken() != null) {
                String clientToken = updateVirtualServiceRequest.getClientToken();
                jsonWriter.name("clientToken");
                jsonWriter.value(clientToken);
            }
            if (updateVirtualServiceRequest.getSpec() != null) {
                VirtualServiceSpec spec = updateVirtualServiceRequest.getSpec();
                jsonWriter.name("spec");
                VirtualServiceSpecJsonMarshaller.getInstance().marshall(spec, jsonWriter);
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
