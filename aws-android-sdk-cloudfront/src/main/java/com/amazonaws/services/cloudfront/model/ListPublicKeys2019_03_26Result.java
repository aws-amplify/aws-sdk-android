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

public class ListPublicKeys2019_03_26Result implements Serializable {
    /**
     * <p>
     * Returns a list of all public keys that have been added to CloudFront for
     * this account.
     * </p>
     */
    private PublicKeyList publicKeyList;

    /**
     * <p>
     * Returns a list of all public keys that have been added to CloudFront for
     * this account.
     * </p>
     *
     * @return <p>
     *         Returns a list of all public keys that have been added to
     *         CloudFront for this account.
     *         </p>
     */
    public PublicKeyList getPublicKeyList() {
        return publicKeyList;
    }

    /**
     * <p>
     * Returns a list of all public keys that have been added to CloudFront for
     * this account.
     * </p>
     *
     * @param publicKeyList <p>
     *            Returns a list of all public keys that have been added to
     *            CloudFront for this account.
     *            </p>
     */
    public void setPublicKeyList(PublicKeyList publicKeyList) {
        this.publicKeyList = publicKeyList;
    }

    /**
     * <p>
     * Returns a list of all public keys that have been added to CloudFront for
     * this account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publicKeyList <p>
     *            Returns a list of all public keys that have been added to
     *            CloudFront for this account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPublicKeys2019_03_26Result withPublicKeyList(PublicKeyList publicKeyList) {
        this.publicKeyList = publicKeyList;
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
        if (getPublicKeyList() != null)
            sb.append("PublicKeyList: " + getPublicKeyList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPublicKeyList() == null) ? 0 : getPublicKeyList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPublicKeys2019_03_26Result == false)
            return false;
        ListPublicKeys2019_03_26Result other = (ListPublicKeys2019_03_26Result) obj;

        if (other.getPublicKeyList() == null ^ this.getPublicKeyList() == null)
            return false;
        if (other.getPublicKeyList() != null
                && other.getPublicKeyList().equals(this.getPublicKeyList()) == false)
            return false;
        return true;
    }
}
