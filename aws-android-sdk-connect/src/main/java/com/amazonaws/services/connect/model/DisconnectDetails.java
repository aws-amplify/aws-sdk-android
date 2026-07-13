/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the call disconnect experience.
 * </p>
 */
public class DisconnectDetails implements Serializable {
    /**
     * <p>
     * Indicates the potential disconnection issues for a call. This field is
     * not populated if the service does not detect potential issues.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     */
    private String potentialDisconnectIssue;

    /**
     * <p>
     * Indicates the potential disconnection issues for a call. This field is
     * not populated if the service does not detect potential issues.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @return <p>
     *         Indicates the potential disconnection issues for a call. This
     *         field is not populated if the service does not detect potential
     *         issues.
     *         </p>
     */
    public String getPotentialDisconnectIssue() {
        return potentialDisconnectIssue;
    }

    /**
     * <p>
     * Indicates the potential disconnection issues for a call. This field is
     * not populated if the service does not detect potential issues.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @param potentialDisconnectIssue <p>
     *            Indicates the potential disconnection issues for a call. This
     *            field is not populated if the service does not detect
     *            potential issues.
     *            </p>
     */
    public void setPotentialDisconnectIssue(String potentialDisconnectIssue) {
        this.potentialDisconnectIssue = potentialDisconnectIssue;
    }

    /**
     * <p>
     * Indicates the potential disconnection issues for a call. This field is
     * not populated if the service does not detect potential issues.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @param potentialDisconnectIssue <p>
     *            Indicates the potential disconnection issues for a call. This
     *            field is not populated if the service does not detect
     *            potential issues.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisconnectDetails withPotentialDisconnectIssue(String potentialDisconnectIssue) {
        this.potentialDisconnectIssue = potentialDisconnectIssue;
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
        if (getPotentialDisconnectIssue() != null)
            sb.append("PotentialDisconnectIssue: " + getPotentialDisconnectIssue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getPotentialDisconnectIssue() == null) ? 0 : getPotentialDisconnectIssue()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisconnectDetails == false)
            return false;
        DisconnectDetails other = (DisconnectDetails) obj;

        if (other.getPotentialDisconnectIssue() == null
                ^ this.getPotentialDisconnectIssue() == null)
            return false;
        if (other.getPotentialDisconnectIssue() != null
                && other.getPotentialDisconnectIssue().equals(this.getPotentialDisconnectIssue()) == false)
            return false;
        return true;
    }
}
