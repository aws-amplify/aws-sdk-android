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

package com.amazonaws.services.directconnect.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a BGP peer.
 * </p>
 */
public class BGPPeer implements Serializable {
    /**
     * <p>
     * The ID of the BGP peer.
     * </p>
     */
    private String bgpPeerId;

    /**
     * <p>
     * The autonomous system (AS) number for Border Gateway Protocol (BGP)
     * configuration.
     * </p>
     */
    private Integer asn;

    /**
     * <p>
     * The authentication key for BGP configuration. This string has a minimum
     * length of 6 characters and and a maximun lenth of 80 characters.
     * </p>
     */
    private String authKey;

    /**
     * <p>
     * The address family for the BGP peer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipv4, ipv6
     */
    private String addressFamily;

    /**
     * <p>
     * The IP address assigned to the Amazon interface.
     * </p>
     */
    private String amazonAddress;

    /**
     * <p>
     * The IP address assigned to the customer interface.
     * </p>
     */
    private String customerAddress;

    /**
     * <p>
     * The state of the BGP peer. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>verifying</code>: The BGP peering addresses or ASN require
     * validation before the BGP peer can be created. This state applies only to
     * public virtual interfaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The BGP peer is created, and remains in this state
     * until it is ready to be established.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The BGP peer is ready to be established.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The BGP peer is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The BGP peer is deleted and cannot be established.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>verifying, pending, available, deleting, deleted
     */
    private String bgpPeerState;

    /**
     * <p>
     * The status of the BGP peer. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>up</code>: The BGP peer is established. This state does not
     * indicate the state of the routing function. Ensure that you are receiving
     * routes over the BGP session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: The BGP peer is down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The BGP peer status is not available.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>up, down, unknown
     */
    private String bgpStatus;

    /**
     * <p>
     * The Direct Connect endpoint on which the BGP peer terminates.
     * </p>
     */
    private String awsDeviceV2;

    /**
     * <p>
     * The ID of the BGP peer.
     * </p>
     *
     * @return <p>
     *         The ID of the BGP peer.
     *         </p>
     */
    public String getBgpPeerId() {
        return bgpPeerId;
    }

    /**
     * <p>
     * The ID of the BGP peer.
     * </p>
     *
     * @param bgpPeerId <p>
     *            The ID of the BGP peer.
     *            </p>
     */
    public void setBgpPeerId(String bgpPeerId) {
        this.bgpPeerId = bgpPeerId;
    }

    /**
     * <p>
     * The ID of the BGP peer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bgpPeerId <p>
     *            The ID of the BGP peer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BGPPeer withBgpPeerId(String bgpPeerId) {
        this.bgpPeerId = bgpPeerId;
        return this;
    }

    /**
     * <p>
     * The autonomous system (AS) number for Border Gateway Protocol (BGP)
     * configuration.
     * </p>
     *
     * @return <p>
     *         The autonomous system (AS) number for Border Gateway Protocol
     *         (BGP) configuration.
     *         </p>
     */
    public Integer getAsn() {
        return asn;
    }

    /**
     * <p>
     * The autonomous system (AS) number for Border Gateway Protocol (BGP)
     * configuration.
     * </p>
     *
     * @param asn <p>
     *            The autonomous system (AS) number for Border Gateway Protocol
     *            (BGP) configuration.
     *            </p>
     */
    public void setAsn(Integer asn) {
        this.asn = asn;
    }

    /**
     * <p>
     * The autonomous system (AS) number for Border Gateway Protocol (BGP)
     * configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param asn <p>
     *            The autonomous system (AS) number for Border Gateway Protocol
     *            (BGP) configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BGPPeer withAsn(Integer asn) {
        this.asn = asn;
        return this;
    }

    /**
     * <p>
     * The authentication key for BGP configuration. This string has a minimum
     * length of 6 characters and and a maximun lenth of 80 characters.
     * </p>
     *
     * @return <p>
     *         The authentication key for BGP configuration. This string has a
     *         minimum length of 6 characters and and a maximun lenth of 80
     *         characters.
     *         </p>
     */
    public String getAuthKey() {
        return authKey;
    }

    /**
     * <p>
     * The authentication key for BGP configuration. This string has a minimum
     * length of 6 characters and and a maximun lenth of 80 characters.
     * </p>
     *
     * @param authKey <p>
     *            The authentication key for BGP configuration. This string has
     *            a minimum length of 6 characters and and a maximun lenth of 80
     *            characters.
     *            </p>
     */
    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }

    /**
     * <p>
     * The authentication key for BGP configuration. This string has a minimum
     * length of 6 characters and and a maximun lenth of 80 characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authKey <p>
     *            The authentication key for BGP configuration. This string has
     *            a minimum length of 6 characters and and a maximun lenth of 80
     *            characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BGPPeer withAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }

    /**
     * <p>
     * The address family for the BGP peer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipv4, ipv6
     *
     * @return <p>
     *         The address family for the BGP peer.
     *         </p>
     * @see AddressFamily
     */
    public String getAddressFamily() {
        return addressFamily;
    }

    /**
     * <p>
     * The address family for the BGP peer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipv4, ipv6
     *
     * @param addressFamily <p>
     *            The address family for the BGP peer.
     *            </p>
     * @see AddressFamily
     */
    public void setAddressFamily(String addressFamily) {
        this.addressFamily = addressFamily;
    }

    /**
     * <p>
     * The address family for the BGP peer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipv4, ipv6
     *
     * @param addressFamily <p>
     *            The address family for the BGP peer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AddressFamily
     */
    public BGPPeer withAddressFamily(String addressFamily) {
        this.addressFamily = addressFamily;
        return this;
    }

    /**
     * <p>
     * The address family for the BGP peer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipv4, ipv6
     *
     * @param addressFamily <p>
     *            The address family for the BGP peer.
     *            </p>
     * @see AddressFamily
     */
    public void setAddressFamily(AddressFamily addressFamily) {
        this.addressFamily = addressFamily.toString();
    }

    /**
     * <p>
     * The address family for the BGP peer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipv4, ipv6
     *
     * @param addressFamily <p>
     *            The address family for the BGP peer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AddressFamily
     */
    public BGPPeer withAddressFamily(AddressFamily addressFamily) {
        this.addressFamily = addressFamily.toString();
        return this;
    }

    /**
     * <p>
     * The IP address assigned to the Amazon interface.
     * </p>
     *
     * @return <p>
     *         The IP address assigned to the Amazon interface.
     *         </p>
     */
    public String getAmazonAddress() {
        return amazonAddress;
    }

    /**
     * <p>
     * The IP address assigned to the Amazon interface.
     * </p>
     *
     * @param amazonAddress <p>
     *            The IP address assigned to the Amazon interface.
     *            </p>
     */
    public void setAmazonAddress(String amazonAddress) {
        this.amazonAddress = amazonAddress;
    }

    /**
     * <p>
     * The IP address assigned to the Amazon interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param amazonAddress <p>
     *            The IP address assigned to the Amazon interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BGPPeer withAmazonAddress(String amazonAddress) {
        this.amazonAddress = amazonAddress;
        return this;
    }

    /**
     * <p>
     * The IP address assigned to the customer interface.
     * </p>
     *
     * @return <p>
     *         The IP address assigned to the customer interface.
     *         </p>
     */
    public String getCustomerAddress() {
        return customerAddress;
    }

    /**
     * <p>
     * The IP address assigned to the customer interface.
     * </p>
     *
     * @param customerAddress <p>
     *            The IP address assigned to the customer interface.
     *            </p>
     */
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    /**
     * <p>
     * The IP address assigned to the customer interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customerAddress <p>
     *            The IP address assigned to the customer interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BGPPeer withCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
        return this;
    }

    /**
     * <p>
     * The state of the BGP peer. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>verifying</code>: The BGP peering addresses or ASN require
     * validation before the BGP peer can be created. This state applies only to
     * public virtual interfaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The BGP peer is created, and remains in this state
     * until it is ready to be established.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The BGP peer is ready to be established.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The BGP peer is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The BGP peer is deleted and cannot be established.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>verifying, pending, available, deleting, deleted
     *
     * @return <p>
     *         The state of the BGP peer. The following are the possible values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>verifying</code>: The BGP peering addresses or ASN require
     *         validation before the BGP peer can be created. This state applies
     *         only to public virtual interfaces.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>pending</code>: The BGP peer is created, and remains in
     *         this state until it is ready to be established.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>available</code>: The BGP peer is ready to be established.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleting</code>: The BGP peer is being deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleted</code>: The BGP peer is deleted and cannot be
     *         established.
     *         </p>
     *         </li>
     *         </ul>
     * @see BGPPeerState
     */
    public String getBgpPeerState() {
        return bgpPeerState;
    }

    /**
     * <p>
     * The state of the BGP peer. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>verifying</code>: The BGP peering addresses or ASN require
     * validation before the BGP peer can be created. This state applies only to
     * public virtual interfaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The BGP peer is created, and remains in this state
     * until it is ready to be established.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The BGP peer is ready to be established.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The BGP peer is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The BGP peer is deleted and cannot be established.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>verifying, pending, available, deleting, deleted
     *
     * @param bgpPeerState <p>
     *            The state of the BGP peer. The following are the possible
     *            values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>verifying</code>: The BGP peering addresses or ASN
     *            require validation before the BGP peer can be created. This
     *            state applies only to public virtual interfaces.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>pending</code>: The BGP peer is created, and remains in
     *            this state until it is ready to be established.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>available</code>: The BGP peer is ready to be
     *            established.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleting</code>: The BGP peer is being deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleted</code>: The BGP peer is deleted and cannot be
     *            established.
     *            </p>
     *            </li>
     *            </ul>
     * @see BGPPeerState
     */
    public void setBgpPeerState(String bgpPeerState) {
        this.bgpPeerState = bgpPeerState;
    }

    /**
     * <p>
     * The state of the BGP peer. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>verifying</code>: The BGP peering addresses or ASN require
     * validation before the BGP peer can be created. This state applies only to
     * public virtual interfaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The BGP peer is created, and remains in this state
     * until it is ready to be established.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The BGP peer is ready to be established.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The BGP peer is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The BGP peer is deleted and cannot be established.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>verifying, pending, available, deleting, deleted
     *
     * @param bgpPeerState <p>
     *            The state of the BGP peer. The following are the possible
     *            values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>verifying</code>: The BGP peering addresses or ASN
     *            require validation before the BGP peer can be created. This
     *            state applies only to public virtual interfaces.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>pending</code>: The BGP peer is created, and remains in
     *            this state until it is ready to be established.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>available</code>: The BGP peer is ready to be
     *            established.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleting</code>: The BGP peer is being deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleted</code>: The BGP peer is deleted and cannot be
     *            established.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BGPPeerState
     */
    public BGPPeer withBgpPeerState(String bgpPeerState) {
        this.bgpPeerState = bgpPeerState;
        return this;
    }

    /**
     * <p>
     * The state of the BGP peer. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>verifying</code>: The BGP peering addresses or ASN require
     * validation before the BGP peer can be created. This state applies only to
     * public virtual interfaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The BGP peer is created, and remains in this state
     * until it is ready to be established.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The BGP peer is ready to be established.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The BGP peer is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The BGP peer is deleted and cannot be established.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>verifying, pending, available, deleting, deleted
     *
     * @param bgpPeerState <p>
     *            The state of the BGP peer. The following are the possible
     *            values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>verifying</code>: The BGP peering addresses or ASN
     *            require validation before the BGP peer can be created. This
     *            state applies only to public virtual interfaces.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>pending</code>: The BGP peer is created, and remains in
     *            this state until it is ready to be established.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>available</code>: The BGP peer is ready to be
     *            established.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleting</code>: The BGP peer is being deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleted</code>: The BGP peer is deleted and cannot be
     *            established.
     *            </p>
     *            </li>
     *            </ul>
     * @see BGPPeerState
     */
    public void setBgpPeerState(BGPPeerState bgpPeerState) {
        this.bgpPeerState = bgpPeerState.toString();
    }

    /**
     * <p>
     * The state of the BGP peer. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>verifying</code>: The BGP peering addresses or ASN require
     * validation before the BGP peer can be created. This state applies only to
     * public virtual interfaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The BGP peer is created, and remains in this state
     * until it is ready to be established.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The BGP peer is ready to be established.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The BGP peer is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The BGP peer is deleted and cannot be established.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>verifying, pending, available, deleting, deleted
     *
     * @param bgpPeerState <p>
     *            The state of the BGP peer. The following are the possible
     *            values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>verifying</code>: The BGP peering addresses or ASN
     *            require validation before the BGP peer can be created. This
     *            state applies only to public virtual interfaces.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>pending</code>: The BGP peer is created, and remains in
     *            this state until it is ready to be established.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>available</code>: The BGP peer is ready to be
     *            established.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleting</code>: The BGP peer is being deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleted</code>: The BGP peer is deleted and cannot be
     *            established.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BGPPeerState
     */
    public BGPPeer withBgpPeerState(BGPPeerState bgpPeerState) {
        this.bgpPeerState = bgpPeerState.toString();
        return this;
    }

    /**
     * <p>
     * The status of the BGP peer. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>up</code>: The BGP peer is established. This state does not
     * indicate the state of the routing function. Ensure that you are receiving
     * routes over the BGP session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: The BGP peer is down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The BGP peer status is not available.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>up, down, unknown
     *
     * @return <p>
     *         The status of the BGP peer. The following are the possible
     *         values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>up</code>: The BGP peer is established. This state does not
     *         indicate the state of the routing function. Ensure that you are
     *         receiving routes over the BGP session.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>down</code>: The BGP peer is down.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>unknown</code>: The BGP peer status is not available.
     *         </p>
     *         </li>
     *         </ul>
     * @see BGPStatus
     */
    public String getBgpStatus() {
        return bgpStatus;
    }

    /**
     * <p>
     * The status of the BGP peer. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>up</code>: The BGP peer is established. This state does not
     * indicate the state of the routing function. Ensure that you are receiving
     * routes over the BGP session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: The BGP peer is down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The BGP peer status is not available.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>up, down, unknown
     *
     * @param bgpStatus <p>
     *            The status of the BGP peer. The following are the possible
     *            values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>up</code>: The BGP peer is established. This state does
     *            not indicate the state of the routing function. Ensure that
     *            you are receiving routes over the BGP session.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>down</code>: The BGP peer is down.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>unknown</code>: The BGP peer status is not available.
     *            </p>
     *            </li>
     *            </ul>
     * @see BGPStatus
     */
    public void setBgpStatus(String bgpStatus) {
        this.bgpStatus = bgpStatus;
    }

    /**
     * <p>
     * The status of the BGP peer. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>up</code>: The BGP peer is established. This state does not
     * indicate the state of the routing function. Ensure that you are receiving
     * routes over the BGP session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: The BGP peer is down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The BGP peer status is not available.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>up, down, unknown
     *
     * @param bgpStatus <p>
     *            The status of the BGP peer. The following are the possible
     *            values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>up</code>: The BGP peer is established. This state does
     *            not indicate the state of the routing function. Ensure that
     *            you are receiving routes over the BGP session.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>down</code>: The BGP peer is down.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>unknown</code>: The BGP peer status is not available.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BGPStatus
     */
    public BGPPeer withBgpStatus(String bgpStatus) {
        this.bgpStatus = bgpStatus;
        return this;
    }

    /**
     * <p>
     * The status of the BGP peer. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>up</code>: The BGP peer is established. This state does not
     * indicate the state of the routing function. Ensure that you are receiving
     * routes over the BGP session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: The BGP peer is down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The BGP peer status is not available.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>up, down, unknown
     *
     * @param bgpStatus <p>
     *            The status of the BGP peer. The following are the possible
     *            values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>up</code>: The BGP peer is established. This state does
     *            not indicate the state of the routing function. Ensure that
     *            you are receiving routes over the BGP session.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>down</code>: The BGP peer is down.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>unknown</code>: The BGP peer status is not available.
     *            </p>
     *            </li>
     *            </ul>
     * @see BGPStatus
     */
    public void setBgpStatus(BGPStatus bgpStatus) {
        this.bgpStatus = bgpStatus.toString();
    }

    /**
     * <p>
     * The status of the BGP peer. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>up</code>: The BGP peer is established. This state does not
     * indicate the state of the routing function. Ensure that you are receiving
     * routes over the BGP session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: The BGP peer is down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The BGP peer status is not available.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>up, down, unknown
     *
     * @param bgpStatus <p>
     *            The status of the BGP peer. The following are the possible
     *            values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>up</code>: The BGP peer is established. This state does
     *            not indicate the state of the routing function. Ensure that
     *            you are receiving routes over the BGP session.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>down</code>: The BGP peer is down.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>unknown</code>: The BGP peer status is not available.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BGPStatus
     */
    public BGPPeer withBgpStatus(BGPStatus bgpStatus) {
        this.bgpStatus = bgpStatus.toString();
        return this;
    }

    /**
     * <p>
     * The Direct Connect endpoint on which the BGP peer terminates.
     * </p>
     *
     * @return <p>
     *         The Direct Connect endpoint on which the BGP peer terminates.
     *         </p>
     */
    public String getAwsDeviceV2() {
        return awsDeviceV2;
    }

    /**
     * <p>
     * The Direct Connect endpoint on which the BGP peer terminates.
     * </p>
     *
     * @param awsDeviceV2 <p>
     *            The Direct Connect endpoint on which the BGP peer terminates.
     *            </p>
     */
    public void setAwsDeviceV2(String awsDeviceV2) {
        this.awsDeviceV2 = awsDeviceV2;
    }

    /**
     * <p>
     * The Direct Connect endpoint on which the BGP peer terminates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsDeviceV2 <p>
     *            The Direct Connect endpoint on which the BGP peer terminates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BGPPeer withAwsDeviceV2(String awsDeviceV2) {
        this.awsDeviceV2 = awsDeviceV2;
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
        if (getBgpPeerId() != null)
            sb.append("bgpPeerId: " + getBgpPeerId() + ",");
        if (getAsn() != null)
            sb.append("asn: " + getAsn() + ",");
        if (getAuthKey() != null)
            sb.append("authKey: " + getAuthKey() + ",");
        if (getAddressFamily() != null)
            sb.append("addressFamily: " + getAddressFamily() + ",");
        if (getAmazonAddress() != null)
            sb.append("amazonAddress: " + getAmazonAddress() + ",");
        if (getCustomerAddress() != null)
            sb.append("customerAddress: " + getCustomerAddress() + ",");
        if (getBgpPeerState() != null)
            sb.append("bgpPeerState: " + getBgpPeerState() + ",");
        if (getBgpStatus() != null)
            sb.append("bgpStatus: " + getBgpStatus() + ",");
        if (getAwsDeviceV2() != null)
            sb.append("awsDeviceV2: " + getAwsDeviceV2());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBgpPeerId() == null) ? 0 : getBgpPeerId().hashCode());
        hashCode = prime * hashCode + ((getAsn() == null) ? 0 : getAsn().hashCode());
        hashCode = prime * hashCode + ((getAuthKey() == null) ? 0 : getAuthKey().hashCode());
        hashCode = prime * hashCode
                + ((getAddressFamily() == null) ? 0 : getAddressFamily().hashCode());
        hashCode = prime * hashCode
                + ((getAmazonAddress() == null) ? 0 : getAmazonAddress().hashCode());
        hashCode = prime * hashCode
                + ((getCustomerAddress() == null) ? 0 : getCustomerAddress().hashCode());
        hashCode = prime * hashCode
                + ((getBgpPeerState() == null) ? 0 : getBgpPeerState().hashCode());
        hashCode = prime * hashCode + ((getBgpStatus() == null) ? 0 : getBgpStatus().hashCode());
        hashCode = prime * hashCode
                + ((getAwsDeviceV2() == null) ? 0 : getAwsDeviceV2().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BGPPeer == false)
            return false;
        BGPPeer other = (BGPPeer) obj;

        if (other.getBgpPeerId() == null ^ this.getBgpPeerId() == null)
            return false;
        if (other.getBgpPeerId() != null
                && other.getBgpPeerId().equals(this.getBgpPeerId()) == false)
            return false;
        if (other.getAsn() == null ^ this.getAsn() == null)
            return false;
        if (other.getAsn() != null && other.getAsn().equals(this.getAsn()) == false)
            return false;
        if (other.getAuthKey() == null ^ this.getAuthKey() == null)
            return false;
        if (other.getAuthKey() != null && other.getAuthKey().equals(this.getAuthKey()) == false)
            return false;
        if (other.getAddressFamily() == null ^ this.getAddressFamily() == null)
            return false;
        if (other.getAddressFamily() != null
                && other.getAddressFamily().equals(this.getAddressFamily()) == false)
            return false;
        if (other.getAmazonAddress() == null ^ this.getAmazonAddress() == null)
            return false;
        if (other.getAmazonAddress() != null
                && other.getAmazonAddress().equals(this.getAmazonAddress()) == false)
            return false;
        if (other.getCustomerAddress() == null ^ this.getCustomerAddress() == null)
            return false;
        if (other.getCustomerAddress() != null
                && other.getCustomerAddress().equals(this.getCustomerAddress()) == false)
            return false;
        if (other.getBgpPeerState() == null ^ this.getBgpPeerState() == null)
            return false;
        if (other.getBgpPeerState() != null
                && other.getBgpPeerState().equals(this.getBgpPeerState()) == false)
            return false;
        if (other.getBgpStatus() == null ^ this.getBgpStatus() == null)
            return false;
        if (other.getBgpStatus() != null
                && other.getBgpStatus().equals(this.getBgpStatus()) == false)
            return false;
        if (other.getAwsDeviceV2() == null ^ this.getAwsDeviceV2() == null)
            return false;
        if (other.getAwsDeviceV2() != null
                && other.getAwsDeviceV2().equals(this.getAwsDeviceV2()) == false)
            return false;
        return true;
    }
}
