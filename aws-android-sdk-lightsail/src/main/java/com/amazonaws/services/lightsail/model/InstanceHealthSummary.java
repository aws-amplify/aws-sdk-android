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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

/**
 * <p>
 * Describes information about the health of the instance.
 * </p>
 */
public class InstanceHealthSummary implements Serializable {
    /**
     * <p>
     * The name of the Lightsail instance for which you are requesting health
     * check data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String instanceName;

    /**
     * <p>
     * Describes the overall instance health. Valid values are below.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>initial, healthy, unhealthy, unused, draining,
     * unavailable
     */
    private String instanceHealth;

    /**
     * <p>
     * More information about the instance health. If the
     * <code>instanceHealth</code> is <code>healthy</code>, then an
     * <code>instanceHealthReason</code> value is not provided.
     * </p>
     * <p>
     * If <b> <code>instanceHealth</code> </b> is <code>initial</code>, the <b>
     * <code>instanceHealthReason</code> </b> value can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Lb.RegistrationInProgress</code> </b> - The target instance is
     * in the process of being registered with the load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Lb.InitialHealthChecking</code> </b> - The Lightsail load
     * balancer is still sending the target instance the minimum number of
     * health checks required to determine its health status.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <b> <code>instanceHealth</code> </b> is <code>unhealthy</code>, the
     * <b> <code>instanceHealthReason</code> </b> value can be one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Instance.ResponseCodeMismatch</code> </b> - The health checks
     * did not return an expected HTTP code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Instance.Timeout</code> </b> - The health check requests timed
     * out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Instance.FailedHealthChecks</code> </b> - The health checks
     * failed because the connection to the target instance timed out, the
     * target instance response was malformed, or the target instance failed the
     * health check for an unknown reason.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Lb.InternalError</code> </b> - The health checks failed due to
     * an internal error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <b> <code>instanceHealth</code> </b> is <code>unused</code>, the <b>
     * <code>instanceHealthReason</code> </b> value can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Instance.NotRegistered</code> </b> - The target instance is not
     * registered with the target group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Instance.NotInUse</code> </b> - The target group is not used by
     * any load balancer, or the target instance is in an Availability Zone that
     * is not enabled for its load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Instance.IpUnusable</code> </b> - The target IP address is
     * reserved for use by a Lightsail load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Instance.InvalidState</code> </b> - The target is in the
     * stopped or terminated state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <b> <code>instanceHealth</code> </b> is <code>draining</code>, the <b>
     * <code>instanceHealthReason</code> </b> value can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Instance.DeregistrationInProgress</code> </b> - The target
     * instance is in the process of being deregistered and the deregistration
     * delay period has not expired.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Lb.RegistrationInProgress,
     * Lb.InitialHealthChecking, Lb.InternalError,
     * Instance.ResponseCodeMismatch, Instance.Timeout,
     * Instance.FailedHealthChecks, Instance.NotRegistered, Instance.NotInUse,
     * Instance.DeregistrationInProgress, Instance.InvalidState,
     * Instance.IpUnusable
     */
    private String instanceHealthReason;

    /**
     * <p>
     * The name of the Lightsail instance for which you are requesting health
     * check data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of the Lightsail instance for which you are requesting
     *         health check data.
     *         </p>
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * <p>
     * The name of the Lightsail instance for which you are requesting health
     * check data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param instanceName <p>
     *            The name of the Lightsail instance for which you are
     *            requesting health check data.
     *            </p>
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * <p>
     * The name of the Lightsail instance for which you are requesting health
     * check data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param instanceName <p>
     *            The name of the Lightsail instance for which you are
     *            requesting health check data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceHealthSummary withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * <p>
     * Describes the overall instance health. Valid values are below.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>initial, healthy, unhealthy, unused, draining,
     * unavailable
     *
     * @return <p>
     *         Describes the overall instance health. Valid values are below.
     *         </p>
     * @see InstanceHealthState
     */
    public String getInstanceHealth() {
        return instanceHealth;
    }

    /**
     * <p>
     * Describes the overall instance health. Valid values are below.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>initial, healthy, unhealthy, unused, draining,
     * unavailable
     *
     * @param instanceHealth <p>
     *            Describes the overall instance health. Valid values are below.
     *            </p>
     * @see InstanceHealthState
     */
    public void setInstanceHealth(String instanceHealth) {
        this.instanceHealth = instanceHealth;
    }

    /**
     * <p>
     * Describes the overall instance health. Valid values are below.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>initial, healthy, unhealthy, unused, draining,
     * unavailable
     *
     * @param instanceHealth <p>
     *            Describes the overall instance health. Valid values are below.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceHealthState
     */
    public InstanceHealthSummary withInstanceHealth(String instanceHealth) {
        this.instanceHealth = instanceHealth;
        return this;
    }

    /**
     * <p>
     * Describes the overall instance health. Valid values are below.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>initial, healthy, unhealthy, unused, draining,
     * unavailable
     *
     * @param instanceHealth <p>
     *            Describes the overall instance health. Valid values are below.
     *            </p>
     * @see InstanceHealthState
     */
    public void setInstanceHealth(InstanceHealthState instanceHealth) {
        this.instanceHealth = instanceHealth.toString();
    }

    /**
     * <p>
     * Describes the overall instance health. Valid values are below.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>initial, healthy, unhealthy, unused, draining,
     * unavailable
     *
     * @param instanceHealth <p>
     *            Describes the overall instance health. Valid values are below.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceHealthState
     */
    public InstanceHealthSummary withInstanceHealth(InstanceHealthState instanceHealth) {
        this.instanceHealth = instanceHealth.toString();
        return this;
    }

    /**
     * <p>
     * More information about the instance health. If the
     * <code>instanceHealth</code> is <code>healthy</code>, then an
     * <code>instanceHealthReason</code> value is not provided.
     * </p>
     * <p>
     * If <b> <code>instanceHealth</code> </b> is <code>initial</code>, the <b>
     * <code>instanceHealthReason</code> </b> value can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Lb.RegistrationInProgress</code> </b> - The target instance is
     * in the process of being registered with the load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Lb.InitialHealthChecking</code> </b> - The Lightsail load
     * balancer is still sending the target instance the minimum number of
     * health checks required to determine its health status.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <b> <code>instanceHealth</code> </b> is <code>unhealthy</code>, the
     * <b> <code>instanceHealthReason</code> </b> value can be one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Instance.ResponseCodeMismatch</code> </b> - The health checks
     * did not return an expected HTTP code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Instance.Timeout</code> </b> - The health check requests timed
     * out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Instance.FailedHealthChecks</code> </b> - The health checks
     * failed because the connection to the target instance timed out, the
     * target instance response was malformed, or the target instance failed the
     * health check for an unknown reason.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Lb.InternalError</code> </b> - The health checks failed due to
     * an internal error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <b> <code>instanceHealth</code> </b> is <code>unused</code>, the <b>
     * <code>instanceHealthReason</code> </b> value can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Instance.NotRegistered</code> </b> - The target instance is not
     * registered with the target group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Instance.NotInUse</code> </b> - The target group is not used by
     * any load balancer, or the target instance is in an Availability Zone that
     * is not enabled for its load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Instance.IpUnusable</code> </b> - The target IP address is
     * reserved for use by a Lightsail load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Instance.InvalidState</code> </b> - The target is in the
     * stopped or terminated state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <b> <code>instanceHealth</code> </b> is <code>draining</code>, the <b>
     * <code>instanceHealthReason</code> </b> value can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Instance.DeregistrationInProgress</code> </b> - The target
     * instance is in the process of being deregistered and the deregistration
     * delay period has not expired.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Lb.RegistrationInProgress,
     * Lb.InitialHealthChecking, Lb.InternalError,
     * Instance.ResponseCodeMismatch, Instance.Timeout,
     * Instance.FailedHealthChecks, Instance.NotRegistered, Instance.NotInUse,
     * Instance.DeregistrationInProgress, Instance.InvalidState,
     * Instance.IpUnusable
     *
     * @return <p>
     *         More information about the instance health. If the
     *         <code>instanceHealth</code> is <code>healthy</code>, then an
     *         <code>instanceHealthReason</code> value is not provided.
     *         </p>
     *         <p>
     *         If <b> <code>instanceHealth</code> </b> is <code>initial</code>,
     *         the <b> <code>instanceHealthReason</code> </b> value can be one
     *         of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <code>Lb.RegistrationInProgress</code> </b> - The target
     *         instance is in the process of being registered with the load
     *         balancer.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>Lb.InitialHealthChecking</code> </b> - The Lightsail
     *         load balancer is still sending the target instance the minimum
     *         number of health checks required to determine its health status.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If <b> <code>instanceHealth</code> </b> is <code>unhealthy</code>
     *         , the <b> <code>instanceHealthReason</code> </b> value can be one
     *         of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <code>Instance.ResponseCodeMismatch</code> </b> - The health
     *         checks did not return an expected HTTP code.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>Instance.Timeout</code> </b> - The health check
     *         requests timed out.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>Instance.FailedHealthChecks</code> </b> - The health
     *         checks failed because the connection to the target instance timed
     *         out, the target instance response was malformed, or the target
     *         instance failed the health check for an unknown reason.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>Lb.InternalError</code> </b> - The health checks failed
     *         due to an internal error.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If <b> <code>instanceHealth</code> </b> is <code>unused</code>,
     *         the <b> <code>instanceHealthReason</code> </b> value can be one
     *         of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <code>Instance.NotRegistered</code> </b> - The target
     *         instance is not registered with the target group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>Instance.NotInUse</code> </b> - The target group is not
     *         used by any load balancer, or the target instance is in an
     *         Availability Zone that is not enabled for its load balancer.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>Instance.IpUnusable</code> </b> - The target IP address
     *         is reserved for use by a Lightsail load balancer.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>Instance.InvalidState</code> </b> - The target is in
     *         the stopped or terminated state.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If <b> <code>instanceHealth</code> </b> is <code>draining</code>,
     *         the <b> <code>instanceHealthReason</code> </b> value can be one
     *         of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <code>Instance.DeregistrationInProgress</code> </b> - The
     *         target instance is in the process of being deregistered and the
     *         deregistration delay period has not expired.
     *         </p>
     *         </li>
     *         </ul>
     * @see InstanceHealthReason
     */
    public String getInstanceHealthReason() {
        return instanceHealthReason;
    }

    /**
     * <p>
     * More information about the instance health. If the
     * <code>instanceHealth</code> is <code>healthy</code>, then an
     * <code>instanceHealthReason</code> value is not provided.
     * </p>
     * <p>
     * If <b> <code>instanceHealth</code> </b> is <code>initial</code>, the <b>
     * <code>instanceHealthReason</code> </b> value can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Lb.RegistrationInProgress</code> </b> - The target instance is
     * in the process of being registered with the load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Lb.InitialHealthChecking</code> </b> - The Lightsail load
     * balancer is still sending the target instance the minimum number of
     * health checks required to determine its health status.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <b> <code>instanceHealth</code> </b> is <code>unhealthy</code>, the
     * <b> <code>instanceHealthReason</code> </b> value can be one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Instance.ResponseCodeMismatch</code> </b> - The health checks
     * did not return an expected HTTP code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Instance.Timeout</code> </b> - The health check requests timed
     * out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Instance.FailedHealthChecks</code> </b> - The health checks
     * failed because the connection to the target instance timed out, the
     * target instance response was malformed, or the target instance failed the
     * health check for an unknown reason.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Lb.InternalError</code> </b> - The health checks failed due to
     * an internal error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <b> <code>instanceHealth</code> </b> is <code>unused</code>, the <b>
     * <code>instanceHealthReason</code> </b> value can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Instance.NotRegistered</code> </b> - The target instance is not
     * registered with the target group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Instance.NotInUse</code> </b> - The target group is not used by
     * any load balancer, or the target instance is in an Availability Zone that
     * is not enabled for its load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Instance.IpUnusable</code> </b> - The target IP address is
     * reserved for use by a Lightsail load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Instance.InvalidState</code> </b> - The target is in the
     * stopped or terminated state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <b> <code>instanceHealth</code> </b> is <code>draining</code>, the <b>
     * <code>instanceHealthReason</code> </b> value can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Instance.DeregistrationInProgress</code> </b> - The target
     * instance is in the process of being deregistered and the deregistration
     * delay period has not expired.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Lb.RegistrationInProgress,
     * Lb.InitialHealthChecking, Lb.InternalError,
     * Instance.ResponseCodeMismatch, Instance.Timeout,
     * Instance.FailedHealthChecks, Instance.NotRegistered, Instance.NotInUse,
     * Instance.DeregistrationInProgress, Instance.InvalidState,
     * Instance.IpUnusable
     *
     * @param instanceHealthReason <p>
     *            More information about the instance health. If the
     *            <code>instanceHealth</code> is <code>healthy</code>, then an
     *            <code>instanceHealthReason</code> value is not provided.
     *            </p>
     *            <p>
     *            If <b> <code>instanceHealth</code> </b> is
     *            <code>initial</code>, the <b>
     *            <code>instanceHealthReason</code> </b> value can be one of the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b> <code>Lb.RegistrationInProgress</code> </b> - The target
     *            instance is in the process of being registered with the load
     *            balancer.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>Lb.InitialHealthChecking</code> </b> - The Lightsail
     *            load balancer is still sending the target instance the minimum
     *            number of health checks required to determine its health
     *            status.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If <b> <code>instanceHealth</code> </b> is
     *            <code>unhealthy</code>, the <b>
     *            <code>instanceHealthReason</code> </b> value can be one of the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b> <code>Instance.ResponseCodeMismatch</code> </b> - The
     *            health checks did not return an expected HTTP code.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>Instance.Timeout</code> </b> - The health check
     *            requests timed out.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>Instance.FailedHealthChecks</code> </b> - The health
     *            checks failed because the connection to the target instance
     *            timed out, the target instance response was malformed, or the
     *            target instance failed the health check for an unknown reason.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>Lb.InternalError</code> </b> - The health checks
     *            failed due to an internal error.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If <b> <code>instanceHealth</code> </b> is <code>unused</code>
     *            , the <b> <code>instanceHealthReason</code> </b> value can be
     *            one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b> <code>Instance.NotRegistered</code> </b> - The target
     *            instance is not registered with the target group.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>Instance.NotInUse</code> </b> - The target group is
     *            not used by any load balancer, or the target instance is in an
     *            Availability Zone that is not enabled for its load balancer.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>Instance.IpUnusable</code> </b> - The target IP
     *            address is reserved for use by a Lightsail load balancer.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>Instance.InvalidState</code> </b> - The target is in
     *            the stopped or terminated state.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If <b> <code>instanceHealth</code> </b> is
     *            <code>draining</code>, the <b>
     *            <code>instanceHealthReason</code> </b> value can be one of the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b> <code>Instance.DeregistrationInProgress</code> </b> - The
     *            target instance is in the process of being deregistered and
     *            the deregistration delay period has not expired.
     *            </p>
     *            </li>
     *            </ul>
     * @see InstanceHealthReason
     */
    public void setInstanceHealthReason(String instanceHealthReason) {
        this.instanceHealthReason = instanceHealthReason;
    }

    /**
     * <p>
     * More information about the instance health. If the
     * <code>instanceHealth</code> is <code>healthy</code>, then an
     * <code>instanceHealthReason</code> value is not provided.
     * </p>
     * <p>
     * If <b> <code>instanceHealth</code> </b> is <code>initial</code>, the <b>
     * <code>instanceHealthReason</code> </b> value can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Lb.RegistrationInProgress</code> </b> - The target instance is
     * in the process of being registered with the load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Lb.InitialHealthChecking</code> </b> - The Lightsail load
     * balancer is still sending the target instance the minimum number of
     * health checks required to determine its health status.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <b> <code>instanceHealth</code> </b> is <code>unhealthy</code>, the
     * <b> <code>instanceHealthReason</code> </b> value can be one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Instance.ResponseCodeMismatch</code> </b> - The health checks
     * did not return an expected HTTP code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Instance.Timeout</code> </b> - The health check requests timed
     * out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Instance.FailedHealthChecks</code> </b> - The health checks
     * failed because the connection to the target instance timed out, the
     * target instance response was malformed, or the target instance failed the
     * health check for an unknown reason.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Lb.InternalError</code> </b> - The health checks failed due to
     * an internal error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <b> <code>instanceHealth</code> </b> is <code>unused</code>, the <b>
     * <code>instanceHealthReason</code> </b> value can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Instance.NotRegistered</code> </b> - The target instance is not
     * registered with the target group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Instance.NotInUse</code> </b> - The target group is not used by
     * any load balancer, or the target instance is in an Availability Zone that
     * is not enabled for its load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Instance.IpUnusable</code> </b> - The target IP address is
     * reserved for use by a Lightsail load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Instance.InvalidState</code> </b> - The target is in the
     * stopped or terminated state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <b> <code>instanceHealth</code> </b> is <code>draining</code>, the <b>
     * <code>instanceHealthReason</code> </b> value can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Instance.DeregistrationInProgress</code> </b> - The target
     * instance is in the process of being deregistered and the deregistration
     * delay period has not expired.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Lb.RegistrationInProgress,
     * Lb.InitialHealthChecking, Lb.InternalError,
     * Instance.ResponseCodeMismatch, Instance.Timeout,
     * Instance.FailedHealthChecks, Instance.NotRegistered, Instance.NotInUse,
     * Instance.DeregistrationInProgress, Instance.InvalidState,
     * Instance.IpUnusable
     *
     * @param instanceHealthReason <p>
     *            More information about the instance health. If the
     *            <code>instanceHealth</code> is <code>healthy</code>, then an
     *            <code>instanceHealthReason</code> value is not provided.
     *            </p>
     *            <p>
     *            If <b> <code>instanceHealth</code> </b> is
     *            <code>initial</code>, the <b>
     *            <code>instanceHealthReason</code> </b> value can be one of the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b> <code>Lb.RegistrationInProgress</code> </b> - The target
     *            instance is in the process of being registered with the load
     *            balancer.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>Lb.InitialHealthChecking</code> </b> - The Lightsail
     *            load balancer is still sending the target instance the minimum
     *            number of health checks required to determine its health
     *            status.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If <b> <code>instanceHealth</code> </b> is
     *            <code>unhealthy</code>, the <b>
     *            <code>instanceHealthReason</code> </b> value can be one of the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b> <code>Instance.ResponseCodeMismatch</code> </b> - The
     *            health checks did not return an expected HTTP code.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>Instance.Timeout</code> </b> - The health check
     *            requests timed out.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>Instance.FailedHealthChecks</code> </b> - The health
     *            checks failed because the connection to the target instance
     *            timed out, the target instance response was malformed, or the
     *            target instance failed the health check for an unknown reason.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>Lb.InternalError</code> </b> - The health checks
     *            failed due to an internal error.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If <b> <code>instanceHealth</code> </b> is <code>unused</code>
     *            , the <b> <code>instanceHealthReason</code> </b> value can be
     *            one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b> <code>Instance.NotRegistered</code> </b> - The target
     *            instance is not registered with the target group.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>Instance.NotInUse</code> </b> - The target group is
     *            not used by any load balancer, or the target instance is in an
     *            Availability Zone that is not enabled for its load balancer.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>Instance.IpUnusable</code> </b> - The target IP
     *            address is reserved for use by a Lightsail load balancer.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>Instance.InvalidState</code> </b> - The target is in
     *            the stopped or terminated state.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If <b> <code>instanceHealth</code> </b> is
     *            <code>draining</code>, the <b>
     *            <code>instanceHealthReason</code> </b> value can be one of the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b> <code>Instance.DeregistrationInProgress</code> </b> - The
     *            target instance is in the process of being deregistered and
     *            the deregistration delay period has not expired.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceHealthReason
     */
    public InstanceHealthSummary withInstanceHealthReason(String instanceHealthReason) {
        this.instanceHealthReason = instanceHealthReason;
        return this;
    }

    /**
     * <p>
     * More information about the instance health. If the
     * <code>instanceHealth</code> is <code>healthy</code>, then an
     * <code>instanceHealthReason</code> value is not provided.
     * </p>
     * <p>
     * If <b> <code>instanceHealth</code> </b> is <code>initial</code>, the <b>
     * <code>instanceHealthReason</code> </b> value can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Lb.RegistrationInProgress</code> </b> - The target instance is
     * in the process of being registered with the load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Lb.InitialHealthChecking</code> </b> - The Lightsail load
     * balancer is still sending the target instance the minimum number of
     * health checks required to determine its health status.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <b> <code>instanceHealth</code> </b> is <code>unhealthy</code>, the
     * <b> <code>instanceHealthReason</code> </b> value can be one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Instance.ResponseCodeMismatch</code> </b> - The health checks
     * did not return an expected HTTP code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Instance.Timeout</code> </b> - The health check requests timed
     * out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Instance.FailedHealthChecks</code> </b> - The health checks
     * failed because the connection to the target instance timed out, the
     * target instance response was malformed, or the target instance failed the
     * health check for an unknown reason.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Lb.InternalError</code> </b> - The health checks failed due to
     * an internal error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <b> <code>instanceHealth</code> </b> is <code>unused</code>, the <b>
     * <code>instanceHealthReason</code> </b> value can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Instance.NotRegistered</code> </b> - The target instance is not
     * registered with the target group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Instance.NotInUse</code> </b> - The target group is not used by
     * any load balancer, or the target instance is in an Availability Zone that
     * is not enabled for its load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Instance.IpUnusable</code> </b> - The target IP address is
     * reserved for use by a Lightsail load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Instance.InvalidState</code> </b> - The target is in the
     * stopped or terminated state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <b> <code>instanceHealth</code> </b> is <code>draining</code>, the <b>
     * <code>instanceHealthReason</code> </b> value can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Instance.DeregistrationInProgress</code> </b> - The target
     * instance is in the process of being deregistered and the deregistration
     * delay period has not expired.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Lb.RegistrationInProgress,
     * Lb.InitialHealthChecking, Lb.InternalError,
     * Instance.ResponseCodeMismatch, Instance.Timeout,
     * Instance.FailedHealthChecks, Instance.NotRegistered, Instance.NotInUse,
     * Instance.DeregistrationInProgress, Instance.InvalidState,
     * Instance.IpUnusable
     *
     * @param instanceHealthReason <p>
     *            More information about the instance health. If the
     *            <code>instanceHealth</code> is <code>healthy</code>, then an
     *            <code>instanceHealthReason</code> value is not provided.
     *            </p>
     *            <p>
     *            If <b> <code>instanceHealth</code> </b> is
     *            <code>initial</code>, the <b>
     *            <code>instanceHealthReason</code> </b> value can be one of the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b> <code>Lb.RegistrationInProgress</code> </b> - The target
     *            instance is in the process of being registered with the load
     *            balancer.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>Lb.InitialHealthChecking</code> </b> - The Lightsail
     *            load balancer is still sending the target instance the minimum
     *            number of health checks required to determine its health
     *            status.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If <b> <code>instanceHealth</code> </b> is
     *            <code>unhealthy</code>, the <b>
     *            <code>instanceHealthReason</code> </b> value can be one of the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b> <code>Instance.ResponseCodeMismatch</code> </b> - The
     *            health checks did not return an expected HTTP code.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>Instance.Timeout</code> </b> - The health check
     *            requests timed out.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>Instance.FailedHealthChecks</code> </b> - The health
     *            checks failed because the connection to the target instance
     *            timed out, the target instance response was malformed, or the
     *            target instance failed the health check for an unknown reason.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>Lb.InternalError</code> </b> - The health checks
     *            failed due to an internal error.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If <b> <code>instanceHealth</code> </b> is <code>unused</code>
     *            , the <b> <code>instanceHealthReason</code> </b> value can be
     *            one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b> <code>Instance.NotRegistered</code> </b> - The target
     *            instance is not registered with the target group.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>Instance.NotInUse</code> </b> - The target group is
     *            not used by any load balancer, or the target instance is in an
     *            Availability Zone that is not enabled for its load balancer.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>Instance.IpUnusable</code> </b> - The target IP
     *            address is reserved for use by a Lightsail load balancer.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>Instance.InvalidState</code> </b> - The target is in
     *            the stopped or terminated state.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If <b> <code>instanceHealth</code> </b> is
     *            <code>draining</code>, the <b>
     *            <code>instanceHealthReason</code> </b> value can be one of the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b> <code>Instance.DeregistrationInProgress</code> </b> - The
     *            target instance is in the process of being deregistered and
     *            the deregistration delay period has not expired.
     *            </p>
     *            </li>
     *            </ul>
     * @see InstanceHealthReason
     */
    public void setInstanceHealthReason(InstanceHealthReason instanceHealthReason) {
        this.instanceHealthReason = instanceHealthReason.toString();
    }

    /**
     * <p>
     * More information about the instance health. If the
     * <code>instanceHealth</code> is <code>healthy</code>, then an
     * <code>instanceHealthReason</code> value is not provided.
     * </p>
     * <p>
     * If <b> <code>instanceHealth</code> </b> is <code>initial</code>, the <b>
     * <code>instanceHealthReason</code> </b> value can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Lb.RegistrationInProgress</code> </b> - The target instance is
     * in the process of being registered with the load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Lb.InitialHealthChecking</code> </b> - The Lightsail load
     * balancer is still sending the target instance the minimum number of
     * health checks required to determine its health status.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <b> <code>instanceHealth</code> </b> is <code>unhealthy</code>, the
     * <b> <code>instanceHealthReason</code> </b> value can be one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Instance.ResponseCodeMismatch</code> </b> - The health checks
     * did not return an expected HTTP code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Instance.Timeout</code> </b> - The health check requests timed
     * out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Instance.FailedHealthChecks</code> </b> - The health checks
     * failed because the connection to the target instance timed out, the
     * target instance response was malformed, or the target instance failed the
     * health check for an unknown reason.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Lb.InternalError</code> </b> - The health checks failed due to
     * an internal error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <b> <code>instanceHealth</code> </b> is <code>unused</code>, the <b>
     * <code>instanceHealthReason</code> </b> value can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Instance.NotRegistered</code> </b> - The target instance is not
     * registered with the target group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Instance.NotInUse</code> </b> - The target group is not used by
     * any load balancer, or the target instance is in an Availability Zone that
     * is not enabled for its load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Instance.IpUnusable</code> </b> - The target IP address is
     * reserved for use by a Lightsail load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Instance.InvalidState</code> </b> - The target is in the
     * stopped or terminated state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <b> <code>instanceHealth</code> </b> is <code>draining</code>, the <b>
     * <code>instanceHealthReason</code> </b> value can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Instance.DeregistrationInProgress</code> </b> - The target
     * instance is in the process of being deregistered and the deregistration
     * delay period has not expired.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Lb.RegistrationInProgress,
     * Lb.InitialHealthChecking, Lb.InternalError,
     * Instance.ResponseCodeMismatch, Instance.Timeout,
     * Instance.FailedHealthChecks, Instance.NotRegistered, Instance.NotInUse,
     * Instance.DeregistrationInProgress, Instance.InvalidState,
     * Instance.IpUnusable
     *
     * @param instanceHealthReason <p>
     *            More information about the instance health. If the
     *            <code>instanceHealth</code> is <code>healthy</code>, then an
     *            <code>instanceHealthReason</code> value is not provided.
     *            </p>
     *            <p>
     *            If <b> <code>instanceHealth</code> </b> is
     *            <code>initial</code>, the <b>
     *            <code>instanceHealthReason</code> </b> value can be one of the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b> <code>Lb.RegistrationInProgress</code> </b> - The target
     *            instance is in the process of being registered with the load
     *            balancer.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>Lb.InitialHealthChecking</code> </b> - The Lightsail
     *            load balancer is still sending the target instance the minimum
     *            number of health checks required to determine its health
     *            status.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If <b> <code>instanceHealth</code> </b> is
     *            <code>unhealthy</code>, the <b>
     *            <code>instanceHealthReason</code> </b> value can be one of the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b> <code>Instance.ResponseCodeMismatch</code> </b> - The
     *            health checks did not return an expected HTTP code.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>Instance.Timeout</code> </b> - The health check
     *            requests timed out.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>Instance.FailedHealthChecks</code> </b> - The health
     *            checks failed because the connection to the target instance
     *            timed out, the target instance response was malformed, or the
     *            target instance failed the health check for an unknown reason.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>Lb.InternalError</code> </b> - The health checks
     *            failed due to an internal error.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If <b> <code>instanceHealth</code> </b> is <code>unused</code>
     *            , the <b> <code>instanceHealthReason</code> </b> value can be
     *            one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b> <code>Instance.NotRegistered</code> </b> - The target
     *            instance is not registered with the target group.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>Instance.NotInUse</code> </b> - The target group is
     *            not used by any load balancer, or the target instance is in an
     *            Availability Zone that is not enabled for its load balancer.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>Instance.IpUnusable</code> </b> - The target IP
     *            address is reserved for use by a Lightsail load balancer.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>Instance.InvalidState</code> </b> - The target is in
     *            the stopped or terminated state.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If <b> <code>instanceHealth</code> </b> is
     *            <code>draining</code>, the <b>
     *            <code>instanceHealthReason</code> </b> value can be one of the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b> <code>Instance.DeregistrationInProgress</code> </b> - The
     *            target instance is in the process of being deregistered and
     *            the deregistration delay period has not expired.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceHealthReason
     */
    public InstanceHealthSummary withInstanceHealthReason(InstanceHealthReason instanceHealthReason) {
        this.instanceHealthReason = instanceHealthReason.toString();
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
        if (getInstanceName() != null)
            sb.append("instanceName: " + getInstanceName() + ",");
        if (getInstanceHealth() != null)
            sb.append("instanceHealth: " + getInstanceHealth() + ",");
        if (getInstanceHealthReason() != null)
            sb.append("instanceHealthReason: " + getInstanceHealthReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceName() == null) ? 0 : getInstanceName().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceHealth() == null) ? 0 : getInstanceHealth().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceHealthReason() == null) ? 0 : getInstanceHealthReason().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceHealthSummary == false)
            return false;
        InstanceHealthSummary other = (InstanceHealthSummary) obj;

        if (other.getInstanceName() == null ^ this.getInstanceName() == null)
            return false;
        if (other.getInstanceName() != null
                && other.getInstanceName().equals(this.getInstanceName()) == false)
            return false;
        if (other.getInstanceHealth() == null ^ this.getInstanceHealth() == null)
            return false;
        if (other.getInstanceHealth() != null
                && other.getInstanceHealth().equals(this.getInstanceHealth()) == false)
            return false;
        if (other.getInstanceHealthReason() == null ^ this.getInstanceHealthReason() == null)
            return false;
        if (other.getInstanceHealthReason() != null
                && other.getInstanceHealthReason().equals(this.getInstanceHealthReason()) == false)
            return false;
        return true;
    }
}
