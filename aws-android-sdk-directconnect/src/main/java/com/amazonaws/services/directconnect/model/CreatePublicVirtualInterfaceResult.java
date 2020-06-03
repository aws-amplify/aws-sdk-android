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
 * Information about a virtual interface.
 * </p>
 */
public class CreatePublicVirtualInterfaceResult implements Serializable {
    /**
     * <p>
     * The ID of the AWS account that owns the virtual interface.
     * </p>
     */
    private String ownerAccount;

    /**
     * <p>
     * The ID of the virtual interface.
     * </p>
     */
    private String virtualInterfaceId;

    /**
     * <p>
     * The location of the connection.
     * </p>
     */
    private String location;

    /**
     * <p>
     * The ID of the connection.
     * </p>
     */
    private String connectionId;

    /**
     * <p>
     * The type of virtual interface. The possible values are
     * <code>private</code> and <code>public</code>.
     * </p>
     */
    private String virtualInterfaceType;

    /**
     * <p>
     * The name of the virtual interface assigned by the customer network. The
     * name has a maximum of 100 characters. The following are valid characters:
     * a-z, 0-9 and a hyphen (-).
     * </p>
     */
    private String virtualInterfaceName;

    /**
     * <p>
     * The ID of the VLAN.
     * </p>
     */
    private Integer vlan;

    /**
     * <p>
     * The autonomous system (AS) number for Border Gateway Protocol (BGP)
     * configuration.
     * </p>
     * <p>
     * The valid values are 1-2147483647.
     * </p>
     */
    private Integer asn;

    /**
     * <p>
     * The autonomous system number (ASN) for the Amazon side of the connection.
     * </p>
     */
    private Long amazonSideAsn;

    /**
     * <p>
     * The authentication key for BGP configuration. This string has a minimum
     * length of 6 characters and and a maximun lenth of 80 characters.
     * </p>
     */
    private String authKey;

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
     * The address family for the BGP peer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipv4, ipv6
     */
    private String addressFamily;

    /**
     * <p>
     * The state of the virtual interface. The following are the possible
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>confirming</code>: The creation of the virtual interface is pending
     * confirmation from the virtual interface owner. If the owner of the
     * virtual interface is different from the owner of the connection on which
     * it is provisioned, then the virtual interface will remain in this state
     * until it is confirmed by the virtual interface owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>verifying</code>: This state only applies to public virtual
     * interfaces. Each public virtual interface needs validation before the
     * virtual interface can be created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: A virtual interface is in this state from the time
     * that it is created until the virtual interface is ready to forward
     * traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: A virtual interface that is able to forward
     * traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: A virtual interface that is BGP down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: A virtual interface is in this state immediately
     * after calling <a>DeleteVirtualInterface</a> until it can no longer
     * forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: A virtual interface that cannot forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rejected</code>: The virtual interface owner has declined creation
     * of the virtual interface. If a virtual interface in the
     * <code>Confirming</code> state is deleted by the virtual interface owner,
     * the virtual interface enters the <code>Rejected</code> state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the virtual interface is not
     * available.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>confirming, verifying, pending, available, down,
     * deleting, deleted, rejected, unknown
     */
    private String virtualInterfaceState;

    /**
     * <p>
     * The customer router configuration.
     * </p>
     */
    private String customerRouterConfig;

    /**
     * <p>
     * The maximum transmission unit (MTU), in bytes. The supported values are
     * 1500 and 9001. The default value is 1500.
     * </p>
     */
    private Integer mtu;

    /**
     * <p>
     * Indicates whether jumbo frames (9001 MTU) are supported.
     * </p>
     */
    private Boolean jumboFrameCapable;

    /**
     * <p>
     * The ID of the virtual private gateway. Applies only to private virtual
     * interfaces.
     * </p>
     */
    private String virtualGatewayId;

    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     */
    private String directConnectGatewayId;

    /**
     * <p>
     * The routes to be advertised to the AWS network in this Region. Applies to
     * public virtual interfaces.
     * </p>
     */
    private java.util.List<RouteFilterPrefix> routeFilterPrefixes;

    /**
     * <p>
     * The BGP peers configured on this virtual interface.
     * </p>
     */
    private java.util.List<BGPPeer> bgpPeers;

    /**
     * <p>
     * The AWS Region where the virtual interface is located.
     * </p>
     */
    private String region;

    /**
     * <p>
     * The Direct Connect endpoint on which the virtual interface terminates.
     * </p>
     */
    private String awsDeviceV2;

    /**
     * <p>
     * The tags associated with the virtual interface.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of the AWS account that owns the virtual interface.
     * </p>
     *
     * @return <p>
     *         The ID of the AWS account that owns the virtual interface.
     *         </p>
     */
    public String getOwnerAccount() {
        return ownerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the virtual interface.
     * </p>
     *
     * @param ownerAccount <p>
     *            The ID of the AWS account that owns the virtual interface.
     *            </p>
     */
    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the virtual interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerAccount <p>
     *            The ID of the AWS account that owns the virtual interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePublicVirtualInterfaceResult withOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }

    /**
     * <p>
     * The ID of the virtual interface.
     * </p>
     *
     * @return <p>
     *         The ID of the virtual interface.
     *         </p>
     */
    public String getVirtualInterfaceId() {
        return virtualInterfaceId;
    }

    /**
     * <p>
     * The ID of the virtual interface.
     * </p>
     *
     * @param virtualInterfaceId <p>
     *            The ID of the virtual interface.
     *            </p>
     */
    public void setVirtualInterfaceId(String virtualInterfaceId) {
        this.virtualInterfaceId = virtualInterfaceId;
    }

    /**
     * <p>
     * The ID of the virtual interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param virtualInterfaceId <p>
     *            The ID of the virtual interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePublicVirtualInterfaceResult withVirtualInterfaceId(String virtualInterfaceId) {
        this.virtualInterfaceId = virtualInterfaceId;
        return this;
    }

    /**
     * <p>
     * The location of the connection.
     * </p>
     *
     * @return <p>
     *         The location of the connection.
     *         </p>
     */
    public String getLocation() {
        return location;
    }

    /**
     * <p>
     * The location of the connection.
     * </p>
     *
     * @param location <p>
     *            The location of the connection.
     *            </p>
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The location of the connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param location <p>
     *            The location of the connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePublicVirtualInterfaceResult withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * <p>
     * The ID of the connection.
     * </p>
     *
     * @return <p>
     *         The ID of the connection.
     *         </p>
     */
    public String getConnectionId() {
        return connectionId;
    }

    /**
     * <p>
     * The ID of the connection.
     * </p>
     *
     * @param connectionId <p>
     *            The ID of the connection.
     *            </p>
     */
    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * <p>
     * The ID of the connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionId <p>
     *            The ID of the connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePublicVirtualInterfaceResult withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * <p>
     * The type of virtual interface. The possible values are
     * <code>private</code> and <code>public</code>.
     * </p>
     *
     * @return <p>
     *         The type of virtual interface. The possible values are
     *         <code>private</code> and <code>public</code>.
     *         </p>
     */
    public String getVirtualInterfaceType() {
        return virtualInterfaceType;
    }

    /**
     * <p>
     * The type of virtual interface. The possible values are
     * <code>private</code> and <code>public</code>.
     * </p>
     *
     * @param virtualInterfaceType <p>
     *            The type of virtual interface. The possible values are
     *            <code>private</code> and <code>public</code>.
     *            </p>
     */
    public void setVirtualInterfaceType(String virtualInterfaceType) {
        this.virtualInterfaceType = virtualInterfaceType;
    }

    /**
     * <p>
     * The type of virtual interface. The possible values are
     * <code>private</code> and <code>public</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param virtualInterfaceType <p>
     *            The type of virtual interface. The possible values are
     *            <code>private</code> and <code>public</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePublicVirtualInterfaceResult withVirtualInterfaceType(String virtualInterfaceType) {
        this.virtualInterfaceType = virtualInterfaceType;
        return this;
    }

    /**
     * <p>
     * The name of the virtual interface assigned by the customer network. The
     * name has a maximum of 100 characters. The following are valid characters:
     * a-z, 0-9 and a hyphen (-).
     * </p>
     *
     * @return <p>
     *         The name of the virtual interface assigned by the customer
     *         network. The name has a maximum of 100 characters. The following
     *         are valid characters: a-z, 0-9 and a hyphen (-).
     *         </p>
     */
    public String getVirtualInterfaceName() {
        return virtualInterfaceName;
    }

    /**
     * <p>
     * The name of the virtual interface assigned by the customer network. The
     * name has a maximum of 100 characters. The following are valid characters:
     * a-z, 0-9 and a hyphen (-).
     * </p>
     *
     * @param virtualInterfaceName <p>
     *            The name of the virtual interface assigned by the customer
     *            network. The name has a maximum of 100 characters. The
     *            following are valid characters: a-z, 0-9 and a hyphen (-).
     *            </p>
     */
    public void setVirtualInterfaceName(String virtualInterfaceName) {
        this.virtualInterfaceName = virtualInterfaceName;
    }

    /**
     * <p>
     * The name of the virtual interface assigned by the customer network. The
     * name has a maximum of 100 characters. The following are valid characters:
     * a-z, 0-9 and a hyphen (-).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param virtualInterfaceName <p>
     *            The name of the virtual interface assigned by the customer
     *            network. The name has a maximum of 100 characters. The
     *            following are valid characters: a-z, 0-9 and a hyphen (-).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePublicVirtualInterfaceResult withVirtualInterfaceName(String virtualInterfaceName) {
        this.virtualInterfaceName = virtualInterfaceName;
        return this;
    }

    /**
     * <p>
     * The ID of the VLAN.
     * </p>
     *
     * @return <p>
     *         The ID of the VLAN.
     *         </p>
     */
    public Integer getVlan() {
        return vlan;
    }

    /**
     * <p>
     * The ID of the VLAN.
     * </p>
     *
     * @param vlan <p>
     *            The ID of the VLAN.
     *            </p>
     */
    public void setVlan(Integer vlan) {
        this.vlan = vlan;
    }

    /**
     * <p>
     * The ID of the VLAN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vlan <p>
     *            The ID of the VLAN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePublicVirtualInterfaceResult withVlan(Integer vlan) {
        this.vlan = vlan;
        return this;
    }

    /**
     * <p>
     * The autonomous system (AS) number for Border Gateway Protocol (BGP)
     * configuration.
     * </p>
     * <p>
     * The valid values are 1-2147483647.
     * </p>
     *
     * @return <p>
     *         The autonomous system (AS) number for Border Gateway Protocol
     *         (BGP) configuration.
     *         </p>
     *         <p>
     *         The valid values are 1-2147483647.
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
     * <p>
     * The valid values are 1-2147483647.
     * </p>
     *
     * @param asn <p>
     *            The autonomous system (AS) number for Border Gateway Protocol
     *            (BGP) configuration.
     *            </p>
     *            <p>
     *            The valid values are 1-2147483647.
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
     * The valid values are 1-2147483647.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param asn <p>
     *            The autonomous system (AS) number for Border Gateway Protocol
     *            (BGP) configuration.
     *            </p>
     *            <p>
     *            The valid values are 1-2147483647.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePublicVirtualInterfaceResult withAsn(Integer asn) {
        this.asn = asn;
        return this;
    }

    /**
     * <p>
     * The autonomous system number (ASN) for the Amazon side of the connection.
     * </p>
     *
     * @return <p>
     *         The autonomous system number (ASN) for the Amazon side of the
     *         connection.
     *         </p>
     */
    public Long getAmazonSideAsn() {
        return amazonSideAsn;
    }

    /**
     * <p>
     * The autonomous system number (ASN) for the Amazon side of the connection.
     * </p>
     *
     * @param amazonSideAsn <p>
     *            The autonomous system number (ASN) for the Amazon side of the
     *            connection.
     *            </p>
     */
    public void setAmazonSideAsn(Long amazonSideAsn) {
        this.amazonSideAsn = amazonSideAsn;
    }

    /**
     * <p>
     * The autonomous system number (ASN) for the Amazon side of the connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param amazonSideAsn <p>
     *            The autonomous system number (ASN) for the Amazon side of the
     *            connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePublicVirtualInterfaceResult withAmazonSideAsn(Long amazonSideAsn) {
        this.amazonSideAsn = amazonSideAsn;
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
    public CreatePublicVirtualInterfaceResult withAuthKey(String authKey) {
        this.authKey = authKey;
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
    public CreatePublicVirtualInterfaceResult withAmazonAddress(String amazonAddress) {
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
    public CreatePublicVirtualInterfaceResult withCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
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
    public CreatePublicVirtualInterfaceResult withAddressFamily(String addressFamily) {
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
    public CreatePublicVirtualInterfaceResult withAddressFamily(AddressFamily addressFamily) {
        this.addressFamily = addressFamily.toString();
        return this;
    }

    /**
     * <p>
     * The state of the virtual interface. The following are the possible
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>confirming</code>: The creation of the virtual interface is pending
     * confirmation from the virtual interface owner. If the owner of the
     * virtual interface is different from the owner of the connection on which
     * it is provisioned, then the virtual interface will remain in this state
     * until it is confirmed by the virtual interface owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>verifying</code>: This state only applies to public virtual
     * interfaces. Each public virtual interface needs validation before the
     * virtual interface can be created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: A virtual interface is in this state from the time
     * that it is created until the virtual interface is ready to forward
     * traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: A virtual interface that is able to forward
     * traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: A virtual interface that is BGP down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: A virtual interface is in this state immediately
     * after calling <a>DeleteVirtualInterface</a> until it can no longer
     * forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: A virtual interface that cannot forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rejected</code>: The virtual interface owner has declined creation
     * of the virtual interface. If a virtual interface in the
     * <code>Confirming</code> state is deleted by the virtual interface owner,
     * the virtual interface enters the <code>Rejected</code> state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the virtual interface is not
     * available.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>confirming, verifying, pending, available, down,
     * deleting, deleted, rejected, unknown
     *
     * @return <p>
     *         The state of the virtual interface. The following are the
     *         possible values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>confirming</code>: The creation of the virtual interface is
     *         pending confirmation from the virtual interface owner. If the
     *         owner of the virtual interface is different from the owner of the
     *         connection on which it is provisioned, then the virtual interface
     *         will remain in this state until it is confirmed by the virtual
     *         interface owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>verifying</code>: This state only applies to public virtual
     *         interfaces. Each public virtual interface needs validation before
     *         the virtual interface can be created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>pending</code>: A virtual interface is in this state from
     *         the time that it is created until the virtual interface is ready
     *         to forward traffic.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>available</code>: A virtual interface that is able to
     *         forward traffic.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>down</code>: A virtual interface that is BGP down.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleting</code>: A virtual interface is in this state
     *         immediately after calling <a>DeleteVirtualInterface</a> until it
     *         can no longer forward traffic.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleted</code>: A virtual interface that cannot forward
     *         traffic.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>rejected</code>: The virtual interface owner has declined
     *         creation of the virtual interface. If a virtual interface in the
     *         <code>Confirming</code> state is deleted by the virtual interface
     *         owner, the virtual interface enters the <code>Rejected</code>
     *         state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>unknown</code>: The state of the virtual interface is not
     *         available.
     *         </p>
     *         </li>
     *         </ul>
     * @see VirtualInterfaceState
     */
    public String getVirtualInterfaceState() {
        return virtualInterfaceState;
    }

    /**
     * <p>
     * The state of the virtual interface. The following are the possible
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>confirming</code>: The creation of the virtual interface is pending
     * confirmation from the virtual interface owner. If the owner of the
     * virtual interface is different from the owner of the connection on which
     * it is provisioned, then the virtual interface will remain in this state
     * until it is confirmed by the virtual interface owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>verifying</code>: This state only applies to public virtual
     * interfaces. Each public virtual interface needs validation before the
     * virtual interface can be created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: A virtual interface is in this state from the time
     * that it is created until the virtual interface is ready to forward
     * traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: A virtual interface that is able to forward
     * traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: A virtual interface that is BGP down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: A virtual interface is in this state immediately
     * after calling <a>DeleteVirtualInterface</a> until it can no longer
     * forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: A virtual interface that cannot forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rejected</code>: The virtual interface owner has declined creation
     * of the virtual interface. If a virtual interface in the
     * <code>Confirming</code> state is deleted by the virtual interface owner,
     * the virtual interface enters the <code>Rejected</code> state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the virtual interface is not
     * available.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>confirming, verifying, pending, available, down,
     * deleting, deleted, rejected, unknown
     *
     * @param virtualInterfaceState <p>
     *            The state of the virtual interface. The following are the
     *            possible values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>confirming</code>: The creation of the virtual interface
     *            is pending confirmation from the virtual interface owner. If
     *            the owner of the virtual interface is different from the owner
     *            of the connection on which it is provisioned, then the virtual
     *            interface will remain in this state until it is confirmed by
     *            the virtual interface owner.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>verifying</code>: This state only applies to public
     *            virtual interfaces. Each public virtual interface needs
     *            validation before the virtual interface can be created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>pending</code>: A virtual interface is in this state
     *            from the time that it is created until the virtual interface
     *            is ready to forward traffic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>available</code>: A virtual interface that is able to
     *            forward traffic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>down</code>: A virtual interface that is BGP down.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleting</code>: A virtual interface is in this state
     *            immediately after calling <a>DeleteVirtualInterface</a> until
     *            it can no longer forward traffic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleted</code>: A virtual interface that cannot forward
     *            traffic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>rejected</code>: The virtual interface owner has
     *            declined creation of the virtual interface. If a virtual
     *            interface in the <code>Confirming</code> state is deleted by
     *            the virtual interface owner, the virtual interface enters the
     *            <code>Rejected</code> state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>unknown</code>: The state of the virtual interface is
     *            not available.
     *            </p>
     *            </li>
     *            </ul>
     * @see VirtualInterfaceState
     */
    public void setVirtualInterfaceState(String virtualInterfaceState) {
        this.virtualInterfaceState = virtualInterfaceState;
    }

    /**
     * <p>
     * The state of the virtual interface. The following are the possible
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>confirming</code>: The creation of the virtual interface is pending
     * confirmation from the virtual interface owner. If the owner of the
     * virtual interface is different from the owner of the connection on which
     * it is provisioned, then the virtual interface will remain in this state
     * until it is confirmed by the virtual interface owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>verifying</code>: This state only applies to public virtual
     * interfaces. Each public virtual interface needs validation before the
     * virtual interface can be created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: A virtual interface is in this state from the time
     * that it is created until the virtual interface is ready to forward
     * traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: A virtual interface that is able to forward
     * traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: A virtual interface that is BGP down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: A virtual interface is in this state immediately
     * after calling <a>DeleteVirtualInterface</a> until it can no longer
     * forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: A virtual interface that cannot forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rejected</code>: The virtual interface owner has declined creation
     * of the virtual interface. If a virtual interface in the
     * <code>Confirming</code> state is deleted by the virtual interface owner,
     * the virtual interface enters the <code>Rejected</code> state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the virtual interface is not
     * available.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>confirming, verifying, pending, available, down,
     * deleting, deleted, rejected, unknown
     *
     * @param virtualInterfaceState <p>
     *            The state of the virtual interface. The following are the
     *            possible values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>confirming</code>: The creation of the virtual interface
     *            is pending confirmation from the virtual interface owner. If
     *            the owner of the virtual interface is different from the owner
     *            of the connection on which it is provisioned, then the virtual
     *            interface will remain in this state until it is confirmed by
     *            the virtual interface owner.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>verifying</code>: This state only applies to public
     *            virtual interfaces. Each public virtual interface needs
     *            validation before the virtual interface can be created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>pending</code>: A virtual interface is in this state
     *            from the time that it is created until the virtual interface
     *            is ready to forward traffic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>available</code>: A virtual interface that is able to
     *            forward traffic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>down</code>: A virtual interface that is BGP down.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleting</code>: A virtual interface is in this state
     *            immediately after calling <a>DeleteVirtualInterface</a> until
     *            it can no longer forward traffic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleted</code>: A virtual interface that cannot forward
     *            traffic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>rejected</code>: The virtual interface owner has
     *            declined creation of the virtual interface. If a virtual
     *            interface in the <code>Confirming</code> state is deleted by
     *            the virtual interface owner, the virtual interface enters the
     *            <code>Rejected</code> state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>unknown</code>: The state of the virtual interface is
     *            not available.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VirtualInterfaceState
     */
    public CreatePublicVirtualInterfaceResult withVirtualInterfaceState(String virtualInterfaceState) {
        this.virtualInterfaceState = virtualInterfaceState;
        return this;
    }

    /**
     * <p>
     * The state of the virtual interface. The following are the possible
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>confirming</code>: The creation of the virtual interface is pending
     * confirmation from the virtual interface owner. If the owner of the
     * virtual interface is different from the owner of the connection on which
     * it is provisioned, then the virtual interface will remain in this state
     * until it is confirmed by the virtual interface owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>verifying</code>: This state only applies to public virtual
     * interfaces. Each public virtual interface needs validation before the
     * virtual interface can be created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: A virtual interface is in this state from the time
     * that it is created until the virtual interface is ready to forward
     * traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: A virtual interface that is able to forward
     * traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: A virtual interface that is BGP down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: A virtual interface is in this state immediately
     * after calling <a>DeleteVirtualInterface</a> until it can no longer
     * forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: A virtual interface that cannot forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rejected</code>: The virtual interface owner has declined creation
     * of the virtual interface. If a virtual interface in the
     * <code>Confirming</code> state is deleted by the virtual interface owner,
     * the virtual interface enters the <code>Rejected</code> state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the virtual interface is not
     * available.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>confirming, verifying, pending, available, down,
     * deleting, deleted, rejected, unknown
     *
     * @param virtualInterfaceState <p>
     *            The state of the virtual interface. The following are the
     *            possible values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>confirming</code>: The creation of the virtual interface
     *            is pending confirmation from the virtual interface owner. If
     *            the owner of the virtual interface is different from the owner
     *            of the connection on which it is provisioned, then the virtual
     *            interface will remain in this state until it is confirmed by
     *            the virtual interface owner.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>verifying</code>: This state only applies to public
     *            virtual interfaces. Each public virtual interface needs
     *            validation before the virtual interface can be created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>pending</code>: A virtual interface is in this state
     *            from the time that it is created until the virtual interface
     *            is ready to forward traffic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>available</code>: A virtual interface that is able to
     *            forward traffic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>down</code>: A virtual interface that is BGP down.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleting</code>: A virtual interface is in this state
     *            immediately after calling <a>DeleteVirtualInterface</a> until
     *            it can no longer forward traffic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleted</code>: A virtual interface that cannot forward
     *            traffic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>rejected</code>: The virtual interface owner has
     *            declined creation of the virtual interface. If a virtual
     *            interface in the <code>Confirming</code> state is deleted by
     *            the virtual interface owner, the virtual interface enters the
     *            <code>Rejected</code> state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>unknown</code>: The state of the virtual interface is
     *            not available.
     *            </p>
     *            </li>
     *            </ul>
     * @see VirtualInterfaceState
     */
    public void setVirtualInterfaceState(VirtualInterfaceState virtualInterfaceState) {
        this.virtualInterfaceState = virtualInterfaceState.toString();
    }

    /**
     * <p>
     * The state of the virtual interface. The following are the possible
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>confirming</code>: The creation of the virtual interface is pending
     * confirmation from the virtual interface owner. If the owner of the
     * virtual interface is different from the owner of the connection on which
     * it is provisioned, then the virtual interface will remain in this state
     * until it is confirmed by the virtual interface owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>verifying</code>: This state only applies to public virtual
     * interfaces. Each public virtual interface needs validation before the
     * virtual interface can be created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: A virtual interface is in this state from the time
     * that it is created until the virtual interface is ready to forward
     * traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: A virtual interface that is able to forward
     * traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: A virtual interface that is BGP down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: A virtual interface is in this state immediately
     * after calling <a>DeleteVirtualInterface</a> until it can no longer
     * forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: A virtual interface that cannot forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rejected</code>: The virtual interface owner has declined creation
     * of the virtual interface. If a virtual interface in the
     * <code>Confirming</code> state is deleted by the virtual interface owner,
     * the virtual interface enters the <code>Rejected</code> state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the virtual interface is not
     * available.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>confirming, verifying, pending, available, down,
     * deleting, deleted, rejected, unknown
     *
     * @param virtualInterfaceState <p>
     *            The state of the virtual interface. The following are the
     *            possible values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>confirming</code>: The creation of the virtual interface
     *            is pending confirmation from the virtual interface owner. If
     *            the owner of the virtual interface is different from the owner
     *            of the connection on which it is provisioned, then the virtual
     *            interface will remain in this state until it is confirmed by
     *            the virtual interface owner.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>verifying</code>: This state only applies to public
     *            virtual interfaces. Each public virtual interface needs
     *            validation before the virtual interface can be created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>pending</code>: A virtual interface is in this state
     *            from the time that it is created until the virtual interface
     *            is ready to forward traffic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>available</code>: A virtual interface that is able to
     *            forward traffic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>down</code>: A virtual interface that is BGP down.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleting</code>: A virtual interface is in this state
     *            immediately after calling <a>DeleteVirtualInterface</a> until
     *            it can no longer forward traffic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleted</code>: A virtual interface that cannot forward
     *            traffic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>rejected</code>: The virtual interface owner has
     *            declined creation of the virtual interface. If a virtual
     *            interface in the <code>Confirming</code> state is deleted by
     *            the virtual interface owner, the virtual interface enters the
     *            <code>Rejected</code> state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>unknown</code>: The state of the virtual interface is
     *            not available.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VirtualInterfaceState
     */
    public CreatePublicVirtualInterfaceResult withVirtualInterfaceState(
            VirtualInterfaceState virtualInterfaceState) {
        this.virtualInterfaceState = virtualInterfaceState.toString();
        return this;
    }

    /**
     * <p>
     * The customer router configuration.
     * </p>
     *
     * @return <p>
     *         The customer router configuration.
     *         </p>
     */
    public String getCustomerRouterConfig() {
        return customerRouterConfig;
    }

    /**
     * <p>
     * The customer router configuration.
     * </p>
     *
     * @param customerRouterConfig <p>
     *            The customer router configuration.
     *            </p>
     */
    public void setCustomerRouterConfig(String customerRouterConfig) {
        this.customerRouterConfig = customerRouterConfig;
    }

    /**
     * <p>
     * The customer router configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customerRouterConfig <p>
     *            The customer router configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePublicVirtualInterfaceResult withCustomerRouterConfig(String customerRouterConfig) {
        this.customerRouterConfig = customerRouterConfig;
        return this;
    }

    /**
     * <p>
     * The maximum transmission unit (MTU), in bytes. The supported values are
     * 1500 and 9001. The default value is 1500.
     * </p>
     *
     * @return <p>
     *         The maximum transmission unit (MTU), in bytes. The supported
     *         values are 1500 and 9001. The default value is 1500.
     *         </p>
     */
    public Integer getMtu() {
        return mtu;
    }

    /**
     * <p>
     * The maximum transmission unit (MTU), in bytes. The supported values are
     * 1500 and 9001. The default value is 1500.
     * </p>
     *
     * @param mtu <p>
     *            The maximum transmission unit (MTU), in bytes. The supported
     *            values are 1500 and 9001. The default value is 1500.
     *            </p>
     */
    public void setMtu(Integer mtu) {
        this.mtu = mtu;
    }

    /**
     * <p>
     * The maximum transmission unit (MTU), in bytes. The supported values are
     * 1500 and 9001. The default value is 1500.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mtu <p>
     *            The maximum transmission unit (MTU), in bytes. The supported
     *            values are 1500 and 9001. The default value is 1500.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePublicVirtualInterfaceResult withMtu(Integer mtu) {
        this.mtu = mtu;
        return this;
    }

    /**
     * <p>
     * Indicates whether jumbo frames (9001 MTU) are supported.
     * </p>
     *
     * @return <p>
     *         Indicates whether jumbo frames (9001 MTU) are supported.
     *         </p>
     */
    public Boolean isJumboFrameCapable() {
        return jumboFrameCapable;
    }

    /**
     * <p>
     * Indicates whether jumbo frames (9001 MTU) are supported.
     * </p>
     *
     * @return <p>
     *         Indicates whether jumbo frames (9001 MTU) are supported.
     *         </p>
     */
    public Boolean getJumboFrameCapable() {
        return jumboFrameCapable;
    }

    /**
     * <p>
     * Indicates whether jumbo frames (9001 MTU) are supported.
     * </p>
     *
     * @param jumboFrameCapable <p>
     *            Indicates whether jumbo frames (9001 MTU) are supported.
     *            </p>
     */
    public void setJumboFrameCapable(Boolean jumboFrameCapable) {
        this.jumboFrameCapable = jumboFrameCapable;
    }

    /**
     * <p>
     * Indicates whether jumbo frames (9001 MTU) are supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jumboFrameCapable <p>
     *            Indicates whether jumbo frames (9001 MTU) are supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePublicVirtualInterfaceResult withJumboFrameCapable(Boolean jumboFrameCapable) {
        this.jumboFrameCapable = jumboFrameCapable;
        return this;
    }

    /**
     * <p>
     * The ID of the virtual private gateway. Applies only to private virtual
     * interfaces.
     * </p>
     *
     * @return <p>
     *         The ID of the virtual private gateway. Applies only to private
     *         virtual interfaces.
     *         </p>
     */
    public String getVirtualGatewayId() {
        return virtualGatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway. Applies only to private virtual
     * interfaces.
     * </p>
     *
     * @param virtualGatewayId <p>
     *            The ID of the virtual private gateway. Applies only to private
     *            virtual interfaces.
     *            </p>
     */
    public void setVirtualGatewayId(String virtualGatewayId) {
        this.virtualGatewayId = virtualGatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway. Applies only to private virtual
     * interfaces.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param virtualGatewayId <p>
     *            The ID of the virtual private gateway. Applies only to private
     *            virtual interfaces.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePublicVirtualInterfaceResult withVirtualGatewayId(String virtualGatewayId) {
        this.virtualGatewayId = virtualGatewayId;
        return this;
    }

    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     *
     * @return <p>
     *         The ID of the Direct Connect gateway.
     *         </p>
     */
    public String getDirectConnectGatewayId() {
        return directConnectGatewayId;
    }

    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     *
     * @param directConnectGatewayId <p>
     *            The ID of the Direct Connect gateway.
     *            </p>
     */
    public void setDirectConnectGatewayId(String directConnectGatewayId) {
        this.directConnectGatewayId = directConnectGatewayId;
    }

    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param directConnectGatewayId <p>
     *            The ID of the Direct Connect gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePublicVirtualInterfaceResult withDirectConnectGatewayId(
            String directConnectGatewayId) {
        this.directConnectGatewayId = directConnectGatewayId;
        return this;
    }

    /**
     * <p>
     * The routes to be advertised to the AWS network in this Region. Applies to
     * public virtual interfaces.
     * </p>
     *
     * @return <p>
     *         The routes to be advertised to the AWS network in this Region.
     *         Applies to public virtual interfaces.
     *         </p>
     */
    public java.util.List<RouteFilterPrefix> getRouteFilterPrefixes() {
        return routeFilterPrefixes;
    }

    /**
     * <p>
     * The routes to be advertised to the AWS network in this Region. Applies to
     * public virtual interfaces.
     * </p>
     *
     * @param routeFilterPrefixes <p>
     *            The routes to be advertised to the AWS network in this Region.
     *            Applies to public virtual interfaces.
     *            </p>
     */
    public void setRouteFilterPrefixes(java.util.Collection<RouteFilterPrefix> routeFilterPrefixes) {
        if (routeFilterPrefixes == null) {
            this.routeFilterPrefixes = null;
            return;
        }

        this.routeFilterPrefixes = new java.util.ArrayList<RouteFilterPrefix>(routeFilterPrefixes);
    }

    /**
     * <p>
     * The routes to be advertised to the AWS network in this Region. Applies to
     * public virtual interfaces.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routeFilterPrefixes <p>
     *            The routes to be advertised to the AWS network in this Region.
     *            Applies to public virtual interfaces.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePublicVirtualInterfaceResult withRouteFilterPrefixes(
            RouteFilterPrefix... routeFilterPrefixes) {
        if (getRouteFilterPrefixes() == null) {
            this.routeFilterPrefixes = new java.util.ArrayList<RouteFilterPrefix>(
                    routeFilterPrefixes.length);
        }
        for (RouteFilterPrefix value : routeFilterPrefixes) {
            this.routeFilterPrefixes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The routes to be advertised to the AWS network in this Region. Applies to
     * public virtual interfaces.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routeFilterPrefixes <p>
     *            The routes to be advertised to the AWS network in this Region.
     *            Applies to public virtual interfaces.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePublicVirtualInterfaceResult withRouteFilterPrefixes(
            java.util.Collection<RouteFilterPrefix> routeFilterPrefixes) {
        setRouteFilterPrefixes(routeFilterPrefixes);
        return this;
    }

    /**
     * <p>
     * The BGP peers configured on this virtual interface.
     * </p>
     *
     * @return <p>
     *         The BGP peers configured on this virtual interface.
     *         </p>
     */
    public java.util.List<BGPPeer> getBgpPeers() {
        return bgpPeers;
    }

    /**
     * <p>
     * The BGP peers configured on this virtual interface.
     * </p>
     *
     * @param bgpPeers <p>
     *            The BGP peers configured on this virtual interface.
     *            </p>
     */
    public void setBgpPeers(java.util.Collection<BGPPeer> bgpPeers) {
        if (bgpPeers == null) {
            this.bgpPeers = null;
            return;
        }

        this.bgpPeers = new java.util.ArrayList<BGPPeer>(bgpPeers);
    }

    /**
     * <p>
     * The BGP peers configured on this virtual interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bgpPeers <p>
     *            The BGP peers configured on this virtual interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePublicVirtualInterfaceResult withBgpPeers(BGPPeer... bgpPeers) {
        if (getBgpPeers() == null) {
            this.bgpPeers = new java.util.ArrayList<BGPPeer>(bgpPeers.length);
        }
        for (BGPPeer value : bgpPeers) {
            this.bgpPeers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The BGP peers configured on this virtual interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bgpPeers <p>
     *            The BGP peers configured on this virtual interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePublicVirtualInterfaceResult withBgpPeers(java.util.Collection<BGPPeer> bgpPeers) {
        setBgpPeers(bgpPeers);
        return this;
    }

    /**
     * <p>
     * The AWS Region where the virtual interface is located.
     * </p>
     *
     * @return <p>
     *         The AWS Region where the virtual interface is located.
     *         </p>
     */
    public String getRegion() {
        return region;
    }

    /**
     * <p>
     * The AWS Region where the virtual interface is located.
     * </p>
     *
     * @param region <p>
     *            The AWS Region where the virtual interface is located.
     *            </p>
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The AWS Region where the virtual interface is located.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param region <p>
     *            The AWS Region where the virtual interface is located.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePublicVirtualInterfaceResult withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * <p>
     * The Direct Connect endpoint on which the virtual interface terminates.
     * </p>
     *
     * @return <p>
     *         The Direct Connect endpoint on which the virtual interface
     *         terminates.
     *         </p>
     */
    public String getAwsDeviceV2() {
        return awsDeviceV2;
    }

    /**
     * <p>
     * The Direct Connect endpoint on which the virtual interface terminates.
     * </p>
     *
     * @param awsDeviceV2 <p>
     *            The Direct Connect endpoint on which the virtual interface
     *            terminates.
     *            </p>
     */
    public void setAwsDeviceV2(String awsDeviceV2) {
        this.awsDeviceV2 = awsDeviceV2;
    }

    /**
     * <p>
     * The Direct Connect endpoint on which the virtual interface terminates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsDeviceV2 <p>
     *            The Direct Connect endpoint on which the virtual interface
     *            terminates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePublicVirtualInterfaceResult withAwsDeviceV2(String awsDeviceV2) {
        this.awsDeviceV2 = awsDeviceV2;
        return this;
    }

    /**
     * <p>
     * The tags associated with the virtual interface.
     * </p>
     *
     * @return <p>
     *         The tags associated with the virtual interface.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags associated with the virtual interface.
     * </p>
     *
     * @param tags <p>
     *            The tags associated with the virtual interface.
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
     * The tags associated with the virtual interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags associated with the virtual interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePublicVirtualInterfaceResult withTags(Tag... tags) {
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
     * The tags associated with the virtual interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags associated with the virtual interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePublicVirtualInterfaceResult withTags(java.util.Collection<Tag> tags) {
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
        if (getOwnerAccount() != null)
            sb.append("ownerAccount: " + getOwnerAccount() + ",");
        if (getVirtualInterfaceId() != null)
            sb.append("virtualInterfaceId: " + getVirtualInterfaceId() + ",");
        if (getLocation() != null)
            sb.append("location: " + getLocation() + ",");
        if (getConnectionId() != null)
            sb.append("connectionId: " + getConnectionId() + ",");
        if (getVirtualInterfaceType() != null)
            sb.append("virtualInterfaceType: " + getVirtualInterfaceType() + ",");
        if (getVirtualInterfaceName() != null)
            sb.append("virtualInterfaceName: " + getVirtualInterfaceName() + ",");
        if (getVlan() != null)
            sb.append("vlan: " + getVlan() + ",");
        if (getAsn() != null)
            sb.append("asn: " + getAsn() + ",");
        if (getAmazonSideAsn() != null)
            sb.append("amazonSideAsn: " + getAmazonSideAsn() + ",");
        if (getAuthKey() != null)
            sb.append("authKey: " + getAuthKey() + ",");
        if (getAmazonAddress() != null)
            sb.append("amazonAddress: " + getAmazonAddress() + ",");
        if (getCustomerAddress() != null)
            sb.append("customerAddress: " + getCustomerAddress() + ",");
        if (getAddressFamily() != null)
            sb.append("addressFamily: " + getAddressFamily() + ",");
        if (getVirtualInterfaceState() != null)
            sb.append("virtualInterfaceState: " + getVirtualInterfaceState() + ",");
        if (getCustomerRouterConfig() != null)
            sb.append("customerRouterConfig: " + getCustomerRouterConfig() + ",");
        if (getMtu() != null)
            sb.append("mtu: " + getMtu() + ",");
        if (getJumboFrameCapable() != null)
            sb.append("jumboFrameCapable: " + getJumboFrameCapable() + ",");
        if (getVirtualGatewayId() != null)
            sb.append("virtualGatewayId: " + getVirtualGatewayId() + ",");
        if (getDirectConnectGatewayId() != null)
            sb.append("directConnectGatewayId: " + getDirectConnectGatewayId() + ",");
        if (getRouteFilterPrefixes() != null)
            sb.append("routeFilterPrefixes: " + getRouteFilterPrefixes() + ",");
        if (getBgpPeers() != null)
            sb.append("bgpPeers: " + getBgpPeers() + ",");
        if (getRegion() != null)
            sb.append("region: " + getRegion() + ",");
        if (getAwsDeviceV2() != null)
            sb.append("awsDeviceV2: " + getAwsDeviceV2() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode());
        hashCode = prime * hashCode
                + ((getVirtualInterfaceId() == null) ? 0 : getVirtualInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode
                + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode());
        hashCode = prime * hashCode
                + ((getVirtualInterfaceType() == null) ? 0 : getVirtualInterfaceType().hashCode());
        hashCode = prime * hashCode
                + ((getVirtualInterfaceName() == null) ? 0 : getVirtualInterfaceName().hashCode());
        hashCode = prime * hashCode + ((getVlan() == null) ? 0 : getVlan().hashCode());
        hashCode = prime * hashCode + ((getAsn() == null) ? 0 : getAsn().hashCode());
        hashCode = prime * hashCode
                + ((getAmazonSideAsn() == null) ? 0 : getAmazonSideAsn().hashCode());
        hashCode = prime * hashCode + ((getAuthKey() == null) ? 0 : getAuthKey().hashCode());
        hashCode = prime * hashCode
                + ((getAmazonAddress() == null) ? 0 : getAmazonAddress().hashCode());
        hashCode = prime * hashCode
                + ((getCustomerAddress() == null) ? 0 : getCustomerAddress().hashCode());
        hashCode = prime * hashCode
                + ((getAddressFamily() == null) ? 0 : getAddressFamily().hashCode());
        hashCode = prime
                * hashCode
                + ((getVirtualInterfaceState() == null) ? 0 : getVirtualInterfaceState().hashCode());
        hashCode = prime * hashCode
                + ((getCustomerRouterConfig() == null) ? 0 : getCustomerRouterConfig().hashCode());
        hashCode = prime * hashCode + ((getMtu() == null) ? 0 : getMtu().hashCode());
        hashCode = prime * hashCode
                + ((getJumboFrameCapable() == null) ? 0 : getJumboFrameCapable().hashCode());
        hashCode = prime * hashCode
                + ((getVirtualGatewayId() == null) ? 0 : getVirtualGatewayId().hashCode());
        hashCode = prime
                * hashCode
                + ((getDirectConnectGatewayId() == null) ? 0 : getDirectConnectGatewayId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getRouteFilterPrefixes() == null) ? 0 : getRouteFilterPrefixes().hashCode());
        hashCode = prime * hashCode + ((getBgpPeers() == null) ? 0 : getBgpPeers().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode
                + ((getAwsDeviceV2() == null) ? 0 : getAwsDeviceV2().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePublicVirtualInterfaceResult == false)
            return false;
        CreatePublicVirtualInterfaceResult other = (CreatePublicVirtualInterfaceResult) obj;

        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null)
            return false;
        if (other.getOwnerAccount() != null
                && other.getOwnerAccount().equals(this.getOwnerAccount()) == false)
            return false;
        if (other.getVirtualInterfaceId() == null ^ this.getVirtualInterfaceId() == null)
            return false;
        if (other.getVirtualInterfaceId() != null
                && other.getVirtualInterfaceId().equals(this.getVirtualInterfaceId()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getConnectionId() == null ^ this.getConnectionId() == null)
            return false;
        if (other.getConnectionId() != null
                && other.getConnectionId().equals(this.getConnectionId()) == false)
            return false;
        if (other.getVirtualInterfaceType() == null ^ this.getVirtualInterfaceType() == null)
            return false;
        if (other.getVirtualInterfaceType() != null
                && other.getVirtualInterfaceType().equals(this.getVirtualInterfaceType()) == false)
            return false;
        if (other.getVirtualInterfaceName() == null ^ this.getVirtualInterfaceName() == null)
            return false;
        if (other.getVirtualInterfaceName() != null
                && other.getVirtualInterfaceName().equals(this.getVirtualInterfaceName()) == false)
            return false;
        if (other.getVlan() == null ^ this.getVlan() == null)
            return false;
        if (other.getVlan() != null && other.getVlan().equals(this.getVlan()) == false)
            return false;
        if (other.getAsn() == null ^ this.getAsn() == null)
            return false;
        if (other.getAsn() != null && other.getAsn().equals(this.getAsn()) == false)
            return false;
        if (other.getAmazonSideAsn() == null ^ this.getAmazonSideAsn() == null)
            return false;
        if (other.getAmazonSideAsn() != null
                && other.getAmazonSideAsn().equals(this.getAmazonSideAsn()) == false)
            return false;
        if (other.getAuthKey() == null ^ this.getAuthKey() == null)
            return false;
        if (other.getAuthKey() != null && other.getAuthKey().equals(this.getAuthKey()) == false)
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
        if (other.getAddressFamily() == null ^ this.getAddressFamily() == null)
            return false;
        if (other.getAddressFamily() != null
                && other.getAddressFamily().equals(this.getAddressFamily()) == false)
            return false;
        if (other.getVirtualInterfaceState() == null ^ this.getVirtualInterfaceState() == null)
            return false;
        if (other.getVirtualInterfaceState() != null
                && other.getVirtualInterfaceState().equals(this.getVirtualInterfaceState()) == false)
            return false;
        if (other.getCustomerRouterConfig() == null ^ this.getCustomerRouterConfig() == null)
            return false;
        if (other.getCustomerRouterConfig() != null
                && other.getCustomerRouterConfig().equals(this.getCustomerRouterConfig()) == false)
            return false;
        if (other.getMtu() == null ^ this.getMtu() == null)
            return false;
        if (other.getMtu() != null && other.getMtu().equals(this.getMtu()) == false)
            return false;
        if (other.getJumboFrameCapable() == null ^ this.getJumboFrameCapable() == null)
            return false;
        if (other.getJumboFrameCapable() != null
                && other.getJumboFrameCapable().equals(this.getJumboFrameCapable()) == false)
            return false;
        if (other.getVirtualGatewayId() == null ^ this.getVirtualGatewayId() == null)
            return false;
        if (other.getVirtualGatewayId() != null
                && other.getVirtualGatewayId().equals(this.getVirtualGatewayId()) == false)
            return false;
        if (other.getDirectConnectGatewayId() == null ^ this.getDirectConnectGatewayId() == null)
            return false;
        if (other.getDirectConnectGatewayId() != null
                && other.getDirectConnectGatewayId().equals(this.getDirectConnectGatewayId()) == false)
            return false;
        if (other.getRouteFilterPrefixes() == null ^ this.getRouteFilterPrefixes() == null)
            return false;
        if (other.getRouteFilterPrefixes() != null
                && other.getRouteFilterPrefixes().equals(this.getRouteFilterPrefixes()) == false)
            return false;
        if (other.getBgpPeers() == null ^ this.getBgpPeers() == null)
            return false;
        if (other.getBgpPeers() != null && other.getBgpPeers().equals(this.getBgpPeers()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getAwsDeviceV2() == null ^ this.getAwsDeviceV2() == null)
            return false;
        if (other.getAwsDeviceV2() != null
                && other.getAwsDeviceV2().equals(this.getAwsDeviceV2()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
