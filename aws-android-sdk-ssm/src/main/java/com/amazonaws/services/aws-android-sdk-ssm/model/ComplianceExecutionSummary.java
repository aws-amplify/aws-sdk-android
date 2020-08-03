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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;


/**
 * <p>A summary of the call execution that includes an execution ID, the type of execution (for example, <code>Command</code>), and the date/time of the execution using a datetime object that is saved in the following format: yyyy-MM-dd'T'HH:mm:ss'Z'.</p>
 */
public class ComplianceExecutionSummary implements Serializable {
    /**
     * <p>The time the execution ran as a datetime object that is saved in the following format: yyyy-MM-dd'T'HH:mm:ss'Z'.</p>
     */
    private java.util.Date executionTime;

    /**
     * <p>An ID created by the system when <code>PutComplianceItems</code> was called. For example, <code>CommandID</code> is a valid execution ID. You can use this ID in subsequent calls.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     */
    private String executionId;

    /**
     * <p>The type of execution. For example, <code>Command</code> is a valid execution type.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 50<br/>
     */
    private String executionType;

    /**
     * <p>The time the execution ran as a datetime object that is saved in the following format: yyyy-MM-dd'T'HH:mm:ss'Z'.</p>
     *
     * @return <p>The time the execution ran as a datetime object that is saved in the following format: yyyy-MM-dd'T'HH:mm:ss'Z'.</p>
     */
    public java.util.Date getExecutionTime() {
        return executionTime;
    }

    /**
     * <p>The time the execution ran as a datetime object that is saved in the following format: yyyy-MM-dd'T'HH:mm:ss'Z'.</p>
     *
     * @param executionTime <p>The time the execution ran as a datetime object that is saved in the following format: yyyy-MM-dd'T'HH:mm:ss'Z'.</p>
     */
    public void setExecutionTime(java.util.Date executionTime) {
        this.executionTime = executionTime;
    }

    /**
     * <p>The time the execution ran as a datetime object that is saved in the following format: yyyy-MM-dd'T'HH:mm:ss'Z'.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param executionTime <p>The time the execution ran as a datetime object that is saved in the following format: yyyy-MM-dd'T'HH:mm:ss'Z'.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ComplianceExecutionSummary withExecutionTime(java.util.Date executionTime) {
        this.executionTime = executionTime;
        return this;
    }

    /**
     * <p>An ID created by the system when <code>PutComplianceItems</code> was called. For example, <code>CommandID</code> is a valid execution ID. You can use this ID in subsequent calls.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @return <p>An ID created by the system when <code>PutComplianceItems</code> was called. For example, <code>CommandID</code> is a valid execution ID. You can use this ID in subsequent calls.</p>
     */
    public String getExecutionId() {
        return executionId;
    }

    /**
     * <p>An ID created by the system when <code>PutComplianceItems</code> was called. For example, <code>CommandID</code> is a valid execution ID. You can use this ID in subsequent calls.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @param executionId <p>An ID created by the system when <code>PutComplianceItems</code> was called. For example, <code>CommandID</code> is a valid execution ID. You can use this ID in subsequent calls.</p>
     */
    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    /**
     * <p>An ID created by the system when <code>PutComplianceItems</code> was called. For example, <code>CommandID</code> is a valid execution ID. You can use this ID in subsequent calls.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @param executionId <p>An ID created by the system when <code>PutComplianceItems</code> was called. For example, <code>CommandID</code> is a valid execution ID. You can use this ID in subsequent calls.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ComplianceExecutionSummary withExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }

    /**
     * <p>The type of execution. For example, <code>Command</code> is a valid execution type.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 50<br/>
     *
     * @return <p>The type of execution. For example, <code>Command</code> is a valid execution type.</p>
     */
    public String getExecutionType() {
        return executionType;
    }

    /**
     * <p>The type of execution. For example, <code>Command</code> is a valid execution type.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 50<br/>
     *
     * @param executionType <p>The type of execution. For example, <code>Command</code> is a valid execution type.</p>
     */
    public void setExecutionType(String executionType) {
        this.executionType = executionType;
    }

    /**
     * <p>The type of execution. For example, <code>Command</code> is a valid execution type.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 50<br/>
     *
     * @param executionType <p>The type of execution. For example, <code>Command</code> is a valid execution type.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ComplianceExecutionSummary withExecutionType(String executionType) {
        this.executionType = executionType;
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
        if (getExecutionTime() != null) sb.append("ExecutionTime: " + getExecutionTime() + ",");
        if (getExecutionId() != null) sb.append("ExecutionId: " + getExecutionId() + ",");
        if (getExecutionType() != null) sb.append("ExecutionType: " + getExecutionType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExecutionTime() == null) ? 0 : getExecutionTime().hashCode());
        hashCode = prime * hashCode + ((getExecutionId() == null) ? 0 : getExecutionId().hashCode());
        hashCode = prime * hashCode + ((getExecutionType() == null) ? 0 : getExecutionType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ComplianceExecutionSummary == false) return false;
        ComplianceExecutionSummary other = (ComplianceExecutionSummary)obj;

        if (other.getExecutionTime() == null ^ this.getExecutionTime() == null) return false;
        if (other.getExecutionTime() != null && other.getExecutionTime().equals(this.getExecutionTime()) == false) return false;
        if (other.getExecutionId() == null ^ this.getExecutionId() == null) return false;
        if (other.getExecutionId() != null && other.getExecutionId().equals(this.getExecutionId()) == false) return false;
        if (other.getExecutionType() == null ^ this.getExecutionType() == null) return false;
        if (other.getExecutionType() != null && other.getExecutionType().equals(this.getExecutionType()) == false) return false;
        return true;
    }
}
