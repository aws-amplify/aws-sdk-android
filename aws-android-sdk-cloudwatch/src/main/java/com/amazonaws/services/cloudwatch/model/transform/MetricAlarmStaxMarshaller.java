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

import com.amazonaws.Request;
import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO MetricAlarm
 */
class MetricAlarmStaxMarshaller {

    public void marshall(MetricAlarm _metricAlarm, Request<?> request, String _prefix) {
        String prefix;
        if (_metricAlarm.getAlarmName() != null) {
            prefix = _prefix + "AlarmName";
            String alarmName = _metricAlarm.getAlarmName();
            request.addParameter(prefix, StringUtils.fromString(alarmName));
        }
        if (_metricAlarm.getAlarmArn() != null) {
            prefix = _prefix + "AlarmArn";
            String alarmArn = _metricAlarm.getAlarmArn();
            request.addParameter(prefix, StringUtils.fromString(alarmArn));
        }
        if (_metricAlarm.getAlarmDescription() != null) {
            prefix = _prefix + "AlarmDescription";
            String alarmDescription = _metricAlarm.getAlarmDescription();
            request.addParameter(prefix, StringUtils.fromString(alarmDescription));
        }
        if (_metricAlarm.getAlarmConfigurationUpdatedTimestamp() != null) {
            prefix = _prefix + "AlarmConfigurationUpdatedTimestamp";
            java.util.Date alarmConfigurationUpdatedTimestamp = _metricAlarm
                    .getAlarmConfigurationUpdatedTimestamp();
            request.addParameter(prefix, StringUtils.fromDate(alarmConfigurationUpdatedTimestamp));
        }
        if (_metricAlarm.getActionsEnabled() != null) {
            prefix = _prefix + "ActionsEnabled";
            Boolean actionsEnabled = _metricAlarm.getActionsEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(actionsEnabled));
        }
        if (_metricAlarm.getOKActions() != null) {
            prefix = _prefix + "OKActions";
            java.util.List<String> oKActions = _metricAlarm.getOKActions();
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
        if (_metricAlarm.getAlarmActions() != null) {
            prefix = _prefix + "AlarmActions";
            java.util.List<String> alarmActions = _metricAlarm.getAlarmActions();
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
        if (_metricAlarm.getInsufficientDataActions() != null) {
            prefix = _prefix + "InsufficientDataActions";
            java.util.List<String> insufficientDataActions = _metricAlarm
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
        if (_metricAlarm.getStateValue() != null) {
            prefix = _prefix + "StateValue";
            String stateValue = _metricAlarm.getStateValue();
            request.addParameter(prefix, StringUtils.fromString(stateValue));
        }
        if (_metricAlarm.getStateReason() != null) {
            prefix = _prefix + "StateReason";
            String stateReason = _metricAlarm.getStateReason();
            request.addParameter(prefix, StringUtils.fromString(stateReason));
        }
        if (_metricAlarm.getStateReasonData() != null) {
            prefix = _prefix + "StateReasonData";
            String stateReasonData = _metricAlarm.getStateReasonData();
            request.addParameter(prefix, StringUtils.fromString(stateReasonData));
        }
        if (_metricAlarm.getStateUpdatedTimestamp() != null) {
            prefix = _prefix + "StateUpdatedTimestamp";
            java.util.Date stateUpdatedTimestamp = _metricAlarm.getStateUpdatedTimestamp();
            request.addParameter(prefix, StringUtils.fromDate(stateUpdatedTimestamp));
        }
        if (_metricAlarm.getMetricName() != null) {
            prefix = _prefix + "MetricName";
            String metricName = _metricAlarm.getMetricName();
            request.addParameter(prefix, StringUtils.fromString(metricName));
        }
        if (_metricAlarm.getNamespace() != null) {
            prefix = _prefix + "Namespace";
            String namespace = _metricAlarm.getNamespace();
            request.addParameter(prefix, StringUtils.fromString(namespace));
        }
        if (_metricAlarm.getStatistic() != null) {
            prefix = _prefix + "Statistic";
            String statistic = _metricAlarm.getStatistic();
            request.addParameter(prefix, StringUtils.fromString(statistic));
        }
        if (_metricAlarm.getDimensions() != null) {
            prefix = _prefix + "Dimensions";
            java.util.List<Dimension> dimensions = _metricAlarm.getDimensions();
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
        if (_metricAlarm.getPeriod() != null) {
            prefix = _prefix + "Period";
            Integer period = _metricAlarm.getPeriod();
            request.addParameter(prefix, StringUtils.fromInteger(period));
        }
        if (_metricAlarm.getUnit() != null) {
            prefix = _prefix + "Unit";
            String unit = _metricAlarm.getUnit();
            request.addParameter(prefix, StringUtils.fromString(unit));
        }
        if (_metricAlarm.getEvaluationPeriods() != null) {
            prefix = _prefix + "EvaluationPeriods";
            Integer evaluationPeriods = _metricAlarm.getEvaluationPeriods();
            request.addParameter(prefix, StringUtils.fromInteger(evaluationPeriods));
        }
        if (_metricAlarm.getThreshold() != null) {
            prefix = _prefix + "Threshold";
            Double threshold = _metricAlarm.getThreshold();
            request.addParameter(prefix, StringUtils.fromDouble(threshold));
        }
        if (_metricAlarm.getComparisonOperator() != null) {
            prefix = _prefix + "ComparisonOperator";
            String comparisonOperator = _metricAlarm.getComparisonOperator();
            request.addParameter(prefix, StringUtils.fromString(comparisonOperator));
        }
    }

    private static MetricAlarmStaxMarshaller instance;

    public static MetricAlarmStaxMarshaller getInstance() {
        if (instance == null)
            instance = new MetricAlarmStaxMarshaller();
        return instance;
    }
}
