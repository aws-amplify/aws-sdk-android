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

package com.amazonaws.services.amazonroute53.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new public or private hosted zone. You create records in a public
 * hosted zone to define how you want to route traffic on the internet for a
 * domain, such as example.com, and its subdomains (apex.example.com,
 * acme.example.com). You create records in a private hosted zone to define how
 * you want to route traffic for a domain and its subdomains within one or more
 * Amazon Virtual Private Clouds (Amazon VPCs).
 * </p>
 * <important>
 * <p>
 * You can't convert a public hosted zone to a private hosted zone or vice
 * versa. Instead, you must create a new hosted zone with the same name and
 * create new resource record sets.
 * </p>
 * </important>
 * <p>
 * For more information about charges for hosted zones, see <a
 * href="http://aws.amazon.com/route53/pricing/">Amazon Route 53 Pricing</a>.
 * </p>
 * <p>
 * Note the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * You can't create a hosted zone for a top-level domain (TLD) such as .com.
 * </p>
 * </li>
 * <li>
 * <p>
 * For public hosted zones, Route 53 automatically creates a default SOA record
 * and four NS records for the zone. For more information about SOA and NS
 * records, see <a href=
 * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/SOA-NSrecords.html"
 * >NS and SOA Records that Route 53 Creates for a Hosted Zone</a> in the
 * <i>Amazon Route 53 Developer Guide</i>.
 * </p>
 * <p>
 * If you want to use the same name servers for multiple public hosted zones,
 * you can optionally associate a reusable delegation set with the hosted zone.
 * See the <code>DelegationSetId</code> element.
 * </p>
 * </li>
 * <li>
 * <p>
 * If your domain is registered with a registrar other than Route 53, you must
 * update the name servers with your registrar to make Route 53 the DNS service
 * for the domain. For more information, see <a href=
 * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/MigratingDNS.html"
 * >Migrating DNS Service for an Existing Domain to Amazon Route 53</a> in the
 * <i>Amazon Route 53 Developer Guide</i>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * When you submit a <code>CreateHostedZone</code> request, the initial status
 * of the hosted zone is <code>PENDING</code>. For public hosted zones, this
 * means that the NS and SOA records are not yet available on all Route 53 DNS
 * servers. When the NS and SOA records are available, the status of the zone
 * changes to <code>INSYNC</code>.
 * </p>
 */
public class CreateHostedZoneRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the domain. Specify a fully qualified domain name, for
     * example, <i>www.example.com</i>. The trailing dot is optional; Amazon
     * Route 53 assumes that the domain name is fully qualified. This means that
     * Route 53 treats <i>www.example.com</i> (without a trailing dot) and
     * <i>www.example.com.</i> (with a trailing dot) as identical.
     * </p>
     * <p>
     * If you're creating a public hosted zone, this is the name you have
     * registered with your DNS registrar. If your domain name is registered
     * with a registrar other than Route 53, change the name servers for your
     * domain to the set of <code>NameServers</code> that
     * <code>CreateHostedZone</code> returns in <code>DelegationSet</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String name;

    /**
     * <p>
     * (Private hosted zones only) A complex type that contains information
     * about the Amazon VPC that you're associating with this hosted zone.
     * </p>
     * <p>
     * You can specify only one Amazon VPC when you create a private hosted
     * zone. To associate additional Amazon VPCs with the hosted zone, use <a
     * href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_AssociateVPCWithHostedZone.html"
     * >AssociateVPCWithHostedZone</a> after you create a hosted zone.
     * </p>
     */
    private VPC vPC;

    /**
     * <p>
     * A unique string that identifies the request and that allows failed
     * <code>CreateHostedZone</code> requests to be retried without the risk of
     * executing the operation twice. You must use a unique
     * <code>CallerReference</code> string every time you submit a
     * <code>CreateHostedZone</code> request. <code>CallerReference</code> can
     * be any unique string, for example, a date/time stamp.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String callerReference;

    /**
     * <p>
     * (Optional) A complex type that contains the following optional values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For public and private hosted zones, an optional comment
     * </p>
     * </li>
     * <li>
     * <p>
     * For private hosted zones, an optional <code>PrivateZone</code> element
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a comment or the <code>PrivateZone</code> element,
     * omit <code>HostedZoneConfig</code> and the other elements.
     * </p>
     */
    private HostedZoneConfig hostedZoneConfig;

    /**
     * <p>
     * If you want to associate a reusable delegation set with this hosted zone,
     * the ID that Amazon Route 53 assigned to the reusable delegation set when
     * you created it. For more information about reusable delegation sets, see
     * <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateReusableDelegationSet.html"
     * >CreateReusableDelegationSet</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     */
    private String delegationSetId;

    /**
     * <p>
     * The name of the domain. Specify a fully qualified domain name, for
     * example, <i>www.example.com</i>. The trailing dot is optional; Amazon
     * Route 53 assumes that the domain name is fully qualified. This means that
     * Route 53 treats <i>www.example.com</i> (without a trailing dot) and
     * <i>www.example.com.</i> (with a trailing dot) as identical.
     * </p>
     * <p>
     * If you're creating a public hosted zone, this is the name you have
     * registered with your DNS registrar. If your domain name is registered
     * with a registrar other than Route 53, change the name servers for your
     * domain to the set of <code>NameServers</code> that
     * <code>CreateHostedZone</code> returns in <code>DelegationSet</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         The name of the domain. Specify a fully qualified domain name,
     *         for example, <i>www.example.com</i>. The trailing dot is
     *         optional; Amazon Route 53 assumes that the domain name is fully
     *         qualified. This means that Route 53 treats <i>www.example.com</i>
     *         (without a trailing dot) and <i>www.example.com.</i> (with a
     *         trailing dot) as identical.
     *         </p>
     *         <p>
     *         If you're creating a public hosted zone, this is the name you
     *         have registered with your DNS registrar. If your domain name is
     *         registered with a registrar other than Route 53, change the name
     *         servers for your domain to the set of <code>NameServers</code>
     *         that <code>CreateHostedZone</code> returns in
     *         <code>DelegationSet</code>.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the domain. Specify a fully qualified domain name, for
     * example, <i>www.example.com</i>. The trailing dot is optional; Amazon
     * Route 53 assumes that the domain name is fully qualified. This means that
     * Route 53 treats <i>www.example.com</i> (without a trailing dot) and
     * <i>www.example.com.</i> (with a trailing dot) as identical.
     * </p>
     * <p>
     * If you're creating a public hosted zone, this is the name you have
     * registered with your DNS registrar. If your domain name is registered
     * with a registrar other than Route 53, change the name servers for your
     * domain to the set of <code>NameServers</code> that
     * <code>CreateHostedZone</code> returns in <code>DelegationSet</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param name <p>
     *            The name of the domain. Specify a fully qualified domain name,
     *            for example, <i>www.example.com</i>. The trailing dot is
     *            optional; Amazon Route 53 assumes that the domain name is
     *            fully qualified. This means that Route 53 treats
     *            <i>www.example.com</i> (without a trailing dot) and
     *            <i>www.example.com.</i> (with a trailing dot) as identical.
     *            </p>
     *            <p>
     *            If you're creating a public hosted zone, this is the name you
     *            have registered with your DNS registrar. If your domain name
     *            is registered with a registrar other than Route 53, change the
     *            name servers for your domain to the set of
     *            <code>NameServers</code> that <code>CreateHostedZone</code>
     *            returns in <code>DelegationSet</code>.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the domain. Specify a fully qualified domain name, for
     * example, <i>www.example.com</i>. The trailing dot is optional; Amazon
     * Route 53 assumes that the domain name is fully qualified. This means that
     * Route 53 treats <i>www.example.com</i> (without a trailing dot) and
     * <i>www.example.com.</i> (with a trailing dot) as identical.
     * </p>
     * <p>
     * If you're creating a public hosted zone, this is the name you have
     * registered with your DNS registrar. If your domain name is registered
     * with a registrar other than Route 53, change the name servers for your
     * domain to the set of <code>NameServers</code> that
     * <code>CreateHostedZone</code> returns in <code>DelegationSet</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param name <p>
     *            The name of the domain. Specify a fully qualified domain name,
     *            for example, <i>www.example.com</i>. The trailing dot is
     *            optional; Amazon Route 53 assumes that the domain name is
     *            fully qualified. This means that Route 53 treats
     *            <i>www.example.com</i> (without a trailing dot) and
     *            <i>www.example.com.</i> (with a trailing dot) as identical.
     *            </p>
     *            <p>
     *            If you're creating a public hosted zone, this is the name you
     *            have registered with your DNS registrar. If your domain name
     *            is registered with a registrar other than Route 53, change the
     *            name servers for your domain to the set of
     *            <code>NameServers</code> that <code>CreateHostedZone</code>
     *            returns in <code>DelegationSet</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateHostedZoneRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * (Private hosted zones only) A complex type that contains information
     * about the Amazon VPC that you're associating with this hosted zone.
     * </p>
     * <p>
     * You can specify only one Amazon VPC when you create a private hosted
     * zone. To associate additional Amazon VPCs with the hosted zone, use <a
     * href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_AssociateVPCWithHostedZone.html"
     * >AssociateVPCWithHostedZone</a> after you create a hosted zone.
     * </p>
     *
     * @return <p>
     *         (Private hosted zones only) A complex type that contains
     *         information about the Amazon VPC that you're associating with
     *         this hosted zone.
     *         </p>
     *         <p>
     *         You can specify only one Amazon VPC when you create a private
     *         hosted zone. To associate additional Amazon VPCs with the hosted
     *         zone, use <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/APIReference/API_AssociateVPCWithHostedZone.html"
     *         >AssociateVPCWithHostedZone</a> after you create a hosted zone.
     *         </p>
     */
    public VPC getVPC() {
        return vPC;
    }

    /**
     * <p>
     * (Private hosted zones only) A complex type that contains information
     * about the Amazon VPC that you're associating with this hosted zone.
     * </p>
     * <p>
     * You can specify only one Amazon VPC when you create a private hosted
     * zone. To associate additional Amazon VPCs with the hosted zone, use <a
     * href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_AssociateVPCWithHostedZone.html"
     * >AssociateVPCWithHostedZone</a> after you create a hosted zone.
     * </p>
     *
     * @param vPC <p>
     *            (Private hosted zones only) A complex type that contains
     *            information about the Amazon VPC that you're associating with
     *            this hosted zone.
     *            </p>
     *            <p>
     *            You can specify only one Amazon VPC when you create a private
     *            hosted zone. To associate additional Amazon VPCs with the
     *            hosted zone, use <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/API_AssociateVPCWithHostedZone.html"
     *            >AssociateVPCWithHostedZone</a> after you create a hosted
     *            zone.
     *            </p>
     */
    public void setVPC(VPC vPC) {
        this.vPC = vPC;
    }

    /**
     * <p>
     * (Private hosted zones only) A complex type that contains information
     * about the Amazon VPC that you're associating with this hosted zone.
     * </p>
     * <p>
     * You can specify only one Amazon VPC when you create a private hosted
     * zone. To associate additional Amazon VPCs with the hosted zone, use <a
     * href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_AssociateVPCWithHostedZone.html"
     * >AssociateVPCWithHostedZone</a> after you create a hosted zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vPC <p>
     *            (Private hosted zones only) A complex type that contains
     *            information about the Amazon VPC that you're associating with
     *            this hosted zone.
     *            </p>
     *            <p>
     *            You can specify only one Amazon VPC when you create a private
     *            hosted zone. To associate additional Amazon VPCs with the
     *            hosted zone, use <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/API_AssociateVPCWithHostedZone.html"
     *            >AssociateVPCWithHostedZone</a> after you create a hosted
     *            zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateHostedZoneRequest withVPC(VPC vPC) {
        this.vPC = vPC;
        return this;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed
     * <code>CreateHostedZone</code> requests to be retried without the risk of
     * executing the operation twice. You must use a unique
     * <code>CallerReference</code> string every time you submit a
     * <code>CreateHostedZone</code> request. <code>CallerReference</code> can
     * be any unique string, for example, a date/time stamp.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         A unique string that identifies the request and that allows
     *         failed <code>CreateHostedZone</code> requests to be retried
     *         without the risk of executing the operation twice. You must use a
     *         unique <code>CallerReference</code> string every time you submit
     *         a <code>CreateHostedZone</code> request.
     *         <code>CallerReference</code> can be any unique string, for
     *         example, a date/time stamp.
     *         </p>
     */
    public String getCallerReference() {
        return callerReference;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed
     * <code>CreateHostedZone</code> requests to be retried without the risk of
     * executing the operation twice. You must use a unique
     * <code>CallerReference</code> string every time you submit a
     * <code>CreateHostedZone</code> request. <code>CallerReference</code> can
     * be any unique string, for example, a date/time stamp.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param callerReference <p>
     *            A unique string that identifies the request and that allows
     *            failed <code>CreateHostedZone</code> requests to be retried
     *            without the risk of executing the operation twice. You must
     *            use a unique <code>CallerReference</code> string every time
     *            you submit a <code>CreateHostedZone</code> request.
     *            <code>CallerReference</code> can be any unique string, for
     *            example, a date/time stamp.
     *            </p>
     */
    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed
     * <code>CreateHostedZone</code> requests to be retried without the risk of
     * executing the operation twice. You must use a unique
     * <code>CallerReference</code> string every time you submit a
     * <code>CreateHostedZone</code> request. <code>CallerReference</code> can
     * be any unique string, for example, a date/time stamp.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param callerReference <p>
     *            A unique string that identifies the request and that allows
     *            failed <code>CreateHostedZone</code> requests to be retried
     *            without the risk of executing the operation twice. You must
     *            use a unique <code>CallerReference</code> string every time
     *            you submit a <code>CreateHostedZone</code> request.
     *            <code>CallerReference</code> can be any unique string, for
     *            example, a date/time stamp.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateHostedZoneRequest withCallerReference(String callerReference) {
        this.callerReference = callerReference;
        return this;
    }

    /**
     * <p>
     * (Optional) A complex type that contains the following optional values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For public and private hosted zones, an optional comment
     * </p>
     * </li>
     * <li>
     * <p>
     * For private hosted zones, an optional <code>PrivateZone</code> element
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a comment or the <code>PrivateZone</code> element,
     * omit <code>HostedZoneConfig</code> and the other elements.
     * </p>
     *
     * @return <p>
     *         (Optional) A complex type that contains the following optional
     *         values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For public and private hosted zones, an optional comment
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For private hosted zones, an optional <code>PrivateZone</code>
     *         element
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you don't specify a comment or the <code>PrivateZone</code>
     *         element, omit <code>HostedZoneConfig</code> and the other
     *         elements.
     *         </p>
     */
    public HostedZoneConfig getHostedZoneConfig() {
        return hostedZoneConfig;
    }

    /**
     * <p>
     * (Optional) A complex type that contains the following optional values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For public and private hosted zones, an optional comment
     * </p>
     * </li>
     * <li>
     * <p>
     * For private hosted zones, an optional <code>PrivateZone</code> element
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a comment or the <code>PrivateZone</code> element,
     * omit <code>HostedZoneConfig</code> and the other elements.
     * </p>
     *
     * @param hostedZoneConfig <p>
     *            (Optional) A complex type that contains the following optional
     *            values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For public and private hosted zones, an optional comment
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For private hosted zones, an optional <code>PrivateZone</code>
     *            element
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you don't specify a comment or the <code>PrivateZone</code>
     *            element, omit <code>HostedZoneConfig</code> and the other
     *            elements.
     *            </p>
     */
    public void setHostedZoneConfig(HostedZoneConfig hostedZoneConfig) {
        this.hostedZoneConfig = hostedZoneConfig;
    }

    /**
     * <p>
     * (Optional) A complex type that contains the following optional values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For public and private hosted zones, an optional comment
     * </p>
     * </li>
     * <li>
     * <p>
     * For private hosted zones, an optional <code>PrivateZone</code> element
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a comment or the <code>PrivateZone</code> element,
     * omit <code>HostedZoneConfig</code> and the other elements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostedZoneConfig <p>
     *            (Optional) A complex type that contains the following optional
     *            values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For public and private hosted zones, an optional comment
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For private hosted zones, an optional <code>PrivateZone</code>
     *            element
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you don't specify a comment or the <code>PrivateZone</code>
     *            element, omit <code>HostedZoneConfig</code> and the other
     *            elements.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateHostedZoneRequest withHostedZoneConfig(HostedZoneConfig hostedZoneConfig) {
        this.hostedZoneConfig = hostedZoneConfig;
        return this;
    }

    /**
     * <p>
     * If you want to associate a reusable delegation set with this hosted zone,
     * the ID that Amazon Route 53 assigned to the reusable delegation set when
     * you created it. For more information about reusable delegation sets, see
     * <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateReusableDelegationSet.html"
     * >CreateReusableDelegationSet</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @return <p>
     *         If you want to associate a reusable delegation set with this
     *         hosted zone, the ID that Amazon Route 53 assigned to the reusable
     *         delegation set when you created it. For more information about
     *         reusable delegation sets, see <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateReusableDelegationSet.html"
     *         >CreateReusableDelegationSet</a>.
     *         </p>
     */
    public String getDelegationSetId() {
        return delegationSetId;
    }

    /**
     * <p>
     * If you want to associate a reusable delegation set with this hosted zone,
     * the ID that Amazon Route 53 assigned to the reusable delegation set when
     * you created it. For more information about reusable delegation sets, see
     * <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateReusableDelegationSet.html"
     * >CreateReusableDelegationSet</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param delegationSetId <p>
     *            If you want to associate a reusable delegation set with this
     *            hosted zone, the ID that Amazon Route 53 assigned to the
     *            reusable delegation set when you created it. For more
     *            information about reusable delegation sets, see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateReusableDelegationSet.html"
     *            >CreateReusableDelegationSet</a>.
     *            </p>
     */
    public void setDelegationSetId(String delegationSetId) {
        this.delegationSetId = delegationSetId;
    }

    /**
     * <p>
     * If you want to associate a reusable delegation set with this hosted zone,
     * the ID that Amazon Route 53 assigned to the reusable delegation set when
     * you created it. For more information about reusable delegation sets, see
     * <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateReusableDelegationSet.html"
     * >CreateReusableDelegationSet</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param delegationSetId <p>
     *            If you want to associate a reusable delegation set with this
     *            hosted zone, the ID that Amazon Route 53 assigned to the
     *            reusable delegation set when you created it. For more
     *            information about reusable delegation sets, see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateReusableDelegationSet.html"
     *            >CreateReusableDelegationSet</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateHostedZoneRequest withDelegationSetId(String delegationSetId) {
        this.delegationSetId = delegationSetId;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getVPC() != null)
            sb.append("VPC: " + getVPC() + ",");
        if (getCallerReference() != null)
            sb.append("CallerReference: " + getCallerReference() + ",");
        if (getHostedZoneConfig() != null)
            sb.append("HostedZoneConfig: " + getHostedZoneConfig() + ",");
        if (getDelegationSetId() != null)
            sb.append("DelegationSetId: " + getDelegationSetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVPC() == null) ? 0 : getVPC().hashCode());
        hashCode = prime * hashCode
                + ((getCallerReference() == null) ? 0 : getCallerReference().hashCode());
        hashCode = prime * hashCode
                + ((getHostedZoneConfig() == null) ? 0 : getHostedZoneConfig().hashCode());
        hashCode = prime * hashCode
                + ((getDelegationSetId() == null) ? 0 : getDelegationSetId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateHostedZoneRequest == false)
            return false;
        CreateHostedZoneRequest other = (CreateHostedZoneRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVPC() == null ^ this.getVPC() == null)
            return false;
        if (other.getVPC() != null && other.getVPC().equals(this.getVPC()) == false)
            return false;
        if (other.getCallerReference() == null ^ this.getCallerReference() == null)
            return false;
        if (other.getCallerReference() != null
                && other.getCallerReference().equals(this.getCallerReference()) == false)
            return false;
        if (other.getHostedZoneConfig() == null ^ this.getHostedZoneConfig() == null)
            return false;
        if (other.getHostedZoneConfig() != null
                && other.getHostedZoneConfig().equals(this.getHostedZoneConfig()) == false)
            return false;
        if (other.getDelegationSetId() == null ^ this.getDelegationSetId() == null)
            return false;
        if (other.getDelegationSetId() != null
                && other.getDelegationSetId().equals(this.getDelegationSetId()) == false)
            return false;
        return true;
    }
}
