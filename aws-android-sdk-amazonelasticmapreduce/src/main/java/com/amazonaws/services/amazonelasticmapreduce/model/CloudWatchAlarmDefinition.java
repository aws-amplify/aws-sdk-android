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

package com.amazonaws.services.amazonelasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * The definition of a CloudWatch metric alarm, which determines when an
 * automatic scaling activity is triggered. When the defined alarm conditions
 * are satisfied, scaling activity begins.
 * </p>
 */
public class CloudWatchAlarmDefinition implements Serializable {
    /**
     * <p>
     * Determines how the metric specified by <code>MetricName</code> is
     * compared to the value specified by <code>Threshold</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GREATER_THAN_OR_EQUAL, GREATER_THAN, LESS_THAN,
     * LESS_THAN_OR_EQUAL
     */
    private String comparisonOperator;

    /**
     * <p>
     * The number of periods, in five-minute increments, during which the alarm
     * condition must exist before the alarm triggers automatic scaling
     * activity. The default value is <code>1</code>.
     * </p>
     */
    private Integer evaluationPeriods;

    /**
     * <p>
     * The name of the CloudWatch metric that is watched to determine an alarm
     * condition.
     * </p>
     */
    private String metricName;

    /**
     * <p>
     * The namespace for the CloudWatch metric. The default is
     * <code>AWS/ElasticMapReduce</code>.
     * </p>
     */
    private String namespace;

    /**
     * <p>
     * The period, in seconds, over which the statistic is applied. EMR
     * CloudWatch metrics are emitted every five minutes (300 seconds), so if an
     * EMR CloudWatch metric is specified, specify <code>300</code>.
     * </p>
     */
    private Integer period;

    /**
     * <p>
     * The statistic to apply to the metric associated with the alarm. The
     * default is <code>AVERAGE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAMPLE_COUNT, AVERAGE, SUM, MINIMUM, MAXIMUM
     */
    private String statistic;

    /**
     * <p>
     * The value against which the specified statistic is compared.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Double threshold;

    /**
     * <p>
     * The unit of measure associated with the CloudWatch metric being watched.
     * The value specified for <code>Unit</code> must correspond to the units
     * specified in the CloudWatch metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, SECONDS, MICRO_SECONDS, MILLI_SECONDS,
     * BYTES, KILO_BYTES, MEGA_BYTES, GIGA_BYTES, TERA_BYTES, BITS, KILO_BITS,
     * MEGA_BITS, GIGA_BITS, TERA_BITS, PERCENT, COUNT, BYTES_PER_SECOND,
     * KILO_BYTES_PER_SECOND, MEGA_BYTES_PER_SECOND, GIGA_BYTES_PER_SECOND,
     * TERA_BYTES_PER_SECOND, BITS_PER_SECOND, KILO_BITS_PER_SECOND,
     * MEGA_BITS_PER_SECOND, GIGA_BITS_PER_SECOND, TERA_BITS_PER_SECOND,
     * COUNT_PER_SECOND
     */
    private String unit;

    /**
     * <p>
     * A CloudWatch metric dimension.
     * </p>
     */
    private java.util.List<MetricDimension> dimensions;

    /**
     * <p>
     * Determines how the metric specified by <code>MetricName</code> is
     * compared to the value specified by <code>Threshold</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GREATER_THAN_OR_EQUAL, GREATER_THAN, LESS_THAN,
     * LESS_THAN_OR_EQUAL
     *
     * @return <p>
     *         Determines how the metric specified by <code>MetricName</code> is
     *         compared to the value specified by <code>Threshold</code>.
     *         </p>
     * @see ComparisonOperator
     */
    public String getComparisonOperator() {
        return comparisonOperator;
    }

    /**
     * <p>
     * Determines how the metric specified by <code>MetricName</code> is
     * compared to the value specified by <code>Threshold</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GREATER_THAN_OR_EQUAL, GREATER_THAN, LESS_THAN,
     * LESS_THAN_OR_EQUAL
     *
     * @param comparisonOperator <p>
     *            Determines how the metric specified by <code>MetricName</code>
     *            is compared to the value specified by <code>Threshold</code>.
     *            </p>
     * @see ComparisonOperator
     */
    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    /**
     * <p>
     * Determines how the metric specified by <code>MetricName</code> is
     * compared to the value specified by <code>Threshold</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GREATER_THAN_OR_EQUAL, GREATER_THAN, LESS_THAN,
     * LESS_THAN_OR_EQUAL
     *
     * @param comparisonOperator <p>
     *            Determines how the metric specified by <code>MetricName</code>
     *            is compared to the value specified by <code>Threshold</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ComparisonOperator
     */
    public CloudWatchAlarmDefinition withComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }

    /**
     * <p>
     * Determines how the metric specified by <code>MetricName</code> is
     * compared to the value specified by <code>Threshold</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GREATER_THAN_OR_EQUAL, GREATER_THAN, LESS_THAN,
     * LESS_THAN_OR_EQUAL
     *
     * @param comparisonOperator <p>
     *            Determines how the metric specified by <code>MetricName</code>
     *            is compared to the value specified by <code>Threshold</code>.
     *            </p>
     * @see ComparisonOperator
     */
    public void setComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
    }

    /**
     * <p>
     * Determines how the metric specified by <code>MetricName</code> is
     * compared to the value specified by <code>Threshold</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GREATER_THAN_OR_EQUAL, GREATER_THAN, LESS_THAN,
     * LESS_THAN_OR_EQUAL
     *
     * @param comparisonOperator <p>
     *            Determines how the metric specified by <code>MetricName</code>
     *            is compared to the value specified by <code>Threshold</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ComparisonOperator
     */
    public CloudWatchAlarmDefinition withComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
        return this;
    }

    /**
     * <p>
     * The number of periods, in five-minute increments, during which the alarm
     * condition must exist before the alarm triggers automatic scaling
     * activity. The default value is <code>1</code>.
     * </p>
     *
     * @return <p>
     *         The number of periods, in five-minute increments, during which
     *         the alarm condition must exist before the alarm triggers
     *         automatic scaling activity. The default value is <code>1</code>.
     *         </p>
     */
    public Integer getEvaluationPeriods() {
        return evaluationPeriods;
    }

    /**
     * <p>
     * The number of periods, in five-minute increments, during which the alarm
     * condition must exist before the alarm triggers automatic scaling
     * activity. The default value is <code>1</code>.
     * </p>
     *
     * @param evaluationPeriods <p>
     *            The number of periods, in five-minute increments, during which
     *            the alarm condition must exist before the alarm triggers
     *            automatic scaling activity. The default value is
     *            <code>1</code>.
     *            </p>
     */
    public void setEvaluationPeriods(Integer evaluationPeriods) {
        this.evaluationPeriods = evaluationPeriods;
    }

    /**
     * <p>
     * The number of periods, in five-minute increments, during which the alarm
     * condition must exist before the alarm triggers automatic scaling
     * activity. The default value is <code>1</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param evaluationPeriods <p>
     *            The number of periods, in five-minute increments, during which
     *            the alarm condition must exist before the alarm triggers
     *            automatic scaling activity. The default value is
     *            <code>1</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudWatchAlarmDefinition withEvaluationPeriods(Integer evaluationPeriods) {
        this.evaluationPeriods = evaluationPeriods;
        return this;
    }

    /**
     * <p>
     * The name of the CloudWatch metric that is watched to determine an alarm
     * condition.
     * </p>
     *
     * @return <p>
     *         The name of the CloudWatch metric that is watched to determine an
     *         alarm condition.
     *         </p>
     */
    public String getMetricName() {
        return metricName;
    }

    /**
     * <p>
     * The name of the CloudWatch metric that is watched to determine an alarm
     * condition.
     * </p>
     *
     * @param metricName <p>
     *            The name of the CloudWatch metric that is watched to determine
     *            an alarm condition.
     *            </p>
     */
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the CloudWatch metric that is watched to determine an alarm
     * condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricName <p>
     *            The name of the CloudWatch metric that is watched to determine
     *            an alarm condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudWatchAlarmDefinition withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * <p>
     * The namespace for the CloudWatch metric. The default is
     * <code>AWS/ElasticMapReduce</code>.
     * </p>
     *
     * @return <p>
     *         The namespace for the CloudWatch metric. The default is
     *         <code>AWS/ElasticMapReduce</code>.
     *         </p>
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * <p>
     * The namespace for the CloudWatch metric. The default is
     * <code>AWS/ElasticMapReduce</code>.
     * </p>
     *
     * @param namespace <p>
     *            The namespace for the CloudWatch metric. The default is
     *            <code>AWS/ElasticMapReduce</code>.
     *            </p>
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace for the CloudWatch metric. The default is
     * <code>AWS/ElasticMapReduce</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param namespace <p>
     *            The namespace for the CloudWatch metric. The default is
     *            <code>AWS/ElasticMapReduce</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudWatchAlarmDefinition withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * <p>
     * The period, in seconds, over which the statistic is applied. EMR
     * CloudWatch metrics are emitted every five minutes (300 seconds), so if an
     * EMR CloudWatch metric is specified, specify <code>300</code>.
     * </p>
     *
     * @return <p>
     *         The period, in seconds, over which the statistic is applied. EMR
     *         CloudWatch metrics are emitted every five minutes (300 seconds),
     *         so if an EMR CloudWatch metric is specified, specify
     *         <code>300</code>.
     *         </p>
     */
    public Integer getPeriod() {
        return period;
    }

    /**
     * <p>
     * The period, in seconds, over which the statistic is applied. EMR
     * CloudWatch metrics are emitted every five minutes (300 seconds), so if an
     * EMR CloudWatch metric is specified, specify <code>300</code>.
     * </p>
     *
     * @param period <p>
     *            The period, in seconds, over which the statistic is applied.
     *            EMR CloudWatch metrics are emitted every five minutes (300
     *            seconds), so if an EMR CloudWatch metric is specified, specify
     *            <code>300</code>.
     *            </p>
     */
    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * <p>
     * The period, in seconds, over which the statistic is applied. EMR
     * CloudWatch metrics are emitted every five minutes (300 seconds), so if an
     * EMR CloudWatch metric is specified, specify <code>300</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param period <p>
     *            The period, in seconds, over which the statistic is applied.
     *            EMR CloudWatch metrics are emitted every five minutes (300
     *            seconds), so if an EMR CloudWatch metric is specified, specify
     *            <code>300</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudWatchAlarmDefinition withPeriod(Integer period) {
        this.period = period;
        return this;
    }

    /**
     * <p>
     * The statistic to apply to the metric associated with the alarm. The
     * default is <code>AVERAGE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAMPLE_COUNT, AVERAGE, SUM, MINIMUM, MAXIMUM
     *
     * @return <p>
     *         The statistic to apply to the metric associated with the alarm.
     *         The default is <code>AVERAGE</code>.
     *         </p>
     * @see Statistic
     */
    public String getStatistic() {
        return statistic;
    }

    /**
     * <p>
     * The statistic to apply to the metric associated with the alarm. The
     * default is <code>AVERAGE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAMPLE_COUNT, AVERAGE, SUM, MINIMUM, MAXIMUM
     *
     * @param statistic <p>
     *            The statistic to apply to the metric associated with the
     *            alarm. The default is <code>AVERAGE</code>.
     *            </p>
     * @see Statistic
     */
    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }

    /**
     * <p>
     * The statistic to apply to the metric associated with the alarm. The
     * default is <code>AVERAGE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAMPLE_COUNT, AVERAGE, SUM, MINIMUM, MAXIMUM
     *
     * @param statistic <p>
     *            The statistic to apply to the metric associated with the
     *            alarm. The default is <code>AVERAGE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Statistic
     */
    public CloudWatchAlarmDefinition withStatistic(String statistic) {
        this.statistic = statistic;
        return this;
    }

    /**
     * <p>
     * The statistic to apply to the metric associated with the alarm. The
     * default is <code>AVERAGE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAMPLE_COUNT, AVERAGE, SUM, MINIMUM, MAXIMUM
     *
     * @param statistic <p>
     *            The statistic to apply to the metric associated with the
     *            alarm. The default is <code>AVERAGE</code>.
     *            </p>
     * @see Statistic
     */
    public void setStatistic(Statistic statistic) {
        this.statistic = statistic.toString();
    }

    /**
     * <p>
     * The statistic to apply to the metric associated with the alarm. The
     * default is <code>AVERAGE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAMPLE_COUNT, AVERAGE, SUM, MINIMUM, MAXIMUM
     *
     * @param statistic <p>
     *            The statistic to apply to the metric associated with the
     *            alarm. The default is <code>AVERAGE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Statistic
     */
    public CloudWatchAlarmDefinition withStatistic(Statistic statistic) {
        this.statistic = statistic.toString();
        return this;
    }

    /**
     * <p>
     * The value against which the specified statistic is compared.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The value against which the specified statistic is compared.
     *         </p>
     */
    public Double getThreshold() {
        return threshold;
    }

    /**
     * <p>
     * The value against which the specified statistic is compared.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param threshold <p>
     *            The value against which the specified statistic is compared.
     *            </p>
     */
    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }

    /**
     * <p>
     * The value against which the specified statistic is compared.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param threshold <p>
     *            The value against which the specified statistic is compared.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudWatchAlarmDefinition withThreshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * <p>
     * The unit of measure associated with the CloudWatch metric being watched.
     * The value specified for <code>Unit</code> must correspond to the units
     * specified in the CloudWatch metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, SECONDS, MICRO_SECONDS, MILLI_SECONDS,
     * BYTES, KILO_BYTES, MEGA_BYTES, GIGA_BYTES, TERA_BYTES, BITS, KILO_BITS,
     * MEGA_BITS, GIGA_BITS, TERA_BITS, PERCENT, COUNT, BYTES_PER_SECOND,
     * KILO_BYTES_PER_SECOND, MEGA_BYTES_PER_SECOND, GIGA_BYTES_PER_SECOND,
     * TERA_BYTES_PER_SECOND, BITS_PER_SECOND, KILO_BITS_PER_SECOND,
     * MEGA_BITS_PER_SECOND, GIGA_BITS_PER_SECOND, TERA_BITS_PER_SECOND,
     * COUNT_PER_SECOND
     *
     * @return <p>
     *         The unit of measure associated with the CloudWatch metric being
     *         watched. The value specified for <code>Unit</code> must
     *         correspond to the units specified in the CloudWatch metric.
     *         </p>
     * @see Unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * <p>
     * The unit of measure associated with the CloudWatch metric being watched.
     * The value specified for <code>Unit</code> must correspond to the units
     * specified in the CloudWatch metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, SECONDS, MICRO_SECONDS, MILLI_SECONDS,
     * BYTES, KILO_BYTES, MEGA_BYTES, GIGA_BYTES, TERA_BYTES, BITS, KILO_BITS,
     * MEGA_BITS, GIGA_BITS, TERA_BITS, PERCENT, COUNT, BYTES_PER_SECOND,
     * KILO_BYTES_PER_SECOND, MEGA_BYTES_PER_SECOND, GIGA_BYTES_PER_SECOND,
     * TERA_BYTES_PER_SECOND, BITS_PER_SECOND, KILO_BITS_PER_SECOND,
     * MEGA_BITS_PER_SECOND, GIGA_BITS_PER_SECOND, TERA_BITS_PER_SECOND,
     * COUNT_PER_SECOND
     *
     * @param unit <p>
     *            The unit of measure associated with the CloudWatch metric
     *            being watched. The value specified for <code>Unit</code> must
     *            correspond to the units specified in the CloudWatch metric.
     *            </p>
     * @see Unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit of measure associated with the CloudWatch metric being watched.
     * The value specified for <code>Unit</code> must correspond to the units
     * specified in the CloudWatch metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, SECONDS, MICRO_SECONDS, MILLI_SECONDS,
     * BYTES, KILO_BYTES, MEGA_BYTES, GIGA_BYTES, TERA_BYTES, BITS, KILO_BITS,
     * MEGA_BITS, GIGA_BITS, TERA_BITS, PERCENT, COUNT, BYTES_PER_SECOND,
     * KILO_BYTES_PER_SECOND, MEGA_BYTES_PER_SECOND, GIGA_BYTES_PER_SECOND,
     * TERA_BYTES_PER_SECOND, BITS_PER_SECOND, KILO_BITS_PER_SECOND,
     * MEGA_BITS_PER_SECOND, GIGA_BITS_PER_SECOND, TERA_BITS_PER_SECOND,
     * COUNT_PER_SECOND
     *
     * @param unit <p>
     *            The unit of measure associated with the CloudWatch metric
     *            being watched. The value specified for <code>Unit</code> must
     *            correspond to the units specified in the CloudWatch metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Unit
     */
    public CloudWatchAlarmDefinition withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * <p>
     * The unit of measure associated with the CloudWatch metric being watched.
     * The value specified for <code>Unit</code> must correspond to the units
     * specified in the CloudWatch metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, SECONDS, MICRO_SECONDS, MILLI_SECONDS,
     * BYTES, KILO_BYTES, MEGA_BYTES, GIGA_BYTES, TERA_BYTES, BITS, KILO_BITS,
     * MEGA_BITS, GIGA_BITS, TERA_BITS, PERCENT, COUNT, BYTES_PER_SECOND,
     * KILO_BYTES_PER_SECOND, MEGA_BYTES_PER_SECOND, GIGA_BYTES_PER_SECOND,
     * TERA_BYTES_PER_SECOND, BITS_PER_SECOND, KILO_BITS_PER_SECOND,
     * MEGA_BITS_PER_SECOND, GIGA_BITS_PER_SECOND, TERA_BITS_PER_SECOND,
     * COUNT_PER_SECOND
     *
     * @param unit <p>
     *            The unit of measure associated with the CloudWatch metric
     *            being watched. The value specified for <code>Unit</code> must
     *            correspond to the units specified in the CloudWatch metric.
     *            </p>
     * @see Unit
     */
    public void setUnit(Unit unit) {
        this.unit = unit.toString();
    }

    /**
     * <p>
     * The unit of measure associated with the CloudWatch metric being watched.
     * The value specified for <code>Unit</code> must correspond to the units
     * specified in the CloudWatch metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, SECONDS, MICRO_SECONDS, MILLI_SECONDS,
     * BYTES, KILO_BYTES, MEGA_BYTES, GIGA_BYTES, TERA_BYTES, BITS, KILO_BITS,
     * MEGA_BITS, GIGA_BITS, TERA_BITS, PERCENT, COUNT, BYTES_PER_SECOND,
     * KILO_BYTES_PER_SECOND, MEGA_BYTES_PER_SECOND, GIGA_BYTES_PER_SECOND,
     * TERA_BYTES_PER_SECOND, BITS_PER_SECOND, KILO_BITS_PER_SECOND,
     * MEGA_BITS_PER_SECOND, GIGA_BITS_PER_SECOND, TERA_BITS_PER_SECOND,
     * COUNT_PER_SECOND
     *
     * @param unit <p>
     *            The unit of measure associated with the CloudWatch metric
     *            being watched. The value specified for <code>Unit</code> must
     *            correspond to the units specified in the CloudWatch metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Unit
     */
    public CloudWatchAlarmDefinition withUnit(Unit unit) {
        this.unit = unit.toString();
        return this;
    }

    /**
     * <p>
     * A CloudWatch metric dimension.
     * </p>
     *
     * @return <p>
     *         A CloudWatch metric dimension.
     *         </p>
     */
    public java.util.List<MetricDimension> getDimensions() {
        return dimensions;
    }

    /**
     * <p>
     * A CloudWatch metric dimension.
     * </p>
     *
     * @param dimensions <p>
     *            A CloudWatch metric dimension.
     *            </p>
     */
    public void setDimensions(java.util.Collection<MetricDimension> dimensions) {
        if (dimensions == null) {
            this.dimensions = null;
            return;
        }

        this.dimensions = new java.util.ArrayList<MetricDimension>(dimensions);
    }

    /**
     * <p>
     * A CloudWatch metric dimension.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dimensions <p>
     *            A CloudWatch metric dimension.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudWatchAlarmDefinition withDimensions(MetricDimension... dimensions) {
        if (getDimensions() == null) {
            this.dimensions = new java.util.ArrayList<MetricDimension>(dimensions.length);
        }
        for (MetricDimension value : dimensions) {
            this.dimensions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A CloudWatch metric dimension.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dimensions <p>
     *            A CloudWatch metric dimension.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudWatchAlarmDefinition withDimensions(java.util.Collection<MetricDimension> dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getComparisonOperator() != null)
            sb.append("ComparisonOperator: " + getComparisonOperator() + ",");
        if (getEvaluationPeriods() != null)
            sb.append("EvaluationPeriods: " + getEvaluationPeriods() + ",");
        if (getMetricName() != null)
            sb.append("MetricName: " + getMetricName() + ",");
        if (getNamespace() != null)
            sb.append("Namespace: " + getNamespace() + ",");
        if (getPeriod() != null)
            sb.append("Period: " + getPeriod() + ",");
        if (getStatistic() != null)
            sb.append("Statistic: " + getStatistic() + ",");
        if (getThreshold() != null)
            sb.append("Threshold: " + getThreshold() + ",");
        if (getUnit() != null)
            sb.append("Unit: " + getUnit() + ",");
        if (getDimensions() != null)
            sb.append("Dimensions: " + getDimensions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getComparisonOperator() == null) ? 0 : getComparisonOperator().hashCode());
        hashCode = prime * hashCode
                + ((getEvaluationPeriods() == null) ? 0 : getEvaluationPeriods().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        hashCode = prime * hashCode + ((getStatistic() == null) ? 0 : getStatistic().hashCode());
        hashCode = prime * hashCode + ((getThreshold() == null) ? 0 : getThreshold().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudWatchAlarmDefinition == false)
            return false;
        CloudWatchAlarmDefinition other = (CloudWatchAlarmDefinition) obj;

        if (other.getComparisonOperator() == null ^ this.getComparisonOperator() == null)
            return false;
        if (other.getComparisonOperator() != null
                && other.getComparisonOperator().equals(this.getComparisonOperator()) == false)
            return false;
        if (other.getEvaluationPeriods() == null ^ this.getEvaluationPeriods() == null)
            return false;
        if (other.getEvaluationPeriods() != null
                && other.getEvaluationPeriods().equals(this.getEvaluationPeriods()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null
                && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null
                && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false)
            return false;
        if (other.getStatistic() == null ^ this.getStatistic() == null)
            return false;
        if (other.getStatistic() != null
                && other.getStatistic().equals(this.getStatistic()) == false)
            return false;
        if (other.getThreshold() == null ^ this.getThreshold() == null)
            return false;
        if (other.getThreshold() != null
                && other.getThreshold().equals(this.getThreshold()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null
                && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        return true;
    }
}
