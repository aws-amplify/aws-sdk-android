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
 * StAX marshaller for POJO DistributionList
 */
class DistributionListStaxMarshaller {

    public void marshall(DistributionList _distributionList, Request<?> request, String _prefix) {
        String prefix;
        if (_distributionList.getMarker() != null) {
            prefix = _prefix + "Marker";
            String marker = _distributionList.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }
        if (_distributionList.getNextMarker() != null) {
            prefix = _prefix + "NextMarker";
            String nextMarker = _distributionList.getNextMarker();
            request.addParameter(prefix, StringUtils.fromString(nextMarker));
        }
        if (_distributionList.getMaxItems() != null) {
            prefix = _prefix + "MaxItems";
            Integer maxItems = _distributionList.getMaxItems();
            request.addParameter(prefix, StringUtils.fromInteger(maxItems));
        }
        if (_distributionList.getIsTruncated() != null) {
            prefix = _prefix + "IsTruncated";
            Boolean isTruncated = _distributionList.getIsTruncated();
            request.addParameter(prefix, StringUtils.fromBoolean(isTruncated));
        }
        if (_distributionList.getQuantity() != null) {
            prefix = _prefix + "Quantity";
            Integer quantity = _distributionList.getQuantity();
            request.addParameter(prefix, StringUtils.fromInteger(quantity));
        }
        if (_distributionList.getItems() != null) {
            prefix = _prefix + "Items";
            java.util.List<DistributionSummary> items = _distributionList.getItems();
            int itemsIndex = 1;
            String itemsPrefix = prefix;
            for (DistributionSummary itemsItem : items) {
                prefix = itemsPrefix + "." + itemsIndex;
                if (itemsItem != null) {
                    DistributionSummaryStaxMarshaller.getInstance().marshall(itemsItem, request,
                            prefix + ".");
                }
                itemsIndex++;
            }
            prefix = itemsPrefix;
        }
    }

    private static DistributionListStaxMarshaller instance;

    public static DistributionListStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DistributionListStaxMarshaller();
        return instance;
    }
}
