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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

/**
 * <p>
 * Defines the monitoring job.
 * </p>
 */
public class MonitoringJobDefinition implements Serializable {
    /**
     * <p>
     * Baseline configuration used to validate that the data conforms to the
     * specified constraints and statistics
     * </p>
     */
    private MonitoringBaselineConfig baselineConfig;

    /**
     * <p>
     * The array of inputs for the monitoring job. Currently we support
     * monitoring an Amazon SageMaker Endpoint.
     * </p>
     */
    private java.util.List<MonitoringInput> monitoringInputs;

    /**
     * <p>
     * The array of outputs from the monitoring job to be uploaded to Amazon
     * Simple Storage Service (Amazon S3).
     * </p>
     */
    private MonitoringOutputConfig monitoringOutputConfig;

    /**
     * <p>
     * Identifies the resources, ML compute instances, and ML storage volumes to
     * deploy for a monitoring job. In distributed processing, you specify more
     * than one instance.
     * </p>
     */
    private MonitoringResources monitoringResources;

    /**
     * <p>
     * Configures the monitoring job to run a specified Docker container image.
     * </p>
     */
    private MonitoringAppSpecification monitoringAppSpecification;

    /**
     * <p>
     * Specifies a time limit for how long the monitoring job is allowed to run.
     * </p>
     */
    private MonitoringStoppingCondition stoppingCondition;

    /**
     * <p>
     * Sets the environment variables in the Docker container.
     * </p>
     */
    private java.util.Map<String, String> environment;

    /**
     * <p>
     * Specifies networking options for an monitoring job.
     * </p>
     */
    private NetworkConfig networkConfig;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can
     * assume to perform tasks on your behalf.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     */
    private String roleArn;

    /**
     * <p>
     * Baseline configuration used to validate that the data conforms to the
     * specified constraints and statistics
     * </p>
     *
     * @return <p>
     *         Baseline configuration used to validate that the data conforms to
     *         the specified constraints and statistics
     *         </p>
     */
    public MonitoringBaselineConfig getBaselineConfig() {
        return baselineConfig;
    }

    /**
     * <p>
     * Baseline configuration used to validate that the data conforms to the
     * specified constraints and statistics
     * </p>
     *
     * @param baselineConfig <p>
     *            Baseline configuration used to validate that the data conforms
     *            to the specified constraints and statistics
     *            </p>
     */
    public void setBaselineConfig(MonitoringBaselineConfig baselineConfig) {
        this.baselineConfig = baselineConfig;
    }

    /**
     * <p>
     * Baseline configuration used to validate that the data conforms to the
     * specified constraints and statistics
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param baselineConfig <p>
     *            Baseline configuration used to validate that the data conforms
     *            to the specified constraints and statistics
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoringJobDefinition withBaselineConfig(MonitoringBaselineConfig baselineConfig) {
        this.baselineConfig = baselineConfig;
        return this;
    }

    /**
     * <p>
     * The array of inputs for the monitoring job. Currently we support
     * monitoring an Amazon SageMaker Endpoint.
     * </p>
     *
     * @return <p>
     *         The array of inputs for the monitoring job. Currently we support
     *         monitoring an Amazon SageMaker Endpoint.
     *         </p>
     */
    public java.util.List<MonitoringInput> getMonitoringInputs() {
        return monitoringInputs;
    }

    /**
     * <p>
     * The array of inputs for the monitoring job. Currently we support
     * monitoring an Amazon SageMaker Endpoint.
     * </p>
     *
     * @param monitoringInputs <p>
     *            The array of inputs for the monitoring job. Currently we
     *            support monitoring an Amazon SageMaker Endpoint.
     *            </p>
     */
    public void setMonitoringInputs(java.util.Collection<MonitoringInput> monitoringInputs) {
        if (monitoringInputs == null) {
            this.monitoringInputs = null;
            return;
        }

        this.monitoringInputs = new java.util.ArrayList<MonitoringInput>(monitoringInputs);
    }

    /**
     * <p>
     * The array of inputs for the monitoring job. Currently we support
     * monitoring an Amazon SageMaker Endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param monitoringInputs <p>
     *            The array of inputs for the monitoring job. Currently we
     *            support monitoring an Amazon SageMaker Endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoringJobDefinition withMonitoringInputs(MonitoringInput... monitoringInputs) {
        if (getMonitoringInputs() == null) {
            this.monitoringInputs = new java.util.ArrayList<MonitoringInput>(
                    monitoringInputs.length);
        }
        for (MonitoringInput value : monitoringInputs) {
            this.monitoringInputs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The array of inputs for the monitoring job. Currently we support
     * monitoring an Amazon SageMaker Endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param monitoringInputs <p>
     *            The array of inputs for the monitoring job. Currently we
     *            support monitoring an Amazon SageMaker Endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoringJobDefinition withMonitoringInputs(
            java.util.Collection<MonitoringInput> monitoringInputs) {
        setMonitoringInputs(monitoringInputs);
        return this;
    }

    /**
     * <p>
     * The array of outputs from the monitoring job to be uploaded to Amazon
     * Simple Storage Service (Amazon S3).
     * </p>
     *
     * @return <p>
     *         The array of outputs from the monitoring job to be uploaded to
     *         Amazon Simple Storage Service (Amazon S3).
     *         </p>
     */
    public MonitoringOutputConfig getMonitoringOutputConfig() {
        return monitoringOutputConfig;
    }

    /**
     * <p>
     * The array of outputs from the monitoring job to be uploaded to Amazon
     * Simple Storage Service (Amazon S3).
     * </p>
     *
     * @param monitoringOutputConfig <p>
     *            The array of outputs from the monitoring job to be uploaded to
     *            Amazon Simple Storage Service (Amazon S3).
     *            </p>
     */
    public void setMonitoringOutputConfig(MonitoringOutputConfig monitoringOutputConfig) {
        this.monitoringOutputConfig = monitoringOutputConfig;
    }

    /**
     * <p>
     * The array of outputs from the monitoring job to be uploaded to Amazon
     * Simple Storage Service (Amazon S3).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param monitoringOutputConfig <p>
     *            The array of outputs from the monitoring job to be uploaded to
     *            Amazon Simple Storage Service (Amazon S3).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoringJobDefinition withMonitoringOutputConfig(
            MonitoringOutputConfig monitoringOutputConfig) {
        this.monitoringOutputConfig = monitoringOutputConfig;
        return this;
    }

    /**
     * <p>
     * Identifies the resources, ML compute instances, and ML storage volumes to
     * deploy for a monitoring job. In distributed processing, you specify more
     * than one instance.
     * </p>
     *
     * @return <p>
     *         Identifies the resources, ML compute instances, and ML storage
     *         volumes to deploy for a monitoring job. In distributed
     *         processing, you specify more than one instance.
     *         </p>
     */
    public MonitoringResources getMonitoringResources() {
        return monitoringResources;
    }

    /**
     * <p>
     * Identifies the resources, ML compute instances, and ML storage volumes to
     * deploy for a monitoring job. In distributed processing, you specify more
     * than one instance.
     * </p>
     *
     * @param monitoringResources <p>
     *            Identifies the resources, ML compute instances, and ML storage
     *            volumes to deploy for a monitoring job. In distributed
     *            processing, you specify more than one instance.
     *            </p>
     */
    public void setMonitoringResources(MonitoringResources monitoringResources) {
        this.monitoringResources = monitoringResources;
    }

    /**
     * <p>
     * Identifies the resources, ML compute instances, and ML storage volumes to
     * deploy for a monitoring job. In distributed processing, you specify more
     * than one instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param monitoringResources <p>
     *            Identifies the resources, ML compute instances, and ML storage
     *            volumes to deploy for a monitoring job. In distributed
     *            processing, you specify more than one instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoringJobDefinition withMonitoringResources(MonitoringResources monitoringResources) {
        this.monitoringResources = monitoringResources;
        return this;
    }

    /**
     * <p>
     * Configures the monitoring job to run a specified Docker container image.
     * </p>
     *
     * @return <p>
     *         Configures the monitoring job to run a specified Docker container
     *         image.
     *         </p>
     */
    public MonitoringAppSpecification getMonitoringAppSpecification() {
        return monitoringAppSpecification;
    }

    /**
     * <p>
     * Configures the monitoring job to run a specified Docker container image.
     * </p>
     *
     * @param monitoringAppSpecification <p>
     *            Configures the monitoring job to run a specified Docker
     *            container image.
     *            </p>
     */
    public void setMonitoringAppSpecification(MonitoringAppSpecification monitoringAppSpecification) {
        this.monitoringAppSpecification = monitoringAppSpecification;
    }

    /**
     * <p>
     * Configures the monitoring job to run a specified Docker container image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param monitoringAppSpecification <p>
     *            Configures the monitoring job to run a specified Docker
     *            container image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoringJobDefinition withMonitoringAppSpecification(
            MonitoringAppSpecification monitoringAppSpecification) {
        this.monitoringAppSpecification = monitoringAppSpecification;
        return this;
    }

    /**
     * <p>
     * Specifies a time limit for how long the monitoring job is allowed to run.
     * </p>
     *
     * @return <p>
     *         Specifies a time limit for how long the monitoring job is allowed
     *         to run.
     *         </p>
     */
    public MonitoringStoppingCondition getStoppingCondition() {
        return stoppingCondition;
    }

    /**
     * <p>
     * Specifies a time limit for how long the monitoring job is allowed to run.
     * </p>
     *
     * @param stoppingCondition <p>
     *            Specifies a time limit for how long the monitoring job is
     *            allowed to run.
     *            </p>
     */
    public void setStoppingCondition(MonitoringStoppingCondition stoppingCondition) {
        this.stoppingCondition = stoppingCondition;
    }

    /**
     * <p>
     * Specifies a time limit for how long the monitoring job is allowed to run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stoppingCondition <p>
     *            Specifies a time limit for how long the monitoring job is
     *            allowed to run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoringJobDefinition withStoppingCondition(
            MonitoringStoppingCondition stoppingCondition) {
        this.stoppingCondition = stoppingCondition;
        return this;
    }

    /**
     * <p>
     * Sets the environment variables in the Docker container.
     * </p>
     *
     * @return <p>
     *         Sets the environment variables in the Docker container.
     *         </p>
     */
    public java.util.Map<String, String> getEnvironment() {
        return environment;
    }

    /**
     * <p>
     * Sets the environment variables in the Docker container.
     * </p>
     *
     * @param environment <p>
     *            Sets the environment variables in the Docker container.
     *            </p>
     */
    public void setEnvironment(java.util.Map<String, String> environment) {
        this.environment = environment;
    }

    /**
     * <p>
     * Sets the environment variables in the Docker container.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param environment <p>
     *            Sets the environment variables in the Docker container.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoringJobDefinition withEnvironment(java.util.Map<String, String> environment) {
        this.environment = environment;
        return this;
    }

    /**
     * <p>
     * Sets the environment variables in the Docker container.
     * </p>
     * <p>
     * The method adds a new key-value pair into Environment parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Environment.
     * @param value The corresponding value of the entry to be added into
     *            Environment.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoringJobDefinition addEnvironmentEntry(String key, String value) {
        if (null == this.environment) {
            this.environment = new java.util.HashMap<String, String>();
        }
        if (this.environment.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.environment.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Environment.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public MonitoringJobDefinition clearEnvironmentEntries() {
        this.environment = null;
        return this;
    }

    /**
     * <p>
     * Specifies networking options for an monitoring job.
     * </p>
     *
     * @return <p>
     *         Specifies networking options for an monitoring job.
     *         </p>
     */
    public NetworkConfig getNetworkConfig() {
        return networkConfig;
    }

    /**
     * <p>
     * Specifies networking options for an monitoring job.
     * </p>
     *
     * @param networkConfig <p>
     *            Specifies networking options for an monitoring job.
     *            </p>
     */
    public void setNetworkConfig(NetworkConfig networkConfig) {
        this.networkConfig = networkConfig;
    }

    /**
     * <p>
     * Specifies networking options for an monitoring job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkConfig <p>
     *            Specifies networking options for an monitoring job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoringJobDefinition withNetworkConfig(NetworkConfig networkConfig) {
        this.networkConfig = networkConfig;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can
     * assume to perform tasks on your behalf.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of an IAM role that Amazon
     *         SageMaker can assume to perform tasks on your behalf.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can
     * assume to perform tasks on your behalf.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of an IAM role that Amazon
     *            SageMaker can assume to perform tasks on your behalf.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can
     * assume to perform tasks on your behalf.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of an IAM role that Amazon
     *            SageMaker can assume to perform tasks on your behalf.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoringJobDefinition withRoleArn(String roleArn) {
        this.roleArn = roleArn;
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
        if (getBaselineConfig() != null)
            sb.append("BaselineConfig: " + getBaselineConfig() + ",");
        if (getMonitoringInputs() != null)
            sb.append("MonitoringInputs: " + getMonitoringInputs() + ",");
        if (getMonitoringOutputConfig() != null)
            sb.append("MonitoringOutputConfig: " + getMonitoringOutputConfig() + ",");
        if (getMonitoringResources() != null)
            sb.append("MonitoringResources: " + getMonitoringResources() + ",");
        if (getMonitoringAppSpecification() != null)
            sb.append("MonitoringAppSpecification: " + getMonitoringAppSpecification() + ",");
        if (getStoppingCondition() != null)
            sb.append("StoppingCondition: " + getStoppingCondition() + ",");
        if (getEnvironment() != null)
            sb.append("Environment: " + getEnvironment() + ",");
        if (getNetworkConfig() != null)
            sb.append("NetworkConfig: " + getNetworkConfig() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBaselineConfig() == null) ? 0 : getBaselineConfig().hashCode());
        hashCode = prime * hashCode
                + ((getMonitoringInputs() == null) ? 0 : getMonitoringInputs().hashCode());
        hashCode = prime
                * hashCode
                + ((getMonitoringOutputConfig() == null) ? 0 : getMonitoringOutputConfig()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getMonitoringResources() == null) ? 0 : getMonitoringResources().hashCode());
        hashCode = prime
                * hashCode
                + ((getMonitoringAppSpecification() == null) ? 0 : getMonitoringAppSpecification()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getStoppingCondition() == null) ? 0 : getStoppingCondition().hashCode());
        hashCode = prime * hashCode
                + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkConfig() == null) ? 0 : getNetworkConfig().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MonitoringJobDefinition == false)
            return false;
        MonitoringJobDefinition other = (MonitoringJobDefinition) obj;

        if (other.getBaselineConfig() == null ^ this.getBaselineConfig() == null)
            return false;
        if (other.getBaselineConfig() != null
                && other.getBaselineConfig().equals(this.getBaselineConfig()) == false)
            return false;
        if (other.getMonitoringInputs() == null ^ this.getMonitoringInputs() == null)
            return false;
        if (other.getMonitoringInputs() != null
                && other.getMonitoringInputs().equals(this.getMonitoringInputs()) == false)
            return false;
        if (other.getMonitoringOutputConfig() == null ^ this.getMonitoringOutputConfig() == null)
            return false;
        if (other.getMonitoringOutputConfig() != null
                && other.getMonitoringOutputConfig().equals(this.getMonitoringOutputConfig()) == false)
            return false;
        if (other.getMonitoringResources() == null ^ this.getMonitoringResources() == null)
            return false;
        if (other.getMonitoringResources() != null
                && other.getMonitoringResources().equals(this.getMonitoringResources()) == false)
            return false;
        if (other.getMonitoringAppSpecification() == null
                ^ this.getMonitoringAppSpecification() == null)
            return false;
        if (other.getMonitoringAppSpecification() != null
                && other.getMonitoringAppSpecification().equals(
                        this.getMonitoringAppSpecification()) == false)
            return false;
        if (other.getStoppingCondition() == null ^ this.getStoppingCondition() == null)
            return false;
        if (other.getStoppingCondition() != null
                && other.getStoppingCondition().equals(this.getStoppingCondition()) == false)
            return false;
        if (other.getEnvironment() == null ^ this.getEnvironment() == null)
            return false;
        if (other.getEnvironment() != null
                && other.getEnvironment().equals(this.getEnvironment()) == false)
            return false;
        if (other.getNetworkConfig() == null ^ this.getNetworkConfig() == null)
            return false;
        if (other.getNetworkConfig() != null
                && other.getNetworkConfig().equals(this.getNetworkConfig()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }
}
