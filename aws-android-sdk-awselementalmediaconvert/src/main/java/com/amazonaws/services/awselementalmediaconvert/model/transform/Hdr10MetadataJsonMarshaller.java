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

package com.amazonaws.services.awselementalmediaconvert.model.transform;

import com.amazonaws.services.awselementalmediaconvert.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Hdr10Metadata
 */
class Hdr10MetadataJsonMarshaller {

    public void marshall(Hdr10Metadata hdr10Metadata, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (hdr10Metadata.getBluePrimaryX() != null) {
            Integer bluePrimaryX = hdr10Metadata.getBluePrimaryX();
            jsonWriter.name("BluePrimaryX");
            jsonWriter.value(bluePrimaryX);
        }
        if (hdr10Metadata.getBluePrimaryY() != null) {
            Integer bluePrimaryY = hdr10Metadata.getBluePrimaryY();
            jsonWriter.name("BluePrimaryY");
            jsonWriter.value(bluePrimaryY);
        }
        if (hdr10Metadata.getGreenPrimaryX() != null) {
            Integer greenPrimaryX = hdr10Metadata.getGreenPrimaryX();
            jsonWriter.name("GreenPrimaryX");
            jsonWriter.value(greenPrimaryX);
        }
        if (hdr10Metadata.getGreenPrimaryY() != null) {
            Integer greenPrimaryY = hdr10Metadata.getGreenPrimaryY();
            jsonWriter.name("GreenPrimaryY");
            jsonWriter.value(greenPrimaryY);
        }
        if (hdr10Metadata.getMaxContentLightLevel() != null) {
            Integer maxContentLightLevel = hdr10Metadata.getMaxContentLightLevel();
            jsonWriter.name("MaxContentLightLevel");
            jsonWriter.value(maxContentLightLevel);
        }
        if (hdr10Metadata.getMaxFrameAverageLightLevel() != null) {
            Integer maxFrameAverageLightLevel = hdr10Metadata.getMaxFrameAverageLightLevel();
            jsonWriter.name("MaxFrameAverageLightLevel");
            jsonWriter.value(maxFrameAverageLightLevel);
        }
        if (hdr10Metadata.getMaxLuminance() != null) {
            Integer maxLuminance = hdr10Metadata.getMaxLuminance();
            jsonWriter.name("MaxLuminance");
            jsonWriter.value(maxLuminance);
        }
        if (hdr10Metadata.getMinLuminance() != null) {
            Integer minLuminance = hdr10Metadata.getMinLuminance();
            jsonWriter.name("MinLuminance");
            jsonWriter.value(minLuminance);
        }
        if (hdr10Metadata.getRedPrimaryX() != null) {
            Integer redPrimaryX = hdr10Metadata.getRedPrimaryX();
            jsonWriter.name("RedPrimaryX");
            jsonWriter.value(redPrimaryX);
        }
        if (hdr10Metadata.getRedPrimaryY() != null) {
            Integer redPrimaryY = hdr10Metadata.getRedPrimaryY();
            jsonWriter.name("RedPrimaryY");
            jsonWriter.value(redPrimaryY);
        }
        if (hdr10Metadata.getWhitePointX() != null) {
            Integer whitePointX = hdr10Metadata.getWhitePointX();
            jsonWriter.name("WhitePointX");
            jsonWriter.value(whitePointX);
        }
        if (hdr10Metadata.getWhitePointY() != null) {
            Integer whitePointY = hdr10Metadata.getWhitePointY();
            jsonWriter.name("WhitePointY");
            jsonWriter.value(whitePointY);
        }
        jsonWriter.endObject();
    }

    private static Hdr10MetadataJsonMarshaller instance;

    public static Hdr10MetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new Hdr10MetadataJsonMarshaller();
        return instance;
    }
}
