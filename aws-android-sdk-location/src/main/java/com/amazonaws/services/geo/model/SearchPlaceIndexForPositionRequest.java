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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Reverse geocodes a given coordinate and returns a legible address. Allows you
 * to search for Places or points of interest near a given position.
 * </p>
 */
public class SearchPlaceIndexForPositionRequest extends AmazonWebServiceRequest implements
        Serializable {
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
     * The preferred language used to return results. The value must be a valid
     * <a href="https://tools.ietf.org/search/bcp47">BCP 47</a> language tag,
     * for example, <code>en</code> for English.
     * </p>
     * <p>
     * This setting affects the languages used in the results. It does not
     * change which results are returned. If the language is not specified, or
     * not supported for a particular result, the partner automatically chooses
     * a language for the result.
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
     * Default value: <code>50</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * Specifies the longitude and latitude of the position to query.
     * </p>
     * <p>
     * This parameter must contain a pair of numbers. The first number
     * represents the X coordinate, or longitude; the second number represents
     * the Y coordinate, or latitude.
     * </p>
     * <p>
     * For example, <code>[-123.1174, 49.2847]</code> represents a position with
     * longitude <code>-123.1174</code> and latitude <code>49.2847</code>.
     * </p>
     */
    private java.util.List<Double> position;

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
    public SearchPlaceIndexForPositionRequest withIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * <p>
     * The preferred language used to return results. The value must be a valid
     * <a href="https://tools.ietf.org/search/bcp47">BCP 47</a> language tag,
     * for example, <code>en</code> for English.
     * </p>
     * <p>
     * This setting affects the languages used in the results. It does not
     * change which results are returned. If the language is not specified, or
     * not supported for a particular result, the partner automatically chooses
     * a language for the result.
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
     *         This setting affects the languages used in the results. It does
     *         not change which results are returned. If the language is not
     *         specified, or not supported for a particular result, the partner
     *         automatically chooses a language for the result.
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
     * This setting affects the languages used in the results. It does not
     * change which results are returned. If the language is not specified, or
     * not supported for a particular result, the partner automatically chooses
     * a language for the result.
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
     *            This setting affects the languages used in the results. It
     *            does not change which results are returned. If the language is
     *            not specified, or not supported for a particular result, the
     *            partner automatically chooses a language for the result.
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
     * This setting affects the languages used in the results. It does not
     * change which results are returned. If the language is not specified, or
     * not supported for a particular result, the partner automatically chooses
     * a language for the result.
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
     *            This setting affects the languages used in the results. It
     *            does not change which results are returned. If the language is
     *            not specified, or not supported for a particular result, the
     *            partner automatically chooses a language for the result.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPlaceIndexForPositionRequest withLanguage(String language) {
        this.language = language;
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
    public SearchPlaceIndexForPositionRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * Specifies the longitude and latitude of the position to query.
     * </p>
     * <p>
     * This parameter must contain a pair of numbers. The first number
     * represents the X coordinate, or longitude; the second number represents
     * the Y coordinate, or latitude.
     * </p>
     * <p>
     * For example, <code>[-123.1174, 49.2847]</code> represents a position with
     * longitude <code>-123.1174</code> and latitude <code>49.2847</code>.
     * </p>
     *
     * @return <p>
     *         Specifies the longitude and latitude of the position to query.
     *         </p>
     *         <p>
     *         This parameter must contain a pair of numbers. The first number
     *         represents the X coordinate, or longitude; the second number
     *         represents the Y coordinate, or latitude.
     *         </p>
     *         <p>
     *         For example, <code>[-123.1174, 49.2847]</code> represents a
     *         position with longitude <code>-123.1174</code> and latitude
     *         <code>49.2847</code>.
     *         </p>
     */
    public java.util.List<Double> getPosition() {
        return position;
    }

    /**
     * <p>
     * Specifies the longitude and latitude of the position to query.
     * </p>
     * <p>
     * This parameter must contain a pair of numbers. The first number
     * represents the X coordinate, or longitude; the second number represents
     * the Y coordinate, or latitude.
     * </p>
     * <p>
     * For example, <code>[-123.1174, 49.2847]</code> represents a position with
     * longitude <code>-123.1174</code> and latitude <code>49.2847</code>.
     * </p>
     *
     * @param position <p>
     *            Specifies the longitude and latitude of the position to query.
     *            </p>
     *            <p>
     *            This parameter must contain a pair of numbers. The first
     *            number represents the X coordinate, or longitude; the second
     *            number represents the Y coordinate, or latitude.
     *            </p>
     *            <p>
     *            For example, <code>[-123.1174, 49.2847]</code> represents a
     *            position with longitude <code>-123.1174</code> and latitude
     *            <code>49.2847</code>.
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
     * Specifies the longitude and latitude of the position to query.
     * </p>
     * <p>
     * This parameter must contain a pair of numbers. The first number
     * represents the X coordinate, or longitude; the second number represents
     * the Y coordinate, or latitude.
     * </p>
     * <p>
     * For example, <code>[-123.1174, 49.2847]</code> represents a position with
     * longitude <code>-123.1174</code> and latitude <code>49.2847</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param position <p>
     *            Specifies the longitude and latitude of the position to query.
     *            </p>
     *            <p>
     *            This parameter must contain a pair of numbers. The first
     *            number represents the X coordinate, or longitude; the second
     *            number represents the Y coordinate, or latitude.
     *            </p>
     *            <p>
     *            For example, <code>[-123.1174, 49.2847]</code> represents a
     *            position with longitude <code>-123.1174</code> and latitude
     *            <code>49.2847</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPlaceIndexForPositionRequest withPosition(Double... position) {
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
     * Specifies the longitude and latitude of the position to query.
     * </p>
     * <p>
     * This parameter must contain a pair of numbers. The first number
     * represents the X coordinate, or longitude; the second number represents
     * the Y coordinate, or latitude.
     * </p>
     * <p>
     * For example, <code>[-123.1174, 49.2847]</code> represents a position with
     * longitude <code>-123.1174</code> and latitude <code>49.2847</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param position <p>
     *            Specifies the longitude and latitude of the position to query.
     *            </p>
     *            <p>
     *            This parameter must contain a pair of numbers. The first
     *            number represents the X coordinate, or longitude; the second
     *            number represents the Y coordinate, or latitude.
     *            </p>
     *            <p>
     *            For example, <code>[-123.1174, 49.2847]</code> represents a
     *            position with longitude <code>-123.1174</code> and latitude
     *            <code>49.2847</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPlaceIndexForPositionRequest withPosition(java.util.Collection<Double> position) {
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
        if (getIndexName() != null)
            sb.append("IndexName: " + getIndexName() + ",");
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

        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
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

        if (obj instanceof SearchPlaceIndexForPositionRequest == false)
            return false;
        SearchPlaceIndexForPositionRequest other = (SearchPlaceIndexForPositionRequest) obj;

        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null
                && other.getIndexName().equals(this.getIndexName()) == false)
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
