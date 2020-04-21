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

package com.amazonaws.services.awscostexplorerservice.model.transform;

import com.amazonaws.services.awscostexplorerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SavingsPlansDetails
 */
class SavingsPlansDetailsJsonMarshaller {

    public void marshall(SavingsPlansDetails savingsPlansDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (savingsPlansDetails.getRegion() != null) {
            String region = savingsPlansDetails.getRegion();
            jsonWriter.name("Region");
            jsonWriter.value(region);
        }
        if (savingsPlansDetails.getInstanceFamily() != null) {
            String instanceFamily = savingsPlansDetails.getInstanceFamily();
            jsonWriter.name("InstanceFamily");
            jsonWriter.value(instanceFamily);
        }
        if (savingsPlansDetails.getOfferingId() != null) {
            String offeringId = savingsPlansDetails.getOfferingId();
            jsonWriter.name("OfferingId");
            jsonWriter.value(offeringId);
        }
        jsonWriter.endObject();
    }

    private static SavingsPlansDetailsJsonMarshaller instance;

    public static SavingsPlansDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SavingsPlansDetailsJsonMarshaller();
        return instance;
    }
}
