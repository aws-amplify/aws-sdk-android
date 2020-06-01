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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO MonitoringAppSpecification
 */
class MonitoringAppSpecificationJsonUnmarshaller implements
        Unmarshaller<MonitoringAppSpecification, JsonUnmarshallerContext> {

    public MonitoringAppSpecification unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        MonitoringAppSpecification monitoringAppSpecification = new MonitoringAppSpecification();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ImageUri")) {
                monitoringAppSpecification.setImageUri(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ContainerEntrypoint")) {
                monitoringAppSpecification.setContainerEntrypoint(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ContainerArguments")) {
                monitoringAppSpecification.setContainerArguments(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("RecordPreprocessorSourceUri")) {
                monitoringAppSpecification.setRecordPreprocessorSourceUri(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("PostAnalyticsProcessorSourceUri")) {
                monitoringAppSpecification
                        .setPostAnalyticsProcessorSourceUri(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return monitoringAppSpecification;
    }

    private static MonitoringAppSpecificationJsonUnmarshaller instance;

    public static MonitoringAppSpecificationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MonitoringAppSpecificationJsonUnmarshaller();
        return instance;
    }
}
