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
 * StAX request marshaller for PutAccessPointPolicyRequest
 */
public class PutAccessPointPolicyRequestMarshaller implements Marshaller<Request<PutAccessPointPolicyRequest>, PutAccessPointPolicyRequest> {

    public Request<PutAccessPointPolicyRequest> marshall(PutAccessPointPolicyRequest putAccessPointPolicyRequest) {
        if (putAccessPointPolicyRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(PutAccessPointPolicyRequest)");
        }

        Request<PutAccessPointPolicyRequest> request = new DefaultRequest<PutAccessPointPolicyRequest>(putAccessPointPolicyRequest, "AWSS3Control");
        request.addParameter("Action", "PutAccessPointPolicy");
        request.addParameter("Version", "2018-08-20");

        String prefix;
        if (putAccessPointPolicyRequest.getAccountId() != null) {
            prefix = "x-amz-account-id";
            String accountId = putAccessPointPolicyRequest.getAccountId();
            request.addParameter(prefix, StringUtils.fromString(accountId));
        }
        if (putAccessPointPolicyRequest.getName() != null) {
            prefix = "name";
            String name = putAccessPointPolicyRequest.getName();
            request.addParameter(prefix, StringUtils.fromString(name));
        }
        if (putAccessPointPolicyRequest.getPolicy() != null) {
            prefix = "Policy";
            String policy = putAccessPointPolicyRequest.getPolicy();
            request.addParameter(prefix, StringUtils.fromString(policy));
        }

        return request;
    }
}
