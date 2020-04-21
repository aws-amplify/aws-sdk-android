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
 * JSON marshaller for POJO EC2InstanceDetails
 */
class EC2InstanceDetailsJsonMarshaller {

    public void marshall(EC2InstanceDetails eC2InstanceDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (eC2InstanceDetails.getFamily() != null) {
            String family = eC2InstanceDetails.getFamily();
            jsonWriter.name("Family");
            jsonWriter.value(family);
        }
        if (eC2InstanceDetails.getInstanceType() != null) {
            String instanceType = eC2InstanceDetails.getInstanceType();
            jsonWriter.name("InstanceType");
            jsonWriter.value(instanceType);
        }
        if (eC2InstanceDetails.getRegion() != null) {
            String region = eC2InstanceDetails.getRegion();
            jsonWriter.name("Region");
            jsonWriter.value(region);
        }
        if (eC2InstanceDetails.getAvailabilityZone() != null) {
            String availabilityZone = eC2InstanceDetails.getAvailabilityZone();
            jsonWriter.name("AvailabilityZone");
            jsonWriter.value(availabilityZone);
        }
        if (eC2InstanceDetails.getPlatform() != null) {
            String platform = eC2InstanceDetails.getPlatform();
            jsonWriter.name("Platform");
            jsonWriter.value(platform);
        }
        if (eC2InstanceDetails.getTenancy() != null) {
            String tenancy = eC2InstanceDetails.getTenancy();
            jsonWriter.name("Tenancy");
            jsonWriter.value(tenancy);
        }
        if (eC2InstanceDetails.getCurrentGeneration() != null) {
            Boolean currentGeneration = eC2InstanceDetails.getCurrentGeneration();
            jsonWriter.name("CurrentGeneration");
            jsonWriter.value(currentGeneration);
        }
        if (eC2InstanceDetails.getSizeFlexEligible() != null) {
            Boolean sizeFlexEligible = eC2InstanceDetails.getSizeFlexEligible();
            jsonWriter.name("SizeFlexEligible");
            jsonWriter.value(sizeFlexEligible);
        }
        jsonWriter.endObject();
    }

    private static EC2InstanceDetailsJsonMarshaller instance;

    public static EC2InstanceDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EC2InstanceDetailsJsonMarshaller();
        return instance;
    }
}
