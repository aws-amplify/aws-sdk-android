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

import com.amazonaws.Request;
import com.amazonaws.services.iam.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO PasswordPolicy
 */
class PasswordPolicyStaxMarshaller {

    public void marshall(PasswordPolicy _passwordPolicy, Request<?> request, String _prefix) {
        String prefix;
        if (_passwordPolicy.getMinimumPasswordLength() != null) {
            prefix = _prefix + "MinimumPasswordLength";
            Integer minimumPasswordLength = _passwordPolicy.getMinimumPasswordLength();
            request.addParameter(prefix, StringUtils.fromInteger(minimumPasswordLength));
        }
        if (_passwordPolicy.getRequireSymbols() != null) {
            prefix = _prefix + "RequireSymbols";
            Boolean requireSymbols = _passwordPolicy.getRequireSymbols();
            request.addParameter(prefix, StringUtils.fromBoolean(requireSymbols));
        }
        if (_passwordPolicy.getRequireNumbers() != null) {
            prefix = _prefix + "RequireNumbers";
            Boolean requireNumbers = _passwordPolicy.getRequireNumbers();
            request.addParameter(prefix, StringUtils.fromBoolean(requireNumbers));
        }
        if (_passwordPolicy.getRequireUppercaseCharacters() != null) {
            prefix = _prefix + "RequireUppercaseCharacters";
            Boolean requireUppercaseCharacters = _passwordPolicy.getRequireUppercaseCharacters();
            request.addParameter(prefix, StringUtils.fromBoolean(requireUppercaseCharacters));
        }
        if (_passwordPolicy.getRequireLowercaseCharacters() != null) {
            prefix = _prefix + "RequireLowercaseCharacters";
            Boolean requireLowercaseCharacters = _passwordPolicy.getRequireLowercaseCharacters();
            request.addParameter(prefix, StringUtils.fromBoolean(requireLowercaseCharacters));
        }
        if (_passwordPolicy.getAllowUsersToChangePassword() != null) {
            prefix = _prefix + "AllowUsersToChangePassword";
            Boolean allowUsersToChangePassword = _passwordPolicy.getAllowUsersToChangePassword();
            request.addParameter(prefix, StringUtils.fromBoolean(allowUsersToChangePassword));
        }
        if (_passwordPolicy.getExpirePasswords() != null) {
            prefix = _prefix + "ExpirePasswords";
            Boolean expirePasswords = _passwordPolicy.getExpirePasswords();
            request.addParameter(prefix, StringUtils.fromBoolean(expirePasswords));
        }
        if (_passwordPolicy.getMaxPasswordAge() != null) {
            prefix = _prefix + "MaxPasswordAge";
            Integer maxPasswordAge = _passwordPolicy.getMaxPasswordAge();
            request.addParameter(prefix, StringUtils.fromInteger(maxPasswordAge));
        }
        if (_passwordPolicy.getPasswordReusePrevention() != null) {
            prefix = _prefix + "PasswordReusePrevention";
            Integer passwordReusePrevention = _passwordPolicy.getPasswordReusePrevention();
            request.addParameter(prefix, StringUtils.fromInteger(passwordReusePrevention));
        }
        if (_passwordPolicy.getHardExpiry() != null) {
            prefix = _prefix + "HardExpiry";
            Boolean hardExpiry = _passwordPolicy.getHardExpiry();
            request.addParameter(prefix, StringUtils.fromBoolean(hardExpiry));
        }
    }

    private static PasswordPolicyStaxMarshaller instance;

    public static PasswordPolicyStaxMarshaller getInstance() {
        if (instance == null)
            instance = new PasswordPolicyStaxMarshaller();
        return instance;
    }
}
