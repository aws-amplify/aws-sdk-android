/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.logs.model.transform;

import com.amazonaws.services.logs.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RejectedLogEventsInfo
 */
class RejectedLogEventsInfoJsonMarshaller {

    public void marshall(RejectedLogEventsInfo rejectedLogEventsInfo, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (rejectedLogEventsInfo.getTooNewLogEventStartIndex() != null) {
            Integer tooNewLogEventStartIndex = rejectedLogEventsInfo.getTooNewLogEventStartIndex();
            jsonWriter.name("tooNewLogEventStartIndex");
            jsonWriter.value(tooNewLogEventStartIndex);
        }
        if (rejectedLogEventsInfo.getTooOldLogEventEndIndex() != null) {
            Integer tooOldLogEventEndIndex = rejectedLogEventsInfo.getTooOldLogEventEndIndex();
            jsonWriter.name("tooOldLogEventEndIndex");
            jsonWriter.value(tooOldLogEventEndIndex);
        }
        if (rejectedLogEventsInfo.getExpiredLogEventEndIndex() != null) {
            Integer expiredLogEventEndIndex = rejectedLogEventsInfo.getExpiredLogEventEndIndex();
            jsonWriter.name("expiredLogEventEndIndex");
            jsonWriter.value(expiredLogEventEndIndex);
        }
        jsonWriter.endObject();
    }

    private static RejectedLogEventsInfoJsonMarshaller instance;

    public static RejectedLogEventsInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RejectedLogEventsInfoJsonMarshaller();
        return instance;
    }
}
