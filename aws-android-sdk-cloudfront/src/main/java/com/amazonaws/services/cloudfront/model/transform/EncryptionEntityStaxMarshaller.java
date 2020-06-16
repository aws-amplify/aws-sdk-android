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
 * StAX marshaller for POJO EncryptionEntity
 */
class EncryptionEntityStaxMarshaller {

    public void marshall(EncryptionEntity _encryptionEntity, Request<?> request, String _prefix) {
        String prefix;
        if (_encryptionEntity.getPublicKeyId() != null) {
            prefix = _prefix + "PublicKeyId";
            String publicKeyId = _encryptionEntity.getPublicKeyId();
            request.addParameter(prefix, StringUtils.fromString(publicKeyId));
        }
        if (_encryptionEntity.getProviderId() != null) {
            prefix = _prefix + "ProviderId";
            String providerId = _encryptionEntity.getProviderId();
            request.addParameter(prefix, StringUtils.fromString(providerId));
        }
        if (_encryptionEntity.getFieldPatterns() != null) {
            prefix = _prefix + "FieldPatterns";
            FieldPatterns fieldPatterns = _encryptionEntity.getFieldPatterns();
            FieldPatternsStaxMarshaller.getInstance()
                    .marshall(fieldPatterns, request, prefix + ".");
        }
    }

    private static EncryptionEntityStaxMarshaller instance;

    public static EncryptionEntityStaxMarshaller getInstance() {
        if (instance == null)
            instance = new EncryptionEntityStaxMarshaller();
        return instance;
    }
}
