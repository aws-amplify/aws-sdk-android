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

package com.amazonaws.services.athena.model;

import java.io.Serializable;

public class GetWorkGroupResult implements Serializable {
    /**
     * <p>
     * Information about the workgroup.
     * </p>
     */
    private WorkGroup workGroup;

    /**
     * <p>
     * Information about the workgroup.
     * </p>
     *
     * @return <p>
     *         Information about the workgroup.
     *         </p>
     */
    public WorkGroup getWorkGroup() {
        return workGroup;
    }

    /**
     * <p>
     * Information about the workgroup.
     * </p>
     *
     * @param workGroup <p>
     *            Information about the workgroup.
     *            </p>
     */
    public void setWorkGroup(WorkGroup workGroup) {
        this.workGroup = workGroup;
    }

    /**
     * <p>
     * Information about the workgroup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param workGroup <p>
     *            Information about the workgroup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetWorkGroupResult withWorkGroup(WorkGroup workGroup) {
        this.workGroup = workGroup;
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
        if (getWorkGroup() != null)
            sb.append("WorkGroup: " + getWorkGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkGroup() == null) ? 0 : getWorkGroup().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetWorkGroupResult == false)
            return false;
        GetWorkGroupResult other = (GetWorkGroupResult) obj;

        if (other.getWorkGroup() == null ^ this.getWorkGroup() == null)
            return false;
        if (other.getWorkGroup() != null
                && other.getWorkGroup().equals(this.getWorkGroup()) == false)
            return false;
        return true;
    }
}
