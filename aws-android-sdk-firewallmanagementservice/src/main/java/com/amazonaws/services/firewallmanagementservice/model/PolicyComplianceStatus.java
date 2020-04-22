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
 * Indicates whether the account is compliant with the specified policy. An
 * account is considered noncompliant if it includes resources that are not
 * protected by the policy, for AWS WAF and Shield Advanced policies, or that
 * are noncompliant with the policy, for security group policies.
 * </p>
 */
public class PolicyComplianceStatus implements Serializable {
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
     * The friendly name of the AWS Firewall Manager policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     */
    private String policyName;

    /**
     * <p>
     * The member account ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[0-9]+$<br/>
     */
    private String memberAccount;

    /**
     * <p>
     * An array of <code>EvaluationResult</code> objects.
     * </p>
     */
    private java.util.List<EvaluationResult> evaluationResults;

    /**
     * <p>
     * Timestamp of the last update to the <code>EvaluationResult</code>
     * objects.
     * </p>
     */
    private java.util.Date lastUpdated;

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
    public PolicyComplianceStatus withPolicyOwner(String policyOwner) {
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
    public PolicyComplianceStatus withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * <p>
     * The friendly name of the AWS Firewall Manager policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @return <p>
     *         The friendly name of the AWS Firewall Manager policy.
     *         </p>
     */
    public String getPolicyName() {
        return policyName;
    }

    /**
     * <p>
     * The friendly name of the AWS Firewall Manager policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @param policyName <p>
     *            The friendly name of the AWS Firewall Manager policy.
     *            </p>
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The friendly name of the AWS Firewall Manager policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @param policyName <p>
     *            The friendly name of the AWS Firewall Manager policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyComplianceStatus withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * <p>
     * The member account ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[0-9]+$<br/>
     *
     * @return <p>
     *         The member account ID.
     *         </p>
     */
    public String getMemberAccount() {
        return memberAccount;
    }

    /**
     * <p>
     * The member account ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[0-9]+$<br/>
     *
     * @param memberAccount <p>
     *            The member account ID.
     *            </p>
     */
    public void setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;
    }

    /**
     * <p>
     * The member account ID.
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
     *            The member account ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyComplianceStatus withMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;
        return this;
    }

    /**
     * <p>
     * An array of <code>EvaluationResult</code> objects.
     * </p>
     *
     * @return <p>
     *         An array of <code>EvaluationResult</code> objects.
     *         </p>
     */
    public java.util.List<EvaluationResult> getEvaluationResults() {
        return evaluationResults;
    }

    /**
     * <p>
     * An array of <code>EvaluationResult</code> objects.
     * </p>
     *
     * @param evaluationResults <p>
     *            An array of <code>EvaluationResult</code> objects.
     *            </p>
     */
    public void setEvaluationResults(java.util.Collection<EvaluationResult> evaluationResults) {
        if (evaluationResults == null) {
            this.evaluationResults = null;
            return;
        }

        this.evaluationResults = new java.util.ArrayList<EvaluationResult>(evaluationResults);
    }

    /**
     * <p>
     * An array of <code>EvaluationResult</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param evaluationResults <p>
     *            An array of <code>EvaluationResult</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyComplianceStatus withEvaluationResults(EvaluationResult... evaluationResults) {
        if (getEvaluationResults() == null) {
            this.evaluationResults = new java.util.ArrayList<EvaluationResult>(
                    evaluationResults.length);
        }
        for (EvaluationResult value : evaluationResults) {
            this.evaluationResults.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>EvaluationResult</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param evaluationResults <p>
     *            An array of <code>EvaluationResult</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyComplianceStatus withEvaluationResults(
            java.util.Collection<EvaluationResult> evaluationResults) {
        setEvaluationResults(evaluationResults);
        return this;
    }

    /**
     * <p>
     * Timestamp of the last update to the <code>EvaluationResult</code>
     * objects.
     * </p>
     *
     * @return <p>
     *         Timestamp of the last update to the <code>EvaluationResult</code>
     *         objects.
     *         </p>
     */
    public java.util.Date getLastUpdated() {
        return lastUpdated;
    }

    /**
     * <p>
     * Timestamp of the last update to the <code>EvaluationResult</code>
     * objects.
     * </p>
     *
     * @param lastUpdated <p>
     *            Timestamp of the last update to the
     *            <code>EvaluationResult</code> objects.
     *            </p>
     */
    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * <p>
     * Timestamp of the last update to the <code>EvaluationResult</code>
     * objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdated <p>
     *            Timestamp of the last update to the
     *            <code>EvaluationResult</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyComplianceStatus withLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
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
    public PolicyComplianceStatus withIssueInfoMap(java.util.Map<String, String> issueInfoMap) {
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
    public PolicyComplianceStatus addIssueInfoMapEntry(String key, String value) {
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
    public PolicyComplianceStatus clearIssueInfoMapEntries() {
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
        if (getPolicyName() != null)
            sb.append("PolicyName: " + getPolicyName() + ",");
        if (getMemberAccount() != null)
            sb.append("MemberAccount: " + getMemberAccount() + ",");
        if (getEvaluationResults() != null)
            sb.append("EvaluationResults: " + getEvaluationResults() + ",");
        if (getLastUpdated() != null)
            sb.append("LastUpdated: " + getLastUpdated() + ",");
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
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode
                + ((getMemberAccount() == null) ? 0 : getMemberAccount().hashCode());
        hashCode = prime * hashCode
                + ((getEvaluationResults() == null) ? 0 : getEvaluationResults().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
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

        if (obj instanceof PolicyComplianceStatus == false)
            return false;
        PolicyComplianceStatus other = (PolicyComplianceStatus) obj;

        if (other.getPolicyOwner() == null ^ this.getPolicyOwner() == null)
            return false;
        if (other.getPolicyOwner() != null
                && other.getPolicyOwner().equals(this.getPolicyOwner()) == false)
            return false;
        if (other.getPolicyId() == null ^ this.getPolicyId() == null)
            return false;
        if (other.getPolicyId() != null && other.getPolicyId().equals(this.getPolicyId()) == false)
            return false;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null
                && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getMemberAccount() == null ^ this.getMemberAccount() == null)
            return false;
        if (other.getMemberAccount() != null
                && other.getMemberAccount().equals(this.getMemberAccount()) == false)
            return false;
        if (other.getEvaluationResults() == null ^ this.getEvaluationResults() == null)
            return false;
        if (other.getEvaluationResults() != null
                && other.getEvaluationResults().equals(this.getEvaluationResults()) == false)
            return false;
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null
                && other.getLastUpdated().equals(this.getLastUpdated()) == false)
            return false;
        if (other.getIssueInfoMap() == null ^ this.getIssueInfoMap() == null)
            return false;
        if (other.getIssueInfoMap() != null
                && other.getIssueInfoMap().equals(this.getIssueInfoMap()) == false)
            return false;
        return true;
    }
}
