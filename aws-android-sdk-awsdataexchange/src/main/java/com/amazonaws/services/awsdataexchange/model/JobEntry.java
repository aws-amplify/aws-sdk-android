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

package com.amazonaws.services.awsdataexchange.model;

import java.io.Serializable;

/**
 * AWS Data Exchange Jobs are asynchronous import or export operations used to
 * create or copy assets. A data set owner can both import and export as they
 * see fit. Someone with an entitlement to a data set can only export. Jobs are
 * deleted 90 days after they are created.
 */
public class JobEntry implements Serializable {
    /**
     * <p>
     * The ARN for the job.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The date and time that the job was created, in ISO 8601 format.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * Details of the operation to be performed by the job, such as export
     * destination details or import source details.
     * </p>
     */
    private ResponseDetails details;

    /**
     * <p>
     * Errors for jobs.
     * </p>
     */
    private java.util.List<JobError> errors;

    /**
     * <p>
     * The unique identifier for the job.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The state of the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WAITING, IN_PROGRESS, ERROR, COMPLETED, CANCELLED,
     * TIMED_OUT
     */
    private String state;

    /**
     * <p>
     * The job type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORT_ASSETS_FROM_S3,
     * IMPORT_ASSET_FROM_SIGNED_URL, EXPORT_ASSETS_TO_S3,
     * EXPORT_ASSET_TO_SIGNED_URL
     */
    private String type;

    /**
     * <p>
     * The date and time that the job was last updated, in ISO 8601 format.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The ARN for the job.
     * </p>
     *
     * @return <p>
     *         The ARN for the job.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The ARN for the job.
     * </p>
     *
     * @param arn <p>
     *            The ARN for the job.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN for the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The ARN for the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobEntry withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The date and time that the job was created, in ISO 8601 format.
     * </p>
     *
     * @return <p>
     *         The date and time that the job was created, in ISO 8601 format.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The date and time that the job was created, in ISO 8601 format.
     * </p>
     *
     * @param createdAt <p>
     *            The date and time that the job was created, in ISO 8601
     *            format.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time that the job was created, in ISO 8601 format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The date and time that the job was created, in ISO 8601
     *            format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobEntry withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * Details of the operation to be performed by the job, such as export
     * destination details or import source details.
     * </p>
     *
     * @return <p>
     *         Details of the operation to be performed by the job, such as
     *         export destination details or import source details.
     *         </p>
     */
    public ResponseDetails getDetails() {
        return details;
    }

    /**
     * <p>
     * Details of the operation to be performed by the job, such as export
     * destination details or import source details.
     * </p>
     *
     * @param details <p>
     *            Details of the operation to be performed by the job, such as
     *            export destination details or import source details.
     *            </p>
     */
    public void setDetails(ResponseDetails details) {
        this.details = details;
    }

    /**
     * <p>
     * Details of the operation to be performed by the job, such as export
     * destination details or import source details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param details <p>
     *            Details of the operation to be performed by the job, such as
     *            export destination details or import source details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobEntry withDetails(ResponseDetails details) {
        this.details = details;
        return this;
    }

    /**
     * <p>
     * Errors for jobs.
     * </p>
     *
     * @return <p>
     *         Errors for jobs.
     *         </p>
     */
    public java.util.List<JobError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * Errors for jobs.
     * </p>
     *
     * @param errors <p>
     *            Errors for jobs.
     *            </p>
     */
    public void setErrors(java.util.Collection<JobError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<JobError>(errors);
    }

    /**
     * <p>
     * Errors for jobs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            Errors for jobs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobEntry withErrors(JobError... errors) {
        if (getErrors() == null) {
            this.errors = new java.util.ArrayList<JobError>(errors.length);
        }
        for (JobError value : errors) {
            this.errors.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Errors for jobs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            Errors for jobs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobEntry withErrors(java.util.Collection<JobError> errors) {
        setErrors(errors);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the job.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the job.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The unique identifier for the job.
     * </p>
     *
     * @param id <p>
     *            The unique identifier for the job.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The unique identifier for the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobEntry withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The state of the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WAITING, IN_PROGRESS, ERROR, COMPLETED, CANCELLED,
     * TIMED_OUT
     *
     * @return <p>
     *         The state of the job.
     *         </p>
     * @see State
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WAITING, IN_PROGRESS, ERROR, COMPLETED, CANCELLED,
     * TIMED_OUT
     *
     * @param state <p>
     *            The state of the job.
     *            </p>
     * @see State
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WAITING, IN_PROGRESS, ERROR, COMPLETED, CANCELLED,
     * TIMED_OUT
     *
     * @param state <p>
     *            The state of the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see State
     */
    public JobEntry withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state of the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WAITING, IN_PROGRESS, ERROR, COMPLETED, CANCELLED,
     * TIMED_OUT
     *
     * @param state <p>
     *            The state of the job.
     *            </p>
     * @see State
     */
    public void setState(State state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WAITING, IN_PROGRESS, ERROR, COMPLETED, CANCELLED,
     * TIMED_OUT
     *
     * @param state <p>
     *            The state of the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see State
     */
    public JobEntry withState(State state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The job type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORT_ASSETS_FROM_S3,
     * IMPORT_ASSET_FROM_SIGNED_URL, EXPORT_ASSETS_TO_S3,
     * EXPORT_ASSET_TO_SIGNED_URL
     *
     * @return <p>
     *         The job type.
     *         </p>
     * @see Type
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The job type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORT_ASSETS_FROM_S3,
     * IMPORT_ASSET_FROM_SIGNED_URL, EXPORT_ASSETS_TO_S3,
     * EXPORT_ASSET_TO_SIGNED_URL
     *
     * @param type <p>
     *            The job type.
     *            </p>
     * @see Type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The job type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORT_ASSETS_FROM_S3,
     * IMPORT_ASSET_FROM_SIGNED_URL, EXPORT_ASSETS_TO_S3,
     * EXPORT_ASSET_TO_SIGNED_URL
     *
     * @param type <p>
     *            The job type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Type
     */
    public JobEntry withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The job type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORT_ASSETS_FROM_S3,
     * IMPORT_ASSET_FROM_SIGNED_URL, EXPORT_ASSETS_TO_S3,
     * EXPORT_ASSET_TO_SIGNED_URL
     *
     * @param type <p>
     *            The job type.
     *            </p>
     * @see Type
     */
    public void setType(Type type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The job type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORT_ASSETS_FROM_S3,
     * IMPORT_ASSET_FROM_SIGNED_URL, EXPORT_ASSETS_TO_S3,
     * EXPORT_ASSET_TO_SIGNED_URL
     *
     * @param type <p>
     *            The job type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Type
     */
    public JobEntry withType(Type type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the job was last updated, in ISO 8601 format.
     * </p>
     *
     * @return <p>
     *         The date and time that the job was last updated, in ISO 8601
     *         format.
     *         </p>
     */
    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * <p>
     * The date and time that the job was last updated, in ISO 8601 format.
     * </p>
     *
     * @param updatedAt <p>
     *            The date and time that the job was last updated, in ISO 8601
     *            format.
     *            </p>
     */
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time that the job was last updated, in ISO 8601 format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updatedAt <p>
     *            The date and time that the job was last updated, in ISO 8601
     *            format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobEntry withUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
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
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (getDetails() != null)
            sb.append("Details: " + getDetails() + ",");
        if (getErrors() != null)
            sb.append("Errors: " + getErrors() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: " + getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobEntry == false)
            return false;
        JobEntry other = (JobEntry) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null
                && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }
}
