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
 * Specifies the part of a web request that you want to inspect for cross-site
 * scripting attacks and indicates whether you want to add the specification to
 * an <a>XssMatchSet</a> or delete it from an <code>XssMatchSet</code>.
 * </p>
 */
public class XssMatchSetUpdate implements Serializable {
    /**
     * <p>
     * Specify <code>INSERT</code> to add an <a>XssMatchSetUpdate</a> to an
     * <a>XssMatchSet</a>. Use <code>DELETE</code> to remove an
     * <code>XssMatchSetUpdate</code> from an <code>XssMatchSet</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, DELETE
     */
    private String action;

    /**
     * <p>
     * Specifies the part of a web request that you want AWS WAF to inspect for
     * cross-site scripting attacks and, if you want AWS WAF to inspect a
     * header, the name of the header.
     * </p>
     */
    private XssMatchTuple xssMatchTuple;

    /**
     * <p>
     * Specify <code>INSERT</code> to add an <a>XssMatchSetUpdate</a> to an
     * <a>XssMatchSet</a>. Use <code>DELETE</code> to remove an
     * <code>XssMatchSetUpdate</code> from an <code>XssMatchSet</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, DELETE
     *
     * @return <p>
     *         Specify <code>INSERT</code> to add an <a>XssMatchSetUpdate</a> to
     *         an <a>XssMatchSet</a>. Use <code>DELETE</code> to remove an
     *         <code>XssMatchSetUpdate</code> from an <code>XssMatchSet</code>.
     *         </p>
     * @see ChangeAction
     */
    public String getAction() {
        return action;
    }

    /**
     * <p>
     * Specify <code>INSERT</code> to add an <a>XssMatchSetUpdate</a> to an
     * <a>XssMatchSet</a>. Use <code>DELETE</code> to remove an
     * <code>XssMatchSetUpdate</code> from an <code>XssMatchSet</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, DELETE
     *
     * @param action <p>
     *            Specify <code>INSERT</code> to add an <a>XssMatchSetUpdate</a>
     *            to an <a>XssMatchSet</a>. Use <code>DELETE</code> to remove an
     *            <code>XssMatchSetUpdate</code> from an
     *            <code>XssMatchSet</code>.
     *            </p>
     * @see ChangeAction
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * Specify <code>INSERT</code> to add an <a>XssMatchSetUpdate</a> to an
     * <a>XssMatchSet</a>. Use <code>DELETE</code> to remove an
     * <code>XssMatchSetUpdate</code> from an <code>XssMatchSet</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, DELETE
     *
     * @param action <p>
     *            Specify <code>INSERT</code> to add an <a>XssMatchSetUpdate</a>
     *            to an <a>XssMatchSet</a>. Use <code>DELETE</code> to remove an
     *            <code>XssMatchSetUpdate</code> from an
     *            <code>XssMatchSet</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChangeAction
     */
    public XssMatchSetUpdate withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * <p>
     * Specify <code>INSERT</code> to add an <a>XssMatchSetUpdate</a> to an
     * <a>XssMatchSet</a>. Use <code>DELETE</code> to remove an
     * <code>XssMatchSetUpdate</code> from an <code>XssMatchSet</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, DELETE
     *
     * @param action <p>
     *            Specify <code>INSERT</code> to add an <a>XssMatchSetUpdate</a>
     *            to an <a>XssMatchSet</a>. Use <code>DELETE</code> to remove an
     *            <code>XssMatchSetUpdate</code> from an
     *            <code>XssMatchSet</code>.
     *            </p>
     * @see ChangeAction
     */
    public void setAction(ChangeAction action) {
        this.action = action.toString();
    }

    /**
     * <p>
     * Specify <code>INSERT</code> to add an <a>XssMatchSetUpdate</a> to an
     * <a>XssMatchSet</a>. Use <code>DELETE</code> to remove an
     * <code>XssMatchSetUpdate</code> from an <code>XssMatchSet</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, DELETE
     *
     * @param action <p>
     *            Specify <code>INSERT</code> to add an <a>XssMatchSetUpdate</a>
     *            to an <a>XssMatchSet</a>. Use <code>DELETE</code> to remove an
     *            <code>XssMatchSetUpdate</code> from an
     *            <code>XssMatchSet</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChangeAction
     */
    public XssMatchSetUpdate withAction(ChangeAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the part of a web request that you want AWS WAF to inspect for
     * cross-site scripting attacks and, if you want AWS WAF to inspect a
     * header, the name of the header.
     * </p>
     *
     * @return <p>
     *         Specifies the part of a web request that you want AWS WAF to
     *         inspect for cross-site scripting attacks and, if you want AWS WAF
     *         to inspect a header, the name of the header.
     *         </p>
     */
    public XssMatchTuple getXssMatchTuple() {
        return xssMatchTuple;
    }

    /**
     * <p>
     * Specifies the part of a web request that you want AWS WAF to inspect for
     * cross-site scripting attacks and, if you want AWS WAF to inspect a
     * header, the name of the header.
     * </p>
     *
     * @param xssMatchTuple <p>
     *            Specifies the part of a web request that you want AWS WAF to
     *            inspect for cross-site scripting attacks and, if you want AWS
     *            WAF to inspect a header, the name of the header.
     *            </p>
     */
    public void setXssMatchTuple(XssMatchTuple xssMatchTuple) {
        this.xssMatchTuple = xssMatchTuple;
    }

    /**
     * <p>
     * Specifies the part of a web request that you want AWS WAF to inspect for
     * cross-site scripting attacks and, if you want AWS WAF to inspect a
     * header, the name of the header.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param xssMatchTuple <p>
     *            Specifies the part of a web request that you want AWS WAF to
     *            inspect for cross-site scripting attacks and, if you want AWS
     *            WAF to inspect a header, the name of the header.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public XssMatchSetUpdate withXssMatchTuple(XssMatchTuple xssMatchTuple) {
        this.xssMatchTuple = xssMatchTuple;
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
        if (getXssMatchTuple() != null)
            sb.append("XssMatchTuple: " + getXssMatchTuple());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode
                + ((getXssMatchTuple() == null) ? 0 : getXssMatchTuple().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof XssMatchSetUpdate == false)
            return false;
        XssMatchSetUpdate other = (XssMatchSetUpdate) obj;

        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getXssMatchTuple() == null ^ this.getXssMatchTuple() == null)
            return false;
        if (other.getXssMatchTuple() != null
                && other.getXssMatchTuple().equals(this.getXssMatchTuple()) == false)
            return false;
        return true;
    }
}
