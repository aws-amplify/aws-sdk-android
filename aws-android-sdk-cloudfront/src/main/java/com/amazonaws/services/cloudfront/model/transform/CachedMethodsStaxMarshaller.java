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

package com.amazonaws.services.cloudfront.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO CachedMethods
 */
class CachedMethodsStaxMarshaller {

    public void marshall(CachedMethods _cachedMethods, Request<?> request, String _prefix) {
        String prefix;
        if (_cachedMethods.getQuantity() != null) {
            prefix = _prefix + "Quantity";
            Integer quantity = _cachedMethods.getQuantity();
            request.addParameter(prefix, StringUtils.fromInteger(quantity));
        }
        if (_cachedMethods.getItems() != null) {
            prefix = _prefix + "Items";
            java.util.List<String> items = _cachedMethods.getItems();
            int itemsIndex = 1;
            String itemsPrefix = prefix;
            for (String itemsItem : items) {
                prefix = itemsPrefix + "." + itemsIndex;
                if (itemsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(itemsItem));
                }
                itemsIndex++;
            }
            prefix = itemsPrefix;
        }
    }

    private static CachedMethodsStaxMarshaller instance;

    public static CachedMethodsStaxMarshaller getInstance() {
        if (instance == null)
            instance = new CachedMethodsStaxMarshaller();
        return instance;
    }
}
