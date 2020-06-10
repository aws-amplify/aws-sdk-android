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

package com.amazonaws.services.appconfig.model;

import java.io.Serializable;

public class UpdateDeploymentStrategyResult implements Serializable {
    /**
     * <p>
     * The deployment strategy ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     */
    private String id;

    /**
     * <p>
     * The name of the deployment strategy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String name;

    /**
     * <p>
     * The description of the deployment strategy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * Total amount of time the deployment lasted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1440<br/>
     */
    private Integer deploymentDurationInMinutes;

    /**
     * <p>
     * The algorithm used to define how percentage grew over time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LINEAR, EXPONENTIAL
     */
    private String growthType;

    /**
     * <p>
     * The percentage of targets that received a deployed configuration during
     * each interval.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private Float growthFactor;

    /**
     * <p>
     * The amount of time AppConfig monitored for alarms before considering the
     * deployment to be complete and no longer eligible for automatic roll back.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1440<br/>
     */
    private Integer finalBakeTimeInMinutes;

    /**
     * <p>
     * Save the deployment strategy to a Systems Manager (SSM) document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, SSM_DOCUMENT
     */
    private String replicateTo;

    /**
     * <p>
     * The deployment strategy ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @return <p>
     *         The deployment strategy ID.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The deployment strategy ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @param id <p>
     *            The deployment strategy ID.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The deployment strategy ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @param id <p>
     *            The deployment strategy ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDeploymentStrategyResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The name of the deployment strategy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         The name of the deployment strategy.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the deployment strategy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param name <p>
     *            The name of the deployment strategy.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the deployment strategy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param name <p>
     *            The name of the deployment strategy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDeploymentStrategyResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The description of the deployment strategy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return <p>
     *         The description of the deployment strategy.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the deployment strategy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param description <p>
     *            The description of the deployment strategy.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the deployment strategy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param description <p>
     *            The description of the deployment strategy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDeploymentStrategyResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Total amount of time the deployment lasted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1440<br/>
     *
     * @return <p>
     *         Total amount of time the deployment lasted.
     *         </p>
     */
    public Integer getDeploymentDurationInMinutes() {
        return deploymentDurationInMinutes;
    }

    /**
     * <p>
     * Total amount of time the deployment lasted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1440<br/>
     *
     * @param deploymentDurationInMinutes <p>
     *            Total amount of time the deployment lasted.
     *            </p>
     */
    public void setDeploymentDurationInMinutes(Integer deploymentDurationInMinutes) {
        this.deploymentDurationInMinutes = deploymentDurationInMinutes;
    }

    /**
     * <p>
     * Total amount of time the deployment lasted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1440<br/>
     *
     * @param deploymentDurationInMinutes <p>
     *            Total amount of time the deployment lasted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDeploymentStrategyResult withDeploymentDurationInMinutes(
            Integer deploymentDurationInMinutes) {
        this.deploymentDurationInMinutes = deploymentDurationInMinutes;
        return this;
    }

    /**
     * <p>
     * The algorithm used to define how percentage grew over time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LINEAR, EXPONENTIAL
     *
     * @return <p>
     *         The algorithm used to define how percentage grew over time.
     *         </p>
     * @see GrowthType
     */
    public String getGrowthType() {
        return growthType;
    }

    /**
     * <p>
     * The algorithm used to define how percentage grew over time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LINEAR, EXPONENTIAL
     *
     * @param growthType <p>
     *            The algorithm used to define how percentage grew over time.
     *            </p>
     * @see GrowthType
     */
    public void setGrowthType(String growthType) {
        this.growthType = growthType;
    }

    /**
     * <p>
     * The algorithm used to define how percentage grew over time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LINEAR, EXPONENTIAL
     *
     * @param growthType <p>
     *            The algorithm used to define how percentage grew over time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GrowthType
     */
    public UpdateDeploymentStrategyResult withGrowthType(String growthType) {
        this.growthType = growthType;
        return this;
    }

    /**
     * <p>
     * The algorithm used to define how percentage grew over time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LINEAR, EXPONENTIAL
     *
     * @param growthType <p>
     *            The algorithm used to define how percentage grew over time.
     *            </p>
     * @see GrowthType
     */
    public void setGrowthType(GrowthType growthType) {
        this.growthType = growthType.toString();
    }

    /**
     * <p>
     * The algorithm used to define how percentage grew over time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LINEAR, EXPONENTIAL
     *
     * @param growthType <p>
     *            The algorithm used to define how percentage grew over time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GrowthType
     */
    public UpdateDeploymentStrategyResult withGrowthType(GrowthType growthType) {
        this.growthType = growthType.toString();
        return this;
    }

    /**
     * <p>
     * The percentage of targets that received a deployed configuration during
     * each interval.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The percentage of targets that received a deployed configuration
     *         during each interval.
     *         </p>
     */
    public Float getGrowthFactor() {
        return growthFactor;
    }

    /**
     * <p>
     * The percentage of targets that received a deployed configuration during
     * each interval.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param growthFactor <p>
     *            The percentage of targets that received a deployed
     *            configuration during each interval.
     *            </p>
     */
    public void setGrowthFactor(Float growthFactor) {
        this.growthFactor = growthFactor;
    }

    /**
     * <p>
     * The percentage of targets that received a deployed configuration during
     * each interval.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param growthFactor <p>
     *            The percentage of targets that received a deployed
     *            configuration during each interval.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDeploymentStrategyResult withGrowthFactor(Float growthFactor) {
        this.growthFactor = growthFactor;
        return this;
    }

    /**
     * <p>
     * The amount of time AppConfig monitored for alarms before considering the
     * deployment to be complete and no longer eligible for automatic roll back.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1440<br/>
     *
     * @return <p>
     *         The amount of time AppConfig monitored for alarms before
     *         considering the deployment to be complete and no longer eligible
     *         for automatic roll back.
     *         </p>
     */
    public Integer getFinalBakeTimeInMinutes() {
        return finalBakeTimeInMinutes;
    }

    /**
     * <p>
     * The amount of time AppConfig monitored for alarms before considering the
     * deployment to be complete and no longer eligible for automatic roll back.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1440<br/>
     *
     * @param finalBakeTimeInMinutes <p>
     *            The amount of time AppConfig monitored for alarms before
     *            considering the deployment to be complete and no longer
     *            eligible for automatic roll back.
     *            </p>
     */
    public void setFinalBakeTimeInMinutes(Integer finalBakeTimeInMinutes) {
        this.finalBakeTimeInMinutes = finalBakeTimeInMinutes;
    }

    /**
     * <p>
     * The amount of time AppConfig monitored for alarms before considering the
     * deployment to be complete and no longer eligible for automatic roll back.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1440<br/>
     *
     * @param finalBakeTimeInMinutes <p>
     *            The amount of time AppConfig monitored for alarms before
     *            considering the deployment to be complete and no longer
     *            eligible for automatic roll back.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDeploymentStrategyResult withFinalBakeTimeInMinutes(Integer finalBakeTimeInMinutes) {
        this.finalBakeTimeInMinutes = finalBakeTimeInMinutes;
        return this;
    }

    /**
     * <p>
     * Save the deployment strategy to a Systems Manager (SSM) document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, SSM_DOCUMENT
     *
     * @return <p>
     *         Save the deployment strategy to a Systems Manager (SSM) document.
     *         </p>
     * @see ReplicateTo
     */
    public String getReplicateTo() {
        return replicateTo;
    }

    /**
     * <p>
     * Save the deployment strategy to a Systems Manager (SSM) document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, SSM_DOCUMENT
     *
     * @param replicateTo <p>
     *            Save the deployment strategy to a Systems Manager (SSM)
     *            document.
     *            </p>
     * @see ReplicateTo
     */
    public void setReplicateTo(String replicateTo) {
        this.replicateTo = replicateTo;
    }

    /**
     * <p>
     * Save the deployment strategy to a Systems Manager (SSM) document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, SSM_DOCUMENT
     *
     * @param replicateTo <p>
     *            Save the deployment strategy to a Systems Manager (SSM)
     *            document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReplicateTo
     */
    public UpdateDeploymentStrategyResult withReplicateTo(String replicateTo) {
        this.replicateTo = replicateTo;
        return this;
    }

    /**
     * <p>
     * Save the deployment strategy to a Systems Manager (SSM) document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, SSM_DOCUMENT
     *
     * @param replicateTo <p>
     *            Save the deployment strategy to a Systems Manager (SSM)
     *            document.
     *            </p>
     * @see ReplicateTo
     */
    public void setReplicateTo(ReplicateTo replicateTo) {
        this.replicateTo = replicateTo.toString();
    }

    /**
     * <p>
     * Save the deployment strategy to a Systems Manager (SSM) document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, SSM_DOCUMENT
     *
     * @param replicateTo <p>
     *            Save the deployment strategy to a Systems Manager (SSM)
     *            document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReplicateTo
     */
    public UpdateDeploymentStrategyResult withReplicateTo(ReplicateTo replicateTo) {
        this.replicateTo = replicateTo.toString();
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getDeploymentDurationInMinutes() != null)
            sb.append("DeploymentDurationInMinutes: " + getDeploymentDurationInMinutes() + ",");
        if (getGrowthType() != null)
            sb.append("GrowthType: " + getGrowthType() + ",");
        if (getGrowthFactor() != null)
            sb.append("GrowthFactor: " + getGrowthFactor() + ",");
        if (getFinalBakeTimeInMinutes() != null)
            sb.append("FinalBakeTimeInMinutes: " + getFinalBakeTimeInMinutes() + ",");
        if (getReplicateTo() != null)
            sb.append("ReplicateTo: " + getReplicateTo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getDeploymentDurationInMinutes() == null) ? 0
                        : getDeploymentDurationInMinutes().hashCode());
        hashCode = prime * hashCode + ((getGrowthType() == null) ? 0 : getGrowthType().hashCode());
        hashCode = prime * hashCode
                + ((getGrowthFactor() == null) ? 0 : getGrowthFactor().hashCode());
        hashCode = prime
                * hashCode
                + ((getFinalBakeTimeInMinutes() == null) ? 0 : getFinalBakeTimeInMinutes()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getReplicateTo() == null) ? 0 : getReplicateTo().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDeploymentStrategyResult == false)
            return false;
        UpdateDeploymentStrategyResult other = (UpdateDeploymentStrategyResult) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDeploymentDurationInMinutes() == null
                ^ this.getDeploymentDurationInMinutes() == null)
            return false;
        if (other.getDeploymentDurationInMinutes() != null
                && other.getDeploymentDurationInMinutes().equals(
                        this.getDeploymentDurationInMinutes()) == false)
            return false;
        if (other.getGrowthType() == null ^ this.getGrowthType() == null)
            return false;
        if (other.getGrowthType() != null
                && other.getGrowthType().equals(this.getGrowthType()) == false)
            return false;
        if (other.getGrowthFactor() == null ^ this.getGrowthFactor() == null)
            return false;
        if (other.getGrowthFactor() != null
                && other.getGrowthFactor().equals(this.getGrowthFactor()) == false)
            return false;
        if (other.getFinalBakeTimeInMinutes() == null ^ this.getFinalBakeTimeInMinutes() == null)
            return false;
        if (other.getFinalBakeTimeInMinutes() != null
                && other.getFinalBakeTimeInMinutes().equals(this.getFinalBakeTimeInMinutes()) == false)
            return false;
        if (other.getReplicateTo() == null ^ this.getReplicateTo() == null)
            return false;
        if (other.getReplicateTo() != null
                && other.getReplicateTo().equals(this.getReplicateTo()) == false)
            return false;
        return true;
    }
}
