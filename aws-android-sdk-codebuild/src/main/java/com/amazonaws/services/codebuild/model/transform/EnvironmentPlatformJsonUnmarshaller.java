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

package com.amazonaws.services.codebuild.model.transform;

import com.amazonaws.services.codebuild.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO EnvironmentPlatform
 */
class EnvironmentPlatformJsonUnmarshaller implements
        Unmarshaller<EnvironmentPlatform, JsonUnmarshallerContext> {

    public EnvironmentPlatform unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        EnvironmentPlatform environmentPlatform = new EnvironmentPlatform();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("platform")) {
                environmentPlatform.setPlatform(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("languages")) {
                environmentPlatform.setLanguages(new ListUnmarshaller<EnvironmentLanguage>(
                        EnvironmentLanguageJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return environmentPlatform;
    }

    private static EnvironmentPlatformJsonUnmarshaller instance;

    public static EnvironmentPlatformJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EnvironmentPlatformJsonUnmarshaller();
        return instance;
    }
}
