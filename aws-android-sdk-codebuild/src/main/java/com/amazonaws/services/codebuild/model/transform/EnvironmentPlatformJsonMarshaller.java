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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EnvironmentPlatform
 */
class EnvironmentPlatformJsonMarshaller {

    public void marshall(EnvironmentPlatform environmentPlatform, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (environmentPlatform.getPlatform() != null) {
            String platform = environmentPlatform.getPlatform();
            jsonWriter.name("platform");
            jsonWriter.value(platform);
        }
        if (environmentPlatform.getLanguages() != null) {
            java.util.List<EnvironmentLanguage> languages = environmentPlatform.getLanguages();
            jsonWriter.name("languages");
            jsonWriter.beginArray();
            for (EnvironmentLanguage languagesItem : languages) {
                if (languagesItem != null) {
                    EnvironmentLanguageJsonMarshaller.getInstance().marshall(languagesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static EnvironmentPlatformJsonMarshaller instance;

    public static EnvironmentPlatformJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EnvironmentPlatformJsonMarshaller();
        return instance;
    }
}
