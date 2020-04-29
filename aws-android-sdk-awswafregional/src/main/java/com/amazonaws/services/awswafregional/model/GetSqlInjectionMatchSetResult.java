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
 * The response to a <a>GetSqlInjectionMatchSet</a> request.
 * </p>
 */
public class GetSqlInjectionMatchSetResult implements Serializable {
    /**
     * <p>
     * Information about the <a>SqlInjectionMatchSet</a> that you specified in
     * the <code>GetSqlInjectionMatchSet</code> request. For more information,
     * see the following topics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>SqlInjectionMatchSet</a>: Contains <code>Name</code>,
     * <code>SqlInjectionMatchSetId</code>, and an array of
     * <code>SqlInjectionMatchTuple</code> objects
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SqlInjectionMatchTuple</a>: Each <code>SqlInjectionMatchTuple</code>
     * object contains <code>FieldToMatch</code> and
     * <code>TextTransformation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </p>
     * </li>
     * </ul>
     */
    private SqlInjectionMatchSet sqlInjectionMatchSet;

    /**
     * <p>
     * Information about the <a>SqlInjectionMatchSet</a> that you specified in
     * the <code>GetSqlInjectionMatchSet</code> request. For more information,
     * see the following topics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>SqlInjectionMatchSet</a>: Contains <code>Name</code>,
     * <code>SqlInjectionMatchSetId</code>, and an array of
     * <code>SqlInjectionMatchTuple</code> objects
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SqlInjectionMatchTuple</a>: Each <code>SqlInjectionMatchTuple</code>
     * object contains <code>FieldToMatch</code> and
     * <code>TextTransformation</code>
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
     *         Information about the <a>SqlInjectionMatchSet</a> that you
     *         specified in the <code>GetSqlInjectionMatchSet</code> request.
     *         For more information, see the following topics:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a>SqlInjectionMatchSet</a>: Contains <code>Name</code>,
     *         <code>SqlInjectionMatchSetId</code>, and an array of
     *         <code>SqlInjectionMatchTuple</code> objects
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a>SqlInjectionMatchTuple</a>: Each
     *         <code>SqlInjectionMatchTuple</code> object contains
     *         <code>FieldToMatch</code> and <code>TextTransformation</code>
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
    public SqlInjectionMatchSet getSqlInjectionMatchSet() {
        return sqlInjectionMatchSet;
    }

    /**
     * <p>
     * Information about the <a>SqlInjectionMatchSet</a> that you specified in
     * the <code>GetSqlInjectionMatchSet</code> request. For more information,
     * see the following topics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>SqlInjectionMatchSet</a>: Contains <code>Name</code>,
     * <code>SqlInjectionMatchSetId</code>, and an array of
     * <code>SqlInjectionMatchTuple</code> objects
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SqlInjectionMatchTuple</a>: Each <code>SqlInjectionMatchTuple</code>
     * object contains <code>FieldToMatch</code> and
     * <code>TextTransformation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </p>
     * </li>
     * </ul>
     *
     * @param sqlInjectionMatchSet <p>
     *            Information about the <a>SqlInjectionMatchSet</a> that you
     *            specified in the <code>GetSqlInjectionMatchSet</code> request.
     *            For more information, see the following topics:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>SqlInjectionMatchSet</a>: Contains <code>Name</code>,
     *            <code>SqlInjectionMatchSetId</code>, and an array of
     *            <code>SqlInjectionMatchTuple</code> objects
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>SqlInjectionMatchTuple</a>: Each
     *            <code>SqlInjectionMatchTuple</code> object contains
     *            <code>FieldToMatch</code> and <code>TextTransformation</code>
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
    public void setSqlInjectionMatchSet(SqlInjectionMatchSet sqlInjectionMatchSet) {
        this.sqlInjectionMatchSet = sqlInjectionMatchSet;
    }

    /**
     * <p>
     * Information about the <a>SqlInjectionMatchSet</a> that you specified in
     * the <code>GetSqlInjectionMatchSet</code> request. For more information,
     * see the following topics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>SqlInjectionMatchSet</a>: Contains <code>Name</code>,
     * <code>SqlInjectionMatchSetId</code>, and an array of
     * <code>SqlInjectionMatchTuple</code> objects
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SqlInjectionMatchTuple</a>: Each <code>SqlInjectionMatchTuple</code>
     * object contains <code>FieldToMatch</code> and
     * <code>TextTransformation</code>
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
     * @param sqlInjectionMatchSet <p>
     *            Information about the <a>SqlInjectionMatchSet</a> that you
     *            specified in the <code>GetSqlInjectionMatchSet</code> request.
     *            For more information, see the following topics:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>SqlInjectionMatchSet</a>: Contains <code>Name</code>,
     *            <code>SqlInjectionMatchSetId</code>, and an array of
     *            <code>SqlInjectionMatchTuple</code> objects
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>SqlInjectionMatchTuple</a>: Each
     *            <code>SqlInjectionMatchTuple</code> object contains
     *            <code>FieldToMatch</code> and <code>TextTransformation</code>
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
    public GetSqlInjectionMatchSetResult withSqlInjectionMatchSet(
            SqlInjectionMatchSet sqlInjectionMatchSet) {
        this.sqlInjectionMatchSet = sqlInjectionMatchSet;
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
        if (getSqlInjectionMatchSet() != null)
            sb.append("SqlInjectionMatchSet: " + getSqlInjectionMatchSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSqlInjectionMatchSet() == null) ? 0 : getSqlInjectionMatchSet().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSqlInjectionMatchSetResult == false)
            return false;
        GetSqlInjectionMatchSetResult other = (GetSqlInjectionMatchSetResult) obj;

        if (other.getSqlInjectionMatchSet() == null ^ this.getSqlInjectionMatchSet() == null)
            return false;
        if (other.getSqlInjectionMatchSet() != null
                && other.getSqlInjectionMatchSet().equals(this.getSqlInjectionMatchSet()) == false)
            return false;
        return true;
    }
}
