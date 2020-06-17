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

package com.amazonaws.services.appmesh.model;

import java.io.Serializable;

/**
 * <p>
 * An object that represents a gRPC route type.
 * </p>
 */
public class GrpcRoute implements Serializable {
    /**
     * <p>
     * An object that represents the action to take if a match is determined.
     * </p>
     */
    private GrpcRouteAction action;

    /**
     * <p>
     * An object that represents the criteria for determining a request match.
     * </p>
     */
    private GrpcRouteMatch match;

    /**
     * <p>
     * An object that represents a retry policy.
     * </p>
     */
    private GrpcRetryPolicy retryPolicy;

    /**
     * The new value for the timeout property for this object.
     */
    private GrpcTimeout timeout;

    /**
     * <p>
     * An object that represents the action to take if a match is determined.
     * </p>
     *
     * @return <p>
     *         An object that represents the action to take if a match is
     *         determined.
     *         </p>
     */
    public GrpcRouteAction getAction() {
        return action;
    }

    /**
     * <p>
     * An object that represents the action to take if a match is determined.
     * </p>
     *
     * @param action <p>
     *            An object that represents the action to take if a match is
     *            determined.
     *            </p>
     */
    public void setAction(GrpcRouteAction action) {
        this.action = action;
    }

    /**
     * <p>
     * An object that represents the action to take if a match is determined.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param action <p>
     *            An object that represents the action to take if a match is
     *            determined.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GrpcRoute withAction(GrpcRouteAction action) {
        this.action = action;
        return this;
    }

    /**
     * <p>
     * An object that represents the criteria for determining a request match.
     * </p>
     *
     * @return <p>
     *         An object that represents the criteria for determining a request
     *         match.
     *         </p>
     */
    public GrpcRouteMatch getMatch() {
        return match;
    }

    /**
     * <p>
     * An object that represents the criteria for determining a request match.
     * </p>
     *
     * @param match <p>
     *            An object that represents the criteria for determining a
     *            request match.
     *            </p>
     */
    public void setMatch(GrpcRouteMatch match) {
        this.match = match;
    }

    /**
     * <p>
     * An object that represents the criteria for determining a request match.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param match <p>
     *            An object that represents the criteria for determining a
     *            request match.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GrpcRoute withMatch(GrpcRouteMatch match) {
        this.match = match;
        return this;
    }

    /**
     * <p>
     * An object that represents a retry policy.
     * </p>
     *
     * @return <p>
     *         An object that represents a retry policy.
     *         </p>
     */
    public GrpcRetryPolicy getRetryPolicy() {
        return retryPolicy;
    }

    /**
     * <p>
     * An object that represents a retry policy.
     * </p>
     *
     * @param retryPolicy <p>
     *            An object that represents a retry policy.
     *            </p>
     */
    public void setRetryPolicy(GrpcRetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
    }

    /**
     * <p>
     * An object that represents a retry policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param retryPolicy <p>
     *            An object that represents a retry policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GrpcRoute withRetryPolicy(GrpcRetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    /**
     * Returns the value of the timeout property for this object.
     *
     * @return The value of the timeout property for this object.
     */
    public GrpcTimeout getTimeout() {
        return timeout;
    }

    /**
     * Sets the value of timeout
     *
     * @param timeout The new value for the timeout property for this object.
     */
    public void setTimeout(GrpcTimeout timeout) {
        this.timeout = timeout;
    }

    /**
     * Sets the value of the timeout property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeout The new value for the timeout property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GrpcRoute withTimeout(GrpcTimeout timeout) {
        this.timeout = timeout;
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
        if (getAction() != null)
            sb.append("action: " + getAction() + ",");
        if (getMatch() != null)
            sb.append("match: " + getMatch() + ",");
        if (getRetryPolicy() != null)
            sb.append("retryPolicy: " + getRetryPolicy() + ",");
        if (getTimeout() != null)
            sb.append("timeout: " + getTimeout());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getMatch() == null) ? 0 : getMatch().hashCode());
        hashCode = prime * hashCode
                + ((getRetryPolicy() == null) ? 0 : getRetryPolicy().hashCode());
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GrpcRoute == false)
            return false;
        GrpcRoute other = (GrpcRoute) obj;

        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getMatch() == null ^ this.getMatch() == null)
            return false;
        if (other.getMatch() != null && other.getMatch().equals(this.getMatch()) == false)
            return false;
        if (other.getRetryPolicy() == null ^ this.getRetryPolicy() == null)
            return false;
        if (other.getRetryPolicy() != null
                && other.getRetryPolicy().equals(this.getRetryPolicy()) == false)
            return false;
        if (other.getTimeout() == null ^ this.getTimeout() == null)
            return false;
        if (other.getTimeout() != null && other.getTimeout().equals(this.getTimeout()) == false)
            return false;
        return true;
    }
}
