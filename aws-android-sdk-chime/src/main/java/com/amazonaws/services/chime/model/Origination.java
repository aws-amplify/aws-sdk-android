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

package com.amazonaws.services.chime.model;

import java.io.Serializable;

/**
 * <p>
 * Origination settings enable your SIP hosts to receive inbound calls using
 * your Amazon Chime Voice Connector.
 * </p>
 */
public class Origination implements Serializable {
    /**
     * <p>
     * The call distribution properties defined for your SIP hosts. Valid range:
     * Minimum value of 1. Maximum value of 20.
     * </p>
     */
    private java.util.List<OriginationRoute> routes;

    /**
     * <p>
     * When origination settings are disabled, inbound calls are not enabled for
     * your Amazon Chime Voice Connector.
     * </p>
     */
    private Boolean disabled;

    /**
     * <p>
     * The call distribution properties defined for your SIP hosts. Valid range:
     * Minimum value of 1. Maximum value of 20.
     * </p>
     *
     * @return <p>
     *         The call distribution properties defined for your SIP hosts.
     *         Valid range: Minimum value of 1. Maximum value of 20.
     *         </p>
     */
    public java.util.List<OriginationRoute> getRoutes() {
        return routes;
    }

    /**
     * <p>
     * The call distribution properties defined for your SIP hosts. Valid range:
     * Minimum value of 1. Maximum value of 20.
     * </p>
     *
     * @param routes <p>
     *            The call distribution properties defined for your SIP hosts.
     *            Valid range: Minimum value of 1. Maximum value of 20.
     *            </p>
     */
    public void setRoutes(java.util.Collection<OriginationRoute> routes) {
        if (routes == null) {
            this.routes = null;
            return;
        }

        this.routes = new java.util.ArrayList<OriginationRoute>(routes);
    }

    /**
     * <p>
     * The call distribution properties defined for your SIP hosts. Valid range:
     * Minimum value of 1. Maximum value of 20.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routes <p>
     *            The call distribution properties defined for your SIP hosts.
     *            Valid range: Minimum value of 1. Maximum value of 20.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Origination withRoutes(OriginationRoute... routes) {
        if (getRoutes() == null) {
            this.routes = new java.util.ArrayList<OriginationRoute>(routes.length);
        }
        for (OriginationRoute value : routes) {
            this.routes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The call distribution properties defined for your SIP hosts. Valid range:
     * Minimum value of 1. Maximum value of 20.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routes <p>
     *            The call distribution properties defined for your SIP hosts.
     *            Valid range: Minimum value of 1. Maximum value of 20.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Origination withRoutes(java.util.Collection<OriginationRoute> routes) {
        setRoutes(routes);
        return this;
    }

    /**
     * <p>
     * When origination settings are disabled, inbound calls are not enabled for
     * your Amazon Chime Voice Connector.
     * </p>
     *
     * @return <p>
     *         When origination settings are disabled, inbound calls are not
     *         enabled for your Amazon Chime Voice Connector.
     *         </p>
     */
    public Boolean isDisabled() {
        return disabled;
    }

    /**
     * <p>
     * When origination settings are disabled, inbound calls are not enabled for
     * your Amazon Chime Voice Connector.
     * </p>
     *
     * @return <p>
     *         When origination settings are disabled, inbound calls are not
     *         enabled for your Amazon Chime Voice Connector.
     *         </p>
     */
    public Boolean getDisabled() {
        return disabled;
    }

    /**
     * <p>
     * When origination settings are disabled, inbound calls are not enabled for
     * your Amazon Chime Voice Connector.
     * </p>
     *
     * @param disabled <p>
     *            When origination settings are disabled, inbound calls are not
     *            enabled for your Amazon Chime Voice Connector.
     *            </p>
     */
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * <p>
     * When origination settings are disabled, inbound calls are not enabled for
     * your Amazon Chime Voice Connector.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disabled <p>
     *            When origination settings are disabled, inbound calls are not
     *            enabled for your Amazon Chime Voice Connector.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Origination withDisabled(Boolean disabled) {
        this.disabled = disabled;
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
        if (getRoutes() != null)
            sb.append("Routes: " + getRoutes() + ",");
        if (getDisabled() != null)
            sb.append("Disabled: " + getDisabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoutes() == null) ? 0 : getRoutes().hashCode());
        hashCode = prime * hashCode + ((getDisabled() == null) ? 0 : getDisabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Origination == false)
            return false;
        Origination other = (Origination) obj;

        if (other.getRoutes() == null ^ this.getRoutes() == null)
            return false;
        if (other.getRoutes() != null && other.getRoutes().equals(this.getRoutes()) == false)
            return false;
        if (other.getDisabled() == null ^ this.getDisabled() == null)
            return false;
        if (other.getDisabled() != null && other.getDisabled().equals(this.getDisabled()) == false)
            return false;
        return true;
    }
}
