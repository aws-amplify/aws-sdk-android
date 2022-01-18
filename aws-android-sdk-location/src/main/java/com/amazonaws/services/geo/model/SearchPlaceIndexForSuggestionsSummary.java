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
 * <code>SearchPlaceIndexForSuggestions</code>.
 * </p>
 */
public class SearchPlaceIndexForSuggestionsSummary implements Serializable {
    /**
     * <p>
     * Contains the coordinates for the optional bias position specified in the
     * request.
     * </p>
     * <p>
     * This parameter contains a pair of numbers. The first number represents
     * the X coordinate, or longitude; the second number represents the Y
     * coordinate, or latitude.
     * </p>
     * <p>
     * For example, <code>[-123.1174, 49.2847]</code> represents the position
     * with longitude <code>-123.1174</code> and latitude <code>49.2847</code>.
     * </p>
     */
    private java.util.List<Double> biasPosition;

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
     * Contains the coordinates for the optional bounding box specified in the
     * request.
     * </p>
     */
    private java.util.List<Double> filterBBox;

    /**
     * <p>
     * Contains the optional country filter specified in the request.
     * </p>
     */
    private java.util.List<String> filterCountries;

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
     * Contains the optional result count limit specified in the request.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The free-form partial text input specified in the request.
     * </p>
     */
    private String text;

    /**
     * <p>
     * Contains the coordinates for the optional bias position specified in the
     * request.
     * </p>
     * <p>
     * This parameter contains a pair of numbers. The first number represents
     * the X coordinate, or longitude; the second number represents the Y
     * coordinate, or latitude.
     * </p>
     * <p>
     * For example, <code>[-123.1174, 49.2847]</code> represents the position
     * with longitude <code>-123.1174</code> and latitude <code>49.2847</code>.
     * </p>
     *
     * @return <p>
     *         Contains the coordinates for the optional bias position specified
     *         in the request.
     *         </p>
     *         <p>
     *         This parameter contains a pair of numbers. The first number
     *         represents the X coordinate, or longitude; the second number
     *         represents the Y coordinate, or latitude.
     *         </p>
     *         <p>
     *         For example, <code>[-123.1174, 49.2847]</code> represents the
     *         position with longitude <code>-123.1174</code> and latitude
     *         <code>49.2847</code>.
     *         </p>
     */
    public java.util.List<Double> getBiasPosition() {
        return biasPosition;
    }

    /**
     * <p>
     * Contains the coordinates for the optional bias position specified in the
     * request.
     * </p>
     * <p>
     * This parameter contains a pair of numbers. The first number represents
     * the X coordinate, or longitude; the second number represents the Y
     * coordinate, or latitude.
     * </p>
     * <p>
     * For example, <code>[-123.1174, 49.2847]</code> represents the position
     * with longitude <code>-123.1174</code> and latitude <code>49.2847</code>.
     * </p>
     *
     * @param biasPosition <p>
     *            Contains the coordinates for the optional bias position
     *            specified in the request.
     *            </p>
     *            <p>
     *            This parameter contains a pair of numbers. The first number
     *            represents the X coordinate, or longitude; the second number
     *            represents the Y coordinate, or latitude.
     *            </p>
     *            <p>
     *            For example, <code>[-123.1174, 49.2847]</code> represents the
     *            position with longitude <code>-123.1174</code> and latitude
     *            <code>49.2847</code>.
     *            </p>
     */
    public void setBiasPosition(java.util.Collection<Double> biasPosition) {
        if (biasPosition == null) {
            this.biasPosition = null;
            return;
        }

        this.biasPosition = new java.util.ArrayList<Double>(biasPosition);
    }

    /**
     * <p>
     * Contains the coordinates for the optional bias position specified in the
     * request.
     * </p>
     * <p>
     * This parameter contains a pair of numbers. The first number represents
     * the X coordinate, or longitude; the second number represents the Y
     * coordinate, or latitude.
     * </p>
     * <p>
     * For example, <code>[-123.1174, 49.2847]</code> represents the position
     * with longitude <code>-123.1174</code> and latitude <code>49.2847</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param biasPosition <p>
     *            Contains the coordinates for the optional bias position
     *            specified in the request.
     *            </p>
     *            <p>
     *            This parameter contains a pair of numbers. The first number
     *            represents the X coordinate, or longitude; the second number
     *            represents the Y coordinate, or latitude.
     *            </p>
     *            <p>
     *            For example, <code>[-123.1174, 49.2847]</code> represents the
     *            position with longitude <code>-123.1174</code> and latitude
     *            <code>49.2847</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPlaceIndexForSuggestionsSummary withBiasPosition(Double... biasPosition) {
        if (getBiasPosition() == null) {
            this.biasPosition = new java.util.ArrayList<Double>(biasPosition.length);
        }
        for (Double value : biasPosition) {
            this.biasPosition.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains the coordinates for the optional bias position specified in the
     * request.
     * </p>
     * <p>
     * This parameter contains a pair of numbers. The first number represents
     * the X coordinate, or longitude; the second number represents the Y
     * coordinate, or latitude.
     * </p>
     * <p>
     * For example, <code>[-123.1174, 49.2847]</code> represents the position
     * with longitude <code>-123.1174</code> and latitude <code>49.2847</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param biasPosition <p>
     *            Contains the coordinates for the optional bias position
     *            specified in the request.
     *            </p>
     *            <p>
     *            This parameter contains a pair of numbers. The first number
     *            represents the X coordinate, or longitude; the second number
     *            represents the Y coordinate, or latitude.
     *            </p>
     *            <p>
     *            For example, <code>[-123.1174, 49.2847]</code> represents the
     *            position with longitude <code>-123.1174</code> and latitude
     *            <code>49.2847</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPlaceIndexForSuggestionsSummary withBiasPosition(
            java.util.Collection<Double> biasPosition) {
        setBiasPosition(biasPosition);
        return this;
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
    public SearchPlaceIndexForSuggestionsSummary withDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    /**
     * <p>
     * Contains the coordinates for the optional bounding box specified in the
     * request.
     * </p>
     *
     * @return <p>
     *         Contains the coordinates for the optional bounding box specified
     *         in the request.
     *         </p>
     */
    public java.util.List<Double> getFilterBBox() {
        return filterBBox;
    }

    /**
     * <p>
     * Contains the coordinates for the optional bounding box specified in the
     * request.
     * </p>
     *
     * @param filterBBox <p>
     *            Contains the coordinates for the optional bounding box
     *            specified in the request.
     *            </p>
     */
    public void setFilterBBox(java.util.Collection<Double> filterBBox) {
        if (filterBBox == null) {
            this.filterBBox = null;
            return;
        }

        this.filterBBox = new java.util.ArrayList<Double>(filterBBox);
    }

    /**
     * <p>
     * Contains the coordinates for the optional bounding box specified in the
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterBBox <p>
     *            Contains the coordinates for the optional bounding box
     *            specified in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPlaceIndexForSuggestionsSummary withFilterBBox(Double... filterBBox) {
        if (getFilterBBox() == null) {
            this.filterBBox = new java.util.ArrayList<Double>(filterBBox.length);
        }
        for (Double value : filterBBox) {
            this.filterBBox.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains the coordinates for the optional bounding box specified in the
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterBBox <p>
     *            Contains the coordinates for the optional bounding box
     *            specified in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPlaceIndexForSuggestionsSummary withFilterBBox(
            java.util.Collection<Double> filterBBox) {
        setFilterBBox(filterBBox);
        return this;
    }

    /**
     * <p>
     * Contains the optional country filter specified in the request.
     * </p>
     *
     * @return <p>
     *         Contains the optional country filter specified in the request.
     *         </p>
     */
    public java.util.List<String> getFilterCountries() {
        return filterCountries;
    }

    /**
     * <p>
     * Contains the optional country filter specified in the request.
     * </p>
     *
     * @param filterCountries <p>
     *            Contains the optional country filter specified in the request.
     *            </p>
     */
    public void setFilterCountries(java.util.Collection<String> filterCountries) {
        if (filterCountries == null) {
            this.filterCountries = null;
            return;
        }

        this.filterCountries = new java.util.ArrayList<String>(filterCountries);
    }

    /**
     * <p>
     * Contains the optional country filter specified in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterCountries <p>
     *            Contains the optional country filter specified in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPlaceIndexForSuggestionsSummary withFilterCountries(String... filterCountries) {
        if (getFilterCountries() == null) {
            this.filterCountries = new java.util.ArrayList<String>(filterCountries.length);
        }
        for (String value : filterCountries) {
            this.filterCountries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains the optional country filter specified in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterCountries <p>
     *            Contains the optional country filter specified in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPlaceIndexForSuggestionsSummary withFilterCountries(
            java.util.Collection<String> filterCountries) {
        setFilterCountries(filterCountries);
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
    public SearchPlaceIndexForSuggestionsSummary withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * <p>
     * Contains the optional result count limit specified in the request.
     * </p>
     *
     * @return <p>
     *         Contains the optional result count limit specified in the
     *         request.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * Contains the optional result count limit specified in the request.
     * </p>
     *
     * @param maxResults <p>
     *            Contains the optional result count limit specified in the
     *            request.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Contains the optional result count limit specified in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxResults <p>
     *            Contains the optional result count limit specified in the
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPlaceIndexForSuggestionsSummary withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The free-form partial text input specified in the request.
     * </p>
     *
     * @return <p>
     *         The free-form partial text input specified in the request.
     *         </p>
     */
    public String getText() {
        return text;
    }

    /**
     * <p>
     * The free-form partial text input specified in the request.
     * </p>
     *
     * @param text <p>
     *            The free-form partial text input specified in the request.
     *            </p>
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The free-form partial text input specified in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param text <p>
     *            The free-form partial text input specified in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPlaceIndexForSuggestionsSummary withText(String text) {
        this.text = text;
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
        if (getBiasPosition() != null)
            sb.append("BiasPosition: " + getBiasPosition() + ",");
        if (getDataSource() != null)
            sb.append("DataSource: " + getDataSource() + ",");
        if (getFilterBBox() != null)
            sb.append("FilterBBox: " + getFilterBBox() + ",");
        if (getFilterCountries() != null)
            sb.append("FilterCountries: " + getFilterCountries() + ",");
        if (getLanguage() != null)
            sb.append("Language: " + getLanguage() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getText() != null)
            sb.append("Text: " + getText());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBiasPosition() == null) ? 0 : getBiasPosition().hashCode());
        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode + ((getFilterBBox() == null) ? 0 : getFilterBBox().hashCode());
        hashCode = prime * hashCode
                + ((getFilterCountries() == null) ? 0 : getFilterCountries().hashCode());
        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchPlaceIndexForSuggestionsSummary == false)
            return false;
        SearchPlaceIndexForSuggestionsSummary other = (SearchPlaceIndexForSuggestionsSummary) obj;

        if (other.getBiasPosition() == null ^ this.getBiasPosition() == null)
            return false;
        if (other.getBiasPosition() != null
                && other.getBiasPosition().equals(this.getBiasPosition()) == false)
            return false;
        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null
                && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        if (other.getFilterBBox() == null ^ this.getFilterBBox() == null)
            return false;
        if (other.getFilterBBox() != null
                && other.getFilterBBox().equals(this.getFilterBBox()) == false)
            return false;
        if (other.getFilterCountries() == null ^ this.getFilterCountries() == null)
            return false;
        if (other.getFilterCountries() != null
                && other.getFilterCountries().equals(this.getFilterCountries()) == false)
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
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        return true;
    }
}
