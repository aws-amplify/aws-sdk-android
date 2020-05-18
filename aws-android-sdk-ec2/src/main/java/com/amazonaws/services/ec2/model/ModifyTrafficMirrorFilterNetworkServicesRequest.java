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
 * Allows or restricts mirroring network services.
 * </p>
 * <p>
 * By default, Amazon DNS network services are not eligible for Traffic Mirror.
 * Use <code>AddNetworkServices</code> to add network services to a Traffic
 * Mirror filter. When a network service is added to the Traffic Mirror filter,
 * all traffic related to that network service will be mirrored. When you no
 * longer want to mirror network services, use
 * <code>RemoveNetworkServices</code> to remove the network services from the
 * Traffic Mirror filter.
 * </p>
 * <p>
 * For information about filter rule properties, see <a href=
 * "https://docs.aws.amazon.com/vpc/latest/mirroring/traffic-mirroring-considerations.html"
 * >Network Services</a> in the <i>Traffic Mirroring User Guide </i>.
 * </p>
 */
public class ModifyTrafficMirrorFilterNetworkServicesRequest extends AmazonWebServiceRequest
        implements Serializable {
    /**
     * <p>
     * The ID of the Traffic Mirror filter.
     * </p>
     */
    private String trafficMirrorFilterId;

    /**
     * <p>
     * The network service, for example Amazon DNS, that you want to mirror.
     * </p>
     */
    private java.util.List<String> addNetworkServices;

    /**
     * <p>
     * The network service, for example Amazon DNS, that you no longer want to
     * mirror.
     * </p>
     */
    private java.util.List<String> removeNetworkServices;

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
    public ModifyTrafficMirrorFilterNetworkServicesRequest withTrafficMirrorFilterId(
            String trafficMirrorFilterId) {
        this.trafficMirrorFilterId = trafficMirrorFilterId;
        return this;
    }

    /**
     * <p>
     * The network service, for example Amazon DNS, that you want to mirror.
     * </p>
     *
     * @return <p>
     *         The network service, for example Amazon DNS, that you want to
     *         mirror.
     *         </p>
     */
    public java.util.List<String> getAddNetworkServices() {
        return addNetworkServices;
    }

    /**
     * <p>
     * The network service, for example Amazon DNS, that you want to mirror.
     * </p>
     *
     * @param addNetworkServices <p>
     *            The network service, for example Amazon DNS, that you want to
     *            mirror.
     *            </p>
     */
    public void setAddNetworkServices(java.util.Collection<String> addNetworkServices) {
        if (addNetworkServices == null) {
            this.addNetworkServices = null;
            return;
        }

        this.addNetworkServices = new java.util.ArrayList<String>(addNetworkServices);
    }

    /**
     * <p>
     * The network service, for example Amazon DNS, that you want to mirror.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addNetworkServices <p>
     *            The network service, for example Amazon DNS, that you want to
     *            mirror.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyTrafficMirrorFilterNetworkServicesRequest withAddNetworkServices(
            String... addNetworkServices) {
        if (getAddNetworkServices() == null) {
            this.addNetworkServices = new java.util.ArrayList<String>(addNetworkServices.length);
        }
        for (String value : addNetworkServices) {
            this.addNetworkServices.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The network service, for example Amazon DNS, that you want to mirror.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addNetworkServices <p>
     *            The network service, for example Amazon DNS, that you want to
     *            mirror.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyTrafficMirrorFilterNetworkServicesRequest withAddNetworkServices(
            java.util.Collection<String> addNetworkServices) {
        setAddNetworkServices(addNetworkServices);
        return this;
    }

    /**
     * <p>
     * The network service, for example Amazon DNS, that you no longer want to
     * mirror.
     * </p>
     *
     * @return <p>
     *         The network service, for example Amazon DNS, that you no longer
     *         want to mirror.
     *         </p>
     */
    public java.util.List<String> getRemoveNetworkServices() {
        return removeNetworkServices;
    }

    /**
     * <p>
     * The network service, for example Amazon DNS, that you no longer want to
     * mirror.
     * </p>
     *
     * @param removeNetworkServices <p>
     *            The network service, for example Amazon DNS, that you no
     *            longer want to mirror.
     *            </p>
     */
    public void setRemoveNetworkServices(java.util.Collection<String> removeNetworkServices) {
        if (removeNetworkServices == null) {
            this.removeNetworkServices = null;
            return;
        }

        this.removeNetworkServices = new java.util.ArrayList<String>(removeNetworkServices);
    }

    /**
     * <p>
     * The network service, for example Amazon DNS, that you no longer want to
     * mirror.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param removeNetworkServices <p>
     *            The network service, for example Amazon DNS, that you no
     *            longer want to mirror.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyTrafficMirrorFilterNetworkServicesRequest withRemoveNetworkServices(
            String... removeNetworkServices) {
        if (getRemoveNetworkServices() == null) {
            this.removeNetworkServices = new java.util.ArrayList<String>(
                    removeNetworkServices.length);
        }
        for (String value : removeNetworkServices) {
            this.removeNetworkServices.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The network service, for example Amazon DNS, that you no longer want to
     * mirror.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param removeNetworkServices <p>
     *            The network service, for example Amazon DNS, that you no
     *            longer want to mirror.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyTrafficMirrorFilterNetworkServicesRequest withRemoveNetworkServices(
            java.util.Collection<String> removeNetworkServices) {
        setRemoveNetworkServices(removeNetworkServices);
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
    public ModifyTrafficMirrorFilterNetworkServicesRequest withDryRun(Boolean dryRun) {
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
        if (getTrafficMirrorFilterId() != null)
            sb.append("TrafficMirrorFilterId: " + getTrafficMirrorFilterId() + ",");
        if (getAddNetworkServices() != null)
            sb.append("AddNetworkServices: " + getAddNetworkServices() + ",");
        if (getRemoveNetworkServices() != null)
            sb.append("RemoveNetworkServices: " + getRemoveNetworkServices() + ",");
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
                + ((getTrafficMirrorFilterId() == null) ? 0 : getTrafficMirrorFilterId().hashCode());
        hashCode = prime * hashCode
                + ((getAddNetworkServices() == null) ? 0 : getAddNetworkServices().hashCode());
        hashCode = prime
                * hashCode
                + ((getRemoveNetworkServices() == null) ? 0 : getRemoveNetworkServices().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyTrafficMirrorFilterNetworkServicesRequest == false)
            return false;
        ModifyTrafficMirrorFilterNetworkServicesRequest other = (ModifyTrafficMirrorFilterNetworkServicesRequest) obj;

        if (other.getTrafficMirrorFilterId() == null ^ this.getTrafficMirrorFilterId() == null)
            return false;
        if (other.getTrafficMirrorFilterId() != null
                && other.getTrafficMirrorFilterId().equals(this.getTrafficMirrorFilterId()) == false)
            return false;
        if (other.getAddNetworkServices() == null ^ this.getAddNetworkServices() == null)
            return false;
        if (other.getAddNetworkServices() != null
                && other.getAddNetworkServices().equals(this.getAddNetworkServices()) == false)
            return false;
        if (other.getRemoveNetworkServices() == null ^ this.getRemoveNetworkServices() == null)
            return false;
        if (other.getRemoveNetworkServices() != null
                && other.getRemoveNetworkServices().equals(this.getRemoveNetworkServices()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
