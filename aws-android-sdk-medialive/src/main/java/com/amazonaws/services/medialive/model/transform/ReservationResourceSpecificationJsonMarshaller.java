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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ReservationResourceSpecification
 */
class ReservationResourceSpecificationJsonMarshaller {

    public void marshall(ReservationResourceSpecification reservationResourceSpecification,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (reservationResourceSpecification.getChannelClass() != null) {
            String channelClass = reservationResourceSpecification.getChannelClass();
            jsonWriter.name("ChannelClass");
            jsonWriter.value(channelClass);
        }
        if (reservationResourceSpecification.getCodec() != null) {
            String codec = reservationResourceSpecification.getCodec();
            jsonWriter.name("Codec");
            jsonWriter.value(codec);
        }
        if (reservationResourceSpecification.getMaximumBitrate() != null) {
            String maximumBitrate = reservationResourceSpecification.getMaximumBitrate();
            jsonWriter.name("MaximumBitrate");
            jsonWriter.value(maximumBitrate);
        }
        if (reservationResourceSpecification.getMaximumFramerate() != null) {
            String maximumFramerate = reservationResourceSpecification.getMaximumFramerate();
            jsonWriter.name("MaximumFramerate");
            jsonWriter.value(maximumFramerate);
        }
        if (reservationResourceSpecification.getResolution() != null) {
            String resolution = reservationResourceSpecification.getResolution();
            jsonWriter.name("Resolution");
            jsonWriter.value(resolution);
        }
        if (reservationResourceSpecification.getResourceType() != null) {
            String resourceType = reservationResourceSpecification.getResourceType();
            jsonWriter.name("ResourceType");
            jsonWriter.value(resourceType);
        }
        if (reservationResourceSpecification.getSpecialFeature() != null) {
            String specialFeature = reservationResourceSpecification.getSpecialFeature();
            jsonWriter.name("SpecialFeature");
            jsonWriter.value(specialFeature);
        }
        if (reservationResourceSpecification.getVideoQuality() != null) {
            String videoQuality = reservationResourceSpecification.getVideoQuality();
            jsonWriter.name("VideoQuality");
            jsonWriter.value(videoQuality);
        }
        jsonWriter.endObject();
    }

    private static ReservationResourceSpecificationJsonMarshaller instance;

    public static ReservationResourceSpecificationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReservationResourceSpecificationJsonMarshaller();
        return instance;
    }
}
