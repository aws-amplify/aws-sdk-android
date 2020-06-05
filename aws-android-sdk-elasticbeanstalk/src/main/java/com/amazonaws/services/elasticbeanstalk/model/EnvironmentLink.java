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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

/**
 * <p>
 * A link to another environment, defined in the environment's manifest. Links
 * provide connection information in system properties that can be used to
 * connect to another environment in the same group. See <a href=
 * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html"
 * >Environment Manifest (env.yaml)</a> for details.
 * </p>
 */
public class EnvironmentLink implements Serializable {
    /**
     * <p>
     * The name of the link.
     * </p>
     */
    private String linkName;

    /**
     * <p>
     * The name of the linked environment (the dependency).
     * </p>
     */
    private String environmentName;

    /**
     * <p>
     * The name of the link.
     * </p>
     *
     * @return <p>
     *         The name of the link.
     *         </p>
     */
    public String getLinkName() {
        return linkName;
    }

    /**
     * <p>
     * The name of the link.
     * </p>
     *
     * @param linkName <p>
     *            The name of the link.
     *            </p>
     */
    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    /**
     * <p>
     * The name of the link.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param linkName <p>
     *            The name of the link.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnvironmentLink withLinkName(String linkName) {
        this.linkName = linkName;
        return this;
    }

    /**
     * <p>
     * The name of the linked environment (the dependency).
     * </p>
     *
     * @return <p>
     *         The name of the linked environment (the dependency).
     *         </p>
     */
    public String getEnvironmentName() {
        return environmentName;
    }

    /**
     * <p>
     * The name of the linked environment (the dependency).
     * </p>
     *
     * @param environmentName <p>
     *            The name of the linked environment (the dependency).
     *            </p>
     */
    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of the linked environment (the dependency).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param environmentName <p>
     *            The name of the linked environment (the dependency).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnvironmentLink withEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
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
        if (getLinkName() != null)
            sb.append("LinkName: " + getLinkName() + ",");
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: " + getEnvironmentName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLinkName() == null) ? 0 : getLinkName().hashCode());
        hashCode = prime * hashCode
                + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnvironmentLink == false)
            return false;
        EnvironmentLink other = (EnvironmentLink) obj;

        if (other.getLinkName() == null ^ this.getLinkName() == null)
            return false;
        if (other.getLinkName() != null && other.getLinkName().equals(this.getLinkName()) == false)
            return false;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null
                && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        return true;
    }
}
