/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class ListCertificateProvidersResult implements Serializable {
    /**
     * <p>
     * The list of certificate providers in your Amazon Web Services account.
     * </p>
     */
    private java.util.List<CertificateProviderSummary> certificateProviders;

    /**
     * <p>
     * The token for the next set of results, or <code>null</code> if there are
     * no more results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[A-Za-z0-9+/]+={0,2}<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The list of certificate providers in your Amazon Web Services account.
     * </p>
     *
     * @return <p>
     *         The list of certificate providers in your Amazon Web Services
     *         account.
     *         </p>
     */
    public java.util.List<CertificateProviderSummary> getCertificateProviders() {
        return certificateProviders;
    }

    /**
     * <p>
     * The list of certificate providers in your Amazon Web Services account.
     * </p>
     *
     * @param certificateProviders <p>
     *            The list of certificate providers in your Amazon Web Services
     *            account.
     *            </p>
     */
    public void setCertificateProviders(
            java.util.Collection<CertificateProviderSummary> certificateProviders) {
        if (certificateProviders == null) {
            this.certificateProviders = null;
            return;
        }

        this.certificateProviders = new java.util.ArrayList<CertificateProviderSummary>(
                certificateProviders);
    }

    /**
     * <p>
     * The list of certificate providers in your Amazon Web Services account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateProviders <p>
     *            The list of certificate providers in your Amazon Web Services
     *            account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCertificateProvidersResult withCertificateProviders(
            CertificateProviderSummary... certificateProviders) {
        if (getCertificateProviders() == null) {
            this.certificateProviders = new java.util.ArrayList<CertificateProviderSummary>(
                    certificateProviders.length);
        }
        for (CertificateProviderSummary value : certificateProviders) {
            this.certificateProviders.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of certificate providers in your Amazon Web Services account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateProviders <p>
     *            The list of certificate providers in your Amazon Web Services
     *            account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCertificateProvidersResult withCertificateProviders(
            java.util.Collection<CertificateProviderSummary> certificateProviders) {
        setCertificateProviders(certificateProviders);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or <code>null</code> if there are
     * no more results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[A-Za-z0-9+/]+={0,2}<br/>
     *
     * @return <p>
     *         The token for the next set of results, or <code>null</code> if
     *         there are no more results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or <code>null</code> if there are
     * no more results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[A-Za-z0-9+/]+={0,2}<br/>
     *
     * @param nextToken <p>
     *            The token for the next set of results, or <code>null</code> if
     *            there are no more results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or <code>null</code> if there are
     * no more results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[A-Za-z0-9+/]+={0,2}<br/>
     *
     * @param nextToken <p>
     *            The token for the next set of results, or <code>null</code> if
     *            there are no more results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCertificateProvidersResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getCertificateProviders() != null)
            sb.append("certificateProviders: " + getCertificateProviders() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCertificateProviders() == null) ? 0 : getCertificateProviders().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCertificateProvidersResult == false)
            return false;
        ListCertificateProvidersResult other = (ListCertificateProvidersResult) obj;

        if (other.getCertificateProviders() == null ^ this.getCertificateProviders() == null)
            return false;
        if (other.getCertificateProviders() != null
                && other.getCertificateProviders().equals(this.getCertificateProviders()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
