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
 * Health details for an AWS Elastic Beanstalk environment.
 * </p>
 */
public class DescribeEnvironmentHealthResult implements Serializable {
    /**
     * <p>
     * The environment's name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     */
    private String environmentName;

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     * >health status</a> of the environment. For example, <code>Ok</code>.
     * </p>
     */
    private String healthStatus;

    /**
     * <p>
     * The environment's operational status. <code>Ready</code>,
     * <code>Launching</code>, <code>Updating</code>, <code>Terminating</code>,
     * or <code>Terminated</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Green, Yellow, Red, Grey
     */
    private String status;

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     * >health color</a> of the environment.
     * </p>
     */
    private String color;

    /**
     * <p>
     * Descriptions of the data that contributed to the environment's current
     * health status.
     * </p>
     */
    private java.util.List<String> causes;

    /**
     * <p>
     * Application request metrics for the environment.
     * </p>
     */
    private ApplicationMetrics applicationMetrics;

    /**
     * <p>
     * Summary health information for the instances in the environment.
     * </p>
     */
    private InstanceHealthSummary instancesHealth;

    /**
     * <p>
     * The date and time that the health information was retrieved.
     * </p>
     */
    private java.util.Date refreshedAt;

    /**
     * <p>
     * The environment's name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @return <p>
     *         The environment's name.
     *         </p>
     */
    public String getEnvironmentName() {
        return environmentName;
    }

    /**
     * <p>
     * The environment's name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @param environmentName <p>
     *            The environment's name.
     *            </p>
     */
    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The environment's name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @param environmentName <p>
     *            The environment's name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEnvironmentHealthResult withEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     * >health status</a> of the environment. For example, <code>Ok</code>.
     * </p>
     *
     * @return <p>
     *         The <a href=
     *         "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     *         >health status</a> of the environment. For example,
     *         <code>Ok</code>.
     *         </p>
     */
    public String getHealthStatus() {
        return healthStatus;
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     * >health status</a> of the environment. For example, <code>Ok</code>.
     * </p>
     *
     * @param healthStatus <p>
     *            The <a href=
     *            "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     *            >health status</a> of the environment. For example,
     *            <code>Ok</code>.
     *            </p>
     */
    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     * >health status</a> of the environment. For example, <code>Ok</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param healthStatus <p>
     *            The <a href=
     *            "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     *            >health status</a> of the environment. For example,
     *            <code>Ok</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEnvironmentHealthResult withHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }

    /**
     * <p>
     * The environment's operational status. <code>Ready</code>,
     * <code>Launching</code>, <code>Updating</code>, <code>Terminating</code>,
     * or <code>Terminated</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Green, Yellow, Red, Grey
     *
     * @return <p>
     *         The environment's operational status. <code>Ready</code>,
     *         <code>Launching</code>, <code>Updating</code>,
     *         <code>Terminating</code>, or <code>Terminated</code>.
     *         </p>
     * @see EnvironmentHealth
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The environment's operational status. <code>Ready</code>,
     * <code>Launching</code>, <code>Updating</code>, <code>Terminating</code>,
     * or <code>Terminated</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Green, Yellow, Red, Grey
     *
     * @param status <p>
     *            The environment's operational status. <code>Ready</code>,
     *            <code>Launching</code>, <code>Updating</code>,
     *            <code>Terminating</code>, or <code>Terminated</code>.
     *            </p>
     * @see EnvironmentHealth
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The environment's operational status. <code>Ready</code>,
     * <code>Launching</code>, <code>Updating</code>, <code>Terminating</code>,
     * or <code>Terminated</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Green, Yellow, Red, Grey
     *
     * @param status <p>
     *            The environment's operational status. <code>Ready</code>,
     *            <code>Launching</code>, <code>Updating</code>,
     *            <code>Terminating</code>, or <code>Terminated</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EnvironmentHealth
     */
    public DescribeEnvironmentHealthResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The environment's operational status. <code>Ready</code>,
     * <code>Launching</code>, <code>Updating</code>, <code>Terminating</code>,
     * or <code>Terminated</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Green, Yellow, Red, Grey
     *
     * @param status <p>
     *            The environment's operational status. <code>Ready</code>,
     *            <code>Launching</code>, <code>Updating</code>,
     *            <code>Terminating</code>, or <code>Terminated</code>.
     *            </p>
     * @see EnvironmentHealth
     */
    public void setStatus(EnvironmentHealth status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The environment's operational status. <code>Ready</code>,
     * <code>Launching</code>, <code>Updating</code>, <code>Terminating</code>,
     * or <code>Terminated</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Green, Yellow, Red, Grey
     *
     * @param status <p>
     *            The environment's operational status. <code>Ready</code>,
     *            <code>Launching</code>, <code>Updating</code>,
     *            <code>Terminating</code>, or <code>Terminated</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EnvironmentHealth
     */
    public DescribeEnvironmentHealthResult withStatus(EnvironmentHealth status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     * >health color</a> of the environment.
     * </p>
     *
     * @return <p>
     *         The <a href=
     *         "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     *         >health color</a> of the environment.
     *         </p>
     */
    public String getColor() {
        return color;
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     * >health color</a> of the environment.
     * </p>
     *
     * @param color <p>
     *            The <a href=
     *            "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     *            >health color</a> of the environment.
     *            </p>
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     * >health color</a> of the environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param color <p>
     *            The <a href=
     *            "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     *            >health color</a> of the environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEnvironmentHealthResult withColor(String color) {
        this.color = color;
        return this;
    }

    /**
     * <p>
     * Descriptions of the data that contributed to the environment's current
     * health status.
     * </p>
     *
     * @return <p>
     *         Descriptions of the data that contributed to the environment's
     *         current health status.
     *         </p>
     */
    public java.util.List<String> getCauses() {
        return causes;
    }

    /**
     * <p>
     * Descriptions of the data that contributed to the environment's current
     * health status.
     * </p>
     *
     * @param causes <p>
     *            Descriptions of the data that contributed to the environment's
     *            current health status.
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
     * Descriptions of the data that contributed to the environment's current
     * health status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param causes <p>
     *            Descriptions of the data that contributed to the environment's
     *            current health status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEnvironmentHealthResult withCauses(String... causes) {
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
     * Descriptions of the data that contributed to the environment's current
     * health status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param causes <p>
     *            Descriptions of the data that contributed to the environment's
     *            current health status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEnvironmentHealthResult withCauses(java.util.Collection<String> causes) {
        setCauses(causes);
        return this;
    }

    /**
     * <p>
     * Application request metrics for the environment.
     * </p>
     *
     * @return <p>
     *         Application request metrics for the environment.
     *         </p>
     */
    public ApplicationMetrics getApplicationMetrics() {
        return applicationMetrics;
    }

    /**
     * <p>
     * Application request metrics for the environment.
     * </p>
     *
     * @param applicationMetrics <p>
     *            Application request metrics for the environment.
     *            </p>
     */
    public void setApplicationMetrics(ApplicationMetrics applicationMetrics) {
        this.applicationMetrics = applicationMetrics;
    }

    /**
     * <p>
     * Application request metrics for the environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationMetrics <p>
     *            Application request metrics for the environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEnvironmentHealthResult withApplicationMetrics(
            ApplicationMetrics applicationMetrics) {
        this.applicationMetrics = applicationMetrics;
        return this;
    }

    /**
     * <p>
     * Summary health information for the instances in the environment.
     * </p>
     *
     * @return <p>
     *         Summary health information for the instances in the environment.
     *         </p>
     */
    public InstanceHealthSummary getInstancesHealth() {
        return instancesHealth;
    }

    /**
     * <p>
     * Summary health information for the instances in the environment.
     * </p>
     *
     * @param instancesHealth <p>
     *            Summary health information for the instances in the
     *            environment.
     *            </p>
     */
    public void setInstancesHealth(InstanceHealthSummary instancesHealth) {
        this.instancesHealth = instancesHealth;
    }

    /**
     * <p>
     * Summary health information for the instances in the environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instancesHealth <p>
     *            Summary health information for the instances in the
     *            environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEnvironmentHealthResult withInstancesHealth(InstanceHealthSummary instancesHealth) {
        this.instancesHealth = instancesHealth;
        return this;
    }

    /**
     * <p>
     * The date and time that the health information was retrieved.
     * </p>
     *
     * @return <p>
     *         The date and time that the health information was retrieved.
     *         </p>
     */
    public java.util.Date getRefreshedAt() {
        return refreshedAt;
    }

    /**
     * <p>
     * The date and time that the health information was retrieved.
     * </p>
     *
     * @param refreshedAt <p>
     *            The date and time that the health information was retrieved.
     *            </p>
     */
    public void setRefreshedAt(java.util.Date refreshedAt) {
        this.refreshedAt = refreshedAt;
    }

    /**
     * <p>
     * The date and time that the health information was retrieved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param refreshedAt <p>
     *            The date and time that the health information was retrieved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEnvironmentHealthResult withRefreshedAt(java.util.Date refreshedAt) {
        this.refreshedAt = refreshedAt;
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
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: " + getEnvironmentName() + ",");
        if (getHealthStatus() != null)
            sb.append("HealthStatus: " + getHealthStatus() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getColor() != null)
            sb.append("Color: " + getColor() + ",");
        if (getCauses() != null)
            sb.append("Causes: " + getCauses() + ",");
        if (getApplicationMetrics() != null)
            sb.append("ApplicationMetrics: " + getApplicationMetrics() + ",");
        if (getInstancesHealth() != null)
            sb.append("InstancesHealth: " + getInstancesHealth() + ",");
        if (getRefreshedAt() != null)
            sb.append("RefreshedAt: " + getRefreshedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode
                + ((getHealthStatus() == null) ? 0 : getHealthStatus().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getColor() == null) ? 0 : getColor().hashCode());
        hashCode = prime * hashCode + ((getCauses() == null) ? 0 : getCauses().hashCode());
        hashCode = prime * hashCode
                + ((getApplicationMetrics() == null) ? 0 : getApplicationMetrics().hashCode());
        hashCode = prime * hashCode
                + ((getInstancesHealth() == null) ? 0 : getInstancesHealth().hashCode());
        hashCode = prime * hashCode
                + ((getRefreshedAt() == null) ? 0 : getRefreshedAt().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEnvironmentHealthResult == false)
            return false;
        DescribeEnvironmentHealthResult other = (DescribeEnvironmentHealthResult) obj;

        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null
                && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getHealthStatus() == null ^ this.getHealthStatus() == null)
            return false;
        if (other.getHealthStatus() != null
                && other.getHealthStatus().equals(this.getHealthStatus()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getColor() == null ^ this.getColor() == null)
            return false;
        if (other.getColor() != null && other.getColor().equals(this.getColor()) == false)
            return false;
        if (other.getCauses() == null ^ this.getCauses() == null)
            return false;
        if (other.getCauses() != null && other.getCauses().equals(this.getCauses()) == false)
            return false;
        if (other.getApplicationMetrics() == null ^ this.getApplicationMetrics() == null)
            return false;
        if (other.getApplicationMetrics() != null
                && other.getApplicationMetrics().equals(this.getApplicationMetrics()) == false)
            return false;
        if (other.getInstancesHealth() == null ^ this.getInstancesHealth() == null)
            return false;
        if (other.getInstancesHealth() != null
                && other.getInstancesHealth().equals(this.getInstancesHealth()) == false)
            return false;
        if (other.getRefreshedAt() == null ^ this.getRefreshedAt() == null)
            return false;
        if (other.getRefreshedAt() != null
                && other.getRefreshedAt().equals(this.getRefreshedAt()) == false)
            return false;
        return true;
    }
}
