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

package com.amazonaws.services.s3.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.s3.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO TargetGrant
 */
class TargetGrantStaxMarshaller {

    public void marshall(TargetGrant _targetGrant, Request<?> request, String _prefix) {
        String prefix;
        if (_targetGrant.getGrantee() != null) {
            prefix = _prefix + "Grantee";
            Grantee grantee = _targetGrant.getGrantee();
            GranteeStaxMarshaller.getInstance().marshall(grantee, request, prefix + ".");
        }
        if (_targetGrant.getPermission() != null) {
            prefix = _prefix + "Permission";
            String permission = _targetGrant.getPermission();
            request.addParameter(prefix, StringUtils.fromString(permission));
        }
    }

    private static TargetGrantStaxMarshaller instance;

    public static TargetGrantStaxMarshaller getInstance() {
        if (instance == null)
            instance = new TargetGrantStaxMarshaller();
        return instance;
    }
}
