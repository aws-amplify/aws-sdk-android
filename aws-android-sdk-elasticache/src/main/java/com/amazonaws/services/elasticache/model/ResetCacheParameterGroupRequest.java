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

package com.amazonaws.services.elasticache.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Modifies the parameters of a cache parameter group to the engine or system
 * default value. You can reset specific parameters by submitting a list of
 * parameter names. To reset the entire cache parameter group, specify the
 * <code>ResetAllParameters</code> and <code>CacheParameterGroupName</code>
 * parameters.
 * </p>
 */
public class ResetCacheParameterGroupRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the cache parameter group to reset.
     * </p>
     */
    private String cacheParameterGroupName;

    /**
     * <p>
     * If <code>true</code>, all parameters in the cache parameter group are
     * reset to their default values. If <code>false</code>, only the parameters
     * listed by <code>ParameterNameValues</code> are reset to their default
     * values.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     */
    private Boolean resetAllParameters;

    /**
     * <p>
     * An array of parameter names to reset to their default values. If
     * <code>ResetAllParameters</code> is <code>true</code>, do not use
     * <code>ParameterNameValues</code>. If <code>ResetAllParameters</code> is
     * <code>false</code>, you must specify the name of at least one parameter
     * to reset.
     * </p>
     */
    private java.util.List<ParameterNameValue> parameterNameValues;

    /**
     * <p>
     * The name of the cache parameter group to reset.
     * </p>
     *
     * @return <p>
     *         The name of the cache parameter group to reset.
     *         </p>
     */
    public String getCacheParameterGroupName() {
        return cacheParameterGroupName;
    }

    /**
     * <p>
     * The name of the cache parameter group to reset.
     * </p>
     *
     * @param cacheParameterGroupName <p>
     *            The name of the cache parameter group to reset.
     *            </p>
     */
    public void setCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
    }

    /**
     * <p>
     * The name of the cache parameter group to reset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheParameterGroupName <p>
     *            The name of the cache parameter group to reset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResetCacheParameterGroupRequest withCacheParameterGroupName(
            String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, all parameters in the cache parameter group are
     * reset to their default values. If <code>false</code>, only the parameters
     * listed by <code>ParameterNameValues</code> are reset to their default
     * values.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     *
     * @return <p>
     *         If <code>true</code>, all parameters in the cache parameter group
     *         are reset to their default values. If <code>false</code>, only
     *         the parameters listed by <code>ParameterNameValues</code> are
     *         reset to their default values.
     *         </p>
     *         <p>
     *         Valid values: <code>true</code> | <code>false</code>
     *         </p>
     */
    public Boolean isResetAllParameters() {
        return resetAllParameters;
    }

    /**
     * <p>
     * If <code>true</code>, all parameters in the cache parameter group are
     * reset to their default values. If <code>false</code>, only the parameters
     * listed by <code>ParameterNameValues</code> are reset to their default
     * values.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     *
     * @return <p>
     *         If <code>true</code>, all parameters in the cache parameter group
     *         are reset to their default values. If <code>false</code>, only
     *         the parameters listed by <code>ParameterNameValues</code> are
     *         reset to their default values.
     *         </p>
     *         <p>
     *         Valid values: <code>true</code> | <code>false</code>
     *         </p>
     */
    public Boolean getResetAllParameters() {
        return resetAllParameters;
    }

    /**
     * <p>
     * If <code>true</code>, all parameters in the cache parameter group are
     * reset to their default values. If <code>false</code>, only the parameters
     * listed by <code>ParameterNameValues</code> are reset to their default
     * values.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     *
     * @param resetAllParameters <p>
     *            If <code>true</code>, all parameters in the cache parameter
     *            group are reset to their default values. If <code>false</code>
     *            , only the parameters listed by
     *            <code>ParameterNameValues</code> are reset to their default
     *            values.
     *            </p>
     *            <p>
     *            Valid values: <code>true</code> | <code>false</code>
     *            </p>
     */
    public void setResetAllParameters(Boolean resetAllParameters) {
        this.resetAllParameters = resetAllParameters;
    }

    /**
     * <p>
     * If <code>true</code>, all parameters in the cache parameter group are
     * reset to their default values. If <code>false</code>, only the parameters
     * listed by <code>ParameterNameValues</code> are reset to their default
     * values.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resetAllParameters <p>
     *            If <code>true</code>, all parameters in the cache parameter
     *            group are reset to their default values. If <code>false</code>
     *            , only the parameters listed by
     *            <code>ParameterNameValues</code> are reset to their default
     *            values.
     *            </p>
     *            <p>
     *            Valid values: <code>true</code> | <code>false</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResetCacheParameterGroupRequest withResetAllParameters(Boolean resetAllParameters) {
        this.resetAllParameters = resetAllParameters;
        return this;
    }

    /**
     * <p>
     * An array of parameter names to reset to their default values. If
     * <code>ResetAllParameters</code> is <code>true</code>, do not use
     * <code>ParameterNameValues</code>. If <code>ResetAllParameters</code> is
     * <code>false</code>, you must specify the name of at least one parameter
     * to reset.
     * </p>
     *
     * @return <p>
     *         An array of parameter names to reset to their default values. If
     *         <code>ResetAllParameters</code> is <code>true</code>, do not use
     *         <code>ParameterNameValues</code>. If
     *         <code>ResetAllParameters</code> is <code>false</code>, you must
     *         specify the name of at least one parameter to reset.
     *         </p>
     */
    public java.util.List<ParameterNameValue> getParameterNameValues() {
        return parameterNameValues;
    }

    /**
     * <p>
     * An array of parameter names to reset to their default values. If
     * <code>ResetAllParameters</code> is <code>true</code>, do not use
     * <code>ParameterNameValues</code>. If <code>ResetAllParameters</code> is
     * <code>false</code>, you must specify the name of at least one parameter
     * to reset.
     * </p>
     *
     * @param parameterNameValues <p>
     *            An array of parameter names to reset to their default values.
     *            If <code>ResetAllParameters</code> is <code>true</code>, do
     *            not use <code>ParameterNameValues</code>. If
     *            <code>ResetAllParameters</code> is <code>false</code>, you
     *            must specify the name of at least one parameter to reset.
     *            </p>
     */
    public void setParameterNameValues(java.util.Collection<ParameterNameValue> parameterNameValues) {
        if (parameterNameValues == null) {
            this.parameterNameValues = null;
            return;
        }

        this.parameterNameValues = new java.util.ArrayList<ParameterNameValue>(parameterNameValues);
    }

    /**
     * <p>
     * An array of parameter names to reset to their default values. If
     * <code>ResetAllParameters</code> is <code>true</code>, do not use
     * <code>ParameterNameValues</code>. If <code>ResetAllParameters</code> is
     * <code>false</code>, you must specify the name of at least one parameter
     * to reset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameterNameValues <p>
     *            An array of parameter names to reset to their default values.
     *            If <code>ResetAllParameters</code> is <code>true</code>, do
     *            not use <code>ParameterNameValues</code>. If
     *            <code>ResetAllParameters</code> is <code>false</code>, you
     *            must specify the name of at least one parameter to reset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResetCacheParameterGroupRequest withParameterNameValues(
            ParameterNameValue... parameterNameValues) {
        if (getParameterNameValues() == null) {
            this.parameterNameValues = new java.util.ArrayList<ParameterNameValue>(
                    parameterNameValues.length);
        }
        for (ParameterNameValue value : parameterNameValues) {
            this.parameterNameValues.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of parameter names to reset to their default values. If
     * <code>ResetAllParameters</code> is <code>true</code>, do not use
     * <code>ParameterNameValues</code>. If <code>ResetAllParameters</code> is
     * <code>false</code>, you must specify the name of at least one parameter
     * to reset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameterNameValues <p>
     *            An array of parameter names to reset to their default values.
     *            If <code>ResetAllParameters</code> is <code>true</code>, do
     *            not use <code>ParameterNameValues</code>. If
     *            <code>ResetAllParameters</code> is <code>false</code>, you
     *            must specify the name of at least one parameter to reset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResetCacheParameterGroupRequest withParameterNameValues(
            java.util.Collection<ParameterNameValue> parameterNameValues) {
        setParameterNameValues(parameterNameValues);
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
        if (getCacheParameterGroupName() != null)
            sb.append("CacheParameterGroupName: " + getCacheParameterGroupName() + ",");
        if (getResetAllParameters() != null)
            sb.append("ResetAllParameters: " + getResetAllParameters() + ",");
        if (getParameterNameValues() != null)
            sb.append("ParameterNameValues: " + getParameterNameValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCacheParameterGroupName() == null) ? 0 : getCacheParameterGroupName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getResetAllParameters() == null) ? 0 : getResetAllParameters().hashCode());
        hashCode = prime * hashCode
                + ((getParameterNameValues() == null) ? 0 : getParameterNameValues().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResetCacheParameterGroupRequest == false)
            return false;
        ResetCacheParameterGroupRequest other = (ResetCacheParameterGroupRequest) obj;

        if (other.getCacheParameterGroupName() == null ^ this.getCacheParameterGroupName() == null)
            return false;
        if (other.getCacheParameterGroupName() != null
                && other.getCacheParameterGroupName().equals(this.getCacheParameterGroupName()) == false)
            return false;
        if (other.getResetAllParameters() == null ^ this.getResetAllParameters() == null)
            return false;
        if (other.getResetAllParameters() != null
                && other.getResetAllParameters().equals(this.getResetAllParameters()) == false)
            return false;
        if (other.getParameterNameValues() == null ^ this.getParameterNameValues() == null)
            return false;
        if (other.getParameterNameValues() != null
                && other.getParameterNameValues().equals(this.getParameterNameValues()) == false)
            return false;
        return true;
    }
}
