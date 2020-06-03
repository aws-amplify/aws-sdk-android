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

package com.amazonaws.services.iam.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.iam.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for ListServiceSpecificCredentialsRequest
 */
public class ListServiceSpecificCredentialsRequestMarshaller
        implements
        Marshaller<Request<ListServiceSpecificCredentialsRequest>, ListServiceSpecificCredentialsRequest> {

    public Request<ListServiceSpecificCredentialsRequest> marshall(
            ListServiceSpecificCredentialsRequest listServiceSpecificCredentialsRequest) {
        if (listServiceSpecificCredentialsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListServiceSpecificCredentialsRequest)");
        }

        Request<ListServiceSpecificCredentialsRequest> request = new DefaultRequest<ListServiceSpecificCredentialsRequest>(
                listServiceSpecificCredentialsRequest, "AWSIdentityandAccessManagement");
        request.addParameter("Action", "ListServiceSpecificCredentials");
        request.addParameter("Version", "2010-05-08");

        String prefix;
        if (listServiceSpecificCredentialsRequest.getUserName() != null) {
            prefix = "UserName";
            String userName = listServiceSpecificCredentialsRequest.getUserName();
            request.addParameter(prefix, StringUtils.fromString(userName));
        }
        if (listServiceSpecificCredentialsRequest.getServiceName() != null) {
            prefix = "ServiceName";
            String serviceName = listServiceSpecificCredentialsRequest.getServiceName();
            request.addParameter(prefix, StringUtils.fromString(serviceName));
        }

        return request;
    }
}
