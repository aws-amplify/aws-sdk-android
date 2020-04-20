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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Coverage
 */
class CoverageJsonUnmarshaller implements Unmarshaller<Coverage, JsonUnmarshallerContext> {

    public Coverage unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Coverage coverage = new Coverage();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CoverageHours")) {
                coverage.setCoverageHours(CoverageHoursJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CoverageNormalizedUnits")) {
                coverage.setCoverageNormalizedUnits(CoverageNormalizedUnitsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CoverageCost")) {
                coverage.setCoverageCost(CoverageCostJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return coverage;
    }

    private static CoverageJsonUnmarshaller instance;

    public static CoverageJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CoverageJsonUnmarshaller();
        return instance;
    }
}
