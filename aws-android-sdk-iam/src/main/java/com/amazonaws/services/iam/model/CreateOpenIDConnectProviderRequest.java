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

package com.amazonaws.services.iam.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an IAM entity to describe an identity provider (IdP) that supports <a
 * href="http://openid.net/connect/">OpenID Connect (OIDC)</a>.
 * </p>
 * <p>
 * The OIDC provider that you create with this operation can be used as a
 * principal in a role's trust policy. Such a policy establishes a trust
 * relationship between AWS and the OIDC provider.
 * </p>
 * <p>
 * When you create the IAM OIDC provider, you specify the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The URL of the OIDC identity provider (IdP) to trust
 * </p>
 * </li>
 * <li>
 * <p>
 * A list of client IDs (also known as audiences) that identify the application
 * or applications that are allowed to authenticate using the OIDC provider
 * </p>
 * </li>
 * <li>
 * <p>
 * A list of thumbprints of one or more server certificates that the IdP uses
 * </p>
 * </li>
 * </ul>
 * <p>
 * You get all of this information from the OIDC IdP that you want to use to
 * access AWS.
 * </p>
 * <note>
 * <p>
 * The trust for the OIDC provider is derived from the IAM provider that this
 * operation creates. Therefore, it is best to limit access to the
 * <a>CreateOpenIDConnectProvider</a> operation to highly privileged users.
 * </p>
 * </note>
 */
public class CreateOpenIDConnectProviderRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The URL of the identity provider. The URL must begin with
     * <code>https://</code> and should correspond to the <code>iss</code> claim
     * in the provider's OpenID Connect ID tokens. Per the OIDC standard, path
     * components are allowed but query parameters are not. Typically the URL
     * consists of only a hostname, like <code>https://server.example.org</code>
     * or <code>https://example.com</code>.
     * </p>
     * <p>
     * You cannot register the same provider multiple times in a single AWS
     * account. If you try to submit a URL that has already been used for an
     * OpenID Connect provider in the AWS account, you will get an error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String url;

    /**
     * <p>
     * A list of client IDs (also known as audiences). When a mobile or web app
     * registers with an OpenID Connect provider, they establish a value that
     * identifies the application. (This is the value that's sent as the
     * <code>client_id</code> parameter on OAuth requests.)
     * </p>
     * <p>
     * You can register multiple client IDs with the same provider. For example,
     * you might have multiple applications that use the same OIDC provider. You
     * cannot register more than 100 client IDs with a single IAM OIDC provider.
     * </p>
     * <p>
     * There is no defined format for a client ID. The
     * <code>CreateOpenIDConnectProviderRequest</code> operation accepts client
     * IDs up to 255 characters long.
     * </p>
     */
    private java.util.List<String> clientIDList;

    /**
     * <p>
     * A list of server certificate thumbprints for the OpenID Connect (OIDC)
     * identity provider's server certificates. Typically this list includes
     * only one entry. However, IAM lets you have up to five thumbprints for an
     * OIDC provider. This lets you maintain multiple thumbprints if the
     * identity provider is rotating certificates.
     * </p>
     * <p>
     * The server certificate thumbprint is the hex-encoded SHA-1 hash value of
     * the X.509 certificate used by the domain where the OpenID Connect
     * provider makes its keys available. It is always a 40-character string.
     * </p>
     * <p>
     * You must provide at least one thumbprint when creating an IAM OIDC
     * provider. For example, assume that the OIDC provider is
     * <code>server.example.com</code> and the provider stores its keys at
     * https://keys.server.example.com/openid-connect. In that case, the
     * thumbprint string would be the hex-encoded SHA-1 hash value of the
     * certificate used by https://keys.server.example.com.
     * </p>
     * <p>
     * For more information about obtaining the OIDC provider's thumbprint, see
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/identity-providers-oidc-obtain-thumbprint.html"
     * >Obtaining the Thumbprint for an OpenID Connect Provider</a> in the
     * <i>IAM User Guide</i>.
     * </p>
     */
    private java.util.List<String> thumbprintList;

    /**
     * <p>
     * The URL of the identity provider. The URL must begin with
     * <code>https://</code> and should correspond to the <code>iss</code> claim
     * in the provider's OpenID Connect ID tokens. Per the OIDC standard, path
     * components are allowed but query parameters are not. Typically the URL
     * consists of only a hostname, like <code>https://server.example.org</code>
     * or <code>https://example.com</code>.
     * </p>
     * <p>
     * You cannot register the same provider multiple times in a single AWS
     * account. If you try to submit a URL that has already been used for an
     * OpenID Connect provider in the AWS account, you will get an error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The URL of the identity provider. The URL must begin with
     *         <code>https://</code> and should correspond to the
     *         <code>iss</code> claim in the provider's OpenID Connect ID
     *         tokens. Per the OIDC standard, path components are allowed but
     *         query parameters are not. Typically the URL consists of only a
     *         hostname, like <code>https://server.example.org</code> or
     *         <code>https://example.com</code>.
     *         </p>
     *         <p>
     *         You cannot register the same provider multiple times in a single
     *         AWS account. If you try to submit a URL that has already been
     *         used for an OpenID Connect provider in the AWS account, you will
     *         get an error.
     *         </p>
     */
    public String getUrl() {
        return url;
    }

    /**
     * <p>
     * The URL of the identity provider. The URL must begin with
     * <code>https://</code> and should correspond to the <code>iss</code> claim
     * in the provider's OpenID Connect ID tokens. Per the OIDC standard, path
     * components are allowed but query parameters are not. Typically the URL
     * consists of only a hostname, like <code>https://server.example.org</code>
     * or <code>https://example.com</code>.
     * </p>
     * <p>
     * You cannot register the same provider multiple times in a single AWS
     * account. If you try to submit a URL that has already been used for an
     * OpenID Connect provider in the AWS account, you will get an error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param url <p>
     *            The URL of the identity provider. The URL must begin with
     *            <code>https://</code> and should correspond to the
     *            <code>iss</code> claim in the provider's OpenID Connect ID
     *            tokens. Per the OIDC standard, path components are allowed but
     *            query parameters are not. Typically the URL consists of only a
     *            hostname, like <code>https://server.example.org</code> or
     *            <code>https://example.com</code>.
     *            </p>
     *            <p>
     *            You cannot register the same provider multiple times in a
     *            single AWS account. If you try to submit a URL that has
     *            already been used for an OpenID Connect provider in the AWS
     *            account, you will get an error.
     *            </p>
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL of the identity provider. The URL must begin with
     * <code>https://</code> and should correspond to the <code>iss</code> claim
     * in the provider's OpenID Connect ID tokens. Per the OIDC standard, path
     * components are allowed but query parameters are not. Typically the URL
     * consists of only a hostname, like <code>https://server.example.org</code>
     * or <code>https://example.com</code>.
     * </p>
     * <p>
     * You cannot register the same provider multiple times in a single AWS
     * account. If you try to submit a URL that has already been used for an
     * OpenID Connect provider in the AWS account, you will get an error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param url <p>
     *            The URL of the identity provider. The URL must begin with
     *            <code>https://</code> and should correspond to the
     *            <code>iss</code> claim in the provider's OpenID Connect ID
     *            tokens. Per the OIDC standard, path components are allowed but
     *            query parameters are not. Typically the URL consists of only a
     *            hostname, like <code>https://server.example.org</code> or
     *            <code>https://example.com</code>.
     *            </p>
     *            <p>
     *            You cannot register the same provider multiple times in a
     *            single AWS account. If you try to submit a URL that has
     *            already been used for an OpenID Connect provider in the AWS
     *            account, you will get an error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateOpenIDConnectProviderRequest withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * <p>
     * A list of client IDs (also known as audiences). When a mobile or web app
     * registers with an OpenID Connect provider, they establish a value that
     * identifies the application. (This is the value that's sent as the
     * <code>client_id</code> parameter on OAuth requests.)
     * </p>
     * <p>
     * You can register multiple client IDs with the same provider. For example,
     * you might have multiple applications that use the same OIDC provider. You
     * cannot register more than 100 client IDs with a single IAM OIDC provider.
     * </p>
     * <p>
     * There is no defined format for a client ID. The
     * <code>CreateOpenIDConnectProviderRequest</code> operation accepts client
     * IDs up to 255 characters long.
     * </p>
     *
     * @return <p>
     *         A list of client IDs (also known as audiences). When a mobile or
     *         web app registers with an OpenID Connect provider, they establish
     *         a value that identifies the application. (This is the value
     *         that's sent as the <code>client_id</code> parameter on OAuth
     *         requests.)
     *         </p>
     *         <p>
     *         You can register multiple client IDs with the same provider. For
     *         example, you might have multiple applications that use the same
     *         OIDC provider. You cannot register more than 100 client IDs with
     *         a single IAM OIDC provider.
     *         </p>
     *         <p>
     *         There is no defined format for a client ID. The
     *         <code>CreateOpenIDConnectProviderRequest</code> operation accepts
     *         client IDs up to 255 characters long.
     *         </p>
     */
    public java.util.List<String> getClientIDList() {
        return clientIDList;
    }

    /**
     * <p>
     * A list of client IDs (also known as audiences). When a mobile or web app
     * registers with an OpenID Connect provider, they establish a value that
     * identifies the application. (This is the value that's sent as the
     * <code>client_id</code> parameter on OAuth requests.)
     * </p>
     * <p>
     * You can register multiple client IDs with the same provider. For example,
     * you might have multiple applications that use the same OIDC provider. You
     * cannot register more than 100 client IDs with a single IAM OIDC provider.
     * </p>
     * <p>
     * There is no defined format for a client ID. The
     * <code>CreateOpenIDConnectProviderRequest</code> operation accepts client
     * IDs up to 255 characters long.
     * </p>
     *
     * @param clientIDList <p>
     *            A list of client IDs (also known as audiences). When a mobile
     *            or web app registers with an OpenID Connect provider, they
     *            establish a value that identifies the application. (This is
     *            the value that's sent as the <code>client_id</code> parameter
     *            on OAuth requests.)
     *            </p>
     *            <p>
     *            You can register multiple client IDs with the same provider.
     *            For example, you might have multiple applications that use the
     *            same OIDC provider. You cannot register more than 100 client
     *            IDs with a single IAM OIDC provider.
     *            </p>
     *            <p>
     *            There is no defined format for a client ID. The
     *            <code>CreateOpenIDConnectProviderRequest</code> operation
     *            accepts client IDs up to 255 characters long.
     *            </p>
     */
    public void setClientIDList(java.util.Collection<String> clientIDList) {
        if (clientIDList == null) {
            this.clientIDList = null;
            return;
        }

        this.clientIDList = new java.util.ArrayList<String>(clientIDList);
    }

    /**
     * <p>
     * A list of client IDs (also known as audiences). When a mobile or web app
     * registers with an OpenID Connect provider, they establish a value that
     * identifies the application. (This is the value that's sent as the
     * <code>client_id</code> parameter on OAuth requests.)
     * </p>
     * <p>
     * You can register multiple client IDs with the same provider. For example,
     * you might have multiple applications that use the same OIDC provider. You
     * cannot register more than 100 client IDs with a single IAM OIDC provider.
     * </p>
     * <p>
     * There is no defined format for a client ID. The
     * <code>CreateOpenIDConnectProviderRequest</code> operation accepts client
     * IDs up to 255 characters long.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientIDList <p>
     *            A list of client IDs (also known as audiences). When a mobile
     *            or web app registers with an OpenID Connect provider, they
     *            establish a value that identifies the application. (This is
     *            the value that's sent as the <code>client_id</code> parameter
     *            on OAuth requests.)
     *            </p>
     *            <p>
     *            You can register multiple client IDs with the same provider.
     *            For example, you might have multiple applications that use the
     *            same OIDC provider. You cannot register more than 100 client
     *            IDs with a single IAM OIDC provider.
     *            </p>
     *            <p>
     *            There is no defined format for a client ID. The
     *            <code>CreateOpenIDConnectProviderRequest</code> operation
     *            accepts client IDs up to 255 characters long.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateOpenIDConnectProviderRequest withClientIDList(String... clientIDList) {
        if (getClientIDList() == null) {
            this.clientIDList = new java.util.ArrayList<String>(clientIDList.length);
        }
        for (String value : clientIDList) {
            this.clientIDList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of client IDs (also known as audiences). When a mobile or web app
     * registers with an OpenID Connect provider, they establish a value that
     * identifies the application. (This is the value that's sent as the
     * <code>client_id</code> parameter on OAuth requests.)
     * </p>
     * <p>
     * You can register multiple client IDs with the same provider. For example,
     * you might have multiple applications that use the same OIDC provider. You
     * cannot register more than 100 client IDs with a single IAM OIDC provider.
     * </p>
     * <p>
     * There is no defined format for a client ID. The
     * <code>CreateOpenIDConnectProviderRequest</code> operation accepts client
     * IDs up to 255 characters long.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientIDList <p>
     *            A list of client IDs (also known as audiences). When a mobile
     *            or web app registers with an OpenID Connect provider, they
     *            establish a value that identifies the application. (This is
     *            the value that's sent as the <code>client_id</code> parameter
     *            on OAuth requests.)
     *            </p>
     *            <p>
     *            You can register multiple client IDs with the same provider.
     *            For example, you might have multiple applications that use the
     *            same OIDC provider. You cannot register more than 100 client
     *            IDs with a single IAM OIDC provider.
     *            </p>
     *            <p>
     *            There is no defined format for a client ID. The
     *            <code>CreateOpenIDConnectProviderRequest</code> operation
     *            accepts client IDs up to 255 characters long.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateOpenIDConnectProviderRequest withClientIDList(
            java.util.Collection<String> clientIDList) {
        setClientIDList(clientIDList);
        return this;
    }

    /**
     * <p>
     * A list of server certificate thumbprints for the OpenID Connect (OIDC)
     * identity provider's server certificates. Typically this list includes
     * only one entry. However, IAM lets you have up to five thumbprints for an
     * OIDC provider. This lets you maintain multiple thumbprints if the
     * identity provider is rotating certificates.
     * </p>
     * <p>
     * The server certificate thumbprint is the hex-encoded SHA-1 hash value of
     * the X.509 certificate used by the domain where the OpenID Connect
     * provider makes its keys available. It is always a 40-character string.
     * </p>
     * <p>
     * You must provide at least one thumbprint when creating an IAM OIDC
     * provider. For example, assume that the OIDC provider is
     * <code>server.example.com</code> and the provider stores its keys at
     * https://keys.server.example.com/openid-connect. In that case, the
     * thumbprint string would be the hex-encoded SHA-1 hash value of the
     * certificate used by https://keys.server.example.com.
     * </p>
     * <p>
     * For more information about obtaining the OIDC provider's thumbprint, see
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/identity-providers-oidc-obtain-thumbprint.html"
     * >Obtaining the Thumbprint for an OpenID Connect Provider</a> in the
     * <i>IAM User Guide</i>.
     * </p>
     *
     * @return <p>
     *         A list of server certificate thumbprints for the OpenID Connect
     *         (OIDC) identity provider's server certificates. Typically this
     *         list includes only one entry. However, IAM lets you have up to
     *         five thumbprints for an OIDC provider. This lets you maintain
     *         multiple thumbprints if the identity provider is rotating
     *         certificates.
     *         </p>
     *         <p>
     *         The server certificate thumbprint is the hex-encoded SHA-1 hash
     *         value of the X.509 certificate used by the domain where the
     *         OpenID Connect provider makes its keys available. It is always a
     *         40-character string.
     *         </p>
     *         <p>
     *         You must provide at least one thumbprint when creating an IAM
     *         OIDC provider. For example, assume that the OIDC provider is
     *         <code>server.example.com</code> and the provider stores its keys
     *         at https://keys.server.example.com/openid-connect. In that case,
     *         the thumbprint string would be the hex-encoded SHA-1 hash value
     *         of the certificate used by https://keys.server.example.com.
     *         </p>
     *         <p>
     *         For more information about obtaining the OIDC provider's
     *         thumbprint, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/identity-providers-oidc-obtain-thumbprint.html"
     *         >Obtaining the Thumbprint for an OpenID Connect Provider</a> in
     *         the <i>IAM User Guide</i>.
     *         </p>
     */
    public java.util.List<String> getThumbprintList() {
        return thumbprintList;
    }

    /**
     * <p>
     * A list of server certificate thumbprints for the OpenID Connect (OIDC)
     * identity provider's server certificates. Typically this list includes
     * only one entry. However, IAM lets you have up to five thumbprints for an
     * OIDC provider. This lets you maintain multiple thumbprints if the
     * identity provider is rotating certificates.
     * </p>
     * <p>
     * The server certificate thumbprint is the hex-encoded SHA-1 hash value of
     * the X.509 certificate used by the domain where the OpenID Connect
     * provider makes its keys available. It is always a 40-character string.
     * </p>
     * <p>
     * You must provide at least one thumbprint when creating an IAM OIDC
     * provider. For example, assume that the OIDC provider is
     * <code>server.example.com</code> and the provider stores its keys at
     * https://keys.server.example.com/openid-connect. In that case, the
     * thumbprint string would be the hex-encoded SHA-1 hash value of the
     * certificate used by https://keys.server.example.com.
     * </p>
     * <p>
     * For more information about obtaining the OIDC provider's thumbprint, see
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/identity-providers-oidc-obtain-thumbprint.html"
     * >Obtaining the Thumbprint for an OpenID Connect Provider</a> in the
     * <i>IAM User Guide</i>.
     * </p>
     *
     * @param thumbprintList <p>
     *            A list of server certificate thumbprints for the OpenID
     *            Connect (OIDC) identity provider's server certificates.
     *            Typically this list includes only one entry. However, IAM lets
     *            you have up to five thumbprints for an OIDC provider. This
     *            lets you maintain multiple thumbprints if the identity
     *            provider is rotating certificates.
     *            </p>
     *            <p>
     *            The server certificate thumbprint is the hex-encoded SHA-1
     *            hash value of the X.509 certificate used by the domain where
     *            the OpenID Connect provider makes its keys available. It is
     *            always a 40-character string.
     *            </p>
     *            <p>
     *            You must provide at least one thumbprint when creating an IAM
     *            OIDC provider. For example, assume that the OIDC provider is
     *            <code>server.example.com</code> and the provider stores its
     *            keys at https://keys.server.example.com/openid-connect. In
     *            that case, the thumbprint string would be the hex-encoded
     *            SHA-1 hash value of the certificate used by
     *            https://keys.server.example.com.
     *            </p>
     *            <p>
     *            For more information about obtaining the OIDC provider's
     *            thumbprint, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/identity-providers-oidc-obtain-thumbprint.html"
     *            >Obtaining the Thumbprint for an OpenID Connect Provider</a>
     *            in the <i>IAM User Guide</i>.
     *            </p>
     */
    public void setThumbprintList(java.util.Collection<String> thumbprintList) {
        if (thumbprintList == null) {
            this.thumbprintList = null;
            return;
        }

        this.thumbprintList = new java.util.ArrayList<String>(thumbprintList);
    }

    /**
     * <p>
     * A list of server certificate thumbprints for the OpenID Connect (OIDC)
     * identity provider's server certificates. Typically this list includes
     * only one entry. However, IAM lets you have up to five thumbprints for an
     * OIDC provider. This lets you maintain multiple thumbprints if the
     * identity provider is rotating certificates.
     * </p>
     * <p>
     * The server certificate thumbprint is the hex-encoded SHA-1 hash value of
     * the X.509 certificate used by the domain where the OpenID Connect
     * provider makes its keys available. It is always a 40-character string.
     * </p>
     * <p>
     * You must provide at least one thumbprint when creating an IAM OIDC
     * provider. For example, assume that the OIDC provider is
     * <code>server.example.com</code> and the provider stores its keys at
     * https://keys.server.example.com/openid-connect. In that case, the
     * thumbprint string would be the hex-encoded SHA-1 hash value of the
     * certificate used by https://keys.server.example.com.
     * </p>
     * <p>
     * For more information about obtaining the OIDC provider's thumbprint, see
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/identity-providers-oidc-obtain-thumbprint.html"
     * >Obtaining the Thumbprint for an OpenID Connect Provider</a> in the
     * <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param thumbprintList <p>
     *            A list of server certificate thumbprints for the OpenID
     *            Connect (OIDC) identity provider's server certificates.
     *            Typically this list includes only one entry. However, IAM lets
     *            you have up to five thumbprints for an OIDC provider. This
     *            lets you maintain multiple thumbprints if the identity
     *            provider is rotating certificates.
     *            </p>
     *            <p>
     *            The server certificate thumbprint is the hex-encoded SHA-1
     *            hash value of the X.509 certificate used by the domain where
     *            the OpenID Connect provider makes its keys available. It is
     *            always a 40-character string.
     *            </p>
     *            <p>
     *            You must provide at least one thumbprint when creating an IAM
     *            OIDC provider. For example, assume that the OIDC provider is
     *            <code>server.example.com</code> and the provider stores its
     *            keys at https://keys.server.example.com/openid-connect. In
     *            that case, the thumbprint string would be the hex-encoded
     *            SHA-1 hash value of the certificate used by
     *            https://keys.server.example.com.
     *            </p>
     *            <p>
     *            For more information about obtaining the OIDC provider's
     *            thumbprint, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/identity-providers-oidc-obtain-thumbprint.html"
     *            >Obtaining the Thumbprint for an OpenID Connect Provider</a>
     *            in the <i>IAM User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateOpenIDConnectProviderRequest withThumbprintList(String... thumbprintList) {
        if (getThumbprintList() == null) {
            this.thumbprintList = new java.util.ArrayList<String>(thumbprintList.length);
        }
        for (String value : thumbprintList) {
            this.thumbprintList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of server certificate thumbprints for the OpenID Connect (OIDC)
     * identity provider's server certificates. Typically this list includes
     * only one entry. However, IAM lets you have up to five thumbprints for an
     * OIDC provider. This lets you maintain multiple thumbprints if the
     * identity provider is rotating certificates.
     * </p>
     * <p>
     * The server certificate thumbprint is the hex-encoded SHA-1 hash value of
     * the X.509 certificate used by the domain where the OpenID Connect
     * provider makes its keys available. It is always a 40-character string.
     * </p>
     * <p>
     * You must provide at least one thumbprint when creating an IAM OIDC
     * provider. For example, assume that the OIDC provider is
     * <code>server.example.com</code> and the provider stores its keys at
     * https://keys.server.example.com/openid-connect. In that case, the
     * thumbprint string would be the hex-encoded SHA-1 hash value of the
     * certificate used by https://keys.server.example.com.
     * </p>
     * <p>
     * For more information about obtaining the OIDC provider's thumbprint, see
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/identity-providers-oidc-obtain-thumbprint.html"
     * >Obtaining the Thumbprint for an OpenID Connect Provider</a> in the
     * <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param thumbprintList <p>
     *            A list of server certificate thumbprints for the OpenID
     *            Connect (OIDC) identity provider's server certificates.
     *            Typically this list includes only one entry. However, IAM lets
     *            you have up to five thumbprints for an OIDC provider. This
     *            lets you maintain multiple thumbprints if the identity
     *            provider is rotating certificates.
     *            </p>
     *            <p>
     *            The server certificate thumbprint is the hex-encoded SHA-1
     *            hash value of the X.509 certificate used by the domain where
     *            the OpenID Connect provider makes its keys available. It is
     *            always a 40-character string.
     *            </p>
     *            <p>
     *            You must provide at least one thumbprint when creating an IAM
     *            OIDC provider. For example, assume that the OIDC provider is
     *            <code>server.example.com</code> and the provider stores its
     *            keys at https://keys.server.example.com/openid-connect. In
     *            that case, the thumbprint string would be the hex-encoded
     *            SHA-1 hash value of the certificate used by
     *            https://keys.server.example.com.
     *            </p>
     *            <p>
     *            For more information about obtaining the OIDC provider's
     *            thumbprint, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/identity-providers-oidc-obtain-thumbprint.html"
     *            >Obtaining the Thumbprint for an OpenID Connect Provider</a>
     *            in the <i>IAM User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateOpenIDConnectProviderRequest withThumbprintList(
            java.util.Collection<String> thumbprintList) {
        setThumbprintList(thumbprintList);
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
        if (getUrl() != null)
            sb.append("Url: " + getUrl() + ",");
        if (getClientIDList() != null)
            sb.append("ClientIDList: " + getClientIDList() + ",");
        if (getThumbprintList() != null)
            sb.append("ThumbprintList: " + getThumbprintList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode
                + ((getClientIDList() == null) ? 0 : getClientIDList().hashCode());
        hashCode = prime * hashCode
                + ((getThumbprintList() == null) ? 0 : getThumbprintList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateOpenIDConnectProviderRequest == false)
            return false;
        CreateOpenIDConnectProviderRequest other = (CreateOpenIDConnectProviderRequest) obj;

        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getClientIDList() == null ^ this.getClientIDList() == null)
            return false;
        if (other.getClientIDList() != null
                && other.getClientIDList().equals(this.getClientIDList()) == false)
            return false;
        if (other.getThumbprintList() == null ^ this.getThumbprintList() == null)
            return false;
        if (other.getThumbprintList() != null
                && other.getThumbprintList().equals(this.getThumbprintList()) == false)
            return false;
        return true;
    }
}
