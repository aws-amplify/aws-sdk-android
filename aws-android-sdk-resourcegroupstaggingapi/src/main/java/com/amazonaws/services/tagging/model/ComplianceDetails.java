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

package com.amazonaws.services.tagging.model;

import java.io.Serializable;

/**
 * <p>
 * Information that shows whether a resource is compliant with the effective tag
 * policy, including details on any noncompliant tag keys.
 * </p>
 */
public class ComplianceDetails implements Serializable {
    /**
     * <p>
     * These tag keys on the resource are noncompliant with the effective tag
     * policy.
     * </p>
     */
    private java.util.List<String> noncompliantKeys;

    /**
     * <p>
     * These are keys defined in the effective policy that are on the resource
     * with either incorrect case treatment or noncompliant values.
     * </p>
     */
    private java.util.List<String> keysWithNoncompliantValues;

    /**
     * <p>
     * Whether a resource is compliant with the effective tag policy.
     * </p>
     */
    private Boolean complianceStatus;

    /**
     * <p>
     * These tag keys on the resource are noncompliant with the effective tag
     * policy.
     * </p>
     *
     * @return <p>
     *         These tag keys on the resource are noncompliant with the
     *         effective tag policy.
     *         </p>
     */
    public java.util.List<String> getNoncompliantKeys() {
        return noncompliantKeys;
    }

    /**
     * <p>
     * These tag keys on the resource are noncompliant with the effective tag
     * policy.
     * </p>
     *
     * @param noncompliantKeys <p>
     *            These tag keys on the resource are noncompliant with the
     *            effective tag policy.
     *            </p>
     */
    public void setNoncompliantKeys(java.util.Collection<String> noncompliantKeys) {
        if (noncompliantKeys == null) {
            this.noncompliantKeys = null;
            return;
        }

        this.noncompliantKeys = new java.util.ArrayList<String>(noncompliantKeys);
    }

    /**
     * <p>
     * These tag keys on the resource are noncompliant with the effective tag
     * policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param noncompliantKeys <p>
     *            These tag keys on the resource are noncompliant with the
     *            effective tag policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ComplianceDetails withNoncompliantKeys(String... noncompliantKeys) {
        if (getNoncompliantKeys() == null) {
            this.noncompliantKeys = new java.util.ArrayList<String>(noncompliantKeys.length);
        }
        for (String value : noncompliantKeys) {
            this.noncompliantKeys.add(value);
        }
        return this;
    }

    /**
     * <p>
     * These tag keys on the resource are noncompliant with the effective tag
     * policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param noncompliantKeys <p>
     *            These tag keys on the resource are noncompliant with the
     *            effective tag policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ComplianceDetails withNoncompliantKeys(java.util.Collection<String> noncompliantKeys) {
        setNoncompliantKeys(noncompliantKeys);
        return this;
    }

    /**
     * <p>
     * These are keys defined in the effective policy that are on the resource
     * with either incorrect case treatment or noncompliant values.
     * </p>
     *
     * @return <p>
     *         These are keys defined in the effective policy that are on the
     *         resource with either incorrect case treatment or noncompliant
     *         values.
     *         </p>
     */
    public java.util.List<String> getKeysWithNoncompliantValues() {
        return keysWithNoncompliantValues;
    }

    /**
     * <p>
     * These are keys defined in the effective policy that are on the resource
     * with either incorrect case treatment or noncompliant values.
     * </p>
     *
     * @param keysWithNoncompliantValues <p>
     *            These are keys defined in the effective policy that are on the
     *            resource with either incorrect case treatment or noncompliant
     *            values.
     *            </p>
     */
    public void setKeysWithNoncompliantValues(
            java.util.Collection<String> keysWithNoncompliantValues) {
        if (keysWithNoncompliantValues == null) {
            this.keysWithNoncompliantValues = null;
            return;
        }

        this.keysWithNoncompliantValues = new java.util.ArrayList<String>(
                keysWithNoncompliantValues);
    }

    /**
     * <p>
     * These are keys defined in the effective policy that are on the resource
     * with either incorrect case treatment or noncompliant values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keysWithNoncompliantValues <p>
     *            These are keys defined in the effective policy that are on the
     *            resource with either incorrect case treatment or noncompliant
     *            values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ComplianceDetails withKeysWithNoncompliantValues(String... keysWithNoncompliantValues) {
        if (getKeysWithNoncompliantValues() == null) {
            this.keysWithNoncompliantValues = new java.util.ArrayList<String>(
                    keysWithNoncompliantValues.length);
        }
        for (String value : keysWithNoncompliantValues) {
            this.keysWithNoncompliantValues.add(value);
        }
        return this;
    }

    /**
     * <p>
     * These are keys defined in the effective policy that are on the resource
     * with either incorrect case treatment or noncompliant values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keysWithNoncompliantValues <p>
     *            These are keys defined in the effective policy that are on the
     *            resource with either incorrect case treatment or noncompliant
     *            values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ComplianceDetails withKeysWithNoncompliantValues(
            java.util.Collection<String> keysWithNoncompliantValues) {
        setKeysWithNoncompliantValues(keysWithNoncompliantValues);
        return this;
    }

    /**
     * <p>
     * Whether a resource is compliant with the effective tag policy.
     * </p>
     *
     * @return <p>
     *         Whether a resource is compliant with the effective tag policy.
     *         </p>
     */
    public Boolean isComplianceStatus() {
        return complianceStatus;
    }

    /**
     * <p>
     * Whether a resource is compliant with the effective tag policy.
     * </p>
     *
     * @return <p>
     *         Whether a resource is compliant with the effective tag policy.
     *         </p>
     */
    public Boolean getComplianceStatus() {
        return complianceStatus;
    }

    /**
     * <p>
     * Whether a resource is compliant with the effective tag policy.
     * </p>
     *
     * @param complianceStatus <p>
     *            Whether a resource is compliant with the effective tag policy.
     *            </p>
     */
    public void setComplianceStatus(Boolean complianceStatus) {
        this.complianceStatus = complianceStatus;
    }

    /**
     * <p>
     * Whether a resource is compliant with the effective tag policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param complianceStatus <p>
     *            Whether a resource is compliant with the effective tag policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ComplianceDetails withComplianceStatus(Boolean complianceStatus) {
        this.complianceStatus = complianceStatus;
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
        if (getNoncompliantKeys() != null)
            sb.append("NoncompliantKeys: " + getNoncompliantKeys() + ",");
        if (getKeysWithNoncompliantValues() != null)
            sb.append("KeysWithNoncompliantValues: " + getKeysWithNoncompliantValues() + ",");
        if (getComplianceStatus() != null)
            sb.append("ComplianceStatus: " + getComplianceStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNoncompliantKeys() == null) ? 0 : getNoncompliantKeys().hashCode());
        hashCode = prime
                * hashCode
                + ((getKeysWithNoncompliantValues() == null) ? 0 : getKeysWithNoncompliantValues()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getComplianceStatus() == null) ? 0 : getComplianceStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComplianceDetails == false)
            return false;
        ComplianceDetails other = (ComplianceDetails) obj;

        if (other.getNoncompliantKeys() == null ^ this.getNoncompliantKeys() == null)
            return false;
        if (other.getNoncompliantKeys() != null
                && other.getNoncompliantKeys().equals(this.getNoncompliantKeys()) == false)
            return false;
        if (other.getKeysWithNoncompliantValues() == null
                ^ this.getKeysWithNoncompliantValues() == null)
            return false;
        if (other.getKeysWithNoncompliantValues() != null
                && other.getKeysWithNoncompliantValues().equals(
                        this.getKeysWithNoncompliantValues()) == false)
            return false;
        if (other.getComplianceStatus() == null ^ this.getComplianceStatus() == null)
            return false;
        if (other.getComplianceStatus() != null
                && other.getComplianceStatus().equals(this.getComplianceStatus()) == false)
            return false;
        return true;
    }
}
