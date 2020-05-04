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
 * StAX marshaller for POJO S3Grant
 */
class S3GrantStaxMarshaller {

    public void marshall(S3Grant _s3Grant, Request<?> request, String _prefix) {
        String prefix;
        if (_s3Grant.getGrantee() != null) {
            prefix = _prefix + "Grantee";
            S3Grantee grantee = _s3Grant.getGrantee();
            S3GranteeStaxMarshaller.getInstance().marshall(grantee, request, prefix + ".");
        }
        if (_s3Grant.getPermission() != null) {
            prefix = _prefix + "Permission";
            String permission = _s3Grant.getPermission();
            request.addParameter(prefix, StringUtils.fromString(permission));
        }
    }

    private static S3GrantStaxMarshaller instance;
    public static S3GrantStaxMarshaller getInstance() {
        if (instance == null) instance = new S3GrantStaxMarshaller();
        return instance;
    }
}
