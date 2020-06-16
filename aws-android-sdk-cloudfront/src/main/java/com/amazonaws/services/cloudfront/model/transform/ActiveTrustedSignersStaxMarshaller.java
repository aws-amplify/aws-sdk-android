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
 * StAX marshaller for POJO ActiveTrustedSigners
 */
class ActiveTrustedSignersStaxMarshaller {

    public void marshall(ActiveTrustedSigners _activeTrustedSigners, Request<?> request,
            String _prefix) {
        String prefix;
        if (_activeTrustedSigners.getEnabled() != null) {
            prefix = _prefix + "Enabled";
            Boolean enabled = _activeTrustedSigners.getEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(enabled));
        }
        if (_activeTrustedSigners.getQuantity() != null) {
            prefix = _prefix + "Quantity";
            Integer quantity = _activeTrustedSigners.getQuantity();
            request.addParameter(prefix, StringUtils.fromInteger(quantity));
        }
        if (_activeTrustedSigners.getItems() != null) {
            prefix = _prefix + "Items";
            java.util.List<Signer> items = _activeTrustedSigners.getItems();
            int itemsIndex = 1;
            String itemsPrefix = prefix;
            for (Signer itemsItem : items) {
                prefix = itemsPrefix + "." + itemsIndex;
                if (itemsItem != null) {
                    SignerStaxMarshaller.getInstance().marshall(itemsItem, request, prefix + ".");
                }
                itemsIndex++;
            }
            prefix = itemsPrefix;
        }
    }

    private static ActiveTrustedSignersStaxMarshaller instance;

    public static ActiveTrustedSignersStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ActiveTrustedSignersStaxMarshaller();
        return instance;
    }
}
