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
 * Lists the resource record sets in a specified hosted zone.
 * </p>
 * <p>
 * <code>ListResourceRecordSets</code> returns up to 100 resource record sets at
 * a time in ASCII order, beginning at a position specified by the
 * <code>name</code> and <code>type</code> elements.
 * </p>
 * <p>
 * <b>Sort order</b>
 * </p>
 * <p>
 * <code>ListResourceRecordSets</code> sorts results first by DNS name with the
 * labels reversed, for example:
 * </p>
 * <p>
 * <code>com.example.www.</code>
 * </p>
 * <p>
 * Note the trailing dot, which can change the sort order when the record name
 * contains characters that appear before <code>.</code> (decimal 46) in the
 * ASCII table. These characters include the following:
 * <code>! " # $ % &amp; ' ( ) * + , -</code>
 * </p>
 * <p>
 * When multiple records have the same DNS name,
 * <code>ListResourceRecordSets</code> sorts results by the record type.
 * </p>
 * <p>
 * <b>Specifying where to start listing records</b>
 * </p>
 * <p>
 * You can use the name and type elements to specify the resource record set
 * that the list begins with:
 * </p>
 * <dl>
 * <dt>If you do not specify Name or Type</dt>
 * <dd>
 * <p>
 * The results begin with the first resource record set that the hosted zone
 * contains.
 * </p>
 * </dd>
 * <dt>If you specify Name but not Type</dt>
 * <dd>
 * <p>
 * The results begin with the first resource record set in the list whose name
 * is greater than or equal to <code>Name</code>.
 * </p>
 * </dd>
 * <dt>If you specify Type but not Name</dt>
 * <dd>
 * <p>
 * Amazon Route 53 returns the <code>InvalidInput</code> error.
 * </p>
 * </dd>
 * <dt>If you specify both Name and Type</dt>
 * <dd>
 * <p>
 * The results begin with the first resource record set in the list whose name
 * is greater than or equal to <code>Name</code>, and whose type is greater than
 * or equal to <code>Type</code>.
 * </p>
 * </dd>
 * </dl>
 * <p>
 * <b>Resource record sets that are PENDING</b>
 * </p>
 * <p>
 * This action returns the most current version of the records. This includes
 * records that are <code>PENDING</code>, and that are not yet available on all
 * Route 53 DNS servers.
 * </p>
 * <p>
 * <b>Changing resource record sets</b>
 * </p>
 * <p>
 * To ensure that you get an accurate listing of the resource record sets for a
 * hosted zone at a point in time, do not submit a
 * <code>ChangeResourceRecordSets</code> request while you're paging through the
 * results of a <code>ListResourceRecordSets</code> request. If you do, some
 * pages may display results without the latest changes while other pages
 * display results with the latest changes.
 * </p>
 * <p>
 * <b>Displaying the next page of results</b>
 * </p>
 * <p>
 * If a <code>ListResourceRecordSets</code> command returns more than one page
 * of results, the value of <code>IsTruncated</code> is <code>true</code>. To
 * display the next page of results, get the values of
 * <code>NextRecordName</code>, <code>NextRecordType</code>, and
 * <code>NextRecordIdentifier</code> (if any) from the response. Then submit
 * another <code>ListResourceRecordSets</code> request, and specify those values
 * for <code>StartRecordName</code>, <code>StartRecordType</code>, and
 * <code>StartRecordIdentifier</code>.
 * </p>
 */
public class ListResourceRecordSetsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the hosted zone that contains the resource record sets that you
     * want to list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     */
    private String hostedZoneId;

    /**
     * <p>
     * The first name in the lexicographic ordering of resource record sets that
     * you want to list. If the specified record name doesn't exist, the results
     * begin with the first resource record set that has a name greater than the
     * value of <code>name</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String startRecordName;

    /**
     * <p>
     * The type of resource record set to begin the record listing from.
     * </p>
     * <p>
     * Valid values for basic resource record sets: <code>A</code> |
     * <code>AAAA</code> | <code>CAA</code> | <code>CNAME</code> |
     * <code>MX</code> | <code>NAPTR</code> | <code>NS</code> | <code>PTR</code>
     * | <code>SOA</code> | <code>SPF</code> | <code>SRV</code> |
     * <code>TXT</code>
     * </p>
     * <p>
     * Values for weighted, latency, geolocation, and failover resource record
     * sets: <code>A</code> | <code>AAAA</code> | <code>CAA</code> |
     * <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> |
     * <code>PTR</code> | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for alias resource record sets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>API Gateway custom regional API or edge-optimized API</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CloudFront distribution</b>: A or AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Elastic Beanstalk environment that has a regionalized subdomain</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Elastic Load Balancing load balancer</b>: A | AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>S3 bucket</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>VPC interface VPC endpoint</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Another resource record set in this hosted zone:</b> The type of the
     * resource record set that the alias references.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Constraint: Specifying <code>type</code> without specifying
     * <code>name</code> returns an <code>InvalidInput</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     */
    private String startRecordType;

    /**
     * <p>
     * <i>Resource record sets that have a routing policy other than simple:</i>
     * If results were truncated for a given DNS name and type, specify the
     * value of <code>NextRecordIdentifier</code> from the previous response to
     * get the next resource record set that has the current DNS name and type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String startRecordIdentifier;

    /**
     * <p>
     * (Optional) The maximum number of resource records sets to include in the
     * response body for this request. If the response includes more than
     * <code>maxitems</code> resource record sets, the value of the
     * <code>IsTruncated</code> element in the response is <code>true</code>,
     * and the values of the <code>NextRecordName</code> and
     * <code>NextRecordType</code> elements in the response identify the first
     * resource record set in the next group of <code>maxitems</code> resource
     * record sets.
     * </p>
     */
    private String maxItems;

    /**
     * <p>
     * The ID of the hosted zone that contains the resource record sets that you
     * want to list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @return <p>
     *         The ID of the hosted zone that contains the resource record sets
     *         that you want to list.
     *         </p>
     */
    public String getHostedZoneId() {
        return hostedZoneId;
    }

    /**
     * <p>
     * The ID of the hosted zone that contains the resource record sets that you
     * want to list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param hostedZoneId <p>
     *            The ID of the hosted zone that contains the resource record
     *            sets that you want to list.
     *            </p>
     */
    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * The ID of the hosted zone that contains the resource record sets that you
     * want to list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param hostedZoneId <p>
     *            The ID of the hosted zone that contains the resource record
     *            sets that you want to list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListResourceRecordSetsRequest withHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
        return this;
    }

    /**
     * <p>
     * The first name in the lexicographic ordering of resource record sets that
     * you want to list. If the specified record name doesn't exist, the results
     * begin with the first resource record set that has a name greater than the
     * value of <code>name</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         The first name in the lexicographic ordering of resource record
     *         sets that you want to list. If the specified record name doesn't
     *         exist, the results begin with the first resource record set that
     *         has a name greater than the value of <code>name</code>.
     *         </p>
     */
    public String getStartRecordName() {
        return startRecordName;
    }

    /**
     * <p>
     * The first name in the lexicographic ordering of resource record sets that
     * you want to list. If the specified record name doesn't exist, the results
     * begin with the first resource record set that has a name greater than the
     * value of <code>name</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param startRecordName <p>
     *            The first name in the lexicographic ordering of resource
     *            record sets that you want to list. If the specified record
     *            name doesn't exist, the results begin with the first resource
     *            record set that has a name greater than the value of
     *            <code>name</code>.
     *            </p>
     */
    public void setStartRecordName(String startRecordName) {
        this.startRecordName = startRecordName;
    }

    /**
     * <p>
     * The first name in the lexicographic ordering of resource record sets that
     * you want to list. If the specified record name doesn't exist, the results
     * begin with the first resource record set that has a name greater than the
     * value of <code>name</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param startRecordName <p>
     *            The first name in the lexicographic ordering of resource
     *            record sets that you want to list. If the specified record
     *            name doesn't exist, the results begin with the first resource
     *            record set that has a name greater than the value of
     *            <code>name</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListResourceRecordSetsRequest withStartRecordName(String startRecordName) {
        this.startRecordName = startRecordName;
        return this;
    }

    /**
     * <p>
     * The type of resource record set to begin the record listing from.
     * </p>
     * <p>
     * Valid values for basic resource record sets: <code>A</code> |
     * <code>AAAA</code> | <code>CAA</code> | <code>CNAME</code> |
     * <code>MX</code> | <code>NAPTR</code> | <code>NS</code> | <code>PTR</code>
     * | <code>SOA</code> | <code>SPF</code> | <code>SRV</code> |
     * <code>TXT</code>
     * </p>
     * <p>
     * Values for weighted, latency, geolocation, and failover resource record
     * sets: <code>A</code> | <code>AAAA</code> | <code>CAA</code> |
     * <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> |
     * <code>PTR</code> | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for alias resource record sets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>API Gateway custom regional API or edge-optimized API</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CloudFront distribution</b>: A or AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Elastic Beanstalk environment that has a regionalized subdomain</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Elastic Load Balancing load balancer</b>: A | AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>S3 bucket</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>VPC interface VPC endpoint</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Another resource record set in this hosted zone:</b> The type of the
     * resource record set that the alias references.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Constraint: Specifying <code>type</code> without specifying
     * <code>name</code> returns an <code>InvalidInput</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     *
     * @return <p>
     *         The type of resource record set to begin the record listing from.
     *         </p>
     *         <p>
     *         Valid values for basic resource record sets: <code>A</code> |
     *         <code>AAAA</code> | <code>CAA</code> | <code>CNAME</code> |
     *         <code>MX</code> | <code>NAPTR</code> | <code>NS</code> |
     *         <code>PTR</code> | <code>SOA</code> | <code>SPF</code> |
     *         <code>SRV</code> | <code>TXT</code>
     *         </p>
     *         <p>
     *         Values for weighted, latency, geolocation, and failover resource
     *         record sets: <code>A</code> | <code>AAAA</code> |
     *         <code>CAA</code> | <code>CNAME</code> | <code>MX</code> |
     *         <code>NAPTR</code> | <code>PTR</code> | <code>SPF</code> |
     *         <code>SRV</code> | <code>TXT</code>
     *         </p>
     *         <p>
     *         Values for alias resource record sets:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>API Gateway custom regional API or edge-optimized API</b>: A
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>CloudFront distribution</b>: A or AAAA
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Elastic Beanstalk environment that has a regionalized
     *         subdomain</b>: A
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Elastic Load Balancing load balancer</b>: A | AAAA
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>S3 bucket</b>: A
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>VPC interface VPC endpoint</b>: A
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Another resource record set in this hosted zone:</b> The type
     *         of the resource record set that the alias references.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Constraint: Specifying <code>type</code> without specifying
     *         <code>name</code> returns an <code>InvalidInput</code> error.
     *         </p>
     * @see RRType
     */
    public String getStartRecordType() {
        return startRecordType;
    }

    /**
     * <p>
     * The type of resource record set to begin the record listing from.
     * </p>
     * <p>
     * Valid values for basic resource record sets: <code>A</code> |
     * <code>AAAA</code> | <code>CAA</code> | <code>CNAME</code> |
     * <code>MX</code> | <code>NAPTR</code> | <code>NS</code> | <code>PTR</code>
     * | <code>SOA</code> | <code>SPF</code> | <code>SRV</code> |
     * <code>TXT</code>
     * </p>
     * <p>
     * Values for weighted, latency, geolocation, and failover resource record
     * sets: <code>A</code> | <code>AAAA</code> | <code>CAA</code> |
     * <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> |
     * <code>PTR</code> | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for alias resource record sets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>API Gateway custom regional API or edge-optimized API</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CloudFront distribution</b>: A or AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Elastic Beanstalk environment that has a regionalized subdomain</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Elastic Load Balancing load balancer</b>: A | AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>S3 bucket</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>VPC interface VPC endpoint</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Another resource record set in this hosted zone:</b> The type of the
     * resource record set that the alias references.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Constraint: Specifying <code>type</code> without specifying
     * <code>name</code> returns an <code>InvalidInput</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     *
     * @param startRecordType <p>
     *            The type of resource record set to begin the record listing
     *            from.
     *            </p>
     *            <p>
     *            Valid values for basic resource record sets: <code>A</code> |
     *            <code>AAAA</code> | <code>CAA</code> | <code>CNAME</code> |
     *            <code>MX</code> | <code>NAPTR</code> | <code>NS</code> |
     *            <code>PTR</code> | <code>SOA</code> | <code>SPF</code> |
     *            <code>SRV</code> | <code>TXT</code>
     *            </p>
     *            <p>
     *            Values for weighted, latency, geolocation, and failover
     *            resource record sets: <code>A</code> | <code>AAAA</code> |
     *            <code>CAA</code> | <code>CNAME</code> | <code>MX</code> |
     *            <code>NAPTR</code> | <code>PTR</code> | <code>SPF</code> |
     *            <code>SRV</code> | <code>TXT</code>
     *            </p>
     *            <p>
     *            Values for alias resource record sets:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>API Gateway custom regional API or edge-optimized API</b>:
     *            A
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>CloudFront distribution</b>: A or AAAA
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Elastic Beanstalk environment that has a regionalized
     *            subdomain</b>: A
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Elastic Load Balancing load balancer</b>: A | AAAA
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>S3 bucket</b>: A
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>VPC interface VPC endpoint</b>: A
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Another resource record set in this hosted zone:</b> The
     *            type of the resource record set that the alias references.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Constraint: Specifying <code>type</code> without specifying
     *            <code>name</code> returns an <code>InvalidInput</code> error.
     *            </p>
     * @see RRType
     */
    public void setStartRecordType(String startRecordType) {
        this.startRecordType = startRecordType;
    }

    /**
     * <p>
     * The type of resource record set to begin the record listing from.
     * </p>
     * <p>
     * Valid values for basic resource record sets: <code>A</code> |
     * <code>AAAA</code> | <code>CAA</code> | <code>CNAME</code> |
     * <code>MX</code> | <code>NAPTR</code> | <code>NS</code> | <code>PTR</code>
     * | <code>SOA</code> | <code>SPF</code> | <code>SRV</code> |
     * <code>TXT</code>
     * </p>
     * <p>
     * Values for weighted, latency, geolocation, and failover resource record
     * sets: <code>A</code> | <code>AAAA</code> | <code>CAA</code> |
     * <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> |
     * <code>PTR</code> | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for alias resource record sets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>API Gateway custom regional API or edge-optimized API</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CloudFront distribution</b>: A or AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Elastic Beanstalk environment that has a regionalized subdomain</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Elastic Load Balancing load balancer</b>: A | AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>S3 bucket</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>VPC interface VPC endpoint</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Another resource record set in this hosted zone:</b> The type of the
     * resource record set that the alias references.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Constraint: Specifying <code>type</code> without specifying
     * <code>name</code> returns an <code>InvalidInput</code> error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     *
     * @param startRecordType <p>
     *            The type of resource record set to begin the record listing
     *            from.
     *            </p>
     *            <p>
     *            Valid values for basic resource record sets: <code>A</code> |
     *            <code>AAAA</code> | <code>CAA</code> | <code>CNAME</code> |
     *            <code>MX</code> | <code>NAPTR</code> | <code>NS</code> |
     *            <code>PTR</code> | <code>SOA</code> | <code>SPF</code> |
     *            <code>SRV</code> | <code>TXT</code>
     *            </p>
     *            <p>
     *            Values for weighted, latency, geolocation, and failover
     *            resource record sets: <code>A</code> | <code>AAAA</code> |
     *            <code>CAA</code> | <code>CNAME</code> | <code>MX</code> |
     *            <code>NAPTR</code> | <code>PTR</code> | <code>SPF</code> |
     *            <code>SRV</code> | <code>TXT</code>
     *            </p>
     *            <p>
     *            Values for alias resource record sets:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>API Gateway custom regional API or edge-optimized API</b>:
     *            A
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>CloudFront distribution</b>: A or AAAA
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Elastic Beanstalk environment that has a regionalized
     *            subdomain</b>: A
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Elastic Load Balancing load balancer</b>: A | AAAA
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>S3 bucket</b>: A
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>VPC interface VPC endpoint</b>: A
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Another resource record set in this hosted zone:</b> The
     *            type of the resource record set that the alias references.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Constraint: Specifying <code>type</code> without specifying
     *            <code>name</code> returns an <code>InvalidInput</code> error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RRType
     */
    public ListResourceRecordSetsRequest withStartRecordType(String startRecordType) {
        this.startRecordType = startRecordType;
        return this;
    }

    /**
     * <p>
     * The type of resource record set to begin the record listing from.
     * </p>
     * <p>
     * Valid values for basic resource record sets: <code>A</code> |
     * <code>AAAA</code> | <code>CAA</code> | <code>CNAME</code> |
     * <code>MX</code> | <code>NAPTR</code> | <code>NS</code> | <code>PTR</code>
     * | <code>SOA</code> | <code>SPF</code> | <code>SRV</code> |
     * <code>TXT</code>
     * </p>
     * <p>
     * Values for weighted, latency, geolocation, and failover resource record
     * sets: <code>A</code> | <code>AAAA</code> | <code>CAA</code> |
     * <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> |
     * <code>PTR</code> | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for alias resource record sets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>API Gateway custom regional API or edge-optimized API</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CloudFront distribution</b>: A or AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Elastic Beanstalk environment that has a regionalized subdomain</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Elastic Load Balancing load balancer</b>: A | AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>S3 bucket</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>VPC interface VPC endpoint</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Another resource record set in this hosted zone:</b> The type of the
     * resource record set that the alias references.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Constraint: Specifying <code>type</code> without specifying
     * <code>name</code> returns an <code>InvalidInput</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     *
     * @param startRecordType <p>
     *            The type of resource record set to begin the record listing
     *            from.
     *            </p>
     *            <p>
     *            Valid values for basic resource record sets: <code>A</code> |
     *            <code>AAAA</code> | <code>CAA</code> | <code>CNAME</code> |
     *            <code>MX</code> | <code>NAPTR</code> | <code>NS</code> |
     *            <code>PTR</code> | <code>SOA</code> | <code>SPF</code> |
     *            <code>SRV</code> | <code>TXT</code>
     *            </p>
     *            <p>
     *            Values for weighted, latency, geolocation, and failover
     *            resource record sets: <code>A</code> | <code>AAAA</code> |
     *            <code>CAA</code> | <code>CNAME</code> | <code>MX</code> |
     *            <code>NAPTR</code> | <code>PTR</code> | <code>SPF</code> |
     *            <code>SRV</code> | <code>TXT</code>
     *            </p>
     *            <p>
     *            Values for alias resource record sets:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>API Gateway custom regional API or edge-optimized API</b>:
     *            A
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>CloudFront distribution</b>: A or AAAA
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Elastic Beanstalk environment that has a regionalized
     *            subdomain</b>: A
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Elastic Load Balancing load balancer</b>: A | AAAA
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>S3 bucket</b>: A
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>VPC interface VPC endpoint</b>: A
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Another resource record set in this hosted zone:</b> The
     *            type of the resource record set that the alias references.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Constraint: Specifying <code>type</code> without specifying
     *            <code>name</code> returns an <code>InvalidInput</code> error.
     *            </p>
     * @see RRType
     */
    public void setStartRecordType(RRType startRecordType) {
        this.startRecordType = startRecordType.toString();
    }

    /**
     * <p>
     * The type of resource record set to begin the record listing from.
     * </p>
     * <p>
     * Valid values for basic resource record sets: <code>A</code> |
     * <code>AAAA</code> | <code>CAA</code> | <code>CNAME</code> |
     * <code>MX</code> | <code>NAPTR</code> | <code>NS</code> | <code>PTR</code>
     * | <code>SOA</code> | <code>SPF</code> | <code>SRV</code> |
     * <code>TXT</code>
     * </p>
     * <p>
     * Values for weighted, latency, geolocation, and failover resource record
     * sets: <code>A</code> | <code>AAAA</code> | <code>CAA</code> |
     * <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> |
     * <code>PTR</code> | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for alias resource record sets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>API Gateway custom regional API or edge-optimized API</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CloudFront distribution</b>: A or AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Elastic Beanstalk environment that has a regionalized subdomain</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Elastic Load Balancing load balancer</b>: A | AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>S3 bucket</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>VPC interface VPC endpoint</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Another resource record set in this hosted zone:</b> The type of the
     * resource record set that the alias references.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Constraint: Specifying <code>type</code> without specifying
     * <code>name</code> returns an <code>InvalidInput</code> error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     *
     * @param startRecordType <p>
     *            The type of resource record set to begin the record listing
     *            from.
     *            </p>
     *            <p>
     *            Valid values for basic resource record sets: <code>A</code> |
     *            <code>AAAA</code> | <code>CAA</code> | <code>CNAME</code> |
     *            <code>MX</code> | <code>NAPTR</code> | <code>NS</code> |
     *            <code>PTR</code> | <code>SOA</code> | <code>SPF</code> |
     *            <code>SRV</code> | <code>TXT</code>
     *            </p>
     *            <p>
     *            Values for weighted, latency, geolocation, and failover
     *            resource record sets: <code>A</code> | <code>AAAA</code> |
     *            <code>CAA</code> | <code>CNAME</code> | <code>MX</code> |
     *            <code>NAPTR</code> | <code>PTR</code> | <code>SPF</code> |
     *            <code>SRV</code> | <code>TXT</code>
     *            </p>
     *            <p>
     *            Values for alias resource record sets:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>API Gateway custom regional API or edge-optimized API</b>:
     *            A
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>CloudFront distribution</b>: A or AAAA
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Elastic Beanstalk environment that has a regionalized
     *            subdomain</b>: A
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Elastic Load Balancing load balancer</b>: A | AAAA
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>S3 bucket</b>: A
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>VPC interface VPC endpoint</b>: A
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Another resource record set in this hosted zone:</b> The
     *            type of the resource record set that the alias references.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Constraint: Specifying <code>type</code> without specifying
     *            <code>name</code> returns an <code>InvalidInput</code> error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RRType
     */
    public ListResourceRecordSetsRequest withStartRecordType(RRType startRecordType) {
        this.startRecordType = startRecordType.toString();
        return this;
    }

    /**
     * <p>
     * <i>Resource record sets that have a routing policy other than simple:</i>
     * If results were truncated for a given DNS name and type, specify the
     * value of <code>NextRecordIdentifier</code> from the previous response to
     * get the next resource record set that has the current DNS name and type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         <i>Resource record sets that have a routing policy other than
     *         simple:</i> If results were truncated for a given DNS name and
     *         type, specify the value of <code>NextRecordIdentifier</code> from
     *         the previous response to get the next resource record set that
     *         has the current DNS name and type.
     *         </p>
     */
    public String getStartRecordIdentifier() {
        return startRecordIdentifier;
    }

    /**
     * <p>
     * <i>Resource record sets that have a routing policy other than simple:</i>
     * If results were truncated for a given DNS name and type, specify the
     * value of <code>NextRecordIdentifier</code> from the previous response to
     * get the next resource record set that has the current DNS name and type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param startRecordIdentifier <p>
     *            <i>Resource record sets that have a routing policy other than
     *            simple:</i> If results were truncated for a given DNS name and
     *            type, specify the value of <code>NextRecordIdentifier</code>
     *            from the previous response to get the next resource record set
     *            that has the current DNS name and type.
     *            </p>
     */
    public void setStartRecordIdentifier(String startRecordIdentifier) {
        this.startRecordIdentifier = startRecordIdentifier;
    }

    /**
     * <p>
     * <i>Resource record sets that have a routing policy other than simple:</i>
     * If results were truncated for a given DNS name and type, specify the
     * value of <code>NextRecordIdentifier</code> from the previous response to
     * get the next resource record set that has the current DNS name and type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param startRecordIdentifier <p>
     *            <i>Resource record sets that have a routing policy other than
     *            simple:</i> If results were truncated for a given DNS name and
     *            type, specify the value of <code>NextRecordIdentifier</code>
     *            from the previous response to get the next resource record set
     *            that has the current DNS name and type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListResourceRecordSetsRequest withStartRecordIdentifier(String startRecordIdentifier) {
        this.startRecordIdentifier = startRecordIdentifier;
        return this;
    }

    /**
     * <p>
     * (Optional) The maximum number of resource records sets to include in the
     * response body for this request. If the response includes more than
     * <code>maxitems</code> resource record sets, the value of the
     * <code>IsTruncated</code> element in the response is <code>true</code>,
     * and the values of the <code>NextRecordName</code> and
     * <code>NextRecordType</code> elements in the response identify the first
     * resource record set in the next group of <code>maxitems</code> resource
     * record sets.
     * </p>
     *
     * @return <p>
     *         (Optional) The maximum number of resource records sets to include
     *         in the response body for this request. If the response includes
     *         more than <code>maxitems</code> resource record sets, the value
     *         of the <code>IsTruncated</code> element in the response is
     *         <code>true</code>, and the values of the
     *         <code>NextRecordName</code> and <code>NextRecordType</code>
     *         elements in the response identify the first resource record set
     *         in the next group of <code>maxitems</code> resource record sets.
     *         </p>
     */
    public String getMaxItems() {
        return maxItems;
    }

    /**
     * <p>
     * (Optional) The maximum number of resource records sets to include in the
     * response body for this request. If the response includes more than
     * <code>maxitems</code> resource record sets, the value of the
     * <code>IsTruncated</code> element in the response is <code>true</code>,
     * and the values of the <code>NextRecordName</code> and
     * <code>NextRecordType</code> elements in the response identify the first
     * resource record set in the next group of <code>maxitems</code> resource
     * record sets.
     * </p>
     *
     * @param maxItems <p>
     *            (Optional) The maximum number of resource records sets to
     *            include in the response body for this request. If the response
     *            includes more than <code>maxitems</code> resource record sets,
     *            the value of the <code>IsTruncated</code> element in the
     *            response is <code>true</code>, and the values of the
     *            <code>NextRecordName</code> and <code>NextRecordType</code>
     *            elements in the response identify the first resource record
     *            set in the next group of <code>maxitems</code> resource record
     *            sets.
     *            </p>
     */
    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * (Optional) The maximum number of resource records sets to include in the
     * response body for this request. If the response includes more than
     * <code>maxitems</code> resource record sets, the value of the
     * <code>IsTruncated</code> element in the response is <code>true</code>,
     * and the values of the <code>NextRecordName</code> and
     * <code>NextRecordType</code> elements in the response identify the first
     * resource record set in the next group of <code>maxitems</code> resource
     * record sets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxItems <p>
     *            (Optional) The maximum number of resource records sets to
     *            include in the response body for this request. If the response
     *            includes more than <code>maxitems</code> resource record sets,
     *            the value of the <code>IsTruncated</code> element in the
     *            response is <code>true</code>, and the values of the
     *            <code>NextRecordName</code> and <code>NextRecordType</code>
     *            elements in the response identify the first resource record
     *            set in the next group of <code>maxitems</code> resource record
     *            sets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListResourceRecordSetsRequest withMaxItems(String maxItems) {
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
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: " + getHostedZoneId() + ",");
        if (getStartRecordName() != null)
            sb.append("StartRecordName: " + getStartRecordName() + ",");
        if (getStartRecordType() != null)
            sb.append("StartRecordType: " + getStartRecordType() + ",");
        if (getStartRecordIdentifier() != null)
            sb.append("StartRecordIdentifier: " + getStartRecordIdentifier() + ",");
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
                + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode());
        hashCode = prime * hashCode
                + ((getStartRecordName() == null) ? 0 : getStartRecordName().hashCode());
        hashCode = prime * hashCode
                + ((getStartRecordType() == null) ? 0 : getStartRecordType().hashCode());
        hashCode = prime
                * hashCode
                + ((getStartRecordIdentifier() == null) ? 0 : getStartRecordIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListResourceRecordSetsRequest == false)
            return false;
        ListResourceRecordSetsRequest other = (ListResourceRecordSetsRequest) obj;

        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null
                && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        if (other.getStartRecordName() == null ^ this.getStartRecordName() == null)
            return false;
        if (other.getStartRecordName() != null
                && other.getStartRecordName().equals(this.getStartRecordName()) == false)
            return false;
        if (other.getStartRecordType() == null ^ this.getStartRecordType() == null)
            return false;
        if (other.getStartRecordType() != null
                && other.getStartRecordType().equals(this.getStartRecordType()) == false)
            return false;
        if (other.getStartRecordIdentifier() == null ^ this.getStartRecordIdentifier() == null)
            return false;
        if (other.getStartRecordIdentifier() != null
                && other.getStartRecordIdentifier().equals(this.getStartRecordIdentifier()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }
}
