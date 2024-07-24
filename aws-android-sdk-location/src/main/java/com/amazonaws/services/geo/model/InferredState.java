/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model;

import java.io.Serializable;

/**
 * <p>
 * The inferred state of the device, given the provided position, IP address,
 * cellular signals, and Wi-Fi- access points.
 * </p>
 */
public class InferredState implements Serializable {
    /**
     * <p>
     * The device position inferred by the provided position, IP address,
     * cellular signals, and Wi-Fi- access points.
     * </p>
     */
    private java.util.List<Double> position;

    /**
     * <p>
     * The level of certainty of the inferred position.
     * </p>
     */
    private PositionalAccuracy accuracy;

    /**
     * <p>
     * The distance between the inferred position and the device's self-reported
     * position.
     * </p>
     */
    private Double deviationDistance;

    /**
     * <p>
     * Indicates if a proxy was used.
     * </p>
     */
    private Boolean proxyDetected;

    /**
     * <p>
     * The device position inferred by the provided position, IP address,
     * cellular signals, and Wi-Fi- access points.
     * </p>
     *
     * @return <p>
     *         The device position inferred by the provided position, IP
     *         address, cellular signals, and Wi-Fi- access points.
     *         </p>
     */
    public java.util.List<Double> getPosition() {
        return position;
    }

    /**
     * <p>
     * The device position inferred by the provided position, IP address,
     * cellular signals, and Wi-Fi- access points.
     * </p>
     *
     * @param position <p>
     *            The device position inferred by the provided position, IP
     *            address, cellular signals, and Wi-Fi- access points.
     *            </p>
     */
    public void setPosition(java.util.Collection<Double> position) {
        if (position == null) {
            this.position = null;
            return;
        }

        this.position = new java.util.ArrayList<Double>(position);
    }

    /**
     * <p>
     * The device position inferred by the provided position, IP address,
     * cellular signals, and Wi-Fi- access points.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param position <p>
     *            The device position inferred by the provided position, IP
     *            address, cellular signals, and Wi-Fi- access points.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InferredState withPosition(Double... position) {
        if (getPosition() == null) {
            this.position = new java.util.ArrayList<Double>(position.length);
        }
        for (Double value : position) {
            this.position.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The device position inferred by the provided position, IP address,
     * cellular signals, and Wi-Fi- access points.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param position <p>
     *            The device position inferred by the provided position, IP
     *            address, cellular signals, and Wi-Fi- access points.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InferredState withPosition(java.util.Collection<Double> position) {
        setPosition(position);
        return this;
    }

    /**
     * <p>
     * The level of certainty of the inferred position.
     * </p>
     *
     * @return <p>
     *         The level of certainty of the inferred position.
     *         </p>
     */
    public PositionalAccuracy getAccuracy() {
        return accuracy;
    }

    /**
     * <p>
     * The level of certainty of the inferred position.
     * </p>
     *
     * @param accuracy <p>
     *            The level of certainty of the inferred position.
     *            </p>
     */
    public void setAccuracy(PositionalAccuracy accuracy) {
        this.accuracy = accuracy;
    }

    /**
     * <p>
     * The level of certainty of the inferred position.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accuracy <p>
     *            The level of certainty of the inferred position.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InferredState withAccuracy(PositionalAccuracy accuracy) {
        this.accuracy = accuracy;
        return this;
    }

    /**
     * <p>
     * The distance between the inferred position and the device's self-reported
     * position.
     * </p>
     *
     * @return <p>
     *         The distance between the inferred position and the device's
     *         self-reported position.
     *         </p>
     */
    public Double getDeviationDistance() {
        return deviationDistance;
    }

    /**
     * <p>
     * The distance between the inferred position and the device's self-reported
     * position.
     * </p>
     *
     * @param deviationDistance <p>
     *            The distance between the inferred position and the device's
     *            self-reported position.
     *            </p>
     */
    public void setDeviationDistance(Double deviationDistance) {
        this.deviationDistance = deviationDistance;
    }

    /**
     * <p>
     * The distance between the inferred position and the device's self-reported
     * position.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviationDistance <p>
     *            The distance between the inferred position and the device's
     *            self-reported position.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InferredState withDeviationDistance(Double deviationDistance) {
        this.deviationDistance = deviationDistance;
        return this;
    }

    /**
     * <p>
     * Indicates if a proxy was used.
     * </p>
     *
     * @return <p>
     *         Indicates if a proxy was used.
     *         </p>
     */
    public Boolean isProxyDetected() {
        return proxyDetected;
    }

    /**
     * <p>
     * Indicates if a proxy was used.
     * </p>
     *
     * @return <p>
     *         Indicates if a proxy was used.
     *         </p>
     */
    public Boolean getProxyDetected() {
        return proxyDetected;
    }

    /**
     * <p>
     * Indicates if a proxy was used.
     * </p>
     *
     * @param proxyDetected <p>
     *            Indicates if a proxy was used.
     *            </p>
     */
    public void setProxyDetected(Boolean proxyDetected) {
        this.proxyDetected = proxyDetected;
    }

    /**
     * <p>
     * Indicates if a proxy was used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param proxyDetected <p>
     *            Indicates if a proxy was used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InferredState withProxyDetected(Boolean proxyDetected) {
        this.proxyDetected = proxyDetected;
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
        if (getPosition() != null)
            sb.append("Position: " + getPosition() + ",");
        if (getAccuracy() != null)
            sb.append("Accuracy: " + getAccuracy() + ",");
        if (getDeviationDistance() != null)
            sb.append("DeviationDistance: " + getDeviationDistance() + ",");
        if (getProxyDetected() != null)
            sb.append("ProxyDetected: " + getProxyDetected());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode + ((getAccuracy() == null) ? 0 : getAccuracy().hashCode());
        hashCode = prime * hashCode
                + ((getDeviationDistance() == null) ? 0 : getDeviationDistance().hashCode());
        hashCode = prime * hashCode
                + ((getProxyDetected() == null) ? 0 : getProxyDetected().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InferredState == false)
            return false;
        InferredState other = (InferredState) obj;

        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        if (other.getAccuracy() == null ^ this.getAccuracy() == null)
            return false;
        if (other.getAccuracy() != null && other.getAccuracy().equals(this.getAccuracy()) == false)
            return false;
        if (other.getDeviationDistance() == null ^ this.getDeviationDistance() == null)
            return false;
        if (other.getDeviationDistance() != null
                && other.getDeviationDistance().equals(this.getDeviationDistance()) == false)
            return false;
        if (other.getProxyDetected() == null ^ this.getProxyDetected() == null)
            return false;
        if (other.getProxyDetected() != null
                && other.getProxyDetected().equals(this.getProxyDetected()) == false)
            return false;
        return true;
    }
}
