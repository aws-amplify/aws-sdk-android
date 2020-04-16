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

package com.amazonaws.services.amazonrelationaldatabaseservice.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.amazonrelationaldatabaseservice.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO UserAuthConfigInfo
 */
class UserAuthConfigInfoStaxMarshaller {

    public void marshall(UserAuthConfigInfo _userAuthConfigInfo, Request<?> request, String _prefix) {
        String prefix;
        if (_userAuthConfigInfo.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _userAuthConfigInfo.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (_userAuthConfigInfo.getUserName() != null) {
            prefix = _prefix + "UserName";
            String userName = _userAuthConfigInfo.getUserName();
            request.addParameter(prefix, StringUtils.fromString(userName));
        }
        if (_userAuthConfigInfo.getAuthScheme() != null) {
            prefix = _prefix + "AuthScheme";
            String authScheme = _userAuthConfigInfo.getAuthScheme();
            request.addParameter(prefix, StringUtils.fromString(authScheme));
        }
        if (_userAuthConfigInfo.getSecretArn() != null) {
            prefix = _prefix + "SecretArn";
            String secretArn = _userAuthConfigInfo.getSecretArn();
            request.addParameter(prefix, StringUtils.fromString(secretArn));
        }
        if (_userAuthConfigInfo.getIAMAuth() != null) {
            prefix = _prefix + "IAMAuth";
            String iAMAuth = _userAuthConfigInfo.getIAMAuth();
            request.addParameter(prefix, StringUtils.fromString(iAMAuth));
        }
    }

    private static UserAuthConfigInfoStaxMarshaller instance;

    public static UserAuthConfigInfoStaxMarshaller getInstance() {
        if (instance == null)
            instance = new UserAuthConfigInfoStaxMarshaller();
        return instance;
    }
}
