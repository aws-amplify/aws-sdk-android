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
 * StAX request marshaller for DeleteJobTaggingRequest
 */
public class DeleteJobTaggingRequestMarshaller implements Marshaller<Request<DeleteJobTaggingRequest>, DeleteJobTaggingRequest> {

    public Request<DeleteJobTaggingRequest> marshall(DeleteJobTaggingRequest deleteJobTaggingRequest) {
        if (deleteJobTaggingRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(DeleteJobTaggingRequest)");
        }

        Request<DeleteJobTaggingRequest> request = new DefaultRequest<DeleteJobTaggingRequest>(deleteJobTaggingRequest, "AWSS3Control");
        request.addParameter("Action", "DeleteJobTagging");
        request.addParameter("Version", "2018-08-20");

        String prefix;
        if (deleteJobTaggingRequest.getAccountId() != null) {
            prefix = "x-amz-account-id";
            String accountId = deleteJobTaggingRequest.getAccountId();
            request.addParameter(prefix, StringUtils.fromString(accountId));
        }
        if (deleteJobTaggingRequest.getJobId() != null) {
            prefix = "id";
            String jobId = deleteJobTaggingRequest.getJobId();
            request.addParameter(prefix, StringUtils.fromString(jobId));
        }

        return request;
    }
}
