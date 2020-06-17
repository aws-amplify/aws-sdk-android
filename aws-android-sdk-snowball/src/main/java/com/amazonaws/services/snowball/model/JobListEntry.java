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

package com.amazonaws.services.snowball.model;

import java.io.Serializable;

/**
 * <p>
 * Each <code>JobListEntry</code> object contains a job's state, a job's ID, and
 * a value that indicates whether the job is a job part, in the case of an
 * export job.
 * </p>
 */
public class JobListEntry implements Serializable {
    /**
     * <p>
     * The automatically generated ID for a job, for example
     * <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String jobId;

    /**
     * <p>
     * The current state of this job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>New, PreparingAppliance, PreparingShipment,
     * InTransitToCustomer, WithCustomer, InTransitToAWS,
     * WithAWSSortingFacility, WithAWS, InProgress, Complete, Cancelled,
     * Listing, Pending
     */
    private String jobState;

    /**
     * <p>
     * A value that indicates that this job is a master job. A master job
     * represents a successful request to create an export job. Master jobs
     * aren't associated with any Snowballs. Instead, each master job will have
     * at least one job part, and each job part is associated with a Snowball.
     * It might take some time before the job parts associated with a particular
     * master job are listed, because they are created after the master job is
     * created.
     * </p>
     */
    private Boolean isMaster;

    /**
     * <p>
     * The type of job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORT, EXPORT, LOCAL_USE
     */
    private String jobType;

    /**
     * <p>
     * The type of device used with this job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, EDGE, EDGE_C, EDGE_CG, EDGE_S, SNC1_HDD
     */
    private String snowballType;

    /**
     * <p>
     * The creation date for this job.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The optional description of this specific job, for example
     * <code>Important Photos 2016-08-11</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String description;

    /**
     * <p>
     * The automatically generated ID for a job, for example
     * <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The automatically generated ID for a job, for example
     *         <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     *         </p>
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <p>
     * The automatically generated ID for a job, for example
     * <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param jobId <p>
     *            The automatically generated ID for a job, for example
     *            <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     *            </p>
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The automatically generated ID for a job, for example
     * <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param jobId <p>
     *            The automatically generated ID for a job, for example
     *            <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobListEntry withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * <p>
     * The current state of this job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>New, PreparingAppliance, PreparingShipment,
     * InTransitToCustomer, WithCustomer, InTransitToAWS,
     * WithAWSSortingFacility, WithAWS, InProgress, Complete, Cancelled,
     * Listing, Pending
     *
     * @return <p>
     *         The current state of this job.
     *         </p>
     * @see JobState
     */
    public String getJobState() {
        return jobState;
    }

    /**
     * <p>
     * The current state of this job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>New, PreparingAppliance, PreparingShipment,
     * InTransitToCustomer, WithCustomer, InTransitToAWS,
     * WithAWSSortingFacility, WithAWS, InProgress, Complete, Cancelled,
     * Listing, Pending
     *
     * @param jobState <p>
     *            The current state of this job.
     *            </p>
     * @see JobState
     */
    public void setJobState(String jobState) {
        this.jobState = jobState;
    }

    /**
     * <p>
     * The current state of this job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>New, PreparingAppliance, PreparingShipment,
     * InTransitToCustomer, WithCustomer, InTransitToAWS,
     * WithAWSSortingFacility, WithAWS, InProgress, Complete, Cancelled,
     * Listing, Pending
     *
     * @param jobState <p>
     *            The current state of this job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobState
     */
    public JobListEntry withJobState(String jobState) {
        this.jobState = jobState;
        return this;
    }

    /**
     * <p>
     * The current state of this job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>New, PreparingAppliance, PreparingShipment,
     * InTransitToCustomer, WithCustomer, InTransitToAWS,
     * WithAWSSortingFacility, WithAWS, InProgress, Complete, Cancelled,
     * Listing, Pending
     *
     * @param jobState <p>
     *            The current state of this job.
     *            </p>
     * @see JobState
     */
    public void setJobState(JobState jobState) {
        this.jobState = jobState.toString();
    }

    /**
     * <p>
     * The current state of this job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>New, PreparingAppliance, PreparingShipment,
     * InTransitToCustomer, WithCustomer, InTransitToAWS,
     * WithAWSSortingFacility, WithAWS, InProgress, Complete, Cancelled,
     * Listing, Pending
     *
     * @param jobState <p>
     *            The current state of this job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobState
     */
    public JobListEntry withJobState(JobState jobState) {
        this.jobState = jobState.toString();
        return this;
    }

    /**
     * <p>
     * A value that indicates that this job is a master job. A master job
     * represents a successful request to create an export job. Master jobs
     * aren't associated with any Snowballs. Instead, each master job will have
     * at least one job part, and each job part is associated with a Snowball.
     * It might take some time before the job parts associated with a particular
     * master job are listed, because they are created after the master job is
     * created.
     * </p>
     *
     * @return <p>
     *         A value that indicates that this job is a master job. A master
     *         job represents a successful request to create an export job.
     *         Master jobs aren't associated with any Snowballs. Instead, each
     *         master job will have at least one job part, and each job part is
     *         associated with a Snowball. It might take some time before the
     *         job parts associated with a particular master job are listed,
     *         because they are created after the master job is created.
     *         </p>
     */
    public Boolean isIsMaster() {
        return isMaster;
    }

    /**
     * <p>
     * A value that indicates that this job is a master job. A master job
     * represents a successful request to create an export job. Master jobs
     * aren't associated with any Snowballs. Instead, each master job will have
     * at least one job part, and each job part is associated with a Snowball.
     * It might take some time before the job parts associated with a particular
     * master job are listed, because they are created after the master job is
     * created.
     * </p>
     *
     * @return <p>
     *         A value that indicates that this job is a master job. A master
     *         job represents a successful request to create an export job.
     *         Master jobs aren't associated with any Snowballs. Instead, each
     *         master job will have at least one job part, and each job part is
     *         associated with a Snowball. It might take some time before the
     *         job parts associated with a particular master job are listed,
     *         because they are created after the master job is created.
     *         </p>
     */
    public Boolean getIsMaster() {
        return isMaster;
    }

    /**
     * <p>
     * A value that indicates that this job is a master job. A master job
     * represents a successful request to create an export job. Master jobs
     * aren't associated with any Snowballs. Instead, each master job will have
     * at least one job part, and each job part is associated with a Snowball.
     * It might take some time before the job parts associated with a particular
     * master job are listed, because they are created after the master job is
     * created.
     * </p>
     *
     * @param isMaster <p>
     *            A value that indicates that this job is a master job. A master
     *            job represents a successful request to create an export job.
     *            Master jobs aren't associated with any Snowballs. Instead,
     *            each master job will have at least one job part, and each job
     *            part is associated with a Snowball. It might take some time
     *            before the job parts associated with a particular master job
     *            are listed, because they are created after the master job is
     *            created.
     *            </p>
     */
    public void setIsMaster(Boolean isMaster) {
        this.isMaster = isMaster;
    }

    /**
     * <p>
     * A value that indicates that this job is a master job. A master job
     * represents a successful request to create an export job. Master jobs
     * aren't associated with any Snowballs. Instead, each master job will have
     * at least one job part, and each job part is associated with a Snowball.
     * It might take some time before the job parts associated with a particular
     * master job are listed, because they are created after the master job is
     * created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isMaster <p>
     *            A value that indicates that this job is a master job. A master
     *            job represents a successful request to create an export job.
     *            Master jobs aren't associated with any Snowballs. Instead,
     *            each master job will have at least one job part, and each job
     *            part is associated with a Snowball. It might take some time
     *            before the job parts associated with a particular master job
     *            are listed, because they are created after the master job is
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobListEntry withIsMaster(Boolean isMaster) {
        this.isMaster = isMaster;
        return this;
    }

    /**
     * <p>
     * The type of job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORT, EXPORT, LOCAL_USE
     *
     * @return <p>
     *         The type of job.
     *         </p>
     * @see JobType
     */
    public String getJobType() {
        return jobType;
    }

    /**
     * <p>
     * The type of job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORT, EXPORT, LOCAL_USE
     *
     * @param jobType <p>
     *            The type of job.
     *            </p>
     * @see JobType
     */
    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    /**
     * <p>
     * The type of job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORT, EXPORT, LOCAL_USE
     *
     * @param jobType <p>
     *            The type of job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobType
     */
    public JobListEntry withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * <p>
     * The type of job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORT, EXPORT, LOCAL_USE
     *
     * @param jobType <p>
     *            The type of job.
     *            </p>
     * @see JobType
     */
    public void setJobType(JobType jobType) {
        this.jobType = jobType.toString();
    }

    /**
     * <p>
     * The type of job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORT, EXPORT, LOCAL_USE
     *
     * @param jobType <p>
     *            The type of job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobType
     */
    public JobListEntry withJobType(JobType jobType) {
        this.jobType = jobType.toString();
        return this;
    }

    /**
     * <p>
     * The type of device used with this job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, EDGE, EDGE_C, EDGE_CG, EDGE_S, SNC1_HDD
     *
     * @return <p>
     *         The type of device used with this job.
     *         </p>
     * @see SnowballType
     */
    public String getSnowballType() {
        return snowballType;
    }

    /**
     * <p>
     * The type of device used with this job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, EDGE, EDGE_C, EDGE_CG, EDGE_S, SNC1_HDD
     *
     * @param snowballType <p>
     *            The type of device used with this job.
     *            </p>
     * @see SnowballType
     */
    public void setSnowballType(String snowballType) {
        this.snowballType = snowballType;
    }

    /**
     * <p>
     * The type of device used with this job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, EDGE, EDGE_C, EDGE_CG, EDGE_S, SNC1_HDD
     *
     * @param snowballType <p>
     *            The type of device used with this job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SnowballType
     */
    public JobListEntry withSnowballType(String snowballType) {
        this.snowballType = snowballType;
        return this;
    }

    /**
     * <p>
     * The type of device used with this job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, EDGE, EDGE_C, EDGE_CG, EDGE_S, SNC1_HDD
     *
     * @param snowballType <p>
     *            The type of device used with this job.
     *            </p>
     * @see SnowballType
     */
    public void setSnowballType(SnowballType snowballType) {
        this.snowballType = snowballType.toString();
    }

    /**
     * <p>
     * The type of device used with this job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, EDGE, EDGE_C, EDGE_CG, EDGE_S, SNC1_HDD
     *
     * @param snowballType <p>
     *            The type of device used with this job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SnowballType
     */
    public JobListEntry withSnowballType(SnowballType snowballType) {
        this.snowballType = snowballType.toString();
        return this;
    }

    /**
     * <p>
     * The creation date for this job.
     * </p>
     *
     * @return <p>
     *         The creation date for this job.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The creation date for this job.
     * </p>
     *
     * @param creationDate <p>
     *            The creation date for this job.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The creation date for this job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The creation date for this job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobListEntry withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * The optional description of this specific job, for example
     * <code>Important Photos 2016-08-11</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The optional description of this specific job, for example
     *         <code>Important Photos 2016-08-11</code>.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The optional description of this specific job, for example
     * <code>Important Photos 2016-08-11</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param description <p>
     *            The optional description of this specific job, for example
     *            <code>Important Photos 2016-08-11</code>.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The optional description of this specific job, for example
     * <code>Important Photos 2016-08-11</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param description <p>
     *            The optional description of this specific job, for example
     *            <code>Important Photos 2016-08-11</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobListEntry withDescription(String description) {
        this.description = description;
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
        if (getJobId() != null)
            sb.append("JobId: " + getJobId() + ",");
        if (getJobState() != null)
            sb.append("JobState: " + getJobState() + ",");
        if (getIsMaster() != null)
            sb.append("IsMaster: " + getIsMaster() + ",");
        if (getJobType() != null)
            sb.append("JobType: " + getJobType() + ",");
        if (getSnowballType() != null)
            sb.append("SnowballType: " + getSnowballType() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobState() == null) ? 0 : getJobState().hashCode());
        hashCode = prime * hashCode + ((getIsMaster() == null) ? 0 : getIsMaster().hashCode());
        hashCode = prime * hashCode + ((getJobType() == null) ? 0 : getJobType().hashCode());
        hashCode = prime * hashCode
                + ((getSnowballType() == null) ? 0 : getSnowballType().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobListEntry == false)
            return false;
        JobListEntry other = (JobListEntry) obj;

        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobState() == null ^ this.getJobState() == null)
            return false;
        if (other.getJobState() != null && other.getJobState().equals(this.getJobState()) == false)
            return false;
        if (other.getIsMaster() == null ^ this.getIsMaster() == null)
            return false;
        if (other.getIsMaster() != null && other.getIsMaster().equals(this.getIsMaster()) == false)
            return false;
        if (other.getJobType() == null ^ this.getJobType() == null)
            return false;
        if (other.getJobType() != null && other.getJobType().equals(this.getJobType()) == false)
            return false;
        if (other.getSnowballType() == null ^ this.getSnowballType() == null)
            return false;
        if (other.getSnowballType() != null
                && other.getSnowballType().equals(this.getSnowballType()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }
}
