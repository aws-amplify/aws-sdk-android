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
 * JSON marshaller for POJO DeleteFleetSuccessItem
 */
class DeleteFleetSuccessItemJsonMarshaller {

    public void marshall(DeleteFleetSuccessItem deleteFleetSuccessItem, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (deleteFleetSuccessItem.getCurrentFleetState() != null) {
            String currentFleetState = deleteFleetSuccessItem.getCurrentFleetState();
            jsonWriter.name("CurrentFleetState");
            jsonWriter.value(currentFleetState);
        }
        if (deleteFleetSuccessItem.getPreviousFleetState() != null) {
            String previousFleetState = deleteFleetSuccessItem.getPreviousFleetState();
            jsonWriter.name("PreviousFleetState");
            jsonWriter.value(previousFleetState);
        }
        if (deleteFleetSuccessItem.getFleetId() != null) {
            String fleetId = deleteFleetSuccessItem.getFleetId();
            jsonWriter.name("FleetId");
            jsonWriter.value(fleetId);
        }
        jsonWriter.endObject();
    }

    private static DeleteFleetSuccessItemJsonMarshaller instance;

    public static DeleteFleetSuccessItemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeleteFleetSuccessItemJsonMarshaller();
        return instance;
    }
}
