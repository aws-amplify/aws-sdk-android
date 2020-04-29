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
 * <note>
 * <p>
 * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
 * href=
 * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
 * >AWS WAF Classic</a> in the developer guide.
 * </p>
 * <p>
 * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the
 * <a href=
 * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS
 * WAF Developer Guide</a>. With the latest version, AWS WAF has a single set of
 * endpoints for regional and global use.
 * </p>
 * </note>
 * <p>
 * A complex type that contains <code>SqlInjectionMatchTuple</code> objects,
 * which specify the parts of web requests that you want AWS WAF to inspect for
 * snippets of malicious SQL code and, if you want AWS WAF to inspect a header,
 * the name of the header. If a <code>SqlInjectionMatchSet</code> contains more
 * than one <code>SqlInjectionMatchTuple</code> object, a request needs to
 * include snippets of SQL code in only one of the specified parts of the
 * request to be considered a match.
 * </p>
 */
public class SqlInjectionMatchSet implements Serializable {
    /**
     * <p>
     * A unique identifier for a <code>SqlInjectionMatchSet</code>. You use
     * <code>SqlInjectionMatchSetId</code> to get information about a
     * <code>SqlInjectionMatchSet</code> (see <a>GetSqlInjectionMatchSet</a>),
     * update a <code>SqlInjectionMatchSet</code> (see
     * <a>UpdateSqlInjectionMatchSet</a>), insert a
     * <code>SqlInjectionMatchSet</code> into a <code>Rule</code> or delete one
     * from a <code>Rule</code> (see <a>UpdateRule</a>), and delete a
     * <code>SqlInjectionMatchSet</code> from AWS WAF (see
     * <a>DeleteSqlInjectionMatchSet</a>).
     * </p>
     * <p>
     * <code>SqlInjectionMatchSetId</code> is returned by
     * <a>CreateSqlInjectionMatchSet</a> and by
     * <a>ListSqlInjectionMatchSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String sqlInjectionMatchSetId;

    /**
     * <p>
     * The name, if any, of the <code>SqlInjectionMatchSet</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String name;

    /**
     * <p>
     * Specifies the parts of web requests that you want to inspect for snippets
     * of malicious SQL code.
     * </p>
     */
    private java.util.List<SqlInjectionMatchTuple> sqlInjectionMatchTuples;

    /**
     * <p>
     * A unique identifier for a <code>SqlInjectionMatchSet</code>. You use
     * <code>SqlInjectionMatchSetId</code> to get information about a
     * <code>SqlInjectionMatchSet</code> (see <a>GetSqlInjectionMatchSet</a>),
     * update a <code>SqlInjectionMatchSet</code> (see
     * <a>UpdateSqlInjectionMatchSet</a>), insert a
     * <code>SqlInjectionMatchSet</code> into a <code>Rule</code> or delete one
     * from a <code>Rule</code> (see <a>UpdateRule</a>), and delete a
     * <code>SqlInjectionMatchSet</code> from AWS WAF (see
     * <a>DeleteSqlInjectionMatchSet</a>).
     * </p>
     * <p>
     * <code>SqlInjectionMatchSetId</code> is returned by
     * <a>CreateSqlInjectionMatchSet</a> and by
     * <a>ListSqlInjectionMatchSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         A unique identifier for a <code>SqlInjectionMatchSet</code>. You
     *         use <code>SqlInjectionMatchSetId</code> to get information about
     *         a <code>SqlInjectionMatchSet</code> (see
     *         <a>GetSqlInjectionMatchSet</a>), update a
     *         <code>SqlInjectionMatchSet</code> (see
     *         <a>UpdateSqlInjectionMatchSet</a>), insert a
     *         <code>SqlInjectionMatchSet</code> into a <code>Rule</code> or
     *         delete one from a <code>Rule</code> (see <a>UpdateRule</a>), and
     *         delete a <code>SqlInjectionMatchSet</code> from AWS WAF (see
     *         <a>DeleteSqlInjectionMatchSet</a>).
     *         </p>
     *         <p>
     *         <code>SqlInjectionMatchSetId</code> is returned by
     *         <a>CreateSqlInjectionMatchSet</a> and by
     *         <a>ListSqlInjectionMatchSets</a>.
     *         </p>
     */
    public String getSqlInjectionMatchSetId() {
        return sqlInjectionMatchSetId;
    }

    /**
     * <p>
     * A unique identifier for a <code>SqlInjectionMatchSet</code>. You use
     * <code>SqlInjectionMatchSetId</code> to get information about a
     * <code>SqlInjectionMatchSet</code> (see <a>GetSqlInjectionMatchSet</a>),
     * update a <code>SqlInjectionMatchSet</code> (see
     * <a>UpdateSqlInjectionMatchSet</a>), insert a
     * <code>SqlInjectionMatchSet</code> into a <code>Rule</code> or delete one
     * from a <code>Rule</code> (see <a>UpdateRule</a>), and delete a
     * <code>SqlInjectionMatchSet</code> from AWS WAF (see
     * <a>DeleteSqlInjectionMatchSet</a>).
     * </p>
     * <p>
     * <code>SqlInjectionMatchSetId</code> is returned by
     * <a>CreateSqlInjectionMatchSet</a> and by
     * <a>ListSqlInjectionMatchSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param sqlInjectionMatchSetId <p>
     *            A unique identifier for a <code>SqlInjectionMatchSet</code>.
     *            You use <code>SqlInjectionMatchSetId</code> to get information
     *            about a <code>SqlInjectionMatchSet</code> (see
     *            <a>GetSqlInjectionMatchSet</a>), update a
     *            <code>SqlInjectionMatchSet</code> (see
     *            <a>UpdateSqlInjectionMatchSet</a>), insert a
     *            <code>SqlInjectionMatchSet</code> into a <code>Rule</code> or
     *            delete one from a <code>Rule</code> (see <a>UpdateRule</a>),
     *            and delete a <code>SqlInjectionMatchSet</code> from AWS WAF
     *            (see <a>DeleteSqlInjectionMatchSet</a>).
     *            </p>
     *            <p>
     *            <code>SqlInjectionMatchSetId</code> is returned by
     *            <a>CreateSqlInjectionMatchSet</a> and by
     *            <a>ListSqlInjectionMatchSets</a>.
     *            </p>
     */
    public void setSqlInjectionMatchSetId(String sqlInjectionMatchSetId) {
        this.sqlInjectionMatchSetId = sqlInjectionMatchSetId;
    }

    /**
     * <p>
     * A unique identifier for a <code>SqlInjectionMatchSet</code>. You use
     * <code>SqlInjectionMatchSetId</code> to get information about a
     * <code>SqlInjectionMatchSet</code> (see <a>GetSqlInjectionMatchSet</a>),
     * update a <code>SqlInjectionMatchSet</code> (see
     * <a>UpdateSqlInjectionMatchSet</a>), insert a
     * <code>SqlInjectionMatchSet</code> into a <code>Rule</code> or delete one
     * from a <code>Rule</code> (see <a>UpdateRule</a>), and delete a
     * <code>SqlInjectionMatchSet</code> from AWS WAF (see
     * <a>DeleteSqlInjectionMatchSet</a>).
     * </p>
     * <p>
     * <code>SqlInjectionMatchSetId</code> is returned by
     * <a>CreateSqlInjectionMatchSet</a> and by
     * <a>ListSqlInjectionMatchSets</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param sqlInjectionMatchSetId <p>
     *            A unique identifier for a <code>SqlInjectionMatchSet</code>.
     *            You use <code>SqlInjectionMatchSetId</code> to get information
     *            about a <code>SqlInjectionMatchSet</code> (see
     *            <a>GetSqlInjectionMatchSet</a>), update a
     *            <code>SqlInjectionMatchSet</code> (see
     *            <a>UpdateSqlInjectionMatchSet</a>), insert a
     *            <code>SqlInjectionMatchSet</code> into a <code>Rule</code> or
     *            delete one from a <code>Rule</code> (see <a>UpdateRule</a>),
     *            and delete a <code>SqlInjectionMatchSet</code> from AWS WAF
     *            (see <a>DeleteSqlInjectionMatchSet</a>).
     *            </p>
     *            <p>
     *            <code>SqlInjectionMatchSetId</code> is returned by
     *            <a>CreateSqlInjectionMatchSet</a> and by
     *            <a>ListSqlInjectionMatchSets</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SqlInjectionMatchSet withSqlInjectionMatchSetId(String sqlInjectionMatchSetId) {
        this.sqlInjectionMatchSetId = sqlInjectionMatchSetId;
        return this;
    }

    /**
     * <p>
     * The name, if any, of the <code>SqlInjectionMatchSet</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The name, if any, of the <code>SqlInjectionMatchSet</code>.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name, if any, of the <code>SqlInjectionMatchSet</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            The name, if any, of the <code>SqlInjectionMatchSet</code>.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name, if any, of the <code>SqlInjectionMatchSet</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            The name, if any, of the <code>SqlInjectionMatchSet</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SqlInjectionMatchSet withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * Specifies the parts of web requests that you want to inspect for snippets
     * of malicious SQL code.
     * </p>
     *
     * @return <p>
     *         Specifies the parts of web requests that you want to inspect for
     *         snippets of malicious SQL code.
     *         </p>
     */
    public java.util.List<SqlInjectionMatchTuple> getSqlInjectionMatchTuples() {
        return sqlInjectionMatchTuples;
    }

    /**
     * <p>
     * Specifies the parts of web requests that you want to inspect for snippets
     * of malicious SQL code.
     * </p>
     *
     * @param sqlInjectionMatchTuples <p>
     *            Specifies the parts of web requests that you want to inspect
     *            for snippets of malicious SQL code.
     *            </p>
     */
    public void setSqlInjectionMatchTuples(
            java.util.Collection<SqlInjectionMatchTuple> sqlInjectionMatchTuples) {
        if (sqlInjectionMatchTuples == null) {
            this.sqlInjectionMatchTuples = null;
            return;
        }

        this.sqlInjectionMatchTuples = new java.util.ArrayList<SqlInjectionMatchTuple>(
                sqlInjectionMatchTuples);
    }

    /**
     * <p>
     * Specifies the parts of web requests that you want to inspect for snippets
     * of malicious SQL code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sqlInjectionMatchTuples <p>
     *            Specifies the parts of web requests that you want to inspect
     *            for snippets of malicious SQL code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SqlInjectionMatchSet withSqlInjectionMatchTuples(
            SqlInjectionMatchTuple... sqlInjectionMatchTuples) {
        if (getSqlInjectionMatchTuples() == null) {
            this.sqlInjectionMatchTuples = new java.util.ArrayList<SqlInjectionMatchTuple>(
                    sqlInjectionMatchTuples.length);
        }
        for (SqlInjectionMatchTuple value : sqlInjectionMatchTuples) {
            this.sqlInjectionMatchTuples.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the parts of web requests that you want to inspect for snippets
     * of malicious SQL code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sqlInjectionMatchTuples <p>
     *            Specifies the parts of web requests that you want to inspect
     *            for snippets of malicious SQL code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SqlInjectionMatchSet withSqlInjectionMatchTuples(
            java.util.Collection<SqlInjectionMatchTuple> sqlInjectionMatchTuples) {
        setSqlInjectionMatchTuples(sqlInjectionMatchTuples);
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
        if (getSqlInjectionMatchSetId() != null)
            sb.append("SqlInjectionMatchSetId: " + getSqlInjectionMatchSetId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getSqlInjectionMatchTuples() != null)
            sb.append("SqlInjectionMatchTuples: " + getSqlInjectionMatchTuples());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getSqlInjectionMatchSetId() == null) ? 0 : getSqlInjectionMatchSetId()
                        .hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime
                * hashCode
                + ((getSqlInjectionMatchTuples() == null) ? 0 : getSqlInjectionMatchTuples()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SqlInjectionMatchSet == false)
            return false;
        SqlInjectionMatchSet other = (SqlInjectionMatchSet) obj;

        if (other.getSqlInjectionMatchSetId() == null ^ this.getSqlInjectionMatchSetId() == null)
            return false;
        if (other.getSqlInjectionMatchSetId() != null
                && other.getSqlInjectionMatchSetId().equals(this.getSqlInjectionMatchSetId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSqlInjectionMatchTuples() == null ^ this.getSqlInjectionMatchTuples() == null)
            return false;
        if (other.getSqlInjectionMatchTuples() != null
                && other.getSqlInjectionMatchTuples().equals(this.getSqlInjectionMatchTuples()) == false)
            return false;
        return true;
    }
}
