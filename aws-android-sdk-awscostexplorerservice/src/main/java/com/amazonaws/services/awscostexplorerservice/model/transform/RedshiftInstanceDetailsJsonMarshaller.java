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
 * JSON marshaller for POJO RedshiftInstanceDetails
 */
class RedshiftInstanceDetailsJsonMarshaller {

    public void marshall(RedshiftInstanceDetails redshiftInstanceDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (redshiftInstanceDetails.getFamily() != null) {
            String family = redshiftInstanceDetails.getFamily();
            jsonWriter.name("Family");
            jsonWriter.value(family);
        }
        if (redshiftInstanceDetails.getNodeType() != null) {
            String nodeType = redshiftInstanceDetails.getNodeType();
            jsonWriter.name("NodeType");
            jsonWriter.value(nodeType);
        }
        if (redshiftInstanceDetails.getRegion() != null) {
            String region = redshiftInstanceDetails.getRegion();
            jsonWriter.name("Region");
            jsonWriter.value(region);
        }
        if (redshiftInstanceDetails.getCurrentGeneration() != null) {
            Boolean currentGeneration = redshiftInstanceDetails.getCurrentGeneration();
            jsonWriter.name("CurrentGeneration");
            jsonWriter.value(currentGeneration);
        }
        if (redshiftInstanceDetails.getSizeFlexEligible() != null) {
            Boolean sizeFlexEligible = redshiftInstanceDetails.getSizeFlexEligible();
            jsonWriter.name("SizeFlexEligible");
            jsonWriter.value(sizeFlexEligible);
        }
        jsonWriter.endObject();
    }

    private static RedshiftInstanceDetailsJsonMarshaller instance;

    public static RedshiftInstanceDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RedshiftInstanceDetailsJsonMarshaller();
        return instance;
    }
}
