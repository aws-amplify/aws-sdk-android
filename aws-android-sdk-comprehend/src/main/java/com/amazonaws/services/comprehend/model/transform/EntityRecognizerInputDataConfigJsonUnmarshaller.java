/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model.transform;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO EntityRecognizerInputDataConfig
 */
class EntityRecognizerInputDataConfigJsonUnmarshaller implements
        Unmarshaller<EntityRecognizerInputDataConfig, JsonUnmarshallerContext> {

    public EntityRecognizerInputDataConfig unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        EntityRecognizerInputDataConfig entityRecognizerInputDataConfig = new EntityRecognizerInputDataConfig();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("EntityTypes")) {
                entityRecognizerInputDataConfig
                        .setEntityTypes(new ListUnmarshaller<EntityTypesListItem>(
                                EntityTypesListItemJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Documents")) {
                entityRecognizerInputDataConfig
                        .setDocuments(EntityRecognizerDocumentsJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("Annotations")) {
                entityRecognizerInputDataConfig
                        .setAnnotations(EntityRecognizerAnnotationsJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("EntityList")) {
                entityRecognizerInputDataConfig
                        .setEntityList(EntityRecognizerEntityListJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return entityRecognizerInputDataConfig;
    }

    private static EntityRecognizerInputDataConfigJsonUnmarshaller instance;

    public static EntityRecognizerInputDataConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EntityRecognizerInputDataConfigJsonUnmarshaller();
        return instance;
    }
}
