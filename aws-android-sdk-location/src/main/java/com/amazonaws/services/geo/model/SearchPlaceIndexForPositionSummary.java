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
 * A summary of the request sent by using
 * <code>SearchPlaceIndexForPosition</code>.
 * </p>
 */
public class SearchPlaceIndexForPositionSummary implements Serializable {
    /**
     * <p>
     * The geospatial data provider attached to the place index resource
     * specified in the request. Values can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Esri
     * </p>
     * </li>
     * <li>
     * <p>
     * Here
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about data providers, see <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html"
     * >Amazon Location Service data providers</a>.
     * </p>
     */
    private String dataSource;

    /**
     * <p>
     * The preferred language used to return results. Matches the language in
     * the request. The value is a valid <a
     * href="https://tools.ietf.org/search/bcp47">BCP 47</a> language tag, for
     * example, <code>en</code> for English.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 35<br/>
     */
    private String language;

    /**
     * <p>
     * Contains the optional result count limit that is specified in the
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
     * The position specified in the request.
     * </p>
     */
    private java.util.List<Double> position;

    /**
     * <p>
     * The geospatial data provider attached to the place index resource
     * specified in the request. Values can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Esri
     * </p>
     * </li>
     * <li>
     * <p>
     * Here
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about data providers, see <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html"
     * >Amazon Location Service data providers</a>.
     * </p>
     *
     * @return <p>
     *         The geospatial data provider attached to the place index resource
     *         specified in the request. Values can be one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Esri
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Here
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about data providers, see <a href=
     *         "https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html"
     *         >Amazon Location Service data providers</a>.
     *         </p>
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * <p>
     * The geospatial data provider attached to the place index resource
     * specified in the request. Values can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Esri
     * </p>
     * </li>
     * <li>
     * <p>
     * Here
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about data providers, see <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html"
     * >Amazon Location Service data providers</a>.
     * </p>
     *
     * @param dataSource <p>
     *            The geospatial data provider attached to the place index
     *            resource specified in the request. Values can be one of the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Esri
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Here
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information about data providers, see <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html"
     *            >Amazon Location Service data providers</a>.
     *            </p>
     */
    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * The geospatial data provider attached to the place index resource
     * specified in the request. Values can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Esri
     * </p>
     * </li>
     * <li>
     * <p>
     * Here
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about data providers, see <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html"
     * >Amazon Location Service data providers</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataSource <p>
     *            The geospatial data provider attached to the place index
     *            resource specified in the request. Values can be one of the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Esri
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Here
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information about data providers, see <a href=
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
     * The preferred language used to return results. Matches the language in
     * the request. The value is a valid <a
     * href="https://tools.ietf.org/search/bcp47">BCP 47</a> language tag, for
     * example, <code>en</code> for English.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 35<br/>
     *
     * @return <p>
     *         The preferred language used to return results. Matches the
     *         language in the request. The value is a valid <a
     *         href="https://tools.ietf.org/search/bcp47">BCP 47</a> language
     *         tag, for example, <code>en</code> for English.
     *         </p>
     */
    public String getLanguage() {
        return language;
    }

    /**
     * <p>
     * The preferred language used to return results. Matches the language in
     * the request. The value is a valid <a
     * href="https://tools.ietf.org/search/bcp47">BCP 47</a> language tag, for
     * example, <code>en</code> for English.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 35<br/>
     *
     * @param language <p>
     *            The preferred language used to return results. Matches the
     *            language in the request. The value is a valid <a
     *            href="https://tools.ietf.org/search/bcp47">BCP 47</a> language
     *            tag, for example, <code>en</code> for English.
     *            </p>
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * <p>
     * The preferred language used to return results. Matches the language in
     * the request. The value is a valid <a
     * href="https://tools.ietf.org/search/bcp47">BCP 47</a> language tag, for
     * example, <code>en</code> for English.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 35<br/>
     *
     * @param language <p>
     *            The preferred language used to return results. Matches the
     *            language in the request. The value is a valid <a
     *            href="https://tools.ietf.org/search/bcp47">BCP 47</a> language
     *            tag, for example, <code>en</code> for English.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPlaceIndexForPositionSummary withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * <p>
     * Contains the optional result count limit that is specified in the
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
     *         Contains the optional result count limit that is specified in the
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
     * Contains the optional result count limit that is specified in the
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
     *            Contains the optional result count limit that is specified in
     *            the request.
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
     * Contains the optional result count limit that is specified in the
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
     *            Contains the optional result count limit that is specified in
     *            the request.
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
     * The position specified in the request.
     * </p>
     *
     * @return <p>
     *         The position specified in the request.
     *         </p>
     */
    public java.util.List<Double> getPosition() {
        return position;
    }

    /**
     * <p>
     * The position specified in the request.
     * </p>
     *
     * @param position <p>
     *            The position specified in the request.
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
     * The position specified in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param position <p>
     *            The position specified in the request.
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
     * The position specified in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param position <p>
     *            The position specified in the request.
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
        if (getLanguage() != null)
            sb.append("Language: " + getLanguage() + ",");
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
        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
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
        if (other.getLanguage() == null ^ this.getLanguage() == null)
            return false;
        if (other.getLanguage() != null && other.getLanguage().equals(this.getLanguage()) == false)
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
