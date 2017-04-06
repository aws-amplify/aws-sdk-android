/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

public class EnterStandbyResult implements Serializable {
    /**
     * <p>
     * The activities related to moving instances into <code>Standby</code>
     * mode.
     * </p>
     */
    private java.util.List<Activity> activities = new java.util.ArrayList<Activity>();

    /**
     * <p>
     * The activities related to moving instances into <code>Standby</code>
     * mode.
     * </p>
     *
     * @return <p>
     *         The activities related to moving instances into
     *         <code>Standby</code> mode.
     *         </p>
     */
    public java.util.List<Activity> getActivities() {
        return activities;
    }

    /**
     * <p>
     * The activities related to moving instances into <code>Standby</code>
     * mode.
     * </p>
     *
     * @param activities <p>
     *            The activities related to moving instances into
     *            <code>Standby</code> mode.
     *            </p>
     */
    public void setActivities(java.util.Collection<Activity> activities) {
        if (activities == null) {
            this.activities = null;
            return;
        }

        this.activities = new java.util.ArrayList<Activity>(activities);
    }

    /**
     * <p>
     * The activities related to moving instances into <code>Standby</code>
     * mode.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param activities <p>
     *            The activities related to moving instances into
     *            <code>Standby</code> mode.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnterStandbyResult withActivities(Activity... activities) {
        if (getActivities() == null) {
            this.activities = new java.util.ArrayList<Activity>(activities.length);
        }
        for (Activity value : activities) {
            this.activities.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The activities related to moving instances into <code>Standby</code>
     * mode.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param activities <p>
     *            The activities related to moving instances into
     *            <code>Standby</code> mode.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnterStandbyResult withActivities(java.util.Collection<Activity> activities) {
        setActivities(activities);
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
        if (getActivities() != null)
            sb.append("Activities: " + getActivities());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActivities() == null) ? 0 : getActivities().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnterStandbyResult == false)
            return false;
        EnterStandbyResult other = (EnterStandbyResult) obj;

        if (other.getActivities() == null ^ this.getActivities() == null)
            return false;
        if (other.getActivities() != null
                && other.getActivities().equals(this.getActivities()) == false)
            return false;
        return true;
    }
}
