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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TensorBoardAppSettings
 */
class TensorBoardAppSettingsJsonMarshaller {

    public void marshall(TensorBoardAppSettings tensorBoardAppSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (tensorBoardAppSettings.getDefaultResourceSpec() != null) {
            ResourceSpec defaultResourceSpec = tensorBoardAppSettings.getDefaultResourceSpec();
            jsonWriter.name("DefaultResourceSpec");
            ResourceSpecJsonMarshaller.getInstance().marshall(defaultResourceSpec, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static TensorBoardAppSettingsJsonMarshaller instance;

    public static TensorBoardAppSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TensorBoardAppSettingsJsonMarshaller();
        return instance;
    }
}
