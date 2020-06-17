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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Reservation
 */
class ReservationJsonMarshaller {

    public void marshall(Reservation reservation, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (reservation.getGroups() != null) {
            java.util.List<GroupIdentifier> groups = reservation.getGroups();
            jsonWriter.name("Groups");
            jsonWriter.beginArray();
            for (GroupIdentifier groupsItem : groups) {
                if (groupsItem != null) {
                    GroupIdentifierJsonMarshaller.getInstance().marshall(groupsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (reservation.getInstances() != null) {
            java.util.List<Instance> instances = reservation.getInstances();
            jsonWriter.name("Instances");
            jsonWriter.beginArray();
            for (Instance instancesItem : instances) {
                if (instancesItem != null) {
                    InstanceJsonMarshaller.getInstance().marshall(instancesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (reservation.getOwnerId() != null) {
            String ownerId = reservation.getOwnerId();
            jsonWriter.name("OwnerId");
            jsonWriter.value(ownerId);
        }
        if (reservation.getRequesterId() != null) {
            String requesterId = reservation.getRequesterId();
            jsonWriter.name("RequesterId");
            jsonWriter.value(requesterId);
        }
        if (reservation.getReservationId() != null) {
            String reservationId = reservation.getReservationId();
            jsonWriter.name("ReservationId");
            jsonWriter.value(reservationId);
        }
        jsonWriter.endObject();
    }

    private static ReservationJsonMarshaller instance;

    public static ReservationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReservationJsonMarshaller();
        return instance;
    }
}
