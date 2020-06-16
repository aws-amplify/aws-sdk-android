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
 * StAX marshaller for POJO Tags
 */
class TagsStaxMarshaller {

    public void marshall(Tags _tags, Request<?> request, String _prefix) {
        String prefix;
        if (_tags.getItems() != null) {
            prefix = _prefix + "Items";
            java.util.List<Tag> items = _tags.getItems();
            int itemsIndex = 1;
            String itemsPrefix = prefix;
            for (Tag itemsItem : items) {
                prefix = itemsPrefix + "." + itemsIndex;
                if (itemsItem != null) {
                    TagStaxMarshaller.getInstance().marshall(itemsItem, request, prefix + ".");
                }
                itemsIndex++;
            }
            prefix = itemsPrefix;
        }
    }

    private static TagsStaxMarshaller instance;

    public static TagsStaxMarshaller getInstance() {
        if (instance == null)
            instance = new TagsStaxMarshaller();
        return instance;
    }
}
