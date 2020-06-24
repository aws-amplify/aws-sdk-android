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
 * StAX request marshaller for UpdateRoleDescriptionRequest
 */
public class UpdateRoleDescriptionRequestMarshaller implements
        Marshaller<Request<UpdateRoleDescriptionRequest>, UpdateRoleDescriptionRequest> {

    public Request<UpdateRoleDescriptionRequest> marshall(
            UpdateRoleDescriptionRequest updateRoleDescriptionRequest) {
        if (updateRoleDescriptionRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateRoleDescriptionRequest)");
        }

        Request<UpdateRoleDescriptionRequest> request = new DefaultRequest<UpdateRoleDescriptionRequest>(
                updateRoleDescriptionRequest, "AWSIdentityandAccessManagement");
        request.addParameter("Action", "UpdateRoleDescription");
        request.addParameter("Version", "2010-05-08");

        String prefix;
        if (updateRoleDescriptionRequest.getRoleName() != null) {
            prefix = "RoleName";
            String roleName = updateRoleDescriptionRequest.getRoleName();
            request.addParameter(prefix, StringUtils.fromString(roleName));
        }
        if (updateRoleDescriptionRequest.getDescription() != null) {
            prefix = "Description";
            String description = updateRoleDescriptionRequest.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }

        return request;
    }
}
