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
 * JSON marshaller for POJO CoverageNormalizedUnits
 */
class CoverageNormalizedUnitsJsonMarshaller {

    public void marshall(CoverageNormalizedUnits coverageNormalizedUnits, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (coverageNormalizedUnits.getOnDemandNormalizedUnits() != null) {
            String onDemandNormalizedUnits = coverageNormalizedUnits.getOnDemandNormalizedUnits();
            jsonWriter.name("OnDemandNormalizedUnits");
            jsonWriter.value(onDemandNormalizedUnits);
        }
        if (coverageNormalizedUnits.getReservedNormalizedUnits() != null) {
            String reservedNormalizedUnits = coverageNormalizedUnits.getReservedNormalizedUnits();
            jsonWriter.name("ReservedNormalizedUnits");
            jsonWriter.value(reservedNormalizedUnits);
        }
        if (coverageNormalizedUnits.getTotalRunningNormalizedUnits() != null) {
            String totalRunningNormalizedUnits = coverageNormalizedUnits
                    .getTotalRunningNormalizedUnits();
            jsonWriter.name("TotalRunningNormalizedUnits");
            jsonWriter.value(totalRunningNormalizedUnits);
        }
        if (coverageNormalizedUnits.getCoverageNormalizedUnitsPercentage() != null) {
            String coverageNormalizedUnitsPercentage = coverageNormalizedUnits
                    .getCoverageNormalizedUnitsPercentage();
            jsonWriter.name("CoverageNormalizedUnitsPercentage");
            jsonWriter.value(coverageNormalizedUnitsPercentage);
        }
        jsonWriter.endObject();
    }

    private static CoverageNormalizedUnitsJsonMarshaller instance;

    public static CoverageNormalizedUnitsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CoverageNormalizedUnitsJsonMarshaller();
        return instance;
    }
}
