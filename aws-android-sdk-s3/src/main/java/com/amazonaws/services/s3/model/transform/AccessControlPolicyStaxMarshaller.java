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
 * StAX marshaller for POJO AccessControlPolicy
 */
class AccessControlPolicyStaxMarshaller {

    public void marshall(AccessControlPolicy _accessControlPolicy, Request<?> request,
            String _prefix) {
        String prefix;
        if (_accessControlPolicy.getGrants() != null) {
            prefix = _prefix + "AccessControlList";
            java.util.List<Grant> grants = _accessControlPolicy.getGrants();
            int grantsIndex = 1;
            String grantsPrefix = prefix;
            for (Grant grantsItem : grants) {
                prefix = grantsPrefix + "." + grantsIndex;
                if (grantsItem != null) {
                    GrantStaxMarshaller.getInstance().marshall(grantsItem, request, prefix + ".");
                }
                grantsIndex++;
            }
            prefix = grantsPrefix;
        }
        if (_accessControlPolicy.getOwner() != null) {
            prefix = _prefix + "Owner";
            Owner owner = _accessControlPolicy.getOwner();
            OwnerStaxMarshaller.getInstance().marshall(owner, request, prefix + ".");
        }
    }

    private static AccessControlPolicyStaxMarshaller instance;

    public static AccessControlPolicyStaxMarshaller getInstance() {
        if (instance == null)
            instance = new AccessControlPolicyStaxMarshaller();
        return instance;
    }
}
