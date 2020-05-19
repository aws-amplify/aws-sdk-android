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

public class DescribeBundleTasksResult implements Serializable {
    /**
     * <p>
     * Information about the bundle tasks.
     * </p>
     */
    private java.util.List<BundleTask> bundleTasks;

    /**
     * <p>
     * Information about the bundle tasks.
     * </p>
     *
     * @return <p>
     *         Information about the bundle tasks.
     *         </p>
     */
    public java.util.List<BundleTask> getBundleTasks() {
        return bundleTasks;
    }

    /**
     * <p>
     * Information about the bundle tasks.
     * </p>
     *
     * @param bundleTasks <p>
     *            Information about the bundle tasks.
     *            </p>
     */
    public void setBundleTasks(java.util.Collection<BundleTask> bundleTasks) {
        if (bundleTasks == null) {
            this.bundleTasks = null;
            return;
        }

        this.bundleTasks = new java.util.ArrayList<BundleTask>(bundleTasks);
    }

    /**
     * <p>
     * Information about the bundle tasks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bundleTasks <p>
     *            Information about the bundle tasks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeBundleTasksResult withBundleTasks(BundleTask... bundleTasks) {
        if (getBundleTasks() == null) {
            this.bundleTasks = new java.util.ArrayList<BundleTask>(bundleTasks.length);
        }
        for (BundleTask value : bundleTasks) {
            this.bundleTasks.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the bundle tasks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bundleTasks <p>
     *            Information about the bundle tasks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeBundleTasksResult withBundleTasks(java.util.Collection<BundleTask> bundleTasks) {
        setBundleTasks(bundleTasks);
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
        if (getBundleTasks() != null)
            sb.append("BundleTasks: " + getBundleTasks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBundleTasks() == null) ? 0 : getBundleTasks().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeBundleTasksResult == false)
            return false;
        DescribeBundleTasksResult other = (DescribeBundleTasksResult) obj;

        if (other.getBundleTasks() == null ^ this.getBundleTasks() == null)
            return false;
        if (other.getBundleTasks() != null
                && other.getBundleTasks().equals(this.getBundleTasks()) == false)
            return false;
        return true;
    }
}
