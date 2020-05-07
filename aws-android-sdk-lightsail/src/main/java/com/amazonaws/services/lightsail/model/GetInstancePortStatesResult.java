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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

public class GetInstancePortStatesResult implements Serializable {
    /**
     * <p>
     * An array of objects that describe the firewall port states for the
     * specified instance.
     * </p>
     */
    private java.util.List<InstancePortState> portStates;

    /**
     * <p>
     * An array of objects that describe the firewall port states for the
     * specified instance.
     * </p>
     *
     * @return <p>
     *         An array of objects that describe the firewall port states for
     *         the specified instance.
     *         </p>
     */
    public java.util.List<InstancePortState> getPortStates() {
        return portStates;
    }

    /**
     * <p>
     * An array of objects that describe the firewall port states for the
     * specified instance.
     * </p>
     *
     * @param portStates <p>
     *            An array of objects that describe the firewall port states for
     *            the specified instance.
     *            </p>
     */
    public void setPortStates(java.util.Collection<InstancePortState> portStates) {
        if (portStates == null) {
            this.portStates = null;
            return;
        }

        this.portStates = new java.util.ArrayList<InstancePortState>(portStates);
    }

    /**
     * <p>
     * An array of objects that describe the firewall port states for the
     * specified instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param portStates <p>
     *            An array of objects that describe the firewall port states for
     *            the specified instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetInstancePortStatesResult withPortStates(InstancePortState... portStates) {
        if (getPortStates() == null) {
            this.portStates = new java.util.ArrayList<InstancePortState>(portStates.length);
        }
        for (InstancePortState value : portStates) {
            this.portStates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the firewall port states for the
     * specified instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param portStates <p>
     *            An array of objects that describe the firewall port states for
     *            the specified instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetInstancePortStatesResult withPortStates(
            java.util.Collection<InstancePortState> portStates) {
        setPortStates(portStates);
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
        if (getPortStates() != null)
            sb.append("portStates: " + getPortStates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPortStates() == null) ? 0 : getPortStates().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInstancePortStatesResult == false)
            return false;
        GetInstancePortStatesResult other = (GetInstancePortStatesResult) obj;

        if (other.getPortStates() == null ^ this.getPortStates() == null)
            return false;
        if (other.getPortStates() != null
                && other.getPortStates().equals(this.getPortStates()) == false)
            return false;
        return true;
    }
}
