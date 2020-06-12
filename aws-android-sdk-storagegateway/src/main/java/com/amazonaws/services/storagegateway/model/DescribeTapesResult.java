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

package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;

/**
 * <p>
 * DescribeTapesOutput
 * </p>
 */
public class DescribeTapesResult implements Serializable {
    /**
     * <p>
     * An array of virtual tape descriptions.
     * </p>
     */
    private java.util.List<Tape> tapes;

    /**
     * <p>
     * An opaque string which can be used as part of a subsequent DescribeTapes
     * call to retrieve the next page of results.
     * </p>
     * <p>
     * If a response does not contain a marker, then there are no more results
     * to be retrieved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     */
    private String marker;

    /**
     * <p>
     * An array of virtual tape descriptions.
     * </p>
     *
     * @return <p>
     *         An array of virtual tape descriptions.
     *         </p>
     */
    public java.util.List<Tape> getTapes() {
        return tapes;
    }

    /**
     * <p>
     * An array of virtual tape descriptions.
     * </p>
     *
     * @param tapes <p>
     *            An array of virtual tape descriptions.
     *            </p>
     */
    public void setTapes(java.util.Collection<Tape> tapes) {
        if (tapes == null) {
            this.tapes = null;
            return;
        }

        this.tapes = new java.util.ArrayList<Tape>(tapes);
    }

    /**
     * <p>
     * An array of virtual tape descriptions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tapes <p>
     *            An array of virtual tape descriptions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTapesResult withTapes(Tape... tapes) {
        if (getTapes() == null) {
            this.tapes = new java.util.ArrayList<Tape>(tapes.length);
        }
        for (Tape value : tapes) {
            this.tapes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of virtual tape descriptions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tapes <p>
     *            An array of virtual tape descriptions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTapesResult withTapes(java.util.Collection<Tape> tapes) {
        setTapes(tapes);
        return this;
    }

    /**
     * <p>
     * An opaque string which can be used as part of a subsequent DescribeTapes
     * call to retrieve the next page of results.
     * </p>
     * <p>
     * If a response does not contain a marker, then there are no more results
     * to be retrieved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @return <p>
     *         An opaque string which can be used as part of a subsequent
     *         DescribeTapes call to retrieve the next page of results.
     *         </p>
     *         <p>
     *         If a response does not contain a marker, then there are no more
     *         results to be retrieved.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * An opaque string which can be used as part of a subsequent DescribeTapes
     * call to retrieve the next page of results.
     * </p>
     * <p>
     * If a response does not contain a marker, then there are no more results
     * to be retrieved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param marker <p>
     *            An opaque string which can be used as part of a subsequent
     *            DescribeTapes call to retrieve the next page of results.
     *            </p>
     *            <p>
     *            If a response does not contain a marker, then there are no
     *            more results to be retrieved.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An opaque string which can be used as part of a subsequent DescribeTapes
     * call to retrieve the next page of results.
     * </p>
     * <p>
     * If a response does not contain a marker, then there are no more results
     * to be retrieved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param marker <p>
     *            An opaque string which can be used as part of a subsequent
     *            DescribeTapes call to retrieve the next page of results.
     *            </p>
     *            <p>
     *            If a response does not contain a marker, then there are no
     *            more results to be retrieved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTapesResult withMarker(String marker) {
        this.marker = marker;
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
        if (getTapes() != null)
            sb.append("Tapes: " + getTapes() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTapes() == null) ? 0 : getTapes().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTapesResult == false)
            return false;
        DescribeTapesResult other = (DescribeTapesResult) obj;

        if (other.getTapes() == null ^ this.getTapes() == null)
            return false;
        if (other.getTapes() != null && other.getTapes().equals(this.getTapes()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }
}
