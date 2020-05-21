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

package com.amazonaws.services.s3.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.s3.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO InventoryFilter
 */
class InventoryFilterStaxMarshaller {

    public void marshall(InventoryFilter _inventoryFilter, Request<?> request, String _prefix) {
        String prefix;
        if (_inventoryFilter.getPrefix() != null) {
            prefix = _prefix + "Prefix";
            String prefix = _inventoryFilter.getPrefix();
            request.addParameter(prefix, StringUtils.fromString(prefix));
        }
    }

    private static InventoryFilterStaxMarshaller instance;

    public static InventoryFilterStaxMarshaller getInstance() {
        if (instance == null)
            instance = new InventoryFilterStaxMarshaller();
        return instance;
    }
}
