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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about a specific standard.
 * </p>
 */
public class Standard implements Serializable {
    /**
     * <p>
     * The ARN of a standard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String standardsArn;

    /**
     * <p>
     * The name of the standard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String name;

    /**
     * <p>
     * A description of the standard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String description;

    /**
     * <p>
     * Whether the standard is enabled by default. When Security Hub is enabled
     * from the console, if a standard is enabled by default, the check box for
     * that standard is selected by default.
     * </p>
     * <p>
     * When Security Hub is enabled using the <code>EnableSecurityHub</code> API
     * operation, the standard is enabled by default unless
     * <code>EnableDefaultStandards</code> is set to <code>false</code>.
     * </p>
     */
    private Boolean enabledByDefault;

    /**
     * <p>
     * The ARN of a standard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The ARN of a standard.
     *         </p>
     */
    public String getStandardsArn() {
        return standardsArn;
    }

    /**
     * <p>
     * The ARN of a standard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param standardsArn <p>
     *            The ARN of a standard.
     *            </p>
     */
    public void setStandardsArn(String standardsArn) {
        this.standardsArn = standardsArn;
    }

    /**
     * <p>
     * The ARN of a standard.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param standardsArn <p>
     *            The ARN of a standard.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Standard withStandardsArn(String standardsArn) {
        this.standardsArn = standardsArn;
        return this;
    }

    /**
     * <p>
     * The name of the standard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The name of the standard.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the standard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            The name of the standard.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the standard.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            The name of the standard.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Standard withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A description of the standard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         A description of the standard.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the standard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param description <p>
     *            A description of the standard.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the standard.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param description <p>
     *            A description of the standard.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Standard withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Whether the standard is enabled by default. When Security Hub is enabled
     * from the console, if a standard is enabled by default, the check box for
     * that standard is selected by default.
     * </p>
     * <p>
     * When Security Hub is enabled using the <code>EnableSecurityHub</code> API
     * operation, the standard is enabled by default unless
     * <code>EnableDefaultStandards</code> is set to <code>false</code>.
     * </p>
     *
     * @return <p>
     *         Whether the standard is enabled by default. When Security Hub is
     *         enabled from the console, if a standard is enabled by default,
     *         the check box for that standard is selected by default.
     *         </p>
     *         <p>
     *         When Security Hub is enabled using the
     *         <code>EnableSecurityHub</code> API operation, the standard is
     *         enabled by default unless <code>EnableDefaultStandards</code> is
     *         set to <code>false</code>.
     *         </p>
     */
    public Boolean isEnabledByDefault() {
        return enabledByDefault;
    }

    /**
     * <p>
     * Whether the standard is enabled by default. When Security Hub is enabled
     * from the console, if a standard is enabled by default, the check box for
     * that standard is selected by default.
     * </p>
     * <p>
     * When Security Hub is enabled using the <code>EnableSecurityHub</code> API
     * operation, the standard is enabled by default unless
     * <code>EnableDefaultStandards</code> is set to <code>false</code>.
     * </p>
     *
     * @return <p>
     *         Whether the standard is enabled by default. When Security Hub is
     *         enabled from the console, if a standard is enabled by default,
     *         the check box for that standard is selected by default.
     *         </p>
     *         <p>
     *         When Security Hub is enabled using the
     *         <code>EnableSecurityHub</code> API operation, the standard is
     *         enabled by default unless <code>EnableDefaultStandards</code> is
     *         set to <code>false</code>.
     *         </p>
     */
    public Boolean getEnabledByDefault() {
        return enabledByDefault;
    }

    /**
     * <p>
     * Whether the standard is enabled by default. When Security Hub is enabled
     * from the console, if a standard is enabled by default, the check box for
     * that standard is selected by default.
     * </p>
     * <p>
     * When Security Hub is enabled using the <code>EnableSecurityHub</code> API
     * operation, the standard is enabled by default unless
     * <code>EnableDefaultStandards</code> is set to <code>false</code>.
     * </p>
     *
     * @param enabledByDefault <p>
     *            Whether the standard is enabled by default. When Security Hub
     *            is enabled from the console, if a standard is enabled by
     *            default, the check box for that standard is selected by
     *            default.
     *            </p>
     *            <p>
     *            When Security Hub is enabled using the
     *            <code>EnableSecurityHub</code> API operation, the standard is
     *            enabled by default unless <code>EnableDefaultStandards</code>
     *            is set to <code>false</code>.
     *            </p>
     */
    public void setEnabledByDefault(Boolean enabledByDefault) {
        this.enabledByDefault = enabledByDefault;
    }

    /**
     * <p>
     * Whether the standard is enabled by default. When Security Hub is enabled
     * from the console, if a standard is enabled by default, the check box for
     * that standard is selected by default.
     * </p>
     * <p>
     * When Security Hub is enabled using the <code>EnableSecurityHub</code> API
     * operation, the standard is enabled by default unless
     * <code>EnableDefaultStandards</code> is set to <code>false</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabledByDefault <p>
     *            Whether the standard is enabled by default. When Security Hub
     *            is enabled from the console, if a standard is enabled by
     *            default, the check box for that standard is selected by
     *            default.
     *            </p>
     *            <p>
     *            When Security Hub is enabled using the
     *            <code>EnableSecurityHub</code> API operation, the standard is
     *            enabled by default unless <code>EnableDefaultStandards</code>
     *            is set to <code>false</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Standard withEnabledByDefault(Boolean enabledByDefault) {
        this.enabledByDefault = enabledByDefault;
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
        if (getStandardsArn() != null)
            sb.append("StandardsArn: " + getStandardsArn() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getEnabledByDefault() != null)
            sb.append("EnabledByDefault: " + getEnabledByDefault());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStandardsArn() == null) ? 0 : getStandardsArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getEnabledByDefault() == null) ? 0 : getEnabledByDefault().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Standard == false)
            return false;
        Standard other = (Standard) obj;

        if (other.getStandardsArn() == null ^ this.getStandardsArn() == null)
            return false;
        if (other.getStandardsArn() != null
                && other.getStandardsArn().equals(this.getStandardsArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEnabledByDefault() == null ^ this.getEnabledByDefault() == null)
            return false;
        if (other.getEnabledByDefault() != null
                && other.getEnabledByDefault().equals(this.getEnabledByDefault()) == false)
            return false;
        return true;
    }
}
