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
 * StAX marshaller for POJO AttachedPolicy
 */
class AttachedPolicyStaxMarshaller {

    public void marshall(AttachedPolicy _attachedPolicy, Request<?> request, String _prefix) {
        String prefix;
        if (_attachedPolicy.getPolicyName() != null) {
            prefix = _prefix + "PolicyName";
            String policyName = _attachedPolicy.getPolicyName();
            request.addParameter(prefix, StringUtils.fromString(policyName));
        }
        if (_attachedPolicy.getPolicyArn() != null) {
            prefix = _prefix + "PolicyArn";
            String policyArn = _attachedPolicy.getPolicyArn();
            request.addParameter(prefix, StringUtils.fromString(policyArn));
        }
    }

    private static AttachedPolicyStaxMarshaller instance;

    public static AttachedPolicyStaxMarshaller getInstance() {
        if (instance == null)
            instance = new AttachedPolicyStaxMarshaller();
        return instance;
    }
}
