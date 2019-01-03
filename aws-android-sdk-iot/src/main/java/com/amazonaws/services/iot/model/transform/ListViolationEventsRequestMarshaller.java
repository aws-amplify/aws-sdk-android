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
 * JSON request marshaller for ListViolationEventsRequest
 */
public class ListViolationEventsRequestMarshaller implements
        Marshaller<Request<ListViolationEventsRequest>, ListViolationEventsRequest> {

    public Request<ListViolationEventsRequest> marshall(
            ListViolationEventsRequest listViolationEventsRequest) {
        if (listViolationEventsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListViolationEventsRequest)");
        }

        Request<ListViolationEventsRequest> request = new DefaultRequest<ListViolationEventsRequest>(
                listViolationEventsRequest, "AWSIot");
        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/violation-events";
        if (listViolationEventsRequest.getStartTime() != null) {
            request.addParameter("startTime",
                    StringUtils.fromDate(listViolationEventsRequest.getStartTime()));
        }
        if (listViolationEventsRequest.getEndTime() != null) {
            request.addParameter("endTime",
                    StringUtils.fromDate(listViolationEventsRequest.getEndTime()));
        }
        if (listViolationEventsRequest.getThingName() != null) {
            request.addParameter("thingName",
                    StringUtils.fromString(listViolationEventsRequest.getThingName()));
        }
        if (listViolationEventsRequest.getSecurityProfileName() != null) {
            request.addParameter("securityProfileName",
                    StringUtils.fromString(listViolationEventsRequest.getSecurityProfileName()));
        }
        if (listViolationEventsRequest.getNextToken() != null) {
            request.addParameter("nextToken",
                    StringUtils.fromString(listViolationEventsRequest.getNextToken()));
        }
        if (listViolationEventsRequest.getMaxResults() != null) {
            request.addParameter("maxResults",
                    StringUtils.fromInteger(listViolationEventsRequest.getMaxResults()));
        }
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
