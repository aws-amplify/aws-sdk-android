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

package com.amazonaws.services.api.ecr.model;

import java.io.Serializable;

public class BatchCheckLayerAvailabilityResult implements Serializable {
    /**
     * <p>
     * A list of image layer objects corresponding to the image layer references
     * in the request.
     * </p>
     */
    private java.util.List<Layer> layers;

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     */
    private java.util.List<LayerFailure> failures;

    /**
     * <p>
     * A list of image layer objects corresponding to the image layer references
     * in the request.
     * </p>
     *
     * @return <p>
     *         A list of image layer objects corresponding to the image layer
     *         references in the request.
     *         </p>
     */
    public java.util.List<Layer> getLayers() {
        return layers;
    }

    /**
     * <p>
     * A list of image layer objects corresponding to the image layer references
     * in the request.
     * </p>
     *
     * @param layers <p>
     *            A list of image layer objects corresponding to the image layer
     *            references in the request.
     *            </p>
     */
    public void setLayers(java.util.Collection<Layer> layers) {
        if (layers == null) {
            this.layers = null;
            return;
        }

        this.layers = new java.util.ArrayList<Layer>(layers);
    }

    /**
     * <p>
     * A list of image layer objects corresponding to the image layer references
     * in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param layers <p>
     *            A list of image layer objects corresponding to the image layer
     *            references in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchCheckLayerAvailabilityResult withLayers(Layer... layers) {
        if (getLayers() == null) {
            this.layers = new java.util.ArrayList<Layer>(layers.length);
        }
        for (Layer value : layers) {
            this.layers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of image layer objects corresponding to the image layer references
     * in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param layers <p>
     *            A list of image layer objects corresponding to the image layer
     *            references in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchCheckLayerAvailabilityResult withLayers(java.util.Collection<Layer> layers) {
        setLayers(layers);
        return this;
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     *
     * @return <p>
     *         Any failures associated with the call.
     *         </p>
     */
    public java.util.List<LayerFailure> getFailures() {
        return failures;
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     *
     * @param failures <p>
     *            Any failures associated with the call.
     *            </p>
     */
    public void setFailures(java.util.Collection<LayerFailure> failures) {
        if (failures == null) {
            this.failures = null;
            return;
        }

        this.failures = new java.util.ArrayList<LayerFailure>(failures);
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failures <p>
     *            Any failures associated with the call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchCheckLayerAvailabilityResult withFailures(LayerFailure... failures) {
        if (getFailures() == null) {
            this.failures = new java.util.ArrayList<LayerFailure>(failures.length);
        }
        for (LayerFailure value : failures) {
            this.failures.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failures <p>
     *            Any failures associated with the call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchCheckLayerAvailabilityResult withFailures(
            java.util.Collection<LayerFailure> failures) {
        setFailures(failures);
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
        if (getLayers() != null)
            sb.append("layers: " + getLayers() + ",");
        if (getFailures() != null)
            sb.append("failures: " + getFailures());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLayers() == null) ? 0 : getLayers().hashCode());
        hashCode = prime * hashCode + ((getFailures() == null) ? 0 : getFailures().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchCheckLayerAvailabilityResult == false)
            return false;
        BatchCheckLayerAvailabilityResult other = (BatchCheckLayerAvailabilityResult) obj;

        if (other.getLayers() == null ^ this.getLayers() == null)
            return false;
        if (other.getLayers() != null && other.getLayers().equals(this.getLayers()) == false)
            return false;
        if (other.getFailures() == null ^ this.getFailures() == null)
            return false;
        if (other.getFailures() != null && other.getFailures().equals(this.getFailures()) == false)
            return false;
        return true;
    }
}
