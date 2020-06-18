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

package com.amazonaws.services.rds.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO OptionVersion
 */
class OptionVersionStaxMarshaller {

    public void marshall(OptionVersion _optionVersion, Request<?> request, String _prefix) {
        String prefix;
        if (_optionVersion.getVersion() != null) {
            prefix = _prefix + "Version";
            String version = _optionVersion.getVersion();
            request.addParameter(prefix, StringUtils.fromString(version));
        }
        if (_optionVersion.getIsDefault() != null) {
            prefix = _prefix + "IsDefault";
            Boolean isDefault = _optionVersion.getIsDefault();
            request.addParameter(prefix, StringUtils.fromBoolean(isDefault));
        }
    }

    private static OptionVersionStaxMarshaller instance;

    public static OptionVersionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new OptionVersionStaxMarshaller();
        return instance;
    }
}
