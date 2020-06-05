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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

/**
 * <p>
 * Detailed health information about an Amazon EC2 instance in your Elastic
 * Beanstalk environment.
 * </p>
 */
public class SingleInstanceHealth implements Serializable {
    /**
     * <p>
     * The ID of the Amazon EC2 instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String instanceId;

    /**
     * <p>
     * Returns the health status of the specified instance. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     * >Health Colors and Statuses</a>.
     * </p>
     */
    private String healthStatus;

    /**
     * <p>
     * Represents the color indicator that gives you information about the
     * health of the EC2 instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     * >Health Colors and Statuses</a>.
     * </p>
     */
    private String color;

    /**
     * <p>
     * Represents the causes, which provide more information about the current
     * health status.
     * </p>
     */
    private java.util.List<String> causes;

    /**
     * <p>
     * The time at which the EC2 instance was launched.
     * </p>
     */
    private java.util.Date launchedAt;

    /**
     * <p>
     * Request metrics from your application.
     * </p>
     */
    private ApplicationMetrics applicationMetrics;

    /**
     * <p>
     * Operating system metrics from the instance.
     * </p>
     */
    private SystemStatus system;

    /**
     * <p>
     * Information about the most recent deployment to an instance.
     * </p>
     */
    private Deployment deployment;

    /**
     * <p>
     * The availability zone in which the instance runs.
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * The instance's type.
     * </p>
     */
    private String instanceType;

    /**
     * <p>
     * The ID of the Amazon EC2 instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The ID of the Amazon EC2 instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The ID of the Amazon EC2 instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param instanceId <p>
     *            The ID of the Amazon EC2 instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the Amazon EC2 instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param instanceId <p>
     *            The ID of the Amazon EC2 instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SingleInstanceHealth withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * Returns the health status of the specified instance. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     * >Health Colors and Statuses</a>.
     * </p>
     *
     * @return <p>
     *         Returns the health status of the specified instance. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     *         >Health Colors and Statuses</a>.
     *         </p>
     */
    public String getHealthStatus() {
        return healthStatus;
    }

    /**
     * <p>
     * Returns the health status of the specified instance. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     * >Health Colors and Statuses</a>.
     * </p>
     *
     * @param healthStatus <p>
     *            Returns the health status of the specified instance. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     *            >Health Colors and Statuses</a>.
     *            </p>
     */
    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    /**
     * <p>
     * Returns the health status of the specified instance. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     * >Health Colors and Statuses</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param healthStatus <p>
     *            Returns the health status of the specified instance. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     *            >Health Colors and Statuses</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SingleInstanceHealth withHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }

    /**
     * <p>
     * Represents the color indicator that gives you information about the
     * health of the EC2 instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     * >Health Colors and Statuses</a>.
     * </p>
     *
     * @return <p>
     *         Represents the color indicator that gives you information about
     *         the health of the EC2 instance. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     *         >Health Colors and Statuses</a>.
     *         </p>
     */
    public String getColor() {
        return color;
    }

    /**
     * <p>
     * Represents the color indicator that gives you information about the
     * health of the EC2 instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     * >Health Colors and Statuses</a>.
     * </p>
     *
     * @param color <p>
     *            Represents the color indicator that gives you information
     *            about the health of the EC2 instance. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     *            >Health Colors and Statuses</a>.
     *            </p>
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * <p>
     * Represents the color indicator that gives you information about the
     * health of the EC2 instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     * >Health Colors and Statuses</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param color <p>
     *            Represents the color indicator that gives you information
     *            about the health of the EC2 instance. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     *            >Health Colors and Statuses</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SingleInstanceHealth withColor(String color) {
        this.color = color;
        return this;
    }

    /**
     * <p>
     * Represents the causes, which provide more information about the current
     * health status.
     * </p>
     *
     * @return <p>
     *         Represents the causes, which provide more information about the
     *         current health status.
     *         </p>
     */
    public java.util.List<String> getCauses() {
        return causes;
    }

    /**
     * <p>
     * Represents the causes, which provide more information about the current
     * health status.
     * </p>
     *
     * @param causes <p>
     *            Represents the causes, which provide more information about
     *            the current health status.
     *            </p>
     */
    public void setCauses(java.util.Collection<String> causes) {
        if (causes == null) {
            this.causes = null;
            return;
        }

        this.causes = new java.util.ArrayList<String>(causes);
    }

    /**
     * <p>
     * Represents the causes, which provide more information about the current
     * health status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param causes <p>
     *            Represents the causes, which provide more information about
     *            the current health status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SingleInstanceHealth withCauses(String... causes) {
        if (getCauses() == null) {
            this.causes = new java.util.ArrayList<String>(causes.length);
        }
        for (String value : causes) {
            this.causes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Represents the causes, which provide more information about the current
     * health status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param causes <p>
     *            Represents the causes, which provide more information about
     *            the current health status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SingleInstanceHealth withCauses(java.util.Collection<String> causes) {
        setCauses(causes);
        return this;
    }

    /**
     * <p>
     * The time at which the EC2 instance was launched.
     * </p>
     *
     * @return <p>
     *         The time at which the EC2 instance was launched.
     *         </p>
     */
    public java.util.Date getLaunchedAt() {
        return launchedAt;
    }

    /**
     * <p>
     * The time at which the EC2 instance was launched.
     * </p>
     *
     * @param launchedAt <p>
     *            The time at which the EC2 instance was launched.
     *            </p>
     */
    public void setLaunchedAt(java.util.Date launchedAt) {
        this.launchedAt = launchedAt;
    }

    /**
     * <p>
     * The time at which the EC2 instance was launched.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchedAt <p>
     *            The time at which the EC2 instance was launched.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SingleInstanceHealth withLaunchedAt(java.util.Date launchedAt) {
        this.launchedAt = launchedAt;
        return this;
    }

    /**
     * <p>
     * Request metrics from your application.
     * </p>
     *
     * @return <p>
     *         Request metrics from your application.
     *         </p>
     */
    public ApplicationMetrics getApplicationMetrics() {
        return applicationMetrics;
    }

    /**
     * <p>
     * Request metrics from your application.
     * </p>
     *
     * @param applicationMetrics <p>
     *            Request metrics from your application.
     *            </p>
     */
    public void setApplicationMetrics(ApplicationMetrics applicationMetrics) {
        this.applicationMetrics = applicationMetrics;
    }

    /**
     * <p>
     * Request metrics from your application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationMetrics <p>
     *            Request metrics from your application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SingleInstanceHealth withApplicationMetrics(ApplicationMetrics applicationMetrics) {
        this.applicationMetrics = applicationMetrics;
        return this;
    }

    /**
     * <p>
     * Operating system metrics from the instance.
     * </p>
     *
     * @return <p>
     *         Operating system metrics from the instance.
     *         </p>
     */
    public SystemStatus getSystem() {
        return system;
    }

    /**
     * <p>
     * Operating system metrics from the instance.
     * </p>
     *
     * @param system <p>
     *            Operating system metrics from the instance.
     *            </p>
     */
    public void setSystem(SystemStatus system) {
        this.system = system;
    }

    /**
     * <p>
     * Operating system metrics from the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param system <p>
     *            Operating system metrics from the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SingleInstanceHealth withSystem(SystemStatus system) {
        this.system = system;
        return this;
    }

    /**
     * <p>
     * Information about the most recent deployment to an instance.
     * </p>
     *
     * @return <p>
     *         Information about the most recent deployment to an instance.
     *         </p>
     */
    public Deployment getDeployment() {
        return deployment;
    }

    /**
     * <p>
     * Information about the most recent deployment to an instance.
     * </p>
     *
     * @param deployment <p>
     *            Information about the most recent deployment to an instance.
     *            </p>
     */
    public void setDeployment(Deployment deployment) {
        this.deployment = deployment;
    }

    /**
     * <p>
     * Information about the most recent deployment to an instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deployment <p>
     *            Information about the most recent deployment to an instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SingleInstanceHealth withDeployment(Deployment deployment) {
        this.deployment = deployment;
        return this;
    }

    /**
     * <p>
     * The availability zone in which the instance runs.
     * </p>
     *
     * @return <p>
     *         The availability zone in which the instance runs.
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * The availability zone in which the instance runs.
     * </p>
     *
     * @param availabilityZone <p>
     *            The availability zone in which the instance runs.
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The availability zone in which the instance runs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZone <p>
     *            The availability zone in which the instance runs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SingleInstanceHealth withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * The instance's type.
     * </p>
     *
     * @return <p>
     *         The instance's type.
     *         </p>
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * <p>
     * The instance's type.
     * </p>
     *
     * @param instanceType <p>
     *            The instance's type.
     *            </p>
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance's type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceType <p>
     *            The instance's type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SingleInstanceHealth withInstanceType(String instanceType) {
        this.instanceType = instanceType;
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getHealthStatus() != null)
            sb.append("HealthStatus: " + getHealthStatus() + ",");
        if (getColor() != null)
            sb.append("Color: " + getColor() + ",");
        if (getCauses() != null)
            sb.append("Causes: " + getCauses() + ",");
        if (getLaunchedAt() != null)
            sb.append("LaunchedAt: " + getLaunchedAt() + ",");
        if (getApplicationMetrics() != null)
            sb.append("ApplicationMetrics: " + getApplicationMetrics() + ",");
        if (getSystem() != null)
            sb.append("System: " + getSystem() + ",");
        if (getDeployment() != null)
            sb.append("Deployment: " + getDeployment() + ",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getHealthStatus() == null) ? 0 : getHealthStatus().hashCode());
        hashCode = prime * hashCode + ((getColor() == null) ? 0 : getColor().hashCode());
        hashCode = prime * hashCode + ((getCauses() == null) ? 0 : getCauses().hashCode());
        hashCode = prime * hashCode + ((getLaunchedAt() == null) ? 0 : getLaunchedAt().hashCode());
        hashCode = prime * hashCode
                + ((getApplicationMetrics() == null) ? 0 : getApplicationMetrics().hashCode());
        hashCode = prime * hashCode + ((getSystem() == null) ? 0 : getSystem().hashCode());
        hashCode = prime * hashCode + ((getDeployment() == null) ? 0 : getDeployment().hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SingleInstanceHealth == false)
            return false;
        SingleInstanceHealth other = (SingleInstanceHealth) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getHealthStatus() == null ^ this.getHealthStatus() == null)
            return false;
        if (other.getHealthStatus() != null
                && other.getHealthStatus().equals(this.getHealthStatus()) == false)
            return false;
        if (other.getColor() == null ^ this.getColor() == null)
            return false;
        if (other.getColor() != null && other.getColor().equals(this.getColor()) == false)
            return false;
        if (other.getCauses() == null ^ this.getCauses() == null)
            return false;
        if (other.getCauses() != null && other.getCauses().equals(this.getCauses()) == false)
            return false;
        if (other.getLaunchedAt() == null ^ this.getLaunchedAt() == null)
            return false;
        if (other.getLaunchedAt() != null
                && other.getLaunchedAt().equals(this.getLaunchedAt()) == false)
            return false;
        if (other.getApplicationMetrics() == null ^ this.getApplicationMetrics() == null)
            return false;
        if (other.getApplicationMetrics() != null
                && other.getApplicationMetrics().equals(this.getApplicationMetrics()) == false)
            return false;
        if (other.getSystem() == null ^ this.getSystem() == null)
            return false;
        if (other.getSystem() != null && other.getSystem().equals(this.getSystem()) == false)
            return false;
        if (other.getDeployment() == null ^ this.getDeployment() == null)
            return false;
        if (other.getDeployment() != null
                && other.getDeployment().equals(this.getDeployment()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null
                && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        return true;
    }
}
