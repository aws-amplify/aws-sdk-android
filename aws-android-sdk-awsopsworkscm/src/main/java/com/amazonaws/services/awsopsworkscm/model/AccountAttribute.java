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

package com.amazonaws.services.awsopsworkscm.model;

import java.io.Serializable;

/**
 * <p>
 * Stores account attributes.
 * </p>
 */
public class AccountAttribute implements Serializable {
    /**
     * <p>
     * The attribute name. The following are supported attribute names.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>ServerLimit:</i> The number of current servers/maximum number of
     * servers allowed. By default, you can have a maximum of 10 servers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ManualBackupLimit:</i> The number of current manual backups/maximum
     * number of backups allowed. By default, you can have a maximum of 50
     * manual backups saved.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     */
    private String name;

    /**
     * <p>
     * The maximum allowed value.
     * </p>
     */
    private Integer maximum;

    /**
     * <p>
     * The current usage, such as the current number of servers that are
     * associated with the account.
     * </p>
     */
    private Integer used;

    /**
     * <p>
     * The attribute name. The following are supported attribute names.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>ServerLimit:</i> The number of current servers/maximum number of
     * servers allowed. By default, you can have a maximum of 10 servers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ManualBackupLimit:</i> The number of current manual backups/maximum
     * number of backups allowed. By default, you can have a maximum of 50
     * manual backups saved.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @return <p>
     *         The attribute name. The following are supported attribute names.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>ServerLimit:</i> The number of current servers/maximum number
     *         of servers allowed. By default, you can have a maximum of 10
     *         servers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>ManualBackupLimit:</i> The number of current manual
     *         backups/maximum number of backups allowed. By default, you can
     *         have a maximum of 50 manual backups saved.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The attribute name. The following are supported attribute names.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>ServerLimit:</i> The number of current servers/maximum number of
     * servers allowed. By default, you can have a maximum of 10 servers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ManualBackupLimit:</i> The number of current manual backups/maximum
     * number of backups allowed. By default, you can have a maximum of 50
     * manual backups saved.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param name <p>
     *            The attribute name. The following are supported attribute
     *            names.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <i>ServerLimit:</i> The number of current servers/maximum
     *            number of servers allowed. By default, you can have a maximum
     *            of 10 servers.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>ManualBackupLimit:</i> The number of current manual
     *            backups/maximum number of backups allowed. By default, you can
     *            have a maximum of 50 manual backups saved.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The attribute name. The following are supported attribute names.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>ServerLimit:</i> The number of current servers/maximum number of
     * servers allowed. By default, you can have a maximum of 10 servers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ManualBackupLimit:</i> The number of current manual backups/maximum
     * number of backups allowed. By default, you can have a maximum of 50
     * manual backups saved.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param name <p>
     *            The attribute name. The following are supported attribute
     *            names.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <i>ServerLimit:</i> The number of current servers/maximum
     *            number of servers allowed. By default, you can have a maximum
     *            of 10 servers.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>ManualBackupLimit:</i> The number of current manual
     *            backups/maximum number of backups allowed. By default, you can
     *            have a maximum of 50 manual backups saved.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccountAttribute withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The maximum allowed value.
     * </p>
     *
     * @return <p>
     *         The maximum allowed value.
     *         </p>
     */
    public Integer getMaximum() {
        return maximum;
    }

    /**
     * <p>
     * The maximum allowed value.
     * </p>
     *
     * @param maximum <p>
     *            The maximum allowed value.
     *            </p>
     */
    public void setMaximum(Integer maximum) {
        this.maximum = maximum;
    }

    /**
     * <p>
     * The maximum allowed value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maximum <p>
     *            The maximum allowed value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccountAttribute withMaximum(Integer maximum) {
        this.maximum = maximum;
        return this;
    }

    /**
     * <p>
     * The current usage, such as the current number of servers that are
     * associated with the account.
     * </p>
     *
     * @return <p>
     *         The current usage, such as the current number of servers that are
     *         associated with the account.
     *         </p>
     */
    public Integer getUsed() {
        return used;
    }

    /**
     * <p>
     * The current usage, such as the current number of servers that are
     * associated with the account.
     * </p>
     *
     * @param used <p>
     *            The current usage, such as the current number of servers that
     *            are associated with the account.
     *            </p>
     */
    public void setUsed(Integer used) {
        this.used = used;
    }

    /**
     * <p>
     * The current usage, such as the current number of servers that are
     * associated with the account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param used <p>
     *            The current usage, such as the current number of servers that
     *            are associated with the account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccountAttribute withUsed(Integer used) {
        this.used = used;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getMaximum() != null)
            sb.append("Maximum: " + getMaximum() + ",");
        if (getUsed() != null)
            sb.append("Used: " + getUsed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMaximum() == null) ? 0 : getMaximum().hashCode());
        hashCode = prime * hashCode + ((getUsed() == null) ? 0 : getUsed().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountAttribute == false)
            return false;
        AccountAttribute other = (AccountAttribute) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMaximum() == null ^ this.getMaximum() == null)
            return false;
        if (other.getMaximum() != null && other.getMaximum().equals(this.getMaximum()) == false)
            return false;
        if (other.getUsed() == null ^ this.getUsed() == null)
            return false;
        if (other.getUsed() != null && other.getUsed().equals(this.getUsed()) == false)
            return false;
        return true;
    }
}
