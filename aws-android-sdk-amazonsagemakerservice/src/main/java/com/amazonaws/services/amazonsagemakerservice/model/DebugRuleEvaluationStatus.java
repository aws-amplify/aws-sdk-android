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
 * Information about the status of the rule evaluation.
 * </p>
 */
public class DebugRuleEvaluationStatus implements Serializable {
    /**
     * <p>
     * The name of the rule configuration
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String ruleConfigurationName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule evaluation job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:processing-job/.*
     * <br/>
     */
    private String ruleEvaluationJobArn;

    /**
     * <p>
     * Status of the rule evaluation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, NoIssuesFound, IssuesFound, Error,
     * Stopping, Stopped
     */
    private String ruleEvaluationStatus;

    /**
     * <p>
     * Details from the rule evaluation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String statusDetails;

    /**
     * <p>
     * Timestamp when the rule evaluation status was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The name of the rule configuration
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The name of the rule configuration
     *         </p>
     */
    public String getRuleConfigurationName() {
        return ruleConfigurationName;
    }

    /**
     * <p>
     * The name of the rule configuration
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param ruleConfigurationName <p>
     *            The name of the rule configuration
     *            </p>
     */
    public void setRuleConfigurationName(String ruleConfigurationName) {
        this.ruleConfigurationName = ruleConfigurationName;
    }

    /**
     * <p>
     * The name of the rule configuration
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
     *            The name of the rule configuration
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DebugRuleEvaluationStatus withRuleConfigurationName(String ruleConfigurationName) {
        this.ruleConfigurationName = ruleConfigurationName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule evaluation job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:processing-job/.*
     * <br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the rule evaluation job.
     *         </p>
     */
    public String getRuleEvaluationJobArn() {
        return ruleEvaluationJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule evaluation job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:processing-job/.*
     * <br/>
     *
     * @param ruleEvaluationJobArn <p>
     *            The Amazon Resource Name (ARN) of the rule evaluation job.
     *            </p>
     */
    public void setRuleEvaluationJobArn(String ruleEvaluationJobArn) {
        this.ruleEvaluationJobArn = ruleEvaluationJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule evaluation job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:processing-job/.*
     * <br/>
     *
     * @param ruleEvaluationJobArn <p>
     *            The Amazon Resource Name (ARN) of the rule evaluation job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DebugRuleEvaluationStatus withRuleEvaluationJobArn(String ruleEvaluationJobArn) {
        this.ruleEvaluationJobArn = ruleEvaluationJobArn;
        return this;
    }

    /**
     * <p>
     * Status of the rule evaluation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, NoIssuesFound, IssuesFound, Error,
     * Stopping, Stopped
     *
     * @return <p>
     *         Status of the rule evaluation.
     *         </p>
     * @see RuleEvaluationStatus
     */
    public String getRuleEvaluationStatus() {
        return ruleEvaluationStatus;
    }

    /**
     * <p>
     * Status of the rule evaluation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, NoIssuesFound, IssuesFound, Error,
     * Stopping, Stopped
     *
     * @param ruleEvaluationStatus <p>
     *            Status of the rule evaluation.
     *            </p>
     * @see RuleEvaluationStatus
     */
    public void setRuleEvaluationStatus(String ruleEvaluationStatus) {
        this.ruleEvaluationStatus = ruleEvaluationStatus;
    }

    /**
     * <p>
     * Status of the rule evaluation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, NoIssuesFound, IssuesFound, Error,
     * Stopping, Stopped
     *
     * @param ruleEvaluationStatus <p>
     *            Status of the rule evaluation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RuleEvaluationStatus
     */
    public DebugRuleEvaluationStatus withRuleEvaluationStatus(String ruleEvaluationStatus) {
        this.ruleEvaluationStatus = ruleEvaluationStatus;
        return this;
    }

    /**
     * <p>
     * Status of the rule evaluation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, NoIssuesFound, IssuesFound, Error,
     * Stopping, Stopped
     *
     * @param ruleEvaluationStatus <p>
     *            Status of the rule evaluation.
     *            </p>
     * @see RuleEvaluationStatus
     */
    public void setRuleEvaluationStatus(RuleEvaluationStatus ruleEvaluationStatus) {
        this.ruleEvaluationStatus = ruleEvaluationStatus.toString();
    }

    /**
     * <p>
     * Status of the rule evaluation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, NoIssuesFound, IssuesFound, Error,
     * Stopping, Stopped
     *
     * @param ruleEvaluationStatus <p>
     *            Status of the rule evaluation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RuleEvaluationStatus
     */
    public DebugRuleEvaluationStatus withRuleEvaluationStatus(
            RuleEvaluationStatus ruleEvaluationStatus) {
        this.ruleEvaluationStatus = ruleEvaluationStatus.toString();
        return this;
    }

    /**
     * <p>
     * Details from the rule evaluation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         Details from the rule evaluation.
     *         </p>
     */
    public String getStatusDetails() {
        return statusDetails;
    }

    /**
     * <p>
     * Details from the rule evaluation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param statusDetails <p>
     *            Details from the rule evaluation.
     *            </p>
     */
    public void setStatusDetails(String statusDetails) {
        this.statusDetails = statusDetails;
    }

    /**
     * <p>
     * Details from the rule evaluation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param statusDetails <p>
     *            Details from the rule evaluation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DebugRuleEvaluationStatus withStatusDetails(String statusDetails) {
        this.statusDetails = statusDetails;
        return this;
    }

    /**
     * <p>
     * Timestamp when the rule evaluation status was last modified.
     * </p>
     *
     * @return <p>
     *         Timestamp when the rule evaluation status was last modified.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * Timestamp when the rule evaluation status was last modified.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            Timestamp when the rule evaluation status was last modified.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * Timestamp when the rule evaluation status was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            Timestamp when the rule evaluation status was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DebugRuleEvaluationStatus withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
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
        if (getRuleEvaluationJobArn() != null)
            sb.append("RuleEvaluationJobArn: " + getRuleEvaluationJobArn() + ",");
        if (getRuleEvaluationStatus() != null)
            sb.append("RuleEvaluationStatus: " + getRuleEvaluationStatus() + ",");
        if (getStatusDetails() != null)
            sb.append("StatusDetails: " + getStatusDetails() + ",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime());
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
        hashCode = prime * hashCode
                + ((getRuleEvaluationJobArn() == null) ? 0 : getRuleEvaluationJobArn().hashCode());
        hashCode = prime * hashCode
                + ((getRuleEvaluationStatus() == null) ? 0 : getRuleEvaluationStatus().hashCode());
        hashCode = prime * hashCode
                + ((getStatusDetails() == null) ? 0 : getStatusDetails().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DebugRuleEvaluationStatus == false)
            return false;
        DebugRuleEvaluationStatus other = (DebugRuleEvaluationStatus) obj;

        if (other.getRuleConfigurationName() == null ^ this.getRuleConfigurationName() == null)
            return false;
        if (other.getRuleConfigurationName() != null
                && other.getRuleConfigurationName().equals(this.getRuleConfigurationName()) == false)
            return false;
        if (other.getRuleEvaluationJobArn() == null ^ this.getRuleEvaluationJobArn() == null)
            return false;
        if (other.getRuleEvaluationJobArn() != null
                && other.getRuleEvaluationJobArn().equals(this.getRuleEvaluationJobArn()) == false)
            return false;
        if (other.getRuleEvaluationStatus() == null ^ this.getRuleEvaluationStatus() == null)
            return false;
        if (other.getRuleEvaluationStatus() != null
                && other.getRuleEvaluationStatus().equals(this.getRuleEvaluationStatus()) == false)
            return false;
        if (other.getStatusDetails() == null ^ this.getStatusDetails() == null)
            return false;
        if (other.getStatusDetails() != null
                && other.getStatusDetails().equals(this.getStatusDetails()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null
                && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        return true;
    }
}
