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
 * Details of the AWS Firewall Manager policy.
 * </p>
 */
public class PolicySummary implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     */
    private String policyArn;

    /**
     * <p>
     * The ID of the specified policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[a-z0-9A-Z-]{36}$<br/>
     */
    private String policyId;

    /**
     * <p>
     * The friendly name of the specified policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     */
    private String policyName;

    /**
     * <p>
     * The type of resource protected by or in scope of the policy. This is in
     * the format shown in the <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     * >AWS Resource Types Reference</a>. For AWS WAF and Shield Advanced,
     * examples include <code>AWS::ElasticLoadBalancingV2::LoadBalancer</code>
     * and <code>AWS::CloudFront::Distribution</code>. For a security group
     * common policy, valid values are <code>AWS::EC2::NetworkInterface</code>
     * and <code>AWS::EC2::Instance</code>. For a security group content audit
     * policy, valid values are <code>AWS::EC2::SecurityGroup</code>,
     * <code>AWS::EC2::NetworkInterface</code>, and
     * <code>AWS::EC2::Instance</code>. For a security group usage audit policy,
     * the value is <code>AWS::EC2::SecurityGroup</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     */
    private String resourceType;

    /**
     * <p>
     * The service that the policy is using to protect the resources. This
     * specifies the type of policy that is created, either an AWS WAF policy, a
     * Shield Advanced policy, or a security group policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WAF, WAFV2, SHIELD_ADVANCED,
     * SECURITY_GROUPS_COMMON, SECURITY_GROUPS_CONTENT_AUDIT,
     * SECURITY_GROUPS_USAGE_AUDIT
     */
    private String securityServiceType;

    /**
     * <p>
     * Indicates if the policy should be automatically applied to new resources.
     * </p>
     */
    private Boolean remediationEnabled;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the specified policy.
     *         </p>
     */
    public String getPolicyArn() {
        return policyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @param policyArn <p>
     *            The Amazon Resource Name (ARN) of the specified policy.
     *            </p>
     */
    public void setPolicyArn(String policyArn) {
        this.policyArn = policyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @param policyArn <p>
     *            The Amazon Resource Name (ARN) of the specified policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicySummary withPolicyArn(String policyArn) {
        this.policyArn = policyArn;
        return this;
    }

    /**
     * <p>
     * The ID of the specified policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[a-z0-9A-Z-]{36}$<br/>
     *
     * @return <p>
     *         The ID of the specified policy.
     *         </p>
     */
    public String getPolicyId() {
        return policyId;
    }

    /**
     * <p>
     * The ID of the specified policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[a-z0-9A-Z-]{36}$<br/>
     *
     * @param policyId <p>
     *            The ID of the specified policy.
     *            </p>
     */
    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    /**
     * <p>
     * The ID of the specified policy.
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
     *            The ID of the specified policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicySummary withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * <p>
     * The friendly name of the specified policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @return <p>
     *         The friendly name of the specified policy.
     *         </p>
     */
    public String getPolicyName() {
        return policyName;
    }

    /**
     * <p>
     * The friendly name of the specified policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @param policyName <p>
     *            The friendly name of the specified policy.
     *            </p>
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The friendly name of the specified policy.
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
     *            The friendly name of the specified policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicySummary withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * <p>
     * The type of resource protected by or in scope of the policy. This is in
     * the format shown in the <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     * >AWS Resource Types Reference</a>. For AWS WAF and Shield Advanced,
     * examples include <code>AWS::ElasticLoadBalancingV2::LoadBalancer</code>
     * and <code>AWS::CloudFront::Distribution</code>. For a security group
     * common policy, valid values are <code>AWS::EC2::NetworkInterface</code>
     * and <code>AWS::EC2::Instance</code>. For a security group content audit
     * policy, valid values are <code>AWS::EC2::SecurityGroup</code>,
     * <code>AWS::EC2::NetworkInterface</code>, and
     * <code>AWS::EC2::Instance</code>. For a security group usage audit policy,
     * the value is <code>AWS::EC2::SecurityGroup</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @return <p>
     *         The type of resource protected by or in scope of the policy. This
     *         is in the format shown in the <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     *         >AWS Resource Types Reference</a>. For AWS WAF and Shield
     *         Advanced, examples include
     *         <code>AWS::ElasticLoadBalancingV2::LoadBalancer</code> and
     *         <code>AWS::CloudFront::Distribution</code>. For a security group
     *         common policy, valid values are
     *         <code>AWS::EC2::NetworkInterface</code> and
     *         <code>AWS::EC2::Instance</code>. For a security group content
     *         audit policy, valid values are
     *         <code>AWS::EC2::SecurityGroup</code>,
     *         <code>AWS::EC2::NetworkInterface</code>, and
     *         <code>AWS::EC2::Instance</code>. For a security group usage audit
     *         policy, the value is <code>AWS::EC2::SecurityGroup</code>.
     *         </p>
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The type of resource protected by or in scope of the policy. This is in
     * the format shown in the <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     * >AWS Resource Types Reference</a>. For AWS WAF and Shield Advanced,
     * examples include <code>AWS::ElasticLoadBalancingV2::LoadBalancer</code>
     * and <code>AWS::CloudFront::Distribution</code>. For a security group
     * common policy, valid values are <code>AWS::EC2::NetworkInterface</code>
     * and <code>AWS::EC2::Instance</code>. For a security group content audit
     * policy, valid values are <code>AWS::EC2::SecurityGroup</code>,
     * <code>AWS::EC2::NetworkInterface</code>, and
     * <code>AWS::EC2::Instance</code>. For a security group usage audit policy,
     * the value is <code>AWS::EC2::SecurityGroup</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @param resourceType <p>
     *            The type of resource protected by or in scope of the policy.
     *            This is in the format shown in the <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     *            >AWS Resource Types Reference</a>. For AWS WAF and Shield
     *            Advanced, examples include
     *            <code>AWS::ElasticLoadBalancingV2::LoadBalancer</code> and
     *            <code>AWS::CloudFront::Distribution</code>. For a security
     *            group common policy, valid values are
     *            <code>AWS::EC2::NetworkInterface</code> and
     *            <code>AWS::EC2::Instance</code>. For a security group content
     *            audit policy, valid values are
     *            <code>AWS::EC2::SecurityGroup</code>,
     *            <code>AWS::EC2::NetworkInterface</code>, and
     *            <code>AWS::EC2::Instance</code>. For a security group usage
     *            audit policy, the value is
     *            <code>AWS::EC2::SecurityGroup</code>.
     *            </p>
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource protected by or in scope of the policy. This is in
     * the format shown in the <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     * >AWS Resource Types Reference</a>. For AWS WAF and Shield Advanced,
     * examples include <code>AWS::ElasticLoadBalancingV2::LoadBalancer</code>
     * and <code>AWS::CloudFront::Distribution</code>. For a security group
     * common policy, valid values are <code>AWS::EC2::NetworkInterface</code>
     * and <code>AWS::EC2::Instance</code>. For a security group content audit
     * policy, valid values are <code>AWS::EC2::SecurityGroup</code>,
     * <code>AWS::EC2::NetworkInterface</code>, and
     * <code>AWS::EC2::Instance</code>. For a security group usage audit policy,
     * the value is <code>AWS::EC2::SecurityGroup</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @param resourceType <p>
     *            The type of resource protected by or in scope of the policy.
     *            This is in the format shown in the <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     *            >AWS Resource Types Reference</a>. For AWS WAF and Shield
     *            Advanced, examples include
     *            <code>AWS::ElasticLoadBalancingV2::LoadBalancer</code> and
     *            <code>AWS::CloudFront::Distribution</code>. For a security
     *            group common policy, valid values are
     *            <code>AWS::EC2::NetworkInterface</code> and
     *            <code>AWS::EC2::Instance</code>. For a security group content
     *            audit policy, valid values are
     *            <code>AWS::EC2::SecurityGroup</code>,
     *            <code>AWS::EC2::NetworkInterface</code>, and
     *            <code>AWS::EC2::Instance</code>. For a security group usage
     *            audit policy, the value is
     *            <code>AWS::EC2::SecurityGroup</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicySummary withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The service that the policy is using to protect the resources. This
     * specifies the type of policy that is created, either an AWS WAF policy, a
     * Shield Advanced policy, or a security group policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WAF, WAFV2, SHIELD_ADVANCED,
     * SECURITY_GROUPS_COMMON, SECURITY_GROUPS_CONTENT_AUDIT,
     * SECURITY_GROUPS_USAGE_AUDIT
     *
     * @return <p>
     *         The service that the policy is using to protect the resources.
     *         This specifies the type of policy that is created, either an AWS
     *         WAF policy, a Shield Advanced policy, or a security group policy.
     *         </p>
     * @see SecurityServiceType
     */
    public String getSecurityServiceType() {
        return securityServiceType;
    }

    /**
     * <p>
     * The service that the policy is using to protect the resources. This
     * specifies the type of policy that is created, either an AWS WAF policy, a
     * Shield Advanced policy, or a security group policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WAF, WAFV2, SHIELD_ADVANCED,
     * SECURITY_GROUPS_COMMON, SECURITY_GROUPS_CONTENT_AUDIT,
     * SECURITY_GROUPS_USAGE_AUDIT
     *
     * @param securityServiceType <p>
     *            The service that the policy is using to protect the resources.
     *            This specifies the type of policy that is created, either an
     *            AWS WAF policy, a Shield Advanced policy, or a security group
     *            policy.
     *            </p>
     * @see SecurityServiceType
     */
    public void setSecurityServiceType(String securityServiceType) {
        this.securityServiceType = securityServiceType;
    }

    /**
     * <p>
     * The service that the policy is using to protect the resources. This
     * specifies the type of policy that is created, either an AWS WAF policy, a
     * Shield Advanced policy, or a security group policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WAF, WAFV2, SHIELD_ADVANCED,
     * SECURITY_GROUPS_COMMON, SECURITY_GROUPS_CONTENT_AUDIT,
     * SECURITY_GROUPS_USAGE_AUDIT
     *
     * @param securityServiceType <p>
     *            The service that the policy is using to protect the resources.
     *            This specifies the type of policy that is created, either an
     *            AWS WAF policy, a Shield Advanced policy, or a security group
     *            policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SecurityServiceType
     */
    public PolicySummary withSecurityServiceType(String securityServiceType) {
        this.securityServiceType = securityServiceType;
        return this;
    }

    /**
     * <p>
     * The service that the policy is using to protect the resources. This
     * specifies the type of policy that is created, either an AWS WAF policy, a
     * Shield Advanced policy, or a security group policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WAF, WAFV2, SHIELD_ADVANCED,
     * SECURITY_GROUPS_COMMON, SECURITY_GROUPS_CONTENT_AUDIT,
     * SECURITY_GROUPS_USAGE_AUDIT
     *
     * @param securityServiceType <p>
     *            The service that the policy is using to protect the resources.
     *            This specifies the type of policy that is created, either an
     *            AWS WAF policy, a Shield Advanced policy, or a security group
     *            policy.
     *            </p>
     * @see SecurityServiceType
     */
    public void setSecurityServiceType(SecurityServiceType securityServiceType) {
        this.securityServiceType = securityServiceType.toString();
    }

    /**
     * <p>
     * The service that the policy is using to protect the resources. This
     * specifies the type of policy that is created, either an AWS WAF policy, a
     * Shield Advanced policy, or a security group policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WAF, WAFV2, SHIELD_ADVANCED,
     * SECURITY_GROUPS_COMMON, SECURITY_GROUPS_CONTENT_AUDIT,
     * SECURITY_GROUPS_USAGE_AUDIT
     *
     * @param securityServiceType <p>
     *            The service that the policy is using to protect the resources.
     *            This specifies the type of policy that is created, either an
     *            AWS WAF policy, a Shield Advanced policy, or a security group
     *            policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SecurityServiceType
     */
    public PolicySummary withSecurityServiceType(SecurityServiceType securityServiceType) {
        this.securityServiceType = securityServiceType.toString();
        return this;
    }

    /**
     * <p>
     * Indicates if the policy should be automatically applied to new resources.
     * </p>
     *
     * @return <p>
     *         Indicates if the policy should be automatically applied to new
     *         resources.
     *         </p>
     */
    public Boolean isRemediationEnabled() {
        return remediationEnabled;
    }

    /**
     * <p>
     * Indicates if the policy should be automatically applied to new resources.
     * </p>
     *
     * @return <p>
     *         Indicates if the policy should be automatically applied to new
     *         resources.
     *         </p>
     */
    public Boolean getRemediationEnabled() {
        return remediationEnabled;
    }

    /**
     * <p>
     * Indicates if the policy should be automatically applied to new resources.
     * </p>
     *
     * @param remediationEnabled <p>
     *            Indicates if the policy should be automatically applied to new
     *            resources.
     *            </p>
     */
    public void setRemediationEnabled(Boolean remediationEnabled) {
        this.remediationEnabled = remediationEnabled;
    }

    /**
     * <p>
     * Indicates if the policy should be automatically applied to new resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param remediationEnabled <p>
     *            Indicates if the policy should be automatically applied to new
     *            resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicySummary withRemediationEnabled(Boolean remediationEnabled) {
        this.remediationEnabled = remediationEnabled;
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
        if (getPolicyArn() != null)
            sb.append("PolicyArn: " + getPolicyArn() + ",");
        if (getPolicyId() != null)
            sb.append("PolicyId: " + getPolicyId() + ",");
        if (getPolicyName() != null)
            sb.append("PolicyName: " + getPolicyName() + ",");
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType() + ",");
        if (getSecurityServiceType() != null)
            sb.append("SecurityServiceType: " + getSecurityServiceType() + ",");
        if (getRemediationEnabled() != null)
            sb.append("RemediationEnabled: " + getRemediationEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyArn() == null) ? 0 : getPolicyArn().hashCode());
        hashCode = prime * hashCode + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode());
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityServiceType() == null) ? 0 : getSecurityServiceType().hashCode());
        hashCode = prime * hashCode
                + ((getRemediationEnabled() == null) ? 0 : getRemediationEnabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicySummary == false)
            return false;
        PolicySummary other = (PolicySummary) obj;

        if (other.getPolicyArn() == null ^ this.getPolicyArn() == null)
            return false;
        if (other.getPolicyArn() != null
                && other.getPolicyArn().equals(this.getPolicyArn()) == false)
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
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getSecurityServiceType() == null ^ this.getSecurityServiceType() == null)
            return false;
        if (other.getSecurityServiceType() != null
                && other.getSecurityServiceType().equals(this.getSecurityServiceType()) == false)
            return false;
        if (other.getRemediationEnabled() == null ^ this.getRemediationEnabled() == null)
            return false;
        if (other.getRemediationEnabled() != null
                && other.getRemediationEnabled().equals(this.getRemediationEnabled()) == false)
            return false;
        return true;
    }
}
