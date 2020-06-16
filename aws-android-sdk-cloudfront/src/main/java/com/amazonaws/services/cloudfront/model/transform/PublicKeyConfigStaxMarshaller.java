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
 * StAX marshaller for POJO PublicKeyConfig
 */
class PublicKeyConfigStaxMarshaller {

    public void marshall(PublicKeyConfig _publicKeyConfig, Request<?> request, String _prefix) {
        String prefix;
        if (_publicKeyConfig.getCallerReference() != null) {
            prefix = _prefix + "CallerReference";
            String callerReference = _publicKeyConfig.getCallerReference();
            request.addParameter(prefix, StringUtils.fromString(callerReference));
        }
        if (_publicKeyConfig.getName() != null) {
            prefix = _prefix + "Name";
            String name = _publicKeyConfig.getName();
            request.addParameter(prefix, StringUtils.fromString(name));
        }
        if (_publicKeyConfig.getEncodedKey() != null) {
            prefix = _prefix + "EncodedKey";
            String encodedKey = _publicKeyConfig.getEncodedKey();
            request.addParameter(prefix, StringUtils.fromString(encodedKey));
        }
        if (_publicKeyConfig.getComment() != null) {
            prefix = _prefix + "Comment";
            String comment = _publicKeyConfig.getComment();
            request.addParameter(prefix, StringUtils.fromString(comment));
        }
    }

    private static PublicKeyConfigStaxMarshaller instance;

    public static PublicKeyConfigStaxMarshaller getInstance() {
        if (instance == null)
            instance = new PublicKeyConfigStaxMarshaller();
        return instance;
    }
}
