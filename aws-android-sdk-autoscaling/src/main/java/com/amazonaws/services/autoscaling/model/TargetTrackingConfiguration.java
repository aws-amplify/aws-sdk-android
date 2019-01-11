/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

/**
 * <p>
 * Represents a target tracking policy configuration.
 * </p>
 */
public class TargetTrackingConfiguration implements Serializable {
    /**
     * <p>
     * A predefined metric. You can specify either a predefined metric or a
     * customized metric.
     * </p>
     */
    private PredefinedMetricSpecification predefinedMetricSpecification;

    /**
     * <p>
     * A customized metric.
     * </p>
     */
    private CustomizedMetricSpecification customizedMetricSpecification;

    /**
     * <p>
     * The target value for the metric.
     * </p>
     */
    private Double targetValue;

    /**
     * <p>
     * Indicates whether scaling in by the target tracking policy is disabled.
     * If scaling in is disabled, the target tracking policy doesn't remove
     * instances from the Auto Scaling group. Otherwise, the target tracking
     * policy can remove instances from the Auto Scaling group. The default is
     * disabled.
     * </p>
     */
    private Boolean disableScaleIn;

    /**
     * <p>
     * A predefined metric. You can specify either a predefined metric or a
     * customized metric.
     * </p>
     *
     * @return <p>
     *         A predefined metric. You can specify either a predefined metric
     *         or a customized metric.
     *         </p>
     */
    public PredefinedMetricSpecification getPredefinedMetricSpecification() {
        return predefinedMetricSpecification;
    }

    /**
     * <p>
     * A predefined metric. You can specify either a predefined metric or a
     * customized metric.
     * </p>
     *
     * @param predefinedMetricSpecification <p>
     *            A predefined metric. You can specify either a predefined
     *            metric or a customized metric.
     *            </p>
     */
    public void setPredefinedMetricSpecification(
            PredefinedMetricSpecification predefinedMetricSpecification) {
        this.predefinedMetricSpecification = predefinedMetricSpecification;
    }

    /**
     * <p>
     * A predefined metric. You can specify either a predefined metric or a
     * customized metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param predefinedMetricSpecification <p>
     *            A predefined metric. You can specify either a predefined
     *            metric or a customized metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetTrackingConfiguration withPredefinedMetricSpecification(
            PredefinedMetricSpecification predefinedMetricSpecification) {
        this.predefinedMetricSpecification = predefinedMetricSpecification;
        return this;
    }

    /**
     * <p>
     * A customized metric.
     * </p>
     *
     * @return <p>
     *         A customized metric.
     *         </p>
     */
    public CustomizedMetricSpecification getCustomizedMetricSpecification() {
        return customizedMetricSpecification;
    }

    /**
     * <p>
     * A customized metric.
     * </p>
     *
     * @param customizedMetricSpecification <p>
     *            A customized metric.
     *            </p>
     */
    public void setCustomizedMetricSpecification(
            CustomizedMetricSpecification customizedMetricSpecification) {
        this.customizedMetricSpecification = customizedMetricSpecification;
    }

    /**
     * <p>
     * A customized metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customizedMetricSpecification <p>
     *            A customized metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetTrackingConfiguration withCustomizedMetricSpecification(
            CustomizedMetricSpecification customizedMetricSpecification) {
        this.customizedMetricSpecification = customizedMetricSpecification;
        return this;
    }

    /**
     * <p>
     * The target value for the metric.
     * </p>
     *
     * @return <p>
     *         The target value for the metric.
     *         </p>
     */
    public Double getTargetValue() {
        return targetValue;
    }

    /**
     * <p>
     * The target value for the metric.
     * </p>
     *
     * @param targetValue <p>
     *            The target value for the metric.
     *            </p>
     */
    public void setTargetValue(Double targetValue) {
        this.targetValue = targetValue;
    }

    /**
     * <p>
     * The target value for the metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetValue <p>
     *            The target value for the metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetTrackingConfiguration withTargetValue(Double targetValue) {
        this.targetValue = targetValue;
        return this;
    }

    /**
     * <p>
     * Indicates whether scaling in by the target tracking policy is disabled.
     * If scaling in is disabled, the target tracking policy doesn't remove
     * instances from the Auto Scaling group. Otherwise, the target tracking
     * policy can remove instances from the Auto Scaling group. The default is
     * disabled.
     * </p>
     *
     * @return <p>
     *         Indicates whether scaling in by the target tracking policy is
     *         disabled. If scaling in is disabled, the target tracking policy
     *         doesn't remove instances from the Auto Scaling group. Otherwise,
     *         the target tracking policy can remove instances from the Auto
     *         Scaling group. The default is disabled.
     *         </p>
     */
    public Boolean isDisableScaleIn() {
        return disableScaleIn;
    }

    /**
     * <p>
     * Indicates whether scaling in by the target tracking policy is disabled.
     * If scaling in is disabled, the target tracking policy doesn't remove
     * instances from the Auto Scaling group. Otherwise, the target tracking
     * policy can remove instances from the Auto Scaling group. The default is
     * disabled.
     * </p>
     *
     * @return <p>
     *         Indicates whether scaling in by the target tracking policy is
     *         disabled. If scaling in is disabled, the target tracking policy
     *         doesn't remove instances from the Auto Scaling group. Otherwise,
     *         the target tracking policy can remove instances from the Auto
     *         Scaling group. The default is disabled.
     *         </p>
     */
    public Boolean getDisableScaleIn() {
        return disableScaleIn;
    }

    /**
     * <p>
     * Indicates whether scaling in by the target tracking policy is disabled.
     * If scaling in is disabled, the target tracking policy doesn't remove
     * instances from the Auto Scaling group. Otherwise, the target tracking
     * policy can remove instances from the Auto Scaling group. The default is
     * disabled.
     * </p>
     *
     * @param disableScaleIn <p>
     *            Indicates whether scaling in by the target tracking policy is
     *            disabled. If scaling in is disabled, the target tracking
     *            policy doesn't remove instances from the Auto Scaling group.
     *            Otherwise, the target tracking policy can remove instances
     *            from the Auto Scaling group. The default is disabled.
     *            </p>
     */
    public void setDisableScaleIn(Boolean disableScaleIn) {
        this.disableScaleIn = disableScaleIn;
    }

    /**
     * <p>
     * Indicates whether scaling in by the target tracking policy is disabled.
     * If scaling in is disabled, the target tracking policy doesn't remove
     * instances from the Auto Scaling group. Otherwise, the target tracking
     * policy can remove instances from the Auto Scaling group. The default is
     * disabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disableScaleIn <p>
     *            Indicates whether scaling in by the target tracking policy is
     *            disabled. If scaling in is disabled, the target tracking
     *            policy doesn't remove instances from the Auto Scaling group.
     *            Otherwise, the target tracking policy can remove instances
     *            from the Auto Scaling group. The default is disabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetTrackingConfiguration withDisableScaleIn(Boolean disableScaleIn) {
        this.disableScaleIn = disableScaleIn;
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
        if (getPredefinedMetricSpecification() != null)
            sb.append("PredefinedMetricSpecification: " + getPredefinedMetricSpecification() + ",");
        if (getCustomizedMetricSpecification() != null)
            sb.append("CustomizedMetricSpecification: " + getCustomizedMetricSpecification() + ",");
        if (getTargetValue() != null)
            sb.append("TargetValue: " + getTargetValue() + ",");
        if (getDisableScaleIn() != null)
            sb.append("DisableScaleIn: " + getDisableScaleIn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getPredefinedMetricSpecification() == null) ? 0
                        : getPredefinedMetricSpecification().hashCode());
        hashCode = prime
                * hashCode
                + ((getCustomizedMetricSpecification() == null) ? 0
                        : getCustomizedMetricSpecification().hashCode());
        hashCode = prime * hashCode
                + ((getTargetValue() == null) ? 0 : getTargetValue().hashCode());
        hashCode = prime * hashCode
                + ((getDisableScaleIn() == null) ? 0 : getDisableScaleIn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetTrackingConfiguration == false)
            return false;
        TargetTrackingConfiguration other = (TargetTrackingConfiguration) obj;

        if (other.getPredefinedMetricSpecification() == null
                ^ this.getPredefinedMetricSpecification() == null)
            return false;
        if (other.getPredefinedMetricSpecification() != null
                && other.getPredefinedMetricSpecification().equals(
                        this.getPredefinedMetricSpecification()) == false)
            return false;
        if (other.getCustomizedMetricSpecification() == null
                ^ this.getCustomizedMetricSpecification() == null)
            return false;
        if (other.getCustomizedMetricSpecification() != null
                && other.getCustomizedMetricSpecification().equals(
                        this.getCustomizedMetricSpecification()) == false)
            return false;
        if (other.getTargetValue() == null ^ this.getTargetValue() == null)
            return false;
        if (other.getTargetValue() != null
                && other.getTargetValue().equals(this.getTargetValue()) == false)
            return false;
        if (other.getDisableScaleIn() == null ^ this.getDisableScaleIn() == null)
            return false;
        if (other.getDisableScaleIn() != null
                && other.getDisableScaleIn().equals(this.getDisableScaleIn()) == false)
            return false;
        return true;
    }
}
