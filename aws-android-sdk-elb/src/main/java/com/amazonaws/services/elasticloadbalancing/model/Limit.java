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

package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;

/**
 * <p>
 * Information about an Elastic Load Balancing resource limit for your AWS
 * account.
 * </p>
 */
public class Limit implements Serializable {
    /**
     * <p>
     * The name of the limit. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * classic-listeners
     * </p>
     * </li>
     * <li>
     * <p>
     * classic-load-balancers
     * </p>
     * </li>
     * <li>
     * <p>
     * classic-registered-instances
     * </p>
     * </li>
     * </ul>
     */
    private String name;

    /**
     * <p>
     * The maximum value of the limit.
     * </p>
     */
    private String max;

    /**
     * <p>
     * The name of the limit. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * classic-listeners
     * </p>
     * </li>
     * <li>
     * <p>
     * classic-load-balancers
     * </p>
     * </li>
     * <li>
     * <p>
     * classic-registered-instances
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The name of the limit. The possible values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         classic-listeners
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         classic-load-balancers
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         classic-registered-instances
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the limit. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * classic-listeners
     * </p>
     * </li>
     * <li>
     * <p>
     * classic-load-balancers
     * </p>
     * </li>
     * <li>
     * <p>
     * classic-registered-instances
     * </p>
     * </li>
     * </ul>
     *
     * @param name <p>
     *            The name of the limit. The possible values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            classic-listeners
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            classic-load-balancers
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            classic-registered-instances
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the limit. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * classic-listeners
     * </p>
     * </li>
     * <li>
     * <p>
     * classic-load-balancers
     * </p>
     * </li>
     * <li>
     * <p>
     * classic-registered-instances
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the limit. The possible values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            classic-listeners
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            classic-load-balancers
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            classic-registered-instances
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Limit withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The maximum value of the limit.
     * </p>
     *
     * @return <p>
     *         The maximum value of the limit.
     *         </p>
     */
    public String getMax() {
        return max;
    }

    /**
     * <p>
     * The maximum value of the limit.
     * </p>
     *
     * @param max <p>
     *            The maximum value of the limit.
     *            </p>
     */
    public void setMax(String max) {
        this.max = max;
    }

    /**
     * <p>
     * The maximum value of the limit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param max <p>
     *            The maximum value of the limit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Limit withMax(String max) {
        this.max = max;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getMax() != null)
            sb.append("Max: " + getMax());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMax() == null) ? 0 : getMax().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Limit == false)
            return false;
        Limit other = (Limit) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMax() == null ^ this.getMax() == null)
            return false;
        if (other.getMax() != null && other.getMax().equals(this.getMax()) == false)
            return false;
        return true;
    }
}
