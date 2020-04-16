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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about how and under what conditions SageMaker creates a
 * human loop. If <code>HumanLoopActivationConfig</code> is not given, then all
 * requests go to humans.
 * </p>
 */
public class HumanLoopActivationConfig implements Serializable {
    /**
     * <p>
     * Container structure for defining under what conditions SageMaker creates
     * a human loop.
     * </p>
     */
    private HumanLoopActivationConditionsConfig humanLoopActivationConditionsConfig;

    /**
     * <p>
     * Container structure for defining under what conditions SageMaker creates
     * a human loop.
     * </p>
     *
     * @return <p>
     *         Container structure for defining under what conditions SageMaker
     *         creates a human loop.
     *         </p>
     */
    public HumanLoopActivationConditionsConfig getHumanLoopActivationConditionsConfig() {
        return humanLoopActivationConditionsConfig;
    }

    /**
     * <p>
     * Container structure for defining under what conditions SageMaker creates
     * a human loop.
     * </p>
     *
     * @param humanLoopActivationConditionsConfig <p>
     *            Container structure for defining under what conditions
     *            SageMaker creates a human loop.
     *            </p>
     */
    public void setHumanLoopActivationConditionsConfig(
            HumanLoopActivationConditionsConfig humanLoopActivationConditionsConfig) {
        this.humanLoopActivationConditionsConfig = humanLoopActivationConditionsConfig;
    }

    /**
     * <p>
     * Container structure for defining under what conditions SageMaker creates
     * a human loop.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param humanLoopActivationConditionsConfig <p>
     *            Container structure for defining under what conditions
     *            SageMaker creates a human loop.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HumanLoopActivationConfig withHumanLoopActivationConditionsConfig(
            HumanLoopActivationConditionsConfig humanLoopActivationConditionsConfig) {
        this.humanLoopActivationConditionsConfig = humanLoopActivationConditionsConfig;
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
        if (getHumanLoopActivationConditionsConfig() != null)
            sb.append("HumanLoopActivationConditionsConfig: "
                    + getHumanLoopActivationConditionsConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getHumanLoopActivationConditionsConfig() == null) ? 0
                        : getHumanLoopActivationConditionsConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HumanLoopActivationConfig == false)
            return false;
        HumanLoopActivationConfig other = (HumanLoopActivationConfig) obj;

        if (other.getHumanLoopActivationConditionsConfig() == null
                ^ this.getHumanLoopActivationConditionsConfig() == null)
            return false;
        if (other.getHumanLoopActivationConditionsConfig() != null
                && other.getHumanLoopActivationConditionsConfig().equals(
                        this.getHumanLoopActivationConditionsConfig()) == false)
            return false;
        return true;
    }
}
