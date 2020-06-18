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

package com.amazonaws.services.rds.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO UserAuthConfig
 */
class UserAuthConfigStaxMarshaller {

    public void marshall(UserAuthConfig _userAuthConfig, Request<?> request, String _prefix) {
        String prefix;
        if (_userAuthConfig.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _userAuthConfig.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (_userAuthConfig.getUserName() != null) {
            prefix = _prefix + "UserName";
            String userName = _userAuthConfig.getUserName();
            request.addParameter(prefix, StringUtils.fromString(userName));
        }
        if (_userAuthConfig.getAuthScheme() != null) {
            prefix = _prefix + "AuthScheme";
            String authScheme = _userAuthConfig.getAuthScheme();
            request.addParameter(prefix, StringUtils.fromString(authScheme));
        }
        if (_userAuthConfig.getSecretArn() != null) {
            prefix = _prefix + "SecretArn";
            String secretArn = _userAuthConfig.getSecretArn();
            request.addParameter(prefix, StringUtils.fromString(secretArn));
        }
        if (_userAuthConfig.getIAMAuth() != null) {
            prefix = _prefix + "IAMAuth";
            String iAMAuth = _userAuthConfig.getIAMAuth();
            request.addParameter(prefix, StringUtils.fromString(iAMAuth));
        }
    }

    private static UserAuthConfigStaxMarshaller instance;

    public static UserAuthConfigStaxMarshaller getInstance() {
        if (instance == null)
            instance = new UserAuthConfigStaxMarshaller();
        return instance;
    }
}
