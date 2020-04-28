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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Get details for an offering.
 */
public class DescribeOfferingRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * Unique offering ID, e.g. '87654321'
     */
    private String offeringId;

    /**
     * Unique offering ID, e.g. '87654321'
     *
     * @return Unique offering ID, e.g. '87654321'
     */
    public String getOfferingId() {
        return offeringId;
    }

    /**
     * Unique offering ID, e.g. '87654321'
     *
     * @param offeringId Unique offering ID, e.g. '87654321'
     */
    public void setOfferingId(String offeringId) {
        this.offeringId = offeringId;
    }

    /**
     * Unique offering ID, e.g. '87654321'
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param offeringId Unique offering ID, e.g. '87654321'
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOfferingRequest withOfferingId(String offeringId) {
        this.offeringId = offeringId;
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
        if (getOfferingId() != null)
            sb.append("OfferingId: " + getOfferingId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOfferingId() == null) ? 0 : getOfferingId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeOfferingRequest == false)
            return false;
        DescribeOfferingRequest other = (DescribeOfferingRequest) obj;

        if (other.getOfferingId() == null ^ this.getOfferingId() == null)
            return false;
        if (other.getOfferingId() != null
                && other.getOfferingId().equals(this.getOfferingId()) == false)
            return false;
        return true;
    }
}
