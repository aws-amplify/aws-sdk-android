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

package com.amazonaws.services.medialive.model;

import java.io.Serializable;

/**
 * Reference to an OutputDestination ID defined in the channel
 */
public class OutputLocationRef implements Serializable {
    /**
     * Placeholder documentation for __string
     */
    private String destinationRefId;

    /**
     * Placeholder documentation for __string
     *
     * @return Placeholder documentation for __string
     */
    public String getDestinationRefId() {
        return destinationRefId;
    }

    /**
     * Placeholder documentation for __string
     *
     * @param destinationRefId Placeholder documentation for __string
     */
    public void setDestinationRefId(String destinationRefId) {
        this.destinationRefId = destinationRefId;
    }

    /**
     * Placeholder documentation for __string
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationRefId Placeholder documentation for __string
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputLocationRef withDestinationRefId(String destinationRefId) {
        this.destinationRefId = destinationRefId;
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
        if (getDestinationRefId() != null)
            sb.append("DestinationRefId: " + getDestinationRefId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDestinationRefId() == null) ? 0 : getDestinationRefId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputLocationRef == false)
            return false;
        OutputLocationRef other = (OutputLocationRef) obj;

        if (other.getDestinationRefId() == null ^ this.getDestinationRefId() == null)
            return false;
        if (other.getDestinationRefId() != null
                && other.getDestinationRefId().equals(this.getDestinationRefId()) == false)
            return false;
        return true;
    }
}
