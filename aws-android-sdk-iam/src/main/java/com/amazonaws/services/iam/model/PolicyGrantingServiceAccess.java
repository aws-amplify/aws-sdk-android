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

package com.amazonaws.services.iam.model;

import java.io.Serializable;

/**
 * <p>
 * Contains details about the permissions policies that are attached to the
 * specified identity (user, group, or role).
 * </p>
 * <p>
 * This data type is an element of the
 * <a>ListPoliciesGrantingServiceAccessEntry</a> object.
 * </p>
 */
public class PolicyGrantingServiceAccess implements Serializable {
    /**
     * <p>
     * The policy name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String policyName;

    /**
     * <p>
     * The policy type. For more information about these policy types, see <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INLINE, MANAGED
     */
    private String policyType;

    /**
     * <p>
     * The Amazon Resource Name (ARN). ARNs are unique identifiers for AWS
     * resources.
     * </p>
     * <p>
     * For more information about ARNs, go to <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the
     * <i>AWS General Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String policyArn;

    /**
     * <p>
     * The type of entity (user or role) that used the policy to access the
     * service to which the inline policy is attached.
     * </p>
     * <p>
     * This field is null for managed policies. For more information about these
     * policy types, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, ROLE, GROUP
     */
    private String entityType;

    /**
     * <p>
     * The name of the entity (user or role) to which the inline policy is
     * attached.
     * </p>
     * <p>
     * This field is null for managed policies. For more information about these
     * policy types, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String entityName;

    /**
     * <p>
     * The policy name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return <p>
     *         The policy name.
     *         </p>
     */
    public String getPolicyName() {
        return policyName;
    }

    /**
     * <p>
     * The policy name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param policyName <p>
     *            The policy name.
     *            </p>
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The policy name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param policyName <p>
     *            The policy name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyGrantingServiceAccess withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * <p>
     * The policy type. For more information about these policy types, see <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INLINE, MANAGED
     *
     * @return <p>
     *         The policy type. For more information about these policy types,
     *         see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html"
     *         >Managed Policies and Inline Policies</a> in the <i>IAM User
     *         Guide</i>.
     *         </p>
     * @see PolicyType
     */
    public String getPolicyType() {
        return policyType;
    }

    /**
     * <p>
     * The policy type. For more information about these policy types, see <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INLINE, MANAGED
     *
     * @param policyType <p>
     *            The policy type. For more information about these policy
     *            types, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html"
     *            >Managed Policies and Inline Policies</a> in the <i>IAM User
     *            Guide</i>.
     *            </p>
     * @see PolicyType
     */
    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    /**
     * <p>
     * The policy type. For more information about these policy types, see <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INLINE, MANAGED
     *
     * @param policyType <p>
     *            The policy type. For more information about these policy
     *            types, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html"
     *            >Managed Policies and Inline Policies</a> in the <i>IAM User
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PolicyType
     */
    public PolicyGrantingServiceAccess withPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * <p>
     * The policy type. For more information about these policy types, see <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INLINE, MANAGED
     *
     * @param policyType <p>
     *            The policy type. For more information about these policy
     *            types, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html"
     *            >Managed Policies and Inline Policies</a> in the <i>IAM User
     *            Guide</i>.
     *            </p>
     * @see PolicyType
     */
    public void setPolicyType(PolicyType policyType) {
        this.policyType = policyType.toString();
    }

    /**
     * <p>
     * The policy type. For more information about these policy types, see <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INLINE, MANAGED
     *
     * @param policyType <p>
     *            The policy type. For more information about these policy
     *            types, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html"
     *            >Managed Policies and Inline Policies</a> in the <i>IAM User
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PolicyType
     */
    public PolicyGrantingServiceAccess withPolicyType(PolicyType policyType) {
        this.policyType = policyType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN). ARNs are unique identifiers for AWS
     * resources.
     * </p>
     * <p>
     * For more information about ARNs, go to <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the
     * <i>AWS General Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN). ARNs are unique identifiers for
     *         AWS resources.
     *         </p>
     *         <p>
     *         For more information about ARNs, go to <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *         >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in
     *         the <i>AWS General Reference</i>.
     *         </p>
     */
    public String getPolicyArn() {
        return policyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN). ARNs are unique identifiers for AWS
     * resources.
     * </p>
     * <p>
     * For more information about ARNs, go to <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the
     * <i>AWS General Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param policyArn <p>
     *            The Amazon Resource Name (ARN). ARNs are unique identifiers
     *            for AWS resources.
     *            </p>
     *            <p>
     *            For more information about ARNs, go to <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>
     *            in the <i>AWS General Reference</i>.
     *            </p>
     */
    public void setPolicyArn(String policyArn) {
        this.policyArn = policyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN). ARNs are unique identifiers for AWS
     * resources.
     * </p>
     * <p>
     * For more information about ARNs, go to <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the
     * <i>AWS General Reference</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param policyArn <p>
     *            The Amazon Resource Name (ARN). ARNs are unique identifiers
     *            for AWS resources.
     *            </p>
     *            <p>
     *            For more information about ARNs, go to <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>
     *            in the <i>AWS General Reference</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyGrantingServiceAccess withPolicyArn(String policyArn) {
        this.policyArn = policyArn;
        return this;
    }

    /**
     * <p>
     * The type of entity (user or role) that used the policy to access the
     * service to which the inline policy is attached.
     * </p>
     * <p>
     * This field is null for managed policies. For more information about these
     * policy types, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, ROLE, GROUP
     *
     * @return <p>
     *         The type of entity (user or role) that used the policy to access
     *         the service to which the inline policy is attached.
     *         </p>
     *         <p>
     *         This field is null for managed policies. For more information
     *         about these policy types, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html"
     *         >Managed Policies and Inline Policies</a> in the <i>IAM User
     *         Guide</i>.
     *         </p>
     * @see PolicyOwnerEntityType
     */
    public String getEntityType() {
        return entityType;
    }

    /**
     * <p>
     * The type of entity (user or role) that used the policy to access the
     * service to which the inline policy is attached.
     * </p>
     * <p>
     * This field is null for managed policies. For more information about these
     * policy types, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, ROLE, GROUP
     *
     * @param entityType <p>
     *            The type of entity (user or role) that used the policy to
     *            access the service to which the inline policy is attached.
     *            </p>
     *            <p>
     *            This field is null for managed policies. For more information
     *            about these policy types, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html"
     *            >Managed Policies and Inline Policies</a> in the <i>IAM User
     *            Guide</i>.
     *            </p>
     * @see PolicyOwnerEntityType
     */
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    /**
     * <p>
     * The type of entity (user or role) that used the policy to access the
     * service to which the inline policy is attached.
     * </p>
     * <p>
     * This field is null for managed policies. For more information about these
     * policy types, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, ROLE, GROUP
     *
     * @param entityType <p>
     *            The type of entity (user or role) that used the policy to
     *            access the service to which the inline policy is attached.
     *            </p>
     *            <p>
     *            This field is null for managed policies. For more information
     *            about these policy types, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html"
     *            >Managed Policies and Inline Policies</a> in the <i>IAM User
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PolicyOwnerEntityType
     */
    public PolicyGrantingServiceAccess withEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    /**
     * <p>
     * The type of entity (user or role) that used the policy to access the
     * service to which the inline policy is attached.
     * </p>
     * <p>
     * This field is null for managed policies. For more information about these
     * policy types, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, ROLE, GROUP
     *
     * @param entityType <p>
     *            The type of entity (user or role) that used the policy to
     *            access the service to which the inline policy is attached.
     *            </p>
     *            <p>
     *            This field is null for managed policies. For more information
     *            about these policy types, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html"
     *            >Managed Policies and Inline Policies</a> in the <i>IAM User
     *            Guide</i>.
     *            </p>
     * @see PolicyOwnerEntityType
     */
    public void setEntityType(PolicyOwnerEntityType entityType) {
        this.entityType = entityType.toString();
    }

    /**
     * <p>
     * The type of entity (user or role) that used the policy to access the
     * service to which the inline policy is attached.
     * </p>
     * <p>
     * This field is null for managed policies. For more information about these
     * policy types, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, ROLE, GROUP
     *
     * @param entityType <p>
     *            The type of entity (user or role) that used the policy to
     *            access the service to which the inline policy is attached.
     *            </p>
     *            <p>
     *            This field is null for managed policies. For more information
     *            about these policy types, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html"
     *            >Managed Policies and Inline Policies</a> in the <i>IAM User
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PolicyOwnerEntityType
     */
    public PolicyGrantingServiceAccess withEntityType(PolicyOwnerEntityType entityType) {
        this.entityType = entityType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the entity (user or role) to which the inline policy is
     * attached.
     * </p>
     * <p>
     * This field is null for managed policies. For more information about these
     * policy types, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return <p>
     *         The name of the entity (user or role) to which the inline policy
     *         is attached.
     *         </p>
     *         <p>
     *         This field is null for managed policies. For more information
     *         about these policy types, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html"
     *         >Managed Policies and Inline Policies</a> in the <i>IAM User
     *         Guide</i>.
     *         </p>
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * <p>
     * The name of the entity (user or role) to which the inline policy is
     * attached.
     * </p>
     * <p>
     * This field is null for managed policies. For more information about these
     * policy types, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param entityName <p>
     *            The name of the entity (user or role) to which the inline
     *            policy is attached.
     *            </p>
     *            <p>
     *            This field is null for managed policies. For more information
     *            about these policy types, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html"
     *            >Managed Policies and Inline Policies</a> in the <i>IAM User
     *            Guide</i>.
     *            </p>
     */
    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    /**
     * <p>
     * The name of the entity (user or role) to which the inline policy is
     * attached.
     * </p>
     * <p>
     * This field is null for managed policies. For more information about these
     * policy types, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param entityName <p>
     *            The name of the entity (user or role) to which the inline
     *            policy is attached.
     *            </p>
     *            <p>
     *            This field is null for managed policies. For more information
     *            about these policy types, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html"
     *            >Managed Policies and Inline Policies</a> in the <i>IAM User
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyGrantingServiceAccess withEntityName(String entityName) {
        this.entityName = entityName;
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
        if (getPolicyName() != null)
            sb.append("PolicyName: " + getPolicyName() + ",");
        if (getPolicyType() != null)
            sb.append("PolicyType: " + getPolicyType() + ",");
        if (getPolicyArn() != null)
            sb.append("PolicyArn: " + getPolicyArn() + ",");
        if (getEntityType() != null)
            sb.append("EntityType: " + getEntityType() + ",");
        if (getEntityName() != null)
            sb.append("EntityName: " + getEntityName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getPolicyType() == null) ? 0 : getPolicyType().hashCode());
        hashCode = prime * hashCode + ((getPolicyArn() == null) ? 0 : getPolicyArn().hashCode());
        hashCode = prime * hashCode + ((getEntityType() == null) ? 0 : getEntityType().hashCode());
        hashCode = prime * hashCode + ((getEntityName() == null) ? 0 : getEntityName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicyGrantingServiceAccess == false)
            return false;
        PolicyGrantingServiceAccess other = (PolicyGrantingServiceAccess) obj;

        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null
                && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getPolicyType() == null ^ this.getPolicyType() == null)
            return false;
        if (other.getPolicyType() != null
                && other.getPolicyType().equals(this.getPolicyType()) == false)
            return false;
        if (other.getPolicyArn() == null ^ this.getPolicyArn() == null)
            return false;
        if (other.getPolicyArn() != null
                && other.getPolicyArn().equals(this.getPolicyArn()) == false)
            return false;
        if (other.getEntityType() == null ^ this.getEntityType() == null)
            return false;
        if (other.getEntityType() != null
                && other.getEntityType().equals(this.getEntityType()) == false)
            return false;
        if (other.getEntityName() == null ^ this.getEntityName() == null)
            return false;
        if (other.getEntityName() != null
                && other.getEntityName().equals(this.getEntityName()) == false)
            return false;
        return true;
    }
}
