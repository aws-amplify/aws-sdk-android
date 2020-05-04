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
package com.amazonaws.services.s3-control.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.s3-control.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;


/**
 * StAX request marshaller for ListAccessPointsRequest
 */
public class ListAccessPointsRequestMarshaller implements Marshaller<Request<ListAccessPointsRequest>, ListAccessPointsRequest> {

    public Request<ListAccessPointsRequest> marshall(ListAccessPointsRequest listAccessPointsRequest) {
        if (listAccessPointsRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(ListAccessPointsRequest)");
        }

        Request<ListAccessPointsRequest> request = new DefaultRequest<ListAccessPointsRequest>(listAccessPointsRequest, "AWSS3Control");
        request.addParameter("Action", "ListAccessPoints");
        request.addParameter("Version", "2018-08-20");

        String prefix;
        if (listAccessPointsRequest.getAccountId() != null) {
            prefix = "x-amz-account-id";
            String accountId = listAccessPointsRequest.getAccountId();
            request.addParameter(prefix, StringUtils.fromString(accountId));
        }
        if (listAccessPointsRequest.getBucket() != null) {
            prefix = "bucket";
            String bucket = listAccessPointsRequest.getBucket();
            request.addParameter(prefix, StringUtils.fromString(bucket));
        }
        if (listAccessPointsRequest.getNextToken() != null) {
            prefix = "nextToken";
            String nextToken = listAccessPointsRequest.getNextToken();
            request.addParameter(prefix, StringUtils.fromString(nextToken));
        }
        if (listAccessPointsRequest.getMaxResults() != null) {
            prefix = "maxResults";
            Integer maxResults = listAccessPointsRequest.getMaxResults();
            request.addParameter(prefix, StringUtils.fromInteger(maxResults));
        }

        return request;
    }
}
