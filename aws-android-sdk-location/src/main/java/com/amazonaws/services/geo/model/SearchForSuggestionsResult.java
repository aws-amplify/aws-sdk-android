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

/**
 * <p>
 * Contains a place suggestion resulting from a place suggestion query that is
 * run on a place index resource.
 * </p>
 */
public class SearchForSuggestionsResult implements Serializable {
    /**
     * <p>
     * The unique identifier of the place. You can use this with the
     * <code>GetPlace</code> operation to find the place again later.
     * </p>
     * <note>
     * <p>
     * For <code>SearchPlaceIndexForSuggestions</code> operations, the
     * <code>PlaceId</code> is returned by place indexes that use Esri, Grab, or
     * HERE as data providers.
     * </p>
     * </note>
     */
    private String placeId;

    /**
     * <p>
     * The text of the place suggestion, typically formatted as an address
     * string.
     * </p>
     */
    private String text;

    /**
     * <p>
     * The unique identifier of the place. You can use this with the
     * <code>GetPlace</code> operation to find the place again later.
     * </p>
     * <note>
     * <p>
     * For <code>SearchPlaceIndexForSuggestions</code> operations, the
     * <code>PlaceId</code> is returned by place indexes that use Esri, Grab, or
     * HERE as data providers.
     * </p>
     * </note>
     *
     * @return <p>
     *         The unique identifier of the place. You can use this with the
     *         <code>GetPlace</code> operation to find the place again later.
     *         </p>
     *         <note>
     *         <p>
     *         For <code>SearchPlaceIndexForSuggestions</code> operations, the
     *         <code>PlaceId</code> is returned by place indexes that use Esri,
     *         Grab, or HERE as data providers.
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
     * For <code>SearchPlaceIndexForSuggestions</code> operations, the
     * <code>PlaceId</code> is returned by place indexes that use Esri, Grab, or
     * HERE as data providers.
     * </p>
     * </note>
     *
     * @param placeId <p>
     *            The unique identifier of the place. You can use this with the
     *            <code>GetPlace</code> operation to find the place again later.
     *            </p>
     *            <note>
     *            <p>
     *            For <code>SearchPlaceIndexForSuggestions</code> operations,
     *            the <code>PlaceId</code> is returned by place indexes that use
     *            Esri, Grab, or HERE as data providers.
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
     * For <code>SearchPlaceIndexForSuggestions</code> operations, the
     * <code>PlaceId</code> is returned by place indexes that use Esri, Grab, or
     * HERE as data providers.
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
     *            For <code>SearchPlaceIndexForSuggestions</code> operations,
     *            the <code>PlaceId</code> is returned by place indexes that use
     *            Esri, Grab, or HERE as data providers.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchForSuggestionsResult withPlaceId(String placeId) {
        this.placeId = placeId;
        return this;
    }

    /**
     * <p>
     * The text of the place suggestion, typically formatted as an address
     * string.
     * </p>
     *
     * @return <p>
     *         The text of the place suggestion, typically formatted as an
     *         address string.
     *         </p>
     */
    public String getText() {
        return text;
    }

    /**
     * <p>
     * The text of the place suggestion, typically formatted as an address
     * string.
     * </p>
     *
     * @param text <p>
     *            The text of the place suggestion, typically formatted as an
     *            address string.
     *            </p>
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The text of the place suggestion, typically formatted as an address
     * string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param text <p>
     *            The text of the place suggestion, typically formatted as an
     *            address string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchForSuggestionsResult withText(String text) {
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
        if (getPlaceId() != null)
            sb.append("PlaceId: " + getPlaceId() + ",");
        if (getText() != null)
            sb.append("Text: " + getText());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPlaceId() == null) ? 0 : getPlaceId().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchForSuggestionsResult == false)
            return false;
        SearchForSuggestionsResult other = (SearchForSuggestionsResult) obj;

        if (other.getPlaceId() == null ^ this.getPlaceId() == null)
            return false;
        if (other.getPlaceId() != null && other.getPlaceId().equals(this.getPlaceId()) == false)
            return false;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        return true;
    }
}
