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
 * StAX request marshaller for UpdateGroupRequest
 */
public class UpdateGroupRequestMarshaller implements
        Marshaller<Request<UpdateGroupRequest>, UpdateGroupRequest> {

    public Request<UpdateGroupRequest> marshall(UpdateGroupRequest updateGroupRequest) {
        if (updateGroupRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateGroupRequest)");
        }

        Request<UpdateGroupRequest> request = new DefaultRequest<UpdateGroupRequest>(
                updateGroupRequest, "AWSIdentityandAccessManagement");
        request.addParameter("Action", "UpdateGroup");
        request.addParameter("Version", "2010-05-08");

        String prefix;
        if (updateGroupRequest.getGroupName() != null) {
            prefix = "GroupName";
            String groupName = updateGroupRequest.getGroupName();
            request.addParameter(prefix, StringUtils.fromString(groupName));
        }
        if (updateGroupRequest.getNewPath() != null) {
            prefix = "NewPath";
            String newPath = updateGroupRequest.getNewPath();
            request.addParameter(prefix, StringUtils.fromString(newPath));
        }
        if (updateGroupRequest.getNewGroupName() != null) {
            prefix = "NewGroupName";
            String newGroupName = updateGroupRequest.getNewGroupName();
            request.addParameter(prefix, StringUtils.fromString(newGroupName));
        }

        return request;
    }
}
