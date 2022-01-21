/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class DescribeInstanceResult implements Serializable {
    /**
     * <p>
     * The name of the instance.
     * </p>
     */
    private Instance instance;

    /**
     * <p>
     * The name of the instance.
     * </p>
     *
     * @return <p>
     *         The name of the instance.
     *         </p>
     */
    public Instance getInstance() {
        return instance;
    }

    /**
     * <p>
     * The name of the instance.
     * </p>
     *
     * @param instance <p>
     *            The name of the instance.
     *            </p>
     */
    public void setInstance(Instance instance) {
        this.instance = instance;
    }

    /**
     * <p>
     * The name of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instance <p>
     *            The name of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceResult withInstance(Instance instance) {
        this.instance = instance;
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
        if (getInstance() != null)
            sb.append("Instance: " + getInstance());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstance() == null) ? 0 : getInstance().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInstanceResult == false)
            return false;
        DescribeInstanceResult other = (DescribeInstanceResult) obj;

        if (other.getInstance() == null ^ this.getInstance() == null)
            return false;
        if (other.getInstance() != null && other.getInstance().equals(this.getInstance()) == false)
            return false;
        return true;
    }
}
