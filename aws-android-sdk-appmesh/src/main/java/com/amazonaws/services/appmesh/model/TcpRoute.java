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
 * An object that represents a TCP route type.
 * </p>
 */
public class TcpRoute implements Serializable {
    /**
     * <p>
     * The action to take if a match is determined.
     * </p>
     */
    private TcpRouteAction action;

    /**
     * The new value for the timeout property for this object.
     */
    private TcpTimeout timeout;

    /**
     * <p>
     * The action to take if a match is determined.
     * </p>
     *
     * @return <p>
     *         The action to take if a match is determined.
     *         </p>
     */
    public TcpRouteAction getAction() {
        return action;
    }

    /**
     * <p>
     * The action to take if a match is determined.
     * </p>
     *
     * @param action <p>
     *            The action to take if a match is determined.
     *            </p>
     */
    public void setAction(TcpRouteAction action) {
        this.action = action;
    }

    /**
     * <p>
     * The action to take if a match is determined.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param action <p>
     *            The action to take if a match is determined.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TcpRoute withAction(TcpRouteAction action) {
        this.action = action;
        return this;
    }

    /**
     * Returns the value of the timeout property for this object.
     *
     * @return The value of the timeout property for this object.
     */
    public TcpTimeout getTimeout() {
        return timeout;
    }

    /**
     * Sets the value of timeout
     *
     * @param timeout The new value for the timeout property for this object.
     */
    public void setTimeout(TcpTimeout timeout) {
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
    public TcpRoute withTimeout(TcpTimeout timeout) {
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
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TcpRoute == false)
            return false;
        TcpRoute other = (TcpRoute) obj;

        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getTimeout() == null ^ this.getTimeout() == null)
            return false;
        if (other.getTimeout() != null && other.getTimeout().equals(this.getTimeout()) == false)
            return false;
        return true;
    }
}
