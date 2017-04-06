/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.s3.model;

import com.amazonaws.regions.RegionUtils;
import com.amazonaws.services.s3.internal.Constants;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Specifies constants that define Amazon S3 Regions.
 * <p>
 * Amazon S3 Regions allow the user to choose the geographical region where
 * Amazon S3 will store the buckets the user creates. Choose a Amazon S3 Region
 * to optimize latency, minimize costs, or address regulatory requirements.
 * </p>
 * <p>
 * Objects stored in a Amazon S3 Region never leave that region unless explicitly
 * transferred to another region.
 * </p>
 * <p>
 * In Amazon S3, all the regions provides
 * read-after-write consistency for PUTS of new objects in Amazon
 * S3 buckets and eventual consistency for overwrite PUTS and DELETES.
 * </p>
 */
public enum Region {

    /**
     * The US Standard Amazon S3 Region. This region uses Amazon S3 servers
     * located in the United States.
     * <p>
     * This is the default Amazon S3 Region. All requests sent to
     * <code>s3.amazonaws.com</code> go to this region unless a location
     * constraint is specified when creating a bucket. The US Standard Region
     * automatically places data in either Amazon's east or west coast data
     * centers depending on which one provides the lowest latency. The US
     * Standard Region provides eventual consistency for all requests.
     * </p>
     */
    US_Standard((String[]) null),

    /**
     * The US-East (Ohio) Amazon S3 Region. This region uses Amazon S3 servers
     * located in Ohio.
     * <p>
     * When using buckets in this region, set the client endpoint to
     * <code>s3-us-east-2.amazonaws.com</code> on all requests to these buckets
     * to reduce any latency experienced after the first hour of creating a
     * bucket in this region.
     * </p>
     */
    US_East_2("us-east-2"),

    /**
     * The US-West (Northern California) Amazon S3 Region. This region uses
     * Amazon S3 servers located in Northern California.
     * <p>
     * When using buckets in this region, set the client endpoint to
     * <code>s3-us-west-1.amazonaws.com</code> on all requests to these buckets
     * to reduce any latency experienced after the first hour of creating a
     * bucket in this region.
     * </p>
     * <p>
     * In Amazon S3, the US-West (Northern California) Region provides
     * read-after-write consistency for PUTS of new objects in Amazon S3 buckets
     * and eventual consistency for overwrite PUTS and DELETES.
     * </p>
     */
    US_West("us-west-1"),

    /**
     * The US-West-2 (Oregon) Region. This region uses Amazon S3 servers located
     * in Oregon.
     * <p>
     * When using buckets in this region, set the client endpoint to
     * <code>s3-us-west-2.amazonaws.com</code> on all requests to these buckets
     * to reduce any latency experienced after the first hour of creating a
     * bucket in this region.
     * </p>
     */
    US_West_2("us-west-2"),

    /**
     * The US GovCloud Region. This region uses Amazon S3 servers located in the
     * Northwestern region of the United States.
     */
    US_GovCloud("s3-us-gov-west-1"),

    /**
     * The EU (Ireland) Amazon S3 Region. This region uses Amazon S3 servers
     * located in Ireland.
     * <p>
     * In Amazon S3, the EU (Ireland) Region provides read-after-write
     * consistency for PUTS of new objects in Amazon S3 buckets and eventual
     * consistency for overwrite PUTS and DELETES.
     * </p>
     */
    EU_Ireland("eu-west-1", "EU"),

    /**
     * The EU (London) Amazon S3 Region. This region uses Amazon S3 servers
     * located in London.
     * <p>
     * When using buckets in this region, set the client endpoint to
     * <code>s3.eu-west-2.amazonaws.com</code> on all requests to these buckets
     * to reduce any latency experienced after the first hour of creating a
     * bucket in this region.
     * </p>
     */
    EU_London("eu-west-2"),

    /**
     * The EU (Frankfurt) Amazon S3 Region. This region uses Amazon S3 servers
     * located in Frankfurt.
     * <p>
     * Note that to access S3 buckets in Frankfurt you must explicitly set the
     * region on the AWS S3 Client you are working with. In Amazon S3, the EU
     * (Franfkurt) Region provides read-after-write consistency for PUTS of new
     * objects in Amazon S3 buckets and eventual consistency for overwrite PUTS
     * and DELETES.
     * </p>
     */
    EU_Frankfurt("eu-central-1"),

    /**
     * The Asia Pacific (Mumbai) Region. This region uses Amazon S3 servers
     * located in Singapore.
     * <p>
     * When using buckets in this region, set the client endpoint to
     * <code>s3-ap-south-1.amazonaws.com</code> on all requests to these buckets
     * to reduce any latency experienced after the first hour of creating a
     * bucket in this region.
     * </p>
     */
    AP_Mumbai("ap-south-1"),

    /**
     * The Asia Pacific (Singapore) Region. This region uses Amazon S3 servers
     * located in Singapore.
     * <p>
     * When using buckets in this region, set the client endpoint to
     * <code>s3-ap-southeast-1.amazonaws.com</code> on all requests to these
     * buckets to reduce any latency experienced after the first hour of
     * creating a bucket in this region.
     * </p>
     */
    AP_Singapore("ap-southeast-1"),

    /**
     * The Asia Pacific (Sydney) Region. This region uses Amazon S3 servers
     * located in Sydney, Australia.
     * <p>
     * When using buckets in this region, set the client endpoint to
     * <code>s3-ap-southeast-2.amazonaws.com</code> on all requests to these
     * buckets to reduce any latency experienced after the first hour of
     * creating a bucket in this region.
     * </p>
     */
    AP_Sydney("ap-southeast-2"),

    /**
     * The Asia Pacific (Tokyo) Region. This region uses Amazon S3 servers
     * located in Tokyo.
     * <p>
     * When using buckets in this region, set the client endpoint to
     * <code>s3-ap-northeast-1.amazonaws.com</code> on all requests to these
     * buckets to reduce any latency experienced after the first hour of
     * creating a bucket in this region.
     * </p>
     */
    AP_Tokyo("ap-northeast-1"),

    /**
     * The Asia Pacific (Seoul) Region. This region uses Amazon S3 servers
     * located in Seoul.
     * <p>
     * When using buckets in this region, set the client endpoint to
     * <code>s3.ap-northeast-2.amazonaws.com</code> on all requests to these
     * buckets to reduce any latency experienced after the first hour of
     * creating a bucket in this region.
     * </p>
     */
    AP_Seoul("ap-northeast-2"),

    /**
     * The South America (Sao Paulo) Region. This region uses Amazon S3 servers
     * located in Sao Paulo.
     * <p>
     * When using buckets in this region, set the client endpoint to
     * <code>s3-sa-east-1.amazonaws.com</code> on all requests to these buckets
     * to reduce any latency experienced after the first hour of creating a
     * bucket in this region.
     * </p>
     */
    SA_SaoPaulo("sa-east-1"),

    /**
     * The Canada Central (Montreal) Region. This region uses Amazon S3 servers
     * located in Montreal.
     * <p>
     * When using buckets in this region, set the client endpoint to
     * <code>s3.ca-central-1.amazonaws.com</code> on all requests to these
     * buckets to reduce any latency experienced after the first hour of
     * creating a bucket in this region.
     * </p>
     */
    CA_Montreal("ca-central-1"),

    /**
     * The China (Beijing) Region. This region uses Amazon S3 servers located in
     * Beijing.
     * <p>
     * When using buckets in this region, you must set the client endpoint to
     * <code>s3.cn-north-1.amazonaws.com.cn</code>.
     */
    CN_Beijing("cn-north-1");

    /**
     * Used to extract the S3 regional id from an S3 end point. Note this
     * pattern will not match the S3 US standard endpoint by intent.
     *
     * <pre>
     * s3-eu-west-1.amazonaws.com
     * s3.cn-north-1.amazonaws.com.cn
     * </pre>
     */
    public static final Pattern S3_REGIONAL_ENDPOINT_PATTERN = Pattern
            .compile("s3[-.]([^.]+)\\.amazonaws\\.com(\\.[^.]*)?");

    /** The list of ID's representing each region. */
    private final List<String> regionIds;

    /**
     * Constructs a new region with the specified region ID's.
     *
     * @param regionIds The list of ID's representing the S3 region.
     */
    private Region(String... regionIds) {
        this.regionIds = regionIds != null ? Arrays.asList(regionIds) : null;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return getFirstRegionId0();
    }

    /**
     * Returns the first region id or null for {@link #US_Standard}.
     */
    public String getFirstRegionId() {
        return getFirstRegionId0();
    }

    private String getFirstRegionId0() {
        return this.regionIds == null || regionIds.size() == 0
                ? null : this.regionIds.get(0);
    }

    /**
     * Returns the Amazon S3 Region enumeration value representing the specified
     * Amazon S3 Region ID string. If specified string doesn't map to a known
     * Amazon S3 Region, then an <code>IllegalArgumentException</code> is
     * thrown.
     *
     * @param s3RegionId The Amazon S3 region ID string.
     * @return The Amazon S3 Region enumeration value representing the specified
     *         Amazon S3 Region ID.
     * @throws IllegalArgumentException If the specified value does not map to
     *             one of the known Amazon S3 regions.
     */
    public static Region fromValue(final String s3RegionId) throws IllegalArgumentException
    {
        if (s3RegionId == null || s3RegionId.equals("US") || s3RegionId.equals("us-east-1")) {
            return Region.US_Standard;
        }
        for (final Region region : Region.values()) {
            final List<String> regionIds = region.regionIds;
            if (regionIds != null && regionIds.contains(s3RegionId)) {
                return region;
            }
        }

        throw new IllegalArgumentException(
                "Cannot create enum from " + s3RegionId + " value!");
    }

    /**
     * Returns the respective AWS region.
     */
    public com.amazonaws.regions.Region toAWSRegion() {
        final String s3regionId = getFirstRegionId();
        if (s3regionId == null) { // US Standard
            return RegionUtils.getRegionByEndpoint(Constants.S3_HOSTNAME);
        } else {
            return RegionUtils.getRegion(s3regionId);
        }
    }
}
