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
 * StAX marshaller for POJO ObjectLockRule
 */
class ObjectLockRuleStaxMarshaller {

    public void marshall(ObjectLockRule _objectLockRule, Request<?> request, String _prefix) {
        String prefix;
        if (_objectLockRule.getDefaultRetention() != null) {
            prefix = _prefix + "DefaultRetention";
            DefaultRetention defaultRetention = _objectLockRule.getDefaultRetention();
            DefaultRetentionStaxMarshaller.getInstance().marshall(defaultRetention, request,
                    prefix + ".");
        }
    }

    private static ObjectLockRuleStaxMarshaller instance;

    public static ObjectLockRuleStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ObjectLockRuleStaxMarshaller();
        return instance;
    }
}
