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

package com.amazonaws.services.amazonapigatewayv2.model.transform;

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
import com.amazonaws.services.amazonapigatewayv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for GetRouteResponseRequest
 */
public class GetRouteResponseRequestMarshaller implements
        Marshaller<Request<GetRouteResponseRequest>, GetRouteResponseRequest> {

    public Request<GetRouteResponseRequest> marshall(GetRouteResponseRequest getRouteResponseRequest) {
        if (getRouteResponseRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetRouteResponseRequest)");
        }

        Request<GetRouteResponseRequest> request = new DefaultRequest<GetRouteResponseRequest>(
                getRouteResponseRequest, "AmazonApiGatewayV2");
        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/v2/apis/{apiId}/routes/{routeId}/routeresponses/{routeResponseId}";
        uriResourcePath = uriResourcePath.replace(
                "{apiId}",
                (getRouteResponseRequest.getApiId() == null) ? "" : StringUtils
                        .fromString(getRouteResponseRequest.getApiId()));
        uriResourcePath = uriResourcePath.replace(
                "{routeId}",
                (getRouteResponseRequest.getRouteId() == null) ? "" : StringUtils
                        .fromString(getRouteResponseRequest.getRouteId()));
        uriResourcePath = uriResourcePath.replace(
                "{routeResponseId}",
                (getRouteResponseRequest.getRouteResponseId() == null) ? "" : StringUtils
                        .fromString(getRouteResponseRequest.getRouteResponseId()));
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
