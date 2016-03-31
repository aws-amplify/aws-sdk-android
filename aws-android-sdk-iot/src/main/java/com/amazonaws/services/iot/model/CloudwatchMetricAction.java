/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * The IAM role that allows access to the CloudWatch metric.
     */
    private String roleArn;

    /**
     * The CloudWatch metric namespace name.
     */
    private String metricNamespace;

    /**
     * The CloudWatch metric name.
     */
    private String metricName;

    /**
     * The CloudWatch metric value.
     */
    private String metricValue;

    /**
     * The <a
     * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Unit">metric
     * unit</a> supported by CloudWatch.
     */
    private String metricUnit;

    /**
     * An optional <a
     * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#about_timestamp">Unix
     * timestamp</a>.
     */
    private String metricTimestamp;

    /**
     * The IAM role that allows access to the CloudWatch metric.
     *
     * @return The IAM role that allows access to the CloudWatch metric.
     */
    public String getRoleArn() {
        return roleArn;
    }
    
    /**
     * The IAM role that allows access to the CloudWatch metric.
     *
     * @param roleArn The IAM role that allows access to the CloudWatch metric.
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }
    
    /**
     * The IAM role that allows access to the CloudWatch metric.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param roleArn The IAM role that allows access to the CloudWatch metric.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CloudwatchMetricAction withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * The CloudWatch metric namespace name.
     *
     * @return The CloudWatch metric namespace name.
     */
    public String getMetricNamespace() {
        return metricNamespace;
    }
    
    /**
     * The CloudWatch metric namespace name.
     *
     * @param metricNamespace The CloudWatch metric namespace name.
     */
    public void setMetricNamespace(String metricNamespace) {
        this.metricNamespace = metricNamespace;
    }
    
    /**
     * The CloudWatch metric namespace name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metricNamespace The CloudWatch metric namespace name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CloudwatchMetricAction withMetricNamespace(String metricNamespace) {
        this.metricNamespace = metricNamespace;
        return this;
    }

    /**
     * The CloudWatch metric name.
     *
     * @return The CloudWatch metric name.
     */
    public String getMetricName() {
        return metricName;
    }
    
    /**
     * The CloudWatch metric name.
     *
     * @param metricName The CloudWatch metric name.
     */
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }
    
    /**
     * The CloudWatch metric name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metricName The CloudWatch metric name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CloudwatchMetricAction withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * The CloudWatch metric value.
     *
     * @return The CloudWatch metric value.
     */
    public String getMetricValue() {
        return metricValue;
    }
    
    /**
     * The CloudWatch metric value.
     *
     * @param metricValue The CloudWatch metric value.
     */
    public void setMetricValue(String metricValue) {
        this.metricValue = metricValue;
    }
    
    /**
     * The CloudWatch metric value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metricValue The CloudWatch metric value.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CloudwatchMetricAction withMetricValue(String metricValue) {
        this.metricValue = metricValue;
        return this;
    }

    /**
     * The <a
     * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Unit">metric
     * unit</a> supported by CloudWatch.
     *
     * @return The <a
     *         href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Unit">metric
     *         unit</a> supported by CloudWatch.
     */
    public String getMetricUnit() {
        return metricUnit;
    }
    
    /**
     * The <a
     * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Unit">metric
     * unit</a> supported by CloudWatch.
     *
     * @param metricUnit The <a
     *         href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Unit">metric
     *         unit</a> supported by CloudWatch.
     */
    public void setMetricUnit(String metricUnit) {
        this.metricUnit = metricUnit;
    }
    
    /**
     * The <a
     * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Unit">metric
     * unit</a> supported by CloudWatch.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metricUnit The <a
     *         href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Unit">metric
     *         unit</a> supported by CloudWatch.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CloudwatchMetricAction withMetricUnit(String metricUnit) {
        this.metricUnit = metricUnit;
        return this;
    }

    /**
     * An optional <a
     * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#about_timestamp">Unix
     * timestamp</a>.
     *
     * @return An optional <a
     *         href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#about_timestamp">Unix
     *         timestamp</a>.
     */
    public String getMetricTimestamp() {
        return metricTimestamp;
    }
    
    /**
     * An optional <a
     * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#about_timestamp">Unix
     * timestamp</a>.
     *
     * @param metricTimestamp An optional <a
     *         href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#about_timestamp">Unix
     *         timestamp</a>.
     */
    public void setMetricTimestamp(String metricTimestamp) {
        this.metricTimestamp = metricTimestamp;
    }
    
    /**
     * An optional <a
     * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#about_timestamp">Unix
     * timestamp</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metricTimestamp An optional <a
     *         href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#about_timestamp">Unix
     *         timestamp</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
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
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRoleArn() != null) sb.append("RoleArn: " + getRoleArn() + ",");
        if (getMetricNamespace() != null) sb.append("MetricNamespace: " + getMetricNamespace() + ",");
        if (getMetricName() != null) sb.append("MetricName: " + getMetricName() + ",");
        if (getMetricValue() != null) sb.append("MetricValue: " + getMetricValue() + ",");
        if (getMetricUnit() != null) sb.append("MetricUnit: " + getMetricUnit() + ",");
        if (getMetricTimestamp() != null) sb.append("MetricTimestamp: " + getMetricTimestamp() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode()); 
        hashCode = prime * hashCode + ((getMetricNamespace() == null) ? 0 : getMetricNamespace().hashCode()); 
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode()); 
        hashCode = prime * hashCode + ((getMetricValue() == null) ? 0 : getMetricValue().hashCode()); 
        hashCode = prime * hashCode + ((getMetricUnit() == null) ? 0 : getMetricUnit().hashCode()); 
        hashCode = prime * hashCode + ((getMetricTimestamp() == null) ? 0 : getMetricTimestamp().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CloudwatchMetricAction == false) return false;
        CloudwatchMetricAction other = (CloudwatchMetricAction)obj;
        
        if (other.getRoleArn() == null ^ this.getRoleArn() == null) return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false) return false; 
        if (other.getMetricNamespace() == null ^ this.getMetricNamespace() == null) return false;
        if (other.getMetricNamespace() != null && other.getMetricNamespace().equals(this.getMetricNamespace()) == false) return false; 
        if (other.getMetricName() == null ^ this.getMetricName() == null) return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false) return false; 
        if (other.getMetricValue() == null ^ this.getMetricValue() == null) return false;
        if (other.getMetricValue() != null && other.getMetricValue().equals(this.getMetricValue()) == false) return false; 
        if (other.getMetricUnit() == null ^ this.getMetricUnit() == null) return false;
        if (other.getMetricUnit() != null && other.getMetricUnit().equals(this.getMetricUnit()) == false) return false; 
        if (other.getMetricTimestamp() == null ^ this.getMetricTimestamp() == null) return false;
        if (other.getMetricTimestamp() != null && other.getMetricTimestamp().equals(this.getMetricTimestamp()) == false) return false; 
        return true;
    }
    
}
    