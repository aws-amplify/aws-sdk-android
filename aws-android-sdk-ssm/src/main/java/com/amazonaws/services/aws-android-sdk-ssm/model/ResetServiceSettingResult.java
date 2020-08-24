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
 * <p>The result body of the ResetServiceSetting API action.</p>
 */
public class ResetServiceSettingResult implements Serializable {
    /**
     * <p>The current, effective service setting after calling the ResetServiceSetting API action.</p>
     */
    private ServiceSetting serviceSetting;

    /**
     * <p>The current, effective service setting after calling the ResetServiceSetting API action.</p>
     *
     * @return <p>The current, effective service setting after calling the ResetServiceSetting API action.</p>
     */
    public ServiceSetting getServiceSetting() {
        return serviceSetting;
    }

    /**
     * <p>The current, effective service setting after calling the ResetServiceSetting API action.</p>
     *
     * @param serviceSetting <p>The current, effective service setting after calling the ResetServiceSetting API action.</p>
     */
    public void setServiceSetting(ServiceSetting serviceSetting) {
        this.serviceSetting = serviceSetting;
    }

    /**
     * <p>The current, effective service setting after calling the ResetServiceSetting API action.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param serviceSetting <p>The current, effective service setting after calling the ResetServiceSetting API action.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ResetServiceSettingResult withServiceSetting(ServiceSetting serviceSetting) {
        this.serviceSetting = serviceSetting;
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
        if (getServiceSetting() != null) sb.append("ServiceSetting: " + getServiceSetting());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceSetting() == null) ? 0 : getServiceSetting().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ResetServiceSettingResult == false) return false;
        ResetServiceSettingResult other = (ResetServiceSettingResult)obj;

        if (other.getServiceSetting() == null ^ this.getServiceSetting() == null) return false;
        if (other.getServiceSetting() != null && other.getServiceSetting().equals(this.getServiceSetting()) == false) return false;
        return true;
    }
}
