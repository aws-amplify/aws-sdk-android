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
package com.amazonaws.services.compute-optimizer.model;

import java.io.Serializable;


/**
 * <p>Describes a filter that returns a more specific list of recommendations.</p>
 */
public class Filter implements Serializable {
    /**
     * <p>The name of the filter.</p> <p>Specify <code>Finding</code> to return recommendations with a specific findings classification (e.g., <code>Overprovisioned</code>).</p> <p>Specify <code>RecommendationSourceType</code> to return recommendations of a specific resource type (e.g., <code>AutoScalingGroup</code>).</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Finding, RecommendationSourceType
     */
    private String name;

    /**
     * <p>The value of the filter.</p> <p>If you specify the <code>name</code> parameter as <code>Finding</code>, and you request recommendations for an <i>instance</i>, then the valid values are <code>Underprovisioned</code>, <code>Overprovisioned</code>, <code>NotOptimized</code>, or <code>Optimized</code>.</p> <p>If you specify the <code>name</code> parameter as <code>Finding</code>, and you request recommendations for an <i>Auto Scaling group</i>, then the valid values are <code>Optimized</code>, or <code>NotOptimized</code>.</p> <p>If you specify the <code>name</code> parameter as <code>RecommendationSourceType</code>, then the valid values are <code>Ec2Instance</code>, or <code>AutoScalingGroup</code>.</p>
     */
    private java.util.List<String> values;

    /**
     * <p>The name of the filter.</p> <p>Specify <code>Finding</code> to return recommendations with a specific findings classification (e.g., <code>Overprovisioned</code>).</p> <p>Specify <code>RecommendationSourceType</code> to return recommendations of a specific resource type (e.g., <code>AutoScalingGroup</code>).</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Finding, RecommendationSourceType
     *
     * @return <p>The name of the filter.</p> <p>Specify <code>Finding</code> to return recommendations with a specific findings classification (e.g., <code>Overprovisioned</code>).</p> <p>Specify <code>RecommendationSourceType</code> to return recommendations of a specific resource type (e.g., <code>AutoScalingGroup</code>).</p>
     *
     * @see FilterName
     */
    public String getName() {
        return name;
    }

    /**
     * <p>The name of the filter.</p> <p>Specify <code>Finding</code> to return recommendations with a specific findings classification (e.g., <code>Overprovisioned</code>).</p> <p>Specify <code>RecommendationSourceType</code> to return recommendations of a specific resource type (e.g., <code>AutoScalingGroup</code>).</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Finding, RecommendationSourceType
     *
     * @param name <p>The name of the filter.</p> <p>Specify <code>Finding</code> to return recommendations with a specific findings classification (e.g., <code>Overprovisioned</code>).</p> <p>Specify <code>RecommendationSourceType</code> to return recommendations of a specific resource type (e.g., <code>AutoScalingGroup</code>).</p>
     *
     * @see FilterName
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>The name of the filter.</p> <p>Specify <code>Finding</code> to return recommendations with a specific findings classification (e.g., <code>Overprovisioned</code>).</p> <p>Specify <code>RecommendationSourceType</code> to return recommendations of a specific resource type (e.g., <code>AutoScalingGroup</code>).</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Finding, RecommendationSourceType
     *
     * @param name <p>The name of the filter.</p> <p>Specify <code>Finding</code> to return recommendations with a specific findings classification (e.g., <code>Overprovisioned</code>).</p> <p>Specify <code>RecommendationSourceType</code> to return recommendations of a specific resource type (e.g., <code>AutoScalingGroup</code>).</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see FilterName
     */
    public Filter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>The name of the filter.</p> <p>Specify <code>Finding</code> to return recommendations with a specific findings classification (e.g., <code>Overprovisioned</code>).</p> <p>Specify <code>RecommendationSourceType</code> to return recommendations of a specific resource type (e.g., <code>AutoScalingGroup</code>).</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Finding, RecommendationSourceType
     *
     * @param name <p>The name of the filter.</p> <p>Specify <code>Finding</code> to return recommendations with a specific findings classification (e.g., <code>Overprovisioned</code>).</p> <p>Specify <code>RecommendationSourceType</code> to return recommendations of a specific resource type (e.g., <code>AutoScalingGroup</code>).</p>
     *
     * @see FilterName
     */
    public void setName(FilterName name) {
        this.name = name.toString();
    }

    /**
     * <p>The name of the filter.</p> <p>Specify <code>Finding</code> to return recommendations with a specific findings classification (e.g., <code>Overprovisioned</code>).</p> <p>Specify <code>RecommendationSourceType</code> to return recommendations of a specific resource type (e.g., <code>AutoScalingGroup</code>).</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Finding, RecommendationSourceType
     *
     * @param name <p>The name of the filter.</p> <p>Specify <code>Finding</code> to return recommendations with a specific findings classification (e.g., <code>Overprovisioned</code>).</p> <p>Specify <code>RecommendationSourceType</code> to return recommendations of a specific resource type (e.g., <code>AutoScalingGroup</code>).</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see FilterName
     */
    public Filter withName(FilterName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>The value of the filter.</p> <p>If you specify the <code>name</code> parameter as <code>Finding</code>, and you request recommendations for an <i>instance</i>, then the valid values are <code>Underprovisioned</code>, <code>Overprovisioned</code>, <code>NotOptimized</code>, or <code>Optimized</code>.</p> <p>If you specify the <code>name</code> parameter as <code>Finding</code>, and you request recommendations for an <i>Auto Scaling group</i>, then the valid values are <code>Optimized</code>, or <code>NotOptimized</code>.</p> <p>If you specify the <code>name</code> parameter as <code>RecommendationSourceType</code>, then the valid values are <code>Ec2Instance</code>, or <code>AutoScalingGroup</code>.</p>
     *
     * @return <p>The value of the filter.</p> <p>If you specify the <code>name</code> parameter as <code>Finding</code>, and you request recommendations for an <i>instance</i>, then the valid values are <code>Underprovisioned</code>, <code>Overprovisioned</code>, <code>NotOptimized</code>, or <code>Optimized</code>.</p> <p>If you specify the <code>name</code> parameter as <code>Finding</code>, and you request recommendations for an <i>Auto Scaling group</i>, then the valid values are <code>Optimized</code>, or <code>NotOptimized</code>.</p> <p>If you specify the <code>name</code> parameter as <code>RecommendationSourceType</code>, then the valid values are <code>Ec2Instance</code>, or <code>AutoScalingGroup</code>.</p>
     */
    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>The value of the filter.</p> <p>If you specify the <code>name</code> parameter as <code>Finding</code>, and you request recommendations for an <i>instance</i>, then the valid values are <code>Underprovisioned</code>, <code>Overprovisioned</code>, <code>NotOptimized</code>, or <code>Optimized</code>.</p> <p>If you specify the <code>name</code> parameter as <code>Finding</code>, and you request recommendations for an <i>Auto Scaling group</i>, then the valid values are <code>Optimized</code>, or <code>NotOptimized</code>.</p> <p>If you specify the <code>name</code> parameter as <code>RecommendationSourceType</code>, then the valid values are <code>Ec2Instance</code>, or <code>AutoScalingGroup</code>.</p>
     *
     * @param values <p>The value of the filter.</p> <p>If you specify the <code>name</code> parameter as <code>Finding</code>, and you request recommendations for an <i>instance</i>, then the valid values are <code>Underprovisioned</code>, <code>Overprovisioned</code>, <code>NotOptimized</code>, or <code>Optimized</code>.</p> <p>If you specify the <code>name</code> parameter as <code>Finding</code>, and you request recommendations for an <i>Auto Scaling group</i>, then the valid values are <code>Optimized</code>, or <code>NotOptimized</code>.</p> <p>If you specify the <code>name</code> parameter as <code>RecommendationSourceType</code>, then the valid values are <code>Ec2Instance</code>, or <code>AutoScalingGroup</code>.</p>
     */
    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>The value of the filter.</p> <p>If you specify the <code>name</code> parameter as <code>Finding</code>, and you request recommendations for an <i>instance</i>, then the valid values are <code>Underprovisioned</code>, <code>Overprovisioned</code>, <code>NotOptimized</code>, or <code>Optimized</code>.</p> <p>If you specify the <code>name</code> parameter as <code>Finding</code>, and you request recommendations for an <i>Auto Scaling group</i>, then the valid values are <code>Optimized</code>, or <code>NotOptimized</code>.</p> <p>If you specify the <code>name</code> parameter as <code>RecommendationSourceType</code>, then the valid values are <code>Ec2Instance</code>, or <code>AutoScalingGroup</code>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param values <p>The value of the filter.</p> <p>If you specify the <code>name</code> parameter as <code>Finding</code>, and you request recommendations for an <i>instance</i>, then the valid values are <code>Underprovisioned</code>, <code>Overprovisioned</code>, <code>NotOptimized</code>, or <code>Optimized</code>.</p> <p>If you specify the <code>name</code> parameter as <code>Finding</code>, and you request recommendations for an <i>Auto Scaling group</i>, then the valid values are <code>Optimized</code>, or <code>NotOptimized</code>.</p> <p>If you specify the <code>name</code> parameter as <code>RecommendationSourceType</code>, then the valid values are <code>Ec2Instance</code>, or <code>AutoScalingGroup</code>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Filter withValues(String... values) {
        if (getValues() == null) {
            this.values = new java.util.ArrayList<String>(values.length);
        }
        for (String value : values) {
            this.values.add(value);
        }
        return this;
    }

    /**
     * <p>The value of the filter.</p> <p>If you specify the <code>name</code> parameter as <code>Finding</code>, and you request recommendations for an <i>instance</i>, then the valid values are <code>Underprovisioned</code>, <code>Overprovisioned</code>, <code>NotOptimized</code>, or <code>Optimized</code>.</p> <p>If you specify the <code>name</code> parameter as <code>Finding</code>, and you request recommendations for an <i>Auto Scaling group</i>, then the valid values are <code>Optimized</code>, or <code>NotOptimized</code>.</p> <p>If you specify the <code>name</code> parameter as <code>RecommendationSourceType</code>, then the valid values are <code>Ec2Instance</code>, or <code>AutoScalingGroup</code>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param values <p>The value of the filter.</p> <p>If you specify the <code>name</code> parameter as <code>Finding</code>, and you request recommendations for an <i>instance</i>, then the valid values are <code>Underprovisioned</code>, <code>Overprovisioned</code>, <code>NotOptimized</code>, or <code>Optimized</code>.</p> <p>If you specify the <code>name</code> parameter as <code>Finding</code>, and you request recommendations for an <i>Auto Scaling group</i>, then the valid values are <code>Optimized</code>, or <code>NotOptimized</code>.</p> <p>If you specify the <code>name</code> parameter as <code>RecommendationSourceType</code>, then the valid values are <code>Ec2Instance</code>, or <code>AutoScalingGroup</code>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Filter withValues(java.util.Collection<String> values) {
        setValues(values);
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
        if (getName() != null) sb.append("name: " + getName() + ",");
        if (getValues() != null) sb.append("values: " + getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Filter == false) return false;
        Filter other = (Filter)obj;

        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
        if (other.getValues() == null ^ this.getValues() == null) return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false) return false;
        return true;
    }
}
