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
 * JSON request marshaller for ListCopyJobsRequest
 */
public class ListCopyJobsRequestMarshaller implements
        Marshaller<Request<ListCopyJobsRequest>, ListCopyJobsRequest> {

    public Request<ListCopyJobsRequest> marshall(ListCopyJobsRequest listCopyJobsRequest) {
        if (listCopyJobsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListCopyJobsRequest)");
        }

        Request<ListCopyJobsRequest> request = new DefaultRequest<ListCopyJobsRequest>(
                listCopyJobsRequest, "AWSBackup");
        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/copy-jobs/";
        if (listCopyJobsRequest.getNextToken() != null) {
            request.addParameter("nextToken",
                    StringUtils.fromString(listCopyJobsRequest.getNextToken()));
        }
        if (listCopyJobsRequest.getMaxResults() != null) {
            request.addParameter("maxResults",
                    StringUtils.fromInteger(listCopyJobsRequest.getMaxResults()));
        }
        if (listCopyJobsRequest.getByResourceArn() != null) {
            request.addParameter("resourceArn",
                    StringUtils.fromString(listCopyJobsRequest.getByResourceArn()));
        }
        if (listCopyJobsRequest.getByState() != null) {
            request.addParameter("state", StringUtils.fromString(listCopyJobsRequest.getByState()));
        }
        if (listCopyJobsRequest.getByCreatedBefore() != null) {
            request.addParameter("createdBefore",
                    StringUtils.fromDate(listCopyJobsRequest.getByCreatedBefore()));
        }
        if (listCopyJobsRequest.getByCreatedAfter() != null) {
            request.addParameter("createdAfter",
                    StringUtils.fromDate(listCopyJobsRequest.getByCreatedAfter()));
        }
        if (listCopyJobsRequest.getByResourceType() != null) {
            request.addParameter("resourceType",
                    StringUtils.fromString(listCopyJobsRequest.getByResourceType()));
        }
        if (listCopyJobsRequest.getByDestinationVaultArn() != null) {
            request.addParameter("destinationVaultArn",
                    StringUtils.fromString(listCopyJobsRequest.getByDestinationVaultArn()));
        }
        if (listCopyJobsRequest.getByAccountId() != null) {
            request.addParameter("accountId",
                    StringUtils.fromString(listCopyJobsRequest.getByAccountId()));
        }
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
