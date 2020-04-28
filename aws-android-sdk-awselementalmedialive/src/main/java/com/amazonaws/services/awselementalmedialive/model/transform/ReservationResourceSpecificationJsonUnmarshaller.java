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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ReservationResourceSpecification
 */
class ReservationResourceSpecificationJsonUnmarshaller implements
        Unmarshaller<ReservationResourceSpecification, JsonUnmarshallerContext> {

    public ReservationResourceSpecification unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ReservationResourceSpecification reservationResourceSpecification = new ReservationResourceSpecification();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ChannelClass")) {
                reservationResourceSpecification.setChannelClass(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Codec")) {
                reservationResourceSpecification.setCodec(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaximumBitrate")) {
                reservationResourceSpecification.setMaximumBitrate(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaximumFramerate")) {
                reservationResourceSpecification.setMaximumFramerate(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Resolution")) {
                reservationResourceSpecification.setResolution(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ResourceType")) {
                reservationResourceSpecification.setResourceType(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SpecialFeature")) {
                reservationResourceSpecification.setSpecialFeature(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("VideoQuality")) {
                reservationResourceSpecification.setVideoQuality(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return reservationResourceSpecification;
    }

    private static ReservationResourceSpecificationJsonUnmarshaller instance;

    public static ReservationResourceSpecificationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReservationResourceSpecificationJsonUnmarshaller();
        return instance;
    }
}
