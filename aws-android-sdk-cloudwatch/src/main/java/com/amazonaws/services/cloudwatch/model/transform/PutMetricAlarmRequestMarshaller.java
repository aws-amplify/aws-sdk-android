/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cloudwatch.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for PutMetricAlarmRequest
 */
public class PutMetricAlarmRequestMarshaller implements
        Marshaller<Request<PutMetricAlarmRequest>, PutMetricAlarmRequest> {

    public Request<PutMetricAlarmRequest> marshall(PutMetricAlarmRequest putMetricAlarmRequest) {
        if (putMetricAlarmRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(PutMetricAlarmRequest)");
        }

        Request<PutMetricAlarmRequest> request = new DefaultRequest<PutMetricAlarmRequest>(
                putMetricAlarmRequest, "AmazonCloudWatch");
        request.addParameter("Action", "PutMetricAlarm");
        request.addParameter("Version", "2010-08-01");

        String prefix;
        if (putMetricAlarmRequest.getAlarmName() != null) {
            prefix = "AlarmName";
            String alarmName = putMetricAlarmRequest.getAlarmName();
            request.addParameter(prefix, StringUtils.fromString(alarmName));
        }
        if (putMetricAlarmRequest.getAlarmDescription() != null) {
            prefix = "AlarmDescription";
            String alarmDescription = putMetricAlarmRequest.getAlarmDescription();
            request.addParameter(prefix, StringUtils.fromString(alarmDescription));
        }
        if (putMetricAlarmRequest.getActionsEnabled() != null) {
            prefix = "ActionsEnabled";
            Boolean actionsEnabled = putMetricAlarmRequest.getActionsEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(actionsEnabled));
        }
        if (putMetricAlarmRequest.getOKActions() != null) {
            prefix = "OKActions";
            java.util.List<String> oKActions = putMetricAlarmRequest.getOKActions();
            int oKActionsIndex = 1;
            String oKActionsPrefix = prefix;
            for (String oKActionsItem : oKActions) {
                prefix = oKActionsPrefix + ".member." + oKActionsIndex;
                if (oKActionsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(oKActionsItem));
                }
                oKActionsIndex++;
            }
            prefix = oKActionsPrefix;
        }
        if (putMetricAlarmRequest.getAlarmActions() != null) {
            prefix = "AlarmActions";
            java.util.List<String> alarmActions = putMetricAlarmRequest.getAlarmActions();
            int alarmActionsIndex = 1;
            String alarmActionsPrefix = prefix;
            for (String alarmActionsItem : alarmActions) {
                prefix = alarmActionsPrefix + ".member." + alarmActionsIndex;
                if (alarmActionsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(alarmActionsItem));
                }
                alarmActionsIndex++;
            }
            prefix = alarmActionsPrefix;
        }
        if (putMetricAlarmRequest.getInsufficientDataActions() != null) {
            prefix = "InsufficientDataActions";
            java.util.List<String> insufficientDataActions = putMetricAlarmRequest
                    .getInsufficientDataActions();
            int insufficientDataActionsIndex = 1;
            String insufficientDataActionsPrefix = prefix;
            for (String insufficientDataActionsItem : insufficientDataActions) {
                prefix = insufficientDataActionsPrefix + ".member." + insufficientDataActionsIndex;
                if (insufficientDataActionsItem != null) {
                    request.addParameter(prefix,
                            StringUtils.fromString(insufficientDataActionsItem));
                }
                insufficientDataActionsIndex++;
            }
            prefix = insufficientDataActionsPrefix;
        }
        if (putMetricAlarmRequest.getMetricName() != null) {
            prefix = "MetricName";
            String metricName = putMetricAlarmRequest.getMetricName();
            request.addParameter(prefix, StringUtils.fromString(metricName));
        }
        if (putMetricAlarmRequest.getNamespace() != null) {
            prefix = "Namespace";
            String namespace = putMetricAlarmRequest.getNamespace();
            request.addParameter(prefix, StringUtils.fromString(namespace));
        }
        if (putMetricAlarmRequest.getStatistic() != null) {
            prefix = "Statistic";
            String statistic = putMetricAlarmRequest.getStatistic();
            request.addParameter(prefix, StringUtils.fromString(statistic));
        }
        if (putMetricAlarmRequest.getDimensions() != null) {
            prefix = "Dimensions";
            java.util.List<Dimension> dimensions = putMetricAlarmRequest.getDimensions();
            int dimensionsIndex = 1;
            String dimensionsPrefix = prefix;
            for (Dimension dimensionsItem : dimensions) {
                prefix = dimensionsPrefix + ".member." + dimensionsIndex;
                if (dimensionsItem != null) {
                    DimensionStaxMarshaller.getInstance().marshall(dimensionsItem, request,
                            prefix + ".");
                }
                dimensionsIndex++;
            }
            prefix = dimensionsPrefix;
        }
        if (putMetricAlarmRequest.getPeriod() != null) {
            prefix = "Period";
            Integer period = putMetricAlarmRequest.getPeriod();
            request.addParameter(prefix, StringUtils.fromInteger(period));
        }
        if (putMetricAlarmRequest.getUnit() != null) {
            prefix = "Unit";
            String unit = putMetricAlarmRequest.getUnit();
            request.addParameter(prefix, StringUtils.fromString(unit));
        }
        if (putMetricAlarmRequest.getEvaluationPeriods() != null) {
            prefix = "EvaluationPeriods";
            Integer evaluationPeriods = putMetricAlarmRequest.getEvaluationPeriods();
            request.addParameter(prefix, StringUtils.fromInteger(evaluationPeriods));
        }
        if (putMetricAlarmRequest.getThreshold() != null) {
            prefix = "Threshold";
            Double threshold = putMetricAlarmRequest.getThreshold();
            request.addParameter(prefix, StringUtils.fromDouble(threshold));
        }
        if (putMetricAlarmRequest.getComparisonOperator() != null) {
            prefix = "ComparisonOperator";
            String comparisonOperator = putMetricAlarmRequest.getComparisonOperator();
            request.addParameter(prefix, StringUtils.fromString(comparisonOperator));
        }

        return request;
    }
}
