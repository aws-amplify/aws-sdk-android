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
 * Retrieves a list of your hosted zones in lexicographic order. The response
 * includes a <code>HostedZones</code> child element for each hosted zone
 * created by the current AWS account.
 * </p>
 * <p>
 * <code>ListHostedZonesByName</code> sorts hosted zones by name with the labels
 * reversed. For example:
 * </p>
 * <p>
 * <code>com.example.www.</code>
 * </p>
 * <p>
 * Note the trailing dot, which can change the sort order in some circumstances.
 * </p>
 * <p>
 * If the domain name includes escape characters or Punycode,
 * <code>ListHostedZonesByName</code> alphabetizes the domain name using the
 * escaped or Punycoded value, which is the format that Amazon Route 53 saves in
 * its database. For example, to create a hosted zone for exämple.com, you
 * specify ex\344mple.com for the domain name.
 * <code>ListHostedZonesByName</code> alphabetizes it as:
 * </p>
 * <p>
 * <code>com.ex\344mple.</code>
 * </p>
 * <p>
 * The labels are reversed and alphabetized using the escaped value. For more
 * information about valid domain name formats, including internationalized
 * domain names, see <a href=
 * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html"
 * >DNS Domain Name Format</a> in the <i>Amazon Route 53 Developer Guide</i>.
 * </p>
 * <p>
 * Route 53 returns up to 100 items in each response. If you have a lot of
 * hosted zones, use the <code>MaxItems</code> parameter to list them in groups
 * of up to 100. The response includes values that help navigate from one group
 * of <code>MaxItems</code> hosted zones to the next:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The <code>DNSName</code> and <code>HostedZoneId</code> elements in the
 * response contain the values, if any, specified for the <code>dnsname</code>
 * and <code>hostedzoneid</code> parameters in the request that produced the
 * current response.
 * </p>
 * </li>
 * <li>
 * <p>
 * The <code>MaxItems</code> element in the response contains the value, if any,
 * that you specified for the <code>maxitems</code> parameter in the request
 * that produced the current response.
 * </p>
 * </li>
 * <li>
 * <p>
 * If the value of <code>IsTruncated</code> in the response is true, there are
 * more hosted zones associated with the current AWS account.
 * </p>
 * <p>
 * If <code>IsTruncated</code> is false, this response includes the last hosted
 * zone that is associated with the current account. The
 * <code>NextDNSName</code> element and <code>NextHostedZoneId</code> elements
 * are omitted from the response.
 * </p>
 * </li>
 * <li>
 * <p>
 * The <code>NextDNSName</code> and <code>NextHostedZoneId</code> elements in
 * the response contain the domain name and the hosted zone ID of the next
 * hosted zone that is associated with the current AWS account. If you want to
 * list more hosted zones, make another call to
 * <code>ListHostedZonesByName</code>, and specify the value of
 * <code>NextDNSName</code> and <code>NextHostedZoneId</code> in the
 * <code>dnsname</code> and <code>hostedzoneid</code> parameters, respectively.
 * </p>
 * </li>
 * </ul>
 */
public class ListHostedZonesByNameRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * (Optional) For your first request to <code>ListHostedZonesByName</code>,
     * include the <code>dnsname</code> parameter only if you want to specify
     * the name of the first hosted zone in the response. If you don't include
     * the <code>dnsname</code> parameter, Amazon Route 53 returns all of the
     * hosted zones that were created by the current AWS account, in ASCII
     * order. For subsequent requests, include both <code>dnsname</code> and
     * <code>hostedzoneid</code> parameters. For <code>dnsname</code>, specify
     * the value of <code>NextDNSName</code> from the previous response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String dNSName;

    /**
     * <p>
     * (Optional) For your first request to <code>ListHostedZonesByName</code>,
     * do not include the <code>hostedzoneid</code> parameter.
     * </p>
     * <p>
     * If you have more hosted zones than the value of <code>maxitems</code>,
     * <code>ListHostedZonesByName</code> returns only the first
     * <code>maxitems</code> hosted zones. To get the next group of
     * <code>maxitems</code> hosted zones, submit another request to
     * <code>ListHostedZonesByName</code> and include both <code>dnsname</code>
     * and <code>hostedzoneid</code> parameters. For the value of
     * <code>hostedzoneid</code>, specify the value of the
     * <code>NextHostedZoneId</code> element from the previous response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     */
    private String hostedZoneId;

    /**
     * <p>
     * The maximum number of hosted zones to be included in the response body
     * for this request. If you have more than <code>maxitems</code> hosted
     * zones, then the value of the <code>IsTruncated</code> element in the
     * response is true, and the values of <code>NextDNSName</code> and
     * <code>NextHostedZoneId</code> specify the first hosted zone in the next
     * group of <code>maxitems</code> hosted zones.
     * </p>
     */
    private String maxItems;

    /**
     * <p>
     * (Optional) For your first request to <code>ListHostedZonesByName</code>,
     * include the <code>dnsname</code> parameter only if you want to specify
     * the name of the first hosted zone in the response. If you don't include
     * the <code>dnsname</code> parameter, Amazon Route 53 returns all of the
     * hosted zones that were created by the current AWS account, in ASCII
     * order. For subsequent requests, include both <code>dnsname</code> and
     * <code>hostedzoneid</code> parameters. For <code>dnsname</code>, specify
     * the value of <code>NextDNSName</code> from the previous response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         (Optional) For your first request to
     *         <code>ListHostedZonesByName</code>, include the
     *         <code>dnsname</code> parameter only if you want to specify the
     *         name of the first hosted zone in the response. If you don't
     *         include the <code>dnsname</code> parameter, Amazon Route 53
     *         returns all of the hosted zones that were created by the current
     *         AWS account, in ASCII order. For subsequent requests, include
     *         both <code>dnsname</code> and <code>hostedzoneid</code>
     *         parameters. For <code>dnsname</code>, specify the value of
     *         <code>NextDNSName</code> from the previous response.
     *         </p>
     */
    public String getDNSName() {
        return dNSName;
    }

    /**
     * <p>
     * (Optional) For your first request to <code>ListHostedZonesByName</code>,
     * include the <code>dnsname</code> parameter only if you want to specify
     * the name of the first hosted zone in the response. If you don't include
     * the <code>dnsname</code> parameter, Amazon Route 53 returns all of the
     * hosted zones that were created by the current AWS account, in ASCII
     * order. For subsequent requests, include both <code>dnsname</code> and
     * <code>hostedzoneid</code> parameters. For <code>dnsname</code>, specify
     * the value of <code>NextDNSName</code> from the previous response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param dNSName <p>
     *            (Optional) For your first request to
     *            <code>ListHostedZonesByName</code>, include the
     *            <code>dnsname</code> parameter only if you want to specify the
     *            name of the first hosted zone in the response. If you don't
     *            include the <code>dnsname</code> parameter, Amazon Route 53
     *            returns all of the hosted zones that were created by the
     *            current AWS account, in ASCII order. For subsequent requests,
     *            include both <code>dnsname</code> and
     *            <code>hostedzoneid</code> parameters. For <code>dnsname</code>
     *            , specify the value of <code>NextDNSName</code> from the
     *            previous response.
     *            </p>
     */
    public void setDNSName(String dNSName) {
        this.dNSName = dNSName;
    }

    /**
     * <p>
     * (Optional) For your first request to <code>ListHostedZonesByName</code>,
     * include the <code>dnsname</code> parameter only if you want to specify
     * the name of the first hosted zone in the response. If you don't include
     * the <code>dnsname</code> parameter, Amazon Route 53 returns all of the
     * hosted zones that were created by the current AWS account, in ASCII
     * order. For subsequent requests, include both <code>dnsname</code> and
     * <code>hostedzoneid</code> parameters. For <code>dnsname</code>, specify
     * the value of <code>NextDNSName</code> from the previous response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param dNSName <p>
     *            (Optional) For your first request to
     *            <code>ListHostedZonesByName</code>, include the
     *            <code>dnsname</code> parameter only if you want to specify the
     *            name of the first hosted zone in the response. If you don't
     *            include the <code>dnsname</code> parameter, Amazon Route 53
     *            returns all of the hosted zones that were created by the
     *            current AWS account, in ASCII order. For subsequent requests,
     *            include both <code>dnsname</code> and
     *            <code>hostedzoneid</code> parameters. For <code>dnsname</code>
     *            , specify the value of <code>NextDNSName</code> from the
     *            previous response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListHostedZonesByNameRequest withDNSName(String dNSName) {
        this.dNSName = dNSName;
        return this;
    }

    /**
     * <p>
     * (Optional) For your first request to <code>ListHostedZonesByName</code>,
     * do not include the <code>hostedzoneid</code> parameter.
     * </p>
     * <p>
     * If you have more hosted zones than the value of <code>maxitems</code>,
     * <code>ListHostedZonesByName</code> returns only the first
     * <code>maxitems</code> hosted zones. To get the next group of
     * <code>maxitems</code> hosted zones, submit another request to
     * <code>ListHostedZonesByName</code> and include both <code>dnsname</code>
     * and <code>hostedzoneid</code> parameters. For the value of
     * <code>hostedzoneid</code>, specify the value of the
     * <code>NextHostedZoneId</code> element from the previous response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @return <p>
     *         (Optional) For your first request to
     *         <code>ListHostedZonesByName</code>, do not include the
     *         <code>hostedzoneid</code> parameter.
     *         </p>
     *         <p>
     *         If you have more hosted zones than the value of
     *         <code>maxitems</code>, <code>ListHostedZonesByName</code> returns
     *         only the first <code>maxitems</code> hosted zones. To get the
     *         next group of <code>maxitems</code> hosted zones, submit another
     *         request to <code>ListHostedZonesByName</code> and include both
     *         <code>dnsname</code> and <code>hostedzoneid</code> parameters.
     *         For the value of <code>hostedzoneid</code>, specify the value of
     *         the <code>NextHostedZoneId</code> element from the previous
     *         response.
     *         </p>
     */
    public String getHostedZoneId() {
        return hostedZoneId;
    }

    /**
     * <p>
     * (Optional) For your first request to <code>ListHostedZonesByName</code>,
     * do not include the <code>hostedzoneid</code> parameter.
     * </p>
     * <p>
     * If you have more hosted zones than the value of <code>maxitems</code>,
     * <code>ListHostedZonesByName</code> returns only the first
     * <code>maxitems</code> hosted zones. To get the next group of
     * <code>maxitems</code> hosted zones, submit another request to
     * <code>ListHostedZonesByName</code> and include both <code>dnsname</code>
     * and <code>hostedzoneid</code> parameters. For the value of
     * <code>hostedzoneid</code>, specify the value of the
     * <code>NextHostedZoneId</code> element from the previous response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param hostedZoneId <p>
     *            (Optional) For your first request to
     *            <code>ListHostedZonesByName</code>, do not include the
     *            <code>hostedzoneid</code> parameter.
     *            </p>
     *            <p>
     *            If you have more hosted zones than the value of
     *            <code>maxitems</code>, <code>ListHostedZonesByName</code>
     *            returns only the first <code>maxitems</code> hosted zones. To
     *            get the next group of <code>maxitems</code> hosted zones,
     *            submit another request to <code>ListHostedZonesByName</code>
     *            and include both <code>dnsname</code> and
     *            <code>hostedzoneid</code> parameters. For the value of
     *            <code>hostedzoneid</code>, specify the value of the
     *            <code>NextHostedZoneId</code> element from the previous
     *            response.
     *            </p>
     */
    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * (Optional) For your first request to <code>ListHostedZonesByName</code>,
     * do not include the <code>hostedzoneid</code> parameter.
     * </p>
     * <p>
     * If you have more hosted zones than the value of <code>maxitems</code>,
     * <code>ListHostedZonesByName</code> returns only the first
     * <code>maxitems</code> hosted zones. To get the next group of
     * <code>maxitems</code> hosted zones, submit another request to
     * <code>ListHostedZonesByName</code> and include both <code>dnsname</code>
     * and <code>hostedzoneid</code> parameters. For the value of
     * <code>hostedzoneid</code>, specify the value of the
     * <code>NextHostedZoneId</code> element from the previous response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param hostedZoneId <p>
     *            (Optional) For your first request to
     *            <code>ListHostedZonesByName</code>, do not include the
     *            <code>hostedzoneid</code> parameter.
     *            </p>
     *            <p>
     *            If you have more hosted zones than the value of
     *            <code>maxitems</code>, <code>ListHostedZonesByName</code>
     *            returns only the first <code>maxitems</code> hosted zones. To
     *            get the next group of <code>maxitems</code> hosted zones,
     *            submit another request to <code>ListHostedZonesByName</code>
     *            and include both <code>dnsname</code> and
     *            <code>hostedzoneid</code> parameters. For the value of
     *            <code>hostedzoneid</code>, specify the value of the
     *            <code>NextHostedZoneId</code> element from the previous
     *            response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListHostedZonesByNameRequest withHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
        return this;
    }

    /**
     * <p>
     * The maximum number of hosted zones to be included in the response body
     * for this request. If you have more than <code>maxitems</code> hosted
     * zones, then the value of the <code>IsTruncated</code> element in the
     * response is true, and the values of <code>NextDNSName</code> and
     * <code>NextHostedZoneId</code> specify the first hosted zone in the next
     * group of <code>maxitems</code> hosted zones.
     * </p>
     *
     * @return <p>
     *         The maximum number of hosted zones to be included in the response
     *         body for this request. If you have more than
     *         <code>maxitems</code> hosted zones, then the value of the
     *         <code>IsTruncated</code> element in the response is true, and the
     *         values of <code>NextDNSName</code> and
     *         <code>NextHostedZoneId</code> specify the first hosted zone in
     *         the next group of <code>maxitems</code> hosted zones.
     *         </p>
     */
    public String getMaxItems() {
        return maxItems;
    }

    /**
     * <p>
     * The maximum number of hosted zones to be included in the response body
     * for this request. If you have more than <code>maxitems</code> hosted
     * zones, then the value of the <code>IsTruncated</code> element in the
     * response is true, and the values of <code>NextDNSName</code> and
     * <code>NextHostedZoneId</code> specify the first hosted zone in the next
     * group of <code>maxitems</code> hosted zones.
     * </p>
     *
     * @param maxItems <p>
     *            The maximum number of hosted zones to be included in the
     *            response body for this request. If you have more than
     *            <code>maxitems</code> hosted zones, then the value of the
     *            <code>IsTruncated</code> element in the response is true, and
     *            the values of <code>NextDNSName</code> and
     *            <code>NextHostedZoneId</code> specify the first hosted zone in
     *            the next group of <code>maxitems</code> hosted zones.
     *            </p>
     */
    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The maximum number of hosted zones to be included in the response body
     * for this request. If you have more than <code>maxitems</code> hosted
     * zones, then the value of the <code>IsTruncated</code> element in the
     * response is true, and the values of <code>NextDNSName</code> and
     * <code>NextHostedZoneId</code> specify the first hosted zone in the next
     * group of <code>maxitems</code> hosted zones.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxItems <p>
     *            The maximum number of hosted zones to be included in the
     *            response body for this request. If you have more than
     *            <code>maxitems</code> hosted zones, then the value of the
     *            <code>IsTruncated</code> element in the response is true, and
     *            the values of <code>NextDNSName</code> and
     *            <code>NextHostedZoneId</code> specify the first hosted zone in
     *            the next group of <code>maxitems</code> hosted zones.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListHostedZonesByNameRequest withMaxItems(String maxItems) {
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
        if (getDNSName() != null)
            sb.append("DNSName: " + getDNSName() + ",");
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: " + getHostedZoneId() + ",");
        if (getMaxItems() != null)
            sb.append("MaxItems: " + getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDNSName() == null) ? 0 : getDNSName().hashCode());
        hashCode = prime * hashCode
                + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListHostedZonesByNameRequest == false)
            return false;
        ListHostedZonesByNameRequest other = (ListHostedZonesByNameRequest) obj;

        if (other.getDNSName() == null ^ this.getDNSName() == null)
            return false;
        if (other.getDNSName() != null && other.getDNSName().equals(this.getDNSName()) == false)
            return false;
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null
                && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }
}
