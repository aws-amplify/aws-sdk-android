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
 * Describes the Traffic Mirror filter.
 * </p>
 */
public class TrafficMirrorFilter implements Serializable {
    /**
     * <p>
     * The ID of the Traffic Mirror filter.
     * </p>
     */
    private String trafficMirrorFilterId;

    /**
     * <p>
     * Information about the ingress rules that are associated with the Traffic
     * Mirror filter.
     * </p>
     */
    private java.util.List<TrafficMirrorFilterRule> ingressFilterRules;

    /**
     * <p>
     * Information about the egress rules that are associated with the Traffic
     * Mirror filter.
     * </p>
     */
    private java.util.List<TrafficMirrorFilterRule> egressFilterRules;

    /**
     * <p>
     * The network service traffic that is associated with the Traffic Mirror
     * filter.
     * </p>
     */
    private java.util.List<String> networkServices;

    /**
     * <p>
     * The description of the Traffic Mirror filter.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The tags assigned to the Traffic Mirror filter.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of the Traffic Mirror filter.
     * </p>
     *
     * @return <p>
     *         The ID of the Traffic Mirror filter.
     *         </p>
     */
    public String getTrafficMirrorFilterId() {
        return trafficMirrorFilterId;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror filter.
     * </p>
     *
     * @param trafficMirrorFilterId <p>
     *            The ID of the Traffic Mirror filter.
     *            </p>
     */
    public void setTrafficMirrorFilterId(String trafficMirrorFilterId) {
        this.trafficMirrorFilterId = trafficMirrorFilterId;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trafficMirrorFilterId <p>
     *            The ID of the Traffic Mirror filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficMirrorFilter withTrafficMirrorFilterId(String trafficMirrorFilterId) {
        this.trafficMirrorFilterId = trafficMirrorFilterId;
        return this;
    }

    /**
     * <p>
     * Information about the ingress rules that are associated with the Traffic
     * Mirror filter.
     * </p>
     *
     * @return <p>
     *         Information about the ingress rules that are associated with the
     *         Traffic Mirror filter.
     *         </p>
     */
    public java.util.List<TrafficMirrorFilterRule> getIngressFilterRules() {
        return ingressFilterRules;
    }

    /**
     * <p>
     * Information about the ingress rules that are associated with the Traffic
     * Mirror filter.
     * </p>
     *
     * @param ingressFilterRules <p>
     *            Information about the ingress rules that are associated with
     *            the Traffic Mirror filter.
     *            </p>
     */
    public void setIngressFilterRules(
            java.util.Collection<TrafficMirrorFilterRule> ingressFilterRules) {
        if (ingressFilterRules == null) {
            this.ingressFilterRules = null;
            return;
        }

        this.ingressFilterRules = new java.util.ArrayList<TrafficMirrorFilterRule>(
                ingressFilterRules);
    }

    /**
     * <p>
     * Information about the ingress rules that are associated with the Traffic
     * Mirror filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ingressFilterRules <p>
     *            Information about the ingress rules that are associated with
     *            the Traffic Mirror filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficMirrorFilter withIngressFilterRules(TrafficMirrorFilterRule... ingressFilterRules) {
        if (getIngressFilterRules() == null) {
            this.ingressFilterRules = new java.util.ArrayList<TrafficMirrorFilterRule>(
                    ingressFilterRules.length);
        }
        for (TrafficMirrorFilterRule value : ingressFilterRules) {
            this.ingressFilterRules.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the ingress rules that are associated with the Traffic
     * Mirror filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ingressFilterRules <p>
     *            Information about the ingress rules that are associated with
     *            the Traffic Mirror filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficMirrorFilter withIngressFilterRules(
            java.util.Collection<TrafficMirrorFilterRule> ingressFilterRules) {
        setIngressFilterRules(ingressFilterRules);
        return this;
    }

    /**
     * <p>
     * Information about the egress rules that are associated with the Traffic
     * Mirror filter.
     * </p>
     *
     * @return <p>
     *         Information about the egress rules that are associated with the
     *         Traffic Mirror filter.
     *         </p>
     */
    public java.util.List<TrafficMirrorFilterRule> getEgressFilterRules() {
        return egressFilterRules;
    }

    /**
     * <p>
     * Information about the egress rules that are associated with the Traffic
     * Mirror filter.
     * </p>
     *
     * @param egressFilterRules <p>
     *            Information about the egress rules that are associated with
     *            the Traffic Mirror filter.
     *            </p>
     */
    public void setEgressFilterRules(java.util.Collection<TrafficMirrorFilterRule> egressFilterRules) {
        if (egressFilterRules == null) {
            this.egressFilterRules = null;
            return;
        }

        this.egressFilterRules = new java.util.ArrayList<TrafficMirrorFilterRule>(egressFilterRules);
    }

    /**
     * <p>
     * Information about the egress rules that are associated with the Traffic
     * Mirror filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param egressFilterRules <p>
     *            Information about the egress rules that are associated with
     *            the Traffic Mirror filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficMirrorFilter withEgressFilterRules(TrafficMirrorFilterRule... egressFilterRules) {
        if (getEgressFilterRules() == null) {
            this.egressFilterRules = new java.util.ArrayList<TrafficMirrorFilterRule>(
                    egressFilterRules.length);
        }
        for (TrafficMirrorFilterRule value : egressFilterRules) {
            this.egressFilterRules.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the egress rules that are associated with the Traffic
     * Mirror filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param egressFilterRules <p>
     *            Information about the egress rules that are associated with
     *            the Traffic Mirror filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficMirrorFilter withEgressFilterRules(
            java.util.Collection<TrafficMirrorFilterRule> egressFilterRules) {
        setEgressFilterRules(egressFilterRules);
        return this;
    }

    /**
     * <p>
     * The network service traffic that is associated with the Traffic Mirror
     * filter.
     * </p>
     *
     * @return <p>
     *         The network service traffic that is associated with the Traffic
     *         Mirror filter.
     *         </p>
     */
    public java.util.List<String> getNetworkServices() {
        return networkServices;
    }

    /**
     * <p>
     * The network service traffic that is associated with the Traffic Mirror
     * filter.
     * </p>
     *
     * @param networkServices <p>
     *            The network service traffic that is associated with the
     *            Traffic Mirror filter.
     *            </p>
     */
    public void setNetworkServices(java.util.Collection<String> networkServices) {
        if (networkServices == null) {
            this.networkServices = null;
            return;
        }

        this.networkServices = new java.util.ArrayList<String>(networkServices);
    }

    /**
     * <p>
     * The network service traffic that is associated with the Traffic Mirror
     * filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkServices <p>
     *            The network service traffic that is associated with the
     *            Traffic Mirror filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficMirrorFilter withNetworkServices(String... networkServices) {
        if (getNetworkServices() == null) {
            this.networkServices = new java.util.ArrayList<String>(networkServices.length);
        }
        for (String value : networkServices) {
            this.networkServices.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The network service traffic that is associated with the Traffic Mirror
     * filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkServices <p>
     *            The network service traffic that is associated with the
     *            Traffic Mirror filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficMirrorFilter withNetworkServices(java.util.Collection<String> networkServices) {
        setNetworkServices(networkServices);
        return this;
    }

    /**
     * <p>
     * The description of the Traffic Mirror filter.
     * </p>
     *
     * @return <p>
     *         The description of the Traffic Mirror filter.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the Traffic Mirror filter.
     * </p>
     *
     * @param description <p>
     *            The description of the Traffic Mirror filter.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the Traffic Mirror filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the Traffic Mirror filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficMirrorFilter withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The tags assigned to the Traffic Mirror filter.
     * </p>
     *
     * @return <p>
     *         The tags assigned to the Traffic Mirror filter.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the Traffic Mirror filter.
     * </p>
     *
     * @param tags <p>
     *            The tags assigned to the Traffic Mirror filter.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags assigned to the Traffic Mirror filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags assigned to the Traffic Mirror filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficMirrorFilter withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tags assigned to the Traffic Mirror filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags assigned to the Traffic Mirror filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficMirrorFilter withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getIngressFilterRules() != null)
            sb.append("IngressFilterRules: " + getIngressFilterRules() + ",");
        if (getEgressFilterRules() != null)
            sb.append("EgressFilterRules: " + getEgressFilterRules() + ",");
        if (getNetworkServices() != null)
            sb.append("NetworkServices: " + getNetworkServices() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
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
                + ((getIngressFilterRules() == null) ? 0 : getIngressFilterRules().hashCode());
        hashCode = prime * hashCode
                + ((getEgressFilterRules() == null) ? 0 : getEgressFilterRules().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkServices() == null) ? 0 : getNetworkServices().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrafficMirrorFilter == false)
            return false;
        TrafficMirrorFilter other = (TrafficMirrorFilter) obj;

        if (other.getTrafficMirrorFilterId() == null ^ this.getTrafficMirrorFilterId() == null)
            return false;
        if (other.getTrafficMirrorFilterId() != null
                && other.getTrafficMirrorFilterId().equals(this.getTrafficMirrorFilterId()) == false)
            return false;
        if (other.getIngressFilterRules() == null ^ this.getIngressFilterRules() == null)
            return false;
        if (other.getIngressFilterRules() != null
                && other.getIngressFilterRules().equals(this.getIngressFilterRules()) == false)
            return false;
        if (other.getEgressFilterRules() == null ^ this.getEgressFilterRules() == null)
            return false;
        if (other.getEgressFilterRules() != null
                && other.getEgressFilterRules().equals(this.getEgressFilterRules()) == false)
            return false;
        if (other.getNetworkServices() == null ^ this.getNetworkServices() == null)
            return false;
        if (other.getNetworkServices() != null
                && other.getNetworkServices().equals(this.getNetworkServices()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
