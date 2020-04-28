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

package com.amazonaws.services.awselementalmedialive.model.transform;

import com.amazonaws.services.awselementalmedialive.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Scte35SegmentationDescriptor
 */
class Scte35SegmentationDescriptorJsonMarshaller {

    public void marshall(Scte35SegmentationDescriptor scte35SegmentationDescriptor,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (scte35SegmentationDescriptor.getDeliveryRestrictions() != null) {
            Scte35DeliveryRestrictions deliveryRestrictions = scte35SegmentationDescriptor
                    .getDeliveryRestrictions();
            jsonWriter.name("DeliveryRestrictions");
            Scte35DeliveryRestrictionsJsonMarshaller.getInstance().marshall(deliveryRestrictions,
                    jsonWriter);
        }
        if (scte35SegmentationDescriptor.getSegmentNum() != null) {
            Integer segmentNum = scte35SegmentationDescriptor.getSegmentNum();
            jsonWriter.name("SegmentNum");
            jsonWriter.value(segmentNum);
        }
        if (scte35SegmentationDescriptor.getSegmentationCancelIndicator() != null) {
            String segmentationCancelIndicator = scte35SegmentationDescriptor
                    .getSegmentationCancelIndicator();
            jsonWriter.name("SegmentationCancelIndicator");
            jsonWriter.value(segmentationCancelIndicator);
        }
        if (scte35SegmentationDescriptor.getSegmentationDuration() != null) {
            Long segmentationDuration = scte35SegmentationDescriptor.getSegmentationDuration();
            jsonWriter.name("SegmentationDuration");
            jsonWriter.value(segmentationDuration);
        }
        if (scte35SegmentationDescriptor.getSegmentationEventId() != null) {
            Long segmentationEventId = scte35SegmentationDescriptor.getSegmentationEventId();
            jsonWriter.name("SegmentationEventId");
            jsonWriter.value(segmentationEventId);
        }
        if (scte35SegmentationDescriptor.getSegmentationTypeId() != null) {
            Integer segmentationTypeId = scte35SegmentationDescriptor.getSegmentationTypeId();
            jsonWriter.name("SegmentationTypeId");
            jsonWriter.value(segmentationTypeId);
        }
        if (scte35SegmentationDescriptor.getSegmentationUpid() != null) {
            String segmentationUpid = scte35SegmentationDescriptor.getSegmentationUpid();
            jsonWriter.name("SegmentationUpid");
            jsonWriter.value(segmentationUpid);
        }
        if (scte35SegmentationDescriptor.getSegmentationUpidType() != null) {
            Integer segmentationUpidType = scte35SegmentationDescriptor.getSegmentationUpidType();
            jsonWriter.name("SegmentationUpidType");
            jsonWriter.value(segmentationUpidType);
        }
        if (scte35SegmentationDescriptor.getSegmentsExpected() != null) {
            Integer segmentsExpected = scte35SegmentationDescriptor.getSegmentsExpected();
            jsonWriter.name("SegmentsExpected");
            jsonWriter.value(segmentsExpected);
        }
        if (scte35SegmentationDescriptor.getSubSegmentNum() != null) {
            Integer subSegmentNum = scte35SegmentationDescriptor.getSubSegmentNum();
            jsonWriter.name("SubSegmentNum");
            jsonWriter.value(subSegmentNum);
        }
        if (scte35SegmentationDescriptor.getSubSegmentsExpected() != null) {
            Integer subSegmentsExpected = scte35SegmentationDescriptor.getSubSegmentsExpected();
            jsonWriter.name("SubSegmentsExpected");
            jsonWriter.value(subSegmentsExpected);
        }
        jsonWriter.endObject();
    }

    private static Scte35SegmentationDescriptorJsonMarshaller instance;

    public static Scte35SegmentationDescriptorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new Scte35SegmentationDescriptorJsonMarshaller();
        return instance;
    }
}
