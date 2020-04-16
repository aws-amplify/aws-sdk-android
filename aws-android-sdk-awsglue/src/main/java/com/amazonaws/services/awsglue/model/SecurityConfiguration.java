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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies a security configuration.
 * </p>
 */
public class SecurityConfiguration implements Serializable {
    /**
     * <p>
     * The name of the security configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String name;

    /**
     * <p>
     * The time at which this security configuration was created.
     * </p>
     */
    private java.util.Date createdTimeStamp;

    /**
     * <p>
     * The encryption configuration associated with this security configuration.
     * </p>
     */
    private EncryptionConfiguration encryptionConfiguration;

    /**
     * <p>
     * The name of the security configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the security configuration.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the security configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param name <p>
     *            The name of the security configuration.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the security configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param name <p>
     *            The name of the security configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SecurityConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The time at which this security configuration was created.
     * </p>
     *
     * @return <p>
     *         The time at which this security configuration was created.
     *         </p>
     */
    public java.util.Date getCreatedTimeStamp() {
        return createdTimeStamp;
    }

    /**
     * <p>
     * The time at which this security configuration was created.
     * </p>
     *
     * @param createdTimeStamp <p>
     *            The time at which this security configuration was created.
     *            </p>
     */
    public void setCreatedTimeStamp(java.util.Date createdTimeStamp) {
        this.createdTimeStamp = createdTimeStamp;
    }

    /**
     * <p>
     * The time at which this security configuration was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTimeStamp <p>
     *            The time at which this security configuration was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SecurityConfiguration withCreatedTimeStamp(java.util.Date createdTimeStamp) {
        this.createdTimeStamp = createdTimeStamp;
        return this;
    }

    /**
     * <p>
     * The encryption configuration associated with this security configuration.
     * </p>
     *
     * @return <p>
     *         The encryption configuration associated with this security
     *         configuration.
     *         </p>
     */
    public EncryptionConfiguration getEncryptionConfiguration() {
        return encryptionConfiguration;
    }

    /**
     * <p>
     * The encryption configuration associated with this security configuration.
     * </p>
     *
     * @param encryptionConfiguration <p>
     *            The encryption configuration associated with this security
     *            configuration.
     *            </p>
     */
    public void setEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
    }

    /**
     * <p>
     * The encryption configuration associated with this security configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encryptionConfiguration <p>
     *            The encryption configuration associated with this security
     *            configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SecurityConfiguration withEncryptionConfiguration(
            EncryptionConfiguration encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
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
        if (getCreatedTimeStamp() != null)
            sb.append("CreatedTimeStamp: " + getCreatedTimeStamp() + ",");
        if (getEncryptionConfiguration() != null)
            sb.append("EncryptionConfiguration: " + getEncryptionConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTimeStamp() == null) ? 0 : getCreatedTimeStamp().hashCode());
        hashCode = prime
                * hashCode
                + ((getEncryptionConfiguration() == null) ? 0 : getEncryptionConfiguration()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SecurityConfiguration == false)
            return false;
        SecurityConfiguration other = (SecurityConfiguration) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCreatedTimeStamp() == null ^ this.getCreatedTimeStamp() == null)
            return false;
        if (other.getCreatedTimeStamp() != null
                && other.getCreatedTimeStamp().equals(this.getCreatedTimeStamp()) == false)
            return false;
        if (other.getEncryptionConfiguration() == null ^ this.getEncryptionConfiguration() == null)
            return false;
        if (other.getEncryptionConfiguration() != null
                && other.getEncryptionConfiguration().equals(this.getEncryptionConfiguration()) == false)
            return false;
        return true;
    }
}
