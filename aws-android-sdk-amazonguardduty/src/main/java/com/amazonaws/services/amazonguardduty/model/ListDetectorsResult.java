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

package com.amazonaws.services.amazonguardduty.model;

import java.io.Serializable;

public class ListDetectorsResult implements Serializable {
    /**
     * <p>
     * A list of detector IDs.
     * </p>
     */
    private java.util.List<String> detectorIds;

    /**
     * <p>
     * The pagination parameter to be used on the next list operation to
     * retrieve more items.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of detector IDs.
     * </p>
     *
     * @return <p>
     *         A list of detector IDs.
     *         </p>
     */
    public java.util.List<String> getDetectorIds() {
        return detectorIds;
    }

    /**
     * <p>
     * A list of detector IDs.
     * </p>
     *
     * @param detectorIds <p>
     *            A list of detector IDs.
     *            </p>
     */
    public void setDetectorIds(java.util.Collection<String> detectorIds) {
        if (detectorIds == null) {
            this.detectorIds = null;
            return;
        }

        this.detectorIds = new java.util.ArrayList<String>(detectorIds);
    }

    /**
     * <p>
     * A list of detector IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param detectorIds <p>
     *            A list of detector IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDetectorsResult withDetectorIds(String... detectorIds) {
        if (getDetectorIds() == null) {
            this.detectorIds = new java.util.ArrayList<String>(detectorIds.length);
        }
        for (String value : detectorIds) {
            this.detectorIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of detector IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param detectorIds <p>
     *            A list of detector IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDetectorsResult withDetectorIds(java.util.Collection<String> detectorIds) {
        setDetectorIds(detectorIds);
        return this;
    }

    /**
     * <p>
     * The pagination parameter to be used on the next list operation to
     * retrieve more items.
     * </p>
     *
     * @return <p>
     *         The pagination parameter to be used on the next list operation to
     *         retrieve more items.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The pagination parameter to be used on the next list operation to
     * retrieve more items.
     * </p>
     *
     * @param nextToken <p>
     *            The pagination parameter to be used on the next list operation
     *            to retrieve more items.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination parameter to be used on the next list operation to
     * retrieve more items.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The pagination parameter to be used on the next list operation
     *            to retrieve more items.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDetectorsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getDetectorIds() != null)
            sb.append("DetectorIds: " + getDetectorIds() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDetectorIds() == null) ? 0 : getDetectorIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDetectorsResult == false)
            return false;
        ListDetectorsResult other = (ListDetectorsResult) obj;

        if (other.getDetectorIds() == null ^ this.getDetectorIds() == null)
            return false;
        if (other.getDetectorIds() != null
                && other.getDetectorIds().equals(this.getDetectorIds()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
