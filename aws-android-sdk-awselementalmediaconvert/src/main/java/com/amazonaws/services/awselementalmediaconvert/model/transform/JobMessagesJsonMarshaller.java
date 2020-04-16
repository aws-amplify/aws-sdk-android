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

package com.amazonaws.services.awselementalmediaconvert.model.transform;

import com.amazonaws.services.awselementalmediaconvert.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO JobMessages
 */
class JobMessagesJsonMarshaller {

    public void marshall(JobMessages jobMessages, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (jobMessages.getInfo() != null) {
            java.util.List<String> info = jobMessages.getInfo();
            jsonWriter.name("Info");
            jsonWriter.beginArray();
            for (String infoItem : info) {
                if (infoItem != null) {
                    jsonWriter.value(infoItem);
                }
            }
            jsonWriter.endArray();
        }
        if (jobMessages.getWarning() != null) {
            java.util.List<String> warning = jobMessages.getWarning();
            jsonWriter.name("Warning");
            jsonWriter.beginArray();
            for (String warningItem : warning) {
                if (warningItem != null) {
                    jsonWriter.value(warningItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static JobMessagesJsonMarshaller instance;

    public static JobMessagesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobMessagesJsonMarshaller();
        return instance;
    }
}
