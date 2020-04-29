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
 * Specifies a <code>Predicate</code> (such as an <code>IPSet</code>) and
 * indicates whether you want to add it to a <code>Rule</code> or delete it from
 * a <code>Rule</code>.
 * </p>
 */
public class RuleUpdate implements Serializable {
    /**
     * <p>
     * Specify <code>INSERT</code> to add a <code>Predicate</code> to a
     * <code>Rule</code>. Use <code>DELETE</code> to remove a
     * <code>Predicate</code> from a <code>Rule</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, DELETE
     */
    private String action;

    /**
     * <p>
     * The ID of the <code>Predicate</code> (such as an <code>IPSet</code>) that
     * you want to add to a <code>Rule</code>.
     * </p>
     */
    private Predicate predicate;

    /**
     * <p>
     * Specify <code>INSERT</code> to add a <code>Predicate</code> to a
     * <code>Rule</code>. Use <code>DELETE</code> to remove a
     * <code>Predicate</code> from a <code>Rule</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, DELETE
     *
     * @return <p>
     *         Specify <code>INSERT</code> to add a <code>Predicate</code> to a
     *         <code>Rule</code>. Use <code>DELETE</code> to remove a
     *         <code>Predicate</code> from a <code>Rule</code>.
     *         </p>
     * @see ChangeAction
     */
    public String getAction() {
        return action;
    }

    /**
     * <p>
     * Specify <code>INSERT</code> to add a <code>Predicate</code> to a
     * <code>Rule</code>. Use <code>DELETE</code> to remove a
     * <code>Predicate</code> from a <code>Rule</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, DELETE
     *
     * @param action <p>
     *            Specify <code>INSERT</code> to add a <code>Predicate</code> to
     *            a <code>Rule</code>. Use <code>DELETE</code> to remove a
     *            <code>Predicate</code> from a <code>Rule</code>.
     *            </p>
     * @see ChangeAction
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * Specify <code>INSERT</code> to add a <code>Predicate</code> to a
     * <code>Rule</code>. Use <code>DELETE</code> to remove a
     * <code>Predicate</code> from a <code>Rule</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, DELETE
     *
     * @param action <p>
     *            Specify <code>INSERT</code> to add a <code>Predicate</code> to
     *            a <code>Rule</code>. Use <code>DELETE</code> to remove a
     *            <code>Predicate</code> from a <code>Rule</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChangeAction
     */
    public RuleUpdate withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * <p>
     * Specify <code>INSERT</code> to add a <code>Predicate</code> to a
     * <code>Rule</code>. Use <code>DELETE</code> to remove a
     * <code>Predicate</code> from a <code>Rule</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, DELETE
     *
     * @param action <p>
     *            Specify <code>INSERT</code> to add a <code>Predicate</code> to
     *            a <code>Rule</code>. Use <code>DELETE</code> to remove a
     *            <code>Predicate</code> from a <code>Rule</code>.
     *            </p>
     * @see ChangeAction
     */
    public void setAction(ChangeAction action) {
        this.action = action.toString();
    }

    /**
     * <p>
     * Specify <code>INSERT</code> to add a <code>Predicate</code> to a
     * <code>Rule</code>. Use <code>DELETE</code> to remove a
     * <code>Predicate</code> from a <code>Rule</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, DELETE
     *
     * @param action <p>
     *            Specify <code>INSERT</code> to add a <code>Predicate</code> to
     *            a <code>Rule</code>. Use <code>DELETE</code> to remove a
     *            <code>Predicate</code> from a <code>Rule</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChangeAction
     */
    public RuleUpdate withAction(ChangeAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the <code>Predicate</code> (such as an <code>IPSet</code>) that
     * you want to add to a <code>Rule</code>.
     * </p>
     *
     * @return <p>
     *         The ID of the <code>Predicate</code> (such as an
     *         <code>IPSet</code>) that you want to add to a <code>Rule</code>.
     *         </p>
     */
    public Predicate getPredicate() {
        return predicate;
    }

    /**
     * <p>
     * The ID of the <code>Predicate</code> (such as an <code>IPSet</code>) that
     * you want to add to a <code>Rule</code>.
     * </p>
     *
     * @param predicate <p>
     *            The ID of the <code>Predicate</code> (such as an
     *            <code>IPSet</code>) that you want to add to a
     *            <code>Rule</code>.
     *            </p>
     */
    public void setPredicate(Predicate predicate) {
        this.predicate = predicate;
    }

    /**
     * <p>
     * The ID of the <code>Predicate</code> (such as an <code>IPSet</code>) that
     * you want to add to a <code>Rule</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param predicate <p>
     *            The ID of the <code>Predicate</code> (such as an
     *            <code>IPSet</code>) that you want to add to a
     *            <code>Rule</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RuleUpdate withPredicate(Predicate predicate) {
        this.predicate = predicate;
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
        if (getPredicate() != null)
            sb.append("Predicate: " + getPredicate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getPredicate() == null) ? 0 : getPredicate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleUpdate == false)
            return false;
        RuleUpdate other = (RuleUpdate) obj;

        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getPredicate() == null ^ this.getPredicate() == null)
            return false;
        if (other.getPredicate() != null
                && other.getPredicate().equals(this.getPredicate()) == false)
            return false;
        return true;
    }
}
