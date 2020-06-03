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
 * Contains information about an IAM group, including all of the group's
 * policies.
 * </p>
 * <p>
 * This data type is used as a response element in the
 * <a>GetAccountAuthorizationDetails</a> operation.
 * </p>
 */
public class GroupDetail implements Serializable {
    /**
     * <p>
     * The path to the group. For more information about paths, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     */
    private String path;

    /**
     * <p>
     * The friendly name that identifies the group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String groupName;

    /**
     * <p>
     * The stable and unique string identifying the group. For more information
     * about IDs, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     */
    private String groupId;

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
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the group was created.
     * </p>
     */
    private java.util.Date createDate;

    /**
     * <p>
     * A list of the inline policies embedded in the group.
     * </p>
     */
    private java.util.List<PolicyDetail> groupPolicyList;

    /**
     * <p>
     * A list of the managed policies attached to the group.
     * </p>
     */
    private java.util.List<AttachedPolicy> attachedManagedPolicies;

    /**
     * <p>
     * The path to the group. For more information about paths, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @return <p>
     *         The path to the group. For more information about paths, see <a
     *         href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *         >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *         </p>
     */
    public String getPath() {
        return path;
    }

    /**
     * <p>
     * The path to the group. For more information about paths, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @param path <p>
     *            The path to the group. For more information about paths, see
     *            <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *            >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *            </p>
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path to the group. For more information about paths, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @param path <p>
     *            The path to the group. For more information about paths, see
     *            <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *            >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GroupDetail withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * <p>
     * The friendly name that identifies the group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return <p>
     *         The friendly name that identifies the group.
     *         </p>
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * <p>
     * The friendly name that identifies the group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param groupName <p>
     *            The friendly name that identifies the group.
     *            </p>
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The friendly name that identifies the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param groupName <p>
     *            The friendly name that identifies the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GroupDetail withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * <p>
     * The stable and unique string identifying the group. For more information
     * about IDs, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @return <p>
     *         The stable and unique string identifying the group. For more
     *         information about IDs, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *         >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *         </p>
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * <p>
     * The stable and unique string identifying the group. For more information
     * about IDs, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @param groupId <p>
     *            The stable and unique string identifying the group. For more
     *            information about IDs, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *            >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *            </p>
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>
     * The stable and unique string identifying the group. For more information
     * about IDs, see <a href=
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
     * @param groupId <p>
     *            The stable and unique string identifying the group. For more
     *            information about IDs, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *            >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GroupDetail withGroupId(String groupId) {
        this.groupId = groupId;
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
    public GroupDetail withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the group was created.
     * </p>
     *
     * @return <p>
     *         The date and time, in <a
     *         href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *         format</a>, when the group was created.
     *         </p>
     */
    public java.util.Date getCreateDate() {
        return createDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the group was created.
     * </p>
     *
     * @param createDate <p>
     *            The date and time, in <a
     *            href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *            format</a>, when the group was created.
     *            </p>
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the group was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createDate <p>
     *            The date and time, in <a
     *            href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *            format</a>, when the group was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GroupDetail withCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * <p>
     * A list of the inline policies embedded in the group.
     * </p>
     *
     * @return <p>
     *         A list of the inline policies embedded in the group.
     *         </p>
     */
    public java.util.List<PolicyDetail> getGroupPolicyList() {
        return groupPolicyList;
    }

    /**
     * <p>
     * A list of the inline policies embedded in the group.
     * </p>
     *
     * @param groupPolicyList <p>
     *            A list of the inline policies embedded in the group.
     *            </p>
     */
    public void setGroupPolicyList(java.util.Collection<PolicyDetail> groupPolicyList) {
        if (groupPolicyList == null) {
            this.groupPolicyList = null;
            return;
        }

        this.groupPolicyList = new java.util.ArrayList<PolicyDetail>(groupPolicyList);
    }

    /**
     * <p>
     * A list of the inline policies embedded in the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupPolicyList <p>
     *            A list of the inline policies embedded in the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GroupDetail withGroupPolicyList(PolicyDetail... groupPolicyList) {
        if (getGroupPolicyList() == null) {
            this.groupPolicyList = new java.util.ArrayList<PolicyDetail>(groupPolicyList.length);
        }
        for (PolicyDetail value : groupPolicyList) {
            this.groupPolicyList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the inline policies embedded in the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupPolicyList <p>
     *            A list of the inline policies embedded in the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GroupDetail withGroupPolicyList(java.util.Collection<PolicyDetail> groupPolicyList) {
        setGroupPolicyList(groupPolicyList);
        return this;
    }

    /**
     * <p>
     * A list of the managed policies attached to the group.
     * </p>
     *
     * @return <p>
     *         A list of the managed policies attached to the group.
     *         </p>
     */
    public java.util.List<AttachedPolicy> getAttachedManagedPolicies() {
        return attachedManagedPolicies;
    }

    /**
     * <p>
     * A list of the managed policies attached to the group.
     * </p>
     *
     * @param attachedManagedPolicies <p>
     *            A list of the managed policies attached to the group.
     *            </p>
     */
    public void setAttachedManagedPolicies(
            java.util.Collection<AttachedPolicy> attachedManagedPolicies) {
        if (attachedManagedPolicies == null) {
            this.attachedManagedPolicies = null;
            return;
        }

        this.attachedManagedPolicies = new java.util.ArrayList<AttachedPolicy>(
                attachedManagedPolicies);
    }

    /**
     * <p>
     * A list of the managed policies attached to the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachedManagedPolicies <p>
     *            A list of the managed policies attached to the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GroupDetail withAttachedManagedPolicies(AttachedPolicy... attachedManagedPolicies) {
        if (getAttachedManagedPolicies() == null) {
            this.attachedManagedPolicies = new java.util.ArrayList<AttachedPolicy>(
                    attachedManagedPolicies.length);
        }
        for (AttachedPolicy value : attachedManagedPolicies) {
            this.attachedManagedPolicies.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the managed policies attached to the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachedManagedPolicies <p>
     *            A list of the managed policies attached to the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GroupDetail withAttachedManagedPolicies(
            java.util.Collection<AttachedPolicy> attachedManagedPolicies) {
        setAttachedManagedPolicies(attachedManagedPolicies);
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
        if (getPath() != null)
            sb.append("Path: " + getPath() + ",");
        if (getGroupName() != null)
            sb.append("GroupName: " + getGroupName() + ",");
        if (getGroupId() != null)
            sb.append("GroupId: " + getGroupId() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getCreateDate() != null)
            sb.append("CreateDate: " + getCreateDate() + ",");
        if (getGroupPolicyList() != null)
            sb.append("GroupPolicyList: " + getGroupPolicyList() + ",");
        if (getAttachedManagedPolicies() != null)
            sb.append("AttachedManagedPolicies: " + getAttachedManagedPolicies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        hashCode = prime * hashCode
                + ((getGroupPolicyList() == null) ? 0 : getGroupPolicyList().hashCode());
        hashCode = prime
                * hashCode
                + ((getAttachedManagedPolicies() == null) ? 0 : getAttachedManagedPolicies()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GroupDetail == false)
            return false;
        GroupDetail other = (GroupDetail) obj;

        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null
                && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null
                && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        if (other.getGroupPolicyList() == null ^ this.getGroupPolicyList() == null)
            return false;
        if (other.getGroupPolicyList() != null
                && other.getGroupPolicyList().equals(this.getGroupPolicyList()) == false)
            return false;
        if (other.getAttachedManagedPolicies() == null ^ this.getAttachedManagedPolicies() == null)
            return false;
        if (other.getAttachedManagedPolicies() != null
                && other.getAttachedManagedPolicies().equals(this.getAttachedManagedPolicies()) == false)
            return false;
        return true;
    }
}
