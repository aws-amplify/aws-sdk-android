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
 * Describes the noncompliant resources in a member account for a specific AWS
 * Firewall Manager policy. A maximum of 100 entries are displayed. If more than
 * 100 resources are noncompliant, <code>EvaluationLimitExceeded</code> is set
 * to <code>True</code>.
 * </p>
 */
public class PolicyComplianceDetail implements Serializable {
    /**
     * <p>
     * The AWS account that created the AWS Firewall Manager policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[0-9]+$<br/>
     */
    private String policyOwner;

    /**
     * <p>
     * The ID of the AWS Firewall Manager policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[a-z0-9A-Z-]{36}$<br/>
     */
    private String policyId;

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[0-9]+$<br/>
     */
    private String memberAccount;

    /**
     * <p>
     * An array of resources that aren't protected by the AWS WAF or Shield
     * Advanced policy or that aren't in compliance with the security group
     * policy.
     * </p>
     */
    private java.util.List<ComplianceViolator> violators;

    /**
     * <p>
     * Indicates if over 100 resources are noncompliant with the AWS Firewall
     * Manager policy.
     * </p>
     */
    private Boolean evaluationLimitExceeded;

    /**
     * <p>
     * A timestamp that indicates when the returned information should be
     * considered out of date.
     * </p>
     */
    private java.util.Date expiredAt;

    /**
     * <p>
     * Details about problems with dependent services, such as AWS WAF or AWS
     * Config, that are causing a resource to be noncompliant. The details
     * include the name of the dependent service and the error message received
     * that indicates the problem with the service.
     * </p>
     */
    private java.util.Map<String, String> issueInfoMap;

    /**
     * <p>
     * The AWS account that created the AWS Firewall Manager policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[0-9]+$<br/>
     *
     * @return <p>
     *         The AWS account that created the AWS Firewall Manager policy.
     *         </p>
     */
    public String getPolicyOwner() {
        return policyOwner;
    }

    /**
     * <p>
     * The AWS account that created the AWS Firewall Manager policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[0-9]+$<br/>
     *
     * @param policyOwner <p>
     *            The AWS account that created the AWS Firewall Manager policy.
     *            </p>
     */
    public void setPolicyOwner(String policyOwner) {
        this.policyOwner = policyOwner;
    }

    /**
     * <p>
     * The AWS account that created the AWS Firewall Manager policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[0-9]+$<br/>
     *
     * @param policyOwner <p>
     *            The AWS account that created the AWS Firewall Manager policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyComplianceDetail withPolicyOwner(String policyOwner) {
        this.policyOwner = policyOwner;
        return this;
    }

    /**
     * <p>
     * The ID of the AWS Firewall Manager policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[a-z0-9A-Z-]{36}$<br/>
     *
     * @return <p>
     *         The ID of the AWS Firewall Manager policy.
     *         </p>
     */
    public String getPolicyId() {
        return policyId;
    }

    /**
     * <p>
     * The ID of the AWS Firewall Manager policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[a-z0-9A-Z-]{36}$<br/>
     *
     * @param policyId <p>
     *            The ID of the AWS Firewall Manager policy.
     *            </p>
     */
    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    /**
     * <p>
     * The ID of the AWS Firewall Manager policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[a-z0-9A-Z-]{36}$<br/>
     *
     * @param policyId <p>
     *            The ID of the AWS Firewall Manager policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyComplianceDetail withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[0-9]+$<br/>
     *
     * @return <p>
     *         The AWS account ID.
     *         </p>
     */
    public String getMemberAccount() {
        return memberAccount;
    }

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[0-9]+$<br/>
     *
     * @param memberAccount <p>
     *            The AWS account ID.
     *            </p>
     */
    public void setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;
    }

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[0-9]+$<br/>
     *
     * @param memberAccount <p>
     *            The AWS account ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyComplianceDetail withMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;
        return this;
    }

    /**
     * <p>
     * An array of resources that aren't protected by the AWS WAF or Shield
     * Advanced policy or that aren't in compliance with the security group
     * policy.
     * </p>
     *
     * @return <p>
     *         An array of resources that aren't protected by the AWS WAF or
     *         Shield Advanced policy or that aren't in compliance with the
     *         security group policy.
     *         </p>
     */
    public java.util.List<ComplianceViolator> getViolators() {
        return violators;
    }

    /**
     * <p>
     * An array of resources that aren't protected by the AWS WAF or Shield
     * Advanced policy or that aren't in compliance with the security group
     * policy.
     * </p>
     *
     * @param violators <p>
     *            An array of resources that aren't protected by the AWS WAF or
     *            Shield Advanced policy or that aren't in compliance with the
     *            security group policy.
     *            </p>
     */
    public void setViolators(java.util.Collection<ComplianceViolator> violators) {
        if (violators == null) {
            this.violators = null;
            return;
        }

        this.violators = new java.util.ArrayList<ComplianceViolator>(violators);
    }

    /**
     * <p>
     * An array of resources that aren't protected by the AWS WAF or Shield
     * Advanced policy or that aren't in compliance with the security group
     * policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param violators <p>
     *            An array of resources that aren't protected by the AWS WAF or
     *            Shield Advanced policy or that aren't in compliance with the
     *            security group policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyComplianceDetail withViolators(ComplianceViolator... violators) {
        if (getViolators() == null) {
            this.violators = new java.util.ArrayList<ComplianceViolator>(violators.length);
        }
        for (ComplianceViolator value : violators) {
            this.violators.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of resources that aren't protected by the AWS WAF or Shield
     * Advanced policy or that aren't in compliance with the security group
     * policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param violators <p>
     *            An array of resources that aren't protected by the AWS WAF or
     *            Shield Advanced policy or that aren't in compliance with the
     *            security group policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyComplianceDetail withViolators(java.util.Collection<ComplianceViolator> violators) {
        setViolators(violators);
        return this;
    }

    /**
     * <p>
     * Indicates if over 100 resources are noncompliant with the AWS Firewall
     * Manager policy.
     * </p>
     *
     * @return <p>
     *         Indicates if over 100 resources are noncompliant with the AWS
     *         Firewall Manager policy.
     *         </p>
     */
    public Boolean isEvaluationLimitExceeded() {
        return evaluationLimitExceeded;
    }

    /**
     * <p>
     * Indicates if over 100 resources are noncompliant with the AWS Firewall
     * Manager policy.
     * </p>
     *
     * @return <p>
     *         Indicates if over 100 resources are noncompliant with the AWS
     *         Firewall Manager policy.
     *         </p>
     */
    public Boolean getEvaluationLimitExceeded() {
        return evaluationLimitExceeded;
    }

    /**
     * <p>
     * Indicates if over 100 resources are noncompliant with the AWS Firewall
     * Manager policy.
     * </p>
     *
     * @param evaluationLimitExceeded <p>
     *            Indicates if over 100 resources are noncompliant with the AWS
     *            Firewall Manager policy.
     *            </p>
     */
    public void setEvaluationLimitExceeded(Boolean evaluationLimitExceeded) {
        this.evaluationLimitExceeded = evaluationLimitExceeded;
    }

    /**
     * <p>
     * Indicates if over 100 resources are noncompliant with the AWS Firewall
     * Manager policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param evaluationLimitExceeded <p>
     *            Indicates if over 100 resources are noncompliant with the AWS
     *            Firewall Manager policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyComplianceDetail withEvaluationLimitExceeded(Boolean evaluationLimitExceeded) {
        this.evaluationLimitExceeded = evaluationLimitExceeded;
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the returned information should be
     * considered out of date.
     * </p>
     *
     * @return <p>
     *         A timestamp that indicates when the returned information should
     *         be considered out of date.
     *         </p>
     */
    public java.util.Date getExpiredAt() {
        return expiredAt;
    }

    /**
     * <p>
     * A timestamp that indicates when the returned information should be
     * considered out of date.
     * </p>
     *
     * @param expiredAt <p>
     *            A timestamp that indicates when the returned information
     *            should be considered out of date.
     *            </p>
     */
    public void setExpiredAt(java.util.Date expiredAt) {
        this.expiredAt = expiredAt;
    }

    /**
     * <p>
     * A timestamp that indicates when the returned information should be
     * considered out of date.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expiredAt <p>
     *            A timestamp that indicates when the returned information
     *            should be considered out of date.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyComplianceDetail withExpiredAt(java.util.Date expiredAt) {
        this.expiredAt = expiredAt;
        return this;
    }

    /**
     * <p>
     * Details about problems with dependent services, such as AWS WAF or AWS
     * Config, that are causing a resource to be noncompliant. The details
     * include the name of the dependent service and the error message received
     * that indicates the problem with the service.
     * </p>
     *
     * @return <p>
     *         Details about problems with dependent services, such as AWS WAF
     *         or AWS Config, that are causing a resource to be noncompliant.
     *         The details include the name of the dependent service and the
     *         error message received that indicates the problem with the
     *         service.
     *         </p>
     */
    public java.util.Map<String, String> getIssueInfoMap() {
        return issueInfoMap;
    }

    /**
     * <p>
     * Details about problems with dependent services, such as AWS WAF or AWS
     * Config, that are causing a resource to be noncompliant. The details
     * include the name of the dependent service and the error message received
     * that indicates the problem with the service.
     * </p>
     *
     * @param issueInfoMap <p>
     *            Details about problems with dependent services, such as AWS
     *            WAF or AWS Config, that are causing a resource to be
     *            noncompliant. The details include the name of the dependent
     *            service and the error message received that indicates the
     *            problem with the service.
     *            </p>
     */
    public void setIssueInfoMap(java.util.Map<String, String> issueInfoMap) {
        this.issueInfoMap = issueInfoMap;
    }

    /**
     * <p>
     * Details about problems with dependent services, such as AWS WAF or AWS
     * Config, that are causing a resource to be noncompliant. The details
     * include the name of the dependent service and the error message received
     * that indicates the problem with the service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param issueInfoMap <p>
     *            Details about problems with dependent services, such as AWS
     *            WAF or AWS Config, that are causing a resource to be
     *            noncompliant. The details include the name of the dependent
     *            service and the error message received that indicates the
     *            problem with the service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyComplianceDetail withIssueInfoMap(java.util.Map<String, String> issueInfoMap) {
        this.issueInfoMap = issueInfoMap;
        return this;
    }

    /**
     * <p>
     * Details about problems with dependent services, such as AWS WAF or AWS
     * Config, that are causing a resource to be noncompliant. The details
     * include the name of the dependent service and the error message received
     * that indicates the problem with the service.
     * </p>
     * <p>
     * The method adds a new key-value pair into IssueInfoMap parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into IssueInfoMap.
     * @param value The corresponding value of the entry to be added into
     *            IssueInfoMap.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyComplianceDetail addIssueInfoMapEntry(String key, String value) {
        if (null == this.issueInfoMap) {
            this.issueInfoMap = new java.util.HashMap<String, String>();
        }
        if (this.issueInfoMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.issueInfoMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into IssueInfoMap.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public PolicyComplianceDetail clearIssueInfoMapEntries() {
        this.issueInfoMap = null;
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
        if (getPolicyOwner() != null)
            sb.append("PolicyOwner: " + getPolicyOwner() + ",");
        if (getPolicyId() != null)
            sb.append("PolicyId: " + getPolicyId() + ",");
        if (getMemberAccount() != null)
            sb.append("MemberAccount: " + getMemberAccount() + ",");
        if (getViolators() != null)
            sb.append("Violators: " + getViolators() + ",");
        if (getEvaluationLimitExceeded() != null)
            sb.append("EvaluationLimitExceeded: " + getEvaluationLimitExceeded() + ",");
        if (getExpiredAt() != null)
            sb.append("ExpiredAt: " + getExpiredAt() + ",");
        if (getIssueInfoMap() != null)
            sb.append("IssueInfoMap: " + getIssueInfoMap());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPolicyOwner() == null) ? 0 : getPolicyOwner().hashCode());
        hashCode = prime * hashCode + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode());
        hashCode = prime * hashCode
                + ((getMemberAccount() == null) ? 0 : getMemberAccount().hashCode());
        hashCode = prime * hashCode + ((getViolators() == null) ? 0 : getViolators().hashCode());
        hashCode = prime
                * hashCode
                + ((getEvaluationLimitExceeded() == null) ? 0 : getEvaluationLimitExceeded()
                        .hashCode());
        hashCode = prime * hashCode + ((getExpiredAt() == null) ? 0 : getExpiredAt().hashCode());
        hashCode = prime * hashCode
                + ((getIssueInfoMap() == null) ? 0 : getIssueInfoMap().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicyComplianceDetail == false)
            return false;
        PolicyComplianceDetail other = (PolicyComplianceDetail) obj;

        if (other.getPolicyOwner() == null ^ this.getPolicyOwner() == null)
            return false;
        if (other.getPolicyOwner() != null
                && other.getPolicyOwner().equals(this.getPolicyOwner()) == false)
            return false;
        if (other.getPolicyId() == null ^ this.getPolicyId() == null)
            return false;
        if (other.getPolicyId() != null && other.getPolicyId().equals(this.getPolicyId()) == false)
            return false;
        if (other.getMemberAccount() == null ^ this.getMemberAccount() == null)
            return false;
        if (other.getMemberAccount() != null
                && other.getMemberAccount().equals(this.getMemberAccount()) == false)
            return false;
        if (other.getViolators() == null ^ this.getViolators() == null)
            return false;
        if (other.getViolators() != null
                && other.getViolators().equals(this.getViolators()) == false)
            return false;
        if (other.getEvaluationLimitExceeded() == null ^ this.getEvaluationLimitExceeded() == null)
            return false;
        if (other.getEvaluationLimitExceeded() != null
                && other.getEvaluationLimitExceeded().equals(this.getEvaluationLimitExceeded()) == false)
            return false;
        if (other.getExpiredAt() == null ^ this.getExpiredAt() == null)
            return false;
        if (other.getExpiredAt() != null
                && other.getExpiredAt().equals(this.getExpiredAt()) == false)
            return false;
        if (other.getIssueInfoMap() == null ^ this.getIssueInfoMap() == null)
            return false;
        if (other.getIssueInfoMap() != null
                && other.getIssueInfoMap().equals(this.getIssueInfoMap()) == false)
            return false;
        return true;
    }
}
