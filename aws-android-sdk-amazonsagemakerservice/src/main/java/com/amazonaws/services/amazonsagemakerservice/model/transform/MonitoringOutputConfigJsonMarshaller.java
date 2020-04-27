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
 * JSON marshaller for POJO MonitoringOutputConfig
 */
class MonitoringOutputConfigJsonMarshaller {

    public void marshall(MonitoringOutputConfig monitoringOutputConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (monitoringOutputConfig.getMonitoringOutputs() != null) {
            java.util.List<MonitoringOutput> monitoringOutputs = monitoringOutputConfig
                    .getMonitoringOutputs();
            jsonWriter.name("MonitoringOutputs");
            jsonWriter.beginArray();
            for (MonitoringOutput monitoringOutputsItem : monitoringOutputs) {
                if (monitoringOutputsItem != null) {
                    MonitoringOutputJsonMarshaller.getInstance().marshall(monitoringOutputsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (monitoringOutputConfig.getKmsKeyId() != null) {
            String kmsKeyId = monitoringOutputConfig.getKmsKeyId();
            jsonWriter.name("KmsKeyId");
            jsonWriter.value(kmsKeyId);
        }
        jsonWriter.endObject();
    }

    private static MonitoringOutputConfigJsonMarshaller instance;

    public static MonitoringOutputConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MonitoringOutputConfigJsonMarshaller();
        return instance;
    }
}
