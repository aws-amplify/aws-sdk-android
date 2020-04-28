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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

public class PutParameterResult implements Serializable {
    /**
     * <p>
     * The new version number of a parameter. If you edit a parameter value,
     * Parameter Store automatically creates a new version and assigns this new
     * version a unique ID. You can reference a parameter version ID in API
     * actions or in Systems Manager documents (SSM documents). By default, if
     * you don't specify a specific version, the system returns the latest
     * parameter value when a parameter is called.
     * </p>
     */
    private Long version;

    /**
     * <p>
     * The tier assigned to the parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, Advanced, Intelligent-Tiering
     */
    private String tier;

    /**
     * <p>
     * The new version number of a parameter. If you edit a parameter value,
     * Parameter Store automatically creates a new version and assigns this new
     * version a unique ID. You can reference a parameter version ID in API
     * actions or in Systems Manager documents (SSM documents). By default, if
     * you don't specify a specific version, the system returns the latest
     * parameter value when a parameter is called.
     * </p>
     *
     * @return <p>
     *         The new version number of a parameter. If you edit a parameter
     *         value, Parameter Store automatically creates a new version and
     *         assigns this new version a unique ID. You can reference a
     *         parameter version ID in API actions or in Systems Manager
     *         documents (SSM documents). By default, if you don't specify a
     *         specific version, the system returns the latest parameter value
     *         when a parameter is called.
     *         </p>
     */
    public Long getVersion() {
        return version;
    }

    /**
     * <p>
     * The new version number of a parameter. If you edit a parameter value,
     * Parameter Store automatically creates a new version and assigns this new
     * version a unique ID. You can reference a parameter version ID in API
     * actions or in Systems Manager documents (SSM documents). By default, if
     * you don't specify a specific version, the system returns the latest
     * parameter value when a parameter is called.
     * </p>
     *
     * @param version <p>
     *            The new version number of a parameter. If you edit a parameter
     *            value, Parameter Store automatically creates a new version and
     *            assigns this new version a unique ID. You can reference a
     *            parameter version ID in API actions or in Systems Manager
     *            documents (SSM documents). By default, if you don't specify a
     *            specific version, the system returns the latest parameter
     *            value when a parameter is called.
     *            </p>
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * <p>
     * The new version number of a parameter. If you edit a parameter value,
     * Parameter Store automatically creates a new version and assigns this new
     * version a unique ID. You can reference a parameter version ID in API
     * actions or in Systems Manager documents (SSM documents). By default, if
     * you don't specify a specific version, the system returns the latest
     * parameter value when a parameter is called.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param version <p>
     *            The new version number of a parameter. If you edit a parameter
     *            value, Parameter Store automatically creates a new version and
     *            assigns this new version a unique ID. You can reference a
     *            parameter version ID in API actions or in Systems Manager
     *            documents (SSM documents). By default, if you don't specify a
     *            specific version, the system returns the latest parameter
     *            value when a parameter is called.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutParameterResult withVersion(Long version) {
        this.version = version;
        return this;
    }

    /**
     * <p>
     * The tier assigned to the parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, Advanced, Intelligent-Tiering
     *
     * @return <p>
     *         The tier assigned to the parameter.
     *         </p>
     * @see ParameterTier
     */
    public String getTier() {
        return tier;
    }

    /**
     * <p>
     * The tier assigned to the parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, Advanced, Intelligent-Tiering
     *
     * @param tier <p>
     *            The tier assigned to the parameter.
     *            </p>
     * @see ParameterTier
     */
    public void setTier(String tier) {
        this.tier = tier;
    }

    /**
     * <p>
     * The tier assigned to the parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, Advanced, Intelligent-Tiering
     *
     * @param tier <p>
     *            The tier assigned to the parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParameterTier
     */
    public PutParameterResult withTier(String tier) {
        this.tier = tier;
        return this;
    }

    /**
     * <p>
     * The tier assigned to the parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, Advanced, Intelligent-Tiering
     *
     * @param tier <p>
     *            The tier assigned to the parameter.
     *            </p>
     * @see ParameterTier
     */
    public void setTier(ParameterTier tier) {
        this.tier = tier.toString();
    }

    /**
     * <p>
     * The tier assigned to the parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, Advanced, Intelligent-Tiering
     *
     * @param tier <p>
     *            The tier assigned to the parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParameterTier
     */
    public PutParameterResult withTier(ParameterTier tier) {
        this.tier = tier.toString();
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
        if (getTier() != null)
            sb.append("Tier: " + getTier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getTier() == null) ? 0 : getTier().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutParameterResult == false)
            return false;
        PutParameterResult other = (PutParameterResult) obj;

        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getTier() == null ^ this.getTier() == null)
            return false;
        if (other.getTier() != null && other.getTier().equals(this.getTier()) == false)
            return false;
        return true;
    }
}
