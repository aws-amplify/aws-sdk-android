/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * An object that specifies the authorization service for a domain.
 * </p>
 */
public class AuthorizerConfig implements Serializable {
    /**
     * <p>
     * The name of the authorization service for a domain configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w=,@-]+<br/>
     */
    private String defaultAuthorizerName;

    /**
     * <p>
     * A Boolean that specifies whether the domain configuration's authorization
     * service can be overridden.
     * </p>
     */
    private Boolean allowAuthorizerOverride;

    /**
     * <p>
     * The name of the authorization service for a domain configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w=,@-]+<br/>
     *
     * @return <p>
     *         The name of the authorization service for a domain configuration.
     *         </p>
     */
    public String getDefaultAuthorizerName() {
        return defaultAuthorizerName;
    }

    /**
     * <p>
     * The name of the authorization service for a domain configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w=,@-]+<br/>
     *
     * @param defaultAuthorizerName <p>
     *            The name of the authorization service for a domain
     *            configuration.
     *            </p>
     */
    public void setDefaultAuthorizerName(String defaultAuthorizerName) {
        this.defaultAuthorizerName = defaultAuthorizerName;
    }

    /**
     * <p>
     * The name of the authorization service for a domain configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w=,@-]+<br/>
     *
     * @param defaultAuthorizerName <p>
     *            The name of the authorization service for a domain
     *            configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizerConfig withDefaultAuthorizerName(String defaultAuthorizerName) {
        this.defaultAuthorizerName = defaultAuthorizerName;
        return this;
    }

    /**
     * <p>
     * A Boolean that specifies whether the domain configuration's authorization
     * service can be overridden.
     * </p>
     *
     * @return <p>
     *         A Boolean that specifies whether the domain configuration's
     *         authorization service can be overridden.
     *         </p>
     */
    public Boolean isAllowAuthorizerOverride() {
        return allowAuthorizerOverride;
    }

    /**
     * <p>
     * A Boolean that specifies whether the domain configuration's authorization
     * service can be overridden.
     * </p>
     *
     * @return <p>
     *         A Boolean that specifies whether the domain configuration's
     *         authorization service can be overridden.
     *         </p>
     */
    public Boolean getAllowAuthorizerOverride() {
        return allowAuthorizerOverride;
    }

    /**
     * <p>
     * A Boolean that specifies whether the domain configuration's authorization
     * service can be overridden.
     * </p>
     *
     * @param allowAuthorizerOverride <p>
     *            A Boolean that specifies whether the domain configuration's
     *            authorization service can be overridden.
     *            </p>
     */
    public void setAllowAuthorizerOverride(Boolean allowAuthorizerOverride) {
        this.allowAuthorizerOverride = allowAuthorizerOverride;
    }

    /**
     * <p>
     * A Boolean that specifies whether the domain configuration's authorization
     * service can be overridden.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowAuthorizerOverride <p>
     *            A Boolean that specifies whether the domain configuration's
     *            authorization service can be overridden.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizerConfig withAllowAuthorizerOverride(Boolean allowAuthorizerOverride) {
        this.allowAuthorizerOverride = allowAuthorizerOverride;
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
        if (getDefaultAuthorizerName() != null)
            sb.append("defaultAuthorizerName: " + getDefaultAuthorizerName() + ",");
        if (getAllowAuthorizerOverride() != null)
            sb.append("allowAuthorizerOverride: " + getAllowAuthorizerOverride());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDefaultAuthorizerName() == null) ? 0 : getDefaultAuthorizerName().hashCode());
        hashCode = prime
                * hashCode
                + ((getAllowAuthorizerOverride() == null) ? 0 : getAllowAuthorizerOverride()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthorizerConfig == false)
            return false;
        AuthorizerConfig other = (AuthorizerConfig) obj;

        if (other.getDefaultAuthorizerName() == null ^ this.getDefaultAuthorizerName() == null)
            return false;
        if (other.getDefaultAuthorizerName() != null
                && other.getDefaultAuthorizerName().equals(this.getDefaultAuthorizerName()) == false)
            return false;
        if (other.getAllowAuthorizerOverride() == null ^ this.getAllowAuthorizerOverride() == null)
            return false;
        if (other.getAllowAuthorizerOverride() != null
                && other.getAllowAuthorizerOverride().equals(this.getAllowAuthorizerOverride()) == false)
            return false;
        return true;
    }
}
