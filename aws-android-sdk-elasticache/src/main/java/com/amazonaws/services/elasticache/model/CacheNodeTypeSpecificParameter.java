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

/**
 * <p>
 * A parameter that has a different value for each cache node type it is applied
 * to. For example, in a Redis cluster, a <code>cache.m1.large</code> cache node
 * type would have a larger <code>maxmemory</code> value than a
 * <code>cache.m1.small</code> type.
 * </p>
 */
public class CacheNodeTypeSpecificParameter implements Serializable {
    /**
     * <p>
     * The name of the parameter.
     * </p>
     */
    private String parameterName;

    /**
     * <p>
     * A description of the parameter.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The source of the parameter value.
     * </p>
     */
    private String source;

    /**
     * <p>
     * The valid data type for the parameter.
     * </p>
     */
    private String dataType;

    /**
     * <p>
     * The valid range of values for the parameter.
     * </p>
     */
    private String allowedValues;

    /**
     * <p>
     * Indicates whether (<code>true</code>) or not (<code>false</code>) the
     * parameter can be modified. Some parameters have security or operational
     * implications that prevent them from being changed.
     * </p>
     */
    private Boolean isModifiable;

    /**
     * <p>
     * The earliest cache engine version to which the parameter can apply.
     * </p>
     */
    private String minimumEngineVersion;

    /**
     * <p>
     * A list of cache node types and their corresponding values for this
     * parameter.
     * </p>
     */
    private java.util.List<CacheNodeTypeSpecificValue> cacheNodeTypeSpecificValues;

    /**
     * <p>
     * Indicates whether a change to the parameter is applied immediately or
     * requires a reboot for the change to be applied. You can force a reboot or
     * wait until the next maintenance window's reboot. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Clusters.Rebooting.html"
     * >Rebooting a Cluster</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>immediate, requires-reboot
     */
    private String changeType;

    /**
     * <p>
     * The name of the parameter.
     * </p>
     *
     * @return <p>
     *         The name of the parameter.
     *         </p>
     */
    public String getParameterName() {
        return parameterName;
    }

    /**
     * <p>
     * The name of the parameter.
     * </p>
     *
     * @param parameterName <p>
     *            The name of the parameter.
     *            </p>
     */
    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    /**
     * <p>
     * The name of the parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameterName <p>
     *            The name of the parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheNodeTypeSpecificParameter withParameterName(String parameterName) {
        this.parameterName = parameterName;
        return this;
    }

    /**
     * <p>
     * A description of the parameter.
     * </p>
     *
     * @return <p>
     *         A description of the parameter.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the parameter.
     * </p>
     *
     * @param description <p>
     *            A description of the parameter.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description of the parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheNodeTypeSpecificParameter withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The source of the parameter value.
     * </p>
     *
     * @return <p>
     *         The source of the parameter value.
     *         </p>
     */
    public String getSource() {
        return source;
    }

    /**
     * <p>
     * The source of the parameter value.
     * </p>
     *
     * @param source <p>
     *            The source of the parameter value.
     *            </p>
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The source of the parameter value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param source <p>
     *            The source of the parameter value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheNodeTypeSpecificParameter withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * <p>
     * The valid data type for the parameter.
     * </p>
     *
     * @return <p>
     *         The valid data type for the parameter.
     *         </p>
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * <p>
     * The valid data type for the parameter.
     * </p>
     *
     * @param dataType <p>
     *            The valid data type for the parameter.
     *            </p>
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * <p>
     * The valid data type for the parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataType <p>
     *            The valid data type for the parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheNodeTypeSpecificParameter withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * <p>
     * The valid range of values for the parameter.
     * </p>
     *
     * @return <p>
     *         The valid range of values for the parameter.
     *         </p>
     */
    public String getAllowedValues() {
        return allowedValues;
    }

    /**
     * <p>
     * The valid range of values for the parameter.
     * </p>
     *
     * @param allowedValues <p>
     *            The valid range of values for the parameter.
     *            </p>
     */
    public void setAllowedValues(String allowedValues) {
        this.allowedValues = allowedValues;
    }

    /**
     * <p>
     * The valid range of values for the parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowedValues <p>
     *            The valid range of values for the parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheNodeTypeSpecificParameter withAllowedValues(String allowedValues) {
        this.allowedValues = allowedValues;
        return this;
    }

    /**
     * <p>
     * Indicates whether (<code>true</code>) or not (<code>false</code>) the
     * parameter can be modified. Some parameters have security or operational
     * implications that prevent them from being changed.
     * </p>
     *
     * @return <p>
     *         Indicates whether (<code>true</code>) or not (<code>false</code>)
     *         the parameter can be modified. Some parameters have security or
     *         operational implications that prevent them from being changed.
     *         </p>
     */
    public Boolean isIsModifiable() {
        return isModifiable;
    }

    /**
     * <p>
     * Indicates whether (<code>true</code>) or not (<code>false</code>) the
     * parameter can be modified. Some parameters have security or operational
     * implications that prevent them from being changed.
     * </p>
     *
     * @return <p>
     *         Indicates whether (<code>true</code>) or not (<code>false</code>)
     *         the parameter can be modified. Some parameters have security or
     *         operational implications that prevent them from being changed.
     *         </p>
     */
    public Boolean getIsModifiable() {
        return isModifiable;
    }

    /**
     * <p>
     * Indicates whether (<code>true</code>) or not (<code>false</code>) the
     * parameter can be modified. Some parameters have security or operational
     * implications that prevent them from being changed.
     * </p>
     *
     * @param isModifiable <p>
     *            Indicates whether (<code>true</code>) or not (
     *            <code>false</code>) the parameter can be modified. Some
     *            parameters have security or operational implications that
     *            prevent them from being changed.
     *            </p>
     */
    public void setIsModifiable(Boolean isModifiable) {
        this.isModifiable = isModifiable;
    }

    /**
     * <p>
     * Indicates whether (<code>true</code>) or not (<code>false</code>) the
     * parameter can be modified. Some parameters have security or operational
     * implications that prevent them from being changed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isModifiable <p>
     *            Indicates whether (<code>true</code>) or not (
     *            <code>false</code>) the parameter can be modified. Some
     *            parameters have security or operational implications that
     *            prevent them from being changed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheNodeTypeSpecificParameter withIsModifiable(Boolean isModifiable) {
        this.isModifiable = isModifiable;
        return this;
    }

    /**
     * <p>
     * The earliest cache engine version to which the parameter can apply.
     * </p>
     *
     * @return <p>
     *         The earliest cache engine version to which the parameter can
     *         apply.
     *         </p>
     */
    public String getMinimumEngineVersion() {
        return minimumEngineVersion;
    }

    /**
     * <p>
     * The earliest cache engine version to which the parameter can apply.
     * </p>
     *
     * @param minimumEngineVersion <p>
     *            The earliest cache engine version to which the parameter can
     *            apply.
     *            </p>
     */
    public void setMinimumEngineVersion(String minimumEngineVersion) {
        this.minimumEngineVersion = minimumEngineVersion;
    }

    /**
     * <p>
     * The earliest cache engine version to which the parameter can apply.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minimumEngineVersion <p>
     *            The earliest cache engine version to which the parameter can
     *            apply.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheNodeTypeSpecificParameter withMinimumEngineVersion(String minimumEngineVersion) {
        this.minimumEngineVersion = minimumEngineVersion;
        return this;
    }

    /**
     * <p>
     * A list of cache node types and their corresponding values for this
     * parameter.
     * </p>
     *
     * @return <p>
     *         A list of cache node types and their corresponding values for
     *         this parameter.
     *         </p>
     */
    public java.util.List<CacheNodeTypeSpecificValue> getCacheNodeTypeSpecificValues() {
        return cacheNodeTypeSpecificValues;
    }

    /**
     * <p>
     * A list of cache node types and their corresponding values for this
     * parameter.
     * </p>
     *
     * @param cacheNodeTypeSpecificValues <p>
     *            A list of cache node types and their corresponding values for
     *            this parameter.
     *            </p>
     */
    public void setCacheNodeTypeSpecificValues(
            java.util.Collection<CacheNodeTypeSpecificValue> cacheNodeTypeSpecificValues) {
        if (cacheNodeTypeSpecificValues == null) {
            this.cacheNodeTypeSpecificValues = null;
            return;
        }

        this.cacheNodeTypeSpecificValues = new java.util.ArrayList<CacheNodeTypeSpecificValue>(
                cacheNodeTypeSpecificValues);
    }

    /**
     * <p>
     * A list of cache node types and their corresponding values for this
     * parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheNodeTypeSpecificValues <p>
     *            A list of cache node types and their corresponding values for
     *            this parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheNodeTypeSpecificParameter withCacheNodeTypeSpecificValues(
            CacheNodeTypeSpecificValue... cacheNodeTypeSpecificValues) {
        if (getCacheNodeTypeSpecificValues() == null) {
            this.cacheNodeTypeSpecificValues = new java.util.ArrayList<CacheNodeTypeSpecificValue>(
                    cacheNodeTypeSpecificValues.length);
        }
        for (CacheNodeTypeSpecificValue value : cacheNodeTypeSpecificValues) {
            this.cacheNodeTypeSpecificValues.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of cache node types and their corresponding values for this
     * parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheNodeTypeSpecificValues <p>
     *            A list of cache node types and their corresponding values for
     *            this parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheNodeTypeSpecificParameter withCacheNodeTypeSpecificValues(
            java.util.Collection<CacheNodeTypeSpecificValue> cacheNodeTypeSpecificValues) {
        setCacheNodeTypeSpecificValues(cacheNodeTypeSpecificValues);
        return this;
    }

    /**
     * <p>
     * Indicates whether a change to the parameter is applied immediately or
     * requires a reboot for the change to be applied. You can force a reboot or
     * wait until the next maintenance window's reboot. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Clusters.Rebooting.html"
     * >Rebooting a Cluster</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>immediate, requires-reboot
     *
     * @return <p>
     *         Indicates whether a change to the parameter is applied
     *         immediately or requires a reboot for the change to be applied.
     *         You can force a reboot or wait until the next maintenance
     *         window's reboot. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Clusters.Rebooting.html"
     *         >Rebooting a Cluster</a>.
     *         </p>
     * @see ChangeType
     */
    public String getChangeType() {
        return changeType;
    }

    /**
     * <p>
     * Indicates whether a change to the parameter is applied immediately or
     * requires a reboot for the change to be applied. You can force a reboot or
     * wait until the next maintenance window's reboot. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Clusters.Rebooting.html"
     * >Rebooting a Cluster</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>immediate, requires-reboot
     *
     * @param changeType <p>
     *            Indicates whether a change to the parameter is applied
     *            immediately or requires a reboot for the change to be applied.
     *            You can force a reboot or wait until the next maintenance
     *            window's reboot. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Clusters.Rebooting.html"
     *            >Rebooting a Cluster</a>.
     *            </p>
     * @see ChangeType
     */
    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    /**
     * <p>
     * Indicates whether a change to the parameter is applied immediately or
     * requires a reboot for the change to be applied. You can force a reboot or
     * wait until the next maintenance window's reboot. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Clusters.Rebooting.html"
     * >Rebooting a Cluster</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>immediate, requires-reboot
     *
     * @param changeType <p>
     *            Indicates whether a change to the parameter is applied
     *            immediately or requires a reboot for the change to be applied.
     *            You can force a reboot or wait until the next maintenance
     *            window's reboot. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Clusters.Rebooting.html"
     *            >Rebooting a Cluster</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChangeType
     */
    public CacheNodeTypeSpecificParameter withChangeType(String changeType) {
        this.changeType = changeType;
        return this;
    }

    /**
     * <p>
     * Indicates whether a change to the parameter is applied immediately or
     * requires a reboot for the change to be applied. You can force a reboot or
     * wait until the next maintenance window's reboot. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Clusters.Rebooting.html"
     * >Rebooting a Cluster</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>immediate, requires-reboot
     *
     * @param changeType <p>
     *            Indicates whether a change to the parameter is applied
     *            immediately or requires a reboot for the change to be applied.
     *            You can force a reboot or wait until the next maintenance
     *            window's reboot. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Clusters.Rebooting.html"
     *            >Rebooting a Cluster</a>.
     *            </p>
     * @see ChangeType
     */
    public void setChangeType(ChangeType changeType) {
        this.changeType = changeType.toString();
    }

    /**
     * <p>
     * Indicates whether a change to the parameter is applied immediately or
     * requires a reboot for the change to be applied. You can force a reboot or
     * wait until the next maintenance window's reboot. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Clusters.Rebooting.html"
     * >Rebooting a Cluster</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>immediate, requires-reboot
     *
     * @param changeType <p>
     *            Indicates whether a change to the parameter is applied
     *            immediately or requires a reboot for the change to be applied.
     *            You can force a reboot or wait until the next maintenance
     *            window's reboot. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Clusters.Rebooting.html"
     *            >Rebooting a Cluster</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChangeType
     */
    public CacheNodeTypeSpecificParameter withChangeType(ChangeType changeType) {
        this.changeType = changeType.toString();
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
        if (getParameterName() != null)
            sb.append("ParameterName: " + getParameterName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getSource() != null)
            sb.append("Source: " + getSource() + ",");
        if (getDataType() != null)
            sb.append("DataType: " + getDataType() + ",");
        if (getAllowedValues() != null)
            sb.append("AllowedValues: " + getAllowedValues() + ",");
        if (getIsModifiable() != null)
            sb.append("IsModifiable: " + getIsModifiable() + ",");
        if (getMinimumEngineVersion() != null)
            sb.append("MinimumEngineVersion: " + getMinimumEngineVersion() + ",");
        if (getCacheNodeTypeSpecificValues() != null)
            sb.append("CacheNodeTypeSpecificValues: " + getCacheNodeTypeSpecificValues() + ",");
        if (getChangeType() != null)
            sb.append("ChangeType: " + getChangeType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getParameterName() == null) ? 0 : getParameterName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode());
        hashCode = prime * hashCode
                + ((getAllowedValues() == null) ? 0 : getAllowedValues().hashCode());
        hashCode = prime * hashCode
                + ((getIsModifiable() == null) ? 0 : getIsModifiable().hashCode());
        hashCode = prime * hashCode
                + ((getMinimumEngineVersion() == null) ? 0 : getMinimumEngineVersion().hashCode());
        hashCode = prime
                * hashCode
                + ((getCacheNodeTypeSpecificValues() == null) ? 0
                        : getCacheNodeTypeSpecificValues().hashCode());
        hashCode = prime * hashCode + ((getChangeType() == null) ? 0 : getChangeType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CacheNodeTypeSpecificParameter == false)
            return false;
        CacheNodeTypeSpecificParameter other = (CacheNodeTypeSpecificParameter) obj;

        if (other.getParameterName() == null ^ this.getParameterName() == null)
            return false;
        if (other.getParameterName() != null
                && other.getParameterName().equals(this.getParameterName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getDataType() == null ^ this.getDataType() == null)
            return false;
        if (other.getDataType() != null && other.getDataType().equals(this.getDataType()) == false)
            return false;
        if (other.getAllowedValues() == null ^ this.getAllowedValues() == null)
            return false;
        if (other.getAllowedValues() != null
                && other.getAllowedValues().equals(this.getAllowedValues()) == false)
            return false;
        if (other.getIsModifiable() == null ^ this.getIsModifiable() == null)
            return false;
        if (other.getIsModifiable() != null
                && other.getIsModifiable().equals(this.getIsModifiable()) == false)
            return false;
        if (other.getMinimumEngineVersion() == null ^ this.getMinimumEngineVersion() == null)
            return false;
        if (other.getMinimumEngineVersion() != null
                && other.getMinimumEngineVersion().equals(this.getMinimumEngineVersion()) == false)
            return false;
        if (other.getCacheNodeTypeSpecificValues() == null
                ^ this.getCacheNodeTypeSpecificValues() == null)
            return false;
        if (other.getCacheNodeTypeSpecificValues() != null
                && other.getCacheNodeTypeSpecificValues().equals(
                        this.getCacheNodeTypeSpecificValues()) == false)
            return false;
        if (other.getChangeType() == null ^ this.getChangeType() == null)
            return false;
        if (other.getChangeType() != null
                && other.getChangeType().equals(this.getChangeType()) == false)
            return false;
        return true;
    }
}
