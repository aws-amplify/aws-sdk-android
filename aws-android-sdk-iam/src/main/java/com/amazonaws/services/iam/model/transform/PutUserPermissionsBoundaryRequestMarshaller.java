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
 * StAX request marshaller for PutUserPermissionsBoundaryRequest
 */
public class PutUserPermissionsBoundaryRequestMarshaller implements
        Marshaller<Request<PutUserPermissionsBoundaryRequest>, PutUserPermissionsBoundaryRequest> {

    public Request<PutUserPermissionsBoundaryRequest> marshall(
            PutUserPermissionsBoundaryRequest putUserPermissionsBoundaryRequest) {
        if (putUserPermissionsBoundaryRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(PutUserPermissionsBoundaryRequest)");
        }

        Request<PutUserPermissionsBoundaryRequest> request = new DefaultRequest<PutUserPermissionsBoundaryRequest>(
                putUserPermissionsBoundaryRequest, "AWSIdentityandAccessManagement");
        request.addParameter("Action", "PutUserPermissionsBoundary");
        request.addParameter("Version", "2010-05-08");

        String prefix;
        if (putUserPermissionsBoundaryRequest.getUserName() != null) {
            prefix = "UserName";
            String userName = putUserPermissionsBoundaryRequest.getUserName();
            request.addParameter(prefix, StringUtils.fromString(userName));
        }
        if (putUserPermissionsBoundaryRequest.getPermissionsBoundary() != null) {
            prefix = "PermissionsBoundary";
            String permissionsBoundary = putUserPermissionsBoundaryRequest.getPermissionsBoundary();
            request.addParameter(prefix, StringUtils.fromString(permissionsBoundary));
        }

        return request;
    }
}
