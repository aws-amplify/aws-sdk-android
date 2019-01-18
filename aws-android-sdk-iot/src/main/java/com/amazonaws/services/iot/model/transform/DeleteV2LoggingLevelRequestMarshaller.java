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
 * JSON request marshaller for DeleteV2LoggingLevelRequest
 */
public class DeleteV2LoggingLevelRequestMarshaller implements
        Marshaller<Request<DeleteV2LoggingLevelRequest>, DeleteV2LoggingLevelRequest> {

    public Request<DeleteV2LoggingLevelRequest> marshall(
            DeleteV2LoggingLevelRequest deleteV2LoggingLevelRequest) {
        if (deleteV2LoggingLevelRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DeleteV2LoggingLevelRequest)");
        }

        Request<DeleteV2LoggingLevelRequest> request = new DefaultRequest<DeleteV2LoggingLevelRequest>(
                deleteV2LoggingLevelRequest, "AWSIot");
        request.setHttpMethod(HttpMethodName.DELETE);

        String uriResourcePath = "/v2LoggingLevel";
        if (deleteV2LoggingLevelRequest.getTargetType() != null) {
            request.addParameter("targetType",
                    StringUtils.fromString(deleteV2LoggingLevelRequest.getTargetType()));
        }
        if (deleteV2LoggingLevelRequest.getTargetName() != null) {
            request.addParameter("targetName",
                    StringUtils.fromString(deleteV2LoggingLevelRequest.getTargetName()));
        }
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
