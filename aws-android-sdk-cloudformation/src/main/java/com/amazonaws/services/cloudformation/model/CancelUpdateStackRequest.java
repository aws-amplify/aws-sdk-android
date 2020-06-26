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
 * Cancels an update on the specified stack. If the call completes successfully,
 * the stack rolls back the update and reverts to the previous stack
 * configuration.
 * </p>
 * <note>
 * <p>
 * You can cancel only stacks that are in the UPDATE_IN_PROGRESS state.
 * </p>
 * </note>
 */
public class CancelUpdateStackRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name or the unique stack ID that is associated with the stack.
     * </p>
     */
    private String stackName;

    /**
     * <p>
     * A unique identifier for this <code>CancelUpdateStack</code> request.
     * Specify this token if you plan to retry requests so that AWS
     * CloudFormation knows that you're not attempting to cancel an update on a
     * stack with the same name. You might retry <code>CancelUpdateStack</code>
     * requests to ensure that AWS CloudFormation successfully received them.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The name or the unique stack ID that is associated with the stack.
     * </p>
     *
     * @return <p>
     *         The name or the unique stack ID that is associated with the
     *         stack.
     *         </p>
     */
    public String getStackName() {
        return stackName;
    }

    /**
     * <p>
     * The name or the unique stack ID that is associated with the stack.
     * </p>
     *
     * @param stackName <p>
     *            The name or the unique stack ID that is associated with the
     *            stack.
     *            </p>
     */
    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name or the unique stack ID that is associated with the stack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackName <p>
     *            The name or the unique stack ID that is associated with the
     *            stack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CancelUpdateStackRequest withStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }

    /**
     * <p>
     * A unique identifier for this <code>CancelUpdateStack</code> request.
     * Specify this token if you plan to retry requests so that AWS
     * CloudFormation knows that you're not attempting to cancel an update on a
     * stack with the same name. You might retry <code>CancelUpdateStack</code>
     * requests to ensure that AWS CloudFormation successfully received them.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     *
     * @return <p>
     *         A unique identifier for this <code>CancelUpdateStack</code>
     *         request. Specify this token if you plan to retry requests so that
     *         AWS CloudFormation knows that you're not attempting to cancel an
     *         update on a stack with the same name. You might retry
     *         <code>CancelUpdateStack</code> requests to ensure that AWS
     *         CloudFormation successfully received them.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * A unique identifier for this <code>CancelUpdateStack</code> request.
     * Specify this token if you plan to retry requests so that AWS
     * CloudFormation knows that you're not attempting to cancel an update on a
     * stack with the same name. You might retry <code>CancelUpdateStack</code>
     * requests to ensure that AWS CloudFormation successfully received them.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     *
     * @param clientRequestToken <p>
     *            A unique identifier for this <code>CancelUpdateStack</code>
     *            request. Specify this token if you plan to retry requests so
     *            that AWS CloudFormation knows that you're not attempting to
     *            cancel an update on a stack with the same name. You might
     *            retry <code>CancelUpdateStack</code> requests to ensure that
     *            AWS CloudFormation successfully received them.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique identifier for this <code>CancelUpdateStack</code> request.
     * Specify this token if you plan to retry requests so that AWS
     * CloudFormation knows that you're not attempting to cancel an update on a
     * stack with the same name. You might retry <code>CancelUpdateStack</code>
     * requests to ensure that AWS CloudFormation successfully received them.
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
     *            A unique identifier for this <code>CancelUpdateStack</code>
     *            request. Specify this token if you plan to retry requests so
     *            that AWS CloudFormation knows that you're not attempting to
     *            cancel an update on a stack with the same name. You might
     *            retry <code>CancelUpdateStack</code> requests to ensure that
     *            AWS CloudFormation successfully received them.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CancelUpdateStackRequest withClientRequestToken(String clientRequestToken) {
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

        if (obj instanceof CancelUpdateStackRequest == false)
            return false;
        CancelUpdateStackRequest other = (CancelUpdateStackRequest) obj;

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
