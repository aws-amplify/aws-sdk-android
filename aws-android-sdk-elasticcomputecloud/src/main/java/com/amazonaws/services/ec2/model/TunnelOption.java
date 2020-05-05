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
 * The VPN tunnel options.
 * </p>
 */
public class TunnelOption implements Serializable {
    /**
     * <p>
     * The external IP address of the VPN tunnel.
     * </p>
     */
    private String outsideIpAddress;

    /**
     * <p>
     * The range of inside IP addresses for the tunnel.
     * </p>
     */
    private String tunnelInsideCidr;

    /**
     * <p>
     * The pre-shared key (PSK) to establish initial authentication between the
     * virtual private gateway and the customer gateway.
     * </p>
     */
    private String preSharedKey;

    /**
     * <p>
     * The lifetime for phase 1 of the IKE negotiation, in seconds.
     * </p>
     */
    private Integer phase1LifetimeSeconds;

    /**
     * <p>
     * The lifetime for phase 2 of the IKE negotiation, in seconds.
     * </p>
     */
    private Integer phase2LifetimeSeconds;

    /**
     * <p>
     * The margin time, in seconds, before the phase 2 lifetime expires, during
     * which the AWS side of the VPN connection performs an IKE rekey.
     * </p>
     */
    private Integer rekeyMarginTimeSeconds;

    /**
     * <p>
     * The percentage of the rekey window determined by
     * <code>RekeyMarginTimeSeconds</code> during which the rekey time is
     * randomly selected.
     * </p>
     */
    private Integer rekeyFuzzPercentage;

    /**
     * <p>
     * The number of packets in an IKE replay window.
     * </p>
     */
    private Integer replayWindowSize;

    /**
     * <p>
     * The number of seconds after which a DPD timeout occurs.
     * </p>
     */
    private Integer dpdTimeoutSeconds;

    /**
     * <p>
     * The permitted encryption algorithms for the VPN tunnel for phase 1 IKE
     * negotiations.
     * </p>
     */
    private java.util.List<Phase1EncryptionAlgorithmsListValue> phase1EncryptionAlgorithms;

    /**
     * <p>
     * The permitted encryption algorithms for the VPN tunnel for phase 2 IKE
     * negotiations.
     * </p>
     */
    private java.util.List<Phase2EncryptionAlgorithmsListValue> phase2EncryptionAlgorithms;

    /**
     * <p>
     * The permitted integrity algorithms for the VPN tunnel for phase 1 IKE
     * negotiations.
     * </p>
     */
    private java.util.List<Phase1IntegrityAlgorithmsListValue> phase1IntegrityAlgorithms;

    /**
     * <p>
     * The permitted integrity algorithms for the VPN tunnel for phase 2 IKE
     * negotiations.
     * </p>
     */
    private java.util.List<Phase2IntegrityAlgorithmsListValue> phase2IntegrityAlgorithms;

    /**
     * <p>
     * The permitted Diffie-Hellman group numbers for the VPN tunnel for phase 1
     * IKE negotiations.
     * </p>
     */
    private java.util.List<Phase1DHGroupNumbersListValue> phase1DHGroupNumbers;

    /**
     * <p>
     * The permitted Diffie-Hellman group numbers for the VPN tunnel for phase 2
     * IKE negotiations.
     * </p>
     */
    private java.util.List<Phase2DHGroupNumbersListValue> phase2DHGroupNumbers;

    /**
     * <p>
     * The IKE versions that are permitted for the VPN tunnel.
     * </p>
     */
    private java.util.List<IKEVersionsListValue> ikeVersions;

    /**
     * <p>
     * The external IP address of the VPN tunnel.
     * </p>
     *
     * @return <p>
     *         The external IP address of the VPN tunnel.
     *         </p>
     */
    public String getOutsideIpAddress() {
        return outsideIpAddress;
    }

    /**
     * <p>
     * The external IP address of the VPN tunnel.
     * </p>
     *
     * @param outsideIpAddress <p>
     *            The external IP address of the VPN tunnel.
     *            </p>
     */
    public void setOutsideIpAddress(String outsideIpAddress) {
        this.outsideIpAddress = outsideIpAddress;
    }

    /**
     * <p>
     * The external IP address of the VPN tunnel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outsideIpAddress <p>
     *            The external IP address of the VPN tunnel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TunnelOption withOutsideIpAddress(String outsideIpAddress) {
        this.outsideIpAddress = outsideIpAddress;
        return this;
    }

    /**
     * <p>
     * The range of inside IP addresses for the tunnel.
     * </p>
     *
     * @return <p>
     *         The range of inside IP addresses for the tunnel.
     *         </p>
     */
    public String getTunnelInsideCidr() {
        return tunnelInsideCidr;
    }

    /**
     * <p>
     * The range of inside IP addresses for the tunnel.
     * </p>
     *
     * @param tunnelInsideCidr <p>
     *            The range of inside IP addresses for the tunnel.
     *            </p>
     */
    public void setTunnelInsideCidr(String tunnelInsideCidr) {
        this.tunnelInsideCidr = tunnelInsideCidr;
    }

    /**
     * <p>
     * The range of inside IP addresses for the tunnel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tunnelInsideCidr <p>
     *            The range of inside IP addresses for the tunnel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TunnelOption withTunnelInsideCidr(String tunnelInsideCidr) {
        this.tunnelInsideCidr = tunnelInsideCidr;
        return this;
    }

    /**
     * <p>
     * The pre-shared key (PSK) to establish initial authentication between the
     * virtual private gateway and the customer gateway.
     * </p>
     *
     * @return <p>
     *         The pre-shared key (PSK) to establish initial authentication
     *         between the virtual private gateway and the customer gateway.
     *         </p>
     */
    public String getPreSharedKey() {
        return preSharedKey;
    }

    /**
     * <p>
     * The pre-shared key (PSK) to establish initial authentication between the
     * virtual private gateway and the customer gateway.
     * </p>
     *
     * @param preSharedKey <p>
     *            The pre-shared key (PSK) to establish initial authentication
     *            between the virtual private gateway and the customer gateway.
     *            </p>
     */
    public void setPreSharedKey(String preSharedKey) {
        this.preSharedKey = preSharedKey;
    }

    /**
     * <p>
     * The pre-shared key (PSK) to establish initial authentication between the
     * virtual private gateway and the customer gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param preSharedKey <p>
     *            The pre-shared key (PSK) to establish initial authentication
     *            between the virtual private gateway and the customer gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TunnelOption withPreSharedKey(String preSharedKey) {
        this.preSharedKey = preSharedKey;
        return this;
    }

    /**
     * <p>
     * The lifetime for phase 1 of the IKE negotiation, in seconds.
     * </p>
     *
     * @return <p>
     *         The lifetime for phase 1 of the IKE negotiation, in seconds.
     *         </p>
     */
    public Integer getPhase1LifetimeSeconds() {
        return phase1LifetimeSeconds;
    }

    /**
     * <p>
     * The lifetime for phase 1 of the IKE negotiation, in seconds.
     * </p>
     *
     * @param phase1LifetimeSeconds <p>
     *            The lifetime for phase 1 of the IKE negotiation, in seconds.
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
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phase1LifetimeSeconds <p>
     *            The lifetime for phase 1 of the IKE negotiation, in seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TunnelOption withPhase1LifetimeSeconds(Integer phase1LifetimeSeconds) {
        this.phase1LifetimeSeconds = phase1LifetimeSeconds;
        return this;
    }

    /**
     * <p>
     * The lifetime for phase 2 of the IKE negotiation, in seconds.
     * </p>
     *
     * @return <p>
     *         The lifetime for phase 2 of the IKE negotiation, in seconds.
     *         </p>
     */
    public Integer getPhase2LifetimeSeconds() {
        return phase2LifetimeSeconds;
    }

    /**
     * <p>
     * The lifetime for phase 2 of the IKE negotiation, in seconds.
     * </p>
     *
     * @param phase2LifetimeSeconds <p>
     *            The lifetime for phase 2 of the IKE negotiation, in seconds.
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
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phase2LifetimeSeconds <p>
     *            The lifetime for phase 2 of the IKE negotiation, in seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TunnelOption withPhase2LifetimeSeconds(Integer phase2LifetimeSeconds) {
        this.phase2LifetimeSeconds = phase2LifetimeSeconds;
        return this;
    }

    /**
     * <p>
     * The margin time, in seconds, before the phase 2 lifetime expires, during
     * which the AWS side of the VPN connection performs an IKE rekey.
     * </p>
     *
     * @return <p>
     *         The margin time, in seconds, before the phase 2 lifetime expires,
     *         during which the AWS side of the VPN connection performs an IKE
     *         rekey.
     *         </p>
     */
    public Integer getRekeyMarginTimeSeconds() {
        return rekeyMarginTimeSeconds;
    }

    /**
     * <p>
     * The margin time, in seconds, before the phase 2 lifetime expires, during
     * which the AWS side of the VPN connection performs an IKE rekey.
     * </p>
     *
     * @param rekeyMarginTimeSeconds <p>
     *            The margin time, in seconds, before the phase 2 lifetime
     *            expires, during which the AWS side of the VPN connection
     *            performs an IKE rekey.
     *            </p>
     */
    public void setRekeyMarginTimeSeconds(Integer rekeyMarginTimeSeconds) {
        this.rekeyMarginTimeSeconds = rekeyMarginTimeSeconds;
    }

    /**
     * <p>
     * The margin time, in seconds, before the phase 2 lifetime expires, during
     * which the AWS side of the VPN connection performs an IKE rekey.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rekeyMarginTimeSeconds <p>
     *            The margin time, in seconds, before the phase 2 lifetime
     *            expires, during which the AWS side of the VPN connection
     *            performs an IKE rekey.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TunnelOption withRekeyMarginTimeSeconds(Integer rekeyMarginTimeSeconds) {
        this.rekeyMarginTimeSeconds = rekeyMarginTimeSeconds;
        return this;
    }

    /**
     * <p>
     * The percentage of the rekey window determined by
     * <code>RekeyMarginTimeSeconds</code> during which the rekey time is
     * randomly selected.
     * </p>
     *
     * @return <p>
     *         The percentage of the rekey window determined by
     *         <code>RekeyMarginTimeSeconds</code> during which the rekey time
     *         is randomly selected.
     *         </p>
     */
    public Integer getRekeyFuzzPercentage() {
        return rekeyFuzzPercentage;
    }

    /**
     * <p>
     * The percentage of the rekey window determined by
     * <code>RekeyMarginTimeSeconds</code> during which the rekey time is
     * randomly selected.
     * </p>
     *
     * @param rekeyFuzzPercentage <p>
     *            The percentage of the rekey window determined by
     *            <code>RekeyMarginTimeSeconds</code> during which the rekey
     *            time is randomly selected.
     *            </p>
     */
    public void setRekeyFuzzPercentage(Integer rekeyFuzzPercentage) {
        this.rekeyFuzzPercentage = rekeyFuzzPercentage;
    }

    /**
     * <p>
     * The percentage of the rekey window determined by
     * <code>RekeyMarginTimeSeconds</code> during which the rekey time is
     * randomly selected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rekeyFuzzPercentage <p>
     *            The percentage of the rekey window determined by
     *            <code>RekeyMarginTimeSeconds</code> during which the rekey
     *            time is randomly selected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TunnelOption withRekeyFuzzPercentage(Integer rekeyFuzzPercentage) {
        this.rekeyFuzzPercentage = rekeyFuzzPercentage;
        return this;
    }

    /**
     * <p>
     * The number of packets in an IKE replay window.
     * </p>
     *
     * @return <p>
     *         The number of packets in an IKE replay window.
     *         </p>
     */
    public Integer getReplayWindowSize() {
        return replayWindowSize;
    }

    /**
     * <p>
     * The number of packets in an IKE replay window.
     * </p>
     *
     * @param replayWindowSize <p>
     *            The number of packets in an IKE replay window.
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
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replayWindowSize <p>
     *            The number of packets in an IKE replay window.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TunnelOption withReplayWindowSize(Integer replayWindowSize) {
        this.replayWindowSize = replayWindowSize;
        return this;
    }

    /**
     * <p>
     * The number of seconds after which a DPD timeout occurs.
     * </p>
     *
     * @return <p>
     *         The number of seconds after which a DPD timeout occurs.
     *         </p>
     */
    public Integer getDpdTimeoutSeconds() {
        return dpdTimeoutSeconds;
    }

    /**
     * <p>
     * The number of seconds after which a DPD timeout occurs.
     * </p>
     *
     * @param dpdTimeoutSeconds <p>
     *            The number of seconds after which a DPD timeout occurs.
     *            </p>
     */
    public void setDpdTimeoutSeconds(Integer dpdTimeoutSeconds) {
        this.dpdTimeoutSeconds = dpdTimeoutSeconds;
    }

    /**
     * <p>
     * The number of seconds after which a DPD timeout occurs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dpdTimeoutSeconds <p>
     *            The number of seconds after which a DPD timeout occurs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TunnelOption withDpdTimeoutSeconds(Integer dpdTimeoutSeconds) {
        this.dpdTimeoutSeconds = dpdTimeoutSeconds;
        return this;
    }

    /**
     * <p>
     * The permitted encryption algorithms for the VPN tunnel for phase 1 IKE
     * negotiations.
     * </p>
     *
     * @return <p>
     *         The permitted encryption algorithms for the VPN tunnel for phase
     *         1 IKE negotiations.
     *         </p>
     */
    public java.util.List<Phase1EncryptionAlgorithmsListValue> getPhase1EncryptionAlgorithms() {
        return phase1EncryptionAlgorithms;
    }

    /**
     * <p>
     * The permitted encryption algorithms for the VPN tunnel for phase 1 IKE
     * negotiations.
     * </p>
     *
     * @param phase1EncryptionAlgorithms <p>
     *            The permitted encryption algorithms for the VPN tunnel for
     *            phase 1 IKE negotiations.
     *            </p>
     */
    public void setPhase1EncryptionAlgorithms(
            java.util.Collection<Phase1EncryptionAlgorithmsListValue> phase1EncryptionAlgorithms) {
        if (phase1EncryptionAlgorithms == null) {
            this.phase1EncryptionAlgorithms = null;
            return;
        }

        this.phase1EncryptionAlgorithms = new java.util.ArrayList<Phase1EncryptionAlgorithmsListValue>(
                phase1EncryptionAlgorithms);
    }

    /**
     * <p>
     * The permitted encryption algorithms for the VPN tunnel for phase 1 IKE
     * negotiations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phase1EncryptionAlgorithms <p>
     *            The permitted encryption algorithms for the VPN tunnel for
     *            phase 1 IKE negotiations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TunnelOption withPhase1EncryptionAlgorithms(
            Phase1EncryptionAlgorithmsListValue... phase1EncryptionAlgorithms) {
        if (getPhase1EncryptionAlgorithms() == null) {
            this.phase1EncryptionAlgorithms = new java.util.ArrayList<Phase1EncryptionAlgorithmsListValue>(
                    phase1EncryptionAlgorithms.length);
        }
        for (Phase1EncryptionAlgorithmsListValue value : phase1EncryptionAlgorithms) {
            this.phase1EncryptionAlgorithms.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The permitted encryption algorithms for the VPN tunnel for phase 1 IKE
     * negotiations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phase1EncryptionAlgorithms <p>
     *            The permitted encryption algorithms for the VPN tunnel for
     *            phase 1 IKE negotiations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TunnelOption withPhase1EncryptionAlgorithms(
            java.util.Collection<Phase1EncryptionAlgorithmsListValue> phase1EncryptionAlgorithms) {
        setPhase1EncryptionAlgorithms(phase1EncryptionAlgorithms);
        return this;
    }

    /**
     * <p>
     * The permitted encryption algorithms for the VPN tunnel for phase 2 IKE
     * negotiations.
     * </p>
     *
     * @return <p>
     *         The permitted encryption algorithms for the VPN tunnel for phase
     *         2 IKE negotiations.
     *         </p>
     */
    public java.util.List<Phase2EncryptionAlgorithmsListValue> getPhase2EncryptionAlgorithms() {
        return phase2EncryptionAlgorithms;
    }

    /**
     * <p>
     * The permitted encryption algorithms for the VPN tunnel for phase 2 IKE
     * negotiations.
     * </p>
     *
     * @param phase2EncryptionAlgorithms <p>
     *            The permitted encryption algorithms for the VPN tunnel for
     *            phase 2 IKE negotiations.
     *            </p>
     */
    public void setPhase2EncryptionAlgorithms(
            java.util.Collection<Phase2EncryptionAlgorithmsListValue> phase2EncryptionAlgorithms) {
        if (phase2EncryptionAlgorithms == null) {
            this.phase2EncryptionAlgorithms = null;
            return;
        }

        this.phase2EncryptionAlgorithms = new java.util.ArrayList<Phase2EncryptionAlgorithmsListValue>(
                phase2EncryptionAlgorithms);
    }

    /**
     * <p>
     * The permitted encryption algorithms for the VPN tunnel for phase 2 IKE
     * negotiations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phase2EncryptionAlgorithms <p>
     *            The permitted encryption algorithms for the VPN tunnel for
     *            phase 2 IKE negotiations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TunnelOption withPhase2EncryptionAlgorithms(
            Phase2EncryptionAlgorithmsListValue... phase2EncryptionAlgorithms) {
        if (getPhase2EncryptionAlgorithms() == null) {
            this.phase2EncryptionAlgorithms = new java.util.ArrayList<Phase2EncryptionAlgorithmsListValue>(
                    phase2EncryptionAlgorithms.length);
        }
        for (Phase2EncryptionAlgorithmsListValue value : phase2EncryptionAlgorithms) {
            this.phase2EncryptionAlgorithms.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The permitted encryption algorithms for the VPN tunnel for phase 2 IKE
     * negotiations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phase2EncryptionAlgorithms <p>
     *            The permitted encryption algorithms for the VPN tunnel for
     *            phase 2 IKE negotiations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TunnelOption withPhase2EncryptionAlgorithms(
            java.util.Collection<Phase2EncryptionAlgorithmsListValue> phase2EncryptionAlgorithms) {
        setPhase2EncryptionAlgorithms(phase2EncryptionAlgorithms);
        return this;
    }

    /**
     * <p>
     * The permitted integrity algorithms for the VPN tunnel for phase 1 IKE
     * negotiations.
     * </p>
     *
     * @return <p>
     *         The permitted integrity algorithms for the VPN tunnel for phase 1
     *         IKE negotiations.
     *         </p>
     */
    public java.util.List<Phase1IntegrityAlgorithmsListValue> getPhase1IntegrityAlgorithms() {
        return phase1IntegrityAlgorithms;
    }

    /**
     * <p>
     * The permitted integrity algorithms for the VPN tunnel for phase 1 IKE
     * negotiations.
     * </p>
     *
     * @param phase1IntegrityAlgorithms <p>
     *            The permitted integrity algorithms for the VPN tunnel for
     *            phase 1 IKE negotiations.
     *            </p>
     */
    public void setPhase1IntegrityAlgorithms(
            java.util.Collection<Phase1IntegrityAlgorithmsListValue> phase1IntegrityAlgorithms) {
        if (phase1IntegrityAlgorithms == null) {
            this.phase1IntegrityAlgorithms = null;
            return;
        }

        this.phase1IntegrityAlgorithms = new java.util.ArrayList<Phase1IntegrityAlgorithmsListValue>(
                phase1IntegrityAlgorithms);
    }

    /**
     * <p>
     * The permitted integrity algorithms for the VPN tunnel for phase 1 IKE
     * negotiations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phase1IntegrityAlgorithms <p>
     *            The permitted integrity algorithms for the VPN tunnel for
     *            phase 1 IKE negotiations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TunnelOption withPhase1IntegrityAlgorithms(
            Phase1IntegrityAlgorithmsListValue... phase1IntegrityAlgorithms) {
        if (getPhase1IntegrityAlgorithms() == null) {
            this.phase1IntegrityAlgorithms = new java.util.ArrayList<Phase1IntegrityAlgorithmsListValue>(
                    phase1IntegrityAlgorithms.length);
        }
        for (Phase1IntegrityAlgorithmsListValue value : phase1IntegrityAlgorithms) {
            this.phase1IntegrityAlgorithms.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The permitted integrity algorithms for the VPN tunnel for phase 1 IKE
     * negotiations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phase1IntegrityAlgorithms <p>
     *            The permitted integrity algorithms for the VPN tunnel for
     *            phase 1 IKE negotiations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TunnelOption withPhase1IntegrityAlgorithms(
            java.util.Collection<Phase1IntegrityAlgorithmsListValue> phase1IntegrityAlgorithms) {
        setPhase1IntegrityAlgorithms(phase1IntegrityAlgorithms);
        return this;
    }

    /**
     * <p>
     * The permitted integrity algorithms for the VPN tunnel for phase 2 IKE
     * negotiations.
     * </p>
     *
     * @return <p>
     *         The permitted integrity algorithms for the VPN tunnel for phase 2
     *         IKE negotiations.
     *         </p>
     */
    public java.util.List<Phase2IntegrityAlgorithmsListValue> getPhase2IntegrityAlgorithms() {
        return phase2IntegrityAlgorithms;
    }

    /**
     * <p>
     * The permitted integrity algorithms for the VPN tunnel for phase 2 IKE
     * negotiations.
     * </p>
     *
     * @param phase2IntegrityAlgorithms <p>
     *            The permitted integrity algorithms for the VPN tunnel for
     *            phase 2 IKE negotiations.
     *            </p>
     */
    public void setPhase2IntegrityAlgorithms(
            java.util.Collection<Phase2IntegrityAlgorithmsListValue> phase2IntegrityAlgorithms) {
        if (phase2IntegrityAlgorithms == null) {
            this.phase2IntegrityAlgorithms = null;
            return;
        }

        this.phase2IntegrityAlgorithms = new java.util.ArrayList<Phase2IntegrityAlgorithmsListValue>(
                phase2IntegrityAlgorithms);
    }

    /**
     * <p>
     * The permitted integrity algorithms for the VPN tunnel for phase 2 IKE
     * negotiations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phase2IntegrityAlgorithms <p>
     *            The permitted integrity algorithms for the VPN tunnel for
     *            phase 2 IKE negotiations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TunnelOption withPhase2IntegrityAlgorithms(
            Phase2IntegrityAlgorithmsListValue... phase2IntegrityAlgorithms) {
        if (getPhase2IntegrityAlgorithms() == null) {
            this.phase2IntegrityAlgorithms = new java.util.ArrayList<Phase2IntegrityAlgorithmsListValue>(
                    phase2IntegrityAlgorithms.length);
        }
        for (Phase2IntegrityAlgorithmsListValue value : phase2IntegrityAlgorithms) {
            this.phase2IntegrityAlgorithms.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The permitted integrity algorithms for the VPN tunnel for phase 2 IKE
     * negotiations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phase2IntegrityAlgorithms <p>
     *            The permitted integrity algorithms for the VPN tunnel for
     *            phase 2 IKE negotiations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TunnelOption withPhase2IntegrityAlgorithms(
            java.util.Collection<Phase2IntegrityAlgorithmsListValue> phase2IntegrityAlgorithms) {
        setPhase2IntegrityAlgorithms(phase2IntegrityAlgorithms);
        return this;
    }

    /**
     * <p>
     * The permitted Diffie-Hellman group numbers for the VPN tunnel for phase 1
     * IKE negotiations.
     * </p>
     *
     * @return <p>
     *         The permitted Diffie-Hellman group numbers for the VPN tunnel for
     *         phase 1 IKE negotiations.
     *         </p>
     */
    public java.util.List<Phase1DHGroupNumbersListValue> getPhase1DHGroupNumbers() {
        return phase1DHGroupNumbers;
    }

    /**
     * <p>
     * The permitted Diffie-Hellman group numbers for the VPN tunnel for phase 1
     * IKE negotiations.
     * </p>
     *
     * @param phase1DHGroupNumbers <p>
     *            The permitted Diffie-Hellman group numbers for the VPN tunnel
     *            for phase 1 IKE negotiations.
     *            </p>
     */
    public void setPhase1DHGroupNumbers(
            java.util.Collection<Phase1DHGroupNumbersListValue> phase1DHGroupNumbers) {
        if (phase1DHGroupNumbers == null) {
            this.phase1DHGroupNumbers = null;
            return;
        }

        this.phase1DHGroupNumbers = new java.util.ArrayList<Phase1DHGroupNumbersListValue>(
                phase1DHGroupNumbers);
    }

    /**
     * <p>
     * The permitted Diffie-Hellman group numbers for the VPN tunnel for phase 1
     * IKE negotiations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phase1DHGroupNumbers <p>
     *            The permitted Diffie-Hellman group numbers for the VPN tunnel
     *            for phase 1 IKE negotiations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TunnelOption withPhase1DHGroupNumbers(
            Phase1DHGroupNumbersListValue... phase1DHGroupNumbers) {
        if (getPhase1DHGroupNumbers() == null) {
            this.phase1DHGroupNumbers = new java.util.ArrayList<Phase1DHGroupNumbersListValue>(
                    phase1DHGroupNumbers.length);
        }
        for (Phase1DHGroupNumbersListValue value : phase1DHGroupNumbers) {
            this.phase1DHGroupNumbers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The permitted Diffie-Hellman group numbers for the VPN tunnel for phase 1
     * IKE negotiations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phase1DHGroupNumbers <p>
     *            The permitted Diffie-Hellman group numbers for the VPN tunnel
     *            for phase 1 IKE negotiations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TunnelOption withPhase1DHGroupNumbers(
            java.util.Collection<Phase1DHGroupNumbersListValue> phase1DHGroupNumbers) {
        setPhase1DHGroupNumbers(phase1DHGroupNumbers);
        return this;
    }

    /**
     * <p>
     * The permitted Diffie-Hellman group numbers for the VPN tunnel for phase 2
     * IKE negotiations.
     * </p>
     *
     * @return <p>
     *         The permitted Diffie-Hellman group numbers for the VPN tunnel for
     *         phase 2 IKE negotiations.
     *         </p>
     */
    public java.util.List<Phase2DHGroupNumbersListValue> getPhase2DHGroupNumbers() {
        return phase2DHGroupNumbers;
    }

    /**
     * <p>
     * The permitted Diffie-Hellman group numbers for the VPN tunnel for phase 2
     * IKE negotiations.
     * </p>
     *
     * @param phase2DHGroupNumbers <p>
     *            The permitted Diffie-Hellman group numbers for the VPN tunnel
     *            for phase 2 IKE negotiations.
     *            </p>
     */
    public void setPhase2DHGroupNumbers(
            java.util.Collection<Phase2DHGroupNumbersListValue> phase2DHGroupNumbers) {
        if (phase2DHGroupNumbers == null) {
            this.phase2DHGroupNumbers = null;
            return;
        }

        this.phase2DHGroupNumbers = new java.util.ArrayList<Phase2DHGroupNumbersListValue>(
                phase2DHGroupNumbers);
    }

    /**
     * <p>
     * The permitted Diffie-Hellman group numbers for the VPN tunnel for phase 2
     * IKE negotiations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phase2DHGroupNumbers <p>
     *            The permitted Diffie-Hellman group numbers for the VPN tunnel
     *            for phase 2 IKE negotiations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TunnelOption withPhase2DHGroupNumbers(
            Phase2DHGroupNumbersListValue... phase2DHGroupNumbers) {
        if (getPhase2DHGroupNumbers() == null) {
            this.phase2DHGroupNumbers = new java.util.ArrayList<Phase2DHGroupNumbersListValue>(
                    phase2DHGroupNumbers.length);
        }
        for (Phase2DHGroupNumbersListValue value : phase2DHGroupNumbers) {
            this.phase2DHGroupNumbers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The permitted Diffie-Hellman group numbers for the VPN tunnel for phase 2
     * IKE negotiations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phase2DHGroupNumbers <p>
     *            The permitted Diffie-Hellman group numbers for the VPN tunnel
     *            for phase 2 IKE negotiations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TunnelOption withPhase2DHGroupNumbers(
            java.util.Collection<Phase2DHGroupNumbersListValue> phase2DHGroupNumbers) {
        setPhase2DHGroupNumbers(phase2DHGroupNumbers);
        return this;
    }

    /**
     * <p>
     * The IKE versions that are permitted for the VPN tunnel.
     * </p>
     *
     * @return <p>
     *         The IKE versions that are permitted for the VPN tunnel.
     *         </p>
     */
    public java.util.List<IKEVersionsListValue> getIkeVersions() {
        return ikeVersions;
    }

    /**
     * <p>
     * The IKE versions that are permitted for the VPN tunnel.
     * </p>
     *
     * @param ikeVersions <p>
     *            The IKE versions that are permitted for the VPN tunnel.
     *            </p>
     */
    public void setIkeVersions(java.util.Collection<IKEVersionsListValue> ikeVersions) {
        if (ikeVersions == null) {
            this.ikeVersions = null;
            return;
        }

        this.ikeVersions = new java.util.ArrayList<IKEVersionsListValue>(ikeVersions);
    }

    /**
     * <p>
     * The IKE versions that are permitted for the VPN tunnel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ikeVersions <p>
     *            The IKE versions that are permitted for the VPN tunnel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TunnelOption withIkeVersions(IKEVersionsListValue... ikeVersions) {
        if (getIkeVersions() == null) {
            this.ikeVersions = new java.util.ArrayList<IKEVersionsListValue>(ikeVersions.length);
        }
        for (IKEVersionsListValue value : ikeVersions) {
            this.ikeVersions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IKE versions that are permitted for the VPN tunnel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ikeVersions <p>
     *            The IKE versions that are permitted for the VPN tunnel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TunnelOption withIkeVersions(java.util.Collection<IKEVersionsListValue> ikeVersions) {
        setIkeVersions(ikeVersions);
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
        if (getOutsideIpAddress() != null)
            sb.append("OutsideIpAddress: " + getOutsideIpAddress() + ",");
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
        if (getDpdTimeoutSeconds() != null)
            sb.append("DpdTimeoutSeconds: " + getDpdTimeoutSeconds() + ",");
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
        if (getIkeVersions() != null)
            sb.append("IkeVersions: " + getIkeVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOutsideIpAddress() == null) ? 0 : getOutsideIpAddress().hashCode());
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
                + ((getDpdTimeoutSeconds() == null) ? 0 : getDpdTimeoutSeconds().hashCode());
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
                + ((getIkeVersions() == null) ? 0 : getIkeVersions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TunnelOption == false)
            return false;
        TunnelOption other = (TunnelOption) obj;

        if (other.getOutsideIpAddress() == null ^ this.getOutsideIpAddress() == null)
            return false;
        if (other.getOutsideIpAddress() != null
                && other.getOutsideIpAddress().equals(this.getOutsideIpAddress()) == false)
            return false;
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
        if (other.getDpdTimeoutSeconds() == null ^ this.getDpdTimeoutSeconds() == null)
            return false;
        if (other.getDpdTimeoutSeconds() != null
                && other.getDpdTimeoutSeconds().equals(this.getDpdTimeoutSeconds()) == false)
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
        if (other.getIkeVersions() == null ^ this.getIkeVersions() == null)
            return false;
        if (other.getIkeVersions() != null
                && other.getIkeVersions().equals(this.getIkeVersions()) == false)
            return false;
        return true;
    }
}
