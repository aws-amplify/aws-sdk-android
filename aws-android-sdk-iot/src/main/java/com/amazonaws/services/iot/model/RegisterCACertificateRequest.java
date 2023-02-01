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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Registers a CA certificate with Amazon Web Services IoT Core. There is no
 * limit to the number of CA certificates you can register in your Amazon Web
 * Services account. You can register up to 10 CA certificates with the same
 * <code>CA subject field</code> per Amazon Web Services account.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >RegisterCACertificate</a> action.
 * </p>
 */
public class RegisterCACertificateRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The CA certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65536<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     */
    private String caCertificate;

    /**
     * <p>
     * The private key verification certificate. If <code>certificateMode</code>
     * is <code>SNI_ONLY</code>, the <code>verificationCertificate</code> field
     * must be empty. If <code>certificateMode</code> is <code>DEFAULT</code> or
     * not provided, the <code>verificationCertificate</code> field must not be
     * empty.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65536<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     */
    private String verificationCertificate;

    /**
     * <p>
     * A boolean value that specifies if the CA certificate is set to active.
     * </p>
     * <p>
     * Valid values: <code>ACTIVE | INACTIVE</code>
     * </p>
     */
    private Boolean setAsActive;

    /**
     * <p>
     * Allows this CA certificate to be used for auto registration of device
     * certificates.
     * </p>
     */
    private Boolean allowAutoRegistration;

    /**
     * <p>
     * Information about the registration configuration.
     * </p>
     */
    private RegistrationConfig registrationConfig;

    /**
     * <p>
     * Metadata which can be used to manage the CA certificate.
     * </p>
     * <note>
     * <p>
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     * </p>
     * <p>
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     * </p>
     * <p>
     * For the cli-input-json file use format: "tags":
     * "key1=value1&amp;key2=value2..."
     * </p>
     * </note>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Describes the certificate mode in which the Certificate Authority (CA)
     * will be registered. If the <code>verificationCertificate</code> field is
     * not provided, set <code>certificateMode</code> to be
     * <code>SNI_ONLY</code>. If the <code>verificationCertificate</code> field
     * is provided, set <code>certificateMode</code> to be <code>DEFAULT</code>.
     * When <code>certificateMode</code> is not provided, it defaults to
     * <code>DEFAULT</code>. All the device certificates that are registered
     * using this CA will be registered in the same certificate mode as the CA.
     * For more information about certificate mode for device certificates, see
     * <a href=
     * "https://docs.aws.amazon.com/iot/latest/apireference/API_CertificateDescription.html#iot-Type-CertificateDescription-certificateMode"
     * > certificate mode</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, SNI_ONLY
     */
    private String certificateMode;

    /**
     * <p>
     * The CA certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65536<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @return <p>
     *         The CA certificate.
     *         </p>
     */
    public String getCaCertificate() {
        return caCertificate;
    }

    /**
     * <p>
     * The CA certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65536<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param caCertificate <p>
     *            The CA certificate.
     *            </p>
     */
    public void setCaCertificate(String caCertificate) {
        this.caCertificate = caCertificate;
    }

    /**
     * <p>
     * The CA certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65536<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param caCertificate <p>
     *            The CA certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterCACertificateRequest withCaCertificate(String caCertificate) {
        this.caCertificate = caCertificate;
        return this;
    }

    /**
     * <p>
     * The private key verification certificate. If <code>certificateMode</code>
     * is <code>SNI_ONLY</code>, the <code>verificationCertificate</code> field
     * must be empty. If <code>certificateMode</code> is <code>DEFAULT</code> or
     * not provided, the <code>verificationCertificate</code> field must not be
     * empty.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65536<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @return <p>
     *         The private key verification certificate. If
     *         <code>certificateMode</code> is <code>SNI_ONLY</code>, the
     *         <code>verificationCertificate</code> field must be empty. If
     *         <code>certificateMode</code> is <code>DEFAULT</code> or not
     *         provided, the <code>verificationCertificate</code> field must not
     *         be empty.
     *         </p>
     */
    public String getVerificationCertificate() {
        return verificationCertificate;
    }

    /**
     * <p>
     * The private key verification certificate. If <code>certificateMode</code>
     * is <code>SNI_ONLY</code>, the <code>verificationCertificate</code> field
     * must be empty. If <code>certificateMode</code> is <code>DEFAULT</code> or
     * not provided, the <code>verificationCertificate</code> field must not be
     * empty.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65536<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param verificationCertificate <p>
     *            The private key verification certificate. If
     *            <code>certificateMode</code> is <code>SNI_ONLY</code>, the
     *            <code>verificationCertificate</code> field must be empty. If
     *            <code>certificateMode</code> is <code>DEFAULT</code> or not
     *            provided, the <code>verificationCertificate</code> field must
     *            not be empty.
     *            </p>
     */
    public void setVerificationCertificate(String verificationCertificate) {
        this.verificationCertificate = verificationCertificate;
    }

    /**
     * <p>
     * The private key verification certificate. If <code>certificateMode</code>
     * is <code>SNI_ONLY</code>, the <code>verificationCertificate</code> field
     * must be empty. If <code>certificateMode</code> is <code>DEFAULT</code> or
     * not provided, the <code>verificationCertificate</code> field must not be
     * empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65536<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param verificationCertificate <p>
     *            The private key verification certificate. If
     *            <code>certificateMode</code> is <code>SNI_ONLY</code>, the
     *            <code>verificationCertificate</code> field must be empty. If
     *            <code>certificateMode</code> is <code>DEFAULT</code> or not
     *            provided, the <code>verificationCertificate</code> field must
     *            not be empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterCACertificateRequest withVerificationCertificate(String verificationCertificate) {
        this.verificationCertificate = verificationCertificate;
        return this;
    }

    /**
     * <p>
     * A boolean value that specifies if the CA certificate is set to active.
     * </p>
     * <p>
     * Valid values: <code>ACTIVE | INACTIVE</code>
     * </p>
     *
     * @return <p>
     *         A boolean value that specifies if the CA certificate is set to
     *         active.
     *         </p>
     *         <p>
     *         Valid values: <code>ACTIVE | INACTIVE</code>
     *         </p>
     */
    public Boolean isSetAsActive() {
        return setAsActive;
    }

    /**
     * <p>
     * A boolean value that specifies if the CA certificate is set to active.
     * </p>
     * <p>
     * Valid values: <code>ACTIVE | INACTIVE</code>
     * </p>
     *
     * @return <p>
     *         A boolean value that specifies if the CA certificate is set to
     *         active.
     *         </p>
     *         <p>
     *         Valid values: <code>ACTIVE | INACTIVE</code>
     *         </p>
     */
    public Boolean getSetAsActive() {
        return setAsActive;
    }

    /**
     * <p>
     * A boolean value that specifies if the CA certificate is set to active.
     * </p>
     * <p>
     * Valid values: <code>ACTIVE | INACTIVE</code>
     * </p>
     *
     * @param setAsActive <p>
     *            A boolean value that specifies if the CA certificate is set to
     *            active.
     *            </p>
     *            <p>
     *            Valid values: <code>ACTIVE | INACTIVE</code>
     *            </p>
     */
    public void setSetAsActive(Boolean setAsActive) {
        this.setAsActive = setAsActive;
    }

    /**
     * <p>
     * A boolean value that specifies if the CA certificate is set to active.
     * </p>
     * <p>
     * Valid values: <code>ACTIVE | INACTIVE</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param setAsActive <p>
     *            A boolean value that specifies if the CA certificate is set to
     *            active.
     *            </p>
     *            <p>
     *            Valid values: <code>ACTIVE | INACTIVE</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterCACertificateRequest withSetAsActive(Boolean setAsActive) {
        this.setAsActive = setAsActive;
        return this;
    }

    /**
     * <p>
     * Allows this CA certificate to be used for auto registration of device
     * certificates.
     * </p>
     *
     * @return <p>
     *         Allows this CA certificate to be used for auto registration of
     *         device certificates.
     *         </p>
     */
    public Boolean isAllowAutoRegistration() {
        return allowAutoRegistration;
    }

    /**
     * <p>
     * Allows this CA certificate to be used for auto registration of device
     * certificates.
     * </p>
     *
     * @return <p>
     *         Allows this CA certificate to be used for auto registration of
     *         device certificates.
     *         </p>
     */
    public Boolean getAllowAutoRegistration() {
        return allowAutoRegistration;
    }

    /**
     * <p>
     * Allows this CA certificate to be used for auto registration of device
     * certificates.
     * </p>
     *
     * @param allowAutoRegistration <p>
     *            Allows this CA certificate to be used for auto registration of
     *            device certificates.
     *            </p>
     */
    public void setAllowAutoRegistration(Boolean allowAutoRegistration) {
        this.allowAutoRegistration = allowAutoRegistration;
    }

    /**
     * <p>
     * Allows this CA certificate to be used for auto registration of device
     * certificates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowAutoRegistration <p>
     *            Allows this CA certificate to be used for auto registration of
     *            device certificates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterCACertificateRequest withAllowAutoRegistration(Boolean allowAutoRegistration) {
        this.allowAutoRegistration = allowAutoRegistration;
        return this;
    }

    /**
     * <p>
     * Information about the registration configuration.
     * </p>
     *
     * @return <p>
     *         Information about the registration configuration.
     *         </p>
     */
    public RegistrationConfig getRegistrationConfig() {
        return registrationConfig;
    }

    /**
     * <p>
     * Information about the registration configuration.
     * </p>
     *
     * @param registrationConfig <p>
     *            Information about the registration configuration.
     *            </p>
     */
    public void setRegistrationConfig(RegistrationConfig registrationConfig) {
        this.registrationConfig = registrationConfig;
    }

    /**
     * <p>
     * Information about the registration configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param registrationConfig <p>
     *            Information about the registration configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterCACertificateRequest withRegistrationConfig(RegistrationConfig registrationConfig) {
        this.registrationConfig = registrationConfig;
        return this;
    }

    /**
     * <p>
     * Metadata which can be used to manage the CA certificate.
     * </p>
     * <note>
     * <p>
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     * </p>
     * <p>
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     * </p>
     * <p>
     * For the cli-input-json file use format: "tags":
     * "key1=value1&amp;key2=value2..."
     * </p>
     * </note>
     *
     * @return <p>
     *         Metadata which can be used to manage the CA certificate.
     *         </p>
     *         <note>
     *         <p>
     *         For URI Request parameters use format:
     *         ...key1=value1&amp;key2=value2...
     *         </p>
     *         <p>
     *         For the CLI command-line parameter use format: &amp;&amp;tags
     *         "key1=value1&amp;key2=value2..."
     *         </p>
     *         <p>
     *         For the cli-input-json file use format: "tags":
     *         "key1=value1&amp;key2=value2..."
     *         </p>
     *         </note>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata which can be used to manage the CA certificate.
     * </p>
     * <note>
     * <p>
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     * </p>
     * <p>
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     * </p>
     * <p>
     * For the cli-input-json file use format: "tags":
     * "key1=value1&amp;key2=value2..."
     * </p>
     * </note>
     *
     * @param tags <p>
     *            Metadata which can be used to manage the CA certificate.
     *            </p>
     *            <note>
     *            <p>
     *            For URI Request parameters use format:
     *            ...key1=value1&amp;key2=value2...
     *            </p>
     *            <p>
     *            For the CLI command-line parameter use format: &amp;&amp;tags
     *            "key1=value1&amp;key2=value2..."
     *            </p>
     *            <p>
     *            For the cli-input-json file use format: "tags":
     *            "key1=value1&amp;key2=value2..."
     *            </p>
     *            </note>
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
     * Metadata which can be used to manage the CA certificate.
     * </p>
     * <note>
     * <p>
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     * </p>
     * <p>
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     * </p>
     * <p>
     * For the cli-input-json file use format: "tags":
     * "key1=value1&amp;key2=value2..."
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Metadata which can be used to manage the CA certificate.
     *            </p>
     *            <note>
     *            <p>
     *            For URI Request parameters use format:
     *            ...key1=value1&amp;key2=value2...
     *            </p>
     *            <p>
     *            For the CLI command-line parameter use format: &amp;&amp;tags
     *            "key1=value1&amp;key2=value2..."
     *            </p>
     *            <p>
     *            For the cli-input-json file use format: "tags":
     *            "key1=value1&amp;key2=value2..."
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterCACertificateRequest withTags(Tag... tags) {
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
     * Metadata which can be used to manage the CA certificate.
     * </p>
     * <note>
     * <p>
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     * </p>
     * <p>
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     * </p>
     * <p>
     * For the cli-input-json file use format: "tags":
     * "key1=value1&amp;key2=value2..."
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Metadata which can be used to manage the CA certificate.
     *            </p>
     *            <note>
     *            <p>
     *            For URI Request parameters use format:
     *            ...key1=value1&amp;key2=value2...
     *            </p>
     *            <p>
     *            For the CLI command-line parameter use format: &amp;&amp;tags
     *            "key1=value1&amp;key2=value2..."
     *            </p>
     *            <p>
     *            For the cli-input-json file use format: "tags":
     *            "key1=value1&amp;key2=value2..."
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterCACertificateRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Describes the certificate mode in which the Certificate Authority (CA)
     * will be registered. If the <code>verificationCertificate</code> field is
     * not provided, set <code>certificateMode</code> to be
     * <code>SNI_ONLY</code>. If the <code>verificationCertificate</code> field
     * is provided, set <code>certificateMode</code> to be <code>DEFAULT</code>.
     * When <code>certificateMode</code> is not provided, it defaults to
     * <code>DEFAULT</code>. All the device certificates that are registered
     * using this CA will be registered in the same certificate mode as the CA.
     * For more information about certificate mode for device certificates, see
     * <a href=
     * "https://docs.aws.amazon.com/iot/latest/apireference/API_CertificateDescription.html#iot-Type-CertificateDescription-certificateMode"
     * > certificate mode</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, SNI_ONLY
     *
     * @return <p>
     *         Describes the certificate mode in which the Certificate Authority
     *         (CA) will be registered. If the
     *         <code>verificationCertificate</code> field is not provided, set
     *         <code>certificateMode</code> to be <code>SNI_ONLY</code>. If the
     *         <code>verificationCertificate</code> field is provided, set
     *         <code>certificateMode</code> to be <code>DEFAULT</code>. When
     *         <code>certificateMode</code> is not provided, it defaults to
     *         <code>DEFAULT</code>. All the device certificates that are
     *         registered using this CA will be registered in the same
     *         certificate mode as the CA. For more information about
     *         certificate mode for device certificates, see <a href=
     *         "https://docs.aws.amazon.com/iot/latest/apireference/API_CertificateDescription.html#iot-Type-CertificateDescription-certificateMode"
     *         > certificate mode</a>.
     *         </p>
     * @see CertificateMode
     */
    public String getCertificateMode() {
        return certificateMode;
    }

    /**
     * <p>
     * Describes the certificate mode in which the Certificate Authority (CA)
     * will be registered. If the <code>verificationCertificate</code> field is
     * not provided, set <code>certificateMode</code> to be
     * <code>SNI_ONLY</code>. If the <code>verificationCertificate</code> field
     * is provided, set <code>certificateMode</code> to be <code>DEFAULT</code>.
     * When <code>certificateMode</code> is not provided, it defaults to
     * <code>DEFAULT</code>. All the device certificates that are registered
     * using this CA will be registered in the same certificate mode as the CA.
     * For more information about certificate mode for device certificates, see
     * <a href=
     * "https://docs.aws.amazon.com/iot/latest/apireference/API_CertificateDescription.html#iot-Type-CertificateDescription-certificateMode"
     * > certificate mode</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, SNI_ONLY
     *
     * @param certificateMode <p>
     *            Describes the certificate mode in which the Certificate
     *            Authority (CA) will be registered. If the
     *            <code>verificationCertificate</code> field is not provided,
     *            set <code>certificateMode</code> to be <code>SNI_ONLY</code>.
     *            If the <code>verificationCertificate</code> field is provided,
     *            set <code>certificateMode</code> to be <code>DEFAULT</code>.
     *            When <code>certificateMode</code> is not provided, it defaults
     *            to <code>DEFAULT</code>. All the device certificates that are
     *            registered using this CA will be registered in the same
     *            certificate mode as the CA. For more information about
     *            certificate mode for device certificates, see <a href=
     *            "https://docs.aws.amazon.com/iot/latest/apireference/API_CertificateDescription.html#iot-Type-CertificateDescription-certificateMode"
     *            > certificate mode</a>.
     *            </p>
     * @see CertificateMode
     */
    public void setCertificateMode(String certificateMode) {
        this.certificateMode = certificateMode;
    }

    /**
     * <p>
     * Describes the certificate mode in which the Certificate Authority (CA)
     * will be registered. If the <code>verificationCertificate</code> field is
     * not provided, set <code>certificateMode</code> to be
     * <code>SNI_ONLY</code>. If the <code>verificationCertificate</code> field
     * is provided, set <code>certificateMode</code> to be <code>DEFAULT</code>.
     * When <code>certificateMode</code> is not provided, it defaults to
     * <code>DEFAULT</code>. All the device certificates that are registered
     * using this CA will be registered in the same certificate mode as the CA.
     * For more information about certificate mode for device certificates, see
     * <a href=
     * "https://docs.aws.amazon.com/iot/latest/apireference/API_CertificateDescription.html#iot-Type-CertificateDescription-certificateMode"
     * > certificate mode</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, SNI_ONLY
     *
     * @param certificateMode <p>
     *            Describes the certificate mode in which the Certificate
     *            Authority (CA) will be registered. If the
     *            <code>verificationCertificate</code> field is not provided,
     *            set <code>certificateMode</code> to be <code>SNI_ONLY</code>.
     *            If the <code>verificationCertificate</code> field is provided,
     *            set <code>certificateMode</code> to be <code>DEFAULT</code>.
     *            When <code>certificateMode</code> is not provided, it defaults
     *            to <code>DEFAULT</code>. All the device certificates that are
     *            registered using this CA will be registered in the same
     *            certificate mode as the CA. For more information about
     *            certificate mode for device certificates, see <a href=
     *            "https://docs.aws.amazon.com/iot/latest/apireference/API_CertificateDescription.html#iot-Type-CertificateDescription-certificateMode"
     *            > certificate mode</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CertificateMode
     */
    public RegisterCACertificateRequest withCertificateMode(String certificateMode) {
        this.certificateMode = certificateMode;
        return this;
    }

    /**
     * <p>
     * Describes the certificate mode in which the Certificate Authority (CA)
     * will be registered. If the <code>verificationCertificate</code> field is
     * not provided, set <code>certificateMode</code> to be
     * <code>SNI_ONLY</code>. If the <code>verificationCertificate</code> field
     * is provided, set <code>certificateMode</code> to be <code>DEFAULT</code>.
     * When <code>certificateMode</code> is not provided, it defaults to
     * <code>DEFAULT</code>. All the device certificates that are registered
     * using this CA will be registered in the same certificate mode as the CA.
     * For more information about certificate mode for device certificates, see
     * <a href=
     * "https://docs.aws.amazon.com/iot/latest/apireference/API_CertificateDescription.html#iot-Type-CertificateDescription-certificateMode"
     * > certificate mode</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, SNI_ONLY
     *
     * @param certificateMode <p>
     *            Describes the certificate mode in which the Certificate
     *            Authority (CA) will be registered. If the
     *            <code>verificationCertificate</code> field is not provided,
     *            set <code>certificateMode</code> to be <code>SNI_ONLY</code>.
     *            If the <code>verificationCertificate</code> field is provided,
     *            set <code>certificateMode</code> to be <code>DEFAULT</code>.
     *            When <code>certificateMode</code> is not provided, it defaults
     *            to <code>DEFAULT</code>. All the device certificates that are
     *            registered using this CA will be registered in the same
     *            certificate mode as the CA. For more information about
     *            certificate mode for device certificates, see <a href=
     *            "https://docs.aws.amazon.com/iot/latest/apireference/API_CertificateDescription.html#iot-Type-CertificateDescription-certificateMode"
     *            > certificate mode</a>.
     *            </p>
     * @see CertificateMode
     */
    public void setCertificateMode(CertificateMode certificateMode) {
        this.certificateMode = certificateMode.toString();
    }

    /**
     * <p>
     * Describes the certificate mode in which the Certificate Authority (CA)
     * will be registered. If the <code>verificationCertificate</code> field is
     * not provided, set <code>certificateMode</code> to be
     * <code>SNI_ONLY</code>. If the <code>verificationCertificate</code> field
     * is provided, set <code>certificateMode</code> to be <code>DEFAULT</code>.
     * When <code>certificateMode</code> is not provided, it defaults to
     * <code>DEFAULT</code>. All the device certificates that are registered
     * using this CA will be registered in the same certificate mode as the CA.
     * For more information about certificate mode for device certificates, see
     * <a href=
     * "https://docs.aws.amazon.com/iot/latest/apireference/API_CertificateDescription.html#iot-Type-CertificateDescription-certificateMode"
     * > certificate mode</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, SNI_ONLY
     *
     * @param certificateMode <p>
     *            Describes the certificate mode in which the Certificate
     *            Authority (CA) will be registered. If the
     *            <code>verificationCertificate</code> field is not provided,
     *            set <code>certificateMode</code> to be <code>SNI_ONLY</code>.
     *            If the <code>verificationCertificate</code> field is provided,
     *            set <code>certificateMode</code> to be <code>DEFAULT</code>.
     *            When <code>certificateMode</code> is not provided, it defaults
     *            to <code>DEFAULT</code>. All the device certificates that are
     *            registered using this CA will be registered in the same
     *            certificate mode as the CA. For more information about
     *            certificate mode for device certificates, see <a href=
     *            "https://docs.aws.amazon.com/iot/latest/apireference/API_CertificateDescription.html#iot-Type-CertificateDescription-certificateMode"
     *            > certificate mode</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CertificateMode
     */
    public RegisterCACertificateRequest withCertificateMode(CertificateMode certificateMode) {
        this.certificateMode = certificateMode.toString();
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
        if (getCaCertificate() != null)
            sb.append("caCertificate: " + getCaCertificate() + ",");
        if (getVerificationCertificate() != null)
            sb.append("verificationCertificate: " + getVerificationCertificate() + ",");
        if (getSetAsActive() != null)
            sb.append("setAsActive: " + getSetAsActive() + ",");
        if (getAllowAutoRegistration() != null)
            sb.append("allowAutoRegistration: " + getAllowAutoRegistration() + ",");
        if (getRegistrationConfig() != null)
            sb.append("registrationConfig: " + getRegistrationConfig() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getCertificateMode() != null)
            sb.append("certificateMode: " + getCertificateMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCaCertificate() == null) ? 0 : getCaCertificate().hashCode());
        hashCode = prime
                * hashCode
                + ((getVerificationCertificate() == null) ? 0 : getVerificationCertificate()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getSetAsActive() == null) ? 0 : getSetAsActive().hashCode());
        hashCode = prime
                * hashCode
                + ((getAllowAutoRegistration() == null) ? 0 : getAllowAutoRegistration().hashCode());
        hashCode = prime * hashCode
                + ((getRegistrationConfig() == null) ? 0 : getRegistrationConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getCertificateMode() == null) ? 0 : getCertificateMode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterCACertificateRequest == false)
            return false;
        RegisterCACertificateRequest other = (RegisterCACertificateRequest) obj;

        if (other.getCaCertificate() == null ^ this.getCaCertificate() == null)
            return false;
        if (other.getCaCertificate() != null
                && other.getCaCertificate().equals(this.getCaCertificate()) == false)
            return false;
        if (other.getVerificationCertificate() == null ^ this.getVerificationCertificate() == null)
            return false;
        if (other.getVerificationCertificate() != null
                && other.getVerificationCertificate().equals(this.getVerificationCertificate()) == false)
            return false;
        if (other.getSetAsActive() == null ^ this.getSetAsActive() == null)
            return false;
        if (other.getSetAsActive() != null
                && other.getSetAsActive().equals(this.getSetAsActive()) == false)
            return false;
        if (other.getAllowAutoRegistration() == null ^ this.getAllowAutoRegistration() == null)
            return false;
        if (other.getAllowAutoRegistration() != null
                && other.getAllowAutoRegistration().equals(this.getAllowAutoRegistration()) == false)
            return false;
        if (other.getRegistrationConfig() == null ^ this.getRegistrationConfig() == null)
            return false;
        if (other.getRegistrationConfig() != null
                && other.getRegistrationConfig().equals(this.getRegistrationConfig()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getCertificateMode() == null ^ this.getCertificateMode() == null)
            return false;
        if (other.getCertificateMode() != null
                && other.getCertificateMode().equals(this.getCertificateMode()) == false)
            return false;
        return true;
    }
}
