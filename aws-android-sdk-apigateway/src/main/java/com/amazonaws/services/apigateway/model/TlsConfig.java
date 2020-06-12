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

package com.amazonaws.services.apigateway.model;

import java.io.Serializable;

public class TlsConfig implements Serializable {
    /**
     * <p>
     * Specifies whether or not API Gateway skips verification that the
     * certificate for an integration endpoint is issued by a <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-supported-certificate-authorities-for-http-endpoints.html"
     * >supported certificate authority</a>. This isn’t recommended, but it
     * enables you to use certificates that are signed by private certificate
     * authorities, or certificates that are self-signed. If enabled, API
     * Gateway still performs basic certificate validation, which includes
     * checking the certificate's expiration date, hostname, and presence of a
     * root certificate authority. Supported only for <code>HTTP</code> and
     * <code>HTTP_PROXY</code> integrations.
     * </p>
     */
    private Boolean insecureSkipVerification;

    /**
     * <p>
     * Specifies whether or not API Gateway skips verification that the
     * certificate for an integration endpoint is issued by a <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-supported-certificate-authorities-for-http-endpoints.html"
     * >supported certificate authority</a>. This isn’t recommended, but it
     * enables you to use certificates that are signed by private certificate
     * authorities, or certificates that are self-signed. If enabled, API
     * Gateway still performs basic certificate validation, which includes
     * checking the certificate's expiration date, hostname, and presence of a
     * root certificate authority. Supported only for <code>HTTP</code> and
     * <code>HTTP_PROXY</code> integrations.
     * </p>
     *
     * @return <p>
     *         Specifies whether or not API Gateway skips verification that the
     *         certificate for an integration endpoint is issued by a <a href=
     *         "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-supported-certificate-authorities-for-http-endpoints.html"
     *         >supported certificate authority</a>. This isn’t recommended, but
     *         it enables you to use certificates that are signed by private
     *         certificate authorities, or certificates that are self-signed. If
     *         enabled, API Gateway still performs basic certificate validation,
     *         which includes checking the certificate's expiration date,
     *         hostname, and presence of a root certificate authority. Supported
     *         only for <code>HTTP</code> and <code>HTTP_PROXY</code>
     *         integrations.
     *         </p>
     */
    public Boolean isInsecureSkipVerification() {
        return insecureSkipVerification;
    }

    /**
     * <p>
     * Specifies whether or not API Gateway skips verification that the
     * certificate for an integration endpoint is issued by a <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-supported-certificate-authorities-for-http-endpoints.html"
     * >supported certificate authority</a>. This isn’t recommended, but it
     * enables you to use certificates that are signed by private certificate
     * authorities, or certificates that are self-signed. If enabled, API
     * Gateway still performs basic certificate validation, which includes
     * checking the certificate's expiration date, hostname, and presence of a
     * root certificate authority. Supported only for <code>HTTP</code> and
     * <code>HTTP_PROXY</code> integrations.
     * </p>
     *
     * @return <p>
     *         Specifies whether or not API Gateway skips verification that the
     *         certificate for an integration endpoint is issued by a <a href=
     *         "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-supported-certificate-authorities-for-http-endpoints.html"
     *         >supported certificate authority</a>. This isn’t recommended, but
     *         it enables you to use certificates that are signed by private
     *         certificate authorities, or certificates that are self-signed. If
     *         enabled, API Gateway still performs basic certificate validation,
     *         which includes checking the certificate's expiration date,
     *         hostname, and presence of a root certificate authority. Supported
     *         only for <code>HTTP</code> and <code>HTTP_PROXY</code>
     *         integrations.
     *         </p>
     */
    public Boolean getInsecureSkipVerification() {
        return insecureSkipVerification;
    }

    /**
     * <p>
     * Specifies whether or not API Gateway skips verification that the
     * certificate for an integration endpoint is issued by a <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-supported-certificate-authorities-for-http-endpoints.html"
     * >supported certificate authority</a>. This isn’t recommended, but it
     * enables you to use certificates that are signed by private certificate
     * authorities, or certificates that are self-signed. If enabled, API
     * Gateway still performs basic certificate validation, which includes
     * checking the certificate's expiration date, hostname, and presence of a
     * root certificate authority. Supported only for <code>HTTP</code> and
     * <code>HTTP_PROXY</code> integrations.
     * </p>
     *
     * @param insecureSkipVerification <p>
     *            Specifies whether or not API Gateway skips verification that
     *            the certificate for an integration endpoint is issued by a <a
     *            href=
     *            "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-supported-certificate-authorities-for-http-endpoints.html"
     *            >supported certificate authority</a>. This isn’t recommended,
     *            but it enables you to use certificates that are signed by
     *            private certificate authorities, or certificates that are
     *            self-signed. If enabled, API Gateway still performs basic
     *            certificate validation, which includes checking the
     *            certificate's expiration date, hostname, and presence of a
     *            root certificate authority. Supported only for
     *            <code>HTTP</code> and <code>HTTP_PROXY</code> integrations.
     *            </p>
     */
    public void setInsecureSkipVerification(Boolean insecureSkipVerification) {
        this.insecureSkipVerification = insecureSkipVerification;
    }

    /**
     * <p>
     * Specifies whether or not API Gateway skips verification that the
     * certificate for an integration endpoint is issued by a <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-supported-certificate-authorities-for-http-endpoints.html"
     * >supported certificate authority</a>. This isn’t recommended, but it
     * enables you to use certificates that are signed by private certificate
     * authorities, or certificates that are self-signed. If enabled, API
     * Gateway still performs basic certificate validation, which includes
     * checking the certificate's expiration date, hostname, and presence of a
     * root certificate authority. Supported only for <code>HTTP</code> and
     * <code>HTTP_PROXY</code> integrations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param insecureSkipVerification <p>
     *            Specifies whether or not API Gateway skips verification that
     *            the certificate for an integration endpoint is issued by a <a
     *            href=
     *            "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-supported-certificate-authorities-for-http-endpoints.html"
     *            >supported certificate authority</a>. This isn’t recommended,
     *            but it enables you to use certificates that are signed by
     *            private certificate authorities, or certificates that are
     *            self-signed. If enabled, API Gateway still performs basic
     *            certificate validation, which includes checking the
     *            certificate's expiration date, hostname, and presence of a
     *            root certificate authority. Supported only for
     *            <code>HTTP</code> and <code>HTTP_PROXY</code> integrations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TlsConfig withInsecureSkipVerification(Boolean insecureSkipVerification) {
        this.insecureSkipVerification = insecureSkipVerification;
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
        if (getInsecureSkipVerification() != null)
            sb.append("insecureSkipVerification: " + getInsecureSkipVerification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getInsecureSkipVerification() == null) ? 0 : getInsecureSkipVerification()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TlsConfig == false)
            return false;
        TlsConfig other = (TlsConfig) obj;

        if (other.getInsecureSkipVerification() == null
                ^ this.getInsecureSkipVerification() == null)
            return false;
        if (other.getInsecureSkipVerification() != null
                && other.getInsecureSkipVerification().equals(this.getInsecureSkipVerification()) == false)
            return false;
        return true;
    }
}
