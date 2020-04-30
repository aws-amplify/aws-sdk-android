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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Hdr10Metadata
 */
class Hdr10MetadataJsonUnmarshaller implements Unmarshaller<Hdr10Metadata, JsonUnmarshallerContext> {

    public Hdr10Metadata unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Hdr10Metadata hdr10Metadata = new Hdr10Metadata();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("BluePrimaryX")) {
                hdr10Metadata.setBluePrimaryX(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BluePrimaryY")) {
                hdr10Metadata.setBluePrimaryY(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GreenPrimaryX")) {
                hdr10Metadata.setGreenPrimaryX(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GreenPrimaryY")) {
                hdr10Metadata.setGreenPrimaryY(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxContentLightLevel")) {
                hdr10Metadata.setMaxContentLightLevel(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxFrameAverageLightLevel")) {
                hdr10Metadata.setMaxFrameAverageLightLevel(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxLuminance")) {
                hdr10Metadata.setMaxLuminance(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MinLuminance")) {
                hdr10Metadata.setMinLuminance(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RedPrimaryX")) {
                hdr10Metadata.setRedPrimaryX(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RedPrimaryY")) {
                hdr10Metadata.setRedPrimaryY(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("WhitePointX")) {
                hdr10Metadata.setWhitePointX(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("WhitePointY")) {
                hdr10Metadata.setWhitePointY(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return hdr10Metadata;
    }

    private static Hdr10MetadataJsonUnmarshaller instance;

    public static Hdr10MetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Hdr10MetadataJsonUnmarshaller();
        return instance;
    }
}
