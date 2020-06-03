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

package com.amazonaws.services.glue.model.transform;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ImportLabelsTaskRunProperties
 */
class ImportLabelsTaskRunPropertiesJsonUnmarshaller implements
        Unmarshaller<ImportLabelsTaskRunProperties, JsonUnmarshallerContext> {

    public ImportLabelsTaskRunProperties unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ImportLabelsTaskRunProperties importLabelsTaskRunProperties = new ImportLabelsTaskRunProperties();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("InputS3Path")) {
                importLabelsTaskRunProperties.setInputS3Path(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Replace")) {
                importLabelsTaskRunProperties.setReplace(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return importLabelsTaskRunProperties;
    }

    private static ImportLabelsTaskRunPropertiesJsonUnmarshaller instance;

    public static ImportLabelsTaskRunPropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImportLabelsTaskRunPropertiesJsonUnmarshaller();
        return instance;
    }
}
