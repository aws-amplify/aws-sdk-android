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

package com.amazonaws.services.metering.marketplace.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * ResolveCustomer is called by a SaaS application during the registration
 * process. When a buyer visits your website during the registration process,
 * the buyer submits a registration token through their browser. The
 * registration token is resolved through this API to obtain a
 * CustomerIdentifier and product code.
 * </p>
 */
public class ResolveCustomerRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * When a buyer visits your website during the registration process, the
     * buyer submits a registration token through the browser. The registration
     * token is resolved to obtain a CustomerIdentifier and product code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\S+<br/>
     */
    private String registrationToken;

    /**
     * <p>
     * When a buyer visits your website during the registration process, the
     * buyer submits a registration token through the browser. The registration
     * token is resolved to obtain a CustomerIdentifier and product code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\S+<br/>
     *
     * @return <p>
     *         When a buyer visits your website during the registration process,
     *         the buyer submits a registration token through the browser. The
     *         registration token is resolved to obtain a CustomerIdentifier and
     *         product code.
     *         </p>
     */
    public String getRegistrationToken() {
        return registrationToken;
    }

    /**
     * <p>
     * When a buyer visits your website during the registration process, the
     * buyer submits a registration token through the browser. The registration
     * token is resolved to obtain a CustomerIdentifier and product code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\S+<br/>
     *
     * @param registrationToken <p>
     *            When a buyer visits your website during the registration
     *            process, the buyer submits a registration token through the
     *            browser. The registration token is resolved to obtain a
     *            CustomerIdentifier and product code.
     *            </p>
     */
    public void setRegistrationToken(String registrationToken) {
        this.registrationToken = registrationToken;
    }

    /**
     * <p>
     * When a buyer visits your website during the registration process, the
     * buyer submits a registration token through the browser. The registration
     * token is resolved to obtain a CustomerIdentifier and product code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\S+<br/>
     *
     * @param registrationToken <p>
     *            When a buyer visits your website during the registration
     *            process, the buyer submits a registration token through the
     *            browser. The registration token is resolved to obtain a
     *            CustomerIdentifier and product code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResolveCustomerRequest withRegistrationToken(String registrationToken) {
        this.registrationToken = registrationToken;
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
        if (getRegistrationToken() != null)
            sb.append("RegistrationToken: " + getRegistrationToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRegistrationToken() == null) ? 0 : getRegistrationToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResolveCustomerRequest == false)
            return false;
        ResolveCustomerRequest other = (ResolveCustomerRequest) obj;

        if (other.getRegistrationToken() == null ^ this.getRegistrationToken() == null)
            return false;
        if (other.getRegistrationToken() != null
                && other.getRegistrationToken().equals(this.getRegistrationToken()) == false)
            return false;
        return true;
    }
}
