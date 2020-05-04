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
 * StAX request marshaller for GetAccessPointRequest
 */
public class GetAccessPointRequestMarshaller implements Marshaller<Request<GetAccessPointRequest>, GetAccessPointRequest> {

    public Request<GetAccessPointRequest> marshall(GetAccessPointRequest getAccessPointRequest) {
        if (getAccessPointRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(GetAccessPointRequest)");
        }

        Request<GetAccessPointRequest> request = new DefaultRequest<GetAccessPointRequest>(getAccessPointRequest, "AWSS3Control");
        request.addParameter("Action", "GetAccessPoint");
        request.addParameter("Version", "2018-08-20");

        String prefix;
        if (getAccessPointRequest.getAccountId() != null) {
            prefix = "x-amz-account-id";
            String accountId = getAccessPointRequest.getAccountId();
            request.addParameter(prefix, StringUtils.fromString(accountId));
        }
        if (getAccessPointRequest.getName() != null) {
            prefix = "name";
            String name = getAccessPointRequest.getName();
            request.addParameter(prefix, StringUtils.fromString(name));
        }

        return request;
    }
}
