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

public class DeleteTrafficMirrorTargetResult implements Serializable {
    /**
     * <p>
     * The ID of the deleted Traffic Mirror target.
     * </p>
     */
    private String trafficMirrorTargetId;

    /**
     * <p>
     * The ID of the deleted Traffic Mirror target.
     * </p>
     *
     * @return <p>
     *         The ID of the deleted Traffic Mirror target.
     *         </p>
     */
    public String getTrafficMirrorTargetId() {
        return trafficMirrorTargetId;
    }

    /**
     * <p>
     * The ID of the deleted Traffic Mirror target.
     * </p>
     *
     * @param trafficMirrorTargetId <p>
     *            The ID of the deleted Traffic Mirror target.
     *            </p>
     */
    public void setTrafficMirrorTargetId(String trafficMirrorTargetId) {
        this.trafficMirrorTargetId = trafficMirrorTargetId;
    }

    /**
     * <p>
     * The ID of the deleted Traffic Mirror target.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trafficMirrorTargetId <p>
     *            The ID of the deleted Traffic Mirror target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteTrafficMirrorTargetResult withTrafficMirrorTargetId(String trafficMirrorTargetId) {
        this.trafficMirrorTargetId = trafficMirrorTargetId;
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
        if (getTrafficMirrorTargetId() != null)
            sb.append("TrafficMirrorTargetId: " + getTrafficMirrorTargetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTrafficMirrorTargetId() == null) ? 0 : getTrafficMirrorTargetId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTrafficMirrorTargetResult == false)
            return false;
        DeleteTrafficMirrorTargetResult other = (DeleteTrafficMirrorTargetResult) obj;

        if (other.getTrafficMirrorTargetId() == null ^ this.getTrafficMirrorTargetId() == null)
            return false;
        if (other.getTrafficMirrorTargetId() != null
                && other.getTrafficMirrorTargetId().equals(this.getTrafficMirrorTargetId()) == false)
            return false;
        return true;
    }
}
