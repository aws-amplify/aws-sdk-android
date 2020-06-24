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
 * StAX marshaller for POJO LoginProfile
 */
class LoginProfileStaxMarshaller {

    public void marshall(LoginProfile _loginProfile, Request<?> request, String _prefix) {
        String prefix;
        if (_loginProfile.getUserName() != null) {
            prefix = _prefix + "UserName";
            String userName = _loginProfile.getUserName();
            request.addParameter(prefix, StringUtils.fromString(userName));
        }
        if (_loginProfile.getCreateDate() != null) {
            prefix = _prefix + "CreateDate";
            java.util.Date createDate = _loginProfile.getCreateDate();
            request.addParameter(prefix, StringUtils.fromDate(createDate));
        }
        if (_loginProfile.getPasswordResetRequired() != null) {
            prefix = _prefix + "PasswordResetRequired";
            Boolean passwordResetRequired = _loginProfile.getPasswordResetRequired();
            request.addParameter(prefix, StringUtils.fromBoolean(passwordResetRequired));
        }
    }

    private static LoginProfileStaxMarshaller instance;

    public static LoginProfileStaxMarshaller getInstance() {
        if (instance == null)
            instance = new LoginProfileStaxMarshaller();
        return instance;
    }
}
