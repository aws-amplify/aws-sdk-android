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
 * StAX marshaller for POJO Grant
 */
class GrantStaxMarshaller {

    public void marshall(Grant _grant, Request<?> request, String _prefix) {
        String prefix;
        if (_grant.getGrantee() != null) {
            prefix = _prefix + "Grantee";
            Grantee grantee = _grant.getGrantee();
            GranteeStaxMarshaller.getInstance().marshall(grantee, request, prefix + ".");
        }
        if (_grant.getPermission() != null) {
            prefix = _prefix + "Permission";
            String permission = _grant.getPermission();
            request.addParameter(prefix, StringUtils.fromString(permission));
        }
    }

    private static GrantStaxMarshaller instance;

    public static GrantStaxMarshaller getInstance() {
        if (instance == null)
            instance = new GrantStaxMarshaller();
        return instance;
    }
}
