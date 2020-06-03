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

package com.amazonaws.services.es.model;

import java.io.Serializable;

/**
 * <p>
 * Limits that are applicable for given storage type.
 * </p>
 */
public class StorageTypeLimit implements Serializable {
    /**
     * <p>
     * Name of storage limits that are applicable for given storage type. If
     * <code> <a>StorageType</a> </code> is ebs, following storage options are
     * applicable
     * <ol>
     * <li>MinimumVolumeSize</li> Minimum amount of volume size that is
     * applicable for given storage type.It can be empty if it is not
     * applicable.
     * <li>MaximumVolumeSize</li> Maximum amount of volume size that is
     * applicable for given storage type.It can be empty if it is not
     * applicable.
     * <li>MaximumIops</li> Maximum amount of Iops that is applicable for given
     * storage type.It can be empty if it is not applicable.
     * <li>MinimumIops</li> Minimum amount of Iops that is applicable for given
     * storage type.It can be empty if it is not applicable.
     * </ol>
     * </p>
     */
    private String limitName;

    /**
     * <p>
     * Values for the <code> <a>StorageTypeLimit$LimitName</a> </code> .
     * </p>
     */
    private java.util.List<String> limitValues;

    /**
     * <p>
     * Name of storage limits that are applicable for given storage type. If
     * <code> <a>StorageType</a> </code> is ebs, following storage options are
     * applicable
     * <ol>
     * <li>MinimumVolumeSize</li> Minimum amount of volume size that is
     * applicable for given storage type.It can be empty if it is not
     * applicable.
     * <li>MaximumVolumeSize</li> Maximum amount of volume size that is
     * applicable for given storage type.It can be empty if it is not
     * applicable.
     * <li>MaximumIops</li> Maximum amount of Iops that is applicable for given
     * storage type.It can be empty if it is not applicable.
     * <li>MinimumIops</li> Minimum amount of Iops that is applicable for given
     * storage type.It can be empty if it is not applicable.
     * </ol>
     * </p>
     *
     * @return <p>
     *         Name of storage limits that are applicable for given storage
     *         type. If <code> <a>StorageType</a> </code> is ebs, following
     *         storage options are applicable
     *         <ol>
     *         <li>MinimumVolumeSize</li> Minimum amount of volume size that is
     *         applicable for given storage type.It can be empty if it is not
     *         applicable.
     *         <li>MaximumVolumeSize</li> Maximum amount of volume size that is
     *         applicable for given storage type.It can be empty if it is not
     *         applicable.
     *         <li>MaximumIops</li> Maximum amount of Iops that is applicable
     *         for given storage type.It can be empty if it is not applicable.
     *         <li>MinimumIops</li> Minimum amount of Iops that is applicable
     *         for given storage type.It can be empty if it is not applicable.
     *         </ol>
     *         </p>
     */
    public String getLimitName() {
        return limitName;
    }

    /**
     * <p>
     * Name of storage limits that are applicable for given storage type. If
     * <code> <a>StorageType</a> </code> is ebs, following storage options are
     * applicable
     * <ol>
     * <li>MinimumVolumeSize</li> Minimum amount of volume size that is
     * applicable for given storage type.It can be empty if it is not
     * applicable.
     * <li>MaximumVolumeSize</li> Maximum amount of volume size that is
     * applicable for given storage type.It can be empty if it is not
     * applicable.
     * <li>MaximumIops</li> Maximum amount of Iops that is applicable for given
     * storage type.It can be empty if it is not applicable.
     * <li>MinimumIops</li> Minimum amount of Iops that is applicable for given
     * storage type.It can be empty if it is not applicable.
     * </ol>
     * </p>
     *
     * @param limitName <p>
     *            Name of storage limits that are applicable for given storage
     *            type. If <code> <a>StorageType</a> </code> is ebs, following
     *            storage options are applicable
     *            <ol>
     *            <li>MinimumVolumeSize</li> Minimum amount of volume size that
     *            is applicable for given storage type.It can be empty if it is
     *            not applicable.
     *            <li>MaximumVolumeSize</li> Maximum amount of volume size that
     *            is applicable for given storage type.It can be empty if it is
     *            not applicable.
     *            <li>MaximumIops</li> Maximum amount of Iops that is applicable
     *            for given storage type.It can be empty if it is not
     *            applicable.
     *            <li>MinimumIops</li> Minimum amount of Iops that is applicable
     *            for given storage type.It can be empty if it is not
     *            applicable.
     *            </ol>
     *            </p>
     */
    public void setLimitName(String limitName) {
        this.limitName = limitName;
    }

    /**
     * <p>
     * Name of storage limits that are applicable for given storage type. If
     * <code> <a>StorageType</a> </code> is ebs, following storage options are
     * applicable
     * <ol>
     * <li>MinimumVolumeSize</li> Minimum amount of volume size that is
     * applicable for given storage type.It can be empty if it is not
     * applicable.
     * <li>MaximumVolumeSize</li> Maximum amount of volume size that is
     * applicable for given storage type.It can be empty if it is not
     * applicable.
     * <li>MaximumIops</li> Maximum amount of Iops that is applicable for given
     * storage type.It can be empty if it is not applicable.
     * <li>MinimumIops</li> Minimum amount of Iops that is applicable for given
     * storage type.It can be empty if it is not applicable.
     * </ol>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param limitName <p>
     *            Name of storage limits that are applicable for given storage
     *            type. If <code> <a>StorageType</a> </code> is ebs, following
     *            storage options are applicable
     *            <ol>
     *            <li>MinimumVolumeSize</li> Minimum amount of volume size that
     *            is applicable for given storage type.It can be empty if it is
     *            not applicable.
     *            <li>MaximumVolumeSize</li> Maximum amount of volume size that
     *            is applicable for given storage type.It can be empty if it is
     *            not applicable.
     *            <li>MaximumIops</li> Maximum amount of Iops that is applicable
     *            for given storage type.It can be empty if it is not
     *            applicable.
     *            <li>MinimumIops</li> Minimum amount of Iops that is applicable
     *            for given storage type.It can be empty if it is not
     *            applicable.
     *            </ol>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StorageTypeLimit withLimitName(String limitName) {
        this.limitName = limitName;
        return this;
    }

    /**
     * <p>
     * Values for the <code> <a>StorageTypeLimit$LimitName</a> </code> .
     * </p>
     *
     * @return <p>
     *         Values for the <code> <a>StorageTypeLimit$LimitName</a> </code> .
     *         </p>
     */
    public java.util.List<String> getLimitValues() {
        return limitValues;
    }

    /**
     * <p>
     * Values for the <code> <a>StorageTypeLimit$LimitName</a> </code> .
     * </p>
     *
     * @param limitValues <p>
     *            Values for the
     *            <code> <a>StorageTypeLimit$LimitName</a> </code> .
     *            </p>
     */
    public void setLimitValues(java.util.Collection<String> limitValues) {
        if (limitValues == null) {
            this.limitValues = null;
            return;
        }

        this.limitValues = new java.util.ArrayList<String>(limitValues);
    }

    /**
     * <p>
     * Values for the <code> <a>StorageTypeLimit$LimitName</a> </code> .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param limitValues <p>
     *            Values for the
     *            <code> <a>StorageTypeLimit$LimitName</a> </code> .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StorageTypeLimit withLimitValues(String... limitValues) {
        if (getLimitValues() == null) {
            this.limitValues = new java.util.ArrayList<String>(limitValues.length);
        }
        for (String value : limitValues) {
            this.limitValues.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Values for the <code> <a>StorageTypeLimit$LimitName</a> </code> .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param limitValues <p>
     *            Values for the
     *            <code> <a>StorageTypeLimit$LimitName</a> </code> .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StorageTypeLimit withLimitValues(java.util.Collection<String> limitValues) {
        setLimitValues(limitValues);
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
        if (getLimitName() != null)
            sb.append("LimitName: " + getLimitName() + ",");
        if (getLimitValues() != null)
            sb.append("LimitValues: " + getLimitValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLimitName() == null) ? 0 : getLimitName().hashCode());
        hashCode = prime * hashCode
                + ((getLimitValues() == null) ? 0 : getLimitValues().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StorageTypeLimit == false)
            return false;
        StorageTypeLimit other = (StorageTypeLimit) obj;

        if (other.getLimitName() == null ^ this.getLimitName() == null)
            return false;
        if (other.getLimitName() != null
                && other.getLimitName().equals(this.getLimitName()) == false)
            return false;
        if (other.getLimitValues() == null ^ this.getLimitValues() == null)
            return false;
        if (other.getLimitValues() != null
                && other.getLimitValues().equals(this.getLimitValues()) == false)
            return false;
        return true;
    }
}
