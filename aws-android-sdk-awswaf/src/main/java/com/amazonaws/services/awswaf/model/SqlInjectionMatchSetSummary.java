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

package com.amazonaws.services.awswaf.model;

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
 * The <code>Id</code> and <code>Name</code> of a
 * <code>SqlInjectionMatchSet</code>.
 * </p>
 */
public class SqlInjectionMatchSetSummary implements Serializable {
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
     * The name of the <code>SqlInjectionMatchSet</code>, if any, specified by
     * <code>Id</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String name;

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
    public SqlInjectionMatchSetSummary withSqlInjectionMatchSetId(String sqlInjectionMatchSetId) {
        this.sqlInjectionMatchSetId = sqlInjectionMatchSetId;
        return this;
    }

    /**
     * <p>
     * The name of the <code>SqlInjectionMatchSet</code>, if any, specified by
     * <code>Id</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The name of the <code>SqlInjectionMatchSet</code>, if any,
     *         specified by <code>Id</code>.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the <code>SqlInjectionMatchSet</code>, if any, specified by
     * <code>Id</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            The name of the <code>SqlInjectionMatchSet</code>, if any,
     *            specified by <code>Id</code>.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the <code>SqlInjectionMatchSet</code>, if any, specified by
     * <code>Id</code>.
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
     *            The name of the <code>SqlInjectionMatchSet</code>, if any,
     *            specified by <code>Id</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SqlInjectionMatchSetSummary withName(String name) {
        this.name = name;
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
            sb.append("Name: " + getName());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SqlInjectionMatchSetSummary == false)
            return false;
        SqlInjectionMatchSetSummary other = (SqlInjectionMatchSetSummary) obj;

        if (other.getSqlInjectionMatchSetId() == null ^ this.getSqlInjectionMatchSetId() == null)
            return false;
        if (other.getSqlInjectionMatchSetId() != null
                && other.getSqlInjectionMatchSetId().equals(this.getSqlInjectionMatchSetId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }
}
