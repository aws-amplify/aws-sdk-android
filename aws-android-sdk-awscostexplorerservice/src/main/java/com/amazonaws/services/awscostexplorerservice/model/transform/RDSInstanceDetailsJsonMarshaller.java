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
 * JSON marshaller for POJO RDSInstanceDetails
 */
class RDSInstanceDetailsJsonMarshaller {

    public void marshall(RDSInstanceDetails rDSInstanceDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (rDSInstanceDetails.getFamily() != null) {
            String family = rDSInstanceDetails.getFamily();
            jsonWriter.name("Family");
            jsonWriter.value(family);
        }
        if (rDSInstanceDetails.getInstanceType() != null) {
            String instanceType = rDSInstanceDetails.getInstanceType();
            jsonWriter.name("InstanceType");
            jsonWriter.value(instanceType);
        }
        if (rDSInstanceDetails.getRegion() != null) {
            String region = rDSInstanceDetails.getRegion();
            jsonWriter.name("Region");
            jsonWriter.value(region);
        }
        if (rDSInstanceDetails.getDatabaseEngine() != null) {
            String databaseEngine = rDSInstanceDetails.getDatabaseEngine();
            jsonWriter.name("DatabaseEngine");
            jsonWriter.value(databaseEngine);
        }
        if (rDSInstanceDetails.getDatabaseEdition() != null) {
            String databaseEdition = rDSInstanceDetails.getDatabaseEdition();
            jsonWriter.name("DatabaseEdition");
            jsonWriter.value(databaseEdition);
        }
        if (rDSInstanceDetails.getDeploymentOption() != null) {
            String deploymentOption = rDSInstanceDetails.getDeploymentOption();
            jsonWriter.name("DeploymentOption");
            jsonWriter.value(deploymentOption);
        }
        if (rDSInstanceDetails.getLicenseModel() != null) {
            String licenseModel = rDSInstanceDetails.getLicenseModel();
            jsonWriter.name("LicenseModel");
            jsonWriter.value(licenseModel);
        }
        if (rDSInstanceDetails.getCurrentGeneration() != null) {
            Boolean currentGeneration = rDSInstanceDetails.getCurrentGeneration();
            jsonWriter.name("CurrentGeneration");
            jsonWriter.value(currentGeneration);
        }
        if (rDSInstanceDetails.getSizeFlexEligible() != null) {
            Boolean sizeFlexEligible = rDSInstanceDetails.getSizeFlexEligible();
            jsonWriter.name("SizeFlexEligible");
            jsonWriter.value(sizeFlexEligible);
        }
        jsonWriter.endObject();
    }

    private static RDSInstanceDetailsJsonMarshaller instance;

    public static RDSInstanceDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RDSInstanceDetailsJsonMarshaller();
        return instance;
    }
}
