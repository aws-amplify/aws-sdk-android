/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.logs.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates or updates a destination. A destination encapsulates a physical
 * resource (such as an Amazon Kinesis stream) and enables you to subscribe to a
 * real-time stream of log events for a different account, ingested using
 * <a>PutLogEvents</a>. Currently, the only supported physical resource is a
 * Kinesis stream belonging to the same account as the destination.
 * </p>
 * <p>
 * Through an access policy, a destination controls what is written to its
 * Kinesis stream. By default, <code>PutDestination</code> does not set any
 * access policy with the destination, which means a cross-account user cannot
 * call <a>PutSubscriptionFilter</a> against this destination. To enable this,
 * the destination owner must call <a>PutDestinationPolicy</a> after
 * <code>PutDestination</code>.
 * </p>
 */
public class PutDestinationRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A name for the destination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     */
    private String destinationName;

    /**
     * <p>
     * The ARN of an Amazon Kinesis stream to which to deliver matching log
     * events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String targetArn;

    /**
     * <p>
     * The ARN of an IAM role that grants CloudWatch Logs permissions to call
     * the Amazon Kinesis PutRecord operation on the destination stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String roleArn;

    /**
     * <p>
     * A name for the destination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @return <p>
     *         A name for the destination.
     *         </p>
     */
    public String getDestinationName() {
        return destinationName;
    }

    /**
     * <p>
     * A name for the destination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param destinationName <p>
     *            A name for the destination.
     *            </p>
     */
    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    /**
     * <p>
     * A name for the destination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param destinationName <p>
     *            A name for the destination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutDestinationRequest withDestinationName(String destinationName) {
        this.destinationName = destinationName;
        return this;
    }

    /**
     * <p>
     * The ARN of an Amazon Kinesis stream to which to deliver matching log
     * events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The ARN of an Amazon Kinesis stream to which to deliver matching
     *         log events.
     *         </p>
     */
    public String getTargetArn() {
        return targetArn;
    }

    /**
     * <p>
     * The ARN of an Amazon Kinesis stream to which to deliver matching log
     * events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param targetArn <p>
     *            The ARN of an Amazon Kinesis stream to which to deliver
     *            matching log events.
     *            </p>
     */
    public void setTargetArn(String targetArn) {
        this.targetArn = targetArn;
    }

    /**
     * <p>
     * The ARN of an Amazon Kinesis stream to which to deliver matching log
     * events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param targetArn <p>
     *            The ARN of an Amazon Kinesis stream to which to deliver
     *            matching log events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutDestinationRequest withTargetArn(String targetArn) {
        this.targetArn = targetArn;
        return this;
    }

    /**
     * <p>
     * The ARN of an IAM role that grants CloudWatch Logs permissions to call
     * the Amazon Kinesis PutRecord operation on the destination stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The ARN of an IAM role that grants CloudWatch Logs permissions to
     *         call the Amazon Kinesis PutRecord operation on the destination
     *         stream.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The ARN of an IAM role that grants CloudWatch Logs permissions to call
     * the Amazon Kinesis PutRecord operation on the destination stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param roleArn <p>
     *            The ARN of an IAM role that grants CloudWatch Logs permissions
     *            to call the Amazon Kinesis PutRecord operation on the
     *            destination stream.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of an IAM role that grants CloudWatch Logs permissions to call
     * the Amazon Kinesis PutRecord operation on the destination stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param roleArn <p>
     *            The ARN of an IAM role that grants CloudWatch Logs permissions
     *            to call the Amazon Kinesis PutRecord operation on the
     *            destination stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutDestinationRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
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
        if (getDestinationName() != null)
            sb.append("destinationName: " + getDestinationName() + ",");
        if (getTargetArn() != null)
            sb.append("targetArn: " + getTargetArn() + ",");
        if (getRoleArn() != null)
            sb.append("roleArn: " + getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDestinationName() == null) ? 0 : getDestinationName().hashCode());
        hashCode = prime * hashCode + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutDestinationRequest == false)
            return false;
        PutDestinationRequest other = (PutDestinationRequest) obj;

        if (other.getDestinationName() == null ^ this.getDestinationName() == null)
            return false;
        if (other.getDestinationName() != null
                && other.getDestinationName().equals(this.getDestinationName()) == false)
            return false;
        if (other.getTargetArn() == null ^ this.getTargetArn() == null)
            return false;
        if (other.getTargetArn() != null
                && other.getTargetArn().equals(this.getTargetArn()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }
}
