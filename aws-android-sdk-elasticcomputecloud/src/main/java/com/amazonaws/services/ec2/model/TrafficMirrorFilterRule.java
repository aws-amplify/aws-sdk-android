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

/**
 * <p>
 * Describes the Traffic Mirror rule.
 * </p>
 */
public class TrafficMirrorFilterRule implements Serializable {
    /**
     * <p>
     * The ID of the Traffic Mirror rule.
     * </p>
     */
    private String trafficMirrorFilterRuleId;

    /**
     * <p>
     * The ID of the Traffic Mirror filter that the rule is associated with.
     * </p>
     */
    private String trafficMirrorFilterId;

    /**
     * <p>
     * The traffic direction assigned to the Traffic Mirror rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ingress, egress
     */
    private String trafficDirection;

    /**
     * <p>
     * The rule number of the Traffic Mirror rule.
     * </p>
     */
    private Integer ruleNumber;

    /**
     * <p>
     * The action assigned to the Traffic Mirror rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>accept, reject
     */
    private String ruleAction;

    /**
     * <p>
     * The protocol assigned to the Traffic Mirror rule.
     * </p>
     */
    private Integer protocol;

    /**
     * <p>
     * The destination port range assigned to the Traffic Mirror rule.
     * </p>
     */
    private TrafficMirrorPortRange destinationPortRange;

    /**
     * <p>
     * The source port range assigned to the Traffic Mirror rule.
     * </p>
     */
    private TrafficMirrorPortRange sourcePortRange;

    /**
     * <p>
     * The destination CIDR block assigned to the Traffic Mirror rule.
     * </p>
     */
    private String destinationCidrBlock;

    /**
     * <p>
     * The source CIDR block assigned to the Traffic Mirror rule.
     * </p>
     */
    private String sourceCidrBlock;

    /**
     * <p>
     * The description of the Traffic Mirror rule.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The ID of the Traffic Mirror rule.
     * </p>
     *
     * @return <p>
     *         The ID of the Traffic Mirror rule.
     *         </p>
     */
    public String getTrafficMirrorFilterRuleId() {
        return trafficMirrorFilterRuleId;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror rule.
     * </p>
     *
     * @param trafficMirrorFilterRuleId <p>
     *            The ID of the Traffic Mirror rule.
     *            </p>
     */
    public void setTrafficMirrorFilterRuleId(String trafficMirrorFilterRuleId) {
        this.trafficMirrorFilterRuleId = trafficMirrorFilterRuleId;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trafficMirrorFilterRuleId <p>
     *            The ID of the Traffic Mirror rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficMirrorFilterRule withTrafficMirrorFilterRuleId(String trafficMirrorFilterRuleId) {
        this.trafficMirrorFilterRuleId = trafficMirrorFilterRuleId;
        return this;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror filter that the rule is associated with.
     * </p>
     *
     * @return <p>
     *         The ID of the Traffic Mirror filter that the rule is associated
     *         with.
     *         </p>
     */
    public String getTrafficMirrorFilterId() {
        return trafficMirrorFilterId;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror filter that the rule is associated with.
     * </p>
     *
     * @param trafficMirrorFilterId <p>
     *            The ID of the Traffic Mirror filter that the rule is
     *            associated with.
     *            </p>
     */
    public void setTrafficMirrorFilterId(String trafficMirrorFilterId) {
        this.trafficMirrorFilterId = trafficMirrorFilterId;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror filter that the rule is associated with.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trafficMirrorFilterId <p>
     *            The ID of the Traffic Mirror filter that the rule is
     *            associated with.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficMirrorFilterRule withTrafficMirrorFilterId(String trafficMirrorFilterId) {
        this.trafficMirrorFilterId = trafficMirrorFilterId;
        return this;
    }

    /**
     * <p>
     * The traffic direction assigned to the Traffic Mirror rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ingress, egress
     *
     * @return <p>
     *         The traffic direction assigned to the Traffic Mirror rule.
     *         </p>
     * @see TrafficDirection
     */
    public String getTrafficDirection() {
        return trafficDirection;
    }

    /**
     * <p>
     * The traffic direction assigned to the Traffic Mirror rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ingress, egress
     *
     * @param trafficDirection <p>
     *            The traffic direction assigned to the Traffic Mirror rule.
     *            </p>
     * @see TrafficDirection
     */
    public void setTrafficDirection(String trafficDirection) {
        this.trafficDirection = trafficDirection;
    }

    /**
     * <p>
     * The traffic direction assigned to the Traffic Mirror rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ingress, egress
     *
     * @param trafficDirection <p>
     *            The traffic direction assigned to the Traffic Mirror rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrafficDirection
     */
    public TrafficMirrorFilterRule withTrafficDirection(String trafficDirection) {
        this.trafficDirection = trafficDirection;
        return this;
    }

    /**
     * <p>
     * The traffic direction assigned to the Traffic Mirror rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ingress, egress
     *
     * @param trafficDirection <p>
     *            The traffic direction assigned to the Traffic Mirror rule.
     *            </p>
     * @see TrafficDirection
     */
    public void setTrafficDirection(TrafficDirection trafficDirection) {
        this.trafficDirection = trafficDirection.toString();
    }

    /**
     * <p>
     * The traffic direction assigned to the Traffic Mirror rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ingress, egress
     *
     * @param trafficDirection <p>
     *            The traffic direction assigned to the Traffic Mirror rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrafficDirection
     */
    public TrafficMirrorFilterRule withTrafficDirection(TrafficDirection trafficDirection) {
        this.trafficDirection = trafficDirection.toString();
        return this;
    }

    /**
     * <p>
     * The rule number of the Traffic Mirror rule.
     * </p>
     *
     * @return <p>
     *         The rule number of the Traffic Mirror rule.
     *         </p>
     */
    public Integer getRuleNumber() {
        return ruleNumber;
    }

    /**
     * <p>
     * The rule number of the Traffic Mirror rule.
     * </p>
     *
     * @param ruleNumber <p>
     *            The rule number of the Traffic Mirror rule.
     *            </p>
     */
    public void setRuleNumber(Integer ruleNumber) {
        this.ruleNumber = ruleNumber;
    }

    /**
     * <p>
     * The rule number of the Traffic Mirror rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ruleNumber <p>
     *            The rule number of the Traffic Mirror rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficMirrorFilterRule withRuleNumber(Integer ruleNumber) {
        this.ruleNumber = ruleNumber;
        return this;
    }

    /**
     * <p>
     * The action assigned to the Traffic Mirror rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>accept, reject
     *
     * @return <p>
     *         The action assigned to the Traffic Mirror rule.
     *         </p>
     * @see TrafficMirrorRuleAction
     */
    public String getRuleAction() {
        return ruleAction;
    }

    /**
     * <p>
     * The action assigned to the Traffic Mirror rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>accept, reject
     *
     * @param ruleAction <p>
     *            The action assigned to the Traffic Mirror rule.
     *            </p>
     * @see TrafficMirrorRuleAction
     */
    public void setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
    }

    /**
     * <p>
     * The action assigned to the Traffic Mirror rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>accept, reject
     *
     * @param ruleAction <p>
     *            The action assigned to the Traffic Mirror rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrafficMirrorRuleAction
     */
    public TrafficMirrorFilterRule withRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
        return this;
    }

    /**
     * <p>
     * The action assigned to the Traffic Mirror rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>accept, reject
     *
     * @param ruleAction <p>
     *            The action assigned to the Traffic Mirror rule.
     *            </p>
     * @see TrafficMirrorRuleAction
     */
    public void setRuleAction(TrafficMirrorRuleAction ruleAction) {
        this.ruleAction = ruleAction.toString();
    }

    /**
     * <p>
     * The action assigned to the Traffic Mirror rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>accept, reject
     *
     * @param ruleAction <p>
     *            The action assigned to the Traffic Mirror rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrafficMirrorRuleAction
     */
    public TrafficMirrorFilterRule withRuleAction(TrafficMirrorRuleAction ruleAction) {
        this.ruleAction = ruleAction.toString();
        return this;
    }

    /**
     * <p>
     * The protocol assigned to the Traffic Mirror rule.
     * </p>
     *
     * @return <p>
     *         The protocol assigned to the Traffic Mirror rule.
     *         </p>
     */
    public Integer getProtocol() {
        return protocol;
    }

    /**
     * <p>
     * The protocol assigned to the Traffic Mirror rule.
     * </p>
     *
     * @param protocol <p>
     *            The protocol assigned to the Traffic Mirror rule.
     *            </p>
     */
    public void setProtocol(Integer protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol assigned to the Traffic Mirror rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param protocol <p>
     *            The protocol assigned to the Traffic Mirror rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficMirrorFilterRule withProtocol(Integer protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * <p>
     * The destination port range assigned to the Traffic Mirror rule.
     * </p>
     *
     * @return <p>
     *         The destination port range assigned to the Traffic Mirror rule.
     *         </p>
     */
    public TrafficMirrorPortRange getDestinationPortRange() {
        return destinationPortRange;
    }

    /**
     * <p>
     * The destination port range assigned to the Traffic Mirror rule.
     * </p>
     *
     * @param destinationPortRange <p>
     *            The destination port range assigned to the Traffic Mirror
     *            rule.
     *            </p>
     */
    public void setDestinationPortRange(TrafficMirrorPortRange destinationPortRange) {
        this.destinationPortRange = destinationPortRange;
    }

    /**
     * <p>
     * The destination port range assigned to the Traffic Mirror rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationPortRange <p>
     *            The destination port range assigned to the Traffic Mirror
     *            rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficMirrorFilterRule withDestinationPortRange(
            TrafficMirrorPortRange destinationPortRange) {
        this.destinationPortRange = destinationPortRange;
        return this;
    }

    /**
     * <p>
     * The source port range assigned to the Traffic Mirror rule.
     * </p>
     *
     * @return <p>
     *         The source port range assigned to the Traffic Mirror rule.
     *         </p>
     */
    public TrafficMirrorPortRange getSourcePortRange() {
        return sourcePortRange;
    }

    /**
     * <p>
     * The source port range assigned to the Traffic Mirror rule.
     * </p>
     *
     * @param sourcePortRange <p>
     *            The source port range assigned to the Traffic Mirror rule.
     *            </p>
     */
    public void setSourcePortRange(TrafficMirrorPortRange sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
    }

    /**
     * <p>
     * The source port range assigned to the Traffic Mirror rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourcePortRange <p>
     *            The source port range assigned to the Traffic Mirror rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficMirrorFilterRule withSourcePortRange(TrafficMirrorPortRange sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }

    /**
     * <p>
     * The destination CIDR block assigned to the Traffic Mirror rule.
     * </p>
     *
     * @return <p>
     *         The destination CIDR block assigned to the Traffic Mirror rule.
     *         </p>
     */
    public String getDestinationCidrBlock() {
        return destinationCidrBlock;
    }

    /**
     * <p>
     * The destination CIDR block assigned to the Traffic Mirror rule.
     * </p>
     *
     * @param destinationCidrBlock <p>
     *            The destination CIDR block assigned to the Traffic Mirror
     *            rule.
     *            </p>
     */
    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }

    /**
     * <p>
     * The destination CIDR block assigned to the Traffic Mirror rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationCidrBlock <p>
     *            The destination CIDR block assigned to the Traffic Mirror
     *            rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficMirrorFilterRule withDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }

    /**
     * <p>
     * The source CIDR block assigned to the Traffic Mirror rule.
     * </p>
     *
     * @return <p>
     *         The source CIDR block assigned to the Traffic Mirror rule.
     *         </p>
     */
    public String getSourceCidrBlock() {
        return sourceCidrBlock;
    }

    /**
     * <p>
     * The source CIDR block assigned to the Traffic Mirror rule.
     * </p>
     *
     * @param sourceCidrBlock <p>
     *            The source CIDR block assigned to the Traffic Mirror rule.
     *            </p>
     */
    public void setSourceCidrBlock(String sourceCidrBlock) {
        this.sourceCidrBlock = sourceCidrBlock;
    }

    /**
     * <p>
     * The source CIDR block assigned to the Traffic Mirror rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceCidrBlock <p>
     *            The source CIDR block assigned to the Traffic Mirror rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficMirrorFilterRule withSourceCidrBlock(String sourceCidrBlock) {
        this.sourceCidrBlock = sourceCidrBlock;
        return this;
    }

    /**
     * <p>
     * The description of the Traffic Mirror rule.
     * </p>
     *
     * @return <p>
     *         The description of the Traffic Mirror rule.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the Traffic Mirror rule.
     * </p>
     *
     * @param description <p>
     *            The description of the Traffic Mirror rule.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the Traffic Mirror rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the Traffic Mirror rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficMirrorFilterRule withDescription(String description) {
        this.description = description;
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
        if (getTrafficMirrorFilterRuleId() != null)
            sb.append("TrafficMirrorFilterRuleId: " + getTrafficMirrorFilterRuleId() + ",");
        if (getTrafficMirrorFilterId() != null)
            sb.append("TrafficMirrorFilterId: " + getTrafficMirrorFilterId() + ",");
        if (getTrafficDirection() != null)
            sb.append("TrafficDirection: " + getTrafficDirection() + ",");
        if (getRuleNumber() != null)
            sb.append("RuleNumber: " + getRuleNumber() + ",");
        if (getRuleAction() != null)
            sb.append("RuleAction: " + getRuleAction() + ",");
        if (getProtocol() != null)
            sb.append("Protocol: " + getProtocol() + ",");
        if (getDestinationPortRange() != null)
            sb.append("DestinationPortRange: " + getDestinationPortRange() + ",");
        if (getSourcePortRange() != null)
            sb.append("SourcePortRange: " + getSourcePortRange() + ",");
        if (getDestinationCidrBlock() != null)
            sb.append("DestinationCidrBlock: " + getDestinationCidrBlock() + ",");
        if (getSourceCidrBlock() != null)
            sb.append("SourceCidrBlock: " + getSourceCidrBlock() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTrafficMirrorFilterRuleId() == null) ? 0 : getTrafficMirrorFilterRuleId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getTrafficMirrorFilterId() == null) ? 0 : getTrafficMirrorFilterId().hashCode());
        hashCode = prime * hashCode
                + ((getTrafficDirection() == null) ? 0 : getTrafficDirection().hashCode());
        hashCode = prime * hashCode + ((getRuleNumber() == null) ? 0 : getRuleNumber().hashCode());
        hashCode = prime * hashCode + ((getRuleAction() == null) ? 0 : getRuleAction().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationPortRange() == null) ? 0 : getDestinationPortRange().hashCode());
        hashCode = prime * hashCode
                + ((getSourcePortRange() == null) ? 0 : getSourcePortRange().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationCidrBlock() == null) ? 0 : getDestinationCidrBlock().hashCode());
        hashCode = prime * hashCode
                + ((getSourceCidrBlock() == null) ? 0 : getSourceCidrBlock().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrafficMirrorFilterRule == false)
            return false;
        TrafficMirrorFilterRule other = (TrafficMirrorFilterRule) obj;

        if (other.getTrafficMirrorFilterRuleId() == null
                ^ this.getTrafficMirrorFilterRuleId() == null)
            return false;
        if (other.getTrafficMirrorFilterRuleId() != null
                && other.getTrafficMirrorFilterRuleId().equals(this.getTrafficMirrorFilterRuleId()) == false)
            return false;
        if (other.getTrafficMirrorFilterId() == null ^ this.getTrafficMirrorFilterId() == null)
            return false;
        if (other.getTrafficMirrorFilterId() != null
                && other.getTrafficMirrorFilterId().equals(this.getTrafficMirrorFilterId()) == false)
            return false;
        if (other.getTrafficDirection() == null ^ this.getTrafficDirection() == null)
            return false;
        if (other.getTrafficDirection() != null
                && other.getTrafficDirection().equals(this.getTrafficDirection()) == false)
            return false;
        if (other.getRuleNumber() == null ^ this.getRuleNumber() == null)
            return false;
        if (other.getRuleNumber() != null
                && other.getRuleNumber().equals(this.getRuleNumber()) == false)
            return false;
        if (other.getRuleAction() == null ^ this.getRuleAction() == null)
            return false;
        if (other.getRuleAction() != null
                && other.getRuleAction().equals(this.getRuleAction()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getDestinationPortRange() == null ^ this.getDestinationPortRange() == null)
            return false;
        if (other.getDestinationPortRange() != null
                && other.getDestinationPortRange().equals(this.getDestinationPortRange()) == false)
            return false;
        if (other.getSourcePortRange() == null ^ this.getSourcePortRange() == null)
            return false;
        if (other.getSourcePortRange() != null
                && other.getSourcePortRange().equals(this.getSourcePortRange()) == false)
            return false;
        if (other.getDestinationCidrBlock() == null ^ this.getDestinationCidrBlock() == null)
            return false;
        if (other.getDestinationCidrBlock() != null
                && other.getDestinationCidrBlock().equals(this.getDestinationCidrBlock()) == false)
            return false;
        if (other.getSourceCidrBlock() == null ^ this.getSourceCidrBlock() == null)
            return false;
        if (other.getSourceCidrBlock() != null
                && other.getSourceCidrBlock().equals(this.getSourceCidrBlock()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }
}
