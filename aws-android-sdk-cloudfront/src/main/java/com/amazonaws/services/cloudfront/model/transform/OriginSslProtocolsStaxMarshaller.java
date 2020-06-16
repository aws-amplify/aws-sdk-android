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
 * StAX marshaller for POJO OriginSslProtocols
 */
class OriginSslProtocolsStaxMarshaller {

    public void marshall(OriginSslProtocols _originSslProtocols, Request<?> request, String _prefix) {
        String prefix;
        if (_originSslProtocols.getQuantity() != null) {
            prefix = _prefix + "Quantity";
            Integer quantity = _originSslProtocols.getQuantity();
            request.addParameter(prefix, StringUtils.fromInteger(quantity));
        }
        if (_originSslProtocols.getItems() != null) {
            prefix = _prefix + "Items";
            java.util.List<String> items = _originSslProtocols.getItems();
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

    private static OriginSslProtocolsStaxMarshaller instance;

    public static OriginSslProtocolsStaxMarshaller getInstance() {
        if (instance == null)
            instance = new OriginSslProtocolsStaxMarshaller();
        return instance;
    }
}
