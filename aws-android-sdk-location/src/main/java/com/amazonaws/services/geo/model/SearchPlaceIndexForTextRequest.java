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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Geocodes free-form text, such as an address, name, city, or region to allow
 * you to search for Places or points of interest.
 * </p>
 * <p>
 * Includes the option to apply additional parameters to narrow your list of
 * results.
 * </p>
 * <note>
 * <p>
 * You can search for places near a given position using
 * <code>BiasPosition</code>, or filter results within a bounding box using
 * <code>FilterBBox</code>. Providing both parameters simultaneously returns an
 * error.
 * </p>
 * </note>
 */
public class SearchPlaceIndexForTextRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Searches for results closest to the given position. An optional parameter
     * defined by longitude, and latitude.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first <code>bias</code> position is the X coordinate, or longitude.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second <code>bias</code> position is the Y coordinate, or latitude.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>bias=xLongitude&amp;bias=yLatitude</code>.
     * </p>
     */
    private java.util.List<Double> biasPosition;

    /**
     * <p>
     * Filters the results by returning only Places within the provided bounding
     * box. An optional parameter.
     * </p>
     * <p>
     * The first 2 <code>bbox</code> parameters describe the lower southwest
     * corner:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first <code>bbox</code> position is the X coordinate or longitude of
     * the lower southwest corner.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second <code>bbox</code> position is the Y coordinate or latitude of
     * the lower southwest corner.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>bbox=xLongitudeSW&amp;bbox=yLatitudeSW</code>.
     * </p>
     * <p>
     * The next <code>bbox</code> parameters describe the upper northeast
     * corner:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The third <code>bbox</code> position is the X coordinate, or longitude of
     * the upper northeast corner.
     * </p>
     * </li>
     * <li>
     * <p>
     * The fourth <code>bbox</code> position is the Y coordinate, or longitude
     * of the upper northeast corner.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>bbox=xLongitudeNE&amp;bbox=yLatitudeNE</code>
     * </p>
     */
    private java.util.List<Double> filterBBox;

    /**
     * <p>
     * Limits the search to the given a list of countries/regions. An optional
     * parameter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <a href="https://www.iso.org/iso-3166-country-codes.html">ISO
     * 3166</a> 3-digit country code. For example, Australia uses three
     * upper-case characters: <code>AUS</code>.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> filterCountries;

    /**
     * <p>
     * The name of the place index resource you want to use for the search.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     */
    private String indexName;

    /**
     * <p>
     * An optional parameter. The maximum number of results returned per
     * request.
     * </p>
     * <p>
     * The default: <code>50</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The address, name, city, or region to be used in the search. In free-form
     * text format. For example, <code>123 Any Street</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     */
    private String text;

    /**
     * <p>
     * Searches for results closest to the given position. An optional parameter
     * defined by longitude, and latitude.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first <code>bias</code> position is the X coordinate, or longitude.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second <code>bias</code> position is the Y coordinate, or latitude.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>bias=xLongitude&amp;bias=yLatitude</code>.
     * </p>
     *
     * @return <p>
     *         Searches for results closest to the given position. An optional
     *         parameter defined by longitude, and latitude.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The first <code>bias</code> position is the X coordinate, or
     *         longitude.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The second <code>bias</code> position is the Y coordinate, or
     *         latitude.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For example, <code>bias=xLongitude&amp;bias=yLatitude</code>.
     *         </p>
     */
    public java.util.List<Double> getBiasPosition() {
        return biasPosition;
    }

    /**
     * <p>
     * Searches for results closest to the given position. An optional parameter
     * defined by longitude, and latitude.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first <code>bias</code> position is the X coordinate, or longitude.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second <code>bias</code> position is the Y coordinate, or latitude.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>bias=xLongitude&amp;bias=yLatitude</code>.
     * </p>
     *
     * @param biasPosition <p>
     *            Searches for results closest to the given position. An
     *            optional parameter defined by longitude, and latitude.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The first <code>bias</code> position is the X coordinate, or
     *            longitude.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The second <code>bias</code> position is the Y coordinate, or
     *            latitude.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For example, <code>bias=xLongitude&amp;bias=yLatitude</code>.
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
     * Searches for results closest to the given position. An optional parameter
     * defined by longitude, and latitude.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first <code>bias</code> position is the X coordinate, or longitude.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second <code>bias</code> position is the Y coordinate, or latitude.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>bias=xLongitude&amp;bias=yLatitude</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param biasPosition <p>
     *            Searches for results closest to the given position. An
     *            optional parameter defined by longitude, and latitude.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The first <code>bias</code> position is the X coordinate, or
     *            longitude.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The second <code>bias</code> position is the Y coordinate, or
     *            latitude.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For example, <code>bias=xLongitude&amp;bias=yLatitude</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPlaceIndexForTextRequest withBiasPosition(Double... biasPosition) {
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
     * Searches for results closest to the given position. An optional parameter
     * defined by longitude, and latitude.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first <code>bias</code> position is the X coordinate, or longitude.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second <code>bias</code> position is the Y coordinate, or latitude.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>bias=xLongitude&amp;bias=yLatitude</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param biasPosition <p>
     *            Searches for results closest to the given position. An
     *            optional parameter defined by longitude, and latitude.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The first <code>bias</code> position is the X coordinate, or
     *            longitude.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The second <code>bias</code> position is the Y coordinate, or
     *            latitude.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For example, <code>bias=xLongitude&amp;bias=yLatitude</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPlaceIndexForTextRequest withBiasPosition(java.util.Collection<Double> biasPosition) {
        setBiasPosition(biasPosition);
        return this;
    }

    /**
     * <p>
     * Filters the results by returning only Places within the provided bounding
     * box. An optional parameter.
     * </p>
     * <p>
     * The first 2 <code>bbox</code> parameters describe the lower southwest
     * corner:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first <code>bbox</code> position is the X coordinate or longitude of
     * the lower southwest corner.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second <code>bbox</code> position is the Y coordinate or latitude of
     * the lower southwest corner.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>bbox=xLongitudeSW&amp;bbox=yLatitudeSW</code>.
     * </p>
     * <p>
     * The next <code>bbox</code> parameters describe the upper northeast
     * corner:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The third <code>bbox</code> position is the X coordinate, or longitude of
     * the upper northeast corner.
     * </p>
     * </li>
     * <li>
     * <p>
     * The fourth <code>bbox</code> position is the Y coordinate, or longitude
     * of the upper northeast corner.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>bbox=xLongitudeNE&amp;bbox=yLatitudeNE</code>
     * </p>
     *
     * @return <p>
     *         Filters the results by returning only Places within the provided
     *         bounding box. An optional parameter.
     *         </p>
     *         <p>
     *         The first 2 <code>bbox</code> parameters describe the lower
     *         southwest corner:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The first <code>bbox</code> position is the X coordinate or
     *         longitude of the lower southwest corner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The second <code>bbox</code> position is the Y coordinate or
     *         latitude of the lower southwest corner.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For example, <code>bbox=xLongitudeSW&amp;bbox=yLatitudeSW</code>.
     *         </p>
     *         <p>
     *         The next <code>bbox</code> parameters describe the upper
     *         northeast corner:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The third <code>bbox</code> position is the X coordinate, or
     *         longitude of the upper northeast corner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The fourth <code>bbox</code> position is the Y coordinate, or
     *         longitude of the upper northeast corner.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For example, <code>bbox=xLongitudeNE&amp;bbox=yLatitudeNE</code>
     *         </p>
     */
    public java.util.List<Double> getFilterBBox() {
        return filterBBox;
    }

    /**
     * <p>
     * Filters the results by returning only Places within the provided bounding
     * box. An optional parameter.
     * </p>
     * <p>
     * The first 2 <code>bbox</code> parameters describe the lower southwest
     * corner:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first <code>bbox</code> position is the X coordinate or longitude of
     * the lower southwest corner.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second <code>bbox</code> position is the Y coordinate or latitude of
     * the lower southwest corner.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>bbox=xLongitudeSW&amp;bbox=yLatitudeSW</code>.
     * </p>
     * <p>
     * The next <code>bbox</code> parameters describe the upper northeast
     * corner:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The third <code>bbox</code> position is the X coordinate, or longitude of
     * the upper northeast corner.
     * </p>
     * </li>
     * <li>
     * <p>
     * The fourth <code>bbox</code> position is the Y coordinate, or longitude
     * of the upper northeast corner.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>bbox=xLongitudeNE&amp;bbox=yLatitudeNE</code>
     * </p>
     *
     * @param filterBBox <p>
     *            Filters the results by returning only Places within the
     *            provided bounding box. An optional parameter.
     *            </p>
     *            <p>
     *            The first 2 <code>bbox</code> parameters describe the lower
     *            southwest corner:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The first <code>bbox</code> position is the X coordinate or
     *            longitude of the lower southwest corner.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The second <code>bbox</code> position is the Y coordinate or
     *            latitude of the lower southwest corner.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For example,
     *            <code>bbox=xLongitudeSW&amp;bbox=yLatitudeSW</code>.
     *            </p>
     *            <p>
     *            The next <code>bbox</code> parameters describe the upper
     *            northeast corner:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The third <code>bbox</code> position is the X coordinate, or
     *            longitude of the upper northeast corner.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The fourth <code>bbox</code> position is the Y coordinate, or
     *            longitude of the upper northeast corner.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For example,
     *            <code>bbox=xLongitudeNE&amp;bbox=yLatitudeNE</code>
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
     * Filters the results by returning only Places within the provided bounding
     * box. An optional parameter.
     * </p>
     * <p>
     * The first 2 <code>bbox</code> parameters describe the lower southwest
     * corner:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first <code>bbox</code> position is the X coordinate or longitude of
     * the lower southwest corner.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second <code>bbox</code> position is the Y coordinate or latitude of
     * the lower southwest corner.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>bbox=xLongitudeSW&amp;bbox=yLatitudeSW</code>.
     * </p>
     * <p>
     * The next <code>bbox</code> parameters describe the upper northeast
     * corner:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The third <code>bbox</code> position is the X coordinate, or longitude of
     * the upper northeast corner.
     * </p>
     * </li>
     * <li>
     * <p>
     * The fourth <code>bbox</code> position is the Y coordinate, or longitude
     * of the upper northeast corner.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>bbox=xLongitudeNE&amp;bbox=yLatitudeNE</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterBBox <p>
     *            Filters the results by returning only Places within the
     *            provided bounding box. An optional parameter.
     *            </p>
     *            <p>
     *            The first 2 <code>bbox</code> parameters describe the lower
     *            southwest corner:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The first <code>bbox</code> position is the X coordinate or
     *            longitude of the lower southwest corner.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The second <code>bbox</code> position is the Y coordinate or
     *            latitude of the lower southwest corner.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For example,
     *            <code>bbox=xLongitudeSW&amp;bbox=yLatitudeSW</code>.
     *            </p>
     *            <p>
     *            The next <code>bbox</code> parameters describe the upper
     *            northeast corner:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The third <code>bbox</code> position is the X coordinate, or
     *            longitude of the upper northeast corner.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The fourth <code>bbox</code> position is the Y coordinate, or
     *            longitude of the upper northeast corner.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For example,
     *            <code>bbox=xLongitudeNE&amp;bbox=yLatitudeNE</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPlaceIndexForTextRequest withFilterBBox(Double... filterBBox) {
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
     * Filters the results by returning only Places within the provided bounding
     * box. An optional parameter.
     * </p>
     * <p>
     * The first 2 <code>bbox</code> parameters describe the lower southwest
     * corner:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first <code>bbox</code> position is the X coordinate or longitude of
     * the lower southwest corner.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second <code>bbox</code> position is the Y coordinate or latitude of
     * the lower southwest corner.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>bbox=xLongitudeSW&amp;bbox=yLatitudeSW</code>.
     * </p>
     * <p>
     * The next <code>bbox</code> parameters describe the upper northeast
     * corner:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The third <code>bbox</code> position is the X coordinate, or longitude of
     * the upper northeast corner.
     * </p>
     * </li>
     * <li>
     * <p>
     * The fourth <code>bbox</code> position is the Y coordinate, or longitude
     * of the upper northeast corner.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>bbox=xLongitudeNE&amp;bbox=yLatitudeNE</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterBBox <p>
     *            Filters the results by returning only Places within the
     *            provided bounding box. An optional parameter.
     *            </p>
     *            <p>
     *            The first 2 <code>bbox</code> parameters describe the lower
     *            southwest corner:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The first <code>bbox</code> position is the X coordinate or
     *            longitude of the lower southwest corner.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The second <code>bbox</code> position is the Y coordinate or
     *            latitude of the lower southwest corner.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For example,
     *            <code>bbox=xLongitudeSW&amp;bbox=yLatitudeSW</code>.
     *            </p>
     *            <p>
     *            The next <code>bbox</code> parameters describe the upper
     *            northeast corner:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The third <code>bbox</code> position is the X coordinate, or
     *            longitude of the upper northeast corner.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The fourth <code>bbox</code> position is the Y coordinate, or
     *            longitude of the upper northeast corner.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For example,
     *            <code>bbox=xLongitudeNE&amp;bbox=yLatitudeNE</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPlaceIndexForTextRequest withFilterBBox(java.util.Collection<Double> filterBBox) {
        setFilterBBox(filterBBox);
        return this;
    }

    /**
     * <p>
     * Limits the search to the given a list of countries/regions. An optional
     * parameter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <a href="https://www.iso.org/iso-3166-country-codes.html">ISO
     * 3166</a> 3-digit country code. For example, Australia uses three
     * upper-case characters: <code>AUS</code>.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Limits the search to the given a list of countries/regions. An
     *         optional parameter.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Use the <a
     *         href="https://www.iso.org/iso-3166-country-codes.html">ISO
     *         3166</a> 3-digit country code. For example, Australia uses three
     *         upper-case characters: <code>AUS</code>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<String> getFilterCountries() {
        return filterCountries;
    }

    /**
     * <p>
     * Limits the search to the given a list of countries/regions. An optional
     * parameter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <a href="https://www.iso.org/iso-3166-country-codes.html">ISO
     * 3166</a> 3-digit country code. For example, Australia uses three
     * upper-case characters: <code>AUS</code>.
     * </p>
     * </li>
     * </ul>
     *
     * @param filterCountries <p>
     *            Limits the search to the given a list of countries/regions. An
     *            optional parameter.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Use the <a
     *            href="https://www.iso.org/iso-3166-country-codes.html">ISO
     *            3166</a> 3-digit country code. For example, Australia uses
     *            three upper-case characters: <code>AUS</code>.
     *            </p>
     *            </li>
     *            </ul>
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
     * Limits the search to the given a list of countries/regions. An optional
     * parameter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <a href="https://www.iso.org/iso-3166-country-codes.html">ISO
     * 3166</a> 3-digit country code. For example, Australia uses three
     * upper-case characters: <code>AUS</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterCountries <p>
     *            Limits the search to the given a list of countries/regions. An
     *            optional parameter.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Use the <a
     *            href="https://www.iso.org/iso-3166-country-codes.html">ISO
     *            3166</a> 3-digit country code. For example, Australia uses
     *            three upper-case characters: <code>AUS</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPlaceIndexForTextRequest withFilterCountries(String... filterCountries) {
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
     * Limits the search to the given a list of countries/regions. An optional
     * parameter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <a href="https://www.iso.org/iso-3166-country-codes.html">ISO
     * 3166</a> 3-digit country code. For example, Australia uses three
     * upper-case characters: <code>AUS</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterCountries <p>
     *            Limits the search to the given a list of countries/regions. An
     *            optional parameter.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Use the <a
     *            href="https://www.iso.org/iso-3166-country-codes.html">ISO
     *            3166</a> 3-digit country code. For example, Australia uses
     *            three upper-case characters: <code>AUS</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPlaceIndexForTextRequest withFilterCountries(
            java.util.Collection<String> filterCountries) {
        setFilterCountries(filterCountries);
        return this;
    }

    /**
     * <p>
     * The name of the place index resource you want to use for the search.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @return <p>
     *         The name of the place index resource you want to use for the
     *         search.
     *         </p>
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * <p>
     * The name of the place index resource you want to use for the search.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @param indexName <p>
     *            The name of the place index resource you want to use for the
     *            search.
     *            </p>
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The name of the place index resource you want to use for the search.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @param indexName <p>
     *            The name of the place index resource you want to use for the
     *            search.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPlaceIndexForTextRequest withIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * <p>
     * An optional parameter. The maximum number of results returned per
     * request.
     * </p>
     * <p>
     * The default: <code>50</code>
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
     *         The default: <code>50</code>
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
     * The default: <code>50</code>
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
     *            The default: <code>50</code>
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
     * The default: <code>50</code>
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
     *            The default: <code>50</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPlaceIndexForTextRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The address, name, city, or region to be used in the search. In free-form
     * text format. For example, <code>123 Any Street</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     *
     * @return <p>
     *         The address, name, city, or region to be used in the search. In
     *         free-form text format. For example, <code>123 Any Street</code>.
     *         </p>
     */
    public String getText() {
        return text;
    }

    /**
     * <p>
     * The address, name, city, or region to be used in the search. In free-form
     * text format. For example, <code>123 Any Street</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     *
     * @param text <p>
     *            The address, name, city, or region to be used in the search.
     *            In free-form text format. For example,
     *            <code>123 Any Street</code>.
     *            </p>
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The address, name, city, or region to be used in the search. In free-form
     * text format. For example, <code>123 Any Street</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     *
     * @param text <p>
     *            The address, name, city, or region to be used in the search.
     *            In free-form text format. For example,
     *            <code>123 Any Street</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPlaceIndexForTextRequest withText(String text) {
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
        if (getFilterBBox() != null)
            sb.append("FilterBBox: " + getFilterBBox() + ",");
        if (getFilterCountries() != null)
            sb.append("FilterCountries: " + getFilterCountries() + ",");
        if (getIndexName() != null)
            sb.append("IndexName: " + getIndexName() + ",");
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
        hashCode = prime * hashCode + ((getFilterBBox() == null) ? 0 : getFilterBBox().hashCode());
        hashCode = prime * hashCode
                + ((getFilterCountries() == null) ? 0 : getFilterCountries().hashCode());
        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
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

        if (obj instanceof SearchPlaceIndexForTextRequest == false)
            return false;
        SearchPlaceIndexForTextRequest other = (SearchPlaceIndexForTextRequest) obj;

        if (other.getBiasPosition() == null ^ this.getBiasPosition() == null)
            return false;
        if (other.getBiasPosition() != null
                && other.getBiasPosition().equals(this.getBiasPosition()) == false)
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
        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null
                && other.getIndexName().equals(this.getIndexName()) == false)
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
