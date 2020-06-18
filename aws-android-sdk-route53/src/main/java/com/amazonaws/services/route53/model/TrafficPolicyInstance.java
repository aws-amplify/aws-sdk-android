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

package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains settings for the new traffic policy instance.
 * </p>
 */
public class TrafficPolicyInstance implements Serializable {
    /**
     * <p>
     * The ID that Amazon Route 53 assigned to the new traffic policy instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     */
    private String id;

    /**
     * <p>
     * The ID of the hosted zone that Amazon Route 53 created resource record
     * sets in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     */
    private String hostedZoneId;

    /**
     * <p>
     * The DNS name, such as www.example.com, for which Amazon Route 53 responds
     * to queries by using the resource record sets that are associated with
     * this traffic policy instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String name;

    /**
     * <p>
     * The TTL that Amazon Route 53 assigned to all of the resource record sets
     * that it created in the specified hosted zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     */
    private Long tTL;

    /**
     * <p>
     * The value of <code>State</code> is one of the following values:
     * </p>
     * <dl>
     * <dt>Applied</dt>
     * <dd>
     * <p>
     * Amazon Route 53 has finished creating resource record sets, and changes
     * have propagated to all Route 53 edge locations.
     * </p>
     * </dd>
     * <dt>Creating</dt>
     * <dd>
     * <p>
     * Route 53 is creating the resource record sets. Use
     * <code>GetTrafficPolicyInstance</code> to confirm that the
     * <code>CreateTrafficPolicyInstance</code> request completed successfully.
     * </p>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <p>
     * Route 53 wasn't able to create or update the resource record sets. When
     * the value of <code>State</code> is <code>Failed</code>, see
     * <code>Message</code> for an explanation of what caused the request to
     * fail.
     * </p>
     * </dd>
     * </dl>
     */
    private String state;

    /**
     * <p>
     * If <code>State</code> is <code>Failed</code>, an explanation of the
     * reason for the failure. If <code>State</code> is another value,
     * <code>Message</code> is empty.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String message;

    /**
     * <p>
     * The ID of the traffic policy that Amazon Route 53 used to create resource
     * record sets in the specified hosted zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     */
    private String trafficPolicyId;

    /**
     * <p>
     * The version of the traffic policy that Amazon Route 53 used to create
     * resource record sets in the specified hosted zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer trafficPolicyVersion;

    /**
     * <p>
     * The DNS type that Amazon Route 53 assigned to all of the resource record
     * sets that it created for this traffic policy instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     */
    private String trafficPolicyType;

    /**
     * <p>
     * The ID that Amazon Route 53 assigned to the new traffic policy instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @return <p>
     *         The ID that Amazon Route 53 assigned to the new traffic policy
     *         instance.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID that Amazon Route 53 assigned to the new traffic policy instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @param id <p>
     *            The ID that Amazon Route 53 assigned to the new traffic policy
     *            instance.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID that Amazon Route 53 assigned to the new traffic policy instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @param id <p>
     *            The ID that Amazon Route 53 assigned to the new traffic policy
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficPolicyInstance withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The ID of the hosted zone that Amazon Route 53 created resource record
     * sets in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @return <p>
     *         The ID of the hosted zone that Amazon Route 53 created resource
     *         record sets in.
     *         </p>
     */
    public String getHostedZoneId() {
        return hostedZoneId;
    }

    /**
     * <p>
     * The ID of the hosted zone that Amazon Route 53 created resource record
     * sets in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param hostedZoneId <p>
     *            The ID of the hosted zone that Amazon Route 53 created
     *            resource record sets in.
     *            </p>
     */
    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * The ID of the hosted zone that Amazon Route 53 created resource record
     * sets in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param hostedZoneId <p>
     *            The ID of the hosted zone that Amazon Route 53 created
     *            resource record sets in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficPolicyInstance withHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
        return this;
    }

    /**
     * <p>
     * The DNS name, such as www.example.com, for which Amazon Route 53 responds
     * to queries by using the resource record sets that are associated with
     * this traffic policy instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         The DNS name, such as www.example.com, for which Amazon Route 53
     *         responds to queries by using the resource record sets that are
     *         associated with this traffic policy instance.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The DNS name, such as www.example.com, for which Amazon Route 53 responds
     * to queries by using the resource record sets that are associated with
     * this traffic policy instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param name <p>
     *            The DNS name, such as www.example.com, for which Amazon Route
     *            53 responds to queries by using the resource record sets that
     *            are associated with this traffic policy instance.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The DNS name, such as www.example.com, for which Amazon Route 53 responds
     * to queries by using the resource record sets that are associated with
     * this traffic policy instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param name <p>
     *            The DNS name, such as www.example.com, for which Amazon Route
     *            53 responds to queries by using the resource record sets that
     *            are associated with this traffic policy instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficPolicyInstance withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The TTL that Amazon Route 53 assigned to all of the resource record sets
     * that it created in the specified hosted zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @return <p>
     *         The TTL that Amazon Route 53 assigned to all of the resource
     *         record sets that it created in the specified hosted zone.
     *         </p>
     */
    public Long getTTL() {
        return tTL;
    }

    /**
     * <p>
     * The TTL that Amazon Route 53 assigned to all of the resource record sets
     * that it created in the specified hosted zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param tTL <p>
     *            The TTL that Amazon Route 53 assigned to all of the resource
     *            record sets that it created in the specified hosted zone.
     *            </p>
     */
    public void setTTL(Long tTL) {
        this.tTL = tTL;
    }

    /**
     * <p>
     * The TTL that Amazon Route 53 assigned to all of the resource record sets
     * that it created in the specified hosted zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param tTL <p>
     *            The TTL that Amazon Route 53 assigned to all of the resource
     *            record sets that it created in the specified hosted zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficPolicyInstance withTTL(Long tTL) {
        this.tTL = tTL;
        return this;
    }

    /**
     * <p>
     * The value of <code>State</code> is one of the following values:
     * </p>
     * <dl>
     * <dt>Applied</dt>
     * <dd>
     * <p>
     * Amazon Route 53 has finished creating resource record sets, and changes
     * have propagated to all Route 53 edge locations.
     * </p>
     * </dd>
     * <dt>Creating</dt>
     * <dd>
     * <p>
     * Route 53 is creating the resource record sets. Use
     * <code>GetTrafficPolicyInstance</code> to confirm that the
     * <code>CreateTrafficPolicyInstance</code> request completed successfully.
     * </p>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <p>
     * Route 53 wasn't able to create or update the resource record sets. When
     * the value of <code>State</code> is <code>Failed</code>, see
     * <code>Message</code> for an explanation of what caused the request to
     * fail.
     * </p>
     * </dd>
     * </dl>
     *
     * @return <p>
     *         The value of <code>State</code> is one of the following values:
     *         </p>
     *         <dl>
     *         <dt>Applied</dt>
     *         <dd>
     *         <p>
     *         Amazon Route 53 has finished creating resource record sets, and
     *         changes have propagated to all Route 53 edge locations.
     *         </p>
     *         </dd>
     *         <dt>Creating</dt>
     *         <dd>
     *         <p>
     *         Route 53 is creating the resource record sets. Use
     *         <code>GetTrafficPolicyInstance</code> to confirm that the
     *         <code>CreateTrafficPolicyInstance</code> request completed
     *         successfully.
     *         </p>
     *         </dd>
     *         <dt>Failed</dt>
     *         <dd>
     *         <p>
     *         Route 53 wasn't able to create or update the resource record
     *         sets. When the value of <code>State</code> is <code>Failed</code>
     *         , see <code>Message</code> for an explanation of what caused the
     *         request to fail.
     *         </p>
     *         </dd>
     *         </dl>
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The value of <code>State</code> is one of the following values:
     * </p>
     * <dl>
     * <dt>Applied</dt>
     * <dd>
     * <p>
     * Amazon Route 53 has finished creating resource record sets, and changes
     * have propagated to all Route 53 edge locations.
     * </p>
     * </dd>
     * <dt>Creating</dt>
     * <dd>
     * <p>
     * Route 53 is creating the resource record sets. Use
     * <code>GetTrafficPolicyInstance</code> to confirm that the
     * <code>CreateTrafficPolicyInstance</code> request completed successfully.
     * </p>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <p>
     * Route 53 wasn't able to create or update the resource record sets. When
     * the value of <code>State</code> is <code>Failed</code>, see
     * <code>Message</code> for an explanation of what caused the request to
     * fail.
     * </p>
     * </dd>
     * </dl>
     *
     * @param state <p>
     *            The value of <code>State</code> is one of the following
     *            values:
     *            </p>
     *            <dl>
     *            <dt>Applied</dt>
     *            <dd>
     *            <p>
     *            Amazon Route 53 has finished creating resource record sets,
     *            and changes have propagated to all Route 53 edge locations.
     *            </p>
     *            </dd>
     *            <dt>Creating</dt>
     *            <dd>
     *            <p>
     *            Route 53 is creating the resource record sets. Use
     *            <code>GetTrafficPolicyInstance</code> to confirm that the
     *            <code>CreateTrafficPolicyInstance</code> request completed
     *            successfully.
     *            </p>
     *            </dd>
     *            <dt>Failed</dt>
     *            <dd>
     *            <p>
     *            Route 53 wasn't able to create or update the resource record
     *            sets. When the value of <code>State</code> is
     *            <code>Failed</code>, see <code>Message</code> for an
     *            explanation of what caused the request to fail.
     *            </p>
     *            </dd>
     *            </dl>
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The value of <code>State</code> is one of the following values:
     * </p>
     * <dl>
     * <dt>Applied</dt>
     * <dd>
     * <p>
     * Amazon Route 53 has finished creating resource record sets, and changes
     * have propagated to all Route 53 edge locations.
     * </p>
     * </dd>
     * <dt>Creating</dt>
     * <dd>
     * <p>
     * Route 53 is creating the resource record sets. Use
     * <code>GetTrafficPolicyInstance</code> to confirm that the
     * <code>CreateTrafficPolicyInstance</code> request completed successfully.
     * </p>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <p>
     * Route 53 wasn't able to create or update the resource record sets. When
     * the value of <code>State</code> is <code>Failed</code>, see
     * <code>Message</code> for an explanation of what caused the request to
     * fail.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param state <p>
     *            The value of <code>State</code> is one of the following
     *            values:
     *            </p>
     *            <dl>
     *            <dt>Applied</dt>
     *            <dd>
     *            <p>
     *            Amazon Route 53 has finished creating resource record sets,
     *            and changes have propagated to all Route 53 edge locations.
     *            </p>
     *            </dd>
     *            <dt>Creating</dt>
     *            <dd>
     *            <p>
     *            Route 53 is creating the resource record sets. Use
     *            <code>GetTrafficPolicyInstance</code> to confirm that the
     *            <code>CreateTrafficPolicyInstance</code> request completed
     *            successfully.
     *            </p>
     *            </dd>
     *            <dt>Failed</dt>
     *            <dd>
     *            <p>
     *            Route 53 wasn't able to create or update the resource record
     *            sets. When the value of <code>State</code> is
     *            <code>Failed</code>, see <code>Message</code> for an
     *            explanation of what caused the request to fail.
     *            </p>
     *            </dd>
     *            </dl>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficPolicyInstance withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * If <code>State</code> is <code>Failed</code>, an explanation of the
     * reason for the failure. If <code>State</code> is another value,
     * <code>Message</code> is empty.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         If <code>State</code> is <code>Failed</code>, an explanation of
     *         the reason for the failure. If <code>State</code> is another
     *         value, <code>Message</code> is empty.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * If <code>State</code> is <code>Failed</code>, an explanation of the
     * reason for the failure. If <code>State</code> is another value,
     * <code>Message</code> is empty.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param message <p>
     *            If <code>State</code> is <code>Failed</code>, an explanation
     *            of the reason for the failure. If <code>State</code> is
     *            another value, <code>Message</code> is empty.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * If <code>State</code> is <code>Failed</code>, an explanation of the
     * reason for the failure. If <code>State</code> is another value,
     * <code>Message</code> is empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param message <p>
     *            If <code>State</code> is <code>Failed</code>, an explanation
     *            of the reason for the failure. If <code>State</code> is
     *            another value, <code>Message</code> is empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficPolicyInstance withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * <p>
     * The ID of the traffic policy that Amazon Route 53 used to create resource
     * record sets in the specified hosted zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @return <p>
     *         The ID of the traffic policy that Amazon Route 53 used to create
     *         resource record sets in the specified hosted zone.
     *         </p>
     */
    public String getTrafficPolicyId() {
        return trafficPolicyId;
    }

    /**
     * <p>
     * The ID of the traffic policy that Amazon Route 53 used to create resource
     * record sets in the specified hosted zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @param trafficPolicyId <p>
     *            The ID of the traffic policy that Amazon Route 53 used to
     *            create resource record sets in the specified hosted zone.
     *            </p>
     */
    public void setTrafficPolicyId(String trafficPolicyId) {
        this.trafficPolicyId = trafficPolicyId;
    }

    /**
     * <p>
     * The ID of the traffic policy that Amazon Route 53 used to create resource
     * record sets in the specified hosted zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @param trafficPolicyId <p>
     *            The ID of the traffic policy that Amazon Route 53 used to
     *            create resource record sets in the specified hosted zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficPolicyInstance withTrafficPolicyId(String trafficPolicyId) {
        this.trafficPolicyId = trafficPolicyId;
        return this;
    }

    /**
     * <p>
     * The version of the traffic policy that Amazon Route 53 used to create
     * resource record sets in the specified hosted zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return <p>
     *         The version of the traffic policy that Amazon Route 53 used to
     *         create resource record sets in the specified hosted zone.
     *         </p>
     */
    public Integer getTrafficPolicyVersion() {
        return trafficPolicyVersion;
    }

    /**
     * <p>
     * The version of the traffic policy that Amazon Route 53 used to create
     * resource record sets in the specified hosted zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param trafficPolicyVersion <p>
     *            The version of the traffic policy that Amazon Route 53 used to
     *            create resource record sets in the specified hosted zone.
     *            </p>
     */
    public void setTrafficPolicyVersion(Integer trafficPolicyVersion) {
        this.trafficPolicyVersion = trafficPolicyVersion;
    }

    /**
     * <p>
     * The version of the traffic policy that Amazon Route 53 used to create
     * resource record sets in the specified hosted zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param trafficPolicyVersion <p>
     *            The version of the traffic policy that Amazon Route 53 used to
     *            create resource record sets in the specified hosted zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficPolicyInstance withTrafficPolicyVersion(Integer trafficPolicyVersion) {
        this.trafficPolicyVersion = trafficPolicyVersion;
        return this;
    }

    /**
     * <p>
     * The DNS type that Amazon Route 53 assigned to all of the resource record
     * sets that it created for this traffic policy instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     *
     * @return <p>
     *         The DNS type that Amazon Route 53 assigned to all of the resource
     *         record sets that it created for this traffic policy instance.
     *         </p>
     * @see RRType
     */
    public String getTrafficPolicyType() {
        return trafficPolicyType;
    }

    /**
     * <p>
     * The DNS type that Amazon Route 53 assigned to all of the resource record
     * sets that it created for this traffic policy instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     *
     * @param trafficPolicyType <p>
     *            The DNS type that Amazon Route 53 assigned to all of the
     *            resource record sets that it created for this traffic policy
     *            instance.
     *            </p>
     * @see RRType
     */
    public void setTrafficPolicyType(String trafficPolicyType) {
        this.trafficPolicyType = trafficPolicyType;
    }

    /**
     * <p>
     * The DNS type that Amazon Route 53 assigned to all of the resource record
     * sets that it created for this traffic policy instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     *
     * @param trafficPolicyType <p>
     *            The DNS type that Amazon Route 53 assigned to all of the
     *            resource record sets that it created for this traffic policy
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RRType
     */
    public TrafficPolicyInstance withTrafficPolicyType(String trafficPolicyType) {
        this.trafficPolicyType = trafficPolicyType;
        return this;
    }

    /**
     * <p>
     * The DNS type that Amazon Route 53 assigned to all of the resource record
     * sets that it created for this traffic policy instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     *
     * @param trafficPolicyType <p>
     *            The DNS type that Amazon Route 53 assigned to all of the
     *            resource record sets that it created for this traffic policy
     *            instance.
     *            </p>
     * @see RRType
     */
    public void setTrafficPolicyType(RRType trafficPolicyType) {
        this.trafficPolicyType = trafficPolicyType.toString();
    }

    /**
     * <p>
     * The DNS type that Amazon Route 53 assigned to all of the resource record
     * sets that it created for this traffic policy instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     *
     * @param trafficPolicyType <p>
     *            The DNS type that Amazon Route 53 assigned to all of the
     *            resource record sets that it created for this traffic policy
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RRType
     */
    public TrafficPolicyInstance withTrafficPolicyType(RRType trafficPolicyType) {
        this.trafficPolicyType = trafficPolicyType.toString();
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: " + getHostedZoneId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getTTL() != null)
            sb.append("TTL: " + getTTL() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage() + ",");
        if (getTrafficPolicyId() != null)
            sb.append("TrafficPolicyId: " + getTrafficPolicyId() + ",");
        if (getTrafficPolicyVersion() != null)
            sb.append("TrafficPolicyVersion: " + getTrafficPolicyVersion() + ",");
        if (getTrafficPolicyType() != null)
            sb.append("TrafficPolicyType: " + getTrafficPolicyType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTTL() == null) ? 0 : getTTL().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode
                + ((getTrafficPolicyId() == null) ? 0 : getTrafficPolicyId().hashCode());
        hashCode = prime * hashCode
                + ((getTrafficPolicyVersion() == null) ? 0 : getTrafficPolicyVersion().hashCode());
        hashCode = prime * hashCode
                + ((getTrafficPolicyType() == null) ? 0 : getTrafficPolicyType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrafficPolicyInstance == false)
            return false;
        TrafficPolicyInstance other = (TrafficPolicyInstance) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null
                && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTTL() == null ^ this.getTTL() == null)
            return false;
        if (other.getTTL() != null && other.getTTL().equals(this.getTTL()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getTrafficPolicyId() == null ^ this.getTrafficPolicyId() == null)
            return false;
        if (other.getTrafficPolicyId() != null
                && other.getTrafficPolicyId().equals(this.getTrafficPolicyId()) == false)
            return false;
        if (other.getTrafficPolicyVersion() == null ^ this.getTrafficPolicyVersion() == null)
            return false;
        if (other.getTrafficPolicyVersion() != null
                && other.getTrafficPolicyVersion().equals(this.getTrafficPolicyVersion()) == false)
            return false;
        if (other.getTrafficPolicyType() == null ^ this.getTrafficPolicyType() == null)
            return false;
        if (other.getTrafficPolicyType() != null
                && other.getTrafficPolicyType().equals(this.getTrafficPolicyType()) == false)
            return false;
        return true;
    }
}
