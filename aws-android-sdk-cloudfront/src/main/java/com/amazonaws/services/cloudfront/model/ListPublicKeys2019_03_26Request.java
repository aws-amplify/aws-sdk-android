/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * List all public keys that have been added to CloudFront for this account.
 * </p>
 */
public class ListPublicKeys2019_03_26Request extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Use this when paginating results to indicate where to begin in your list
     * of public keys. The results include public keys in the list that occur
     * after the marker. To get the next page of results, set the
     * <code>Marker</code> to the value of the <code>NextMarker</code> from the
     * current page's response (which is also the ID of the last public key on
     * that page).
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The maximum number of public keys you want in the response body.
     * </p>
     */
    private String maxItems;

    /**
     * <p>
     * Use this when paginating results to indicate where to begin in your list
     * of public keys. The results include public keys in the list that occur
     * after the marker. To get the next page of results, set the
     * <code>Marker</code> to the value of the <code>NextMarker</code> from the
     * current page's response (which is also the ID of the last public key on
     * that page).
     * </p>
     *
     * @return <p>
     *         Use this when paginating results to indicate where to begin in
     *         your list of public keys. The results include public keys in the
     *         list that occur after the marker. To get the next page of
     *         results, set the <code>Marker</code> to the value of the
     *         <code>NextMarker</code> from the current page's response (which
     *         is also the ID of the last public key on that page).
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * Use this when paginating results to indicate where to begin in your list
     * of public keys. The results include public keys in the list that occur
     * after the marker. To get the next page of results, set the
     * <code>Marker</code> to the value of the <code>NextMarker</code> from the
     * current page's response (which is also the ID of the last public key on
     * that page).
     * </p>
     *
     * @param marker <p>
     *            Use this when paginating results to indicate where to begin in
     *            your list of public keys. The results include public keys in
     *            the list that occur after the marker. To get the next page of
     *            results, set the <code>Marker</code> to the value of the
     *            <code>NextMarker</code> from the current page's response
     *            (which is also the ID of the last public key on that page).
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Use this when paginating results to indicate where to begin in your list
     * of public keys. The results include public keys in the list that occur
     * after the marker. To get the next page of results, set the
     * <code>Marker</code> to the value of the <code>NextMarker</code> from the
     * current page's response (which is also the ID of the last public key on
     * that page).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            Use this when paginating results to indicate where to begin in
     *            your list of public keys. The results include public keys in
     *            the list that occur after the marker. To get the next page of
     *            results, set the <code>Marker</code> to the value of the
     *            <code>NextMarker</code> from the current page's response
     *            (which is also the ID of the last public key on that page).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPublicKeys2019_03_26Request withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * The maximum number of public keys you want in the response body.
     * </p>
     *
     * @return <p>
     *         The maximum number of public keys you want in the response body.
     *         </p>
     */
    public String getMaxItems() {
        return maxItems;
    }

    /**
     * <p>
     * The maximum number of public keys you want in the response body.
     * </p>
     *
     * @param maxItems <p>
     *            The maximum number of public keys you want in the response
     *            body.
     *            </p>
     */
    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The maximum number of public keys you want in the response body.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxItems <p>
     *            The maximum number of public keys you want in the response
     *            body.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPublicKeys2019_03_26Request withMaxItems(String maxItems) {
        this.maxItems = maxItems;
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
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getMaxItems() != null)
            sb.append("MaxItems: " + getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPublicKeys2019_03_26Request == false)
            return false;
        ListPublicKeys2019_03_26Request other = (ListPublicKeys2019_03_26Request) obj;

        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }
}
