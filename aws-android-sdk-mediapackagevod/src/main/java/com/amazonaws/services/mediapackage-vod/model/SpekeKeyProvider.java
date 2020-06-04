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
package com.amazonaws.services.mediapackage-vod.model;

import java.io.Serializable;


/**
 * A configuration for accessing an external Secure Packager and Encoder Key Exchange (SPEKE) service that will provide encryption keys.
 */
public class SpekeKeyProvider implements Serializable {
    /**
     * An Amazon Resource Name (ARN) of an IAM role that AWS Elemental
MediaPackage will assume when accessing the key provider service.

     */
    private String roleArn;

    /**
     * The system IDs to include in key requests.
     */
    private java.util.List<String> systemIds;

    /**
     * The URL of the external key provider service.
     */
    private String url;

    /**
     * An Amazon Resource Name (ARN) of an IAM role that AWS Elemental
MediaPackage will assume when accessing the key provider service.

     *
     * @return An Amazon Resource Name (ARN) of an IAM role that AWS Elemental
MediaPackage will assume when accessing the key provider service.

     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * An Amazon Resource Name (ARN) of an IAM role that AWS Elemental
MediaPackage will assume when accessing the key provider service.

     *
     * @param roleArn An Amazon Resource Name (ARN) of an IAM role that AWS Elemental
MediaPackage will assume when accessing the key provider service.

     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * An Amazon Resource Name (ARN) of an IAM role that AWS Elemental
MediaPackage will assume when accessing the key provider service.

     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param roleArn An Amazon Resource Name (ARN) of an IAM role that AWS Elemental
MediaPackage will assume when accessing the key provider service.

     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public SpekeKeyProvider withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * The system IDs to include in key requests.
     *
     * @return The system IDs to include in key requests.
     */
    public java.util.List<String> getSystemIds() {
        return systemIds;
    }

    /**
     * The system IDs to include in key requests.
     *
     * @param systemIds The system IDs to include in key requests.
     */
    public void setSystemIds(java.util.Collection<String> systemIds) {
        if (systemIds == null) {
            this.systemIds = null;
            return;
        }

        this.systemIds = new java.util.ArrayList<String>(systemIds);
    }

    /**
     * The system IDs to include in key requests.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param systemIds The system IDs to include in key requests.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public SpekeKeyProvider withSystemIds(String... systemIds) {
        if (getSystemIds() == null) {
            this.systemIds = new java.util.ArrayList<String>(systemIds.length);
        }
        for (String value : systemIds) {
            this.systemIds.add(value);
        }
        return this;
    }

    /**
     * The system IDs to include in key requests.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param systemIds The system IDs to include in key requests.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public SpekeKeyProvider withSystemIds(java.util.Collection<String> systemIds) {
        setSystemIds(systemIds);
        return this;
    }

    /**
     * The URL of the external key provider service.
     *
     * @return The URL of the external key provider service.
     */
    public String getUrl() {
        return url;
    }

    /**
     * The URL of the external key provider service.
     *
     * @param url The URL of the external key provider service.
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * The URL of the external key provider service.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param url The URL of the external key provider service.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public SpekeKeyProvider withUrl(String url) {
        this.url = url;
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
        if (getRoleArn() != null) sb.append("RoleArn: " + getRoleArn() + ",");
        if (getSystemIds() != null) sb.append("SystemIds: " + getSystemIds() + ",");
        if (getUrl() != null) sb.append("Url: " + getUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSystemIds() == null) ? 0 : getSystemIds().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SpekeKeyProvider == false) return false;
        SpekeKeyProvider other = (SpekeKeyProvider)obj;

        if (other.getRoleArn() == null ^ this.getRoleArn() == null) return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false) return false;
        if (other.getSystemIds() == null ^ this.getSystemIds() == null) return false;
        if (other.getSystemIds() != null && other.getSystemIds().equals(this.getSystemIds()) == false) return false;
        if (other.getUrl() == null ^ this.getUrl() == null) return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false) return false;
        return true;
    }
}
