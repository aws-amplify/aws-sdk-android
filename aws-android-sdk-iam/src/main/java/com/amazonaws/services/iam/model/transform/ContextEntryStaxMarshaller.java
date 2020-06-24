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

package com.amazonaws.services.iam.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.iam.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO ContextEntry
 */
class ContextEntryStaxMarshaller {

    public void marshall(ContextEntry _contextEntry, Request<?> request, String _prefix) {
        String prefix;
        if (_contextEntry.getContextKeyName() != null) {
            prefix = _prefix + "ContextKeyName";
            String contextKeyName = _contextEntry.getContextKeyName();
            request.addParameter(prefix, StringUtils.fromString(contextKeyName));
        }
        if (_contextEntry.getContextKeyValues() != null) {
            prefix = _prefix + "ContextKeyValues";
            java.util.List<String> contextKeyValues = _contextEntry.getContextKeyValues();
            int contextKeyValuesIndex = 1;
            String contextKeyValuesPrefix = prefix;
            for (String contextKeyValuesItem : contextKeyValues) {
                prefix = contextKeyValuesPrefix + ".member." + contextKeyValuesIndex;
                if (contextKeyValuesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(contextKeyValuesItem));
                }
                contextKeyValuesIndex++;
            }
            prefix = contextKeyValuesPrefix;
        }
        if (_contextEntry.getContextKeyType() != null) {
            prefix = _prefix + "ContextKeyType";
            String contextKeyType = _contextEntry.getContextKeyType();
            request.addParameter(prefix, StringUtils.fromString(contextKeyType));
        }
    }

    private static ContextEntryStaxMarshaller instance;

    public static ContextEntryStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ContextEntryStaxMarshaller();
        return instance;
    }
}
