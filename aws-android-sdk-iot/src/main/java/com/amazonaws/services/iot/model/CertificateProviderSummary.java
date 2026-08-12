/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * The certificate provider summary.
 * </p>
 */
public class CertificateProviderSummary implements Serializable {
    /**
     * <p>
     * The name of the certificate provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w=,@-]+<br/>
     */
    private String certificateProviderName;

    /**
     * <p>
     * The ARN of the certificate provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     */
    private String certificateProviderArn;

    /**
     * <p>
     * The name of the certificate provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w=,@-]+<br/>
     *
     * @return <p>
     *         The name of the certificate provider.
     *         </p>
     */
    public String getCertificateProviderName() {
        return certificateProviderName;
    }

    /**
     * <p>
     * The name of the certificate provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w=,@-]+<br/>
     *
     * @param certificateProviderName <p>
     *            The name of the certificate provider.
     *            </p>
     */
    public void setCertificateProviderName(String certificateProviderName) {
        this.certificateProviderName = certificateProviderName;
    }

    /**
     * <p>
     * The name of the certificate provider.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w=,@-]+<br/>
     *
     * @param certificateProviderName <p>
     *            The name of the certificate provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CertificateProviderSummary withCertificateProviderName(String certificateProviderName) {
        this.certificateProviderName = certificateProviderName;
        return this;
    }

    /**
     * <p>
     * The ARN of the certificate provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     *
     * @return <p>
     *         The ARN of the certificate provider.
     *         </p>
     */
    public String getCertificateProviderArn() {
        return certificateProviderArn;
    }

    /**
     * <p>
     * The ARN of the certificate provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     *
     * @param certificateProviderArn <p>
     *            The ARN of the certificate provider.
     *            </p>
     */
    public void setCertificateProviderArn(String certificateProviderArn) {
        this.certificateProviderArn = certificateProviderArn;
    }

    /**
     * <p>
     * The ARN of the certificate provider.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     *
     * @param certificateProviderArn <p>
     *            The ARN of the certificate provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CertificateProviderSummary withCertificateProviderArn(String certificateProviderArn) {
        this.certificateProviderArn = certificateProviderArn;
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
        if (getCertificateProviderName() != null)
            sb.append("certificateProviderName: " + getCertificateProviderName() + ",");
        if (getCertificateProviderArn() != null)
            sb.append("certificateProviderArn: " + getCertificateProviderArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCertificateProviderName() == null) ? 0 : getCertificateProviderName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCertificateProviderArn() == null) ? 0 : getCertificateProviderArn()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CertificateProviderSummary == false)
            return false;
        CertificateProviderSummary other = (CertificateProviderSummary) obj;

        if (other.getCertificateProviderName() == null ^ this.getCertificateProviderName() == null)
            return false;
        if (other.getCertificateProviderName() != null
                && other.getCertificateProviderName().equals(this.getCertificateProviderName()) == false)
            return false;
        if (other.getCertificateProviderArn() == null ^ this.getCertificateProviderArn() == null)
            return false;
        if (other.getCertificateProviderArn() != null
                && other.getCertificateProviderArn().equals(this.getCertificateProviderArn()) == false)
            return false;
        return true;
    }
}
