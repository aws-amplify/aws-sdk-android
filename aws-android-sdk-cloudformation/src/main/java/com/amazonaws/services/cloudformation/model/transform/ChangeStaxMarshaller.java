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

package com.amazonaws.services.cloudformation.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO Change
 */
class ChangeStaxMarshaller {

    public void marshall(Change _change, Request<?> request, String _prefix) {
        String prefix;
        if (_change.getType() != null) {
            prefix = _prefix + "Type";
            String type = _change.getType();
            request.addParameter(prefix, StringUtils.fromString(type));
        }
        if (_change.getResourceChange() != null) {
            prefix = _prefix + "ResourceChange";
            ResourceChange resourceChange = _change.getResourceChange();
            ResourceChangeStaxMarshaller.getInstance().marshall(resourceChange, request,
                    prefix + ".");
        }
    }

    private static ChangeStaxMarshaller instance;

    public static ChangeStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ChangeStaxMarshaller();
        return instance;
    }
}
