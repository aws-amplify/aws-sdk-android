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
 * JSON marshaller for POJO MonitoringBaselineConfig
 */
class MonitoringBaselineConfigJsonMarshaller {

    public void marshall(MonitoringBaselineConfig monitoringBaselineConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (monitoringBaselineConfig.getConstraintsResource() != null) {
            MonitoringConstraintsResource constraintsResource = monitoringBaselineConfig
                    .getConstraintsResource();
            jsonWriter.name("ConstraintsResource");
            MonitoringConstraintsResourceJsonMarshaller.getInstance().marshall(constraintsResource,
                    jsonWriter);
        }
        if (monitoringBaselineConfig.getStatisticsResource() != null) {
            MonitoringStatisticsResource statisticsResource = monitoringBaselineConfig
                    .getStatisticsResource();
            jsonWriter.name("StatisticsResource");
            MonitoringStatisticsResourceJsonMarshaller.getInstance().marshall(statisticsResource,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static MonitoringBaselineConfigJsonMarshaller instance;

    public static MonitoringBaselineConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MonitoringBaselineConfigJsonMarshaller();
        return instance;
    }
}
