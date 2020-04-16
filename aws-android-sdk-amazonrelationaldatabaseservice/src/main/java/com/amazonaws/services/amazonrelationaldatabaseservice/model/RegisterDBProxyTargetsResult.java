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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import java.io.Serializable;

public class RegisterDBProxyTargetsResult implements Serializable {
    /**
     * <p>
     * One or more <code>DBProxyTarget</code> objects that are created when you
     * register targets with a target group.
     * </p>
     */
    private java.util.List<DBProxyTarget> dBProxyTargets;

    /**
     * <p>
     * One or more <code>DBProxyTarget</code> objects that are created when you
     * register targets with a target group.
     * </p>
     *
     * @return <p>
     *         One or more <code>DBProxyTarget</code> objects that are created
     *         when you register targets with a target group.
     *         </p>
     */
    public java.util.List<DBProxyTarget> getDBProxyTargets() {
        return dBProxyTargets;
    }

    /**
     * <p>
     * One or more <code>DBProxyTarget</code> objects that are created when you
     * register targets with a target group.
     * </p>
     *
     * @param dBProxyTargets <p>
     *            One or more <code>DBProxyTarget</code> objects that are
     *            created when you register targets with a target group.
     *            </p>
     */
    public void setDBProxyTargets(java.util.Collection<DBProxyTarget> dBProxyTargets) {
        if (dBProxyTargets == null) {
            this.dBProxyTargets = null;
            return;
        }

        this.dBProxyTargets = new java.util.ArrayList<DBProxyTarget>(dBProxyTargets);
    }

    /**
     * <p>
     * One or more <code>DBProxyTarget</code> objects that are created when you
     * register targets with a target group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBProxyTargets <p>
     *            One or more <code>DBProxyTarget</code> objects that are
     *            created when you register targets with a target group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterDBProxyTargetsResult withDBProxyTargets(DBProxyTarget... dBProxyTargets) {
        if (getDBProxyTargets() == null) {
            this.dBProxyTargets = new java.util.ArrayList<DBProxyTarget>(dBProxyTargets.length);
        }
        for (DBProxyTarget value : dBProxyTargets) {
            this.dBProxyTargets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more <code>DBProxyTarget</code> objects that are created when you
     * register targets with a target group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBProxyTargets <p>
     *            One or more <code>DBProxyTarget</code> objects that are
     *            created when you register targets with a target group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterDBProxyTargetsResult withDBProxyTargets(
            java.util.Collection<DBProxyTarget> dBProxyTargets) {
        setDBProxyTargets(dBProxyTargets);
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
        if (getDBProxyTargets() != null)
            sb.append("DBProxyTargets: " + getDBProxyTargets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDBProxyTargets() == null) ? 0 : getDBProxyTargets().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterDBProxyTargetsResult == false)
            return false;
        RegisterDBProxyTargetsResult other = (RegisterDBProxyTargetsResult) obj;

        if (other.getDBProxyTargets() == null ^ this.getDBProxyTargets() == null)
            return false;
        if (other.getDBProxyTargets() != null
                && other.getDBProxyTargets().equals(this.getDBProxyTargets()) == false)
            return false;
        return true;
    }
}
