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

package com.amazonaws.services.guardduty.model;

import java.io.Serializable;

public class CreatePublishingDestinationResult implements Serializable {
    /**
     * <p>
     * The ID of the publishing destination that is created.
     * </p>
     */
    private String destinationId;

    /**
     * <p>
     * The ID of the publishing destination that is created.
     * </p>
     *
     * @return <p>
     *         The ID of the publishing destination that is created.
     *         </p>
     */
    public String getDestinationId() {
        return destinationId;
    }

    /**
     * <p>
     * The ID of the publishing destination that is created.
     * </p>
     *
     * @param destinationId <p>
     *            The ID of the publishing destination that is created.
     *            </p>
     */
    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    /**
     * <p>
     * The ID of the publishing destination that is created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationId <p>
     *            The ID of the publishing destination that is created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePublishingDestinationResult withDestinationId(String destinationId) {
        this.destinationId = destinationId;
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
        if (getDestinationId() != null)
            sb.append("DestinationId: " + getDestinationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDestinationId() == null) ? 0 : getDestinationId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePublishingDestinationResult == false)
            return false;
        CreatePublishingDestinationResult other = (CreatePublishingDestinationResult) obj;

        if (other.getDestinationId() == null ^ this.getDestinationId() == null)
            return false;
        if (other.getDestinationId() != null
                && other.getDestinationId().equals(this.getDestinationId()) == false)
            return false;
        return true;
    }
}
