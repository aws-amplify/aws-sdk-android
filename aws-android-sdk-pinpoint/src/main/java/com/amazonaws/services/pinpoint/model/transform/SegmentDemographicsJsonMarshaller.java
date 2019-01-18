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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SegmentDemographics
 */
class SegmentDemographicsJsonMarshaller {

    public void marshall(SegmentDemographics segmentDemographics, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (segmentDemographics.getAppVersion() != null) {
            SetDimension appVersion = segmentDemographics.getAppVersion();
            jsonWriter.name("AppVersion");
            SetDimensionJsonMarshaller.getInstance().marshall(appVersion, jsonWriter);
        }
        if (segmentDemographics.getChannel() != null) {
            SetDimension channel = segmentDemographics.getChannel();
            jsonWriter.name("Channel");
            SetDimensionJsonMarshaller.getInstance().marshall(channel, jsonWriter);
        }
        if (segmentDemographics.getDeviceType() != null) {
            SetDimension deviceType = segmentDemographics.getDeviceType();
            jsonWriter.name("DeviceType");
            SetDimensionJsonMarshaller.getInstance().marshall(deviceType, jsonWriter);
        }
        if (segmentDemographics.getMake() != null) {
            SetDimension make = segmentDemographics.getMake();
            jsonWriter.name("Make");
            SetDimensionJsonMarshaller.getInstance().marshall(make, jsonWriter);
        }
        if (segmentDemographics.getModel() != null) {
            SetDimension model = segmentDemographics.getModel();
            jsonWriter.name("Model");
            SetDimensionJsonMarshaller.getInstance().marshall(model, jsonWriter);
        }
        if (segmentDemographics.getPlatform() != null) {
            SetDimension platform = segmentDemographics.getPlatform();
            jsonWriter.name("Platform");
            SetDimensionJsonMarshaller.getInstance().marshall(platform, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static SegmentDemographicsJsonMarshaller instance;

    public static SegmentDemographicsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SegmentDemographicsJsonMarshaller();
        return instance;
    }
}
