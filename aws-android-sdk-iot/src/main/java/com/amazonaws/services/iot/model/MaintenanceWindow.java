/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * An optional configuration within the <code>SchedulingConfig</code> to setup a
 * recurring maintenance window with a predetermined start time and duration for
 * the rollout of a job document to all devices in a target group for a job.
 * </p>
 */
public class MaintenanceWindow implements Serializable {
    /**
     * <p>
     * Displays the start time of the next maintenance window.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String startTime;

    /**
     * <p>
     * Displays the duration of the next maintenance window.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1430<br/>
     */
    private Integer durationInMinutes;

    /**
     * <p>
     * Displays the start time of the next maintenance window.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         Displays the start time of the next maintenance window.
     *         </p>
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * Displays the start time of the next maintenance window.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param startTime <p>
     *            Displays the start time of the next maintenance window.
     *            </p>
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * Displays the start time of the next maintenance window.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param startTime <p>
     *            Displays the start time of the next maintenance window.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindow withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * Displays the duration of the next maintenance window.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1430<br/>
     *
     * @return <p>
     *         Displays the duration of the next maintenance window.
     *         </p>
     */
    public Integer getDurationInMinutes() {
        return durationInMinutes;
    }

    /**
     * <p>
     * Displays the duration of the next maintenance window.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1430<br/>
     *
     * @param durationInMinutes <p>
     *            Displays the duration of the next maintenance window.
     *            </p>
     */
    public void setDurationInMinutes(Integer durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    /**
     * <p>
     * Displays the duration of the next maintenance window.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1430<br/>
     *
     * @param durationInMinutes <p>
     *            Displays the duration of the next maintenance window.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindow withDurationInMinutes(Integer durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
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
        if (getStartTime() != null)
            sb.append("startTime: " + getStartTime() + ",");
        if (getDurationInMinutes() != null)
            sb.append("durationInMinutes: " + getDurationInMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode
                + ((getDurationInMinutes() == null) ? 0 : getDurationInMinutes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MaintenanceWindow == false)
            return false;
        MaintenanceWindow other = (MaintenanceWindow) obj;

        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getDurationInMinutes() == null ^ this.getDurationInMinutes() == null)
            return false;
        if (other.getDurationInMinutes() != null
                && other.getDurationInMinutes().equals(this.getDurationInMinutes()) == false)
            return false;
        return true;
    }
}
