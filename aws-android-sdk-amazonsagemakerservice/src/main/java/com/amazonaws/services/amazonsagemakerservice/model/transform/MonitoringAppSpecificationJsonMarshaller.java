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
 * JSON marshaller for POJO MonitoringAppSpecification
 */
class MonitoringAppSpecificationJsonMarshaller {

    public void marshall(MonitoringAppSpecification monitoringAppSpecification,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (monitoringAppSpecification.getImageUri() != null) {
            String imageUri = monitoringAppSpecification.getImageUri();
            jsonWriter.name("ImageUri");
            jsonWriter.value(imageUri);
        }
        if (monitoringAppSpecification.getContainerEntrypoint() != null) {
            java.util.List<String> containerEntrypoint = monitoringAppSpecification
                    .getContainerEntrypoint();
            jsonWriter.name("ContainerEntrypoint");
            jsonWriter.beginArray();
            for (String containerEntrypointItem : containerEntrypoint) {
                if (containerEntrypointItem != null) {
                    jsonWriter.value(containerEntrypointItem);
                }
            }
            jsonWriter.endArray();
        }
        if (monitoringAppSpecification.getContainerArguments() != null) {
            java.util.List<String> containerArguments = monitoringAppSpecification
                    .getContainerArguments();
            jsonWriter.name("ContainerArguments");
            jsonWriter.beginArray();
            for (String containerArgumentsItem : containerArguments) {
                if (containerArgumentsItem != null) {
                    jsonWriter.value(containerArgumentsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (monitoringAppSpecification.getRecordPreprocessorSourceUri() != null) {
            String recordPreprocessorSourceUri = monitoringAppSpecification
                    .getRecordPreprocessorSourceUri();
            jsonWriter.name("RecordPreprocessorSourceUri");
            jsonWriter.value(recordPreprocessorSourceUri);
        }
        if (monitoringAppSpecification.getPostAnalyticsProcessorSourceUri() != null) {
            String postAnalyticsProcessorSourceUri = monitoringAppSpecification
                    .getPostAnalyticsProcessorSourceUri();
            jsonWriter.name("PostAnalyticsProcessorSourceUri");
            jsonWriter.value(postAnalyticsProcessorSourceUri);
        }
        jsonWriter.endObject();
    }

    private static MonitoringAppSpecificationJsonMarshaller instance;

    public static MonitoringAppSpecificationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MonitoringAppSpecificationJsonMarshaller();
        return instance;
    }
}
