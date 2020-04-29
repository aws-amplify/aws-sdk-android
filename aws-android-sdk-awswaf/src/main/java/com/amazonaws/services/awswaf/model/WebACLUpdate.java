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
 * Specifies whether to insert a <code>Rule</code> into or delete a
 * <code>Rule</code> from a <code>WebACL</code>.
 * </p>
 */
public class WebACLUpdate implements Serializable {
    /**
     * <p>
     * Specifies whether to insert a <code>Rule</code> into or delete a
     * <code>Rule</code> from a <code>WebACL</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, DELETE
     */
    private String action;

    /**
     * <p>
     * The <code>ActivatedRule</code> object in an <a>UpdateWebACL</a> request
     * specifies a <code>Rule</code> that you want to insert or delete, the
     * priority of the <code>Rule</code> in the <code>WebACL</code>, and the
     * action that you want AWS WAF to take when a web request matches the
     * <code>Rule</code> (<code>ALLOW</code>, <code>BLOCK</code>, or
     * <code>COUNT</code>).
     * </p>
     */
    private ActivatedRule activatedRule;

    /**
     * <p>
     * Specifies whether to insert a <code>Rule</code> into or delete a
     * <code>Rule</code> from a <code>WebACL</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, DELETE
     *
     * @return <p>
     *         Specifies whether to insert a <code>Rule</code> into or delete a
     *         <code>Rule</code> from a <code>WebACL</code>.
     *         </p>
     * @see ChangeAction
     */
    public String getAction() {
        return action;
    }

    /**
     * <p>
     * Specifies whether to insert a <code>Rule</code> into or delete a
     * <code>Rule</code> from a <code>WebACL</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, DELETE
     *
     * @param action <p>
     *            Specifies whether to insert a <code>Rule</code> into or delete
     *            a <code>Rule</code> from a <code>WebACL</code>.
     *            </p>
     * @see ChangeAction
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * Specifies whether to insert a <code>Rule</code> into or delete a
     * <code>Rule</code> from a <code>WebACL</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, DELETE
     *
     * @param action <p>
     *            Specifies whether to insert a <code>Rule</code> into or delete
     *            a <code>Rule</code> from a <code>WebACL</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChangeAction
     */
    public WebACLUpdate withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * <p>
     * Specifies whether to insert a <code>Rule</code> into or delete a
     * <code>Rule</code> from a <code>WebACL</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, DELETE
     *
     * @param action <p>
     *            Specifies whether to insert a <code>Rule</code> into or delete
     *            a <code>Rule</code> from a <code>WebACL</code>.
     *            </p>
     * @see ChangeAction
     */
    public void setAction(ChangeAction action) {
        this.action = action.toString();
    }

    /**
     * <p>
     * Specifies whether to insert a <code>Rule</code> into or delete a
     * <code>Rule</code> from a <code>WebACL</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, DELETE
     *
     * @param action <p>
     *            Specifies whether to insert a <code>Rule</code> into or delete
     *            a <code>Rule</code> from a <code>WebACL</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChangeAction
     */
    public WebACLUpdate withAction(ChangeAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The <code>ActivatedRule</code> object in an <a>UpdateWebACL</a> request
     * specifies a <code>Rule</code> that you want to insert or delete, the
     * priority of the <code>Rule</code> in the <code>WebACL</code>, and the
     * action that you want AWS WAF to take when a web request matches the
     * <code>Rule</code> (<code>ALLOW</code>, <code>BLOCK</code>, or
     * <code>COUNT</code>).
     * </p>
     *
     * @return <p>
     *         The <code>ActivatedRule</code> object in an <a>UpdateWebACL</a>
     *         request specifies a <code>Rule</code> that you want to insert or
     *         delete, the priority of the <code>Rule</code> in the
     *         <code>WebACL</code>, and the action that you want AWS WAF to take
     *         when a web request matches the <code>Rule</code> (
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>).
     *         </p>
     */
    public ActivatedRule getActivatedRule() {
        return activatedRule;
    }

    /**
     * <p>
     * The <code>ActivatedRule</code> object in an <a>UpdateWebACL</a> request
     * specifies a <code>Rule</code> that you want to insert or delete, the
     * priority of the <code>Rule</code> in the <code>WebACL</code>, and the
     * action that you want AWS WAF to take when a web request matches the
     * <code>Rule</code> (<code>ALLOW</code>, <code>BLOCK</code>, or
     * <code>COUNT</code>).
     * </p>
     *
     * @param activatedRule <p>
     *            The <code>ActivatedRule</code> object in an
     *            <a>UpdateWebACL</a> request specifies a <code>Rule</code> that
     *            you want to insert or delete, the priority of the
     *            <code>Rule</code> in the <code>WebACL</code>, and the action
     *            that you want AWS WAF to take when a web request matches the
     *            <code>Rule</code> (<code>ALLOW</code>, <code>BLOCK</code>, or
     *            <code>COUNT</code>).
     *            </p>
     */
    public void setActivatedRule(ActivatedRule activatedRule) {
        this.activatedRule = activatedRule;
    }

    /**
     * <p>
     * The <code>ActivatedRule</code> object in an <a>UpdateWebACL</a> request
     * specifies a <code>Rule</code> that you want to insert or delete, the
     * priority of the <code>Rule</code> in the <code>WebACL</code>, and the
     * action that you want AWS WAF to take when a web request matches the
     * <code>Rule</code> (<code>ALLOW</code>, <code>BLOCK</code>, or
     * <code>COUNT</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param activatedRule <p>
     *            The <code>ActivatedRule</code> object in an
     *            <a>UpdateWebACL</a> request specifies a <code>Rule</code> that
     *            you want to insert or delete, the priority of the
     *            <code>Rule</code> in the <code>WebACL</code>, and the action
     *            that you want AWS WAF to take when a web request matches the
     *            <code>Rule</code> (<code>ALLOW</code>, <code>BLOCK</code>, or
     *            <code>COUNT</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WebACLUpdate withActivatedRule(ActivatedRule activatedRule) {
        this.activatedRule = activatedRule;
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
        if (getActivatedRule() != null)
            sb.append("ActivatedRule: " + getActivatedRule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode
                + ((getActivatedRule() == null) ? 0 : getActivatedRule().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WebACLUpdate == false)
            return false;
        WebACLUpdate other = (WebACLUpdate) obj;

        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getActivatedRule() == null ^ this.getActivatedRule() == null)
            return false;
        if (other.getActivatedRule() != null
                && other.getActivatedRule().equals(this.getActivatedRule()) == false)
            return false;
        return true;
    }
}
