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

package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

/**
 * <p>
 * The user-defined preferences that will be applied during product
 * provisioning, unless overridden by <code>ProvisioningPreferences</code> or
 * <code>UpdateProvisioningPreferences</code>.
 * </p>
 * <p>
 * For more information on maximum concurrent accounts and failure tolerance,
 * see <a href=
 * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-ops-options"
 * >Stack set operation options</a> in the <i>AWS CloudFormation User Guide</i>.
 * </p>
 */
public class ProvisioningArtifactPreferences implements Serializable {
    /**
     * <p>
     * One or more AWS accounts where stack instances are deployed from the
     * stack set. These accounts can be scoped in
     * <code>ProvisioningPreferences$StackSetAccounts</code> and
     * <code>UpdateProvisioningPreferences$StackSetAccounts</code>.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     */
    private java.util.List<String> stackSetAccounts;

    /**
     * <p>
     * One or more AWS Regions where stack instances are deployed from the stack
     * set. These regions can be scoped in
     * <code>ProvisioningPreferences$StackSetRegions</code> and
     * <code>UpdateProvisioningPreferences$StackSetRegions</code>.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     */
    private java.util.List<String> stackSetRegions;

    /**
     * <p>
     * One or more AWS accounts where stack instances are deployed from the
     * stack set. These accounts can be scoped in
     * <code>ProvisioningPreferences$StackSetAccounts</code> and
     * <code>UpdateProvisioningPreferences$StackSetAccounts</code>.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     *
     * @return <p>
     *         One or more AWS accounts where stack instances are deployed from
     *         the stack set. These accounts can be scoped in
     *         <code>ProvisioningPreferences$StackSetAccounts</code> and
     *         <code>UpdateProvisioningPreferences$StackSetAccounts</code>.
     *         </p>
     *         <p>
     *         Applicable only to a <code>CFN_STACKSET</code> provisioned
     *         product type.
     *         </p>
     */
    public java.util.List<String> getStackSetAccounts() {
        return stackSetAccounts;
    }

    /**
     * <p>
     * One or more AWS accounts where stack instances are deployed from the
     * stack set. These accounts can be scoped in
     * <code>ProvisioningPreferences$StackSetAccounts</code> and
     * <code>UpdateProvisioningPreferences$StackSetAccounts</code>.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     *
     * @param stackSetAccounts <p>
     *            One or more AWS accounts where stack instances are deployed
     *            from the stack set. These accounts can be scoped in
     *            <code>ProvisioningPreferences$StackSetAccounts</code> and
     *            <code>UpdateProvisioningPreferences$StackSetAccounts</code>.
     *            </p>
     *            <p>
     *            Applicable only to a <code>CFN_STACKSET</code> provisioned
     *            product type.
     *            </p>
     */
    public void setStackSetAccounts(java.util.Collection<String> stackSetAccounts) {
        if (stackSetAccounts == null) {
            this.stackSetAccounts = null;
            return;
        }

        this.stackSetAccounts = new java.util.ArrayList<String>(stackSetAccounts);
    }

    /**
     * <p>
     * One or more AWS accounts where stack instances are deployed from the
     * stack set. These accounts can be scoped in
     * <code>ProvisioningPreferences$StackSetAccounts</code> and
     * <code>UpdateProvisioningPreferences$StackSetAccounts</code>.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackSetAccounts <p>
     *            One or more AWS accounts where stack instances are deployed
     *            from the stack set. These accounts can be scoped in
     *            <code>ProvisioningPreferences$StackSetAccounts</code> and
     *            <code>UpdateProvisioningPreferences$StackSetAccounts</code>.
     *            </p>
     *            <p>
     *            Applicable only to a <code>CFN_STACKSET</code> provisioned
     *            product type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisioningArtifactPreferences withStackSetAccounts(String... stackSetAccounts) {
        if (getStackSetAccounts() == null) {
            this.stackSetAccounts = new java.util.ArrayList<String>(stackSetAccounts.length);
        }
        for (String value : stackSetAccounts) {
            this.stackSetAccounts.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more AWS accounts where stack instances are deployed from the
     * stack set. These accounts can be scoped in
     * <code>ProvisioningPreferences$StackSetAccounts</code> and
     * <code>UpdateProvisioningPreferences$StackSetAccounts</code>.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackSetAccounts <p>
     *            One or more AWS accounts where stack instances are deployed
     *            from the stack set. These accounts can be scoped in
     *            <code>ProvisioningPreferences$StackSetAccounts</code> and
     *            <code>UpdateProvisioningPreferences$StackSetAccounts</code>.
     *            </p>
     *            <p>
     *            Applicable only to a <code>CFN_STACKSET</code> provisioned
     *            product type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisioningArtifactPreferences withStackSetAccounts(
            java.util.Collection<String> stackSetAccounts) {
        setStackSetAccounts(stackSetAccounts);
        return this;
    }

    /**
     * <p>
     * One or more AWS Regions where stack instances are deployed from the stack
     * set. These regions can be scoped in
     * <code>ProvisioningPreferences$StackSetRegions</code> and
     * <code>UpdateProvisioningPreferences$StackSetRegions</code>.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     *
     * @return <p>
     *         One or more AWS Regions where stack instances are deployed from
     *         the stack set. These regions can be scoped in
     *         <code>ProvisioningPreferences$StackSetRegions</code> and
     *         <code>UpdateProvisioningPreferences$StackSetRegions</code>.
     *         </p>
     *         <p>
     *         Applicable only to a <code>CFN_STACKSET</code> provisioned
     *         product type.
     *         </p>
     */
    public java.util.List<String> getStackSetRegions() {
        return stackSetRegions;
    }

    /**
     * <p>
     * One or more AWS Regions where stack instances are deployed from the stack
     * set. These regions can be scoped in
     * <code>ProvisioningPreferences$StackSetRegions</code> and
     * <code>UpdateProvisioningPreferences$StackSetRegions</code>.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     *
     * @param stackSetRegions <p>
     *            One or more AWS Regions where stack instances are deployed
     *            from the stack set. These regions can be scoped in
     *            <code>ProvisioningPreferences$StackSetRegions</code> and
     *            <code>UpdateProvisioningPreferences$StackSetRegions</code>.
     *            </p>
     *            <p>
     *            Applicable only to a <code>CFN_STACKSET</code> provisioned
     *            product type.
     *            </p>
     */
    public void setStackSetRegions(java.util.Collection<String> stackSetRegions) {
        if (stackSetRegions == null) {
            this.stackSetRegions = null;
            return;
        }

        this.stackSetRegions = new java.util.ArrayList<String>(stackSetRegions);
    }

    /**
     * <p>
     * One or more AWS Regions where stack instances are deployed from the stack
     * set. These regions can be scoped in
     * <code>ProvisioningPreferences$StackSetRegions</code> and
     * <code>UpdateProvisioningPreferences$StackSetRegions</code>.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackSetRegions <p>
     *            One or more AWS Regions where stack instances are deployed
     *            from the stack set. These regions can be scoped in
     *            <code>ProvisioningPreferences$StackSetRegions</code> and
     *            <code>UpdateProvisioningPreferences$StackSetRegions</code>.
     *            </p>
     *            <p>
     *            Applicable only to a <code>CFN_STACKSET</code> provisioned
     *            product type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisioningArtifactPreferences withStackSetRegions(String... stackSetRegions) {
        if (getStackSetRegions() == null) {
            this.stackSetRegions = new java.util.ArrayList<String>(stackSetRegions.length);
        }
        for (String value : stackSetRegions) {
            this.stackSetRegions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more AWS Regions where stack instances are deployed from the stack
     * set. These regions can be scoped in
     * <code>ProvisioningPreferences$StackSetRegions</code> and
     * <code>UpdateProvisioningPreferences$StackSetRegions</code>.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackSetRegions <p>
     *            One or more AWS Regions where stack instances are deployed
     *            from the stack set. These regions can be scoped in
     *            <code>ProvisioningPreferences$StackSetRegions</code> and
     *            <code>UpdateProvisioningPreferences$StackSetRegions</code>.
     *            </p>
     *            <p>
     *            Applicable only to a <code>CFN_STACKSET</code> provisioned
     *            product type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisioningArtifactPreferences withStackSetRegions(
            java.util.Collection<String> stackSetRegions) {
        setStackSetRegions(stackSetRegions);
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
        if (getStackSetAccounts() != null)
            sb.append("StackSetAccounts: " + getStackSetAccounts() + ",");
        if (getStackSetRegions() != null)
            sb.append("StackSetRegions: " + getStackSetRegions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStackSetAccounts() == null) ? 0 : getStackSetAccounts().hashCode());
        hashCode = prime * hashCode
                + ((getStackSetRegions() == null) ? 0 : getStackSetRegions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisioningArtifactPreferences == false)
            return false;
        ProvisioningArtifactPreferences other = (ProvisioningArtifactPreferences) obj;

        if (other.getStackSetAccounts() == null ^ this.getStackSetAccounts() == null)
            return false;
        if (other.getStackSetAccounts() != null
                && other.getStackSetAccounts().equals(this.getStackSetAccounts()) == false)
            return false;
        if (other.getStackSetRegions() == null ^ this.getStackSetRegions() == null)
            return false;
        if (other.getStackSetRegions() != null
                && other.getStackSetRegions().equals(this.getStackSetRegions()) == false)
            return false;
        return true;
    }
}
