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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * The tunnel options for a single VPN tunnel.
 * </p>
 */
public class VpnTunnelOptionsSpecification implements Serializable {
    /**
     * <p>
     * The range of inside IP addresses for the tunnel. Any specified CIDR
     * blocks must be unique across all VPN connections that use the same
     * virtual private gateway.
     * </p>
     * <p>
     * Constraints: A size /30 CIDR block from the <code>169.254.0.0/16</code>
     * range. The following CIDR blocks are reserved and cannot be used:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>169.254.0.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.1.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.2.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.3.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.4.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.5.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.169.252/30</code>
     * </p>
     * </li>
     * </ul>
     */
    private String tunnelInsideCidr;

    /**
     * <p>
     * The pre-shared key (PSK) to establish initial authentication between the
     * virtual private gateway and customer gateway.
     * </p>
     * <p>
     * Constraints: Allowed characters are alphanumeric characters, periods (.),
     * and underscores (_). Must be between 8 and 64 characters in length and
     * cannot start with zero (0).
     * </p>
     */
    private String preSharedKey;

    /**
     * <p>
     * The lifetime for phase 1 of the IKE negotiation, in seconds.
     * </p>
     * <p>
     * Constraints: A value between 900 and 28,800.
     * </p>
     * <p>
     * Default: <code>28800</code>
     * </p>
     */
    private Integer phase1LifetimeSeconds;

    /**
     * <p>
     * The lifetime for phase 2 of the IKE negotiation, in seconds.
     * </p>
     * <p>
     * Constraints: A value between 900 and 3,600. The value must be less than
     * the value for <code>Phase1LifetimeSeconds</code>.
     * </p>
     * <p>
     * Default: <code>3600</code>
     * </p>
     */
    private Integer phase2LifetimeSeconds;

    /**
     * <p>
     * The margin time, in seconds, before the phase 2 lifetime expires, during
     * which the AWS side of the VPN connection performs an IKE rekey. The exact
     * time of the rekey is randomly selected based on the value for
     * <code>RekeyFuzzPercentage</code>.
     * </p>
     * <p>
     * Constraints: A value between 60 and half of
     * <code>Phase2LifetimeSeconds</code>.
     * </p>
     * <p>
     * Default: <code>540</code>
     * </p>
     */
    private Integer rekeyMarginTimeSeconds;

    /**
     * <p>
     * The percentage of the rekey window (determined by
     * <code>RekeyMarginTimeSeconds</code>) during which the rekey time is
     * randomly selected.
     * </p>
     * <p>
     * Constraints: A value between 0 and 100.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     */
    private Integer rekeyFuzzPercentage;

    /**
     * <p>
     * The number of packets in an IKE replay window.
     * </p>
     * <p>
     * Constraints: A value between 64 and 2048.
     * </p>
     * <p>
     * Default: <code>1024</code>
     * </p>
     */
    private Integer replayWindowSize;

    /**
     * <p>
     * The number of seconds after which a DPD timeout occurs.
     * </p>
     * <p>
     * Constraints: A value between 0 and 30.
     * </p>
     * <p>
     * Default: <code>30</code>
     * </p>
     */
    private Integer dPDTimeoutSeconds;

    /**
     * <p>
     * One or more encryption algorithms that are permitted for the VPN tunnel
     * for phase 1 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>AES128</code> | <code>AES256</code>
     * </p>
     */
    private java.util.List<Phase1EncryptionAlgorithmsRequestListValue> phase1EncryptionAlgorithms;

    /**
     * <p>
     * One or more encryption algorithms that are permitted for the VPN tunnel
     * for phase 2 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>AES128</code> | <code>AES256</code>
     * </p>
     */
    private java.util.List<Phase2EncryptionAlgorithmsRequestListValue> phase2EncryptionAlgorithms;

    /**
     * <p>
     * One or more integrity algorithms that are permitted for the VPN tunnel
     * for phase 1 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>SHA1</code> | <code>SHA2-256</code>
     * </p>
     */
    private java.util.List<Phase1IntegrityAlgorithmsRequestListValue> phase1IntegrityAlgorithms;

    /**
     * <p>
     * One or more integrity algorithms that are permitted for the VPN tunnel
     * for phase 2 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>SHA1</code> | <code>SHA2-256</code>
     * </p>
     */
    private java.util.List<Phase2IntegrityAlgorithmsRequestListValue> phase2IntegrityAlgorithms;

    /**
     * <p>
     * One or more Diffie-Hellman group numbers that are permitted for the VPN
     * tunnel for phase 1 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>2</code> | <code>14</code> | <code>15</code> |
     * <code>16</code> | <code>17</code> | <code>18</code> | <code>22</code> |
     * <code>23</code> | <code>24</code>
     * </p>
     */
    private java.util.List<Phase1DHGroupNumbersRequestListValue> phase1DHGroupNumbers;

    /**
     * <p>
     * One or more Diffie-Hellman group numbers that are permitted for the VPN
     * tunnel for phase 2 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>2</code> | <code>5</code> | <code>14</code> |
     * <code>15</code> | <code>16</code> | <code>17</code> | <code>18</code> |
     * <code>22</code> | <code>23</code> | <code>24</code>
     * </p>
     */
    private java.util.List<Phase2DHGroupNumbersRequestListValue> phase2DHGroupNumbers;

    /**
     * <p>
     * The IKE versions that are permitted for the VPN tunnel.
     * </p>
     * <p>
     * Valid values: <code>ikev1</code> | <code>ikev2</code>
     * </p>
     */
    private java.util.List<IKEVersionsRequestListValue> iKEVersions;

    /**
     * <p>
     * The range of inside IP addresses for the tunnel. Any specified CIDR
     * blocks must be unique across all VPN connections that use the same
     * virtual private gateway.
     * </p>
     * <p>
     * Constraints: A size /30 CIDR block from the <code>169.254.0.0/16</code>
     * range. The following CIDR blocks are reserved and cannot be used:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>169.254.0.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.1.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.2.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.3.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.4.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.5.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.169.252/30</code>
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The range of inside IP addresses for the tunnel. Any specified
     *         CIDR blocks must be unique across all VPN connections that use
     *         the same virtual private gateway.
     *         </p>
     *         <p>
     *         Constraints: A size /30 CIDR block from the
     *         <code>169.254.0.0/16</code> range. The following CIDR blocks are
     *         reserved and cannot be used:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>169.254.0.0/30</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>169.254.1.0/30</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>169.254.2.0/30</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>169.254.3.0/30</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>169.254.4.0/30</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>169.254.5.0/30</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>169.254.169.252/30</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getTunnelInsideCidr() {
        return tunnelInsideCidr;
    }

    /**
     * <p>
     * The range of inside IP addresses for the tunnel. Any specified CIDR
     * blocks must be unique across all VPN connections that use the same
     * virtual private gateway.
     * </p>
     * <p>
     * Constraints: A size /30 CIDR block from the <code>169.254.0.0/16</code>
     * range. The following CIDR blocks are reserved and cannot be used:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>169.254.0.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.1.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.2.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.3.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.4.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.5.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.169.252/30</code>
     * </p>
     * </li>
     * </ul>
     *
     * @param tunnelInsideCidr <p>
     *            The range of inside IP addresses for the tunnel. Any specified
     *            CIDR blocks must be unique across all VPN connections that use
     *            the same virtual private gateway.
     *            </p>
     *            <p>
     *            Constraints: A size /30 CIDR block from the
     *            <code>169.254.0.0/16</code> range. The following CIDR blocks
     *            are reserved and cannot be used:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>169.254.0.0/30</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>169.254.1.0/30</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>169.254.2.0/30</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>169.254.3.0/30</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>169.254.4.0/30</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>169.254.5.0/30</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>169.254.169.252/30</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setTunnelInsideCidr(String tunnelInsideCidr) {
        this.tunnelInsideCidr = tunnelInsideCidr;
    }

    /**
     * <p>
     * The range of inside IP addresses for the tunnel. Any specified CIDR
     * blocks must be unique across all VPN connections that use the same
     * virtual private gateway.
     * </p>
     * <p>
     * Constraints: A size /30 CIDR block from the <code>169.254.0.0/16</code>
     * range. The following CIDR blocks are reserved and cannot be used:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>169.254.0.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.1.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.2.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.3.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.4.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.5.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.169.252/30</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tunnelInsideCidr <p>
     *            The range of inside IP addresses for the tunnel. Any specified
     *            CIDR blocks must be unique across all VPN connections that use
     *            the same virtual private gateway.
     *            </p>
     *            <p>
     *            Constraints: A size /30 CIDR block from the
     *            <code>169.254.0.0/16</code> range. The following CIDR blocks
     *            are reserved and cannot be used:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>169.254.0.0/30</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>169.254.1.0/30</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>169.254.2.0/30</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>169.254.3.0/30</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>169.254.4.0/30</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>169.254.5.0/30</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>169.254.169.252/30</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnTunnelOptionsSpecification withTunnelInsideCidr(String tunnelInsideCidr) {
        this.tunnelInsideCidr = tunnelInsideCidr;
        return this;
    }

    /**
     * <p>
     * The pre-shared key (PSK) to establish initial authentication between the
     * virtual private gateway and customer gateway.
     * </p>
     * <p>
     * Constraints: Allowed characters are alphanumeric characters, periods (.),
     * and underscores (_). Must be between 8 and 64 characters in length and
     * cannot start with zero (0).
     * </p>
     *
     * @return <p>
     *         The pre-shared key (PSK) to establish initial authentication
     *         between the virtual private gateway and customer gateway.
     *         </p>
     *         <p>
     *         Constraints: Allowed characters are alphanumeric characters,
     *         periods (.), and underscores (_). Must be between 8 and 64
     *         characters in length and cannot start with zero (0).
     *         </p>
     */
    public String getPreSharedKey() {
        return preSharedKey;
    }

    /**
     * <p>
     * The pre-shared key (PSK) to establish initial authentication between the
     * virtual private gateway and customer gateway.
     * </p>
     * <p>
     * Constraints: Allowed characters are alphanumeric characters, periods (.),
     * and underscores (_). Must be between 8 and 64 characters in length and
     * cannot start with zero (0).
     * </p>
     *
     * @param preSharedKey <p>
     *            The pre-shared key (PSK) to establish initial authentication
     *            between the virtual private gateway and customer gateway.
     *            </p>
     *            <p>
     *            Constraints: Allowed characters are alphanumeric characters,
     *            periods (.), and underscores (_). Must be between 8 and 64
     *            characters in length and cannot start with zero (0).
     *            </p>
     */
    public void setPreSharedKey(String preSharedKey) {
        this.preSharedKey = preSharedKey;
    }

    /**
     * <p>
     * The pre-shared key (PSK) to establish initial authentication between the
     * virtual private gateway and customer gateway.
     * </p>
     * <p>
     * Constraints: Allowed characters are alphanumeric characters, periods (.),
     * and underscores (_). Must be between 8 and 64 characters in length and
     * cannot start with zero (0).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param preSharedKey <p>
     *            The pre-shared key (PSK) to establish initial authentication
     *            between the virtual private gateway and customer gateway.
     *            </p>
     *            <p>
     *            Constraints: Allowed characters are alphanumeric characters,
     *            periods (.), and underscores (_). Must be between 8 and 64
     *            characters in length and cannot start with zero (0).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnTunnelOptionsSpecification withPreSharedKey(String preSharedKey) {
        this.preSharedKey = preSharedKey;
        return this;
    }

    /**
     * <p>
     * The lifetime for phase 1 of the IKE negotiation, in seconds.
     * </p>
     * <p>
     * Constraints: A value between 900 and 28,800.
     * </p>
     * <p>
     * Default: <code>28800</code>
     * </p>
     *
     * @return <p>
     *         The lifetime for phase 1 of the IKE negotiation, in seconds.
     *         </p>
     *         <p>
     *         Constraints: A value between 900 and 28,800.
     *         </p>
     *         <p>
     *         Default: <code>28800</code>
     *         </p>
     */
    public Integer getPhase1LifetimeSeconds() {
        return phase1LifetimeSeconds;
    }

    /**
     * <p>
     * The lifetime for phase 1 of the IKE negotiation, in seconds.
     * </p>
     * <p>
     * Constraints: A value between 900 and 28,800.
     * </p>
     * <p>
     * Default: <code>28800</code>
     * </p>
     *
     * @param phase1LifetimeSeconds <p>
     *            The lifetime for phase 1 of the IKE negotiation, in seconds.
     *            </p>
     *            <p>
     *            Constraints: A value between 900 and 28,800.
     *            </p>
     *            <p>
     *            Default: <code>28800</code>
     *            </p>
     */
    public void setPhase1LifetimeSeconds(Integer phase1LifetimeSeconds) {
        this.phase1LifetimeSeconds = phase1LifetimeSeconds;
    }

    /**
     * <p>
     * The lifetime for phase 1 of the IKE negotiation, in seconds.
     * </p>
     * <p>
     * Constraints: A value between 900 and 28,800.
     * </p>
     * <p>
     * Default: <code>28800</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phase1LifetimeSeconds <p>
     *            The lifetime for phase 1 of the IKE negotiation, in seconds.
     *            </p>
     *            <p>
     *            Constraints: A value between 900 and 28,800.
     *            </p>
     *            <p>
     *            Default: <code>28800</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnTunnelOptionsSpecification withPhase1LifetimeSeconds(Integer phase1LifetimeSeconds) {
        this.phase1LifetimeSeconds = phase1LifetimeSeconds;
        return this;
    }

    /**
     * <p>
     * The lifetime for phase 2 of the IKE negotiation, in seconds.
     * </p>
     * <p>
     * Constraints: A value between 900 and 3,600. The value must be less than
     * the value for <code>Phase1LifetimeSeconds</code>.
     * </p>
     * <p>
     * Default: <code>3600</code>
     * </p>
     *
     * @return <p>
     *         The lifetime for phase 2 of the IKE negotiation, in seconds.
     *         </p>
     *         <p>
     *         Constraints: A value between 900 and 3,600. The value must be
     *         less than the value for <code>Phase1LifetimeSeconds</code>.
     *         </p>
     *         <p>
     *         Default: <code>3600</code>
     *         </p>
     */
    public Integer getPhase2LifetimeSeconds() {
        return phase2LifetimeSeconds;
    }

    /**
     * <p>
     * The lifetime for phase 2 of the IKE negotiation, in seconds.
     * </p>
     * <p>
     * Constraints: A value between 900 and 3,600. The value must be less than
     * the value for <code>Phase1LifetimeSeconds</code>.
     * </p>
     * <p>
     * Default: <code>3600</code>
     * </p>
     *
     * @param phase2LifetimeSeconds <p>
     *            The lifetime for phase 2 of the IKE negotiation, in seconds.
     *            </p>
     *            <p>
     *            Constraints: A value between 900 and 3,600. The value must be
     *            less than the value for <code>Phase1LifetimeSeconds</code>.
     *            </p>
     *            <p>
     *            Default: <code>3600</code>
     *            </p>
     */
    public void setPhase2LifetimeSeconds(Integer phase2LifetimeSeconds) {
        this.phase2LifetimeSeconds = phase2LifetimeSeconds;
    }

    /**
     * <p>
     * The lifetime for phase 2 of the IKE negotiation, in seconds.
     * </p>
     * <p>
     * Constraints: A value between 900 and 3,600. The value must be less than
     * the value for <code>Phase1LifetimeSeconds</code>.
     * </p>
     * <p>
     * Default: <code>3600</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phase2LifetimeSeconds <p>
     *            The lifetime for phase 2 of the IKE negotiation, in seconds.
     *            </p>
     *            <p>
     *            Constraints: A value between 900 and 3,600. The value must be
     *            less than the value for <code>Phase1LifetimeSeconds</code>.
     *            </p>
     *            <p>
     *            Default: <code>3600</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnTunnelOptionsSpecification withPhase2LifetimeSeconds(Integer phase2LifetimeSeconds) {
        this.phase2LifetimeSeconds = phase2LifetimeSeconds;
        return this;
    }

    /**
     * <p>
     * The margin time, in seconds, before the phase 2 lifetime expires, during
     * which the AWS side of the VPN connection performs an IKE rekey. The exact
     * time of the rekey is randomly selected based on the value for
     * <code>RekeyFuzzPercentage</code>.
     * </p>
     * <p>
     * Constraints: A value between 60 and half of
     * <code>Phase2LifetimeSeconds</code>.
     * </p>
     * <p>
     * Default: <code>540</code>
     * </p>
     *
     * @return <p>
     *         The margin time, in seconds, before the phase 2 lifetime expires,
     *         during which the AWS side of the VPN connection performs an IKE
     *         rekey. The exact time of the rekey is randomly selected based on
     *         the value for <code>RekeyFuzzPercentage</code>.
     *         </p>
     *         <p>
     *         Constraints: A value between 60 and half of
     *         <code>Phase2LifetimeSeconds</code>.
     *         </p>
     *         <p>
     *         Default: <code>540</code>
     *         </p>
     */
    public Integer getRekeyMarginTimeSeconds() {
        return rekeyMarginTimeSeconds;
    }

    /**
     * <p>
     * The margin time, in seconds, before the phase 2 lifetime expires, during
     * which the AWS side of the VPN connection performs an IKE rekey. The exact
     * time of the rekey is randomly selected based on the value for
     * <code>RekeyFuzzPercentage</code>.
     * </p>
     * <p>
     * Constraints: A value between 60 and half of
     * <code>Phase2LifetimeSeconds</code>.
     * </p>
     * <p>
     * Default: <code>540</code>
     * </p>
     *
     * @param rekeyMarginTimeSeconds <p>
     *            The margin time, in seconds, before the phase 2 lifetime
     *            expires, during which the AWS side of the VPN connection
     *            performs an IKE rekey. The exact time of the rekey is randomly
     *            selected based on the value for
     *            <code>RekeyFuzzPercentage</code>.
     *            </p>
     *            <p>
     *            Constraints: A value between 60 and half of
     *            <code>Phase2LifetimeSeconds</code>.
     *            </p>
     *            <p>
     *            Default: <code>540</code>
     *            </p>
     */
    public void setRekeyMarginTimeSeconds(Integer rekeyMarginTimeSeconds) {
        this.rekeyMarginTimeSeconds = rekeyMarginTimeSeconds;
    }

    /**
     * <p>
     * The margin time, in seconds, before the phase 2 lifetime expires, during
     * which the AWS side of the VPN connection performs an IKE rekey. The exact
     * time of the rekey is randomly selected based on the value for
     * <code>RekeyFuzzPercentage</code>.
     * </p>
     * <p>
     * Constraints: A value between 60 and half of
     * <code>Phase2LifetimeSeconds</code>.
     * </p>
     * <p>
     * Default: <code>540</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rekeyMarginTimeSeconds <p>
     *            The margin time, in seconds, before the phase 2 lifetime
     *            expires, during which the AWS side of the VPN connection
     *            performs an IKE rekey. The exact time of the rekey is randomly
     *            selected based on the value for
     *            <code>RekeyFuzzPercentage</code>.
     *            </p>
     *            <p>
     *            Constraints: A value between 60 and half of
     *            <code>Phase2LifetimeSeconds</code>.
     *            </p>
     *            <p>
     *            Default: <code>540</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnTunnelOptionsSpecification withRekeyMarginTimeSeconds(Integer rekeyMarginTimeSeconds) {
        this.rekeyMarginTimeSeconds = rekeyMarginTimeSeconds;
        return this;
    }

    /**
     * <p>
     * The percentage of the rekey window (determined by
     * <code>RekeyMarginTimeSeconds</code>) during which the rekey time is
     * randomly selected.
     * </p>
     * <p>
     * Constraints: A value between 0 and 100.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     *
     * @return <p>
     *         The percentage of the rekey window (determined by
     *         <code>RekeyMarginTimeSeconds</code>) during which the rekey time
     *         is randomly selected.
     *         </p>
     *         <p>
     *         Constraints: A value between 0 and 100.
     *         </p>
     *         <p>
     *         Default: <code>100</code>
     *         </p>
     */
    public Integer getRekeyFuzzPercentage() {
        return rekeyFuzzPercentage;
    }

    /**
     * <p>
     * The percentage of the rekey window (determined by
     * <code>RekeyMarginTimeSeconds</code>) during which the rekey time is
     * randomly selected.
     * </p>
     * <p>
     * Constraints: A value between 0 and 100.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     *
     * @param rekeyFuzzPercentage <p>
     *            The percentage of the rekey window (determined by
     *            <code>RekeyMarginTimeSeconds</code>) during which the rekey
     *            time is randomly selected.
     *            </p>
     *            <p>
     *            Constraints: A value between 0 and 100.
     *            </p>
     *            <p>
     *            Default: <code>100</code>
     *            </p>
     */
    public void setRekeyFuzzPercentage(Integer rekeyFuzzPercentage) {
        this.rekeyFuzzPercentage = rekeyFuzzPercentage;
    }

    /**
     * <p>
     * The percentage of the rekey window (determined by
     * <code>RekeyMarginTimeSeconds</code>) during which the rekey time is
     * randomly selected.
     * </p>
     * <p>
     * Constraints: A value between 0 and 100.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rekeyFuzzPercentage <p>
     *            The percentage of the rekey window (determined by
     *            <code>RekeyMarginTimeSeconds</code>) during which the rekey
     *            time is randomly selected.
     *            </p>
     *            <p>
     *            Constraints: A value between 0 and 100.
     *            </p>
     *            <p>
     *            Default: <code>100</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnTunnelOptionsSpecification withRekeyFuzzPercentage(Integer rekeyFuzzPercentage) {
        this.rekeyFuzzPercentage = rekeyFuzzPercentage;
        return this;
    }

    /**
     * <p>
     * The number of packets in an IKE replay window.
     * </p>
     * <p>
     * Constraints: A value between 64 and 2048.
     * </p>
     * <p>
     * Default: <code>1024</code>
     * </p>
     *
     * @return <p>
     *         The number of packets in an IKE replay window.
     *         </p>
     *         <p>
     *         Constraints: A value between 64 and 2048.
     *         </p>
     *         <p>
     *         Default: <code>1024</code>
     *         </p>
     */
    public Integer getReplayWindowSize() {
        return replayWindowSize;
    }

    /**
     * <p>
     * The number of packets in an IKE replay window.
     * </p>
     * <p>
     * Constraints: A value between 64 and 2048.
     * </p>
     * <p>
     * Default: <code>1024</code>
     * </p>
     *
     * @param replayWindowSize <p>
     *            The number of packets in an IKE replay window.
     *            </p>
     *            <p>
     *            Constraints: A value between 64 and 2048.
     *            </p>
     *            <p>
     *            Default: <code>1024</code>
     *            </p>
     */
    public void setReplayWindowSize(Integer replayWindowSize) {
        this.replayWindowSize = replayWindowSize;
    }

    /**
     * <p>
     * The number of packets in an IKE replay window.
     * </p>
     * <p>
     * Constraints: A value between 64 and 2048.
     * </p>
     * <p>
     * Default: <code>1024</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replayWindowSize <p>
     *            The number of packets in an IKE replay window.
     *            </p>
     *            <p>
     *            Constraints: A value between 64 and 2048.
     *            </p>
     *            <p>
     *            Default: <code>1024</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnTunnelOptionsSpecification withReplayWindowSize(Integer replayWindowSize) {
        this.replayWindowSize = replayWindowSize;
        return this;
    }

    /**
     * <p>
     * The number of seconds after which a DPD timeout occurs.
     * </p>
     * <p>
     * Constraints: A value between 0 and 30.
     * </p>
     * <p>
     * Default: <code>30</code>
     * </p>
     *
     * @return <p>
     *         The number of seconds after which a DPD timeout occurs.
     *         </p>
     *         <p>
     *         Constraints: A value between 0 and 30.
     *         </p>
     *         <p>
     *         Default: <code>30</code>
     *         </p>
     */
    public Integer getDPDTimeoutSeconds() {
        return dPDTimeoutSeconds;
    }

    /**
     * <p>
     * The number of seconds after which a DPD timeout occurs.
     * </p>
     * <p>
     * Constraints: A value between 0 and 30.
     * </p>
     * <p>
     * Default: <code>30</code>
     * </p>
     *
     * @param dPDTimeoutSeconds <p>
     *            The number of seconds after which a DPD timeout occurs.
     *            </p>
     *            <p>
     *            Constraints: A value between 0 and 30.
     *            </p>
     *            <p>
     *            Default: <code>30</code>
     *            </p>
     */
    public void setDPDTimeoutSeconds(Integer dPDTimeoutSeconds) {
        this.dPDTimeoutSeconds = dPDTimeoutSeconds;
    }

    /**
     * <p>
     * The number of seconds after which a DPD timeout occurs.
     * </p>
     * <p>
     * Constraints: A value between 0 and 30.
     * </p>
     * <p>
     * Default: <code>30</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dPDTimeoutSeconds <p>
     *            The number of seconds after which a DPD timeout occurs.
     *            </p>
     *            <p>
     *            Constraints: A value between 0 and 30.
     *            </p>
     *            <p>
     *            Default: <code>30</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnTunnelOptionsSpecification withDPDTimeoutSeconds(Integer dPDTimeoutSeconds) {
        this.dPDTimeoutSeconds = dPDTimeoutSeconds;
        return this;
    }

    /**
     * <p>
     * One or more encryption algorithms that are permitted for the VPN tunnel
     * for phase 1 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>AES128</code> | <code>AES256</code>
     * </p>
     *
     * @return <p>
     *         One or more encryption algorithms that are permitted for the VPN
     *         tunnel for phase 1 IKE negotiations.
     *         </p>
     *         <p>
     *         Valid values: <code>AES128</code> | <code>AES256</code>
     *         </p>
     */
    public java.util.List<Phase1EncryptionAlgorithmsRequestListValue> getPhase1EncryptionAlgorithms() {
        return phase1EncryptionAlgorithms;
    }

    /**
     * <p>
     * One or more encryption algorithms that are permitted for the VPN tunnel
     * for phase 1 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>AES128</code> | <code>AES256</code>
     * </p>
     *
     * @param phase1EncryptionAlgorithms <p>
     *            One or more encryption algorithms that are permitted for the
     *            VPN tunnel for phase 1 IKE negotiations.
     *            </p>
     *            <p>
     *            Valid values: <code>AES128</code> | <code>AES256</code>
     *            </p>
     */
    public void setPhase1EncryptionAlgorithms(
            java.util.Collection<Phase1EncryptionAlgorithmsRequestListValue> phase1EncryptionAlgorithms) {
        if (phase1EncryptionAlgorithms == null) {
            this.phase1EncryptionAlgorithms = null;
            return;
        }

        this.phase1EncryptionAlgorithms = new java.util.ArrayList<Phase1EncryptionAlgorithmsRequestListValue>(
                phase1EncryptionAlgorithms);
    }

    /**
     * <p>
     * One or more encryption algorithms that are permitted for the VPN tunnel
     * for phase 1 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>AES128</code> | <code>AES256</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phase1EncryptionAlgorithms <p>
     *            One or more encryption algorithms that are permitted for the
     *            VPN tunnel for phase 1 IKE negotiations.
     *            </p>
     *            <p>
     *            Valid values: <code>AES128</code> | <code>AES256</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnTunnelOptionsSpecification withPhase1EncryptionAlgorithms(
            Phase1EncryptionAlgorithmsRequestListValue... phase1EncryptionAlgorithms) {
        if (getPhase1EncryptionAlgorithms() == null) {
            this.phase1EncryptionAlgorithms = new java.util.ArrayList<Phase1EncryptionAlgorithmsRequestListValue>(
                    phase1EncryptionAlgorithms.length);
        }
        for (Phase1EncryptionAlgorithmsRequestListValue value : phase1EncryptionAlgorithms) {
            this.phase1EncryptionAlgorithms.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more encryption algorithms that are permitted for the VPN tunnel
     * for phase 1 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>AES128</code> | <code>AES256</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phase1EncryptionAlgorithms <p>
     *            One or more encryption algorithms that are permitted for the
     *            VPN tunnel for phase 1 IKE negotiations.
     *            </p>
     *            <p>
     *            Valid values: <code>AES128</code> | <code>AES256</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnTunnelOptionsSpecification withPhase1EncryptionAlgorithms(
            java.util.Collection<Phase1EncryptionAlgorithmsRequestListValue> phase1EncryptionAlgorithms) {
        setPhase1EncryptionAlgorithms(phase1EncryptionAlgorithms);
        return this;
    }

    /**
     * <p>
     * One or more encryption algorithms that are permitted for the VPN tunnel
     * for phase 2 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>AES128</code> | <code>AES256</code>
     * </p>
     *
     * @return <p>
     *         One or more encryption algorithms that are permitted for the VPN
     *         tunnel for phase 2 IKE negotiations.
     *         </p>
     *         <p>
     *         Valid values: <code>AES128</code> | <code>AES256</code>
     *         </p>
     */
    public java.util.List<Phase2EncryptionAlgorithmsRequestListValue> getPhase2EncryptionAlgorithms() {
        return phase2EncryptionAlgorithms;
    }

    /**
     * <p>
     * One or more encryption algorithms that are permitted for the VPN tunnel
     * for phase 2 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>AES128</code> | <code>AES256</code>
     * </p>
     *
     * @param phase2EncryptionAlgorithms <p>
     *            One or more encryption algorithms that are permitted for the
     *            VPN tunnel for phase 2 IKE negotiations.
     *            </p>
     *            <p>
     *            Valid values: <code>AES128</code> | <code>AES256</code>
     *            </p>
     */
    public void setPhase2EncryptionAlgorithms(
            java.util.Collection<Phase2EncryptionAlgorithmsRequestListValue> phase2EncryptionAlgorithms) {
        if (phase2EncryptionAlgorithms == null) {
            this.phase2EncryptionAlgorithms = null;
            return;
        }

        this.phase2EncryptionAlgorithms = new java.util.ArrayList<Phase2EncryptionAlgorithmsRequestListValue>(
                phase2EncryptionAlgorithms);
    }

    /**
     * <p>
     * One or more encryption algorithms that are permitted for the VPN tunnel
     * for phase 2 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>AES128</code> | <code>AES256</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phase2EncryptionAlgorithms <p>
     *            One or more encryption algorithms that are permitted for the
     *            VPN tunnel for phase 2 IKE negotiations.
     *            </p>
     *            <p>
     *            Valid values: <code>AES128</code> | <code>AES256</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnTunnelOptionsSpecification withPhase2EncryptionAlgorithms(
            Phase2EncryptionAlgorithmsRequestListValue... phase2EncryptionAlgorithms) {
        if (getPhase2EncryptionAlgorithms() == null) {
            this.phase2EncryptionAlgorithms = new java.util.ArrayList<Phase2EncryptionAlgorithmsRequestListValue>(
                    phase2EncryptionAlgorithms.length);
        }
        for (Phase2EncryptionAlgorithmsRequestListValue value : phase2EncryptionAlgorithms) {
            this.phase2EncryptionAlgorithms.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more encryption algorithms that are permitted for the VPN tunnel
     * for phase 2 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>AES128</code> | <code>AES256</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phase2EncryptionAlgorithms <p>
     *            One or more encryption algorithms that are permitted for the
     *            VPN tunnel for phase 2 IKE negotiations.
     *            </p>
     *            <p>
     *            Valid values: <code>AES128</code> | <code>AES256</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnTunnelOptionsSpecification withPhase2EncryptionAlgorithms(
            java.util.Collection<Phase2EncryptionAlgorithmsRequestListValue> phase2EncryptionAlgorithms) {
        setPhase2EncryptionAlgorithms(phase2EncryptionAlgorithms);
        return this;
    }

    /**
     * <p>
     * One or more integrity algorithms that are permitted for the VPN tunnel
     * for phase 1 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>SHA1</code> | <code>SHA2-256</code>
     * </p>
     *
     * @return <p>
     *         One or more integrity algorithms that are permitted for the VPN
     *         tunnel for phase 1 IKE negotiations.
     *         </p>
     *         <p>
     *         Valid values: <code>SHA1</code> | <code>SHA2-256</code>
     *         </p>
     */
    public java.util.List<Phase1IntegrityAlgorithmsRequestListValue> getPhase1IntegrityAlgorithms() {
        return phase1IntegrityAlgorithms;
    }

    /**
     * <p>
     * One or more integrity algorithms that are permitted for the VPN tunnel
     * for phase 1 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>SHA1</code> | <code>SHA2-256</code>
     * </p>
     *
     * @param phase1IntegrityAlgorithms <p>
     *            One or more integrity algorithms that are permitted for the
     *            VPN tunnel for phase 1 IKE negotiations.
     *            </p>
     *            <p>
     *            Valid values: <code>SHA1</code> | <code>SHA2-256</code>
     *            </p>
     */
    public void setPhase1IntegrityAlgorithms(
            java.util.Collection<Phase1IntegrityAlgorithmsRequestListValue> phase1IntegrityAlgorithms) {
        if (phase1IntegrityAlgorithms == null) {
            this.phase1IntegrityAlgorithms = null;
            return;
        }

        this.phase1IntegrityAlgorithms = new java.util.ArrayList<Phase1IntegrityAlgorithmsRequestListValue>(
                phase1IntegrityAlgorithms);
    }

    /**
     * <p>
     * One or more integrity algorithms that are permitted for the VPN tunnel
     * for phase 1 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>SHA1</code> | <code>SHA2-256</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phase1IntegrityAlgorithms <p>
     *            One or more integrity algorithms that are permitted for the
     *            VPN tunnel for phase 1 IKE negotiations.
     *            </p>
     *            <p>
     *            Valid values: <code>SHA1</code> | <code>SHA2-256</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnTunnelOptionsSpecification withPhase1IntegrityAlgorithms(
            Phase1IntegrityAlgorithmsRequestListValue... phase1IntegrityAlgorithms) {
        if (getPhase1IntegrityAlgorithms() == null) {
            this.phase1IntegrityAlgorithms = new java.util.ArrayList<Phase1IntegrityAlgorithmsRequestListValue>(
                    phase1IntegrityAlgorithms.length);
        }
        for (Phase1IntegrityAlgorithmsRequestListValue value : phase1IntegrityAlgorithms) {
            this.phase1IntegrityAlgorithms.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more integrity algorithms that are permitted for the VPN tunnel
     * for phase 1 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>SHA1</code> | <code>SHA2-256</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phase1IntegrityAlgorithms <p>
     *            One or more integrity algorithms that are permitted for the
     *            VPN tunnel for phase 1 IKE negotiations.
     *            </p>
     *            <p>
     *            Valid values: <code>SHA1</code> | <code>SHA2-256</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnTunnelOptionsSpecification withPhase1IntegrityAlgorithms(
            java.util.Collection<Phase1IntegrityAlgorithmsRequestListValue> phase1IntegrityAlgorithms) {
        setPhase1IntegrityAlgorithms(phase1IntegrityAlgorithms);
        return this;
    }

    /**
     * <p>
     * One or more integrity algorithms that are permitted for the VPN tunnel
     * for phase 2 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>SHA1</code> | <code>SHA2-256</code>
     * </p>
     *
     * @return <p>
     *         One or more integrity algorithms that are permitted for the VPN
     *         tunnel for phase 2 IKE negotiations.
     *         </p>
     *         <p>
     *         Valid values: <code>SHA1</code> | <code>SHA2-256</code>
     *         </p>
     */
    public java.util.List<Phase2IntegrityAlgorithmsRequestListValue> getPhase2IntegrityAlgorithms() {
        return phase2IntegrityAlgorithms;
    }

    /**
     * <p>
     * One or more integrity algorithms that are permitted for the VPN tunnel
     * for phase 2 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>SHA1</code> | <code>SHA2-256</code>
     * </p>
     *
     * @param phase2IntegrityAlgorithms <p>
     *            One or more integrity algorithms that are permitted for the
     *            VPN tunnel for phase 2 IKE negotiations.
     *            </p>
     *            <p>
     *            Valid values: <code>SHA1</code> | <code>SHA2-256</code>
     *            </p>
     */
    public void setPhase2IntegrityAlgorithms(
            java.util.Collection<Phase2IntegrityAlgorithmsRequestListValue> phase2IntegrityAlgorithms) {
        if (phase2IntegrityAlgorithms == null) {
            this.phase2IntegrityAlgorithms = null;
            return;
        }

        this.phase2IntegrityAlgorithms = new java.util.ArrayList<Phase2IntegrityAlgorithmsRequestListValue>(
                phase2IntegrityAlgorithms);
    }

    /**
     * <p>
     * One or more integrity algorithms that are permitted for the VPN tunnel
     * for phase 2 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>SHA1</code> | <code>SHA2-256</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phase2IntegrityAlgorithms <p>
     *            One or more integrity algorithms that are permitted for the
     *            VPN tunnel for phase 2 IKE negotiations.
     *            </p>
     *            <p>
     *            Valid values: <code>SHA1</code> | <code>SHA2-256</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnTunnelOptionsSpecification withPhase2IntegrityAlgorithms(
            Phase2IntegrityAlgorithmsRequestListValue... phase2IntegrityAlgorithms) {
        if (getPhase2IntegrityAlgorithms() == null) {
            this.phase2IntegrityAlgorithms = new java.util.ArrayList<Phase2IntegrityAlgorithmsRequestListValue>(
                    phase2IntegrityAlgorithms.length);
        }
        for (Phase2IntegrityAlgorithmsRequestListValue value : phase2IntegrityAlgorithms) {
            this.phase2IntegrityAlgorithms.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more integrity algorithms that are permitted for the VPN tunnel
     * for phase 2 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>SHA1</code> | <code>SHA2-256</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phase2IntegrityAlgorithms <p>
     *            One or more integrity algorithms that are permitted for the
     *            VPN tunnel for phase 2 IKE negotiations.
     *            </p>
     *            <p>
     *            Valid values: <code>SHA1</code> | <code>SHA2-256</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnTunnelOptionsSpecification withPhase2IntegrityAlgorithms(
            java.util.Collection<Phase2IntegrityAlgorithmsRequestListValue> phase2IntegrityAlgorithms) {
        setPhase2IntegrityAlgorithms(phase2IntegrityAlgorithms);
        return this;
    }

    /**
     * <p>
     * One or more Diffie-Hellman group numbers that are permitted for the VPN
     * tunnel for phase 1 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>2</code> | <code>14</code> | <code>15</code> |
     * <code>16</code> | <code>17</code> | <code>18</code> | <code>22</code> |
     * <code>23</code> | <code>24</code>
     * </p>
     *
     * @return <p>
     *         One or more Diffie-Hellman group numbers that are permitted for
     *         the VPN tunnel for phase 1 IKE negotiations.
     *         </p>
     *         <p>
     *         Valid values: <code>2</code> | <code>14</code> | <code>15</code>
     *         | <code>16</code> | <code>17</code> | <code>18</code> |
     *         <code>22</code> | <code>23</code> | <code>24</code>
     *         </p>
     */
    public java.util.List<Phase1DHGroupNumbersRequestListValue> getPhase1DHGroupNumbers() {
        return phase1DHGroupNumbers;
    }

    /**
     * <p>
     * One or more Diffie-Hellman group numbers that are permitted for the VPN
     * tunnel for phase 1 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>2</code> | <code>14</code> | <code>15</code> |
     * <code>16</code> | <code>17</code> | <code>18</code> | <code>22</code> |
     * <code>23</code> | <code>24</code>
     * </p>
     *
     * @param phase1DHGroupNumbers <p>
     *            One or more Diffie-Hellman group numbers that are permitted
     *            for the VPN tunnel for phase 1 IKE negotiations.
     *            </p>
     *            <p>
     *            Valid values: <code>2</code> | <code>14</code> |
     *            <code>15</code> | <code>16</code> | <code>17</code> |
     *            <code>18</code> | <code>22</code> | <code>23</code> |
     *            <code>24</code>
     *            </p>
     */
    public void setPhase1DHGroupNumbers(
            java.util.Collection<Phase1DHGroupNumbersRequestListValue> phase1DHGroupNumbers) {
        if (phase1DHGroupNumbers == null) {
            this.phase1DHGroupNumbers = null;
            return;
        }

        this.phase1DHGroupNumbers = new java.util.ArrayList<Phase1DHGroupNumbersRequestListValue>(
                phase1DHGroupNumbers);
    }

    /**
     * <p>
     * One or more Diffie-Hellman group numbers that are permitted for the VPN
     * tunnel for phase 1 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>2</code> | <code>14</code> | <code>15</code> |
     * <code>16</code> | <code>17</code> | <code>18</code> | <code>22</code> |
     * <code>23</code> | <code>24</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phase1DHGroupNumbers <p>
     *            One or more Diffie-Hellman group numbers that are permitted
     *            for the VPN tunnel for phase 1 IKE negotiations.
     *            </p>
     *            <p>
     *            Valid values: <code>2</code> | <code>14</code> |
     *            <code>15</code> | <code>16</code> | <code>17</code> |
     *            <code>18</code> | <code>22</code> | <code>23</code> |
     *            <code>24</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnTunnelOptionsSpecification withPhase1DHGroupNumbers(
            Phase1DHGroupNumbersRequestListValue... phase1DHGroupNumbers) {
        if (getPhase1DHGroupNumbers() == null) {
            this.phase1DHGroupNumbers = new java.util.ArrayList<Phase1DHGroupNumbersRequestListValue>(
                    phase1DHGroupNumbers.length);
        }
        for (Phase1DHGroupNumbersRequestListValue value : phase1DHGroupNumbers) {
            this.phase1DHGroupNumbers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more Diffie-Hellman group numbers that are permitted for the VPN
     * tunnel for phase 1 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>2</code> | <code>14</code> | <code>15</code> |
     * <code>16</code> | <code>17</code> | <code>18</code> | <code>22</code> |
     * <code>23</code> | <code>24</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phase1DHGroupNumbers <p>
     *            One or more Diffie-Hellman group numbers that are permitted
     *            for the VPN tunnel for phase 1 IKE negotiations.
     *            </p>
     *            <p>
     *            Valid values: <code>2</code> | <code>14</code> |
     *            <code>15</code> | <code>16</code> | <code>17</code> |
     *            <code>18</code> | <code>22</code> | <code>23</code> |
     *            <code>24</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnTunnelOptionsSpecification withPhase1DHGroupNumbers(
            java.util.Collection<Phase1DHGroupNumbersRequestListValue> phase1DHGroupNumbers) {
        setPhase1DHGroupNumbers(phase1DHGroupNumbers);
        return this;
    }

    /**
     * <p>
     * One or more Diffie-Hellman group numbers that are permitted for the VPN
     * tunnel for phase 2 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>2</code> | <code>5</code> | <code>14</code> |
     * <code>15</code> | <code>16</code> | <code>17</code> | <code>18</code> |
     * <code>22</code> | <code>23</code> | <code>24</code>
     * </p>
     *
     * @return <p>
     *         One or more Diffie-Hellman group numbers that are permitted for
     *         the VPN tunnel for phase 2 IKE negotiations.
     *         </p>
     *         <p>
     *         Valid values: <code>2</code> | <code>5</code> | <code>14</code> |
     *         <code>15</code> | <code>16</code> | <code>17</code> |
     *         <code>18</code> | <code>22</code> | <code>23</code> |
     *         <code>24</code>
     *         </p>
     */
    public java.util.List<Phase2DHGroupNumbersRequestListValue> getPhase2DHGroupNumbers() {
        return phase2DHGroupNumbers;
    }

    /**
     * <p>
     * One or more Diffie-Hellman group numbers that are permitted for the VPN
     * tunnel for phase 2 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>2</code> | <code>5</code> | <code>14</code> |
     * <code>15</code> | <code>16</code> | <code>17</code> | <code>18</code> |
     * <code>22</code> | <code>23</code> | <code>24</code>
     * </p>
     *
     * @param phase2DHGroupNumbers <p>
     *            One or more Diffie-Hellman group numbers that are permitted
     *            for the VPN tunnel for phase 2 IKE negotiations.
     *            </p>
     *            <p>
     *            Valid values: <code>2</code> | <code>5</code> |
     *            <code>14</code> | <code>15</code> | <code>16</code> |
     *            <code>17</code> | <code>18</code> | <code>22</code> |
     *            <code>23</code> | <code>24</code>
     *            </p>
     */
    public void setPhase2DHGroupNumbers(
            java.util.Collection<Phase2DHGroupNumbersRequestListValue> phase2DHGroupNumbers) {
        if (phase2DHGroupNumbers == null) {
            this.phase2DHGroupNumbers = null;
            return;
        }

        this.phase2DHGroupNumbers = new java.util.ArrayList<Phase2DHGroupNumbersRequestListValue>(
                phase2DHGroupNumbers);
    }

    /**
     * <p>
     * One or more Diffie-Hellman group numbers that are permitted for the VPN
     * tunnel for phase 2 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>2</code> | <code>5</code> | <code>14</code> |
     * <code>15</code> | <code>16</code> | <code>17</code> | <code>18</code> |
     * <code>22</code> | <code>23</code> | <code>24</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phase2DHGroupNumbers <p>
     *            One or more Diffie-Hellman group numbers that are permitted
     *            for the VPN tunnel for phase 2 IKE negotiations.
     *            </p>
     *            <p>
     *            Valid values: <code>2</code> | <code>5</code> |
     *            <code>14</code> | <code>15</code> | <code>16</code> |
     *            <code>17</code> | <code>18</code> | <code>22</code> |
     *            <code>23</code> | <code>24</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnTunnelOptionsSpecification withPhase2DHGroupNumbers(
            Phase2DHGroupNumbersRequestListValue... phase2DHGroupNumbers) {
        if (getPhase2DHGroupNumbers() == null) {
            this.phase2DHGroupNumbers = new java.util.ArrayList<Phase2DHGroupNumbersRequestListValue>(
                    phase2DHGroupNumbers.length);
        }
        for (Phase2DHGroupNumbersRequestListValue value : phase2DHGroupNumbers) {
            this.phase2DHGroupNumbers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more Diffie-Hellman group numbers that are permitted for the VPN
     * tunnel for phase 2 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>2</code> | <code>5</code> | <code>14</code> |
     * <code>15</code> | <code>16</code> | <code>17</code> | <code>18</code> |
     * <code>22</code> | <code>23</code> | <code>24</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phase2DHGroupNumbers <p>
     *            One or more Diffie-Hellman group numbers that are permitted
     *            for the VPN tunnel for phase 2 IKE negotiations.
     *            </p>
     *            <p>
     *            Valid values: <code>2</code> | <code>5</code> |
     *            <code>14</code> | <code>15</code> | <code>16</code> |
     *            <code>17</code> | <code>18</code> | <code>22</code> |
     *            <code>23</code> | <code>24</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnTunnelOptionsSpecification withPhase2DHGroupNumbers(
            java.util.Collection<Phase2DHGroupNumbersRequestListValue> phase2DHGroupNumbers) {
        setPhase2DHGroupNumbers(phase2DHGroupNumbers);
        return this;
    }

    /**
     * <p>
     * The IKE versions that are permitted for the VPN tunnel.
     * </p>
     * <p>
     * Valid values: <code>ikev1</code> | <code>ikev2</code>
     * </p>
     *
     * @return <p>
     *         The IKE versions that are permitted for the VPN tunnel.
     *         </p>
     *         <p>
     *         Valid values: <code>ikev1</code> | <code>ikev2</code>
     *         </p>
     */
    public java.util.List<IKEVersionsRequestListValue> getIKEVersions() {
        return iKEVersions;
    }

    /**
     * <p>
     * The IKE versions that are permitted for the VPN tunnel.
     * </p>
     * <p>
     * Valid values: <code>ikev1</code> | <code>ikev2</code>
     * </p>
     *
     * @param iKEVersions <p>
     *            The IKE versions that are permitted for the VPN tunnel.
     *            </p>
     *            <p>
     *            Valid values: <code>ikev1</code> | <code>ikev2</code>
     *            </p>
     */
    public void setIKEVersions(java.util.Collection<IKEVersionsRequestListValue> iKEVersions) {
        if (iKEVersions == null) {
            this.iKEVersions = null;
            return;
        }

        this.iKEVersions = new java.util.ArrayList<IKEVersionsRequestListValue>(iKEVersions);
    }

    /**
     * <p>
     * The IKE versions that are permitted for the VPN tunnel.
     * </p>
     * <p>
     * Valid values: <code>ikev1</code> | <code>ikev2</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iKEVersions <p>
     *            The IKE versions that are permitted for the VPN tunnel.
     *            </p>
     *            <p>
     *            Valid values: <code>ikev1</code> | <code>ikev2</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnTunnelOptionsSpecification withIKEVersions(IKEVersionsRequestListValue... iKEVersions) {
        if (getIKEVersions() == null) {
            this.iKEVersions = new java.util.ArrayList<IKEVersionsRequestListValue>(
                    iKEVersions.length);
        }
        for (IKEVersionsRequestListValue value : iKEVersions) {
            this.iKEVersions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IKE versions that are permitted for the VPN tunnel.
     * </p>
     * <p>
     * Valid values: <code>ikev1</code> | <code>ikev2</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iKEVersions <p>
     *            The IKE versions that are permitted for the VPN tunnel.
     *            </p>
     *            <p>
     *            Valid values: <code>ikev1</code> | <code>ikev2</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnTunnelOptionsSpecification withIKEVersions(
            java.util.Collection<IKEVersionsRequestListValue> iKEVersions) {
        setIKEVersions(iKEVersions);
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
        if (getTunnelInsideCidr() != null)
            sb.append("TunnelInsideCidr: " + getTunnelInsideCidr() + ",");
        if (getPreSharedKey() != null)
            sb.append("PreSharedKey: " + getPreSharedKey() + ",");
        if (getPhase1LifetimeSeconds() != null)
            sb.append("Phase1LifetimeSeconds: " + getPhase1LifetimeSeconds() + ",");
        if (getPhase2LifetimeSeconds() != null)
            sb.append("Phase2LifetimeSeconds: " + getPhase2LifetimeSeconds() + ",");
        if (getRekeyMarginTimeSeconds() != null)
            sb.append("RekeyMarginTimeSeconds: " + getRekeyMarginTimeSeconds() + ",");
        if (getRekeyFuzzPercentage() != null)
            sb.append("RekeyFuzzPercentage: " + getRekeyFuzzPercentage() + ",");
        if (getReplayWindowSize() != null)
            sb.append("ReplayWindowSize: " + getReplayWindowSize() + ",");
        if (getDPDTimeoutSeconds() != null)
            sb.append("DPDTimeoutSeconds: " + getDPDTimeoutSeconds() + ",");
        if (getPhase1EncryptionAlgorithms() != null)
            sb.append("Phase1EncryptionAlgorithms: " + getPhase1EncryptionAlgorithms() + ",");
        if (getPhase2EncryptionAlgorithms() != null)
            sb.append("Phase2EncryptionAlgorithms: " + getPhase2EncryptionAlgorithms() + ",");
        if (getPhase1IntegrityAlgorithms() != null)
            sb.append("Phase1IntegrityAlgorithms: " + getPhase1IntegrityAlgorithms() + ",");
        if (getPhase2IntegrityAlgorithms() != null)
            sb.append("Phase2IntegrityAlgorithms: " + getPhase2IntegrityAlgorithms() + ",");
        if (getPhase1DHGroupNumbers() != null)
            sb.append("Phase1DHGroupNumbers: " + getPhase1DHGroupNumbers() + ",");
        if (getPhase2DHGroupNumbers() != null)
            sb.append("Phase2DHGroupNumbers: " + getPhase2DHGroupNumbers() + ",");
        if (getIKEVersions() != null)
            sb.append("IKEVersions: " + getIKEVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTunnelInsideCidr() == null) ? 0 : getTunnelInsideCidr().hashCode());
        hashCode = prime * hashCode
                + ((getPreSharedKey() == null) ? 0 : getPreSharedKey().hashCode());
        hashCode = prime
                * hashCode
                + ((getPhase1LifetimeSeconds() == null) ? 0 : getPhase1LifetimeSeconds().hashCode());
        hashCode = prime
                * hashCode
                + ((getPhase2LifetimeSeconds() == null) ? 0 : getPhase2LifetimeSeconds().hashCode());
        hashCode = prime
                * hashCode
                + ((getRekeyMarginTimeSeconds() == null) ? 0 : getRekeyMarginTimeSeconds()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getRekeyFuzzPercentage() == null) ? 0 : getRekeyFuzzPercentage().hashCode());
        hashCode = prime * hashCode
                + ((getReplayWindowSize() == null) ? 0 : getReplayWindowSize().hashCode());
        hashCode = prime * hashCode
                + ((getDPDTimeoutSeconds() == null) ? 0 : getDPDTimeoutSeconds().hashCode());
        hashCode = prime
                * hashCode
                + ((getPhase1EncryptionAlgorithms() == null) ? 0 : getPhase1EncryptionAlgorithms()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getPhase2EncryptionAlgorithms() == null) ? 0 : getPhase2EncryptionAlgorithms()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getPhase1IntegrityAlgorithms() == null) ? 0 : getPhase1IntegrityAlgorithms()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getPhase2IntegrityAlgorithms() == null) ? 0 : getPhase2IntegrityAlgorithms()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getPhase1DHGroupNumbers() == null) ? 0 : getPhase1DHGroupNumbers().hashCode());
        hashCode = prime * hashCode
                + ((getPhase2DHGroupNumbers() == null) ? 0 : getPhase2DHGroupNumbers().hashCode());
        hashCode = prime * hashCode
                + ((getIKEVersions() == null) ? 0 : getIKEVersions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpnTunnelOptionsSpecification == false)
            return false;
        VpnTunnelOptionsSpecification other = (VpnTunnelOptionsSpecification) obj;

        if (other.getTunnelInsideCidr() == null ^ this.getTunnelInsideCidr() == null)
            return false;
        if (other.getTunnelInsideCidr() != null
                && other.getTunnelInsideCidr().equals(this.getTunnelInsideCidr()) == false)
            return false;
        if (other.getPreSharedKey() == null ^ this.getPreSharedKey() == null)
            return false;
        if (other.getPreSharedKey() != null
                && other.getPreSharedKey().equals(this.getPreSharedKey()) == false)
            return false;
        if (other.getPhase1LifetimeSeconds() == null ^ this.getPhase1LifetimeSeconds() == null)
            return false;
        if (other.getPhase1LifetimeSeconds() != null
                && other.getPhase1LifetimeSeconds().equals(this.getPhase1LifetimeSeconds()) == false)
            return false;
        if (other.getPhase2LifetimeSeconds() == null ^ this.getPhase2LifetimeSeconds() == null)
            return false;
        if (other.getPhase2LifetimeSeconds() != null
                && other.getPhase2LifetimeSeconds().equals(this.getPhase2LifetimeSeconds()) == false)
            return false;
        if (other.getRekeyMarginTimeSeconds() == null ^ this.getRekeyMarginTimeSeconds() == null)
            return false;
        if (other.getRekeyMarginTimeSeconds() != null
                && other.getRekeyMarginTimeSeconds().equals(this.getRekeyMarginTimeSeconds()) == false)
            return false;
        if (other.getRekeyFuzzPercentage() == null ^ this.getRekeyFuzzPercentage() == null)
            return false;
        if (other.getRekeyFuzzPercentage() != null
                && other.getRekeyFuzzPercentage().equals(this.getRekeyFuzzPercentage()) == false)
            return false;
        if (other.getReplayWindowSize() == null ^ this.getReplayWindowSize() == null)
            return false;
        if (other.getReplayWindowSize() != null
                && other.getReplayWindowSize().equals(this.getReplayWindowSize()) == false)
            return false;
        if (other.getDPDTimeoutSeconds() == null ^ this.getDPDTimeoutSeconds() == null)
            return false;
        if (other.getDPDTimeoutSeconds() != null
                && other.getDPDTimeoutSeconds().equals(this.getDPDTimeoutSeconds()) == false)
            return false;
        if (other.getPhase1EncryptionAlgorithms() == null
                ^ this.getPhase1EncryptionAlgorithms() == null)
            return false;
        if (other.getPhase1EncryptionAlgorithms() != null
                && other.getPhase1EncryptionAlgorithms().equals(
                        this.getPhase1EncryptionAlgorithms()) == false)
            return false;
        if (other.getPhase2EncryptionAlgorithms() == null
                ^ this.getPhase2EncryptionAlgorithms() == null)
            return false;
        if (other.getPhase2EncryptionAlgorithms() != null
                && other.getPhase2EncryptionAlgorithms().equals(
                        this.getPhase2EncryptionAlgorithms()) == false)
            return false;
        if (other.getPhase1IntegrityAlgorithms() == null
                ^ this.getPhase1IntegrityAlgorithms() == null)
            return false;
        if (other.getPhase1IntegrityAlgorithms() != null
                && other.getPhase1IntegrityAlgorithms().equals(this.getPhase1IntegrityAlgorithms()) == false)
            return false;
        if (other.getPhase2IntegrityAlgorithms() == null
                ^ this.getPhase2IntegrityAlgorithms() == null)
            return false;
        if (other.getPhase2IntegrityAlgorithms() != null
                && other.getPhase2IntegrityAlgorithms().equals(this.getPhase2IntegrityAlgorithms()) == false)
            return false;
        if (other.getPhase1DHGroupNumbers() == null ^ this.getPhase1DHGroupNumbers() == null)
            return false;
        if (other.getPhase1DHGroupNumbers() != null
                && other.getPhase1DHGroupNumbers().equals(this.getPhase1DHGroupNumbers()) == false)
            return false;
        if (other.getPhase2DHGroupNumbers() == null ^ this.getPhase2DHGroupNumbers() == null)
            return false;
        if (other.getPhase2DHGroupNumbers() != null
                && other.getPhase2DHGroupNumbers().equals(this.getPhase2DHGroupNumbers()) == false)
            return false;
        if (other.getIKEVersions() == null ^ this.getIKEVersions() == null)
            return false;
        if (other.getIKEVersions() != null
                && other.getIKEVersions().equals(this.getIKEVersions()) == false)
            return false;
        return true;
    }
}
