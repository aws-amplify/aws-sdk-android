/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the traffic distribution for a given traffic distribution group.
 * </p>
 * <note>
 * <p>
 * You can change the <code>SignInConfig</code> only for a default
 * <code>TrafficDistributionGroup</code>. If you call
 * <code>UpdateTrafficDistribution</code> with a modified
 * <code>SignInConfig</code> and a non-default
 * <code>TrafficDistributionGroup</code>, an
 * <code>InvalidRequestException</code> is returned.
 * </p>
 * </note>
 * <p>
 * For more information about updating a traffic distribution group, see <a
 * href=
 * "https://docs.aws.amazon.com/connect/latest/adminguide/update-telephony-traffic-distribution.html"
 * >Update telephony traffic distribution across Amazon Web Services Regions
 * </a> in the <i>Amazon Connect Administrator Guide</i>.
 * </p>
 */
public class UpdateTrafficDistributionRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The identifier of the traffic distribution group. This can be the ID or
     * the ARN if the API is being called in the Region where the traffic
     * distribution group was created. The ARN must be provided if the call is
     * from the replicated Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^(arn:(aws|aws-us-gov):connect:[a-z]{2}-[a-z-]+-[0-9]{1}:[
     * 0-9]{1,20}:traffic
     * -distribution-group/)?[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4
     * }-[a-f0-9]{4}-[a-f0-9]{12}$<br/>
     */
    private String id;

    /**
     * <p>
     * The distribution of traffic between the instance and its replica(s).
     * </p>
     */
    private TelephonyConfig telephonyConfig;

    /**
     * <p>
     * The distribution of allowing signing in to the instance and its
     * replica(s).
     * </p>
     */
    private SignInConfig signInConfig;

    /**
     * <p>
     * The distribution of agents between the instance and its replica(s).
     * </p>
     */
    private AgentConfig agentConfig;

    /**
     * <p>
     * The identifier of the traffic distribution group. This can be the ID or
     * the ARN if the API is being called in the Region where the traffic
     * distribution group was created. The ARN must be provided if the call is
     * from the replicated Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^(arn:(aws|aws-us-gov):connect:[a-z]{2}-[a-z-]+-[0-9]{1}:[
     * 0-9]{1,20}:traffic
     * -distribution-group/)?[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4
     * }-[a-f0-9]{4}-[a-f0-9]{12}$<br/>
     *
     * @return <p>
     *         The identifier of the traffic distribution group. This can be the
     *         ID or the ARN if the API is being called in the Region where the
     *         traffic distribution group was created. The ARN must be provided
     *         if the call is from the replicated Region.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier of the traffic distribution group. This can be the ID or
     * the ARN if the API is being called in the Region where the traffic
     * distribution group was created. The ARN must be provided if the call is
     * from the replicated Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^(arn:(aws|aws-us-gov):connect:[a-z]{2}-[a-z-]+-[0-9]{1}:[
     * 0-9]{1,20}:traffic
     * -distribution-group/)?[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4
     * }-[a-f0-9]{4}-[a-f0-9]{12}$<br/>
     *
     * @param id <p>
     *            The identifier of the traffic distribution group. This can be
     *            the ID or the ARN if the API is being called in the Region
     *            where the traffic distribution group was created. The ARN must
     *            be provided if the call is from the replicated Region.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the traffic distribution group. This can be the ID or
     * the ARN if the API is being called in the Region where the traffic
     * distribution group was created. The ARN must be provided if the call is
     * from the replicated Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^(arn:(aws|aws-us-gov):connect:[a-z]{2}-[a-z-]+-[0-9]{1}:[
     * 0-9]{1,20}:traffic
     * -distribution-group/)?[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4
     * }-[a-f0-9]{4}-[a-f0-9]{12}$<br/>
     *
     * @param id <p>
     *            The identifier of the traffic distribution group. This can be
     *            the ID or the ARN if the API is being called in the Region
     *            where the traffic distribution group was created. The ARN must
     *            be provided if the call is from the replicated Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTrafficDistributionRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The distribution of traffic between the instance and its replica(s).
     * </p>
     *
     * @return <p>
     *         The distribution of traffic between the instance and its
     *         replica(s).
     *         </p>
     */
    public TelephonyConfig getTelephonyConfig() {
        return telephonyConfig;
    }

    /**
     * <p>
     * The distribution of traffic between the instance and its replica(s).
     * </p>
     *
     * @param telephonyConfig <p>
     *            The distribution of traffic between the instance and its
     *            replica(s).
     *            </p>
     */
    public void setTelephonyConfig(TelephonyConfig telephonyConfig) {
        this.telephonyConfig = telephonyConfig;
    }

    /**
     * <p>
     * The distribution of traffic between the instance and its replica(s).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param telephonyConfig <p>
     *            The distribution of traffic between the instance and its
     *            replica(s).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTrafficDistributionRequest withTelephonyConfig(TelephonyConfig telephonyConfig) {
        this.telephonyConfig = telephonyConfig;
        return this;
    }

    /**
     * <p>
     * The distribution of allowing signing in to the instance and its
     * replica(s).
     * </p>
     *
     * @return <p>
     *         The distribution of allowing signing in to the instance and its
     *         replica(s).
     *         </p>
     */
    public SignInConfig getSignInConfig() {
        return signInConfig;
    }

    /**
     * <p>
     * The distribution of allowing signing in to the instance and its
     * replica(s).
     * </p>
     *
     * @param signInConfig <p>
     *            The distribution of allowing signing in to the instance and
     *            its replica(s).
     *            </p>
     */
    public void setSignInConfig(SignInConfig signInConfig) {
        this.signInConfig = signInConfig;
    }

    /**
     * <p>
     * The distribution of allowing signing in to the instance and its
     * replica(s).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param signInConfig <p>
     *            The distribution of allowing signing in to the instance and
     *            its replica(s).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTrafficDistributionRequest withSignInConfig(SignInConfig signInConfig) {
        this.signInConfig = signInConfig;
        return this;
    }

    /**
     * <p>
     * The distribution of agents between the instance and its replica(s).
     * </p>
     *
     * @return <p>
     *         The distribution of agents between the instance and its
     *         replica(s).
     *         </p>
     */
    public AgentConfig getAgentConfig() {
        return agentConfig;
    }

    /**
     * <p>
     * The distribution of agents between the instance and its replica(s).
     * </p>
     *
     * @param agentConfig <p>
     *            The distribution of agents between the instance and its
     *            replica(s).
     *            </p>
     */
    public void setAgentConfig(AgentConfig agentConfig) {
        this.agentConfig = agentConfig;
    }

    /**
     * <p>
     * The distribution of agents between the instance and its replica(s).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param agentConfig <p>
     *            The distribution of agents between the instance and its
     *            replica(s).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTrafficDistributionRequest withAgentConfig(AgentConfig agentConfig) {
        this.agentConfig = agentConfig;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getTelephonyConfig() != null)
            sb.append("TelephonyConfig: " + getTelephonyConfig() + ",");
        if (getSignInConfig() != null)
            sb.append("SignInConfig: " + getSignInConfig() + ",");
        if (getAgentConfig() != null)
            sb.append("AgentConfig: " + getAgentConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getTelephonyConfig() == null) ? 0 : getTelephonyConfig().hashCode());
        hashCode = prime * hashCode
                + ((getSignInConfig() == null) ? 0 : getSignInConfig().hashCode());
        hashCode = prime * hashCode
                + ((getAgentConfig() == null) ? 0 : getAgentConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTrafficDistributionRequest == false)
            return false;
        UpdateTrafficDistributionRequest other = (UpdateTrafficDistributionRequest) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getTelephonyConfig() == null ^ this.getTelephonyConfig() == null)
            return false;
        if (other.getTelephonyConfig() != null
                && other.getTelephonyConfig().equals(this.getTelephonyConfig()) == false)
            return false;
        if (other.getSignInConfig() == null ^ this.getSignInConfig() == null)
            return false;
        if (other.getSignInConfig() != null
                && other.getSignInConfig().equals(this.getSignInConfig()) == false)
            return false;
        if (other.getAgentConfig() == null ^ this.getAgentConfig() == null)
            return false;
        if (other.getAgentConfig() != null
                && other.getAgentConfig().equals(this.getAgentConfig()) == false)
            return false;
        return true;
    }
}
