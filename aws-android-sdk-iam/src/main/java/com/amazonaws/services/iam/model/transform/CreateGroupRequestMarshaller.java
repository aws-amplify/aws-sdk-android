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
 * StAX request marshaller for CreateGroupRequest
 */
public class CreateGroupRequestMarshaller implements
        Marshaller<Request<CreateGroupRequest>, CreateGroupRequest> {

    public Request<CreateGroupRequest> marshall(CreateGroupRequest createGroupRequest) {
        if (createGroupRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateGroupRequest)");
        }

        Request<CreateGroupRequest> request = new DefaultRequest<CreateGroupRequest>(
                createGroupRequest, "AWSIdentityandAccessManagement");
        request.addParameter("Action", "CreateGroup");
        request.addParameter("Version", "2010-05-08");

        String prefix;
        if (createGroupRequest.getPath() != null) {
            prefix = "Path";
            String path = createGroupRequest.getPath();
            request.addParameter(prefix, StringUtils.fromString(path));
        }
        if (createGroupRequest.getGroupName() != null) {
            prefix = "GroupName";
            String groupName = createGroupRequest.getGroupName();
            request.addParameter(prefix, StringUtils.fromString(groupName));
        }

        return request;
    }
}
