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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

/**
 * <p>
 * Provides summary information for a work team.
 * </p>
 */
public class LabelingJobForWorkteamSummary implements Serializable {
    /**
     * <p>
     * The name of the labeling job that the work team is assigned to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String labelingJobName;

    /**
     * <p>
     * A unique identifier for a labeling job. You can use this to refer to a
     * specific labeling job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>.+<br/>
     */
    private String jobReferenceCode;

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d+$<br/>
     */
    private String workRequesterAccountId;

    /**
     * <p>
     * The date and time that the labeling job was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * Provides information about the progress of a labeling job.
     * </p>
     */
    private LabelCountersForWorkteam labelCounters;

    /**
     * <p>
     * The configured number of workers per data object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 9<br/>
     */
    private Integer numberOfHumanWorkersPerDataObject;

    /**
     * <p>
     * The name of the labeling job that the work team is assigned to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the labeling job that the work team is assigned to.
     *         </p>
     */
    public String getLabelingJobName() {
        return labelingJobName;
    }

    /**
     * <p>
     * The name of the labeling job that the work team is assigned to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param labelingJobName <p>
     *            The name of the labeling job that the work team is assigned
     *            to.
     *            </p>
     */
    public void setLabelingJobName(String labelingJobName) {
        this.labelingJobName = labelingJobName;
    }

    /**
     * <p>
     * The name of the labeling job that the work team is assigned to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param labelingJobName <p>
     *            The name of the labeling job that the work team is assigned
     *            to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelingJobForWorkteamSummary withLabelingJobName(String labelingJobName) {
        this.labelingJobName = labelingJobName;
        return this;
    }

    /**
     * <p>
     * A unique identifier for a labeling job. You can use this to refer to a
     * specific labeling job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @return <p>
     *         A unique identifier for a labeling job. You can use this to refer
     *         to a specific labeling job.
     *         </p>
     */
    public String getJobReferenceCode() {
        return jobReferenceCode;
    }

    /**
     * <p>
     * A unique identifier for a labeling job. You can use this to refer to a
     * specific labeling job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param jobReferenceCode <p>
     *            A unique identifier for a labeling job. You can use this to
     *            refer to a specific labeling job.
     *            </p>
     */
    public void setJobReferenceCode(String jobReferenceCode) {
        this.jobReferenceCode = jobReferenceCode;
    }

    /**
     * <p>
     * A unique identifier for a labeling job. You can use this to refer to a
     * specific labeling job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param jobReferenceCode <p>
     *            A unique identifier for a labeling job. You can use this to
     *            refer to a specific labeling job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelingJobForWorkteamSummary withJobReferenceCode(String jobReferenceCode) {
        this.jobReferenceCode = jobReferenceCode;
        return this;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d+$<br/>
     *
     * @return <p/>
     */
    public String getWorkRequesterAccountId() {
        return workRequesterAccountId;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d+$<br/>
     *
     * @param workRequesterAccountId <p/>
     */
    public void setWorkRequesterAccountId(String workRequesterAccountId) {
        this.workRequesterAccountId = workRequesterAccountId;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d+$<br/>
     *
     * @param workRequesterAccountId <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelingJobForWorkteamSummary withWorkRequesterAccountId(String workRequesterAccountId) {
        this.workRequesterAccountId = workRequesterAccountId;
        return this;
    }

    /**
     * <p>
     * The date and time that the labeling job was created.
     * </p>
     *
     * @return <p>
     *         The date and time that the labeling job was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The date and time that the labeling job was created.
     * </p>
     *
     * @param creationTime <p>
     *            The date and time that the labeling job was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time that the labeling job was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The date and time that the labeling job was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelingJobForWorkteamSummary withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * Provides information about the progress of a labeling job.
     * </p>
     *
     * @return <p>
     *         Provides information about the progress of a labeling job.
     *         </p>
     */
    public LabelCountersForWorkteam getLabelCounters() {
        return labelCounters;
    }

    /**
     * <p>
     * Provides information about the progress of a labeling job.
     * </p>
     *
     * @param labelCounters <p>
     *            Provides information about the progress of a labeling job.
     *            </p>
     */
    public void setLabelCounters(LabelCountersForWorkteam labelCounters) {
        this.labelCounters = labelCounters;
    }

    /**
     * <p>
     * Provides information about the progress of a labeling job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labelCounters <p>
     *            Provides information about the progress of a labeling job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelingJobForWorkteamSummary withLabelCounters(LabelCountersForWorkteam labelCounters) {
        this.labelCounters = labelCounters;
        return this;
    }

    /**
     * <p>
     * The configured number of workers per data object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 9<br/>
     *
     * @return <p>
     *         The configured number of workers per data object.
     *         </p>
     */
    public Integer getNumberOfHumanWorkersPerDataObject() {
        return numberOfHumanWorkersPerDataObject;
    }

    /**
     * <p>
     * The configured number of workers per data object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 9<br/>
     *
     * @param numberOfHumanWorkersPerDataObject <p>
     *            The configured number of workers per data object.
     *            </p>
     */
    public void setNumberOfHumanWorkersPerDataObject(Integer numberOfHumanWorkersPerDataObject) {
        this.numberOfHumanWorkersPerDataObject = numberOfHumanWorkersPerDataObject;
    }

    /**
     * <p>
     * The configured number of workers per data object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 9<br/>
     *
     * @param numberOfHumanWorkersPerDataObject <p>
     *            The configured number of workers per data object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelingJobForWorkteamSummary withNumberOfHumanWorkersPerDataObject(
            Integer numberOfHumanWorkersPerDataObject) {
        this.numberOfHumanWorkersPerDataObject = numberOfHumanWorkersPerDataObject;
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
        if (getLabelingJobName() != null)
            sb.append("LabelingJobName: " + getLabelingJobName() + ",");
        if (getJobReferenceCode() != null)
            sb.append("JobReferenceCode: " + getJobReferenceCode() + ",");
        if (getWorkRequesterAccountId() != null)
            sb.append("WorkRequesterAccountId: " + getWorkRequesterAccountId() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getLabelCounters() != null)
            sb.append("LabelCounters: " + getLabelCounters() + ",");
        if (getNumberOfHumanWorkersPerDataObject() != null)
            sb.append("NumberOfHumanWorkersPerDataObject: "
                    + getNumberOfHumanWorkersPerDataObject());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLabelingJobName() == null) ? 0 : getLabelingJobName().hashCode());
        hashCode = prime * hashCode
                + ((getJobReferenceCode() == null) ? 0 : getJobReferenceCode().hashCode());
        hashCode = prime
                * hashCode
                + ((getWorkRequesterAccountId() == null) ? 0 : getWorkRequesterAccountId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getLabelCounters() == null) ? 0 : getLabelCounters().hashCode());
        hashCode = prime
                * hashCode
                + ((getNumberOfHumanWorkersPerDataObject() == null) ? 0
                        : getNumberOfHumanWorkersPerDataObject().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LabelingJobForWorkteamSummary == false)
            return false;
        LabelingJobForWorkteamSummary other = (LabelingJobForWorkteamSummary) obj;

        if (other.getLabelingJobName() == null ^ this.getLabelingJobName() == null)
            return false;
        if (other.getLabelingJobName() != null
                && other.getLabelingJobName().equals(this.getLabelingJobName()) == false)
            return false;
        if (other.getJobReferenceCode() == null ^ this.getJobReferenceCode() == null)
            return false;
        if (other.getJobReferenceCode() != null
                && other.getJobReferenceCode().equals(this.getJobReferenceCode()) == false)
            return false;
        if (other.getWorkRequesterAccountId() == null ^ this.getWorkRequesterAccountId() == null)
            return false;
        if (other.getWorkRequesterAccountId() != null
                && other.getWorkRequesterAccountId().equals(this.getWorkRequesterAccountId()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLabelCounters() == null ^ this.getLabelCounters() == null)
            return false;
        if (other.getLabelCounters() != null
                && other.getLabelCounters().equals(this.getLabelCounters()) == false)
            return false;
        if (other.getNumberOfHumanWorkersPerDataObject() == null
                ^ this.getNumberOfHumanWorkersPerDataObject() == null)
            return false;
        if (other.getNumberOfHumanWorkersPerDataObject() != null
                && other.getNumberOfHumanWorkersPerDataObject().equals(
                        this.getNumberOfHumanWorkersPerDataObject()) == false)
            return false;
        return true;
    }
}
