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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO RDSInstanceDetails
 */
class RDSInstanceDetailsJsonUnmarshaller implements
        Unmarshaller<RDSInstanceDetails, JsonUnmarshallerContext> {

    public RDSInstanceDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        RDSInstanceDetails rDSInstanceDetails = new RDSInstanceDetails();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Family")) {
                rDSInstanceDetails.setFamily(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceType")) {
                rDSInstanceDetails.setInstanceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Region")) {
                rDSInstanceDetails.setRegion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DatabaseEngine")) {
                rDSInstanceDetails.setDatabaseEngine(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DatabaseEdition")) {
                rDSInstanceDetails.setDatabaseEdition(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeploymentOption")) {
                rDSInstanceDetails.setDeploymentOption(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LicenseModel")) {
                rDSInstanceDetails.setLicenseModel(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CurrentGeneration")) {
                rDSInstanceDetails.setCurrentGeneration(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SizeFlexEligible")) {
                rDSInstanceDetails.setSizeFlexEligible(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return rDSInstanceDetails;
    }

    private static RDSInstanceDetailsJsonUnmarshaller instance;

    public static RDSInstanceDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RDSInstanceDetailsJsonUnmarshaller();
        return instance;
    }
}
