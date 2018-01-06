/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;

/**
 * <p>
 * The attributes for a load balancer.
 * </p>
 */
public class LoadBalancerAttributes implements Serializable {
    /**
     * <p>
     * If enabled, the load balancer routes the request traffic evenly across
     * all back-end instances regardless of the Availability Zones.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/enable-disable-crosszone-lb.html"
     * >Enable Cross-Zone Load Balancing</a> in the <i>Elastic Load Balancing
     * Developer Guide</i>.
     * </p>
     */
    private CrossZoneLoadBalancing crossZoneLoadBalancing;

    /**
     * <p>
     * If enabled, the load balancer captures detailed information of all
     * requests and delivers the information to the Amazon S3 bucket that you
     * specify.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/enable-access-logs.html"
     * >Enable Access Logs</a> in the <i>Elastic Load Balancing Developer
     * Guide</i>.
     * </p>
     */
    private AccessLog accessLog;

    /**
     * <p>
     * If enabled, the load balancer allows existing requests to complete before
     * the load balancer shifts traffic away from a deregistered or unhealthy
     * back-end instance.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/config-conn-drain.html"
     * >Enable Connection Draining</a> in the <i>Elastic Load Balancing
     * Developer Guide</i>.
     * </p>
     */
    private ConnectionDraining connectionDraining;

    /**
     * <p>
     * If enabled, the load balancer allows the connections to remain idle (no
     * data is sent over the connection) for the specified duration.
     * </p>
     * <p>
     * By default, Elastic Load Balancing maintains a 60-second idle connection
     * timeout for both front-end and back-end connections of your load
     * balancer. For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/config-idle-timeout.html"
     * >Configure Idle Connection Timeout</a> in the <i>Elastic Load Balancing
     * Developer Guide</i>.
     * </p>
     */
    private ConnectionSettings connectionSettings;

    /**
     * <p>
     * This parameter is reserved.
     * </p>
     */
    private java.util.List<AdditionalAttribute> additionalAttributes = new java.util.ArrayList<AdditionalAttribute>();

    /**
     * <p>
     * If enabled, the load balancer routes the request traffic evenly across
     * all back-end instances regardless of the Availability Zones.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/enable-disable-crosszone-lb.html"
     * >Enable Cross-Zone Load Balancing</a> in the <i>Elastic Load Balancing
     * Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         If enabled, the load balancer routes the request traffic evenly
     *         across all back-end instances regardless of the Availability
     *         Zones.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/enable-disable-crosszone-lb.html"
     *         >Enable Cross-Zone Load Balancing</a> in the <i>Elastic Load
     *         Balancing Developer Guide</i>.
     *         </p>
     */
    public CrossZoneLoadBalancing getCrossZoneLoadBalancing() {
        return crossZoneLoadBalancing;
    }

    /**
     * <p>
     * If enabled, the load balancer routes the request traffic evenly across
     * all back-end instances regardless of the Availability Zones.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/enable-disable-crosszone-lb.html"
     * >Enable Cross-Zone Load Balancing</a> in the <i>Elastic Load Balancing
     * Developer Guide</i>.
     * </p>
     *
     * @param crossZoneLoadBalancing <p>
     *            If enabled, the load balancer routes the request traffic
     *            evenly across all back-end instances regardless of the
     *            Availability Zones.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/enable-disable-crosszone-lb.html"
     *            >Enable Cross-Zone Load Balancing</a> in the <i>Elastic Load
     *            Balancing Developer Guide</i>.
     *            </p>
     */
    public void setCrossZoneLoadBalancing(CrossZoneLoadBalancing crossZoneLoadBalancing) {
        this.crossZoneLoadBalancing = crossZoneLoadBalancing;
    }

    /**
     * <p>
     * If enabled, the load balancer routes the request traffic evenly across
     * all back-end instances regardless of the Availability Zones.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/enable-disable-crosszone-lb.html"
     * >Enable Cross-Zone Load Balancing</a> in the <i>Elastic Load Balancing
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param crossZoneLoadBalancing <p>
     *            If enabled, the load balancer routes the request traffic
     *            evenly across all back-end instances regardless of the
     *            Availability Zones.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/enable-disable-crosszone-lb.html"
     *            >Enable Cross-Zone Load Balancing</a> in the <i>Elastic Load
     *            Balancing Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerAttributes withCrossZoneLoadBalancing(
            CrossZoneLoadBalancing crossZoneLoadBalancing) {
        this.crossZoneLoadBalancing = crossZoneLoadBalancing;
        return this;
    }

    /**
     * <p>
     * If enabled, the load balancer captures detailed information of all
     * requests and delivers the information to the Amazon S3 bucket that you
     * specify.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/enable-access-logs.html"
     * >Enable Access Logs</a> in the <i>Elastic Load Balancing Developer
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         If enabled, the load balancer captures detailed information of
     *         all requests and delivers the information to the Amazon S3 bucket
     *         that you specify.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/enable-access-logs.html"
     *         >Enable Access Logs</a> in the <i>Elastic Load Balancing
     *         Developer Guide</i>.
     *         </p>
     */
    public AccessLog getAccessLog() {
        return accessLog;
    }

    /**
     * <p>
     * If enabled, the load balancer captures detailed information of all
     * requests and delivers the information to the Amazon S3 bucket that you
     * specify.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/enable-access-logs.html"
     * >Enable Access Logs</a> in the <i>Elastic Load Balancing Developer
     * Guide</i>.
     * </p>
     *
     * @param accessLog <p>
     *            If enabled, the load balancer captures detailed information of
     *            all requests and delivers the information to the Amazon S3
     *            bucket that you specify.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/enable-access-logs.html"
     *            >Enable Access Logs</a> in the <i>Elastic Load Balancing
     *            Developer Guide</i>.
     *            </p>
     */
    public void setAccessLog(AccessLog accessLog) {
        this.accessLog = accessLog;
    }

    /**
     * <p>
     * If enabled, the load balancer captures detailed information of all
     * requests and delivers the information to the Amazon S3 bucket that you
     * specify.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/enable-access-logs.html"
     * >Enable Access Logs</a> in the <i>Elastic Load Balancing Developer
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accessLog <p>
     *            If enabled, the load balancer captures detailed information of
     *            all requests and delivers the information to the Amazon S3
     *            bucket that you specify.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/enable-access-logs.html"
     *            >Enable Access Logs</a> in the <i>Elastic Load Balancing
     *            Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerAttributes withAccessLog(AccessLog accessLog) {
        this.accessLog = accessLog;
        return this;
    }

    /**
     * <p>
     * If enabled, the load balancer allows existing requests to complete before
     * the load balancer shifts traffic away from a deregistered or unhealthy
     * back-end instance.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/config-conn-drain.html"
     * >Enable Connection Draining</a> in the <i>Elastic Load Balancing
     * Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         If enabled, the load balancer allows existing requests to
     *         complete before the load balancer shifts traffic away from a
     *         deregistered or unhealthy back-end instance.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/config-conn-drain.html"
     *         >Enable Connection Draining</a> in the <i>Elastic Load Balancing
     *         Developer Guide</i>.
     *         </p>
     */
    public ConnectionDraining getConnectionDraining() {
        return connectionDraining;
    }

    /**
     * <p>
     * If enabled, the load balancer allows existing requests to complete before
     * the load balancer shifts traffic away from a deregistered or unhealthy
     * back-end instance.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/config-conn-drain.html"
     * >Enable Connection Draining</a> in the <i>Elastic Load Balancing
     * Developer Guide</i>.
     * </p>
     *
     * @param connectionDraining <p>
     *            If enabled, the load balancer allows existing requests to
     *            complete before the load balancer shifts traffic away from a
     *            deregistered or unhealthy back-end instance.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/config-conn-drain.html"
     *            >Enable Connection Draining</a> in the <i>Elastic Load
     *            Balancing Developer Guide</i>.
     *            </p>
     */
    public void setConnectionDraining(ConnectionDraining connectionDraining) {
        this.connectionDraining = connectionDraining;
    }

    /**
     * <p>
     * If enabled, the load balancer allows existing requests to complete before
     * the load balancer shifts traffic away from a deregistered or unhealthy
     * back-end instance.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/config-conn-drain.html"
     * >Enable Connection Draining</a> in the <i>Elastic Load Balancing
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionDraining <p>
     *            If enabled, the load balancer allows existing requests to
     *            complete before the load balancer shifts traffic away from a
     *            deregistered or unhealthy back-end instance.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/config-conn-drain.html"
     *            >Enable Connection Draining</a> in the <i>Elastic Load
     *            Balancing Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerAttributes withConnectionDraining(ConnectionDraining connectionDraining) {
        this.connectionDraining = connectionDraining;
        return this;
    }

    /**
     * <p>
     * If enabled, the load balancer allows the connections to remain idle (no
     * data is sent over the connection) for the specified duration.
     * </p>
     * <p>
     * By default, Elastic Load Balancing maintains a 60-second idle connection
     * timeout for both front-end and back-end connections of your load
     * balancer. For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/config-idle-timeout.html"
     * >Configure Idle Connection Timeout</a> in the <i>Elastic Load Balancing
     * Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         If enabled, the load balancer allows the connections to remain
     *         idle (no data is sent over the connection) for the specified
     *         duration.
     *         </p>
     *         <p>
     *         By default, Elastic Load Balancing maintains a 60-second idle
     *         connection timeout for both front-end and back-end connections of
     *         your load balancer. For more information, see <a href=
     *         "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/config-idle-timeout.html"
     *         >Configure Idle Connection Timeout</a> in the <i>Elastic Load
     *         Balancing Developer Guide</i>.
     *         </p>
     */
    public ConnectionSettings getConnectionSettings() {
        return connectionSettings;
    }

    /**
     * <p>
     * If enabled, the load balancer allows the connections to remain idle (no
     * data is sent over the connection) for the specified duration.
     * </p>
     * <p>
     * By default, Elastic Load Balancing maintains a 60-second idle connection
     * timeout for both front-end and back-end connections of your load
     * balancer. For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/config-idle-timeout.html"
     * >Configure Idle Connection Timeout</a> in the <i>Elastic Load Balancing
     * Developer Guide</i>.
     * </p>
     *
     * @param connectionSettings <p>
     *            If enabled, the load balancer allows the connections to remain
     *            idle (no data is sent over the connection) for the specified
     *            duration.
     *            </p>
     *            <p>
     *            By default, Elastic Load Balancing maintains a 60-second idle
     *            connection timeout for both front-end and back-end connections
     *            of your load balancer. For more information, see <a href=
     *            "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/config-idle-timeout.html"
     *            >Configure Idle Connection Timeout</a> in the <i>Elastic Load
     *            Balancing Developer Guide</i>.
     *            </p>
     */
    public void setConnectionSettings(ConnectionSettings connectionSettings) {
        this.connectionSettings = connectionSettings;
    }

    /**
     * <p>
     * If enabled, the load balancer allows the connections to remain idle (no
     * data is sent over the connection) for the specified duration.
     * </p>
     * <p>
     * By default, Elastic Load Balancing maintains a 60-second idle connection
     * timeout for both front-end and back-end connections of your load
     * balancer. For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/config-idle-timeout.html"
     * >Configure Idle Connection Timeout</a> in the <i>Elastic Load Balancing
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionSettings <p>
     *            If enabled, the load balancer allows the connections to remain
     *            idle (no data is sent over the connection) for the specified
     *            duration.
     *            </p>
     *            <p>
     *            By default, Elastic Load Balancing maintains a 60-second idle
     *            connection timeout for both front-end and back-end connections
     *            of your load balancer. For more information, see <a href=
     *            "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/config-idle-timeout.html"
     *            >Configure Idle Connection Timeout</a> in the <i>Elastic Load
     *            Balancing Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerAttributes withConnectionSettings(ConnectionSettings connectionSettings) {
        this.connectionSettings = connectionSettings;
        return this;
    }

    /**
     * <p>
     * This parameter is reserved.
     * </p>
     *
     * @return <p>
     *         This parameter is reserved.
     *         </p>
     */
    public java.util.List<AdditionalAttribute> getAdditionalAttributes() {
        return additionalAttributes;
    }

    /**
     * <p>
     * This parameter is reserved.
     * </p>
     *
     * @param additionalAttributes <p>
     *            This parameter is reserved.
     *            </p>
     */
    public void setAdditionalAttributes(
            java.util.Collection<AdditionalAttribute> additionalAttributes) {
        if (additionalAttributes == null) {
            this.additionalAttributes = null;
            return;
        }

        this.additionalAttributes = new java.util.ArrayList<AdditionalAttribute>(
                additionalAttributes);
    }

    /**
     * <p>
     * This parameter is reserved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param additionalAttributes <p>
     *            This parameter is reserved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerAttributes withAdditionalAttributes(
            AdditionalAttribute... additionalAttributes) {
        if (getAdditionalAttributes() == null) {
            this.additionalAttributes = new java.util.ArrayList<AdditionalAttribute>(
                    additionalAttributes.length);
        }
        for (AdditionalAttribute value : additionalAttributes) {
            this.additionalAttributes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * This parameter is reserved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param additionalAttributes <p>
     *            This parameter is reserved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerAttributes withAdditionalAttributes(
            java.util.Collection<AdditionalAttribute> additionalAttributes) {
        setAdditionalAttributes(additionalAttributes);
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
        if (getCrossZoneLoadBalancing() != null)
            sb.append("CrossZoneLoadBalancing: " + getCrossZoneLoadBalancing() + ",");
        if (getAccessLog() != null)
            sb.append("AccessLog: " + getAccessLog() + ",");
        if (getConnectionDraining() != null)
            sb.append("ConnectionDraining: " + getConnectionDraining() + ",");
        if (getConnectionSettings() != null)
            sb.append("ConnectionSettings: " + getConnectionSettings() + ",");
        if (getAdditionalAttributes() != null)
            sb.append("AdditionalAttributes: " + getAdditionalAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCrossZoneLoadBalancing() == null) ? 0 : getCrossZoneLoadBalancing()
                        .hashCode());
        hashCode = prime * hashCode + ((getAccessLog() == null) ? 0 : getAccessLog().hashCode());
        hashCode = prime * hashCode
                + ((getConnectionDraining() == null) ? 0 : getConnectionDraining().hashCode());
        hashCode = prime * hashCode
                + ((getConnectionSettings() == null) ? 0 : getConnectionSettings().hashCode());
        hashCode = prime * hashCode
                + ((getAdditionalAttributes() == null) ? 0 : getAdditionalAttributes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoadBalancerAttributes == false)
            return false;
        LoadBalancerAttributes other = (LoadBalancerAttributes) obj;

        if (other.getCrossZoneLoadBalancing() == null ^ this.getCrossZoneLoadBalancing() == null)
            return false;
        if (other.getCrossZoneLoadBalancing() != null
                && other.getCrossZoneLoadBalancing().equals(this.getCrossZoneLoadBalancing()) == false)
            return false;
        if (other.getAccessLog() == null ^ this.getAccessLog() == null)
            return false;
        if (other.getAccessLog() != null
                && other.getAccessLog().equals(this.getAccessLog()) == false)
            return false;
        if (other.getConnectionDraining() == null ^ this.getConnectionDraining() == null)
            return false;
        if (other.getConnectionDraining() != null
                && other.getConnectionDraining().equals(this.getConnectionDraining()) == false)
            return false;
        if (other.getConnectionSettings() == null ^ this.getConnectionSettings() == null)
            return false;
        if (other.getConnectionSettings() != null
                && other.getConnectionSettings().equals(this.getConnectionSettings()) == false)
            return false;
        if (other.getAdditionalAttributes() == null ^ this.getAdditionalAttributes() == null)
            return false;
        if (other.getAdditionalAttributes() != null
                && other.getAdditionalAttributes().equals(this.getAdditionalAttributes()) == false)
            return false;
        return true;
    }
}
