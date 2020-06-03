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

package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;

/**
 * Inserts DVB Time and Date Table (TDT) at the specified table repetition
 * interval.
 */
public class DvbTdtSettings implements Serializable {
    /**
     * The number of milliseconds between instances of this table in the output
     * transport stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000 - 30000<br/>
     */
    private Integer tdtInterval;

    /**
     * The number of milliseconds between instances of this table in the output
     * transport stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000 - 30000<br/>
     *
     * @return The number of milliseconds between instances of this table in the
     *         output transport stream.
     */
    public Integer getTdtInterval() {
        return tdtInterval;
    }

    /**
     * The number of milliseconds between instances of this table in the output
     * transport stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000 - 30000<br/>
     *
     * @param tdtInterval The number of milliseconds between instances of this
     *            table in the output transport stream.
     */
    public void setTdtInterval(Integer tdtInterval) {
        this.tdtInterval = tdtInterval;
    }

    /**
     * The number of milliseconds between instances of this table in the output
     * transport stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000 - 30000<br/>
     *
     * @param tdtInterval The number of milliseconds between instances of this
     *            table in the output transport stream.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DvbTdtSettings withTdtInterval(Integer tdtInterval) {
        this.tdtInterval = tdtInterval;
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
        if (getTdtInterval() != null)
            sb.append("TdtInterval: " + getTdtInterval());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTdtInterval() == null) ? 0 : getTdtInterval().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DvbTdtSettings == false)
            return false;
        DvbTdtSettings other = (DvbTdtSettings) obj;

        if (other.getTdtInterval() == null ^ this.getTdtInterval() == null)
            return false;
        if (other.getTdtInterval() != null
                && other.getTdtInterval().equals(this.getTdtInterval()) == false)
            return false;
        return true;
    }
}
