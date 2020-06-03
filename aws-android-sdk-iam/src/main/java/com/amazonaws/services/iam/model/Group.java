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
 * Contains information about an IAM group entity.
 * </p>
 * <p>
 * This data type is used as a response element in the following operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateGroup</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetGroup</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListGroups</a>
 * </p>
 * </li>
 * </ul>
 */
public class Group implements Serializable {
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
     * The Amazon Resource Name (ARN) specifying the group. For more information
     * about ARNs and how to use them in policies, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
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
    public Group withPath(String path) {
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
    public Group withGroupName(String groupName) {
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
    public Group withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) specifying the group. For more information
     * about ARNs and how to use them in policies, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) specifying the group. For more
     *         information about ARNs and how to use them in policies, see <a
     *         href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *         >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) specifying the group. For more information
     * about ARNs and how to use them in policies, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) specifying the group. For more
     *            information about ARNs and how to use them in policies, see <a
     *            href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *            >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) specifying the group. For more information
     * about ARNs and how to use them in policies, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) specifying the group. For more
     *            information about ARNs and how to use them in policies, see <a
     *            href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *            >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Group withArn(String arn) {
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
    public Group withCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
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
            sb.append("CreateDate: " + getCreateDate());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Group == false)
            return false;
        Group other = (Group) obj;

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
        return true;
    }
}
