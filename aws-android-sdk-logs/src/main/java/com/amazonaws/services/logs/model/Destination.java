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

/**
 * <p>
 * Represents a cross-account destination that receives subscription log events.
 * </p>
 */
public class Destination implements Serializable {
    /**
     * <p>
     * The name of the destination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     */
    private String destinationName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the physical target to where the log
     * events are delivered (for example, a Kinesis stream).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String targetArn;

    /**
     * <p>
     * A role for impersonation, used when delivering log events to the target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String roleArn;

    /**
     * <p>
     * An IAM policy document that governs which AWS accounts can create
     * subscription filters against this destination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String accessPolicy;

    /**
     * <p>
     * The ARN of this destination.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The creation time of the destination, expressed as the number of
     * milliseconds after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long creationTime;

    /**
     * <p>
     * The name of the destination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @return <p>
     *         The name of the destination.
     *         </p>
     */
    public String getDestinationName() {
        return destinationName;
    }

    /**
     * <p>
     * The name of the destination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param destinationName <p>
     *            The name of the destination.
     *            </p>
     */
    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    /**
     * <p>
     * The name of the destination.
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
     *            The name of the destination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Destination withDestinationName(String destinationName) {
        this.destinationName = destinationName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the physical target to where the log
     * events are delivered (for example, a Kinesis stream).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the physical target to where
     *         the log events are delivered (for example, a Kinesis stream).
     *         </p>
     */
    public String getTargetArn() {
        return targetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the physical target to where the log
     * events are delivered (for example, a Kinesis stream).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param targetArn <p>
     *            The Amazon Resource Name (ARN) of the physical target to where
     *            the log events are delivered (for example, a Kinesis stream).
     *            </p>
     */
    public void setTargetArn(String targetArn) {
        this.targetArn = targetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the physical target to where the log
     * events are delivered (for example, a Kinesis stream).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param targetArn <p>
     *            The Amazon Resource Name (ARN) of the physical target to where
     *            the log events are delivered (for example, a Kinesis stream).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Destination withTargetArn(String targetArn) {
        this.targetArn = targetArn;
        return this;
    }

    /**
     * <p>
     * A role for impersonation, used when delivering log events to the target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         A role for impersonation, used when delivering log events to the
     *         target.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * A role for impersonation, used when delivering log events to the target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param roleArn <p>
     *            A role for impersonation, used when delivering log events to
     *            the target.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * A role for impersonation, used when delivering log events to the target.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param roleArn <p>
     *            A role for impersonation, used when delivering log events to
     *            the target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Destination withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * An IAM policy document that governs which AWS accounts can create
     * subscription filters against this destination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         An IAM policy document that governs which AWS accounts can create
     *         subscription filters against this destination.
     *         </p>
     */
    public String getAccessPolicy() {
        return accessPolicy;
    }

    /**
     * <p>
     * An IAM policy document that governs which AWS accounts can create
     * subscription filters against this destination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param accessPolicy <p>
     *            An IAM policy document that governs which AWS accounts can
     *            create subscription filters against this destination.
     *            </p>
     */
    public void setAccessPolicy(String accessPolicy) {
        this.accessPolicy = accessPolicy;
    }

    /**
     * <p>
     * An IAM policy document that governs which AWS accounts can create
     * subscription filters against this destination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param accessPolicy <p>
     *            An IAM policy document that governs which AWS accounts can
     *            create subscription filters against this destination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Destination withAccessPolicy(String accessPolicy) {
        this.accessPolicy = accessPolicy;
        return this;
    }

    /**
     * <p>
     * The ARN of this destination.
     * </p>
     *
     * @return <p>
     *         The ARN of this destination.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The ARN of this destination.
     * </p>
     *
     * @param arn <p>
     *            The ARN of this destination.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of this destination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The ARN of this destination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Destination withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The creation time of the destination, expressed as the number of
     * milliseconds after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The creation time of the destination, expressed as the number of
     *         milliseconds after Jan 1, 1970 00:00:00 UTC.
     *         </p>
     */
    public Long getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The creation time of the destination, expressed as the number of
     * milliseconds after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param creationTime <p>
     *            The creation time of the destination, expressed as the number
     *            of milliseconds after Jan 1, 1970 00:00:00 UTC.
     *            </p>
     */
    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time of the destination, expressed as the number of
     * milliseconds after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param creationTime <p>
     *            The creation time of the destination, expressed as the number
     *            of milliseconds after Jan 1, 1970 00:00:00 UTC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Destination withCreationTime(Long creationTime) {
        this.creationTime = creationTime;
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
            sb.append("roleArn: " + getRoleArn() + ",");
        if (getAccessPolicy() != null)
            sb.append("accessPolicy: " + getAccessPolicy() + ",");
        if (getArn() != null)
            sb.append("arn: " + getArn() + ",");
        if (getCreationTime() != null)
            sb.append("creationTime: " + getCreationTime());
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
        hashCode = prime * hashCode
                + ((getAccessPolicy() == null) ? 0 : getAccessPolicy().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Destination == false)
            return false;
        Destination other = (Destination) obj;

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
        if (other.getAccessPolicy() == null ^ this.getAccessPolicy() == null)
            return false;
        if (other.getAccessPolicy() != null
                && other.getAccessPolicy().equals(this.getAccessPolicy()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }
}
