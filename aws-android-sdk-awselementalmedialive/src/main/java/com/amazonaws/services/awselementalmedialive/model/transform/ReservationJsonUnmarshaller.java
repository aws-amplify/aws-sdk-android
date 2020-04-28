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
 * JSON unmarshaller for POJO Reservation
 */
class ReservationJsonUnmarshaller implements Unmarshaller<Reservation, JsonUnmarshallerContext> {

    public Reservation unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Reservation reservation = new Reservation();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Arn")) {
                reservation.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Count")) {
                reservation.setCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CurrencyCode")) {
                reservation.setCurrencyCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Duration")) {
                reservation.setDuration(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DurationUnits")) {
                reservation.setDurationUnits(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("End")) {
                reservation.setEnd(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FixedPrice")) {
                reservation.setFixedPrice(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                reservation.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OfferingDescription")) {
                reservation.setOfferingDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OfferingId")) {
                reservation.setOfferingId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OfferingType")) {
                reservation.setOfferingType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Region")) {
                reservation.setRegion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ReservationId")) {
                reservation.setReservationId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ResourceSpecification")) {
                reservation
                        .setResourceSpecification(ReservationResourceSpecificationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("Start")) {
                reservation.setStart(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                reservation.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                reservation.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("UsagePrice")) {
                reservation.setUsagePrice(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return reservation;
    }

    private static ReservationJsonUnmarshaller instance;

    public static ReservationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReservationJsonUnmarshaller();
        return instance;
    }
}
