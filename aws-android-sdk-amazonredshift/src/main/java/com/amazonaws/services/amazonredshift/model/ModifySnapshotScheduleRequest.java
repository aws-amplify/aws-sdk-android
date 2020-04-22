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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Modifies a snapshot schedule. Any schedule associated with a cluster is
 * modified asynchronously.
 * </p>
 */
public class ModifySnapshotScheduleRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A unique alphanumeric identifier of the schedule to modify.
     * </p>
     */
    private String scheduleIdentifier;

    /**
     * <p>
     * An updated list of schedule definitions. A schedule definition is made up
     * of schedule expressions, for example, "cron(30 12 *)" or
     * "rate(12 hours)".
     * </p>
     */
    private java.util.List<String> scheduleDefinitions;

    /**
     * <p>
     * A unique alphanumeric identifier of the schedule to modify.
     * </p>
     *
     * @return <p>
     *         A unique alphanumeric identifier of the schedule to modify.
     *         </p>
     */
    public String getScheduleIdentifier() {
        return scheduleIdentifier;
    }

    /**
     * <p>
     * A unique alphanumeric identifier of the schedule to modify.
     * </p>
     *
     * @param scheduleIdentifier <p>
     *            A unique alphanumeric identifier of the schedule to modify.
     *            </p>
     */
    public void setScheduleIdentifier(String scheduleIdentifier) {
        this.scheduleIdentifier = scheduleIdentifier;
    }

    /**
     * <p>
     * A unique alphanumeric identifier of the schedule to modify.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduleIdentifier <p>
     *            A unique alphanumeric identifier of the schedule to modify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifySnapshotScheduleRequest withScheduleIdentifier(String scheduleIdentifier) {
        this.scheduleIdentifier = scheduleIdentifier;
        return this;
    }

    /**
     * <p>
     * An updated list of schedule definitions. A schedule definition is made up
     * of schedule expressions, for example, "cron(30 12 *)" or
     * "rate(12 hours)".
     * </p>
     *
     * @return <p>
     *         An updated list of schedule definitions. A schedule definition is
     *         made up of schedule expressions, for example, "cron(30 12 *)" or
     *         "rate(12 hours)".
     *         </p>
     */
    public java.util.List<String> getScheduleDefinitions() {
        return scheduleDefinitions;
    }

    /**
     * <p>
     * An updated list of schedule definitions. A schedule definition is made up
     * of schedule expressions, for example, "cron(30 12 *)" or
     * "rate(12 hours)".
     * </p>
     *
     * @param scheduleDefinitions <p>
     *            An updated list of schedule definitions. A schedule definition
     *            is made up of schedule expressions, for example,
     *            "cron(30 12 *)" or "rate(12 hours)".
     *            </p>
     */
    public void setScheduleDefinitions(java.util.Collection<String> scheduleDefinitions) {
        if (scheduleDefinitions == null) {
            this.scheduleDefinitions = null;
            return;
        }

        this.scheduleDefinitions = new java.util.ArrayList<String>(scheduleDefinitions);
    }

    /**
     * <p>
     * An updated list of schedule definitions. A schedule definition is made up
     * of schedule expressions, for example, "cron(30 12 *)" or
     * "rate(12 hours)".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduleDefinitions <p>
     *            An updated list of schedule definitions. A schedule definition
     *            is made up of schedule expressions, for example,
     *            "cron(30 12 *)" or "rate(12 hours)".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifySnapshotScheduleRequest withScheduleDefinitions(String... scheduleDefinitions) {
        if (getScheduleDefinitions() == null) {
            this.scheduleDefinitions = new java.util.ArrayList<String>(scheduleDefinitions.length);
        }
        for (String value : scheduleDefinitions) {
            this.scheduleDefinitions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An updated list of schedule definitions. A schedule definition is made up
     * of schedule expressions, for example, "cron(30 12 *)" or
     * "rate(12 hours)".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduleDefinitions <p>
     *            An updated list of schedule definitions. A schedule definition
     *            is made up of schedule expressions, for example,
     *            "cron(30 12 *)" or "rate(12 hours)".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifySnapshotScheduleRequest withScheduleDefinitions(
            java.util.Collection<String> scheduleDefinitions) {
        setScheduleDefinitions(scheduleDefinitions);
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
        if (getScheduleIdentifier() != null)
            sb.append("ScheduleIdentifier: " + getScheduleIdentifier() + ",");
        if (getScheduleDefinitions() != null)
            sb.append("ScheduleDefinitions: " + getScheduleDefinitions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getScheduleIdentifier() == null) ? 0 : getScheduleIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getScheduleDefinitions() == null) ? 0 : getScheduleDefinitions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifySnapshotScheduleRequest == false)
            return false;
        ModifySnapshotScheduleRequest other = (ModifySnapshotScheduleRequest) obj;

        if (other.getScheduleIdentifier() == null ^ this.getScheduleIdentifier() == null)
            return false;
        if (other.getScheduleIdentifier() != null
                && other.getScheduleIdentifier().equals(this.getScheduleIdentifier()) == false)
            return false;
        if (other.getScheduleDefinitions() == null ^ this.getScheduleDefinitions() == null)
            return false;
        if (other.getScheduleDefinitions() != null
                && other.getScheduleDefinitions().equals(this.getScheduleDefinitions()) == false)
            return false;
        return true;
    }
}
