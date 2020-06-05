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
 * StAX marshaller for POJO PublicKey
 */
class PublicKeyStaxMarshaller {

    public void marshall(PublicKey _publicKey, Request<?> request, String _prefix) {
        String prefix;
        if (_publicKey.getId() != null) {
            prefix = _prefix + "Id";
            String id = _publicKey.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }
        if (_publicKey.getCreatedTime() != null) {
            prefix = _prefix + "CreatedTime";
            java.util.Date createdTime = _publicKey.getCreatedTime();
            request.addParameter(prefix, StringUtils.fromDate(createdTime));
        }
        if (_publicKey.getPublicKeyConfig() != null) {
            prefix = _prefix + "PublicKeyConfig";
            PublicKeyConfig publicKeyConfig = _publicKey.getPublicKeyConfig();
            PublicKeyConfigStaxMarshaller.getInstance().marshall(publicKeyConfig, request,
                    prefix + ".");
        }
    }

    private static PublicKeyStaxMarshaller instance;

    public static PublicKeyStaxMarshaller getInstance() {
        if (instance == null)
            instance = new PublicKeyStaxMarshaller();
        return instance;
    }
}
