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
 * A complex type that contains <code>SizeConstraint</code> objects, which
 * specify the parts of web requests that you want AWS WAF to inspect the size
 * of. If a <code>SizeConstraintSet</code> contains more than one
 * <code>SizeConstraint</code> object, a request only needs to match one
 * constraint to be considered a match.
 * </p>
 */
public class SizeConstraintSet implements Serializable {
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
     * The name, if any, of the <code>SizeConstraintSet</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String name;

    /**
     * <p>
     * Specifies the parts of web requests that you want to inspect the size of.
     * </p>
     */
    private java.util.List<SizeConstraint> sizeConstraints;

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
    public SizeConstraintSet withSizeConstraintSetId(String sizeConstraintSetId) {
        this.sizeConstraintSetId = sizeConstraintSetId;
        return this;
    }

    /**
     * <p>
     * The name, if any, of the <code>SizeConstraintSet</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The name, if any, of the <code>SizeConstraintSet</code>.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name, if any, of the <code>SizeConstraintSet</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            The name, if any, of the <code>SizeConstraintSet</code>.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name, if any, of the <code>SizeConstraintSet</code>.
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
     *            The name, if any, of the <code>SizeConstraintSet</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SizeConstraintSet withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * Specifies the parts of web requests that you want to inspect the size of.
     * </p>
     *
     * @return <p>
     *         Specifies the parts of web requests that you want to inspect the
     *         size of.
     *         </p>
     */
    public java.util.List<SizeConstraint> getSizeConstraints() {
        return sizeConstraints;
    }

    /**
     * <p>
     * Specifies the parts of web requests that you want to inspect the size of.
     * </p>
     *
     * @param sizeConstraints <p>
     *            Specifies the parts of web requests that you want to inspect
     *            the size of.
     *            </p>
     */
    public void setSizeConstraints(java.util.Collection<SizeConstraint> sizeConstraints) {
        if (sizeConstraints == null) {
            this.sizeConstraints = null;
            return;
        }

        this.sizeConstraints = new java.util.ArrayList<SizeConstraint>(sizeConstraints);
    }

    /**
     * <p>
     * Specifies the parts of web requests that you want to inspect the size of.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sizeConstraints <p>
     *            Specifies the parts of web requests that you want to inspect
     *            the size of.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SizeConstraintSet withSizeConstraints(SizeConstraint... sizeConstraints) {
        if (getSizeConstraints() == null) {
            this.sizeConstraints = new java.util.ArrayList<SizeConstraint>(sizeConstraints.length);
        }
        for (SizeConstraint value : sizeConstraints) {
            this.sizeConstraints.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the parts of web requests that you want to inspect the size of.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sizeConstraints <p>
     *            Specifies the parts of web requests that you want to inspect
     *            the size of.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SizeConstraintSet withSizeConstraints(
            java.util.Collection<SizeConstraint> sizeConstraints) {
        setSizeConstraints(sizeConstraints);
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
            sb.append("Name: " + getName() + ",");
        if (getSizeConstraints() != null)
            sb.append("SizeConstraints: " + getSizeConstraints());
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
        hashCode = prime * hashCode
                + ((getSizeConstraints() == null) ? 0 : getSizeConstraints().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SizeConstraintSet == false)
            return false;
        SizeConstraintSet other = (SizeConstraintSet) obj;

        if (other.getSizeConstraintSetId() == null ^ this.getSizeConstraintSetId() == null)
            return false;
        if (other.getSizeConstraintSetId() != null
                && other.getSizeConstraintSetId().equals(this.getSizeConstraintSetId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSizeConstraints() == null ^ this.getSizeConstraints() == null)
            return false;
        if (other.getSizeConstraints() != null
                && other.getSizeConstraints().equals(this.getSizeConstraints()) == false)
            return false;
        return true;
    }
}
