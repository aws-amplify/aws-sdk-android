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
 * Media Package Group Settings
 */
public class MediaPackageGroupSettings implements Serializable {
    /**
     * MediaPackage channel destination.
     */
    private OutputLocationRef destination;

    /**
     * MediaPackage channel destination.
     *
     * @return MediaPackage channel destination.
     */
    public OutputLocationRef getDestination() {
        return destination;
    }

    /**
     * MediaPackage channel destination.
     *
     * @param destination MediaPackage channel destination.
     */
    public void setDestination(OutputLocationRef destination) {
        this.destination = destination;
    }

    /**
     * MediaPackage channel destination.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destination MediaPackage channel destination.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MediaPackageGroupSettings withDestination(OutputLocationRef destination) {
        this.destination = destination;
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
            sb.append("Destination: " + getDestination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDestination() == null) ? 0 : getDestination().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MediaPackageGroupSettings == false)
            return false;
        MediaPackageGroupSettings other = (MediaPackageGroupSettings) obj;

        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null
                && other.getDestination().equals(this.getDestination()) == false)
            return false;
        return true;
    }
}
