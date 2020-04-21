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
 * JSON unmarshaller for POJO ElastiCacheInstanceDetails
 */
class ElastiCacheInstanceDetailsJsonUnmarshaller implements
        Unmarshaller<ElastiCacheInstanceDetails, JsonUnmarshallerContext> {

    public ElastiCacheInstanceDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ElastiCacheInstanceDetails elastiCacheInstanceDetails = new ElastiCacheInstanceDetails();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Family")) {
                elastiCacheInstanceDetails.setFamily(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NodeType")) {
                elastiCacheInstanceDetails.setNodeType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Region")) {
                elastiCacheInstanceDetails.setRegion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProductDescription")) {
                elastiCacheInstanceDetails.setProductDescription(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CurrentGeneration")) {
                elastiCacheInstanceDetails.setCurrentGeneration(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SizeFlexEligible")) {
                elastiCacheInstanceDetails.setSizeFlexEligible(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return elastiCacheInstanceDetails;
    }

    private static ElastiCacheInstanceDetailsJsonUnmarshaller instance;

    public static ElastiCacheInstanceDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ElastiCacheInstanceDetailsJsonUnmarshaller();
        return instance;
    }
}
