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

public class TcpTimeout implements Serializable {
    /**
     * <p>
     * An object that represents a duration of time.
     * </p>
     */
    private Duration idle;

    /**
     * <p>
     * An object that represents a duration of time.
     * </p>
     *
     * @return <p>
     *         An object that represents a duration of time.
     *         </p>
     */
    public Duration getIdle() {
        return idle;
    }

    /**
     * <p>
     * An object that represents a duration of time.
     * </p>
     *
     * @param idle <p>
     *            An object that represents a duration of time.
     *            </p>
     */
    public void setIdle(Duration idle) {
        this.idle = idle;
    }

    /**
     * <p>
     * An object that represents a duration of time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param idle <p>
     *            An object that represents a duration of time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TcpTimeout withIdle(Duration idle) {
        this.idle = idle;
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
        if (getIdle() != null)
            sb.append("idle: " + getIdle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdle() == null) ? 0 : getIdle().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TcpTimeout == false)
            return false;
        TcpTimeout other = (TcpTimeout) obj;

        if (other.getIdle() == null ^ this.getIdle() == null)
            return false;
        if (other.getIdle() != null && other.getIdle().equals(this.getIdle()) == false)
            return false;
        return true;
    }
}
