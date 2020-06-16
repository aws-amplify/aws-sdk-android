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
 * StAX marshaller for POJO FieldLevelEncryptionProfileList
 */
class FieldLevelEncryptionProfileListStaxMarshaller {

    public void marshall(FieldLevelEncryptionProfileList _fieldLevelEncryptionProfileList,
            Request<?> request, String _prefix) {
        String prefix;
        if (_fieldLevelEncryptionProfileList.getNextMarker() != null) {
            prefix = _prefix + "NextMarker";
            String nextMarker = _fieldLevelEncryptionProfileList.getNextMarker();
            request.addParameter(prefix, StringUtils.fromString(nextMarker));
        }
        if (_fieldLevelEncryptionProfileList.getMaxItems() != null) {
            prefix = _prefix + "MaxItems";
            Integer maxItems = _fieldLevelEncryptionProfileList.getMaxItems();
            request.addParameter(prefix, StringUtils.fromInteger(maxItems));
        }
        if (_fieldLevelEncryptionProfileList.getQuantity() != null) {
            prefix = _prefix + "Quantity";
            Integer quantity = _fieldLevelEncryptionProfileList.getQuantity();
            request.addParameter(prefix, StringUtils.fromInteger(quantity));
        }
        if (_fieldLevelEncryptionProfileList.getItems() != null) {
            prefix = _prefix + "Items";
            java.util.List<FieldLevelEncryptionProfileSummary> items = _fieldLevelEncryptionProfileList
                    .getItems();
            int itemsIndex = 1;
            String itemsPrefix = prefix;
            for (FieldLevelEncryptionProfileSummary itemsItem : items) {
                prefix = itemsPrefix + "." + itemsIndex;
                if (itemsItem != null) {
                    FieldLevelEncryptionProfileSummaryStaxMarshaller.getInstance().marshall(
                            itemsItem, request, prefix + ".");
                }
                itemsIndex++;
            }
            prefix = itemsPrefix;
        }
    }

    private static FieldLevelEncryptionProfileListStaxMarshaller instance;

    public static FieldLevelEncryptionProfileListStaxMarshaller getInstance() {
        if (instance == null)
            instance = new FieldLevelEncryptionProfileListStaxMarshaller();
        return instance;
    }
}
