/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.securitytoken.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO AssumedRoleUser
 */
class AssumedRoleUserStaxMarshaller {

    public void marshall(AssumedRoleUser _assumedRoleUser, Request<?> request, String _prefix) {
        String prefix;
        if (_assumedRoleUser.getAssumedRoleId() != null) {
            prefix = _prefix + "AssumedRoleId";
            String assumedRoleId = _assumedRoleUser.getAssumedRoleId();
            request.addParameter(prefix, StringUtils.fromString(assumedRoleId));
        }
        if (_assumedRoleUser.getArn() != null) {
            prefix = _prefix + "Arn";
            String arn = _assumedRoleUser.getArn();
            request.addParameter(prefix, StringUtils.fromString(arn));
        }
    }

    private static AssumedRoleUserStaxMarshaller instance;

    public static AssumedRoleUserStaxMarshaller getInstance() {
        if (instance == null)
            instance = new AssumedRoleUserStaxMarshaller();
        return instance;
    }
}
