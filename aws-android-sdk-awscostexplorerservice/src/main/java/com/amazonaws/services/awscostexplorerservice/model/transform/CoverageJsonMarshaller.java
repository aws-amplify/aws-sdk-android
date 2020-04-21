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
 * JSON marshaller for POJO Coverage
 */
class CoverageJsonMarshaller {

    public void marshall(Coverage coverage, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (coverage.getCoverageHours() != null) {
            CoverageHours coverageHours = coverage.getCoverageHours();
            jsonWriter.name("CoverageHours");
            CoverageHoursJsonMarshaller.getInstance().marshall(coverageHours, jsonWriter);
        }
        if (coverage.getCoverageNormalizedUnits() != null) {
            CoverageNormalizedUnits coverageNormalizedUnits = coverage.getCoverageNormalizedUnits();
            jsonWriter.name("CoverageNormalizedUnits");
            CoverageNormalizedUnitsJsonMarshaller.getInstance().marshall(coverageNormalizedUnits,
                    jsonWriter);
        }
        if (coverage.getCoverageCost() != null) {
            CoverageCost coverageCost = coverage.getCoverageCost();
            jsonWriter.name("CoverageCost");
            CoverageCostJsonMarshaller.getInstance().marshall(coverageCost, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static CoverageJsonMarshaller instance;

    public static CoverageJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CoverageJsonMarshaller();
        return instance;
    }
}
