/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

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
import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for ListAuthorizersRequest
 */
public class ListAuthorizersRequestMarshaller implements
        Marshaller<Request<ListAuthorizersRequest>, ListAuthorizersRequest> {

    public Request<ListAuthorizersRequest> marshall(ListAuthorizersRequest listAuthorizersRequest) {
        if (listAuthorizersRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListAuthorizersRequest)");
        }

        Request<ListAuthorizersRequest> request = new DefaultRequest<ListAuthorizersRequest>(
                listAuthorizersRequest, "AWSIot");
        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/authorizers/";
        if (listAuthorizersRequest.getPageSize() != null) {
            request.addParameter("pageSize",
                    StringUtils.fromInteger(listAuthorizersRequest.getPageSize()));
        }
        if (listAuthorizersRequest.getMarker() != null) {
            request.addParameter("marker",
                    StringUtils.fromString(listAuthorizersRequest.getMarker()));
        }
        if (listAuthorizersRequest.getAscendingOrder() != null) {
            request.addParameter("isAscendingOrder",
                    StringUtils.fromBoolean(listAuthorizersRequest.getAscendingOrder()));
        }
        if (listAuthorizersRequest.getStatus() != null) {
            request.addParameter("status",
                    StringUtils.fromString(listAuthorizersRequest.getStatus()));
        }
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
