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

package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains information about the CloudWatch alarm that
 * Amazon Route 53 is monitoring for this health check.
 * </p>
 */
public class CloudWatchAlarmConfiguration implements Serializable {
    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the number
     * of periods that the metric is compared to the threshold.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer evaluationPeriods;

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the value
     * the metric is compared with.
     * </p>
     */
    private Double threshold;

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the
     * arithmetic operation that is used for the comparison.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GreaterThanOrEqualToThreshold,
     * GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold
     */
    private String comparisonOperator;

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the duration
     * of one evaluation period in seconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - <br/>
     */
    private Integer period;

    /**
     * <p>
     * The name of the CloudWatch metric that the alarm is associated with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String metricName;

    /**
     * <p>
     * The namespace of the metric that the alarm is associated with. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html"
     * >Amazon CloudWatch Namespaces, Dimensions, and Metrics Reference</a> in
     * the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String namespace;

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the
     * statistic that is applied to the metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Average, Sum, SampleCount, Maximum, Minimum
     */
    private String statistic;

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, a complex
     * type that contains information about the dimensions for the metric. For
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html"
     * >Amazon CloudWatch Namespaces, Dimensions, and Metrics Reference</a> in
     * the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     */
    private java.util.List<Dimension> dimensions;

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the number
     * of periods that the metric is compared to the threshold.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         For the metric that the CloudWatch alarm is associated with, the
     *         number of periods that the metric is compared to the threshold.
     *         </p>
     */
    public Integer getEvaluationPeriods() {
        return evaluationPeriods;
    }

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the number
     * of periods that the metric is compared to the threshold.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param evaluationPeriods <p>
     *            For the metric that the CloudWatch alarm is associated with,
     *            the number of periods that the metric is compared to the
     *            threshold.
     *            </p>
     */
    public void setEvaluationPeriods(Integer evaluationPeriods) {
        this.evaluationPeriods = evaluationPeriods;
    }

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the number
     * of periods that the metric is compared to the threshold.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param evaluationPeriods <p>
     *            For the metric that the CloudWatch alarm is associated with,
     *            the number of periods that the metric is compared to the
     *            threshold.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudWatchAlarmConfiguration withEvaluationPeriods(Integer evaluationPeriods) {
        this.evaluationPeriods = evaluationPeriods;
        return this;
    }

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the value
     * the metric is compared with.
     * </p>
     *
     * @return <p>
     *         For the metric that the CloudWatch alarm is associated with, the
     *         value the metric is compared with.
     *         </p>
     */
    public Double getThreshold() {
        return threshold;
    }

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the value
     * the metric is compared with.
     * </p>
     *
     * @param threshold <p>
     *            For the metric that the CloudWatch alarm is associated with,
     *            the value the metric is compared with.
     *            </p>
     */
    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the value
     * the metric is compared with.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param threshold <p>
     *            For the metric that the CloudWatch alarm is associated with,
     *            the value the metric is compared with.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudWatchAlarmConfiguration withThreshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the
     * arithmetic operation that is used for the comparison.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GreaterThanOrEqualToThreshold,
     * GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold
     *
     * @return <p>
     *         For the metric that the CloudWatch alarm is associated with, the
     *         arithmetic operation that is used for the comparison.
     *         </p>
     * @see ComparisonOperator
     */
    public String getComparisonOperator() {
        return comparisonOperator;
    }

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the
     * arithmetic operation that is used for the comparison.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GreaterThanOrEqualToThreshold,
     * GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold
     *
     * @param comparisonOperator <p>
     *            For the metric that the CloudWatch alarm is associated with,
     *            the arithmetic operation that is used for the comparison.
     *            </p>
     * @see ComparisonOperator
     */
    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the
     * arithmetic operation that is used for the comparison.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GreaterThanOrEqualToThreshold,
     * GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold
     *
     * @param comparisonOperator <p>
     *            For the metric that the CloudWatch alarm is associated with,
     *            the arithmetic operation that is used for the comparison.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ComparisonOperator
     */
    public CloudWatchAlarmConfiguration withComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the
     * arithmetic operation that is used for the comparison.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GreaterThanOrEqualToThreshold,
     * GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold
     *
     * @param comparisonOperator <p>
     *            For the metric that the CloudWatch alarm is associated with,
     *            the arithmetic operation that is used for the comparison.
     *            </p>
     * @see ComparisonOperator
     */
    public void setComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
    }

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the
     * arithmetic operation that is used for the comparison.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GreaterThanOrEqualToThreshold,
     * GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold
     *
     * @param comparisonOperator <p>
     *            For the metric that the CloudWatch alarm is associated with,
     *            the arithmetic operation that is used for the comparison.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ComparisonOperator
     */
    public CloudWatchAlarmConfiguration withComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
        return this;
    }

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the duration
     * of one evaluation period in seconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - <br/>
     *
     * @return <p>
     *         For the metric that the CloudWatch alarm is associated with, the
     *         duration of one evaluation period in seconds.
     *         </p>
     */
    public Integer getPeriod() {
        return period;
    }

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the duration
     * of one evaluation period in seconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - <br/>
     *
     * @param period <p>
     *            For the metric that the CloudWatch alarm is associated with,
     *            the duration of one evaluation period in seconds.
     *            </p>
     */
    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the duration
     * of one evaluation period in seconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - <br/>
     *
     * @param period <p>
     *            For the metric that the CloudWatch alarm is associated with,
     *            the duration of one evaluation period in seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudWatchAlarmConfiguration withPeriod(Integer period) {
        this.period = period;
        return this;
    }

    /**
     * <p>
     * The name of the CloudWatch metric that the alarm is associated with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The name of the CloudWatch metric that the alarm is associated
     *         with.
     *         </p>
     */
    public String getMetricName() {
        return metricName;
    }

    /**
     * <p>
     * The name of the CloudWatch metric that the alarm is associated with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param metricName <p>
     *            The name of the CloudWatch metric that the alarm is associated
     *            with.
     *            </p>
     */
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the CloudWatch metric that the alarm is associated with.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param metricName <p>
     *            The name of the CloudWatch metric that the alarm is associated
     *            with.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudWatchAlarmConfiguration withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * <p>
     * The namespace of the metric that the alarm is associated with. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html"
     * >Amazon CloudWatch Namespaces, Dimensions, and Metrics Reference</a> in
     * the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The namespace of the metric that the alarm is associated with.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html"
     *         >Amazon CloudWatch Namespaces, Dimensions, and Metrics
     *         Reference</a> in the <i>Amazon CloudWatch User Guide</i>.
     *         </p>
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * <p>
     * The namespace of the metric that the alarm is associated with. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html"
     * >Amazon CloudWatch Namespaces, Dimensions, and Metrics Reference</a> in
     * the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param namespace <p>
     *            The namespace of the metric that the alarm is associated with.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html"
     *            >Amazon CloudWatch Namespaces, Dimensions, and Metrics
     *            Reference</a> in the <i>Amazon CloudWatch User Guide</i>.
     *            </p>
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace of the metric that the alarm is associated with. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html"
     * >Amazon CloudWatch Namespaces, Dimensions, and Metrics Reference</a> in
     * the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param namespace <p>
     *            The namespace of the metric that the alarm is associated with.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html"
     *            >Amazon CloudWatch Namespaces, Dimensions, and Metrics
     *            Reference</a> in the <i>Amazon CloudWatch User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudWatchAlarmConfiguration withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the
     * statistic that is applied to the metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Average, Sum, SampleCount, Maximum, Minimum
     *
     * @return <p>
     *         For the metric that the CloudWatch alarm is associated with, the
     *         statistic that is applied to the metric.
     *         </p>
     * @see Statistic
     */
    public String getStatistic() {
        return statistic;
    }

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the
     * statistic that is applied to the metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Average, Sum, SampleCount, Maximum, Minimum
     *
     * @param statistic <p>
     *            For the metric that the CloudWatch alarm is associated with,
     *            the statistic that is applied to the metric.
     *            </p>
     * @see Statistic
     */
    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the
     * statistic that is applied to the metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Average, Sum, SampleCount, Maximum, Minimum
     *
     * @param statistic <p>
     *            For the metric that the CloudWatch alarm is associated with,
     *            the statistic that is applied to the metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Statistic
     */
    public CloudWatchAlarmConfiguration withStatistic(String statistic) {
        this.statistic = statistic;
        return this;
    }

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the
     * statistic that is applied to the metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Average, Sum, SampleCount, Maximum, Minimum
     *
     * @param statistic <p>
     *            For the metric that the CloudWatch alarm is associated with,
     *            the statistic that is applied to the metric.
     *            </p>
     * @see Statistic
     */
    public void setStatistic(Statistic statistic) {
        this.statistic = statistic.toString();
    }

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the
     * statistic that is applied to the metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Average, Sum, SampleCount, Maximum, Minimum
     *
     * @param statistic <p>
     *            For the metric that the CloudWatch alarm is associated with,
     *            the statistic that is applied to the metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Statistic
     */
    public CloudWatchAlarmConfiguration withStatistic(Statistic statistic) {
        this.statistic = statistic.toString();
        return this;
    }

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, a complex
     * type that contains information about the dimensions for the metric. For
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html"
     * >Amazon CloudWatch Namespaces, Dimensions, and Metrics Reference</a> in
     * the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     *
     * @return <p>
     *         For the metric that the CloudWatch alarm is associated with, a
     *         complex type that contains information about the dimensions for
     *         the metric. For information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html"
     *         >Amazon CloudWatch Namespaces, Dimensions, and Metrics
     *         Reference</a> in the <i>Amazon CloudWatch User Guide</i>.
     *         </p>
     */
    public java.util.List<Dimension> getDimensions() {
        return dimensions;
    }

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, a complex
     * type that contains information about the dimensions for the metric. For
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html"
     * >Amazon CloudWatch Namespaces, Dimensions, and Metrics Reference</a> in
     * the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     *
     * @param dimensions <p>
     *            For the metric that the CloudWatch alarm is associated with, a
     *            complex type that contains information about the dimensions
     *            for the metric. For information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html"
     *            >Amazon CloudWatch Namespaces, Dimensions, and Metrics
     *            Reference</a> in the <i>Amazon CloudWatch User Guide</i>.
     *            </p>
     */
    public void setDimensions(java.util.Collection<Dimension> dimensions) {
        if (dimensions == null) {
            this.dimensions = null;
            return;
        }

        this.dimensions = new java.util.ArrayList<Dimension>(dimensions);
    }

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, a complex
     * type that contains information about the dimensions for the metric. For
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html"
     * >Amazon CloudWatch Namespaces, Dimensions, and Metrics Reference</a> in
     * the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dimensions <p>
     *            For the metric that the CloudWatch alarm is associated with, a
     *            complex type that contains information about the dimensions
     *            for the metric. For information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html"
     *            >Amazon CloudWatch Namespaces, Dimensions, and Metrics
     *            Reference</a> in the <i>Amazon CloudWatch User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudWatchAlarmConfiguration withDimensions(Dimension... dimensions) {
        if (getDimensions() == null) {
            this.dimensions = new java.util.ArrayList<Dimension>(dimensions.length);
        }
        for (Dimension value : dimensions) {
            this.dimensions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, a complex
     * type that contains information about the dimensions for the metric. For
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html"
     * >Amazon CloudWatch Namespaces, Dimensions, and Metrics Reference</a> in
     * the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dimensions <p>
     *            For the metric that the CloudWatch alarm is associated with, a
     *            complex type that contains information about the dimensions
     *            for the metric. For information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html"
     *            >Amazon CloudWatch Namespaces, Dimensions, and Metrics
     *            Reference</a> in the <i>Amazon CloudWatch User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudWatchAlarmConfiguration withDimensions(java.util.Collection<Dimension> dimensions) {
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
        if (getEvaluationPeriods() != null)
            sb.append("EvaluationPeriods: " + getEvaluationPeriods() + ",");
        if (getThreshold() != null)
            sb.append("Threshold: " + getThreshold() + ",");
        if (getComparisonOperator() != null)
            sb.append("ComparisonOperator: " + getComparisonOperator() + ",");
        if (getPeriod() != null)
            sb.append("Period: " + getPeriod() + ",");
        if (getMetricName() != null)
            sb.append("MetricName: " + getMetricName() + ",");
        if (getNamespace() != null)
            sb.append("Namespace: " + getNamespace() + ",");
        if (getStatistic() != null)
            sb.append("Statistic: " + getStatistic() + ",");
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
                + ((getEvaluationPeriods() == null) ? 0 : getEvaluationPeriods().hashCode());
        hashCode = prime * hashCode + ((getThreshold() == null) ? 0 : getThreshold().hashCode());
        hashCode = prime * hashCode
                + ((getComparisonOperator() == null) ? 0 : getComparisonOperator().hashCode());
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getStatistic() == null) ? 0 : getStatistic().hashCode());
        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudWatchAlarmConfiguration == false)
            return false;
        CloudWatchAlarmConfiguration other = (CloudWatchAlarmConfiguration) obj;

        if (other.getEvaluationPeriods() == null ^ this.getEvaluationPeriods() == null)
            return false;
        if (other.getEvaluationPeriods() != null
                && other.getEvaluationPeriods().equals(this.getEvaluationPeriods()) == false)
            return false;
        if (other.getThreshold() == null ^ this.getThreshold() == null)
            return false;
        if (other.getThreshold() != null
                && other.getThreshold().equals(this.getThreshold()) == false)
            return false;
        if (other.getComparisonOperator() == null ^ this.getComparisonOperator() == null)
            return false;
        if (other.getComparisonOperator() != null
                && other.getComparisonOperator().equals(this.getComparisonOperator()) == false)
            return false;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false)
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
        if (other.getStatistic() == null ^ this.getStatistic() == null)
            return false;
        if (other.getStatistic() != null
                && other.getStatistic().equals(this.getStatistic()) == false)
            return false;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null
                && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        return true;
    }
}
