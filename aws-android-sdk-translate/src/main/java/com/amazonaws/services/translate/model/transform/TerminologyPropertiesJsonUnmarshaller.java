/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.translate.model.transform;

import com.amazonaws.services.translate.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO TerminologyProperties
 */
class TerminologyPropertiesJsonUnmarshaller implements
        Unmarshaller<TerminologyProperties, JsonUnmarshallerContext> {

    public TerminologyProperties unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TerminologyProperties terminologyProperties = new TerminologyProperties();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Name")) {
                terminologyProperties.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                terminologyProperties.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Arn")) {
                terminologyProperties.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SourceLanguageCode")) {
                terminologyProperties.setSourceLanguageCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TargetLanguageCodes")) {
                terminologyProperties.setTargetLanguageCodes(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("EncryptionKey")) {
                terminologyProperties.setEncryptionKey(EncryptionKeyJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SizeBytes")) {
                terminologyProperties.setSizeBytes(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TermCount")) {
                terminologyProperties.setTermCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedAt")) {
                terminologyProperties.setCreatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastUpdatedAt")) {
                terminologyProperties.setLastUpdatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return terminologyProperties;
    }

    private static TerminologyPropertiesJsonUnmarshaller instance;

    public static TerminologyPropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TerminologyPropertiesJsonUnmarshaller();
        return instance;
    }
}
