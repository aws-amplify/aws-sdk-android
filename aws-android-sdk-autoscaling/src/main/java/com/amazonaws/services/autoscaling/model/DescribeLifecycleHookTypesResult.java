/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

public class DescribeLifecycleHookTypesResult implements Serializable {
    /**
     * <p>
     * The lifecycle hook types.
     * </p>
     */
    private java.util.List<String> lifecycleHookTypes = new java.util.ArrayList<String>();

    /**
     * <p>
     * The lifecycle hook types.
     * </p>
     *
     * @return <p>
     *         The lifecycle hook types.
     *         </p>
     */
    public java.util.List<String> getLifecycleHookTypes() {
        return lifecycleHookTypes;
    }

    /**
     * <p>
     * The lifecycle hook types.
     * </p>
     *
     * @param lifecycleHookTypes <p>
     *            The lifecycle hook types.
     *            </p>
     */
    public void setLifecycleHookTypes(java.util.Collection<String> lifecycleHookTypes) {
        if (lifecycleHookTypes == null) {
            this.lifecycleHookTypes = null;
            return;
        }

        this.lifecycleHookTypes = new java.util.ArrayList<String>(lifecycleHookTypes);
    }

    /**
     * <p>
     * The lifecycle hook types.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lifecycleHookTypes <p>
     *            The lifecycle hook types.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLifecycleHookTypesResult withLifecycleHookTypes(String... lifecycleHookTypes) {
        if (getLifecycleHookTypes() == null) {
            this.lifecycleHookTypes = new java.util.ArrayList<String>(lifecycleHookTypes.length);
        }
        for (String value : lifecycleHookTypes) {
            this.lifecycleHookTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The lifecycle hook types.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lifecycleHookTypes <p>
     *            The lifecycle hook types.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLifecycleHookTypesResult withLifecycleHookTypes(
            java.util.Collection<String> lifecycleHookTypes) {
        setLifecycleHookTypes(lifecycleHookTypes);
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
        if (getLifecycleHookTypes() != null)
            sb.append("LifecycleHookTypes: " + getLifecycleHookTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLifecycleHookTypes() == null) ? 0 : getLifecycleHookTypes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLifecycleHookTypesResult == false)
            return false;
        DescribeLifecycleHookTypesResult other = (DescribeLifecycleHookTypesResult) obj;

        if (other.getLifecycleHookTypes() == null ^ this.getLifecycleHookTypes() == null)
            return false;
        if (other.getLifecycleHookTypes() != null
                && other.getLifecycleHookTypes().equals(this.getLifecycleHookTypes()) == false)
            return false;
        return true;
    }
}
