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
 * StAX marshaller for POJO PolicyAttributeTypeDescription
 */
class PolicyAttributeTypeDescriptionStaxMarshaller {

    public void marshall(PolicyAttributeTypeDescription _policyAttributeTypeDescription,
            Request<?> request, String _prefix) {
        String prefix;
        if (_policyAttributeTypeDescription.getAttributeName() != null) {
            prefix = _prefix + "AttributeName";
            String attributeName = _policyAttributeTypeDescription.getAttributeName();
            request.addParameter(prefix, StringUtils.fromString(attributeName));
        }
        if (_policyAttributeTypeDescription.getAttributeType() != null) {
            prefix = _prefix + "AttributeType";
            String attributeType = _policyAttributeTypeDescription.getAttributeType();
            request.addParameter(prefix, StringUtils.fromString(attributeType));
        }
        if (_policyAttributeTypeDescription.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _policyAttributeTypeDescription.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (_policyAttributeTypeDescription.getDefaultValue() != null) {
            prefix = _prefix + "DefaultValue";
            String defaultValue = _policyAttributeTypeDescription.getDefaultValue();
            request.addParameter(prefix, StringUtils.fromString(defaultValue));
        }
        if (_policyAttributeTypeDescription.getCardinality() != null) {
            prefix = _prefix + "Cardinality";
            String cardinality = _policyAttributeTypeDescription.getCardinality();
            request.addParameter(prefix, StringUtils.fromString(cardinality));
        }
    }

    private static PolicyAttributeTypeDescriptionStaxMarshaller instance;

    public static PolicyAttributeTypeDescriptionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new PolicyAttributeTypeDescriptionStaxMarshaller();
        return instance;
    }
}
