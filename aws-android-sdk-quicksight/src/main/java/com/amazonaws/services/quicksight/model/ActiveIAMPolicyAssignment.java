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
 * The active AWS Identity and Access Management (IAM) policy assignment.
 * </p>
 */
public class ActiveIAMPolicyAssignment implements Serializable {
    /**
     * <p>
     * A name for the IAM policy assignment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>(?=^.{2,256}$)(?!.*\s)[0-9a-zA-Z-_.:=+@]*$<br/>
     */
    private String assignmentName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     */
    private String policyArn;

    /**
     * <p>
     * A name for the IAM policy assignment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>(?=^.{2,256}$)(?!.*\s)[0-9a-zA-Z-_.:=+@]*$<br/>
     *
     * @return <p>
     *         A name for the IAM policy assignment.
     *         </p>
     */
    public String getAssignmentName() {
        return assignmentName;
    }

    /**
     * <p>
     * A name for the IAM policy assignment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>(?=^.{2,256}$)(?!.*\s)[0-9a-zA-Z-_.:=+@]*$<br/>
     *
     * @param assignmentName <p>
     *            A name for the IAM policy assignment.
     *            </p>
     */
    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    /**
     * <p>
     * A name for the IAM policy assignment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>(?=^.{2,256}$)(?!.*\s)[0-9a-zA-Z-_.:=+@]*$<br/>
     *
     * @param assignmentName <p>
     *            A name for the IAM policy assignment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActiveIAMPolicyAssignment withAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the resource.
     *         </p>
     */
    public String getPolicyArn() {
        return policyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     *
     * @param policyArn <p>
     *            The Amazon Resource Name (ARN) of the resource.
     *            </p>
     */
    public void setPolicyArn(String policyArn) {
        this.policyArn = policyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyArn <p>
     *            The Amazon Resource Name (ARN) of the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActiveIAMPolicyAssignment withPolicyArn(String policyArn) {
        this.policyArn = policyArn;
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
        if (getAssignmentName() != null)
            sb.append("AssignmentName: " + getAssignmentName() + ",");
        if (getPolicyArn() != null)
            sb.append("PolicyArn: " + getPolicyArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAssignmentName() == null) ? 0 : getAssignmentName().hashCode());
        hashCode = prime * hashCode + ((getPolicyArn() == null) ? 0 : getPolicyArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActiveIAMPolicyAssignment == false)
            return false;
        ActiveIAMPolicyAssignment other = (ActiveIAMPolicyAssignment) obj;

        if (other.getAssignmentName() == null ^ this.getAssignmentName() == null)
            return false;
        if (other.getAssignmentName() != null
                && other.getAssignmentName().equals(this.getAssignmentName()) == false)
            return false;
        if (other.getPolicyArn() == null ^ this.getPolicyArn() == null)
            return false;
        if (other.getPolicyArn() != null
                && other.getPolicyArn().equals(this.getPolicyArn()) == false)
            return false;
        return true;
    }
}
