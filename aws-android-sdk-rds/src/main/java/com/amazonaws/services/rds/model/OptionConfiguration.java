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
 * A list of all available options
 * </p>
 */
public class OptionConfiguration implements Serializable {
    /**
     * <p>
     * The configuration of options to include in a group.
     * </p>
     */
    private String optionName;

    /**
     * <p>
     * The optional port for the option.
     * </p>
     */
    private Integer port;

    /**
     * <p>
     * The version for the option.
     * </p>
     */
    private String optionVersion;

    /**
     * <p>
     * A list of DBSecurityGroupMembership name strings used for this option.
     * </p>
     */
    private java.util.List<String> dBSecurityGroupMemberships;

    /**
     * <p>
     * A list of VpcSecurityGroupMembership name strings used for this option.
     * </p>
     */
    private java.util.List<String> vpcSecurityGroupMemberships;

    /**
     * <p>
     * The option settings to include in an option group.
     * </p>
     */
    private java.util.List<OptionSetting> optionSettings;

    /**
     * <p>
     * The configuration of options to include in a group.
     * </p>
     *
     * @return <p>
     *         The configuration of options to include in a group.
     *         </p>
     */
    public String getOptionName() {
        return optionName;
    }

    /**
     * <p>
     * The configuration of options to include in a group.
     * </p>
     *
     * @param optionName <p>
     *            The configuration of options to include in a group.
     *            </p>
     */
    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    /**
     * <p>
     * The configuration of options to include in a group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionName <p>
     *            The configuration of options to include in a group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionConfiguration withOptionName(String optionName) {
        this.optionName = optionName;
        return this;
    }

    /**
     * <p>
     * The optional port for the option.
     * </p>
     *
     * @return <p>
     *         The optional port for the option.
     *         </p>
     */
    public Integer getPort() {
        return port;
    }

    /**
     * <p>
     * The optional port for the option.
     * </p>
     *
     * @param port <p>
     *            The optional port for the option.
     *            </p>
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The optional port for the option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param port <p>
     *            The optional port for the option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionConfiguration withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * <p>
     * The version for the option.
     * </p>
     *
     * @return <p>
     *         The version for the option.
     *         </p>
     */
    public String getOptionVersion() {
        return optionVersion;
    }

    /**
     * <p>
     * The version for the option.
     * </p>
     *
     * @param optionVersion <p>
     *            The version for the option.
     *            </p>
     */
    public void setOptionVersion(String optionVersion) {
        this.optionVersion = optionVersion;
    }

    /**
     * <p>
     * The version for the option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionVersion <p>
     *            The version for the option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionConfiguration withOptionVersion(String optionVersion) {
        this.optionVersion = optionVersion;
        return this;
    }

    /**
     * <p>
     * A list of DBSecurityGroupMembership name strings used for this option.
     * </p>
     *
     * @return <p>
     *         A list of DBSecurityGroupMembership name strings used for this
     *         option.
     *         </p>
     */
    public java.util.List<String> getDBSecurityGroupMemberships() {
        return dBSecurityGroupMemberships;
    }

    /**
     * <p>
     * A list of DBSecurityGroupMembership name strings used for this option.
     * </p>
     *
     * @param dBSecurityGroupMemberships <p>
     *            A list of DBSecurityGroupMembership name strings used for this
     *            option.
     *            </p>
     */
    public void setDBSecurityGroupMemberships(
            java.util.Collection<String> dBSecurityGroupMemberships) {
        if (dBSecurityGroupMemberships == null) {
            this.dBSecurityGroupMemberships = null;
            return;
        }

        this.dBSecurityGroupMemberships = new java.util.ArrayList<String>(
                dBSecurityGroupMemberships);
    }

    /**
     * <p>
     * A list of DBSecurityGroupMembership name strings used for this option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBSecurityGroupMemberships <p>
     *            A list of DBSecurityGroupMembership name strings used for this
     *            option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionConfiguration withDBSecurityGroupMemberships(String... dBSecurityGroupMemberships) {
        if (getDBSecurityGroupMemberships() == null) {
            this.dBSecurityGroupMemberships = new java.util.ArrayList<String>(
                    dBSecurityGroupMemberships.length);
        }
        for (String value : dBSecurityGroupMemberships) {
            this.dBSecurityGroupMemberships.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of DBSecurityGroupMembership name strings used for this option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBSecurityGroupMemberships <p>
     *            A list of DBSecurityGroupMembership name strings used for this
     *            option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionConfiguration withDBSecurityGroupMemberships(
            java.util.Collection<String> dBSecurityGroupMemberships) {
        setDBSecurityGroupMemberships(dBSecurityGroupMemberships);
        return this;
    }

    /**
     * <p>
     * A list of VpcSecurityGroupMembership name strings used for this option.
     * </p>
     *
     * @return <p>
     *         A list of VpcSecurityGroupMembership name strings used for this
     *         option.
     *         </p>
     */
    public java.util.List<String> getVpcSecurityGroupMemberships() {
        return vpcSecurityGroupMemberships;
    }

    /**
     * <p>
     * A list of VpcSecurityGroupMembership name strings used for this option.
     * </p>
     *
     * @param vpcSecurityGroupMemberships <p>
     *            A list of VpcSecurityGroupMembership name strings used for
     *            this option.
     *            </p>
     */
    public void setVpcSecurityGroupMemberships(
            java.util.Collection<String> vpcSecurityGroupMemberships) {
        if (vpcSecurityGroupMemberships == null) {
            this.vpcSecurityGroupMemberships = null;
            return;
        }

        this.vpcSecurityGroupMemberships = new java.util.ArrayList<String>(
                vpcSecurityGroupMemberships);
    }

    /**
     * <p>
     * A list of VpcSecurityGroupMembership name strings used for this option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcSecurityGroupMemberships <p>
     *            A list of VpcSecurityGroupMembership name strings used for
     *            this option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionConfiguration withVpcSecurityGroupMemberships(
            String... vpcSecurityGroupMemberships) {
        if (getVpcSecurityGroupMemberships() == null) {
            this.vpcSecurityGroupMemberships = new java.util.ArrayList<String>(
                    vpcSecurityGroupMemberships.length);
        }
        for (String value : vpcSecurityGroupMemberships) {
            this.vpcSecurityGroupMemberships.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of VpcSecurityGroupMembership name strings used for this option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcSecurityGroupMemberships <p>
     *            A list of VpcSecurityGroupMembership name strings used for
     *            this option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionConfiguration withVpcSecurityGroupMemberships(
            java.util.Collection<String> vpcSecurityGroupMemberships) {
        setVpcSecurityGroupMemberships(vpcSecurityGroupMemberships);
        return this;
    }

    /**
     * <p>
     * The option settings to include in an option group.
     * </p>
     *
     * @return <p>
     *         The option settings to include in an option group.
     *         </p>
     */
    public java.util.List<OptionSetting> getOptionSettings() {
        return optionSettings;
    }

    /**
     * <p>
     * The option settings to include in an option group.
     * </p>
     *
     * @param optionSettings <p>
     *            The option settings to include in an option group.
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
     * The option settings to include in an option group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionSettings <p>
     *            The option settings to include in an option group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionConfiguration withOptionSettings(OptionSetting... optionSettings) {
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
     * The option settings to include in an option group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionSettings <p>
     *            The option settings to include in an option group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionConfiguration withOptionSettings(java.util.Collection<OptionSetting> optionSettings) {
        setOptionSettings(optionSettings);
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
        if (getPort() != null)
            sb.append("Port: " + getPort() + ",");
        if (getOptionVersion() != null)
            sb.append("OptionVersion: " + getOptionVersion() + ",");
        if (getDBSecurityGroupMemberships() != null)
            sb.append("DBSecurityGroupMemberships: " + getDBSecurityGroupMemberships() + ",");
        if (getVpcSecurityGroupMemberships() != null)
            sb.append("VpcSecurityGroupMemberships: " + getVpcSecurityGroupMemberships() + ",");
        if (getOptionSettings() != null)
            sb.append("OptionSettings: " + getOptionSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOptionName() == null) ? 0 : getOptionName().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode
                + ((getOptionVersion() == null) ? 0 : getOptionVersion().hashCode());
        hashCode = prime
                * hashCode
                + ((getDBSecurityGroupMemberships() == null) ? 0 : getDBSecurityGroupMemberships()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getVpcSecurityGroupMemberships() == null) ? 0
                        : getVpcSecurityGroupMemberships().hashCode());
        hashCode = prime * hashCode
                + ((getOptionSettings() == null) ? 0 : getOptionSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OptionConfiguration == false)
            return false;
        OptionConfiguration other = (OptionConfiguration) obj;

        if (other.getOptionName() == null ^ this.getOptionName() == null)
            return false;
        if (other.getOptionName() != null
                && other.getOptionName().equals(this.getOptionName()) == false)
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
        if (other.getOptionSettings() == null ^ this.getOptionSettings() == null)
            return false;
        if (other.getOptionSettings() != null
                && other.getOptionSettings().equals(this.getOptionSettings()) == false)
            return false;
        return true;
    }
}
