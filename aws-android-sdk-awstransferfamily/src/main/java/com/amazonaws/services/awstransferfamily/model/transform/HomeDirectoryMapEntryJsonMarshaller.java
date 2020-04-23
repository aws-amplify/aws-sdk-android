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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HomeDirectoryMapEntry
 */
class HomeDirectoryMapEntryJsonMarshaller {

    public void marshall(HomeDirectoryMapEntry homeDirectoryMapEntry, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (homeDirectoryMapEntry.getEntry() != null) {
            String entry = homeDirectoryMapEntry.getEntry();
            jsonWriter.name("Entry");
            jsonWriter.value(entry);
        }
        if (homeDirectoryMapEntry.getTarget() != null) {
            String target = homeDirectoryMapEntry.getTarget();
            jsonWriter.name("Target");
            jsonWriter.value(target);
        }
        jsonWriter.endObject();
    }

    private static HomeDirectoryMapEntryJsonMarshaller instance;

    public static HomeDirectoryMapEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HomeDirectoryMapEntryJsonMarshaller();
        return instance;
    }
}
