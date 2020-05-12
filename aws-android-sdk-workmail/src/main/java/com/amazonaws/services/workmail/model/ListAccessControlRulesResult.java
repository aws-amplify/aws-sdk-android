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

package com.amazonaws.services.workmail.model;

import java.io.Serializable;

public class ListAccessControlRulesResult implements Serializable {
    /**
     * <p>
     * The access control rules.
     * </p>
     */
    private java.util.List<AccessControlRule> rules;

    /**
     * <p>
     * The access control rules.
     * </p>
     *
     * @return <p>
     *         The access control rules.
     *         </p>
     */
    public java.util.List<AccessControlRule> getRules() {
        return rules;
    }

    /**
     * <p>
     * The access control rules.
     * </p>
     *
     * @param rules <p>
     *            The access control rules.
     *            </p>
     */
    public void setRules(java.util.Collection<AccessControlRule> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<AccessControlRule>(rules);
    }

    /**
     * <p>
     * The access control rules.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rules <p>
     *            The access control rules.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAccessControlRulesResult withRules(AccessControlRule... rules) {
        if (getRules() == null) {
            this.rules = new java.util.ArrayList<AccessControlRule>(rules.length);
        }
        for (AccessControlRule value : rules) {
            this.rules.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The access control rules.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rules <p>
     *            The access control rules.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAccessControlRulesResult withRules(java.util.Collection<AccessControlRule> rules) {
        setRules(rules);
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
        if (getRules() != null)
            sb.append("Rules: " + getRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAccessControlRulesResult == false)
            return false;
        ListAccessControlRulesResult other = (ListAccessControlRulesResult) obj;

        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        return true;
    }
}
