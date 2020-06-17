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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

public class TerminateInstancesResult implements Serializable {
    /**
     * <p>
     * Information about the terminated instances.
     * </p>
     */
    private java.util.List<InstanceStateChange> terminatingInstances;

    /**
     * <p>
     * Information about the terminated instances.
     * </p>
     *
     * @return <p>
     *         Information about the terminated instances.
     *         </p>
     */
    public java.util.List<InstanceStateChange> getTerminatingInstances() {
        return terminatingInstances;
    }

    /**
     * <p>
     * Information about the terminated instances.
     * </p>
     *
     * @param terminatingInstances <p>
     *            Information about the terminated instances.
     *            </p>
     */
    public void setTerminatingInstances(
            java.util.Collection<InstanceStateChange> terminatingInstances) {
        if (terminatingInstances == null) {
            this.terminatingInstances = null;
            return;
        }

        this.terminatingInstances = new java.util.ArrayList<InstanceStateChange>(
                terminatingInstances);
    }

    /**
     * <p>
     * Information about the terminated instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param terminatingInstances <p>
     *            Information about the terminated instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TerminateInstancesResult withTerminatingInstances(
            InstanceStateChange... terminatingInstances) {
        if (getTerminatingInstances() == null) {
            this.terminatingInstances = new java.util.ArrayList<InstanceStateChange>(
                    terminatingInstances.length);
        }
        for (InstanceStateChange value : terminatingInstances) {
            this.terminatingInstances.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the terminated instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param terminatingInstances <p>
     *            Information about the terminated instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TerminateInstancesResult withTerminatingInstances(
            java.util.Collection<InstanceStateChange> terminatingInstances) {
        setTerminatingInstances(terminatingInstances);
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
        if (getTerminatingInstances() != null)
            sb.append("TerminatingInstances: " + getTerminatingInstances());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTerminatingInstances() == null) ? 0 : getTerminatingInstances().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TerminateInstancesResult == false)
            return false;
        TerminateInstancesResult other = (TerminateInstancesResult) obj;

        if (other.getTerminatingInstances() == null ^ this.getTerminatingInstances() == null)
            return false;
        if (other.getTerminatingInstances() != null
                && other.getTerminatingInstances().equals(this.getTerminatingInstances()) == false)
            return false;
        return true;
    }
}
