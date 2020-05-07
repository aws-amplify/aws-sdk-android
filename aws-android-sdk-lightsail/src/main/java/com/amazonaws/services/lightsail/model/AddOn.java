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

/**
 * <p>
 * Describes an add-on that is enabled for an Amazon Lightsail resource.
 * </p>
 */
public class AddOn implements Serializable {
    /**
     * <p>
     * The name of the add-on.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The status of the add-on.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The daily time when an automatic snapshot is created.
     * </p>
     * <p>
     * The time shown is in <code>HH:00</code> format, and in Coordinated
     * Universal Time (UTC).
     * </p>
     * <p>
     * The snapshot is automatically created between the time shown and up to 45
     * minutes after.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$<br/>
     */
    private String snapshotTimeOfDay;

    /**
     * <p>
     * The next daily time an automatic snapshot will be created.
     * </p>
     * <p>
     * The time shown is in <code>HH:00</code> format, and in Coordinated
     * Universal Time (UTC).
     * </p>
     * <p>
     * The snapshot is automatically created between the time shown and up to 45
     * minutes after.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$<br/>
     */
    private String nextSnapshotTimeOfDay;

    /**
     * <p>
     * The name of the add-on.
     * </p>
     *
     * @return <p>
     *         The name of the add-on.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the add-on.
     * </p>
     *
     * @param name <p>
     *            The name of the add-on.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the add-on.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the add-on.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddOn withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The status of the add-on.
     * </p>
     *
     * @return <p>
     *         The status of the add-on.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the add-on.
     * </p>
     *
     * @param status <p>
     *            The status of the add-on.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the add-on.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the add-on.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddOn withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The daily time when an automatic snapshot is created.
     * </p>
     * <p>
     * The time shown is in <code>HH:00</code> format, and in Coordinated
     * Universal Time (UTC).
     * </p>
     * <p>
     * The snapshot is automatically created between the time shown and up to 45
     * minutes after.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$<br/>
     *
     * @return <p>
     *         The daily time when an automatic snapshot is created.
     *         </p>
     *         <p>
     *         The time shown is in <code>HH:00</code> format, and in
     *         Coordinated Universal Time (UTC).
     *         </p>
     *         <p>
     *         The snapshot is automatically created between the time shown and
     *         up to 45 minutes after.
     *         </p>
     */
    public String getSnapshotTimeOfDay() {
        return snapshotTimeOfDay;
    }

    /**
     * <p>
     * The daily time when an automatic snapshot is created.
     * </p>
     * <p>
     * The time shown is in <code>HH:00</code> format, and in Coordinated
     * Universal Time (UTC).
     * </p>
     * <p>
     * The snapshot is automatically created between the time shown and up to 45
     * minutes after.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$<br/>
     *
     * @param snapshotTimeOfDay <p>
     *            The daily time when an automatic snapshot is created.
     *            </p>
     *            <p>
     *            The time shown is in <code>HH:00</code> format, and in
     *            Coordinated Universal Time (UTC).
     *            </p>
     *            <p>
     *            The snapshot is automatically created between the time shown
     *            and up to 45 minutes after.
     *            </p>
     */
    public void setSnapshotTimeOfDay(String snapshotTimeOfDay) {
        this.snapshotTimeOfDay = snapshotTimeOfDay;
    }

    /**
     * <p>
     * The daily time when an automatic snapshot is created.
     * </p>
     * <p>
     * The time shown is in <code>HH:00</code> format, and in Coordinated
     * Universal Time (UTC).
     * </p>
     * <p>
     * The snapshot is automatically created between the time shown and up to 45
     * minutes after.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$<br/>
     *
     * @param snapshotTimeOfDay <p>
     *            The daily time when an automatic snapshot is created.
     *            </p>
     *            <p>
     *            The time shown is in <code>HH:00</code> format, and in
     *            Coordinated Universal Time (UTC).
     *            </p>
     *            <p>
     *            The snapshot is automatically created between the time shown
     *            and up to 45 minutes after.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddOn withSnapshotTimeOfDay(String snapshotTimeOfDay) {
        this.snapshotTimeOfDay = snapshotTimeOfDay;
        return this;
    }

    /**
     * <p>
     * The next daily time an automatic snapshot will be created.
     * </p>
     * <p>
     * The time shown is in <code>HH:00</code> format, and in Coordinated
     * Universal Time (UTC).
     * </p>
     * <p>
     * The snapshot is automatically created between the time shown and up to 45
     * minutes after.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$<br/>
     *
     * @return <p>
     *         The next daily time an automatic snapshot will be created.
     *         </p>
     *         <p>
     *         The time shown is in <code>HH:00</code> format, and in
     *         Coordinated Universal Time (UTC).
     *         </p>
     *         <p>
     *         The snapshot is automatically created between the time shown and
     *         up to 45 minutes after.
     *         </p>
     */
    public String getNextSnapshotTimeOfDay() {
        return nextSnapshotTimeOfDay;
    }

    /**
     * <p>
     * The next daily time an automatic snapshot will be created.
     * </p>
     * <p>
     * The time shown is in <code>HH:00</code> format, and in Coordinated
     * Universal Time (UTC).
     * </p>
     * <p>
     * The snapshot is automatically created between the time shown and up to 45
     * minutes after.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$<br/>
     *
     * @param nextSnapshotTimeOfDay <p>
     *            The next daily time an automatic snapshot will be created.
     *            </p>
     *            <p>
     *            The time shown is in <code>HH:00</code> format, and in
     *            Coordinated Universal Time (UTC).
     *            </p>
     *            <p>
     *            The snapshot is automatically created between the time shown
     *            and up to 45 minutes after.
     *            </p>
     */
    public void setNextSnapshotTimeOfDay(String nextSnapshotTimeOfDay) {
        this.nextSnapshotTimeOfDay = nextSnapshotTimeOfDay;
    }

    /**
     * <p>
     * The next daily time an automatic snapshot will be created.
     * </p>
     * <p>
     * The time shown is in <code>HH:00</code> format, and in Coordinated
     * Universal Time (UTC).
     * </p>
     * <p>
     * The snapshot is automatically created between the time shown and up to 45
     * minutes after.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$<br/>
     *
     * @param nextSnapshotTimeOfDay <p>
     *            The next daily time an automatic snapshot will be created.
     *            </p>
     *            <p>
     *            The time shown is in <code>HH:00</code> format, and in
     *            Coordinated Universal Time (UTC).
     *            </p>
     *            <p>
     *            The snapshot is automatically created between the time shown
     *            and up to 45 minutes after.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddOn withNextSnapshotTimeOfDay(String nextSnapshotTimeOfDay) {
        this.nextSnapshotTimeOfDay = nextSnapshotTimeOfDay;
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
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getSnapshotTimeOfDay() != null)
            sb.append("snapshotTimeOfDay: " + getSnapshotTimeOfDay() + ",");
        if (getNextSnapshotTimeOfDay() != null)
            sb.append("nextSnapshotTimeOfDay: " + getNextSnapshotTimeOfDay());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getSnapshotTimeOfDay() == null) ? 0 : getSnapshotTimeOfDay().hashCode());
        hashCode = prime
                * hashCode
                + ((getNextSnapshotTimeOfDay() == null) ? 0 : getNextSnapshotTimeOfDay().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddOn == false)
            return false;
        AddOn other = (AddOn) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSnapshotTimeOfDay() == null ^ this.getSnapshotTimeOfDay() == null)
            return false;
        if (other.getSnapshotTimeOfDay() != null
                && other.getSnapshotTimeOfDay().equals(this.getSnapshotTimeOfDay()) == false)
            return false;
        if (other.getNextSnapshotTimeOfDay() == null ^ this.getNextSnapshotTimeOfDay() == null)
            return false;
        if (other.getNextSnapshotTimeOfDay() != null
                && other.getNextSnapshotTimeOfDay().equals(this.getNextSnapshotTimeOfDay()) == false)
            return false;
        return true;
    }
}
