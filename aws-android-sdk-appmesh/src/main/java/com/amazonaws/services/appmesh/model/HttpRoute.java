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
 * An object that represents an HTTP or HTTP/2 route type.
 * </p>
 */
public class HttpRoute implements Serializable {
    /**
     * <p>
     * An object that represents the action to take if a match is determined.
     * </p>
     */
    private HttpRouteAction action;

    /**
     * <p>
     * An object that represents the criteria for determining a request match.
     * </p>
     */
    private HttpRouteMatch match;

    /**
     * <p>
     * An object that represents a retry policy.
     * </p>
     */
    private HttpRetryPolicy retryPolicy;

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
    public HttpRouteAction getAction() {
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
    public void setAction(HttpRouteAction action) {
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
    public HttpRoute withAction(HttpRouteAction action) {
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
    public HttpRouteMatch getMatch() {
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
    public void setMatch(HttpRouteMatch match) {
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
    public HttpRoute withMatch(HttpRouteMatch match) {
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
    public HttpRetryPolicy getRetryPolicy() {
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
    public void setRetryPolicy(HttpRetryPolicy retryPolicy) {
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
    public HttpRoute withRetryPolicy(HttpRetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
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
            sb.append("retryPolicy: " + getRetryPolicy());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HttpRoute == false)
            return false;
        HttpRoute other = (HttpRoute) obj;

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
        return true;
    }
}
