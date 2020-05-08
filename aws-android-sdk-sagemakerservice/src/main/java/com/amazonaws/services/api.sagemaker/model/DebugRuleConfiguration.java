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
 * Configuration information for debugging rules.
 * </p>
 */
public class DebugRuleConfiguration implements Serializable {
    /**
     * <p>
     * The name of the rule configuration. It must be unique relative to other
     * rule configuration names.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String ruleConfigurationName;

    /**
     * <p>
     * Path to local storage location for output of rules. Defaults to
     * <code>/opt/ml/processing/output/rule/</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String localPath;

    /**
     * <p>
     * Path to Amazon S3 storage location for rules.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     */
    private String s3OutputPath;

    /**
     * <p>
     * The Amazon Elastic Container (ECR) Image for the managed rule evaluation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String ruleEvaluatorImage;

    /**
     * <p>
     * The instance type to deploy for a training job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ml.t3.medium, ml.t3.large, ml.t3.xlarge,
     * ml.t3.2xlarge, ml.m4.xlarge, ml.m4.2xlarge, ml.m4.4xlarge,
     * ml.m4.10xlarge, ml.m4.16xlarge, ml.c4.xlarge, ml.c4.2xlarge,
     * ml.c4.4xlarge, ml.c4.8xlarge, ml.p2.xlarge, ml.p2.8xlarge,
     * ml.p2.16xlarge, ml.p3.2xlarge, ml.p3.8xlarge, ml.p3.16xlarge,
     * ml.c5.xlarge, ml.c5.2xlarge, ml.c5.4xlarge, ml.c5.9xlarge,
     * ml.c5.18xlarge, ml.m5.large, ml.m5.xlarge, ml.m5.2xlarge, ml.m5.4xlarge,
     * ml.m5.12xlarge, ml.m5.24xlarge, ml.r5.large, ml.r5.xlarge, ml.r5.2xlarge,
     * ml.r5.4xlarge, ml.r5.8xlarge, ml.r5.12xlarge, ml.r5.16xlarge,
     * ml.r5.24xlarge
     */
    private String instanceType;

    /**
     * <p>
     * The size, in GB, of the ML storage volume attached to the processing
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer volumeSizeInGB;

    /**
     * <p>
     * Runtime configuration for rule container.
     * </p>
     */
    private java.util.Map<String, String> ruleParameters;

    /**
     * <p>
     * The name of the rule configuration. It must be unique relative to other
     * rule configuration names.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The name of the rule configuration. It must be unique relative to
     *         other rule configuration names.
     *         </p>
     */
    public String getRuleConfigurationName() {
        return ruleConfigurationName;
    }

    /**
     * <p>
     * The name of the rule configuration. It must be unique relative to other
     * rule configuration names.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param ruleConfigurationName <p>
     *            The name of the rule configuration. It must be unique relative
     *            to other rule configuration names.
     *            </p>
     */
    public void setRuleConfigurationName(String ruleConfigurationName) {
        this.ruleConfigurationName = ruleConfigurationName;
    }

    /**
     * <p>
     * The name of the rule configuration. It must be unique relative to other
     * rule configuration names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param ruleConfigurationName <p>
     *            The name of the rule configuration. It must be unique relative
     *            to other rule configuration names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DebugRuleConfiguration withRuleConfigurationName(String ruleConfigurationName) {
        this.ruleConfigurationName = ruleConfigurationName;
        return this;
    }

    /**
     * <p>
     * Path to local storage location for output of rules. Defaults to
     * <code>/opt/ml/processing/output/rule/</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         Path to local storage location for output of rules. Defaults to
     *         <code>/opt/ml/processing/output/rule/</code>.
     *         </p>
     */
    public String getLocalPath() {
        return localPath;
    }

    /**
     * <p>
     * Path to local storage location for output of rules. Defaults to
     * <code>/opt/ml/processing/output/rule/</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param localPath <p>
     *            Path to local storage location for output of rules. Defaults
     *            to <code>/opt/ml/processing/output/rule/</code>.
     *            </p>
     */
    public void setLocalPath(String localPath) {
        this.localPath = localPath;
    }

    /**
     * <p>
     * Path to local storage location for output of rules. Defaults to
     * <code>/opt/ml/processing/output/rule/</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param localPath <p>
     *            Path to local storage location for output of rules. Defaults
     *            to <code>/opt/ml/processing/output/rule/</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DebugRuleConfiguration withLocalPath(String localPath) {
        this.localPath = localPath;
        return this;
    }

    /**
     * <p>
     * Path to Amazon S3 storage location for rules.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @return <p>
     *         Path to Amazon S3 storage location for rules.
     *         </p>
     */
    public String getS3OutputPath() {
        return s3OutputPath;
    }

    /**
     * <p>
     * Path to Amazon S3 storage location for rules.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @param s3OutputPath <p>
     *            Path to Amazon S3 storage location for rules.
     *            </p>
     */
    public void setS3OutputPath(String s3OutputPath) {
        this.s3OutputPath = s3OutputPath;
    }

    /**
     * <p>
     * Path to Amazon S3 storage location for rules.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @param s3OutputPath <p>
     *            Path to Amazon S3 storage location for rules.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DebugRuleConfiguration withS3OutputPath(String s3OutputPath) {
        this.s3OutputPath = s3OutputPath;
        return this;
    }

    /**
     * <p>
     * The Amazon Elastic Container (ECR) Image for the managed rule evaluation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The Amazon Elastic Container (ECR) Image for the managed rule
     *         evaluation.
     *         </p>
     */
    public String getRuleEvaluatorImage() {
        return ruleEvaluatorImage;
    }

    /**
     * <p>
     * The Amazon Elastic Container (ECR) Image for the managed rule evaluation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param ruleEvaluatorImage <p>
     *            The Amazon Elastic Container (ECR) Image for the managed rule
     *            evaluation.
     *            </p>
     */
    public void setRuleEvaluatorImage(String ruleEvaluatorImage) {
        this.ruleEvaluatorImage = ruleEvaluatorImage;
    }

    /**
     * <p>
     * The Amazon Elastic Container (ECR) Image for the managed rule evaluation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param ruleEvaluatorImage <p>
     *            The Amazon Elastic Container (ECR) Image for the managed rule
     *            evaluation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DebugRuleConfiguration withRuleEvaluatorImage(String ruleEvaluatorImage) {
        this.ruleEvaluatorImage = ruleEvaluatorImage;
        return this;
    }

    /**
     * <p>
     * The instance type to deploy for a training job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ml.t3.medium, ml.t3.large, ml.t3.xlarge,
     * ml.t3.2xlarge, ml.m4.xlarge, ml.m4.2xlarge, ml.m4.4xlarge,
     * ml.m4.10xlarge, ml.m4.16xlarge, ml.c4.xlarge, ml.c4.2xlarge,
     * ml.c4.4xlarge, ml.c4.8xlarge, ml.p2.xlarge, ml.p2.8xlarge,
     * ml.p2.16xlarge, ml.p3.2xlarge, ml.p3.8xlarge, ml.p3.16xlarge,
     * ml.c5.xlarge, ml.c5.2xlarge, ml.c5.4xlarge, ml.c5.9xlarge,
     * ml.c5.18xlarge, ml.m5.large, ml.m5.xlarge, ml.m5.2xlarge, ml.m5.4xlarge,
     * ml.m5.12xlarge, ml.m5.24xlarge, ml.r5.large, ml.r5.xlarge, ml.r5.2xlarge,
     * ml.r5.4xlarge, ml.r5.8xlarge, ml.r5.12xlarge, ml.r5.16xlarge,
     * ml.r5.24xlarge
     *
     * @return <p>
     *         The instance type to deploy for a training job.
     *         </p>
     * @see ProcessingInstanceType
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * <p>
     * The instance type to deploy for a training job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ml.t3.medium, ml.t3.large, ml.t3.xlarge,
     * ml.t3.2xlarge, ml.m4.xlarge, ml.m4.2xlarge, ml.m4.4xlarge,
     * ml.m4.10xlarge, ml.m4.16xlarge, ml.c4.xlarge, ml.c4.2xlarge,
     * ml.c4.4xlarge, ml.c4.8xlarge, ml.p2.xlarge, ml.p2.8xlarge,
     * ml.p2.16xlarge, ml.p3.2xlarge, ml.p3.8xlarge, ml.p3.16xlarge,
     * ml.c5.xlarge, ml.c5.2xlarge, ml.c5.4xlarge, ml.c5.9xlarge,
     * ml.c5.18xlarge, ml.m5.large, ml.m5.xlarge, ml.m5.2xlarge, ml.m5.4xlarge,
     * ml.m5.12xlarge, ml.m5.24xlarge, ml.r5.large, ml.r5.xlarge, ml.r5.2xlarge,
     * ml.r5.4xlarge, ml.r5.8xlarge, ml.r5.12xlarge, ml.r5.16xlarge,
     * ml.r5.24xlarge
     *
     * @param instanceType <p>
     *            The instance type to deploy for a training job.
     *            </p>
     * @see ProcessingInstanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type to deploy for a training job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ml.t3.medium, ml.t3.large, ml.t3.xlarge,
     * ml.t3.2xlarge, ml.m4.xlarge, ml.m4.2xlarge, ml.m4.4xlarge,
     * ml.m4.10xlarge, ml.m4.16xlarge, ml.c4.xlarge, ml.c4.2xlarge,
     * ml.c4.4xlarge, ml.c4.8xlarge, ml.p2.xlarge, ml.p2.8xlarge,
     * ml.p2.16xlarge, ml.p3.2xlarge, ml.p3.8xlarge, ml.p3.16xlarge,
     * ml.c5.xlarge, ml.c5.2xlarge, ml.c5.4xlarge, ml.c5.9xlarge,
     * ml.c5.18xlarge, ml.m5.large, ml.m5.xlarge, ml.m5.2xlarge, ml.m5.4xlarge,
     * ml.m5.12xlarge, ml.m5.24xlarge, ml.r5.large, ml.r5.xlarge, ml.r5.2xlarge,
     * ml.r5.4xlarge, ml.r5.8xlarge, ml.r5.12xlarge, ml.r5.16xlarge,
     * ml.r5.24xlarge
     *
     * @param instanceType <p>
     *            The instance type to deploy for a training job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProcessingInstanceType
     */
    public DebugRuleConfiguration withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p>
     * The instance type to deploy for a training job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ml.t3.medium, ml.t3.large, ml.t3.xlarge,
     * ml.t3.2xlarge, ml.m4.xlarge, ml.m4.2xlarge, ml.m4.4xlarge,
     * ml.m4.10xlarge, ml.m4.16xlarge, ml.c4.xlarge, ml.c4.2xlarge,
     * ml.c4.4xlarge, ml.c4.8xlarge, ml.p2.xlarge, ml.p2.8xlarge,
     * ml.p2.16xlarge, ml.p3.2xlarge, ml.p3.8xlarge, ml.p3.16xlarge,
     * ml.c5.xlarge, ml.c5.2xlarge, ml.c5.4xlarge, ml.c5.9xlarge,
     * ml.c5.18xlarge, ml.m5.large, ml.m5.xlarge, ml.m5.2xlarge, ml.m5.4xlarge,
     * ml.m5.12xlarge, ml.m5.24xlarge, ml.r5.large, ml.r5.xlarge, ml.r5.2xlarge,
     * ml.r5.4xlarge, ml.r5.8xlarge, ml.r5.12xlarge, ml.r5.16xlarge,
     * ml.r5.24xlarge
     *
     * @param instanceType <p>
     *            The instance type to deploy for a training job.
     *            </p>
     * @see ProcessingInstanceType
     */
    public void setInstanceType(ProcessingInstanceType instanceType) {
        this.instanceType = instanceType.toString();
    }

    /**
     * <p>
     * The instance type to deploy for a training job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ml.t3.medium, ml.t3.large, ml.t3.xlarge,
     * ml.t3.2xlarge, ml.m4.xlarge, ml.m4.2xlarge, ml.m4.4xlarge,
     * ml.m4.10xlarge, ml.m4.16xlarge, ml.c4.xlarge, ml.c4.2xlarge,
     * ml.c4.4xlarge, ml.c4.8xlarge, ml.p2.xlarge, ml.p2.8xlarge,
     * ml.p2.16xlarge, ml.p3.2xlarge, ml.p3.8xlarge, ml.p3.16xlarge,
     * ml.c5.xlarge, ml.c5.2xlarge, ml.c5.4xlarge, ml.c5.9xlarge,
     * ml.c5.18xlarge, ml.m5.large, ml.m5.xlarge, ml.m5.2xlarge, ml.m5.4xlarge,
     * ml.m5.12xlarge, ml.m5.24xlarge, ml.r5.large, ml.r5.xlarge, ml.r5.2xlarge,
     * ml.r5.4xlarge, ml.r5.8xlarge, ml.r5.12xlarge, ml.r5.16xlarge,
     * ml.r5.24xlarge
     *
     * @param instanceType <p>
     *            The instance type to deploy for a training job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProcessingInstanceType
     */
    public DebugRuleConfiguration withInstanceType(ProcessingInstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * The size, in GB, of the ML storage volume attached to the processing
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The size, in GB, of the ML storage volume attached to the
     *         processing instance.
     *         </p>
     */
    public Integer getVolumeSizeInGB() {
        return volumeSizeInGB;
    }

    /**
     * <p>
     * The size, in GB, of the ML storage volume attached to the processing
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param volumeSizeInGB <p>
     *            The size, in GB, of the ML storage volume attached to the
     *            processing instance.
     *            </p>
     */
    public void setVolumeSizeInGB(Integer volumeSizeInGB) {
        this.volumeSizeInGB = volumeSizeInGB;
    }

    /**
     * <p>
     * The size, in GB, of the ML storage volume attached to the processing
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param volumeSizeInGB <p>
     *            The size, in GB, of the ML storage volume attached to the
     *            processing instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DebugRuleConfiguration withVolumeSizeInGB(Integer volumeSizeInGB) {
        this.volumeSizeInGB = volumeSizeInGB;
        return this;
    }

    /**
     * <p>
     * Runtime configuration for rule container.
     * </p>
     *
     * @return <p>
     *         Runtime configuration for rule container.
     *         </p>
     */
    public java.util.Map<String, String> getRuleParameters() {
        return ruleParameters;
    }

    /**
     * <p>
     * Runtime configuration for rule container.
     * </p>
     *
     * @param ruleParameters <p>
     *            Runtime configuration for rule container.
     *            </p>
     */
    public void setRuleParameters(java.util.Map<String, String> ruleParameters) {
        this.ruleParameters = ruleParameters;
    }

    /**
     * <p>
     * Runtime configuration for rule container.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ruleParameters <p>
     *            Runtime configuration for rule container.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DebugRuleConfiguration withRuleParameters(java.util.Map<String, String> ruleParameters) {
        this.ruleParameters = ruleParameters;
        return this;
    }

    /**
     * <p>
     * Runtime configuration for rule container.
     * </p>
     * <p>
     * The method adds a new key-value pair into RuleParameters parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into RuleParameters.
     * @param value The corresponding value of the entry to be added into
     *            RuleParameters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DebugRuleConfiguration addRuleParametersEntry(String key, String value) {
        if (null == this.ruleParameters) {
            this.ruleParameters = new java.util.HashMap<String, String>();
        }
        if (this.ruleParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.ruleParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RuleParameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public DebugRuleConfiguration clearRuleParametersEntries() {
        this.ruleParameters = null;
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
        if (getRuleConfigurationName() != null)
            sb.append("RuleConfigurationName: " + getRuleConfigurationName() + ",");
        if (getLocalPath() != null)
            sb.append("LocalPath: " + getLocalPath() + ",");
        if (getS3OutputPath() != null)
            sb.append("S3OutputPath: " + getS3OutputPath() + ",");
        if (getRuleEvaluatorImage() != null)
            sb.append("RuleEvaluatorImage: " + getRuleEvaluatorImage() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getVolumeSizeInGB() != null)
            sb.append("VolumeSizeInGB: " + getVolumeSizeInGB() + ",");
        if (getRuleParameters() != null)
            sb.append("RuleParameters: " + getRuleParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getRuleConfigurationName() == null) ? 0 : getRuleConfigurationName().hashCode());
        hashCode = prime * hashCode + ((getLocalPath() == null) ? 0 : getLocalPath().hashCode());
        hashCode = prime * hashCode
                + ((getS3OutputPath() == null) ? 0 : getS3OutputPath().hashCode());
        hashCode = prime * hashCode
                + ((getRuleEvaluatorImage() == null) ? 0 : getRuleEvaluatorImage().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode
                + ((getVolumeSizeInGB() == null) ? 0 : getVolumeSizeInGB().hashCode());
        hashCode = prime * hashCode
                + ((getRuleParameters() == null) ? 0 : getRuleParameters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DebugRuleConfiguration == false)
            return false;
        DebugRuleConfiguration other = (DebugRuleConfiguration) obj;

        if (other.getRuleConfigurationName() == null ^ this.getRuleConfigurationName() == null)
            return false;
        if (other.getRuleConfigurationName() != null
                && other.getRuleConfigurationName().equals(this.getRuleConfigurationName()) == false)
            return false;
        if (other.getLocalPath() == null ^ this.getLocalPath() == null)
            return false;
        if (other.getLocalPath() != null
                && other.getLocalPath().equals(this.getLocalPath()) == false)
            return false;
        if (other.getS3OutputPath() == null ^ this.getS3OutputPath() == null)
            return false;
        if (other.getS3OutputPath() != null
                && other.getS3OutputPath().equals(this.getS3OutputPath()) == false)
            return false;
        if (other.getRuleEvaluatorImage() == null ^ this.getRuleEvaluatorImage() == null)
            return false;
        if (other.getRuleEvaluatorImage() != null
                && other.getRuleEvaluatorImage().equals(this.getRuleEvaluatorImage()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null
                && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getVolumeSizeInGB() == null ^ this.getVolumeSizeInGB() == null)
            return false;
        if (other.getVolumeSizeInGB() != null
                && other.getVolumeSizeInGB().equals(this.getVolumeSizeInGB()) == false)
            return false;
        if (other.getRuleParameters() == null ^ this.getRuleParameters() == null)
            return false;
        if (other.getRuleParameters() != null
                && other.getRuleParameters().equals(this.getRuleParameters()) == false)
            return false;
        return true;
    }
}
