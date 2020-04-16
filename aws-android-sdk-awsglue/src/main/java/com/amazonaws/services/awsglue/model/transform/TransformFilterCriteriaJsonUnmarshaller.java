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

package com.amazonaws.services.awsglue.model.transform;

import com.amazonaws.services.awsglue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO TransformFilterCriteria
 */
class TransformFilterCriteriaJsonUnmarshaller implements
        Unmarshaller<TransformFilterCriteria, JsonUnmarshallerContext> {

    public TransformFilterCriteria unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TransformFilterCriteria transformFilterCriteria = new TransformFilterCriteria();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Name")) {
                transformFilterCriteria.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TransformType")) {
                transformFilterCriteria.setTransformType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                transformFilterCriteria.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GlueVersion")) {
                transformFilterCriteria.setGlueVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedBefore")) {
                transformFilterCriteria.setCreatedBefore(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedAfter")) {
                transformFilterCriteria.setCreatedAfter(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedBefore")) {
                transformFilterCriteria.setLastModifiedBefore(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedAfter")) {
                transformFilterCriteria.setLastModifiedAfter(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Schema")) {
                transformFilterCriteria.setSchema(new ListUnmarshaller<SchemaColumn>(
                        SchemaColumnJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return transformFilterCriteria;
    }

    private static TransformFilterCriteriaJsonUnmarshaller instance;

    public static TransformFilterCriteriaJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TransformFilterCriteriaJsonUnmarshaller();
        return instance;
    }
}
