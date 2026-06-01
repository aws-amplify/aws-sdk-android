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
 * Creates an Amazon Web Services IoT Core certificate provider. You can use
 * Amazon Web Services IoT Core certificate provider to customize how to sign a
 * certificate signing request (CSR) in IoT fleet provisioning. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/iot/latest/developerguide/provisioning-cert-provider.html"
 * >Customizing certificate signing using Amazon Web Services IoT Core
 * certificate provider</a> from <i>Amazon Web Services IoT Core Developer
 * Guide</i>.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >CreateCertificateProvider</a> action.
 * </p>
 * <important>
 * <p>
 * After you create a certificate provider, the behavior of <a href=
 * "https://docs.aws.amazon.com/iot/latest/developerguide/fleet-provision-api.html#create-cert-csr"
 * > <code>CreateCertificateFromCsr</code> API for fleet provisioning</a> will
 * change and all API calls to <code>CreateCertificateFromCsr</code> will invoke
 * the certificate provider to create the certificates. It can take up to a few
 * minutes for this behavior to change after a certificate provider is created.
 * </p>
 * </important>
 */
public class CreateCertificateProviderRequest extends AmazonWebServiceRequest implements
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
     * The ARN of the Lambda function that defines the authentication logic.
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
     * A string that you can optionally pass in the
     * <code>CreateCertificateProvider</code> request to make sure the request
     * is idempotent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 64<br/>
     * <b>Pattern: </b>\S{36,64}<br/>
     */
    private String clientToken;

    /**
     * <p>
     * Metadata which can be used to manage the certificate provider.
     * </p>
     */
    private java.util.List<Tag> tags;

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
    public CreateCertificateProviderRequest withCertificateProviderName(
            String certificateProviderName) {
        this.certificateProviderName = certificateProviderName;
        return this;
    }

    /**
     * <p>
     * The ARN of the Lambda function that defines the authentication logic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @return <p>
     *         The ARN of the Lambda function that defines the authentication
     *         logic.
     *         </p>
     */
    public String getLambdaFunctionArn() {
        return lambdaFunctionArn;
    }

    /**
     * <p>
     * The ARN of the Lambda function that defines the authentication logic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param lambdaFunctionArn <p>
     *            The ARN of the Lambda function that defines the authentication
     *            logic.
     *            </p>
     */
    public void setLambdaFunctionArn(String lambdaFunctionArn) {
        this.lambdaFunctionArn = lambdaFunctionArn;
    }

    /**
     * <p>
     * The ARN of the Lambda function that defines the authentication logic.
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
     *            The ARN of the Lambda function that defines the authentication
     *            logic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCertificateProviderRequest withLambdaFunctionArn(String lambdaFunctionArn) {
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
    public CreateCertificateProviderRequest withAccountDefaultForOperations(
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
    public CreateCertificateProviderRequest withAccountDefaultForOperations(
            java.util.Collection<String> accountDefaultForOperations) {
        setAccountDefaultForOperations(accountDefaultForOperations);
        return this;
    }

    /**
     * <p>
     * A string that you can optionally pass in the
     * <code>CreateCertificateProvider</code> request to make sure the request
     * is idempotent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 64<br/>
     * <b>Pattern: </b>\S{36,64}<br/>
     *
     * @return <p>
     *         A string that you can optionally pass in the
     *         <code>CreateCertificateProvider</code> request to make sure the
     *         request is idempotent.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * A string that you can optionally pass in the
     * <code>CreateCertificateProvider</code> request to make sure the request
     * is idempotent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 64<br/>
     * <b>Pattern: </b>\S{36,64}<br/>
     *
     * @param clientToken <p>
     *            A string that you can optionally pass in the
     *            <code>CreateCertificateProvider</code> request to make sure
     *            the request is idempotent.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A string that you can optionally pass in the
     * <code>CreateCertificateProvider</code> request to make sure the request
     * is idempotent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 64<br/>
     * <b>Pattern: </b>\S{36,64}<br/>
     *
     * @param clientToken <p>
     *            A string that you can optionally pass in the
     *            <code>CreateCertificateProvider</code> request to make sure
     *            the request is idempotent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCertificateProviderRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * Metadata which can be used to manage the certificate provider.
     * </p>
     *
     * @return <p>
     *         Metadata which can be used to manage the certificate provider.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata which can be used to manage the certificate provider.
     * </p>
     *
     * @param tags <p>
     *            Metadata which can be used to manage the certificate provider.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Metadata which can be used to manage the certificate provider.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Metadata which can be used to manage the certificate provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCertificateProviderRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Metadata which can be used to manage the certificate provider.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Metadata which can be used to manage the certificate provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCertificateProviderRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
            sb.append("accountDefaultForOperations: " + getAccountDefaultForOperations() + ",");
        if (getClientToken() != null)
            sb.append("clientToken: " + getClientToken() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
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
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCertificateProviderRequest == false)
            return false;
        CreateCertificateProviderRequest other = (CreateCertificateProviderRequest) obj;

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
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
