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
 * Creates a new health check.
 * </p>
 * <p>
 * For information about adding health checks to resource record sets, see <a
 * href=
 * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_ResourceRecordSet.html#Route53-Type-ResourceRecordSet-HealthCheckId"
 * >HealthCheckId</a> in <a href=
 * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_ChangeResourceRecordSets.html"
 * >ChangeResourceRecordSets</a>.
 * </p>
 * <p>
 * <b>ELB Load Balancers</b>
 * </p>
 * <p>
 * If you're registering EC2 instances with an Elastic Load Balancing (ELB) load
 * balancer, do not create Amazon Route 53 health checks for the EC2 instances.
 * When you register an EC2 instance with a load balancer, you configure
 * settings for an ELB health check, which performs a similar function to a
 * Route 53 health check.
 * </p>
 * <p>
 * <b>Private Hosted Zones</b>
 * </p>
 * <p>
 * You can associate health checks with failover resource record sets in a
 * private hosted zone. Note the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Route 53 health checkers are outside the VPC. To check the health of an
 * endpoint within a VPC by IP address, you must assign a public IP address to
 * the instance in the VPC.
 * </p>
 * </li>
 * <li>
 * <p>
 * You can configure a health checker to check the health of an external
 * resource that the instance relies on, such as a database server.
 * </p>
 * </li>
 * <li>
 * <p>
 * You can create a CloudWatch metric, associate an alarm with the metric, and
 * then create a health check that is based on the state of the alarm. For
 * example, you might create a CloudWatch metric that checks the status of the
 * Amazon EC2 <code>StatusCheckFailed</code> metric, add an alarm to the metric,
 * and then create a health check that is based on the state of the alarm. For
 * information about creating CloudWatch metrics and alarms by using the
 * CloudWatch console, see the <a href=
 * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/WhatIsCloudWatch.html"
 * >Amazon CloudWatch User Guide</a>.
 * </p>
 * </li>
 * </ul>
 */
public class CreateHealthCheckRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A unique string that identifies the request and that allows you to retry
     * a failed <code>CreateHealthCheck</code> request without the risk of
     * creating two identical health checks:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you send a <code>CreateHealthCheck</code> request with the same
     * <code>CallerReference</code> and settings as a previous request, and if
     * the health check doesn't exist, Amazon Route 53 creates the health check.
     * If the health check does exist, Route 53 returns the settings for the
     * existing health check.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send a <code>CreateHealthCheck</code> request with the same
     * <code>CallerReference</code> as a deleted health check, regardless of the
     * settings, Route 53 returns a <code>HealthCheckAlreadyExists</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send a <code>CreateHealthCheck</code> request with the same
     * <code>CallerReference</code> as an existing health check but with
     * different settings, Route 53 returns a
     * <code>HealthCheckAlreadyExists</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send a <code>CreateHealthCheck</code> request with a unique
     * <code>CallerReference</code> but settings identical to an existing health
     * check, Route 53 creates the health check.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String callerReference;

    /**
     * <p>
     * A complex type that contains settings for a new health check.
     * </p>
     */
    private HealthCheckConfig healthCheckConfig;

    /**
     * <p>
     * A unique string that identifies the request and that allows you to retry
     * a failed <code>CreateHealthCheck</code> request without the risk of
     * creating two identical health checks:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you send a <code>CreateHealthCheck</code> request with the same
     * <code>CallerReference</code> and settings as a previous request, and if
     * the health check doesn't exist, Amazon Route 53 creates the health check.
     * If the health check does exist, Route 53 returns the settings for the
     * existing health check.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send a <code>CreateHealthCheck</code> request with the same
     * <code>CallerReference</code> as a deleted health check, regardless of the
     * settings, Route 53 returns a <code>HealthCheckAlreadyExists</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send a <code>CreateHealthCheck</code> request with the same
     * <code>CallerReference</code> as an existing health check but with
     * different settings, Route 53 returns a
     * <code>HealthCheckAlreadyExists</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send a <code>CreateHealthCheck</code> request with a unique
     * <code>CallerReference</code> but settings identical to an existing health
     * check, Route 53 creates the health check.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         A unique string that identifies the request and that allows you
     *         to retry a failed <code>CreateHealthCheck</code> request without
     *         the risk of creating two identical health checks:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you send a <code>CreateHealthCheck</code> request with the
     *         same <code>CallerReference</code> and settings as a previous
     *         request, and if the health check doesn't exist, Amazon Route 53
     *         creates the health check. If the health check does exist, Route
     *         53 returns the settings for the existing health check.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you send a <code>CreateHealthCheck</code> request with the
     *         same <code>CallerReference</code> as a deleted health check,
     *         regardless of the settings, Route 53 returns a
     *         <code>HealthCheckAlreadyExists</code> error.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you send a <code>CreateHealthCheck</code> request with the
     *         same <code>CallerReference</code> as an existing health check but
     *         with different settings, Route 53 returns a
     *         <code>HealthCheckAlreadyExists</code> error.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you send a <code>CreateHealthCheck</code> request with a
     *         unique <code>CallerReference</code> but settings identical to an
     *         existing health check, Route 53 creates the health check.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getCallerReference() {
        return callerReference;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows you to retry
     * a failed <code>CreateHealthCheck</code> request without the risk of
     * creating two identical health checks:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you send a <code>CreateHealthCheck</code> request with the same
     * <code>CallerReference</code> and settings as a previous request, and if
     * the health check doesn't exist, Amazon Route 53 creates the health check.
     * If the health check does exist, Route 53 returns the settings for the
     * existing health check.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send a <code>CreateHealthCheck</code> request with the same
     * <code>CallerReference</code> as a deleted health check, regardless of the
     * settings, Route 53 returns a <code>HealthCheckAlreadyExists</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send a <code>CreateHealthCheck</code> request with the same
     * <code>CallerReference</code> as an existing health check but with
     * different settings, Route 53 returns a
     * <code>HealthCheckAlreadyExists</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send a <code>CreateHealthCheck</code> request with a unique
     * <code>CallerReference</code> but settings identical to an existing health
     * check, Route 53 creates the health check.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param callerReference <p>
     *            A unique string that identifies the request and that allows
     *            you to retry a failed <code>CreateHealthCheck</code> request
     *            without the risk of creating two identical health checks:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If you send a <code>CreateHealthCheck</code> request with the
     *            same <code>CallerReference</code> and settings as a previous
     *            request, and if the health check doesn't exist, Amazon Route
     *            53 creates the health check. If the health check does exist,
     *            Route 53 returns the settings for the existing health check.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you send a <code>CreateHealthCheck</code> request with the
     *            same <code>CallerReference</code> as a deleted health check,
     *            regardless of the settings, Route 53 returns a
     *            <code>HealthCheckAlreadyExists</code> error.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you send a <code>CreateHealthCheck</code> request with the
     *            same <code>CallerReference</code> as an existing health check
     *            but with different settings, Route 53 returns a
     *            <code>HealthCheckAlreadyExists</code> error.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you send a <code>CreateHealthCheck</code> request with a
     *            unique <code>CallerReference</code> but settings identical to
     *            an existing health check, Route 53 creates the health check.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows you to retry
     * a failed <code>CreateHealthCheck</code> request without the risk of
     * creating two identical health checks:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you send a <code>CreateHealthCheck</code> request with the same
     * <code>CallerReference</code> and settings as a previous request, and if
     * the health check doesn't exist, Amazon Route 53 creates the health check.
     * If the health check does exist, Route 53 returns the settings for the
     * existing health check.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send a <code>CreateHealthCheck</code> request with the same
     * <code>CallerReference</code> as a deleted health check, regardless of the
     * settings, Route 53 returns a <code>HealthCheckAlreadyExists</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send a <code>CreateHealthCheck</code> request with the same
     * <code>CallerReference</code> as an existing health check but with
     * different settings, Route 53 returns a
     * <code>HealthCheckAlreadyExists</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send a <code>CreateHealthCheck</code> request with a unique
     * <code>CallerReference</code> but settings identical to an existing health
     * check, Route 53 creates the health check.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param callerReference <p>
     *            A unique string that identifies the request and that allows
     *            you to retry a failed <code>CreateHealthCheck</code> request
     *            without the risk of creating two identical health checks:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If you send a <code>CreateHealthCheck</code> request with the
     *            same <code>CallerReference</code> and settings as a previous
     *            request, and if the health check doesn't exist, Amazon Route
     *            53 creates the health check. If the health check does exist,
     *            Route 53 returns the settings for the existing health check.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you send a <code>CreateHealthCheck</code> request with the
     *            same <code>CallerReference</code> as a deleted health check,
     *            regardless of the settings, Route 53 returns a
     *            <code>HealthCheckAlreadyExists</code> error.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you send a <code>CreateHealthCheck</code> request with the
     *            same <code>CallerReference</code> as an existing health check
     *            but with different settings, Route 53 returns a
     *            <code>HealthCheckAlreadyExists</code> error.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you send a <code>CreateHealthCheck</code> request with a
     *            unique <code>CallerReference</code> but settings identical to
     *            an existing health check, Route 53 creates the health check.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateHealthCheckRequest withCallerReference(String callerReference) {
        this.callerReference = callerReference;
        return this;
    }

    /**
     * <p>
     * A complex type that contains settings for a new health check.
     * </p>
     *
     * @return <p>
     *         A complex type that contains settings for a new health check.
     *         </p>
     */
    public HealthCheckConfig getHealthCheckConfig() {
        return healthCheckConfig;
    }

    /**
     * <p>
     * A complex type that contains settings for a new health check.
     * </p>
     *
     * @param healthCheckConfig <p>
     *            A complex type that contains settings for a new health check.
     *            </p>
     */
    public void setHealthCheckConfig(HealthCheckConfig healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
    }

    /**
     * <p>
     * A complex type that contains settings for a new health check.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param healthCheckConfig <p>
     *            A complex type that contains settings for a new health check.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateHealthCheckRequest withHealthCheckConfig(HealthCheckConfig healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
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
        if (getCallerReference() != null)
            sb.append("CallerReference: " + getCallerReference() + ",");
        if (getHealthCheckConfig() != null)
            sb.append("HealthCheckConfig: " + getHealthCheckConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCallerReference() == null) ? 0 : getCallerReference().hashCode());
        hashCode = prime * hashCode
                + ((getHealthCheckConfig() == null) ? 0 : getHealthCheckConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateHealthCheckRequest == false)
            return false;
        CreateHealthCheckRequest other = (CreateHealthCheckRequest) obj;

        if (other.getCallerReference() == null ^ this.getCallerReference() == null)
            return false;
        if (other.getCallerReference() != null
                && other.getCallerReference().equals(this.getCallerReference()) == false)
            return false;
        if (other.getHealthCheckConfig() == null ^ this.getHealthCheckConfig() == null)
            return false;
        if (other.getHealthCheckConfig() != null
                && other.getHealthCheckConfig().equals(this.getHealthCheckConfig()) == false)
            return false;
        return true;
    }
}
