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
 * JSON marshaller for POJO EnvironmentLanguage
 */
class EnvironmentLanguageJsonMarshaller {

    public void marshall(EnvironmentLanguage environmentLanguage, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (environmentLanguage.getLanguage() != null) {
            String language = environmentLanguage.getLanguage();
            jsonWriter.name("language");
            jsonWriter.value(language);
        }
        if (environmentLanguage.getImages() != null) {
            java.util.List<EnvironmentImage> images = environmentLanguage.getImages();
            jsonWriter.name("images");
            jsonWriter.beginArray();
            for (EnvironmentImage imagesItem : images) {
                if (imagesItem != null) {
                    EnvironmentImageJsonMarshaller.getInstance().marshall(imagesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static EnvironmentLanguageJsonMarshaller instance;

    public static EnvironmentLanguageJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EnvironmentLanguageJsonMarshaller();
        return instance;
    }
}
