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
 * StAX marshaller for POJO FieldLevelEncryptionProfileConfig
 */
class FieldLevelEncryptionProfileConfigStaxMarshaller {

    public void marshall(FieldLevelEncryptionProfileConfig _fieldLevelEncryptionProfileConfig,
            Request<?> request, String _prefix) {
        String prefix;
        if (_fieldLevelEncryptionProfileConfig.getName() != null) {
            prefix = _prefix + "Name";
            String name = _fieldLevelEncryptionProfileConfig.getName();
            request.addParameter(prefix, StringUtils.fromString(name));
        }
        if (_fieldLevelEncryptionProfileConfig.getCallerReference() != null) {
            prefix = _prefix + "CallerReference";
            String callerReference = _fieldLevelEncryptionProfileConfig.getCallerReference();
            request.addParameter(prefix, StringUtils.fromString(callerReference));
        }
        if (_fieldLevelEncryptionProfileConfig.getComment() != null) {
            prefix = _prefix + "Comment";
            String comment = _fieldLevelEncryptionProfileConfig.getComment();
            request.addParameter(prefix, StringUtils.fromString(comment));
        }
        if (_fieldLevelEncryptionProfileConfig.getEncryptionEntities() != null) {
            prefix = _prefix + "EncryptionEntities";
            EncryptionEntities encryptionEntities = _fieldLevelEncryptionProfileConfig
                    .getEncryptionEntities();
            EncryptionEntitiesStaxMarshaller.getInstance().marshall(encryptionEntities, request,
                    prefix + ".");
        }
    }

    private static FieldLevelEncryptionProfileConfigStaxMarshaller instance;

    public static FieldLevelEncryptionProfileConfigStaxMarshaller getInstance() {
        if (instance == null)
            instance = new FieldLevelEncryptionProfileConfigStaxMarshaller();
        return instance;
    }
}
