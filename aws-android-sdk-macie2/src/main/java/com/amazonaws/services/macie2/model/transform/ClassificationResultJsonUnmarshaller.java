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

package com.amazonaws.services.macie2.model.transform;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ClassificationResult
 */
class ClassificationResultJsonUnmarshaller implements
        Unmarshaller<ClassificationResult, JsonUnmarshallerContext> {

    public ClassificationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ClassificationResult classificationResult = new ClassificationResult();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("customDataIdentifiers")) {
                classificationResult.setCustomDataIdentifiers(CustomDataIdentifiersJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("mimeType")) {
                classificationResult.setMimeType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("sensitiveData")) {
                classificationResult.setSensitiveData(new ListUnmarshaller<SensitiveDataItem>(
                        SensitiveDataItemJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("sizeClassified")) {
                classificationResult.setSizeClassified(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("status")) {
                classificationResult.setStatus(ClassificationResultStatusJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return classificationResult;
    }

    private static ClassificationResultJsonUnmarshaller instance;

    public static ClassificationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ClassificationResultJsonUnmarshaller();
        return instance;
    }
}
