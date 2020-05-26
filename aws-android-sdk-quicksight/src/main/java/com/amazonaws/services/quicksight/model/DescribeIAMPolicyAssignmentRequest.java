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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Describes an existing IAM policy assignment, as specified by the assignment
 * name.
 * </p>
 */
public class DescribeIAMPolicyAssignmentRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the AWS account that contains the assignment that you want to
     * describe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     */
    private String awsAccountId;

    /**
     * <p>
     * The name of the assignment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>(?=^.{2,256}$)(?!.*\s)[0-9a-zA-Z-_.:=+@]*$<br/>
     */
    private String assignmentName;

    /**
     * <p>
     * The namespace that contains the assignment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9._-]*$<br/>
     */
    private String namespace;

    /**
     * <p>
     * The ID of the AWS account that contains the assignment that you want to
     * describe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @return <p>
     *         The ID of the AWS account that contains the assignment that you
     *         want to describe.
     *         </p>
     */
    public String getAwsAccountId() {
        return awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that contains the assignment that you want to
     * describe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param awsAccountId <p>
     *            The ID of the AWS account that contains the assignment that
     *            you want to describe.
     *            </p>
     */
    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that contains the assignment that you want to
     * describe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param awsAccountId <p>
     *            The ID of the AWS account that contains the assignment that
     *            you want to describe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeIAMPolicyAssignmentRequest withAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
        return this;
    }

    /**
     * <p>
     * The name of the assignment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>(?=^.{2,256}$)(?!.*\s)[0-9a-zA-Z-_.:=+@]*$<br/>
     *
     * @return <p>
     *         The name of the assignment.
     *         </p>
     */
    public String getAssignmentName() {
        return assignmentName;
    }

    /**
     * <p>
     * The name of the assignment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>(?=^.{2,256}$)(?!.*\s)[0-9a-zA-Z-_.:=+@]*$<br/>
     *
     * @param assignmentName <p>
     *            The name of the assignment.
     *            </p>
     */
    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    /**
     * <p>
     * The name of the assignment.
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
     *            The name of the assignment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeIAMPolicyAssignmentRequest withAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
        return this;
    }

    /**
     * <p>
     * The namespace that contains the assignment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9._-]*$<br/>
     *
     * @return <p>
     *         The namespace that contains the assignment.
     *         </p>
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * <p>
     * The namespace that contains the assignment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9._-]*$<br/>
     *
     * @param namespace <p>
     *            The namespace that contains the assignment.
     *            </p>
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace that contains the assignment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9._-]*$<br/>
     *
     * @param namespace <p>
     *            The namespace that contains the assignment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeIAMPolicyAssignmentRequest withNamespace(String namespace) {
        this.namespace = namespace;
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: " + getAwsAccountId() + ",");
        if (getAssignmentName() != null)
            sb.append("AssignmentName: " + getAssignmentName() + ",");
        if (getNamespace() != null)
            sb.append("Namespace: " + getNamespace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode
                + ((getAssignmentName() == null) ? 0 : getAssignmentName().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeIAMPolicyAssignmentRequest == false)
            return false;
        DescribeIAMPolicyAssignmentRequest other = (DescribeIAMPolicyAssignmentRequest) obj;

        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null
                && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getAssignmentName() == null ^ this.getAssignmentName() == null)
            return false;
        if (other.getAssignmentName() != null
                && other.getAssignmentName().equals(this.getAssignmentName()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null
                && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        return true;
    }
}
