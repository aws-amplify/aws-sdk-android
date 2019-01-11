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
 * StAX marshaller for POJO PolicyAttributeDescription
 */
class PolicyAttributeDescriptionStaxMarshaller {

    public void marshall(PolicyAttributeDescription _policyAttributeDescription,
            Request<?> request, String _prefix) {
        String prefix;
        if (_policyAttributeDescription.getAttributeName() != null) {
            prefix = _prefix + "AttributeName";
            String attributeName = _policyAttributeDescription.getAttributeName();
            request.addParameter(prefix, StringUtils.fromString(attributeName));
        }
        if (_policyAttributeDescription.getAttributeValue() != null) {
            prefix = _prefix + "AttributeValue";
            String attributeValue = _policyAttributeDescription.getAttributeValue();
            request.addParameter(prefix, StringUtils.fromString(attributeValue));
        }
    }

    private static PolicyAttributeDescriptionStaxMarshaller instance;

    public static PolicyAttributeDescriptionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new PolicyAttributeDescriptionStaxMarshaller();
        return instance;
    }
}
