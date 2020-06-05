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

package com.amazonaws.services.apigateway.model.transform;

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
import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for GetResourceRequest
 */
public class GetResourceRequestMarshaller implements
        Marshaller<Request<GetResourceRequest>, GetResourceRequest> {

    public Request<GetResourceRequest> marshall(GetResourceRequest getResourceRequest) {
        if (getResourceRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetResourceRequest)");
        }

        Request<GetResourceRequest> request = new DefaultRequest<GetResourceRequest>(
                getResourceRequest, "AmazonAPIGateway");
        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/restapis/{restapi_id}/resources/{resource_id}";
        uriResourcePath = uriResourcePath.replace(
                "{restapi_id}",
                (getResourceRequest.getRestApiId() == null) ? "" : StringUtils
                        .fromString(getResourceRequest.getRestApiId()));
        uriResourcePath = uriResourcePath.replace(
                "{resource_id}",
                (getResourceRequest.getResourceId() == null) ? "" : StringUtils
                        .fromString(getResourceRequest.getResourceId()));
        if (getResourceRequest.getEmbed() != null) {
            request.addParameter("embed",
                    StringUtils.join(",", getResourceRequest.getEmbed().toArray(new String[0])));
        }
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
