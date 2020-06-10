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
 * <p>Describes a filter that returns a more specific list of recommendation export jobs.</p> <p>This filter is used with the <code>DescribeRecommendationExportJobs</code> action.</p>
 */
public class JobFilter implements Serializable {
    /**
     * <p>The name of the filter.</p> <p>Specify <code>ResourceType</code> to return export jobs of a specific resource type (e.g., <code>Ec2Instance</code>).</p> <p>Specify <code>JobStatus</code> to return export jobs with a specific status (e.g, <code>Complete</code>).</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ResourceType, JobStatus
     */
    private String name;

    /**
     * <p>The value of the filter.</p> <p>If you specify the <code>name</code> parameter as <code>ResourceType</code>, the valid values are <code>Ec2Instance</code> or <code>AutoScalingGroup</code>.</p> <p>If you specify the <code>name</code> parameter as <code>JobStatus</code>, the valid values are <code>Queued</code>, <code>InProgress</code>, <code>Complete</code>, or <code>Failed</code>.</p>
     */
    private java.util.List<String> values;

    /**
     * <p>The name of the filter.</p> <p>Specify <code>ResourceType</code> to return export jobs of a specific resource type (e.g., <code>Ec2Instance</code>).</p> <p>Specify <code>JobStatus</code> to return export jobs with a specific status (e.g, <code>Complete</code>).</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ResourceType, JobStatus
     *
     * @return <p>The name of the filter.</p> <p>Specify <code>ResourceType</code> to return export jobs of a specific resource type (e.g., <code>Ec2Instance</code>).</p> <p>Specify <code>JobStatus</code> to return export jobs with a specific status (e.g, <code>Complete</code>).</p>
     *
     * @see JobFilterName
     */
    public String getName() {
        return name;
    }

    /**
     * <p>The name of the filter.</p> <p>Specify <code>ResourceType</code> to return export jobs of a specific resource type (e.g., <code>Ec2Instance</code>).</p> <p>Specify <code>JobStatus</code> to return export jobs with a specific status (e.g, <code>Complete</code>).</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ResourceType, JobStatus
     *
     * @param name <p>The name of the filter.</p> <p>Specify <code>ResourceType</code> to return export jobs of a specific resource type (e.g., <code>Ec2Instance</code>).</p> <p>Specify <code>JobStatus</code> to return export jobs with a specific status (e.g, <code>Complete</code>).</p>
     *
     * @see JobFilterName
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>The name of the filter.</p> <p>Specify <code>ResourceType</code> to return export jobs of a specific resource type (e.g., <code>Ec2Instance</code>).</p> <p>Specify <code>JobStatus</code> to return export jobs with a specific status (e.g, <code>Complete</code>).</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ResourceType, JobStatus
     *
     * @param name <p>The name of the filter.</p> <p>Specify <code>ResourceType</code> to return export jobs of a specific resource type (e.g., <code>Ec2Instance</code>).</p> <p>Specify <code>JobStatus</code> to return export jobs with a specific status (e.g, <code>Complete</code>).</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see JobFilterName
     */
    public JobFilter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>The name of the filter.</p> <p>Specify <code>ResourceType</code> to return export jobs of a specific resource type (e.g., <code>Ec2Instance</code>).</p> <p>Specify <code>JobStatus</code> to return export jobs with a specific status (e.g, <code>Complete</code>).</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ResourceType, JobStatus
     *
     * @param name <p>The name of the filter.</p> <p>Specify <code>ResourceType</code> to return export jobs of a specific resource type (e.g., <code>Ec2Instance</code>).</p> <p>Specify <code>JobStatus</code> to return export jobs with a specific status (e.g, <code>Complete</code>).</p>
     *
     * @see JobFilterName
     */
    public void setName(JobFilterName name) {
        this.name = name.toString();
    }

    /**
     * <p>The name of the filter.</p> <p>Specify <code>ResourceType</code> to return export jobs of a specific resource type (e.g., <code>Ec2Instance</code>).</p> <p>Specify <code>JobStatus</code> to return export jobs with a specific status (e.g, <code>Complete</code>).</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ResourceType, JobStatus
     *
     * @param name <p>The name of the filter.</p> <p>Specify <code>ResourceType</code> to return export jobs of a specific resource type (e.g., <code>Ec2Instance</code>).</p> <p>Specify <code>JobStatus</code> to return export jobs with a specific status (e.g, <code>Complete</code>).</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see JobFilterName
     */
    public JobFilter withName(JobFilterName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>The value of the filter.</p> <p>If you specify the <code>name</code> parameter as <code>ResourceType</code>, the valid values are <code>Ec2Instance</code> or <code>AutoScalingGroup</code>.</p> <p>If you specify the <code>name</code> parameter as <code>JobStatus</code>, the valid values are <code>Queued</code>, <code>InProgress</code>, <code>Complete</code>, or <code>Failed</code>.</p>
     *
     * @return <p>The value of the filter.</p> <p>If you specify the <code>name</code> parameter as <code>ResourceType</code>, the valid values are <code>Ec2Instance</code> or <code>AutoScalingGroup</code>.</p> <p>If you specify the <code>name</code> parameter as <code>JobStatus</code>, the valid values are <code>Queued</code>, <code>InProgress</code>, <code>Complete</code>, or <code>Failed</code>.</p>
     */
    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>The value of the filter.</p> <p>If you specify the <code>name</code> parameter as <code>ResourceType</code>, the valid values are <code>Ec2Instance</code> or <code>AutoScalingGroup</code>.</p> <p>If you specify the <code>name</code> parameter as <code>JobStatus</code>, the valid values are <code>Queued</code>, <code>InProgress</code>, <code>Complete</code>, or <code>Failed</code>.</p>
     *
     * @param values <p>The value of the filter.</p> <p>If you specify the <code>name</code> parameter as <code>ResourceType</code>, the valid values are <code>Ec2Instance</code> or <code>AutoScalingGroup</code>.</p> <p>If you specify the <code>name</code> parameter as <code>JobStatus</code>, the valid values are <code>Queued</code>, <code>InProgress</code>, <code>Complete</code>, or <code>Failed</code>.</p>
     */
    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>The value of the filter.</p> <p>If you specify the <code>name</code> parameter as <code>ResourceType</code>, the valid values are <code>Ec2Instance</code> or <code>AutoScalingGroup</code>.</p> <p>If you specify the <code>name</code> parameter as <code>JobStatus</code>, the valid values are <code>Queued</code>, <code>InProgress</code>, <code>Complete</code>, or <code>Failed</code>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param values <p>The value of the filter.</p> <p>If you specify the <code>name</code> parameter as <code>ResourceType</code>, the valid values are <code>Ec2Instance</code> or <code>AutoScalingGroup</code>.</p> <p>If you specify the <code>name</code> parameter as <code>JobStatus</code>, the valid values are <code>Queued</code>, <code>InProgress</code>, <code>Complete</code>, or <code>Failed</code>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobFilter withValues(String... values) {
        if (getValues() == null) {
            this.values = new java.util.ArrayList<String>(values.length);
        }
        for (String value : values) {
            this.values.add(value);
        }
        return this;
    }

    /**
     * <p>The value of the filter.</p> <p>If you specify the <code>name</code> parameter as <code>ResourceType</code>, the valid values are <code>Ec2Instance</code> or <code>AutoScalingGroup</code>.</p> <p>If you specify the <code>name</code> parameter as <code>JobStatus</code>, the valid values are <code>Queued</code>, <code>InProgress</code>, <code>Complete</code>, or <code>Failed</code>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param values <p>The value of the filter.</p> <p>If you specify the <code>name</code> parameter as <code>ResourceType</code>, the valid values are <code>Ec2Instance</code> or <code>AutoScalingGroup</code>.</p> <p>If you specify the <code>name</code> parameter as <code>JobStatus</code>, the valid values are <code>Queued</code>, <code>InProgress</code>, <code>Complete</code>, or <code>Failed</code>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobFilter withValues(java.util.Collection<String> values) {
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

        if (obj instanceof JobFilter == false) return false;
        JobFilter other = (JobFilter)obj;

        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
        if (other.getValues() == null ^ this.getValues() == null) return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false) return false;
        return true;
    }
}
