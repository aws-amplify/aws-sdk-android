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
 * StAX request marshaller for PutJobTaggingRequest
 */
public class PutJobTaggingRequestMarshaller implements Marshaller<Request<PutJobTaggingRequest>, PutJobTaggingRequest> {

    public Request<PutJobTaggingRequest> marshall(PutJobTaggingRequest putJobTaggingRequest) {
        if (putJobTaggingRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(PutJobTaggingRequest)");
        }

        Request<PutJobTaggingRequest> request = new DefaultRequest<PutJobTaggingRequest>(putJobTaggingRequest, "AWSS3Control");
        request.addParameter("Action", "PutJobTagging");
        request.addParameter("Version", "2018-08-20");

        String prefix;
        if (putJobTaggingRequest.getAccountId() != null) {
            prefix = "x-amz-account-id";
            String accountId = putJobTaggingRequest.getAccountId();
            request.addParameter(prefix, StringUtils.fromString(accountId));
        }
        if (putJobTaggingRequest.getJobId() != null) {
            prefix = "id";
            String jobId = putJobTaggingRequest.getJobId();
            request.addParameter(prefix, StringUtils.fromString(jobId));
        }
        if (putJobTaggingRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<S3Tag> tags = putJobTaggingRequest.getTags();
            int tagsIndex = 1;
            String tagsPrefix = prefix;
            for (S3Tag tagsItem : tags) {
                prefix = tagsPrefix + ".member." + tagsIndex;
                if (tagsItem != null) {
            S3TagStaxMarshaller.getInstance().marshall(tagsItem, request, prefix + ".");
                    }
                tagsIndex ++;
            }
            prefix = tagsPrefix;
        }

        return request;
    }
}
