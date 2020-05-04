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
 * StAX request marshaller for GetAccessPointPolicyStatusRequest
 */
public class GetAccessPointPolicyStatusRequestMarshaller implements Marshaller<Request<GetAccessPointPolicyStatusRequest>, GetAccessPointPolicyStatusRequest> {

    public Request<GetAccessPointPolicyStatusRequest> marshall(GetAccessPointPolicyStatusRequest getAccessPointPolicyStatusRequest) {
        if (getAccessPointPolicyStatusRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(GetAccessPointPolicyStatusRequest)");
        }

        Request<GetAccessPointPolicyStatusRequest> request = new DefaultRequest<GetAccessPointPolicyStatusRequest>(getAccessPointPolicyStatusRequest, "AWSS3Control");
        request.addParameter("Action", "GetAccessPointPolicyStatus");
        request.addParameter("Version", "2018-08-20");

        String prefix;
        if (getAccessPointPolicyStatusRequest.getAccountId() != null) {
            prefix = "x-amz-account-id";
            String accountId = getAccessPointPolicyStatusRequest.getAccountId();
            request.addParameter(prefix, StringUtils.fromString(accountId));
        }
        if (getAccessPointPolicyStatusRequest.getName() != null) {
            prefix = "name";
            String name = getAccessPointPolicyStatusRequest.getName();
            request.addParameter(prefix, StringUtils.fromString(name));
        }

        return request;
    }
}
