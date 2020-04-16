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

package com.amazonaws.services.awselementalmediaconvert.model.transform;

import com.amazonaws.services.awselementalmediaconvert.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO DolbyVisionLevel6Metadata
 */
class DolbyVisionLevel6MetadataJsonUnmarshaller implements
        Unmarshaller<DolbyVisionLevel6Metadata, JsonUnmarshallerContext> {

    public DolbyVisionLevel6Metadata unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DolbyVisionLevel6Metadata dolbyVisionLevel6Metadata = new DolbyVisionLevel6Metadata();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("MaxCll")) {
                dolbyVisionLevel6Metadata.setMaxCll(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxFall")) {
                dolbyVisionLevel6Metadata.setMaxFall(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return dolbyVisionLevel6Metadata;
    }

    private static DolbyVisionLevel6MetadataJsonUnmarshaller instance;

    public static DolbyVisionLevel6MetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DolbyVisionLevel6MetadataJsonUnmarshaller();
        return instance;
    }
}
