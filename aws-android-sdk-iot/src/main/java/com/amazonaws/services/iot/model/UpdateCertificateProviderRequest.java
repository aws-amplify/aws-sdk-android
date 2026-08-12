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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates a certificate provider.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >UpdateCertificateProvider</a> action.
 * </p>
 */
public class UpdateCertificateProviderRequest extends AmazonWebServiceRequest implements
        Serializable {
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
     * The Lambda function ARN that's associated with the certificate provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     */
    private String lambdaFunctionArn;

    /**
     * <p>
     * A list of the operations that the certificate provider will use to
     * generate certificates. Valid value: <code>CreateCertificateFromCsr</code>
     * .
     * </p>
     */
    private java.util.List<String> accountDefaultForOperations;

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
    public UpdateCertificateProviderRequest withCertificateProviderName(
            String certificateProviderName) {
        this.certificateProviderName = certificateProviderName;
        return this;
    }

    /**
     * <p>
     * The Lambda function ARN that's associated with the certificate provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @return <p>
     *         The Lambda function ARN that's associated with the certificate
     *         provider.
     *         </p>
     */
    public String getLambdaFunctionArn() {
        return lambdaFunctionArn;
    }

    /**
     * <p>
     * The Lambda function ARN that's associated with the certificate provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param lambdaFunctionArn <p>
     *            The Lambda function ARN that's associated with the certificate
     *            provider.
     *            </p>
     */
    public void setLambdaFunctionArn(String lambdaFunctionArn) {
        this.lambdaFunctionArn = lambdaFunctionArn;
    }

    /**
     * <p>
     * The Lambda function ARN that's associated with the certificate provider.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param lambdaFunctionArn <p>
     *            The Lambda function ARN that's associated with the certificate
     *            provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateCertificateProviderRequest withLambdaFunctionArn(String lambdaFunctionArn) {
        this.lambdaFunctionArn = lambdaFunctionArn;
        return this;
    }

    /**
     * <p>
     * A list of the operations that the certificate provider will use to
     * generate certificates. Valid value: <code>CreateCertificateFromCsr</code>
     * .
     * </p>
     *
     * @return <p>
     *         A list of the operations that the certificate provider will use
     *         to generate certificates. Valid value:
     *         <code>CreateCertificateFromCsr</code>.
     *         </p>
     */
    public java.util.List<String> getAccountDefaultForOperations() {
        return accountDefaultForOperations;
    }

    /**
     * <p>
     * A list of the operations that the certificate provider will use to
     * generate certificates. Valid value: <code>CreateCertificateFromCsr</code>
     * .
     * </p>
     *
     * @param accountDefaultForOperations <p>
     *            A list of the operations that the certificate provider will
     *            use to generate certificates. Valid value:
     *            <code>CreateCertificateFromCsr</code>.
     *            </p>
     */
    public void setAccountDefaultForOperations(
            java.util.Collection<String> accountDefaultForOperations) {
        if (accountDefaultForOperations == null) {
            this.accountDefaultForOperations = null;
            return;
        }

        this.accountDefaultForOperations = new java.util.ArrayList<String>(
                accountDefaultForOperations);
    }

    /**
     * <p>
     * A list of the operations that the certificate provider will use to
     * generate certificates. Valid value: <code>CreateCertificateFromCsr</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountDefaultForOperations <p>
     *            A list of the operations that the certificate provider will
     *            use to generate certificates. Valid value:
     *            <code>CreateCertificateFromCsr</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateCertificateProviderRequest withAccountDefaultForOperations(
            String... accountDefaultForOperations) {
        if (getAccountDefaultForOperations() == null) {
            this.accountDefaultForOperations = new java.util.ArrayList<String>(
                    accountDefaultForOperations.length);
        }
        for (String value : accountDefaultForOperations) {
            this.accountDefaultForOperations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the operations that the certificate provider will use to
     * generate certificates. Valid value: <code>CreateCertificateFromCsr</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountDefaultForOperations <p>
     *            A list of the operations that the certificate provider will
     *            use to generate certificates. Valid value:
     *            <code>CreateCertificateFromCsr</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateCertificateProviderRequest withAccountDefaultForOperations(
            java.util.Collection<String> accountDefaultForOperations) {
        setAccountDefaultForOperations(accountDefaultForOperations);
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
        if (getLambdaFunctionArn() != null)
            sb.append("lambdaFunctionArn: " + getLambdaFunctionArn() + ",");
        if (getAccountDefaultForOperations() != null)
            sb.append("accountDefaultForOperations: " + getAccountDefaultForOperations());
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
        hashCode = prime * hashCode
                + ((getLambdaFunctionArn() == null) ? 0 : getLambdaFunctionArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getAccountDefaultForOperations() == null) ? 0
                        : getAccountDefaultForOperations().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCertificateProviderRequest == false)
            return false;
        UpdateCertificateProviderRequest other = (UpdateCertificateProviderRequest) obj;

        if (other.getCertificateProviderName() == null ^ this.getCertificateProviderName() == null)
            return false;
        if (other.getCertificateProviderName() != null
                && other.getCertificateProviderName().equals(this.getCertificateProviderName()) == false)
            return false;
        if (other.getLambdaFunctionArn() == null ^ this.getLambdaFunctionArn() == null)
            return false;
        if (other.getLambdaFunctionArn() != null
                && other.getLambdaFunctionArn().equals(this.getLambdaFunctionArn()) == false)
            return false;
        if (other.getAccountDefaultForOperations() == null
                ^ this.getAccountDefaultForOperations() == null)
            return false;
        if (other.getAccountDefaultForOperations() != null
                && other.getAccountDefaultForOperations().equals(
                        this.getAccountDefaultForOperations()) == false)
            return false;
        return true;
    }
}
