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

package com.amazonaws.services.rds.model;

import java.io.Serializable;

public class DescribeValidDBInstanceModificationsResult implements Serializable {
    /**
     * <p>
     * Information about valid modifications that you can make to your DB
     * instance. Contains the result of a successful call to the
     * <code>DescribeValidDBInstanceModifications</code> action. You can use
     * this information when you call <code>ModifyDBInstance</code>.
     * </p>
     */
    private ValidDBInstanceModificationsMessage validDBInstanceModificationsMessage;

    /**
     * <p>
     * Information about valid modifications that you can make to your DB
     * instance. Contains the result of a successful call to the
     * <code>DescribeValidDBInstanceModifications</code> action. You can use
     * this information when you call <code>ModifyDBInstance</code>.
     * </p>
     *
     * @return <p>
     *         Information about valid modifications that you can make to your
     *         DB instance. Contains the result of a successful call to the
     *         <code>DescribeValidDBInstanceModifications</code> action. You can
     *         use this information when you call <code>ModifyDBInstance</code>.
     *         </p>
     */
    public ValidDBInstanceModificationsMessage getValidDBInstanceModificationsMessage() {
        return validDBInstanceModificationsMessage;
    }

    /**
     * <p>
     * Information about valid modifications that you can make to your DB
     * instance. Contains the result of a successful call to the
     * <code>DescribeValidDBInstanceModifications</code> action. You can use
     * this information when you call <code>ModifyDBInstance</code>.
     * </p>
     *
     * @param validDBInstanceModificationsMessage <p>
     *            Information about valid modifications that you can make to
     *            your DB instance. Contains the result of a successful call to
     *            the <code>DescribeValidDBInstanceModifications</code> action.
     *            You can use this information when you call
     *            <code>ModifyDBInstance</code>.
     *            </p>
     */
    public void setValidDBInstanceModificationsMessage(
            ValidDBInstanceModificationsMessage validDBInstanceModificationsMessage) {
        this.validDBInstanceModificationsMessage = validDBInstanceModificationsMessage;
    }

    /**
     * <p>
     * Information about valid modifications that you can make to your DB
     * instance. Contains the result of a successful call to the
     * <code>DescribeValidDBInstanceModifications</code> action. You can use
     * this information when you call <code>ModifyDBInstance</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validDBInstanceModificationsMessage <p>
     *            Information about valid modifications that you can make to
     *            your DB instance. Contains the result of a successful call to
     *            the <code>DescribeValidDBInstanceModifications</code> action.
     *            You can use this information when you call
     *            <code>ModifyDBInstance</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeValidDBInstanceModificationsResult withValidDBInstanceModificationsMessage(
            ValidDBInstanceModificationsMessage validDBInstanceModificationsMessage) {
        this.validDBInstanceModificationsMessage = validDBInstanceModificationsMessage;
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
        if (getValidDBInstanceModificationsMessage() != null)
            sb.append("ValidDBInstanceModificationsMessage: "
                    + getValidDBInstanceModificationsMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getValidDBInstanceModificationsMessage() == null) ? 0
                        : getValidDBInstanceModificationsMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeValidDBInstanceModificationsResult == false)
            return false;
        DescribeValidDBInstanceModificationsResult other = (DescribeValidDBInstanceModificationsResult) obj;

        if (other.getValidDBInstanceModificationsMessage() == null
                ^ this.getValidDBInstanceModificationsMessage() == null)
            return false;
        if (other.getValidDBInstanceModificationsMessage() != null
                && other.getValidDBInstanceModificationsMessage().equals(
                        this.getValidDBInstanceModificationsMessage()) == false)
            return false;
        return true;
    }
}
