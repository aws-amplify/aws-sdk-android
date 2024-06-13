/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kms.model;

import java.io.Serializable;

public class ListKeyRotationsResult implements Serializable {
    /**
     * <p>
     * A list of completed key material rotations.
     * </p>
     */
    private java.util.List<RotationsListEntry> rotations = new java.util.ArrayList<RotationsListEntry>();

    /**
     * <p>
     * When <code>Truncated</code> is true, this element is present and contains
     * the value to use for the <code>Marker</code> parameter in a subsequent
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[ -\u00FF]*<br/>
     */
    private String nextMarker;

    /**
     * <p>
     * A flag that indicates whether there are more items in the list. When this
     * value is true, the list in this response is truncated. To get more items,
     * pass the value of the <code>NextMarker</code> element in this response to
     * the <code>Marker</code> parameter in a subsequent request.
     * </p>
     */
    private Boolean truncated;

    /**
     * <p>
     * A list of completed key material rotations.
     * </p>
     *
     * @return <p>
     *         A list of completed key material rotations.
     *         </p>
     */
    public java.util.List<RotationsListEntry> getRotations() {
        return rotations;
    }

    /**
     * <p>
     * A list of completed key material rotations.
     * </p>
     *
     * @param rotations <p>
     *            A list of completed key material rotations.
     *            </p>
     */
    public void setRotations(java.util.Collection<RotationsListEntry> rotations) {
        if (rotations == null) {
            this.rotations = null;
            return;
        }

        this.rotations = new java.util.ArrayList<RotationsListEntry>(rotations);
    }

    /**
     * <p>
     * A list of completed key material rotations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rotations <p>
     *            A list of completed key material rotations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListKeyRotationsResult withRotations(RotationsListEntry... rotations) {
        if (getRotations() == null) {
            this.rotations = new java.util.ArrayList<RotationsListEntry>(rotations.length);
        }
        for (RotationsListEntry value : rotations) {
            this.rotations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of completed key material rotations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rotations <p>
     *            A list of completed key material rotations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListKeyRotationsResult withRotations(java.util.Collection<RotationsListEntry> rotations) {
        setRotations(rotations);
        return this;
    }

    /**
     * <p>
     * When <code>Truncated</code> is true, this element is present and contains
     * the value to use for the <code>Marker</code> parameter in a subsequent
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[ -\u00FF]*<br/>
     *
     * @return <p>
     *         When <code>Truncated</code> is true, this element is present and
     *         contains the value to use for the <code>Marker</code> parameter
     *         in a subsequent request.
     *         </p>
     */
    public String getNextMarker() {
        return nextMarker;
    }

    /**
     * <p>
     * When <code>Truncated</code> is true, this element is present and contains
     * the value to use for the <code>Marker</code> parameter in a subsequent
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[ -\u00FF]*<br/>
     *
     * @param nextMarker <p>
     *            When <code>Truncated</code> is true, this element is present
     *            and contains the value to use for the <code>Marker</code>
     *            parameter in a subsequent request.
     *            </p>
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * When <code>Truncated</code> is true, this element is present and contains
     * the value to use for the <code>Marker</code> parameter in a subsequent
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[ -\u00FF]*<br/>
     *
     * @param nextMarker <p>
     *            When <code>Truncated</code> is true, this element is present
     *            and contains the value to use for the <code>Marker</code>
     *            parameter in a subsequent request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListKeyRotationsResult withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items in the list. When this
     * value is true, the list in this response is truncated. To get more items,
     * pass the value of the <code>NextMarker</code> element in this response to
     * the <code>Marker</code> parameter in a subsequent request.
     * </p>
     *
     * @return <p>
     *         A flag that indicates whether there are more items in the list.
     *         When this value is true, the list in this response is truncated.
     *         To get more items, pass the value of the <code>NextMarker</code>
     *         element in this response to the <code>Marker</code> parameter in
     *         a subsequent request.
     *         </p>
     */
    public Boolean isTruncated() {
        return truncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items in the list. When this
     * value is true, the list in this response is truncated. To get more items,
     * pass the value of the <code>NextMarker</code> element in this response to
     * the <code>Marker</code> parameter in a subsequent request.
     * </p>
     *
     * @return <p>
     *         A flag that indicates whether there are more items in the list.
     *         When this value is true, the list in this response is truncated.
     *         To get more items, pass the value of the <code>NextMarker</code>
     *         element in this response to the <code>Marker</code> parameter in
     *         a subsequent request.
     *         </p>
     */
    public Boolean getTruncated() {
        return truncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items in the list. When this
     * value is true, the list in this response is truncated. To get more items,
     * pass the value of the <code>NextMarker</code> element in this response to
     * the <code>Marker</code> parameter in a subsequent request.
     * </p>
     *
     * @param truncated <p>
     *            A flag that indicates whether there are more items in the
     *            list. When this value is true, the list in this response is
     *            truncated. To get more items, pass the value of the
     *            <code>NextMarker</code> element in this response to the
     *            <code>Marker</code> parameter in a subsequent request.
     *            </p>
     */
    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items in the list. When this
     * value is true, the list in this response is truncated. To get more items,
     * pass the value of the <code>NextMarker</code> element in this response to
     * the <code>Marker</code> parameter in a subsequent request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param truncated <p>
     *            A flag that indicates whether there are more items in the
     *            list. When this value is true, the list in this response is
     *            truncated. To get more items, pass the value of the
     *            <code>NextMarker</code> element in this response to the
     *            <code>Marker</code> parameter in a subsequent request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListKeyRotationsResult withTruncated(Boolean truncated) {
        this.truncated = truncated;
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
        if (getRotations() != null)
            sb.append("Rotations: " + getRotations() + ",");
        if (getNextMarker() != null)
            sb.append("NextMarker: " + getNextMarker() + ",");
        if (getTruncated() != null)
            sb.append("Truncated: " + getTruncated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRotations() == null) ? 0 : getRotations().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode + ((getTruncated() == null) ? 0 : getTruncated().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListKeyRotationsResult == false)
            return false;
        ListKeyRotationsResult other = (ListKeyRotationsResult) obj;

        if (other.getRotations() == null ^ this.getRotations() == null)
            return false;
        if (other.getRotations() != null
                && other.getRotations().equals(this.getRotations()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null
                && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getTruncated() == null ^ this.getTruncated() == null)
            return false;
        if (other.getTruncated() != null
                && other.getTruncated().equals(this.getTruncated()) == false)
            return false;
        return true;
    }
}
