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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RealTimeContactAnalysisCharacterInterval
 */
class RealTimeContactAnalysisCharacterIntervalJsonMarshaller {

    public void marshall(
            RealTimeContactAnalysisCharacterInterval realTimeContactAnalysisCharacterInterval,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (realTimeContactAnalysisCharacterInterval.getBeginOffsetChar() != null) {
            Integer beginOffsetChar = realTimeContactAnalysisCharacterInterval.getBeginOffsetChar();
            jsonWriter.name("BeginOffsetChar");
            jsonWriter.value(beginOffsetChar);
        }
        if (realTimeContactAnalysisCharacterInterval.getEndOffsetChar() != null) {
            Integer endOffsetChar = realTimeContactAnalysisCharacterInterval.getEndOffsetChar();
            jsonWriter.name("EndOffsetChar");
            jsonWriter.value(endOffsetChar);
        }
        jsonWriter.endObject();
    }

    private static RealTimeContactAnalysisCharacterIntervalJsonMarshaller instance;

    public static RealTimeContactAnalysisCharacterIntervalJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RealTimeContactAnalysisCharacterIntervalJsonMarshaller();
        return instance;
    }
}
