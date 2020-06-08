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

package com.amazonaws.services.servicediscovery.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains information about the Route 53 DNS records that
 * you want AWS Cloud Map to create when you register an instance.
 * </p>
 */
public class DnsRecord implements Serializable {
    /**
     * <p>
     * The type of the resource, which indicates the type of value that Route 53
     * returns in response to DNS queries. You can specify values for
     * <code>Type</code> in the following combinations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A
     * </p>
     * </li>
     * <li>
     * <p>
     * AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * A and AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * SRV
     * </p>
     * </li>
     * <li>
     * <p>
     * CNAME
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you want AWS Cloud Map to create a Route 53 alias record when you
     * register an instance, specify <code>A</code> or <code>AAAA</code> for
     * <code>Type</code>.
     * </p>
     * <p>
     * You specify other settings, such as the IP address for A and AAAA
     * records, when you register an instance. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     * >RegisterInstance</a>.
     * </p>
     * <p>
     * The following values are supported:
     * </p>
     * <p>
     * <b>A</b>
     * </p>
     * <p>
     * Route 53 returns the IP address of the resource in IPv4 format, such as
     * 192.0.2.44.
     * </p>
     * <p>
     * <b>AAAA</b>
     * </p>
     * <p>
     * Route 53 returns the IP address of the resource in IPv6 format, such as
     * 2001:0db8:85a3:0000:0000:abcd:0001:2345.
     * </p>
     * <p>
     * <b>CNAME</b>
     * </p>
     * <p>
     * Route 53 returns the domain name of the resource, such as
     * www.example.com. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You specify the domain name that you want to route traffic to when you
     * register an instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html#cloudmap-RegisterInstance-request-Attributes"
     * >Attributes</a> in the topic <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     * >RegisterInstance</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You must specify <code>WEIGHTED</code> for the value of
     * <code>RoutingPolicy</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't specify both <code>CNAME</code> for <code>Type</code> and
     * settings for <code>HealthCheckConfig</code>. If you do, the request will
     * fail with an <code>InvalidInput</code> error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>SRV</b>
     * </p>
     * <p>
     * Route 53 returns the value for an SRV record. The value for an SRV record
     * uses the following values:
     * </p>
     * <p>
     * <code>priority weight port service-hostname</code>
     * </p>
     * <p>
     * Note the following about the values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The values of <code>priority</code> and <code>weight</code> are both set
     * to <code>1</code> and can't be changed.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>port</code> comes from the value that you specify for
     * the <code>AWS_INSTANCE_PORT</code> attribute when you submit a <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     * >RegisterInstance</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>service-hostname</code> is a concatenation of the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The value that you specify for <code>InstanceId</code> when you register
     * an instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * The name of the service.
     * </p>
     * </li>
     * <li>
     * <p>
     * The name of the namespace.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, if the value of <code>InstanceId</code> is <code>test</code>
     * , the name of the service is <code>backend</code>, and the name of the
     * namespace is <code>example.com</code>, the value of
     * <code>service-hostname</code> is:
     * </p>
     * <p>
     * <code>test.backend.example.com</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify settings for an SRV record, note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify values for <code>AWS_INSTANCE_IPV4</code>,
     * <code>AWS_INSTANCE_IPV6</code>, or both in the
     * <code>RegisterInstance</code> request, AWS Cloud Map automatically
     * creates <code>A</code> and/or <code>AAAA</code> records that have the
     * same name as the value of <code>service-hostname</code> in the SRV
     * record. You can ignore these records.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you're using a system that requires a specific SRV format, such as
     * HAProxy, see the <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_CreateService.html#cloudmap-CreateService-request-Name"
     * >Name</a> element in the documentation about <code>CreateService</code>
     * for information about how to specify the correct name format.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SRV, A, AAAA, CNAME
     */
    private String type;

    /**
     * <p>
     * The amount of time, in seconds, that you want DNS resolvers to cache the
     * settings for this record.
     * </p>
     * <note>
     * <p>
     * Alias records don't include a TTL because Route 53 uses the TTL for the
     * AWS resource that an alias record routes traffic to. If you include the
     * <code>AWS_ALIAS_DNS_NAME</code> attribute when you submit a <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     * >RegisterInstance</a> request, the <code>TTL</code> value is ignored.
     * Always specify a TTL for the service; you can use a service to register
     * instances that create either alias or non-alias records.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     */
    private Long tTL;

    /**
     * <p>
     * The type of the resource, which indicates the type of value that Route 53
     * returns in response to DNS queries. You can specify values for
     * <code>Type</code> in the following combinations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A
     * </p>
     * </li>
     * <li>
     * <p>
     * AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * A and AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * SRV
     * </p>
     * </li>
     * <li>
     * <p>
     * CNAME
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you want AWS Cloud Map to create a Route 53 alias record when you
     * register an instance, specify <code>A</code> or <code>AAAA</code> for
     * <code>Type</code>.
     * </p>
     * <p>
     * You specify other settings, such as the IP address for A and AAAA
     * records, when you register an instance. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     * >RegisterInstance</a>.
     * </p>
     * <p>
     * The following values are supported:
     * </p>
     * <p>
     * <b>A</b>
     * </p>
     * <p>
     * Route 53 returns the IP address of the resource in IPv4 format, such as
     * 192.0.2.44.
     * </p>
     * <p>
     * <b>AAAA</b>
     * </p>
     * <p>
     * Route 53 returns the IP address of the resource in IPv6 format, such as
     * 2001:0db8:85a3:0000:0000:abcd:0001:2345.
     * </p>
     * <p>
     * <b>CNAME</b>
     * </p>
     * <p>
     * Route 53 returns the domain name of the resource, such as
     * www.example.com. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You specify the domain name that you want to route traffic to when you
     * register an instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html#cloudmap-RegisterInstance-request-Attributes"
     * >Attributes</a> in the topic <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     * >RegisterInstance</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You must specify <code>WEIGHTED</code> for the value of
     * <code>RoutingPolicy</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't specify both <code>CNAME</code> for <code>Type</code> and
     * settings for <code>HealthCheckConfig</code>. If you do, the request will
     * fail with an <code>InvalidInput</code> error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>SRV</b>
     * </p>
     * <p>
     * Route 53 returns the value for an SRV record. The value for an SRV record
     * uses the following values:
     * </p>
     * <p>
     * <code>priority weight port service-hostname</code>
     * </p>
     * <p>
     * Note the following about the values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The values of <code>priority</code> and <code>weight</code> are both set
     * to <code>1</code> and can't be changed.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>port</code> comes from the value that you specify for
     * the <code>AWS_INSTANCE_PORT</code> attribute when you submit a <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     * >RegisterInstance</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>service-hostname</code> is a concatenation of the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The value that you specify for <code>InstanceId</code> when you register
     * an instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * The name of the service.
     * </p>
     * </li>
     * <li>
     * <p>
     * The name of the namespace.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, if the value of <code>InstanceId</code> is <code>test</code>
     * , the name of the service is <code>backend</code>, and the name of the
     * namespace is <code>example.com</code>, the value of
     * <code>service-hostname</code> is:
     * </p>
     * <p>
     * <code>test.backend.example.com</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify settings for an SRV record, note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify values for <code>AWS_INSTANCE_IPV4</code>,
     * <code>AWS_INSTANCE_IPV6</code>, or both in the
     * <code>RegisterInstance</code> request, AWS Cloud Map automatically
     * creates <code>A</code> and/or <code>AAAA</code> records that have the
     * same name as the value of <code>service-hostname</code> in the SRV
     * record. You can ignore these records.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you're using a system that requires a specific SRV format, such as
     * HAProxy, see the <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_CreateService.html#cloudmap-CreateService-request-Name"
     * >Name</a> element in the documentation about <code>CreateService</code>
     * for information about how to specify the correct name format.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SRV, A, AAAA, CNAME
     *
     * @return <p>
     *         The type of the resource, which indicates the type of value that
     *         Route 53 returns in response to DNS queries. You can specify
     *         values for <code>Type</code> in the following combinations:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         A
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AAAA
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A and AAAA
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SRV
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CNAME
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you want AWS Cloud Map to create a Route 53 alias record when
     *         you register an instance, specify <code>A</code> or
     *         <code>AAAA</code> for <code>Type</code>.
     *         </p>
     *         <p>
     *         You specify other settings, such as the IP address for A and AAAA
     *         records, when you register an instance. For more information, see
     *         <a href=
     *         "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     *         >RegisterInstance</a>.
     *         </p>
     *         <p>
     *         The following values are supported:
     *         </p>
     *         <p>
     *         <b>A</b>
     *         </p>
     *         <p>
     *         Route 53 returns the IP address of the resource in IPv4 format,
     *         such as 192.0.2.44.
     *         </p>
     *         <p>
     *         <b>AAAA</b>
     *         </p>
     *         <p>
     *         Route 53 returns the IP address of the resource in IPv6 format,
     *         such as 2001:0db8:85a3:0000:0000:abcd:0001:2345.
     *         </p>
     *         <p>
     *         <b>CNAME</b>
     *         </p>
     *         <p>
     *         Route 53 returns the domain name of the resource, such as
     *         www.example.com. Note the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specify the domain name that you want to route traffic to
     *         when you register an instance. For more information, see <a href=
     *         "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html#cloudmap-RegisterInstance-request-Attributes"
     *         >Attributes</a> in the topic <a href=
     *         "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     *         >RegisterInstance</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You must specify <code>WEIGHTED</code> for the value of
     *         <code>RoutingPolicy</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can't specify both <code>CNAME</code> for <code>Type</code>
     *         and settings for <code>HealthCheckConfig</code>. If you do, the
     *         request will fail with an <code>InvalidInput</code> error.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>SRV</b>
     *         </p>
     *         <p>
     *         Route 53 returns the value for an SRV record. The value for an
     *         SRV record uses the following values:
     *         </p>
     *         <p>
     *         <code>priority weight port service-hostname</code>
     *         </p>
     *         <p>
     *         Note the following about the values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The values of <code>priority</code> and <code>weight</code> are
     *         both set to <code>1</code> and can't be changed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The value of <code>port</code> comes from the value that you
     *         specify for the <code>AWS_INSTANCE_PORT</code> attribute when you
     *         submit a <a href=
     *         "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     *         >RegisterInstance</a> request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The value of <code>service-hostname</code> is a concatenation of
     *         the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The value that you specify for <code>InstanceId</code> when you
     *         register an instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The name of the service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The name of the namespace.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For example, if the value of <code>InstanceId</code> is
     *         <code>test</code>, the name of the service is
     *         <code>backend</code>, and the name of the namespace is
     *         <code>example.com</code>, the value of
     *         <code>service-hostname</code> is:
     *         </p>
     *         <p>
     *         <code>test.backend.example.com</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you specify settings for an SRV record, note the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you specify values for <code>AWS_INSTANCE_IPV4</code>,
     *         <code>AWS_INSTANCE_IPV6</code>, or both in the
     *         <code>RegisterInstance</code> request, AWS Cloud Map
     *         automatically creates <code>A</code> and/or <code>AAAA</code>
     *         records that have the same name as the value of
     *         <code>service-hostname</code> in the SRV record. You can ignore
     *         these records.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you're using a system that requires a specific SRV format,
     *         such as HAProxy, see the <a href=
     *         "https://docs.aws.amazon.com/cloud-map/latest/api/API_CreateService.html#cloudmap-CreateService-request-Name"
     *         >Name</a> element in the documentation about
     *         <code>CreateService</code> for information about how to specify
     *         the correct name format.
     *         </p>
     *         </li>
     *         </ul>
     * @see RecordType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of the resource, which indicates the type of value that Route 53
     * returns in response to DNS queries. You can specify values for
     * <code>Type</code> in the following combinations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A
     * </p>
     * </li>
     * <li>
     * <p>
     * AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * A and AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * SRV
     * </p>
     * </li>
     * <li>
     * <p>
     * CNAME
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you want AWS Cloud Map to create a Route 53 alias record when you
     * register an instance, specify <code>A</code> or <code>AAAA</code> for
     * <code>Type</code>.
     * </p>
     * <p>
     * You specify other settings, such as the IP address for A and AAAA
     * records, when you register an instance. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     * >RegisterInstance</a>.
     * </p>
     * <p>
     * The following values are supported:
     * </p>
     * <p>
     * <b>A</b>
     * </p>
     * <p>
     * Route 53 returns the IP address of the resource in IPv4 format, such as
     * 192.0.2.44.
     * </p>
     * <p>
     * <b>AAAA</b>
     * </p>
     * <p>
     * Route 53 returns the IP address of the resource in IPv6 format, such as
     * 2001:0db8:85a3:0000:0000:abcd:0001:2345.
     * </p>
     * <p>
     * <b>CNAME</b>
     * </p>
     * <p>
     * Route 53 returns the domain name of the resource, such as
     * www.example.com. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You specify the domain name that you want to route traffic to when you
     * register an instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html#cloudmap-RegisterInstance-request-Attributes"
     * >Attributes</a> in the topic <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     * >RegisterInstance</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You must specify <code>WEIGHTED</code> for the value of
     * <code>RoutingPolicy</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't specify both <code>CNAME</code> for <code>Type</code> and
     * settings for <code>HealthCheckConfig</code>. If you do, the request will
     * fail with an <code>InvalidInput</code> error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>SRV</b>
     * </p>
     * <p>
     * Route 53 returns the value for an SRV record. The value for an SRV record
     * uses the following values:
     * </p>
     * <p>
     * <code>priority weight port service-hostname</code>
     * </p>
     * <p>
     * Note the following about the values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The values of <code>priority</code> and <code>weight</code> are both set
     * to <code>1</code> and can't be changed.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>port</code> comes from the value that you specify for
     * the <code>AWS_INSTANCE_PORT</code> attribute when you submit a <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     * >RegisterInstance</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>service-hostname</code> is a concatenation of the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The value that you specify for <code>InstanceId</code> when you register
     * an instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * The name of the service.
     * </p>
     * </li>
     * <li>
     * <p>
     * The name of the namespace.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, if the value of <code>InstanceId</code> is <code>test</code>
     * , the name of the service is <code>backend</code>, and the name of the
     * namespace is <code>example.com</code>, the value of
     * <code>service-hostname</code> is:
     * </p>
     * <p>
     * <code>test.backend.example.com</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify settings for an SRV record, note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify values for <code>AWS_INSTANCE_IPV4</code>,
     * <code>AWS_INSTANCE_IPV6</code>, or both in the
     * <code>RegisterInstance</code> request, AWS Cloud Map automatically
     * creates <code>A</code> and/or <code>AAAA</code> records that have the
     * same name as the value of <code>service-hostname</code> in the SRV
     * record. You can ignore these records.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you're using a system that requires a specific SRV format, such as
     * HAProxy, see the <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_CreateService.html#cloudmap-CreateService-request-Name"
     * >Name</a> element in the documentation about <code>CreateService</code>
     * for information about how to specify the correct name format.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SRV, A, AAAA, CNAME
     *
     * @param type <p>
     *            The type of the resource, which indicates the type of value
     *            that Route 53 returns in response to DNS queries. You can
     *            specify values for <code>Type</code> in the following
     *            combinations:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            A
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            AAAA
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            A and AAAA
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SRV
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            CNAME
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you want AWS Cloud Map to create a Route 53 alias record
     *            when you register an instance, specify <code>A</code> or
     *            <code>AAAA</code> for <code>Type</code>.
     *            </p>
     *            <p>
     *            You specify other settings, such as the IP address for A and
     *            AAAA records, when you register an instance. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     *            >RegisterInstance</a>.
     *            </p>
     *            <p>
     *            The following values are supported:
     *            </p>
     *            <p>
     *            <b>A</b>
     *            </p>
     *            <p>
     *            Route 53 returns the IP address of the resource in IPv4
     *            format, such as 192.0.2.44.
     *            </p>
     *            <p>
     *            <b>AAAA</b>
     *            </p>
     *            <p>
     *            Route 53 returns the IP address of the resource in IPv6
     *            format, such as 2001:0db8:85a3:0000:0000:abcd:0001:2345.
     *            </p>
     *            <p>
     *            <b>CNAME</b>
     *            </p>
     *            <p>
     *            Route 53 returns the domain name of the resource, such as
     *            www.example.com. Note the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            You specify the domain name that you want to route traffic to
     *            when you register an instance. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html#cloudmap-RegisterInstance-request-Attributes"
     *            >Attributes</a> in the topic <a href=
     *            "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     *            >RegisterInstance</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            You must specify <code>WEIGHTED</code> for the value of
     *            <code>RoutingPolicy</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            You can't specify both <code>CNAME</code> for
     *            <code>Type</code> and settings for
     *            <code>HealthCheckConfig</code>. If you do, the request will
     *            fail with an <code>InvalidInput</code> error.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>SRV</b>
     *            </p>
     *            <p>
     *            Route 53 returns the value for an SRV record. The value for an
     *            SRV record uses the following values:
     *            </p>
     *            <p>
     *            <code>priority weight port service-hostname</code>
     *            </p>
     *            <p>
     *            Note the following about the values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The values of <code>priority</code> and <code>weight</code>
     *            are both set to <code>1</code> and can't be changed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The value of <code>port</code> comes from the value that you
     *            specify for the <code>AWS_INSTANCE_PORT</code> attribute when
     *            you submit a <a href=
     *            "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     *            >RegisterInstance</a> request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The value of <code>service-hostname</code> is a concatenation
     *            of the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The value that you specify for <code>InstanceId</code> when
     *            you register an instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The name of the service.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The name of the namespace.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For example, if the value of <code>InstanceId</code> is
     *            <code>test</code>, the name of the service is
     *            <code>backend</code>, and the name of the namespace is
     *            <code>example.com</code>, the value of
     *            <code>service-hostname</code> is:
     *            </p>
     *            <p>
     *            <code>test.backend.example.com</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you specify settings for an SRV record, note the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If you specify values for <code>AWS_INSTANCE_IPV4</code>,
     *            <code>AWS_INSTANCE_IPV6</code>, or both in the
     *            <code>RegisterInstance</code> request, AWS Cloud Map
     *            automatically creates <code>A</code> and/or <code>AAAA</code>
     *            records that have the same name as the value of
     *            <code>service-hostname</code> in the SRV record. You can
     *            ignore these records.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you're using a system that requires a specific SRV format,
     *            such as HAProxy, see the <a href=
     *            "https://docs.aws.amazon.com/cloud-map/latest/api/API_CreateService.html#cloudmap-CreateService-request-Name"
     *            >Name</a> element in the documentation about
     *            <code>CreateService</code> for information about how to
     *            specify the correct name format.
     *            </p>
     *            </li>
     *            </ul>
     * @see RecordType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the resource, which indicates the type of value that Route 53
     * returns in response to DNS queries. You can specify values for
     * <code>Type</code> in the following combinations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A
     * </p>
     * </li>
     * <li>
     * <p>
     * AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * A and AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * SRV
     * </p>
     * </li>
     * <li>
     * <p>
     * CNAME
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you want AWS Cloud Map to create a Route 53 alias record when you
     * register an instance, specify <code>A</code> or <code>AAAA</code> for
     * <code>Type</code>.
     * </p>
     * <p>
     * You specify other settings, such as the IP address for A and AAAA
     * records, when you register an instance. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     * >RegisterInstance</a>.
     * </p>
     * <p>
     * The following values are supported:
     * </p>
     * <p>
     * <b>A</b>
     * </p>
     * <p>
     * Route 53 returns the IP address of the resource in IPv4 format, such as
     * 192.0.2.44.
     * </p>
     * <p>
     * <b>AAAA</b>
     * </p>
     * <p>
     * Route 53 returns the IP address of the resource in IPv6 format, such as
     * 2001:0db8:85a3:0000:0000:abcd:0001:2345.
     * </p>
     * <p>
     * <b>CNAME</b>
     * </p>
     * <p>
     * Route 53 returns the domain name of the resource, such as
     * www.example.com. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You specify the domain name that you want to route traffic to when you
     * register an instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html#cloudmap-RegisterInstance-request-Attributes"
     * >Attributes</a> in the topic <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     * >RegisterInstance</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You must specify <code>WEIGHTED</code> for the value of
     * <code>RoutingPolicy</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't specify both <code>CNAME</code> for <code>Type</code> and
     * settings for <code>HealthCheckConfig</code>. If you do, the request will
     * fail with an <code>InvalidInput</code> error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>SRV</b>
     * </p>
     * <p>
     * Route 53 returns the value for an SRV record. The value for an SRV record
     * uses the following values:
     * </p>
     * <p>
     * <code>priority weight port service-hostname</code>
     * </p>
     * <p>
     * Note the following about the values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The values of <code>priority</code> and <code>weight</code> are both set
     * to <code>1</code> and can't be changed.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>port</code> comes from the value that you specify for
     * the <code>AWS_INSTANCE_PORT</code> attribute when you submit a <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     * >RegisterInstance</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>service-hostname</code> is a concatenation of the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The value that you specify for <code>InstanceId</code> when you register
     * an instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * The name of the service.
     * </p>
     * </li>
     * <li>
     * <p>
     * The name of the namespace.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, if the value of <code>InstanceId</code> is <code>test</code>
     * , the name of the service is <code>backend</code>, and the name of the
     * namespace is <code>example.com</code>, the value of
     * <code>service-hostname</code> is:
     * </p>
     * <p>
     * <code>test.backend.example.com</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify settings for an SRV record, note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify values for <code>AWS_INSTANCE_IPV4</code>,
     * <code>AWS_INSTANCE_IPV6</code>, or both in the
     * <code>RegisterInstance</code> request, AWS Cloud Map automatically
     * creates <code>A</code> and/or <code>AAAA</code> records that have the
     * same name as the value of <code>service-hostname</code> in the SRV
     * record. You can ignore these records.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you're using a system that requires a specific SRV format, such as
     * HAProxy, see the <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_CreateService.html#cloudmap-CreateService-request-Name"
     * >Name</a> element in the documentation about <code>CreateService</code>
     * for information about how to specify the correct name format.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SRV, A, AAAA, CNAME
     *
     * @param type <p>
     *            The type of the resource, which indicates the type of value
     *            that Route 53 returns in response to DNS queries. You can
     *            specify values for <code>Type</code> in the following
     *            combinations:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            A
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            AAAA
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            A and AAAA
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SRV
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            CNAME
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you want AWS Cloud Map to create a Route 53 alias record
     *            when you register an instance, specify <code>A</code> or
     *            <code>AAAA</code> for <code>Type</code>.
     *            </p>
     *            <p>
     *            You specify other settings, such as the IP address for A and
     *            AAAA records, when you register an instance. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     *            >RegisterInstance</a>.
     *            </p>
     *            <p>
     *            The following values are supported:
     *            </p>
     *            <p>
     *            <b>A</b>
     *            </p>
     *            <p>
     *            Route 53 returns the IP address of the resource in IPv4
     *            format, such as 192.0.2.44.
     *            </p>
     *            <p>
     *            <b>AAAA</b>
     *            </p>
     *            <p>
     *            Route 53 returns the IP address of the resource in IPv6
     *            format, such as 2001:0db8:85a3:0000:0000:abcd:0001:2345.
     *            </p>
     *            <p>
     *            <b>CNAME</b>
     *            </p>
     *            <p>
     *            Route 53 returns the domain name of the resource, such as
     *            www.example.com. Note the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            You specify the domain name that you want to route traffic to
     *            when you register an instance. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html#cloudmap-RegisterInstance-request-Attributes"
     *            >Attributes</a> in the topic <a href=
     *            "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     *            >RegisterInstance</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            You must specify <code>WEIGHTED</code> for the value of
     *            <code>RoutingPolicy</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            You can't specify both <code>CNAME</code> for
     *            <code>Type</code> and settings for
     *            <code>HealthCheckConfig</code>. If you do, the request will
     *            fail with an <code>InvalidInput</code> error.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>SRV</b>
     *            </p>
     *            <p>
     *            Route 53 returns the value for an SRV record. The value for an
     *            SRV record uses the following values:
     *            </p>
     *            <p>
     *            <code>priority weight port service-hostname</code>
     *            </p>
     *            <p>
     *            Note the following about the values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The values of <code>priority</code> and <code>weight</code>
     *            are both set to <code>1</code> and can't be changed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The value of <code>port</code> comes from the value that you
     *            specify for the <code>AWS_INSTANCE_PORT</code> attribute when
     *            you submit a <a href=
     *            "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     *            >RegisterInstance</a> request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The value of <code>service-hostname</code> is a concatenation
     *            of the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The value that you specify for <code>InstanceId</code> when
     *            you register an instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The name of the service.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The name of the namespace.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For example, if the value of <code>InstanceId</code> is
     *            <code>test</code>, the name of the service is
     *            <code>backend</code>, and the name of the namespace is
     *            <code>example.com</code>, the value of
     *            <code>service-hostname</code> is:
     *            </p>
     *            <p>
     *            <code>test.backend.example.com</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you specify settings for an SRV record, note the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If you specify values for <code>AWS_INSTANCE_IPV4</code>,
     *            <code>AWS_INSTANCE_IPV6</code>, or both in the
     *            <code>RegisterInstance</code> request, AWS Cloud Map
     *            automatically creates <code>A</code> and/or <code>AAAA</code>
     *            records that have the same name as the value of
     *            <code>service-hostname</code> in the SRV record. You can
     *            ignore these records.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you're using a system that requires a specific SRV format,
     *            such as HAProxy, see the <a href=
     *            "https://docs.aws.amazon.com/cloud-map/latest/api/API_CreateService.html#cloudmap-CreateService-request-Name"
     *            >Name</a> element in the documentation about
     *            <code>CreateService</code> for information about how to
     *            specify the correct name format.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RecordType
     */
    public DnsRecord withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of the resource, which indicates the type of value that Route 53
     * returns in response to DNS queries. You can specify values for
     * <code>Type</code> in the following combinations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A
     * </p>
     * </li>
     * <li>
     * <p>
     * AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * A and AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * SRV
     * </p>
     * </li>
     * <li>
     * <p>
     * CNAME
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you want AWS Cloud Map to create a Route 53 alias record when you
     * register an instance, specify <code>A</code> or <code>AAAA</code> for
     * <code>Type</code>.
     * </p>
     * <p>
     * You specify other settings, such as the IP address for A and AAAA
     * records, when you register an instance. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     * >RegisterInstance</a>.
     * </p>
     * <p>
     * The following values are supported:
     * </p>
     * <p>
     * <b>A</b>
     * </p>
     * <p>
     * Route 53 returns the IP address of the resource in IPv4 format, such as
     * 192.0.2.44.
     * </p>
     * <p>
     * <b>AAAA</b>
     * </p>
     * <p>
     * Route 53 returns the IP address of the resource in IPv6 format, such as
     * 2001:0db8:85a3:0000:0000:abcd:0001:2345.
     * </p>
     * <p>
     * <b>CNAME</b>
     * </p>
     * <p>
     * Route 53 returns the domain name of the resource, such as
     * www.example.com. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You specify the domain name that you want to route traffic to when you
     * register an instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html#cloudmap-RegisterInstance-request-Attributes"
     * >Attributes</a> in the topic <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     * >RegisterInstance</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You must specify <code>WEIGHTED</code> for the value of
     * <code>RoutingPolicy</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't specify both <code>CNAME</code> for <code>Type</code> and
     * settings for <code>HealthCheckConfig</code>. If you do, the request will
     * fail with an <code>InvalidInput</code> error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>SRV</b>
     * </p>
     * <p>
     * Route 53 returns the value for an SRV record. The value for an SRV record
     * uses the following values:
     * </p>
     * <p>
     * <code>priority weight port service-hostname</code>
     * </p>
     * <p>
     * Note the following about the values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The values of <code>priority</code> and <code>weight</code> are both set
     * to <code>1</code> and can't be changed.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>port</code> comes from the value that you specify for
     * the <code>AWS_INSTANCE_PORT</code> attribute when you submit a <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     * >RegisterInstance</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>service-hostname</code> is a concatenation of the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The value that you specify for <code>InstanceId</code> when you register
     * an instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * The name of the service.
     * </p>
     * </li>
     * <li>
     * <p>
     * The name of the namespace.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, if the value of <code>InstanceId</code> is <code>test</code>
     * , the name of the service is <code>backend</code>, and the name of the
     * namespace is <code>example.com</code>, the value of
     * <code>service-hostname</code> is:
     * </p>
     * <p>
     * <code>test.backend.example.com</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify settings for an SRV record, note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify values for <code>AWS_INSTANCE_IPV4</code>,
     * <code>AWS_INSTANCE_IPV6</code>, or both in the
     * <code>RegisterInstance</code> request, AWS Cloud Map automatically
     * creates <code>A</code> and/or <code>AAAA</code> records that have the
     * same name as the value of <code>service-hostname</code> in the SRV
     * record. You can ignore these records.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you're using a system that requires a specific SRV format, such as
     * HAProxy, see the <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_CreateService.html#cloudmap-CreateService-request-Name"
     * >Name</a> element in the documentation about <code>CreateService</code>
     * for information about how to specify the correct name format.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SRV, A, AAAA, CNAME
     *
     * @param type <p>
     *            The type of the resource, which indicates the type of value
     *            that Route 53 returns in response to DNS queries. You can
     *            specify values for <code>Type</code> in the following
     *            combinations:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            A
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            AAAA
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            A and AAAA
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SRV
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            CNAME
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you want AWS Cloud Map to create a Route 53 alias record
     *            when you register an instance, specify <code>A</code> or
     *            <code>AAAA</code> for <code>Type</code>.
     *            </p>
     *            <p>
     *            You specify other settings, such as the IP address for A and
     *            AAAA records, when you register an instance. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     *            >RegisterInstance</a>.
     *            </p>
     *            <p>
     *            The following values are supported:
     *            </p>
     *            <p>
     *            <b>A</b>
     *            </p>
     *            <p>
     *            Route 53 returns the IP address of the resource in IPv4
     *            format, such as 192.0.2.44.
     *            </p>
     *            <p>
     *            <b>AAAA</b>
     *            </p>
     *            <p>
     *            Route 53 returns the IP address of the resource in IPv6
     *            format, such as 2001:0db8:85a3:0000:0000:abcd:0001:2345.
     *            </p>
     *            <p>
     *            <b>CNAME</b>
     *            </p>
     *            <p>
     *            Route 53 returns the domain name of the resource, such as
     *            www.example.com. Note the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            You specify the domain name that you want to route traffic to
     *            when you register an instance. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html#cloudmap-RegisterInstance-request-Attributes"
     *            >Attributes</a> in the topic <a href=
     *            "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     *            >RegisterInstance</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            You must specify <code>WEIGHTED</code> for the value of
     *            <code>RoutingPolicy</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            You can't specify both <code>CNAME</code> for
     *            <code>Type</code> and settings for
     *            <code>HealthCheckConfig</code>. If you do, the request will
     *            fail with an <code>InvalidInput</code> error.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>SRV</b>
     *            </p>
     *            <p>
     *            Route 53 returns the value for an SRV record. The value for an
     *            SRV record uses the following values:
     *            </p>
     *            <p>
     *            <code>priority weight port service-hostname</code>
     *            </p>
     *            <p>
     *            Note the following about the values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The values of <code>priority</code> and <code>weight</code>
     *            are both set to <code>1</code> and can't be changed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The value of <code>port</code> comes from the value that you
     *            specify for the <code>AWS_INSTANCE_PORT</code> attribute when
     *            you submit a <a href=
     *            "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     *            >RegisterInstance</a> request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The value of <code>service-hostname</code> is a concatenation
     *            of the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The value that you specify for <code>InstanceId</code> when
     *            you register an instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The name of the service.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The name of the namespace.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For example, if the value of <code>InstanceId</code> is
     *            <code>test</code>, the name of the service is
     *            <code>backend</code>, and the name of the namespace is
     *            <code>example.com</code>, the value of
     *            <code>service-hostname</code> is:
     *            </p>
     *            <p>
     *            <code>test.backend.example.com</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you specify settings for an SRV record, note the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If you specify values for <code>AWS_INSTANCE_IPV4</code>,
     *            <code>AWS_INSTANCE_IPV6</code>, or both in the
     *            <code>RegisterInstance</code> request, AWS Cloud Map
     *            automatically creates <code>A</code> and/or <code>AAAA</code>
     *            records that have the same name as the value of
     *            <code>service-hostname</code> in the SRV record. You can
     *            ignore these records.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you're using a system that requires a specific SRV format,
     *            such as HAProxy, see the <a href=
     *            "https://docs.aws.amazon.com/cloud-map/latest/api/API_CreateService.html#cloudmap-CreateService-request-Name"
     *            >Name</a> element in the documentation about
     *            <code>CreateService</code> for information about how to
     *            specify the correct name format.
     *            </p>
     *            </li>
     *            </ul>
     * @see RecordType
     */
    public void setType(RecordType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of the resource, which indicates the type of value that Route 53
     * returns in response to DNS queries. You can specify values for
     * <code>Type</code> in the following combinations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A
     * </p>
     * </li>
     * <li>
     * <p>
     * AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * A and AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * SRV
     * </p>
     * </li>
     * <li>
     * <p>
     * CNAME
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you want AWS Cloud Map to create a Route 53 alias record when you
     * register an instance, specify <code>A</code> or <code>AAAA</code> for
     * <code>Type</code>.
     * </p>
     * <p>
     * You specify other settings, such as the IP address for A and AAAA
     * records, when you register an instance. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     * >RegisterInstance</a>.
     * </p>
     * <p>
     * The following values are supported:
     * </p>
     * <p>
     * <b>A</b>
     * </p>
     * <p>
     * Route 53 returns the IP address of the resource in IPv4 format, such as
     * 192.0.2.44.
     * </p>
     * <p>
     * <b>AAAA</b>
     * </p>
     * <p>
     * Route 53 returns the IP address of the resource in IPv6 format, such as
     * 2001:0db8:85a3:0000:0000:abcd:0001:2345.
     * </p>
     * <p>
     * <b>CNAME</b>
     * </p>
     * <p>
     * Route 53 returns the domain name of the resource, such as
     * www.example.com. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You specify the domain name that you want to route traffic to when you
     * register an instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html#cloudmap-RegisterInstance-request-Attributes"
     * >Attributes</a> in the topic <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     * >RegisterInstance</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You must specify <code>WEIGHTED</code> for the value of
     * <code>RoutingPolicy</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't specify both <code>CNAME</code> for <code>Type</code> and
     * settings for <code>HealthCheckConfig</code>. If you do, the request will
     * fail with an <code>InvalidInput</code> error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>SRV</b>
     * </p>
     * <p>
     * Route 53 returns the value for an SRV record. The value for an SRV record
     * uses the following values:
     * </p>
     * <p>
     * <code>priority weight port service-hostname</code>
     * </p>
     * <p>
     * Note the following about the values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The values of <code>priority</code> and <code>weight</code> are both set
     * to <code>1</code> and can't be changed.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>port</code> comes from the value that you specify for
     * the <code>AWS_INSTANCE_PORT</code> attribute when you submit a <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     * >RegisterInstance</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>service-hostname</code> is a concatenation of the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The value that you specify for <code>InstanceId</code> when you register
     * an instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * The name of the service.
     * </p>
     * </li>
     * <li>
     * <p>
     * The name of the namespace.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, if the value of <code>InstanceId</code> is <code>test</code>
     * , the name of the service is <code>backend</code>, and the name of the
     * namespace is <code>example.com</code>, the value of
     * <code>service-hostname</code> is:
     * </p>
     * <p>
     * <code>test.backend.example.com</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify settings for an SRV record, note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify values for <code>AWS_INSTANCE_IPV4</code>,
     * <code>AWS_INSTANCE_IPV6</code>, or both in the
     * <code>RegisterInstance</code> request, AWS Cloud Map automatically
     * creates <code>A</code> and/or <code>AAAA</code> records that have the
     * same name as the value of <code>service-hostname</code> in the SRV
     * record. You can ignore these records.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you're using a system that requires a specific SRV format, such as
     * HAProxy, see the <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_CreateService.html#cloudmap-CreateService-request-Name"
     * >Name</a> element in the documentation about <code>CreateService</code>
     * for information about how to specify the correct name format.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SRV, A, AAAA, CNAME
     *
     * @param type <p>
     *            The type of the resource, which indicates the type of value
     *            that Route 53 returns in response to DNS queries. You can
     *            specify values for <code>Type</code> in the following
     *            combinations:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            A
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            AAAA
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            A and AAAA
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SRV
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            CNAME
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you want AWS Cloud Map to create a Route 53 alias record
     *            when you register an instance, specify <code>A</code> or
     *            <code>AAAA</code> for <code>Type</code>.
     *            </p>
     *            <p>
     *            You specify other settings, such as the IP address for A and
     *            AAAA records, when you register an instance. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     *            >RegisterInstance</a>.
     *            </p>
     *            <p>
     *            The following values are supported:
     *            </p>
     *            <p>
     *            <b>A</b>
     *            </p>
     *            <p>
     *            Route 53 returns the IP address of the resource in IPv4
     *            format, such as 192.0.2.44.
     *            </p>
     *            <p>
     *            <b>AAAA</b>
     *            </p>
     *            <p>
     *            Route 53 returns the IP address of the resource in IPv6
     *            format, such as 2001:0db8:85a3:0000:0000:abcd:0001:2345.
     *            </p>
     *            <p>
     *            <b>CNAME</b>
     *            </p>
     *            <p>
     *            Route 53 returns the domain name of the resource, such as
     *            www.example.com. Note the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            You specify the domain name that you want to route traffic to
     *            when you register an instance. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html#cloudmap-RegisterInstance-request-Attributes"
     *            >Attributes</a> in the topic <a href=
     *            "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     *            >RegisterInstance</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            You must specify <code>WEIGHTED</code> for the value of
     *            <code>RoutingPolicy</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            You can't specify both <code>CNAME</code> for
     *            <code>Type</code> and settings for
     *            <code>HealthCheckConfig</code>. If you do, the request will
     *            fail with an <code>InvalidInput</code> error.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>SRV</b>
     *            </p>
     *            <p>
     *            Route 53 returns the value for an SRV record. The value for an
     *            SRV record uses the following values:
     *            </p>
     *            <p>
     *            <code>priority weight port service-hostname</code>
     *            </p>
     *            <p>
     *            Note the following about the values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The values of <code>priority</code> and <code>weight</code>
     *            are both set to <code>1</code> and can't be changed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The value of <code>port</code> comes from the value that you
     *            specify for the <code>AWS_INSTANCE_PORT</code> attribute when
     *            you submit a <a href=
     *            "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     *            >RegisterInstance</a> request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The value of <code>service-hostname</code> is a concatenation
     *            of the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The value that you specify for <code>InstanceId</code> when
     *            you register an instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The name of the service.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The name of the namespace.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For example, if the value of <code>InstanceId</code> is
     *            <code>test</code>, the name of the service is
     *            <code>backend</code>, and the name of the namespace is
     *            <code>example.com</code>, the value of
     *            <code>service-hostname</code> is:
     *            </p>
     *            <p>
     *            <code>test.backend.example.com</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you specify settings for an SRV record, note the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If you specify values for <code>AWS_INSTANCE_IPV4</code>,
     *            <code>AWS_INSTANCE_IPV6</code>, or both in the
     *            <code>RegisterInstance</code> request, AWS Cloud Map
     *            automatically creates <code>A</code> and/or <code>AAAA</code>
     *            records that have the same name as the value of
     *            <code>service-hostname</code> in the SRV record. You can
     *            ignore these records.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you're using a system that requires a specific SRV format,
     *            such as HAProxy, see the <a href=
     *            "https://docs.aws.amazon.com/cloud-map/latest/api/API_CreateService.html#cloudmap-CreateService-request-Name"
     *            >Name</a> element in the documentation about
     *            <code>CreateService</code> for information about how to
     *            specify the correct name format.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RecordType
     */
    public DnsRecord withType(RecordType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, that you want DNS resolvers to cache the
     * settings for this record.
     * </p>
     * <note>
     * <p>
     * Alias records don't include a TTL because Route 53 uses the TTL for the
     * AWS resource that an alias record routes traffic to. If you include the
     * <code>AWS_ALIAS_DNS_NAME</code> attribute when you submit a <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     * >RegisterInstance</a> request, the <code>TTL</code> value is ignored.
     * Always specify a TTL for the service; you can use a service to register
     * instances that create either alias or non-alias records.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @return <p>
     *         The amount of time, in seconds, that you want DNS resolvers to
     *         cache the settings for this record.
     *         </p>
     *         <note>
     *         <p>
     *         Alias records don't include a TTL because Route 53 uses the TTL
     *         for the AWS resource that an alias record routes traffic to. If
     *         you include the <code>AWS_ALIAS_DNS_NAME</code> attribute when
     *         you submit a <a href=
     *         "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     *         >RegisterInstance</a> request, the <code>TTL</code> value is
     *         ignored. Always specify a TTL for the service; you can use a
     *         service to register instances that create either alias or
     *         non-alias records.
     *         </p>
     *         </note>
     */
    public Long getTTL() {
        return tTL;
    }

    /**
     * <p>
     * The amount of time, in seconds, that you want DNS resolvers to cache the
     * settings for this record.
     * </p>
     * <note>
     * <p>
     * Alias records don't include a TTL because Route 53 uses the TTL for the
     * AWS resource that an alias record routes traffic to. If you include the
     * <code>AWS_ALIAS_DNS_NAME</code> attribute when you submit a <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     * >RegisterInstance</a> request, the <code>TTL</code> value is ignored.
     * Always specify a TTL for the service; you can use a service to register
     * instances that create either alias or non-alias records.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param tTL <p>
     *            The amount of time, in seconds, that you want DNS resolvers to
     *            cache the settings for this record.
     *            </p>
     *            <note>
     *            <p>
     *            Alias records don't include a TTL because Route 53 uses the
     *            TTL for the AWS resource that an alias record routes traffic
     *            to. If you include the <code>AWS_ALIAS_DNS_NAME</code>
     *            attribute when you submit a <a href=
     *            "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     *            >RegisterInstance</a> request, the <code>TTL</code> value is
     *            ignored. Always specify a TTL for the service; you can use a
     *            service to register instances that create either alias or
     *            non-alias records.
     *            </p>
     *            </note>
     */
    public void setTTL(Long tTL) {
        this.tTL = tTL;
    }

    /**
     * <p>
     * The amount of time, in seconds, that you want DNS resolvers to cache the
     * settings for this record.
     * </p>
     * <note>
     * <p>
     * Alias records don't include a TTL because Route 53 uses the TTL for the
     * AWS resource that an alias record routes traffic to. If you include the
     * <code>AWS_ALIAS_DNS_NAME</code> attribute when you submit a <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     * >RegisterInstance</a> request, the <code>TTL</code> value is ignored.
     * Always specify a TTL for the service; you can use a service to register
     * instances that create either alias or non-alias records.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param tTL <p>
     *            The amount of time, in seconds, that you want DNS resolvers to
     *            cache the settings for this record.
     *            </p>
     *            <note>
     *            <p>
     *            Alias records don't include a TTL because Route 53 uses the
     *            TTL for the AWS resource that an alias record routes traffic
     *            to. If you include the <code>AWS_ALIAS_DNS_NAME</code>
     *            attribute when you submit a <a href=
     *            "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     *            >RegisterInstance</a> request, the <code>TTL</code> value is
     *            ignored. Always specify a TTL for the service; you can use a
     *            service to register instances that create either alias or
     *            non-alias records.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DnsRecord withTTL(Long tTL) {
        this.tTL = tTL;
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getTTL() != null)
            sb.append("TTL: " + getTTL());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getTTL() == null) ? 0 : getTTL().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DnsRecord == false)
            return false;
        DnsRecord other = (DnsRecord) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getTTL() == null ^ this.getTTL() == null)
            return false;
        if (other.getTTL() != null && other.getTTL().equals(this.getTTL()) == false)
            return false;
        return true;
    }
}
