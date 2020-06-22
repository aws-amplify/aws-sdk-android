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
 * The version for an option. Option group option versions are returned by the
 * <code>DescribeOptionGroupOptions</code> action.
 * </p>
 */
public class OptionVersion implements Serializable {
    /**
     * <p>
     * The version of the option.
     * </p>
     */
    private String version;

    /**
     * <p>
     * True if the version is the default version of the option, and otherwise
     * false.
     * </p>
     */
    private Boolean isDefault;

    /**
     * <p>
     * The version of the option.
     * </p>
     *
     * @return <p>
     *         The version of the option.
     *         </p>
     */
    public String getVersion() {
        return version;
    }

    /**
     * <p>
     * The version of the option.
     * </p>
     *
     * @param version <p>
     *            The version of the option.
     *            </p>
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param version <p>
     *            The version of the option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionVersion withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * <p>
     * True if the version is the default version of the option, and otherwise
     * false.
     * </p>
     *
     * @return <p>
     *         True if the version is the default version of the option, and
     *         otherwise false.
     *         </p>
     */
    public Boolean isIsDefault() {
        return isDefault;
    }

    /**
     * <p>
     * True if the version is the default version of the option, and otherwise
     * false.
     * </p>
     *
     * @return <p>
     *         True if the version is the default version of the option, and
     *         otherwise false.
     *         </p>
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * <p>
     * True if the version is the default version of the option, and otherwise
     * false.
     * </p>
     *
     * @param isDefault <p>
     *            True if the version is the default version of the option, and
     *            otherwise false.
     *            </p>
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * <p>
     * True if the version is the default version of the option, and otherwise
     * false.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isDefault <p>
     *            True if the version is the default version of the option, and
     *            otherwise false.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionVersion withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
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
        if (getVersion() != null)
            sb.append("Version: " + getVersion() + ",");
        if (getIsDefault() != null)
            sb.append("IsDefault: " + getIsDefault());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getIsDefault() == null) ? 0 : getIsDefault().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OptionVersion == false)
            return false;
        OptionVersion other = (OptionVersion) obj;

        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getIsDefault() == null ^ this.getIsDefault() == null)
            return false;
        if (other.getIsDefault() != null
                && other.getIsDefault().equals(this.getIsDefault()) == false)
            return false;
        return true;
    }
}
