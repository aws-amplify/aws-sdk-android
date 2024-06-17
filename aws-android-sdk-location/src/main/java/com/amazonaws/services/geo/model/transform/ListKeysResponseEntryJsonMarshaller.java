/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model.transform;

import com.amazonaws.services.geo.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ListKeysResponseEntry
 */
class ListKeysResponseEntryJsonMarshaller {

    public void marshall(ListKeysResponseEntry listKeysResponseEntry, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (listKeysResponseEntry.getKeyName() != null) {
            String keyName = listKeysResponseEntry.getKeyName();
            jsonWriter.name("KeyName");
            jsonWriter.value(keyName);
        }
        if (listKeysResponseEntry.getExpireTime() != null) {
            java.util.Date expireTime = listKeysResponseEntry.getExpireTime();
            jsonWriter.name("ExpireTime");
            jsonWriter.value(DateUtils.formatISO8601Date(expireTime));
        }
        if (listKeysResponseEntry.getDescription() != null) {
            String description = listKeysResponseEntry.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (listKeysResponseEntry.getRestrictions() != null) {
            ApiKeyRestrictions restrictions = listKeysResponseEntry.getRestrictions();
            jsonWriter.name("Restrictions");
            ApiKeyRestrictionsJsonMarshaller.getInstance().marshall(restrictions, jsonWriter);
        }
        if (listKeysResponseEntry.getCreateTime() != null) {
            java.util.Date createTime = listKeysResponseEntry.getCreateTime();
            jsonWriter.name("CreateTime");
            jsonWriter.value(DateUtils.formatISO8601Date(createTime));
        }
        if (listKeysResponseEntry.getUpdateTime() != null) {
            java.util.Date updateTime = listKeysResponseEntry.getUpdateTime();
            jsonWriter.name("UpdateTime");
            jsonWriter.value(DateUtils.formatISO8601Date(updateTime));
        }
        jsonWriter.endObject();
    }

    private static ListKeysResponseEntryJsonMarshaller instance;

    public static ListKeysResponseEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ListKeysResponseEntryJsonMarshaller();
        return instance;
    }
}
