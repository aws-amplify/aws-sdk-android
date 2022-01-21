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
 * Contains a search result from a position search query that is run on a place
 * index resource.
 * </p>
 */
public class SearchForPositionResult implements Serializable {
    /**
     * <p>
     * The distance in meters of a great-circle arc between the query position
     * and the result.
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
     * The distance in meters of a great-circle arc between the query position
     * and the result.
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
     *         The distance in meters of a great-circle arc between the query
     *         position and the result.
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
     * The distance in meters of a great-circle arc between the query position
     * and the result.
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
     *            The distance in meters of a great-circle arc between the query
     *            position and the result.
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
     * The distance in meters of a great-circle arc between the query position
     * and the result.
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
     *            The distance in meters of a great-circle arc between the query
     *            position and the result.
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
    public SearchForPositionResult withDistance(Double distance) {
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
    public SearchForPositionResult withPlace(Place place) {
        this.place = place;
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
            sb.append("Place: " + getPlace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDistance() == null) ? 0 : getDistance().hashCode());
        hashCode = prime * hashCode + ((getPlace() == null) ? 0 : getPlace().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchForPositionResult == false)
            return false;
        SearchForPositionResult other = (SearchForPositionResult) obj;

        if (other.getDistance() == null ^ this.getDistance() == null)
            return false;
        if (other.getDistance() != null && other.getDistance().equals(this.getDistance()) == false)
            return false;
        if (other.getPlace() == null ^ this.getPlace() == null)
            return false;
        if (other.getPlace() != null && other.getPlace().equals(this.getPlace()) == false)
            return false;
        return true;
    }
}
