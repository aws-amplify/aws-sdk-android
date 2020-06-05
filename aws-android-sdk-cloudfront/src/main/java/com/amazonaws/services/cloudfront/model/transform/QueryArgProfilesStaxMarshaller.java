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
 * StAX marshaller for POJO QueryArgProfiles
 */
class QueryArgProfilesStaxMarshaller {

    public void marshall(QueryArgProfiles _queryArgProfiles, Request<?> request, String _prefix) {
        String prefix;
        if (_queryArgProfiles.getQuantity() != null) {
            prefix = _prefix + "Quantity";
            Integer quantity = _queryArgProfiles.getQuantity();
            request.addParameter(prefix, StringUtils.fromInteger(quantity));
        }
        if (_queryArgProfiles.getItems() != null) {
            prefix = _prefix + "Items";
            java.util.List<QueryArgProfile> items = _queryArgProfiles.getItems();
            int itemsIndex = 1;
            String itemsPrefix = prefix;
            for (QueryArgProfile itemsItem : items) {
                prefix = itemsPrefix + "." + itemsIndex;
                if (itemsItem != null) {
                    QueryArgProfileStaxMarshaller.getInstance().marshall(itemsItem, request,
                            prefix + ".");
                }
                itemsIndex++;
            }
            prefix = itemsPrefix;
        }
    }

    private static QueryArgProfilesStaxMarshaller instance;

    public static QueryArgProfilesStaxMarshaller getInstance() {
        if (instance == null)
            instance = new QueryArgProfilesStaxMarshaller();
        return instance;
    }
}
