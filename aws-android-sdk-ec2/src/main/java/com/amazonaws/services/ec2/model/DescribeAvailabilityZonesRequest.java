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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Describes the Availability Zones and Local Zones that are available to you.
 * If there is an event impacting an Availability Zone or Local Zone, you can
 * use this request to view the state and any provided messages for that
 * Availability Zone or Local Zone.
 * </p>
 * <p>
 * For more information about Availability Zones and Local Zones, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html"
 * >Regions and Availability Zones</a> in the <i>Amazon Elastic Compute Cloud
 * User Guide</i>.
 * </p>
 */
public class DescribeAvailabilityZonesRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>group-name</code> - For Availability Zones, use the Region name.
     * For Local Zones, use the name of the group associated with the Local Zone
     * (for example, <code>us-west-2-lax-1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>message</code> - The Availability Zone or Local Zone message.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>opt-in-status</code> - The opt in status (<code>opted-in</code>,
     * and <code>not-opted-in</code> | <code>opt-in-not-required</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>region-name</code> - The name of the Region for the Availability
     * Zone or Local Zone (for example, <code>us-east-1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the Availability Zone or Local Zone (
     * <code>available</code> | <code>information</code> | <code>impaired</code>
     * | <code>unavailable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zone-id</code> - The ID of the Availability Zone (for example,
     * <code>use1-az1</code>) or the Local Zone (for example, use
     * <code>usw2-lax1-az1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zone-name</code> - The name of the Availability Zone (for example,
     * <code>us-east-1a</code>) or the Local Zone (for example, use
     * <code>us-west-2-lax-1a</code>).
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * The names of the Availability Zones and Local Zones.
     * </p>
     */
    private java.util.List<String> zoneNames;

    /**
     * <p>
     * The IDs of the Availability Zones and Local Zones.
     * </p>
     */
    private java.util.List<String> zoneIds;

    /**
     * <p>
     * Include all Availability Zones and Local Zones regardless of your opt in
     * status.
     * </p>
     * <p>
     * If you do not use this parameter, the results include only the zones for
     * the Regions where you have chosen the option to opt in.
     * </p>
     */
    private Boolean allAvailabilityZones;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>group-name</code> - For Availability Zones, use the Region name.
     * For Local Zones, use the name of the group associated with the Local Zone
     * (for example, <code>us-west-2-lax-1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>message</code> - The Availability Zone or Local Zone message.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>opt-in-status</code> - The opt in status (<code>opted-in</code>,
     * and <code>not-opted-in</code> | <code>opt-in-not-required</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>region-name</code> - The name of the Region for the Availability
     * Zone or Local Zone (for example, <code>us-east-1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the Availability Zone or Local Zone (
     * <code>available</code> | <code>information</code> | <code>impaired</code>
     * | <code>unavailable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zone-id</code> - The ID of the Availability Zone (for example,
     * <code>use1-az1</code>) or the Local Zone (for example, use
     * <code>usw2-lax1-az1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zone-name</code> - The name of the Availability Zone (for example,
     * <code>us-east-1a</code>) or the Local Zone (for example, use
     * <code>us-west-2-lax-1a</code>).
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The filters.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>group-name</code> - For Availability Zones, use the Region
     *         name. For Local Zones, use the name of the group associated with
     *         the Local Zone (for example, <code>us-west-2-lax-1</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>message</code> - The Availability Zone or Local Zone
     *         message.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>opt-in-status</code> - The opt in status (
     *         <code>opted-in</code>, and <code>not-opted-in</code> |
     *         <code>opt-in-not-required</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>region-name</code> - The name of the Region for the
     *         Availability Zone or Local Zone (for example,
     *         <code>us-east-1</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>state</code> - The state of the Availability Zone or Local
     *         Zone (<code>available</code> | <code>information</code> |
     *         <code>impaired</code> | <code>unavailable</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>zone-id</code> - The ID of the Availability Zone (for
     *         example, <code>use1-az1</code>) or the Local Zone (for example,
     *         use <code>usw2-lax1-az1</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>zone-name</code> - The name of the Availability Zone (for
     *         example, <code>us-east-1a</code>) or the Local Zone (for example,
     *         use <code>us-west-2-lax-1a</code>).
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>group-name</code> - For Availability Zones, use the Region name.
     * For Local Zones, use the name of the group associated with the Local Zone
     * (for example, <code>us-west-2-lax-1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>message</code> - The Availability Zone or Local Zone message.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>opt-in-status</code> - The opt in status (<code>opted-in</code>,
     * and <code>not-opted-in</code> | <code>opt-in-not-required</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>region-name</code> - The name of the Region for the Availability
     * Zone or Local Zone (for example, <code>us-east-1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the Availability Zone or Local Zone (
     * <code>available</code> | <code>information</code> | <code>impaired</code>
     * | <code>unavailable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zone-id</code> - The ID of the Availability Zone (for example,
     * <code>use1-az1</code>) or the Local Zone (for example, use
     * <code>usw2-lax1-az1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zone-name</code> - The name of the Availability Zone (for example,
     * <code>us-east-1a</code>) or the Local Zone (for example, use
     * <code>us-west-2-lax-1a</code>).
     * </p>
     * </li>
     * </ul>
     *
     * @param filters <p>
     *            The filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>group-name</code> - For Availability Zones, use the
     *            Region name. For Local Zones, use the name of the group
     *            associated with the Local Zone (for example,
     *            <code>us-west-2-lax-1</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>message</code> - The Availability Zone or Local Zone
     *            message.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>opt-in-status</code> - The opt in status (
     *            <code>opted-in</code>, and <code>not-opted-in</code> |
     *            <code>opt-in-not-required</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>region-name</code> - The name of the Region for the
     *            Availability Zone or Local Zone (for example,
     *            <code>us-east-1</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state</code> - The state of the Availability Zone or
     *            Local Zone (<code>available</code> | <code>information</code>
     *            | <code>impaired</code> | <code>unavailable</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>zone-id</code> - The ID of the Availability Zone (for
     *            example, <code>use1-az1</code>) or the Local Zone (for
     *            example, use <code>usw2-lax1-az1</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>zone-name</code> - The name of the Availability Zone
     *            (for example, <code>us-east-1a</code>) or the Local Zone (for
     *            example, use <code>us-west-2-lax-1a</code>).
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>group-name</code> - For Availability Zones, use the Region name.
     * For Local Zones, use the name of the group associated with the Local Zone
     * (for example, <code>us-west-2-lax-1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>message</code> - The Availability Zone or Local Zone message.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>opt-in-status</code> - The opt in status (<code>opted-in</code>,
     * and <code>not-opted-in</code> | <code>opt-in-not-required</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>region-name</code> - The name of the Region for the Availability
     * Zone or Local Zone (for example, <code>us-east-1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the Availability Zone or Local Zone (
     * <code>available</code> | <code>information</code> | <code>impaired</code>
     * | <code>unavailable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zone-id</code> - The ID of the Availability Zone (for example,
     * <code>use1-az1</code>) or the Local Zone (for example, use
     * <code>usw2-lax1-az1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zone-name</code> - The name of the Availability Zone (for example,
     * <code>us-east-1a</code>) or the Local Zone (for example, use
     * <code>us-west-2-lax-1a</code>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            The filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>group-name</code> - For Availability Zones, use the
     *            Region name. For Local Zones, use the name of the group
     *            associated with the Local Zone (for example,
     *            <code>us-west-2-lax-1</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>message</code> - The Availability Zone or Local Zone
     *            message.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>opt-in-status</code> - The opt in status (
     *            <code>opted-in</code>, and <code>not-opted-in</code> |
     *            <code>opt-in-not-required</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>region-name</code> - The name of the Region for the
     *            Availability Zone or Local Zone (for example,
     *            <code>us-east-1</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state</code> - The state of the Availability Zone or
     *            Local Zone (<code>available</code> | <code>information</code>
     *            | <code>impaired</code> | <code>unavailable</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>zone-id</code> - The ID of the Availability Zone (for
     *            example, <code>use1-az1</code>) or the Local Zone (for
     *            example, use <code>usw2-lax1-az1</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>zone-name</code> - The name of the Availability Zone
     *            (for example, <code>us-east-1a</code>) or the Local Zone (for
     *            example, use <code>us-west-2-lax-1a</code>).
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAvailabilityZonesRequest withFilters(Filter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<Filter>(filters.length);
        }
        for (Filter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>group-name</code> - For Availability Zones, use the Region name.
     * For Local Zones, use the name of the group associated with the Local Zone
     * (for example, <code>us-west-2-lax-1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>message</code> - The Availability Zone or Local Zone message.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>opt-in-status</code> - The opt in status (<code>opted-in</code>,
     * and <code>not-opted-in</code> | <code>opt-in-not-required</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>region-name</code> - The name of the Region for the Availability
     * Zone or Local Zone (for example, <code>us-east-1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the Availability Zone or Local Zone (
     * <code>available</code> | <code>information</code> | <code>impaired</code>
     * | <code>unavailable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zone-id</code> - The ID of the Availability Zone (for example,
     * <code>use1-az1</code>) or the Local Zone (for example, use
     * <code>usw2-lax1-az1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zone-name</code> - The name of the Availability Zone (for example,
     * <code>us-east-1a</code>) or the Local Zone (for example, use
     * <code>us-west-2-lax-1a</code>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            The filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>group-name</code> - For Availability Zones, use the
     *            Region name. For Local Zones, use the name of the group
     *            associated with the Local Zone (for example,
     *            <code>us-west-2-lax-1</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>message</code> - The Availability Zone or Local Zone
     *            message.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>opt-in-status</code> - The opt in status (
     *            <code>opted-in</code>, and <code>not-opted-in</code> |
     *            <code>opt-in-not-required</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>region-name</code> - The name of the Region for the
     *            Availability Zone or Local Zone (for example,
     *            <code>us-east-1</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state</code> - The state of the Availability Zone or
     *            Local Zone (<code>available</code> | <code>information</code>
     *            | <code>impaired</code> | <code>unavailable</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>zone-id</code> - The ID of the Availability Zone (for
     *            example, <code>use1-az1</code>) or the Local Zone (for
     *            example, use <code>usw2-lax1-az1</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>zone-name</code> - The name of the Availability Zone
     *            (for example, <code>us-east-1a</code>) or the Local Zone (for
     *            example, use <code>us-west-2-lax-1a</code>).
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAvailabilityZonesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The names of the Availability Zones and Local Zones.
     * </p>
     *
     * @return <p>
     *         The names of the Availability Zones and Local Zones.
     *         </p>
     */
    public java.util.List<String> getZoneNames() {
        return zoneNames;
    }

    /**
     * <p>
     * The names of the Availability Zones and Local Zones.
     * </p>
     *
     * @param zoneNames <p>
     *            The names of the Availability Zones and Local Zones.
     *            </p>
     */
    public void setZoneNames(java.util.Collection<String> zoneNames) {
        if (zoneNames == null) {
            this.zoneNames = null;
            return;
        }

        this.zoneNames = new java.util.ArrayList<String>(zoneNames);
    }

    /**
     * <p>
     * The names of the Availability Zones and Local Zones.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param zoneNames <p>
     *            The names of the Availability Zones and Local Zones.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAvailabilityZonesRequest withZoneNames(String... zoneNames) {
        if (getZoneNames() == null) {
            this.zoneNames = new java.util.ArrayList<String>(zoneNames.length);
        }
        for (String value : zoneNames) {
            this.zoneNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The names of the Availability Zones and Local Zones.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param zoneNames <p>
     *            The names of the Availability Zones and Local Zones.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAvailabilityZonesRequest withZoneNames(java.util.Collection<String> zoneNames) {
        setZoneNames(zoneNames);
        return this;
    }

    /**
     * <p>
     * The IDs of the Availability Zones and Local Zones.
     * </p>
     *
     * @return <p>
     *         The IDs of the Availability Zones and Local Zones.
     *         </p>
     */
    public java.util.List<String> getZoneIds() {
        return zoneIds;
    }

    /**
     * <p>
     * The IDs of the Availability Zones and Local Zones.
     * </p>
     *
     * @param zoneIds <p>
     *            The IDs of the Availability Zones and Local Zones.
     *            </p>
     */
    public void setZoneIds(java.util.Collection<String> zoneIds) {
        if (zoneIds == null) {
            this.zoneIds = null;
            return;
        }

        this.zoneIds = new java.util.ArrayList<String>(zoneIds);
    }

    /**
     * <p>
     * The IDs of the Availability Zones and Local Zones.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param zoneIds <p>
     *            The IDs of the Availability Zones and Local Zones.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAvailabilityZonesRequest withZoneIds(String... zoneIds) {
        if (getZoneIds() == null) {
            this.zoneIds = new java.util.ArrayList<String>(zoneIds.length);
        }
        for (String value : zoneIds) {
            this.zoneIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the Availability Zones and Local Zones.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param zoneIds <p>
     *            The IDs of the Availability Zones and Local Zones.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAvailabilityZonesRequest withZoneIds(java.util.Collection<String> zoneIds) {
        setZoneIds(zoneIds);
        return this;
    }

    /**
     * <p>
     * Include all Availability Zones and Local Zones regardless of your opt in
     * status.
     * </p>
     * <p>
     * If you do not use this parameter, the results include only the zones for
     * the Regions where you have chosen the option to opt in.
     * </p>
     *
     * @return <p>
     *         Include all Availability Zones and Local Zones regardless of your
     *         opt in status.
     *         </p>
     *         <p>
     *         If you do not use this parameter, the results include only the
     *         zones for the Regions where you have chosen the option to opt in.
     *         </p>
     */
    public Boolean isAllAvailabilityZones() {
        return allAvailabilityZones;
    }

    /**
     * <p>
     * Include all Availability Zones and Local Zones regardless of your opt in
     * status.
     * </p>
     * <p>
     * If you do not use this parameter, the results include only the zones for
     * the Regions where you have chosen the option to opt in.
     * </p>
     *
     * @return <p>
     *         Include all Availability Zones and Local Zones regardless of your
     *         opt in status.
     *         </p>
     *         <p>
     *         If you do not use this parameter, the results include only the
     *         zones for the Regions where you have chosen the option to opt in.
     *         </p>
     */
    public Boolean getAllAvailabilityZones() {
        return allAvailabilityZones;
    }

    /**
     * <p>
     * Include all Availability Zones and Local Zones regardless of your opt in
     * status.
     * </p>
     * <p>
     * If you do not use this parameter, the results include only the zones for
     * the Regions where you have chosen the option to opt in.
     * </p>
     *
     * @param allAvailabilityZones <p>
     *            Include all Availability Zones and Local Zones regardless of
     *            your opt in status.
     *            </p>
     *            <p>
     *            If you do not use this parameter, the results include only the
     *            zones for the Regions where you have chosen the option to opt
     *            in.
     *            </p>
     */
    public void setAllAvailabilityZones(Boolean allAvailabilityZones) {
        this.allAvailabilityZones = allAvailabilityZones;
    }

    /**
     * <p>
     * Include all Availability Zones and Local Zones regardless of your opt in
     * status.
     * </p>
     * <p>
     * If you do not use this parameter, the results include only the zones for
     * the Regions where you have chosen the option to opt in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allAvailabilityZones <p>
     *            Include all Availability Zones and Local Zones regardless of
     *            your opt in status.
     *            </p>
     *            <p>
     *            If you do not use this parameter, the results include only the
     *            zones for the Regions where you have chosen the option to opt
     *            in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAvailabilityZonesRequest withAllAvailabilityZones(Boolean allAvailabilityZones) {
        this.allAvailabilityZones = allAvailabilityZones;
        return this;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAvailabilityZonesRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
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
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getZoneNames() != null)
            sb.append("ZoneNames: " + getZoneNames() + ",");
        if (getZoneIds() != null)
            sb.append("ZoneIds: " + getZoneIds() + ",");
        if (getAllAvailabilityZones() != null)
            sb.append("AllAvailabilityZones: " + getAllAvailabilityZones() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getZoneNames() == null) ? 0 : getZoneNames().hashCode());
        hashCode = prime * hashCode + ((getZoneIds() == null) ? 0 : getZoneIds().hashCode());
        hashCode = prime * hashCode
                + ((getAllAvailabilityZones() == null) ? 0 : getAllAvailabilityZones().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAvailabilityZonesRequest == false)
            return false;
        DescribeAvailabilityZonesRequest other = (DescribeAvailabilityZonesRequest) obj;

        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getZoneNames() == null ^ this.getZoneNames() == null)
            return false;
        if (other.getZoneNames() != null
                && other.getZoneNames().equals(this.getZoneNames()) == false)
            return false;
        if (other.getZoneIds() == null ^ this.getZoneIds() == null)
            return false;
        if (other.getZoneIds() != null && other.getZoneIds().equals(this.getZoneIds()) == false)
            return false;
        if (other.getAllAvailabilityZones() == null ^ this.getAllAvailabilityZones() == null)
            return false;
        if (other.getAllAvailabilityZones() != null
                && other.getAllAvailabilityZones().equals(this.getAllAvailabilityZones()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
