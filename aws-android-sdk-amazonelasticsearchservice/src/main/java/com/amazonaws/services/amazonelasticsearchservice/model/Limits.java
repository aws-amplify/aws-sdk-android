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

package com.amazonaws.services.amazonelasticsearchservice.model;

import java.io.Serializable;

/**
 * <p>
 * Limits for given InstanceType and for each of it's role. <br/>
 * Limits contains following <code> <a>StorageTypes,</a> </code>
 * <code> <a>InstanceLimits</a> </code> and
 * <code> <a>AdditionalLimits</a> </code>
 * </p>
 */
public class Limits implements Serializable {
    /**
     * <p>
     * StorageType represents the list of storage related types and attributes
     * that are available for given InstanceType.
     * </p>
     */
    private java.util.List<StorageType> storageTypes;

    /**
     * <p>
     * InstanceLimits represents the list of instance related attributes that
     * are available for given InstanceType.
     * </p>
     */
    private InstanceLimits instanceLimits;

    /**
     * <p>
     * List of additional limits that are specific to a given InstanceType and
     * for each of it's <code> <a>InstanceRole</a> </code> .
     * </p>
     */
    private java.util.List<AdditionalLimit> additionalLimits;

    /**
     * <p>
     * StorageType represents the list of storage related types and attributes
     * that are available for given InstanceType.
     * </p>
     *
     * @return <p>
     *         StorageType represents the list of storage related types and
     *         attributes that are available for given InstanceType.
     *         </p>
     */
    public java.util.List<StorageType> getStorageTypes() {
        return storageTypes;
    }

    /**
     * <p>
     * StorageType represents the list of storage related types and attributes
     * that are available for given InstanceType.
     * </p>
     *
     * @param storageTypes <p>
     *            StorageType represents the list of storage related types and
     *            attributes that are available for given InstanceType.
     *            </p>
     */
    public void setStorageTypes(java.util.Collection<StorageType> storageTypes) {
        if (storageTypes == null) {
            this.storageTypes = null;
            return;
        }

        this.storageTypes = new java.util.ArrayList<StorageType>(storageTypes);
    }

    /**
     * <p>
     * StorageType represents the list of storage related types and attributes
     * that are available for given InstanceType.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param storageTypes <p>
     *            StorageType represents the list of storage related types and
     *            attributes that are available for given InstanceType.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Limits withStorageTypes(StorageType... storageTypes) {
        if (getStorageTypes() == null) {
            this.storageTypes = new java.util.ArrayList<StorageType>(storageTypes.length);
        }
        for (StorageType value : storageTypes) {
            this.storageTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * StorageType represents the list of storage related types and attributes
     * that are available for given InstanceType.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param storageTypes <p>
     *            StorageType represents the list of storage related types and
     *            attributes that are available for given InstanceType.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Limits withStorageTypes(java.util.Collection<StorageType> storageTypes) {
        setStorageTypes(storageTypes);
        return this;
    }

    /**
     * <p>
     * InstanceLimits represents the list of instance related attributes that
     * are available for given InstanceType.
     * </p>
     *
     * @return <p>
     *         InstanceLimits represents the list of instance related attributes
     *         that are available for given InstanceType.
     *         </p>
     */
    public InstanceLimits getInstanceLimits() {
        return instanceLimits;
    }

    /**
     * <p>
     * InstanceLimits represents the list of instance related attributes that
     * are available for given InstanceType.
     * </p>
     *
     * @param instanceLimits <p>
     *            InstanceLimits represents the list of instance related
     *            attributes that are available for given InstanceType.
     *            </p>
     */
    public void setInstanceLimits(InstanceLimits instanceLimits) {
        this.instanceLimits = instanceLimits;
    }

    /**
     * <p>
     * InstanceLimits represents the list of instance related attributes that
     * are available for given InstanceType.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceLimits <p>
     *            InstanceLimits represents the list of instance related
     *            attributes that are available for given InstanceType.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Limits withInstanceLimits(InstanceLimits instanceLimits) {
        this.instanceLimits = instanceLimits;
        return this;
    }

    /**
     * <p>
     * List of additional limits that are specific to a given InstanceType and
     * for each of it's <code> <a>InstanceRole</a> </code> .
     * </p>
     *
     * @return <p>
     *         List of additional limits that are specific to a given
     *         InstanceType and for each of it's
     *         <code> <a>InstanceRole</a> </code> .
     *         </p>
     */
    public java.util.List<AdditionalLimit> getAdditionalLimits() {
        return additionalLimits;
    }

    /**
     * <p>
     * List of additional limits that are specific to a given InstanceType and
     * for each of it's <code> <a>InstanceRole</a> </code> .
     * </p>
     *
     * @param additionalLimits <p>
     *            List of additional limits that are specific to a given
     *            InstanceType and for each of it's
     *            <code> <a>InstanceRole</a> </code> .
     *            </p>
     */
    public void setAdditionalLimits(java.util.Collection<AdditionalLimit> additionalLimits) {
        if (additionalLimits == null) {
            this.additionalLimits = null;
            return;
        }

        this.additionalLimits = new java.util.ArrayList<AdditionalLimit>(additionalLimits);
    }

    /**
     * <p>
     * List of additional limits that are specific to a given InstanceType and
     * for each of it's <code> <a>InstanceRole</a> </code> .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param additionalLimits <p>
     *            List of additional limits that are specific to a given
     *            InstanceType and for each of it's
     *            <code> <a>InstanceRole</a> </code> .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Limits withAdditionalLimits(AdditionalLimit... additionalLimits) {
        if (getAdditionalLimits() == null) {
            this.additionalLimits = new java.util.ArrayList<AdditionalLimit>(
                    additionalLimits.length);
        }
        for (AdditionalLimit value : additionalLimits) {
            this.additionalLimits.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of additional limits that are specific to a given InstanceType and
     * for each of it's <code> <a>InstanceRole</a> </code> .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param additionalLimits <p>
     *            List of additional limits that are specific to a given
     *            InstanceType and for each of it's
     *            <code> <a>InstanceRole</a> </code> .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Limits withAdditionalLimits(java.util.Collection<AdditionalLimit> additionalLimits) {
        setAdditionalLimits(additionalLimits);
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
        if (getStorageTypes() != null)
            sb.append("StorageTypes: " + getStorageTypes() + ",");
        if (getInstanceLimits() != null)
            sb.append("InstanceLimits: " + getInstanceLimits() + ",");
        if (getAdditionalLimits() != null)
            sb.append("AdditionalLimits: " + getAdditionalLimits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStorageTypes() == null) ? 0 : getStorageTypes().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceLimits() == null) ? 0 : getInstanceLimits().hashCode());
        hashCode = prime * hashCode
                + ((getAdditionalLimits() == null) ? 0 : getAdditionalLimits().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Limits == false)
            return false;
        Limits other = (Limits) obj;

        if (other.getStorageTypes() == null ^ this.getStorageTypes() == null)
            return false;
        if (other.getStorageTypes() != null
                && other.getStorageTypes().equals(this.getStorageTypes()) == false)
            return false;
        if (other.getInstanceLimits() == null ^ this.getInstanceLimits() == null)
            return false;
        if (other.getInstanceLimits() != null
                && other.getInstanceLimits().equals(this.getInstanceLimits()) == false)
            return false;
        if (other.getAdditionalLimits() == null ^ this.getAdditionalLimits() == null)
            return false;
        if (other.getAdditionalLimits() != null
                && other.getAdditionalLimits().equals(this.getAdditionalLimits()) == false)
            return false;
        return true;
    }
}
