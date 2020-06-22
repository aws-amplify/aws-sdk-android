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

/**
 * <p>
 * Option details.
 * </p>
 */
public class Option implements Serializable {
    /**
     * <p>
     * The name of the option.
     * </p>
     */
    private String optionName;

    /**
     * <p>
     * The description of the option.
     * </p>
     */
    private String optionDescription;

    /**
     * <p>
     * Indicate if this option is persistent.
     * </p>
     */
    private Boolean persistent;

    /**
     * <p>
     * Indicate if this option is permanent.
     * </p>
     */
    private Boolean permanent;

    /**
     * <p>
     * If required, the port configured for this option to use.
     * </p>
     */
    private Integer port;

    /**
     * <p>
     * The version of the option.
     * </p>
     */
    private String optionVersion;

    /**
     * <p>
     * The option settings for this option.
     * </p>
     */
    private java.util.List<OptionSetting> optionSettings;

    /**
     * <p>
     * If the option requires access to a port, then this DB security group
     * allows access to the port.
     * </p>
     */
    private java.util.List<DBSecurityGroupMembership> dBSecurityGroupMemberships;

    /**
     * <p>
     * If the option requires access to a port, then this VPC security group
     * allows access to the port.
     * </p>
     */
    private java.util.List<VpcSecurityGroupMembership> vpcSecurityGroupMemberships;

    /**
     * <p>
     * The name of the option.
     * </p>
     *
     * @return <p>
     *         The name of the option.
     *         </p>
     */
    public String getOptionName() {
        return optionName;
    }

    /**
     * <p>
     * The name of the option.
     * </p>
     *
     * @param optionName <p>
     *            The name of the option.
     *            </p>
     */
    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    /**
     * <p>
     * The name of the option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionName <p>
     *            The name of the option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Option withOptionName(String optionName) {
        this.optionName = optionName;
        return this;
    }

    /**
     * <p>
     * The description of the option.
     * </p>
     *
     * @return <p>
     *         The description of the option.
     *         </p>
     */
    public String getOptionDescription() {
        return optionDescription;
    }

    /**
     * <p>
     * The description of the option.
     * </p>
     *
     * @param optionDescription <p>
     *            The description of the option.
     *            </p>
     */
    public void setOptionDescription(String optionDescription) {
        this.optionDescription = optionDescription;
    }

    /**
     * <p>
     * The description of the option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionDescription <p>
     *            The description of the option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Option withOptionDescription(String optionDescription) {
        this.optionDescription = optionDescription;
        return this;
    }

    /**
     * <p>
     * Indicate if this option is persistent.
     * </p>
     *
     * @return <p>
     *         Indicate if this option is persistent.
     *         </p>
     */
    public Boolean isPersistent() {
        return persistent;
    }

    /**
     * <p>
     * Indicate if this option is persistent.
     * </p>
     *
     * @return <p>
     *         Indicate if this option is persistent.
     *         </p>
     */
    public Boolean getPersistent() {
        return persistent;
    }

    /**
     * <p>
     * Indicate if this option is persistent.
     * </p>
     *
     * @param persistent <p>
     *            Indicate if this option is persistent.
     *            </p>
     */
    public void setPersistent(Boolean persistent) {
        this.persistent = persistent;
    }

    /**
     * <p>
     * Indicate if this option is persistent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param persistent <p>
     *            Indicate if this option is persistent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Option withPersistent(Boolean persistent) {
        this.persistent = persistent;
        return this;
    }

    /**
     * <p>
     * Indicate if this option is permanent.
     * </p>
     *
     * @return <p>
     *         Indicate if this option is permanent.
     *         </p>
     */
    public Boolean isPermanent() {
        return permanent;
    }

    /**
     * <p>
     * Indicate if this option is permanent.
     * </p>
     *
     * @return <p>
     *         Indicate if this option is permanent.
     *         </p>
     */
    public Boolean getPermanent() {
        return permanent;
    }

    /**
     * <p>
     * Indicate if this option is permanent.
     * </p>
     *
     * @param permanent <p>
     *            Indicate if this option is permanent.
     *            </p>
     */
    public void setPermanent(Boolean permanent) {
        this.permanent = permanent;
    }

    /**
     * <p>
     * Indicate if this option is permanent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param permanent <p>
     *            Indicate if this option is permanent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Option withPermanent(Boolean permanent) {
        this.permanent = permanent;
        return this;
    }

    /**
     * <p>
     * If required, the port configured for this option to use.
     * </p>
     *
     * @return <p>
     *         If required, the port configured for this option to use.
     *         </p>
     */
    public Integer getPort() {
        return port;
    }

    /**
     * <p>
     * If required, the port configured for this option to use.
     * </p>
     *
     * @param port <p>
     *            If required, the port configured for this option to use.
     *            </p>
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * If required, the port configured for this option to use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param port <p>
     *            If required, the port configured for this option to use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Option withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * <p>
     * The version of the option.
     * </p>
     *
     * @return <p>
     *         The version of the option.
     *         </p>
     */
    public String getOptionVersion() {
        return optionVersion;
    }

    /**
     * <p>
     * The version of the option.
     * </p>
     *
     * @param optionVersion <p>
     *            The version of the option.
     *            </p>
     */
    public void setOptionVersion(String optionVersion) {
        this.optionVersion = optionVersion;
    }

    /**
     * <p>
     * The version of the option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionVersion <p>
     *            The version of the option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Option withOptionVersion(String optionVersion) {
        this.optionVersion = optionVersion;
        return this;
    }

    /**
     * <p>
     * The option settings for this option.
     * </p>
     *
     * @return <p>
     *         The option settings for this option.
     *         </p>
     */
    public java.util.List<OptionSetting> getOptionSettings() {
        return optionSettings;
    }

    /**
     * <p>
     * The option settings for this option.
     * </p>
     *
     * @param optionSettings <p>
     *            The option settings for this option.
     *            </p>
     */
    public void setOptionSettings(java.util.Collection<OptionSetting> optionSettings) {
        if (optionSettings == null) {
            this.optionSettings = null;
            return;
        }

        this.optionSettings = new java.util.ArrayList<OptionSetting>(optionSettings);
    }

    /**
     * <p>
     * The option settings for this option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionSettings <p>
     *            The option settings for this option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Option withOptionSettings(OptionSetting... optionSettings) {
        if (getOptionSettings() == null) {
            this.optionSettings = new java.util.ArrayList<OptionSetting>(optionSettings.length);
        }
        for (OptionSetting value : optionSettings) {
            this.optionSettings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The option settings for this option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionSettings <p>
     *            The option settings for this option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Option withOptionSettings(java.util.Collection<OptionSetting> optionSettings) {
        setOptionSettings(optionSettings);
        return this;
    }

    /**
     * <p>
     * If the option requires access to a port, then this DB security group
     * allows access to the port.
     * </p>
     *
     * @return <p>
     *         If the option requires access to a port, then this DB security
     *         group allows access to the port.
     *         </p>
     */
    public java.util.List<DBSecurityGroupMembership> getDBSecurityGroupMemberships() {
        return dBSecurityGroupMemberships;
    }

    /**
     * <p>
     * If the option requires access to a port, then this DB security group
     * allows access to the port.
     * </p>
     *
     * @param dBSecurityGroupMemberships <p>
     *            If the option requires access to a port, then this DB security
     *            group allows access to the port.
     *            </p>
     */
    public void setDBSecurityGroupMemberships(
            java.util.Collection<DBSecurityGroupMembership> dBSecurityGroupMemberships) {
        if (dBSecurityGroupMemberships == null) {
            this.dBSecurityGroupMemberships = null;
            return;
        }

        this.dBSecurityGroupMemberships = new java.util.ArrayList<DBSecurityGroupMembership>(
                dBSecurityGroupMemberships);
    }

    /**
     * <p>
     * If the option requires access to a port, then this DB security group
     * allows access to the port.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBSecurityGroupMemberships <p>
     *            If the option requires access to a port, then this DB security
     *            group allows access to the port.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Option withDBSecurityGroupMemberships(
            DBSecurityGroupMembership... dBSecurityGroupMemberships) {
        if (getDBSecurityGroupMemberships() == null) {
            this.dBSecurityGroupMemberships = new java.util.ArrayList<DBSecurityGroupMembership>(
                    dBSecurityGroupMemberships.length);
        }
        for (DBSecurityGroupMembership value : dBSecurityGroupMemberships) {
            this.dBSecurityGroupMemberships.add(value);
        }
        return this;
    }

    /**
     * <p>
     * If the option requires access to a port, then this DB security group
     * allows access to the port.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBSecurityGroupMemberships <p>
     *            If the option requires access to a port, then this DB security
     *            group allows access to the port.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Option withDBSecurityGroupMemberships(
            java.util.Collection<DBSecurityGroupMembership> dBSecurityGroupMemberships) {
        setDBSecurityGroupMemberships(dBSecurityGroupMemberships);
        return this;
    }

    /**
     * <p>
     * If the option requires access to a port, then this VPC security group
     * allows access to the port.
     * </p>
     *
     * @return <p>
     *         If the option requires access to a port, then this VPC security
     *         group allows access to the port.
     *         </p>
     */
    public java.util.List<VpcSecurityGroupMembership> getVpcSecurityGroupMemberships() {
        return vpcSecurityGroupMemberships;
    }

    /**
     * <p>
     * If the option requires access to a port, then this VPC security group
     * allows access to the port.
     * </p>
     *
     * @param vpcSecurityGroupMemberships <p>
     *            If the option requires access to a port, then this VPC
     *            security group allows access to the port.
     *            </p>
     */
    public void setVpcSecurityGroupMemberships(
            java.util.Collection<VpcSecurityGroupMembership> vpcSecurityGroupMemberships) {
        if (vpcSecurityGroupMemberships == null) {
            this.vpcSecurityGroupMemberships = null;
            return;
        }

        this.vpcSecurityGroupMemberships = new java.util.ArrayList<VpcSecurityGroupMembership>(
                vpcSecurityGroupMemberships);
    }

    /**
     * <p>
     * If the option requires access to a port, then this VPC security group
     * allows access to the port.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcSecurityGroupMemberships <p>
     *            If the option requires access to a port, then this VPC
     *            security group allows access to the port.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Option withVpcSecurityGroupMemberships(
            VpcSecurityGroupMembership... vpcSecurityGroupMemberships) {
        if (getVpcSecurityGroupMemberships() == null) {
            this.vpcSecurityGroupMemberships = new java.util.ArrayList<VpcSecurityGroupMembership>(
                    vpcSecurityGroupMemberships.length);
        }
        for (VpcSecurityGroupMembership value : vpcSecurityGroupMemberships) {
            this.vpcSecurityGroupMemberships.add(value);
        }
        return this;
    }

    /**
     * <p>
     * If the option requires access to a port, then this VPC security group
     * allows access to the port.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcSecurityGroupMemberships <p>
     *            If the option requires access to a port, then this VPC
     *            security group allows access to the port.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Option withVpcSecurityGroupMemberships(
            java.util.Collection<VpcSecurityGroupMembership> vpcSecurityGroupMemberships) {
        setVpcSecurityGroupMemberships(vpcSecurityGroupMemberships);
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
        if (getOptionName() != null)
            sb.append("OptionName: " + getOptionName() + ",");
        if (getOptionDescription() != null)
            sb.append("OptionDescription: " + getOptionDescription() + ",");
        if (getPersistent() != null)
            sb.append("Persistent: " + getPersistent() + ",");
        if (getPermanent() != null)
            sb.append("Permanent: " + getPermanent() + ",");
        if (getPort() != null)
            sb.append("Port: " + getPort() + ",");
        if (getOptionVersion() != null)
            sb.append("OptionVersion: " + getOptionVersion() + ",");
        if (getOptionSettings() != null)
            sb.append("OptionSettings: " + getOptionSettings() + ",");
        if (getDBSecurityGroupMemberships() != null)
            sb.append("DBSecurityGroupMemberships: " + getDBSecurityGroupMemberships() + ",");
        if (getVpcSecurityGroupMemberships() != null)
            sb.append("VpcSecurityGroupMemberships: " + getVpcSecurityGroupMemberships());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOptionName() == null) ? 0 : getOptionName().hashCode());
        hashCode = prime * hashCode
                + ((getOptionDescription() == null) ? 0 : getOptionDescription().hashCode());
        hashCode = prime * hashCode + ((getPersistent() == null) ? 0 : getPersistent().hashCode());
        hashCode = prime * hashCode + ((getPermanent() == null) ? 0 : getPermanent().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode
                + ((getOptionVersion() == null) ? 0 : getOptionVersion().hashCode());
        hashCode = prime * hashCode
                + ((getOptionSettings() == null) ? 0 : getOptionSettings().hashCode());
        hashCode = prime
                * hashCode
                + ((getDBSecurityGroupMemberships() == null) ? 0 : getDBSecurityGroupMemberships()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getVpcSecurityGroupMemberships() == null) ? 0
                        : getVpcSecurityGroupMemberships().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Option == false)
            return false;
        Option other = (Option) obj;

        if (other.getOptionName() == null ^ this.getOptionName() == null)
            return false;
        if (other.getOptionName() != null
                && other.getOptionName().equals(this.getOptionName()) == false)
            return false;
        if (other.getOptionDescription() == null ^ this.getOptionDescription() == null)
            return false;
        if (other.getOptionDescription() != null
                && other.getOptionDescription().equals(this.getOptionDescription()) == false)
            return false;
        if (other.getPersistent() == null ^ this.getPersistent() == null)
            return false;
        if (other.getPersistent() != null
                && other.getPersistent().equals(this.getPersistent()) == false)
            return false;
        if (other.getPermanent() == null ^ this.getPermanent() == null)
            return false;
        if (other.getPermanent() != null
                && other.getPermanent().equals(this.getPermanent()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getOptionVersion() == null ^ this.getOptionVersion() == null)
            return false;
        if (other.getOptionVersion() != null
                && other.getOptionVersion().equals(this.getOptionVersion()) == false)
            return false;
        if (other.getOptionSettings() == null ^ this.getOptionSettings() == null)
            return false;
        if (other.getOptionSettings() != null
                && other.getOptionSettings().equals(this.getOptionSettings()) == false)
            return false;
        if (other.getDBSecurityGroupMemberships() == null
                ^ this.getDBSecurityGroupMemberships() == null)
            return false;
        if (other.getDBSecurityGroupMemberships() != null
                && other.getDBSecurityGroupMemberships().equals(
                        this.getDBSecurityGroupMemberships()) == false)
            return false;
        if (other.getVpcSecurityGroupMemberships() == null
                ^ this.getVpcSecurityGroupMemberships() == null)
            return false;
        if (other.getVpcSecurityGroupMemberships() != null
                && other.getVpcSecurityGroupMemberships().equals(
                        this.getVpcSecurityGroupMemberships()) == false)
            return false;
        return true;
    }
}
