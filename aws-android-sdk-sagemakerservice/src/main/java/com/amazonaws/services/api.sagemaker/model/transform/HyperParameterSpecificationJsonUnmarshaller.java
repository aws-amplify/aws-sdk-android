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

package com.amazonaws.services.api.sagemaker.model.transform;

import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO HyperParameterSpecification
 */
class HyperParameterSpecificationJsonUnmarshaller implements
        Unmarshaller<HyperParameterSpecification, JsonUnmarshallerContext> {

    public HyperParameterSpecification unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        HyperParameterSpecification hyperParameterSpecification = new HyperParameterSpecification();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Name")) {
                hyperParameterSpecification.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                hyperParameterSpecification.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Type")) {
                hyperParameterSpecification.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Range")) {
                hyperParameterSpecification.setRange(ParameterRangeJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IsTunable")) {
                hyperParameterSpecification.setIsTunable(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IsRequired")) {
                hyperParameterSpecification.setIsRequired(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DefaultValue")) {
                hyperParameterSpecification.setDefaultValue(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return hyperParameterSpecification;
    }

    private static HyperParameterSpecificationJsonUnmarshaller instance;

    public static HyperParameterSpecificationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HyperParameterSpecificationJsonUnmarshaller();
        return instance;
    }
}
