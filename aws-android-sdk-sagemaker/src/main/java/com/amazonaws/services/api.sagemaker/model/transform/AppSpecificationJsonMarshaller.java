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
 * JSON marshaller for POJO AppSpecification
 */
class AppSpecificationJsonMarshaller {

    public void marshall(AppSpecification appSpecification, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (appSpecification.getImageUri() != null) {
            String imageUri = appSpecification.getImageUri();
            jsonWriter.name("ImageUri");
            jsonWriter.value(imageUri);
        }
        if (appSpecification.getContainerEntrypoint() != null) {
            java.util.List<String> containerEntrypoint = appSpecification.getContainerEntrypoint();
            jsonWriter.name("ContainerEntrypoint");
            jsonWriter.beginArray();
            for (String containerEntrypointItem : containerEntrypoint) {
                if (containerEntrypointItem != null) {
                    jsonWriter.value(containerEntrypointItem);
                }
            }
            jsonWriter.endArray();
        }
        if (appSpecification.getContainerArguments() != null) {
            java.util.List<String> containerArguments = appSpecification.getContainerArguments();
            jsonWriter.name("ContainerArguments");
            jsonWriter.beginArray();
            for (String containerArgumentsItem : containerArguments) {
                if (containerArgumentsItem != null) {
                    jsonWriter.value(containerArgumentsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static AppSpecificationJsonMarshaller instance;

    public static AppSpecificationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AppSpecificationJsonMarshaller();
        return instance;
    }
}
