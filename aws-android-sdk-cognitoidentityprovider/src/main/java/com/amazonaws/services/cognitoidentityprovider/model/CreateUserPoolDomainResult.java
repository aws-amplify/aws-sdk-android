/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

public class CreateUserPoolDomainResult implements Serializable {
    /**
     * <p>
     * The Amazon CloudFront endpoint that you use as the target of the alias
     * that you set up with your Domain Name Service (DNS) provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](?:[a-z0-9\-]{0,61}[a-z0-9])?$<br/>
     */
    private String cloudFrontDomain;

    /**
     * <p>
     * The Amazon CloudFront endpoint that you use as the target of the alias
     * that you set up with your Domain Name Service (DNS) provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](?:[a-z0-9\-]{0,61}[a-z0-9])?$<br/>
     *
     * @return <p>
     *         The Amazon CloudFront endpoint that you use as the target of the
     *         alias that you set up with your Domain Name Service (DNS)
     *         provider.
     *         </p>
     */
    public String getCloudFrontDomain() {
        return cloudFrontDomain;
    }

    /**
     * <p>
     * The Amazon CloudFront endpoint that you use as the target of the alias
     * that you set up with your Domain Name Service (DNS) provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](?:[a-z0-9\-]{0,61}[a-z0-9])?$<br/>
     *
     * @param cloudFrontDomain <p>
     *            The Amazon CloudFront endpoint that you use as the target of
     *            the alias that you set up with your Domain Name Service (DNS)
     *            provider.
     *            </p>
     */
    public void setCloudFrontDomain(String cloudFrontDomain) {
        this.cloudFrontDomain = cloudFrontDomain;
    }

    /**
     * <p>
     * The Amazon CloudFront endpoint that you use as the target of the alias
     * that you set up with your Domain Name Service (DNS) provider.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](?:[a-z0-9\-]{0,61}[a-z0-9])?$<br/>
     *
     * @param cloudFrontDomain <p>
     *            The Amazon CloudFront endpoint that you use as the target of
     *            the alias that you set up with your Domain Name Service (DNS)
     *            provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolDomainResult withCloudFrontDomain(String cloudFrontDomain) {
        this.cloudFrontDomain = cloudFrontDomain;
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
        if (getCloudFrontDomain() != null)
            sb.append("CloudFrontDomain: " + getCloudFrontDomain());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCloudFrontDomain() == null) ? 0 : getCloudFrontDomain().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUserPoolDomainResult == false)
            return false;
        CreateUserPoolDomainResult other = (CreateUserPoolDomainResult) obj;

        if (other.getCloudFrontDomain() == null ^ this.getCloudFrontDomain() == null)
            return false;
        if (other.getCloudFrontDomain() != null
                && other.getCloudFrontDomain().equals(this.getCloudFrontDomain()) == false)
            return false;
        return true;
    }
}
