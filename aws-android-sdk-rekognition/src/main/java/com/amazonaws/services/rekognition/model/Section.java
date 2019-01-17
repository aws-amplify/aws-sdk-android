/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

public class Section implements Serializable {
    /**
     * The new value for the startTimestamp property for this object.
     */
    private Long startTimestamp;

    /**
     * The new value for the endTimestamp property for this object.
     */
    private Long endTimestamp;

    /**
     * Returns the value of the startTimestamp property for this object.
     *
     * @return The value of the startTimestamp property for this object.
     */
    public Long getStartTimestamp() {
        return startTimestamp;
    }

    /**
     * Sets the value of startTimestamp
     *
     * @param startTimestamp The new value for the startTimestamp property for
     *            this object.
     */
    public void setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    /**
     * Sets the value of the startTimestamp property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTimestamp The new value for the startTimestamp property for
     *            this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Section withStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }

    /**
     * Returns the value of the endTimestamp property for this object.
     *
     * @return The value of the endTimestamp property for this object.
     */
    public Long getEndTimestamp() {
        return endTimestamp;
    }

    /**
     * Sets the value of endTimestamp
     *
     * @param endTimestamp The new value for the endTimestamp property for this
     *            object.
     */
    public void setEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
    }

    /**
     * Sets the value of the endTimestamp property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTimestamp The new value for the endTimestamp property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Section withEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
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
        if (getStartTimestamp() != null)
            sb.append("StartTimestamp: " + getStartTimestamp() + ",");
        if (getEndTimestamp() != null)
            sb.append("EndTimestamp: " + getEndTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStartTimestamp() == null) ? 0 : getStartTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getEndTimestamp() == null) ? 0 : getEndTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Section == false)
            return false;
        Section other = (Section) obj;

        if (other.getStartTimestamp() == null ^ this.getStartTimestamp() == null)
            return false;
        if (other.getStartTimestamp() != null
                && other.getStartTimestamp().equals(this.getStartTimestamp()) == false)
            return false;
        if (other.getEndTimestamp() == null ^ this.getEndTimestamp() == null)
            return false;
        if (other.getEndTimestamp() != null
                && other.getEndTimestamp().equals(this.getEndTimestamp()) == false)
            return false;
        return true;
    }
}
