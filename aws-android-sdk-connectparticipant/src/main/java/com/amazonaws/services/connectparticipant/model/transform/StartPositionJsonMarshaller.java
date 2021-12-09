/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connectparticipant.model.transform;

import com.amazonaws.services.connectparticipant.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO StartPosition
 */
class StartPositionJsonMarshaller {

    public void marshall(StartPosition startPosition, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (startPosition.getId() != null) {
            String id = startPosition.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (startPosition.getAbsoluteTime() != null) {
            String absoluteTime = startPosition.getAbsoluteTime();
            jsonWriter.name("AbsoluteTime");
            jsonWriter.value(absoluteTime);
        }
        if (startPosition.getMostRecent() != null) {
            Integer mostRecent = startPosition.getMostRecent();
            jsonWriter.name("MostRecent");
            jsonWriter.value(mostRecent);
        }
        jsonWriter.endObject();
    }

    private static StartPositionJsonMarshaller instance;

    public static StartPositionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StartPositionJsonMarshaller();
        return instance;
    }
}
