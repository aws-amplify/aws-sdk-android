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
 * JSON unmarshaller for POJO CostCategoryReference
 */
class CostCategoryReferenceJsonUnmarshaller implements
        Unmarshaller<CostCategoryReference, JsonUnmarshallerContext> {

    public CostCategoryReference unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CostCategoryReference costCategoryReference = new CostCategoryReference();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CostCategoryArn")) {
                costCategoryReference.setCostCategoryArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                costCategoryReference.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EffectiveStart")) {
                costCategoryReference.setEffectiveStart(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EffectiveEnd")) {
                costCategoryReference.setEffectiveEnd(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NumberOfRules")) {
                costCategoryReference.setNumberOfRules(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return costCategoryReference;
    }

    private static CostCategoryReferenceJsonUnmarshaller instance;

    public static CostCategoryReferenceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CostCategoryReferenceJsonUnmarshaller();
        return instance;
    }
}
