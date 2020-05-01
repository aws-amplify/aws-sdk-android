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

package com.amazonaws.services.amazonelasticfilesystem.model;

import java.io.Serializable;

public class DescribeLifecycleConfigurationResult implements Serializable {
    /**
     * <p>
     * An array of lifecycle management policies. Currently, EFS supports a
     * maximum of one policy per file system.
     * </p>
     */
    private java.util.List<LifecyclePolicy> lifecyclePolicies;

    /**
     * <p>
     * An array of lifecycle management policies. Currently, EFS supports a
     * maximum of one policy per file system.
     * </p>
     *
     * @return <p>
     *         An array of lifecycle management policies. Currently, EFS
     *         supports a maximum of one policy per file system.
     *         </p>
     */
    public java.util.List<LifecyclePolicy> getLifecyclePolicies() {
        return lifecyclePolicies;
    }

    /**
     * <p>
     * An array of lifecycle management policies. Currently, EFS supports a
     * maximum of one policy per file system.
     * </p>
     *
     * @param lifecyclePolicies <p>
     *            An array of lifecycle management policies. Currently, EFS
     *            supports a maximum of one policy per file system.
     *            </p>
     */
    public void setLifecyclePolicies(java.util.Collection<LifecyclePolicy> lifecyclePolicies) {
        if (lifecyclePolicies == null) {
            this.lifecyclePolicies = null;
            return;
        }

        this.lifecyclePolicies = new java.util.ArrayList<LifecyclePolicy>(lifecyclePolicies);
    }

    /**
     * <p>
     * An array of lifecycle management policies. Currently, EFS supports a
     * maximum of one policy per file system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lifecyclePolicies <p>
     *            An array of lifecycle management policies. Currently, EFS
     *            supports a maximum of one policy per file system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLifecycleConfigurationResult withLifecyclePolicies(
            LifecyclePolicy... lifecyclePolicies) {
        if (getLifecyclePolicies() == null) {
            this.lifecyclePolicies = new java.util.ArrayList<LifecyclePolicy>(
                    lifecyclePolicies.length);
        }
        for (LifecyclePolicy value : lifecyclePolicies) {
            this.lifecyclePolicies.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of lifecycle management policies. Currently, EFS supports a
     * maximum of one policy per file system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lifecyclePolicies <p>
     *            An array of lifecycle management policies. Currently, EFS
     *            supports a maximum of one policy per file system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLifecycleConfigurationResult withLifecyclePolicies(
            java.util.Collection<LifecyclePolicy> lifecyclePolicies) {
        setLifecyclePolicies(lifecyclePolicies);
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
        if (getLifecyclePolicies() != null)
            sb.append("LifecyclePolicies: " + getLifecyclePolicies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLifecyclePolicies() == null) ? 0 : getLifecyclePolicies().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLifecycleConfigurationResult == false)
            return false;
        DescribeLifecycleConfigurationResult other = (DescribeLifecycleConfigurationResult) obj;

        if (other.getLifecyclePolicies() == null ^ this.getLifecyclePolicies() == null)
            return false;
        if (other.getLifecyclePolicies() != null
                && other.getLifecyclePolicies().equals(this.getLifecyclePolicies()) == false)
            return false;
        return true;
    }
}
