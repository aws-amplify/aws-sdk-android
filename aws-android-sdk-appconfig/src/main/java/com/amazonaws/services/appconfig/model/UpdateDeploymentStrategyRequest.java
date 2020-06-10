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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates a deployment strategy.
 * </p>
 */
public class UpdateDeploymentStrategyRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The deployment strategy ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^[a-z0-9]{4,7}$|^AppConfig\.[A-Za-z0-9]{9,40}$)<br/>
     */
    private String deploymentStrategyId;

    /**
     * <p>
     * A description of the deployment strategy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * Total amount of time for a deployment to last.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1440<br/>
     */
    private Integer deploymentDurationInMinutes;

    /**
     * <p>
     * The amount of time AppConfig monitors for alarms before considering the
     * deployment to be complete and no longer eligible for automatic roll back.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1440<br/>
     */
    private Integer finalBakeTimeInMinutes;

    /**
     * <p>
     * The percentage of targets to receive a deployed configuration during each
     * interval.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private Float growthFactor;

    /**
     * <p>
     * The algorithm used to define how percentage grows over time. AWS
     * AppConfig supports the following growth types:
     * </p>
     * <p>
     * <b>Linear</b>: For this type, AppConfig processes the deployment by
     * increments of the growth factor evenly distributed over the deployment
     * time. For example, a linear deployment that uses a growth factor of 20
     * initially makes the configuration available to 20 percent of the targets.
     * After 1/5th of the deployment time has passed, the system updates the
     * percentage to 40 percent. This continues until 100% of the targets are
     * set to receive the deployed configuration.
     * </p>
     * <p>
     * <b>Exponential</b>: For this type, AppConfig processes the deployment
     * exponentially using the following formula: <code>G*(2^N)</code>. In this
     * formula, <code>G</code> is the growth factor specified by the user and
     * <code>N</code> is the number of steps until the configuration is deployed
     * to all targets. For example, if you specify a growth factor of 2, then
     * the system rolls out the configuration as follows:
     * </p>
     * <p>
     * <code>2*(2^0)</code>
     * </p>
     * <p>
     * <code>2*(2^1)</code>
     * </p>
     * <p>
     * <code>2*(2^2)</code>
     * </p>
     * <p>
     * Expressed numerically, the deployment rolls out as follows: 2% of the
     * targets, 4% of the targets, 8% of the targets, and continues until the
     * configuration has been deployed to all targets.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LINEAR, EXPONENTIAL
     */
    private String growthType;

    /**
     * <p>
     * The deployment strategy ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^[a-z0-9]{4,7}$|^AppConfig\.[A-Za-z0-9]{9,40}$)<br/>
     *
     * @return <p>
     *         The deployment strategy ID.
     *         </p>
     */
    public String getDeploymentStrategyId() {
        return deploymentStrategyId;
    }

    /**
     * <p>
     * The deployment strategy ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^[a-z0-9]{4,7}$|^AppConfig\.[A-Za-z0-9]{9,40}$)<br/>
     *
     * @param deploymentStrategyId <p>
     *            The deployment strategy ID.
     *            </p>
     */
    public void setDeploymentStrategyId(String deploymentStrategyId) {
        this.deploymentStrategyId = deploymentStrategyId;
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
     * <b>Pattern: </b>(^[a-z0-9]{4,7}$|^AppConfig\.[A-Za-z0-9]{9,40}$)<br/>
     *
     * @param deploymentStrategyId <p>
     *            The deployment strategy ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDeploymentStrategyRequest withDeploymentStrategyId(String deploymentStrategyId) {
        this.deploymentStrategyId = deploymentStrategyId;
        return this;
    }

    /**
     * <p>
     * A description of the deployment strategy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return <p>
     *         A description of the deployment strategy.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the deployment strategy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param description <p>
     *            A description of the deployment strategy.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the deployment strategy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param description <p>
     *            A description of the deployment strategy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDeploymentStrategyRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Total amount of time for a deployment to last.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1440<br/>
     *
     * @return <p>
     *         Total amount of time for a deployment to last.
     *         </p>
     */
    public Integer getDeploymentDurationInMinutes() {
        return deploymentDurationInMinutes;
    }

    /**
     * <p>
     * Total amount of time for a deployment to last.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1440<br/>
     *
     * @param deploymentDurationInMinutes <p>
     *            Total amount of time for a deployment to last.
     *            </p>
     */
    public void setDeploymentDurationInMinutes(Integer deploymentDurationInMinutes) {
        this.deploymentDurationInMinutes = deploymentDurationInMinutes;
    }

    /**
     * <p>
     * Total amount of time for a deployment to last.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1440<br/>
     *
     * @param deploymentDurationInMinutes <p>
     *            Total amount of time for a deployment to last.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDeploymentStrategyRequest withDeploymentDurationInMinutes(
            Integer deploymentDurationInMinutes) {
        this.deploymentDurationInMinutes = deploymentDurationInMinutes;
        return this;
    }

    /**
     * <p>
     * The amount of time AppConfig monitors for alarms before considering the
     * deployment to be complete and no longer eligible for automatic roll back.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1440<br/>
     *
     * @return <p>
     *         The amount of time AppConfig monitors for alarms before
     *         considering the deployment to be complete and no longer eligible
     *         for automatic roll back.
     *         </p>
     */
    public Integer getFinalBakeTimeInMinutes() {
        return finalBakeTimeInMinutes;
    }

    /**
     * <p>
     * The amount of time AppConfig monitors for alarms before considering the
     * deployment to be complete and no longer eligible for automatic roll back.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1440<br/>
     *
     * @param finalBakeTimeInMinutes <p>
     *            The amount of time AppConfig monitors for alarms before
     *            considering the deployment to be complete and no longer
     *            eligible for automatic roll back.
     *            </p>
     */
    public void setFinalBakeTimeInMinutes(Integer finalBakeTimeInMinutes) {
        this.finalBakeTimeInMinutes = finalBakeTimeInMinutes;
    }

    /**
     * <p>
     * The amount of time AppConfig monitors for alarms before considering the
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
     *            The amount of time AppConfig monitors for alarms before
     *            considering the deployment to be complete and no longer
     *            eligible for automatic roll back.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDeploymentStrategyRequest withFinalBakeTimeInMinutes(Integer finalBakeTimeInMinutes) {
        this.finalBakeTimeInMinutes = finalBakeTimeInMinutes;
        return this;
    }

    /**
     * <p>
     * The percentage of targets to receive a deployed configuration during each
     * interval.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The percentage of targets to receive a deployed configuration
     *         during each interval.
     *         </p>
     */
    public Float getGrowthFactor() {
        return growthFactor;
    }

    /**
     * <p>
     * The percentage of targets to receive a deployed configuration during each
     * interval.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param growthFactor <p>
     *            The percentage of targets to receive a deployed configuration
     *            during each interval.
     *            </p>
     */
    public void setGrowthFactor(Float growthFactor) {
        this.growthFactor = growthFactor;
    }

    /**
     * <p>
     * The percentage of targets to receive a deployed configuration during each
     * interval.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param growthFactor <p>
     *            The percentage of targets to receive a deployed configuration
     *            during each interval.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDeploymentStrategyRequest withGrowthFactor(Float growthFactor) {
        this.growthFactor = growthFactor;
        return this;
    }

    /**
     * <p>
     * The algorithm used to define how percentage grows over time. AWS
     * AppConfig supports the following growth types:
     * </p>
     * <p>
     * <b>Linear</b>: For this type, AppConfig processes the deployment by
     * increments of the growth factor evenly distributed over the deployment
     * time. For example, a linear deployment that uses a growth factor of 20
     * initially makes the configuration available to 20 percent of the targets.
     * After 1/5th of the deployment time has passed, the system updates the
     * percentage to 40 percent. This continues until 100% of the targets are
     * set to receive the deployed configuration.
     * </p>
     * <p>
     * <b>Exponential</b>: For this type, AppConfig processes the deployment
     * exponentially using the following formula: <code>G*(2^N)</code>. In this
     * formula, <code>G</code> is the growth factor specified by the user and
     * <code>N</code> is the number of steps until the configuration is deployed
     * to all targets. For example, if you specify a growth factor of 2, then
     * the system rolls out the configuration as follows:
     * </p>
     * <p>
     * <code>2*(2^0)</code>
     * </p>
     * <p>
     * <code>2*(2^1)</code>
     * </p>
     * <p>
     * <code>2*(2^2)</code>
     * </p>
     * <p>
     * Expressed numerically, the deployment rolls out as follows: 2% of the
     * targets, 4% of the targets, 8% of the targets, and continues until the
     * configuration has been deployed to all targets.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LINEAR, EXPONENTIAL
     *
     * @return <p>
     *         The algorithm used to define how percentage grows over time. AWS
     *         AppConfig supports the following growth types:
     *         </p>
     *         <p>
     *         <b>Linear</b>: For this type, AppConfig processes the deployment
     *         by increments of the growth factor evenly distributed over the
     *         deployment time. For example, a linear deployment that uses a
     *         growth factor of 20 initially makes the configuration available
     *         to 20 percent of the targets. After 1/5th of the deployment time
     *         has passed, the system updates the percentage to 40 percent. This
     *         continues until 100% of the targets are set to receive the
     *         deployed configuration.
     *         </p>
     *         <p>
     *         <b>Exponential</b>: For this type, AppConfig processes the
     *         deployment exponentially using the following formula:
     *         <code>G*(2^N)</code>. In this formula, <code>G</code> is the
     *         growth factor specified by the user and <code>N</code> is the
     *         number of steps until the configuration is deployed to all
     *         targets. For example, if you specify a growth factor of 2, then
     *         the system rolls out the configuration as follows:
     *         </p>
     *         <p>
     *         <code>2*(2^0)</code>
     *         </p>
     *         <p>
     *         <code>2*(2^1)</code>
     *         </p>
     *         <p>
     *         <code>2*(2^2)</code>
     *         </p>
     *         <p>
     *         Expressed numerically, the deployment rolls out as follows: 2% of
     *         the targets, 4% of the targets, 8% of the targets, and continues
     *         until the configuration has been deployed to all targets.
     *         </p>
     * @see GrowthType
     */
    public String getGrowthType() {
        return growthType;
    }

    /**
     * <p>
     * The algorithm used to define how percentage grows over time. AWS
     * AppConfig supports the following growth types:
     * </p>
     * <p>
     * <b>Linear</b>: For this type, AppConfig processes the deployment by
     * increments of the growth factor evenly distributed over the deployment
     * time. For example, a linear deployment that uses a growth factor of 20
     * initially makes the configuration available to 20 percent of the targets.
     * After 1/5th of the deployment time has passed, the system updates the
     * percentage to 40 percent. This continues until 100% of the targets are
     * set to receive the deployed configuration.
     * </p>
     * <p>
     * <b>Exponential</b>: For this type, AppConfig processes the deployment
     * exponentially using the following formula: <code>G*(2^N)</code>. In this
     * formula, <code>G</code> is the growth factor specified by the user and
     * <code>N</code> is the number of steps until the configuration is deployed
     * to all targets. For example, if you specify a growth factor of 2, then
     * the system rolls out the configuration as follows:
     * </p>
     * <p>
     * <code>2*(2^0)</code>
     * </p>
     * <p>
     * <code>2*(2^1)</code>
     * </p>
     * <p>
     * <code>2*(2^2)</code>
     * </p>
     * <p>
     * Expressed numerically, the deployment rolls out as follows: 2% of the
     * targets, 4% of the targets, 8% of the targets, and continues until the
     * configuration has been deployed to all targets.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LINEAR, EXPONENTIAL
     *
     * @param growthType <p>
     *            The algorithm used to define how percentage grows over time.
     *            AWS AppConfig supports the following growth types:
     *            </p>
     *            <p>
     *            <b>Linear</b>: For this type, AppConfig processes the
     *            deployment by increments of the growth factor evenly
     *            distributed over the deployment time. For example, a linear
     *            deployment that uses a growth factor of 20 initially makes the
     *            configuration available to 20 percent of the targets. After
     *            1/5th of the deployment time has passed, the system updates
     *            the percentage to 40 percent. This continues until 100% of the
     *            targets are set to receive the deployed configuration.
     *            </p>
     *            <p>
     *            <b>Exponential</b>: For this type, AppConfig processes the
     *            deployment exponentially using the following formula:
     *            <code>G*(2^N)</code>. In this formula, <code>G</code> is the
     *            growth factor specified by the user and <code>N</code> is the
     *            number of steps until the configuration is deployed to all
     *            targets. For example, if you specify a growth factor of 2,
     *            then the system rolls out the configuration as follows:
     *            </p>
     *            <p>
     *            <code>2*(2^0)</code>
     *            </p>
     *            <p>
     *            <code>2*(2^1)</code>
     *            </p>
     *            <p>
     *            <code>2*(2^2)</code>
     *            </p>
     *            <p>
     *            Expressed numerically, the deployment rolls out as follows: 2%
     *            of the targets, 4% of the targets, 8% of the targets, and
     *            continues until the configuration has been deployed to all
     *            targets.
     *            </p>
     * @see GrowthType
     */
    public void setGrowthType(String growthType) {
        this.growthType = growthType;
    }

    /**
     * <p>
     * The algorithm used to define how percentage grows over time. AWS
     * AppConfig supports the following growth types:
     * </p>
     * <p>
     * <b>Linear</b>: For this type, AppConfig processes the deployment by
     * increments of the growth factor evenly distributed over the deployment
     * time. For example, a linear deployment that uses a growth factor of 20
     * initially makes the configuration available to 20 percent of the targets.
     * After 1/5th of the deployment time has passed, the system updates the
     * percentage to 40 percent. This continues until 100% of the targets are
     * set to receive the deployed configuration.
     * </p>
     * <p>
     * <b>Exponential</b>: For this type, AppConfig processes the deployment
     * exponentially using the following formula: <code>G*(2^N)</code>. In this
     * formula, <code>G</code> is the growth factor specified by the user and
     * <code>N</code> is the number of steps until the configuration is deployed
     * to all targets. For example, if you specify a growth factor of 2, then
     * the system rolls out the configuration as follows:
     * </p>
     * <p>
     * <code>2*(2^0)</code>
     * </p>
     * <p>
     * <code>2*(2^1)</code>
     * </p>
     * <p>
     * <code>2*(2^2)</code>
     * </p>
     * <p>
     * Expressed numerically, the deployment rolls out as follows: 2% of the
     * targets, 4% of the targets, 8% of the targets, and continues until the
     * configuration has been deployed to all targets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LINEAR, EXPONENTIAL
     *
     * @param growthType <p>
     *            The algorithm used to define how percentage grows over time.
     *            AWS AppConfig supports the following growth types:
     *            </p>
     *            <p>
     *            <b>Linear</b>: For this type, AppConfig processes the
     *            deployment by increments of the growth factor evenly
     *            distributed over the deployment time. For example, a linear
     *            deployment that uses a growth factor of 20 initially makes the
     *            configuration available to 20 percent of the targets. After
     *            1/5th of the deployment time has passed, the system updates
     *            the percentage to 40 percent. This continues until 100% of the
     *            targets are set to receive the deployed configuration.
     *            </p>
     *            <p>
     *            <b>Exponential</b>: For this type, AppConfig processes the
     *            deployment exponentially using the following formula:
     *            <code>G*(2^N)</code>. In this formula, <code>G</code> is the
     *            growth factor specified by the user and <code>N</code> is the
     *            number of steps until the configuration is deployed to all
     *            targets. For example, if you specify a growth factor of 2,
     *            then the system rolls out the configuration as follows:
     *            </p>
     *            <p>
     *            <code>2*(2^0)</code>
     *            </p>
     *            <p>
     *            <code>2*(2^1)</code>
     *            </p>
     *            <p>
     *            <code>2*(2^2)</code>
     *            </p>
     *            <p>
     *            Expressed numerically, the deployment rolls out as follows: 2%
     *            of the targets, 4% of the targets, 8% of the targets, and
     *            continues until the configuration has been deployed to all
     *            targets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GrowthType
     */
    public UpdateDeploymentStrategyRequest withGrowthType(String growthType) {
        this.growthType = growthType;
        return this;
    }

    /**
     * <p>
     * The algorithm used to define how percentage grows over time. AWS
     * AppConfig supports the following growth types:
     * </p>
     * <p>
     * <b>Linear</b>: For this type, AppConfig processes the deployment by
     * increments of the growth factor evenly distributed over the deployment
     * time. For example, a linear deployment that uses a growth factor of 20
     * initially makes the configuration available to 20 percent of the targets.
     * After 1/5th of the deployment time has passed, the system updates the
     * percentage to 40 percent. This continues until 100% of the targets are
     * set to receive the deployed configuration.
     * </p>
     * <p>
     * <b>Exponential</b>: For this type, AppConfig processes the deployment
     * exponentially using the following formula: <code>G*(2^N)</code>. In this
     * formula, <code>G</code> is the growth factor specified by the user and
     * <code>N</code> is the number of steps until the configuration is deployed
     * to all targets. For example, if you specify a growth factor of 2, then
     * the system rolls out the configuration as follows:
     * </p>
     * <p>
     * <code>2*(2^0)</code>
     * </p>
     * <p>
     * <code>2*(2^1)</code>
     * </p>
     * <p>
     * <code>2*(2^2)</code>
     * </p>
     * <p>
     * Expressed numerically, the deployment rolls out as follows: 2% of the
     * targets, 4% of the targets, 8% of the targets, and continues until the
     * configuration has been deployed to all targets.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LINEAR, EXPONENTIAL
     *
     * @param growthType <p>
     *            The algorithm used to define how percentage grows over time.
     *            AWS AppConfig supports the following growth types:
     *            </p>
     *            <p>
     *            <b>Linear</b>: For this type, AppConfig processes the
     *            deployment by increments of the growth factor evenly
     *            distributed over the deployment time. For example, a linear
     *            deployment that uses a growth factor of 20 initially makes the
     *            configuration available to 20 percent of the targets. After
     *            1/5th of the deployment time has passed, the system updates
     *            the percentage to 40 percent. This continues until 100% of the
     *            targets are set to receive the deployed configuration.
     *            </p>
     *            <p>
     *            <b>Exponential</b>: For this type, AppConfig processes the
     *            deployment exponentially using the following formula:
     *            <code>G*(2^N)</code>. In this formula, <code>G</code> is the
     *            growth factor specified by the user and <code>N</code> is the
     *            number of steps until the configuration is deployed to all
     *            targets. For example, if you specify a growth factor of 2,
     *            then the system rolls out the configuration as follows:
     *            </p>
     *            <p>
     *            <code>2*(2^0)</code>
     *            </p>
     *            <p>
     *            <code>2*(2^1)</code>
     *            </p>
     *            <p>
     *            <code>2*(2^2)</code>
     *            </p>
     *            <p>
     *            Expressed numerically, the deployment rolls out as follows: 2%
     *            of the targets, 4% of the targets, 8% of the targets, and
     *            continues until the configuration has been deployed to all
     *            targets.
     *            </p>
     * @see GrowthType
     */
    public void setGrowthType(GrowthType growthType) {
        this.growthType = growthType.toString();
    }

    /**
     * <p>
     * The algorithm used to define how percentage grows over time. AWS
     * AppConfig supports the following growth types:
     * </p>
     * <p>
     * <b>Linear</b>: For this type, AppConfig processes the deployment by
     * increments of the growth factor evenly distributed over the deployment
     * time. For example, a linear deployment that uses a growth factor of 20
     * initially makes the configuration available to 20 percent of the targets.
     * After 1/5th of the deployment time has passed, the system updates the
     * percentage to 40 percent. This continues until 100% of the targets are
     * set to receive the deployed configuration.
     * </p>
     * <p>
     * <b>Exponential</b>: For this type, AppConfig processes the deployment
     * exponentially using the following formula: <code>G*(2^N)</code>. In this
     * formula, <code>G</code> is the growth factor specified by the user and
     * <code>N</code> is the number of steps until the configuration is deployed
     * to all targets. For example, if you specify a growth factor of 2, then
     * the system rolls out the configuration as follows:
     * </p>
     * <p>
     * <code>2*(2^0)</code>
     * </p>
     * <p>
     * <code>2*(2^1)</code>
     * </p>
     * <p>
     * <code>2*(2^2)</code>
     * </p>
     * <p>
     * Expressed numerically, the deployment rolls out as follows: 2% of the
     * targets, 4% of the targets, 8% of the targets, and continues until the
     * configuration has been deployed to all targets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LINEAR, EXPONENTIAL
     *
     * @param growthType <p>
     *            The algorithm used to define how percentage grows over time.
     *            AWS AppConfig supports the following growth types:
     *            </p>
     *            <p>
     *            <b>Linear</b>: For this type, AppConfig processes the
     *            deployment by increments of the growth factor evenly
     *            distributed over the deployment time. For example, a linear
     *            deployment that uses a growth factor of 20 initially makes the
     *            configuration available to 20 percent of the targets. After
     *            1/5th of the deployment time has passed, the system updates
     *            the percentage to 40 percent. This continues until 100% of the
     *            targets are set to receive the deployed configuration.
     *            </p>
     *            <p>
     *            <b>Exponential</b>: For this type, AppConfig processes the
     *            deployment exponentially using the following formula:
     *            <code>G*(2^N)</code>. In this formula, <code>G</code> is the
     *            growth factor specified by the user and <code>N</code> is the
     *            number of steps until the configuration is deployed to all
     *            targets. For example, if you specify a growth factor of 2,
     *            then the system rolls out the configuration as follows:
     *            </p>
     *            <p>
     *            <code>2*(2^0)</code>
     *            </p>
     *            <p>
     *            <code>2*(2^1)</code>
     *            </p>
     *            <p>
     *            <code>2*(2^2)</code>
     *            </p>
     *            <p>
     *            Expressed numerically, the deployment rolls out as follows: 2%
     *            of the targets, 4% of the targets, 8% of the targets, and
     *            continues until the configuration has been deployed to all
     *            targets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GrowthType
     */
    public UpdateDeploymentStrategyRequest withGrowthType(GrowthType growthType) {
        this.growthType = growthType.toString();
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
        if (getDeploymentStrategyId() != null)
            sb.append("DeploymentStrategyId: " + getDeploymentStrategyId() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getDeploymentDurationInMinutes() != null)
            sb.append("DeploymentDurationInMinutes: " + getDeploymentDurationInMinutes() + ",");
        if (getFinalBakeTimeInMinutes() != null)
            sb.append("FinalBakeTimeInMinutes: " + getFinalBakeTimeInMinutes() + ",");
        if (getGrowthFactor() != null)
            sb.append("GrowthFactor: " + getGrowthFactor() + ",");
        if (getGrowthType() != null)
            sb.append("GrowthType: " + getGrowthType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDeploymentStrategyId() == null) ? 0 : getDeploymentStrategyId().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getDeploymentDurationInMinutes() == null) ? 0
                        : getDeploymentDurationInMinutes().hashCode());
        hashCode = prime
                * hashCode
                + ((getFinalBakeTimeInMinutes() == null) ? 0 : getFinalBakeTimeInMinutes()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getGrowthFactor() == null) ? 0 : getGrowthFactor().hashCode());
        hashCode = prime * hashCode + ((getGrowthType() == null) ? 0 : getGrowthType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDeploymentStrategyRequest == false)
            return false;
        UpdateDeploymentStrategyRequest other = (UpdateDeploymentStrategyRequest) obj;

        if (other.getDeploymentStrategyId() == null ^ this.getDeploymentStrategyId() == null)
            return false;
        if (other.getDeploymentStrategyId() != null
                && other.getDeploymentStrategyId().equals(this.getDeploymentStrategyId()) == false)
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
        if (other.getFinalBakeTimeInMinutes() == null ^ this.getFinalBakeTimeInMinutes() == null)
            return false;
        if (other.getFinalBakeTimeInMinutes() != null
                && other.getFinalBakeTimeInMinutes().equals(this.getFinalBakeTimeInMinutes()) == false)
            return false;
        if (other.getGrowthFactor() == null ^ this.getGrowthFactor() == null)
            return false;
        if (other.getGrowthFactor() != null
                && other.getGrowthFactor().equals(this.getGrowthFactor()) == false)
            return false;
        if (other.getGrowthType() == null ^ this.getGrowthType() == null)
            return false;
        if (other.getGrowthType() != null
                && other.getGrowthType().equals(this.getGrowthType()) == false)
            return false;
        return true;
    }
}
