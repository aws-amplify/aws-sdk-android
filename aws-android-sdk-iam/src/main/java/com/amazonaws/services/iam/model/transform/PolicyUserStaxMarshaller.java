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
 * StAX marshaller for POJO PolicyUser
 */
class PolicyUserStaxMarshaller {

    public void marshall(PolicyUser _policyUser, Request<?> request, String _prefix) {
        String prefix;
        if (_policyUser.getUserName() != null) {
            prefix = _prefix + "UserName";
            String userName = _policyUser.getUserName();
            request.addParameter(prefix, StringUtils.fromString(userName));
        }
        if (_policyUser.getUserId() != null) {
            prefix = _prefix + "UserId";
            String userId = _policyUser.getUserId();
            request.addParameter(prefix, StringUtils.fromString(userId));
        }
    }

    private static PolicyUserStaxMarshaller instance;

    public static PolicyUserStaxMarshaller getInstance() {
        if (instance == null)
            instance = new PolicyUserStaxMarshaller();
        return instance;
    }
}
