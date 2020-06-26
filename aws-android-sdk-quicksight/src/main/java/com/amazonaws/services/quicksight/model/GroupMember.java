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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

/**
 * <p>
 * A member of an Amazon QuickSight group. Currently, group members must be
 * users. Groups can't be members of another group. .
 * </p>
 */
public class GroupMember implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the group member (user).
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The name of the group member (user).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     */
    private String memberName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the group member (user).
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the group member (user).
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the group member (user).
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) for the group member (user).
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the group member (user).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) for the group member (user).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GroupMember withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The name of the group member (user).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @return <p>
     *         The name of the group member (user).
     *         </p>
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * <p>
     * The name of the group member (user).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param memberName <p>
     *            The name of the group member (user).
     *            </p>
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    /**
     * <p>
     * The name of the group member (user).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param memberName <p>
     *            The name of the group member (user).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GroupMember withMemberName(String memberName) {
        this.memberName = memberName;
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
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getMemberName() != null)
            sb.append("MemberName: " + getMemberName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getMemberName() == null) ? 0 : getMemberName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GroupMember == false)
            return false;
        GroupMember other = (GroupMember) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getMemberName() == null ^ this.getMemberName() == null)
            return false;
        if (other.getMemberName() != null
                && other.getMemberName().equals(this.getMemberName()) == false)
            return false;
        return true;
    }
}
