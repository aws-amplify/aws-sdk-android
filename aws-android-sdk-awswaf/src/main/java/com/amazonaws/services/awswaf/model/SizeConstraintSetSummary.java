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
 * The <code>Id</code> and <code>Name</code> of a <code>SizeConstraintSet</code>
 * .
 * </p>
 */
public class SizeConstraintSetSummary implements Serializable {
    /**
     * <p>
     * A unique identifier for a <code>SizeConstraintSet</code>. You use
     * <code>SizeConstraintSetId</code> to get information about a
     * <code>SizeConstraintSet</code> (see <a>GetSizeConstraintSet</a>), update
     * a <code>SizeConstraintSet</code> (see <a>UpdateSizeConstraintSet</a>),
     * insert a <code>SizeConstraintSet</code> into a <code>Rule</code> or
     * delete one from a <code>Rule</code> (see <a>UpdateRule</a>), and delete a
     * <code>SizeConstraintSet</code> from AWS WAF (see
     * <a>DeleteSizeConstraintSet</a>).
     * </p>
     * <p>
     * <code>SizeConstraintSetId</code> is returned by
     * <a>CreateSizeConstraintSet</a> and by <a>ListSizeConstraintSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String sizeConstraintSetId;

    /**
     * <p>
     * The name of the <code>SizeConstraintSet</code>, if any.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String name;

    /**
     * <p>
     * A unique identifier for a <code>SizeConstraintSet</code>. You use
     * <code>SizeConstraintSetId</code> to get information about a
     * <code>SizeConstraintSet</code> (see <a>GetSizeConstraintSet</a>), update
     * a <code>SizeConstraintSet</code> (see <a>UpdateSizeConstraintSet</a>),
     * insert a <code>SizeConstraintSet</code> into a <code>Rule</code> or
     * delete one from a <code>Rule</code> (see <a>UpdateRule</a>), and delete a
     * <code>SizeConstraintSet</code> from AWS WAF (see
     * <a>DeleteSizeConstraintSet</a>).
     * </p>
     * <p>
     * <code>SizeConstraintSetId</code> is returned by
     * <a>CreateSizeConstraintSet</a> and by <a>ListSizeConstraintSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         A unique identifier for a <code>SizeConstraintSet</code>. You use
     *         <code>SizeConstraintSetId</code> to get information about a
     *         <code>SizeConstraintSet</code> (see <a>GetSizeConstraintSet</a>),
     *         update a <code>SizeConstraintSet</code> (see
     *         <a>UpdateSizeConstraintSet</a>), insert a
     *         <code>SizeConstraintSet</code> into a <code>Rule</code> or delete
     *         one from a <code>Rule</code> (see <a>UpdateRule</a>), and delete
     *         a <code>SizeConstraintSet</code> from AWS WAF (see
     *         <a>DeleteSizeConstraintSet</a>).
     *         </p>
     *         <p>
     *         <code>SizeConstraintSetId</code> is returned by
     *         <a>CreateSizeConstraintSet</a> and by
     *         <a>ListSizeConstraintSets</a>.
     *         </p>
     */
    public String getSizeConstraintSetId() {
        return sizeConstraintSetId;
    }

    /**
     * <p>
     * A unique identifier for a <code>SizeConstraintSet</code>. You use
     * <code>SizeConstraintSetId</code> to get information about a
     * <code>SizeConstraintSet</code> (see <a>GetSizeConstraintSet</a>), update
     * a <code>SizeConstraintSet</code> (see <a>UpdateSizeConstraintSet</a>),
     * insert a <code>SizeConstraintSet</code> into a <code>Rule</code> or
     * delete one from a <code>Rule</code> (see <a>UpdateRule</a>), and delete a
     * <code>SizeConstraintSet</code> from AWS WAF (see
     * <a>DeleteSizeConstraintSet</a>).
     * </p>
     * <p>
     * <code>SizeConstraintSetId</code> is returned by
     * <a>CreateSizeConstraintSet</a> and by <a>ListSizeConstraintSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param sizeConstraintSetId <p>
     *            A unique identifier for a <code>SizeConstraintSet</code>. You
     *            use <code>SizeConstraintSetId</code> to get information about
     *            a <code>SizeConstraintSet</code> (see
     *            <a>GetSizeConstraintSet</a>), update a
     *            <code>SizeConstraintSet</code> (see
     *            <a>UpdateSizeConstraintSet</a>), insert a
     *            <code>SizeConstraintSet</code> into a <code>Rule</code> or
     *            delete one from a <code>Rule</code> (see <a>UpdateRule</a>),
     *            and delete a <code>SizeConstraintSet</code> from AWS WAF (see
     *            <a>DeleteSizeConstraintSet</a>).
     *            </p>
     *            <p>
     *            <code>SizeConstraintSetId</code> is returned by
     *            <a>CreateSizeConstraintSet</a> and by
     *            <a>ListSizeConstraintSets</a>.
     *            </p>
     */
    public void setSizeConstraintSetId(String sizeConstraintSetId) {
        this.sizeConstraintSetId = sizeConstraintSetId;
    }

    /**
     * <p>
     * A unique identifier for a <code>SizeConstraintSet</code>. You use
     * <code>SizeConstraintSetId</code> to get information about a
     * <code>SizeConstraintSet</code> (see <a>GetSizeConstraintSet</a>), update
     * a <code>SizeConstraintSet</code> (see <a>UpdateSizeConstraintSet</a>),
     * insert a <code>SizeConstraintSet</code> into a <code>Rule</code> or
     * delete one from a <code>Rule</code> (see <a>UpdateRule</a>), and delete a
     * <code>SizeConstraintSet</code> from AWS WAF (see
     * <a>DeleteSizeConstraintSet</a>).
     * </p>
     * <p>
     * <code>SizeConstraintSetId</code> is returned by
     * <a>CreateSizeConstraintSet</a> and by <a>ListSizeConstraintSets</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param sizeConstraintSetId <p>
     *            A unique identifier for a <code>SizeConstraintSet</code>. You
     *            use <code>SizeConstraintSetId</code> to get information about
     *            a <code>SizeConstraintSet</code> (see
     *            <a>GetSizeConstraintSet</a>), update a
     *            <code>SizeConstraintSet</code> (see
     *            <a>UpdateSizeConstraintSet</a>), insert a
     *            <code>SizeConstraintSet</code> into a <code>Rule</code> or
     *            delete one from a <code>Rule</code> (see <a>UpdateRule</a>),
     *            and delete a <code>SizeConstraintSet</code> from AWS WAF (see
     *            <a>DeleteSizeConstraintSet</a>).
     *            </p>
     *            <p>
     *            <code>SizeConstraintSetId</code> is returned by
     *            <a>CreateSizeConstraintSet</a> and by
     *            <a>ListSizeConstraintSets</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SizeConstraintSetSummary withSizeConstraintSetId(String sizeConstraintSetId) {
        this.sizeConstraintSetId = sizeConstraintSetId;
        return this;
    }

    /**
     * <p>
     * The name of the <code>SizeConstraintSet</code>, if any.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The name of the <code>SizeConstraintSet</code>, if any.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the <code>SizeConstraintSet</code>, if any.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            The name of the <code>SizeConstraintSet</code>, if any.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the <code>SizeConstraintSet</code>, if any.
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
     *            The name of the <code>SizeConstraintSet</code>, if any.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SizeConstraintSetSummary withName(String name) {
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
        if (getSizeConstraintSetId() != null)
            sb.append("SizeConstraintSetId: " + getSizeConstraintSetId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSizeConstraintSetId() == null) ? 0 : getSizeConstraintSetId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SizeConstraintSetSummary == false)
            return false;
        SizeConstraintSetSummary other = (SizeConstraintSetSummary) obj;

        if (other.getSizeConstraintSetId() == null ^ this.getSizeConstraintSetId() == null)
            return false;
        if (other.getSizeConstraintSetId() != null
                && other.getSizeConstraintSetId().equals(this.getSizeConstraintSetId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }
}
