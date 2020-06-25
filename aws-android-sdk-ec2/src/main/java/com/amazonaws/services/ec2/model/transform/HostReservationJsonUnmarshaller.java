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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO HostReservation
 */
class HostReservationJsonUnmarshaller implements
        Unmarshaller<HostReservation, JsonUnmarshallerContext> {

    public HostReservation unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        HostReservation hostReservation = new HostReservation();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Count")) {
                hostReservation.setCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CurrencyCode")) {
                hostReservation.setCurrencyCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Duration")) {
                hostReservation.setDuration(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("End")) {
                hostReservation.setEnd(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HostIdSet")) {
                hostReservation.setHostIdSet(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("HostReservationId")) {
                hostReservation.setHostReservationId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HourlyPrice")) {
                hostReservation.setHourlyPrice(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceFamily")) {
                hostReservation.setInstanceFamily(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OfferingId")) {
                hostReservation.setOfferingId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PaymentOption")) {
                hostReservation.setPaymentOption(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Start")) {
                hostReservation.setStart(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                hostReservation.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UpfrontPrice")) {
                hostReservation.setUpfrontPrice(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                hostReservation.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return hostReservation;
    }

    private static HostReservationJsonUnmarshaller instance;

    public static HostReservationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HostReservationJsonUnmarshaller();
        return instance;
    }
}
