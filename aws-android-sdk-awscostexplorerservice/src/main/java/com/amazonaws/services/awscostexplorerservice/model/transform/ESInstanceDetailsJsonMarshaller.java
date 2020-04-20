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
 * JSON marshaller for POJO ESInstanceDetails
 */
class ESInstanceDetailsJsonMarshaller {

    public void marshall(ESInstanceDetails eSInstanceDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (eSInstanceDetails.getInstanceClass() != null) {
            String instanceClass = eSInstanceDetails.getInstanceClass();
            jsonWriter.name("InstanceClass");
            jsonWriter.value(instanceClass);
        }
        if (eSInstanceDetails.getInstanceSize() != null) {
            String instanceSize = eSInstanceDetails.getInstanceSize();
            jsonWriter.name("InstanceSize");
            jsonWriter.value(instanceSize);
        }
        if (eSInstanceDetails.getRegion() != null) {
            String region = eSInstanceDetails.getRegion();
            jsonWriter.name("Region");
            jsonWriter.value(region);
        }
        if (eSInstanceDetails.getCurrentGeneration() != null) {
            Boolean currentGeneration = eSInstanceDetails.getCurrentGeneration();
            jsonWriter.name("CurrentGeneration");
            jsonWriter.value(currentGeneration);
        }
        if (eSInstanceDetails.getSizeFlexEligible() != null) {
            Boolean sizeFlexEligible = eSInstanceDetails.getSizeFlexEligible();
            jsonWriter.name("SizeFlexEligible");
            jsonWriter.value(sizeFlexEligible);
        }
        jsonWriter.endObject();
    }

    private static ESInstanceDetailsJsonMarshaller instance;

    public static ESInstanceDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ESInstanceDetailsJsonMarshaller();
        return instance;
    }
}
