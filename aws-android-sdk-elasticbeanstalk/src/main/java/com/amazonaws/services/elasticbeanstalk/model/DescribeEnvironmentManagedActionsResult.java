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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

/**
 * <p>
 * The result message containing a list of managed actions.
 * </p>
 */
public class DescribeEnvironmentManagedActionsResult implements Serializable {
    /**
     * <p>
     * A list of upcoming and in-progress managed actions.
     * </p>
     */
    private java.util.List<ManagedAction> managedActions;

    /**
     * <p>
     * A list of upcoming and in-progress managed actions.
     * </p>
     *
     * @return <p>
     *         A list of upcoming and in-progress managed actions.
     *         </p>
     */
    public java.util.List<ManagedAction> getManagedActions() {
        return managedActions;
    }

    /**
     * <p>
     * A list of upcoming and in-progress managed actions.
     * </p>
     *
     * @param managedActions <p>
     *            A list of upcoming and in-progress managed actions.
     *            </p>
     */
    public void setManagedActions(java.util.Collection<ManagedAction> managedActions) {
        if (managedActions == null) {
            this.managedActions = null;
            return;
        }

        this.managedActions = new java.util.ArrayList<ManagedAction>(managedActions);
    }

    /**
     * <p>
     * A list of upcoming and in-progress managed actions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param managedActions <p>
     *            A list of upcoming and in-progress managed actions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEnvironmentManagedActionsResult withManagedActions(
            ManagedAction... managedActions) {
        if (getManagedActions() == null) {
            this.managedActions = new java.util.ArrayList<ManagedAction>(managedActions.length);
        }
        for (ManagedAction value : managedActions) {
            this.managedActions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of upcoming and in-progress managed actions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param managedActions <p>
     *            A list of upcoming and in-progress managed actions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEnvironmentManagedActionsResult withManagedActions(
            java.util.Collection<ManagedAction> managedActions) {
        setManagedActions(managedActions);
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
        if (getManagedActions() != null)
            sb.append("ManagedActions: " + getManagedActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getManagedActions() == null) ? 0 : getManagedActions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEnvironmentManagedActionsResult == false)
            return false;
        DescribeEnvironmentManagedActionsResult other = (DescribeEnvironmentManagedActionsResult) obj;

        if (other.getManagedActions() == null ^ this.getManagedActions() == null)
            return false;
        if (other.getManagedActions() != null
                && other.getManagedActions().equals(this.getManagedActions()) == false)
            return false;
        return true;
    }
}
