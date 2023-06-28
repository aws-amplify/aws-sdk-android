/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;

/**
 * <p>
 * The latest status of a stream's edge recording job.
 * </p>
 */
public class LastRecorderStatus implements Serializable {
    /**
     * <p>
     * A description of a recorder job’s latest status.
     * </p>
     */
    private String jobStatusDetails;

    /**
     * <p>
     * The timestamp at which the recorder job was last executed and media
     * stored to local disk.
     * </p>
     */
    private java.util.Date lastCollectedTime;

    /**
     * <p>
     * The timestamp at which the recorder status was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;

    /**
     * <p>
     * The status of the latest recorder job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCESS, USER_ERROR, SYSTEM_ERROR
     */
    private String recorderStatus;

    /**
     * <p>
     * A description of a recorder job’s latest status.
     * </p>
     *
     * @return <p>
     *         A description of a recorder job’s latest status.
     *         </p>
     */
    public String getJobStatusDetails() {
        return jobStatusDetails;
    }

    /**
     * <p>
     * A description of a recorder job’s latest status.
     * </p>
     *
     * @param jobStatusDetails <p>
     *            A description of a recorder job’s latest status.
     *            </p>
     */
    public void setJobStatusDetails(String jobStatusDetails) {
        this.jobStatusDetails = jobStatusDetails;
    }

    /**
     * <p>
     * A description of a recorder job’s latest status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobStatusDetails <p>
     *            A description of a recorder job’s latest status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LastRecorderStatus withJobStatusDetails(String jobStatusDetails) {
        this.jobStatusDetails = jobStatusDetails;
        return this;
    }

    /**
     * <p>
     * The timestamp at which the recorder job was last executed and media
     * stored to local disk.
     * </p>
     *
     * @return <p>
     *         The timestamp at which the recorder job was last executed and
     *         media stored to local disk.
     *         </p>
     */
    public java.util.Date getLastCollectedTime() {
        return lastCollectedTime;
    }

    /**
     * <p>
     * The timestamp at which the recorder job was last executed and media
     * stored to local disk.
     * </p>
     *
     * @param lastCollectedTime <p>
     *            The timestamp at which the recorder job was last executed and
     *            media stored to local disk.
     *            </p>
     */
    public void setLastCollectedTime(java.util.Date lastCollectedTime) {
        this.lastCollectedTime = lastCollectedTime;
    }

    /**
     * <p>
     * The timestamp at which the recorder job was last executed and media
     * stored to local disk.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastCollectedTime <p>
     *            The timestamp at which the recorder job was last executed and
     *            media stored to local disk.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LastRecorderStatus withLastCollectedTime(java.util.Date lastCollectedTime) {
        this.lastCollectedTime = lastCollectedTime;
        return this;
    }

    /**
     * <p>
     * The timestamp at which the recorder status was last updated.
     * </p>
     *
     * @return <p>
     *         The timestamp at which the recorder status was last updated.
     *         </p>
     */
    public java.util.Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    /**
     * <p>
     * The timestamp at which the recorder status was last updated.
     * </p>
     *
     * @param lastUpdatedTime <p>
     *            The timestamp at which the recorder status was last updated.
     *            </p>
     */
    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The timestamp at which the recorder status was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedTime <p>
     *            The timestamp at which the recorder status was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LastRecorderStatus withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
        return this;
    }

    /**
     * <p>
     * The status of the latest recorder job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCESS, USER_ERROR, SYSTEM_ERROR
     *
     * @return <p>
     *         The status of the latest recorder job.
     *         </p>
     * @see RecorderStatus
     */
    public String getRecorderStatus() {
        return recorderStatus;
    }

    /**
     * <p>
     * The status of the latest recorder job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCESS, USER_ERROR, SYSTEM_ERROR
     *
     * @param recorderStatus <p>
     *            The status of the latest recorder job.
     *            </p>
     * @see RecorderStatus
     */
    public void setRecorderStatus(String recorderStatus) {
        this.recorderStatus = recorderStatus;
    }

    /**
     * <p>
     * The status of the latest recorder job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCESS, USER_ERROR, SYSTEM_ERROR
     *
     * @param recorderStatus <p>
     *            The status of the latest recorder job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RecorderStatus
     */
    public LastRecorderStatus withRecorderStatus(String recorderStatus) {
        this.recorderStatus = recorderStatus;
        return this;
    }

    /**
     * <p>
     * The status of the latest recorder job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCESS, USER_ERROR, SYSTEM_ERROR
     *
     * @param recorderStatus <p>
     *            The status of the latest recorder job.
     *            </p>
     * @see RecorderStatus
     */
    public void setRecorderStatus(RecorderStatus recorderStatus) {
        this.recorderStatus = recorderStatus.toString();
    }

    /**
     * <p>
     * The status of the latest recorder job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCESS, USER_ERROR, SYSTEM_ERROR
     *
     * @param recorderStatus <p>
     *            The status of the latest recorder job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RecorderStatus
     */
    public LastRecorderStatus withRecorderStatus(RecorderStatus recorderStatus) {
        this.recorderStatus = recorderStatus.toString();
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
        if (getJobStatusDetails() != null)
            sb.append("JobStatusDetails: " + getJobStatusDetails() + ",");
        if (getLastCollectedTime() != null)
            sb.append("LastCollectedTime: " + getLastCollectedTime() + ",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: " + getLastUpdatedTime() + ",");
        if (getRecorderStatus() != null)
            sb.append("RecorderStatus: " + getRecorderStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getJobStatusDetails() == null) ? 0 : getJobStatusDetails().hashCode());
        hashCode = prime * hashCode
                + ((getLastCollectedTime() == null) ? 0 : getLastCollectedTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode
                + ((getRecorderStatus() == null) ? 0 : getRecorderStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LastRecorderStatus == false)
            return false;
        LastRecorderStatus other = (LastRecorderStatus) obj;

        if (other.getJobStatusDetails() == null ^ this.getJobStatusDetails() == null)
            return false;
        if (other.getJobStatusDetails() != null
                && other.getJobStatusDetails().equals(this.getJobStatusDetails()) == false)
            return false;
        if (other.getLastCollectedTime() == null ^ this.getLastCollectedTime() == null)
            return false;
        if (other.getLastCollectedTime() != null
                && other.getLastCollectedTime().equals(this.getLastCollectedTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null
                && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getRecorderStatus() == null ^ this.getRecorderStatus() == null)
            return false;
        if (other.getRecorderStatus() != null
                && other.getRecorderStatus().equals(this.getRecorderStatus()) == false)
            return false;
        return true;
    }
}
