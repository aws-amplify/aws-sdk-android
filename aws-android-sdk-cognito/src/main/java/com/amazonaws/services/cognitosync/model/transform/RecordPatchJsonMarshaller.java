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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RecordPatch
 * @deprecated The Amazon Cognito Sync SDK for Android is deprecated as of release 2.9.0. Please use the AWS AppSync SDK for Android along with AWS AppSync service instead.
 */
@Deprecated
class RecordPatchJsonMarshaller {

    public void marshall(RecordPatch recordPatch, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (recordPatch.getOp() != null) {
            String op = recordPatch.getOp();
            jsonWriter.name("Op");
            jsonWriter.value(op);
        }
        if (recordPatch.getKey() != null) {
            String key = recordPatch.getKey();
            jsonWriter.name("Key");
            jsonWriter.value(key);
        }
        if (recordPatch.getValue() != null) {
            String value = recordPatch.getValue();
            jsonWriter.name("Value");
            jsonWriter.value(value);
        }
        if (recordPatch.getSyncCount() != null) {
            Long syncCount = recordPatch.getSyncCount();
            jsonWriter.name("SyncCount");
            jsonWriter.value(syncCount);
        }
        if (recordPatch.getDeviceLastModifiedDate() != null) {
            java.util.Date deviceLastModifiedDate = recordPatch.getDeviceLastModifiedDate();
            jsonWriter.name("DeviceLastModifiedDate");
            jsonWriter.value(deviceLastModifiedDate);
        }
        jsonWriter.endObject();
    }

    private static RecordPatchJsonMarshaller instance;

    public static RecordPatchJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RecordPatchJsonMarshaller();
        return instance;
    }
}
