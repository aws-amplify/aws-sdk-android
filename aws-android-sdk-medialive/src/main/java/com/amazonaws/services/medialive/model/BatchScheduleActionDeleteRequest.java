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

package com.amazonaws.services.medialive.model;

import java.io.Serializable;

/**
 * A list of schedule actions to delete.
 */
public class BatchScheduleActionDeleteRequest implements Serializable {
    /**
     * A list of schedule actions to delete.
     */
    private java.util.List<String> actionNames;

    /**
     * A list of schedule actions to delete.
     *
     * @return A list of schedule actions to delete.
     */
    public java.util.List<String> getActionNames() {
        return actionNames;
    }

    /**
     * A list of schedule actions to delete.
     *
     * @param actionNames A list of schedule actions to delete.
     */
    public void setActionNames(java.util.Collection<String> actionNames) {
        if (actionNames == null) {
            this.actionNames = null;
            return;
        }

        this.actionNames = new java.util.ArrayList<String>(actionNames);
    }

    /**
     * A list of schedule actions to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actionNames A list of schedule actions to delete.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchScheduleActionDeleteRequest withActionNames(String... actionNames) {
        if (getActionNames() == null) {
            this.actionNames = new java.util.ArrayList<String>(actionNames.length);
        }
        for (String value : actionNames) {
            this.actionNames.add(value);
        }
        return this;
    }

    /**
     * A list of schedule actions to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actionNames A list of schedule actions to delete.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchScheduleActionDeleteRequest withActionNames(java.util.Collection<String> actionNames) {
        setActionNames(actionNames);
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
        if (getActionNames() != null)
            sb.append("ActionNames: " + getActionNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getActionNames() == null) ? 0 : getActionNames().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchScheduleActionDeleteRequest == false)
            return false;
        BatchScheduleActionDeleteRequest other = (BatchScheduleActionDeleteRequest) obj;

        if (other.getActionNames() == null ^ this.getActionNames() == null)
            return false;
        if (other.getActionNames() != null
                && other.getActionNames().equals(this.getActionNames()) == false)
            return false;
        return true;
    }
}
