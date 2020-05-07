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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Alarm
 */
class AlarmJsonUnmarshaller implements Unmarshaller<Alarm, JsonUnmarshallerContext> {

    public Alarm unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Alarm alarm = new Alarm();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("name")) {
                alarm.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("arn")) {
                alarm.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createdAt")) {
                alarm.setCreatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("location")) {
                alarm.setLocation(ResourceLocationJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("resourceType")) {
                alarm.setResourceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("supportCode")) {
                alarm.setSupportCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("monitoredResourceInfo")) {
                alarm.setMonitoredResourceInfo(MonitoredResourceInfoJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("comparisonOperator")) {
                alarm.setComparisonOperator(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("evaluationPeriods")) {
                alarm.setEvaluationPeriods(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("period")) {
                alarm.setPeriod(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("threshold")) {
                alarm.setThreshold(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("datapointsToAlarm")) {
                alarm.setDatapointsToAlarm(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("treatMissingData")) {
                alarm.setTreatMissingData(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("statistic")) {
                alarm.setStatistic(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("metricName")) {
                alarm.setMetricName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("state")) {
                alarm.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("unit")) {
                alarm.setUnit(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("contactProtocols")) {
                alarm.setContactProtocols(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("notificationTriggers")) {
                alarm.setNotificationTriggers(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("notificationEnabled")) {
                alarm.setNotificationEnabled(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return alarm;
    }

    private static AlarmJsonUnmarshaller instance;

    public static AlarmJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AlarmJsonUnmarshaller();
        return instance;
    }
}
