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
 * StAX marshaller for POJO StreamingDistributionList
 */
class StreamingDistributionListStaxMarshaller {

    public void marshall(StreamingDistributionList _streamingDistributionList, Request<?> request,
            String _prefix) {
        String prefix;
        if (_streamingDistributionList.getMarker() != null) {
            prefix = _prefix + "Marker";
            String marker = _streamingDistributionList.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }
        if (_streamingDistributionList.getNextMarker() != null) {
            prefix = _prefix + "NextMarker";
            String nextMarker = _streamingDistributionList.getNextMarker();
            request.addParameter(prefix, StringUtils.fromString(nextMarker));
        }
        if (_streamingDistributionList.getMaxItems() != null) {
            prefix = _prefix + "MaxItems";
            Integer maxItems = _streamingDistributionList.getMaxItems();
            request.addParameter(prefix, StringUtils.fromInteger(maxItems));
        }
        if (_streamingDistributionList.getIsTruncated() != null) {
            prefix = _prefix + "IsTruncated";
            Boolean isTruncated = _streamingDistributionList.getIsTruncated();
            request.addParameter(prefix, StringUtils.fromBoolean(isTruncated));
        }
        if (_streamingDistributionList.getQuantity() != null) {
            prefix = _prefix + "Quantity";
            Integer quantity = _streamingDistributionList.getQuantity();
            request.addParameter(prefix, StringUtils.fromInteger(quantity));
        }
        if (_streamingDistributionList.getItems() != null) {
            prefix = _prefix + "Items";
            java.util.List<StreamingDistributionSummary> items = _streamingDistributionList
                    .getItems();
            int itemsIndex = 1;
            String itemsPrefix = prefix;
            for (StreamingDistributionSummary itemsItem : items) {
                prefix = itemsPrefix + "." + itemsIndex;
                if (itemsItem != null) {
                    StreamingDistributionSummaryStaxMarshaller.getInstance().marshall(itemsItem,
                            request, prefix + ".");
                }
                itemsIndex++;
            }
            prefix = itemsPrefix;
        }
    }

    private static StreamingDistributionListStaxMarshaller instance;

    public static StreamingDistributionListStaxMarshaller getInstance() {
        if (instance == null)
            instance = new StreamingDistributionListStaxMarshaller();
        return instance;
    }
}
