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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;


/**
 * <p>The service setting data structure.</p> <p> <code>ServiceSetting</code> is an account-level setting for an AWS service. This setting defines how a user interacts with or uses a service or a feature of a service. For example, if an AWS service charges money to the account based on feature or service usage, then the AWS service team might create a default setting of "false". This means the user can't use this feature unless they change the setting to "true" and intentionally opt in for a paid feature.</p> <p>Services map a <code>SettingId</code> object to a setting value. AWS services teams define the default value for a <code>SettingId</code>. You can't create a new <code>SettingId</code>, but you can overwrite the default value if you have the <code>ssm:UpdateServiceSetting</code> permission for the setting. Use the <a>UpdateServiceSetting</a> API action to change the default setting. Or, use the <a>ResetServiceSetting</a> to change the value back to the original value defined by the AWS service team.</p>
 */
public class ServiceSetting implements Serializable {
    /**
     * <p>The ID of the service setting.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     */
    private String settingId;

    /**
     * <p>The value of the service setting.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     */
    private String settingValue;

    /**
     * <p>The last time the service setting was modified.</p>
     */
    private java.util.Date lastModifiedDate;

    /**
     * <p>The ARN of the last modified user. This field is populated only if the setting value was overwritten.</p>
     */
    private String lastModifiedUser;

    /**
     * <p>The ARN of the service setting.</p>
     */
    private String aRN;

    /**
     * <p>The status of the service setting. The value can be Default, Customized or PendingUpdate.</p> <ul> <li> <p>Default: The current setting uses a default value provisioned by the AWS service team.</p> </li> <li> <p>Customized: The current setting use a custom value specified by the customer.</p> </li> <li> <p>PendingUpdate: The current setting uses a default or custom value, but a setting change request is pending approval.</p> </li> </ul>
     */
    private String status;

    /**
     * <p>The ID of the service setting.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @return <p>The ID of the service setting.</p>
     */
    public String getSettingId() {
        return settingId;
    }

    /**
     * <p>The ID of the service setting.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param settingId <p>The ID of the service setting.</p>
     */
    public void setSettingId(String settingId) {
        this.settingId = settingId;
    }

    /**
     * <p>The ID of the service setting.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param settingId <p>The ID of the service setting.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ServiceSetting withSettingId(String settingId) {
        this.settingId = settingId;
        return this;
    }

    /**
     * <p>The value of the service setting.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @return <p>The value of the service setting.</p>
     */
    public String getSettingValue() {
        return settingValue;
    }

    /**
     * <p>The value of the service setting.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param settingValue <p>The value of the service setting.</p>
     */
    public void setSettingValue(String settingValue) {
        this.settingValue = settingValue;
    }

    /**
     * <p>The value of the service setting.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param settingValue <p>The value of the service setting.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ServiceSetting withSettingValue(String settingValue) {
        this.settingValue = settingValue;
        return this;
    }

    /**
     * <p>The last time the service setting was modified.</p>
     *
     * @return <p>The last time the service setting was modified.</p>
     */
    public java.util.Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * <p>The last time the service setting was modified.</p>
     *
     * @param lastModifiedDate <p>The last time the service setting was modified.</p>
     */
    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>The last time the service setting was modified.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastModifiedDate <p>The last time the service setting was modified.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ServiceSetting withLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * <p>The ARN of the last modified user. This field is populated only if the setting value was overwritten.</p>
     *
     * @return <p>The ARN of the last modified user. This field is populated only if the setting value was overwritten.</p>
     */
    public String getLastModifiedUser() {
        return lastModifiedUser;
    }

    /**
     * <p>The ARN of the last modified user. This field is populated only if the setting value was overwritten.</p>
     *
     * @param lastModifiedUser <p>The ARN of the last modified user. This field is populated only if the setting value was overwritten.</p>
     */
    public void setLastModifiedUser(String lastModifiedUser) {
        this.lastModifiedUser = lastModifiedUser;
    }

    /**
     * <p>The ARN of the last modified user. This field is populated only if the setting value was overwritten.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastModifiedUser <p>The ARN of the last modified user. This field is populated only if the setting value was overwritten.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ServiceSetting withLastModifiedUser(String lastModifiedUser) {
        this.lastModifiedUser = lastModifiedUser;
        return this;
    }

    /**
     * <p>The ARN of the service setting.</p>
     *
     * @return <p>The ARN of the service setting.</p>
     */
    public String getARN() {
        return aRN;
    }

    /**
     * <p>The ARN of the service setting.</p>
     *
     * @param aRN <p>The ARN of the service setting.</p>
     */
    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>The ARN of the service setting.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param aRN <p>The ARN of the service setting.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ServiceSetting withARN(String aRN) {
        this.aRN = aRN;
        return this;
    }

    /**
     * <p>The status of the service setting. The value can be Default, Customized or PendingUpdate.</p> <ul> <li> <p>Default: The current setting uses a default value provisioned by the AWS service team.</p> </li> <li> <p>Customized: The current setting use a custom value specified by the customer.</p> </li> <li> <p>PendingUpdate: The current setting uses a default or custom value, but a setting change request is pending approval.</p> </li> </ul>
     *
     * @return <p>The status of the service setting. The value can be Default, Customized or PendingUpdate.</p> <ul> <li> <p>Default: The current setting uses a default value provisioned by the AWS service team.</p> </li> <li> <p>Customized: The current setting use a custom value specified by the customer.</p> </li> <li> <p>PendingUpdate: The current setting uses a default or custom value, but a setting change request is pending approval.</p> </li> </ul>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>The status of the service setting. The value can be Default, Customized or PendingUpdate.</p> <ul> <li> <p>Default: The current setting uses a default value provisioned by the AWS service team.</p> </li> <li> <p>Customized: The current setting use a custom value specified by the customer.</p> </li> <li> <p>PendingUpdate: The current setting uses a default or custom value, but a setting change request is pending approval.</p> </li> </ul>
     *
     * @param status <p>The status of the service setting. The value can be Default, Customized or PendingUpdate.</p> <ul> <li> <p>Default: The current setting uses a default value provisioned by the AWS service team.</p> </li> <li> <p>Customized: The current setting use a custom value specified by the customer.</p> </li> <li> <p>PendingUpdate: The current setting uses a default or custom value, but a setting change request is pending approval.</p> </li> </ul>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>The status of the service setting. The value can be Default, Customized or PendingUpdate.</p> <ul> <li> <p>Default: The current setting uses a default value provisioned by the AWS service team.</p> </li> <li> <p>Customized: The current setting use a custom value specified by the customer.</p> </li> <li> <p>PendingUpdate: The current setting uses a default or custom value, but a setting change request is pending approval.</p> </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status <p>The status of the service setting. The value can be Default, Customized or PendingUpdate.</p> <ul> <li> <p>Default: The current setting uses a default value provisioned by the AWS service team.</p> </li> <li> <p>Customized: The current setting use a custom value specified by the customer.</p> </li> <li> <p>PendingUpdate: The current setting uses a default or custom value, but a setting change request is pending approval.</p> </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ServiceSetting withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSettingId() != null) sb.append("SettingId: " + getSettingId() + ",");
        if (getSettingValue() != null) sb.append("SettingValue: " + getSettingValue() + ",");
        if (getLastModifiedDate() != null) sb.append("LastModifiedDate: " + getLastModifiedDate() + ",");
        if (getLastModifiedUser() != null) sb.append("LastModifiedUser: " + getLastModifiedUser() + ",");
        if (getARN() != null) sb.append("ARN: " + getARN() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSettingId() == null) ? 0 : getSettingId().hashCode());
        hashCode = prime * hashCode + ((getSettingValue() == null) ? 0 : getSettingValue().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedUser() == null) ? 0 : getLastModifiedUser().hashCode());
        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ServiceSetting == false) return false;
        ServiceSetting other = (ServiceSetting)obj;

        if (other.getSettingId() == null ^ this.getSettingId() == null) return false;
        if (other.getSettingId() != null && other.getSettingId().equals(this.getSettingId()) == false) return false;
        if (other.getSettingValue() == null ^ this.getSettingValue() == null) return false;
        if (other.getSettingValue() != null && other.getSettingValue().equals(this.getSettingValue()) == false) return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null) return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false) return false;
        if (other.getLastModifiedUser() == null ^ this.getLastModifiedUser() == null) return false;
        if (other.getLastModifiedUser() != null && other.getLastModifiedUser().equals(this.getLastModifiedUser()) == false) return false;
        if (other.getARN() == null ^ this.getARN() == null) return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false) return false;
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false;
        return true;
    }
}
