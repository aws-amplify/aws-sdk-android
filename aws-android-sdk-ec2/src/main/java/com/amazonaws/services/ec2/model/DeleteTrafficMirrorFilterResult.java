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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

public class DeleteTrafficMirrorFilterResult implements Serializable {
    /**
     * <p>
     * The ID of the Traffic Mirror filter.
     * </p>
     */
    private String trafficMirrorFilterId;

    /**
     * <p>
     * The ID of the Traffic Mirror filter.
     * </p>
     *
     * @return <p>
     *         The ID of the Traffic Mirror filter.
     *         </p>
     */
    public String getTrafficMirrorFilterId() {
        return trafficMirrorFilterId;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror filter.
     * </p>
     *
     * @param trafficMirrorFilterId <p>
     *            The ID of the Traffic Mirror filter.
     *            </p>
     */
    public void setTrafficMirrorFilterId(String trafficMirrorFilterId) {
        this.trafficMirrorFilterId = trafficMirrorFilterId;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trafficMirrorFilterId <p>
     *            The ID of the Traffic Mirror filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteTrafficMirrorFilterResult withTrafficMirrorFilterId(String trafficMirrorFilterId) {
        this.trafficMirrorFilterId = trafficMirrorFilterId;
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
        if (getTrafficMirrorFilterId() != null)
            sb.append("TrafficMirrorFilterId: " + getTrafficMirrorFilterId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTrafficMirrorFilterId() == null) ? 0 : getTrafficMirrorFilterId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTrafficMirrorFilterResult == false)
            return false;
        DeleteTrafficMirrorFilterResult other = (DeleteTrafficMirrorFilterResult) obj;

        if (other.getTrafficMirrorFilterId() == null ^ this.getTrafficMirrorFilterId() == null)
            return false;
        if (other.getTrafficMirrorFilterId() != null
                && other.getTrafficMirrorFilterId().equals(this.getTrafficMirrorFilterId()) == false)
            return false;
        return true;
    }
}
