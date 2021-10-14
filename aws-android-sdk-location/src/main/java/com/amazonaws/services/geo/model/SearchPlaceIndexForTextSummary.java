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
 * A summary of the geocoding request sent using
 * <code>SearchPlaceIndexForText</code>.
 * </p>
 */
public class SearchPlaceIndexForTextSummary implements Serializable {
    /**
     * <p>
     * Contains the coordinates for the bias position entered in the geocoding
     * request.
     * </p>
     */
    private java.util.List<Double> biasPosition;

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
     * Contains the coordinates for the optional bounding box coordinated
     * entered in the geocoding request.
     * </p>
     */
    private java.util.List<Double> filterBBox;

    /**
     * <p>
     * Contains the country filter entered in the geocoding request.
     * </p>
     */
    private java.util.List<String> filterCountries;

    /**
     * <p>
     * Contains the maximum number of results indicated for the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * A bounding box that contains the search results within the specified area
     * indicated by <code>FilterBBox</code>. A subset of bounding box specified
     * using <code>FilterBBox</code>.
     * </p>
     */
    private java.util.List<Double> resultBBox;

    /**
     * <p>
     * The address, name, city or region to be used in the geocoding request. In
     * free-form text format. For example, <code>Vancouver</code>.
     * </p>
     */
    private String text;

    /**
     * <p>
     * Contains the coordinates for the bias position entered in the geocoding
     * request.
     * </p>
     *
     * @return <p>
     *         Contains the coordinates for the bias position entered in the
     *         geocoding request.
     *         </p>
     */
    public java.util.List<Double> getBiasPosition() {
        return biasPosition;
    }

    /**
     * <p>
     * Contains the coordinates for the bias position entered in the geocoding
     * request.
     * </p>
     *
     * @param biasPosition <p>
     *            Contains the coordinates for the bias position entered in the
     *            geocoding request.
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
     * Contains the coordinates for the bias position entered in the geocoding
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param biasPosition <p>
     *            Contains the coordinates for the bias position entered in the
     *            geocoding request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPlaceIndexForTextSummary withBiasPosition(Double... biasPosition) {
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
     * Contains the coordinates for the bias position entered in the geocoding
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param biasPosition <p>
     *            Contains the coordinates for the bias position entered in the
     *            geocoding request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPlaceIndexForTextSummary withBiasPosition(java.util.Collection<Double> biasPosition) {
        setBiasPosition(biasPosition);
        return this;
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
    public SearchPlaceIndexForTextSummary withDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    /**
     * <p>
     * Contains the coordinates for the optional bounding box coordinated
     * entered in the geocoding request.
     * </p>
     *
     * @return <p>
     *         Contains the coordinates for the optional bounding box
     *         coordinated entered in the geocoding request.
     *         </p>
     */
    public java.util.List<Double> getFilterBBox() {
        return filterBBox;
    }

    /**
     * <p>
     * Contains the coordinates for the optional bounding box coordinated
     * entered in the geocoding request.
     * </p>
     *
     * @param filterBBox <p>
     *            Contains the coordinates for the optional bounding box
     *            coordinated entered in the geocoding request.
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
     * Contains the coordinates for the optional bounding box coordinated
     * entered in the geocoding request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterBBox <p>
     *            Contains the coordinates for the optional bounding box
     *            coordinated entered in the geocoding request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPlaceIndexForTextSummary withFilterBBox(Double... filterBBox) {
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
     * Contains the coordinates for the optional bounding box coordinated
     * entered in the geocoding request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterBBox <p>
     *            Contains the coordinates for the optional bounding box
     *            coordinated entered in the geocoding request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPlaceIndexForTextSummary withFilterBBox(java.util.Collection<Double> filterBBox) {
        setFilterBBox(filterBBox);
        return this;
    }

    /**
     * <p>
     * Contains the country filter entered in the geocoding request.
     * </p>
     *
     * @return <p>
     *         Contains the country filter entered in the geocoding request.
     *         </p>
     */
    public java.util.List<String> getFilterCountries() {
        return filterCountries;
    }

    /**
     * <p>
     * Contains the country filter entered in the geocoding request.
     * </p>
     *
     * @param filterCountries <p>
     *            Contains the country filter entered in the geocoding request.
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
     * Contains the country filter entered in the geocoding request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterCountries <p>
     *            Contains the country filter entered in the geocoding request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPlaceIndexForTextSummary withFilterCountries(String... filterCountries) {
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
     * Contains the country filter entered in the geocoding request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterCountries <p>
     *            Contains the country filter entered in the geocoding request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPlaceIndexForTextSummary withFilterCountries(
            java.util.Collection<String> filterCountries) {
        setFilterCountries(filterCountries);
        return this;
    }

    /**
     * <p>
     * Contains the maximum number of results indicated for the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @return <p>
     *         Contains the maximum number of results indicated for the request.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * Contains the maximum number of results indicated for the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>
     *            Contains the maximum number of results indicated for the
     *            request.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Contains the maximum number of results indicated for the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>
     *            Contains the maximum number of results indicated for the
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPlaceIndexForTextSummary withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * A bounding box that contains the search results within the specified area
     * indicated by <code>FilterBBox</code>. A subset of bounding box specified
     * using <code>FilterBBox</code>.
     * </p>
     *
     * @return <p>
     *         A bounding box that contains the search results within the
     *         specified area indicated by <code>FilterBBox</code>. A subset of
     *         bounding box specified using <code>FilterBBox</code>.
     *         </p>
     */
    public java.util.List<Double> getResultBBox() {
        return resultBBox;
    }

    /**
     * <p>
     * A bounding box that contains the search results within the specified area
     * indicated by <code>FilterBBox</code>. A subset of bounding box specified
     * using <code>FilterBBox</code>.
     * </p>
     *
     * @param resultBBox <p>
     *            A bounding box that contains the search results within the
     *            specified area indicated by <code>FilterBBox</code>. A subset
     *            of bounding box specified using <code>FilterBBox</code>.
     *            </p>
     */
    public void setResultBBox(java.util.Collection<Double> resultBBox) {
        if (resultBBox == null) {
            this.resultBBox = null;
            return;
        }

        this.resultBBox = new java.util.ArrayList<Double>(resultBBox);
    }

    /**
     * <p>
     * A bounding box that contains the search results within the specified area
     * indicated by <code>FilterBBox</code>. A subset of bounding box specified
     * using <code>FilterBBox</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resultBBox <p>
     *            A bounding box that contains the search results within the
     *            specified area indicated by <code>FilterBBox</code>. A subset
     *            of bounding box specified using <code>FilterBBox</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPlaceIndexForTextSummary withResultBBox(Double... resultBBox) {
        if (getResultBBox() == null) {
            this.resultBBox = new java.util.ArrayList<Double>(resultBBox.length);
        }
        for (Double value : resultBBox) {
            this.resultBBox.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A bounding box that contains the search results within the specified area
     * indicated by <code>FilterBBox</code>. A subset of bounding box specified
     * using <code>FilterBBox</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resultBBox <p>
     *            A bounding box that contains the search results within the
     *            specified area indicated by <code>FilterBBox</code>. A subset
     *            of bounding box specified using <code>FilterBBox</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPlaceIndexForTextSummary withResultBBox(java.util.Collection<Double> resultBBox) {
        setResultBBox(resultBBox);
        return this;
    }

    /**
     * <p>
     * The address, name, city or region to be used in the geocoding request. In
     * free-form text format. For example, <code>Vancouver</code>.
     * </p>
     *
     * @return <p>
     *         The address, name, city or region to be used in the geocoding
     *         request. In free-form text format. For example,
     *         <code>Vancouver</code>.
     *         </p>
     */
    public String getText() {
        return text;
    }

    /**
     * <p>
     * The address, name, city or region to be used in the geocoding request. In
     * free-form text format. For example, <code>Vancouver</code>.
     * </p>
     *
     * @param text <p>
     *            The address, name, city or region to be used in the geocoding
     *            request. In free-form text format. For example,
     *            <code>Vancouver</code>.
     *            </p>
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The address, name, city or region to be used in the geocoding request. In
     * free-form text format. For example, <code>Vancouver</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param text <p>
     *            The address, name, city or region to be used in the geocoding
     *            request. In free-form text format. For example,
     *            <code>Vancouver</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPlaceIndexForTextSummary withText(String text) {
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
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getResultBBox() != null)
            sb.append("ResultBBox: " + getResultBBox() + ",");
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
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getResultBBox() == null) ? 0 : getResultBBox().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchPlaceIndexForTextSummary == false)
            return false;
        SearchPlaceIndexForTextSummary other = (SearchPlaceIndexForTextSummary) obj;

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
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getResultBBox() == null ^ this.getResultBBox() == null)
            return false;
        if (other.getResultBBox() != null
                && other.getResultBBox().equals(this.getResultBBox()) == false)
            return false;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        return true;
    }
}
