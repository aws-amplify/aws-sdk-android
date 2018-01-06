/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model.transform;

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
import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for GetSegmentImportJobsRequest
 */
public class GetSegmentImportJobsRequestMarshaller implements
        Marshaller<Request<GetSegmentImportJobsRequest>, GetSegmentImportJobsRequest> {

    public Request<GetSegmentImportJobsRequest> marshall(
            GetSegmentImportJobsRequest getSegmentImportJobsRequest) {
        if (getSegmentImportJobsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetSegmentImportJobsRequest)");
        }

        Request<GetSegmentImportJobsRequest> request = new DefaultRequest<GetSegmentImportJobsRequest>(
                getSegmentImportJobsRequest, "AmazonPinpoint");
        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/v1/apps/{application-id}/segments/{segment-id}/jobs/import";
        uriResourcePath = uriResourcePath.replace(
                "{application-id}",
                (getSegmentImportJobsRequest.getApplicationId() == null) ? "" : StringUtils
                        .fromString(getSegmentImportJobsRequest.getApplicationId()));
        if (getSegmentImportJobsRequest.getPageSize() != null) {
            request.addParameter("page-size",
                    StringUtils.fromString(getSegmentImportJobsRequest.getPageSize()));
        }
        uriResourcePath = uriResourcePath.replace(
                "{segment-id}",
                (getSegmentImportJobsRequest.getSegmentId() == null) ? "" : StringUtils
                        .fromString(getSegmentImportJobsRequest.getSegmentId()));
        if (getSegmentImportJobsRequest.getToken() != null) {
            request.addParameter("token",
                    StringUtils.fromString(getSegmentImportJobsRequest.getToken()));
        }
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
