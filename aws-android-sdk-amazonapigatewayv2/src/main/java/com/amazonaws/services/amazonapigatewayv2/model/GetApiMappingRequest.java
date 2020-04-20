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

package com.amazonaws.services.amazonapigatewayv2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets an API mapping.
 * </p>
 */
public class GetApiMappingRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The API mapping identifier.
     * </p>
     */
    private String apiMappingId;

    /**
     * <p>
     * The domain name.
     * </p>
     */
    private String domainName;

    /**
     * <p>
     * The API mapping identifier.
     * </p>
     *
     * @return <p>
     *         The API mapping identifier.
     *         </p>
     */
    public String getApiMappingId() {
        return apiMappingId;
    }

    /**
     * <p>
     * The API mapping identifier.
     * </p>
     *
     * @param apiMappingId <p>
     *            The API mapping identifier.
     *            </p>
     */
    public void setApiMappingId(String apiMappingId) {
        this.apiMappingId = apiMappingId;
    }

    /**
     * <p>
     * The API mapping identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param apiMappingId <p>
     *            The API mapping identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetApiMappingRequest withApiMappingId(String apiMappingId) {
        this.apiMappingId = apiMappingId;
        return this;
    }

    /**
     * <p>
     * The domain name.
     * </p>
     *
     * @return <p>
     *         The domain name.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The domain name.
     * </p>
     *
     * @param domainName <p>
     *            The domain name.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainName <p>
     *            The domain name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetApiMappingRequest withDomainName(String domainName) {
        this.domainName = domainName;
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
        if (getApiMappingId() != null)
            sb.append("ApiMappingId: " + getApiMappingId() + ",");
        if (getDomainName() != null)
            sb.append("DomainName: " + getDomainName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApiMappingId() == null) ? 0 : getApiMappingId().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetApiMappingRequest == false)
            return false;
        GetApiMappingRequest other = (GetApiMappingRequest) obj;

        if (other.getApiMappingId() == null ^ this.getApiMappingId() == null)
            return false;
        if (other.getApiMappingId() != null
                && other.getApiMappingId().equals(this.getApiMappingId()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        return true;
    }
}
