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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import java.io.Serializable;

/**
 * <note>
 * <p>
 * This is prerelease documentation for the RDS Database Proxy feature in
 * preview release. It is subject to change.
 * </p>
 * </note>
 * <p>
 * Information about the connection health of an RDS Proxy target.
 * </p>
 */
public class TargetHealth implements Serializable {
    /**
     * <p>
     * The current state of the connection health lifecycle for the RDS Proxy
     * target. The following is a typical lifecycle example for the states of an
     * RDS Proxy target:
     * </p>
     * <p>
     * <code>registering</code> &gt; <code>unavailable</code> &gt;
     * <code>available</code> &gt; <code>unavailable</code> &gt;
     * <code>available</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTERING, AVAILABLE, UNAVAILABLE
     */
    private String state;

    /**
     * <p>
     * The reason for the current health <code>State</code> of the RDS Proxy
     * target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNREACHABLE, CONNECTION_FAILED, AUTH_FAILURE,
     * PENDING_PROXY_CAPACITY
     */
    private String reason;

    /**
     * <p>
     * A description of the health of the RDS Proxy target. If the
     * <code>State</code> is <code>AVAILABLE</code>, a description is not
     * included.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The current state of the connection health lifecycle for the RDS Proxy
     * target. The following is a typical lifecycle example for the states of an
     * RDS Proxy target:
     * </p>
     * <p>
     * <code>registering</code> &gt; <code>unavailable</code> &gt;
     * <code>available</code> &gt; <code>unavailable</code> &gt;
     * <code>available</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTERING, AVAILABLE, UNAVAILABLE
     *
     * @return <p>
     *         The current state of the connection health lifecycle for the RDS
     *         Proxy target. The following is a typical lifecycle example for
     *         the states of an RDS Proxy target:
     *         </p>
     *         <p>
     *         <code>registering</code> &gt; <code>unavailable</code> &gt;
     *         <code>available</code> &gt; <code>unavailable</code> &gt;
     *         <code>available</code>
     *         </p>
     * @see TargetState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The current state of the connection health lifecycle for the RDS Proxy
     * target. The following is a typical lifecycle example for the states of an
     * RDS Proxy target:
     * </p>
     * <p>
     * <code>registering</code> &gt; <code>unavailable</code> &gt;
     * <code>available</code> &gt; <code>unavailable</code> &gt;
     * <code>available</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTERING, AVAILABLE, UNAVAILABLE
     *
     * @param state <p>
     *            The current state of the connection health lifecycle for the
     *            RDS Proxy target. The following is a typical lifecycle example
     *            for the states of an RDS Proxy target:
     *            </p>
     *            <p>
     *            <code>registering</code> &gt; <code>unavailable</code> &gt;
     *            <code>available</code> &gt; <code>unavailable</code> &gt;
     *            <code>available</code>
     *            </p>
     * @see TargetState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the connection health lifecycle for the RDS Proxy
     * target. The following is a typical lifecycle example for the states of an
     * RDS Proxy target:
     * </p>
     * <p>
     * <code>registering</code> &gt; <code>unavailable</code> &gt;
     * <code>available</code> &gt; <code>unavailable</code> &gt;
     * <code>available</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTERING, AVAILABLE, UNAVAILABLE
     *
     * @param state <p>
     *            The current state of the connection health lifecycle for the
     *            RDS Proxy target. The following is a typical lifecycle example
     *            for the states of an RDS Proxy target:
     *            </p>
     *            <p>
     *            <code>registering</code> &gt; <code>unavailable</code> &gt;
     *            <code>available</code> &gt; <code>unavailable</code> &gt;
     *            <code>available</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TargetState
     */
    public TargetHealth withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The current state of the connection health lifecycle for the RDS Proxy
     * target. The following is a typical lifecycle example for the states of an
     * RDS Proxy target:
     * </p>
     * <p>
     * <code>registering</code> &gt; <code>unavailable</code> &gt;
     * <code>available</code> &gt; <code>unavailable</code> &gt;
     * <code>available</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTERING, AVAILABLE, UNAVAILABLE
     *
     * @param state <p>
     *            The current state of the connection health lifecycle for the
     *            RDS Proxy target. The following is a typical lifecycle example
     *            for the states of an RDS Proxy target:
     *            </p>
     *            <p>
     *            <code>registering</code> &gt; <code>unavailable</code> &gt;
     *            <code>available</code> &gt; <code>unavailable</code> &gt;
     *            <code>available</code>
     *            </p>
     * @see TargetState
     */
    public void setState(TargetState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The current state of the connection health lifecycle for the RDS Proxy
     * target. The following is a typical lifecycle example for the states of an
     * RDS Proxy target:
     * </p>
     * <p>
     * <code>registering</code> &gt; <code>unavailable</code> &gt;
     * <code>available</code> &gt; <code>unavailable</code> &gt;
     * <code>available</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTERING, AVAILABLE, UNAVAILABLE
     *
     * @param state <p>
     *            The current state of the connection health lifecycle for the
     *            RDS Proxy target. The following is a typical lifecycle example
     *            for the states of an RDS Proxy target:
     *            </p>
     *            <p>
     *            <code>registering</code> &gt; <code>unavailable</code> &gt;
     *            <code>available</code> &gt; <code>unavailable</code> &gt;
     *            <code>available</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TargetState
     */
    public TargetHealth withState(TargetState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the current health <code>State</code> of the RDS Proxy
     * target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNREACHABLE, CONNECTION_FAILED, AUTH_FAILURE,
     * PENDING_PROXY_CAPACITY
     *
     * @return <p>
     *         The reason for the current health <code>State</code> of the RDS
     *         Proxy target.
     *         </p>
     * @see TargetHealthReason
     */
    public String getReason() {
        return reason;
    }

    /**
     * <p>
     * The reason for the current health <code>State</code> of the RDS Proxy
     * target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNREACHABLE, CONNECTION_FAILED, AUTH_FAILURE,
     * PENDING_PROXY_CAPACITY
     *
     * @param reason <p>
     *            The reason for the current health <code>State</code> of the
     *            RDS Proxy target.
     *            </p>
     * @see TargetHealthReason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason for the current health <code>State</code> of the RDS Proxy
     * target.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNREACHABLE, CONNECTION_FAILED, AUTH_FAILURE,
     * PENDING_PROXY_CAPACITY
     *
     * @param reason <p>
     *            The reason for the current health <code>State</code> of the
     *            RDS Proxy target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TargetHealthReason
     */
    public TargetHealth withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * <p>
     * The reason for the current health <code>State</code> of the RDS Proxy
     * target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNREACHABLE, CONNECTION_FAILED, AUTH_FAILURE,
     * PENDING_PROXY_CAPACITY
     *
     * @param reason <p>
     *            The reason for the current health <code>State</code> of the
     *            RDS Proxy target.
     *            </p>
     * @see TargetHealthReason
     */
    public void setReason(TargetHealthReason reason) {
        this.reason = reason.toString();
    }

    /**
     * <p>
     * The reason for the current health <code>State</code> of the RDS Proxy
     * target.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNREACHABLE, CONNECTION_FAILED, AUTH_FAILURE,
     * PENDING_PROXY_CAPACITY
     *
     * @param reason <p>
     *            The reason for the current health <code>State</code> of the
     *            RDS Proxy target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TargetHealthReason
     */
    public TargetHealth withReason(TargetHealthReason reason) {
        this.reason = reason.toString();
        return this;
    }

    /**
     * <p>
     * A description of the health of the RDS Proxy target. If the
     * <code>State</code> is <code>AVAILABLE</code>, a description is not
     * included.
     * </p>
     *
     * @return <p>
     *         A description of the health of the RDS Proxy target. If the
     *         <code>State</code> is <code>AVAILABLE</code>, a description is
     *         not included.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the health of the RDS Proxy target. If the
     * <code>State</code> is <code>AVAILABLE</code>, a description is not
     * included.
     * </p>
     *
     * @param description <p>
     *            A description of the health of the RDS Proxy target. If the
     *            <code>State</code> is <code>AVAILABLE</code>, a description is
     *            not included.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the health of the RDS Proxy target. If the
     * <code>State</code> is <code>AVAILABLE</code>, a description is not
     * included.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description of the health of the RDS Proxy target. If the
     *            <code>State</code> is <code>AVAILABLE</code>, a description is
     *            not included.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetHealth withDescription(String description) {
        this.description = description;
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
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getReason() != null)
            sb.append("Reason: " + getReason() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetHealth == false)
            return false;
        TargetHealth other = (TargetHealth) obj;

        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }
}
