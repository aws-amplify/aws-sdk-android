/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitosync.model.transform;

import com.amazonaws.services.cognitosync.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Record
 * @deprecated The Amazon Cognito Sync SDK for Android is deprecated as of release 2.9.0. Please use the AWS AppSync SDK for Android along with AWS AppSync service instead.
 */
@Deprecated
class RecordJsonUnmarshaller implements Unmarshaller<Record, JsonUnmarshallerContext> {

    public Record unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Record record = new Record();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Key")) {
                record.setKey(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Value")) {
                record.setValue(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SyncCount")) {
                record.setSyncCount(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedDate")) {
                record.setLastModifiedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedBy")) {
                record.setLastModifiedBy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeviceLastModifiedDate")) {
                record.setDeviceLastModifiedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return record;
    }

    private static RecordJsonUnmarshaller instance;

    public static RecordJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RecordJsonUnmarshaller();
        return instance;
    }
}
