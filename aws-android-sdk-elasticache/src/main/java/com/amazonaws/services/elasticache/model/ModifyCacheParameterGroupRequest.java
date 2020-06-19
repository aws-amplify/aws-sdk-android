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
 * Modifies the parameters of a cache parameter group. You can modify up to 20
 * parameters in a single request by submitting a list parameter name and value
 * pairs.
 * </p>
 */
public class ModifyCacheParameterGroupRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the cache parameter group to modify.
     * </p>
     */
    private String cacheParameterGroupName;

    /**
     * <p>
     * An array of parameter names and values for the parameter update. You must
     * supply at least one parameter name and value; subsequent arguments are
     * optional. A maximum of 20 parameters may be modified per request.
     * </p>
     */
    private java.util.List<ParameterNameValue> parameterNameValues;

    /**
     * <p>
     * The name of the cache parameter group to modify.
     * </p>
     *
     * @return <p>
     *         The name of the cache parameter group to modify.
     *         </p>
     */
    public String getCacheParameterGroupName() {
        return cacheParameterGroupName;
    }

    /**
     * <p>
     * The name of the cache parameter group to modify.
     * </p>
     *
     * @param cacheParameterGroupName <p>
     *            The name of the cache parameter group to modify.
     *            </p>
     */
    public void setCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
    }

    /**
     * <p>
     * The name of the cache parameter group to modify.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheParameterGroupName <p>
     *            The name of the cache parameter group to modify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyCacheParameterGroupRequest withCacheParameterGroupName(
            String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
        return this;
    }

    /**
     * <p>
     * An array of parameter names and values for the parameter update. You must
     * supply at least one parameter name and value; subsequent arguments are
     * optional. A maximum of 20 parameters may be modified per request.
     * </p>
     *
     * @return <p>
     *         An array of parameter names and values for the parameter update.
     *         You must supply at least one parameter name and value; subsequent
     *         arguments are optional. A maximum of 20 parameters may be
     *         modified per request.
     *         </p>
     */
    public java.util.List<ParameterNameValue> getParameterNameValues() {
        return parameterNameValues;
    }

    /**
     * <p>
     * An array of parameter names and values for the parameter update. You must
     * supply at least one parameter name and value; subsequent arguments are
     * optional. A maximum of 20 parameters may be modified per request.
     * </p>
     *
     * @param parameterNameValues <p>
     *            An array of parameter names and values for the parameter
     *            update. You must supply at least one parameter name and value;
     *            subsequent arguments are optional. A maximum of 20 parameters
     *            may be modified per request.
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
     * An array of parameter names and values for the parameter update. You must
     * supply at least one parameter name and value; subsequent arguments are
     * optional. A maximum of 20 parameters may be modified per request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameterNameValues <p>
     *            An array of parameter names and values for the parameter
     *            update. You must supply at least one parameter name and value;
     *            subsequent arguments are optional. A maximum of 20 parameters
     *            may be modified per request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyCacheParameterGroupRequest withParameterNameValues(
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
     * An array of parameter names and values for the parameter update. You must
     * supply at least one parameter name and value; subsequent arguments are
     * optional. A maximum of 20 parameters may be modified per request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameterNameValues <p>
     *            An array of parameter names and values for the parameter
     *            update. You must supply at least one parameter name and value;
     *            subsequent arguments are optional. A maximum of 20 parameters
     *            may be modified per request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyCacheParameterGroupRequest withParameterNameValues(
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
                + ((getParameterNameValues() == null) ? 0 : getParameterNameValues().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyCacheParameterGroupRequest == false)
            return false;
        ModifyCacheParameterGroupRequest other = (ModifyCacheParameterGroupRequest) obj;

        if (other.getCacheParameterGroupName() == null ^ this.getCacheParameterGroupName() == null)
            return false;
        if (other.getCacheParameterGroupName() != null
                && other.getCacheParameterGroupName().equals(this.getCacheParameterGroupName()) == false)
            return false;
        if (other.getParameterNameValues() == null ^ this.getParameterNameValues() == null)
            return false;
        if (other.getParameterNameValues() != null
                && other.getParameterNameValues().equals(this.getParameterNameValues()) == false)
            return false;
        return true;
    }
}
