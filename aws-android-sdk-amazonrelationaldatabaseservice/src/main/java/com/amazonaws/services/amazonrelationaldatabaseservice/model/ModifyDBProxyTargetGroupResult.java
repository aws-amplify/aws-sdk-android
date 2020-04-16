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

public class ModifyDBProxyTargetGroupResult implements Serializable {
    /**
     * <p>
     * The settings of the modified <code>DBProxyTarget</code>.
     * </p>
     */
    private DBProxyTargetGroup dBProxyTargetGroup;

    /**
     * <p>
     * The settings of the modified <code>DBProxyTarget</code>.
     * </p>
     *
     * @return <p>
     *         The settings of the modified <code>DBProxyTarget</code>.
     *         </p>
     */
    public DBProxyTargetGroup getDBProxyTargetGroup() {
        return dBProxyTargetGroup;
    }

    /**
     * <p>
     * The settings of the modified <code>DBProxyTarget</code>.
     * </p>
     *
     * @param dBProxyTargetGroup <p>
     *            The settings of the modified <code>DBProxyTarget</code>.
     *            </p>
     */
    public void setDBProxyTargetGroup(DBProxyTargetGroup dBProxyTargetGroup) {
        this.dBProxyTargetGroup = dBProxyTargetGroup;
    }

    /**
     * <p>
     * The settings of the modified <code>DBProxyTarget</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBProxyTargetGroup <p>
     *            The settings of the modified <code>DBProxyTarget</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBProxyTargetGroupResult withDBProxyTargetGroup(
            DBProxyTargetGroup dBProxyTargetGroup) {
        this.dBProxyTargetGroup = dBProxyTargetGroup;
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
        if (getDBProxyTargetGroup() != null)
            sb.append("DBProxyTargetGroup: " + getDBProxyTargetGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDBProxyTargetGroup() == null) ? 0 : getDBProxyTargetGroup().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyDBProxyTargetGroupResult == false)
            return false;
        ModifyDBProxyTargetGroupResult other = (ModifyDBProxyTargetGroupResult) obj;

        if (other.getDBProxyTargetGroup() == null ^ this.getDBProxyTargetGroup() == null)
            return false;
        if (other.getDBProxyTargetGroup() != null
                && other.getDBProxyTargetGroup().equals(this.getDBProxyTargetGroup()) == false)
            return false;
        return true;
    }
}
