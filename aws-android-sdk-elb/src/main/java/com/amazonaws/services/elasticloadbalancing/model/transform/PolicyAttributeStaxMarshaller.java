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

package com.amazonaws.services.elasticloadbalancing.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO PolicyAttribute
 */
class PolicyAttributeStaxMarshaller {

    public void marshall(PolicyAttribute _policyAttribute, Request<?> request, String _prefix) {
        String prefix;
        if (_policyAttribute.getAttributeName() != null) {
            prefix = _prefix + "AttributeName";
            String attributeName = _policyAttribute.getAttributeName();
            request.addParameter(prefix, StringUtils.fromString(attributeName));
        }
        if (_policyAttribute.getAttributeValue() != null) {
            prefix = _prefix + "AttributeValue";
            String attributeValue = _policyAttribute.getAttributeValue();
            request.addParameter(prefix, StringUtils.fromString(attributeValue));
        }
    }

    private static PolicyAttributeStaxMarshaller instance;

    public static PolicyAttributeStaxMarshaller getInstance() {
        if (instance == null)
            instance = new PolicyAttributeStaxMarshaller();
        return instance;
    }
}
