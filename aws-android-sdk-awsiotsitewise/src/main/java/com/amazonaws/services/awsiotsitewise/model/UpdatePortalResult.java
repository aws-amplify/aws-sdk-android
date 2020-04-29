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

package com.amazonaws.services.awsiotsitewise.model;

import java.io.Serializable;

public class UpdatePortalResult implements Serializable {
    /**
     * <p>
     * The status of the portal, which contains a state (<code>UPDATING</code>
     * after successfully calling this action) and any error message.
     * </p>
     */
    private PortalStatus portalStatus;

    /**
     * <p>
     * The status of the portal, which contains a state (<code>UPDATING</code>
     * after successfully calling this action) and any error message.
     * </p>
     *
     * @return <p>
     *         The status of the portal, which contains a state (
     *         <code>UPDATING</code> after successfully calling this action) and
     *         any error message.
     *         </p>
     */
    public PortalStatus getPortalStatus() {
        return portalStatus;
    }

    /**
     * <p>
     * The status of the portal, which contains a state (<code>UPDATING</code>
     * after successfully calling this action) and any error message.
     * </p>
     *
     * @param portalStatus <p>
     *            The status of the portal, which contains a state (
     *            <code>UPDATING</code> after successfully calling this action)
     *            and any error message.
     *            </p>
     */
    public void setPortalStatus(PortalStatus portalStatus) {
        this.portalStatus = portalStatus;
    }

    /**
     * <p>
     * The status of the portal, which contains a state (<code>UPDATING</code>
     * after successfully calling this action) and any error message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param portalStatus <p>
     *            The status of the portal, which contains a state (
     *            <code>UPDATING</code> after successfully calling this action)
     *            and any error message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePortalResult withPortalStatus(PortalStatus portalStatus) {
        this.portalStatus = portalStatus;
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
        if (getPortalStatus() != null)
            sb.append("portalStatus: " + getPortalStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPortalStatus() == null) ? 0 : getPortalStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePortalResult == false)
            return false;
        UpdatePortalResult other = (UpdatePortalResult) obj;

        if (other.getPortalStatus() == null ^ this.getPortalStatus() == null)
            return false;
        if (other.getPortalStatus() != null
                && other.getPortalStatus().equals(this.getPortalStatus()) == false)
            return false;
        return true;
    }
}
