/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A summary of the reverse geocoding request sent using
 * <code>SearchPlaceIndexForPosition</code>.
 * </p>
 */
public class SearchPlaceIndexForPositionSummary implements Serializable {
    /**
     * <p>
     * The data provider of geospatial data. Indicates one of the available
     * providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Esri
     * </p>
     * </li>
     * <li>
     * <p>
     * HERE
     * </p>
     * </li>
     * </ul>
     * <p>
     * For additional details on data providers, see <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html"
     * >Amazon Location Service data providers</a>.
     * </p>
     */
    private String dataSource;

    /**
     * <p>
     * An optional parameter. The maximum number of results returned per
     * request.
     * </p>
     * <p>
     * Default value: <code>50</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The position given in the reverse geocoding request.
     * </p>
     */
    private java.util.List<Double> position;

    /**
     * <p>
     * The data provider of geospatial data. Indicates one of the available
     * providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Esri
     * </p>
     * </li>
     * <li>
     * <p>
     * HERE
     * </p>
     * </li>
     * </ul>
     * <p>
     * For additional details on data providers, see <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html"
     * >Amazon Location Service data providers</a>.
     * </p>
     *
     * @return <p>
     *         The data provider of geospatial data. Indicates one of the
     *         available providers:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Esri
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HERE
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For additional details on data providers, see <a href=
     *         "https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html"
     *         >Amazon Location Service data providers</a>.
     *         </p>
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * <p>
     * The data provider of geospatial data. Indicates one of the available
     * providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Esri
     * </p>
     * </li>
     * <li>
     * <p>
     * HERE
     * </p>
     * </li>
     * </ul>
     * <p>
     * For additional details on data providers, see <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html"
     * >Amazon Location Service data providers</a>.
     * </p>
     *
     * @param dataSource <p>
     *            The data provider of geospatial data. Indicates one of the
     *            available providers:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Esri
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            HERE
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For additional details on data providers, see <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html"
     *            >Amazon Location Service data providers</a>.
     *            </p>
     */
    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * The data provider of geospatial data. Indicates one of the available
     * providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Esri
     * </p>
     * </li>
     * <li>
     * <p>
     * HERE
     * </p>
     * </li>
     * </ul>
     * <p>
     * For additional details on data providers, see <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html"
     * >Amazon Location Service data providers</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataSource <p>
     *            The data provider of geospatial data. Indicates one of the
     *            available providers:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Esri
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            HERE
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For additional details on data providers, see <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html"
     *            >Amazon Location Service data providers</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPlaceIndexForPositionSummary withDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    /**
     * <p>
     * An optional parameter. The maximum number of results returned per
     * request.
     * </p>
     * <p>
     * Default value: <code>50</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @return <p>
     *         An optional parameter. The maximum number of results returned per
     *         request.
     *         </p>
     *         <p>
     *         Default value: <code>50</code>
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * An optional parameter. The maximum number of results returned per
     * request.
     * </p>
     * <p>
     * Default value: <code>50</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>
     *            An optional parameter. The maximum number of results returned
     *            per request.
     *            </p>
     *            <p>
     *            Default value: <code>50</code>
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * An optional parameter. The maximum number of results returned per
     * request.
     * </p>
     * <p>
     * Default value: <code>50</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>
     *            An optional parameter. The maximum number of results returned
     *            per request.
     *            </p>
     *            <p>
     *            Default value: <code>50</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPlaceIndexForPositionSummary withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The position given in the reverse geocoding request.
     * </p>
     *
     * @return <p>
     *         The position given in the reverse geocoding request.
     *         </p>
     */
    public java.util.List<Double> getPosition() {
        return position;
    }

    /**
     * <p>
     * The position given in the reverse geocoding request.
     * </p>
     *
     * @param position <p>
     *            The position given in the reverse geocoding request.
     *            </p>
     */
    public void setPosition(java.util.Collection<Double> position) {
        if (position == null) {
            this.position = null;
            return;
        }

        this.position = new java.util.ArrayList<Double>(position);
    }

    /**
     * <p>
     * The position given in the reverse geocoding request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param position <p>
     *            The position given in the reverse geocoding request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPlaceIndexForPositionSummary withPosition(Double... position) {
        if (getPosition() == null) {
            this.position = new java.util.ArrayList<Double>(position.length);
        }
        for (Double value : position) {
            this.position.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The position given in the reverse geocoding request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param position <p>
     *            The position given in the reverse geocoding request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPlaceIndexForPositionSummary withPosition(java.util.Collection<Double> position) {
        setPosition(position);
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
        if (getDataSource() != null)
            sb.append("DataSource: " + getDataSource() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getPosition() != null)
            sb.append("Position: " + getPosition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchPlaceIndexForPositionSummary == false)
            return false;
        SearchPlaceIndexForPositionSummary other = (SearchPlaceIndexForPositionSummary) obj;

        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null
                && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        return true;
    }
}
