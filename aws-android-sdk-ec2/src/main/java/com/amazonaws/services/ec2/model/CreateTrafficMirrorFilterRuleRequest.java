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
 * Creates a Traffic Mirror filter rule.
 * </p>
 * <p>
 * A Traffic Mirror rule defines the Traffic Mirror source traffic to mirror.
 * </p>
 * <p>
 * You need the Traffic Mirror filter ID when you create the rule.
 * </p>
 */
public class CreateTrafficMirrorFilterRuleRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the filter that this rule is associated with.
     * </p>
     */
    private String trafficMirrorFilterId;

    /**
     * <p>
     * The type of traffic (<code>ingress</code> | <code>egress</code>).
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
     * The action to take (<code>accept</code> | <code>reject</code>) on the
     * filtered traffic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>accept, reject
     */
    private String ruleAction;

    /**
     * <p>
     * The destination port range.
     * </p>
     */
    private TrafficMirrorPortRangeRequest destinationPortRange;

    /**
     * <p>
     * The source port range.
     * </p>
     */
    private TrafficMirrorPortRangeRequest sourcePortRange;

    /**
     * <p>
     * The protocol, for example UDP, to assign to the Traffic Mirror rule.
     * </p>
     * <p>
     * For information about the protocol value, see <a href=
     * "https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml"
     * >Protocol Numbers</a> on the Internet Assigned Numbers Authority (IANA)
     * website.
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
     * The description of the Traffic Mirror rule.
     * </p>
     */
    private String description;

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
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The ID of the filter that this rule is associated with.
     * </p>
     *
     * @return <p>
     *         The ID of the filter that this rule is associated with.
     *         </p>
     */
    public String getTrafficMirrorFilterId() {
        return trafficMirrorFilterId;
    }

    /**
     * <p>
     * The ID of the filter that this rule is associated with.
     * </p>
     *
     * @param trafficMirrorFilterId <p>
     *            The ID of the filter that this rule is associated with.
     *            </p>
     */
    public void setTrafficMirrorFilterId(String trafficMirrorFilterId) {
        this.trafficMirrorFilterId = trafficMirrorFilterId;
    }

    /**
     * <p>
     * The ID of the filter that this rule is associated with.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trafficMirrorFilterId <p>
     *            The ID of the filter that this rule is associated with.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrafficMirrorFilterRuleRequest withTrafficMirrorFilterId(
            String trafficMirrorFilterId) {
        this.trafficMirrorFilterId = trafficMirrorFilterId;
        return this;
    }

    /**
     * <p>
     * The type of traffic (<code>ingress</code> | <code>egress</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ingress, egress
     *
     * @return <p>
     *         The type of traffic (<code>ingress</code> | <code>egress</code>).
     *         </p>
     * @see TrafficDirection
     */
    public String getTrafficDirection() {
        return trafficDirection;
    }

    /**
     * <p>
     * The type of traffic (<code>ingress</code> | <code>egress</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ingress, egress
     *
     * @param trafficDirection <p>
     *            The type of traffic (<code>ingress</code> |
     *            <code>egress</code>).
     *            </p>
     * @see TrafficDirection
     */
    public void setTrafficDirection(String trafficDirection) {
        this.trafficDirection = trafficDirection;
    }

    /**
     * <p>
     * The type of traffic (<code>ingress</code> | <code>egress</code>).
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
     *            <code>egress</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrafficDirection
     */
    public CreateTrafficMirrorFilterRuleRequest withTrafficDirection(String trafficDirection) {
        this.trafficDirection = trafficDirection;
        return this;
    }

    /**
     * <p>
     * The type of traffic (<code>ingress</code> | <code>egress</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ingress, egress
     *
     * @param trafficDirection <p>
     *            The type of traffic (<code>ingress</code> |
     *            <code>egress</code>).
     *            </p>
     * @see TrafficDirection
     */
    public void setTrafficDirection(TrafficDirection trafficDirection) {
        this.trafficDirection = trafficDirection.toString();
    }

    /**
     * <p>
     * The type of traffic (<code>ingress</code> | <code>egress</code>).
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
     *            <code>egress</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrafficDirection
     */
    public CreateTrafficMirrorFilterRuleRequest withTrafficDirection(
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
    public CreateTrafficMirrorFilterRuleRequest withRuleNumber(Integer ruleNumber) {
        this.ruleNumber = ruleNumber;
        return this;
    }

    /**
     * <p>
     * The action to take (<code>accept</code> | <code>reject</code>) on the
     * filtered traffic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>accept, reject
     *
     * @return <p>
     *         The action to take (<code>accept</code> | <code>reject</code>) on
     *         the filtered traffic.
     *         </p>
     * @see TrafficMirrorRuleAction
     */
    public String getRuleAction() {
        return ruleAction;
    }

    /**
     * <p>
     * The action to take (<code>accept</code> | <code>reject</code>) on the
     * filtered traffic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>accept, reject
     *
     * @param ruleAction <p>
     *            The action to take (<code>accept</code> | <code>reject</code>)
     *            on the filtered traffic.
     *            </p>
     * @see TrafficMirrorRuleAction
     */
    public void setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
    }

    /**
     * <p>
     * The action to take (<code>accept</code> | <code>reject</code>) on the
     * filtered traffic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>accept, reject
     *
     * @param ruleAction <p>
     *            The action to take (<code>accept</code> | <code>reject</code>)
     *            on the filtered traffic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrafficMirrorRuleAction
     */
    public CreateTrafficMirrorFilterRuleRequest withRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
        return this;
    }

    /**
     * <p>
     * The action to take (<code>accept</code> | <code>reject</code>) on the
     * filtered traffic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>accept, reject
     *
     * @param ruleAction <p>
     *            The action to take (<code>accept</code> | <code>reject</code>)
     *            on the filtered traffic.
     *            </p>
     * @see TrafficMirrorRuleAction
     */
    public void setRuleAction(TrafficMirrorRuleAction ruleAction) {
        this.ruleAction = ruleAction.toString();
    }

    /**
     * <p>
     * The action to take (<code>accept</code> | <code>reject</code>) on the
     * filtered traffic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>accept, reject
     *
     * @param ruleAction <p>
     *            The action to take (<code>accept</code> | <code>reject</code>)
     *            on the filtered traffic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrafficMirrorRuleAction
     */
    public CreateTrafficMirrorFilterRuleRequest withRuleAction(TrafficMirrorRuleAction ruleAction) {
        this.ruleAction = ruleAction.toString();
        return this;
    }

    /**
     * <p>
     * The destination port range.
     * </p>
     *
     * @return <p>
     *         The destination port range.
     *         </p>
     */
    public TrafficMirrorPortRangeRequest getDestinationPortRange() {
        return destinationPortRange;
    }

    /**
     * <p>
     * The destination port range.
     * </p>
     *
     * @param destinationPortRange <p>
     *            The destination port range.
     *            </p>
     */
    public void setDestinationPortRange(TrafficMirrorPortRangeRequest destinationPortRange) {
        this.destinationPortRange = destinationPortRange;
    }

    /**
     * <p>
     * The destination port range.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationPortRange <p>
     *            The destination port range.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrafficMirrorFilterRuleRequest withDestinationPortRange(
            TrafficMirrorPortRangeRequest destinationPortRange) {
        this.destinationPortRange = destinationPortRange;
        return this;
    }

    /**
     * <p>
     * The source port range.
     * </p>
     *
     * @return <p>
     *         The source port range.
     *         </p>
     */
    public TrafficMirrorPortRangeRequest getSourcePortRange() {
        return sourcePortRange;
    }

    /**
     * <p>
     * The source port range.
     * </p>
     *
     * @param sourcePortRange <p>
     *            The source port range.
     *            </p>
     */
    public void setSourcePortRange(TrafficMirrorPortRangeRequest sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
    }

    /**
     * <p>
     * The source port range.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourcePortRange <p>
     *            The source port range.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrafficMirrorFilterRuleRequest withSourcePortRange(
            TrafficMirrorPortRangeRequest sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }

    /**
     * <p>
     * The protocol, for example UDP, to assign to the Traffic Mirror rule.
     * </p>
     * <p>
     * For information about the protocol value, see <a href=
     * "https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml"
     * >Protocol Numbers</a> on the Internet Assigned Numbers Authority (IANA)
     * website.
     * </p>
     *
     * @return <p>
     *         The protocol, for example UDP, to assign to the Traffic Mirror
     *         rule.
     *         </p>
     *         <p>
     *         For information about the protocol value, see <a href=
     *         "https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml"
     *         >Protocol Numbers</a> on the Internet Assigned Numbers Authority
     *         (IANA) website.
     *         </p>
     */
    public Integer getProtocol() {
        return protocol;
    }

    /**
     * <p>
     * The protocol, for example UDP, to assign to the Traffic Mirror rule.
     * </p>
     * <p>
     * For information about the protocol value, see <a href=
     * "https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml"
     * >Protocol Numbers</a> on the Internet Assigned Numbers Authority (IANA)
     * website.
     * </p>
     *
     * @param protocol <p>
     *            The protocol, for example UDP, to assign to the Traffic Mirror
     *            rule.
     *            </p>
     *            <p>
     *            For information about the protocol value, see <a href=
     *            "https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml"
     *            >Protocol Numbers</a> on the Internet Assigned Numbers
     *            Authority (IANA) website.
     *            </p>
     */
    public void setProtocol(Integer protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol, for example UDP, to assign to the Traffic Mirror rule.
     * </p>
     * <p>
     * For information about the protocol value, see <a href=
     * "https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml"
     * >Protocol Numbers</a> on the Internet Assigned Numbers Authority (IANA)
     * website.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param protocol <p>
     *            The protocol, for example UDP, to assign to the Traffic Mirror
     *            rule.
     *            </p>
     *            <p>
     *            For information about the protocol value, see <a href=
     *            "https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml"
     *            >Protocol Numbers</a> on the Internet Assigned Numbers
     *            Authority (IANA) website.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrafficMirrorFilterRuleRequest withProtocol(Integer protocol) {
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
    public CreateTrafficMirrorFilterRuleRequest withDestinationCidrBlock(String destinationCidrBlock) {
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
    public CreateTrafficMirrorFilterRuleRequest withSourceCidrBlock(String sourceCidrBlock) {
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
    public CreateTrafficMirrorFilterRuleRequest withDescription(String description) {
        this.description = description;
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
    public CreateTrafficMirrorFilterRuleRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     *
     * @return <p>
     *         Unique, case-sensitive identifier that you provide to ensure the
     *         idempotency of the request. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *         >How to Ensure Idempotency</a>.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *            >How to Ensure Idempotency</a>.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *            >How to Ensure Idempotency</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrafficMirrorFilterRuleRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
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
        if (getTrafficMirrorFilterId() != null)
            sb.append("TrafficMirrorFilterId: " + getTrafficMirrorFilterId() + ",");
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
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTrafficMirrorFilterId() == null) ? 0 : getTrafficMirrorFilterId().hashCode());
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
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTrafficMirrorFilterRuleRequest == false)
            return false;
        CreateTrafficMirrorFilterRuleRequest other = (CreateTrafficMirrorFilterRuleRequest) obj;

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
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }
}
