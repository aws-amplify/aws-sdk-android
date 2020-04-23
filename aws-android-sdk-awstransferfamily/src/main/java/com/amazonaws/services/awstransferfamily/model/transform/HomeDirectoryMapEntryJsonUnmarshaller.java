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

package com.amazonaws.services.awstransferfamily.model.transform;

import com.amazonaws.services.awstransferfamily.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO HomeDirectoryMapEntry
 */
class HomeDirectoryMapEntryJsonUnmarshaller implements
        Unmarshaller<HomeDirectoryMapEntry, JsonUnmarshallerContext> {

    public HomeDirectoryMapEntry unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        HomeDirectoryMapEntry homeDirectoryMapEntry = new HomeDirectoryMapEntry();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Entry")) {
                homeDirectoryMapEntry.setEntry(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Target")) {
                homeDirectoryMapEntry.setTarget(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return homeDirectoryMapEntry;
    }

    private static HomeDirectoryMapEntryJsonUnmarshaller instance;

    public static HomeDirectoryMapEntryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HomeDirectoryMapEntryJsonUnmarshaller();
        return instance;
    }
}
