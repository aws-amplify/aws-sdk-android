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
 * In an <a>UpdateRegexMatchSet</a> request, <code>RegexMatchSetUpdate</code>
 * specifies whether to insert or delete a <a>RegexMatchTuple</a> and includes
 * the settings for the <code>RegexMatchTuple</code>.
 * </p>
 */
public class RegexMatchSetUpdate implements Serializable {
    /**
     * <p>
     * Specifies whether to insert or delete a <a>RegexMatchTuple</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, DELETE
     */
    private String action;

    /**
     * <p>
     * Information about the part of a web request that you want AWS WAF to
     * inspect and the identifier of the regular expression (regex) pattern that
     * you want AWS WAF to search for. If you specify <code>DELETE</code> for
     * the value of <code>Action</code>, the <code>RegexMatchTuple</code> values
     * must exactly match the values in the <code>RegexMatchTuple</code> that
     * you want to delete from the <code>RegexMatchSet</code>.
     * </p>
     */
    private RegexMatchTuple regexMatchTuple;

    /**
     * <p>
     * Specifies whether to insert or delete a <a>RegexMatchTuple</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, DELETE
     *
     * @return <p>
     *         Specifies whether to insert or delete a <a>RegexMatchTuple</a>.
     *         </p>
     * @see ChangeAction
     */
    public String getAction() {
        return action;
    }

    /**
     * <p>
     * Specifies whether to insert or delete a <a>RegexMatchTuple</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, DELETE
     *
     * @param action <p>
     *            Specifies whether to insert or delete a
     *            <a>RegexMatchTuple</a>.
     *            </p>
     * @see ChangeAction
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * Specifies whether to insert or delete a <a>RegexMatchTuple</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, DELETE
     *
     * @param action <p>
     *            Specifies whether to insert or delete a
     *            <a>RegexMatchTuple</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChangeAction
     */
    public RegexMatchSetUpdate withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * <p>
     * Specifies whether to insert or delete a <a>RegexMatchTuple</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, DELETE
     *
     * @param action <p>
     *            Specifies whether to insert or delete a
     *            <a>RegexMatchTuple</a>.
     *            </p>
     * @see ChangeAction
     */
    public void setAction(ChangeAction action) {
        this.action = action.toString();
    }

    /**
     * <p>
     * Specifies whether to insert or delete a <a>RegexMatchTuple</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, DELETE
     *
     * @param action <p>
     *            Specifies whether to insert or delete a
     *            <a>RegexMatchTuple</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChangeAction
     */
    public RegexMatchSetUpdate withAction(ChangeAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * Information about the part of a web request that you want AWS WAF to
     * inspect and the identifier of the regular expression (regex) pattern that
     * you want AWS WAF to search for. If you specify <code>DELETE</code> for
     * the value of <code>Action</code>, the <code>RegexMatchTuple</code> values
     * must exactly match the values in the <code>RegexMatchTuple</code> that
     * you want to delete from the <code>RegexMatchSet</code>.
     * </p>
     *
     * @return <p>
     *         Information about the part of a web request that you want AWS WAF
     *         to inspect and the identifier of the regular expression (regex)
     *         pattern that you want AWS WAF to search for. If you specify
     *         <code>DELETE</code> for the value of <code>Action</code>, the
     *         <code>RegexMatchTuple</code> values must exactly match the values
     *         in the <code>RegexMatchTuple</code> that you want to delete from
     *         the <code>RegexMatchSet</code>.
     *         </p>
     */
    public RegexMatchTuple getRegexMatchTuple() {
        return regexMatchTuple;
    }

    /**
     * <p>
     * Information about the part of a web request that you want AWS WAF to
     * inspect and the identifier of the regular expression (regex) pattern that
     * you want AWS WAF to search for. If you specify <code>DELETE</code> for
     * the value of <code>Action</code>, the <code>RegexMatchTuple</code> values
     * must exactly match the values in the <code>RegexMatchTuple</code> that
     * you want to delete from the <code>RegexMatchSet</code>.
     * </p>
     *
     * @param regexMatchTuple <p>
     *            Information about the part of a web request that you want AWS
     *            WAF to inspect and the identifier of the regular expression
     *            (regex) pattern that you want AWS WAF to search for. If you
     *            specify <code>DELETE</code> for the value of
     *            <code>Action</code>, the <code>RegexMatchTuple</code> values
     *            must exactly match the values in the
     *            <code>RegexMatchTuple</code> that you want to delete from the
     *            <code>RegexMatchSet</code>.
     *            </p>
     */
    public void setRegexMatchTuple(RegexMatchTuple regexMatchTuple) {
        this.regexMatchTuple = regexMatchTuple;
    }

    /**
     * <p>
     * Information about the part of a web request that you want AWS WAF to
     * inspect and the identifier of the regular expression (regex) pattern that
     * you want AWS WAF to search for. If you specify <code>DELETE</code> for
     * the value of <code>Action</code>, the <code>RegexMatchTuple</code> values
     * must exactly match the values in the <code>RegexMatchTuple</code> that
     * you want to delete from the <code>RegexMatchSet</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regexMatchTuple <p>
     *            Information about the part of a web request that you want AWS
     *            WAF to inspect and the identifier of the regular expression
     *            (regex) pattern that you want AWS WAF to search for. If you
     *            specify <code>DELETE</code> for the value of
     *            <code>Action</code>, the <code>RegexMatchTuple</code> values
     *            must exactly match the values in the
     *            <code>RegexMatchTuple</code> that you want to delete from the
     *            <code>RegexMatchSet</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegexMatchSetUpdate withRegexMatchTuple(RegexMatchTuple regexMatchTuple) {
        this.regexMatchTuple = regexMatchTuple;
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
        if (getRegexMatchTuple() != null)
            sb.append("RegexMatchTuple: " + getRegexMatchTuple());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode
                + ((getRegexMatchTuple() == null) ? 0 : getRegexMatchTuple().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegexMatchSetUpdate == false)
            return false;
        RegexMatchSetUpdate other = (RegexMatchSetUpdate) obj;

        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getRegexMatchTuple() == null ^ this.getRegexMatchTuple() == null)
            return false;
        if (other.getRegexMatchTuple() != null
                && other.getRegexMatchTuple().equals(this.getRegexMatchTuple()) == false)
            return false;
        return true;
    }
}
