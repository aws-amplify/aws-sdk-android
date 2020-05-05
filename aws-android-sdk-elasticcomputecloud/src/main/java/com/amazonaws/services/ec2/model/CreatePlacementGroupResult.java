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

public class CreatePlacementGroupResult implements Serializable {
    /**
     * <p>
     * Describes a placement group.
     * </p>
     */
    private PlacementGroup placementGroup;

    /**
     * <p>
     * Describes a placement group.
     * </p>
     *
     * @return <p>
     *         Describes a placement group.
     *         </p>
     */
    public PlacementGroup getPlacementGroup() {
        return placementGroup;
    }

    /**
     * <p>
     * Describes a placement group.
     * </p>
     *
     * @param placementGroup <p>
     *            Describes a placement group.
     *            </p>
     */
    public void setPlacementGroup(PlacementGroup placementGroup) {
        this.placementGroup = placementGroup;
    }

    /**
     * <p>
     * Describes a placement group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param placementGroup <p>
     *            Describes a placement group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePlacementGroupResult withPlacementGroup(PlacementGroup placementGroup) {
        this.placementGroup = placementGroup;
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
        if (getPlacementGroup() != null)
            sb.append("PlacementGroup: " + getPlacementGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPlacementGroup() == null) ? 0 : getPlacementGroup().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePlacementGroupResult == false)
            return false;
        CreatePlacementGroupResult other = (CreatePlacementGroupResult) obj;

        if (other.getPlacementGroup() == null ^ this.getPlacementGroup() == null)
            return false;
        if (other.getPlacementGroup() != null
                && other.getPlacementGroup().equals(this.getPlacementGroup()) == false)
            return false;
        return true;
    }
}
