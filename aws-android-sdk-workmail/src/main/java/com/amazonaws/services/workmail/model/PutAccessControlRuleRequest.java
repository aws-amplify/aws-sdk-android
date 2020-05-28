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

package com.amazonaws.services.workmail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Adds a new access control rule for the specified organization. The rule
 * allows or denies access to the organization for the specified IPv4 addresses,
 * access protocol actions, and user IDs. Adding a new rule with the same name
 * as an existing rule replaces the older rule.
 * </p>
 */
public class PutAccessControlRuleRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The rule name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     */
    private String name;

    /**
     * <p>
     * The rule effect.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW, DENY
     */
    private String effect;

    /**
     * <p>
     * The rule description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     */
    private String description;

    /**
     * <p>
     * IPv4 CIDR ranges to include in the rule.
     * </p>
     */
    private java.util.List<String> ipRanges;

    /**
     * <p>
     * IPv4 CIDR ranges to exclude from the rule.
     * </p>
     */
    private java.util.List<String> notIpRanges;

    /**
     * <p>
     * Access protocol actions to include in the rule. Valid values include
     * <code>ActiveSync</code>, <code>AutoDiscover</code>, <code>EWS</code>,
     * <code>IMAP</code>, <code>SMTP</code>, <code>WindowsOutlook</code>, and
     * <code>WebMail</code>.
     * </p>
     */
    private java.util.List<String> actions;

    /**
     * <p>
     * Access protocol actions to exclude from the rule. Valid values include
     * <code>ActiveSync</code>, <code>AutoDiscover</code>, <code>EWS</code>,
     * <code>IMAP</code>, <code>SMTP</code>, <code>WindowsOutlook</code>, and
     * <code>WebMail</code>.
     * </p>
     */
    private java.util.List<String> notActions;

    /**
     * <p>
     * User IDs to include in the rule.
     * </p>
     */
    private java.util.List<String> userIds;

    /**
     * <p>
     * User IDs to exclude from the rule.
     * </p>
     */
    private java.util.List<String> notUserIds;

    /**
     * <p>
     * The identifier of the organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^m-[0-9a-f]{32}$<br/>
     */
    private String organizationId;

    /**
     * <p>
     * The rule name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @return <p>
     *         The rule name.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The rule name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param name <p>
     *            The rule name.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The rule name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param name <p>
     *            The rule name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutAccessControlRuleRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The rule effect.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW, DENY
     *
     * @return <p>
     *         The rule effect.
     *         </p>
     * @see AccessControlRuleEffect
     */
    public String getEffect() {
        return effect;
    }

    /**
     * <p>
     * The rule effect.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW, DENY
     *
     * @param effect <p>
     *            The rule effect.
     *            </p>
     * @see AccessControlRuleEffect
     */
    public void setEffect(String effect) {
        this.effect = effect;
    }

    /**
     * <p>
     * The rule effect.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW, DENY
     *
     * @param effect <p>
     *            The rule effect.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AccessControlRuleEffect
     */
    public PutAccessControlRuleRequest withEffect(String effect) {
        this.effect = effect;
        return this;
    }

    /**
     * <p>
     * The rule effect.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW, DENY
     *
     * @param effect <p>
     *            The rule effect.
     *            </p>
     * @see AccessControlRuleEffect
     */
    public void setEffect(AccessControlRuleEffect effect) {
        this.effect = effect.toString();
    }

    /**
     * <p>
     * The rule effect.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW, DENY
     *
     * @param effect <p>
     *            The rule effect.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AccessControlRuleEffect
     */
    public PutAccessControlRuleRequest withEffect(AccessControlRuleEffect effect) {
        this.effect = effect.toString();
        return this;
    }

    /**
     * <p>
     * The rule description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @return <p>
     *         The rule description.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The rule description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param description <p>
     *            The rule description.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The rule description.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param description <p>
     *            The rule description.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutAccessControlRuleRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * IPv4 CIDR ranges to include in the rule.
     * </p>
     *
     * @return <p>
     *         IPv4 CIDR ranges to include in the rule.
     *         </p>
     */
    public java.util.List<String> getIpRanges() {
        return ipRanges;
    }

    /**
     * <p>
     * IPv4 CIDR ranges to include in the rule.
     * </p>
     *
     * @param ipRanges <p>
     *            IPv4 CIDR ranges to include in the rule.
     *            </p>
     */
    public void setIpRanges(java.util.Collection<String> ipRanges) {
        if (ipRanges == null) {
            this.ipRanges = null;
            return;
        }

        this.ipRanges = new java.util.ArrayList<String>(ipRanges);
    }

    /**
     * <p>
     * IPv4 CIDR ranges to include in the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipRanges <p>
     *            IPv4 CIDR ranges to include in the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutAccessControlRuleRequest withIpRanges(String... ipRanges) {
        if (getIpRanges() == null) {
            this.ipRanges = new java.util.ArrayList<String>(ipRanges.length);
        }
        for (String value : ipRanges) {
            this.ipRanges.add(value);
        }
        return this;
    }

    /**
     * <p>
     * IPv4 CIDR ranges to include in the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipRanges <p>
     *            IPv4 CIDR ranges to include in the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutAccessControlRuleRequest withIpRanges(java.util.Collection<String> ipRanges) {
        setIpRanges(ipRanges);
        return this;
    }

    /**
     * <p>
     * IPv4 CIDR ranges to exclude from the rule.
     * </p>
     *
     * @return <p>
     *         IPv4 CIDR ranges to exclude from the rule.
     *         </p>
     */
    public java.util.List<String> getNotIpRanges() {
        return notIpRanges;
    }

    /**
     * <p>
     * IPv4 CIDR ranges to exclude from the rule.
     * </p>
     *
     * @param notIpRanges <p>
     *            IPv4 CIDR ranges to exclude from the rule.
     *            </p>
     */
    public void setNotIpRanges(java.util.Collection<String> notIpRanges) {
        if (notIpRanges == null) {
            this.notIpRanges = null;
            return;
        }

        this.notIpRanges = new java.util.ArrayList<String>(notIpRanges);
    }

    /**
     * <p>
     * IPv4 CIDR ranges to exclude from the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notIpRanges <p>
     *            IPv4 CIDR ranges to exclude from the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutAccessControlRuleRequest withNotIpRanges(String... notIpRanges) {
        if (getNotIpRanges() == null) {
            this.notIpRanges = new java.util.ArrayList<String>(notIpRanges.length);
        }
        for (String value : notIpRanges) {
            this.notIpRanges.add(value);
        }
        return this;
    }

    /**
     * <p>
     * IPv4 CIDR ranges to exclude from the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notIpRanges <p>
     *            IPv4 CIDR ranges to exclude from the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutAccessControlRuleRequest withNotIpRanges(java.util.Collection<String> notIpRanges) {
        setNotIpRanges(notIpRanges);
        return this;
    }

    /**
     * <p>
     * Access protocol actions to include in the rule. Valid values include
     * <code>ActiveSync</code>, <code>AutoDiscover</code>, <code>EWS</code>,
     * <code>IMAP</code>, <code>SMTP</code>, <code>WindowsOutlook</code>, and
     * <code>WebMail</code>.
     * </p>
     *
     * @return <p>
     *         Access protocol actions to include in the rule. Valid values
     *         include <code>ActiveSync</code>, <code>AutoDiscover</code>,
     *         <code>EWS</code>, <code>IMAP</code>, <code>SMTP</code>,
     *         <code>WindowsOutlook</code>, and <code>WebMail</code>.
     *         </p>
     */
    public java.util.List<String> getActions() {
        return actions;
    }

    /**
     * <p>
     * Access protocol actions to include in the rule. Valid values include
     * <code>ActiveSync</code>, <code>AutoDiscover</code>, <code>EWS</code>,
     * <code>IMAP</code>, <code>SMTP</code>, <code>WindowsOutlook</code>, and
     * <code>WebMail</code>.
     * </p>
     *
     * @param actions <p>
     *            Access protocol actions to include in the rule. Valid values
     *            include <code>ActiveSync</code>, <code>AutoDiscover</code>,
     *            <code>EWS</code>, <code>IMAP</code>, <code>SMTP</code>,
     *            <code>WindowsOutlook</code>, and <code>WebMail</code>.
     *            </p>
     */
    public void setActions(java.util.Collection<String> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new java.util.ArrayList<String>(actions);
    }

    /**
     * <p>
     * Access protocol actions to include in the rule. Valid values include
     * <code>ActiveSync</code>, <code>AutoDiscover</code>, <code>EWS</code>,
     * <code>IMAP</code>, <code>SMTP</code>, <code>WindowsOutlook</code>, and
     * <code>WebMail</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actions <p>
     *            Access protocol actions to include in the rule. Valid values
     *            include <code>ActiveSync</code>, <code>AutoDiscover</code>,
     *            <code>EWS</code>, <code>IMAP</code>, <code>SMTP</code>,
     *            <code>WindowsOutlook</code>, and <code>WebMail</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutAccessControlRuleRequest withActions(String... actions) {
        if (getActions() == null) {
            this.actions = new java.util.ArrayList<String>(actions.length);
        }
        for (String value : actions) {
            this.actions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Access protocol actions to include in the rule. Valid values include
     * <code>ActiveSync</code>, <code>AutoDiscover</code>, <code>EWS</code>,
     * <code>IMAP</code>, <code>SMTP</code>, <code>WindowsOutlook</code>, and
     * <code>WebMail</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actions <p>
     *            Access protocol actions to include in the rule. Valid values
     *            include <code>ActiveSync</code>, <code>AutoDiscover</code>,
     *            <code>EWS</code>, <code>IMAP</code>, <code>SMTP</code>,
     *            <code>WindowsOutlook</code>, and <code>WebMail</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutAccessControlRuleRequest withActions(java.util.Collection<String> actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * Access protocol actions to exclude from the rule. Valid values include
     * <code>ActiveSync</code>, <code>AutoDiscover</code>, <code>EWS</code>,
     * <code>IMAP</code>, <code>SMTP</code>, <code>WindowsOutlook</code>, and
     * <code>WebMail</code>.
     * </p>
     *
     * @return <p>
     *         Access protocol actions to exclude from the rule. Valid values
     *         include <code>ActiveSync</code>, <code>AutoDiscover</code>,
     *         <code>EWS</code>, <code>IMAP</code>, <code>SMTP</code>,
     *         <code>WindowsOutlook</code>, and <code>WebMail</code>.
     *         </p>
     */
    public java.util.List<String> getNotActions() {
        return notActions;
    }

    /**
     * <p>
     * Access protocol actions to exclude from the rule. Valid values include
     * <code>ActiveSync</code>, <code>AutoDiscover</code>, <code>EWS</code>,
     * <code>IMAP</code>, <code>SMTP</code>, <code>WindowsOutlook</code>, and
     * <code>WebMail</code>.
     * </p>
     *
     * @param notActions <p>
     *            Access protocol actions to exclude from the rule. Valid values
     *            include <code>ActiveSync</code>, <code>AutoDiscover</code>,
     *            <code>EWS</code>, <code>IMAP</code>, <code>SMTP</code>,
     *            <code>WindowsOutlook</code>, and <code>WebMail</code>.
     *            </p>
     */
    public void setNotActions(java.util.Collection<String> notActions) {
        if (notActions == null) {
            this.notActions = null;
            return;
        }

        this.notActions = new java.util.ArrayList<String>(notActions);
    }

    /**
     * <p>
     * Access protocol actions to exclude from the rule. Valid values include
     * <code>ActiveSync</code>, <code>AutoDiscover</code>, <code>EWS</code>,
     * <code>IMAP</code>, <code>SMTP</code>, <code>WindowsOutlook</code>, and
     * <code>WebMail</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notActions <p>
     *            Access protocol actions to exclude from the rule. Valid values
     *            include <code>ActiveSync</code>, <code>AutoDiscover</code>,
     *            <code>EWS</code>, <code>IMAP</code>, <code>SMTP</code>,
     *            <code>WindowsOutlook</code>, and <code>WebMail</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutAccessControlRuleRequest withNotActions(String... notActions) {
        if (getNotActions() == null) {
            this.notActions = new java.util.ArrayList<String>(notActions.length);
        }
        for (String value : notActions) {
            this.notActions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Access protocol actions to exclude from the rule. Valid values include
     * <code>ActiveSync</code>, <code>AutoDiscover</code>, <code>EWS</code>,
     * <code>IMAP</code>, <code>SMTP</code>, <code>WindowsOutlook</code>, and
     * <code>WebMail</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notActions <p>
     *            Access protocol actions to exclude from the rule. Valid values
     *            include <code>ActiveSync</code>, <code>AutoDiscover</code>,
     *            <code>EWS</code>, <code>IMAP</code>, <code>SMTP</code>,
     *            <code>WindowsOutlook</code>, and <code>WebMail</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutAccessControlRuleRequest withNotActions(java.util.Collection<String> notActions) {
        setNotActions(notActions);
        return this;
    }

    /**
     * <p>
     * User IDs to include in the rule.
     * </p>
     *
     * @return <p>
     *         User IDs to include in the rule.
     *         </p>
     */
    public java.util.List<String> getUserIds() {
        return userIds;
    }

    /**
     * <p>
     * User IDs to include in the rule.
     * </p>
     *
     * @param userIds <p>
     *            User IDs to include in the rule.
     *            </p>
     */
    public void setUserIds(java.util.Collection<String> userIds) {
        if (userIds == null) {
            this.userIds = null;
            return;
        }

        this.userIds = new java.util.ArrayList<String>(userIds);
    }

    /**
     * <p>
     * User IDs to include in the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userIds <p>
     *            User IDs to include in the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutAccessControlRuleRequest withUserIds(String... userIds) {
        if (getUserIds() == null) {
            this.userIds = new java.util.ArrayList<String>(userIds.length);
        }
        for (String value : userIds) {
            this.userIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * User IDs to include in the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userIds <p>
     *            User IDs to include in the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutAccessControlRuleRequest withUserIds(java.util.Collection<String> userIds) {
        setUserIds(userIds);
        return this;
    }

    /**
     * <p>
     * User IDs to exclude from the rule.
     * </p>
     *
     * @return <p>
     *         User IDs to exclude from the rule.
     *         </p>
     */
    public java.util.List<String> getNotUserIds() {
        return notUserIds;
    }

    /**
     * <p>
     * User IDs to exclude from the rule.
     * </p>
     *
     * @param notUserIds <p>
     *            User IDs to exclude from the rule.
     *            </p>
     */
    public void setNotUserIds(java.util.Collection<String> notUserIds) {
        if (notUserIds == null) {
            this.notUserIds = null;
            return;
        }

        this.notUserIds = new java.util.ArrayList<String>(notUserIds);
    }

    /**
     * <p>
     * User IDs to exclude from the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notUserIds <p>
     *            User IDs to exclude from the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutAccessControlRuleRequest withNotUserIds(String... notUserIds) {
        if (getNotUserIds() == null) {
            this.notUserIds = new java.util.ArrayList<String>(notUserIds.length);
        }
        for (String value : notUserIds) {
            this.notUserIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * User IDs to exclude from the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notUserIds <p>
     *            User IDs to exclude from the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutAccessControlRuleRequest withNotUserIds(java.util.Collection<String> notUserIds) {
        setNotUserIds(notUserIds);
        return this;
    }

    /**
     * <p>
     * The identifier of the organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^m-[0-9a-f]{32}$<br/>
     *
     * @return <p>
     *         The identifier of the organization.
     *         </p>
     */
    public String getOrganizationId() {
        return organizationId;
    }

    /**
     * <p>
     * The identifier of the organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^m-[0-9a-f]{32}$<br/>
     *
     * @param organizationId <p>
     *            The identifier of the organization.
     *            </p>
     */
    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The identifier of the organization.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^m-[0-9a-f]{32}$<br/>
     *
     * @param organizationId <p>
     *            The identifier of the organization.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutAccessControlRuleRequest withOrganizationId(String organizationId) {
        this.organizationId = organizationId;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getEffect() != null)
            sb.append("Effect: " + getEffect() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getIpRanges() != null)
            sb.append("IpRanges: " + getIpRanges() + ",");
        if (getNotIpRanges() != null)
            sb.append("NotIpRanges: " + getNotIpRanges() + ",");
        if (getActions() != null)
            sb.append("Actions: " + getActions() + ",");
        if (getNotActions() != null)
            sb.append("NotActions: " + getNotActions() + ",");
        if (getUserIds() != null)
            sb.append("UserIds: " + getUserIds() + ",");
        if (getNotUserIds() != null)
            sb.append("NotUserIds: " + getNotUserIds() + ",");
        if (getOrganizationId() != null)
            sb.append("OrganizationId: " + getOrganizationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEffect() == null) ? 0 : getEffect().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIpRanges() == null) ? 0 : getIpRanges().hashCode());
        hashCode = prime * hashCode
                + ((getNotIpRanges() == null) ? 0 : getNotIpRanges().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode + ((getNotActions() == null) ? 0 : getNotActions().hashCode());
        hashCode = prime * hashCode + ((getUserIds() == null) ? 0 : getUserIds().hashCode());
        hashCode = prime * hashCode + ((getNotUserIds() == null) ? 0 : getNotUserIds().hashCode());
        hashCode = prime * hashCode
                + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutAccessControlRuleRequest == false)
            return false;
        PutAccessControlRuleRequest other = (PutAccessControlRuleRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getEffect() == null ^ this.getEffect() == null)
            return false;
        if (other.getEffect() != null && other.getEffect().equals(this.getEffect()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIpRanges() == null ^ this.getIpRanges() == null)
            return false;
        if (other.getIpRanges() != null && other.getIpRanges().equals(this.getIpRanges()) == false)
            return false;
        if (other.getNotIpRanges() == null ^ this.getNotIpRanges() == null)
            return false;
        if (other.getNotIpRanges() != null
                && other.getNotIpRanges().equals(this.getNotIpRanges()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        if (other.getNotActions() == null ^ this.getNotActions() == null)
            return false;
        if (other.getNotActions() != null
                && other.getNotActions().equals(this.getNotActions()) == false)
            return false;
        if (other.getUserIds() == null ^ this.getUserIds() == null)
            return false;
        if (other.getUserIds() != null && other.getUserIds().equals(this.getUserIds()) == false)
            return false;
        if (other.getNotUserIds() == null ^ this.getNotUserIds() == null)
            return false;
        if (other.getNotUserIds() != null
                && other.getNotUserIds().equals(this.getNotUserIds()) == false)
            return false;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null
                && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        return true;
    }
}
