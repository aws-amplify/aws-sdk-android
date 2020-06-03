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
 * Contains information about a managed policy.
 * </p>
 * <p>
 * This data type is used as a response element in the <a>CreatePolicy</a>,
 * <a>GetPolicy</a>, and <a>ListPolicies</a> operations.
 * </p>
 * <p>
 * For more information about managed policies, refer to <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
 * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
 * </p>
 */
public class Policy implements Serializable {
    /**
     * <p>
     * The friendly name (not ARN) identifying the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String policyName;

    /**
     * <p>
     * The stable and unique string identifying the policy.
     * </p>
     * <p>
     * For more information about IDs, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     */
    private String policyId;

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
    private String arn;

    /**
     * <p>
     * The path to the policy.
     * </p>
     * <p>
     * For more information about paths, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>((/[A-Za-z0-9\.,\+@=_-]+)*)/<br/>
     */
    private String path;

    /**
     * <p>
     * The identifier for the version of the policy that is set as the default
     * version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>v[1-9][0-9]*(\.[A-Za-z0-9-]*)?<br/>
     */
    private String defaultVersionId;

    /**
     * <p>
     * The number of entities (users, groups, and roles) that the policy is
     * attached to.
     * </p>
     */
    private Integer attachmentCount;

    /**
     * <p>
     * The number of entities (users and roles) for which the policy is used to
     * set the permissions boundary.
     * </p>
     * <p>
     * For more information about permissions boundaries, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html"
     * >Permissions Boundaries for IAM Identities </a> in the <i>IAM User
     * Guide</i>.
     * </p>
     */
    private Integer permissionsBoundaryUsageCount;

    /**
     * <p>
     * Specifies whether the policy can be attached to an IAM user, group, or
     * role.
     * </p>
     */
    private Boolean isAttachable;

    /**
     * <p>
     * A friendly description of the policy.
     * </p>
     * <p>
     * This element is included in the response to the <a>GetPolicy</a>
     * operation. It is not included in the response to the <a>ListPolicies</a>
     * operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     */
    private String description;

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the policy was created.
     * </p>
     */
    private java.util.Date createDate;

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the policy was last updated.
     * </p>
     * <p>
     * When a policy has only one version, this field contains the date and time
     * when the policy was created. When a policy has more than one version,
     * this field contains the date and time when the most recent policy version
     * was created.
     * </p>
     */
    private java.util.Date updateDate;

    /**
     * <p>
     * The friendly name (not ARN) identifying the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return <p>
     *         The friendly name (not ARN) identifying the policy.
     *         </p>
     */
    public String getPolicyName() {
        return policyName;
    }

    /**
     * <p>
     * The friendly name (not ARN) identifying the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param policyName <p>
     *            The friendly name (not ARN) identifying the policy.
     *            </p>
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The friendly name (not ARN) identifying the policy.
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
     *            The friendly name (not ARN) identifying the policy.
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
     * The stable and unique string identifying the policy.
     * </p>
     * <p>
     * For more information about IDs, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @return <p>
     *         The stable and unique string identifying the policy.
     *         </p>
     *         <p>
     *         For more information about IDs, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *         >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *         </p>
     */
    public String getPolicyId() {
        return policyId;
    }

    /**
     * <p>
     * The stable and unique string identifying the policy.
     * </p>
     * <p>
     * For more information about IDs, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @param policyId <p>
     *            The stable and unique string identifying the policy.
     *            </p>
     *            <p>
     *            For more information about IDs, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *            >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *            </p>
     */
    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    /**
     * <p>
     * The stable and unique string identifying the policy.
     * </p>
     * <p>
     * For more information about IDs, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @param policyId <p>
     *            The stable and unique string identifying the policy.
     *            </p>
     *            <p>
     *            For more information about IDs, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *            >IAM Identifiers</a> in the <i>IAM User Guide</i>.
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
    public String getArn() {
        return arn;
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
     * @param arn <p>
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
    public void setArn(String arn) {
        this.arn = arn;
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
     * @param arn <p>
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
    public Policy withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The path to the policy.
     * </p>
     * <p>
     * For more information about paths, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>((/[A-Za-z0-9\.,\+@=_-]+)*)/<br/>
     *
     * @return <p>
     *         The path to the policy.
     *         </p>
     *         <p>
     *         For more information about paths, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *         >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *         </p>
     */
    public String getPath() {
        return path;
    }

    /**
     * <p>
     * The path to the policy.
     * </p>
     * <p>
     * For more information about paths, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>((/[A-Za-z0-9\.,\+@=_-]+)*)/<br/>
     *
     * @param path <p>
     *            The path to the policy.
     *            </p>
     *            <p>
     *            For more information about paths, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *            >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *            </p>
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path to the policy.
     * </p>
     * <p>
     * For more information about paths, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>((/[A-Za-z0-9\.,\+@=_-]+)*)/<br/>
     *
     * @param path <p>
     *            The path to the policy.
     *            </p>
     *            <p>
     *            For more information about paths, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *            >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Policy withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * <p>
     * The identifier for the version of the policy that is set as the default
     * version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>v[1-9][0-9]*(\.[A-Za-z0-9-]*)?<br/>
     *
     * @return <p>
     *         The identifier for the version of the policy that is set as the
     *         default version.
     *         </p>
     */
    public String getDefaultVersionId() {
        return defaultVersionId;
    }

    /**
     * <p>
     * The identifier for the version of the policy that is set as the default
     * version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>v[1-9][0-9]*(\.[A-Za-z0-9-]*)?<br/>
     *
     * @param defaultVersionId <p>
     *            The identifier for the version of the policy that is set as
     *            the default version.
     *            </p>
     */
    public void setDefaultVersionId(String defaultVersionId) {
        this.defaultVersionId = defaultVersionId;
    }

    /**
     * <p>
     * The identifier for the version of the policy that is set as the default
     * version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>v[1-9][0-9]*(\.[A-Za-z0-9-]*)?<br/>
     *
     * @param defaultVersionId <p>
     *            The identifier for the version of the policy that is set as
     *            the default version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Policy withDefaultVersionId(String defaultVersionId) {
        this.defaultVersionId = defaultVersionId;
        return this;
    }

    /**
     * <p>
     * The number of entities (users, groups, and roles) that the policy is
     * attached to.
     * </p>
     *
     * @return <p>
     *         The number of entities (users, groups, and roles) that the policy
     *         is attached to.
     *         </p>
     */
    public Integer getAttachmentCount() {
        return attachmentCount;
    }

    /**
     * <p>
     * The number of entities (users, groups, and roles) that the policy is
     * attached to.
     * </p>
     *
     * @param attachmentCount <p>
     *            The number of entities (users, groups, and roles) that the
     *            policy is attached to.
     *            </p>
     */
    public void setAttachmentCount(Integer attachmentCount) {
        this.attachmentCount = attachmentCount;
    }

    /**
     * <p>
     * The number of entities (users, groups, and roles) that the policy is
     * attached to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachmentCount <p>
     *            The number of entities (users, groups, and roles) that the
     *            policy is attached to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Policy withAttachmentCount(Integer attachmentCount) {
        this.attachmentCount = attachmentCount;
        return this;
    }

    /**
     * <p>
     * The number of entities (users and roles) for which the policy is used to
     * set the permissions boundary.
     * </p>
     * <p>
     * For more information about permissions boundaries, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html"
     * >Permissions Boundaries for IAM Identities </a> in the <i>IAM User
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         The number of entities (users and roles) for which the policy is
     *         used to set the permissions boundary.
     *         </p>
     *         <p>
     *         For more information about permissions boundaries, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html"
     *         >Permissions Boundaries for IAM Identities </a> in the <i>IAM
     *         User Guide</i>.
     *         </p>
     */
    public Integer getPermissionsBoundaryUsageCount() {
        return permissionsBoundaryUsageCount;
    }

    /**
     * <p>
     * The number of entities (users and roles) for which the policy is used to
     * set the permissions boundary.
     * </p>
     * <p>
     * For more information about permissions boundaries, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html"
     * >Permissions Boundaries for IAM Identities </a> in the <i>IAM User
     * Guide</i>.
     * </p>
     *
     * @param permissionsBoundaryUsageCount <p>
     *            The number of entities (users and roles) for which the policy
     *            is used to set the permissions boundary.
     *            </p>
     *            <p>
     *            For more information about permissions boundaries, see <a
     *            href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html"
     *            >Permissions Boundaries for IAM Identities </a> in the <i>IAM
     *            User Guide</i>.
     *            </p>
     */
    public void setPermissionsBoundaryUsageCount(Integer permissionsBoundaryUsageCount) {
        this.permissionsBoundaryUsageCount = permissionsBoundaryUsageCount;
    }

    /**
     * <p>
     * The number of entities (users and roles) for which the policy is used to
     * set the permissions boundary.
     * </p>
     * <p>
     * For more information about permissions boundaries, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html"
     * >Permissions Boundaries for IAM Identities </a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param permissionsBoundaryUsageCount <p>
     *            The number of entities (users and roles) for which the policy
     *            is used to set the permissions boundary.
     *            </p>
     *            <p>
     *            For more information about permissions boundaries, see <a
     *            href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html"
     *            >Permissions Boundaries for IAM Identities </a> in the <i>IAM
     *            User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Policy withPermissionsBoundaryUsageCount(Integer permissionsBoundaryUsageCount) {
        this.permissionsBoundaryUsageCount = permissionsBoundaryUsageCount;
        return this;
    }

    /**
     * <p>
     * Specifies whether the policy can be attached to an IAM user, group, or
     * role.
     * </p>
     *
     * @return <p>
     *         Specifies whether the policy can be attached to an IAM user,
     *         group, or role.
     *         </p>
     */
    public Boolean isIsAttachable() {
        return isAttachable;
    }

    /**
     * <p>
     * Specifies whether the policy can be attached to an IAM user, group, or
     * role.
     * </p>
     *
     * @return <p>
     *         Specifies whether the policy can be attached to an IAM user,
     *         group, or role.
     *         </p>
     */
    public Boolean getIsAttachable() {
        return isAttachable;
    }

    /**
     * <p>
     * Specifies whether the policy can be attached to an IAM user, group, or
     * role.
     * </p>
     *
     * @param isAttachable <p>
     *            Specifies whether the policy can be attached to an IAM user,
     *            group, or role.
     *            </p>
     */
    public void setIsAttachable(Boolean isAttachable) {
        this.isAttachable = isAttachable;
    }

    /**
     * <p>
     * Specifies whether the policy can be attached to an IAM user, group, or
     * role.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isAttachable <p>
     *            Specifies whether the policy can be attached to an IAM user,
     *            group, or role.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Policy withIsAttachable(Boolean isAttachable) {
        this.isAttachable = isAttachable;
        return this;
    }

    /**
     * <p>
     * A friendly description of the policy.
     * </p>
     * <p>
     * This element is included in the response to the <a>GetPolicy</a>
     * operation. It is not included in the response to the <a>ListPolicies</a>
     * operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @return <p>
     *         A friendly description of the policy.
     *         </p>
     *         <p>
     *         This element is included in the response to the <a>GetPolicy</a>
     *         operation. It is not included in the response to the
     *         <a>ListPolicies</a> operation.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A friendly description of the policy.
     * </p>
     * <p>
     * This element is included in the response to the <a>GetPolicy</a>
     * operation. It is not included in the response to the <a>ListPolicies</a>
     * operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param description <p>
     *            A friendly description of the policy.
     *            </p>
     *            <p>
     *            This element is included in the response to the
     *            <a>GetPolicy</a> operation. It is not included in the response
     *            to the <a>ListPolicies</a> operation.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A friendly description of the policy.
     * </p>
     * <p>
     * This element is included in the response to the <a>GetPolicy</a>
     * operation. It is not included in the response to the <a>ListPolicies</a>
     * operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param description <p>
     *            A friendly description of the policy.
     *            </p>
     *            <p>
     *            This element is included in the response to the
     *            <a>GetPolicy</a> operation. It is not included in the response
     *            to the <a>ListPolicies</a> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Policy withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the policy was created.
     * </p>
     *
     * @return <p>
     *         The date and time, in <a
     *         href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *         format</a>, when the policy was created.
     *         </p>
     */
    public java.util.Date getCreateDate() {
        return createDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the policy was created.
     * </p>
     *
     * @param createDate <p>
     *            The date and time, in <a
     *            href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *            format</a>, when the policy was created.
     *            </p>
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the policy was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createDate <p>
     *            The date and time, in <a
     *            href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *            format</a>, when the policy was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Policy withCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the policy was last updated.
     * </p>
     * <p>
     * When a policy has only one version, this field contains the date and time
     * when the policy was created. When a policy has more than one version,
     * this field contains the date and time when the most recent policy version
     * was created.
     * </p>
     *
     * @return <p>
     *         The date and time, in <a
     *         href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *         format</a>, when the policy was last updated.
     *         </p>
     *         <p>
     *         When a policy has only one version, this field contains the date
     *         and time when the policy was created. When a policy has more than
     *         one version, this field contains the date and time when the most
     *         recent policy version was created.
     *         </p>
     */
    public java.util.Date getUpdateDate() {
        return updateDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the policy was last updated.
     * </p>
     * <p>
     * When a policy has only one version, this field contains the date and time
     * when the policy was created. When a policy has more than one version,
     * this field contains the date and time when the most recent policy version
     * was created.
     * </p>
     *
     * @param updateDate <p>
     *            The date and time, in <a
     *            href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *            format</a>, when the policy was last updated.
     *            </p>
     *            <p>
     *            When a policy has only one version, this field contains the
     *            date and time when the policy was created. When a policy has
     *            more than one version, this field contains the date and time
     *            when the most recent policy version was created.
     *            </p>
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the policy was last updated.
     * </p>
     * <p>
     * When a policy has only one version, this field contains the date and time
     * when the policy was created. When a policy has more than one version,
     * this field contains the date and time when the most recent policy version
     * was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updateDate <p>
     *            The date and time, in <a
     *            href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *            format</a>, when the policy was last updated.
     *            </p>
     *            <p>
     *            When a policy has only one version, this field contains the
     *            date and time when the policy was created. When a policy has
     *            more than one version, this field contains the date and time
     *            when the most recent policy version was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Policy withUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
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
        if (getPolicyId() != null)
            sb.append("PolicyId: " + getPolicyId() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getPath() != null)
            sb.append("Path: " + getPath() + ",");
        if (getDefaultVersionId() != null)
            sb.append("DefaultVersionId: " + getDefaultVersionId() + ",");
        if (getAttachmentCount() != null)
            sb.append("AttachmentCount: " + getAttachmentCount() + ",");
        if (getPermissionsBoundaryUsageCount() != null)
            sb.append("PermissionsBoundaryUsageCount: " + getPermissionsBoundaryUsageCount() + ",");
        if (getIsAttachable() != null)
            sb.append("IsAttachable: " + getIsAttachable() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getCreateDate() != null)
            sb.append("CreateDate: " + getCreateDate() + ",");
        if (getUpdateDate() != null)
            sb.append("UpdateDate: " + getUpdateDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultVersionId() == null) ? 0 : getDefaultVersionId().hashCode());
        hashCode = prime * hashCode
                + ((getAttachmentCount() == null) ? 0 : getAttachmentCount().hashCode());
        hashCode = prime
                * hashCode
                + ((getPermissionsBoundaryUsageCount() == null) ? 0
                        : getPermissionsBoundaryUsageCount().hashCode());
        hashCode = prime * hashCode
                + ((getIsAttachable() == null) ? 0 : getIsAttachable().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        hashCode = prime * hashCode + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
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

        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null
                && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getPolicyId() == null ^ this.getPolicyId() == null)
            return false;
        if (other.getPolicyId() != null && other.getPolicyId().equals(this.getPolicyId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getDefaultVersionId() == null ^ this.getDefaultVersionId() == null)
            return false;
        if (other.getDefaultVersionId() != null
                && other.getDefaultVersionId().equals(this.getDefaultVersionId()) == false)
            return false;
        if (other.getAttachmentCount() == null ^ this.getAttachmentCount() == null)
            return false;
        if (other.getAttachmentCount() != null
                && other.getAttachmentCount().equals(this.getAttachmentCount()) == false)
            return false;
        if (other.getPermissionsBoundaryUsageCount() == null
                ^ this.getPermissionsBoundaryUsageCount() == null)
            return false;
        if (other.getPermissionsBoundaryUsageCount() != null
                && other.getPermissionsBoundaryUsageCount().equals(
                        this.getPermissionsBoundaryUsageCount()) == false)
            return false;
        if (other.getIsAttachable() == null ^ this.getIsAttachable() == null)
            return false;
        if (other.getIsAttachable() != null
                && other.getIsAttachable().equals(this.getIsAttachable()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null
                && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        if (other.getUpdateDate() == null ^ this.getUpdateDate() == null)
            return false;
        if (other.getUpdateDate() != null
                && other.getUpdateDate().equals(this.getUpdateDate()) == false)
            return false;
        return true;
    }
}
