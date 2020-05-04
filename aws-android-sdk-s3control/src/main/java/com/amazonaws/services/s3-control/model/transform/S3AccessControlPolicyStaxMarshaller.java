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
package com.amazonaws.services.s3-control.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.s3-control.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO S3AccessControlPolicy
 */
class S3AccessControlPolicyStaxMarshaller {

    public void marshall(S3AccessControlPolicy _s3AccessControlPolicy, Request<?> request, String _prefix) {
        String prefix;
        if (_s3AccessControlPolicy.getAccessControlList() != null) {
            prefix = _prefix + "AccessControlList";
            S3AccessControlList accessControlList = _s3AccessControlPolicy.getAccessControlList();
            S3AccessControlListStaxMarshaller.getInstance().marshall(accessControlList, request, prefix + ".");
        }
        if (_s3AccessControlPolicy.getCannedAccessControlList() != null) {
            prefix = _prefix + "CannedAccessControlList";
            String cannedAccessControlList = _s3AccessControlPolicy.getCannedAccessControlList();
            request.addParameter(prefix, StringUtils.fromString(cannedAccessControlList));
        }
    }

    private static S3AccessControlPolicyStaxMarshaller instance;
    public static S3AccessControlPolicyStaxMarshaller getInstance() {
        if (instance == null) instance = new S3AccessControlPolicyStaxMarshaller();
        return instance;
    }
}
