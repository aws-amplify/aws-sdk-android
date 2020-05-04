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
 * JSON marshaller for POJO CancelSpotFleetRequestsSuccessItem
 */
class CancelSpotFleetRequestsSuccessItemJsonMarshaller {

    public void marshall(CancelSpotFleetRequestsSuccessItem cancelSpotFleetRequestsSuccessItem,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (cancelSpotFleetRequestsSuccessItem.getCurrentSpotFleetRequestState() != null) {
            String currentSpotFleetRequestState = cancelSpotFleetRequestsSuccessItem
                    .getCurrentSpotFleetRequestState();
            jsonWriter.name("CurrentSpotFleetRequestState");
            jsonWriter.value(currentSpotFleetRequestState);
        }
        if (cancelSpotFleetRequestsSuccessItem.getPreviousSpotFleetRequestState() != null) {
            String previousSpotFleetRequestState = cancelSpotFleetRequestsSuccessItem
                    .getPreviousSpotFleetRequestState();
            jsonWriter.name("PreviousSpotFleetRequestState");
            jsonWriter.value(previousSpotFleetRequestState);
        }
        if (cancelSpotFleetRequestsSuccessItem.getSpotFleetRequestId() != null) {
            String spotFleetRequestId = cancelSpotFleetRequestsSuccessItem.getSpotFleetRequestId();
            jsonWriter.name("SpotFleetRequestId");
            jsonWriter.value(spotFleetRequestId);
        }
        jsonWriter.endObject();
    }

    private static CancelSpotFleetRequestsSuccessItemJsonMarshaller instance;

    public static CancelSpotFleetRequestsSuccessItemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CancelSpotFleetRequestsSuccessItemJsonMarshaller();
        return instance;
    }
}
