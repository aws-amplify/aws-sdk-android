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

package com.amazonaws.services.amazontranscribestreamingservice.model.transform;

import com.amazonaws.services.amazontranscribestreamingservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Result
 */
class ResultJsonMarshaller {

    public void marshall(Result result, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (result.getResultId() != null) {
            String resultId = result.getResultId();
            jsonWriter.name("ResultId");
            jsonWriter.value(resultId);
        }
        if (result.getStartTime() != null) {
            Double startTime = result.getStartTime();
            jsonWriter.name("StartTime");
            jsonWriter.value(startTime);
        }
        if (result.getEndTime() != null) {
            Double endTime = result.getEndTime();
            jsonWriter.name("EndTime");
            jsonWriter.value(endTime);
        }
        if (result.getIsPartial() != null) {
            Boolean isPartial = result.getIsPartial();
            jsonWriter.name("IsPartial");
            jsonWriter.value(isPartial);
        }
        if (result.getAlternatives() != null) {
            java.util.List<Alternative> alternatives = result.getAlternatives();
            jsonWriter.name("Alternatives");
            jsonWriter.beginArray();
            for (Alternative alternativesItem : alternatives) {
                if (alternativesItem != null) {
                    AlternativeJsonMarshaller.getInstance().marshall(alternativesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ResultJsonMarshaller instance;

    public static ResultJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResultJsonMarshaller();
        return instance;
    }
}
