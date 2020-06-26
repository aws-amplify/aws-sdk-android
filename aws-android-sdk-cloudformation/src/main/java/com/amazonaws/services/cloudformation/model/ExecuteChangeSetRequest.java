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

package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates a stack using the input information that was provided when the
 * specified change set was created. After the call successfully completes, AWS
 * CloudFormation starts updating the stack. Use the <a>DescribeStacks</a>
 * action to view the status of the update.
 * </p>
 * <p>
 * When you execute a change set, AWS CloudFormation deletes all other change
 * sets associated with the stack because they aren't valid for the updated
 * stack.
 * </p>
 * <p>
 * If a stack policy is associated with the stack, AWS CloudFormation enforces
 * the policy during the update. You can't specify a temporary stack policy that
 * overrides the current policy.
 * </p>
 */
public class ExecuteChangeSetRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name or ARN of the change set that you want use to update the
     * specified stack.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[a-zA-Z][-a-zA-Z0-9]*|arn:[-a-zA-Z0-9:/]*<br/>
     */
    private String changeSetName;

    /**
     * <p>
     * If you specified the name of a change set, specify the stack name or ID
     * (ARN) that is associated with the change set you want to execute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern:
     * </b>([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[
     * -a-zA-Z0-9:/._+]*)<br/>
     */
    private String stackName;

    /**
     * <p>
     * A unique identifier for this <code>ExecuteChangeSet</code> request.
     * Specify this token if you plan to retry requests so that AWS
     * CloudFormation knows that you're not attempting to execute a change set
     * to update a stack with the same name. You might retry
     * <code>ExecuteChangeSet</code> requests to ensure that AWS CloudFormation
     * successfully received them.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The name or ARN of the change set that you want use to update the
     * specified stack.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[a-zA-Z][-a-zA-Z0-9]*|arn:[-a-zA-Z0-9:/]*<br/>
     *
     * @return <p>
     *         The name or ARN of the change set that you want use to update the
     *         specified stack.
     *         </p>
     */
    public String getChangeSetName() {
        return changeSetName;
    }

    /**
     * <p>
     * The name or ARN of the change set that you want use to update the
     * specified stack.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[a-zA-Z][-a-zA-Z0-9]*|arn:[-a-zA-Z0-9:/]*<br/>
     *
     * @param changeSetName <p>
     *            The name or ARN of the change set that you want use to update
     *            the specified stack.
     *            </p>
     */
    public void setChangeSetName(String changeSetName) {
        this.changeSetName = changeSetName;
    }

    /**
     * <p>
     * The name or ARN of the change set that you want use to update the
     * specified stack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[a-zA-Z][-a-zA-Z0-9]*|arn:[-a-zA-Z0-9:/]*<br/>
     *
     * @param changeSetName <p>
     *            The name or ARN of the change set that you want use to update
     *            the specified stack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExecuteChangeSetRequest withChangeSetName(String changeSetName) {
        this.changeSetName = changeSetName;
        return this;
    }

    /**
     * <p>
     * If you specified the name of a change set, specify the stack name or ID
     * (ARN) that is associated with the change set you want to execute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern:
     * </b>([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[
     * -a-zA-Z0-9:/._+]*)<br/>
     *
     * @return <p>
     *         If you specified the name of a change set, specify the stack name
     *         or ID (ARN) that is associated with the change set you want to
     *         execute.
     *         </p>
     */
    public String getStackName() {
        return stackName;
    }

    /**
     * <p>
     * If you specified the name of a change set, specify the stack name or ID
     * (ARN) that is associated with the change set you want to execute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern:
     * </b>([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[
     * -a-zA-Z0-9:/._+]*)<br/>
     *
     * @param stackName <p>
     *            If you specified the name of a change set, specify the stack
     *            name or ID (ARN) that is associated with the change set you
     *            want to execute.
     *            </p>
     */
    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * If you specified the name of a change set, specify the stack name or ID
     * (ARN) that is associated with the change set you want to execute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern:
     * </b>([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[
     * -a-zA-Z0-9:/._+]*)<br/>
     *
     * @param stackName <p>
     *            If you specified the name of a change set, specify the stack
     *            name or ID (ARN) that is associated with the change set you
     *            want to execute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExecuteChangeSetRequest withStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }

    /**
     * <p>
     * A unique identifier for this <code>ExecuteChangeSet</code> request.
     * Specify this token if you plan to retry requests so that AWS
     * CloudFormation knows that you're not attempting to execute a change set
     * to update a stack with the same name. You might retry
     * <code>ExecuteChangeSet</code> requests to ensure that AWS CloudFormation
     * successfully received them.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     *
     * @return <p>
     *         A unique identifier for this <code>ExecuteChangeSet</code>
     *         request. Specify this token if you plan to retry requests so that
     *         AWS CloudFormation knows that you're not attempting to execute a
     *         change set to update a stack with the same name. You might retry
     *         <code>ExecuteChangeSet</code> requests to ensure that AWS
     *         CloudFormation successfully received them.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * A unique identifier for this <code>ExecuteChangeSet</code> request.
     * Specify this token if you plan to retry requests so that AWS
     * CloudFormation knows that you're not attempting to execute a change set
     * to update a stack with the same name. You might retry
     * <code>ExecuteChangeSet</code> requests to ensure that AWS CloudFormation
     * successfully received them.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     *
     * @param clientRequestToken <p>
     *            A unique identifier for this <code>ExecuteChangeSet</code>
     *            request. Specify this token if you plan to retry requests so
     *            that AWS CloudFormation knows that you're not attempting to
     *            execute a change set to update a stack with the same name. You
     *            might retry <code>ExecuteChangeSet</code> requests to ensure
     *            that AWS CloudFormation successfully received them.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique identifier for this <code>ExecuteChangeSet</code> request.
     * Specify this token if you plan to retry requests so that AWS
     * CloudFormation knows that you're not attempting to execute a change set
     * to update a stack with the same name. You might retry
     * <code>ExecuteChangeSet</code> requests to ensure that AWS CloudFormation
     * successfully received them.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     *
     * @param clientRequestToken <p>
     *            A unique identifier for this <code>ExecuteChangeSet</code>
     *            request. Specify this token if you plan to retry requests so
     *            that AWS CloudFormation knows that you're not attempting to
     *            execute a change set to update a stack with the same name. You
     *            might retry <code>ExecuteChangeSet</code> requests to ensure
     *            that AWS CloudFormation successfully received them.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExecuteChangeSetRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
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
        if (getChangeSetName() != null)
            sb.append("ChangeSetName: " + getChangeSetName() + ",");
        if (getStackName() != null)
            sb.append("StackName: " + getStackName() + ",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: " + getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getChangeSetName() == null) ? 0 : getChangeSetName().hashCode());
        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecuteChangeSetRequest == false)
            return false;
        ExecuteChangeSetRequest other = (ExecuteChangeSetRequest) obj;

        if (other.getChangeSetName() == null ^ this.getChangeSetName() == null)
            return false;
        if (other.getChangeSetName() != null
                && other.getChangeSetName().equals(this.getChangeSetName()) == false)
            return false;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null
                && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }
}
