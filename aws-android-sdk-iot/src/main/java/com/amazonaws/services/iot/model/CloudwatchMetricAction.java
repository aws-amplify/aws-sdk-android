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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an action that captures a CloudWatch metric.
 * </p>
 */
public class CloudwatchMetricAction implements Serializable {
    /**
     * <p>
     * The IAM role that allows access to the CloudWatch metric.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The CloudWatch metric namespace name.
     * </p>
     */
    private String metricNamespace;

    /**
     * <p>
     * The CloudWatch metric name.
     * </p>
     */
    private String metricName;

    /**
     * <p>
     * The CloudWatch metric value.
     * </p>
     */
    private String metricValue;

    /**
     * <p>
     * The <a href=
     * "http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Unit"
     * >metric unit</a> supported by CloudWatch.
     * </p>
     */
    private String metricUnit;

    /**
     * <p>
     * An optional <a href=
     * "http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#about_timestamp"
     * >Unix timestamp</a>.
     * </p>
     */
    private String metricTimestamp;

    /**
     * <p>
     * The IAM role that allows access to the CloudWatch metric.
     * </p>
     *
     * @return <p>
     *         The IAM role that allows access to the CloudWatch metric.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The IAM role that allows access to the CloudWatch metric.
     * </p>
     *
     * @param roleArn <p>
     *            The IAM role that allows access to the CloudWatch metric.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The IAM role that allows access to the CloudWatch metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleArn <p>
     *            The IAM role that allows access to the CloudWatch metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudwatchMetricAction withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The CloudWatch metric namespace name.
     * </p>
     *
     * @return <p>
     *         The CloudWatch metric namespace name.
     *         </p>
     */
    public String getMetricNamespace() {
        return metricNamespace;
    }

    /**
     * <p>
     * The CloudWatch metric namespace name.
     * </p>
     *
     * @param metricNamespace <p>
     *            The CloudWatch metric namespace name.
     *            </p>
     */
    public void setMetricNamespace(String metricNamespace) {
        this.metricNamespace = metricNamespace;
    }

    /**
     * <p>
     * The CloudWatch metric namespace name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricNamespace <p>
     *            The CloudWatch metric namespace name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudwatchMetricAction withMetricNamespace(String metricNamespace) {
        this.metricNamespace = metricNamespace;
        return this;
    }

    /**
     * <p>
     * The CloudWatch metric name.
     * </p>
     *
     * @return <p>
     *         The CloudWatch metric name.
     *         </p>
     */
    public String getMetricName() {
        return metricName;
    }

    /**
     * <p>
     * The CloudWatch metric name.
     * </p>
     *
     * @param metricName <p>
     *            The CloudWatch metric name.
     *            </p>
     */
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The CloudWatch metric name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricName <p>
     *            The CloudWatch metric name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudwatchMetricAction withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * <p>
     * The CloudWatch metric value.
     * </p>
     *
     * @return <p>
     *         The CloudWatch metric value.
     *         </p>
     */
    public String getMetricValue() {
        return metricValue;
    }

    /**
     * <p>
     * The CloudWatch metric value.
     * </p>
     *
     * @param metricValue <p>
     *            The CloudWatch metric value.
     *            </p>
     */
    public void setMetricValue(String metricValue) {
        this.metricValue = metricValue;
    }

    /**
     * <p>
     * The CloudWatch metric value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricValue <p>
     *            The CloudWatch metric value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudwatchMetricAction withMetricValue(String metricValue) {
        this.metricValue = metricValue;
        return this;
    }

    /**
     * <p>
     * The <a href=
     * "http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Unit"
     * >metric unit</a> supported by CloudWatch.
     * </p>
     *
     * @return <p>
     *         The <a href=
     *         "http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Unit"
     *         >metric unit</a> supported by CloudWatch.
     *         </p>
     */
    public String getMetricUnit() {
        return metricUnit;
    }

    /**
     * <p>
     * The <a href=
     * "http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Unit"
     * >metric unit</a> supported by CloudWatch.
     * </p>
     *
     * @param metricUnit <p>
     *            The <a href=
     *            "http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Unit"
     *            >metric unit</a> supported by CloudWatch.
     *            </p>
     */
    public void setMetricUnit(String metricUnit) {
        this.metricUnit = metricUnit;
    }

    /**
     * <p>
     * The <a href=
     * "http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Unit"
     * >metric unit</a> supported by CloudWatch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricUnit <p>
     *            The <a href=
     *            "http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Unit"
     *            >metric unit</a> supported by CloudWatch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudwatchMetricAction withMetricUnit(String metricUnit) {
        this.metricUnit = metricUnit;
        return this;
    }

    /**
     * <p>
     * An optional <a href=
     * "http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#about_timestamp"
     * >Unix timestamp</a>.
     * </p>
     *
     * @return <p>
     *         An optional <a href=
     *         "http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#about_timestamp"
     *         >Unix timestamp</a>.
     *         </p>
     */
    public String getMetricTimestamp() {
        return metricTimestamp;
    }

    /**
     * <p>
     * An optional <a href=
     * "http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#about_timestamp"
     * >Unix timestamp</a>.
     * </p>
     *
     * @param metricTimestamp <p>
     *            An optional <a href=
     *            "http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#about_timestamp"
     *            >Unix timestamp</a>.
     *            </p>
     */
    public void setMetricTimestamp(String metricTimestamp) {
        this.metricTimestamp = metricTimestamp;
    }

    /**
     * <p>
     * An optional <a href=
     * "http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#about_timestamp"
     * >Unix timestamp</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricTimestamp <p>
     *            An optional <a href=
     *            "http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#about_timestamp"
     *            >Unix timestamp</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudwatchMetricAction withMetricTimestamp(String metricTimestamp) {
        this.metricTimestamp = metricTimestamp;
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
        if (getRoleArn() != null)
            sb.append("roleArn: " + getRoleArn() + ",");
        if (getMetricNamespace() != null)
            sb.append("metricNamespace: " + getMetricNamespace() + ",");
        if (getMetricName() != null)
            sb.append("metricName: " + getMetricName() + ",");
        if (getMetricValue() != null)
            sb.append("metricValue: " + getMetricValue() + ",");
        if (getMetricUnit() != null)
            sb.append("metricUnit: " + getMetricUnit() + ",");
        if (getMetricTimestamp() != null)
            sb.append("metricTimestamp: " + getMetricTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getMetricNamespace() == null) ? 0 : getMetricNamespace().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode
                + ((getMetricValue() == null) ? 0 : getMetricValue().hashCode());
        hashCode = prime * hashCode + ((getMetricUnit() == null) ? 0 : getMetricUnit().hashCode());
        hashCode = prime * hashCode
                + ((getMetricTimestamp() == null) ? 0 : getMetricTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudwatchMetricAction == false)
            return false;
        CloudwatchMetricAction other = (CloudwatchMetricAction) obj;

        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getMetricNamespace() == null ^ this.getMetricNamespace() == null)
            return false;
        if (other.getMetricNamespace() != null
                && other.getMetricNamespace().equals(this.getMetricNamespace()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null
                && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getMetricValue() == null ^ this.getMetricValue() == null)
            return false;
        if (other.getMetricValue() != null
                && other.getMetricValue().equals(this.getMetricValue()) == false)
            return false;
        if (other.getMetricUnit() == null ^ this.getMetricUnit() == null)
            return false;
        if (other.getMetricUnit() != null
                && other.getMetricUnit().equals(this.getMetricUnit()) == false)
            return false;
        if (other.getMetricTimestamp() == null ^ this.getMetricTimestamp() == null)
            return false;
        if (other.getMetricTimestamp() != null
                && other.getMetricTimestamp().equals(this.getMetricTimestamp()) == false)
            return false;
        return true;
    }
}
