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

package com.amazonaws.services.sagemakerruntime.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.sagemakerruntime.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;

/**
 * JSON request marshaller for InvokeEndpointRequest
 */
public class InvokeEndpointRequestMarshaller implements
        Marshaller<Request<InvokeEndpointRequest>, InvokeEndpointRequest> {

    public Request<InvokeEndpointRequest> marshall(InvokeEndpointRequest invokeEndpointRequest) {
        if (invokeEndpointRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(InvokeEndpointRequest)");
        }

        Request<InvokeEndpointRequest> request = new DefaultRequest<InvokeEndpointRequest>(
                invokeEndpointRequest, "AmazonSageMakerRuntime");
        request.setHttpMethod(HttpMethodName.POST);

        if (invokeEndpointRequest.getContentType() != null) {
            request.addHeader("Content-Type",
                    StringUtils.fromString(invokeEndpointRequest.getContentType()));
        }
        if (invokeEndpointRequest.getAccept() != null) {
            request.addHeader("Accept", StringUtils.fromString(invokeEndpointRequest.getAccept()));
        }
        if (invokeEndpointRequest.getCustomAttributes() != null) {
            request.addHeader("X-Amzn-SageMaker-Custom-Attributes",
                    StringUtils.fromString(invokeEndpointRequest.getCustomAttributes()));
        }
        String uriResourcePath = "/endpoints/{EndpointName}/invocations";
        uriResourcePath = uriResourcePath.replace(
                "{EndpointName}",
                (invokeEndpointRequest.getEndpointName() == null) ? "" : StringUtils
                        .fromString(invokeEndpointRequest.getEndpointName()));
        request.setResourcePath(uriResourcePath);
        request.addHeader("Content-Length",
                Integer.toString(invokeEndpointRequest.getBody().remaining()));
        request.setContent(BinaryUtils.toStream(invokeEndpointRequest.getBody()));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
