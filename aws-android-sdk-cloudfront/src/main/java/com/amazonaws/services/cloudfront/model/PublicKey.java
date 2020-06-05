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

package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

/**
 * <p>
 * A complex data type of public keys you add to CloudFront to use with features
 * like field-level encryption.
 * </p>
 */
public class PublicKey implements Serializable {
    /**
     * <p>
     * A unique ID assigned to a public key you've added to CloudFront.
     * </p>
     */
    private String id;

    /**
     * <p>
     * A time you added a public key to CloudFront.
     * </p>
     */
    private java.util.Date createdTime;

    /**
     * <p>
     * A complex data type for a public key you add to CloudFront to use with
     * features like field-level encryption.
     * </p>
     */
    private PublicKeyConfig publicKeyConfig;

    /**
     * <p>
     * A unique ID assigned to a public key you've added to CloudFront.
     * </p>
     *
     * @return <p>
     *         A unique ID assigned to a public key you've added to CloudFront.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * A unique ID assigned to a public key you've added to CloudFront.
     * </p>
     *
     * @param id <p>
     *            A unique ID assigned to a public key you've added to
     *            CloudFront.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A unique ID assigned to a public key you've added to CloudFront.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            A unique ID assigned to a public key you've added to
     *            CloudFront.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublicKey withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * A time you added a public key to CloudFront.
     * </p>
     *
     * @return <p>
     *         A time you added a public key to CloudFront.
     *         </p>
     */
    public java.util.Date getCreatedTime() {
        return createdTime;
    }

    /**
     * <p>
     * A time you added a public key to CloudFront.
     * </p>
     *
     * @param createdTime <p>
     *            A time you added a public key to CloudFront.
     *            </p>
     */
    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * A time you added a public key to CloudFront.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTime <p>
     *            A time you added a public key to CloudFront.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublicKey withCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * <p>
     * A complex data type for a public key you add to CloudFront to use with
     * features like field-level encryption.
     * </p>
     *
     * @return <p>
     *         A complex data type for a public key you add to CloudFront to use
     *         with features like field-level encryption.
     *         </p>
     */
    public PublicKeyConfig getPublicKeyConfig() {
        return publicKeyConfig;
    }

    /**
     * <p>
     * A complex data type for a public key you add to CloudFront to use with
     * features like field-level encryption.
     * </p>
     *
     * @param publicKeyConfig <p>
     *            A complex data type for a public key you add to CloudFront to
     *            use with features like field-level encryption.
     *            </p>
     */
    public void setPublicKeyConfig(PublicKeyConfig publicKeyConfig) {
        this.publicKeyConfig = publicKeyConfig;
    }

    /**
     * <p>
     * A complex data type for a public key you add to CloudFront to use with
     * features like field-level encryption.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publicKeyConfig <p>
     *            A complex data type for a public key you add to CloudFront to
     *            use with features like field-level encryption.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublicKey withPublicKeyConfig(PublicKeyConfig publicKeyConfig) {
        this.publicKeyConfig = publicKeyConfig;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: " + getCreatedTime() + ",");
        if (getPublicKeyConfig() != null)
            sb.append("PublicKeyConfig: " + getPublicKeyConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode
                + ((getPublicKeyConfig() == null) ? 0 : getPublicKeyConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PublicKey == false)
            return false;
        PublicKey other = (PublicKey) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null
                && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getPublicKeyConfig() == null ^ this.getPublicKeyConfig() == null)
            return false;
        if (other.getPublicKeyConfig() != null
                && other.getPublicKeyConfig().equals(this.getPublicKeyConfig()) == false)
            return false;
        return true;
    }
}
