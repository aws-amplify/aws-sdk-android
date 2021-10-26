/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.chimesdkmessaging.model;

import java.io.Serializable;

/**
 * <p>
 * A processor's metadata.
 * </p>
 */
public class ProcessorConfiguration implements Serializable {
    /**
     * <p>
     * Indicates that the processor is of type Lambda.
     * </p>
     */
    private LambdaConfiguration lambda;

    /**
     * <p>
     * Indicates that the processor is of type Lambda.
     * </p>
     *
     * @return <p>
     *         Indicates that the processor is of type Lambda.
     *         </p>
     */
    public LambdaConfiguration getLambda() {
        return lambda;
    }

    /**
     * <p>
     * Indicates that the processor is of type Lambda.
     * </p>
     *
     * @param lambda <p>
     *            Indicates that the processor is of type Lambda.
     *            </p>
     */
    public void setLambda(LambdaConfiguration lambda) {
        this.lambda = lambda;
    }

    /**
     * <p>
     * Indicates that the processor is of type Lambda.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lambda <p>
     *            Indicates that the processor is of type Lambda.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessorConfiguration withLambda(LambdaConfiguration lambda) {
        this.lambda = lambda;
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
        if (getLambda() != null)
            sb.append("Lambda: " + getLambda());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLambda() == null) ? 0 : getLambda().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProcessorConfiguration == false)
            return false;
        ProcessorConfiguration other = (ProcessorConfiguration) obj;

        if (other.getLambda() == null ^ this.getLambda() == null)
            return false;
        if (other.getLambda() != null && other.getLambda().equals(this.getLambda()) == false)
            return false;
        return true;
    }
}
