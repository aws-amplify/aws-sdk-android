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

package com.amazonaws.services.firewallmanagementservice.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the compliance status for the account. An account is considered
 * noncompliant if it includes resources that are not protected by the specified
 * policy or that don't comply with the policy.
 * </p>
 */
public class EvaluationResult implements Serializable {
    /**
     * <p>
     * Describes an AWS account's compliance with the AWS Firewall Manager
     * policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANT, NON_COMPLIANT
     */
    private String complianceStatus;

    /**
     * <p>
     * The number of resources that are noncompliant with the specified policy.
     * For AWS WAF and Shield Advanced policies, a resource is considered
     * noncompliant if it is not associated with the policy. For security group
     * policies, a resource is considered noncompliant if it doesn't comply with
     * the rules of the policy and remediation is disabled or not possible.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long violatorCount;

    /**
     * <p>
     * Indicates that over 100 resources are noncompliant with the AWS Firewall
     * Manager policy.
     * </p>
     */
    private Boolean evaluationLimitExceeded;

    /**
     * <p>
     * Describes an AWS account's compliance with the AWS Firewall Manager
     * policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANT, NON_COMPLIANT
     *
     * @return <p>
     *         Describes an AWS account's compliance with the AWS Firewall
     *         Manager policy.
     *         </p>
     * @see PolicyComplianceStatusType
     */
    public String getComplianceStatus() {
        return complianceStatus;
    }

    /**
     * <p>
     * Describes an AWS account's compliance with the AWS Firewall Manager
     * policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANT, NON_COMPLIANT
     *
     * @param complianceStatus <p>
     *            Describes an AWS account's compliance with the AWS Firewall
     *            Manager policy.
     *            </p>
     * @see PolicyComplianceStatusType
     */
    public void setComplianceStatus(String complianceStatus) {
        this.complianceStatus = complianceStatus;
    }

    /**
     * <p>
     * Describes an AWS account's compliance with the AWS Firewall Manager
     * policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANT, NON_COMPLIANT
     *
     * @param complianceStatus <p>
     *            Describes an AWS account's compliance with the AWS Firewall
     *            Manager policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PolicyComplianceStatusType
     */
    public EvaluationResult withComplianceStatus(String complianceStatus) {
        this.complianceStatus = complianceStatus;
        return this;
    }

    /**
     * <p>
     * Describes an AWS account's compliance with the AWS Firewall Manager
     * policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANT, NON_COMPLIANT
     *
     * @param complianceStatus <p>
     *            Describes an AWS account's compliance with the AWS Firewall
     *            Manager policy.
     *            </p>
     * @see PolicyComplianceStatusType
     */
    public void setComplianceStatus(PolicyComplianceStatusType complianceStatus) {
        this.complianceStatus = complianceStatus.toString();
    }

    /**
     * <p>
     * Describes an AWS account's compliance with the AWS Firewall Manager
     * policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANT, NON_COMPLIANT
     *
     * @param complianceStatus <p>
     *            Describes an AWS account's compliance with the AWS Firewall
     *            Manager policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PolicyComplianceStatusType
     */
    public EvaluationResult withComplianceStatus(PolicyComplianceStatusType complianceStatus) {
        this.complianceStatus = complianceStatus.toString();
        return this;
    }

    /**
     * <p>
     * The number of resources that are noncompliant with the specified policy.
     * For AWS WAF and Shield Advanced policies, a resource is considered
     * noncompliant if it is not associated with the policy. For security group
     * policies, a resource is considered noncompliant if it doesn't comply with
     * the rules of the policy and remediation is disabled or not possible.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The number of resources that are noncompliant with the specified
     *         policy. For AWS WAF and Shield Advanced policies, a resource is
     *         considered noncompliant if it is not associated with the policy.
     *         For security group policies, a resource is considered
     *         noncompliant if it doesn't comply with the rules of the policy
     *         and remediation is disabled or not possible.
     *         </p>
     */
    public Long getViolatorCount() {
        return violatorCount;
    }

    /**
     * <p>
     * The number of resources that are noncompliant with the specified policy.
     * For AWS WAF and Shield Advanced policies, a resource is considered
     * noncompliant if it is not associated with the policy. For security group
     * policies, a resource is considered noncompliant if it doesn't comply with
     * the rules of the policy and remediation is disabled or not possible.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param violatorCount <p>
     *            The number of resources that are noncompliant with the
     *            specified policy. For AWS WAF and Shield Advanced policies, a
     *            resource is considered noncompliant if it is not associated
     *            with the policy. For security group policies, a resource is
     *            considered noncompliant if it doesn't comply with the rules of
     *            the policy and remediation is disabled or not possible.
     *            </p>
     */
    public void setViolatorCount(Long violatorCount) {
        this.violatorCount = violatorCount;
    }

    /**
     * <p>
     * The number of resources that are noncompliant with the specified policy.
     * For AWS WAF and Shield Advanced policies, a resource is considered
     * noncompliant if it is not associated with the policy. For security group
     * policies, a resource is considered noncompliant if it doesn't comply with
     * the rules of the policy and remediation is disabled or not possible.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param violatorCount <p>
     *            The number of resources that are noncompliant with the
     *            specified policy. For AWS WAF and Shield Advanced policies, a
     *            resource is considered noncompliant if it is not associated
     *            with the policy. For security group policies, a resource is
     *            considered noncompliant if it doesn't comply with the rules of
     *            the policy and remediation is disabled or not possible.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationResult withViolatorCount(Long violatorCount) {
        this.violatorCount = violatorCount;
        return this;
    }

    /**
     * <p>
     * Indicates that over 100 resources are noncompliant with the AWS Firewall
     * Manager policy.
     * </p>
     *
     * @return <p>
     *         Indicates that over 100 resources are noncompliant with the AWS
     *         Firewall Manager policy.
     *         </p>
     */
    public Boolean isEvaluationLimitExceeded() {
        return evaluationLimitExceeded;
    }

    /**
     * <p>
     * Indicates that over 100 resources are noncompliant with the AWS Firewall
     * Manager policy.
     * </p>
     *
     * @return <p>
     *         Indicates that over 100 resources are noncompliant with the AWS
     *         Firewall Manager policy.
     *         </p>
     */
    public Boolean getEvaluationLimitExceeded() {
        return evaluationLimitExceeded;
    }

    /**
     * <p>
     * Indicates that over 100 resources are noncompliant with the AWS Firewall
     * Manager policy.
     * </p>
     *
     * @param evaluationLimitExceeded <p>
     *            Indicates that over 100 resources are noncompliant with the
     *            AWS Firewall Manager policy.
     *            </p>
     */
    public void setEvaluationLimitExceeded(Boolean evaluationLimitExceeded) {
        this.evaluationLimitExceeded = evaluationLimitExceeded;
    }

    /**
     * <p>
     * Indicates that over 100 resources are noncompliant with the AWS Firewall
     * Manager policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param evaluationLimitExceeded <p>
     *            Indicates that over 100 resources are noncompliant with the
     *            AWS Firewall Manager policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationResult withEvaluationLimitExceeded(Boolean evaluationLimitExceeded) {
        this.evaluationLimitExceeded = evaluationLimitExceeded;
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
        if (getComplianceStatus() != null)
            sb.append("ComplianceStatus: " + getComplianceStatus() + ",");
        if (getViolatorCount() != null)
            sb.append("ViolatorCount: " + getViolatorCount() + ",");
        if (getEvaluationLimitExceeded() != null)
            sb.append("EvaluationLimitExceeded: " + getEvaluationLimitExceeded());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getComplianceStatus() == null) ? 0 : getComplianceStatus().hashCode());
        hashCode = prime * hashCode
                + ((getViolatorCount() == null) ? 0 : getViolatorCount().hashCode());
        hashCode = prime
                * hashCode
                + ((getEvaluationLimitExceeded() == null) ? 0 : getEvaluationLimitExceeded()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationResult == false)
            return false;
        EvaluationResult other = (EvaluationResult) obj;

        if (other.getComplianceStatus() == null ^ this.getComplianceStatus() == null)
            return false;
        if (other.getComplianceStatus() != null
                && other.getComplianceStatus().equals(this.getComplianceStatus()) == false)
            return false;
        if (other.getViolatorCount() == null ^ this.getViolatorCount() == null)
            return false;
        if (other.getViolatorCount() != null
                && other.getViolatorCount().equals(this.getViolatorCount()) == false)
            return false;
        if (other.getEvaluationLimitExceeded() == null ^ this.getEvaluationLimitExceeded() == null)
            return false;
        if (other.getEvaluationLimitExceeded() != null
                && other.getEvaluationLimitExceeded().equals(this.getEvaluationLimitExceeded()) == false)
            return false;
        return true;
    }
}
