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

/**
 * <p>
 * A complex type that contains the response information for the request.
 * </p>
 */
public class ListHostedZonesByNameResult implements Serializable {
    /**
     * <p>
     * A complex type that contains general information about the hosted zone.
     * </p>
     */
    private java.util.List<HostedZone> hostedZones;

    /**
     * <p>
     * For the second and subsequent calls to <code>ListHostedZonesByName</code>, <code>DNSName</code> is the value that you specified for the
     * <code>dnsname</code> parameter in the request that produced the current
     * response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String dNSName;

    /**
     * <p>
     * The ID that Amazon Route 53 assigned to the hosted zone when you created
     * it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     */
    private String hostedZoneId;

    /**
     * <p>
     * A flag that indicates whether there are more hosted zones to be listed.
     * If the response was truncated, you can get the next group of
     * <code>maxitems</code> hosted zones by calling
     * <code>ListHostedZonesByName</code> again and specifying the values of
     * <code>NextDNSName</code> and <code>NextHostedZoneId</code> elements in
     * the <code>dnsname</code> and <code>hostedzoneid</code> parameters.
     * </p>
     */
    private Boolean isTruncated;

    /**
     * <p>
     * If <code>IsTruncated</code> is true, the value of
     * <code>NextDNSName</code> is the name of the first hosted zone in the next
     * group of <code>maxitems</code> hosted zones. Call
     * <code>ListHostedZonesByName</code> again and specify the value of
     * <code>NextDNSName</code> and <code>NextHostedZoneId</code> in the
     * <code>dnsname</code> and <code>hostedzoneid</code> parameters,
     * respectively.
     * </p>
     * <p>
     * This element is present only if <code>IsTruncated</code> is
     * <code>true</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String nextDNSName;

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, the value of
     * <code>NextHostedZoneId</code> identifies the first hosted zone in the
     * next group of <code>maxitems</code> hosted zones. Call
     * <code>ListHostedZonesByName</code> again and specify the value of
     * <code>NextDNSName</code> and <code>NextHostedZoneId</code> in the
     * <code>dnsname</code> and <code>hostedzoneid</code> parameters,
     * respectively.
     * </p>
     * <p>
     * This element is present only if <code>IsTruncated</code> is
     * <code>true</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     */
    private String nextHostedZoneId;

    /**
     * <p>
     * The value that you specified for the <code>maxitems</code> parameter in
     * the call to <code>ListHostedZonesByName</code> that produced the current
     * response.
     * </p>
     */
    private String maxItems;

    /**
     * <p>
     * A complex type that contains general information about the hosted zone.
     * </p>
     *
     * @return <p>
     *         A complex type that contains general information about the hosted
     *         zone.
     *         </p>
     */
    public java.util.List<HostedZone> getHostedZones() {
        return hostedZones;
    }

    /**
     * <p>
     * A complex type that contains general information about the hosted zone.
     * </p>
     *
     * @param hostedZones <p>
     *            A complex type that contains general information about the
     *            hosted zone.
     *            </p>
     */
    public void setHostedZones(java.util.Collection<HostedZone> hostedZones) {
        if (hostedZones == null) {
            this.hostedZones = null;
            return;
        }

        this.hostedZones = new java.util.ArrayList<HostedZone>(hostedZones);
    }

    /**
     * <p>
     * A complex type that contains general information about the hosted zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostedZones <p>
     *            A complex type that contains general information about the
     *            hosted zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListHostedZonesByNameResult withHostedZones(HostedZone... hostedZones) {
        if (getHostedZones() == null) {
            this.hostedZones = new java.util.ArrayList<HostedZone>(hostedZones.length);
        }
        for (HostedZone value : hostedZones) {
            this.hostedZones.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains general information about the hosted zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostedZones <p>
     *            A complex type that contains general information about the
     *            hosted zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListHostedZonesByNameResult withHostedZones(java.util.Collection<HostedZone> hostedZones) {
        setHostedZones(hostedZones);
        return this;
    }

    /**
     * <p>
     * For the second and subsequent calls to <code>ListHostedZonesByName</code>, <code>DNSName</code> is the value that you specified for the
     * <code>dnsname</code> parameter in the request that produced the current
     * response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         For the second and subsequent calls to
     *         <code>ListHostedZonesByName</code>, <code>DNSName</code> is the
     *         value that you specified for the <code>dnsname</code> parameter
     *         in the request that produced the current response.
     *         </p>
     */
    public String getDNSName() {
        return dNSName;
    }

    /**
     * <p>
     * For the second and subsequent calls to <code>ListHostedZonesByName</code>, <code>DNSName</code> is the value that you specified for the
     * <code>dnsname</code> parameter in the request that produced the current
     * response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param dNSName <p>
     *            For the second and subsequent calls to
     *            <code>ListHostedZonesByName</code>, <code>DNSName</code> is
     *            the value that you specified for the <code>dnsname</code>
     *            parameter in the request that produced the current response.
     *            </p>
     */
    public void setDNSName(String dNSName) {
        this.dNSName = dNSName;
    }

    /**
     * <p>
     * For the second and subsequent calls to <code>ListHostedZonesByName</code>, <code>DNSName</code> is the value that you specified for the
     * <code>dnsname</code> parameter in the request that produced the current
     * response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param dNSName <p>
     *            For the second and subsequent calls to
     *            <code>ListHostedZonesByName</code>, <code>DNSName</code> is
     *            the value that you specified for the <code>dnsname</code>
     *            parameter in the request that produced the current response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListHostedZonesByNameResult withDNSName(String dNSName) {
        this.dNSName = dNSName;
        return this;
    }

    /**
     * <p>
     * The ID that Amazon Route 53 assigned to the hosted zone when you created
     * it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @return <p>
     *         The ID that Amazon Route 53 assigned to the hosted zone when you
     *         created it.
     *         </p>
     */
    public String getHostedZoneId() {
        return hostedZoneId;
    }

    /**
     * <p>
     * The ID that Amazon Route 53 assigned to the hosted zone when you created
     * it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param hostedZoneId <p>
     *            The ID that Amazon Route 53 assigned to the hosted zone when
     *            you created it.
     *            </p>
     */
    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * The ID that Amazon Route 53 assigned to the hosted zone when you created
     * it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param hostedZoneId <p>
     *            The ID that Amazon Route 53 assigned to the hosted zone when
     *            you created it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListHostedZonesByNameResult withHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether there are more hosted zones to be listed.
     * If the response was truncated, you can get the next group of
     * <code>maxitems</code> hosted zones by calling
     * <code>ListHostedZonesByName</code> again and specifying the values of
     * <code>NextDNSName</code> and <code>NextHostedZoneId</code> elements in
     * the <code>dnsname</code> and <code>hostedzoneid</code> parameters.
     * </p>
     *
     * @return <p>
     *         A flag that indicates whether there are more hosted zones to be
     *         listed. If the response was truncated, you can get the next group
     *         of <code>maxitems</code> hosted zones by calling
     *         <code>ListHostedZonesByName</code> again and specifying the
     *         values of <code>NextDNSName</code> and
     *         <code>NextHostedZoneId</code> elements in the
     *         <code>dnsname</code> and <code>hostedzoneid</code> parameters.
     *         </p>
     */
    public Boolean isIsTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more hosted zones to be listed.
     * If the response was truncated, you can get the next group of
     * <code>maxitems</code> hosted zones by calling
     * <code>ListHostedZonesByName</code> again and specifying the values of
     * <code>NextDNSName</code> and <code>NextHostedZoneId</code> elements in
     * the <code>dnsname</code> and <code>hostedzoneid</code> parameters.
     * </p>
     *
     * @return <p>
     *         A flag that indicates whether there are more hosted zones to be
     *         listed. If the response was truncated, you can get the next group
     *         of <code>maxitems</code> hosted zones by calling
     *         <code>ListHostedZonesByName</code> again and specifying the
     *         values of <code>NextDNSName</code> and
     *         <code>NextHostedZoneId</code> elements in the
     *         <code>dnsname</code> and <code>hostedzoneid</code> parameters.
     *         </p>
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more hosted zones to be listed.
     * If the response was truncated, you can get the next group of
     * <code>maxitems</code> hosted zones by calling
     * <code>ListHostedZonesByName</code> again and specifying the values of
     * <code>NextDNSName</code> and <code>NextHostedZoneId</code> elements in
     * the <code>dnsname</code> and <code>hostedzoneid</code> parameters.
     * </p>
     *
     * @param isTruncated <p>
     *            A flag that indicates whether there are more hosted zones to
     *            be listed. If the response was truncated, you can get the next
     *            group of <code>maxitems</code> hosted zones by calling
     *            <code>ListHostedZonesByName</code> again and specifying the
     *            values of <code>NextDNSName</code> and
     *            <code>NextHostedZoneId</code> elements in the
     *            <code>dnsname</code> and <code>hostedzoneid</code> parameters.
     *            </p>
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more hosted zones to be listed.
     * If the response was truncated, you can get the next group of
     * <code>maxitems</code> hosted zones by calling
     * <code>ListHostedZonesByName</code> again and specifying the values of
     * <code>NextDNSName</code> and <code>NextHostedZoneId</code> elements in
     * the <code>dnsname</code> and <code>hostedzoneid</code> parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isTruncated <p>
     *            A flag that indicates whether there are more hosted zones to
     *            be listed. If the response was truncated, you can get the next
     *            group of <code>maxitems</code> hosted zones by calling
     *            <code>ListHostedZonesByName</code> again and specifying the
     *            values of <code>NextDNSName</code> and
     *            <code>NextHostedZoneId</code> elements in the
     *            <code>dnsname</code> and <code>hostedzoneid</code> parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListHostedZonesByNameResult withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is true, the value of
     * <code>NextDNSName</code> is the name of the first hosted zone in the next
     * group of <code>maxitems</code> hosted zones. Call
     * <code>ListHostedZonesByName</code> again and specify the value of
     * <code>NextDNSName</code> and <code>NextHostedZoneId</code> in the
     * <code>dnsname</code> and <code>hostedzoneid</code> parameters,
     * respectively.
     * </p>
     * <p>
     * This element is present only if <code>IsTruncated</code> is
     * <code>true</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         If <code>IsTruncated</code> is true, the value of
     *         <code>NextDNSName</code> is the name of the first hosted zone in
     *         the next group of <code>maxitems</code> hosted zones. Call
     *         <code>ListHostedZonesByName</code> again and specify the value of
     *         <code>NextDNSName</code> and <code>NextHostedZoneId</code> in the
     *         <code>dnsname</code> and <code>hostedzoneid</code> parameters,
     *         respectively.
     *         </p>
     *         <p>
     *         This element is present only if <code>IsTruncated</code> is
     *         <code>true</code>.
     *         </p>
     */
    public String getNextDNSName() {
        return nextDNSName;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is true, the value of
     * <code>NextDNSName</code> is the name of the first hosted zone in the next
     * group of <code>maxitems</code> hosted zones. Call
     * <code>ListHostedZonesByName</code> again and specify the value of
     * <code>NextDNSName</code> and <code>NextHostedZoneId</code> in the
     * <code>dnsname</code> and <code>hostedzoneid</code> parameters,
     * respectively.
     * </p>
     * <p>
     * This element is present only if <code>IsTruncated</code> is
     * <code>true</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param nextDNSName <p>
     *            If <code>IsTruncated</code> is true, the value of
     *            <code>NextDNSName</code> is the name of the first hosted zone
     *            in the next group of <code>maxitems</code> hosted zones. Call
     *            <code>ListHostedZonesByName</code> again and specify the value
     *            of <code>NextDNSName</code> and <code>NextHostedZoneId</code>
     *            in the <code>dnsname</code> and <code>hostedzoneid</code>
     *            parameters, respectively.
     *            </p>
     *            <p>
     *            This element is present only if <code>IsTruncated</code> is
     *            <code>true</code>.
     *            </p>
     */
    public void setNextDNSName(String nextDNSName) {
        this.nextDNSName = nextDNSName;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is true, the value of
     * <code>NextDNSName</code> is the name of the first hosted zone in the next
     * group of <code>maxitems</code> hosted zones. Call
     * <code>ListHostedZonesByName</code> again and specify the value of
     * <code>NextDNSName</code> and <code>NextHostedZoneId</code> in the
     * <code>dnsname</code> and <code>hostedzoneid</code> parameters,
     * respectively.
     * </p>
     * <p>
     * This element is present only if <code>IsTruncated</code> is
     * <code>true</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param nextDNSName <p>
     *            If <code>IsTruncated</code> is true, the value of
     *            <code>NextDNSName</code> is the name of the first hosted zone
     *            in the next group of <code>maxitems</code> hosted zones. Call
     *            <code>ListHostedZonesByName</code> again and specify the value
     *            of <code>NextDNSName</code> and <code>NextHostedZoneId</code>
     *            in the <code>dnsname</code> and <code>hostedzoneid</code>
     *            parameters, respectively.
     *            </p>
     *            <p>
     *            This element is present only if <code>IsTruncated</code> is
     *            <code>true</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListHostedZonesByNameResult withNextDNSName(String nextDNSName) {
        this.nextDNSName = nextDNSName;
        return this;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, the value of
     * <code>NextHostedZoneId</code> identifies the first hosted zone in the
     * next group of <code>maxitems</code> hosted zones. Call
     * <code>ListHostedZonesByName</code> again and specify the value of
     * <code>NextDNSName</code> and <code>NextHostedZoneId</code> in the
     * <code>dnsname</code> and <code>hostedzoneid</code> parameters,
     * respectively.
     * </p>
     * <p>
     * This element is present only if <code>IsTruncated</code> is
     * <code>true</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @return <p>
     *         If <code>IsTruncated</code> is <code>true</code>, the value of
     *         <code>NextHostedZoneId</code> identifies the first hosted zone in
     *         the next group of <code>maxitems</code> hosted zones. Call
     *         <code>ListHostedZonesByName</code> again and specify the value of
     *         <code>NextDNSName</code> and <code>NextHostedZoneId</code> in the
     *         <code>dnsname</code> and <code>hostedzoneid</code> parameters,
     *         respectively.
     *         </p>
     *         <p>
     *         This element is present only if <code>IsTruncated</code> is
     *         <code>true</code>.
     *         </p>
     */
    public String getNextHostedZoneId() {
        return nextHostedZoneId;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, the value of
     * <code>NextHostedZoneId</code> identifies the first hosted zone in the
     * next group of <code>maxitems</code> hosted zones. Call
     * <code>ListHostedZonesByName</code> again and specify the value of
     * <code>NextDNSName</code> and <code>NextHostedZoneId</code> in the
     * <code>dnsname</code> and <code>hostedzoneid</code> parameters,
     * respectively.
     * </p>
     * <p>
     * This element is present only if <code>IsTruncated</code> is
     * <code>true</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param nextHostedZoneId <p>
     *            If <code>IsTruncated</code> is <code>true</code>, the value of
     *            <code>NextHostedZoneId</code> identifies the first hosted zone
     *            in the next group of <code>maxitems</code> hosted zones. Call
     *            <code>ListHostedZonesByName</code> again and specify the value
     *            of <code>NextDNSName</code> and <code>NextHostedZoneId</code>
     *            in the <code>dnsname</code> and <code>hostedzoneid</code>
     *            parameters, respectively.
     *            </p>
     *            <p>
     *            This element is present only if <code>IsTruncated</code> is
     *            <code>true</code>.
     *            </p>
     */
    public void setNextHostedZoneId(String nextHostedZoneId) {
        this.nextHostedZoneId = nextHostedZoneId;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, the value of
     * <code>NextHostedZoneId</code> identifies the first hosted zone in the
     * next group of <code>maxitems</code> hosted zones. Call
     * <code>ListHostedZonesByName</code> again and specify the value of
     * <code>NextDNSName</code> and <code>NextHostedZoneId</code> in the
     * <code>dnsname</code> and <code>hostedzoneid</code> parameters,
     * respectively.
     * </p>
     * <p>
     * This element is present only if <code>IsTruncated</code> is
     * <code>true</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param nextHostedZoneId <p>
     *            If <code>IsTruncated</code> is <code>true</code>, the value of
     *            <code>NextHostedZoneId</code> identifies the first hosted zone
     *            in the next group of <code>maxitems</code> hosted zones. Call
     *            <code>ListHostedZonesByName</code> again and specify the value
     *            of <code>NextDNSName</code> and <code>NextHostedZoneId</code>
     *            in the <code>dnsname</code> and <code>hostedzoneid</code>
     *            parameters, respectively.
     *            </p>
     *            <p>
     *            This element is present only if <code>IsTruncated</code> is
     *            <code>true</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListHostedZonesByNameResult withNextHostedZoneId(String nextHostedZoneId) {
        this.nextHostedZoneId = nextHostedZoneId;
        return this;
    }

    /**
     * <p>
     * The value that you specified for the <code>maxitems</code> parameter in
     * the call to <code>ListHostedZonesByName</code> that produced the current
     * response.
     * </p>
     *
     * @return <p>
     *         The value that you specified for the <code>maxitems</code>
     *         parameter in the call to <code>ListHostedZonesByName</code> that
     *         produced the current response.
     *         </p>
     */
    public String getMaxItems() {
        return maxItems;
    }

    /**
     * <p>
     * The value that you specified for the <code>maxitems</code> parameter in
     * the call to <code>ListHostedZonesByName</code> that produced the current
     * response.
     * </p>
     *
     * @param maxItems <p>
     *            The value that you specified for the <code>maxitems</code>
     *            parameter in the call to <code>ListHostedZonesByName</code>
     *            that produced the current response.
     *            </p>
     */
    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The value that you specified for the <code>maxitems</code> parameter in
     * the call to <code>ListHostedZonesByName</code> that produced the current
     * response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxItems <p>
     *            The value that you specified for the <code>maxitems</code>
     *            parameter in the call to <code>ListHostedZonesByName</code>
     *            that produced the current response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListHostedZonesByNameResult withMaxItems(String maxItems) {
        this.maxItems = maxItems;
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
        if (getHostedZones() != null)
            sb.append("HostedZones: " + getHostedZones() + ",");
        if (getDNSName() != null)
            sb.append("DNSName: " + getDNSName() + ",");
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: " + getHostedZoneId() + ",");
        if (getIsTruncated() != null)
            sb.append("IsTruncated: " + getIsTruncated() + ",");
        if (getNextDNSName() != null)
            sb.append("NextDNSName: " + getNextDNSName() + ",");
        if (getNextHostedZoneId() != null)
            sb.append("NextHostedZoneId: " + getNextHostedZoneId() + ",");
        if (getMaxItems() != null)
            sb.append("MaxItems: " + getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHostedZones() == null) ? 0 : getHostedZones().hashCode());
        hashCode = prime * hashCode + ((getDNSName() == null) ? 0 : getDNSName().hashCode());
        hashCode = prime * hashCode
                + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode());
        hashCode = prime * hashCode
                + ((getIsTruncated() == null) ? 0 : getIsTruncated().hashCode());
        hashCode = prime * hashCode
                + ((getNextDNSName() == null) ? 0 : getNextDNSName().hashCode());
        hashCode = prime * hashCode
                + ((getNextHostedZoneId() == null) ? 0 : getNextHostedZoneId().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListHostedZonesByNameResult == false)
            return false;
        ListHostedZonesByNameResult other = (ListHostedZonesByNameResult) obj;

        if (other.getHostedZones() == null ^ this.getHostedZones() == null)
            return false;
        if (other.getHostedZones() != null
                && other.getHostedZones().equals(this.getHostedZones()) == false)
            return false;
        if (other.getDNSName() == null ^ this.getDNSName() == null)
            return false;
        if (other.getDNSName() != null && other.getDNSName().equals(this.getDNSName()) == false)
            return false;
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null
                && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        if (other.getIsTruncated() == null ^ this.getIsTruncated() == null)
            return false;
        if (other.getIsTruncated() != null
                && other.getIsTruncated().equals(this.getIsTruncated()) == false)
            return false;
        if (other.getNextDNSName() == null ^ this.getNextDNSName() == null)
            return false;
        if (other.getNextDNSName() != null
                && other.getNextDNSName().equals(this.getNextDNSName()) == false)
            return false;
        if (other.getNextHostedZoneId() == null ^ this.getNextHostedZoneId() == null)
            return false;
        if (other.getNextHostedZoneId() != null
                && other.getNextHostedZoneId().equals(this.getNextHostedZoneId()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }
}
