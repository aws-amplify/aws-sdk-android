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

package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

/**
 * <p>
 * [<code>Service-managed</code> permissions] Describes whether StackSets
 * automatically deploys to AWS Organizations accounts that are added to a
 * target organization or organizational unit (OU).
 * </p>
 */
public class AutoDeployment implements Serializable {
    /**
     * <p>
     * If set to <code>true</code>, StackSets automatically deploys additional
     * stack instances to AWS Organizations accounts that are added to a target
     * organization or organizational unit (OU) in the specified Regions. If an
     * account is removed from a target organization or OU, StackSets deletes
     * stack instances from the account in the specified Regions.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * If set to <code>true</code>, stack resources are retained when an account
     * is removed from a target organization or OU. If set to <code>false</code>
     * , stack resources are deleted. Specify only if <code>Enabled</code> is
     * set to <code>True</code>.
     * </p>
     */
    private Boolean retainStacksOnAccountRemoval;

    /**
     * <p>
     * If set to <code>true</code>, StackSets automatically deploys additional
     * stack instances to AWS Organizations accounts that are added to a target
     * organization or organizational unit (OU) in the specified Regions. If an
     * account is removed from a target organization or OU, StackSets deletes
     * stack instances from the account in the specified Regions.
     * </p>
     *
     * @return <p>
     *         If set to <code>true</code>, StackSets automatically deploys
     *         additional stack instances to AWS Organizations accounts that are
     *         added to a target organization or organizational unit (OU) in the
     *         specified Regions. If an account is removed from a target
     *         organization or OU, StackSets deletes stack instances from the
     *         account in the specified Regions.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * If set to <code>true</code>, StackSets automatically deploys additional
     * stack instances to AWS Organizations accounts that are added to a target
     * organization or organizational unit (OU) in the specified Regions. If an
     * account is removed from a target organization or OU, StackSets deletes
     * stack instances from the account in the specified Regions.
     * </p>
     *
     * @return <p>
     *         If set to <code>true</code>, StackSets automatically deploys
     *         additional stack instances to AWS Organizations accounts that are
     *         added to a target organization or organizational unit (OU) in the
     *         specified Regions. If an account is removed from a target
     *         organization or OU, StackSets deletes stack instances from the
     *         account in the specified Regions.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * If set to <code>true</code>, StackSets automatically deploys additional
     * stack instances to AWS Organizations accounts that are added to a target
     * organization or organizational unit (OU) in the specified Regions. If an
     * account is removed from a target organization or OU, StackSets deletes
     * stack instances from the account in the specified Regions.
     * </p>
     *
     * @param enabled <p>
     *            If set to <code>true</code>, StackSets automatically deploys
     *            additional stack instances to AWS Organizations accounts that
     *            are added to a target organization or organizational unit (OU)
     *            in the specified Regions. If an account is removed from a
     *            target organization or OU, StackSets deletes stack instances
     *            from the account in the specified Regions.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * If set to <code>true</code>, StackSets automatically deploys additional
     * stack instances to AWS Organizations accounts that are added to a target
     * organization or organizational unit (OU) in the specified Regions. If an
     * account is removed from a target organization or OU, StackSets deletes
     * stack instances from the account in the specified Regions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            If set to <code>true</code>, StackSets automatically deploys
     *            additional stack instances to AWS Organizations accounts that
     *            are added to a target organization or organizational unit (OU)
     *            in the specified Regions. If an account is removed from a
     *            target organization or OU, StackSets deletes stack instances
     *            from the account in the specified Regions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoDeployment withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * <p>
     * If set to <code>true</code>, stack resources are retained when an account
     * is removed from a target organization or OU. If set to <code>false</code>
     * , stack resources are deleted. Specify only if <code>Enabled</code> is
     * set to <code>True</code>.
     * </p>
     *
     * @return <p>
     *         If set to <code>true</code>, stack resources are retained when an
     *         account is removed from a target organization or OU. If set to
     *         <code>false</code>, stack resources are deleted. Specify only if
     *         <code>Enabled</code> is set to <code>True</code>.
     *         </p>
     */
    public Boolean isRetainStacksOnAccountRemoval() {
        return retainStacksOnAccountRemoval;
    }

    /**
     * <p>
     * If set to <code>true</code>, stack resources are retained when an account
     * is removed from a target organization or OU. If set to <code>false</code>
     * , stack resources are deleted. Specify only if <code>Enabled</code> is
     * set to <code>True</code>.
     * </p>
     *
     * @return <p>
     *         If set to <code>true</code>, stack resources are retained when an
     *         account is removed from a target organization or OU. If set to
     *         <code>false</code>, stack resources are deleted. Specify only if
     *         <code>Enabled</code> is set to <code>True</code>.
     *         </p>
     */
    public Boolean getRetainStacksOnAccountRemoval() {
        return retainStacksOnAccountRemoval;
    }

    /**
     * <p>
     * If set to <code>true</code>, stack resources are retained when an account
     * is removed from a target organization or OU. If set to <code>false</code>
     * , stack resources are deleted. Specify only if <code>Enabled</code> is
     * set to <code>True</code>.
     * </p>
     *
     * @param retainStacksOnAccountRemoval <p>
     *            If set to <code>true</code>, stack resources are retained when
     *            an account is removed from a target organization or OU. If set
     *            to <code>false</code>, stack resources are deleted. Specify
     *            only if <code>Enabled</code> is set to <code>True</code>.
     *            </p>
     */
    public void setRetainStacksOnAccountRemoval(Boolean retainStacksOnAccountRemoval) {
        this.retainStacksOnAccountRemoval = retainStacksOnAccountRemoval;
    }

    /**
     * <p>
     * If set to <code>true</code>, stack resources are retained when an account
     * is removed from a target organization or OU. If set to <code>false</code>
     * , stack resources are deleted. Specify only if <code>Enabled</code> is
     * set to <code>True</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param retainStacksOnAccountRemoval <p>
     *            If set to <code>true</code>, stack resources are retained when
     *            an account is removed from a target organization or OU. If set
     *            to <code>false</code>, stack resources are deleted. Specify
     *            only if <code>Enabled</code> is set to <code>True</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoDeployment withRetainStacksOnAccountRemoval(Boolean retainStacksOnAccountRemoval) {
        this.retainStacksOnAccountRemoval = retainStacksOnAccountRemoval;
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
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled() + ",");
        if (getRetainStacksOnAccountRemoval() != null)
            sb.append("RetainStacksOnAccountRemoval: " + getRetainStacksOnAccountRemoval());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime
                * hashCode
                + ((getRetainStacksOnAccountRemoval() == null) ? 0
                        : getRetainStacksOnAccountRemoval().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoDeployment == false)
            return false;
        AutoDeployment other = (AutoDeployment) obj;

        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getRetainStacksOnAccountRemoval() == null
                ^ this.getRetainStacksOnAccountRemoval() == null)
            return false;
        if (other.getRetainStacksOnAccountRemoval() != null
                && other.getRetainStacksOnAccountRemoval().equals(
                        this.getRetainStacksOnAccountRemoval()) == false)
            return false;
        return true;
    }
}
