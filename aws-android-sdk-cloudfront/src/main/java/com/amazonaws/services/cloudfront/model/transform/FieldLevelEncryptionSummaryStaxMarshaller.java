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
 * StAX marshaller for POJO FieldLevelEncryptionSummary
 */
class FieldLevelEncryptionSummaryStaxMarshaller {

    public void marshall(FieldLevelEncryptionSummary _fieldLevelEncryptionSummary,
            Request<?> request, String _prefix) {
        String prefix;
        if (_fieldLevelEncryptionSummary.getId() != null) {
            prefix = _prefix + "Id";
            String id = _fieldLevelEncryptionSummary.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }
        if (_fieldLevelEncryptionSummary.getLastModifiedTime() != null) {
            prefix = _prefix + "LastModifiedTime";
            java.util.Date lastModifiedTime = _fieldLevelEncryptionSummary.getLastModifiedTime();
            request.addParameter(prefix, StringUtils.fromDate(lastModifiedTime));
        }
        if (_fieldLevelEncryptionSummary.getComment() != null) {
            prefix = _prefix + "Comment";
            String comment = _fieldLevelEncryptionSummary.getComment();
            request.addParameter(prefix, StringUtils.fromString(comment));
        }
        if (_fieldLevelEncryptionSummary.getQueryArgProfileConfig() != null) {
            prefix = _prefix + "QueryArgProfileConfig";
            QueryArgProfileConfig queryArgProfileConfig = _fieldLevelEncryptionSummary
                    .getQueryArgProfileConfig();
            QueryArgProfileConfigStaxMarshaller.getInstance().marshall(queryArgProfileConfig,
                    request, prefix + ".");
        }
        if (_fieldLevelEncryptionSummary.getContentTypeProfileConfig() != null) {
            prefix = _prefix + "ContentTypeProfileConfig";
            ContentTypeProfileConfig contentTypeProfileConfig = _fieldLevelEncryptionSummary
                    .getContentTypeProfileConfig();
            ContentTypeProfileConfigStaxMarshaller.getInstance().marshall(contentTypeProfileConfig,
                    request, prefix + ".");
        }
    }

    private static FieldLevelEncryptionSummaryStaxMarshaller instance;

    public static FieldLevelEncryptionSummaryStaxMarshaller getInstance() {
        if (instance == null)
            instance = new FieldLevelEncryptionSummaryStaxMarshaller();
        return instance;
    }
}
