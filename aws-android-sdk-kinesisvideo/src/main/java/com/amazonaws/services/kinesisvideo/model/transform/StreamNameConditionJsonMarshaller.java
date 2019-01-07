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

package com.amazonaws.services.kinesisvideo.model.transform;

import com.amazonaws.services.kinesisvideo.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO StreamNameCondition
 */
class StreamNameConditionJsonMarshaller {

    public void marshall(StreamNameCondition streamNameCondition, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (streamNameCondition.getComparisonOperator() != null) {
            String comparisonOperator = streamNameCondition.getComparisonOperator();
            jsonWriter.name("ComparisonOperator");
            jsonWriter.value(comparisonOperator);
        }
        if (streamNameCondition.getComparisonValue() != null) {
            String comparisonValue = streamNameCondition.getComparisonValue();
            jsonWriter.name("ComparisonValue");
            jsonWriter.value(comparisonValue);
        }
        jsonWriter.endObject();
    }

    private static StreamNameConditionJsonMarshaller instance;

    public static StreamNameConditionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StreamNameConditionJsonMarshaller();
        return instance;
    }
}
