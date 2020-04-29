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

public class GetByteMatchSetResult implements Serializable {
    /**
     * <p>
     * Information about the <a>ByteMatchSet</a> that you specified in the
     * <code>GetByteMatchSet</code> request. For more information, see the
     * following topics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ByteMatchSet</a>: Contains <code>ByteMatchSetId</code>,
     * <code>ByteMatchTuples</code>, and <code>Name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ByteMatchTuples</code>: Contains an array of <a>ByteMatchTuple</a>
     * objects. Each <code>ByteMatchTuple</code> object contains
     * <a>FieldToMatch</a>, <code>PositionalConstraint</code>,
     * <code>TargetString</code>, and <code>TextTransformation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </p>
     * </li>
     * </ul>
     */
    private ByteMatchSet byteMatchSet;

    /**
     * <p>
     * Information about the <a>ByteMatchSet</a> that you specified in the
     * <code>GetByteMatchSet</code> request. For more information, see the
     * following topics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ByteMatchSet</a>: Contains <code>ByteMatchSetId</code>,
     * <code>ByteMatchTuples</code>, and <code>Name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ByteMatchTuples</code>: Contains an array of <a>ByteMatchTuple</a>
     * objects. Each <code>ByteMatchTuple</code> object contains
     * <a>FieldToMatch</a>, <code>PositionalConstraint</code>,
     * <code>TargetString</code>, and <code>TextTransformation</code>
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
     *         Information about the <a>ByteMatchSet</a> that you specified in
     *         the <code>GetByteMatchSet</code> request. For more information,
     *         see the following topics:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a>ByteMatchSet</a>: Contains <code>ByteMatchSetId</code>,
     *         <code>ByteMatchTuples</code>, and <code>Name</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ByteMatchTuples</code>: Contains an array of
     *         <a>ByteMatchTuple</a> objects. Each <code>ByteMatchTuple</code>
     *         object contains <a>FieldToMatch</a>,
     *         <code>PositionalConstraint</code>, <code>TargetString</code>, and
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
    public ByteMatchSet getByteMatchSet() {
        return byteMatchSet;
    }

    /**
     * <p>
     * Information about the <a>ByteMatchSet</a> that you specified in the
     * <code>GetByteMatchSet</code> request. For more information, see the
     * following topics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ByteMatchSet</a>: Contains <code>ByteMatchSetId</code>,
     * <code>ByteMatchTuples</code>, and <code>Name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ByteMatchTuples</code>: Contains an array of <a>ByteMatchTuple</a>
     * objects. Each <code>ByteMatchTuple</code> object contains
     * <a>FieldToMatch</a>, <code>PositionalConstraint</code>,
     * <code>TargetString</code>, and <code>TextTransformation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </p>
     * </li>
     * </ul>
     *
     * @param byteMatchSet <p>
     *            Information about the <a>ByteMatchSet</a> that you specified
     *            in the <code>GetByteMatchSet</code> request. For more
     *            information, see the following topics:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>ByteMatchSet</a>: Contains <code>ByteMatchSetId</code>,
     *            <code>ByteMatchTuples</code>, and <code>Name</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ByteMatchTuples</code>: Contains an array of
     *            <a>ByteMatchTuple</a> objects. Each
     *            <code>ByteMatchTuple</code> object contains
     *            <a>FieldToMatch</a>, <code>PositionalConstraint</code>,
     *            <code>TargetString</code>, and <code>TextTransformation</code>
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
    public void setByteMatchSet(ByteMatchSet byteMatchSet) {
        this.byteMatchSet = byteMatchSet;
    }

    /**
     * <p>
     * Information about the <a>ByteMatchSet</a> that you specified in the
     * <code>GetByteMatchSet</code> request. For more information, see the
     * following topics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ByteMatchSet</a>: Contains <code>ByteMatchSetId</code>,
     * <code>ByteMatchTuples</code>, and <code>Name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ByteMatchTuples</code>: Contains an array of <a>ByteMatchTuple</a>
     * objects. Each <code>ByteMatchTuple</code> object contains
     * <a>FieldToMatch</a>, <code>PositionalConstraint</code>,
     * <code>TargetString</code>, and <code>TextTransformation</code>
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
     * @param byteMatchSet <p>
     *            Information about the <a>ByteMatchSet</a> that you specified
     *            in the <code>GetByteMatchSet</code> request. For more
     *            information, see the following topics:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>ByteMatchSet</a>: Contains <code>ByteMatchSetId</code>,
     *            <code>ByteMatchTuples</code>, and <code>Name</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ByteMatchTuples</code>: Contains an array of
     *            <a>ByteMatchTuple</a> objects. Each
     *            <code>ByteMatchTuple</code> object contains
     *            <a>FieldToMatch</a>, <code>PositionalConstraint</code>,
     *            <code>TargetString</code>, and <code>TextTransformation</code>
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
    public GetByteMatchSetResult withByteMatchSet(ByteMatchSet byteMatchSet) {
        this.byteMatchSet = byteMatchSet;
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
        if (getByteMatchSet() != null)
            sb.append("ByteMatchSet: " + getByteMatchSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getByteMatchSet() == null) ? 0 : getByteMatchSet().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetByteMatchSetResult == false)
            return false;
        GetByteMatchSetResult other = (GetByteMatchSetResult) obj;

        if (other.getByteMatchSet() == null ^ this.getByteMatchSet() == null)
            return false;
        if (other.getByteMatchSet() != null
                && other.getByteMatchSet().equals(this.getByteMatchSet()) == false)
            return false;
        return true;
    }
}
