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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deploys the new <code>EndpointConfig</code> specified in the request,
 * switches to using newly created endpoint, and then deletes resources
 * provisioned for the endpoint using the previous <code>EndpointConfig</code>
 * (there is no availability loss).
 * </p>
 * <p>
 * When Amazon SageMaker receives the request, it sets the endpoint status to
 * <code>Updating</code>. After updating the endpoint, it sets the status to
 * <code>InService</code>. To check the status of an endpoint, use the
 * <a>DescribeEndpoint</a> API.
 * </p>
 * <note>
 * <p>
 * You must not delete an <code>EndpointConfig</code> in use by an endpoint that
 * is live or while the <code>UpdateEndpoint</code> or
 * <code>CreateEndpoint</code> operations are being performed on the endpoint.
 * To update an endpoint, you must create a new <code>EndpointConfig</code>.
 * </p>
 * </note>
 */
public class UpdateEndpointRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the endpoint whose configuration you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String endpointName;

    /**
     * <p>
     * The name of the new endpoint configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String endpointConfigName;

    /**
     * <p>
     * When updating endpoint resources, enables or disables the retention of
     * variant properties, such as the instance count or the variant weight. To
     * retain the variant properties of an endpoint when updating it, set
     * <code>RetainAllVariantProperties</code> to <code>true</code>. To use the
     * variant properties specified in a new <code>EndpointConfig</code> call
     * when updating an endpoint, set <code>RetainAllVariantProperties</code> to
     * <code>false</code>.
     * </p>
     */
    private Boolean retainAllVariantProperties;

    /**
     * <p>
     * When you are updating endpoint resources with
     * <a>UpdateEndpointInput$RetainAllVariantProperties</a>, whose value is set
     * to <code>true</code>, <code>ExcludeRetainedVariantProperties</code>
     * specifies the list of type <a>VariantProperty</a> to override with the
     * values provided by <code>EndpointConfig</code>. If you don't specify a
     * value for <code>ExcludeAllVariantProperties</code>, no variant properties
     * are overridden.
     * </p>
     */
    private java.util.List<VariantProperty> excludeRetainedVariantProperties;

    /**
     * <p>
     * The name of the endpoint whose configuration you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the endpoint whose configuration you want to update.
     *         </p>
     */
    public String getEndpointName() {
        return endpointName;
    }

    /**
     * <p>
     * The name of the endpoint whose configuration you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param endpointName <p>
     *            The name of the endpoint whose configuration you want to
     *            update.
     *            </p>
     */
    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * The name of the endpoint whose configuration you want to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param endpointName <p>
     *            The name of the endpoint whose configuration you want to
     *            update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEndpointRequest withEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }

    /**
     * <p>
     * The name of the new endpoint configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the new endpoint configuration.
     *         </p>
     */
    public String getEndpointConfigName() {
        return endpointConfigName;
    }

    /**
     * <p>
     * The name of the new endpoint configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param endpointConfigName <p>
     *            The name of the new endpoint configuration.
     *            </p>
     */
    public void setEndpointConfigName(String endpointConfigName) {
        this.endpointConfigName = endpointConfigName;
    }

    /**
     * <p>
     * The name of the new endpoint configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param endpointConfigName <p>
     *            The name of the new endpoint configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEndpointRequest withEndpointConfigName(String endpointConfigName) {
        this.endpointConfigName = endpointConfigName;
        return this;
    }

    /**
     * <p>
     * When updating endpoint resources, enables or disables the retention of
     * variant properties, such as the instance count or the variant weight. To
     * retain the variant properties of an endpoint when updating it, set
     * <code>RetainAllVariantProperties</code> to <code>true</code>. To use the
     * variant properties specified in a new <code>EndpointConfig</code> call
     * when updating an endpoint, set <code>RetainAllVariantProperties</code> to
     * <code>false</code>.
     * </p>
     *
     * @return <p>
     *         When updating endpoint resources, enables or disables the
     *         retention of variant properties, such as the instance count or
     *         the variant weight. To retain the variant properties of an
     *         endpoint when updating it, set
     *         <code>RetainAllVariantProperties</code> to <code>true</code>. To
     *         use the variant properties specified in a new
     *         <code>EndpointConfig</code> call when updating an endpoint, set
     *         <code>RetainAllVariantProperties</code> to <code>false</code>.
     *         </p>
     */
    public Boolean isRetainAllVariantProperties() {
        return retainAllVariantProperties;
    }

    /**
     * <p>
     * When updating endpoint resources, enables or disables the retention of
     * variant properties, such as the instance count or the variant weight. To
     * retain the variant properties of an endpoint when updating it, set
     * <code>RetainAllVariantProperties</code> to <code>true</code>. To use the
     * variant properties specified in a new <code>EndpointConfig</code> call
     * when updating an endpoint, set <code>RetainAllVariantProperties</code> to
     * <code>false</code>.
     * </p>
     *
     * @return <p>
     *         When updating endpoint resources, enables or disables the
     *         retention of variant properties, such as the instance count or
     *         the variant weight. To retain the variant properties of an
     *         endpoint when updating it, set
     *         <code>RetainAllVariantProperties</code> to <code>true</code>. To
     *         use the variant properties specified in a new
     *         <code>EndpointConfig</code> call when updating an endpoint, set
     *         <code>RetainAllVariantProperties</code> to <code>false</code>.
     *         </p>
     */
    public Boolean getRetainAllVariantProperties() {
        return retainAllVariantProperties;
    }

    /**
     * <p>
     * When updating endpoint resources, enables or disables the retention of
     * variant properties, such as the instance count or the variant weight. To
     * retain the variant properties of an endpoint when updating it, set
     * <code>RetainAllVariantProperties</code> to <code>true</code>. To use the
     * variant properties specified in a new <code>EndpointConfig</code> call
     * when updating an endpoint, set <code>RetainAllVariantProperties</code> to
     * <code>false</code>.
     * </p>
     *
     * @param retainAllVariantProperties <p>
     *            When updating endpoint resources, enables or disables the
     *            retention of variant properties, such as the instance count or
     *            the variant weight. To retain the variant properties of an
     *            endpoint when updating it, set
     *            <code>RetainAllVariantProperties</code> to <code>true</code>.
     *            To use the variant properties specified in a new
     *            <code>EndpointConfig</code> call when updating an endpoint,
     *            set <code>RetainAllVariantProperties</code> to
     *            <code>false</code>.
     *            </p>
     */
    public void setRetainAllVariantProperties(Boolean retainAllVariantProperties) {
        this.retainAllVariantProperties = retainAllVariantProperties;
    }

    /**
     * <p>
     * When updating endpoint resources, enables or disables the retention of
     * variant properties, such as the instance count or the variant weight. To
     * retain the variant properties of an endpoint when updating it, set
     * <code>RetainAllVariantProperties</code> to <code>true</code>. To use the
     * variant properties specified in a new <code>EndpointConfig</code> call
     * when updating an endpoint, set <code>RetainAllVariantProperties</code> to
     * <code>false</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param retainAllVariantProperties <p>
     *            When updating endpoint resources, enables or disables the
     *            retention of variant properties, such as the instance count or
     *            the variant weight. To retain the variant properties of an
     *            endpoint when updating it, set
     *            <code>RetainAllVariantProperties</code> to <code>true</code>.
     *            To use the variant properties specified in a new
     *            <code>EndpointConfig</code> call when updating an endpoint,
     *            set <code>RetainAllVariantProperties</code> to
     *            <code>false</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEndpointRequest withRetainAllVariantProperties(Boolean retainAllVariantProperties) {
        this.retainAllVariantProperties = retainAllVariantProperties;
        return this;
    }

    /**
     * <p>
     * When you are updating endpoint resources with
     * <a>UpdateEndpointInput$RetainAllVariantProperties</a>, whose value is set
     * to <code>true</code>, <code>ExcludeRetainedVariantProperties</code>
     * specifies the list of type <a>VariantProperty</a> to override with the
     * values provided by <code>EndpointConfig</code>. If you don't specify a
     * value for <code>ExcludeAllVariantProperties</code>, no variant properties
     * are overridden.
     * </p>
     *
     * @return <p>
     *         When you are updating endpoint resources with
     *         <a>UpdateEndpointInput$RetainAllVariantProperties</a>, whose
     *         value is set to <code>true</code>,
     *         <code>ExcludeRetainedVariantProperties</code> specifies the list
     *         of type <a>VariantProperty</a> to override with the values
     *         provided by <code>EndpointConfig</code>. If you don't specify a
     *         value for <code>ExcludeAllVariantProperties</code>, no variant
     *         properties are overridden.
     *         </p>
     */
    public java.util.List<VariantProperty> getExcludeRetainedVariantProperties() {
        return excludeRetainedVariantProperties;
    }

    /**
     * <p>
     * When you are updating endpoint resources with
     * <a>UpdateEndpointInput$RetainAllVariantProperties</a>, whose value is set
     * to <code>true</code>, <code>ExcludeRetainedVariantProperties</code>
     * specifies the list of type <a>VariantProperty</a> to override with the
     * values provided by <code>EndpointConfig</code>. If you don't specify a
     * value for <code>ExcludeAllVariantProperties</code>, no variant properties
     * are overridden.
     * </p>
     *
     * @param excludeRetainedVariantProperties <p>
     *            When you are updating endpoint resources with
     *            <a>UpdateEndpointInput$RetainAllVariantProperties</a>, whose
     *            value is set to <code>true</code>,
     *            <code>ExcludeRetainedVariantProperties</code> specifies the
     *            list of type <a>VariantProperty</a> to override with the
     *            values provided by <code>EndpointConfig</code>. If you don't
     *            specify a value for <code>ExcludeAllVariantProperties</code>,
     *            no variant properties are overridden.
     *            </p>
     */
    public void setExcludeRetainedVariantProperties(
            java.util.Collection<VariantProperty> excludeRetainedVariantProperties) {
        if (excludeRetainedVariantProperties == null) {
            this.excludeRetainedVariantProperties = null;
            return;
        }

        this.excludeRetainedVariantProperties = new java.util.ArrayList<VariantProperty>(
                excludeRetainedVariantProperties);
    }

    /**
     * <p>
     * When you are updating endpoint resources with
     * <a>UpdateEndpointInput$RetainAllVariantProperties</a>, whose value is set
     * to <code>true</code>, <code>ExcludeRetainedVariantProperties</code>
     * specifies the list of type <a>VariantProperty</a> to override with the
     * values provided by <code>EndpointConfig</code>. If you don't specify a
     * value for <code>ExcludeAllVariantProperties</code>, no variant properties
     * are overridden.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param excludeRetainedVariantProperties <p>
     *            When you are updating endpoint resources with
     *            <a>UpdateEndpointInput$RetainAllVariantProperties</a>, whose
     *            value is set to <code>true</code>,
     *            <code>ExcludeRetainedVariantProperties</code> specifies the
     *            list of type <a>VariantProperty</a> to override with the
     *            values provided by <code>EndpointConfig</code>. If you don't
     *            specify a value for <code>ExcludeAllVariantProperties</code>,
     *            no variant properties are overridden.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEndpointRequest withExcludeRetainedVariantProperties(
            VariantProperty... excludeRetainedVariantProperties) {
        if (getExcludeRetainedVariantProperties() == null) {
            this.excludeRetainedVariantProperties = new java.util.ArrayList<VariantProperty>(
                    excludeRetainedVariantProperties.length);
        }
        for (VariantProperty value : excludeRetainedVariantProperties) {
            this.excludeRetainedVariantProperties.add(value);
        }
        return this;
    }

    /**
     * <p>
     * When you are updating endpoint resources with
     * <a>UpdateEndpointInput$RetainAllVariantProperties</a>, whose value is set
     * to <code>true</code>, <code>ExcludeRetainedVariantProperties</code>
     * specifies the list of type <a>VariantProperty</a> to override with the
     * values provided by <code>EndpointConfig</code>. If you don't specify a
     * value for <code>ExcludeAllVariantProperties</code>, no variant properties
     * are overridden.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param excludeRetainedVariantProperties <p>
     *            When you are updating endpoint resources with
     *            <a>UpdateEndpointInput$RetainAllVariantProperties</a>, whose
     *            value is set to <code>true</code>,
     *            <code>ExcludeRetainedVariantProperties</code> specifies the
     *            list of type <a>VariantProperty</a> to override with the
     *            values provided by <code>EndpointConfig</code>. If you don't
     *            specify a value for <code>ExcludeAllVariantProperties</code>,
     *            no variant properties are overridden.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEndpointRequest withExcludeRetainedVariantProperties(
            java.util.Collection<VariantProperty> excludeRetainedVariantProperties) {
        setExcludeRetainedVariantProperties(excludeRetainedVariantProperties);
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
        if (getEndpointName() != null)
            sb.append("EndpointName: " + getEndpointName() + ",");
        if (getEndpointConfigName() != null)
            sb.append("EndpointConfigName: " + getEndpointConfigName() + ",");
        if (getRetainAllVariantProperties() != null)
            sb.append("RetainAllVariantProperties: " + getRetainAllVariantProperties() + ",");
        if (getExcludeRetainedVariantProperties() != null)
            sb.append("ExcludeRetainedVariantProperties: " + getExcludeRetainedVariantProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        hashCode = prime * hashCode
                + ((getEndpointConfigName() == null) ? 0 : getEndpointConfigName().hashCode());
        hashCode = prime
                * hashCode
                + ((getRetainAllVariantProperties() == null) ? 0 : getRetainAllVariantProperties()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getExcludeRetainedVariantProperties() == null) ? 0
                        : getExcludeRetainedVariantProperties().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEndpointRequest == false)
            return false;
        UpdateEndpointRequest other = (UpdateEndpointRequest) obj;

        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null
                && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        if (other.getEndpointConfigName() == null ^ this.getEndpointConfigName() == null)
            return false;
        if (other.getEndpointConfigName() != null
                && other.getEndpointConfigName().equals(this.getEndpointConfigName()) == false)
            return false;
        if (other.getRetainAllVariantProperties() == null
                ^ this.getRetainAllVariantProperties() == null)
            return false;
        if (other.getRetainAllVariantProperties() != null
                && other.getRetainAllVariantProperties().equals(
                        this.getRetainAllVariantProperties()) == false)
            return false;
        if (other.getExcludeRetainedVariantProperties() == null
                ^ this.getExcludeRetainedVariantProperties() == null)
            return false;
        if (other.getExcludeRetainedVariantProperties() != null
                && other.getExcludeRetainedVariantProperties().equals(
                        this.getExcludeRetainedVariantProperties()) == false)
            return false;
        return true;
    }
}
