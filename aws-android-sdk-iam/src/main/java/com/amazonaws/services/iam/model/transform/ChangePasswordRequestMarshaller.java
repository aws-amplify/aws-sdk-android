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
 * StAX request marshaller for ChangePasswordRequest
 */
public class ChangePasswordRequestMarshaller implements
        Marshaller<Request<ChangePasswordRequest>, ChangePasswordRequest> {

    public Request<ChangePasswordRequest> marshall(ChangePasswordRequest changePasswordRequest) {
        if (changePasswordRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ChangePasswordRequest)");
        }

        Request<ChangePasswordRequest> request = new DefaultRequest<ChangePasswordRequest>(
                changePasswordRequest, "AWSIdentityandAccessManagement");
        request.addParameter("Action", "ChangePassword");
        request.addParameter("Version", "2010-05-08");

        String prefix;
        if (changePasswordRequest.getOldPassword() != null) {
            prefix = "OldPassword";
            String oldPassword = changePasswordRequest.getOldPassword();
            request.addParameter(prefix, StringUtils.fromString(oldPassword));
        }
        if (changePasswordRequest.getNewPassword() != null) {
            prefix = "NewPassword";
            String newPassword = changePasswordRequest.getNewPassword();
            request.addParameter(prefix, StringUtils.fromString(newPassword));
        }

        return request;
    }
}
