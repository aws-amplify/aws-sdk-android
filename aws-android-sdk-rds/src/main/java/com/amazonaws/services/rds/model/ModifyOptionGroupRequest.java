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

package com.amazonaws.services.rds.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Modifies an existing option group.
 * </p>
 */
public class ModifyOptionGroupRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the option group to be modified.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security
     * TDE, can't be removed from an option group, and that option group can't
     * be removed from a DB instance once it is associated with a DB instance
     * </p>
     */
    private String optionGroupName;

    /**
     * <p>
     * Options in this list are added to the option group or, if already
     * present, the specified configuration is used to update the existing
     * configuration.
     * </p>
     */
    private java.util.List<OptionConfiguration> optionsToInclude;

    /**
     * <p>
     * Options in this list are removed from the option group.
     * </p>
     */
    private java.util.List<String> optionsToRemove;

    /**
     * <p>
     * A value that indicates whether to apply the change immediately or during
     * the next maintenance window for each instance associated with the option
     * group.
     * </p>
     */
    private Boolean applyImmediately;

    /**
     * <p>
     * The name of the option group to be modified.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security
     * TDE, can't be removed from an option group, and that option group can't
     * be removed from a DB instance once it is associated with a DB instance
     * </p>
     *
     * @return <p>
     *         The name of the option group to be modified.
     *         </p>
     *         <p>
     *         Permanent options, such as the TDE option for Oracle Advanced
     *         Security TDE, can't be removed from an option group, and that
     *         option group can't be removed from a DB instance once it is
     *         associated with a DB instance
     *         </p>
     */
    public String getOptionGroupName() {
        return optionGroupName;
    }

    /**
     * <p>
     * The name of the option group to be modified.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security
     * TDE, can't be removed from an option group, and that option group can't
     * be removed from a DB instance once it is associated with a DB instance
     * </p>
     *
     * @param optionGroupName <p>
     *            The name of the option group to be modified.
     *            </p>
     *            <p>
     *            Permanent options, such as the TDE option for Oracle Advanced
     *            Security TDE, can't be removed from an option group, and that
     *            option group can't be removed from a DB instance once it is
     *            associated with a DB instance
     *            </p>
     */
    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    /**
     * <p>
     * The name of the option group to be modified.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security
     * TDE, can't be removed from an option group, and that option group can't
     * be removed from a DB instance once it is associated with a DB instance
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionGroupName <p>
     *            The name of the option group to be modified.
     *            </p>
     *            <p>
     *            Permanent options, such as the TDE option for Oracle Advanced
     *            Security TDE, can't be removed from an option group, and that
     *            option group can't be removed from a DB instance once it is
     *            associated with a DB instance
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyOptionGroupRequest withOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
        return this;
    }

    /**
     * <p>
     * Options in this list are added to the option group or, if already
     * present, the specified configuration is used to update the existing
     * configuration.
     * </p>
     *
     * @return <p>
     *         Options in this list are added to the option group or, if already
     *         present, the specified configuration is used to update the
     *         existing configuration.
     *         </p>
     */
    public java.util.List<OptionConfiguration> getOptionsToInclude() {
        return optionsToInclude;
    }

    /**
     * <p>
     * Options in this list are added to the option group or, if already
     * present, the specified configuration is used to update the existing
     * configuration.
     * </p>
     *
     * @param optionsToInclude <p>
     *            Options in this list are added to the option group or, if
     *            already present, the specified configuration is used to update
     *            the existing configuration.
     *            </p>
     */
    public void setOptionsToInclude(java.util.Collection<OptionConfiguration> optionsToInclude) {
        if (optionsToInclude == null) {
            this.optionsToInclude = null;
            return;
        }

        this.optionsToInclude = new java.util.ArrayList<OptionConfiguration>(optionsToInclude);
    }

    /**
     * <p>
     * Options in this list are added to the option group or, if already
     * present, the specified configuration is used to update the existing
     * configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionsToInclude <p>
     *            Options in this list are added to the option group or, if
     *            already present, the specified configuration is used to update
     *            the existing configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyOptionGroupRequest withOptionsToInclude(OptionConfiguration... optionsToInclude) {
        if (getOptionsToInclude() == null) {
            this.optionsToInclude = new java.util.ArrayList<OptionConfiguration>(
                    optionsToInclude.length);
        }
        for (OptionConfiguration value : optionsToInclude) {
            this.optionsToInclude.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Options in this list are added to the option group or, if already
     * present, the specified configuration is used to update the existing
     * configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionsToInclude <p>
     *            Options in this list are added to the option group or, if
     *            already present, the specified configuration is used to update
     *            the existing configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyOptionGroupRequest withOptionsToInclude(
            java.util.Collection<OptionConfiguration> optionsToInclude) {
        setOptionsToInclude(optionsToInclude);
        return this;
    }

    /**
     * <p>
     * Options in this list are removed from the option group.
     * </p>
     *
     * @return <p>
     *         Options in this list are removed from the option group.
     *         </p>
     */
    public java.util.List<String> getOptionsToRemove() {
        return optionsToRemove;
    }

    /**
     * <p>
     * Options in this list are removed from the option group.
     * </p>
     *
     * @param optionsToRemove <p>
     *            Options in this list are removed from the option group.
     *            </p>
     */
    public void setOptionsToRemove(java.util.Collection<String> optionsToRemove) {
        if (optionsToRemove == null) {
            this.optionsToRemove = null;
            return;
        }

        this.optionsToRemove = new java.util.ArrayList<String>(optionsToRemove);
    }

    /**
     * <p>
     * Options in this list are removed from the option group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionsToRemove <p>
     *            Options in this list are removed from the option group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyOptionGroupRequest withOptionsToRemove(String... optionsToRemove) {
        if (getOptionsToRemove() == null) {
            this.optionsToRemove = new java.util.ArrayList<String>(optionsToRemove.length);
        }
        for (String value : optionsToRemove) {
            this.optionsToRemove.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Options in this list are removed from the option group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionsToRemove <p>
     *            Options in this list are removed from the option group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyOptionGroupRequest withOptionsToRemove(java.util.Collection<String> optionsToRemove) {
        setOptionsToRemove(optionsToRemove);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to apply the change immediately or during
     * the next maintenance window for each instance associated with the option
     * group.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to apply the change immediately or
     *         during the next maintenance window for each instance associated
     *         with the option group.
     *         </p>
     */
    public Boolean isApplyImmediately() {
        return applyImmediately;
    }

    /**
     * <p>
     * A value that indicates whether to apply the change immediately or during
     * the next maintenance window for each instance associated with the option
     * group.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to apply the change immediately or
     *         during the next maintenance window for each instance associated
     *         with the option group.
     *         </p>
     */
    public Boolean getApplyImmediately() {
        return applyImmediately;
    }

    /**
     * <p>
     * A value that indicates whether to apply the change immediately or during
     * the next maintenance window for each instance associated with the option
     * group.
     * </p>
     *
     * @param applyImmediately <p>
     *            A value that indicates whether to apply the change immediately
     *            or during the next maintenance window for each instance
     *            associated with the option group.
     *            </p>
     */
    public void setApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
    }

    /**
     * <p>
     * A value that indicates whether to apply the change immediately or during
     * the next maintenance window for each instance associated with the option
     * group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applyImmediately <p>
     *            A value that indicates whether to apply the change immediately
     *            or during the next maintenance window for each instance
     *            associated with the option group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyOptionGroupRequest withApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
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
        if (getOptionGroupName() != null)
            sb.append("OptionGroupName: " + getOptionGroupName() + ",");
        if (getOptionsToInclude() != null)
            sb.append("OptionsToInclude: " + getOptionsToInclude() + ",");
        if (getOptionsToRemove() != null)
            sb.append("OptionsToRemove: " + getOptionsToRemove() + ",");
        if (getApplyImmediately() != null)
            sb.append("ApplyImmediately: " + getApplyImmediately());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getOptionsToInclude() == null) ? 0 : getOptionsToInclude().hashCode());
        hashCode = prime * hashCode
                + ((getOptionsToRemove() == null) ? 0 : getOptionsToRemove().hashCode());
        hashCode = prime * hashCode
                + ((getApplyImmediately() == null) ? 0 : getApplyImmediately().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyOptionGroupRequest == false)
            return false;
        ModifyOptionGroupRequest other = (ModifyOptionGroupRequest) obj;

        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null)
            return false;
        if (other.getOptionGroupName() != null
                && other.getOptionGroupName().equals(this.getOptionGroupName()) == false)
            return false;
        if (other.getOptionsToInclude() == null ^ this.getOptionsToInclude() == null)
            return false;
        if (other.getOptionsToInclude() != null
                && other.getOptionsToInclude().equals(this.getOptionsToInclude()) == false)
            return false;
        if (other.getOptionsToRemove() == null ^ this.getOptionsToRemove() == null)
            return false;
        if (other.getOptionsToRemove() != null
                && other.getOptionsToRemove().equals(this.getOptionsToRemove()) == false)
            return false;
        if (other.getApplyImmediately() == null ^ this.getApplyImmediately() == null)
            return false;
        if (other.getApplyImmediately() != null
                && other.getApplyImmediately().equals(this.getApplyImmediately()) == false)
            return false;
        return true;
    }
}
