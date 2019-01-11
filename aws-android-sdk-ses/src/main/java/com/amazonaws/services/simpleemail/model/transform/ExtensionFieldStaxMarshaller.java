/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.simpleemail.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO ExtensionField
 */
class ExtensionFieldStaxMarshaller {

    public void marshall(ExtensionField _extensionField, Request<?> request, String _prefix) {
        String prefix;
        if (_extensionField.getName() != null) {
            prefix = _prefix + "Name";
            String name = _extensionField.getName();
            request.addParameter(prefix, StringUtils.fromString(name));
        }
        if (_extensionField.getValue() != null) {
            prefix = _prefix + "Value";
            String value = _extensionField.getValue();
            request.addParameter(prefix, StringUtils.fromString(value));
        }
    }

    private static ExtensionFieldStaxMarshaller instance;

    public static ExtensionFieldStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ExtensionFieldStaxMarshaller();
        return instance;
    }
}
