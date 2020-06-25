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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Modifies the specified Traffic Mirror rule.
 * </p>
 * <p>
 * <code>DestinationCidrBlock</code> and <code>SourceCidrBlock</code> must both
 * be an IPv4 range or an IPv6 range.
 * </p>
 */
public class ModifyTrafficMirrorFilterRuleRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the Traffic Mirror rule.
     * </p>
     */
    private String trafficMirrorFilterRuleId;

    /**
     * <p>
     * The type of traffic (<code>ingress</code> | <code>egress</code>) to
     * assign to the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ingress, egress
     */
    private String trafficDirection;

    /**
     * <p>
     * The number of the Traffic Mirror rule. This number must be unique for
     * each Traffic Mirror rule in a given direction. The rules are processed in
     * ascending order by rule number.
     * </p>
     */
    private Integer ruleNumber;

    /**
     * <p>
     * The action to assign to the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>accept, reject
     */
    private String ruleAction;

    /**
     * <p>
     * The destination ports that are associated with the Traffic Mirror rule.
     * </p>
     */
    private TrafficMirrorPortRangeRequest destinationPortRange;

    /**
     * <p>
     * The port range to assign to the Traffic Mirror rule.
     * </p>
     */
    private TrafficMirrorPortRangeRequest sourcePortRange;

    /**
     * <p>
     * The protocol, for example TCP, to assign to the Traffic Mirror rule.
     * </p>
     */
    private Integer protocol;

    /**
     * <p>
     * The destination CIDR block to assign to the Traffic Mirror rule.
     * </p>
     */
    private String destinationCidrBlock;

    /**
     * <p>
     * The source CIDR block to assign to the Traffic Mirror rule.
     * </p>
     */
    private String sourceCidrBlock;

    /**
     * <p>
     * The description to assign to the Traffic Mirror rule.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The properties that you want to remove from the Traffic Mirror filter
     * rule.
     * </p>
     * <p>
     * When you remove a property from a Traffic Mirror filter rule, the
     * property is set to the default.
     * </p>
     */
    private java.util.List<String> removeFields;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

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
    public ModifyTrafficMirrorFilterRuleRequest withTrafficMirrorFilterRuleId(
            String trafficMirrorFilterRuleId) {
        this.trafficMirrorFilterRuleId = trafficMirrorFilterRuleId;
        return this;
    }

    /**
     * <p>
     * The type of traffic (<code>ingress</code> | <code>egress</code>) to
     * assign to the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ingress, egress
     *
     * @return <p>
     *         The type of traffic (<code>ingress</code> | <code>egress</code>)
     *         to assign to the rule.
     *         </p>
     * @see TrafficDirection
     */
    public String getTrafficDirection() {
        return trafficDirection;
    }

    /**
     * <p>
     * The type of traffic (<code>ingress</code> | <code>egress</code>) to
     * assign to the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ingress, egress
     *
     * @param trafficDirection <p>
     *            The type of traffic (<code>ingress</code> |
     *            <code>egress</code>) to assign to the rule.
     *            </p>
     * @see TrafficDirection
     */
    public void setTrafficDirection(String trafficDirection) {
        this.trafficDirection = trafficDirection;
    }

    /**
     * <p>
     * The type of traffic (<code>ingress</code> | <code>egress</code>) to
     * assign to the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ingress, egress
     *
     * @param trafficDirection <p>
     *            The type of traffic (<code>ingress</code> |
     *            <code>egress</code>) to assign to the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrafficDirection
     */
    public ModifyTrafficMirrorFilterRuleRequest withTrafficDirection(String trafficDirection) {
        this.trafficDirection = trafficDirection;
        return this;
    }

    /**
     * <p>
     * The type of traffic (<code>ingress</code> | <code>egress</code>) to
     * assign to the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ingress, egress
     *
     * @param trafficDirection <p>
     *            The type of traffic (<code>ingress</code> |
     *            <code>egress</code>) to assign to the rule.
     *            </p>
     * @see TrafficDirection
     */
    public void setTrafficDirection(TrafficDirection trafficDirection) {
        this.trafficDirection = trafficDirection.toString();
    }

    /**
     * <p>
     * The type of traffic (<code>ingress</code> | <code>egress</code>) to
     * assign to the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ingress, egress
     *
     * @param trafficDirection <p>
     *            The type of traffic (<code>ingress</code> |
     *            <code>egress</code>) to assign to the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrafficDirection
     */
    public ModifyTrafficMirrorFilterRuleRequest withTrafficDirection(
            TrafficDirection trafficDirection) {
        this.trafficDirection = trafficDirection.toString();
        return this;
    }

    /**
     * <p>
     * The number of the Traffic Mirror rule. This number must be unique for
     * each Traffic Mirror rule in a given direction. The rules are processed in
     * ascending order by rule number.
     * </p>
     *
     * @return <p>
     *         The number of the Traffic Mirror rule. This number must be unique
     *         for each Traffic Mirror rule in a given direction. The rules are
     *         processed in ascending order by rule number.
     *         </p>
     */
    public Integer getRuleNumber() {
        return ruleNumber;
    }

    /**
     * <p>
     * The number of the Traffic Mirror rule. This number must be unique for
     * each Traffic Mirror rule in a given direction. The rules are processed in
     * ascending order by rule number.
     * </p>
     *
     * @param ruleNumber <p>
     *            The number of the Traffic Mirror rule. This number must be
     *            unique for each Traffic Mirror rule in a given direction. The
     *            rules are processed in ascending order by rule number.
     *            </p>
     */
    public void setRuleNumber(Integer ruleNumber) {
        this.ruleNumber = ruleNumber;
    }

    /**
     * <p>
     * The number of the Traffic Mirror rule. This number must be unique for
     * each Traffic Mirror rule in a given direction. The rules are processed in
     * ascending order by rule number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ruleNumber <p>
     *            The number of the Traffic Mirror rule. This number must be
     *            unique for each Traffic Mirror rule in a given direction. The
     *            rules are processed in ascending order by rule number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyTrafficMirrorFilterRuleRequest withRuleNumber(Integer ruleNumber) {
        this.ruleNumber = ruleNumber;
        return this;
    }

    /**
     * <p>
     * The action to assign to the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>accept, reject
     *
     * @return <p>
     *         The action to assign to the rule.
     *         </p>
     * @see TrafficMirrorRuleAction
     */
    public String getRuleAction() {
        return ruleAction;
    }

    /**
     * <p>
     * The action to assign to the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>accept, reject
     *
     * @param ruleAction <p>
     *            The action to assign to the rule.
     *            </p>
     * @see TrafficMirrorRuleAction
     */
    public void setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
    }

    /**
     * <p>
     * The action to assign to the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>accept, reject
     *
     * @param ruleAction <p>
     *            The action to assign to the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrafficMirrorRuleAction
     */
    public ModifyTrafficMirrorFilterRuleRequest withRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
        return this;
    }

    /**
     * <p>
     * The action to assign to the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>accept, reject
     *
     * @param ruleAction <p>
     *            The action to assign to the rule.
     *            </p>
     * @see TrafficMirrorRuleAction
     */
    public void setRuleAction(TrafficMirrorRuleAction ruleAction) {
        this.ruleAction = ruleAction.toString();
    }

    /**
     * <p>
     * The action to assign to the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>accept, reject
     *
     * @param ruleAction <p>
     *            The action to assign to the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrafficMirrorRuleAction
     */
    public ModifyTrafficMirrorFilterRuleRequest withRuleAction(TrafficMirrorRuleAction ruleAction) {
        this.ruleAction = ruleAction.toString();
        return this;
    }

    /**
     * <p>
     * The destination ports that are associated with the Traffic Mirror rule.
     * </p>
     *
     * @return <p>
     *         The destination ports that are associated with the Traffic Mirror
     *         rule.
     *         </p>
     */
    public TrafficMirrorPortRangeRequest getDestinationPortRange() {
        return destinationPortRange;
    }

    /**
     * <p>
     * The destination ports that are associated with the Traffic Mirror rule.
     * </p>
     *
     * @param destinationPortRange <p>
     *            The destination ports that are associated with the Traffic
     *            Mirror rule.
     *            </p>
     */
    public void setDestinationPortRange(TrafficMirrorPortRangeRequest destinationPortRange) {
        this.destinationPortRange = destinationPortRange;
    }

    /**
     * <p>
     * The destination ports that are associated with the Traffic Mirror rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationPortRange <p>
     *            The destination ports that are associated with the Traffic
     *            Mirror rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyTrafficMirrorFilterRuleRequest withDestinationPortRange(
            TrafficMirrorPortRangeRequest destinationPortRange) {
        this.destinationPortRange = destinationPortRange;
        return this;
    }

    /**
     * <p>
     * The port range to assign to the Traffic Mirror rule.
     * </p>
     *
     * @return <p>
     *         The port range to assign to the Traffic Mirror rule.
     *         </p>
     */
    public TrafficMirrorPortRangeRequest getSourcePortRange() {
        return sourcePortRange;
    }

    /**
     * <p>
     * The port range to assign to the Traffic Mirror rule.
     * </p>
     *
     * @param sourcePortRange <p>
     *            The port range to assign to the Traffic Mirror rule.
     *            </p>
     */
    public void setSourcePortRange(TrafficMirrorPortRangeRequest sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
    }

    /**
     * <p>
     * The port range to assign to the Traffic Mirror rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourcePortRange <p>
     *            The port range to assign to the Traffic Mirror rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyTrafficMirrorFilterRuleRequest withSourcePortRange(
            TrafficMirrorPortRangeRequest sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }

    /**
     * <p>
     * The protocol, for example TCP, to assign to the Traffic Mirror rule.
     * </p>
     *
     * @return <p>
     *         The protocol, for example TCP, to assign to the Traffic Mirror
     *         rule.
     *         </p>
     */
    public Integer getProtocol() {
        return protocol;
    }

    /**
     * <p>
     * The protocol, for example TCP, to assign to the Traffic Mirror rule.
     * </p>
     *
     * @param protocol <p>
     *            The protocol, for example TCP, to assign to the Traffic Mirror
     *            rule.
     *            </p>
     */
    public void setProtocol(Integer protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol, for example TCP, to assign to the Traffic Mirror rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param protocol <p>
     *            The protocol, for example TCP, to assign to the Traffic Mirror
     *            rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyTrafficMirrorFilterRuleRequest withProtocol(Integer protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * <p>
     * The destination CIDR block to assign to the Traffic Mirror rule.
     * </p>
     *
     * @return <p>
     *         The destination CIDR block to assign to the Traffic Mirror rule.
     *         </p>
     */
    public String getDestinationCidrBlock() {
        return destinationCidrBlock;
    }

    /**
     * <p>
     * The destination CIDR block to assign to the Traffic Mirror rule.
     * </p>
     *
     * @param destinationCidrBlock <p>
     *            The destination CIDR block to assign to the Traffic Mirror
     *            rule.
     *            </p>
     */
    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }

    /**
     * <p>
     * The destination CIDR block to assign to the Traffic Mirror rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationCidrBlock <p>
     *            The destination CIDR block to assign to the Traffic Mirror
     *            rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyTrafficMirrorFilterRuleRequest withDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }

    /**
     * <p>
     * The source CIDR block to assign to the Traffic Mirror rule.
     * </p>
     *
     * @return <p>
     *         The source CIDR block to assign to the Traffic Mirror rule.
     *         </p>
     */
    public String getSourceCidrBlock() {
        return sourceCidrBlock;
    }

    /**
     * <p>
     * The source CIDR block to assign to the Traffic Mirror rule.
     * </p>
     *
     * @param sourceCidrBlock <p>
     *            The source CIDR block to assign to the Traffic Mirror rule.
     *            </p>
     */
    public void setSourceCidrBlock(String sourceCidrBlock) {
        this.sourceCidrBlock = sourceCidrBlock;
    }

    /**
     * <p>
     * The source CIDR block to assign to the Traffic Mirror rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceCidrBlock <p>
     *            The source CIDR block to assign to the Traffic Mirror rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyTrafficMirrorFilterRuleRequest withSourceCidrBlock(String sourceCidrBlock) {
        this.sourceCidrBlock = sourceCidrBlock;
        return this;
    }

    /**
     * <p>
     * The description to assign to the Traffic Mirror rule.
     * </p>
     *
     * @return <p>
     *         The description to assign to the Traffic Mirror rule.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description to assign to the Traffic Mirror rule.
     * </p>
     *
     * @param description <p>
     *            The description to assign to the Traffic Mirror rule.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description to assign to the Traffic Mirror rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description to assign to the Traffic Mirror rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyTrafficMirrorFilterRuleRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The properties that you want to remove from the Traffic Mirror filter
     * rule.
     * </p>
     * <p>
     * When you remove a property from a Traffic Mirror filter rule, the
     * property is set to the default.
     * </p>
     *
     * @return <p>
     *         The properties that you want to remove from the Traffic Mirror
     *         filter rule.
     *         </p>
     *         <p>
     *         When you remove a property from a Traffic Mirror filter rule, the
     *         property is set to the default.
     *         </p>
     */
    public java.util.List<String> getRemoveFields() {
        return removeFields;
    }

    /**
     * <p>
     * The properties that you want to remove from the Traffic Mirror filter
     * rule.
     * </p>
     * <p>
     * When you remove a property from a Traffic Mirror filter rule, the
     * property is set to the default.
     * </p>
     *
     * @param removeFields <p>
     *            The properties that you want to remove from the Traffic Mirror
     *            filter rule.
     *            </p>
     *            <p>
     *            When you remove a property from a Traffic Mirror filter rule,
     *            the property is set to the default.
     *            </p>
     */
    public void setRemoveFields(java.util.Collection<String> removeFields) {
        if (removeFields == null) {
            this.removeFields = null;
            return;
        }

        this.removeFields = new java.util.ArrayList<String>(removeFields);
    }

    /**
     * <p>
     * The properties that you want to remove from the Traffic Mirror filter
     * rule.
     * </p>
     * <p>
     * When you remove a property from a Traffic Mirror filter rule, the
     * property is set to the default.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param removeFields <p>
     *            The properties that you want to remove from the Traffic Mirror
     *            filter rule.
     *            </p>
     *            <p>
     *            When you remove a property from a Traffic Mirror filter rule,
     *            the property is set to the default.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyTrafficMirrorFilterRuleRequest withRemoveFields(String... removeFields) {
        if (getRemoveFields() == null) {
            this.removeFields = new java.util.ArrayList<String>(removeFields.length);
        }
        for (String value : removeFields) {
            this.removeFields.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The properties that you want to remove from the Traffic Mirror filter
     * rule.
     * </p>
     * <p>
     * When you remove a property from a Traffic Mirror filter rule, the
     * property is set to the default.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param removeFields <p>
     *            The properties that you want to remove from the Traffic Mirror
     *            filter rule.
     *            </p>
     *            <p>
     *            When you remove a property from a Traffic Mirror filter rule,
     *            the property is set to the default.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyTrafficMirrorFilterRuleRequest withRemoveFields(
            java.util.Collection<String> removeFields) {
        setRemoveFields(removeFields);
        return this;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyTrafficMirrorFilterRuleRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
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
        if (getTrafficDirection() != null)
            sb.append("TrafficDirection: " + getTrafficDirection() + ",");
        if (getRuleNumber() != null)
            sb.append("RuleNumber: " + getRuleNumber() + ",");
        if (getRuleAction() != null)
            sb.append("RuleAction: " + getRuleAction() + ",");
        if (getDestinationPortRange() != null)
            sb.append("DestinationPortRange: " + getDestinationPortRange() + ",");
        if (getSourcePortRange() != null)
            sb.append("SourcePortRange: " + getSourcePortRange() + ",");
        if (getProtocol() != null)
            sb.append("Protocol: " + getProtocol() + ",");
        if (getDestinationCidrBlock() != null)
            sb.append("DestinationCidrBlock: " + getDestinationCidrBlock() + ",");
        if (getSourceCidrBlock() != null)
            sb.append("SourceCidrBlock: " + getSourceCidrBlock() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getRemoveFields() != null)
            sb.append("RemoveFields: " + getRemoveFields() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun());
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
        hashCode = prime * hashCode
                + ((getTrafficDirection() == null) ? 0 : getTrafficDirection().hashCode());
        hashCode = prime * hashCode + ((getRuleNumber() == null) ? 0 : getRuleNumber().hashCode());
        hashCode = prime * hashCode + ((getRuleAction() == null) ? 0 : getRuleAction().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationPortRange() == null) ? 0 : getDestinationPortRange().hashCode());
        hashCode = prime * hashCode
                + ((getSourcePortRange() == null) ? 0 : getSourcePortRange().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationCidrBlock() == null) ? 0 : getDestinationCidrBlock().hashCode());
        hashCode = prime * hashCode
                + ((getSourceCidrBlock() == null) ? 0 : getSourceCidrBlock().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getRemoveFields() == null) ? 0 : getRemoveFields().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyTrafficMirrorFilterRuleRequest == false)
            return false;
        ModifyTrafficMirrorFilterRuleRequest other = (ModifyTrafficMirrorFilterRuleRequest) obj;

        if (other.getTrafficMirrorFilterRuleId() == null
                ^ this.getTrafficMirrorFilterRuleId() == null)
            return false;
        if (other.getTrafficMirrorFilterRuleId() != null
                && other.getTrafficMirrorFilterRuleId().equals(this.getTrafficMirrorFilterRuleId()) == false)
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
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
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
        if (other.getRemoveFields() == null ^ this.getRemoveFields() == null)
            return false;
        if (other.getRemoveFields() != null
                && other.getRemoveFields().equals(this.getRemoveFields()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
