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
 * StAX request marshaller for ListJobsRequest
 */
public class ListJobsRequestMarshaller implements Marshaller<Request<ListJobsRequest>, ListJobsRequest> {

    public Request<ListJobsRequest> marshall(ListJobsRequest listJobsRequest) {
        if (listJobsRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(ListJobsRequest)");
        }

        Request<ListJobsRequest> request = new DefaultRequest<ListJobsRequest>(listJobsRequest, "AWSS3Control");
        request.addParameter("Action", "ListJobs");
        request.addParameter("Version", "2018-08-20");

        String prefix;
        if (listJobsRequest.getAccountId() != null) {
            prefix = "x-amz-account-id";
            String accountId = listJobsRequest.getAccountId();
            request.addParameter(prefix, StringUtils.fromString(accountId));
        }
        if (listJobsRequest.getJobStatuses() != null) {
            prefix = "jobStatuses";
            java.util.List<String> jobStatuses = listJobsRequest.getJobStatuses();
            int jobStatusesIndex = 1;
            String jobStatusesPrefix = prefix;
            for (String jobStatusesItem : jobStatuses) {
                prefix = jobStatusesPrefix + ".member." + jobStatusesIndex;
                if (jobStatusesItem != null) {
            request.addParameter(prefix, StringUtils.fromString(jobStatusesItem));
                    }
                jobStatusesIndex ++;
            }
            prefix = jobStatusesPrefix;
        }
        if (listJobsRequest.getNextToken() != null) {
            prefix = "nextToken";
            String nextToken = listJobsRequest.getNextToken();
            request.addParameter(prefix, StringUtils.fromString(nextToken));
        }
        if (listJobsRequest.getMaxResults() != null) {
            prefix = "maxResults";
            Integer maxResults = listJobsRequest.getMaxResults();
            request.addParameter(prefix, StringUtils.fromInteger(maxResults));
        }

        return request;
    }
}
