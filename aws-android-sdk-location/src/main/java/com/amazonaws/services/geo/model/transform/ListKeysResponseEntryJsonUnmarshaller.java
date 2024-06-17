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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ListKeysResponseEntry
 */
class ListKeysResponseEntryJsonUnmarshaller implements
        Unmarshaller<ListKeysResponseEntry, JsonUnmarshallerContext> {

    public ListKeysResponseEntry unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ListKeysResponseEntry listKeysResponseEntry = new ListKeysResponseEntry();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("KeyName")) {
                listKeysResponseEntry.setKeyName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExpireTime")) {
                listKeysResponseEntry.setExpireTime(DateJsonUnmarshaller.getInstance(
                        TimestampFormat.ISO_8601)
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                listKeysResponseEntry.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Restrictions")) {
                listKeysResponseEntry.setRestrictions(ApiKeyRestrictionsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreateTime")) {
                listKeysResponseEntry.setCreateTime(DateJsonUnmarshaller.getInstance(
                        TimestampFormat.ISO_8601)
                        .unmarshall(context));
            } else if (name.equals("UpdateTime")) {
                listKeysResponseEntry.setUpdateTime(DateJsonUnmarshaller.getInstance(
                        TimestampFormat.ISO_8601)
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return listKeysResponseEntry;
    }

    private static ListKeysResponseEntryJsonUnmarshaller instance;

    public static ListKeysResponseEntryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListKeysResponseEntryJsonUnmarshaller();
        return instance;
    }
}
