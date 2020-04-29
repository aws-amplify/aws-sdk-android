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

package com.amazonaws.services.awscloudmap.model;

import java.io.Serializable;

public class DiscoverInstancesResult implements Serializable {
    /**
     * <p>
     * A complex type that contains one <code>HttpInstanceSummary</code> for
     * each registered instance.
     * </p>
     */
    private java.util.List<HttpInstanceSummary> instances;

    /**
     * <p>
     * A complex type that contains one <code>HttpInstanceSummary</code> for
     * each registered instance.
     * </p>
     *
     * @return <p>
     *         A complex type that contains one <code>HttpInstanceSummary</code>
     *         for each registered instance.
     *         </p>
     */
    public java.util.List<HttpInstanceSummary> getInstances() {
        return instances;
    }

    /**
     * <p>
     * A complex type that contains one <code>HttpInstanceSummary</code> for
     * each registered instance.
     * </p>
     *
     * @param instances <p>
     *            A complex type that contains one
     *            <code>HttpInstanceSummary</code> for each registered instance.
     *            </p>
     */
    public void setInstances(java.util.Collection<HttpInstanceSummary> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }

        this.instances = new java.util.ArrayList<HttpInstanceSummary>(instances);
    }

    /**
     * <p>
     * A complex type that contains one <code>HttpInstanceSummary</code> for
     * each registered instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instances <p>
     *            A complex type that contains one
     *            <code>HttpInstanceSummary</code> for each registered instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DiscoverInstancesResult withInstances(HttpInstanceSummary... instances) {
        if (getInstances() == null) {
            this.instances = new java.util.ArrayList<HttpInstanceSummary>(instances.length);
        }
        for (HttpInstanceSummary value : instances) {
            this.instances.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains one <code>HttpInstanceSummary</code> for
     * each registered instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instances <p>
     *            A complex type that contains one
     *            <code>HttpInstanceSummary</code> for each registered instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DiscoverInstancesResult withInstances(java.util.Collection<HttpInstanceSummary> instances) {
        setInstances(instances);
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
        if (getInstances() != null)
            sb.append("Instances: " + getInstances());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DiscoverInstancesResult == false)
            return false;
        DiscoverInstancesResult other = (DiscoverInstancesResult) obj;

        if (other.getInstances() == null ^ this.getInstances() == null)
            return false;
        if (other.getInstances() != null
                && other.getInstances().equals(this.getInstances()) == false)
            return false;
        return true;
    }
}
