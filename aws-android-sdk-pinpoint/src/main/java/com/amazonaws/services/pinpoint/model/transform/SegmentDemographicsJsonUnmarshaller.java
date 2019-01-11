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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO SegmentDemographics
 */
class SegmentDemographicsJsonUnmarshaller implements
        Unmarshaller<SegmentDemographics, JsonUnmarshallerContext> {

    public SegmentDemographics unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SegmentDemographics segmentDemographics = new SegmentDemographics();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AppVersion")) {
                segmentDemographics.setAppVersion(SetDimensionJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Channel")) {
                segmentDemographics.setChannel(SetDimensionJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeviceType")) {
                segmentDemographics.setDeviceType(SetDimensionJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Make")) {
                segmentDemographics.setMake(SetDimensionJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Model")) {
                segmentDemographics.setModel(SetDimensionJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Platform")) {
                segmentDemographics.setPlatform(SetDimensionJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return segmentDemographics;
    }

    private static SegmentDemographicsJsonUnmarshaller instance;

    public static SegmentDemographicsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SegmentDemographicsJsonUnmarshaller();
        return instance;
    }
}
