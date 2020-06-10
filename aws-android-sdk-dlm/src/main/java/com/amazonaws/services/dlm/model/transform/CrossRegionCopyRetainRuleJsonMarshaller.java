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

package com.amazonaws.services.dlm.model.transform;

import com.amazonaws.services.dlm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CrossRegionCopyRetainRule
 */
class CrossRegionCopyRetainRuleJsonMarshaller {

    public void marshall(CrossRegionCopyRetainRule crossRegionCopyRetainRule,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (crossRegionCopyRetainRule.getInterval() != null) {
            Integer interval = crossRegionCopyRetainRule.getInterval();
            jsonWriter.name("Interval");
            jsonWriter.value(interval);
        }
        if (crossRegionCopyRetainRule.getIntervalUnit() != null) {
            String intervalUnit = crossRegionCopyRetainRule.getIntervalUnit();
            jsonWriter.name("IntervalUnit");
            jsonWriter.value(intervalUnit);
        }
        jsonWriter.endObject();
    }

    private static CrossRegionCopyRetainRuleJsonMarshaller instance;

    public static CrossRegionCopyRetainRuleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CrossRegionCopyRetainRuleJsonMarshaller();
        return instance;
    }
}
