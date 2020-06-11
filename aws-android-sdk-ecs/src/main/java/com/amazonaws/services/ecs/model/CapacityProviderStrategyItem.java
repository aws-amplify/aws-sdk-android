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

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * <p>
 * The details of a capacity provider strategy.
 * </p>
 */
public class CapacityProviderStrategyItem implements Serializable {
    /**
     * <p>
     * The short name of the capacity provider.
     * </p>
     */
    private String capacityProvider;

    /**
     * <p>
     * The <i>weight</i> value designates the relative percentage of the total
     * number of tasks launched that should use the specified capacity provider.
     * </p>
     * <p>
     * For example, if you have a strategy that contains two capacity providers
     * and both have a weight of <code>1</code>, then when the <code>base</code>
     * is satisfied, the tasks will be split evenly across the two capacity
     * providers. Using that same logic, if you specify a weight of
     * <code>1</code> for <i>capacityProviderA</i> and a weight of
     * <code>4</code> for <i>capacityProviderB</i>, then for every one task that
     * is run using <i>capacityProviderA</i>, four tasks would use
     * <i>capacityProviderB</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     */
    private Integer weight;

    /**
     * <p>
     * The <i>base</i> value designates how many tasks, at a minimum, to run on
     * the specified capacity provider. Only one capacity provider in a capacity
     * provider strategy can have a <i>base</i> defined.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100000<br/>
     */
    private Integer base;

    /**
     * <p>
     * The short name of the capacity provider.
     * </p>
     *
     * @return <p>
     *         The short name of the capacity provider.
     *         </p>
     */
    public String getCapacityProvider() {
        return capacityProvider;
    }

    /**
     * <p>
     * The short name of the capacity provider.
     * </p>
     *
     * @param capacityProvider <p>
     *            The short name of the capacity provider.
     *            </p>
     */
    public void setCapacityProvider(String capacityProvider) {
        this.capacityProvider = capacityProvider;
    }

    /**
     * <p>
     * The short name of the capacity provider.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capacityProvider <p>
     *            The short name of the capacity provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CapacityProviderStrategyItem withCapacityProvider(String capacityProvider) {
        this.capacityProvider = capacityProvider;
        return this;
    }

    /**
     * <p>
     * The <i>weight</i> value designates the relative percentage of the total
     * number of tasks launched that should use the specified capacity provider.
     * </p>
     * <p>
     * For example, if you have a strategy that contains two capacity providers
     * and both have a weight of <code>1</code>, then when the <code>base</code>
     * is satisfied, the tasks will be split evenly across the two capacity
     * providers. Using that same logic, if you specify a weight of
     * <code>1</code> for <i>capacityProviderA</i> and a weight of
     * <code>4</code> for <i>capacityProviderB</i>, then for every one task that
     * is run using <i>capacityProviderA</i>, four tasks would use
     * <i>capacityProviderB</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     *
     * @return <p>
     *         The <i>weight</i> value designates the relative percentage of the
     *         total number of tasks launched that should use the specified
     *         capacity provider.
     *         </p>
     *         <p>
     *         For example, if you have a strategy that contains two capacity
     *         providers and both have a weight of <code>1</code>, then when the
     *         <code>base</code> is satisfied, the tasks will be split evenly
     *         across the two capacity providers. Using that same logic, if you
     *         specify a weight of <code>1</code> for <i>capacityProviderA</i>
     *         and a weight of <code>4</code> for <i>capacityProviderB</i>, then
     *         for every one task that is run using <i>capacityProviderA</i>,
     *         four tasks would use <i>capacityProviderB</i>.
     *         </p>
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * <p>
     * The <i>weight</i> value designates the relative percentage of the total
     * number of tasks launched that should use the specified capacity provider.
     * </p>
     * <p>
     * For example, if you have a strategy that contains two capacity providers
     * and both have a weight of <code>1</code>, then when the <code>base</code>
     * is satisfied, the tasks will be split evenly across the two capacity
     * providers. Using that same logic, if you specify a weight of
     * <code>1</code> for <i>capacityProviderA</i> and a weight of
     * <code>4</code> for <i>capacityProviderB</i>, then for every one task that
     * is run using <i>capacityProviderA</i>, four tasks would use
     * <i>capacityProviderB</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     *
     * @param weight <p>
     *            The <i>weight</i> value designates the relative percentage of
     *            the total number of tasks launched that should use the
     *            specified capacity provider.
     *            </p>
     *            <p>
     *            For example, if you have a strategy that contains two capacity
     *            providers and both have a weight of <code>1</code>, then when
     *            the <code>base</code> is satisfied, the tasks will be split
     *            evenly across the two capacity providers. Using that same
     *            logic, if you specify a weight of <code>1</code> for
     *            <i>capacityProviderA</i> and a weight of <code>4</code> for
     *            <i>capacityProviderB</i>, then for every one task that is run
     *            using <i>capacityProviderA</i>, four tasks would use
     *            <i>capacityProviderB</i>.
     *            </p>
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * <p>
     * The <i>weight</i> value designates the relative percentage of the total
     * number of tasks launched that should use the specified capacity provider.
     * </p>
     * <p>
     * For example, if you have a strategy that contains two capacity providers
     * and both have a weight of <code>1</code>, then when the <code>base</code>
     * is satisfied, the tasks will be split evenly across the two capacity
     * providers. Using that same logic, if you specify a weight of
     * <code>1</code> for <i>capacityProviderA</i> and a weight of
     * <code>4</code> for <i>capacityProviderB</i>, then for every one task that
     * is run using <i>capacityProviderA</i>, four tasks would use
     * <i>capacityProviderB</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     *
     * @param weight <p>
     *            The <i>weight</i> value designates the relative percentage of
     *            the total number of tasks launched that should use the
     *            specified capacity provider.
     *            </p>
     *            <p>
     *            For example, if you have a strategy that contains two capacity
     *            providers and both have a weight of <code>1</code>, then when
     *            the <code>base</code> is satisfied, the tasks will be split
     *            evenly across the two capacity providers. Using that same
     *            logic, if you specify a weight of <code>1</code> for
     *            <i>capacityProviderA</i> and a weight of <code>4</code> for
     *            <i>capacityProviderB</i>, then for every one task that is run
     *            using <i>capacityProviderA</i>, four tasks would use
     *            <i>capacityProviderB</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CapacityProviderStrategyItem withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * <p>
     * The <i>base</i> value designates how many tasks, at a minimum, to run on
     * the specified capacity provider. Only one capacity provider in a capacity
     * provider strategy can have a <i>base</i> defined.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100000<br/>
     *
     * @return <p>
     *         The <i>base</i> value designates how many tasks, at a minimum, to
     *         run on the specified capacity provider. Only one capacity
     *         provider in a capacity provider strategy can have a <i>base</i>
     *         defined.
     *         </p>
     */
    public Integer getBase() {
        return base;
    }

    /**
     * <p>
     * The <i>base</i> value designates how many tasks, at a minimum, to run on
     * the specified capacity provider. Only one capacity provider in a capacity
     * provider strategy can have a <i>base</i> defined.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100000<br/>
     *
     * @param base <p>
     *            The <i>base</i> value designates how many tasks, at a minimum,
     *            to run on the specified capacity provider. Only one capacity
     *            provider in a capacity provider strategy can have a
     *            <i>base</i> defined.
     *            </p>
     */
    public void setBase(Integer base) {
        this.base = base;
    }

    /**
     * <p>
     * The <i>base</i> value designates how many tasks, at a minimum, to run on
     * the specified capacity provider. Only one capacity provider in a capacity
     * provider strategy can have a <i>base</i> defined.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100000<br/>
     *
     * @param base <p>
     *            The <i>base</i> value designates how many tasks, at a minimum,
     *            to run on the specified capacity provider. Only one capacity
     *            provider in a capacity provider strategy can have a
     *            <i>base</i> defined.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CapacityProviderStrategyItem withBase(Integer base) {
        this.base = base;
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
        if (getCapacityProvider() != null)
            sb.append("capacityProvider: " + getCapacityProvider() + ",");
        if (getWeight() != null)
            sb.append("weight: " + getWeight() + ",");
        if (getBase() != null)
            sb.append("base: " + getBase());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCapacityProvider() == null) ? 0 : getCapacityProvider().hashCode());
        hashCode = prime * hashCode + ((getWeight() == null) ? 0 : getWeight().hashCode());
        hashCode = prime * hashCode + ((getBase() == null) ? 0 : getBase().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CapacityProviderStrategyItem == false)
            return false;
        CapacityProviderStrategyItem other = (CapacityProviderStrategyItem) obj;

        if (other.getCapacityProvider() == null ^ this.getCapacityProvider() == null)
            return false;
        if (other.getCapacityProvider() != null
                && other.getCapacityProvider().equals(this.getCapacityProvider()) == false)
            return false;
        if (other.getWeight() == null ^ this.getWeight() == null)
            return false;
        if (other.getWeight() != null && other.getWeight().equals(this.getWeight()) == false)
            return false;
        if (other.getBase() == null ^ this.getBase() == null)
            return false;
        if (other.getBase() != null && other.getBase().equals(this.getBase()) == false)
            return false;
        return true;
    }
}
