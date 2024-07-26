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
     * Details about the search result, such as its address and position.
     * </p>
     */
    private Place place;

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
     * <b>Range: </b>0.0 - <br/>
     */
    private Double distance;

    /**
     * <p>
     * The relative confidence in the match for a result among the results
     * returned. For example, if more fields for an address match (including
     * house number, street, city, country/region, and postal code), the
     * relevance score is closer to 1.
     * </p>
     * <p>
     * Returned only when the partner selected is Esri or Grab.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0.0 - 1.0<br/>
     */
    private Double relevance;

    /**
     * <p>
     * The unique identifier of the place. You can use this with the
     * <code>GetPlace</code> operation to find the place again later.
     * </p>
     * <note>
     * <p>
     * For <code>SearchPlaceIndexForText</code> operations, the
     * <code>PlaceId</code> is returned only by place indexes that use HERE or
     * Grab as a data provider.
     * </p>
     * </note>
     */
    private String placeId;

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
     * <b>Range: </b>0.0 - <br/>
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
     * <b>Range: </b>0.0 - <br/>
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
     * <b>Range: </b>0.0 - <br/>
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
     * The relative confidence in the match for a result among the results
     * returned. For example, if more fields for an address match (including
     * house number, street, city, country/region, and postal code), the
     * relevance score is closer to 1.
     * </p>
     * <p>
     * Returned only when the partner selected is Esri or Grab.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0.0 - 1.0<br/>
     *
     * @return <p>
     *         The relative confidence in the match for a result among the
     *         results returned. For example, if more fields for an address
     *         match (including house number, street, city, country/region, and
     *         postal code), the relevance score is closer to 1.
     *         </p>
     *         <p>
     *         Returned only when the partner selected is Esri or Grab.
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
     * Returned only when the partner selected is Esri or Grab.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0.0 - 1.0<br/>
     *
     * @param relevance <p>
     *            The relative confidence in the match for a result among the
     *            results returned. For example, if more fields for an address
     *            match (including house number, street, city, country/region,
     *            and postal code), the relevance score is closer to 1.
     *            </p>
     *            <p>
     *            Returned only when the partner selected is Esri or Grab.
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
     * Returned only when the partner selected is Esri or Grab.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0.0 - 1.0<br/>
     *
     * @param relevance <p>
     *            The relative confidence in the match for a result among the
     *            results returned. For example, if more fields for an address
     *            match (including house number, street, city, country/region,
     *            and postal code), the relevance score is closer to 1.
     *            </p>
     *            <p>
     *            Returned only when the partner selected is Esri or Grab.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchForTextResult withRelevance(Double relevance) {
        this.relevance = relevance;
        return this;
    }

    /**
     * <p>
     * The unique identifier of the place. You can use this with the
     * <code>GetPlace</code> operation to find the place again later.
     * </p>
     * <note>
     * <p>
     * For <code>SearchPlaceIndexForText</code> operations, the
     * <code>PlaceId</code> is returned only by place indexes that use HERE or
     * Grab as a data provider.
     * </p>
     * </note>
     *
     * @return <p>
     *         The unique identifier of the place. You can use this with the
     *         <code>GetPlace</code> operation to find the place again later.
     *         </p>
     *         <note>
     *         <p>
     *         For <code>SearchPlaceIndexForText</code> operations, the
     *         <code>PlaceId</code> is returned only by place indexes that use
     *         HERE or Grab as a data provider.
     *         </p>
     *         </note>
     */
    public String getPlaceId() {
        return placeId;
    }

    /**
     * <p>
     * The unique identifier of the place. You can use this with the
     * <code>GetPlace</code> operation to find the place again later.
     * </p>
     * <note>
     * <p>
     * For <code>SearchPlaceIndexForText</code> operations, the
     * <code>PlaceId</code> is returned only by place indexes that use HERE or
     * Grab as a data provider.
     * </p>
     * </note>
     *
     * @param placeId <p>
     *            The unique identifier of the place. You can use this with the
     *            <code>GetPlace</code> operation to find the place again later.
     *            </p>
     *            <note>
     *            <p>
     *            For <code>SearchPlaceIndexForText</code> operations, the
     *            <code>PlaceId</code> is returned only by place indexes that
     *            use HERE or Grab as a data provider.
     *            </p>
     *            </note>
     */
    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    /**
     * <p>
     * The unique identifier of the place. You can use this with the
     * <code>GetPlace</code> operation to find the place again later.
     * </p>
     * <note>
     * <p>
     * For <code>SearchPlaceIndexForText</code> operations, the
     * <code>PlaceId</code> is returned only by place indexes that use HERE or
     * Grab as a data provider.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param placeId <p>
     *            The unique identifier of the place. You can use this with the
     *            <code>GetPlace</code> operation to find the place again later.
     *            </p>
     *            <note>
     *            <p>
     *            For <code>SearchPlaceIndexForText</code> operations, the
     *            <code>PlaceId</code> is returned only by place indexes that
     *            use HERE or Grab as a data provider.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchForTextResult withPlaceId(String placeId) {
        this.placeId = placeId;
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
        if (getPlace() != null)
            sb.append("Place: " + getPlace() + ",");
        if (getDistance() != null)
            sb.append("Distance: " + getDistance() + ",");
        if (getRelevance() != null)
            sb.append("Relevance: " + getRelevance() + ",");
        if (getPlaceId() != null)
            sb.append("PlaceId: " + getPlaceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPlace() == null) ? 0 : getPlace().hashCode());
        hashCode = prime * hashCode + ((getDistance() == null) ? 0 : getDistance().hashCode());
        hashCode = prime * hashCode + ((getRelevance() == null) ? 0 : getRelevance().hashCode());
        hashCode = prime * hashCode + ((getPlaceId() == null) ? 0 : getPlaceId().hashCode());
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

        if (other.getPlace() == null ^ this.getPlace() == null)
            return false;
        if (other.getPlace() != null && other.getPlace().equals(this.getPlace()) == false)
            return false;
        if (other.getDistance() == null ^ this.getDistance() == null)
            return false;
        if (other.getDistance() != null && other.getDistance().equals(this.getDistance()) == false)
            return false;
        if (other.getRelevance() == null ^ this.getRelevance() == null)
            return false;
        if (other.getRelevance() != null
                && other.getRelevance().equals(this.getRelevance()) == false)
            return false;
        if (other.getPlaceId() == null ^ this.getPlaceId() == null)
            return false;
        if (other.getPlaceId() != null && other.getPlaceId().equals(this.getPlaceId()) == false)
            return false;
        return true;
    }
}
