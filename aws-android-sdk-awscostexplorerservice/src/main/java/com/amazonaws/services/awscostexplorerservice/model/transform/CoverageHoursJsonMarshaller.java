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
 * JSON marshaller for POJO CoverageHours
 */
class CoverageHoursJsonMarshaller {

    public void marshall(CoverageHours coverageHours, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (coverageHours.getOnDemandHours() != null) {
            String onDemandHours = coverageHours.getOnDemandHours();
            jsonWriter.name("OnDemandHours");
            jsonWriter.value(onDemandHours);
        }
        if (coverageHours.getReservedHours() != null) {
            String reservedHours = coverageHours.getReservedHours();
            jsonWriter.name("ReservedHours");
            jsonWriter.value(reservedHours);
        }
        if (coverageHours.getTotalRunningHours() != null) {
            String totalRunningHours = coverageHours.getTotalRunningHours();
            jsonWriter.name("TotalRunningHours");
            jsonWriter.value(totalRunningHours);
        }
        if (coverageHours.getCoverageHoursPercentage() != null) {
            String coverageHoursPercentage = coverageHours.getCoverageHoursPercentage();
            jsonWriter.name("CoverageHoursPercentage");
            jsonWriter.value(coverageHoursPercentage);
        }
        jsonWriter.endObject();
    }

    private static CoverageHoursJsonMarshaller instance;

    public static CoverageHoursJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CoverageHoursJsonMarshaller();
        return instance;
    }
}
