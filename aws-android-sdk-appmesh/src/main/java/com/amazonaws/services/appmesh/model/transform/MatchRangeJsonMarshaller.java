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

package com.amazonaws.services.appmesh.model.transform;

import com.amazonaws.services.appmesh.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MatchRange
 */
class MatchRangeJsonMarshaller {

    public void marshall(MatchRange matchRange, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (matchRange.getEnd() != null) {
            Long end = matchRange.getEnd();
            jsonWriter.name("end");
            jsonWriter.value(end);
        }
        if (matchRange.getStart() != null) {
            Long start = matchRange.getStart();
            jsonWriter.name("start");
            jsonWriter.value(start);
        }
        jsonWriter.endObject();
    }

    private static MatchRangeJsonMarshaller instance;

    public static MatchRangeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MatchRangeJsonMarshaller();
        return instance;
    }
}
