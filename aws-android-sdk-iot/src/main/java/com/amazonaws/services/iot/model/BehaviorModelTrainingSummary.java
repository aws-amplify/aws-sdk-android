/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The summary of an ML Detect behavior model.
 * </p>
 */
public class BehaviorModelTrainingSummary implements Serializable {
    /**
     * <p>
     * The name of the security profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String securityProfileName;

    /**
     * <p>
     * The name of the behavior.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String behaviorName;

    /**
     * <p>
     * The date a training model started collecting data.
     * </p>
     */
    private java.util.Date trainingDataCollectionStartDate;

    /**
     * <p>
     * The status of the behavior model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_BUILD, ACTIVE, EXPIRED
     */
    private String modelStatus;

    /**
     * <p>
     * The percentage of datapoints collected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     */
    private Double datapointsCollectionPercentage;

    /**
     * <p>
     * The date the model was last refreshed.
     * </p>
     */
    private java.util.Date lastModelRefreshDate;

    /**
     * <p>
     * The name of the security profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The name of the security profile.
     *         </p>
     */
    public String getSecurityProfileName() {
        return securityProfileName;
    }

    /**
     * <p>
     * The name of the security profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param securityProfileName <p>
     *            The name of the security profile.
     *            </p>
     */
    public void setSecurityProfileName(String securityProfileName) {
        this.securityProfileName = securityProfileName;
    }

    /**
     * <p>
     * The name of the security profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param securityProfileName <p>
     *            The name of the security profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BehaviorModelTrainingSummary withSecurityProfileName(String securityProfileName) {
        this.securityProfileName = securityProfileName;
        return this;
    }

    /**
     * <p>
     * The name of the behavior.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The name of the behavior.
     *         </p>
     */
    public String getBehaviorName() {
        return behaviorName;
    }

    /**
     * <p>
     * The name of the behavior.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param behaviorName <p>
     *            The name of the behavior.
     *            </p>
     */
    public void setBehaviorName(String behaviorName) {
        this.behaviorName = behaviorName;
    }

    /**
     * <p>
     * The name of the behavior.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param behaviorName <p>
     *            The name of the behavior.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BehaviorModelTrainingSummary withBehaviorName(String behaviorName) {
        this.behaviorName = behaviorName;
        return this;
    }

    /**
     * <p>
     * The date a training model started collecting data.
     * </p>
     *
     * @return <p>
     *         The date a training model started collecting data.
     *         </p>
     */
    public java.util.Date getTrainingDataCollectionStartDate() {
        return trainingDataCollectionStartDate;
    }

    /**
     * <p>
     * The date a training model started collecting data.
     * </p>
     *
     * @param trainingDataCollectionStartDate <p>
     *            The date a training model started collecting data.
     *            </p>
     */
    public void setTrainingDataCollectionStartDate(java.util.Date trainingDataCollectionStartDate) {
        this.trainingDataCollectionStartDate = trainingDataCollectionStartDate;
    }

    /**
     * <p>
     * The date a training model started collecting data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trainingDataCollectionStartDate <p>
     *            The date a training model started collecting data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BehaviorModelTrainingSummary withTrainingDataCollectionStartDate(
            java.util.Date trainingDataCollectionStartDate) {
        this.trainingDataCollectionStartDate = trainingDataCollectionStartDate;
        return this;
    }

    /**
     * <p>
     * The status of the behavior model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_BUILD, ACTIVE, EXPIRED
     *
     * @return <p>
     *         The status of the behavior model.
     *         </p>
     * @see ModelStatus
     */
    public String getModelStatus() {
        return modelStatus;
    }

    /**
     * <p>
     * The status of the behavior model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_BUILD, ACTIVE, EXPIRED
     *
     * @param modelStatus <p>
     *            The status of the behavior model.
     *            </p>
     * @see ModelStatus
     */
    public void setModelStatus(String modelStatus) {
        this.modelStatus = modelStatus;
    }

    /**
     * <p>
     * The status of the behavior model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_BUILD, ACTIVE, EXPIRED
     *
     * @param modelStatus <p>
     *            The status of the behavior model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ModelStatus
     */
    public BehaviorModelTrainingSummary withModelStatus(String modelStatus) {
        this.modelStatus = modelStatus;
        return this;
    }

    /**
     * <p>
     * The status of the behavior model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_BUILD, ACTIVE, EXPIRED
     *
     * @param modelStatus <p>
     *            The status of the behavior model.
     *            </p>
     * @see ModelStatus
     */
    public void setModelStatus(ModelStatus modelStatus) {
        this.modelStatus = modelStatus.toString();
    }

    /**
     * <p>
     * The status of the behavior model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_BUILD, ACTIVE, EXPIRED
     *
     * @param modelStatus <p>
     *            The status of the behavior model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ModelStatus
     */
    public BehaviorModelTrainingSummary withModelStatus(ModelStatus modelStatus) {
        this.modelStatus = modelStatus.toString();
        return this;
    }

    /**
     * <p>
     * The percentage of datapoints collected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @return <p>
     *         The percentage of datapoints collected.
     *         </p>
     */
    public Double getDatapointsCollectionPercentage() {
        return datapointsCollectionPercentage;
    }

    /**
     * <p>
     * The percentage of datapoints collected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param datapointsCollectionPercentage <p>
     *            The percentage of datapoints collected.
     *            </p>
     */
    public void setDatapointsCollectionPercentage(Double datapointsCollectionPercentage) {
        this.datapointsCollectionPercentage = datapointsCollectionPercentage;
    }

    /**
     * <p>
     * The percentage of datapoints collected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param datapointsCollectionPercentage <p>
     *            The percentage of datapoints collected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BehaviorModelTrainingSummary withDatapointsCollectionPercentage(
            Double datapointsCollectionPercentage) {
        this.datapointsCollectionPercentage = datapointsCollectionPercentage;
        return this;
    }

    /**
     * <p>
     * The date the model was last refreshed.
     * </p>
     *
     * @return <p>
     *         The date the model was last refreshed.
     *         </p>
     */
    public java.util.Date getLastModelRefreshDate() {
        return lastModelRefreshDate;
    }

    /**
     * <p>
     * The date the model was last refreshed.
     * </p>
     *
     * @param lastModelRefreshDate <p>
     *            The date the model was last refreshed.
     *            </p>
     */
    public void setLastModelRefreshDate(java.util.Date lastModelRefreshDate) {
        this.lastModelRefreshDate = lastModelRefreshDate;
    }

    /**
     * <p>
     * The date the model was last refreshed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModelRefreshDate <p>
     *            The date the model was last refreshed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BehaviorModelTrainingSummary withLastModelRefreshDate(java.util.Date lastModelRefreshDate) {
        this.lastModelRefreshDate = lastModelRefreshDate;
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
        if (getSecurityProfileName() != null)
            sb.append("securityProfileName: " + getSecurityProfileName() + ",");
        if (getBehaviorName() != null)
            sb.append("behaviorName: " + getBehaviorName() + ",");
        if (getTrainingDataCollectionStartDate() != null)
            sb.append("trainingDataCollectionStartDate: " + getTrainingDataCollectionStartDate()
                    + ",");
        if (getModelStatus() != null)
            sb.append("modelStatus: " + getModelStatus() + ",");
        if (getDatapointsCollectionPercentage() != null)
            sb.append("datapointsCollectionPercentage: " + getDatapointsCollectionPercentage()
                    + ",");
        if (getLastModelRefreshDate() != null)
            sb.append("lastModelRefreshDate: " + getLastModelRefreshDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSecurityProfileName() == null) ? 0 : getSecurityProfileName().hashCode());
        hashCode = prime * hashCode
                + ((getBehaviorName() == null) ? 0 : getBehaviorName().hashCode());
        hashCode = prime
                * hashCode
                + ((getTrainingDataCollectionStartDate() == null) ? 0
                        : getTrainingDataCollectionStartDate().hashCode());
        hashCode = prime * hashCode
                + ((getModelStatus() == null) ? 0 : getModelStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getDatapointsCollectionPercentage() == null) ? 0
                        : getDatapointsCollectionPercentage().hashCode());
        hashCode = prime * hashCode
                + ((getLastModelRefreshDate() == null) ? 0 : getLastModelRefreshDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BehaviorModelTrainingSummary == false)
            return false;
        BehaviorModelTrainingSummary other = (BehaviorModelTrainingSummary) obj;

        if (other.getSecurityProfileName() == null ^ this.getSecurityProfileName() == null)
            return false;
        if (other.getSecurityProfileName() != null
                && other.getSecurityProfileName().equals(this.getSecurityProfileName()) == false)
            return false;
        if (other.getBehaviorName() == null ^ this.getBehaviorName() == null)
            return false;
        if (other.getBehaviorName() != null
                && other.getBehaviorName().equals(this.getBehaviorName()) == false)
            return false;
        if (other.getTrainingDataCollectionStartDate() == null
                ^ this.getTrainingDataCollectionStartDate() == null)
            return false;
        if (other.getTrainingDataCollectionStartDate() != null
                && other.getTrainingDataCollectionStartDate().equals(
                        this.getTrainingDataCollectionStartDate()) == false)
            return false;
        if (other.getModelStatus() == null ^ this.getModelStatus() == null)
            return false;
        if (other.getModelStatus() != null
                && other.getModelStatus().equals(this.getModelStatus()) == false)
            return false;
        if (other.getDatapointsCollectionPercentage() == null
                ^ this.getDatapointsCollectionPercentage() == null)
            return false;
        if (other.getDatapointsCollectionPercentage() != null
                && other.getDatapointsCollectionPercentage().equals(
                        this.getDatapointsCollectionPercentage()) == false)
            return false;
        if (other.getLastModelRefreshDate() == null ^ this.getLastModelRefreshDate() == null)
            return false;
        if (other.getLastModelRefreshDate() != null
                && other.getLastModelRefreshDate().equals(this.getLastModelRefreshDate()) == false)
            return false;
        return true;
    }
}
