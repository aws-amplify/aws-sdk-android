/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model.transform;

import com.amazonaws.services.geo.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Leg
 */
class LegJsonUnmarshaller implements Unmarshaller<Leg, JsonUnmarshallerContext> {

    public Leg unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Leg leg = new Leg();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Distance")) {
                leg.setDistance(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DurationSeconds")) {
                leg.setDurationSeconds(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndPosition")) {
                leg.setEndPosition(new ListUnmarshaller<Double>(DoubleJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Geometry")) {
                leg.setGeometry(LegGeometryJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartPosition")) {
                leg.setStartPosition(new ListUnmarshaller<Double>(DoubleJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Steps")) {
                leg.setSteps(new ListUnmarshaller<Step>(StepJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return leg;
    }

    private static LegJsonUnmarshaller instance;

    public static LegJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LegJsonUnmarshaller();
        return instance;
    }
}
