/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model;

import java.io.Serializable;

/**
 * <p>
 * Contains a search result from a text search query that is run on a place
 * index resource.
 * </p>
 */
public class SearchForTextResult implements Serializable {
    /**
     * <p>
     * The distance in meters of a great-circle arc between the bias position
     * specified and the result. <code>Distance</code> will be returned only if
     * a bias position was specified in the query.
     * </p>
     * <note>
     * <p>
     * A great-circle arc is the shortest path on a sphere, in this case the
     * Earth. This returns the shortest distance between two locations.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Double distance;

    /**
     * <p>
     * Details about the search result, such as its address and position.
     * </p>
     */
    private Place place;

    /**
     * <p>
     * The relative confidence in the match for a result among the results
     * returned. For example, if more fields for an address match (including
     * house number, street, city, country/region, and postal code), the
     * relevance score is closer to 1.
     * </p>
     * <p>
     * Returned only when the partner selected is Esri.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     */
    private Double relevance;

    /**
     * <p>
     * The distance in meters of a great-circle arc between the bias position
     * specified and the result. <code>Distance</code> will be returned only if
     * a bias position was specified in the query.
     * </p>
     * <note>
     * <p>
     * A great-circle arc is the shortest path on a sphere, in this case the
     * Earth. This returns the shortest distance between two locations.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The distance in meters of a great-circle arc between the bias
     *         position specified and the result. <code>Distance</code> will be
     *         returned only if a bias position was specified in the query.
     *         </p>
     *         <note>
     *         <p>
     *         A great-circle arc is the shortest path on a sphere, in this case
     *         the Earth. This returns the shortest distance between two
     *         locations.
     *         </p>
     *         </note>
     */
    public Double getDistance() {
        return distance;
    }

    /**
     * <p>
     * The distance in meters of a great-circle arc between the bias position
     * specified and the result. <code>Distance</code> will be returned only if
     * a bias position was specified in the query.
     * </p>
     * <note>
     * <p>
     * A great-circle arc is the shortest path on a sphere, in this case the
     * Earth. This returns the shortest distance between two locations.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param distance <p>
     *            The distance in meters of a great-circle arc between the bias
     *            position specified and the result. <code>Distance</code> will
     *            be returned only if a bias position was specified in the
     *            query.
     *            </p>
     *            <note>
     *            <p>
     *            A great-circle arc is the shortest path on a sphere, in this
     *            case the Earth. This returns the shortest distance between two
     *            locations.
     *            </p>
     *            </note>
     */
    public void setDistance(Double distance) {
        this.distance = distance;
    }

    /**
     * <p>
     * The distance in meters of a great-circle arc between the bias position
     * specified and the result. <code>Distance</code> will be returned only if
     * a bias position was specified in the query.
     * </p>
     * <note>
     * <p>
     * A great-circle arc is the shortest path on a sphere, in this case the
     * Earth. This returns the shortest distance between two locations.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param distance <p>
     *            The distance in meters of a great-circle arc between the bias
     *            position specified and the result. <code>Distance</code> will
     *            be returned only if a bias position was specified in the
     *            query.
     *            </p>
     *            <note>
     *            <p>
     *            A great-circle arc is the shortest path on a sphere, in this
     *            case the Earth. This returns the shortest distance between two
     *            locations.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchForTextResult withDistance(Double distance) {
        this.distance = distance;
        return this;
    }

    /**
     * <p>
     * Details about the search result, such as its address and position.
     * </p>
     *
     * @return <p>
     *         Details about the search result, such as its address and
     *         position.
     *         </p>
     */
    public Place getPlace() {
        return place;
    }

    /**
     * <p>
     * Details about the search result, such as its address and position.
     * </p>
     *
     * @param place <p>
     *            Details about the search result, such as its address and
     *            position.
     *            </p>
     */
    public void setPlace(Place place) {
        this.place = place;
    }

    /**
     * <p>
     * Details about the search result, such as its address and position.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param place <p>
     *            Details about the search result, such as its address and
     *            position.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchForTextResult withPlace(Place place) {
        this.place = place;
        return this;
    }

    /**
     * <p>
     * The relative confidence in the match for a result among the results
     * returned. For example, if more fields for an address match (including
     * house number, street, city, country/region, and postal code), the
     * relevance score is closer to 1.
     * </p>
     * <p>
     * Returned only when the partner selected is Esri.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     *
     * @return <p>
     *         The relative confidence in the match for a result among the
     *         results returned. For example, if more fields for an address
     *         match (including house number, street, city, country/region, and
     *         postal code), the relevance score is closer to 1.
     *         </p>
     *         <p>
     *         Returned only when the partner selected is Esri.
     *         </p>
     */
    public Double getRelevance() {
        return relevance;
    }

    /**
     * <p>
     * The relative confidence in the match for a result among the results
     * returned. For example, if more fields for an address match (including
     * house number, street, city, country/region, and postal code), the
     * relevance score is closer to 1.
     * </p>
     * <p>
     * Returned only when the partner selected is Esri.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     *
     * @param relevance <p>
     *            The relative confidence in the match for a result among the
     *            results returned. For example, if more fields for an address
     *            match (including house number, street, city, country/region,
     *            and postal code), the relevance score is closer to 1.
     *            </p>
     *            <p>
     *            Returned only when the partner selected is Esri.
     *            </p>
     */
    public void setRelevance(Double relevance) {
        this.relevance = relevance;
    }

    /**
     * <p>
     * The relative confidence in the match for a result among the results
     * returned. For example, if more fields for an address match (including
     * house number, street, city, country/region, and postal code), the
     * relevance score is closer to 1.
     * </p>
     * <p>
     * Returned only when the partner selected is Esri.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     *
     * @param relevance <p>
     *            The relative confidence in the match for a result among the
     *            results returned. For example, if more fields for an address
     *            match (including house number, street, city, country/region,
     *            and postal code), the relevance score is closer to 1.
     *            </p>
     *            <p>
     *            Returned only when the partner selected is Esri.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchForTextResult withRelevance(Double relevance) {
        this.relevance = relevance;
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
        if (getDistance() != null)
            sb.append("Distance: " + getDistance() + ",");
        if (getPlace() != null)
            sb.append("Place: " + getPlace() + ",");
        if (getRelevance() != null)
            sb.append("Relevance: " + getRelevance());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDistance() == null) ? 0 : getDistance().hashCode());
        hashCode = prime * hashCode + ((getPlace() == null) ? 0 : getPlace().hashCode());
        hashCode = prime * hashCode + ((getRelevance() == null) ? 0 : getRelevance().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchForTextResult == false)
            return false;
        SearchForTextResult other = (SearchForTextResult) obj;

        if (other.getDistance() == null ^ this.getDistance() == null)
            return false;
        if (other.getDistance() != null && other.getDistance().equals(this.getDistance()) == false)
            return false;
        if (other.getPlace() == null ^ this.getPlace() == null)
            return false;
        if (other.getPlace() != null && other.getPlace().equals(this.getPlace()) == false)
            return false;
        if (other.getRelevance() == null ^ this.getRelevance() == null)
            return false;
        if (other.getRelevance() != null
                && other.getRelevance().equals(this.getRelevance()) == false)
            return false;
        return true;
    }
}
