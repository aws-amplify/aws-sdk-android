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
 * StAX marshaller for POJO PublicKeyList
 */
class PublicKeyListStaxMarshaller {

    public void marshall(PublicKeyList _publicKeyList, Request<?> request, String _prefix) {
        String prefix;
        if (_publicKeyList.getNextMarker() != null) {
            prefix = _prefix + "NextMarker";
            String nextMarker = _publicKeyList.getNextMarker();
            request.addParameter(prefix, StringUtils.fromString(nextMarker));
        }
        if (_publicKeyList.getMaxItems() != null) {
            prefix = _prefix + "MaxItems";
            Integer maxItems = _publicKeyList.getMaxItems();
            request.addParameter(prefix, StringUtils.fromInteger(maxItems));
        }
        if (_publicKeyList.getQuantity() != null) {
            prefix = _prefix + "Quantity";
            Integer quantity = _publicKeyList.getQuantity();
            request.addParameter(prefix, StringUtils.fromInteger(quantity));
        }
        if (_publicKeyList.getItems() != null) {
            prefix = _prefix + "Items";
            java.util.List<PublicKeySummary> items = _publicKeyList.getItems();
            int itemsIndex = 1;
            String itemsPrefix = prefix;
            for (PublicKeySummary itemsItem : items) {
                prefix = itemsPrefix + "." + itemsIndex;
                if (itemsItem != null) {
                    PublicKeySummaryStaxMarshaller.getInstance().marshall(itemsItem, request,
                            prefix + ".");
                }
                itemsIndex++;
            }
            prefix = itemsPrefix;
        }
    }

    private static PublicKeyListStaxMarshaller instance;

    public static PublicKeyListStaxMarshaller getInstance() {
        if (instance == null)
            instance = new PublicKeyListStaxMarshaller();
        return instance;
    }
}
