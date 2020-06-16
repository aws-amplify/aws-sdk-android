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
 * StAX marshaller for POJO FieldLevelEncryption
 */
class FieldLevelEncryptionStaxMarshaller {

    public void marshall(FieldLevelEncryption _fieldLevelEncryption, Request<?> request,
            String _prefix) {
        String prefix;
        if (_fieldLevelEncryption.getId() != null) {
            prefix = _prefix + "Id";
            String id = _fieldLevelEncryption.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }
        if (_fieldLevelEncryption.getLastModifiedTime() != null) {
            prefix = _prefix + "LastModifiedTime";
            java.util.Date lastModifiedTime = _fieldLevelEncryption.getLastModifiedTime();
            request.addParameter(prefix, StringUtils.fromDate(lastModifiedTime));
        }
        if (_fieldLevelEncryption.getFieldLevelEncryptionConfig() != null) {
            prefix = _prefix + "FieldLevelEncryptionConfig";
            FieldLevelEncryptionConfig fieldLevelEncryptionConfig = _fieldLevelEncryption
                    .getFieldLevelEncryptionConfig();
            FieldLevelEncryptionConfigStaxMarshaller.getInstance().marshall(
                    fieldLevelEncryptionConfig, request, prefix + ".");
        }
    }

    private static FieldLevelEncryptionStaxMarshaller instance;

    public static FieldLevelEncryptionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new FieldLevelEncryptionStaxMarshaller();
        return instance;
    }
}
