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
 * An AWS Firewall Manager policy.
 * </p>
 */
public class Policy implements Serializable {
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
     * A unique identifier for each update to the policy. When issuing a
     * <code>PutPolicy</code> request, the <code>PolicyUpdateToken</code> in the
     * request must match the <code>PolicyUpdateToken</code> of the current
     * policy version. To get the <code>PolicyUpdateToken</code> of the current
     * policy version, use a <code>GetPolicy</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     */
    private String policyUpdateToken;

    /**
     * <p>
     * Details about the security service that is being used to protect the
     * resources.
     * </p>
     */
    private SecurityServicePolicyData securityServicePolicyData;

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
     * An array of <code>ResourceType</code>.
     * </p>
     */
    private java.util.List<String> resourceTypeList;

    /**
     * <p>
     * An array of <code>ResourceTag</code> objects.
     * </p>
     */
    private java.util.List<ResourceTag> resourceTags;

    /**
     * <p>
     * If set to <code>True</code>, resources with the tags that are specified
     * in the <code>ResourceTag</code> array are not in scope of the policy. If
     * set to <code>False</code>, and the <code>ResourceTag</code> array is not
     * null, only resources with the specified tags are in scope of the policy.
     * </p>
     */
    private Boolean excludeResourceTags;

    /**
     * <p>
     * Indicates if the policy should be automatically applied to new resources.
     * </p>
     */
    private Boolean remediationEnabled;

    /**
     * <p>
     * Specifies the AWS account IDs and AWS Organizations organizational units
     * (OUs) to include in the policy. Specifying an OU is the equivalent of
     * specifying all accounts in the OU and in any of its child OUs, including
     * any child OUs and accounts that are added at a later time.
     * </p>
     * <p>
     * You can specify inclusions or exclusions, but not both. If you specify an
     * <code>IncludeMap</code>, AWS Firewall Manager applies the policy to all
     * accounts specified by the <code>IncludeMap</code>, and does not evaluate
     * any <code>ExcludeMap</code> specifications. If you do not specify an
     * <code>IncludeMap</code>, then Firewall Manager applies the policy to all
     * accounts except for those specified by the <code>ExcludeMap</code>.
     * </p>
     * <p>
     * You can specify account IDs, OUs, or a combination:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify account IDs by setting the key to <code>ACCOUNT</code>. For
     * example, the following is a valid map:
     * <code>{“ACCOUNT” : [“accountID1”, “accountID2”]}</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify OUs by setting the key to <code>ORG_UNIT</code>. For example, the
     * following is a valid map:
     * <code>{“ORG_UNIT” : [“ouid111”, “ouid112”]}</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify accounts and OUs together in a single map, separated with a
     * comma. For example, the following is a valid map:
     * <code>{“ACCOUNT” : [“accountID1”, “accountID2”], “ORG_UNIT” : [“ouid111”, “ouid112”]}</code>
     * .
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, java.util.List<String>> includeMap;

    /**
     * <p>
     * Specifies the AWS account IDs and AWS Organizations organizational units
     * (OUs) to exclude from the policy. Specifying an OU is the equivalent of
     * specifying all accounts in the OU and in any of its child OUs, including
     * any child OUs and accounts that are added at a later time.
     * </p>
     * <p>
     * You can specify inclusions or exclusions, but not both. If you specify an
     * <code>IncludeMap</code>, AWS Firewall Manager applies the policy to all
     * accounts specified by the <code>IncludeMap</code>, and does not evaluate
     * any <code>ExcludeMap</code> specifications. If you do not specify an
     * <code>IncludeMap</code>, then Firewall Manager applies the policy to all
     * accounts except for those specified by the <code>ExcludeMap</code>.
     * </p>
     * <p>
     * You can specify account IDs, OUs, or a combination:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify account IDs by setting the key to <code>ACCOUNT</code>. For
     * example, the following is a valid map:
     * <code>{“ACCOUNT” : [“accountID1”, “accountID2”]}</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify OUs by setting the key to <code>ORG_UNIT</code>. For example, the
     * following is a valid map:
     * <code>{“ORG_UNIT” : [“ouid111”, “ouid112”]}</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify accounts and OUs together in a single map, separated with a
     * comma. For example, the following is a valid map:
     * <code>{“ACCOUNT” : [“accountID1”, “accountID2”], “ORG_UNIT” : [“ouid111”, “ouid112”]}</code>
     * .
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, java.util.List<String>> excludeMap;

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
    public Policy withPolicyId(String policyId) {
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
    public Policy withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * <p>
     * A unique identifier for each update to the policy. When issuing a
     * <code>PutPolicy</code> request, the <code>PolicyUpdateToken</code> in the
     * request must match the <code>PolicyUpdateToken</code> of the current
     * policy version. To get the <code>PolicyUpdateToken</code> of the current
     * policy version, use a <code>GetPolicy</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @return <p>
     *         A unique identifier for each update to the policy. When issuing a
     *         <code>PutPolicy</code> request, the
     *         <code>PolicyUpdateToken</code> in the request must match the
     *         <code>PolicyUpdateToken</code> of the current policy version. To
     *         get the <code>PolicyUpdateToken</code> of the current policy
     *         version, use a <code>GetPolicy</code> request.
     *         </p>
     */
    public String getPolicyUpdateToken() {
        return policyUpdateToken;
    }

    /**
     * <p>
     * A unique identifier for each update to the policy. When issuing a
     * <code>PutPolicy</code> request, the <code>PolicyUpdateToken</code> in the
     * request must match the <code>PolicyUpdateToken</code> of the current
     * policy version. To get the <code>PolicyUpdateToken</code> of the current
     * policy version, use a <code>GetPolicy</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @param policyUpdateToken <p>
     *            A unique identifier for each update to the policy. When
     *            issuing a <code>PutPolicy</code> request, the
     *            <code>PolicyUpdateToken</code> in the request must match the
     *            <code>PolicyUpdateToken</code> of the current policy version.
     *            To get the <code>PolicyUpdateToken</code> of the current
     *            policy version, use a <code>GetPolicy</code> request.
     *            </p>
     */
    public void setPolicyUpdateToken(String policyUpdateToken) {
        this.policyUpdateToken = policyUpdateToken;
    }

    /**
     * <p>
     * A unique identifier for each update to the policy. When issuing a
     * <code>PutPolicy</code> request, the <code>PolicyUpdateToken</code> in the
     * request must match the <code>PolicyUpdateToken</code> of the current
     * policy version. To get the <code>PolicyUpdateToken</code> of the current
     * policy version, use a <code>GetPolicy</code> request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @param policyUpdateToken <p>
     *            A unique identifier for each update to the policy. When
     *            issuing a <code>PutPolicy</code> request, the
     *            <code>PolicyUpdateToken</code> in the request must match the
     *            <code>PolicyUpdateToken</code> of the current policy version.
     *            To get the <code>PolicyUpdateToken</code> of the current
     *            policy version, use a <code>GetPolicy</code> request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Policy withPolicyUpdateToken(String policyUpdateToken) {
        this.policyUpdateToken = policyUpdateToken;
        return this;
    }

    /**
     * <p>
     * Details about the security service that is being used to protect the
     * resources.
     * </p>
     *
     * @return <p>
     *         Details about the security service that is being used to protect
     *         the resources.
     *         </p>
     */
    public SecurityServicePolicyData getSecurityServicePolicyData() {
        return securityServicePolicyData;
    }

    /**
     * <p>
     * Details about the security service that is being used to protect the
     * resources.
     * </p>
     *
     * @param securityServicePolicyData <p>
     *            Details about the security service that is being used to
     *            protect the resources.
     *            </p>
     */
    public void setSecurityServicePolicyData(SecurityServicePolicyData securityServicePolicyData) {
        this.securityServicePolicyData = securityServicePolicyData;
    }

    /**
     * <p>
     * Details about the security service that is being used to protect the
     * resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityServicePolicyData <p>
     *            Details about the security service that is being used to
     *            protect the resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Policy withSecurityServicePolicyData(SecurityServicePolicyData securityServicePolicyData) {
        this.securityServicePolicyData = securityServicePolicyData;
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
    public Policy withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * An array of <code>ResourceType</code>.
     * </p>
     *
     * @return <p>
     *         An array of <code>ResourceType</code>.
     *         </p>
     */
    public java.util.List<String> getResourceTypeList() {
        return resourceTypeList;
    }

    /**
     * <p>
     * An array of <code>ResourceType</code>.
     * </p>
     *
     * @param resourceTypeList <p>
     *            An array of <code>ResourceType</code>.
     *            </p>
     */
    public void setResourceTypeList(java.util.Collection<String> resourceTypeList) {
        if (resourceTypeList == null) {
            this.resourceTypeList = null;
            return;
        }

        this.resourceTypeList = new java.util.ArrayList<String>(resourceTypeList);
    }

    /**
     * <p>
     * An array of <code>ResourceType</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceTypeList <p>
     *            An array of <code>ResourceType</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Policy withResourceTypeList(String... resourceTypeList) {
        if (getResourceTypeList() == null) {
            this.resourceTypeList = new java.util.ArrayList<String>(resourceTypeList.length);
        }
        for (String value : resourceTypeList) {
            this.resourceTypeList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>ResourceType</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceTypeList <p>
     *            An array of <code>ResourceType</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Policy withResourceTypeList(java.util.Collection<String> resourceTypeList) {
        setResourceTypeList(resourceTypeList);
        return this;
    }

    /**
     * <p>
     * An array of <code>ResourceTag</code> objects.
     * </p>
     *
     * @return <p>
     *         An array of <code>ResourceTag</code> objects.
     *         </p>
     */
    public java.util.List<ResourceTag> getResourceTags() {
        return resourceTags;
    }

    /**
     * <p>
     * An array of <code>ResourceTag</code> objects.
     * </p>
     *
     * @param resourceTags <p>
     *            An array of <code>ResourceTag</code> objects.
     *            </p>
     */
    public void setResourceTags(java.util.Collection<ResourceTag> resourceTags) {
        if (resourceTags == null) {
            this.resourceTags = null;
            return;
        }

        this.resourceTags = new java.util.ArrayList<ResourceTag>(resourceTags);
    }

    /**
     * <p>
     * An array of <code>ResourceTag</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceTags <p>
     *            An array of <code>ResourceTag</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Policy withResourceTags(ResourceTag... resourceTags) {
        if (getResourceTags() == null) {
            this.resourceTags = new java.util.ArrayList<ResourceTag>(resourceTags.length);
        }
        for (ResourceTag value : resourceTags) {
            this.resourceTags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>ResourceTag</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceTags <p>
     *            An array of <code>ResourceTag</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Policy withResourceTags(java.util.Collection<ResourceTag> resourceTags) {
        setResourceTags(resourceTags);
        return this;
    }

    /**
     * <p>
     * If set to <code>True</code>, resources with the tags that are specified
     * in the <code>ResourceTag</code> array are not in scope of the policy. If
     * set to <code>False</code>, and the <code>ResourceTag</code> array is not
     * null, only resources with the specified tags are in scope of the policy.
     * </p>
     *
     * @return <p>
     *         If set to <code>True</code>, resources with the tags that are
     *         specified in the <code>ResourceTag</code> array are not in scope
     *         of the policy. If set to <code>False</code>, and the
     *         <code>ResourceTag</code> array is not null, only resources with
     *         the specified tags are in scope of the policy.
     *         </p>
     */
    public Boolean isExcludeResourceTags() {
        return excludeResourceTags;
    }

    /**
     * <p>
     * If set to <code>True</code>, resources with the tags that are specified
     * in the <code>ResourceTag</code> array are not in scope of the policy. If
     * set to <code>False</code>, and the <code>ResourceTag</code> array is not
     * null, only resources with the specified tags are in scope of the policy.
     * </p>
     *
     * @return <p>
     *         If set to <code>True</code>, resources with the tags that are
     *         specified in the <code>ResourceTag</code> array are not in scope
     *         of the policy. If set to <code>False</code>, and the
     *         <code>ResourceTag</code> array is not null, only resources with
     *         the specified tags are in scope of the policy.
     *         </p>
     */
    public Boolean getExcludeResourceTags() {
        return excludeResourceTags;
    }

    /**
     * <p>
     * If set to <code>True</code>, resources with the tags that are specified
     * in the <code>ResourceTag</code> array are not in scope of the policy. If
     * set to <code>False</code>, and the <code>ResourceTag</code> array is not
     * null, only resources with the specified tags are in scope of the policy.
     * </p>
     *
     * @param excludeResourceTags <p>
     *            If set to <code>True</code>, resources with the tags that are
     *            specified in the <code>ResourceTag</code> array are not in
     *            scope of the policy. If set to <code>False</code>, and the
     *            <code>ResourceTag</code> array is not null, only resources
     *            with the specified tags are in scope of the policy.
     *            </p>
     */
    public void setExcludeResourceTags(Boolean excludeResourceTags) {
        this.excludeResourceTags = excludeResourceTags;
    }

    /**
     * <p>
     * If set to <code>True</code>, resources with the tags that are specified
     * in the <code>ResourceTag</code> array are not in scope of the policy. If
     * set to <code>False</code>, and the <code>ResourceTag</code> array is not
     * null, only resources with the specified tags are in scope of the policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param excludeResourceTags <p>
     *            If set to <code>True</code>, resources with the tags that are
     *            specified in the <code>ResourceTag</code> array are not in
     *            scope of the policy. If set to <code>False</code>, and the
     *            <code>ResourceTag</code> array is not null, only resources
     *            with the specified tags are in scope of the policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Policy withExcludeResourceTags(Boolean excludeResourceTags) {
        this.excludeResourceTags = excludeResourceTags;
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
    public Policy withRemediationEnabled(Boolean remediationEnabled) {
        this.remediationEnabled = remediationEnabled;
        return this;
    }

    /**
     * <p>
     * Specifies the AWS account IDs and AWS Organizations organizational units
     * (OUs) to include in the policy. Specifying an OU is the equivalent of
     * specifying all accounts in the OU and in any of its child OUs, including
     * any child OUs and accounts that are added at a later time.
     * </p>
     * <p>
     * You can specify inclusions or exclusions, but not both. If you specify an
     * <code>IncludeMap</code>, AWS Firewall Manager applies the policy to all
     * accounts specified by the <code>IncludeMap</code>, and does not evaluate
     * any <code>ExcludeMap</code> specifications. If you do not specify an
     * <code>IncludeMap</code>, then Firewall Manager applies the policy to all
     * accounts except for those specified by the <code>ExcludeMap</code>.
     * </p>
     * <p>
     * You can specify account IDs, OUs, or a combination:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify account IDs by setting the key to <code>ACCOUNT</code>. For
     * example, the following is a valid map:
     * <code>{“ACCOUNT” : [“accountID1”, “accountID2”]}</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify OUs by setting the key to <code>ORG_UNIT</code>. For example, the
     * following is a valid map:
     * <code>{“ORG_UNIT” : [“ouid111”, “ouid112”]}</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify accounts and OUs together in a single map, separated with a
     * comma. For example, the following is a valid map:
     * <code>{“ACCOUNT” : [“accountID1”, “accountID2”], “ORG_UNIT” : [“ouid111”, “ouid112”]}</code>
     * .
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Specifies the AWS account IDs and AWS Organizations
     *         organizational units (OUs) to include in the policy. Specifying
     *         an OU is the equivalent of specifying all accounts in the OU and
     *         in any of its child OUs, including any child OUs and accounts
     *         that are added at a later time.
     *         </p>
     *         <p>
     *         You can specify inclusions or exclusions, but not both. If you
     *         specify an <code>IncludeMap</code>, AWS Firewall Manager applies
     *         the policy to all accounts specified by the
     *         <code>IncludeMap</code>, and does not evaluate any
     *         <code>ExcludeMap</code> specifications. If you do not specify an
     *         <code>IncludeMap</code>, then Firewall Manager applies the policy
     *         to all accounts except for those specified by the
     *         <code>ExcludeMap</code>.
     *         </p>
     *         <p>
     *         You can specify account IDs, OUs, or a combination:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Specify account IDs by setting the key to <code>ACCOUNT</code>.
     *         For example, the following is a valid map:
     *         <code>{“ACCOUNT” : [“accountID1”, “accountID2”]}</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specify OUs by setting the key to <code>ORG_UNIT</code>. For
     *         example, the following is a valid map:
     *         <code>{“ORG_UNIT” : [“ouid111”, “ouid112”]}</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specify accounts and OUs together in a single map, separated with
     *         a comma. For example, the following is a valid map:
     *         <code>{“ACCOUNT” : [“accountID1”, “accountID2”], “ORG_UNIT” : [“ouid111”, “ouid112”]}</code>
     *         .
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.Map<String, java.util.List<String>> getIncludeMap() {
        return includeMap;
    }

    /**
     * <p>
     * Specifies the AWS account IDs and AWS Organizations organizational units
     * (OUs) to include in the policy. Specifying an OU is the equivalent of
     * specifying all accounts in the OU and in any of its child OUs, including
     * any child OUs and accounts that are added at a later time.
     * </p>
     * <p>
     * You can specify inclusions or exclusions, but not both. If you specify an
     * <code>IncludeMap</code>, AWS Firewall Manager applies the policy to all
     * accounts specified by the <code>IncludeMap</code>, and does not evaluate
     * any <code>ExcludeMap</code> specifications. If you do not specify an
     * <code>IncludeMap</code>, then Firewall Manager applies the policy to all
     * accounts except for those specified by the <code>ExcludeMap</code>.
     * </p>
     * <p>
     * You can specify account IDs, OUs, or a combination:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify account IDs by setting the key to <code>ACCOUNT</code>. For
     * example, the following is a valid map:
     * <code>{“ACCOUNT” : [“accountID1”, “accountID2”]}</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify OUs by setting the key to <code>ORG_UNIT</code>. For example, the
     * following is a valid map:
     * <code>{“ORG_UNIT” : [“ouid111”, “ouid112”]}</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify accounts and OUs together in a single map, separated with a
     * comma. For example, the following is a valid map:
     * <code>{“ACCOUNT” : [“accountID1”, “accountID2”], “ORG_UNIT” : [“ouid111”, “ouid112”]}</code>
     * .
     * </p>
     * </li>
     * </ul>
     *
     * @param includeMap <p>
     *            Specifies the AWS account IDs and AWS Organizations
     *            organizational units (OUs) to include in the policy.
     *            Specifying an OU is the equivalent of specifying all accounts
     *            in the OU and in any of its child OUs, including any child OUs
     *            and accounts that are added at a later time.
     *            </p>
     *            <p>
     *            You can specify inclusions or exclusions, but not both. If you
     *            specify an <code>IncludeMap</code>, AWS Firewall Manager
     *            applies the policy to all accounts specified by the
     *            <code>IncludeMap</code>, and does not evaluate any
     *            <code>ExcludeMap</code> specifications. If you do not specify
     *            an <code>IncludeMap</code>, then Firewall Manager applies the
     *            policy to all accounts except for those specified by the
     *            <code>ExcludeMap</code>.
     *            </p>
     *            <p>
     *            You can specify account IDs, OUs, or a combination:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Specify account IDs by setting the key to <code>ACCOUNT</code>
     *            . For example, the following is a valid map:
     *            <code>{“ACCOUNT” : [“accountID1”, “accountID2”]}</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Specify OUs by setting the key to <code>ORG_UNIT</code>. For
     *            example, the following is a valid map:
     *            <code>{“ORG_UNIT” : [“ouid111”, “ouid112”]}</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Specify accounts and OUs together in a single map, separated
     *            with a comma. For example, the following is a valid map:
     *            <code>{“ACCOUNT” : [“accountID1”, “accountID2”], “ORG_UNIT” : [“ouid111”, “ouid112”]}</code>
     *            .
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setIncludeMap(java.util.Map<String, java.util.List<String>> includeMap) {
        this.includeMap = includeMap;
    }

    /**
     * <p>
     * Specifies the AWS account IDs and AWS Organizations organizational units
     * (OUs) to include in the policy. Specifying an OU is the equivalent of
     * specifying all accounts in the OU and in any of its child OUs, including
     * any child OUs and accounts that are added at a later time.
     * </p>
     * <p>
     * You can specify inclusions or exclusions, but not both. If you specify an
     * <code>IncludeMap</code>, AWS Firewall Manager applies the policy to all
     * accounts specified by the <code>IncludeMap</code>, and does not evaluate
     * any <code>ExcludeMap</code> specifications. If you do not specify an
     * <code>IncludeMap</code>, then Firewall Manager applies the policy to all
     * accounts except for those specified by the <code>ExcludeMap</code>.
     * </p>
     * <p>
     * You can specify account IDs, OUs, or a combination:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify account IDs by setting the key to <code>ACCOUNT</code>. For
     * example, the following is a valid map:
     * <code>{“ACCOUNT” : [“accountID1”, “accountID2”]}</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify OUs by setting the key to <code>ORG_UNIT</code>. For example, the
     * following is a valid map:
     * <code>{“ORG_UNIT” : [“ouid111”, “ouid112”]}</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify accounts and OUs together in a single map, separated with a
     * comma. For example, the following is a valid map:
     * <code>{“ACCOUNT” : [“accountID1”, “accountID2”], “ORG_UNIT” : [“ouid111”, “ouid112”]}</code>
     * .
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param includeMap <p>
     *            Specifies the AWS account IDs and AWS Organizations
     *            organizational units (OUs) to include in the policy.
     *            Specifying an OU is the equivalent of specifying all accounts
     *            in the OU and in any of its child OUs, including any child OUs
     *            and accounts that are added at a later time.
     *            </p>
     *            <p>
     *            You can specify inclusions or exclusions, but not both. If you
     *            specify an <code>IncludeMap</code>, AWS Firewall Manager
     *            applies the policy to all accounts specified by the
     *            <code>IncludeMap</code>, and does not evaluate any
     *            <code>ExcludeMap</code> specifications. If you do not specify
     *            an <code>IncludeMap</code>, then Firewall Manager applies the
     *            policy to all accounts except for those specified by the
     *            <code>ExcludeMap</code>.
     *            </p>
     *            <p>
     *            You can specify account IDs, OUs, or a combination:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Specify account IDs by setting the key to <code>ACCOUNT</code>
     *            . For example, the following is a valid map:
     *            <code>{“ACCOUNT” : [“accountID1”, “accountID2”]}</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Specify OUs by setting the key to <code>ORG_UNIT</code>. For
     *            example, the following is a valid map:
     *            <code>{“ORG_UNIT” : [“ouid111”, “ouid112”]}</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Specify accounts and OUs together in a single map, separated
     *            with a comma. For example, the following is a valid map:
     *            <code>{“ACCOUNT” : [“accountID1”, “accountID2”], “ORG_UNIT” : [“ouid111”, “ouid112”]}</code>
     *            .
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Policy withIncludeMap(java.util.Map<String, java.util.List<String>> includeMap) {
        this.includeMap = includeMap;
        return this;
    }

    /**
     * <p>
     * Specifies the AWS account IDs and AWS Organizations organizational units
     * (OUs) to include in the policy. Specifying an OU is the equivalent of
     * specifying all accounts in the OU and in any of its child OUs, including
     * any child OUs and accounts that are added at a later time.
     * </p>
     * <p>
     * You can specify inclusions or exclusions, but not both. If you specify an
     * <code>IncludeMap</code>, AWS Firewall Manager applies the policy to all
     * accounts specified by the <code>IncludeMap</code>, and does not evaluate
     * any <code>ExcludeMap</code> specifications. If you do not specify an
     * <code>IncludeMap</code>, then Firewall Manager applies the policy to all
     * accounts except for those specified by the <code>ExcludeMap</code>.
     * </p>
     * <p>
     * You can specify account IDs, OUs, or a combination:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify account IDs by setting the key to <code>ACCOUNT</code>. For
     * example, the following is a valid map:
     * <code>{“ACCOUNT” : [“accountID1”, “accountID2”]}</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify OUs by setting the key to <code>ORG_UNIT</code>. For example, the
     * following is a valid map:
     * <code>{“ORG_UNIT” : [“ouid111”, “ouid112”]}</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify accounts and OUs together in a single map, separated with a
     * comma. For example, the following is a valid map:
     * <code>{“ACCOUNT” : [“accountID1”, “accountID2”], “ORG_UNIT” : [“ouid111”, “ouid112”]}</code>
     * .
     * </p>
     * </li>
     * </ul>
     * <p>
     * The method adds a new key-value pair into IncludeMap parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into IncludeMap.
     * @param value The corresponding value of the entry to be added into
     *            IncludeMap.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Policy addIncludeMapEntry(String key, java.util.List<String> value) {
        if (null == this.includeMap) {
            this.includeMap = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.includeMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.includeMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into IncludeMap.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public Policy clearIncludeMapEntries() {
        this.includeMap = null;
        return this;
    }

    /**
     * <p>
     * Specifies the AWS account IDs and AWS Organizations organizational units
     * (OUs) to exclude from the policy. Specifying an OU is the equivalent of
     * specifying all accounts in the OU and in any of its child OUs, including
     * any child OUs and accounts that are added at a later time.
     * </p>
     * <p>
     * You can specify inclusions or exclusions, but not both. If you specify an
     * <code>IncludeMap</code>, AWS Firewall Manager applies the policy to all
     * accounts specified by the <code>IncludeMap</code>, and does not evaluate
     * any <code>ExcludeMap</code> specifications. If you do not specify an
     * <code>IncludeMap</code>, then Firewall Manager applies the policy to all
     * accounts except for those specified by the <code>ExcludeMap</code>.
     * </p>
     * <p>
     * You can specify account IDs, OUs, or a combination:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify account IDs by setting the key to <code>ACCOUNT</code>. For
     * example, the following is a valid map:
     * <code>{“ACCOUNT” : [“accountID1”, “accountID2”]}</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify OUs by setting the key to <code>ORG_UNIT</code>. For example, the
     * following is a valid map:
     * <code>{“ORG_UNIT” : [“ouid111”, “ouid112”]}</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify accounts and OUs together in a single map, separated with a
     * comma. For example, the following is a valid map:
     * <code>{“ACCOUNT” : [“accountID1”, “accountID2”], “ORG_UNIT” : [“ouid111”, “ouid112”]}</code>
     * .
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Specifies the AWS account IDs and AWS Organizations
     *         organizational units (OUs) to exclude from the policy. Specifying
     *         an OU is the equivalent of specifying all accounts in the OU and
     *         in any of its child OUs, including any child OUs and accounts
     *         that are added at a later time.
     *         </p>
     *         <p>
     *         You can specify inclusions or exclusions, but not both. If you
     *         specify an <code>IncludeMap</code>, AWS Firewall Manager applies
     *         the policy to all accounts specified by the
     *         <code>IncludeMap</code>, and does not evaluate any
     *         <code>ExcludeMap</code> specifications. If you do not specify an
     *         <code>IncludeMap</code>, then Firewall Manager applies the policy
     *         to all accounts except for those specified by the
     *         <code>ExcludeMap</code>.
     *         </p>
     *         <p>
     *         You can specify account IDs, OUs, or a combination:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Specify account IDs by setting the key to <code>ACCOUNT</code>.
     *         For example, the following is a valid map:
     *         <code>{“ACCOUNT” : [“accountID1”, “accountID2”]}</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specify OUs by setting the key to <code>ORG_UNIT</code>. For
     *         example, the following is a valid map:
     *         <code>{“ORG_UNIT” : [“ouid111”, “ouid112”]}</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specify accounts and OUs together in a single map, separated with
     *         a comma. For example, the following is a valid map:
     *         <code>{“ACCOUNT” : [“accountID1”, “accountID2”], “ORG_UNIT” : [“ouid111”, “ouid112”]}</code>
     *         .
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.Map<String, java.util.List<String>> getExcludeMap() {
        return excludeMap;
    }

    /**
     * <p>
     * Specifies the AWS account IDs and AWS Organizations organizational units
     * (OUs) to exclude from the policy. Specifying an OU is the equivalent of
     * specifying all accounts in the OU and in any of its child OUs, including
     * any child OUs and accounts that are added at a later time.
     * </p>
     * <p>
     * You can specify inclusions or exclusions, but not both. If you specify an
     * <code>IncludeMap</code>, AWS Firewall Manager applies the policy to all
     * accounts specified by the <code>IncludeMap</code>, and does not evaluate
     * any <code>ExcludeMap</code> specifications. If you do not specify an
     * <code>IncludeMap</code>, then Firewall Manager applies the policy to all
     * accounts except for those specified by the <code>ExcludeMap</code>.
     * </p>
     * <p>
     * You can specify account IDs, OUs, or a combination:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify account IDs by setting the key to <code>ACCOUNT</code>. For
     * example, the following is a valid map:
     * <code>{“ACCOUNT” : [“accountID1”, “accountID2”]}</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify OUs by setting the key to <code>ORG_UNIT</code>. For example, the
     * following is a valid map:
     * <code>{“ORG_UNIT” : [“ouid111”, “ouid112”]}</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify accounts and OUs together in a single map, separated with a
     * comma. For example, the following is a valid map:
     * <code>{“ACCOUNT” : [“accountID1”, “accountID2”], “ORG_UNIT” : [“ouid111”, “ouid112”]}</code>
     * .
     * </p>
     * </li>
     * </ul>
     *
     * @param excludeMap <p>
     *            Specifies the AWS account IDs and AWS Organizations
     *            organizational units (OUs) to exclude from the policy.
     *            Specifying an OU is the equivalent of specifying all accounts
     *            in the OU and in any of its child OUs, including any child OUs
     *            and accounts that are added at a later time.
     *            </p>
     *            <p>
     *            You can specify inclusions or exclusions, but not both. If you
     *            specify an <code>IncludeMap</code>, AWS Firewall Manager
     *            applies the policy to all accounts specified by the
     *            <code>IncludeMap</code>, and does not evaluate any
     *            <code>ExcludeMap</code> specifications. If you do not specify
     *            an <code>IncludeMap</code>, then Firewall Manager applies the
     *            policy to all accounts except for those specified by the
     *            <code>ExcludeMap</code>.
     *            </p>
     *            <p>
     *            You can specify account IDs, OUs, or a combination:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Specify account IDs by setting the key to <code>ACCOUNT</code>
     *            . For example, the following is a valid map:
     *            <code>{“ACCOUNT” : [“accountID1”, “accountID2”]}</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Specify OUs by setting the key to <code>ORG_UNIT</code>. For
     *            example, the following is a valid map:
     *            <code>{“ORG_UNIT” : [“ouid111”, “ouid112”]}</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Specify accounts and OUs together in a single map, separated
     *            with a comma. For example, the following is a valid map:
     *            <code>{“ACCOUNT” : [“accountID1”, “accountID2”], “ORG_UNIT” : [“ouid111”, “ouid112”]}</code>
     *            .
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setExcludeMap(java.util.Map<String, java.util.List<String>> excludeMap) {
        this.excludeMap = excludeMap;
    }

    /**
     * <p>
     * Specifies the AWS account IDs and AWS Organizations organizational units
     * (OUs) to exclude from the policy. Specifying an OU is the equivalent of
     * specifying all accounts in the OU and in any of its child OUs, including
     * any child OUs and accounts that are added at a later time.
     * </p>
     * <p>
     * You can specify inclusions or exclusions, but not both. If you specify an
     * <code>IncludeMap</code>, AWS Firewall Manager applies the policy to all
     * accounts specified by the <code>IncludeMap</code>, and does not evaluate
     * any <code>ExcludeMap</code> specifications. If you do not specify an
     * <code>IncludeMap</code>, then Firewall Manager applies the policy to all
     * accounts except for those specified by the <code>ExcludeMap</code>.
     * </p>
     * <p>
     * You can specify account IDs, OUs, or a combination:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify account IDs by setting the key to <code>ACCOUNT</code>. For
     * example, the following is a valid map:
     * <code>{“ACCOUNT” : [“accountID1”, “accountID2”]}</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify OUs by setting the key to <code>ORG_UNIT</code>. For example, the
     * following is a valid map:
     * <code>{“ORG_UNIT” : [“ouid111”, “ouid112”]}</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify accounts and OUs together in a single map, separated with a
     * comma. For example, the following is a valid map:
     * <code>{“ACCOUNT” : [“accountID1”, “accountID2”], “ORG_UNIT” : [“ouid111”, “ouid112”]}</code>
     * .
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param excludeMap <p>
     *            Specifies the AWS account IDs and AWS Organizations
     *            organizational units (OUs) to exclude from the policy.
     *            Specifying an OU is the equivalent of specifying all accounts
     *            in the OU and in any of its child OUs, including any child OUs
     *            and accounts that are added at a later time.
     *            </p>
     *            <p>
     *            You can specify inclusions or exclusions, but not both. If you
     *            specify an <code>IncludeMap</code>, AWS Firewall Manager
     *            applies the policy to all accounts specified by the
     *            <code>IncludeMap</code>, and does not evaluate any
     *            <code>ExcludeMap</code> specifications. If you do not specify
     *            an <code>IncludeMap</code>, then Firewall Manager applies the
     *            policy to all accounts except for those specified by the
     *            <code>ExcludeMap</code>.
     *            </p>
     *            <p>
     *            You can specify account IDs, OUs, or a combination:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Specify account IDs by setting the key to <code>ACCOUNT</code>
     *            . For example, the following is a valid map:
     *            <code>{“ACCOUNT” : [“accountID1”, “accountID2”]}</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Specify OUs by setting the key to <code>ORG_UNIT</code>. For
     *            example, the following is a valid map:
     *            <code>{“ORG_UNIT” : [“ouid111”, “ouid112”]}</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Specify accounts and OUs together in a single map, separated
     *            with a comma. For example, the following is a valid map:
     *            <code>{“ACCOUNT” : [“accountID1”, “accountID2”], “ORG_UNIT” : [“ouid111”, “ouid112”]}</code>
     *            .
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Policy withExcludeMap(java.util.Map<String, java.util.List<String>> excludeMap) {
        this.excludeMap = excludeMap;
        return this;
    }

    /**
     * <p>
     * Specifies the AWS account IDs and AWS Organizations organizational units
     * (OUs) to exclude from the policy. Specifying an OU is the equivalent of
     * specifying all accounts in the OU and in any of its child OUs, including
     * any child OUs and accounts that are added at a later time.
     * </p>
     * <p>
     * You can specify inclusions or exclusions, but not both. If you specify an
     * <code>IncludeMap</code>, AWS Firewall Manager applies the policy to all
     * accounts specified by the <code>IncludeMap</code>, and does not evaluate
     * any <code>ExcludeMap</code> specifications. If you do not specify an
     * <code>IncludeMap</code>, then Firewall Manager applies the policy to all
     * accounts except for those specified by the <code>ExcludeMap</code>.
     * </p>
     * <p>
     * You can specify account IDs, OUs, or a combination:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify account IDs by setting the key to <code>ACCOUNT</code>. For
     * example, the following is a valid map:
     * <code>{“ACCOUNT” : [“accountID1”, “accountID2”]}</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify OUs by setting the key to <code>ORG_UNIT</code>. For example, the
     * following is a valid map:
     * <code>{“ORG_UNIT” : [“ouid111”, “ouid112”]}</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify accounts and OUs together in a single map, separated with a
     * comma. For example, the following is a valid map:
     * <code>{“ACCOUNT” : [“accountID1”, “accountID2”], “ORG_UNIT” : [“ouid111”, “ouid112”]}</code>
     * .
     * </p>
     * </li>
     * </ul>
     * <p>
     * The method adds a new key-value pair into ExcludeMap parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into ExcludeMap.
     * @param value The corresponding value of the entry to be added into
     *            ExcludeMap.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Policy addExcludeMapEntry(String key, java.util.List<String> value) {
        if (null == this.excludeMap) {
            this.excludeMap = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.excludeMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.excludeMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ExcludeMap.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public Policy clearExcludeMapEntries() {
        this.excludeMap = null;
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
        if (getPolicyId() != null)
            sb.append("PolicyId: " + getPolicyId() + ",");
        if (getPolicyName() != null)
            sb.append("PolicyName: " + getPolicyName() + ",");
        if (getPolicyUpdateToken() != null)
            sb.append("PolicyUpdateToken: " + getPolicyUpdateToken() + ",");
        if (getSecurityServicePolicyData() != null)
            sb.append("SecurityServicePolicyData: " + getSecurityServicePolicyData() + ",");
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType() + ",");
        if (getResourceTypeList() != null)
            sb.append("ResourceTypeList: " + getResourceTypeList() + ",");
        if (getResourceTags() != null)
            sb.append("ResourceTags: " + getResourceTags() + ",");
        if (getExcludeResourceTags() != null)
            sb.append("ExcludeResourceTags: " + getExcludeResourceTags() + ",");
        if (getRemediationEnabled() != null)
            sb.append("RemediationEnabled: " + getRemediationEnabled() + ",");
        if (getIncludeMap() != null)
            sb.append("IncludeMap: " + getIncludeMap() + ",");
        if (getExcludeMap() != null)
            sb.append("ExcludeMap: " + getExcludeMap());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode());
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode
                + ((getPolicyUpdateToken() == null) ? 0 : getPolicyUpdateToken().hashCode());
        hashCode = prime
                * hashCode
                + ((getSecurityServicePolicyData() == null) ? 0 : getSecurityServicePolicyData()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode
                + ((getResourceTypeList() == null) ? 0 : getResourceTypeList().hashCode());
        hashCode = prime * hashCode
                + ((getResourceTags() == null) ? 0 : getResourceTags().hashCode());
        hashCode = prime * hashCode
                + ((getExcludeResourceTags() == null) ? 0 : getExcludeResourceTags().hashCode());
        hashCode = prime * hashCode
                + ((getRemediationEnabled() == null) ? 0 : getRemediationEnabled().hashCode());
        hashCode = prime * hashCode + ((getIncludeMap() == null) ? 0 : getIncludeMap().hashCode());
        hashCode = prime * hashCode + ((getExcludeMap() == null) ? 0 : getExcludeMap().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Policy == false)
            return false;
        Policy other = (Policy) obj;

        if (other.getPolicyId() == null ^ this.getPolicyId() == null)
            return false;
        if (other.getPolicyId() != null && other.getPolicyId().equals(this.getPolicyId()) == false)
            return false;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null
                && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getPolicyUpdateToken() == null ^ this.getPolicyUpdateToken() == null)
            return false;
        if (other.getPolicyUpdateToken() != null
                && other.getPolicyUpdateToken().equals(this.getPolicyUpdateToken()) == false)
            return false;
        if (other.getSecurityServicePolicyData() == null
                ^ this.getSecurityServicePolicyData() == null)
            return false;
        if (other.getSecurityServicePolicyData() != null
                && other.getSecurityServicePolicyData().equals(this.getSecurityServicePolicyData()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceTypeList() == null ^ this.getResourceTypeList() == null)
            return false;
        if (other.getResourceTypeList() != null
                && other.getResourceTypeList().equals(this.getResourceTypeList()) == false)
            return false;
        if (other.getResourceTags() == null ^ this.getResourceTags() == null)
            return false;
        if (other.getResourceTags() != null
                && other.getResourceTags().equals(this.getResourceTags()) == false)
            return false;
        if (other.getExcludeResourceTags() == null ^ this.getExcludeResourceTags() == null)
            return false;
        if (other.getExcludeResourceTags() != null
                && other.getExcludeResourceTags().equals(this.getExcludeResourceTags()) == false)
            return false;
        if (other.getRemediationEnabled() == null ^ this.getRemediationEnabled() == null)
            return false;
        if (other.getRemediationEnabled() != null
                && other.getRemediationEnabled().equals(this.getRemediationEnabled()) == false)
            return false;
        if (other.getIncludeMap() == null ^ this.getIncludeMap() == null)
            return false;
        if (other.getIncludeMap() != null
                && other.getIncludeMap().equals(this.getIncludeMap()) == false)
            return false;
        if (other.getExcludeMap() == null ^ this.getExcludeMap() == null)
            return false;
        if (other.getExcludeMap() != null
                && other.getExcludeMap().equals(this.getExcludeMap()) == false)
            return false;
        return true;
    }
}
