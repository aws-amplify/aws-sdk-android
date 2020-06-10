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
 * <p>Describes a recommendation export job.</p> <p>Use the <code>DescribeRecommendationExportJobs</code> action to view your recommendation export jobs.</p> <p>Use the <code>ExportAutoScalingGroupRecommendations</code> or <code>ExportEC2InstanceRecommendations</code> actions to request an export of your recommendations.</p>
 */
public class RecommendationExportJob implements Serializable {
    /**
     * <p>The identification number of the export job.</p>
     */
    private String jobId;

    /**
     * <p>An object that describes the destination of the export file.</p>
     */
    private ExportDestination destination;

    /**
     * <p>The resource type of the exported recommendations.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ec2Instance, AutoScalingGroup
     */
    private String resourceType;

    /**
     * <p>The status of the export job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Queued, InProgress, Complete, Failed
     */
    private String status;

    /**
     * <p>The timestamp of when the export job was created.</p>
     */
    private java.util.Date creationTimestamp;

    /**
     * <p>The timestamp of when the export job was last updated.</p>
     */
    private java.util.Date lastUpdatedTimestamp;

    /**
     * <p>The reason for an export job failure.</p>
     */
    private String failureReason;

    /**
     * <p>The identification number of the export job.</p>
     *
     * @return <p>The identification number of the export job.</p>
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <p>The identification number of the export job.</p>
     *
     * @param jobId <p>The identification number of the export job.</p>
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>The identification number of the export job.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobId <p>The identification number of the export job.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public RecommendationExportJob withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * <p>An object that describes the destination of the export file.</p>
     *
     * @return <p>An object that describes the destination of the export file.</p>
     */
    public ExportDestination getDestination() {
        return destination;
    }

    /**
     * <p>An object that describes the destination of the export file.</p>
     *
     * @param destination <p>An object that describes the destination of the export file.</p>
     */
    public void setDestination(ExportDestination destination) {
        this.destination = destination;
    }

    /**
     * <p>An object that describes the destination of the export file.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param destination <p>An object that describes the destination of the export file.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public RecommendationExportJob withDestination(ExportDestination destination) {
        this.destination = destination;
        return this;
    }

    /**
     * <p>The resource type of the exported recommendations.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ec2Instance, AutoScalingGroup
     *
     * @return <p>The resource type of the exported recommendations.</p>
     *
     * @see ResourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>The resource type of the exported recommendations.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ec2Instance, AutoScalingGroup
     *
     * @param resourceType <p>The resource type of the exported recommendations.</p>
     *
     * @see ResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>The resource type of the exported recommendations.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ec2Instance, AutoScalingGroup
     *
     * @param resourceType <p>The resource type of the exported recommendations.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see ResourceType
     */
    public RecommendationExportJob withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>The resource type of the exported recommendations.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ec2Instance, AutoScalingGroup
     *
     * @param resourceType <p>The resource type of the exported recommendations.</p>
     *
     * @see ResourceType
     */
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>The resource type of the exported recommendations.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ec2Instance, AutoScalingGroup
     *
     * @param resourceType <p>The resource type of the exported recommendations.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see ResourceType
     */
    public RecommendationExportJob withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>The status of the export job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Queued, InProgress, Complete, Failed
     *
     * @return <p>The status of the export job.</p>
     *
     * @see JobStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>The status of the export job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Queued, InProgress, Complete, Failed
     *
     * @param status <p>The status of the export job.</p>
     *
     * @see JobStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>The status of the export job.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Queued, InProgress, Complete, Failed
     *
     * @param status <p>The status of the export job.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see JobStatus
     */
    public RecommendationExportJob withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>The status of the export job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Queued, InProgress, Complete, Failed
     *
     * @param status <p>The status of the export job.</p>
     *
     * @see JobStatus
     */
    public void setStatus(JobStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>The status of the export job.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Queued, InProgress, Complete, Failed
     *
     * @param status <p>The status of the export job.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see JobStatus
     */
    public RecommendationExportJob withStatus(JobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>The timestamp of when the export job was created.</p>
     *
     * @return <p>The timestamp of when the export job was created.</p>
     */
    public java.util.Date getCreationTimestamp() {
        return creationTimestamp;
    }

    /**
     * <p>The timestamp of when the export job was created.</p>
     *
     * @param creationTimestamp <p>The timestamp of when the export job was created.</p>
     */
    public void setCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * <p>The timestamp of when the export job was created.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param creationTimestamp <p>The timestamp of when the export job was created.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public RecommendationExportJob withCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    /**
     * <p>The timestamp of when the export job was last updated.</p>
     *
     * @return <p>The timestamp of when the export job was last updated.</p>
     */
    public java.util.Date getLastUpdatedTimestamp() {
        return lastUpdatedTimestamp;
    }

    /**
     * <p>The timestamp of when the export job was last updated.</p>
     *
     * @param lastUpdatedTimestamp <p>The timestamp of when the export job was last updated.</p>
     */
    public void setLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    /**
     * <p>The timestamp of when the export job was last updated.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastUpdatedTimestamp <p>The timestamp of when the export job was last updated.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public RecommendationExportJob withLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        return this;
    }

    /**
     * <p>The reason for an export job failure.</p>
     *
     * @return <p>The reason for an export job failure.</p>
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>The reason for an export job failure.</p>
     *
     * @param failureReason <p>The reason for an export job failure.</p>
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>The reason for an export job failure.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param failureReason <p>The reason for an export job failure.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public RecommendationExportJob withFailureReason(String failureReason) {
        this.failureReason = failureReason;
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
        if (getJobId() != null) sb.append("jobId: " + getJobId() + ",");
        if (getDestination() != null) sb.append("destination: " + getDestination() + ",");
        if (getResourceType() != null) sb.append("resourceType: " + getResourceType() + ",");
        if (getStatus() != null) sb.append("status: " + getStatus() + ",");
        if (getCreationTimestamp() != null) sb.append("creationTimestamp: " + getCreationTimestamp() + ",");
        if (getLastUpdatedTimestamp() != null) sb.append("lastUpdatedTimestamp: " + getLastUpdatedTimestamp() + ",");
        if (getFailureReason() != null) sb.append("failureReason: " + getFailureReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTimestamp() == null) ? 0 : getLastUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RecommendationExportJob == false) return false;
        RecommendationExportJob other = (RecommendationExportJob)obj;

        if (other.getJobId() == null ^ this.getJobId() == null) return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false) return false;
        if (other.getDestination() == null ^ this.getDestination() == null) return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false) return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null) return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false) return false;
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false;
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null) return false;
        if (other.getCreationTimestamp() != null && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false) return false;
        if (other.getLastUpdatedTimestamp() == null ^ this.getLastUpdatedTimestamp() == null) return false;
        if (other.getLastUpdatedTimestamp() != null && other.getLastUpdatedTimestamp().equals(this.getLastUpdatedTimestamp()) == false) return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null) return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false) return false;
        return true;
    }
}
