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

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for PutAlarmRequest
 */
public class PutAlarmRequestMarshaller implements
        Marshaller<Request<PutAlarmRequest>, PutAlarmRequest> {

    public Request<PutAlarmRequest> marshall(PutAlarmRequest putAlarmRequest) {
        if (putAlarmRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(PutAlarmRequest)");
        }

        Request<PutAlarmRequest> request = new DefaultRequest<PutAlarmRequest>(putAlarmRequest,
                "AmazonLightsail");
        String target = "Lightsail_20161128.PutAlarm";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (putAlarmRequest.getAlarmName() != null) {
                String alarmName = putAlarmRequest.getAlarmName();
                jsonWriter.name("alarmName");
                jsonWriter.value(alarmName);
            }
            if (putAlarmRequest.getMetricName() != null) {
                String metricName = putAlarmRequest.getMetricName();
                jsonWriter.name("metricName");
                jsonWriter.value(metricName);
            }
            if (putAlarmRequest.getMonitoredResourceName() != null) {
                String monitoredResourceName = putAlarmRequest.getMonitoredResourceName();
                jsonWriter.name("monitoredResourceName");
                jsonWriter.value(monitoredResourceName);
            }
            if (putAlarmRequest.getComparisonOperator() != null) {
                String comparisonOperator = putAlarmRequest.getComparisonOperator();
                jsonWriter.name("comparisonOperator");
                jsonWriter.value(comparisonOperator);
            }
            if (putAlarmRequest.getThreshold() != null) {
                Double threshold = putAlarmRequest.getThreshold();
                jsonWriter.name("threshold");
                jsonWriter.value(threshold);
            }
            if (putAlarmRequest.getEvaluationPeriods() != null) {
                Integer evaluationPeriods = putAlarmRequest.getEvaluationPeriods();
                jsonWriter.name("evaluationPeriods");
                jsonWriter.value(evaluationPeriods);
            }
            if (putAlarmRequest.getDatapointsToAlarm() != null) {
                Integer datapointsToAlarm = putAlarmRequest.getDatapointsToAlarm();
                jsonWriter.name("datapointsToAlarm");
                jsonWriter.value(datapointsToAlarm);
            }
            if (putAlarmRequest.getTreatMissingData() != null) {
                String treatMissingData = putAlarmRequest.getTreatMissingData();
                jsonWriter.name("treatMissingData");
                jsonWriter.value(treatMissingData);
            }
            if (putAlarmRequest.getContactProtocols() != null) {
                java.util.List<String> contactProtocols = putAlarmRequest.getContactProtocols();
                jsonWriter.name("contactProtocols");
                jsonWriter.beginArray();
                for (String contactProtocolsItem : contactProtocols) {
                    if (contactProtocolsItem != null) {
                        jsonWriter.value(contactProtocolsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (putAlarmRequest.getNotificationTriggers() != null) {
                java.util.List<String> notificationTriggers = putAlarmRequest
                        .getNotificationTriggers();
                jsonWriter.name("notificationTriggers");
                jsonWriter.beginArray();
                for (String notificationTriggersItem : notificationTriggers) {
                    if (notificationTriggersItem != null) {
                        jsonWriter.value(notificationTriggersItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (putAlarmRequest.getNotificationEnabled() != null) {
                Boolean notificationEnabled = putAlarmRequest.getNotificationEnabled();
                jsonWriter.name("notificationEnabled");
                jsonWriter.value(notificationEnabled);
            }

            jsonWriter.endObject();
            jsonWriter.close();
            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length", Integer.toString(content.length));
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
