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

package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;

/**
 * <p>
 * Details of the license data.
 * </p>
 */
public class LicenseInfo implements Serializable {
    /**
     * <p>
     * Name of the license.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The URL for license data.
     * </p>
     */
    private String url;

    /**
     * <p>
     * Name of the license.
     * </p>
     *
     * @return <p>
     *         Name of the license.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * Name of the license.
     * </p>
     *
     * @param name <p>
     *            Name of the license.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the license.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            Name of the license.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LicenseInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The URL for license data.
     * </p>
     *
     * @return <p>
     *         The URL for license data.
     *         </p>
     */
    public String getUrl() {
        return url;
    }

    /**
     * <p>
     * The URL for license data.
     * </p>
     *
     * @param url <p>
     *            The URL for license data.
     *            </p>
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL for license data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param url <p>
     *            The URL for license data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LicenseInfo withUrl(String url) {
        this.url = url;
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
            sb.append("name: " + getName() + ",");
        if (getUrl() != null)
            sb.append("url: " + getUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LicenseInfo == false)
            return false;
        LicenseInfo other = (LicenseInfo) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        return true;
    }
}
