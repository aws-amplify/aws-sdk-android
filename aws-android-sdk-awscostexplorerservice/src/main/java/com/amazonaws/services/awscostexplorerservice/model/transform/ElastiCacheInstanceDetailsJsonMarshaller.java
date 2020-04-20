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
 * JSON marshaller for POJO ElastiCacheInstanceDetails
 */
class ElastiCacheInstanceDetailsJsonMarshaller {

    public void marshall(ElastiCacheInstanceDetails elastiCacheInstanceDetails,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (elastiCacheInstanceDetails.getFamily() != null) {
            String family = elastiCacheInstanceDetails.getFamily();
            jsonWriter.name("Family");
            jsonWriter.value(family);
        }
        if (elastiCacheInstanceDetails.getNodeType() != null) {
            String nodeType = elastiCacheInstanceDetails.getNodeType();
            jsonWriter.name("NodeType");
            jsonWriter.value(nodeType);
        }
        if (elastiCacheInstanceDetails.getRegion() != null) {
            String region = elastiCacheInstanceDetails.getRegion();
            jsonWriter.name("Region");
            jsonWriter.value(region);
        }
        if (elastiCacheInstanceDetails.getProductDescription() != null) {
            String productDescription = elastiCacheInstanceDetails.getProductDescription();
            jsonWriter.name("ProductDescription");
            jsonWriter.value(productDescription);
        }
        if (elastiCacheInstanceDetails.getCurrentGeneration() != null) {
            Boolean currentGeneration = elastiCacheInstanceDetails.getCurrentGeneration();
            jsonWriter.name("CurrentGeneration");
            jsonWriter.value(currentGeneration);
        }
        if (elastiCacheInstanceDetails.getSizeFlexEligible() != null) {
            Boolean sizeFlexEligible = elastiCacheInstanceDetails.getSizeFlexEligible();
            jsonWriter.name("SizeFlexEligible");
            jsonWriter.value(sizeFlexEligible);
        }
        jsonWriter.endObject();
    }

    private static ElastiCacheInstanceDetailsJsonMarshaller instance;

    public static ElastiCacheInstanceDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ElastiCacheInstanceDetailsJsonMarshaller();
        return instance;
    }
}
