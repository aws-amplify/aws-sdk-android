/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Optional parameters let you narrow your search results by bounding box or
 * country, or bias your search toward a specific position on the globe.
 * </p>
 * <note>
 * <p>
 * You can search for places near a given position using
 * <code>BiasPosition</code>, or filter results within a bounding box using
 * <code>FilterBBox</code>. Providing both parameters simultaneously returns an
 * error.
 * </p>
 * </note>
 * <p>
 * Search results are returned in order of highest to lowest relevance.
 * </p>
 */
public class SearchPlaceIndexForTextRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * An optional parameter that indicates a preference for places that are
     * closer to a specified position.
     * </p>
     * <p>
     * If provided, this parameter must contain a pair of numbers. The first
     * number represents the X coordinate, or longitude; the second number
     * represents the Y coordinate, or latitude.
     * </p>
     * <p>
     * For example, <code>[-123.1174, 49.2847]</code> represents the position
     * with longitude <code>-123.1174</code> and latitude <code>49.2847</code>.
     * </p>
     * <note>
     * <p>
     * <code>BiasPosition</code> and <code>FilterBBox</code> are mutually
     * exclusive. Specifying both options results in an error.
     * </p>
     * </note>
     */
    private java.util.List<Double> biasPosition;

    /**
     * <p>
     * An optional parameter that limits the search results by returning only
     * places that are within the provided bounding box.
     * </p>
     * <p>
     * If provided, this parameter must contain a total of four consecutive
     * numbers in two pairs. The first pair of numbers represents the X and Y
     * coordinates (longitude and latitude, respectively) of the southwest
     * corner of the bounding box; the second pair of numbers represents the X
     * and Y coordinates (longitude and latitude, respectively) of the northeast
     * corner of the bounding box.
     * </p>
     * <p>
     * For example, <code>[-12.7935, -37.4835, -12.0684, -36.9542]</code>
     * represents a bounding box where the southwest corner has longitude
     * <code>-12.7935</code> and latitude <code>-37.4835</code>, and the
     * northeast corner has longitude <code>-12.0684</code> and latitude
     * <code>-36.9542</code>.
     * </p>
     * <note>
     * <p>
     * <code>FilterBBox</code> and <code>BiasPosition</code> are mutually
     * exclusive. Specifying both options results in an error.
     * </p>
     * </note>
     */
    private java.util.List<Double> filterBBox;

    /**
     * <p>
     * A list of one or more Amazon Location categories to filter the returned
     * places. If you include more than one category, the results will include
     * results that match <i>any</i> of the categories listed.
     * </p>
     * <p>
     * For more information about using categories, including a list of Amazon
     * Location categories, see <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/category-filtering.html"
     * >Categories and filtering</a>, in the <i>Amazon Location Service
     * Developer Guide</i>.
     * </p>
     */
    private java.util.List<String> filterCategories;

    /**
     * <p>
     * An optional parameter that limits the search results by returning only
     * places that are in a specified list of countries.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Valid values include <a
     * href="https://www.iso.org/iso-3166-country-codes.html">ISO 3166</a>
     * 3-digit country codes. For example, Australia uses three upper-case
     * characters: <code>AUS</code>.
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
     * The optional <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/using-apikeys.html"
     * >API key</a> to authorize the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     */
    private String key;

    /**
     * <p>
     * The preferred language used to return results. The value must be a valid
     * <a href="https://tools.ietf.org/search/bcp47">BCP 47</a> language tag,
     * for example, <code>en</code> for English.
     * </p>
     * <p>
     * This setting affects the languages used in the results, but not the
     * results themselves. If no language is specified, or not supported for a
     * particular result, the partner automatically chooses a language for the
     * result.
     * </p>
     * <p>
     * For an example, we'll use the Greek language. You search for
     * <code>Athens, Greece</code>, with the <code>language</code> parameter set
     * to <code>en</code>. The result found will most likely be returned as
     * <code>Athens</code>.
     * </p>
     * <p>
     * If you set the <code>language</code> parameter to <code>el</code>, for
     * Greek, then the result found will more likely be returned as
     * <code>Αθήνα</code>.
     * </p>
     * <p>
     * If the data provider does not have a value for Greek, the result will be
     * in a language that the provider does support.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 35<br/>
     */
    private String language;

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
     * The address, name, city, or region to be used in the search in free-form
     * text format. For example, <code>123 Any Street</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     */
    private String text;

    /**
     * <p>
     * An optional parameter that indicates a preference for places that are
     * closer to a specified position.
     * </p>
     * <p>
     * If provided, this parameter must contain a pair of numbers. The first
     * number represents the X coordinate, or longitude; the second number
     * represents the Y coordinate, or latitude.
     * </p>
     * <p>
     * For example, <code>[-123.1174, 49.2847]</code> represents the position
     * with longitude <code>-123.1174</code> and latitude <code>49.2847</code>.
     * </p>
     * <note>
     * <p>
     * <code>BiasPosition</code> and <code>FilterBBox</code> are mutually
     * exclusive. Specifying both options results in an error.
     * </p>
     * </note>
     *
     * @return <p>
     *         An optional parameter that indicates a preference for places that
     *         are closer to a specified position.
     *         </p>
     *         <p>
     *         If provided, this parameter must contain a pair of numbers. The
     *         first number represents the X coordinate, or longitude; the
     *         second number represents the Y coordinate, or latitude.
     *         </p>
     *         <p>
     *         For example, <code>[-123.1174, 49.2847]</code> represents the
     *         position with longitude <code>-123.1174</code> and latitude
     *         <code>49.2847</code>.
     *         </p>
     *         <note>
     *         <p>
     *         <code>BiasPosition</code> and <code>FilterBBox</code> are
     *         mutually exclusive. Specifying both options results in an error.
     *         </p>
     *         </note>
     */
    public java.util.List<Double> getBiasPosition() {
        return biasPosition;
    }

    /**
     * <p>
     * An optional parameter that indicates a preference for places that are
     * closer to a specified position.
     * </p>
     * <p>
     * If provided, this parameter must contain a pair of numbers. The first
     * number represents the X coordinate, or longitude; the second number
     * represents the Y coordinate, or latitude.
     * </p>
     * <p>
     * For example, <code>[-123.1174, 49.2847]</code> represents the position
     * with longitude <code>-123.1174</code> and latitude <code>49.2847</code>.
     * </p>
     * <note>
     * <p>
     * <code>BiasPosition</code> and <code>FilterBBox</code> are mutually
     * exclusive. Specifying both options results in an error.
     * </p>
     * </note>
     *
     * @param biasPosition <p>
     *            An optional parameter that indicates a preference for places
     *            that are closer to a specified position.
     *            </p>
     *            <p>
     *            If provided, this parameter must contain a pair of numbers.
     *            The first number represents the X coordinate, or longitude;
     *            the second number represents the Y coordinate, or latitude.
     *            </p>
     *            <p>
     *            For example, <code>[-123.1174, 49.2847]</code> represents the
     *            position with longitude <code>-123.1174</code> and latitude
     *            <code>49.2847</code>.
     *            </p>
     *            <note>
     *            <p>
     *            <code>BiasPosition</code> and <code>FilterBBox</code> are
     *            mutually exclusive. Specifying both options results in an
     *            error.
     *            </p>
     *            </note>
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
     * An optional parameter that indicates a preference for places that are
     * closer to a specified position.
     * </p>
     * <p>
     * If provided, this parameter must contain a pair of numbers. The first
     * number represents the X coordinate, or longitude; the second number
     * represents the Y coordinate, or latitude.
     * </p>
     * <p>
     * For example, <code>[-123.1174, 49.2847]</code> represents the position
     * with longitude <code>-123.1174</code> and latitude <code>49.2847</code>.
     * </p>
     * <note>
     * <p>
     * <code>BiasPosition</code> and <code>FilterBBox</code> are mutually
     * exclusive. Specifying both options results in an error.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param biasPosition <p>
     *            An optional parameter that indicates a preference for places
     *            that are closer to a specified position.
     *            </p>
     *            <p>
     *            If provided, this parameter must contain a pair of numbers.
     *            The first number represents the X coordinate, or longitude;
     *            the second number represents the Y coordinate, or latitude.
     *            </p>
     *            <p>
     *            For example, <code>[-123.1174, 49.2847]</code> represents the
     *            position with longitude <code>-123.1174</code> and latitude
     *            <code>49.2847</code>.
     *            </p>
     *            <note>
     *            <p>
     *            <code>BiasPosition</code> and <code>FilterBBox</code> are
     *            mutually exclusive. Specifying both options results in an
     *            error.
     *            </p>
     *            </note>
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
     * An optional parameter that indicates a preference for places that are
     * closer to a specified position.
     * </p>
     * <p>
     * If provided, this parameter must contain a pair of numbers. The first
     * number represents the X coordinate, or longitude; the second number
     * represents the Y coordinate, or latitude.
     * </p>
     * <p>
     * For example, <code>[-123.1174, 49.2847]</code> represents the position
     * with longitude <code>-123.1174</code> and latitude <code>49.2847</code>.
     * </p>
     * <note>
     * <p>
     * <code>BiasPosition</code> and <code>FilterBBox</code> are mutually
     * exclusive. Specifying both options results in an error.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param biasPosition <p>
     *            An optional parameter that indicates a preference for places
     *            that are closer to a specified position.
     *            </p>
     *            <p>
     *            If provided, this parameter must contain a pair of numbers.
     *            The first number represents the X coordinate, or longitude;
     *            the second number represents the Y coordinate, or latitude.
     *            </p>
     *            <p>
     *            For example, <code>[-123.1174, 49.2847]</code> represents the
     *            position with longitude <code>-123.1174</code> and latitude
     *            <code>49.2847</code>.
     *            </p>
     *            <note>
     *            <p>
     *            <code>BiasPosition</code> and <code>FilterBBox</code> are
     *            mutually exclusive. Specifying both options results in an
     *            error.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPlaceIndexForTextRequest withBiasPosition(java.util.Collection<Double> biasPosition) {
        setBiasPosition(biasPosition);
        return this;
    }

    /**
     * <p>
     * An optional parameter that limits the search results by returning only
     * places that are within the provided bounding box.
     * </p>
     * <p>
     * If provided, this parameter must contain a total of four consecutive
     * numbers in two pairs. The first pair of numbers represents the X and Y
     * coordinates (longitude and latitude, respectively) of the southwest
     * corner of the bounding box; the second pair of numbers represents the X
     * and Y coordinates (longitude and latitude, respectively) of the northeast
     * corner of the bounding box.
     * </p>
     * <p>
     * For example, <code>[-12.7935, -37.4835, -12.0684, -36.9542]</code>
     * represents a bounding box where the southwest corner has longitude
     * <code>-12.7935</code> and latitude <code>-37.4835</code>, and the
     * northeast corner has longitude <code>-12.0684</code> and latitude
     * <code>-36.9542</code>.
     * </p>
     * <note>
     * <p>
     * <code>FilterBBox</code> and <code>BiasPosition</code> are mutually
     * exclusive. Specifying both options results in an error.
     * </p>
     * </note>
     *
     * @return <p>
     *         An optional parameter that limits the search results by returning
     *         only places that are within the provided bounding box.
     *         </p>
     *         <p>
     *         If provided, this parameter must contain a total of four
     *         consecutive numbers in two pairs. The first pair of numbers
     *         represents the X and Y coordinates (longitude and latitude,
     *         respectively) of the southwest corner of the bounding box; the
     *         second pair of numbers represents the X and Y coordinates
     *         (longitude and latitude, respectively) of the northeast corner of
     *         the bounding box.
     *         </p>
     *         <p>
     *         For example,
     *         <code>[-12.7935, -37.4835, -12.0684, -36.9542]</code> represents
     *         a bounding box where the southwest corner has longitude
     *         <code>-12.7935</code> and latitude <code>-37.4835</code>, and the
     *         northeast corner has longitude <code>-12.0684</code> and latitude
     *         <code>-36.9542</code>.
     *         </p>
     *         <note>
     *         <p>
     *         <code>FilterBBox</code> and <code>BiasPosition</code> are
     *         mutually exclusive. Specifying both options results in an error.
     *         </p>
     *         </note>
     */
    public java.util.List<Double> getFilterBBox() {
        return filterBBox;
    }

    /**
     * <p>
     * An optional parameter that limits the search results by returning only
     * places that are within the provided bounding box.
     * </p>
     * <p>
     * If provided, this parameter must contain a total of four consecutive
     * numbers in two pairs. The first pair of numbers represents the X and Y
     * coordinates (longitude and latitude, respectively) of the southwest
     * corner of the bounding box; the second pair of numbers represents the X
     * and Y coordinates (longitude and latitude, respectively) of the northeast
     * corner of the bounding box.
     * </p>
     * <p>
     * For example, <code>[-12.7935, -37.4835, -12.0684, -36.9542]</code>
     * represents a bounding box where the southwest corner has longitude
     * <code>-12.7935</code> and latitude <code>-37.4835</code>, and the
     * northeast corner has longitude <code>-12.0684</code> and latitude
     * <code>-36.9542</code>.
     * </p>
     * <note>
     * <p>
     * <code>FilterBBox</code> and <code>BiasPosition</code> are mutually
     * exclusive. Specifying both options results in an error.
     * </p>
     * </note>
     *
     * @param filterBBox <p>
     *            An optional parameter that limits the search results by
     *            returning only places that are within the provided bounding
     *            box.
     *            </p>
     *            <p>
     *            If provided, this parameter must contain a total of four
     *            consecutive numbers in two pairs. The first pair of numbers
     *            represents the X and Y coordinates (longitude and latitude,
     *            respectively) of the southwest corner of the bounding box; the
     *            second pair of numbers represents the X and Y coordinates
     *            (longitude and latitude, respectively) of the northeast corner
     *            of the bounding box.
     *            </p>
     *            <p>
     *            For example,
     *            <code>[-12.7935, -37.4835, -12.0684, -36.9542]</code>
     *            represents a bounding box where the southwest corner has
     *            longitude <code>-12.7935</code> and latitude
     *            <code>-37.4835</code>, and the northeast corner has longitude
     *            <code>-12.0684</code> and latitude <code>-36.9542</code>.
     *            </p>
     *            <note>
     *            <p>
     *            <code>FilterBBox</code> and <code>BiasPosition</code> are
     *            mutually exclusive. Specifying both options results in an
     *            error.
     *            </p>
     *            </note>
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
     * An optional parameter that limits the search results by returning only
     * places that are within the provided bounding box.
     * </p>
     * <p>
     * If provided, this parameter must contain a total of four consecutive
     * numbers in two pairs. The first pair of numbers represents the X and Y
     * coordinates (longitude and latitude, respectively) of the southwest
     * corner of the bounding box; the second pair of numbers represents the X
     * and Y coordinates (longitude and latitude, respectively) of the northeast
     * corner of the bounding box.
     * </p>
     * <p>
     * For example, <code>[-12.7935, -37.4835, -12.0684, -36.9542]</code>
     * represents a bounding box where the southwest corner has longitude
     * <code>-12.7935</code> and latitude <code>-37.4835</code>, and the
     * northeast corner has longitude <code>-12.0684</code> and latitude
     * <code>-36.9542</code>.
     * </p>
     * <note>
     * <p>
     * <code>FilterBBox</code> and <code>BiasPosition</code> are mutually
     * exclusive. Specifying both options results in an error.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterBBox <p>
     *            An optional parameter that limits the search results by
     *            returning only places that are within the provided bounding
     *            box.
     *            </p>
     *            <p>
     *            If provided, this parameter must contain a total of four
     *            consecutive numbers in two pairs. The first pair of numbers
     *            represents the X and Y coordinates (longitude and latitude,
     *            respectively) of the southwest corner of the bounding box; the
     *            second pair of numbers represents the X and Y coordinates
     *            (longitude and latitude, respectively) of the northeast corner
     *            of the bounding box.
     *            </p>
     *            <p>
     *            For example,
     *            <code>[-12.7935, -37.4835, -12.0684, -36.9542]</code>
     *            represents a bounding box where the southwest corner has
     *            longitude <code>-12.7935</code> and latitude
     *            <code>-37.4835</code>, and the northeast corner has longitude
     *            <code>-12.0684</code> and latitude <code>-36.9542</code>.
     *            </p>
     *            <note>
     *            <p>
     *            <code>FilterBBox</code> and <code>BiasPosition</code> are
     *            mutually exclusive. Specifying both options results in an
     *            error.
     *            </p>
     *            </note>
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
     * An optional parameter that limits the search results by returning only
     * places that are within the provided bounding box.
     * </p>
     * <p>
     * If provided, this parameter must contain a total of four consecutive
     * numbers in two pairs. The first pair of numbers represents the X and Y
     * coordinates (longitude and latitude, respectively) of the southwest
     * corner of the bounding box; the second pair of numbers represents the X
     * and Y coordinates (longitude and latitude, respectively) of the northeast
     * corner of the bounding box.
     * </p>
     * <p>
     * For example, <code>[-12.7935, -37.4835, -12.0684, -36.9542]</code>
     * represents a bounding box where the southwest corner has longitude
     * <code>-12.7935</code> and latitude <code>-37.4835</code>, and the
     * northeast corner has longitude <code>-12.0684</code> and latitude
     * <code>-36.9542</code>.
     * </p>
     * <note>
     * <p>
     * <code>FilterBBox</code> and <code>BiasPosition</code> are mutually
     * exclusive. Specifying both options results in an error.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterBBox <p>
     *            An optional parameter that limits the search results by
     *            returning only places that are within the provided bounding
     *            box.
     *            </p>
     *            <p>
     *            If provided, this parameter must contain a total of four
     *            consecutive numbers in two pairs. The first pair of numbers
     *            represents the X and Y coordinates (longitude and latitude,
     *            respectively) of the southwest corner of the bounding box; the
     *            second pair of numbers represents the X and Y coordinates
     *            (longitude and latitude, respectively) of the northeast corner
     *            of the bounding box.
     *            </p>
     *            <p>
     *            For example,
     *            <code>[-12.7935, -37.4835, -12.0684, -36.9542]</code>
     *            represents a bounding box where the southwest corner has
     *            longitude <code>-12.7935</code> and latitude
     *            <code>-37.4835</code>, and the northeast corner has longitude
     *            <code>-12.0684</code> and latitude <code>-36.9542</code>.
     *            </p>
     *            <note>
     *            <p>
     *            <code>FilterBBox</code> and <code>BiasPosition</code> are
     *            mutually exclusive. Specifying both options results in an
     *            error.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPlaceIndexForTextRequest withFilterBBox(java.util.Collection<Double> filterBBox) {
        setFilterBBox(filterBBox);
        return this;
    }

    /**
     * <p>
     * A list of one or more Amazon Location categories to filter the returned
     * places. If you include more than one category, the results will include
     * results that match <i>any</i> of the categories listed.
     * </p>
     * <p>
     * For more information about using categories, including a list of Amazon
     * Location categories, see <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/category-filtering.html"
     * >Categories and filtering</a>, in the <i>Amazon Location Service
     * Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         A list of one or more Amazon Location categories to filter the
     *         returned places. If you include more than one category, the
     *         results will include results that match <i>any</i> of the
     *         categories listed.
     *         </p>
     *         <p>
     *         For more information about using categories, including a list of
     *         Amazon Location categories, see <a href=
     *         "https://docs.aws.amazon.com/location/latest/developerguide/category-filtering.html"
     *         >Categories and filtering</a>, in the <i>Amazon Location Service
     *         Developer Guide</i>.
     *         </p>
     */
    public java.util.List<String> getFilterCategories() {
        return filterCategories;
    }

    /**
     * <p>
     * A list of one or more Amazon Location categories to filter the returned
     * places. If you include more than one category, the results will include
     * results that match <i>any</i> of the categories listed.
     * </p>
     * <p>
     * For more information about using categories, including a list of Amazon
     * Location categories, see <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/category-filtering.html"
     * >Categories and filtering</a>, in the <i>Amazon Location Service
     * Developer Guide</i>.
     * </p>
     *
     * @param filterCategories <p>
     *            A list of one or more Amazon Location categories to filter the
     *            returned places. If you include more than one category, the
     *            results will include results that match <i>any</i> of the
     *            categories listed.
     *            </p>
     *            <p>
     *            For more information about using categories, including a list
     *            of Amazon Location categories, see <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/category-filtering.html"
     *            >Categories and filtering</a>, in the <i>Amazon Location
     *            Service Developer Guide</i>.
     *            </p>
     */
    public void setFilterCategories(java.util.Collection<String> filterCategories) {
        if (filterCategories == null) {
            this.filterCategories = null;
            return;
        }

        this.filterCategories = new java.util.ArrayList<String>(filterCategories);
    }

    /**
     * <p>
     * A list of one or more Amazon Location categories to filter the returned
     * places. If you include more than one category, the results will include
     * results that match <i>any</i> of the categories listed.
     * </p>
     * <p>
     * For more information about using categories, including a list of Amazon
     * Location categories, see <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/category-filtering.html"
     * >Categories and filtering</a>, in the <i>Amazon Location Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterCategories <p>
     *            A list of one or more Amazon Location categories to filter the
     *            returned places. If you include more than one category, the
     *            results will include results that match <i>any</i> of the
     *            categories listed.
     *            </p>
     *            <p>
     *            For more information about using categories, including a list
     *            of Amazon Location categories, see <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/category-filtering.html"
     *            >Categories and filtering</a>, in the <i>Amazon Location
     *            Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPlaceIndexForTextRequest withFilterCategories(String... filterCategories) {
        if (getFilterCategories() == null) {
            this.filterCategories = new java.util.ArrayList<String>(filterCategories.length);
        }
        for (String value : filterCategories) {
            this.filterCategories.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of one or more Amazon Location categories to filter the returned
     * places. If you include more than one category, the results will include
     * results that match <i>any</i> of the categories listed.
     * </p>
     * <p>
     * For more information about using categories, including a list of Amazon
     * Location categories, see <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/category-filtering.html"
     * >Categories and filtering</a>, in the <i>Amazon Location Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterCategories <p>
     *            A list of one or more Amazon Location categories to filter the
     *            returned places. If you include more than one category, the
     *            results will include results that match <i>any</i> of the
     *            categories listed.
     *            </p>
     *            <p>
     *            For more information about using categories, including a list
     *            of Amazon Location categories, see <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/category-filtering.html"
     *            >Categories and filtering</a>, in the <i>Amazon Location
     *            Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPlaceIndexForTextRequest withFilterCategories(
            java.util.Collection<String> filterCategories) {
        setFilterCategories(filterCategories);
        return this;
    }

    /**
     * <p>
     * An optional parameter that limits the search results by returning only
     * places that are in a specified list of countries.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Valid values include <a
     * href="https://www.iso.org/iso-3166-country-codes.html">ISO 3166</a>
     * 3-digit country codes. For example, Australia uses three upper-case
     * characters: <code>AUS</code>.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         An optional parameter that limits the search results by returning
     *         only places that are in a specified list of countries.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Valid values include <a
     *         href="https://www.iso.org/iso-3166-country-codes.html">ISO
     *         3166</a> 3-digit country codes. For example, Australia uses three
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
     * An optional parameter that limits the search results by returning only
     * places that are in a specified list of countries.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Valid values include <a
     * href="https://www.iso.org/iso-3166-country-codes.html">ISO 3166</a>
     * 3-digit country codes. For example, Australia uses three upper-case
     * characters: <code>AUS</code>.
     * </p>
     * </li>
     * </ul>
     *
     * @param filterCountries <p>
     *            An optional parameter that limits the search results by
     *            returning only places that are in a specified list of
     *            countries.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Valid values include <a
     *            href="https://www.iso.org/iso-3166-country-codes.html">ISO
     *            3166</a> 3-digit country codes. For example, Australia uses
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
     * An optional parameter that limits the search results by returning only
     * places that are in a specified list of countries.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Valid values include <a
     * href="https://www.iso.org/iso-3166-country-codes.html">ISO 3166</a>
     * 3-digit country codes. For example, Australia uses three upper-case
     * characters: <code>AUS</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterCountries <p>
     *            An optional parameter that limits the search results by
     *            returning only places that are in a specified list of
     *            countries.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Valid values include <a
     *            href="https://www.iso.org/iso-3166-country-codes.html">ISO
     *            3166</a> 3-digit country codes. For example, Australia uses
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
     * An optional parameter that limits the search results by returning only
     * places that are in a specified list of countries.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Valid values include <a
     * href="https://www.iso.org/iso-3166-country-codes.html">ISO 3166</a>
     * 3-digit country codes. For example, Australia uses three upper-case
     * characters: <code>AUS</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterCountries <p>
     *            An optional parameter that limits the search results by
     *            returning only places that are in a specified list of
     *            countries.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Valid values include <a
     *            href="https://www.iso.org/iso-3166-country-codes.html">ISO
     *            3166</a> 3-digit country codes. For example, Australia uses
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
     * The optional <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/using-apikeys.html"
     * >API key</a> to authorize the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @return <p>
     *         The optional <a href=
     *         "https://docs.aws.amazon.com/location/latest/developerguide/using-apikeys.html"
     *         >API key</a> to authorize the request.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The optional <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/using-apikeys.html"
     * >API key</a> to authorize the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param key <p>
     *            The optional <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/using-apikeys.html"
     *            >API key</a> to authorize the request.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The optional <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/using-apikeys.html"
     * >API key</a> to authorize the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param key <p>
     *            The optional <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/using-apikeys.html"
     *            >API key</a> to authorize the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPlaceIndexForTextRequest withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * The preferred language used to return results. The value must be a valid
     * <a href="https://tools.ietf.org/search/bcp47">BCP 47</a> language tag,
     * for example, <code>en</code> for English.
     * </p>
     * <p>
     * This setting affects the languages used in the results, but not the
     * results themselves. If no language is specified, or not supported for a
     * particular result, the partner automatically chooses a language for the
     * result.
     * </p>
     * <p>
     * For an example, we'll use the Greek language. You search for
     * <code>Athens, Greece</code>, with the <code>language</code> parameter set
     * to <code>en</code>. The result found will most likely be returned as
     * <code>Athens</code>.
     * </p>
     * <p>
     * If you set the <code>language</code> parameter to <code>el</code>, for
     * Greek, then the result found will more likely be returned as
     * <code>Αθήνα</code>.
     * </p>
     * <p>
     * If the data provider does not have a value for Greek, the result will be
     * in a language that the provider does support.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 35<br/>
     *
     * @return <p>
     *         The preferred language used to return results. The value must be
     *         a valid <a href="https://tools.ietf.org/search/bcp47">BCP 47</a>
     *         language tag, for example, <code>en</code> for English.
     *         </p>
     *         <p>
     *         This setting affects the languages used in the results, but not
     *         the results themselves. If no language is specified, or not
     *         supported for a particular result, the partner automatically
     *         chooses a language for the result.
     *         </p>
     *         <p>
     *         For an example, we'll use the Greek language. You search for
     *         <code>Athens, Greece</code>, with the <code>language</code>
     *         parameter set to <code>en</code>. The result found will most
     *         likely be returned as <code>Athens</code>.
     *         </p>
     *         <p>
     *         If you set the <code>language</code> parameter to <code>el</code>
     *         , for Greek, then the result found will more likely be returned
     *         as <code>Αθήνα</code>.
     *         </p>
     *         <p>
     *         If the data provider does not have a value for Greek, the result
     *         will be in a language that the provider does support.
     *         </p>
     */
    public String getLanguage() {
        return language;
    }

    /**
     * <p>
     * The preferred language used to return results. The value must be a valid
     * <a href="https://tools.ietf.org/search/bcp47">BCP 47</a> language tag,
     * for example, <code>en</code> for English.
     * </p>
     * <p>
     * This setting affects the languages used in the results, but not the
     * results themselves. If no language is specified, or not supported for a
     * particular result, the partner automatically chooses a language for the
     * result.
     * </p>
     * <p>
     * For an example, we'll use the Greek language. You search for
     * <code>Athens, Greece</code>, with the <code>language</code> parameter set
     * to <code>en</code>. The result found will most likely be returned as
     * <code>Athens</code>.
     * </p>
     * <p>
     * If you set the <code>language</code> parameter to <code>el</code>, for
     * Greek, then the result found will more likely be returned as
     * <code>Αθήνα</code>.
     * </p>
     * <p>
     * If the data provider does not have a value for Greek, the result will be
     * in a language that the provider does support.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 35<br/>
     *
     * @param language <p>
     *            The preferred language used to return results. The value must
     *            be a valid <a href="https://tools.ietf.org/search/bcp47">BCP
     *            47</a> language tag, for example, <code>en</code> for English.
     *            </p>
     *            <p>
     *            This setting affects the languages used in the results, but
     *            not the results themselves. If no language is specified, or
     *            not supported for a particular result, the partner
     *            automatically chooses a language for the result.
     *            </p>
     *            <p>
     *            For an example, we'll use the Greek language. You search for
     *            <code>Athens, Greece</code>, with the <code>language</code>
     *            parameter set to <code>en</code>. The result found will most
     *            likely be returned as <code>Athens</code>.
     *            </p>
     *            <p>
     *            If you set the <code>language</code> parameter to
     *            <code>el</code>, for Greek, then the result found will more
     *            likely be returned as <code>Αθήνα</code>.
     *            </p>
     *            <p>
     *            If the data provider does not have a value for Greek, the
     *            result will be in a language that the provider does support.
     *            </p>
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * <p>
     * The preferred language used to return results. The value must be a valid
     * <a href="https://tools.ietf.org/search/bcp47">BCP 47</a> language tag,
     * for example, <code>en</code> for English.
     * </p>
     * <p>
     * This setting affects the languages used in the results, but not the
     * results themselves. If no language is specified, or not supported for a
     * particular result, the partner automatically chooses a language for the
     * result.
     * </p>
     * <p>
     * For an example, we'll use the Greek language. You search for
     * <code>Athens, Greece</code>, with the <code>language</code> parameter set
     * to <code>en</code>. The result found will most likely be returned as
     * <code>Athens</code>.
     * </p>
     * <p>
     * If you set the <code>language</code> parameter to <code>el</code>, for
     * Greek, then the result found will more likely be returned as
     * <code>Αθήνα</code>.
     * </p>
     * <p>
     * If the data provider does not have a value for Greek, the result will be
     * in a language that the provider does support.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 35<br/>
     *
     * @param language <p>
     *            The preferred language used to return results. The value must
     *            be a valid <a href="https://tools.ietf.org/search/bcp47">BCP
     *            47</a> language tag, for example, <code>en</code> for English.
     *            </p>
     *            <p>
     *            This setting affects the languages used in the results, but
     *            not the results themselves. If no language is specified, or
     *            not supported for a particular result, the partner
     *            automatically chooses a language for the result.
     *            </p>
     *            <p>
     *            For an example, we'll use the Greek language. You search for
     *            <code>Athens, Greece</code>, with the <code>language</code>
     *            parameter set to <code>en</code>. The result found will most
     *            likely be returned as <code>Athens</code>.
     *            </p>
     *            <p>
     *            If you set the <code>language</code> parameter to
     *            <code>el</code>, for Greek, then the result found will more
     *            likely be returned as <code>Αθήνα</code>.
     *            </p>
     *            <p>
     *            If the data provider does not have a value for Greek, the
     *            result will be in a language that the provider does support.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPlaceIndexForTextRequest withLanguage(String language) {
        this.language = language;
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
     * The address, name, city, or region to be used in the search in free-form
     * text format. For example, <code>123 Any Street</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     *
     * @return <p>
     *         The address, name, city, or region to be used in the search in
     *         free-form text format. For example, <code>123 Any Street</code>.
     *         </p>
     */
    public String getText() {
        return text;
    }

    /**
     * <p>
     * The address, name, city, or region to be used in the search in free-form
     * text format. For example, <code>123 Any Street</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     *
     * @param text <p>
     *            The address, name, city, or region to be used in the search in
     *            free-form text format. For example,
     *            <code>123 Any Street</code>.
     *            </p>
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The address, name, city, or region to be used in the search in free-form
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
     *            The address, name, city, or region to be used in the search in
     *            free-form text format. For example,
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
        if (getFilterCategories() != null)
            sb.append("FilterCategories: " + getFilterCategories() + ",");
        if (getFilterCountries() != null)
            sb.append("FilterCountries: " + getFilterCountries() + ",");
        if (getIndexName() != null)
            sb.append("IndexName: " + getIndexName() + ",");
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
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
        hashCode = prime * hashCode + ((getFilterBBox() == null) ? 0 : getFilterBBox().hashCode());
        hashCode = prime * hashCode
                + ((getFilterCategories() == null) ? 0 : getFilterCategories().hashCode());
        hashCode = prime * hashCode
                + ((getFilterCountries() == null) ? 0 : getFilterCountries().hashCode());
        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
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
        if (other.getFilterCategories() == null ^ this.getFilterCategories() == null)
            return false;
        if (other.getFilterCategories() != null
                && other.getFilterCategories().equals(this.getFilterCategories()) == false)
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
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
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
