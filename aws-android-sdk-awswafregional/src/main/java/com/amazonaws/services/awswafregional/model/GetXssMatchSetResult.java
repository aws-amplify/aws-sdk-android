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
 * The response to a <a>GetXssMatchSet</a> request.
 * </p>
 */
public class GetXssMatchSetResult implements Serializable {
    /**
     * <p>
     * Information about the <a>XssMatchSet</a> that you specified in the
     * <code>GetXssMatchSet</code> request. For more information, see the
     * following topics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>XssMatchSet</a>: Contains <code>Name</code>,
     * <code>XssMatchSetId</code>, and an array of <code>XssMatchTuple</code>
     * objects
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>XssMatchTuple</a>: Each <code>XssMatchTuple</code> object contains
     * <code>FieldToMatch</code> and <code>TextTransformation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </p>
     * </li>
     * </ul>
     */
    private XssMatchSet xssMatchSet;

    /**
     * <p>
     * Information about the <a>XssMatchSet</a> that you specified in the
     * <code>GetXssMatchSet</code> request. For more information, see the
     * following topics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>XssMatchSet</a>: Contains <code>Name</code>,
     * <code>XssMatchSetId</code>, and an array of <code>XssMatchTuple</code>
     * objects
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>XssMatchTuple</a>: Each <code>XssMatchTuple</code> object contains
     * <code>FieldToMatch</code> and <code>TextTransformation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Information about the <a>XssMatchSet</a> that you specified in
     *         the <code>GetXssMatchSet</code> request. For more information,
     *         see the following topics:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a>XssMatchSet</a>: Contains <code>Name</code>,
     *         <code>XssMatchSetId</code>, and an array of
     *         <code>XssMatchTuple</code> objects
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a>XssMatchTuple</a>: Each <code>XssMatchTuple</code> object
     *         contains <code>FieldToMatch</code> and
     *         <code>TextTransformation</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a>FieldToMatch</a>: Contains <code>Data</code> and
     *         <code>Type</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public XssMatchSet getXssMatchSet() {
        return xssMatchSet;
    }

    /**
     * <p>
     * Information about the <a>XssMatchSet</a> that you specified in the
     * <code>GetXssMatchSet</code> request. For more information, see the
     * following topics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>XssMatchSet</a>: Contains <code>Name</code>,
     * <code>XssMatchSetId</code>, and an array of <code>XssMatchTuple</code>
     * objects
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>XssMatchTuple</a>: Each <code>XssMatchTuple</code> object contains
     * <code>FieldToMatch</code> and <code>TextTransformation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </p>
     * </li>
     * </ul>
     *
     * @param xssMatchSet <p>
     *            Information about the <a>XssMatchSet</a> that you specified in
     *            the <code>GetXssMatchSet</code> request. For more information,
     *            see the following topics:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>XssMatchSet</a>: Contains <code>Name</code>,
     *            <code>XssMatchSetId</code>, and an array of
     *            <code>XssMatchTuple</code> objects
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>XssMatchTuple</a>: Each <code>XssMatchTuple</code> object
     *            contains <code>FieldToMatch</code> and
     *            <code>TextTransformation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>FieldToMatch</a>: Contains <code>Data</code> and
     *            <code>Type</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setXssMatchSet(XssMatchSet xssMatchSet) {
        this.xssMatchSet = xssMatchSet;
    }

    /**
     * <p>
     * Information about the <a>XssMatchSet</a> that you specified in the
     * <code>GetXssMatchSet</code> request. For more information, see the
     * following topics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>XssMatchSet</a>: Contains <code>Name</code>,
     * <code>XssMatchSetId</code>, and an array of <code>XssMatchTuple</code>
     * objects
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>XssMatchTuple</a>: Each <code>XssMatchTuple</code> object contains
     * <code>FieldToMatch</code> and <code>TextTransformation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param xssMatchSet <p>
     *            Information about the <a>XssMatchSet</a> that you specified in
     *            the <code>GetXssMatchSet</code> request. For more information,
     *            see the following topics:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>XssMatchSet</a>: Contains <code>Name</code>,
     *            <code>XssMatchSetId</code>, and an array of
     *            <code>XssMatchTuple</code> objects
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>XssMatchTuple</a>: Each <code>XssMatchTuple</code> object
     *            contains <code>FieldToMatch</code> and
     *            <code>TextTransformation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>FieldToMatch</a>: Contains <code>Data</code> and
     *            <code>Type</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetXssMatchSetResult withXssMatchSet(XssMatchSet xssMatchSet) {
        this.xssMatchSet = xssMatchSet;
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
        if (getXssMatchSet() != null)
            sb.append("XssMatchSet: " + getXssMatchSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getXssMatchSet() == null) ? 0 : getXssMatchSet().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetXssMatchSetResult == false)
            return false;
        GetXssMatchSetResult other = (GetXssMatchSetResult) obj;

        if (other.getXssMatchSet() == null ^ this.getXssMatchSet() == null)
            return false;
        if (other.getXssMatchSet() != null
                && other.getXssMatchSet().equals(this.getXssMatchSet()) == false)
            return false;
        return true;
    }
}
