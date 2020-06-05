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

public class CreatePublicKey2019_03_26Result implements Serializable {
    /**
     * <p>
     * Returned when you add a public key.
     * </p>
     */
    private PublicKey publicKey;

    /**
     * <p>
     * The fully qualified URI of the new public key resource just created. For
     * example:
     * <code>https://cloudfront.amazonaws.com/2010-11-01/cloudfront-public-key/EDFDVBD632BHDS5</code>
     * .
     * </p>
     */
    private String location;

    /**
     * <p>
     * The current version of the public key. For example:
     * <code>E2QWRUHAPOMQZL</code>.
     * </p>
     */
    private String eTag;

    /**
     * <p>
     * Returned when you add a public key.
     * </p>
     *
     * @return <p>
     *         Returned when you add a public key.
     *         </p>
     */
    public PublicKey getPublicKey() {
        return publicKey;
    }

    /**
     * <p>
     * Returned when you add a public key.
     * </p>
     *
     * @param publicKey <p>
     *            Returned when you add a public key.
     *            </p>
     */
    public void setPublicKey(PublicKey publicKey) {
        this.publicKey = publicKey;
    }

    /**
     * <p>
     * Returned when you add a public key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publicKey <p>
     *            Returned when you add a public key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePublicKey2019_03_26Result withPublicKey(PublicKey publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    /**
     * <p>
     * The fully qualified URI of the new public key resource just created. For
     * example:
     * <code>https://cloudfront.amazonaws.com/2010-11-01/cloudfront-public-key/EDFDVBD632BHDS5</code>
     * .
     * </p>
     *
     * @return <p>
     *         The fully qualified URI of the new public key resource just
     *         created. For example:
     *         <code>https://cloudfront.amazonaws.com/2010-11-01/cloudfront-public-key/EDFDVBD632BHDS5</code>
     *         .
     *         </p>
     */
    public String getLocation() {
        return location;
    }

    /**
     * <p>
     * The fully qualified URI of the new public key resource just created. For
     * example:
     * <code>https://cloudfront.amazonaws.com/2010-11-01/cloudfront-public-key/EDFDVBD632BHDS5</code>
     * .
     * </p>
     *
     * @param location <p>
     *            The fully qualified URI of the new public key resource just
     *            created. For example:
     *            <code>https://cloudfront.amazonaws.com/2010-11-01/cloudfront-public-key/EDFDVBD632BHDS5</code>
     *            .
     *            </p>
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The fully qualified URI of the new public key resource just created. For
     * example:
     * <code>https://cloudfront.amazonaws.com/2010-11-01/cloudfront-public-key/EDFDVBD632BHDS5</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param location <p>
     *            The fully qualified URI of the new public key resource just
     *            created. For example:
     *            <code>https://cloudfront.amazonaws.com/2010-11-01/cloudfront-public-key/EDFDVBD632BHDS5</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePublicKey2019_03_26Result withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * <p>
     * The current version of the public key. For example:
     * <code>E2QWRUHAPOMQZL</code>.
     * </p>
     *
     * @return <p>
     *         The current version of the public key. For example:
     *         <code>E2QWRUHAPOMQZL</code>.
     *         </p>
     */
    public String getETag() {
        return eTag;
    }

    /**
     * <p>
     * The current version of the public key. For example:
     * <code>E2QWRUHAPOMQZL</code>.
     * </p>
     *
     * @param eTag <p>
     *            The current version of the public key. For example:
     *            <code>E2QWRUHAPOMQZL</code>.
     *            </p>
     */
    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * The current version of the public key. For example:
     * <code>E2QWRUHAPOMQZL</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eTag <p>
     *            The current version of the public key. For example:
     *            <code>E2QWRUHAPOMQZL</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePublicKey2019_03_26Result withETag(String eTag) {
        this.eTag = eTag;
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
        if (getPublicKey() != null)
            sb.append("PublicKey: " + getPublicKey() + ",");
        if (getLocation() != null)
            sb.append("Location: " + getLocation() + ",");
        if (getETag() != null)
            sb.append("ETag: " + getETag());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPublicKey() == null) ? 0 : getPublicKey().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePublicKey2019_03_26Result == false)
            return false;
        CreatePublicKey2019_03_26Result other = (CreatePublicKey2019_03_26Result) obj;

        if (other.getPublicKey() == null ^ this.getPublicKey() == null)
            return false;
        if (other.getPublicKey() != null
                && other.getPublicKey().equals(this.getPublicKey()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false)
            return false;
        return true;
    }
}
