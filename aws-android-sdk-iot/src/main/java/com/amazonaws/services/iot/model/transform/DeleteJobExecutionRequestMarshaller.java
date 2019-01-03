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
 * JSON request marshaller for DeleteJobExecutionRequest
 */
public class DeleteJobExecutionRequestMarshaller implements
        Marshaller<Request<DeleteJobExecutionRequest>, DeleteJobExecutionRequest> {

    public Request<DeleteJobExecutionRequest> marshall(
            DeleteJobExecutionRequest deleteJobExecutionRequest) {
        if (deleteJobExecutionRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DeleteJobExecutionRequest)");
        }

        Request<DeleteJobExecutionRequest> request = new DefaultRequest<DeleteJobExecutionRequest>(
                deleteJobExecutionRequest, "AWSIot");
        request.setHttpMethod(HttpMethodName.DELETE);

        String uriResourcePath = "/things/{thingName}/jobs/{jobId}/executionNumber/{executionNumber}";
        uriResourcePath = uriResourcePath.replace(
                "{jobId}",
                (deleteJobExecutionRequest.getJobId() == null) ? "" : StringUtils
                        .fromString(deleteJobExecutionRequest.getJobId()));
        uriResourcePath = uriResourcePath.replace(
                "{thingName}",
                (deleteJobExecutionRequest.getThingName() == null) ? "" : StringUtils
                        .fromString(deleteJobExecutionRequest.getThingName()));
        uriResourcePath = uriResourcePath.replace(
                "{executionNumber}",
                (deleteJobExecutionRequest.getExecutionNumber() == null) ? "" : StringUtils
                        .fromLong(deleteJobExecutionRequest.getExecutionNumber()));
        if (deleteJobExecutionRequest.getForce() != null) {
            request.addParameter("force",
                    StringUtils.fromBoolean(deleteJobExecutionRequest.getForce()));
        }
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
