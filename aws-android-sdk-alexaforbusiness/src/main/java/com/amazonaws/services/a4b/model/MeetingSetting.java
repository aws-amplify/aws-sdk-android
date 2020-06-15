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

package com.amazonaws.services.a4b.model;

import java.io.Serializable;

/**
 * <p>
 * The values that indicate whether a pin is always required (YES), never
 * required (NO), or OPTIONAL.
 * </p>
 * <ul>
 * <li>
 * <p>
 * If YES, Alexa will always ask for a meeting pin.
 * </p>
 * </li>
 * <li>
 * <p>
 * If NO, Alexa will never ask for a meeting pin.
 * </p>
 * </li>
 * <li>
 * <p>
 * If OPTIONAL, Alexa will ask if you have a meeting pin and if the customer
 * responds with yes, it will ask for the meeting pin.
 * </p>
 * </li>
 * </ul>
 */
public class MeetingSetting implements Serializable {
    /**
     * <p>
     * The values that indicate whether the pin is always required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>YES, NO, OPTIONAL
     */
    private String requirePin;

    /**
     * <p>
     * The values that indicate whether the pin is always required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>YES, NO, OPTIONAL
     *
     * @return <p>
     *         The values that indicate whether the pin is always required.
     *         </p>
     * @see RequirePin
     */
    public String getRequirePin() {
        return requirePin;
    }

    /**
     * <p>
     * The values that indicate whether the pin is always required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>YES, NO, OPTIONAL
     *
     * @param requirePin <p>
     *            The values that indicate whether the pin is always required.
     *            </p>
     * @see RequirePin
     */
    public void setRequirePin(String requirePin) {
        this.requirePin = requirePin;
    }

    /**
     * <p>
     * The values that indicate whether the pin is always required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>YES, NO, OPTIONAL
     *
     * @param requirePin <p>
     *            The values that indicate whether the pin is always required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RequirePin
     */
    public MeetingSetting withRequirePin(String requirePin) {
        this.requirePin = requirePin;
        return this;
    }

    /**
     * <p>
     * The values that indicate whether the pin is always required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>YES, NO, OPTIONAL
     *
     * @param requirePin <p>
     *            The values that indicate whether the pin is always required.
     *            </p>
     * @see RequirePin
     */
    public void setRequirePin(RequirePin requirePin) {
        this.requirePin = requirePin.toString();
    }

    /**
     * <p>
     * The values that indicate whether the pin is always required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>YES, NO, OPTIONAL
     *
     * @param requirePin <p>
     *            The values that indicate whether the pin is always required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RequirePin
     */
    public MeetingSetting withRequirePin(RequirePin requirePin) {
        this.requirePin = requirePin.toString();
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
        if (getRequirePin() != null)
            sb.append("RequirePin: " + getRequirePin());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRequirePin() == null) ? 0 : getRequirePin().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MeetingSetting == false)
            return false;
        MeetingSetting other = (MeetingSetting) obj;

        if (other.getRequirePin() == null ^ this.getRequirePin() == null)
            return false;
        if (other.getRequirePin() != null
                && other.getRequirePin().equals(this.getRequirePin()) == false)
            return false;
        return true;
    }
}
