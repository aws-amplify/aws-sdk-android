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

package com.amazonaws.services.backup.model.transform;

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
import com.amazonaws.services.backup.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for ListRestoreJobsRequest
 */
public class ListRestoreJobsRequestMarshaller implements
        Marshaller<Request<ListRestoreJobsRequest>, ListRestoreJobsRequest> {

    public Request<ListRestoreJobsRequest> marshall(ListRestoreJobsRequest listRestoreJobsRequest) {
        if (listRestoreJobsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListRestoreJobsRequest)");
        }

        Request<ListRestoreJobsRequest> request = new DefaultRequest<ListRestoreJobsRequest>(
                listRestoreJobsRequest, "AWSBackup");
        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/restore-jobs/";
        if (listRestoreJobsRequest.getNextToken() != null) {
            request.addParameter("nextToken",
                    StringUtils.fromString(listRestoreJobsRequest.getNextToken()));
        }
        if (listRestoreJobsRequest.getMaxResults() != null) {
            request.addParameter("maxResults",
                    StringUtils.fromInteger(listRestoreJobsRequest.getMaxResults()));
        }
        if (listRestoreJobsRequest.getByAccountId() != null) {
            request.addParameter("accountId",
                    StringUtils.fromString(listRestoreJobsRequest.getByAccountId()));
        }
        if (listRestoreJobsRequest.getByCreatedBefore() != null) {
            request.addParameter("createdBefore",
                    StringUtils.fromDate(listRestoreJobsRequest.getByCreatedBefore()));
        }
        if (listRestoreJobsRequest.getByCreatedAfter() != null) {
            request.addParameter("createdAfter",
                    StringUtils.fromDate(listRestoreJobsRequest.getByCreatedAfter()));
        }
        if (listRestoreJobsRequest.getByStatus() != null) {
            request.addParameter("status",
                    StringUtils.fromString(listRestoreJobsRequest.getByStatus()));
        }
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
