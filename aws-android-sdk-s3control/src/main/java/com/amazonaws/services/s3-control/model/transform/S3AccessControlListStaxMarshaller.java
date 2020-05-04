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
 * StAX marshaller for POJO S3AccessControlList
 */
class S3AccessControlListStaxMarshaller {

    public void marshall(S3AccessControlList _s3AccessControlList, Request<?> request, String _prefix) {
        String prefix;
        if (_s3AccessControlList.getOwner() != null) {
            prefix = _prefix + "Owner";
            S3ObjectOwner owner = _s3AccessControlList.getOwner();
            S3ObjectOwnerStaxMarshaller.getInstance().marshall(owner, request, prefix + ".");
        }
        if (_s3AccessControlList.getGrants() != null) {
            prefix = _prefix + "Grants";
            java.util.List<S3Grant> grants = _s3AccessControlList.getGrants();
            int grantsIndex = 1;
            String grantsPrefix = prefix;
            for (S3Grant grantsItem : grants) {
                prefix = grantsPrefix + ".member." + grantsIndex;
                if (grantsItem != null) {
            S3GrantStaxMarshaller.getInstance().marshall(grantsItem, request, prefix + ".");
                    }
                grantsIndex ++;
            }
            prefix = grantsPrefix;
        }
    }

    private static S3AccessControlListStaxMarshaller instance;
    public static S3AccessControlListStaxMarshaller getInstance() {
        if (instance == null) instance = new S3AccessControlListStaxMarshaller();
        return instance;
    }
}
