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
 * Describes the Classic Load Balancers to attach to a Spot Fleet. Spot Fleet
 * registers the running Spot Instances with these Classic Load Balancers.
 * </p>
 */
public class ClassicLoadBalancersConfig implements Serializable {
    /**
     * <p>
     * One or more Classic Load Balancers.
     * </p>
     */
    private java.util.List<ClassicLoadBalancer> classicLoadBalancers;

    /**
     * <p>
     * One or more Classic Load Balancers.
     * </p>
     *
     * @return <p>
     *         One or more Classic Load Balancers.
     *         </p>
     */
    public java.util.List<ClassicLoadBalancer> getClassicLoadBalancers() {
        return classicLoadBalancers;
    }

    /**
     * <p>
     * One or more Classic Load Balancers.
     * </p>
     *
     * @param classicLoadBalancers <p>
     *            One or more Classic Load Balancers.
     *            </p>
     */
    public void setClassicLoadBalancers(
            java.util.Collection<ClassicLoadBalancer> classicLoadBalancers) {
        if (classicLoadBalancers == null) {
            this.classicLoadBalancers = null;
            return;
        }

        this.classicLoadBalancers = new java.util.ArrayList<ClassicLoadBalancer>(
                classicLoadBalancers);
    }

    /**
     * <p>
     * One or more Classic Load Balancers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param classicLoadBalancers <p>
     *            One or more Classic Load Balancers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassicLoadBalancersConfig withClassicLoadBalancers(
            ClassicLoadBalancer... classicLoadBalancers) {
        if (getClassicLoadBalancers() == null) {
            this.classicLoadBalancers = new java.util.ArrayList<ClassicLoadBalancer>(
                    classicLoadBalancers.length);
        }
        for (ClassicLoadBalancer value : classicLoadBalancers) {
            this.classicLoadBalancers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more Classic Load Balancers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param classicLoadBalancers <p>
     *            One or more Classic Load Balancers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassicLoadBalancersConfig withClassicLoadBalancers(
            java.util.Collection<ClassicLoadBalancer> classicLoadBalancers) {
        setClassicLoadBalancers(classicLoadBalancers);
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
        if (getClassicLoadBalancers() != null)
            sb.append("ClassicLoadBalancers: " + getClassicLoadBalancers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClassicLoadBalancers() == null) ? 0 : getClassicLoadBalancers().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClassicLoadBalancersConfig == false)
            return false;
        ClassicLoadBalancersConfig other = (ClassicLoadBalancersConfig) obj;

        if (other.getClassicLoadBalancers() == null ^ this.getClassicLoadBalancers() == null)
            return false;
        if (other.getClassicLoadBalancers() != null
                && other.getClassicLoadBalancers().equals(this.getClassicLoadBalancers()) == false)
            return false;
        return true;
    }
}
