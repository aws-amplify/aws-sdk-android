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
 * Displays the next seven maintenance window occurrences and their start times.
 * </p>
 */
public class ScheduledJobRollout implements Serializable {
    /**
     * <p>
     * Displays the start times of the next seven maintenance window
     * occurrences.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String startTime;

    /**
     * <p>
     * Displays the start times of the next seven maintenance window
     * occurrences.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         Displays the start times of the next seven maintenance window
     *         occurrences.
     *         </p>
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * Displays the start times of the next seven maintenance window
     * occurrences.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param startTime <p>
     *            Displays the start times of the next seven maintenance window
     *            occurrences.
     *            </p>
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * Displays the start times of the next seven maintenance window
     * occurrences.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param startTime <p>
     *            Displays the start times of the next seven maintenance window
     *            occurrences.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledJobRollout withStartTime(String startTime) {
        this.startTime = startTime;
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
            sb.append("startTime: " + getStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduledJobRollout == false)
            return false;
        ScheduledJobRollout other = (ScheduledJobRollout) obj;

        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        return true;
    }
}
