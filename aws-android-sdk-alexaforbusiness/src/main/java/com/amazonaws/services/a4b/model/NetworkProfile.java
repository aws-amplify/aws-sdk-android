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

package com.amazonaws.services.a4b.model;

import java.io.Serializable;

/**
 * <p>
 * The network profile associated with a device.
 * </p>
 */
public class NetworkProfile implements Serializable {
    /**
     * <p>
     * The ARN of the network profile associated with a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String networkProfileArn;

    /**
     * <p>
     * The name of the network profile associated with a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     */
    private String networkProfileName;

    /**
     * <p>
     * Detailed information about a device's network profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     */
    private String description;

    /**
     * <p>
     * The SSID of the Wi-Fi network.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     */
    private String ssid;

    /**
     * <p>
     * The security type of the Wi-Fi network. This can be WPA2_ENTERPRISE,
     * WPA2_PSK, WPA_PSK, WEP, or OPEN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN, WEP, WPA_PSK, WPA2_PSK, WPA2_ENTERPRISE
     */
    private String securityType;

    /**
     * <p>
     * The authentication standard that is used in the EAP framework. Currently,
     * EAP_TLS is supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EAP_TLS
     */
    private String eapMethod;

    /**
     * <p>
     * The current password of the Wi-Fi network.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 128<br/>
     * <b>Pattern: </b>[\x00-\x7F]*<br/>
     */
    private String currentPassword;

    /**
     * <p>
     * The next, or subsequent, password of the Wi-Fi network. This password is
     * asynchronously transmitted to the device and is used when the password of
     * the network changes to NextPassword.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     * <b>Pattern: </b>(^$)|([\x00-\x7F]{5,})<br/>
     */
    private String nextPassword;

    /**
     * <p>
     * The ARN of the Private Certificate Authority (PCA) created in AWS
     * Certificate Manager (ACM). This is used to issue certificates to the
     * devices.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String certificateAuthorityArn;

    /**
     * <p>
     * The root certificates of your authentication server, which is installed
     * on your devices and used to trust your authentication server during EAP
     * negotiation.
     * </p>
     */
    private java.util.List<String> trustAnchors;

    /**
     * <p>
     * The ARN of the network profile associated with a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of the network profile associated with a device.
     *         </p>
     */
    public String getNetworkProfileArn() {
        return networkProfileArn;
    }

    /**
     * <p>
     * The ARN of the network profile associated with a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param networkProfileArn <p>
     *            The ARN of the network profile associated with a device.
     *            </p>
     */
    public void setNetworkProfileArn(String networkProfileArn) {
        this.networkProfileArn = networkProfileArn;
    }

    /**
     * <p>
     * The ARN of the network profile associated with a device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param networkProfileArn <p>
     *            The ARN of the network profile associated with a device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkProfile withNetworkProfileArn(String networkProfileArn) {
        this.networkProfileArn = networkProfileArn;
        return this;
    }

    /**
     * <p>
     * The name of the network profile associated with a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @return <p>
     *         The name of the network profile associated with a device.
     *         </p>
     */
    public String getNetworkProfileName() {
        return networkProfileName;
    }

    /**
     * <p>
     * The name of the network profile associated with a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @param networkProfileName <p>
     *            The name of the network profile associated with a device.
     *            </p>
     */
    public void setNetworkProfileName(String networkProfileName) {
        this.networkProfileName = networkProfileName;
    }

    /**
     * <p>
     * The name of the network profile associated with a device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @param networkProfileName <p>
     *            The name of the network profile associated with a device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkProfile withNetworkProfileName(String networkProfileName) {
        this.networkProfileName = networkProfileName;
        return this;
    }

    /**
     * <p>
     * Detailed information about a device's network profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @return <p>
     *         Detailed information about a device's network profile.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * Detailed information about a device's network profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @param description <p>
     *            Detailed information about a device's network profile.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Detailed information about a device's network profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @param description <p>
     *            Detailed information about a device's network profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkProfile withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The SSID of the Wi-Fi network.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @return <p>
     *         The SSID of the Wi-Fi network.
     *         </p>
     */
    public String getSsid() {
        return ssid;
    }

    /**
     * <p>
     * The SSID of the Wi-Fi network.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @param ssid <p>
     *            The SSID of the Wi-Fi network.
     *            </p>
     */
    public void setSsid(String ssid) {
        this.ssid = ssid;
    }

    /**
     * <p>
     * The SSID of the Wi-Fi network.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @param ssid <p>
     *            The SSID of the Wi-Fi network.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkProfile withSsid(String ssid) {
        this.ssid = ssid;
        return this;
    }

    /**
     * <p>
     * The security type of the Wi-Fi network. This can be WPA2_ENTERPRISE,
     * WPA2_PSK, WPA_PSK, WEP, or OPEN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN, WEP, WPA_PSK, WPA2_PSK, WPA2_ENTERPRISE
     *
     * @return <p>
     *         The security type of the Wi-Fi network. This can be
     *         WPA2_ENTERPRISE, WPA2_PSK, WPA_PSK, WEP, or OPEN.
     *         </p>
     * @see NetworkSecurityType
     */
    public String getSecurityType() {
        return securityType;
    }

    /**
     * <p>
     * The security type of the Wi-Fi network. This can be WPA2_ENTERPRISE,
     * WPA2_PSK, WPA_PSK, WEP, or OPEN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN, WEP, WPA_PSK, WPA2_PSK, WPA2_ENTERPRISE
     *
     * @param securityType <p>
     *            The security type of the Wi-Fi network. This can be
     *            WPA2_ENTERPRISE, WPA2_PSK, WPA_PSK, WEP, or OPEN.
     *            </p>
     * @see NetworkSecurityType
     */
    public void setSecurityType(String securityType) {
        this.securityType = securityType;
    }

    /**
     * <p>
     * The security type of the Wi-Fi network. This can be WPA2_ENTERPRISE,
     * WPA2_PSK, WPA_PSK, WEP, or OPEN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN, WEP, WPA_PSK, WPA2_PSK, WPA2_ENTERPRISE
     *
     * @param securityType <p>
     *            The security type of the Wi-Fi network. This can be
     *            WPA2_ENTERPRISE, WPA2_PSK, WPA_PSK, WEP, or OPEN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NetworkSecurityType
     */
    public NetworkProfile withSecurityType(String securityType) {
        this.securityType = securityType;
        return this;
    }

    /**
     * <p>
     * The security type of the Wi-Fi network. This can be WPA2_ENTERPRISE,
     * WPA2_PSK, WPA_PSK, WEP, or OPEN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN, WEP, WPA_PSK, WPA2_PSK, WPA2_ENTERPRISE
     *
     * @param securityType <p>
     *            The security type of the Wi-Fi network. This can be
     *            WPA2_ENTERPRISE, WPA2_PSK, WPA_PSK, WEP, or OPEN.
     *            </p>
     * @see NetworkSecurityType
     */
    public void setSecurityType(NetworkSecurityType securityType) {
        this.securityType = securityType.toString();
    }

    /**
     * <p>
     * The security type of the Wi-Fi network. This can be WPA2_ENTERPRISE,
     * WPA2_PSK, WPA_PSK, WEP, or OPEN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN, WEP, WPA_PSK, WPA2_PSK, WPA2_ENTERPRISE
     *
     * @param securityType <p>
     *            The security type of the Wi-Fi network. This can be
     *            WPA2_ENTERPRISE, WPA2_PSK, WPA_PSK, WEP, or OPEN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NetworkSecurityType
     */
    public NetworkProfile withSecurityType(NetworkSecurityType securityType) {
        this.securityType = securityType.toString();
        return this;
    }

    /**
     * <p>
     * The authentication standard that is used in the EAP framework. Currently,
     * EAP_TLS is supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EAP_TLS
     *
     * @return <p>
     *         The authentication standard that is used in the EAP framework.
     *         Currently, EAP_TLS is supported.
     *         </p>
     * @see NetworkEapMethod
     */
    public String getEapMethod() {
        return eapMethod;
    }

    /**
     * <p>
     * The authentication standard that is used in the EAP framework. Currently,
     * EAP_TLS is supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EAP_TLS
     *
     * @param eapMethod <p>
     *            The authentication standard that is used in the EAP framework.
     *            Currently, EAP_TLS is supported.
     *            </p>
     * @see NetworkEapMethod
     */
    public void setEapMethod(String eapMethod) {
        this.eapMethod = eapMethod;
    }

    /**
     * <p>
     * The authentication standard that is used in the EAP framework. Currently,
     * EAP_TLS is supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EAP_TLS
     *
     * @param eapMethod <p>
     *            The authentication standard that is used in the EAP framework.
     *            Currently, EAP_TLS is supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NetworkEapMethod
     */
    public NetworkProfile withEapMethod(String eapMethod) {
        this.eapMethod = eapMethod;
        return this;
    }

    /**
     * <p>
     * The authentication standard that is used in the EAP framework. Currently,
     * EAP_TLS is supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EAP_TLS
     *
     * @param eapMethod <p>
     *            The authentication standard that is used in the EAP framework.
     *            Currently, EAP_TLS is supported.
     *            </p>
     * @see NetworkEapMethod
     */
    public void setEapMethod(NetworkEapMethod eapMethod) {
        this.eapMethod = eapMethod.toString();
    }

    /**
     * <p>
     * The authentication standard that is used in the EAP framework. Currently,
     * EAP_TLS is supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EAP_TLS
     *
     * @param eapMethod <p>
     *            The authentication standard that is used in the EAP framework.
     *            Currently, EAP_TLS is supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NetworkEapMethod
     */
    public NetworkProfile withEapMethod(NetworkEapMethod eapMethod) {
        this.eapMethod = eapMethod.toString();
        return this;
    }

    /**
     * <p>
     * The current password of the Wi-Fi network.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 128<br/>
     * <b>Pattern: </b>[\x00-\x7F]*<br/>
     *
     * @return <p>
     *         The current password of the Wi-Fi network.
     *         </p>
     */
    public String getCurrentPassword() {
        return currentPassword;
    }

    /**
     * <p>
     * The current password of the Wi-Fi network.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 128<br/>
     * <b>Pattern: </b>[\x00-\x7F]*<br/>
     *
     * @param currentPassword <p>
     *            The current password of the Wi-Fi network.
     *            </p>
     */
    public void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
    }

    /**
     * <p>
     * The current password of the Wi-Fi network.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 128<br/>
     * <b>Pattern: </b>[\x00-\x7F]*<br/>
     *
     * @param currentPassword <p>
     *            The current password of the Wi-Fi network.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkProfile withCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
        return this;
    }

    /**
     * <p>
     * The next, or subsequent, password of the Wi-Fi network. This password is
     * asynchronously transmitted to the device and is used when the password of
     * the network changes to NextPassword.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     * <b>Pattern: </b>(^$)|([\x00-\x7F]{5,})<br/>
     *
     * @return <p>
     *         The next, or subsequent, password of the Wi-Fi network. This
     *         password is asynchronously transmitted to the device and is used
     *         when the password of the network changes to NextPassword.
     *         </p>
     */
    public String getNextPassword() {
        return nextPassword;
    }

    /**
     * <p>
     * The next, or subsequent, password of the Wi-Fi network. This password is
     * asynchronously transmitted to the device and is used when the password of
     * the network changes to NextPassword.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     * <b>Pattern: </b>(^$)|([\x00-\x7F]{5,})<br/>
     *
     * @param nextPassword <p>
     *            The next, or subsequent, password of the Wi-Fi network. This
     *            password is asynchronously transmitted to the device and is
     *            used when the password of the network changes to NextPassword.
     *            </p>
     */
    public void setNextPassword(String nextPassword) {
        this.nextPassword = nextPassword;
    }

    /**
     * <p>
     * The next, or subsequent, password of the Wi-Fi network. This password is
     * asynchronously transmitted to the device and is used when the password of
     * the network changes to NextPassword.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     * <b>Pattern: </b>(^$)|([\x00-\x7F]{5,})<br/>
     *
     * @param nextPassword <p>
     *            The next, or subsequent, password of the Wi-Fi network. This
     *            password is asynchronously transmitted to the device and is
     *            used when the password of the network changes to NextPassword.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkProfile withNextPassword(String nextPassword) {
        this.nextPassword = nextPassword;
        return this;
    }

    /**
     * <p>
     * The ARN of the Private Certificate Authority (PCA) created in AWS
     * Certificate Manager (ACM). This is used to issue certificates to the
     * devices.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of the Private Certificate Authority (PCA) created in AWS
     *         Certificate Manager (ACM). This is used to issue certificates to
     *         the devices.
     *         </p>
     */
    public String getCertificateAuthorityArn() {
        return certificateAuthorityArn;
    }

    /**
     * <p>
     * The ARN of the Private Certificate Authority (PCA) created in AWS
     * Certificate Manager (ACM). This is used to issue certificates to the
     * devices.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param certificateAuthorityArn <p>
     *            The ARN of the Private Certificate Authority (PCA) created in
     *            AWS Certificate Manager (ACM). This is used to issue
     *            certificates to the devices.
     *            </p>
     */
    public void setCertificateAuthorityArn(String certificateAuthorityArn) {
        this.certificateAuthorityArn = certificateAuthorityArn;
    }

    /**
     * <p>
     * The ARN of the Private Certificate Authority (PCA) created in AWS
     * Certificate Manager (ACM). This is used to issue certificates to the
     * devices.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param certificateAuthorityArn <p>
     *            The ARN of the Private Certificate Authority (PCA) created in
     *            AWS Certificate Manager (ACM). This is used to issue
     *            certificates to the devices.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkProfile withCertificateAuthorityArn(String certificateAuthorityArn) {
        this.certificateAuthorityArn = certificateAuthorityArn;
        return this;
    }

    /**
     * <p>
     * The root certificates of your authentication server, which is installed
     * on your devices and used to trust your authentication server during EAP
     * negotiation.
     * </p>
     *
     * @return <p>
     *         The root certificates of your authentication server, which is
     *         installed on your devices and used to trust your authentication
     *         server during EAP negotiation.
     *         </p>
     */
    public java.util.List<String> getTrustAnchors() {
        return trustAnchors;
    }

    /**
     * <p>
     * The root certificates of your authentication server, which is installed
     * on your devices and used to trust your authentication server during EAP
     * negotiation.
     * </p>
     *
     * @param trustAnchors <p>
     *            The root certificates of your authentication server, which is
     *            installed on your devices and used to trust your
     *            authentication server during EAP negotiation.
     *            </p>
     */
    public void setTrustAnchors(java.util.Collection<String> trustAnchors) {
        if (trustAnchors == null) {
            this.trustAnchors = null;
            return;
        }

        this.trustAnchors = new java.util.ArrayList<String>(trustAnchors);
    }

    /**
     * <p>
     * The root certificates of your authentication server, which is installed
     * on your devices and used to trust your authentication server during EAP
     * negotiation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trustAnchors <p>
     *            The root certificates of your authentication server, which is
     *            installed on your devices and used to trust your
     *            authentication server during EAP negotiation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkProfile withTrustAnchors(String... trustAnchors) {
        if (getTrustAnchors() == null) {
            this.trustAnchors = new java.util.ArrayList<String>(trustAnchors.length);
        }
        for (String value : trustAnchors) {
            this.trustAnchors.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The root certificates of your authentication server, which is installed
     * on your devices and used to trust your authentication server during EAP
     * negotiation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trustAnchors <p>
     *            The root certificates of your authentication server, which is
     *            installed on your devices and used to trust your
     *            authentication server during EAP negotiation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkProfile withTrustAnchors(java.util.Collection<String> trustAnchors) {
        setTrustAnchors(trustAnchors);
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
        if (getNetworkProfileArn() != null)
            sb.append("NetworkProfileArn: " + getNetworkProfileArn() + ",");
        if (getNetworkProfileName() != null)
            sb.append("NetworkProfileName: " + getNetworkProfileName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getSsid() != null)
            sb.append("Ssid: " + getSsid() + ",");
        if (getSecurityType() != null)
            sb.append("SecurityType: " + getSecurityType() + ",");
        if (getEapMethod() != null)
            sb.append("EapMethod: " + getEapMethod() + ",");
        if (getCurrentPassword() != null)
            sb.append("CurrentPassword: " + getCurrentPassword() + ",");
        if (getNextPassword() != null)
            sb.append("NextPassword: " + getNextPassword() + ",");
        if (getCertificateAuthorityArn() != null)
            sb.append("CertificateAuthorityArn: " + getCertificateAuthorityArn() + ",");
        if (getTrustAnchors() != null)
            sb.append("TrustAnchors: " + getTrustAnchors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNetworkProfileArn() == null) ? 0 : getNetworkProfileArn().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkProfileName() == null) ? 0 : getNetworkProfileName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSsid() == null) ? 0 : getSsid().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityType() == null) ? 0 : getSecurityType().hashCode());
        hashCode = prime * hashCode + ((getEapMethod() == null) ? 0 : getEapMethod().hashCode());
        hashCode = prime * hashCode
                + ((getCurrentPassword() == null) ? 0 : getCurrentPassword().hashCode());
        hashCode = prime * hashCode
                + ((getNextPassword() == null) ? 0 : getNextPassword().hashCode());
        hashCode = prime
                * hashCode
                + ((getCertificateAuthorityArn() == null) ? 0 : getCertificateAuthorityArn()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getTrustAnchors() == null) ? 0 : getTrustAnchors().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkProfile == false)
            return false;
        NetworkProfile other = (NetworkProfile) obj;

        if (other.getNetworkProfileArn() == null ^ this.getNetworkProfileArn() == null)
            return false;
        if (other.getNetworkProfileArn() != null
                && other.getNetworkProfileArn().equals(this.getNetworkProfileArn()) == false)
            return false;
        if (other.getNetworkProfileName() == null ^ this.getNetworkProfileName() == null)
            return false;
        if (other.getNetworkProfileName() != null
                && other.getNetworkProfileName().equals(this.getNetworkProfileName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSsid() == null ^ this.getSsid() == null)
            return false;
        if (other.getSsid() != null && other.getSsid().equals(this.getSsid()) == false)
            return false;
        if (other.getSecurityType() == null ^ this.getSecurityType() == null)
            return false;
        if (other.getSecurityType() != null
                && other.getSecurityType().equals(this.getSecurityType()) == false)
            return false;
        if (other.getEapMethod() == null ^ this.getEapMethod() == null)
            return false;
        if (other.getEapMethod() != null
                && other.getEapMethod().equals(this.getEapMethod()) == false)
            return false;
        if (other.getCurrentPassword() == null ^ this.getCurrentPassword() == null)
            return false;
        if (other.getCurrentPassword() != null
                && other.getCurrentPassword().equals(this.getCurrentPassword()) == false)
            return false;
        if (other.getNextPassword() == null ^ this.getNextPassword() == null)
            return false;
        if (other.getNextPassword() != null
                && other.getNextPassword().equals(this.getNextPassword()) == false)
            return false;
        if (other.getCertificateAuthorityArn() == null ^ this.getCertificateAuthorityArn() == null)
            return false;
        if (other.getCertificateAuthorityArn() != null
                && other.getCertificateAuthorityArn().equals(this.getCertificateAuthorityArn()) == false)
            return false;
        if (other.getTrustAnchors() == null ^ this.getTrustAnchors() == null)
            return false;
        if (other.getTrustAnchors() != null
                && other.getTrustAnchors().equals(this.getTrustAnchors()) == false)
            return false;
        return true;
    }
}
