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
 * The server certificate configuration.
 * </p>
 */
public class ServerCertificateConfig implements Serializable {
    /**
     * <p>
     * A Boolean value that indicates whether Online Certificate Status Protocol
     * (OCSP) server certificate check is enabled or not.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/iot-custom-domain-ocsp-config.html"
     * >Configuring OCSP server-certificate stapling in domain configuration</a>
     * from Amazon Web Services IoT Core Developer Guide.
     * </p>
     */
    private Boolean enableOCSPCheck;

    /**
     * <p>
     * A Boolean value that indicates whether Online Certificate Status Protocol
     * (OCSP) server certificate check is enabled or not.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/iot-custom-domain-ocsp-config.html"
     * >Configuring OCSP server-certificate stapling in domain configuration</a>
     * from Amazon Web Services IoT Core Developer Guide.
     * </p>
     *
     * @return <p>
     *         A Boolean value that indicates whether Online Certificate Status
     *         Protocol (OCSP) server certificate check is enabled or not.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/iot/latest/developerguide/iot-custom-domain-ocsp-config.html"
     *         >Configuring OCSP server-certificate stapling in domain
     *         configuration</a> from Amazon Web Services IoT Core Developer
     *         Guide.
     *         </p>
     */
    public Boolean isEnableOCSPCheck() {
        return enableOCSPCheck;
    }

    /**
     * <p>
     * A Boolean value that indicates whether Online Certificate Status Protocol
     * (OCSP) server certificate check is enabled or not.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/iot-custom-domain-ocsp-config.html"
     * >Configuring OCSP server-certificate stapling in domain configuration</a>
     * from Amazon Web Services IoT Core Developer Guide.
     * </p>
     *
     * @return <p>
     *         A Boolean value that indicates whether Online Certificate Status
     *         Protocol (OCSP) server certificate check is enabled or not.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/iot/latest/developerguide/iot-custom-domain-ocsp-config.html"
     *         >Configuring OCSP server-certificate stapling in domain
     *         configuration</a> from Amazon Web Services IoT Core Developer
     *         Guide.
     *         </p>
     */
    public Boolean getEnableOCSPCheck() {
        return enableOCSPCheck;
    }

    /**
     * <p>
     * A Boolean value that indicates whether Online Certificate Status Protocol
     * (OCSP) server certificate check is enabled or not.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/iot-custom-domain-ocsp-config.html"
     * >Configuring OCSP server-certificate stapling in domain configuration</a>
     * from Amazon Web Services IoT Core Developer Guide.
     * </p>
     *
     * @param enableOCSPCheck <p>
     *            A Boolean value that indicates whether Online Certificate
     *            Status Protocol (OCSP) server certificate check is enabled or
     *            not.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/iot/latest/developerguide/iot-custom-domain-ocsp-config.html"
     *            >Configuring OCSP server-certificate stapling in domain
     *            configuration</a> from Amazon Web Services IoT Core Developer
     *            Guide.
     *            </p>
     */
    public void setEnableOCSPCheck(Boolean enableOCSPCheck) {
        this.enableOCSPCheck = enableOCSPCheck;
    }

    /**
     * <p>
     * A Boolean value that indicates whether Online Certificate Status Protocol
     * (OCSP) server certificate check is enabled or not.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/iot-custom-domain-ocsp-config.html"
     * >Configuring OCSP server-certificate stapling in domain configuration</a>
     * from Amazon Web Services IoT Core Developer Guide.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableOCSPCheck <p>
     *            A Boolean value that indicates whether Online Certificate
     *            Status Protocol (OCSP) server certificate check is enabled or
     *            not.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/iot/latest/developerguide/iot-custom-domain-ocsp-config.html"
     *            >Configuring OCSP server-certificate stapling in domain
     *            configuration</a> from Amazon Web Services IoT Core Developer
     *            Guide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServerCertificateConfig withEnableOCSPCheck(Boolean enableOCSPCheck) {
        this.enableOCSPCheck = enableOCSPCheck;
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
        if (getEnableOCSPCheck() != null)
            sb.append("enableOCSPCheck: " + getEnableOCSPCheck());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEnableOCSPCheck() == null) ? 0 : getEnableOCSPCheck().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServerCertificateConfig == false)
            return false;
        ServerCertificateConfig other = (ServerCertificateConfig) obj;

        if (other.getEnableOCSPCheck() == null ^ this.getEnableOCSPCheck() == null)
            return false;
        if (other.getEnableOCSPCheck() != null
                && other.getEnableOCSPCheck().equals(this.getEnableOCSPCheck()) == false)
            return false;
        return true;
    }
}
