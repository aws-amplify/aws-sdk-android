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

package com.amazonaws.services.guardduty.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about actions.
 * </p>
 */
public class Action implements Serializable {
    /**
     * <p>
     * The GuardDuty finding activity type.
     * </p>
     */
    private String actionType;

    /**
     * <p>
     * Information about the AWS_API_CALL action described in this finding.
     * </p>
     */
    private AwsApiCallAction awsApiCallAction;

    /**
     * <p>
     * Information about the DNS_REQUEST action described in this finding.
     * </p>
     */
    private DnsRequestAction dnsRequestAction;

    /**
     * <p>
     * Information about the NETWORK_CONNECTION action described in this
     * finding.
     * </p>
     */
    private NetworkConnectionAction networkConnectionAction;

    /**
     * <p>
     * Information about the PORT_PROBE action described in this finding.
     * </p>
     */
    private PortProbeAction portProbeAction;

    /**
     * <p>
     * The GuardDuty finding activity type.
     * </p>
     *
     * @return <p>
     *         The GuardDuty finding activity type.
     *         </p>
     */
    public String getActionType() {
        return actionType;
    }

    /**
     * <p>
     * The GuardDuty finding activity type.
     * </p>
     *
     * @param actionType <p>
     *            The GuardDuty finding activity type.
     *            </p>
     */
    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * <p>
     * The GuardDuty finding activity type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actionType <p>
     *            The GuardDuty finding activity type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * <p>
     * Information about the AWS_API_CALL action described in this finding.
     * </p>
     *
     * @return <p>
     *         Information about the AWS_API_CALL action described in this
     *         finding.
     *         </p>
     */
    public AwsApiCallAction getAwsApiCallAction() {
        return awsApiCallAction;
    }

    /**
     * <p>
     * Information about the AWS_API_CALL action described in this finding.
     * </p>
     *
     * @param awsApiCallAction <p>
     *            Information about the AWS_API_CALL action described in this
     *            finding.
     *            </p>
     */
    public void setAwsApiCallAction(AwsApiCallAction awsApiCallAction) {
        this.awsApiCallAction = awsApiCallAction;
    }

    /**
     * <p>
     * Information about the AWS_API_CALL action described in this finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsApiCallAction <p>
     *            Information about the AWS_API_CALL action described in this
     *            finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withAwsApiCallAction(AwsApiCallAction awsApiCallAction) {
        this.awsApiCallAction = awsApiCallAction;
        return this;
    }

    /**
     * <p>
     * Information about the DNS_REQUEST action described in this finding.
     * </p>
     *
     * @return <p>
     *         Information about the DNS_REQUEST action described in this
     *         finding.
     *         </p>
     */
    public DnsRequestAction getDnsRequestAction() {
        return dnsRequestAction;
    }

    /**
     * <p>
     * Information about the DNS_REQUEST action described in this finding.
     * </p>
     *
     * @param dnsRequestAction <p>
     *            Information about the DNS_REQUEST action described in this
     *            finding.
     *            </p>
     */
    public void setDnsRequestAction(DnsRequestAction dnsRequestAction) {
        this.dnsRequestAction = dnsRequestAction;
    }

    /**
     * <p>
     * Information about the DNS_REQUEST action described in this finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dnsRequestAction <p>
     *            Information about the DNS_REQUEST action described in this
     *            finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withDnsRequestAction(DnsRequestAction dnsRequestAction) {
        this.dnsRequestAction = dnsRequestAction;
        return this;
    }

    /**
     * <p>
     * Information about the NETWORK_CONNECTION action described in this
     * finding.
     * </p>
     *
     * @return <p>
     *         Information about the NETWORK_CONNECTION action described in this
     *         finding.
     *         </p>
     */
    public NetworkConnectionAction getNetworkConnectionAction() {
        return networkConnectionAction;
    }

    /**
     * <p>
     * Information about the NETWORK_CONNECTION action described in this
     * finding.
     * </p>
     *
     * @param networkConnectionAction <p>
     *            Information about the NETWORK_CONNECTION action described in
     *            this finding.
     *            </p>
     */
    public void setNetworkConnectionAction(NetworkConnectionAction networkConnectionAction) {
        this.networkConnectionAction = networkConnectionAction;
    }

    /**
     * <p>
     * Information about the NETWORK_CONNECTION action described in this
     * finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkConnectionAction <p>
     *            Information about the NETWORK_CONNECTION action described in
     *            this finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withNetworkConnectionAction(NetworkConnectionAction networkConnectionAction) {
        this.networkConnectionAction = networkConnectionAction;
        return this;
    }

    /**
     * <p>
     * Information about the PORT_PROBE action described in this finding.
     * </p>
     *
     * @return <p>
     *         Information about the PORT_PROBE action described in this
     *         finding.
     *         </p>
     */
    public PortProbeAction getPortProbeAction() {
        return portProbeAction;
    }

    /**
     * <p>
     * Information about the PORT_PROBE action described in this finding.
     * </p>
     *
     * @param portProbeAction <p>
     *            Information about the PORT_PROBE action described in this
     *            finding.
     *            </p>
     */
    public void setPortProbeAction(PortProbeAction portProbeAction) {
        this.portProbeAction = portProbeAction;
    }

    /**
     * <p>
     * Information about the PORT_PROBE action described in this finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param portProbeAction <p>
     *            Information about the PORT_PROBE action described in this
     *            finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withPortProbeAction(PortProbeAction portProbeAction) {
        this.portProbeAction = portProbeAction;
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
        if (getActionType() != null)
            sb.append("ActionType: " + getActionType() + ",");
        if (getAwsApiCallAction() != null)
            sb.append("AwsApiCallAction: " + getAwsApiCallAction() + ",");
        if (getDnsRequestAction() != null)
            sb.append("DnsRequestAction: " + getDnsRequestAction() + ",");
        if (getNetworkConnectionAction() != null)
            sb.append("NetworkConnectionAction: " + getNetworkConnectionAction() + ",");
        if (getPortProbeAction() != null)
            sb.append("PortProbeAction: " + getPortProbeAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionType() == null) ? 0 : getActionType().hashCode());
        hashCode = prime * hashCode
                + ((getAwsApiCallAction() == null) ? 0 : getAwsApiCallAction().hashCode());
        hashCode = prime * hashCode
                + ((getDnsRequestAction() == null) ? 0 : getDnsRequestAction().hashCode());
        hashCode = prime
                * hashCode
                + ((getNetworkConnectionAction() == null) ? 0 : getNetworkConnectionAction()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getPortProbeAction() == null) ? 0 : getPortProbeAction().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Action == false)
            return false;
        Action other = (Action) obj;

        if (other.getActionType() == null ^ this.getActionType() == null)
            return false;
        if (other.getActionType() != null
                && other.getActionType().equals(this.getActionType()) == false)
            return false;
        if (other.getAwsApiCallAction() == null ^ this.getAwsApiCallAction() == null)
            return false;
        if (other.getAwsApiCallAction() != null
                && other.getAwsApiCallAction().equals(this.getAwsApiCallAction()) == false)
            return false;
        if (other.getDnsRequestAction() == null ^ this.getDnsRequestAction() == null)
            return false;
        if (other.getDnsRequestAction() != null
                && other.getDnsRequestAction().equals(this.getDnsRequestAction()) == false)
            return false;
        if (other.getNetworkConnectionAction() == null ^ this.getNetworkConnectionAction() == null)
            return false;
        if (other.getNetworkConnectionAction() != null
                && other.getNetworkConnectionAction().equals(this.getNetworkConnectionAction()) == false)
            return false;
        if (other.getPortProbeAction() == null ^ this.getPortProbeAction() == null)
            return false;
        if (other.getPortProbeAction() != null
                && other.getPortProbeAction().equals(this.getPortProbeAction()) == false)
            return false;
        return true;
    }
}
