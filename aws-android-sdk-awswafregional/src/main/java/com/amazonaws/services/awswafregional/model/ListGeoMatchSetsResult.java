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

package com.amazonaws.services.awswafregional.model;

import java.io.Serializable;

public class ListGeoMatchSetsResult implements Serializable {
    /**
     * <p>
     * If you have more <code>GeoMatchSet</code> objects than the number that
     * you specified for <code>Limit</code> in the request, the response
     * includes a <code>NextMarker</code> value. To list more
     * <code>GeoMatchSet</code> objects, submit another
     * <code>ListGeoMatchSets</code> request, and specify the
     * <code>NextMarker</code> value from the response in the
     * <code>NextMarker</code> value in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String nextMarker;

    /**
     * <p>
     * An array of <a>GeoMatchSetSummary</a> objects.
     * </p>
     */
    private java.util.List<GeoMatchSetSummary> geoMatchSets;

    /**
     * <p>
     * If you have more <code>GeoMatchSet</code> objects than the number that
     * you specified for <code>Limit</code> in the request, the response
     * includes a <code>NextMarker</code> value. To list more
     * <code>GeoMatchSet</code> objects, submit another
     * <code>ListGeoMatchSets</code> request, and specify the
     * <code>NextMarker</code> value from the response in the
     * <code>NextMarker</code> value in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         If you have more <code>GeoMatchSet</code> objects than the number
     *         that you specified for <code>Limit</code> in the request, the
     *         response includes a <code>NextMarker</code> value. To list more
     *         <code>GeoMatchSet</code> objects, submit another
     *         <code>ListGeoMatchSets</code> request, and specify the
     *         <code>NextMarker</code> value from the response in the
     *         <code>NextMarker</code> value in the next request.
     *         </p>
     */
    public String getNextMarker() {
        return nextMarker;
    }

    /**
     * <p>
     * If you have more <code>GeoMatchSet</code> objects than the number that
     * you specified for <code>Limit</code> in the request, the response
     * includes a <code>NextMarker</code> value. To list more
     * <code>GeoMatchSet</code> objects, submit another
     * <code>ListGeoMatchSets</code> request, and specify the
     * <code>NextMarker</code> value from the response in the
     * <code>NextMarker</code> value in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param nextMarker <p>
     *            If you have more <code>GeoMatchSet</code> objects than the
     *            number that you specified for <code>Limit</code> in the
     *            request, the response includes a <code>NextMarker</code>
     *            value. To list more <code>GeoMatchSet</code> objects, submit
     *            another <code>ListGeoMatchSets</code> request, and specify the
     *            <code>NextMarker</code> value from the response in the
     *            <code>NextMarker</code> value in the next request.
     *            </p>
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * If you have more <code>GeoMatchSet</code> objects than the number that
     * you specified for <code>Limit</code> in the request, the response
     * includes a <code>NextMarker</code> value. To list more
     * <code>GeoMatchSet</code> objects, submit another
     * <code>ListGeoMatchSets</code> request, and specify the
     * <code>NextMarker</code> value from the response in the
     * <code>NextMarker</code> value in the next request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param nextMarker <p>
     *            If you have more <code>GeoMatchSet</code> objects than the
     *            number that you specified for <code>Limit</code> in the
     *            request, the response includes a <code>NextMarker</code>
     *            value. To list more <code>GeoMatchSet</code> objects, submit
     *            another <code>ListGeoMatchSets</code> request, and specify the
     *            <code>NextMarker</code> value from the response in the
     *            <code>NextMarker</code> value in the next request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListGeoMatchSetsResult withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * <p>
     * An array of <a>GeoMatchSetSummary</a> objects.
     * </p>
     *
     * @return <p>
     *         An array of <a>GeoMatchSetSummary</a> objects.
     *         </p>
     */
    public java.util.List<GeoMatchSetSummary> getGeoMatchSets() {
        return geoMatchSets;
    }

    /**
     * <p>
     * An array of <a>GeoMatchSetSummary</a> objects.
     * </p>
     *
     * @param geoMatchSets <p>
     *            An array of <a>GeoMatchSetSummary</a> objects.
     *            </p>
     */
    public void setGeoMatchSets(java.util.Collection<GeoMatchSetSummary> geoMatchSets) {
        if (geoMatchSets == null) {
            this.geoMatchSets = null;
            return;
        }

        this.geoMatchSets = new java.util.ArrayList<GeoMatchSetSummary>(geoMatchSets);
    }

    /**
     * <p>
     * An array of <a>GeoMatchSetSummary</a> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param geoMatchSets <p>
     *            An array of <a>GeoMatchSetSummary</a> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListGeoMatchSetsResult withGeoMatchSets(GeoMatchSetSummary... geoMatchSets) {
        if (getGeoMatchSets() == null) {
            this.geoMatchSets = new java.util.ArrayList<GeoMatchSetSummary>(geoMatchSets.length);
        }
        for (GeoMatchSetSummary value : geoMatchSets) {
            this.geoMatchSets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <a>GeoMatchSetSummary</a> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param geoMatchSets <p>
     *            An array of <a>GeoMatchSetSummary</a> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListGeoMatchSetsResult withGeoMatchSets(
            java.util.Collection<GeoMatchSetSummary> geoMatchSets) {
        setGeoMatchSets(geoMatchSets);
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
        if (getNextMarker() != null)
            sb.append("NextMarker: " + getNextMarker() + ",");
        if (getGeoMatchSets() != null)
            sb.append("GeoMatchSets: " + getGeoMatchSets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode
                + ((getGeoMatchSets() == null) ? 0 : getGeoMatchSets().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListGeoMatchSetsResult == false)
            return false;
        ListGeoMatchSetsResult other = (ListGeoMatchSetsResult) obj;

        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null
                && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getGeoMatchSets() == null ^ this.getGeoMatchSets() == null)
            return false;
        if (other.getGeoMatchSets() != null
                && other.getGeoMatchSets().equals(this.getGeoMatchSets()) == false)
            return false;
        return true;
    }
}
