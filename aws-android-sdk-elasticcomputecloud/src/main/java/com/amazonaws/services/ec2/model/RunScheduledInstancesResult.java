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

/**
 * <p>
 * Contains the output of RunScheduledInstances.
 * </p>
 */
public class RunScheduledInstancesResult implements Serializable {
    /**
     * <p>
     * The IDs of the newly launched instances.
     * </p>
     */
    private java.util.List<String> instanceIdSet;

    /**
     * <p>
     * The IDs of the newly launched instances.
     * </p>
     *
     * @return <p>
     *         The IDs of the newly launched instances.
     *         </p>
     */
    public java.util.List<String> getInstanceIdSet() {
        return instanceIdSet;
    }

    /**
     * <p>
     * The IDs of the newly launched instances.
     * </p>
     *
     * @param instanceIdSet <p>
     *            The IDs of the newly launched instances.
     *            </p>
     */
    public void setInstanceIdSet(java.util.Collection<String> instanceIdSet) {
        if (instanceIdSet == null) {
            this.instanceIdSet = null;
            return;
        }

        this.instanceIdSet = new java.util.ArrayList<String>(instanceIdSet);
    }

    /**
     * <p>
     * The IDs of the newly launched instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceIdSet <p>
     *            The IDs of the newly launched instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunScheduledInstancesResult withInstanceIdSet(String... instanceIdSet) {
        if (getInstanceIdSet() == null) {
            this.instanceIdSet = new java.util.ArrayList<String>(instanceIdSet.length);
        }
        for (String value : instanceIdSet) {
            this.instanceIdSet.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the newly launched instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceIdSet <p>
     *            The IDs of the newly launched instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunScheduledInstancesResult withInstanceIdSet(java.util.Collection<String> instanceIdSet) {
        setInstanceIdSet(instanceIdSet);
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
        if (getInstanceIdSet() != null)
            sb.append("InstanceIdSet: " + getInstanceIdSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceIdSet() == null) ? 0 : getInstanceIdSet().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RunScheduledInstancesResult == false)
            return false;
        RunScheduledInstancesResult other = (RunScheduledInstancesResult) obj;

        if (other.getInstanceIdSet() == null ^ this.getInstanceIdSet() == null)
            return false;
        if (other.getInstanceIdSet() != null
                && other.getInstanceIdSet().equals(this.getInstanceIdSet()) == false)
            return false;
        return true;
    }
}
