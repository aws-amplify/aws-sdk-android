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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InferenceSpecification
 */
class InferenceSpecificationJsonMarshaller {

    public void marshall(InferenceSpecification inferenceSpecification, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (inferenceSpecification.getContainers() != null) {
            java.util.List<ModelPackageContainerDefinition> containers = inferenceSpecification
                    .getContainers();
            jsonWriter.name("Containers");
            jsonWriter.beginArray();
            for (ModelPackageContainerDefinition containersItem : containers) {
                if (containersItem != null) {
                    ModelPackageContainerDefinitionJsonMarshaller.getInstance().marshall(
                            containersItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (inferenceSpecification.getSupportedTransformInstanceTypes() != null) {
            java.util.List<String> supportedTransformInstanceTypes = inferenceSpecification
                    .getSupportedTransformInstanceTypes();
            jsonWriter.name("SupportedTransformInstanceTypes");
            jsonWriter.beginArray();
            for (String supportedTransformInstanceTypesItem : supportedTransformInstanceTypes) {
                if (supportedTransformInstanceTypesItem != null) {
                    jsonWriter.value(supportedTransformInstanceTypesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (inferenceSpecification.getSupportedRealtimeInferenceInstanceTypes() != null) {
            java.util.List<String> supportedRealtimeInferenceInstanceTypes = inferenceSpecification
                    .getSupportedRealtimeInferenceInstanceTypes();
            jsonWriter.name("SupportedRealtimeInferenceInstanceTypes");
            jsonWriter.beginArray();
            for (String supportedRealtimeInferenceInstanceTypesItem : supportedRealtimeInferenceInstanceTypes) {
                if (supportedRealtimeInferenceInstanceTypesItem != null) {
                    jsonWriter.value(supportedRealtimeInferenceInstanceTypesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (inferenceSpecification.getSupportedContentTypes() != null) {
            java.util.List<String> supportedContentTypes = inferenceSpecification
                    .getSupportedContentTypes();
            jsonWriter.name("SupportedContentTypes");
            jsonWriter.beginArray();
            for (String supportedContentTypesItem : supportedContentTypes) {
                if (supportedContentTypesItem != null) {
                    jsonWriter.value(supportedContentTypesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (inferenceSpecification.getSupportedResponseMIMETypes() != null) {
            java.util.List<String> supportedResponseMIMETypes = inferenceSpecification
                    .getSupportedResponseMIMETypes();
            jsonWriter.name("SupportedResponseMIMETypes");
            jsonWriter.beginArray();
            for (String supportedResponseMIMETypesItem : supportedResponseMIMETypes) {
                if (supportedResponseMIMETypesItem != null) {
                    jsonWriter.value(supportedResponseMIMETypesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static InferenceSpecificationJsonMarshaller instance;

    public static InferenceSpecificationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InferenceSpecificationJsonMarshaller();
        return instance;
    }
}
