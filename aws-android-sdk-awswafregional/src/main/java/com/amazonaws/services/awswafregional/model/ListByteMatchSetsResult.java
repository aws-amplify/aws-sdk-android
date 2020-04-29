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

package com.amazonaws.services.awswafregional.model;

import java.io.Serializable;

public class ListByteMatchSetsResult implements Serializable {
    /**
     * <p>
     * If you have more <code>ByteMatchSet</code> objects than the number that
     * you specified for <code>Limit</code> in the request, the response
     * includes a <code>NextMarker</code> value. To list more
     * <code>ByteMatchSet</code> objects, submit another
     * <code>ListByteMatchSets</code> request, and specify the
     * <code>NextMarker</code> value from the response in the
     * <code>NextMarker</code> value in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String nextMarker;

    /**
     * <p>
     * An array of <a>ByteMatchSetSummary</a> objects.
     * </p>
     */
    private java.util.List<ByteMatchSetSummary> byteMatchSets;

    /**
     * <p>
     * If you have more <code>ByteMatchSet</code> objects than the number that
     * you specified for <code>Limit</code> in the request, the response
     * includes a <code>NextMarker</code> value. To list more
     * <code>ByteMatchSet</code> objects, submit another
     * <code>ListByteMatchSets</code> request, and specify the
     * <code>NextMarker</code> value from the response in the
     * <code>NextMarker</code> value in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         If you have more <code>ByteMatchSet</code> objects than the
     *         number that you specified for <code>Limit</code> in the request,
     *         the response includes a <code>NextMarker</code> value. To list
     *         more <code>ByteMatchSet</code> objects, submit another
     *         <code>ListByteMatchSets</code> request, and specify the
     *         <code>NextMarker</code> value from the response in the
     *         <code>NextMarker</code> value in the next request.
     *         </p>
     */
    public String getNextMarker() {
        return nextMarker;
    }

    /**
     * <p>
     * If you have more <code>ByteMatchSet</code> objects than the number that
     * you specified for <code>Limit</code> in the request, the response
     * includes a <code>NextMarker</code> value. To list more
     * <code>ByteMatchSet</code> objects, submit another
     * <code>ListByteMatchSets</code> request, and specify the
     * <code>NextMarker</code> value from the response in the
     * <code>NextMarker</code> value in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param nextMarker <p>
     *            If you have more <code>ByteMatchSet</code> objects than the
     *            number that you specified for <code>Limit</code> in the
     *            request, the response includes a <code>NextMarker</code>
     *            value. To list more <code>ByteMatchSet</code> objects, submit
     *            another <code>ListByteMatchSets</code> request, and specify
     *            the <code>NextMarker</code> value from the response in the
     *            <code>NextMarker</code> value in the next request.
     *            </p>
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * If you have more <code>ByteMatchSet</code> objects than the number that
     * you specified for <code>Limit</code> in the request, the response
     * includes a <code>NextMarker</code> value. To list more
     * <code>ByteMatchSet</code> objects, submit another
     * <code>ListByteMatchSets</code> request, and specify the
     * <code>NextMarker</code> value from the response in the
     * <code>NextMarker</code> value in the next request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param nextMarker <p>
     *            If you have more <code>ByteMatchSet</code> objects than the
     *            number that you specified for <code>Limit</code> in the
     *            request, the response includes a <code>NextMarker</code>
     *            value. To list more <code>ByteMatchSet</code> objects, submit
     *            another <code>ListByteMatchSets</code> request, and specify
     *            the <code>NextMarker</code> value from the response in the
     *            <code>NextMarker</code> value in the next request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListByteMatchSetsResult withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * <p>
     * An array of <a>ByteMatchSetSummary</a> objects.
     * </p>
     *
     * @return <p>
     *         An array of <a>ByteMatchSetSummary</a> objects.
     *         </p>
     */
    public java.util.List<ByteMatchSetSummary> getByteMatchSets() {
        return byteMatchSets;
    }

    /**
     * <p>
     * An array of <a>ByteMatchSetSummary</a> objects.
     * </p>
     *
     * @param byteMatchSets <p>
     *            An array of <a>ByteMatchSetSummary</a> objects.
     *            </p>
     */
    public void setByteMatchSets(java.util.Collection<ByteMatchSetSummary> byteMatchSets) {
        if (byteMatchSets == null) {
            this.byteMatchSets = null;
            return;
        }

        this.byteMatchSets = new java.util.ArrayList<ByteMatchSetSummary>(byteMatchSets);
    }

    /**
     * <p>
     * An array of <a>ByteMatchSetSummary</a> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param byteMatchSets <p>
     *            An array of <a>ByteMatchSetSummary</a> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListByteMatchSetsResult withByteMatchSets(ByteMatchSetSummary... byteMatchSets) {
        if (getByteMatchSets() == null) {
            this.byteMatchSets = new java.util.ArrayList<ByteMatchSetSummary>(byteMatchSets.length);
        }
        for (ByteMatchSetSummary value : byteMatchSets) {
            this.byteMatchSets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <a>ByteMatchSetSummary</a> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param byteMatchSets <p>
     *            An array of <a>ByteMatchSetSummary</a> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListByteMatchSetsResult withByteMatchSets(
            java.util.Collection<ByteMatchSetSummary> byteMatchSets) {
        setByteMatchSets(byteMatchSets);
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
        if (getNextMarker() != null)
            sb.append("NextMarker: " + getNextMarker() + ",");
        if (getByteMatchSets() != null)
            sb.append("ByteMatchSets: " + getByteMatchSets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode
                + ((getByteMatchSets() == null) ? 0 : getByteMatchSets().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListByteMatchSetsResult == false)
            return false;
        ListByteMatchSetsResult other = (ListByteMatchSetsResult) obj;

        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null
                && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getByteMatchSets() == null ^ this.getByteMatchSets() == null)
            return false;
        if (other.getByteMatchSets() != null
                && other.getByteMatchSets().equals(this.getByteMatchSets()) == false)
            return false;
        return true;
    }
}
