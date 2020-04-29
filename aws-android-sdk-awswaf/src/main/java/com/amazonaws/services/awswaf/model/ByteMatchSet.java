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
 * In a <a>GetByteMatchSet</a> request, <code>ByteMatchSet</code> is a complex
 * type that contains the <code>ByteMatchSetId</code> and <code>Name</code> of a
 * <code>ByteMatchSet</code>, and the values that you specified when you updated
 * the <code>ByteMatchSet</code>.
 * </p>
 * <p>
 * A complex type that contains <code>ByteMatchTuple</code> objects, which
 * specify the parts of web requests that you want AWS WAF to inspect and the
 * values that you want AWS WAF to search for. If a <code>ByteMatchSet</code>
 * contains more than one <code>ByteMatchTuple</code> object, a request needs to
 * match the settings in only one <code>ByteMatchTuple</code> to be considered a
 * match.
 * </p>
 */
public class ByteMatchSet implements Serializable {
    /**
     * <p>
     * The <code>ByteMatchSetId</code> for a <code>ByteMatchSet</code>. You use
     * <code>ByteMatchSetId</code> to get information about a
     * <code>ByteMatchSet</code> (see <a>GetByteMatchSet</a>), update a
     * <code>ByteMatchSet</code> (see <a>UpdateByteMatchSet</a>), insert a
     * <code>ByteMatchSet</code> into a <code>Rule</code> or delete one from a
     * <code>Rule</code> (see <a>UpdateRule</a>), and delete a
     * <code>ByteMatchSet</code> from AWS WAF (see <a>DeleteByteMatchSet</a>).
     * </p>
     * <p>
     * <code>ByteMatchSetId</code> is returned by <a>CreateByteMatchSet</a> and
     * by <a>ListByteMatchSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String byteMatchSetId;

    /**
     * <p>
     * A friendly name or description of the <a>ByteMatchSet</a>. You can't
     * change <code>Name</code> after you create a <code>ByteMatchSet</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String name;

    /**
     * <p>
     * Specifies the bytes (typically a string that corresponds with ASCII
     * characters) that you want AWS WAF to search for in web requests, the
     * location in requests that you want AWS WAF to search, and other settings.
     * </p>
     */
    private java.util.List<ByteMatchTuple> byteMatchTuples;

    /**
     * <p>
     * The <code>ByteMatchSetId</code> for a <code>ByteMatchSet</code>. You use
     * <code>ByteMatchSetId</code> to get information about a
     * <code>ByteMatchSet</code> (see <a>GetByteMatchSet</a>), update a
     * <code>ByteMatchSet</code> (see <a>UpdateByteMatchSet</a>), insert a
     * <code>ByteMatchSet</code> into a <code>Rule</code> or delete one from a
     * <code>Rule</code> (see <a>UpdateRule</a>), and delete a
     * <code>ByteMatchSet</code> from AWS WAF (see <a>DeleteByteMatchSet</a>).
     * </p>
     * <p>
     * <code>ByteMatchSetId</code> is returned by <a>CreateByteMatchSet</a> and
     * by <a>ListByteMatchSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The <code>ByteMatchSetId</code> for a <code>ByteMatchSet</code>.
     *         You use <code>ByteMatchSetId</code> to get information about a
     *         <code>ByteMatchSet</code> (see <a>GetByteMatchSet</a>), update a
     *         <code>ByteMatchSet</code> (see <a>UpdateByteMatchSet</a>), insert
     *         a <code>ByteMatchSet</code> into a <code>Rule</code> or delete
     *         one from a <code>Rule</code> (see <a>UpdateRule</a>), and delete
     *         a <code>ByteMatchSet</code> from AWS WAF (see
     *         <a>DeleteByteMatchSet</a>).
     *         </p>
     *         <p>
     *         <code>ByteMatchSetId</code> is returned by
     *         <a>CreateByteMatchSet</a> and by <a>ListByteMatchSets</a>.
     *         </p>
     */
    public String getByteMatchSetId() {
        return byteMatchSetId;
    }

    /**
     * <p>
     * The <code>ByteMatchSetId</code> for a <code>ByteMatchSet</code>. You use
     * <code>ByteMatchSetId</code> to get information about a
     * <code>ByteMatchSet</code> (see <a>GetByteMatchSet</a>), update a
     * <code>ByteMatchSet</code> (see <a>UpdateByteMatchSet</a>), insert a
     * <code>ByteMatchSet</code> into a <code>Rule</code> or delete one from a
     * <code>Rule</code> (see <a>UpdateRule</a>), and delete a
     * <code>ByteMatchSet</code> from AWS WAF (see <a>DeleteByteMatchSet</a>).
     * </p>
     * <p>
     * <code>ByteMatchSetId</code> is returned by <a>CreateByteMatchSet</a> and
     * by <a>ListByteMatchSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param byteMatchSetId <p>
     *            The <code>ByteMatchSetId</code> for a
     *            <code>ByteMatchSet</code>. You use <code>ByteMatchSetId</code>
     *            to get information about a <code>ByteMatchSet</code> (see
     *            <a>GetByteMatchSet</a>), update a <code>ByteMatchSet</code>
     *            (see <a>UpdateByteMatchSet</a>), insert a
     *            <code>ByteMatchSet</code> into a <code>Rule</code> or delete
     *            one from a <code>Rule</code> (see <a>UpdateRule</a>), and
     *            delete a <code>ByteMatchSet</code> from AWS WAF (see
     *            <a>DeleteByteMatchSet</a>).
     *            </p>
     *            <p>
     *            <code>ByteMatchSetId</code> is returned by
     *            <a>CreateByteMatchSet</a> and by <a>ListByteMatchSets</a>.
     *            </p>
     */
    public void setByteMatchSetId(String byteMatchSetId) {
        this.byteMatchSetId = byteMatchSetId;
    }

    /**
     * <p>
     * The <code>ByteMatchSetId</code> for a <code>ByteMatchSet</code>. You use
     * <code>ByteMatchSetId</code> to get information about a
     * <code>ByteMatchSet</code> (see <a>GetByteMatchSet</a>), update a
     * <code>ByteMatchSet</code> (see <a>UpdateByteMatchSet</a>), insert a
     * <code>ByteMatchSet</code> into a <code>Rule</code> or delete one from a
     * <code>Rule</code> (see <a>UpdateRule</a>), and delete a
     * <code>ByteMatchSet</code> from AWS WAF (see <a>DeleteByteMatchSet</a>).
     * </p>
     * <p>
     * <code>ByteMatchSetId</code> is returned by <a>CreateByteMatchSet</a> and
     * by <a>ListByteMatchSets</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param byteMatchSetId <p>
     *            The <code>ByteMatchSetId</code> for a
     *            <code>ByteMatchSet</code>. You use <code>ByteMatchSetId</code>
     *            to get information about a <code>ByteMatchSet</code> (see
     *            <a>GetByteMatchSet</a>), update a <code>ByteMatchSet</code>
     *            (see <a>UpdateByteMatchSet</a>), insert a
     *            <code>ByteMatchSet</code> into a <code>Rule</code> or delete
     *            one from a <code>Rule</code> (see <a>UpdateRule</a>), and
     *            delete a <code>ByteMatchSet</code> from AWS WAF (see
     *            <a>DeleteByteMatchSet</a>).
     *            </p>
     *            <p>
     *            <code>ByteMatchSetId</code> is returned by
     *            <a>CreateByteMatchSet</a> and by <a>ListByteMatchSets</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ByteMatchSet withByteMatchSetId(String byteMatchSetId) {
        this.byteMatchSetId = byteMatchSetId;
        return this;
    }

    /**
     * <p>
     * A friendly name or description of the <a>ByteMatchSet</a>. You can't
     * change <code>Name</code> after you create a <code>ByteMatchSet</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         A friendly name or description of the <a>ByteMatchSet</a>. You
     *         can't change <code>Name</code> after you create a
     *         <code>ByteMatchSet</code>.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A friendly name or description of the <a>ByteMatchSet</a>. You can't
     * change <code>Name</code> after you create a <code>ByteMatchSet</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            A friendly name or description of the <a>ByteMatchSet</a>. You
     *            can't change <code>Name</code> after you create a
     *            <code>ByteMatchSet</code>.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name or description of the <a>ByteMatchSet</a>. You can't
     * change <code>Name</code> after you create a <code>ByteMatchSet</code>.
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
     *            A friendly name or description of the <a>ByteMatchSet</a>. You
     *            can't change <code>Name</code> after you create a
     *            <code>ByteMatchSet</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ByteMatchSet withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * Specifies the bytes (typically a string that corresponds with ASCII
     * characters) that you want AWS WAF to search for in web requests, the
     * location in requests that you want AWS WAF to search, and other settings.
     * </p>
     *
     * @return <p>
     *         Specifies the bytes (typically a string that corresponds with
     *         ASCII characters) that you want AWS WAF to search for in web
     *         requests, the location in requests that you want AWS WAF to
     *         search, and other settings.
     *         </p>
     */
    public java.util.List<ByteMatchTuple> getByteMatchTuples() {
        return byteMatchTuples;
    }

    /**
     * <p>
     * Specifies the bytes (typically a string that corresponds with ASCII
     * characters) that you want AWS WAF to search for in web requests, the
     * location in requests that you want AWS WAF to search, and other settings.
     * </p>
     *
     * @param byteMatchTuples <p>
     *            Specifies the bytes (typically a string that corresponds with
     *            ASCII characters) that you want AWS WAF to search for in web
     *            requests, the location in requests that you want AWS WAF to
     *            search, and other settings.
     *            </p>
     */
    public void setByteMatchTuples(java.util.Collection<ByteMatchTuple> byteMatchTuples) {
        if (byteMatchTuples == null) {
            this.byteMatchTuples = null;
            return;
        }

        this.byteMatchTuples = new java.util.ArrayList<ByteMatchTuple>(byteMatchTuples);
    }

    /**
     * <p>
     * Specifies the bytes (typically a string that corresponds with ASCII
     * characters) that you want AWS WAF to search for in web requests, the
     * location in requests that you want AWS WAF to search, and other settings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param byteMatchTuples <p>
     *            Specifies the bytes (typically a string that corresponds with
     *            ASCII characters) that you want AWS WAF to search for in web
     *            requests, the location in requests that you want AWS WAF to
     *            search, and other settings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ByteMatchSet withByteMatchTuples(ByteMatchTuple... byteMatchTuples) {
        if (getByteMatchTuples() == null) {
            this.byteMatchTuples = new java.util.ArrayList<ByteMatchTuple>(byteMatchTuples.length);
        }
        for (ByteMatchTuple value : byteMatchTuples) {
            this.byteMatchTuples.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the bytes (typically a string that corresponds with ASCII
     * characters) that you want AWS WAF to search for in web requests, the
     * location in requests that you want AWS WAF to search, and other settings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param byteMatchTuples <p>
     *            Specifies the bytes (typically a string that corresponds with
     *            ASCII characters) that you want AWS WAF to search for in web
     *            requests, the location in requests that you want AWS WAF to
     *            search, and other settings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ByteMatchSet withByteMatchTuples(java.util.Collection<ByteMatchTuple> byteMatchTuples) {
        setByteMatchTuples(byteMatchTuples);
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
        if (getByteMatchSetId() != null)
            sb.append("ByteMatchSetId: " + getByteMatchSetId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getByteMatchTuples() != null)
            sb.append("ByteMatchTuples: " + getByteMatchTuples());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getByteMatchSetId() == null) ? 0 : getByteMatchSetId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getByteMatchTuples() == null) ? 0 : getByteMatchTuples().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ByteMatchSet == false)
            return false;
        ByteMatchSet other = (ByteMatchSet) obj;

        if (other.getByteMatchSetId() == null ^ this.getByteMatchSetId() == null)
            return false;
        if (other.getByteMatchSetId() != null
                && other.getByteMatchSetId().equals(this.getByteMatchSetId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getByteMatchTuples() == null ^ this.getByteMatchTuples() == null)
            return false;
        if (other.getByteMatchTuples() != null
                && other.getByteMatchTuples().equals(this.getByteMatchTuples()) == false)
            return false;
        return true;
    }
}
