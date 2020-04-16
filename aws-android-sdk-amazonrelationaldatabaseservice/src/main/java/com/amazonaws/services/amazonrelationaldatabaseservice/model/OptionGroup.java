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
 * <p/>
 */
public class OptionGroup implements Serializable {
    /**
     * <p>
     * Specifies the name of the option group.
     * </p>
     */
    private String optionGroupName;

    /**
     * <p>
     * Provides a description of the option group.
     * </p>
     */
    private String optionGroupDescription;

    /**
     * <p>
     * Indicates the name of the engine that this option group can be applied
     * to.
     * </p>
     */
    private String engineName;

    /**
     * <p>
     * Indicates the major engine version associated with this option group.
     * </p>
     */
    private String majorEngineVersion;

    /**
     * <p>
     * Indicates what options are available in the option group.
     * </p>
     */
    private java.util.List<Option> options;

    /**
     * <p>
     * Indicates whether this option group can be applied to both VPC and
     * non-VPC instances. The value <code>true</code> indicates the option group
     * can be applied to both VPC and non-VPC instances.
     * </p>
     */
    private Boolean allowsVpcAndNonVpcInstanceMemberships;

    /**
     * <p>
     * If <b>AllowsVpcAndNonVpcInstanceMemberships</b> is <code>false</code>,
     * this field is blank. If <b>AllowsVpcAndNonVpcInstanceMemberships</b> is
     * <code>true</code> and this field is blank, then this option group can be
     * applied to both VPC and non-VPC instances. If this field contains a
     * value, then this option group can only be applied to instances that are
     * in the VPC indicated by this field.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the option group.
     * </p>
     */
    private String optionGroupArn;

    /**
     * <p>
     * Specifies the name of the option group.
     * </p>
     *
     * @return <p>
     *         Specifies the name of the option group.
     *         </p>
     */
    public String getOptionGroupName() {
        return optionGroupName;
    }

    /**
     * <p>
     * Specifies the name of the option group.
     * </p>
     *
     * @param optionGroupName <p>
     *            Specifies the name of the option group.
     *            </p>
     */
    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    /**
     * <p>
     * Specifies the name of the option group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionGroupName <p>
     *            Specifies the name of the option group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionGroup withOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
        return this;
    }

    /**
     * <p>
     * Provides a description of the option group.
     * </p>
     *
     * @return <p>
     *         Provides a description of the option group.
     *         </p>
     */
    public String getOptionGroupDescription() {
        return optionGroupDescription;
    }

    /**
     * <p>
     * Provides a description of the option group.
     * </p>
     *
     * @param optionGroupDescription <p>
     *            Provides a description of the option group.
     *            </p>
     */
    public void setOptionGroupDescription(String optionGroupDescription) {
        this.optionGroupDescription = optionGroupDescription;
    }

    /**
     * <p>
     * Provides a description of the option group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionGroupDescription <p>
     *            Provides a description of the option group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionGroup withOptionGroupDescription(String optionGroupDescription) {
        this.optionGroupDescription = optionGroupDescription;
        return this;
    }

    /**
     * <p>
     * Indicates the name of the engine that this option group can be applied
     * to.
     * </p>
     *
     * @return <p>
     *         Indicates the name of the engine that this option group can be
     *         applied to.
     *         </p>
     */
    public String getEngineName() {
        return engineName;
    }

    /**
     * <p>
     * Indicates the name of the engine that this option group can be applied
     * to.
     * </p>
     *
     * @param engineName <p>
     *            Indicates the name of the engine that this option group can be
     *            applied to.
     *            </p>
     */
    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    /**
     * <p>
     * Indicates the name of the engine that this option group can be applied
     * to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineName <p>
     *            Indicates the name of the engine that this option group can be
     *            applied to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionGroup withEngineName(String engineName) {
        this.engineName = engineName;
        return this;
    }

    /**
     * <p>
     * Indicates the major engine version associated with this option group.
     * </p>
     *
     * @return <p>
     *         Indicates the major engine version associated with this option
     *         group.
     *         </p>
     */
    public String getMajorEngineVersion() {
        return majorEngineVersion;
    }

    /**
     * <p>
     * Indicates the major engine version associated with this option group.
     * </p>
     *
     * @param majorEngineVersion <p>
     *            Indicates the major engine version associated with this option
     *            group.
     *            </p>
     */
    public void setMajorEngineVersion(String majorEngineVersion) {
        this.majorEngineVersion = majorEngineVersion;
    }

    /**
     * <p>
     * Indicates the major engine version associated with this option group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param majorEngineVersion <p>
     *            Indicates the major engine version associated with this option
     *            group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionGroup withMajorEngineVersion(String majorEngineVersion) {
        this.majorEngineVersion = majorEngineVersion;
        return this;
    }

    /**
     * <p>
     * Indicates what options are available in the option group.
     * </p>
     *
     * @return <p>
     *         Indicates what options are available in the option group.
     *         </p>
     */
    public java.util.List<Option> getOptions() {
        return options;
    }

    /**
     * <p>
     * Indicates what options are available in the option group.
     * </p>
     *
     * @param options <p>
     *            Indicates what options are available in the option group.
     *            </p>
     */
    public void setOptions(java.util.Collection<Option> options) {
        if (options == null) {
            this.options = null;
            return;
        }

        this.options = new java.util.ArrayList<Option>(options);
    }

    /**
     * <p>
     * Indicates what options are available in the option group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param options <p>
     *            Indicates what options are available in the option group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionGroup withOptions(Option... options) {
        if (getOptions() == null) {
            this.options = new java.util.ArrayList<Option>(options.length);
        }
        for (Option value : options) {
            this.options.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Indicates what options are available in the option group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param options <p>
     *            Indicates what options are available in the option group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionGroup withOptions(java.util.Collection<Option> options) {
        setOptions(options);
        return this;
    }

    /**
     * <p>
     * Indicates whether this option group can be applied to both VPC and
     * non-VPC instances. The value <code>true</code> indicates the option group
     * can be applied to both VPC and non-VPC instances.
     * </p>
     *
     * @return <p>
     *         Indicates whether this option group can be applied to both VPC
     *         and non-VPC instances. The value <code>true</code> indicates the
     *         option group can be applied to both VPC and non-VPC instances.
     *         </p>
     */
    public Boolean isAllowsVpcAndNonVpcInstanceMemberships() {
        return allowsVpcAndNonVpcInstanceMemberships;
    }

    /**
     * <p>
     * Indicates whether this option group can be applied to both VPC and
     * non-VPC instances. The value <code>true</code> indicates the option group
     * can be applied to both VPC and non-VPC instances.
     * </p>
     *
     * @return <p>
     *         Indicates whether this option group can be applied to both VPC
     *         and non-VPC instances. The value <code>true</code> indicates the
     *         option group can be applied to both VPC and non-VPC instances.
     *         </p>
     */
    public Boolean getAllowsVpcAndNonVpcInstanceMemberships() {
        return allowsVpcAndNonVpcInstanceMemberships;
    }

    /**
     * <p>
     * Indicates whether this option group can be applied to both VPC and
     * non-VPC instances. The value <code>true</code> indicates the option group
     * can be applied to both VPC and non-VPC instances.
     * </p>
     *
     * @param allowsVpcAndNonVpcInstanceMemberships <p>
     *            Indicates whether this option group can be applied to both VPC
     *            and non-VPC instances. The value <code>true</code> indicates
     *            the option group can be applied to both VPC and non-VPC
     *            instances.
     *            </p>
     */
    public void setAllowsVpcAndNonVpcInstanceMemberships(
            Boolean allowsVpcAndNonVpcInstanceMemberships) {
        this.allowsVpcAndNonVpcInstanceMemberships = allowsVpcAndNonVpcInstanceMemberships;
    }

    /**
     * <p>
     * Indicates whether this option group can be applied to both VPC and
     * non-VPC instances. The value <code>true</code> indicates the option group
     * can be applied to both VPC and non-VPC instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowsVpcAndNonVpcInstanceMemberships <p>
     *            Indicates whether this option group can be applied to both VPC
     *            and non-VPC instances. The value <code>true</code> indicates
     *            the option group can be applied to both VPC and non-VPC
     *            instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionGroup withAllowsVpcAndNonVpcInstanceMemberships(
            Boolean allowsVpcAndNonVpcInstanceMemberships) {
        this.allowsVpcAndNonVpcInstanceMemberships = allowsVpcAndNonVpcInstanceMemberships;
        return this;
    }

    /**
     * <p>
     * If <b>AllowsVpcAndNonVpcInstanceMemberships</b> is <code>false</code>,
     * this field is blank. If <b>AllowsVpcAndNonVpcInstanceMemberships</b> is
     * <code>true</code> and this field is blank, then this option group can be
     * applied to both VPC and non-VPC instances. If this field contains a
     * value, then this option group can only be applied to instances that are
     * in the VPC indicated by this field.
     * </p>
     *
     * @return <p>
     *         If <b>AllowsVpcAndNonVpcInstanceMemberships</b> is
     *         <code>false</code>, this field is blank. If
     *         <b>AllowsVpcAndNonVpcInstanceMemberships</b> is <code>true</code>
     *         and this field is blank, then this option group can be applied to
     *         both VPC and non-VPC instances. If this field contains a value,
     *         then this option group can only be applied to instances that are
     *         in the VPC indicated by this field.
     *         </p>
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * <p>
     * If <b>AllowsVpcAndNonVpcInstanceMemberships</b> is <code>false</code>,
     * this field is blank. If <b>AllowsVpcAndNonVpcInstanceMemberships</b> is
     * <code>true</code> and this field is blank, then this option group can be
     * applied to both VPC and non-VPC instances. If this field contains a
     * value, then this option group can only be applied to instances that are
     * in the VPC indicated by this field.
     * </p>
     *
     * @param vpcId <p>
     *            If <b>AllowsVpcAndNonVpcInstanceMemberships</b> is
     *            <code>false</code>, this field is blank. If
     *            <b>AllowsVpcAndNonVpcInstanceMemberships</b> is
     *            <code>true</code> and this field is blank, then this option
     *            group can be applied to both VPC and non-VPC instances. If
     *            this field contains a value, then this option group can only
     *            be applied to instances that are in the VPC indicated by this
     *            field.
     *            </p>
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * If <b>AllowsVpcAndNonVpcInstanceMemberships</b> is <code>false</code>,
     * this field is blank. If <b>AllowsVpcAndNonVpcInstanceMemberships</b> is
     * <code>true</code> and this field is blank, then this option group can be
     * applied to both VPC and non-VPC instances. If this field contains a
     * value, then this option group can only be applied to instances that are
     * in the VPC indicated by this field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcId <p>
     *            If <b>AllowsVpcAndNonVpcInstanceMemberships</b> is
     *            <code>false</code>, this field is blank. If
     *            <b>AllowsVpcAndNonVpcInstanceMemberships</b> is
     *            <code>true</code> and this field is blank, then this option
     *            group can be applied to both VPC and non-VPC instances. If
     *            this field contains a value, then this option group can only
     *            be applied to instances that are in the VPC indicated by this
     *            field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionGroup withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the option group.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the option group.
     *         </p>
     */
    public String getOptionGroupArn() {
        return optionGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the option group.
     * </p>
     *
     * @param optionGroupArn <p>
     *            The Amazon Resource Name (ARN) for the option group.
     *            </p>
     */
    public void setOptionGroupArn(String optionGroupArn) {
        this.optionGroupArn = optionGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the option group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionGroupArn <p>
     *            The Amazon Resource Name (ARN) for the option group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionGroup withOptionGroupArn(String optionGroupArn) {
        this.optionGroupArn = optionGroupArn;
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
        if (getOptionGroupDescription() != null)
            sb.append("OptionGroupDescription: " + getOptionGroupDescription() + ",");
        if (getEngineName() != null)
            sb.append("EngineName: " + getEngineName() + ",");
        if (getMajorEngineVersion() != null)
            sb.append("MajorEngineVersion: " + getMajorEngineVersion() + ",");
        if (getOptions() != null)
            sb.append("Options: " + getOptions() + ",");
        if (getAllowsVpcAndNonVpcInstanceMemberships() != null)
            sb.append("AllowsVpcAndNonVpcInstanceMemberships: "
                    + getAllowsVpcAndNonVpcInstanceMemberships() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId() + ",");
        if (getOptionGroupArn() != null)
            sb.append("OptionGroupArn: " + getOptionGroupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode());
        hashCode = prime
                * hashCode
                + ((getOptionGroupDescription() == null) ? 0 : getOptionGroupDescription()
                        .hashCode());
        hashCode = prime * hashCode + ((getEngineName() == null) ? 0 : getEngineName().hashCode());
        hashCode = prime * hashCode
                + ((getMajorEngineVersion() == null) ? 0 : getMajorEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        hashCode = prime
                * hashCode
                + ((getAllowsVpcAndNonVpcInstanceMemberships() == null) ? 0
                        : getAllowsVpcAndNonVpcInstanceMemberships().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode
                + ((getOptionGroupArn() == null) ? 0 : getOptionGroupArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OptionGroup == false)
            return false;
        OptionGroup other = (OptionGroup) obj;

        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null)
            return false;
        if (other.getOptionGroupName() != null
                && other.getOptionGroupName().equals(this.getOptionGroupName()) == false)
            return false;
        if (other.getOptionGroupDescription() == null ^ this.getOptionGroupDescription() == null)
            return false;
        if (other.getOptionGroupDescription() != null
                && other.getOptionGroupDescription().equals(this.getOptionGroupDescription()) == false)
            return false;
        if (other.getEngineName() == null ^ this.getEngineName() == null)
            return false;
        if (other.getEngineName() != null
                && other.getEngineName().equals(this.getEngineName()) == false)
            return false;
        if (other.getMajorEngineVersion() == null ^ this.getMajorEngineVersion() == null)
            return false;
        if (other.getMajorEngineVersion() != null
                && other.getMajorEngineVersion().equals(this.getMajorEngineVersion()) == false)
            return false;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        if (other.getAllowsVpcAndNonVpcInstanceMemberships() == null
                ^ this.getAllowsVpcAndNonVpcInstanceMemberships() == null)
            return false;
        if (other.getAllowsVpcAndNonVpcInstanceMemberships() != null
                && other.getAllowsVpcAndNonVpcInstanceMemberships().equals(
                        this.getAllowsVpcAndNonVpcInstanceMemberships()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getOptionGroupArn() == null ^ this.getOptionGroupArn() == null)
            return false;
        if (other.getOptionGroupArn() != null
                && other.getOptionGroupArn().equals(this.getOptionGroupArn()) == false)
            return false;
        return true;
    }
}
