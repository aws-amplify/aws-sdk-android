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
 * Describes the options for a transit gateway.
 * </p>
 */
public class TransitGatewayOptions implements Serializable {
    /**
     * <p>
     * A private Autonomous System Number (ASN) for the Amazon side of a BGP
     * session. The range is 64512 to 65534 for 16-bit ASNs and 4200000000 to
     * 4294967294 for 32-bit ASNs.
     * </p>
     */
    private Long amazonSideAsn;

    /**
     * <p>
     * Indicates whether attachment requests are automatically accepted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     */
    private String autoAcceptSharedAttachments;

    /**
     * <p>
     * Indicates whether resource attachments are automatically associated with
     * the default association route table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     */
    private String defaultRouteTableAssociation;

    /**
     * <p>
     * The ID of the default association route table.
     * </p>
     */
    private String associationDefaultRouteTableId;

    /**
     * <p>
     * Indicates whether resource attachments automatically propagate routes to
     * the default propagation route table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     */
    private String defaultRouteTablePropagation;

    /**
     * <p>
     * The ID of the default propagation route table.
     * </p>
     */
    private String propagationDefaultRouteTableId;

    /**
     * <p>
     * Indicates whether Equal Cost Multipath Protocol support is enabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     */
    private String vpnEcmpSupport;

    /**
     * <p>
     * Indicates whether DNS support is enabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     */
    private String dnsSupport;

    /**
     * <p>
     * Indicates whether multicast is enabled on the transit gateway
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     */
    private String multicastSupport;

    /**
     * <p>
     * A private Autonomous System Number (ASN) for the Amazon side of a BGP
     * session. The range is 64512 to 65534 for 16-bit ASNs and 4200000000 to
     * 4294967294 for 32-bit ASNs.
     * </p>
     *
     * @return <p>
     *         A private Autonomous System Number (ASN) for the Amazon side of a
     *         BGP session. The range is 64512 to 65534 for 16-bit ASNs and
     *         4200000000 to 4294967294 for 32-bit ASNs.
     *         </p>
     */
    public Long getAmazonSideAsn() {
        return amazonSideAsn;
    }

    /**
     * <p>
     * A private Autonomous System Number (ASN) for the Amazon side of a BGP
     * session. The range is 64512 to 65534 for 16-bit ASNs and 4200000000 to
     * 4294967294 for 32-bit ASNs.
     * </p>
     *
     * @param amazonSideAsn <p>
     *            A private Autonomous System Number (ASN) for the Amazon side
     *            of a BGP session. The range is 64512 to 65534 for 16-bit ASNs
     *            and 4200000000 to 4294967294 for 32-bit ASNs.
     *            </p>
     */
    public void setAmazonSideAsn(Long amazonSideAsn) {
        this.amazonSideAsn = amazonSideAsn;
    }

    /**
     * <p>
     * A private Autonomous System Number (ASN) for the Amazon side of a BGP
     * session. The range is 64512 to 65534 for 16-bit ASNs and 4200000000 to
     * 4294967294 for 32-bit ASNs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param amazonSideAsn <p>
     *            A private Autonomous System Number (ASN) for the Amazon side
     *            of a BGP session. The range is 64512 to 65534 for 16-bit ASNs
     *            and 4200000000 to 4294967294 for 32-bit ASNs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayOptions withAmazonSideAsn(Long amazonSideAsn) {
        this.amazonSideAsn = amazonSideAsn;
        return this;
    }

    /**
     * <p>
     * Indicates whether attachment requests are automatically accepted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     *
     * @return <p>
     *         Indicates whether attachment requests are automatically accepted.
     *         </p>
     * @see AutoAcceptSharedAttachmentsValue
     */
    public String getAutoAcceptSharedAttachments() {
        return autoAcceptSharedAttachments;
    }

    /**
     * <p>
     * Indicates whether attachment requests are automatically accepted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     *
     * @param autoAcceptSharedAttachments <p>
     *            Indicates whether attachment requests are automatically
     *            accepted.
     *            </p>
     * @see AutoAcceptSharedAttachmentsValue
     */
    public void setAutoAcceptSharedAttachments(String autoAcceptSharedAttachments) {
        this.autoAcceptSharedAttachments = autoAcceptSharedAttachments;
    }

    /**
     * <p>
     * Indicates whether attachment requests are automatically accepted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     *
     * @param autoAcceptSharedAttachments <p>
     *            Indicates whether attachment requests are automatically
     *            accepted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutoAcceptSharedAttachmentsValue
     */
    public TransitGatewayOptions withAutoAcceptSharedAttachments(String autoAcceptSharedAttachments) {
        this.autoAcceptSharedAttachments = autoAcceptSharedAttachments;
        return this;
    }

    /**
     * <p>
     * Indicates whether attachment requests are automatically accepted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     *
     * @param autoAcceptSharedAttachments <p>
     *            Indicates whether attachment requests are automatically
     *            accepted.
     *            </p>
     * @see AutoAcceptSharedAttachmentsValue
     */
    public void setAutoAcceptSharedAttachments(
            AutoAcceptSharedAttachmentsValue autoAcceptSharedAttachments) {
        this.autoAcceptSharedAttachments = autoAcceptSharedAttachments.toString();
    }

    /**
     * <p>
     * Indicates whether attachment requests are automatically accepted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     *
     * @param autoAcceptSharedAttachments <p>
     *            Indicates whether attachment requests are automatically
     *            accepted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutoAcceptSharedAttachmentsValue
     */
    public TransitGatewayOptions withAutoAcceptSharedAttachments(
            AutoAcceptSharedAttachmentsValue autoAcceptSharedAttachments) {
        this.autoAcceptSharedAttachments = autoAcceptSharedAttachments.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether resource attachments are automatically associated with
     * the default association route table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     *
     * @return <p>
     *         Indicates whether resource attachments are automatically
     *         associated with the default association route table.
     *         </p>
     * @see DefaultRouteTableAssociationValue
     */
    public String getDefaultRouteTableAssociation() {
        return defaultRouteTableAssociation;
    }

    /**
     * <p>
     * Indicates whether resource attachments are automatically associated with
     * the default association route table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     *
     * @param defaultRouteTableAssociation <p>
     *            Indicates whether resource attachments are automatically
     *            associated with the default association route table.
     *            </p>
     * @see DefaultRouteTableAssociationValue
     */
    public void setDefaultRouteTableAssociation(String defaultRouteTableAssociation) {
        this.defaultRouteTableAssociation = defaultRouteTableAssociation;
    }

    /**
     * <p>
     * Indicates whether resource attachments are automatically associated with
     * the default association route table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     *
     * @param defaultRouteTableAssociation <p>
     *            Indicates whether resource attachments are automatically
     *            associated with the default association route table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DefaultRouteTableAssociationValue
     */
    public TransitGatewayOptions withDefaultRouteTableAssociation(
            String defaultRouteTableAssociation) {
        this.defaultRouteTableAssociation = defaultRouteTableAssociation;
        return this;
    }

    /**
     * <p>
     * Indicates whether resource attachments are automatically associated with
     * the default association route table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     *
     * @param defaultRouteTableAssociation <p>
     *            Indicates whether resource attachments are automatically
     *            associated with the default association route table.
     *            </p>
     * @see DefaultRouteTableAssociationValue
     */
    public void setDefaultRouteTableAssociation(
            DefaultRouteTableAssociationValue defaultRouteTableAssociation) {
        this.defaultRouteTableAssociation = defaultRouteTableAssociation.toString();
    }

    /**
     * <p>
     * Indicates whether resource attachments are automatically associated with
     * the default association route table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     *
     * @param defaultRouteTableAssociation <p>
     *            Indicates whether resource attachments are automatically
     *            associated with the default association route table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DefaultRouteTableAssociationValue
     */
    public TransitGatewayOptions withDefaultRouteTableAssociation(
            DefaultRouteTableAssociationValue defaultRouteTableAssociation) {
        this.defaultRouteTableAssociation = defaultRouteTableAssociation.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the default association route table.
     * </p>
     *
     * @return <p>
     *         The ID of the default association route table.
     *         </p>
     */
    public String getAssociationDefaultRouteTableId() {
        return associationDefaultRouteTableId;
    }

    /**
     * <p>
     * The ID of the default association route table.
     * </p>
     *
     * @param associationDefaultRouteTableId <p>
     *            The ID of the default association route table.
     *            </p>
     */
    public void setAssociationDefaultRouteTableId(String associationDefaultRouteTableId) {
        this.associationDefaultRouteTableId = associationDefaultRouteTableId;
    }

    /**
     * <p>
     * The ID of the default association route table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associationDefaultRouteTableId <p>
     *            The ID of the default association route table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayOptions withAssociationDefaultRouteTableId(
            String associationDefaultRouteTableId) {
        this.associationDefaultRouteTableId = associationDefaultRouteTableId;
        return this;
    }

    /**
     * <p>
     * Indicates whether resource attachments automatically propagate routes to
     * the default propagation route table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     *
     * @return <p>
     *         Indicates whether resource attachments automatically propagate
     *         routes to the default propagation route table.
     *         </p>
     * @see DefaultRouteTablePropagationValue
     */
    public String getDefaultRouteTablePropagation() {
        return defaultRouteTablePropagation;
    }

    /**
     * <p>
     * Indicates whether resource attachments automatically propagate routes to
     * the default propagation route table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     *
     * @param defaultRouteTablePropagation <p>
     *            Indicates whether resource attachments automatically propagate
     *            routes to the default propagation route table.
     *            </p>
     * @see DefaultRouteTablePropagationValue
     */
    public void setDefaultRouteTablePropagation(String defaultRouteTablePropagation) {
        this.defaultRouteTablePropagation = defaultRouteTablePropagation;
    }

    /**
     * <p>
     * Indicates whether resource attachments automatically propagate routes to
     * the default propagation route table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     *
     * @param defaultRouteTablePropagation <p>
     *            Indicates whether resource attachments automatically propagate
     *            routes to the default propagation route table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DefaultRouteTablePropagationValue
     */
    public TransitGatewayOptions withDefaultRouteTablePropagation(
            String defaultRouteTablePropagation) {
        this.defaultRouteTablePropagation = defaultRouteTablePropagation;
        return this;
    }

    /**
     * <p>
     * Indicates whether resource attachments automatically propagate routes to
     * the default propagation route table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     *
     * @param defaultRouteTablePropagation <p>
     *            Indicates whether resource attachments automatically propagate
     *            routes to the default propagation route table.
     *            </p>
     * @see DefaultRouteTablePropagationValue
     */
    public void setDefaultRouteTablePropagation(
            DefaultRouteTablePropagationValue defaultRouteTablePropagation) {
        this.defaultRouteTablePropagation = defaultRouteTablePropagation.toString();
    }

    /**
     * <p>
     * Indicates whether resource attachments automatically propagate routes to
     * the default propagation route table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     *
     * @param defaultRouteTablePropagation <p>
     *            Indicates whether resource attachments automatically propagate
     *            routes to the default propagation route table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DefaultRouteTablePropagationValue
     */
    public TransitGatewayOptions withDefaultRouteTablePropagation(
            DefaultRouteTablePropagationValue defaultRouteTablePropagation) {
        this.defaultRouteTablePropagation = defaultRouteTablePropagation.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the default propagation route table.
     * </p>
     *
     * @return <p>
     *         The ID of the default propagation route table.
     *         </p>
     */
    public String getPropagationDefaultRouteTableId() {
        return propagationDefaultRouteTableId;
    }

    /**
     * <p>
     * The ID of the default propagation route table.
     * </p>
     *
     * @param propagationDefaultRouteTableId <p>
     *            The ID of the default propagation route table.
     *            </p>
     */
    public void setPropagationDefaultRouteTableId(String propagationDefaultRouteTableId) {
        this.propagationDefaultRouteTableId = propagationDefaultRouteTableId;
    }

    /**
     * <p>
     * The ID of the default propagation route table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param propagationDefaultRouteTableId <p>
     *            The ID of the default propagation route table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayOptions withPropagationDefaultRouteTableId(
            String propagationDefaultRouteTableId) {
        this.propagationDefaultRouteTableId = propagationDefaultRouteTableId;
        return this;
    }

    /**
     * <p>
     * Indicates whether Equal Cost Multipath Protocol support is enabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     *
     * @return <p>
     *         Indicates whether Equal Cost Multipath Protocol support is
     *         enabled.
     *         </p>
     * @see VpnEcmpSupportValue
     */
    public String getVpnEcmpSupport() {
        return vpnEcmpSupport;
    }

    /**
     * <p>
     * Indicates whether Equal Cost Multipath Protocol support is enabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     *
     * @param vpnEcmpSupport <p>
     *            Indicates whether Equal Cost Multipath Protocol support is
     *            enabled.
     *            </p>
     * @see VpnEcmpSupportValue
     */
    public void setVpnEcmpSupport(String vpnEcmpSupport) {
        this.vpnEcmpSupport = vpnEcmpSupport;
    }

    /**
     * <p>
     * Indicates whether Equal Cost Multipath Protocol support is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     *
     * @param vpnEcmpSupport <p>
     *            Indicates whether Equal Cost Multipath Protocol support is
     *            enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VpnEcmpSupportValue
     */
    public TransitGatewayOptions withVpnEcmpSupport(String vpnEcmpSupport) {
        this.vpnEcmpSupport = vpnEcmpSupport;
        return this;
    }

    /**
     * <p>
     * Indicates whether Equal Cost Multipath Protocol support is enabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     *
     * @param vpnEcmpSupport <p>
     *            Indicates whether Equal Cost Multipath Protocol support is
     *            enabled.
     *            </p>
     * @see VpnEcmpSupportValue
     */
    public void setVpnEcmpSupport(VpnEcmpSupportValue vpnEcmpSupport) {
        this.vpnEcmpSupport = vpnEcmpSupport.toString();
    }

    /**
     * <p>
     * Indicates whether Equal Cost Multipath Protocol support is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     *
     * @param vpnEcmpSupport <p>
     *            Indicates whether Equal Cost Multipath Protocol support is
     *            enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VpnEcmpSupportValue
     */
    public TransitGatewayOptions withVpnEcmpSupport(VpnEcmpSupportValue vpnEcmpSupport) {
        this.vpnEcmpSupport = vpnEcmpSupport.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether DNS support is enabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     *
     * @return <p>
     *         Indicates whether DNS support is enabled.
     *         </p>
     * @see DnsSupportValue
     */
    public String getDnsSupport() {
        return dnsSupport;
    }

    /**
     * <p>
     * Indicates whether DNS support is enabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     *
     * @param dnsSupport <p>
     *            Indicates whether DNS support is enabled.
     *            </p>
     * @see DnsSupportValue
     */
    public void setDnsSupport(String dnsSupport) {
        this.dnsSupport = dnsSupport;
    }

    /**
     * <p>
     * Indicates whether DNS support is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     *
     * @param dnsSupport <p>
     *            Indicates whether DNS support is enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DnsSupportValue
     */
    public TransitGatewayOptions withDnsSupport(String dnsSupport) {
        this.dnsSupport = dnsSupport;
        return this;
    }

    /**
     * <p>
     * Indicates whether DNS support is enabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     *
     * @param dnsSupport <p>
     *            Indicates whether DNS support is enabled.
     *            </p>
     * @see DnsSupportValue
     */
    public void setDnsSupport(DnsSupportValue dnsSupport) {
        this.dnsSupport = dnsSupport.toString();
    }

    /**
     * <p>
     * Indicates whether DNS support is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     *
     * @param dnsSupport <p>
     *            Indicates whether DNS support is enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DnsSupportValue
     */
    public TransitGatewayOptions withDnsSupport(DnsSupportValue dnsSupport) {
        this.dnsSupport = dnsSupport.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether multicast is enabled on the transit gateway
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     *
     * @return <p>
     *         Indicates whether multicast is enabled on the transit gateway
     *         </p>
     * @see MulticastSupportValue
     */
    public String getMulticastSupport() {
        return multicastSupport;
    }

    /**
     * <p>
     * Indicates whether multicast is enabled on the transit gateway
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     *
     * @param multicastSupport <p>
     *            Indicates whether multicast is enabled on the transit gateway
     *            </p>
     * @see MulticastSupportValue
     */
    public void setMulticastSupport(String multicastSupport) {
        this.multicastSupport = multicastSupport;
    }

    /**
     * <p>
     * Indicates whether multicast is enabled on the transit gateway
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     *
     * @param multicastSupport <p>
     *            Indicates whether multicast is enabled on the transit gateway
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MulticastSupportValue
     */
    public TransitGatewayOptions withMulticastSupport(String multicastSupport) {
        this.multicastSupport = multicastSupport;
        return this;
    }

    /**
     * <p>
     * Indicates whether multicast is enabled on the transit gateway
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     *
     * @param multicastSupport <p>
     *            Indicates whether multicast is enabled on the transit gateway
     *            </p>
     * @see MulticastSupportValue
     */
    public void setMulticastSupport(MulticastSupportValue multicastSupport) {
        this.multicastSupport = multicastSupport.toString();
    }

    /**
     * <p>
     * Indicates whether multicast is enabled on the transit gateway
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     *
     * @param multicastSupport <p>
     *            Indicates whether multicast is enabled on the transit gateway
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MulticastSupportValue
     */
    public TransitGatewayOptions withMulticastSupport(MulticastSupportValue multicastSupport) {
        this.multicastSupport = multicastSupport.toString();
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
        if (getAmazonSideAsn() != null)
            sb.append("AmazonSideAsn: " + getAmazonSideAsn() + ",");
        if (getAutoAcceptSharedAttachments() != null)
            sb.append("AutoAcceptSharedAttachments: " + getAutoAcceptSharedAttachments() + ",");
        if (getDefaultRouteTableAssociation() != null)
            sb.append("DefaultRouteTableAssociation: " + getDefaultRouteTableAssociation() + ",");
        if (getAssociationDefaultRouteTableId() != null)
            sb.append("AssociationDefaultRouteTableId: " + getAssociationDefaultRouteTableId()
                    + ",");
        if (getDefaultRouteTablePropagation() != null)
            sb.append("DefaultRouteTablePropagation: " + getDefaultRouteTablePropagation() + ",");
        if (getPropagationDefaultRouteTableId() != null)
            sb.append("PropagationDefaultRouteTableId: " + getPropagationDefaultRouteTableId()
                    + ",");
        if (getVpnEcmpSupport() != null)
            sb.append("VpnEcmpSupport: " + getVpnEcmpSupport() + ",");
        if (getDnsSupport() != null)
            sb.append("DnsSupport: " + getDnsSupport() + ",");
        if (getMulticastSupport() != null)
            sb.append("MulticastSupport: " + getMulticastSupport());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAmazonSideAsn() == null) ? 0 : getAmazonSideAsn().hashCode());
        hashCode = prime
                * hashCode
                + ((getAutoAcceptSharedAttachments() == null) ? 0
                        : getAutoAcceptSharedAttachments().hashCode());
        hashCode = prime
                * hashCode
                + ((getDefaultRouteTableAssociation() == null) ? 0
                        : getDefaultRouteTableAssociation().hashCode());
        hashCode = prime
                * hashCode
                + ((getAssociationDefaultRouteTableId() == null) ? 0
                        : getAssociationDefaultRouteTableId().hashCode());
        hashCode = prime
                * hashCode
                + ((getDefaultRouteTablePropagation() == null) ? 0
                        : getDefaultRouteTablePropagation().hashCode());
        hashCode = prime
                * hashCode
                + ((getPropagationDefaultRouteTableId() == null) ? 0
                        : getPropagationDefaultRouteTableId().hashCode());
        hashCode = prime * hashCode
                + ((getVpnEcmpSupport() == null) ? 0 : getVpnEcmpSupport().hashCode());
        hashCode = prime * hashCode + ((getDnsSupport() == null) ? 0 : getDnsSupport().hashCode());
        hashCode = prime * hashCode
                + ((getMulticastSupport() == null) ? 0 : getMulticastSupport().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransitGatewayOptions == false)
            return false;
        TransitGatewayOptions other = (TransitGatewayOptions) obj;

        if (other.getAmazonSideAsn() == null ^ this.getAmazonSideAsn() == null)
            return false;
        if (other.getAmazonSideAsn() != null
                && other.getAmazonSideAsn().equals(this.getAmazonSideAsn()) == false)
            return false;
        if (other.getAutoAcceptSharedAttachments() == null
                ^ this.getAutoAcceptSharedAttachments() == null)
            return false;
        if (other.getAutoAcceptSharedAttachments() != null
                && other.getAutoAcceptSharedAttachments().equals(
                        this.getAutoAcceptSharedAttachments()) == false)
            return false;
        if (other.getDefaultRouteTableAssociation() == null
                ^ this.getDefaultRouteTableAssociation() == null)
            return false;
        if (other.getDefaultRouteTableAssociation() != null
                && other.getDefaultRouteTableAssociation().equals(
                        this.getDefaultRouteTableAssociation()) == false)
            return false;
        if (other.getAssociationDefaultRouteTableId() == null
                ^ this.getAssociationDefaultRouteTableId() == null)
            return false;
        if (other.getAssociationDefaultRouteTableId() != null
                && other.getAssociationDefaultRouteTableId().equals(
                        this.getAssociationDefaultRouteTableId()) == false)
            return false;
        if (other.getDefaultRouteTablePropagation() == null
                ^ this.getDefaultRouteTablePropagation() == null)
            return false;
        if (other.getDefaultRouteTablePropagation() != null
                && other.getDefaultRouteTablePropagation().equals(
                        this.getDefaultRouteTablePropagation()) == false)
            return false;
        if (other.getPropagationDefaultRouteTableId() == null
                ^ this.getPropagationDefaultRouteTableId() == null)
            return false;
        if (other.getPropagationDefaultRouteTableId() != null
                && other.getPropagationDefaultRouteTableId().equals(
                        this.getPropagationDefaultRouteTableId()) == false)
            return false;
        if (other.getVpnEcmpSupport() == null ^ this.getVpnEcmpSupport() == null)
            return false;
        if (other.getVpnEcmpSupport() != null
                && other.getVpnEcmpSupport().equals(this.getVpnEcmpSupport()) == false)
            return false;
        if (other.getDnsSupport() == null ^ this.getDnsSupport() == null)
            return false;
        if (other.getDnsSupport() != null
                && other.getDnsSupport().equals(this.getDnsSupport()) == false)
            return false;
        if (other.getMulticastSupport() == null ^ this.getMulticastSupport() == null)
            return false;
        if (other.getMulticastSupport() != null
                && other.getMulticastSupport().equals(this.getMulticastSupport()) == false)
            return false;
        return true;
    }
}
