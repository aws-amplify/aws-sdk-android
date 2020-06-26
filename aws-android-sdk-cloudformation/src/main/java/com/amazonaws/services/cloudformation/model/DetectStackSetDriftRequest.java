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
 * Detect drift on a stack set. When CloudFormation performs drift detection on
 * a stack set, it performs drift detection on the stack associated with each
 * stack instance in the stack set. For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-drift.html"
 * >How CloudFormation Performs Drift Detection on a Stack Set</a>.
 * </p>
 * <p>
 * <code>DetectStackSetDrift</code> returns the <code>OperationId</code> of the
 * stack set drift detection operation. Use this operation id with
 * <code> <a>DescribeStackSetOperation</a> </code> to monitor the progress of
 * the drift detection operation. The drift detection operation may take some
 * time, depending on the number of stack instances included in the stack set,
 * as well as the number of resources included in each stack.
 * </p>
 * <p>
 * Once the operation has completed, use the following actions to return drift
 * information:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Use <code> <a>DescribeStackSet</a> </code> to return detailed informaiton
 * about the stack set, including detailed information about the last
 * <i>completed</i> drift operation performed on the stack set. (Information
 * about drift operations that are in progress is not included.)
 * </p>
 * </li>
 * <li>
 * <p>
 * Use <code> <a>ListStackInstances</a> </code> to return a list of stack
 * instances belonging to the stack set, including the drift status and last
 * drift time checked of each instance.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use <code> <a>DescribeStackInstance</a> </code> to return detailed
 * information about a specific stack instance, including its drift status and
 * last drift time checked.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information on performing a drift detection operation on a stack
 * set, see <a href=
 * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-drift.html"
 * >Detecting Unmanaged Changes in Stack Sets</a>.
 * </p>
 * <p>
 * You can only run a single drift detection operation on a given stack set at
 * one time.
 * </p>
 * <p>
 * To stop a drift detection stack set operation, use
 * <code> <a>StopStackSetOperation</a> </code>.
 * </p>
 */
public class DetectStackSetDriftRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the stack set on which to perform the drift detection
     * operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[a-zA-Z][-a-zA-Z0-9]*(?::[a-zA-Z0-9]{8}-[a-zA-Z0-9]{4}-[a-
     * zA-Z0-9]{4}-[a-zA-Z0-9]{4}-[a-zA-Z0-9]{12})?<br/>
     */
    private String stackSetName;

    /**
     * <p>
     * The user-specified preferences for how AWS CloudFormation performs a
     * stack set operation.
     * </p>
     * <p>
     * For more information on maximum concurrent accounts and failure
     * tolerance, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-ops-options"
     * >Stack set operation options</a>.
     * </p>
     */
    private StackSetOperationPreferences operationPreferences;

    /**
     * <p>
     * <i>The ID of the stack set operation.</i>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     */
    private String operationId;

    /**
     * <p>
     * The name of the stack set on which to perform the drift detection
     * operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[a-zA-Z][-a-zA-Z0-9]*(?::[a-zA-Z0-9]{8}-[a-zA-Z0-9]{4}-[a-
     * zA-Z0-9]{4}-[a-zA-Z0-9]{4}-[a-zA-Z0-9]{12})?<br/>
     *
     * @return <p>
     *         The name of the stack set on which to perform the drift detection
     *         operation.
     *         </p>
     */
    public String getStackSetName() {
        return stackSetName;
    }

    /**
     * <p>
     * The name of the stack set on which to perform the drift detection
     * operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[a-zA-Z][-a-zA-Z0-9]*(?::[a-zA-Z0-9]{8}-[a-zA-Z0-9]{4}-[a-
     * zA-Z0-9]{4}-[a-zA-Z0-9]{4}-[a-zA-Z0-9]{12})?<br/>
     *
     * @param stackSetName <p>
     *            The name of the stack set on which to perform the drift
     *            detection operation.
     *            </p>
     */
    public void setStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
    }

    /**
     * <p>
     * The name of the stack set on which to perform the drift detection
     * operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[a-zA-Z][-a-zA-Z0-9]*(?::[a-zA-Z0-9]{8}-[a-zA-Z0-9]{4}-[a-
     * zA-Z0-9]{4}-[a-zA-Z0-9]{4}-[a-zA-Z0-9]{12})?<br/>
     *
     * @param stackSetName <p>
     *            The name of the stack set on which to perform the drift
     *            detection operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectStackSetDriftRequest withStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
        return this;
    }

    /**
     * <p>
     * The user-specified preferences for how AWS CloudFormation performs a
     * stack set operation.
     * </p>
     * <p>
     * For more information on maximum concurrent accounts and failure
     * tolerance, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-ops-options"
     * >Stack set operation options</a>.
     * </p>
     *
     * @return <p>
     *         The user-specified preferences for how AWS CloudFormation
     *         performs a stack set operation.
     *         </p>
     *         <p>
     *         For more information on maximum concurrent accounts and failure
     *         tolerance, see <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-ops-options"
     *         >Stack set operation options</a>.
     *         </p>
     */
    public StackSetOperationPreferences getOperationPreferences() {
        return operationPreferences;
    }

    /**
     * <p>
     * The user-specified preferences for how AWS CloudFormation performs a
     * stack set operation.
     * </p>
     * <p>
     * For more information on maximum concurrent accounts and failure
     * tolerance, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-ops-options"
     * >Stack set operation options</a>.
     * </p>
     *
     * @param operationPreferences <p>
     *            The user-specified preferences for how AWS CloudFormation
     *            performs a stack set operation.
     *            </p>
     *            <p>
     *            For more information on maximum concurrent accounts and
     *            failure tolerance, see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-ops-options"
     *            >Stack set operation options</a>.
     *            </p>
     */
    public void setOperationPreferences(StackSetOperationPreferences operationPreferences) {
        this.operationPreferences = operationPreferences;
    }

    /**
     * <p>
     * The user-specified preferences for how AWS CloudFormation performs a
     * stack set operation.
     * </p>
     * <p>
     * For more information on maximum concurrent accounts and failure
     * tolerance, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-ops-options"
     * >Stack set operation options</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param operationPreferences <p>
     *            The user-specified preferences for how AWS CloudFormation
     *            performs a stack set operation.
     *            </p>
     *            <p>
     *            For more information on maximum concurrent accounts and
     *            failure tolerance, see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-ops-options"
     *            >Stack set operation options</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectStackSetDriftRequest withOperationPreferences(
            StackSetOperationPreferences operationPreferences) {
        this.operationPreferences = operationPreferences;
        return this;
    }

    /**
     * <p>
     * <i>The ID of the stack set operation.</i>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     *
     * @return <p>
     *         <i>The ID of the stack set operation.</i>
     *         </p>
     */
    public String getOperationId() {
        return operationId;
    }

    /**
     * <p>
     * <i>The ID of the stack set operation.</i>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     *
     * @param operationId <p>
     *            <i>The ID of the stack set operation.</i>
     *            </p>
     */
    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    /**
     * <p>
     * <i>The ID of the stack set operation.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     *
     * @param operationId <p>
     *            <i>The ID of the stack set operation.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectStackSetDriftRequest withOperationId(String operationId) {
        this.operationId = operationId;
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
        if (getStackSetName() != null)
            sb.append("StackSetName: " + getStackSetName() + ",");
        if (getOperationPreferences() != null)
            sb.append("OperationPreferences: " + getOperationPreferences() + ",");
        if (getOperationId() != null)
            sb.append("OperationId: " + getOperationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStackSetName() == null) ? 0 : getStackSetName().hashCode());
        hashCode = prime * hashCode
                + ((getOperationPreferences() == null) ? 0 : getOperationPreferences().hashCode());
        hashCode = prime * hashCode
                + ((getOperationId() == null) ? 0 : getOperationId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectStackSetDriftRequest == false)
            return false;
        DetectStackSetDriftRequest other = (DetectStackSetDriftRequest) obj;

        if (other.getStackSetName() == null ^ this.getStackSetName() == null)
            return false;
        if (other.getStackSetName() != null
                && other.getStackSetName().equals(this.getStackSetName()) == false)
            return false;
        if (other.getOperationPreferences() == null ^ this.getOperationPreferences() == null)
            return false;
        if (other.getOperationPreferences() != null
                && other.getOperationPreferences().equals(this.getOperationPreferences()) == false)
            return false;
        if (other.getOperationId() == null ^ this.getOperationId() == null)
            return false;
        if (other.getOperationId() != null
                && other.getOperationId().equals(this.getOperationId()) == false)
            return false;
        return true;
    }
}
