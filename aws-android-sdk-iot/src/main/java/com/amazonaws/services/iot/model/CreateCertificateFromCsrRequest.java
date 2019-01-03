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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an X.509 certificate using the specified certificate signing request.
 * </p>
 * <p>
 * <b>Note:</b> The CSR must include a public key that is either an RSA key with
 * a length of at least 2048 bits or an ECC key from NIST P-256 or NIST P-384
 * curves.
 * </p>
 * <p>
 * <b>Note:</b> Reusing the same certificate signing request (CSR) results in a
 * distinct certificate.
 * </p>
 * <p>
 * You can create multiple certificates in a batch by creating a directory,
 * copying multiple .csr files into that directory, and then specifying that
 * directory on the command line. The following commands show how to create a
 * batch of certificates given a batch of CSRs.
 * </p>
 * <p>
 * Assuming a set of CSRs are located inside of the directory my-csr-directory:
 * </p>
 * <p>
 * On Linux and OS X, the command is:
 * </p>
 * <p>
 * $ ls my-csr-directory/ | xargs -I {} aws iot create-certificate-from-csr
 * --certificate-signing-request file://my-csr-directory/{}
 * </p>
 * <p>
 * This command lists all of the CSRs in my-csr-directory and pipes each CSR
 * file name to the aws iot create-certificate-from-csr AWS CLI command to
 * create a certificate for the corresponding CSR.
 * </p>
 * <p>
 * The aws iot create-certificate-from-csr part of the command can also be run
 * in parallel to speed up the certificate creation process:
 * </p>
 * <p>
 * $ ls my-csr-directory/ | xargs -P 10 -I {} aws iot
 * create-certificate-from-csr --certificate-signing-request
 * file://my-csr-directory/{}
 * </p>
 * <p>
 * On Windows PowerShell, the command to create certificates for all CSRs in
 * my-csr-directory is:
 * </p>
 * <p>
 * &gt; ls -Name my-csr-directory | %{aws iot create-certificate-from-csr
 * --certificate-signing-request file://my-csr-directory/$_}
 * </p>
 * <p>
 * On a Windows command prompt, the command to create certificates for all CSRs
 * in my-csr-directory is:
 * </p>
 * <p>
 * &gt; forfiles /p my-csr-directory /c
 * "cmd /c aws iot create-certificate-from-csr --certificate-signing-request file://@path"
 * </p>
 */
public class CreateCertificateFromCsrRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The certificate signing request (CSR).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String certificateSigningRequest;

    /**
     * <p>
     * Specifies whether the certificate is active.
     * </p>
     */
    private Boolean setAsActive;

    /**
     * <p>
     * The certificate signing request (CSR).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The certificate signing request (CSR).
     *         </p>
     */
    public String getCertificateSigningRequest() {
        return certificateSigningRequest;
    }

    /**
     * <p>
     * The certificate signing request (CSR).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param certificateSigningRequest <p>
     *            The certificate signing request (CSR).
     *            </p>
     */
    public void setCertificateSigningRequest(String certificateSigningRequest) {
        this.certificateSigningRequest = certificateSigningRequest;
    }

    /**
     * <p>
     * The certificate signing request (CSR).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param certificateSigningRequest <p>
     *            The certificate signing request (CSR).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCertificateFromCsrRequest withCertificateSigningRequest(
            String certificateSigningRequest) {
        this.certificateSigningRequest = certificateSigningRequest;
        return this;
    }

    /**
     * <p>
     * Specifies whether the certificate is active.
     * </p>
     *
     * @return <p>
     *         Specifies whether the certificate is active.
     *         </p>
     */
    public Boolean isSetAsActive() {
        return setAsActive;
    }

    /**
     * <p>
     * Specifies whether the certificate is active.
     * </p>
     *
     * @return <p>
     *         Specifies whether the certificate is active.
     *         </p>
     */
    public Boolean getSetAsActive() {
        return setAsActive;
    }

    /**
     * <p>
     * Specifies whether the certificate is active.
     * </p>
     *
     * @param setAsActive <p>
     *            Specifies whether the certificate is active.
     *            </p>
     */
    public void setSetAsActive(Boolean setAsActive) {
        this.setAsActive = setAsActive;
    }

    /**
     * <p>
     * Specifies whether the certificate is active.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param setAsActive <p>
     *            Specifies whether the certificate is active.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCertificateFromCsrRequest withSetAsActive(Boolean setAsActive) {
        this.setAsActive = setAsActive;
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
        if (getCertificateSigningRequest() != null)
            sb.append("certificateSigningRequest: " + getCertificateSigningRequest() + ",");
        if (getSetAsActive() != null)
            sb.append("setAsActive: " + getSetAsActive());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCertificateSigningRequest() == null) ? 0 : getCertificateSigningRequest()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getSetAsActive() == null) ? 0 : getSetAsActive().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCertificateFromCsrRequest == false)
            return false;
        CreateCertificateFromCsrRequest other = (CreateCertificateFromCsrRequest) obj;

        if (other.getCertificateSigningRequest() == null
                ^ this.getCertificateSigningRequest() == null)
            return false;
        if (other.getCertificateSigningRequest() != null
                && other.getCertificateSigningRequest().equals(this.getCertificateSigningRequest()) == false)
            return false;
        if (other.getSetAsActive() == null ^ this.getSetAsActive() == null)
            return false;
        if (other.getSetAsActive() != null
                && other.getSetAsActive().equals(this.getSetAsActive()) == false)
            return false;
        return true;
    }
}
