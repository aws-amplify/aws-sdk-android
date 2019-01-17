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

package com.amazonaws.services.sns.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.sns.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO PlatformApplication
 */
class PlatformApplicationStaxMarshaller {

    public void marshall(PlatformApplication _platformApplication, Request<?> request,
            String _prefix) {
        String prefix;
        if (_platformApplication.getPlatformApplicationArn() != null) {
            prefix = _prefix + "PlatformApplicationArn";
            String platformApplicationArn = _platformApplication.getPlatformApplicationArn();
            request.addParameter(prefix, StringUtils.fromString(platformApplicationArn));
        }
        if (_platformApplication.getAttributes() != null) {
            prefix = _prefix + "Attributes";
            java.util.Map<String, String> attributes = _platformApplication.getAttributes();
            int attributesIndex = 1;
            String attributesPrefix = prefix + ".entry.";
            for (java.util.Map.Entry<String, String> attributesEntry : attributes.entrySet()) {
                prefix = attributesPrefix + attributesIndex;
                if (attributesEntry.getKey() != null) {
                    request.addParameter(prefix + ".key",
                            StringUtils.fromString(attributesEntry.getKey()));
                }
                prefix += ".value";
                if (attributesEntry.getValue() != null) {
                    String attributesValue = attributesEntry.getValue();
                    request.addParameter(prefix, StringUtils.fromString(attributesValue));
                }
                attributesIndex++;
            }
            prefix = attributesPrefix;
        }
    }

    private static PlatformApplicationStaxMarshaller instance;

    public static PlatformApplicationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new PlatformApplicationStaxMarshaller();
        return instance;
    }
}
