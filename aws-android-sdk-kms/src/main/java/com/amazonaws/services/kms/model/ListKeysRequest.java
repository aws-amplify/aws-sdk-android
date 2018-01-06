/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kms.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists the customer master keys.
 * </p>
 */
public class ListKeysRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * When paginating results, specify the maximum number of items to return in
     * the response. If additional items exist beyond the number you specify,
     * the <code>Truncated</code> element in the response is set to true.
     * </p>
     * <p>
     * This value is optional. If you include a value, it must be between 1 and
     * 1000, inclusive. If you do not include a value, it defaults to 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer limit;

    /**
     * <p>
     * Use this parameter only when paginating results and only in a subsequent
     * request after you receive a response with truncated results. Set it to
     * the value of <code>NextMarker</code> from the response you just received.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[ -\u00FF]*<br/>
     */
    private String marker;

    /**
     * <p>
     * When paginating results, specify the maximum number of items to return in
     * the response. If additional items exist beyond the number you specify,
     * the <code>Truncated</code> element in the response is set to true.
     * </p>
     * <p>
     * This value is optional. If you include a value, it must be between 1 and
     * 1000, inclusive. If you do not include a value, it defaults to 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return <p>
     *         When paginating results, specify the maximum number of items to
     *         return in the response. If additional items exist beyond the
     *         number you specify, the <code>Truncated</code> element in the
     *         response is set to true.
     *         </p>
     *         <p>
     *         This value is optional. If you include a value, it must be
     *         between 1 and 1000, inclusive. If you do not include a value, it
     *         defaults to 100.
     *         </p>
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * <p>
     * When paginating results, specify the maximum number of items to return in
     * the response. If additional items exist beyond the number you specify,
     * the <code>Truncated</code> element in the response is set to true.
     * </p>
     * <p>
     * This value is optional. If you include a value, it must be between 1 and
     * 1000, inclusive. If you do not include a value, it defaults to 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param limit <p>
     *            When paginating results, specify the maximum number of items
     *            to return in the response. If additional items exist beyond
     *            the number you specify, the <code>Truncated</code> element in
     *            the response is set to true.
     *            </p>
     *            <p>
     *            This value is optional. If you include a value, it must be
     *            between 1 and 1000, inclusive. If you do not include a value,
     *            it defaults to 100.
     *            </p>
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * When paginating results, specify the maximum number of items to return in
     * the response. If additional items exist beyond the number you specify,
     * the <code>Truncated</code> element in the response is set to true.
     * </p>
     * <p>
     * This value is optional. If you include a value, it must be between 1 and
     * 1000, inclusive. If you do not include a value, it defaults to 100.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param limit <p>
     *            When paginating results, specify the maximum number of items
     *            to return in the response. If additional items exist beyond
     *            the number you specify, the <code>Truncated</code> element in
     *            the response is set to true.
     *            </p>
     *            <p>
     *            This value is optional. If you include a value, it must be
     *            between 1 and 1000, inclusive. If you do not include a value,
     *            it defaults to 100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListKeysRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * <p>
     * Use this parameter only when paginating results and only in a subsequent
     * request after you receive a response with truncated results. Set it to
     * the value of <code>NextMarker</code> from the response you just received.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[ -\u00FF]*<br/>
     *
     * @return <p>
     *         Use this parameter only when paginating results and only in a
     *         subsequent request after you receive a response with truncated
     *         results. Set it to the value of <code>NextMarker</code> from the
     *         response you just received.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * Use this parameter only when paginating results and only in a subsequent
     * request after you receive a response with truncated results. Set it to
     * the value of <code>NextMarker</code> from the response you just received.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[ -\u00FF]*<br/>
     *
     * @param marker <p>
     *            Use this parameter only when paginating results and only in a
     *            subsequent request after you receive a response with truncated
     *            results. Set it to the value of <code>NextMarker</code> from
     *            the response you just received.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Use this parameter only when paginating results and only in a subsequent
     * request after you receive a response with truncated results. Set it to
     * the value of <code>NextMarker</code> from the response you just received.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[ -\u00FF]*<br/>
     *
     * @param marker <p>
     *            Use this parameter only when paginating results and only in a
     *            subsequent request after you receive a response with truncated
     *            results. Set it to the value of <code>NextMarker</code> from
     *            the response you just received.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListKeysRequest withMarker(String marker) {
        this.marker = marker;
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
        if (getLimit() != null)
            sb.append("Limit: " + getLimit() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListKeysRequest == false)
            return false;
        ListKeysRequest other = (ListKeysRequest) obj;

        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }
}
