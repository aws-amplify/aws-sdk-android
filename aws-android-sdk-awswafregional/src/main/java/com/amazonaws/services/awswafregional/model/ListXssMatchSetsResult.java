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

/**
 * <p>
 * The response to a <a>ListXssMatchSets</a> request.
 * </p>
 */
public class ListXssMatchSetsResult implements Serializable {
    /**
     * <p>
     * If you have more <a>XssMatchSet</a> objects than the number that you
     * specified for <code>Limit</code> in the request, the response includes a
     * <code>NextMarker</code> value. To list more <code>XssMatchSet</code>
     * objects, submit another <code>ListXssMatchSets</code> request, and
     * specify the <code>NextMarker</code> value from the response in the
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
     * An array of <a>XssMatchSetSummary</a> objects.
     * </p>
     */
    private java.util.List<XssMatchSetSummary> xssMatchSets;

    /**
     * <p>
     * If you have more <a>XssMatchSet</a> objects than the number that you
     * specified for <code>Limit</code> in the request, the response includes a
     * <code>NextMarker</code> value. To list more <code>XssMatchSet</code>
     * objects, submit another <code>ListXssMatchSets</code> request, and
     * specify the <code>NextMarker</code> value from the response in the
     * <code>NextMarker</code> value in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         If you have more <a>XssMatchSet</a> objects than the number that
     *         you specified for <code>Limit</code> in the request, the response
     *         includes a <code>NextMarker</code> value. To list more
     *         <code>XssMatchSet</code> objects, submit another
     *         <code>ListXssMatchSets</code> request, and specify the
     *         <code>NextMarker</code> value from the response in the
     *         <code>NextMarker</code> value in the next request.
     *         </p>
     */
    public String getNextMarker() {
        return nextMarker;
    }

    /**
     * <p>
     * If you have more <a>XssMatchSet</a> objects than the number that you
     * specified for <code>Limit</code> in the request, the response includes a
     * <code>NextMarker</code> value. To list more <code>XssMatchSet</code>
     * objects, submit another <code>ListXssMatchSets</code> request, and
     * specify the <code>NextMarker</code> value from the response in the
     * <code>NextMarker</code> value in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param nextMarker <p>
     *            If you have more <a>XssMatchSet</a> objects than the number
     *            that you specified for <code>Limit</code> in the request, the
     *            response includes a <code>NextMarker</code> value. To list
     *            more <code>XssMatchSet</code> objects, submit another
     *            <code>ListXssMatchSets</code> request, and specify the
     *            <code>NextMarker</code> value from the response in the
     *            <code>NextMarker</code> value in the next request.
     *            </p>
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * If you have more <a>XssMatchSet</a> objects than the number that you
     * specified for <code>Limit</code> in the request, the response includes a
     * <code>NextMarker</code> value. To list more <code>XssMatchSet</code>
     * objects, submit another <code>ListXssMatchSets</code> request, and
     * specify the <code>NextMarker</code> value from the response in the
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
     *            If you have more <a>XssMatchSet</a> objects than the number
     *            that you specified for <code>Limit</code> in the request, the
     *            response includes a <code>NextMarker</code> value. To list
     *            more <code>XssMatchSet</code> objects, submit another
     *            <code>ListXssMatchSets</code> request, and specify the
     *            <code>NextMarker</code> value from the response in the
     *            <code>NextMarker</code> value in the next request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListXssMatchSetsResult withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * <p>
     * An array of <a>XssMatchSetSummary</a> objects.
     * </p>
     *
     * @return <p>
     *         An array of <a>XssMatchSetSummary</a> objects.
     *         </p>
     */
    public java.util.List<XssMatchSetSummary> getXssMatchSets() {
        return xssMatchSets;
    }

    /**
     * <p>
     * An array of <a>XssMatchSetSummary</a> objects.
     * </p>
     *
     * @param xssMatchSets <p>
     *            An array of <a>XssMatchSetSummary</a> objects.
     *            </p>
     */
    public void setXssMatchSets(java.util.Collection<XssMatchSetSummary> xssMatchSets) {
        if (xssMatchSets == null) {
            this.xssMatchSets = null;
            return;
        }

        this.xssMatchSets = new java.util.ArrayList<XssMatchSetSummary>(xssMatchSets);
    }

    /**
     * <p>
     * An array of <a>XssMatchSetSummary</a> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param xssMatchSets <p>
     *            An array of <a>XssMatchSetSummary</a> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListXssMatchSetsResult withXssMatchSets(XssMatchSetSummary... xssMatchSets) {
        if (getXssMatchSets() == null) {
            this.xssMatchSets = new java.util.ArrayList<XssMatchSetSummary>(xssMatchSets.length);
        }
        for (XssMatchSetSummary value : xssMatchSets) {
            this.xssMatchSets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <a>XssMatchSetSummary</a> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param xssMatchSets <p>
     *            An array of <a>XssMatchSetSummary</a> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListXssMatchSetsResult withXssMatchSets(
            java.util.Collection<XssMatchSetSummary> xssMatchSets) {
        setXssMatchSets(xssMatchSets);
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
        if (getXssMatchSets() != null)
            sb.append("XssMatchSets: " + getXssMatchSets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode
                + ((getXssMatchSets() == null) ? 0 : getXssMatchSets().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListXssMatchSetsResult == false)
            return false;
        ListXssMatchSetsResult other = (ListXssMatchSetsResult) obj;

        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null
                && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getXssMatchSets() == null ^ this.getXssMatchSets() == null)
            return false;
        if (other.getXssMatchSets() != null
                && other.getXssMatchSets().equals(this.getXssMatchSets()) == false)
            return false;
        return true;
    }
}
