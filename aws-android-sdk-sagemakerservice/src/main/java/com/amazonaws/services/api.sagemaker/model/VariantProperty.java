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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies a production variant property type for an Endpoint.
 * </p>
 * <p>
 * If you are updating an endpoint with the
 * <a>UpdateEndpointInput$RetainAllVariantProperties</a> option set to
 * <code>true</code>, the <code>VariantProperty</code> objects listed in
 * <a>UpdateEndpointInput$ExcludeRetainedVariantProperties</a> override the
 * existing variant properties of the endpoint.
 * </p>
 */
public class VariantProperty implements Serializable {
    /**
     * <p>
     * The type of variant property. The supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DesiredInstanceCount</code>: Overrides the existing variant
     * instance counts using the <a>ProductionVariant$InitialInstanceCount</a>
     * values in the <a>CreateEndpointConfigInput$ProductionVariants</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DesiredWeight</code>: Overrides the existing variant weights using
     * the <a>ProductionVariant$InitialVariantWeight</a> values in the
     * <a>CreateEndpointConfigInput$ProductionVariants</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DataCaptureConfig</code>: (Not currently supported.)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DesiredInstanceCount, DesiredWeight,
     * DataCaptureConfig
     */
    private String variantPropertyType;

    /**
     * <p>
     * The type of variant property. The supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DesiredInstanceCount</code>: Overrides the existing variant
     * instance counts using the <a>ProductionVariant$InitialInstanceCount</a>
     * values in the <a>CreateEndpointConfigInput$ProductionVariants</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DesiredWeight</code>: Overrides the existing variant weights using
     * the <a>ProductionVariant$InitialVariantWeight</a> values in the
     * <a>CreateEndpointConfigInput$ProductionVariants</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DataCaptureConfig</code>: (Not currently supported.)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DesiredInstanceCount, DesiredWeight,
     * DataCaptureConfig
     *
     * @return <p>
     *         The type of variant property. The supported values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DesiredInstanceCount</code>: Overrides the existing variant
     *         instance counts using the
     *         <a>ProductionVariant$InitialInstanceCount</a> values in the
     *         <a>CreateEndpointConfigInput$ProductionVariants</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DesiredWeight</code>: Overrides the existing variant
     *         weights using the <a>ProductionVariant$InitialVariantWeight</a>
     *         values in the
     *         <a>CreateEndpointConfigInput$ProductionVariants</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DataCaptureConfig</code>: (Not currently supported.)
     *         </p>
     *         </li>
     *         </ul>
     * @see VariantPropertyType
     */
    public String getVariantPropertyType() {
        return variantPropertyType;
    }

    /**
     * <p>
     * The type of variant property. The supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DesiredInstanceCount</code>: Overrides the existing variant
     * instance counts using the <a>ProductionVariant$InitialInstanceCount</a>
     * values in the <a>CreateEndpointConfigInput$ProductionVariants</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DesiredWeight</code>: Overrides the existing variant weights using
     * the <a>ProductionVariant$InitialVariantWeight</a> values in the
     * <a>CreateEndpointConfigInput$ProductionVariants</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DataCaptureConfig</code>: (Not currently supported.)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DesiredInstanceCount, DesiredWeight,
     * DataCaptureConfig
     *
     * @param variantPropertyType <p>
     *            The type of variant property. The supported values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DesiredInstanceCount</code>: Overrides the existing
     *            variant instance counts using the
     *            <a>ProductionVariant$InitialInstanceCount</a> values in the
     *            <a>CreateEndpointConfigInput$ProductionVariants</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DesiredWeight</code>: Overrides the existing variant
     *            weights using the
     *            <a>ProductionVariant$InitialVariantWeight</a> values in the
     *            <a>CreateEndpointConfigInput$ProductionVariants</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DataCaptureConfig</code>: (Not currently supported.)
     *            </p>
     *            </li>
     *            </ul>
     * @see VariantPropertyType
     */
    public void setVariantPropertyType(String variantPropertyType) {
        this.variantPropertyType = variantPropertyType;
    }

    /**
     * <p>
     * The type of variant property. The supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DesiredInstanceCount</code>: Overrides the existing variant
     * instance counts using the <a>ProductionVariant$InitialInstanceCount</a>
     * values in the <a>CreateEndpointConfigInput$ProductionVariants</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DesiredWeight</code>: Overrides the existing variant weights using
     * the <a>ProductionVariant$InitialVariantWeight</a> values in the
     * <a>CreateEndpointConfigInput$ProductionVariants</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DataCaptureConfig</code>: (Not currently supported.)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DesiredInstanceCount, DesiredWeight,
     * DataCaptureConfig
     *
     * @param variantPropertyType <p>
     *            The type of variant property. The supported values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DesiredInstanceCount</code>: Overrides the existing
     *            variant instance counts using the
     *            <a>ProductionVariant$InitialInstanceCount</a> values in the
     *            <a>CreateEndpointConfigInput$ProductionVariants</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DesiredWeight</code>: Overrides the existing variant
     *            weights using the
     *            <a>ProductionVariant$InitialVariantWeight</a> values in the
     *            <a>CreateEndpointConfigInput$ProductionVariants</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DataCaptureConfig</code>: (Not currently supported.)
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VariantPropertyType
     */
    public VariantProperty withVariantPropertyType(String variantPropertyType) {
        this.variantPropertyType = variantPropertyType;
        return this;
    }

    /**
     * <p>
     * The type of variant property. The supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DesiredInstanceCount</code>: Overrides the existing variant
     * instance counts using the <a>ProductionVariant$InitialInstanceCount</a>
     * values in the <a>CreateEndpointConfigInput$ProductionVariants</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DesiredWeight</code>: Overrides the existing variant weights using
     * the <a>ProductionVariant$InitialVariantWeight</a> values in the
     * <a>CreateEndpointConfigInput$ProductionVariants</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DataCaptureConfig</code>: (Not currently supported.)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DesiredInstanceCount, DesiredWeight,
     * DataCaptureConfig
     *
     * @param variantPropertyType <p>
     *            The type of variant property. The supported values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DesiredInstanceCount</code>: Overrides the existing
     *            variant instance counts using the
     *            <a>ProductionVariant$InitialInstanceCount</a> values in the
     *            <a>CreateEndpointConfigInput$ProductionVariants</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DesiredWeight</code>: Overrides the existing variant
     *            weights using the
     *            <a>ProductionVariant$InitialVariantWeight</a> values in the
     *            <a>CreateEndpointConfigInput$ProductionVariants</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DataCaptureConfig</code>: (Not currently supported.)
     *            </p>
     *            </li>
     *            </ul>
     * @see VariantPropertyType
     */
    public void setVariantPropertyType(VariantPropertyType variantPropertyType) {
        this.variantPropertyType = variantPropertyType.toString();
    }

    /**
     * <p>
     * The type of variant property. The supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DesiredInstanceCount</code>: Overrides the existing variant
     * instance counts using the <a>ProductionVariant$InitialInstanceCount</a>
     * values in the <a>CreateEndpointConfigInput$ProductionVariants</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DesiredWeight</code>: Overrides the existing variant weights using
     * the <a>ProductionVariant$InitialVariantWeight</a> values in the
     * <a>CreateEndpointConfigInput$ProductionVariants</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DataCaptureConfig</code>: (Not currently supported.)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DesiredInstanceCount, DesiredWeight,
     * DataCaptureConfig
     *
     * @param variantPropertyType <p>
     *            The type of variant property. The supported values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DesiredInstanceCount</code>: Overrides the existing
     *            variant instance counts using the
     *            <a>ProductionVariant$InitialInstanceCount</a> values in the
     *            <a>CreateEndpointConfigInput$ProductionVariants</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DesiredWeight</code>: Overrides the existing variant
     *            weights using the
     *            <a>ProductionVariant$InitialVariantWeight</a> values in the
     *            <a>CreateEndpointConfigInput$ProductionVariants</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DataCaptureConfig</code>: (Not currently supported.)
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VariantPropertyType
     */
    public VariantProperty withVariantPropertyType(VariantPropertyType variantPropertyType) {
        this.variantPropertyType = variantPropertyType.toString();
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
        if (getVariantPropertyType() != null)
            sb.append("VariantPropertyType: " + getVariantPropertyType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVariantPropertyType() == null) ? 0 : getVariantPropertyType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VariantProperty == false)
            return false;
        VariantProperty other = (VariantProperty) obj;

        if (other.getVariantPropertyType() == null ^ this.getVariantPropertyType() == null)
            return false;
        if (other.getVariantPropertyType() != null
                && other.getVariantPropertyType().equals(this.getVariantPropertyType()) == false)
            return false;
        return true;
    }
}
