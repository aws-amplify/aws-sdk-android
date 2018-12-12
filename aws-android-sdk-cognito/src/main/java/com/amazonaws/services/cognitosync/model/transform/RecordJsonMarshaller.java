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
 * JSON marshaller for POJO Record
 * @deprecated The Amazon Cognito Sync SDK for Android is deprecated as of release 2.9.0. Please use the AWS AppSync SDK for Android along with AWS AppSync service instead.
 */
@Deprecated
class RecordJsonMarshaller {

    public void marshall(Record record, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (record.getKey() != null) {
            String key = record.getKey();
            jsonWriter.name("Key");
            jsonWriter.value(key);
        }
        if (record.getValue() != null) {
            String value = record.getValue();
            jsonWriter.name("Value");
            jsonWriter.value(value);
        }
        if (record.getSyncCount() != null) {
            Long syncCount = record.getSyncCount();
            jsonWriter.name("SyncCount");
            jsonWriter.value(syncCount);
        }
        if (record.getLastModifiedDate() != null) {
            java.util.Date lastModifiedDate = record.getLastModifiedDate();
            jsonWriter.name("LastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (record.getLastModifiedBy() != null) {
            String lastModifiedBy = record.getLastModifiedBy();
            jsonWriter.name("LastModifiedBy");
            jsonWriter.value(lastModifiedBy);
        }
        if (record.getDeviceLastModifiedDate() != null) {
            java.util.Date deviceLastModifiedDate = record.getDeviceLastModifiedDate();
            jsonWriter.name("DeviceLastModifiedDate");
            jsonWriter.value(deviceLastModifiedDate);
        }
        jsonWriter.endObject();
    }

    private static RecordJsonMarshaller instance;

    public static RecordJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RecordJsonMarshaller();
        return instance;
    }
}
