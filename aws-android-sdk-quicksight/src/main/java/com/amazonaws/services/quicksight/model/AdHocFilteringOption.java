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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

/**
 * <p>
 * Ad hoc (one-time) filtering option.
 * </p>
 */
public class AdHocFilteringOption implements Serializable {
    /**
     * <p>
     * Availability status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     */
    private String availabilityStatus;

    /**
     * <p>
     * Availability status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @return <p>
     *         Availability status.
     *         </p>
     * @see DashboardBehavior
     */
    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    /**
     * <p>
     * Availability status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param availabilityStatus <p>
     *            Availability status.
     *            </p>
     * @see DashboardBehavior
     */
    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    /**
     * <p>
     * Availability status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param availabilityStatus <p>
     *            Availability status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DashboardBehavior
     */
    public AdHocFilteringOption withAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
        return this;
    }

    /**
     * <p>
     * Availability status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param availabilityStatus <p>
     *            Availability status.
     *            </p>
     * @see DashboardBehavior
     */
    public void setAvailabilityStatus(DashboardBehavior availabilityStatus) {
        this.availabilityStatus = availabilityStatus.toString();
    }

    /**
     * <p>
     * Availability status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param availabilityStatus <p>
     *            Availability status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DashboardBehavior
     */
    public AdHocFilteringOption withAvailabilityStatus(DashboardBehavior availabilityStatus) {
        this.availabilityStatus = availabilityStatus.toString();
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
        if (getAvailabilityStatus() != null)
            sb.append("AvailabilityStatus: " + getAvailabilityStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAvailabilityStatus() == null) ? 0 : getAvailabilityStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdHocFilteringOption == false)
            return false;
        AdHocFilteringOption other = (AdHocFilteringOption) obj;

        if (other.getAvailabilityStatus() == null ^ this.getAvailabilityStatus() == null)
            return false;
        if (other.getAvailabilityStatus() != null
                && other.getAvailabilityStatus().equals(this.getAvailabilityStatus()) == false)
            return false;
        return true;
    }
}
