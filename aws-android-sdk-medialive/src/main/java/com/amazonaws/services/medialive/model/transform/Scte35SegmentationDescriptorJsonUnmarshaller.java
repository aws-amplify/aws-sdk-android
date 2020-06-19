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

package com.amazonaws.services.medialive.model.transform;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Scte35SegmentationDescriptor
 */
class Scte35SegmentationDescriptorJsonUnmarshaller implements
        Unmarshaller<Scte35SegmentationDescriptor, JsonUnmarshallerContext> {

    public Scte35SegmentationDescriptor unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Scte35SegmentationDescriptor scte35SegmentationDescriptor = new Scte35SegmentationDescriptor();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("DeliveryRestrictions")) {
                scte35SegmentationDescriptor
                        .setDeliveryRestrictions(Scte35DeliveryRestrictionsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("SegmentNum")) {
                scte35SegmentationDescriptor.setSegmentNum(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SegmentationCancelIndicator")) {
                scte35SegmentationDescriptor.setSegmentationCancelIndicator(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SegmentationDuration")) {
                scte35SegmentationDescriptor.setSegmentationDuration(LongJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SegmentationEventId")) {
                scte35SegmentationDescriptor.setSegmentationEventId(LongJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SegmentationTypeId")) {
                scte35SegmentationDescriptor.setSegmentationTypeId(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SegmentationUpid")) {
                scte35SegmentationDescriptor.setSegmentationUpid(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SegmentationUpidType")) {
                scte35SegmentationDescriptor.setSegmentationUpidType(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SegmentsExpected")) {
                scte35SegmentationDescriptor.setSegmentsExpected(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SubSegmentNum")) {
                scte35SegmentationDescriptor.setSubSegmentNum(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SubSegmentsExpected")) {
                scte35SegmentationDescriptor.setSubSegmentsExpected(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return scte35SegmentationDescriptor;
    }

    private static Scte35SegmentationDescriptorJsonUnmarshaller instance;

    public static Scte35SegmentationDescriptorJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Scte35SegmentationDescriptorJsonUnmarshaller();
        return instance;
    }
}
