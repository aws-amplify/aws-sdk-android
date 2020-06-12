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

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

public class DeleteAccountSettingResult implements Serializable {
    /**
     * <p>
     * The account setting for the specified principal ARN.
     * </p>
     */
    private Setting setting;

    /**
     * <p>
     * The account setting for the specified principal ARN.
     * </p>
     *
     * @return <p>
     *         The account setting for the specified principal ARN.
     *         </p>
     */
    public Setting getSetting() {
        return setting;
    }

    /**
     * <p>
     * The account setting for the specified principal ARN.
     * </p>
     *
     * @param setting <p>
     *            The account setting for the specified principal ARN.
     *            </p>
     */
    public void setSetting(Setting setting) {
        this.setting = setting;
    }

    /**
     * <p>
     * The account setting for the specified principal ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param setting <p>
     *            The account setting for the specified principal ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteAccountSettingResult withSetting(Setting setting) {
        this.setting = setting;
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
        if (getSetting() != null)
            sb.append("setting: " + getSetting());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSetting() == null) ? 0 : getSetting().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAccountSettingResult == false)
            return false;
        DeleteAccountSettingResult other = (DeleteAccountSettingResult) obj;

        if (other.getSetting() == null ^ this.getSetting() == null)
            return false;
        if (other.getSetting() != null && other.getSetting().equals(this.getSetting()) == false)
            return false;
        return true;
    }
}
