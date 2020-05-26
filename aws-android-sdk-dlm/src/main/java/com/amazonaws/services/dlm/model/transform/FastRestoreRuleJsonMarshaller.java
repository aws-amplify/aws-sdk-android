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
 * JSON marshaller for POJO FastRestoreRule
 */
class FastRestoreRuleJsonMarshaller {

    public void marshall(FastRestoreRule fastRestoreRule, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (fastRestoreRule.getCount() != null) {
            Integer count = fastRestoreRule.getCount();
            jsonWriter.name("Count");
            jsonWriter.value(count);
        }
        if (fastRestoreRule.getInterval() != null) {
            Integer interval = fastRestoreRule.getInterval();
            jsonWriter.name("Interval");
            jsonWriter.value(interval);
        }
        if (fastRestoreRule.getIntervalUnit() != null) {
            String intervalUnit = fastRestoreRule.getIntervalUnit();
            jsonWriter.name("IntervalUnit");
            jsonWriter.value(intervalUnit);
        }
        if (fastRestoreRule.getAvailabilityZones() != null) {
            java.util.List<String> availabilityZones = fastRestoreRule.getAvailabilityZones();
            jsonWriter.name("AvailabilityZones");
            jsonWriter.beginArray();
            for (String availabilityZonesItem : availabilityZones) {
                if (availabilityZonesItem != null) {
                    jsonWriter.value(availabilityZonesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static FastRestoreRuleJsonMarshaller instance;

    public static FastRestoreRuleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FastRestoreRuleJsonMarshaller();
        return instance;
    }
}
