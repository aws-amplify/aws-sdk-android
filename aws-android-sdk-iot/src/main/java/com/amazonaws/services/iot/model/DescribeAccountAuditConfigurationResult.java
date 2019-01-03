/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

public class DescribeAccountAuditConfigurationResult implements Serializable {
    /**
     * <p>
     * The ARN of the role that grants permission to AWS IoT to access
     * information about your devices, policies, certificates and other items as
     * necessary when performing an audit.
     * </p>
     * <p>
     * On the first call to <code>UpdateAccountAuditConfiguration</code> this
     * parameter is required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String roleArn;

    /**
     * <p>
     * Information about the targets to which audit notifications are sent for
     * this account.
     * </p>
     */
    private java.util.Map<String, AuditNotificationTarget> auditNotificationTargetConfigurations;

    /**
     * <p>
     * Which audit checks are enabled and disabled for this account.
     * </p>
     */
    private java.util.Map<String, AuditCheckConfiguration> auditCheckConfigurations;

    /**
     * <p>
     * The ARN of the role that grants permission to AWS IoT to access
     * information about your devices, policies, certificates and other items as
     * necessary when performing an audit.
     * </p>
     * <p>
     * On the first call to <code>UpdateAccountAuditConfiguration</code> this
     * parameter is required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The ARN of the role that grants permission to AWS IoT to access
     *         information about your devices, policies, certificates and other
     *         items as necessary when performing an audit.
     *         </p>
     *         <p>
     *         On the first call to <code>UpdateAccountAuditConfiguration</code>
     *         this parameter is required.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The ARN of the role that grants permission to AWS IoT to access
     * information about your devices, policies, certificates and other items as
     * necessary when performing an audit.
     * </p>
     * <p>
     * On the first call to <code>UpdateAccountAuditConfiguration</code> this
     * parameter is required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param roleArn <p>
     *            The ARN of the role that grants permission to AWS IoT to
     *            access information about your devices, policies, certificates
     *            and other items as necessary when performing an audit.
     *            </p>
     *            <p>
     *            On the first call to
     *            <code>UpdateAccountAuditConfiguration</code> this parameter is
     *            required.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the role that grants permission to AWS IoT to access
     * information about your devices, policies, certificates and other items as
     * necessary when performing an audit.
     * </p>
     * <p>
     * On the first call to <code>UpdateAccountAuditConfiguration</code> this
     * parameter is required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param roleArn <p>
     *            The ARN of the role that grants permission to AWS IoT to
     *            access information about your devices, policies, certificates
     *            and other items as necessary when performing an audit.
     *            </p>
     *            <p>
     *            On the first call to
     *            <code>UpdateAccountAuditConfiguration</code> this parameter is
     *            required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAccountAuditConfigurationResult withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * Information about the targets to which audit notifications are sent for
     * this account.
     * </p>
     *
     * @return <p>
     *         Information about the targets to which audit notifications are
     *         sent for this account.
     *         </p>
     */
    public java.util.Map<String, AuditNotificationTarget> getAuditNotificationTargetConfigurations() {
        return auditNotificationTargetConfigurations;
    }

    /**
     * <p>
     * Information about the targets to which audit notifications are sent for
     * this account.
     * </p>
     *
     * @param auditNotificationTargetConfigurations <p>
     *            Information about the targets to which audit notifications are
     *            sent for this account.
     *            </p>
     */
    public void setAuditNotificationTargetConfigurations(
            java.util.Map<String, AuditNotificationTarget> auditNotificationTargetConfigurations) {
        this.auditNotificationTargetConfigurations = auditNotificationTargetConfigurations;
    }

    /**
     * <p>
     * Information about the targets to which audit notifications are sent for
     * this account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param auditNotificationTargetConfigurations <p>
     *            Information about the targets to which audit notifications are
     *            sent for this account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAccountAuditConfigurationResult withAuditNotificationTargetConfigurations(
            java.util.Map<String, AuditNotificationTarget> auditNotificationTargetConfigurations) {
        this.auditNotificationTargetConfigurations = auditNotificationTargetConfigurations;
        return this;
    }

    /**
     * <p>
     * Information about the targets to which audit notifications are sent for
     * this account.
     * </p>
     * <p>
     * The method adds a new key-value pair into
     * auditNotificationTargetConfigurations parameter, and returns a reference
     * to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into
     *            auditNotificationTargetConfigurations.
     * @param value The corresponding value of the entry to be added into
     *            auditNotificationTargetConfigurations.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAccountAuditConfigurationResult addauditNotificationTargetConfigurationsEntry(
            String key, AuditNotificationTarget value) {
        if (null == this.auditNotificationTargetConfigurations) {
            this.auditNotificationTargetConfigurations = new java.util.HashMap<String, AuditNotificationTarget>();
        }
        if (this.auditNotificationTargetConfigurations.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.auditNotificationTargetConfigurations.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into auditNotificationTargetConfigurations.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public DescribeAccountAuditConfigurationResult clearauditNotificationTargetConfigurationsEntries() {
        this.auditNotificationTargetConfigurations = null;
        return this;
    }

    /**
     * <p>
     * Which audit checks are enabled and disabled for this account.
     * </p>
     *
     * @return <p>
     *         Which audit checks are enabled and disabled for this account.
     *         </p>
     */
    public java.util.Map<String, AuditCheckConfiguration> getAuditCheckConfigurations() {
        return auditCheckConfigurations;
    }

    /**
     * <p>
     * Which audit checks are enabled and disabled for this account.
     * </p>
     *
     * @param auditCheckConfigurations <p>
     *            Which audit checks are enabled and disabled for this account.
     *            </p>
     */
    public void setAuditCheckConfigurations(
            java.util.Map<String, AuditCheckConfiguration> auditCheckConfigurations) {
        this.auditCheckConfigurations = auditCheckConfigurations;
    }

    /**
     * <p>
     * Which audit checks are enabled and disabled for this account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param auditCheckConfigurations <p>
     *            Which audit checks are enabled and disabled for this account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAccountAuditConfigurationResult withAuditCheckConfigurations(
            java.util.Map<String, AuditCheckConfiguration> auditCheckConfigurations) {
        this.auditCheckConfigurations = auditCheckConfigurations;
        return this;
    }

    /**
     * <p>
     * Which audit checks are enabled and disabled for this account.
     * </p>
     * <p>
     * The method adds a new key-value pair into auditCheckConfigurations
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into
     *            auditCheckConfigurations.
     * @param value The corresponding value of the entry to be added into
     *            auditCheckConfigurations.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAccountAuditConfigurationResult addauditCheckConfigurationsEntry(String key,
            AuditCheckConfiguration value) {
        if (null == this.auditCheckConfigurations) {
            this.auditCheckConfigurations = new java.util.HashMap<String, AuditCheckConfiguration>();
        }
        if (this.auditCheckConfigurations.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.auditCheckConfigurations.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into auditCheckConfigurations.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public DescribeAccountAuditConfigurationResult clearauditCheckConfigurationsEntries() {
        this.auditCheckConfigurations = null;
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
        if (getRoleArn() != null)
            sb.append("roleArn: " + getRoleArn() + ",");
        if (getAuditNotificationTargetConfigurations() != null)
            sb.append("auditNotificationTargetConfigurations: "
                    + getAuditNotificationTargetConfigurations() + ",");
        if (getAuditCheckConfigurations() != null)
            sb.append("auditCheckConfigurations: " + getAuditCheckConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getAuditNotificationTargetConfigurations() == null) ? 0
                        : getAuditNotificationTargetConfigurations().hashCode());
        hashCode = prime
                * hashCode
                + ((getAuditCheckConfigurations() == null) ? 0 : getAuditCheckConfigurations()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAccountAuditConfigurationResult == false)
            return false;
        DescribeAccountAuditConfigurationResult other = (DescribeAccountAuditConfigurationResult) obj;

        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getAuditNotificationTargetConfigurations() == null
                ^ this.getAuditNotificationTargetConfigurations() == null)
            return false;
        if (other.getAuditNotificationTargetConfigurations() != null
                && other.getAuditNotificationTargetConfigurations().equals(
                        this.getAuditNotificationTargetConfigurations()) == false)
            return false;
        if (other.getAuditCheckConfigurations() == null
                ^ this.getAuditCheckConfigurations() == null)
            return false;
        if (other.getAuditCheckConfigurations() != null
                && other.getAuditCheckConfigurations().equals(this.getAuditCheckConfigurations()) == false)
            return false;
        return true;
    }
}
