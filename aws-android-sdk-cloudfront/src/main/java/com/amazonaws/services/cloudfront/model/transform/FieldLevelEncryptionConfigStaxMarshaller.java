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
 * StAX marshaller for POJO FieldLevelEncryptionConfig
 */
class FieldLevelEncryptionConfigStaxMarshaller {

    public void marshall(FieldLevelEncryptionConfig _fieldLevelEncryptionConfig,
            Request<?> request, String _prefix) {
        String prefix;
        if (_fieldLevelEncryptionConfig.getCallerReference() != null) {
            prefix = _prefix + "CallerReference";
            String callerReference = _fieldLevelEncryptionConfig.getCallerReference();
            request.addParameter(prefix, StringUtils.fromString(callerReference));
        }
        if (_fieldLevelEncryptionConfig.getComment() != null) {
            prefix = _prefix + "Comment";
            String comment = _fieldLevelEncryptionConfig.getComment();
            request.addParameter(prefix, StringUtils.fromString(comment));
        }
        if (_fieldLevelEncryptionConfig.getQueryArgProfileConfig() != null) {
            prefix = _prefix + "QueryArgProfileConfig";
            QueryArgProfileConfig queryArgProfileConfig = _fieldLevelEncryptionConfig
                    .getQueryArgProfileConfig();
            QueryArgProfileConfigStaxMarshaller.getInstance().marshall(queryArgProfileConfig,
                    request, prefix + ".");
        }
        if (_fieldLevelEncryptionConfig.getContentTypeProfileConfig() != null) {
            prefix = _prefix + "ContentTypeProfileConfig";
            ContentTypeProfileConfig contentTypeProfileConfig = _fieldLevelEncryptionConfig
                    .getContentTypeProfileConfig();
            ContentTypeProfileConfigStaxMarshaller.getInstance().marshall(contentTypeProfileConfig,
                    request, prefix + ".");
        }
    }

    private static FieldLevelEncryptionConfigStaxMarshaller instance;

    public static FieldLevelEncryptionConfigStaxMarshaller getInstance() {
        if (instance == null)
            instance = new FieldLevelEncryptionConfigStaxMarshaller();
        return instance;
    }
}
