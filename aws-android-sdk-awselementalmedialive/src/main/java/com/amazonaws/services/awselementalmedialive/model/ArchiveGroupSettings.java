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

package com.amazonaws.services.awselementalmedialive.model;

import java.io.Serializable;

/**
 * Archive Group Settings
 */
public class ArchiveGroupSettings implements Serializable {
    /**
     * A directory and base filename where archive files should be written.
     */
    private OutputLocationRef destination;

    /**
     * Number of seconds to write to archive file before closing and starting a
     * new one.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer rolloverInterval;

    /**
     * A directory and base filename where archive files should be written.
     *
     * @return A directory and base filename where archive files should be
     *         written.
     */
    public OutputLocationRef getDestination() {
        return destination;
    }

    /**
     * A directory and base filename where archive files should be written.
     *
     * @param destination A directory and base filename where archive files
     *            should be written.
     */
    public void setDestination(OutputLocationRef destination) {
        this.destination = destination;
    }

    /**
     * A directory and base filename where archive files should be written.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destination A directory and base filename where archive files
     *            should be written.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ArchiveGroupSettings withDestination(OutputLocationRef destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Number of seconds to write to archive file before closing and starting a
     * new one.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return Number of seconds to write to archive file before closing and
     *         starting a new one.
     */
    public Integer getRolloverInterval() {
        return rolloverInterval;
    }

    /**
     * Number of seconds to write to archive file before closing and starting a
     * new one.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param rolloverInterval Number of seconds to write to archive file before
     *            closing and starting a new one.
     */
    public void setRolloverInterval(Integer rolloverInterval) {
        this.rolloverInterval = rolloverInterval;
    }

    /**
     * Number of seconds to write to archive file before closing and starting a
     * new one.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param rolloverInterval Number of seconds to write to archive file before
     *            closing and starting a new one.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ArchiveGroupSettings withRolloverInterval(Integer rolloverInterval) {
        this.rolloverInterval = rolloverInterval;
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
        if (getDestination() != null)
            sb.append("Destination: " + getDestination() + ",");
        if (getRolloverInterval() != null)
            sb.append("RolloverInterval: " + getRolloverInterval());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode
                + ((getRolloverInterval() == null) ? 0 : getRolloverInterval().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ArchiveGroupSettings == false)
            return false;
        ArchiveGroupSettings other = (ArchiveGroupSettings) obj;

        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null
                && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getRolloverInterval() == null ^ this.getRolloverInterval() == null)
            return false;
        if (other.getRolloverInterval() != null
                && other.getRolloverInterval().equals(this.getRolloverInterval()) == false)
            return false;
        return true;
    }
}
