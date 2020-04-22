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

package com.amazonaws.services.amazonredshift.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.amazonredshift.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO AccountAttribute
 */
class AccountAttributeStaxMarshaller {

    public void marshall(AccountAttribute _accountAttribute, Request<?> request, String _prefix) {
        String prefix;
        if (_accountAttribute.getAttributeName() != null) {
            prefix = _prefix + "AttributeName";
            String attributeName = _accountAttribute.getAttributeName();
            request.addParameter(prefix, StringUtils.fromString(attributeName));
        }
        if (_accountAttribute.getAttributeValues() != null) {
            prefix = _prefix + "AttributeValues";
            java.util.List<AttributeValueTarget> attributeValues = _accountAttribute
                    .getAttributeValues();
            int attributeValuesIndex = 1;
            String attributeValuesPrefix = prefix;
            for (AttributeValueTarget attributeValuesItem : attributeValues) {
                prefix = attributeValuesPrefix + "." + attributeValuesIndex;
                if (attributeValuesItem != null) {
                    AttributeValueTargetStaxMarshaller.getInstance().marshall(attributeValuesItem,
                            request, prefix + ".");
                }
                attributeValuesIndex++;
            }
            prefix = attributeValuesPrefix;
        }
    }

    private static AccountAttributeStaxMarshaller instance;

    public static AccountAttributeStaxMarshaller getInstance() {
        if (instance == null)
            instance = new AccountAttributeStaxMarshaller();
        return instance;
    }
}
