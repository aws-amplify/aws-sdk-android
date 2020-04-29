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
 * Specifies the part of a web request that you want to inspect the size of and
 * indicates whether you want to add the specification to a
 * <a>SizeConstraintSet</a> or delete it from a <code>SizeConstraintSet</code>.
 * </p>
 */
public class SizeConstraintSetUpdate implements Serializable {
    /**
     * <p>
     * Specify <code>INSERT</code> to add a <a>SizeConstraintSetUpdate</a> to a
     * <a>SizeConstraintSet</a>. Use <code>DELETE</code> to remove a
     * <code>SizeConstraintSetUpdate</code> from a
     * <code>SizeConstraintSet</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, DELETE
     */
    private String action;

    /**
     * <p>
     * Specifies a constraint on the size of a part of the web request. AWS WAF
     * uses the <code>Size</code>, <code>ComparisonOperator</code>, and
     * <code>FieldToMatch</code> to build an expression in the form of "
     * <code>Size</code> <code>ComparisonOperator</code> size in bytes of
     * <code>FieldToMatch</code>". If that expression is true, the
     * <code>SizeConstraint</code> is considered to match.
     * </p>
     */
    private SizeConstraint sizeConstraint;

    /**
     * <p>
     * Specify <code>INSERT</code> to add a <a>SizeConstraintSetUpdate</a> to a
     * <a>SizeConstraintSet</a>. Use <code>DELETE</code> to remove a
     * <code>SizeConstraintSetUpdate</code> from a
     * <code>SizeConstraintSet</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, DELETE
     *
     * @return <p>
     *         Specify <code>INSERT</code> to add a
     *         <a>SizeConstraintSetUpdate</a> to a <a>SizeConstraintSet</a>. Use
     *         <code>DELETE</code> to remove a
     *         <code>SizeConstraintSetUpdate</code> from a
     *         <code>SizeConstraintSet</code>.
     *         </p>
     * @see ChangeAction
     */
    public String getAction() {
        return action;
    }

    /**
     * <p>
     * Specify <code>INSERT</code> to add a <a>SizeConstraintSetUpdate</a> to a
     * <a>SizeConstraintSet</a>. Use <code>DELETE</code> to remove a
     * <code>SizeConstraintSetUpdate</code> from a
     * <code>SizeConstraintSet</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, DELETE
     *
     * @param action <p>
     *            Specify <code>INSERT</code> to add a
     *            <a>SizeConstraintSetUpdate</a> to a <a>SizeConstraintSet</a>.
     *            Use <code>DELETE</code> to remove a
     *            <code>SizeConstraintSetUpdate</code> from a
     *            <code>SizeConstraintSet</code>.
     *            </p>
     * @see ChangeAction
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * Specify <code>INSERT</code> to add a <a>SizeConstraintSetUpdate</a> to a
     * <a>SizeConstraintSet</a>. Use <code>DELETE</code> to remove a
     * <code>SizeConstraintSetUpdate</code> from a
     * <code>SizeConstraintSet</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, DELETE
     *
     * @param action <p>
     *            Specify <code>INSERT</code> to add a
     *            <a>SizeConstraintSetUpdate</a> to a <a>SizeConstraintSet</a>.
     *            Use <code>DELETE</code> to remove a
     *            <code>SizeConstraintSetUpdate</code> from a
     *            <code>SizeConstraintSet</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChangeAction
     */
    public SizeConstraintSetUpdate withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * <p>
     * Specify <code>INSERT</code> to add a <a>SizeConstraintSetUpdate</a> to a
     * <a>SizeConstraintSet</a>. Use <code>DELETE</code> to remove a
     * <code>SizeConstraintSetUpdate</code> from a
     * <code>SizeConstraintSet</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, DELETE
     *
     * @param action <p>
     *            Specify <code>INSERT</code> to add a
     *            <a>SizeConstraintSetUpdate</a> to a <a>SizeConstraintSet</a>.
     *            Use <code>DELETE</code> to remove a
     *            <code>SizeConstraintSetUpdate</code> from a
     *            <code>SizeConstraintSet</code>.
     *            </p>
     * @see ChangeAction
     */
    public void setAction(ChangeAction action) {
        this.action = action.toString();
    }

    /**
     * <p>
     * Specify <code>INSERT</code> to add a <a>SizeConstraintSetUpdate</a> to a
     * <a>SizeConstraintSet</a>. Use <code>DELETE</code> to remove a
     * <code>SizeConstraintSetUpdate</code> from a
     * <code>SizeConstraintSet</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, DELETE
     *
     * @param action <p>
     *            Specify <code>INSERT</code> to add a
     *            <a>SizeConstraintSetUpdate</a> to a <a>SizeConstraintSet</a>.
     *            Use <code>DELETE</code> to remove a
     *            <code>SizeConstraintSetUpdate</code> from a
     *            <code>SizeConstraintSet</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChangeAction
     */
    public SizeConstraintSetUpdate withAction(ChangeAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * Specifies a constraint on the size of a part of the web request. AWS WAF
     * uses the <code>Size</code>, <code>ComparisonOperator</code>, and
     * <code>FieldToMatch</code> to build an expression in the form of "
     * <code>Size</code> <code>ComparisonOperator</code> size in bytes of
     * <code>FieldToMatch</code>". If that expression is true, the
     * <code>SizeConstraint</code> is considered to match.
     * </p>
     *
     * @return <p>
     *         Specifies a constraint on the size of a part of the web request.
     *         AWS WAF uses the <code>Size</code>,
     *         <code>ComparisonOperator</code>, and <code>FieldToMatch</code> to
     *         build an expression in the form of "<code>Size</code>
     *         <code>ComparisonOperator</code> size in bytes of
     *         <code>FieldToMatch</code>". If that expression is true, the
     *         <code>SizeConstraint</code> is considered to match.
     *         </p>
     */
    public SizeConstraint getSizeConstraint() {
        return sizeConstraint;
    }

    /**
     * <p>
     * Specifies a constraint on the size of a part of the web request. AWS WAF
     * uses the <code>Size</code>, <code>ComparisonOperator</code>, and
     * <code>FieldToMatch</code> to build an expression in the form of "
     * <code>Size</code> <code>ComparisonOperator</code> size in bytes of
     * <code>FieldToMatch</code>". If that expression is true, the
     * <code>SizeConstraint</code> is considered to match.
     * </p>
     *
     * @param sizeConstraint <p>
     *            Specifies a constraint on the size of a part of the web
     *            request. AWS WAF uses the <code>Size</code>,
     *            <code>ComparisonOperator</code>, and <code>FieldToMatch</code>
     *            to build an expression in the form of "<code>Size</code>
     *            <code>ComparisonOperator</code> size in bytes of
     *            <code>FieldToMatch</code>". If that expression is true, the
     *            <code>SizeConstraint</code> is considered to match.
     *            </p>
     */
    public void setSizeConstraint(SizeConstraint sizeConstraint) {
        this.sizeConstraint = sizeConstraint;
    }

    /**
     * <p>
     * Specifies a constraint on the size of a part of the web request. AWS WAF
     * uses the <code>Size</code>, <code>ComparisonOperator</code>, and
     * <code>FieldToMatch</code> to build an expression in the form of "
     * <code>Size</code> <code>ComparisonOperator</code> size in bytes of
     * <code>FieldToMatch</code>". If that expression is true, the
     * <code>SizeConstraint</code> is considered to match.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sizeConstraint <p>
     *            Specifies a constraint on the size of a part of the web
     *            request. AWS WAF uses the <code>Size</code>,
     *            <code>ComparisonOperator</code>, and <code>FieldToMatch</code>
     *            to build an expression in the form of "<code>Size</code>
     *            <code>ComparisonOperator</code> size in bytes of
     *            <code>FieldToMatch</code>". If that expression is true, the
     *            <code>SizeConstraint</code> is considered to match.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SizeConstraintSetUpdate withSizeConstraint(SizeConstraint sizeConstraint) {
        this.sizeConstraint = sizeConstraint;
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
        if (getAction() != null)
            sb.append("Action: " + getAction() + ",");
        if (getSizeConstraint() != null)
            sb.append("SizeConstraint: " + getSizeConstraint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode
                + ((getSizeConstraint() == null) ? 0 : getSizeConstraint().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SizeConstraintSetUpdate == false)
            return false;
        SizeConstraintSetUpdate other = (SizeConstraintSetUpdate) obj;

        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getSizeConstraint() == null ^ this.getSizeConstraint() == null)
            return false;
        if (other.getSizeConstraint() != null
                && other.getSizeConstraint().equals(this.getSizeConstraint()) == false)
            return false;
        return true;
    }
}
