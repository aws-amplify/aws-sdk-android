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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import java.io.Serializable;

/**
 * <p>
 * Information about valid modifications that you can make to your DB instance.
 * Contains the result of a successful call to the
 * <code>DescribeValidDBInstanceModifications</code> action. You can use this
 * information when you call <code>ModifyDBInstance</code>.
 * </p>
 */
public class ValidDBInstanceModificationsMessage implements Serializable {
    /**
     * <p>
     * Valid storage options for your DB instance.
     * </p>
     */
    private java.util.List<ValidStorageOptions> storage;

    /**
     * <p>
     * Valid processor features for your DB instance.
     * </p>
     */
    private java.util.List<AvailableProcessorFeature> validProcessorFeatures;

    /**
     * <p>
     * Valid storage options for your DB instance.
     * </p>
     *
     * @return <p>
     *         Valid storage options for your DB instance.
     *         </p>
     */
    public java.util.List<ValidStorageOptions> getStorage() {
        return storage;
    }

    /**
     * <p>
     * Valid storage options for your DB instance.
     * </p>
     *
     * @param storage <p>
     *            Valid storage options for your DB instance.
     *            </p>
     */
    public void setStorage(java.util.Collection<ValidStorageOptions> storage) {
        if (storage == null) {
            this.storage = null;
            return;
        }

        this.storage = new java.util.ArrayList<ValidStorageOptions>(storage);
    }

    /**
     * <p>
     * Valid storage options for your DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param storage <p>
     *            Valid storage options for your DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ValidDBInstanceModificationsMessage withStorage(ValidStorageOptions... storage) {
        if (getStorage() == null) {
            this.storage = new java.util.ArrayList<ValidStorageOptions>(storage.length);
        }
        for (ValidStorageOptions value : storage) {
            this.storage.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Valid storage options for your DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param storage <p>
     *            Valid storage options for your DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ValidDBInstanceModificationsMessage withStorage(
            java.util.Collection<ValidStorageOptions> storage) {
        setStorage(storage);
        return this;
    }

    /**
     * <p>
     * Valid processor features for your DB instance.
     * </p>
     *
     * @return <p>
     *         Valid processor features for your DB instance.
     *         </p>
     */
    public java.util.List<AvailableProcessorFeature> getValidProcessorFeatures() {
        return validProcessorFeatures;
    }

    /**
     * <p>
     * Valid processor features for your DB instance.
     * </p>
     *
     * @param validProcessorFeatures <p>
     *            Valid processor features for your DB instance.
     *            </p>
     */
    public void setValidProcessorFeatures(
            java.util.Collection<AvailableProcessorFeature> validProcessorFeatures) {
        if (validProcessorFeatures == null) {
            this.validProcessorFeatures = null;
            return;
        }

        this.validProcessorFeatures = new java.util.ArrayList<AvailableProcessorFeature>(
                validProcessorFeatures);
    }

    /**
     * <p>
     * Valid processor features for your DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validProcessorFeatures <p>
     *            Valid processor features for your DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ValidDBInstanceModificationsMessage withValidProcessorFeatures(
            AvailableProcessorFeature... validProcessorFeatures) {
        if (getValidProcessorFeatures() == null) {
            this.validProcessorFeatures = new java.util.ArrayList<AvailableProcessorFeature>(
                    validProcessorFeatures.length);
        }
        for (AvailableProcessorFeature value : validProcessorFeatures) {
            this.validProcessorFeatures.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Valid processor features for your DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validProcessorFeatures <p>
     *            Valid processor features for your DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ValidDBInstanceModificationsMessage withValidProcessorFeatures(
            java.util.Collection<AvailableProcessorFeature> validProcessorFeatures) {
        setValidProcessorFeatures(validProcessorFeatures);
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
        if (getStorage() != null)
            sb.append("Storage: " + getStorage() + ",");
        if (getValidProcessorFeatures() != null)
            sb.append("ValidProcessorFeatures: " + getValidProcessorFeatures());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStorage() == null) ? 0 : getStorage().hashCode());
        hashCode = prime
                * hashCode
                + ((getValidProcessorFeatures() == null) ? 0 : getValidProcessorFeatures()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidDBInstanceModificationsMessage == false)
            return false;
        ValidDBInstanceModificationsMessage other = (ValidDBInstanceModificationsMessage) obj;

        if (other.getStorage() == null ^ this.getStorage() == null)
            return false;
        if (other.getStorage() != null && other.getStorage().equals(this.getStorage()) == false)
            return false;
        if (other.getValidProcessorFeatures() == null ^ this.getValidProcessorFeatures() == null)
            return false;
        if (other.getValidProcessorFeatures() != null
                && other.getValidProcessorFeatures().equals(this.getValidProcessorFeatures()) == false)
            return false;
        return true;
    }
}
