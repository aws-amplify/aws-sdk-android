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
 * IAM policy assignment summary.
 * </p>
 */
public class IAMPolicyAssignmentSummary implements Serializable {
    /**
     * <p>
     * Assignment name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>(?=^.{2,256}$)(?!.*\s)[0-9a-zA-Z-_.:=+@]*$<br/>
     */
    private String assignmentName;

    /**
     * <p>
     * Assignment status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DRAFT, DISABLED
     */
    private String assignmentStatus;

    /**
     * <p>
     * Assignment name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>(?=^.{2,256}$)(?!.*\s)[0-9a-zA-Z-_.:=+@]*$<br/>
     *
     * @return <p>
     *         Assignment name.
     *         </p>
     */
    public String getAssignmentName() {
        return assignmentName;
    }

    /**
     * <p>
     * Assignment name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>(?=^.{2,256}$)(?!.*\s)[0-9a-zA-Z-_.:=+@]*$<br/>
     *
     * @param assignmentName <p>
     *            Assignment name.
     *            </p>
     */
    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    /**
     * <p>
     * Assignment name.
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
     *            Assignment name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IAMPolicyAssignmentSummary withAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
        return this;
    }

    /**
     * <p>
     * Assignment status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DRAFT, DISABLED
     *
     * @return <p>
     *         Assignment status.
     *         </p>
     * @see AssignmentStatus
     */
    public String getAssignmentStatus() {
        return assignmentStatus;
    }

    /**
     * <p>
     * Assignment status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DRAFT, DISABLED
     *
     * @param assignmentStatus <p>
     *            Assignment status.
     *            </p>
     * @see AssignmentStatus
     */
    public void setAssignmentStatus(String assignmentStatus) {
        this.assignmentStatus = assignmentStatus;
    }

    /**
     * <p>
     * Assignment status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DRAFT, DISABLED
     *
     * @param assignmentStatus <p>
     *            Assignment status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AssignmentStatus
     */
    public IAMPolicyAssignmentSummary withAssignmentStatus(String assignmentStatus) {
        this.assignmentStatus = assignmentStatus;
        return this;
    }

    /**
     * <p>
     * Assignment status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DRAFT, DISABLED
     *
     * @param assignmentStatus <p>
     *            Assignment status.
     *            </p>
     * @see AssignmentStatus
     */
    public void setAssignmentStatus(AssignmentStatus assignmentStatus) {
        this.assignmentStatus = assignmentStatus.toString();
    }

    /**
     * <p>
     * Assignment status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DRAFT, DISABLED
     *
     * @param assignmentStatus <p>
     *            Assignment status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AssignmentStatus
     */
    public IAMPolicyAssignmentSummary withAssignmentStatus(AssignmentStatus assignmentStatus) {
        this.assignmentStatus = assignmentStatus.toString();
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
        if (getAssignmentStatus() != null)
            sb.append("AssignmentStatus: " + getAssignmentStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAssignmentName() == null) ? 0 : getAssignmentName().hashCode());
        hashCode = prime * hashCode
                + ((getAssignmentStatus() == null) ? 0 : getAssignmentStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IAMPolicyAssignmentSummary == false)
            return false;
        IAMPolicyAssignmentSummary other = (IAMPolicyAssignmentSummary) obj;

        if (other.getAssignmentName() == null ^ this.getAssignmentName() == null)
            return false;
        if (other.getAssignmentName() != null
                && other.getAssignmentName().equals(this.getAssignmentName()) == false)
            return false;
        if (other.getAssignmentStatus() == null ^ this.getAssignmentStatus() == null)
            return false;
        if (other.getAssignmentStatus() != null
                && other.getAssignmentStatus().equals(this.getAssignmentStatus()) == false)
            return false;
        return true;
    }
}
