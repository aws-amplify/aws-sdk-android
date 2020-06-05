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
 * StAX marshaller for POJO CloudFrontOriginAccessIdentityList
 */
class CloudFrontOriginAccessIdentityListStaxMarshaller {

    public void marshall(CloudFrontOriginAccessIdentityList _cloudFrontOriginAccessIdentityList,
            Request<?> request, String _prefix) {
        String prefix;
        if (_cloudFrontOriginAccessIdentityList.getMarker() != null) {
            prefix = _prefix + "Marker";
            String marker = _cloudFrontOriginAccessIdentityList.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }
        if (_cloudFrontOriginAccessIdentityList.getNextMarker() != null) {
            prefix = _prefix + "NextMarker";
            String nextMarker = _cloudFrontOriginAccessIdentityList.getNextMarker();
            request.addParameter(prefix, StringUtils.fromString(nextMarker));
        }
        if (_cloudFrontOriginAccessIdentityList.getMaxItems() != null) {
            prefix = _prefix + "MaxItems";
            Integer maxItems = _cloudFrontOriginAccessIdentityList.getMaxItems();
            request.addParameter(prefix, StringUtils.fromInteger(maxItems));
        }
        if (_cloudFrontOriginAccessIdentityList.getIsTruncated() != null) {
            prefix = _prefix + "IsTruncated";
            Boolean isTruncated = _cloudFrontOriginAccessIdentityList.getIsTruncated();
            request.addParameter(prefix, StringUtils.fromBoolean(isTruncated));
        }
        if (_cloudFrontOriginAccessIdentityList.getQuantity() != null) {
            prefix = _prefix + "Quantity";
            Integer quantity = _cloudFrontOriginAccessIdentityList.getQuantity();
            request.addParameter(prefix, StringUtils.fromInteger(quantity));
        }
        if (_cloudFrontOriginAccessIdentityList.getItems() != null) {
            prefix = _prefix + "Items";
            java.util.List<CloudFrontOriginAccessIdentitySummary> items = _cloudFrontOriginAccessIdentityList
                    .getItems();
            int itemsIndex = 1;
            String itemsPrefix = prefix;
            for (CloudFrontOriginAccessIdentitySummary itemsItem : items) {
                prefix = itemsPrefix + "." + itemsIndex;
                if (itemsItem != null) {
                    CloudFrontOriginAccessIdentitySummaryStaxMarshaller.getInstance().marshall(
                            itemsItem, request, prefix + ".");
                }
                itemsIndex++;
            }
            prefix = itemsPrefix;
        }
    }

    private static CloudFrontOriginAccessIdentityListStaxMarshaller instance;

    public static CloudFrontOriginAccessIdentityListStaxMarshaller getInstance() {
        if (instance == null)
            instance = new CloudFrontOriginAccessIdentityListStaxMarshaller();
        return instance;
    }
}
