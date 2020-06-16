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
 * StAX marshaller for POJO InvalidationList
 */
class InvalidationListStaxMarshaller {

    public void marshall(InvalidationList _invalidationList, Request<?> request, String _prefix) {
        String prefix;
        if (_invalidationList.getMarker() != null) {
            prefix = _prefix + "Marker";
            String marker = _invalidationList.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }
        if (_invalidationList.getNextMarker() != null) {
            prefix = _prefix + "NextMarker";
            String nextMarker = _invalidationList.getNextMarker();
            request.addParameter(prefix, StringUtils.fromString(nextMarker));
        }
        if (_invalidationList.getMaxItems() != null) {
            prefix = _prefix + "MaxItems";
            Integer maxItems = _invalidationList.getMaxItems();
            request.addParameter(prefix, StringUtils.fromInteger(maxItems));
        }
        if (_invalidationList.getIsTruncated() != null) {
            prefix = _prefix + "IsTruncated";
            Boolean isTruncated = _invalidationList.getIsTruncated();
            request.addParameter(prefix, StringUtils.fromBoolean(isTruncated));
        }
        if (_invalidationList.getQuantity() != null) {
            prefix = _prefix + "Quantity";
            Integer quantity = _invalidationList.getQuantity();
            request.addParameter(prefix, StringUtils.fromInteger(quantity));
        }
        if (_invalidationList.getItems() != null) {
            prefix = _prefix + "Items";
            java.util.List<InvalidationSummary> items = _invalidationList.getItems();
            int itemsIndex = 1;
            String itemsPrefix = prefix;
            for (InvalidationSummary itemsItem : items) {
                prefix = itemsPrefix + "." + itemsIndex;
                if (itemsItem != null) {
                    InvalidationSummaryStaxMarshaller.getInstance().marshall(itemsItem, request,
                            prefix + ".");
                }
                itemsIndex++;
            }
            prefix = itemsPrefix;
        }
    }

    private static InvalidationListStaxMarshaller instance;

    public static InvalidationListStaxMarshaller getInstance() {
        if (instance == null)
            instance = new InvalidationListStaxMarshaller();
        return instance;
    }
}
