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
 * StAX request marshaller for UpdateAccountPasswordPolicyRequest
 */
public class UpdateAccountPasswordPolicyRequestMarshaller implements
        Marshaller<Request<UpdateAccountPasswordPolicyRequest>, UpdateAccountPasswordPolicyRequest> {

    public Request<UpdateAccountPasswordPolicyRequest> marshall(
            UpdateAccountPasswordPolicyRequest updateAccountPasswordPolicyRequest) {
        if (updateAccountPasswordPolicyRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateAccountPasswordPolicyRequest)");
        }

        Request<UpdateAccountPasswordPolicyRequest> request = new DefaultRequest<UpdateAccountPasswordPolicyRequest>(
                updateAccountPasswordPolicyRequest, "AWSIdentityandAccessManagement");
        request.addParameter("Action", "UpdateAccountPasswordPolicy");
        request.addParameter("Version", "2010-05-08");

        String prefix;
        if (updateAccountPasswordPolicyRequest.getMinimumPasswordLength() != null) {
            prefix = "MinimumPasswordLength";
            Integer minimumPasswordLength = updateAccountPasswordPolicyRequest
                    .getMinimumPasswordLength();
            request.addParameter(prefix, StringUtils.fromInteger(minimumPasswordLength));
        }
        if (updateAccountPasswordPolicyRequest.getRequireSymbols() != null) {
            prefix = "RequireSymbols";
            Boolean requireSymbols = updateAccountPasswordPolicyRequest.getRequireSymbols();
            request.addParameter(prefix, StringUtils.fromBoolean(requireSymbols));
        }
        if (updateAccountPasswordPolicyRequest.getRequireNumbers() != null) {
            prefix = "RequireNumbers";
            Boolean requireNumbers = updateAccountPasswordPolicyRequest.getRequireNumbers();
            request.addParameter(prefix, StringUtils.fromBoolean(requireNumbers));
        }
        if (updateAccountPasswordPolicyRequest.getRequireUppercaseCharacters() != null) {
            prefix = "RequireUppercaseCharacters";
            Boolean requireUppercaseCharacters = updateAccountPasswordPolicyRequest
                    .getRequireUppercaseCharacters();
            request.addParameter(prefix, StringUtils.fromBoolean(requireUppercaseCharacters));
        }
        if (updateAccountPasswordPolicyRequest.getRequireLowercaseCharacters() != null) {
            prefix = "RequireLowercaseCharacters";
            Boolean requireLowercaseCharacters = updateAccountPasswordPolicyRequest
                    .getRequireLowercaseCharacters();
            request.addParameter(prefix, StringUtils.fromBoolean(requireLowercaseCharacters));
        }
        if (updateAccountPasswordPolicyRequest.getAllowUsersToChangePassword() != null) {
            prefix = "AllowUsersToChangePassword";
            Boolean allowUsersToChangePassword = updateAccountPasswordPolicyRequest
                    .getAllowUsersToChangePassword();
            request.addParameter(prefix, StringUtils.fromBoolean(allowUsersToChangePassword));
        }
        if (updateAccountPasswordPolicyRequest.getMaxPasswordAge() != null) {
            prefix = "MaxPasswordAge";
            Integer maxPasswordAge = updateAccountPasswordPolicyRequest.getMaxPasswordAge();
            request.addParameter(prefix, StringUtils.fromInteger(maxPasswordAge));
        }
        if (updateAccountPasswordPolicyRequest.getPasswordReusePrevention() != null) {
            prefix = "PasswordReusePrevention";
            Integer passwordReusePrevention = updateAccountPasswordPolicyRequest
                    .getPasswordReusePrevention();
            request.addParameter(prefix, StringUtils.fromInteger(passwordReusePrevention));
        }
        if (updateAccountPasswordPolicyRequest.getHardExpiry() != null) {
            prefix = "HardExpiry";
            Boolean hardExpiry = updateAccountPasswordPolicyRequest.getHardExpiry();
            request.addParameter(prefix, StringUtils.fromBoolean(hardExpiry));
        }

        return request;
    }
}
