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

package com.amazonaws.services.lightsail.model.transform;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Alarm
 */
class AlarmJsonMarshaller {

    public void marshall(Alarm alarm, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (alarm.getName() != null) {
            String name = alarm.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (alarm.getArn() != null) {
            String arn = alarm.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (alarm.getCreatedAt() != null) {
            java.util.Date createdAt = alarm.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (alarm.getLocation() != null) {
            ResourceLocation location = alarm.getLocation();
            jsonWriter.name("location");
            ResourceLocationJsonMarshaller.getInstance().marshall(location, jsonWriter);
        }
        if (alarm.getResourceType() != null) {
            String resourceType = alarm.getResourceType();
            jsonWriter.name("resourceType");
            jsonWriter.value(resourceType);
        }
        if (alarm.getSupportCode() != null) {
            String supportCode = alarm.getSupportCode();
            jsonWriter.name("supportCode");
            jsonWriter.value(supportCode);
        }
        if (alarm.getMonitoredResourceInfo() != null) {
            MonitoredResourceInfo monitoredResourceInfo = alarm.getMonitoredResourceInfo();
            jsonWriter.name("monitoredResourceInfo");
            MonitoredResourceInfoJsonMarshaller.getInstance().marshall(monitoredResourceInfo,
                    jsonWriter);
        }
        if (alarm.getComparisonOperator() != null) {
            String comparisonOperator = alarm.getComparisonOperator();
            jsonWriter.name("comparisonOperator");
            jsonWriter.value(comparisonOperator);
        }
        if (alarm.getEvaluationPeriods() != null) {
            Integer evaluationPeriods = alarm.getEvaluationPeriods();
            jsonWriter.name("evaluationPeriods");
            jsonWriter.value(evaluationPeriods);
        }
        if (alarm.getPeriod() != null) {
            Integer period = alarm.getPeriod();
            jsonWriter.name("period");
            jsonWriter.value(period);
        }
        if (alarm.getThreshold() != null) {
            Double threshold = alarm.getThreshold();
            jsonWriter.name("threshold");
            jsonWriter.value(threshold);
        }
        if (alarm.getDatapointsToAlarm() != null) {
            Integer datapointsToAlarm = alarm.getDatapointsToAlarm();
            jsonWriter.name("datapointsToAlarm");
            jsonWriter.value(datapointsToAlarm);
        }
        if (alarm.getTreatMissingData() != null) {
            String treatMissingData = alarm.getTreatMissingData();
            jsonWriter.name("treatMissingData");
            jsonWriter.value(treatMissingData);
        }
        if (alarm.getStatistic() != null) {
            String statistic = alarm.getStatistic();
            jsonWriter.name("statistic");
            jsonWriter.value(statistic);
        }
        if (alarm.getMetricName() != null) {
            String metricName = alarm.getMetricName();
            jsonWriter.name("metricName");
            jsonWriter.value(metricName);
        }
        if (alarm.getState() != null) {
            String state = alarm.getState();
            jsonWriter.name("state");
            jsonWriter.value(state);
        }
        if (alarm.getUnit() != null) {
            String unit = alarm.getUnit();
            jsonWriter.name("unit");
            jsonWriter.value(unit);
        }
        if (alarm.getContactProtocols() != null) {
            java.util.List<String> contactProtocols = alarm.getContactProtocols();
            jsonWriter.name("contactProtocols");
            jsonWriter.beginArray();
            for (String contactProtocolsItem : contactProtocols) {
                if (contactProtocolsItem != null) {
                    jsonWriter.value(contactProtocolsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (alarm.getNotificationTriggers() != null) {
            java.util.List<String> notificationTriggers = alarm.getNotificationTriggers();
            jsonWriter.name("notificationTriggers");
            jsonWriter.beginArray();
            for (String notificationTriggersItem : notificationTriggers) {
                if (notificationTriggersItem != null) {
                    jsonWriter.value(notificationTriggersItem);
                }
            }
            jsonWriter.endArray();
        }
        if (alarm.getNotificationEnabled() != null) {
            Boolean notificationEnabled = alarm.getNotificationEnabled();
            jsonWriter.name("notificationEnabled");
            jsonWriter.value(notificationEnabled);
        }
        jsonWriter.endObject();
    }

    private static AlarmJsonMarshaller instance;

    public static AlarmJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AlarmJsonMarshaller();
        return instance;
    }
}
