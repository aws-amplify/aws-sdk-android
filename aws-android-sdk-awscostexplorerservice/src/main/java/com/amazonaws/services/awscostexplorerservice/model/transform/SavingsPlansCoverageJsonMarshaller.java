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

package com.amazonaws.services.awscostexplorerservice.model.transform;

import com.amazonaws.services.awscostexplorerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SavingsPlansCoverage
 */
class SavingsPlansCoverageJsonMarshaller {

    public void marshall(SavingsPlansCoverage savingsPlansCoverage, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (savingsPlansCoverage.getAttributes() != null) {
            java.util.Map<String, String> attributes = savingsPlansCoverage.getAttributes();
            jsonWriter.name("Attributes");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> attributesEntry : attributes.entrySet()) {
                String attributesValue = attributesEntry.getValue();
                if (attributesValue != null) {
                    jsonWriter.name(attributesEntry.getKey());
                    jsonWriter.value(attributesValue);
                }
            }
            jsonWriter.endObject();
        }
        if (savingsPlansCoverage.getCoverage() != null) {
            SavingsPlansCoverageData coverage = savingsPlansCoverage.getCoverage();
            jsonWriter.name("Coverage");
            SavingsPlansCoverageDataJsonMarshaller.getInstance().marshall(coverage, jsonWriter);
        }
        if (savingsPlansCoverage.getTimePeriod() != null) {
            DateInterval timePeriod = savingsPlansCoverage.getTimePeriod();
            jsonWriter.name("TimePeriod");
            DateIntervalJsonMarshaller.getInstance().marshall(timePeriod, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static SavingsPlansCoverageJsonMarshaller instance;

    public static SavingsPlansCoverageJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SavingsPlansCoverageJsonMarshaller();
        return instance;
    }
}
