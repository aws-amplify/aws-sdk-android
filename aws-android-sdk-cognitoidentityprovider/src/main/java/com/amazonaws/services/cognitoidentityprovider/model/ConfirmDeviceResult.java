/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

public class ConfirmDeviceResult implements Serializable {
    /**
     * The new value for the userConfirmationNecessary property for this object.
     */
    private Boolean userConfirmationNecessary;

    /**
     * Returns the value of the userConfirmationNecessary property for this
     * object.
     *
     * @return The value of the userConfirmationNecessary property for this
     *         object.
     */
    public Boolean isUserConfirmationNecessary() {
        return userConfirmationNecessary;
    }

    /**
     * Returns the value of the userConfirmationNecessary property for this
     * object.
     *
     * @return The value of the userConfirmationNecessary property for this
     *         object.
     */
    public Boolean getUserConfirmationNecessary() {
        return userConfirmationNecessary;
    }

    /**
     * Sets the value of userConfirmationNecessary
     *
     * @param userConfirmationNecessary The new value for the
     *            userConfirmationNecessary property for this object.
     */
    public void setUserConfirmationNecessary(Boolean userConfirmationNecessary) {
        this.userConfirmationNecessary = userConfirmationNecessary;
    }

    /**
     * Sets the value of the userConfirmationNecessary property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userConfirmationNecessary The new value for the
     *            userConfirmationNecessary property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConfirmDeviceResult withUserConfirmationNecessary(Boolean userConfirmationNecessary) {
        this.userConfirmationNecessary = userConfirmationNecessary;
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
        if (getUserConfirmationNecessary() != null)
            sb.append("UserConfirmationNecessary: " + getUserConfirmationNecessary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getUserConfirmationNecessary() == null) ? 0 : getUserConfirmationNecessary()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfirmDeviceResult == false)
            return false;
        ConfirmDeviceResult other = (ConfirmDeviceResult) obj;

        if (other.getUserConfirmationNecessary() == null
                ^ this.getUserConfirmationNecessary() == null)
            return false;
        if (other.getUserConfirmationNecessary() != null
                && other.getUserConfirmationNecessary().equals(this.getUserConfirmationNecessary()) == false)
            return false;
        return true;
    }
}
