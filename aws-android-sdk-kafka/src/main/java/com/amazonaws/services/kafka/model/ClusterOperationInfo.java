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

package com.amazonaws.services.kafka.model;

import java.io.Serializable;

/**
 * 
 <p>
 * Returns information about a cluster operation.
 * </p>
 */
public class ClusterOperationInfo implements Serializable {
    /**
     * 
     <p>
     * The ID of the API request that triggered this operation.
     * </p>
     */
    private String clientRequestId;

    /**
     * 
     <p>
     * ARN of the cluster.
     * </p>
     */
    private String clusterArn;

    /**
     * 
     <p>
     * The time that the operation was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * 
     <p>
     * The time at which the operation finished.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * 
     <p>
     * Describes the error if the operation fails.
     * </p>
     */
    private ErrorInfo errorInfo;

    /**
     * 
     <p>
     * ARN of the cluster operation.
     * </p>
     */
    private String operationArn;

    /**
     * 
     <p>
     * State of the cluster operation.
     * </p>
     */
    private String operationState;

    /**
     * 
     <p>
     * Steps completed during the operation.
     * </p>
     */
    private java.util.List<ClusterOperationStep> operationSteps;

    /**
     * 
     <p>
     * Type of the cluster operation.
     * </p>
     */
    private String operationType;

    /**
     * 
     <p>
     * Information about cluster attributes before a cluster is updated.
     * </p>
     */
    private MutableClusterInfo sourceClusterInfo;

    /**
     * 
     <p>
     * Information about cluster attributes after a cluster is updated.
     * </p>
     */
    private MutableClusterInfo targetClusterInfo;

    /**
     * 
     <p>
     * The ID of the API request that triggered this operation.
     * </p>
     * 
     * @return <p>
     *         The ID of the API request that triggered this operation.
     *         </p>
     */
    public String getClientRequestId() {
        return clientRequestId;
    }

    /**
     * 
     <p>
     * The ID of the API request that triggered this operation.
     * </p>
     * 
     * @param clientRequestId <p>
     *            The ID of the API request that triggered this operation.
     *            </p>
     */
    public void setClientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
    }

    /**
     * 
     <p>
     * The ID of the API request that triggered this operation.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientRequestId <p>
     *            The ID of the API request that triggered this operation.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterOperationInfo withClientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
        return this;
    }

    /**
     * 
     <p>
     * ARN of the cluster.
     * </p>
     * 
     * @return <p>
     *         ARN of the cluster.
     *         </p>
     */
    public String getClusterArn() {
        return clusterArn;
    }

    /**
     * 
     <p>
     * ARN of the cluster.
     * </p>
     * 
     * @param clusterArn <p>
     *            ARN of the cluster.
     *            </p>
     */
    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * 
     <p>
     * ARN of the cluster.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterArn <p>
     *            ARN of the cluster.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterOperationInfo withClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
        return this;
    }

    /**
     * 
     <p>
     * The time that the operation was created.
     * </p>
     * 
     * @return <p>
     *         The time that the operation was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * 
     <p>
     * The time that the operation was created.
     * </p>
     * 
     * @param creationTime <p>
     *            The time that the operation was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * 
     <p>
     * The time that the operation was created.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The time that the operation was created.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterOperationInfo withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * 
     <p>
     * The time at which the operation finished.
     * </p>
     * 
     * @return <p>
     *         The time at which the operation finished.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * 
     <p>
     * The time at which the operation finished.
     * </p>
     * 
     * @param endTime <p>
     *            The time at which the operation finished.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 
     <p>
     * The time at which the operation finished.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The time at which the operation finished.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterOperationInfo withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 
     <p>
     * Describes the error if the operation fails.
     * </p>
     * 
     * @return <p>
     *         Describes the error if the operation fails.
     *         </p>
     */
    public ErrorInfo getErrorInfo() {
        return errorInfo;
    }

    /**
     * 
     <p>
     * Describes the error if the operation fails.
     * </p>
     * 
     * @param errorInfo <p>
     *            Describes the error if the operation fails.
     *            </p>
     */
    public void setErrorInfo(ErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
    }

    /**
     * 
     <p>
     * Describes the error if the operation fails.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorInfo <p>
     *            Describes the error if the operation fails.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterOperationInfo withErrorInfo(ErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
        return this;
    }

    /**
     * 
     <p>
     * ARN of the cluster operation.
     * </p>
     * 
     * @return <p>
     *         ARN of the cluster operation.
     *         </p>
     */
    public String getOperationArn() {
        return operationArn;
    }

    /**
     * 
     <p>
     * ARN of the cluster operation.
     * </p>
     * 
     * @param operationArn <p>
     *            ARN of the cluster operation.
     *            </p>
     */
    public void setOperationArn(String operationArn) {
        this.operationArn = operationArn;
    }

    /**
     * 
     <p>
     * ARN of the cluster operation.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param operationArn <p>
     *            ARN of the cluster operation.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterOperationInfo withOperationArn(String operationArn) {
        this.operationArn = operationArn;
        return this;
    }

    /**
     * 
     <p>
     * State of the cluster operation.
     * </p>
     * 
     * @return <p>
     *         State of the cluster operation.
     *         </p>
     */
    public String getOperationState() {
        return operationState;
    }

    /**
     * 
     <p>
     * State of the cluster operation.
     * </p>
     * 
     * @param operationState <p>
     *            State of the cluster operation.
     *            </p>
     */
    public void setOperationState(String operationState) {
        this.operationState = operationState;
    }

    /**
     * 
     <p>
     * State of the cluster operation.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param operationState <p>
     *            State of the cluster operation.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterOperationInfo withOperationState(String operationState) {
        this.operationState = operationState;
        return this;
    }

    /**
     * 
     <p>
     * Steps completed during the operation.
     * </p>
     * 
     * @return <p>
     *         Steps completed during the operation.
     *         </p>
     */
    public java.util.List<ClusterOperationStep> getOperationSteps() {
        return operationSteps;
    }

    /**
     * 
     <p>
     * Steps completed during the operation.
     * </p>
     * 
     * @param operationSteps <p>
     *            Steps completed during the operation.
     *            </p>
     */
    public void setOperationSteps(java.util.Collection<ClusterOperationStep> operationSteps) {
        if (operationSteps == null) {
            this.operationSteps = null;
            return;
        }

        this.operationSteps = new java.util.ArrayList<ClusterOperationStep>(operationSteps);
    }

    /**
     * 
     <p>
     * Steps completed during the operation.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param operationSteps <p>
     *            Steps completed during the operation.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterOperationInfo withOperationSteps(ClusterOperationStep... operationSteps) {
        if (getOperationSteps() == null) {
            this.operationSteps = new java.util.ArrayList<ClusterOperationStep>(
                    operationSteps.length);
        }
        for (ClusterOperationStep value : operationSteps) {
            this.operationSteps.add(value);
        }
        return this;
    }

    /**
     * 
     <p>
     * Steps completed during the operation.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param operationSteps <p>
     *            Steps completed during the operation.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterOperationInfo withOperationSteps(
            java.util.Collection<ClusterOperationStep> operationSteps) {
        setOperationSteps(operationSteps);
        return this;
    }

    /**
     * 
     <p>
     * Type of the cluster operation.
     * </p>
     * 
     * @return <p>
     *         Type of the cluster operation.
     *         </p>
     */
    public String getOperationType() {
        return operationType;
    }

    /**
     * 
     <p>
     * Type of the cluster operation.
     * </p>
     * 
     * @param operationType <p>
     *            Type of the cluster operation.
     *            </p>
     */
    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    /**
     * 
     <p>
     * Type of the cluster operation.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param operationType <p>
     *            Type of the cluster operation.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterOperationInfo withOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * 
     <p>
     * Information about cluster attributes before a cluster is updated.
     * </p>
     * 
     * @return <p>
     *         Information about cluster attributes before a cluster is updated.
     *         </p>
     */
    public MutableClusterInfo getSourceClusterInfo() {
        return sourceClusterInfo;
    }

    /**
     * 
     <p>
     * Information about cluster attributes before a cluster is updated.
     * </p>
     * 
     * @param sourceClusterInfo <p>
     *            Information about cluster attributes before a cluster is
     *            updated.
     *            </p>
     */
    public void setSourceClusterInfo(MutableClusterInfo sourceClusterInfo) {
        this.sourceClusterInfo = sourceClusterInfo;
    }

    /**
     * 
     <p>
     * Information about cluster attributes before a cluster is updated.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceClusterInfo <p>
     *            Information about cluster attributes before a cluster is
     *            updated.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterOperationInfo withSourceClusterInfo(MutableClusterInfo sourceClusterInfo) {
        this.sourceClusterInfo = sourceClusterInfo;
        return this;
    }

    /**
     * 
     <p>
     * Information about cluster attributes after a cluster is updated.
     * </p>
     * 
     * @return <p>
     *         Information about cluster attributes after a cluster is updated.
     *         </p>
     */
    public MutableClusterInfo getTargetClusterInfo() {
        return targetClusterInfo;
    }

    /**
     * 
     <p>
     * Information about cluster attributes after a cluster is updated.
     * </p>
     * 
     * @param targetClusterInfo <p>
     *            Information about cluster attributes after a cluster is
     *            updated.
     *            </p>
     */
    public void setTargetClusterInfo(MutableClusterInfo targetClusterInfo) {
        this.targetClusterInfo = targetClusterInfo;
    }

    /**
     * 
     <p>
     * Information about cluster attributes after a cluster is updated.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetClusterInfo <p>
     *            Information about cluster attributes after a cluster is
     *            updated.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterOperationInfo withTargetClusterInfo(MutableClusterInfo targetClusterInfo) {
        this.targetClusterInfo = targetClusterInfo;
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
        if (getClientRequestId() != null)
            sb.append("ClientRequestId: " + getClientRequestId() + ",");
        if (getClusterArn() != null)
            sb.append("ClusterArn: " + getClusterArn() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
        if (getErrorInfo() != null)
            sb.append("ErrorInfo: " + getErrorInfo() + ",");
        if (getOperationArn() != null)
            sb.append("OperationArn: " + getOperationArn() + ",");
        if (getOperationState() != null)
            sb.append("OperationState: " + getOperationState() + ",");
        if (getOperationSteps() != null)
            sb.append("OperationSteps: " + getOperationSteps() + ",");
        if (getOperationType() != null)
            sb.append("OperationType: " + getOperationType() + ",");
        if (getSourceClusterInfo() != null)
            sb.append("SourceClusterInfo: " + getSourceClusterInfo() + ",");
        if (getTargetClusterInfo() != null)
            sb.append("TargetClusterInfo: " + getTargetClusterInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClientRequestId() == null) ? 0 : getClientRequestId().hashCode());
        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getErrorInfo() == null) ? 0 : getErrorInfo().hashCode());
        hashCode = prime * hashCode
                + ((getOperationArn() == null) ? 0 : getOperationArn().hashCode());
        hashCode = prime * hashCode
                + ((getOperationState() == null) ? 0 : getOperationState().hashCode());
        hashCode = prime * hashCode
                + ((getOperationSteps() == null) ? 0 : getOperationSteps().hashCode());
        hashCode = prime * hashCode
                + ((getOperationType() == null) ? 0 : getOperationType().hashCode());
        hashCode = prime * hashCode
                + ((getSourceClusterInfo() == null) ? 0 : getSourceClusterInfo().hashCode());
        hashCode = prime * hashCode
                + ((getTargetClusterInfo() == null) ? 0 : getTargetClusterInfo().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterOperationInfo == false)
            return false;
        ClusterOperationInfo other = (ClusterOperationInfo) obj;

        if (other.getClientRequestId() == null ^ this.getClientRequestId() == null)
            return false;
        if (other.getClientRequestId() != null
                && other.getClientRequestId().equals(this.getClientRequestId()) == false)
            return false;
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null
                && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getErrorInfo() == null ^ this.getErrorInfo() == null)
            return false;
        if (other.getErrorInfo() != null
                && other.getErrorInfo().equals(this.getErrorInfo()) == false)
            return false;
        if (other.getOperationArn() == null ^ this.getOperationArn() == null)
            return false;
        if (other.getOperationArn() != null
                && other.getOperationArn().equals(this.getOperationArn()) == false)
            return false;
        if (other.getOperationState() == null ^ this.getOperationState() == null)
            return false;
        if (other.getOperationState() != null
                && other.getOperationState().equals(this.getOperationState()) == false)
            return false;
        if (other.getOperationSteps() == null ^ this.getOperationSteps() == null)
            return false;
        if (other.getOperationSteps() != null
                && other.getOperationSteps().equals(this.getOperationSteps()) == false)
            return false;
        if (other.getOperationType() == null ^ this.getOperationType() == null)
            return false;
        if (other.getOperationType() != null
                && other.getOperationType().equals(this.getOperationType()) == false)
            return false;
        if (other.getSourceClusterInfo() == null ^ this.getSourceClusterInfo() == null)
            return false;
        if (other.getSourceClusterInfo() != null
                && other.getSourceClusterInfo().equals(this.getSourceClusterInfo()) == false)
            return false;
        if (other.getTargetClusterInfo() == null ^ this.getTargetClusterInfo() == null)
            return false;
        if (other.getTargetClusterInfo() != null
                && other.getTargetClusterInfo().equals(this.getTargetClusterInfo()) == false)
            return false;
        return true;
    }
}
