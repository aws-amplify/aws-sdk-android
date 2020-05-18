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
 * Describes a VPC endpoint service.
 * </p>
 */
public class ServiceDetail implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service.
     * </p>
     */
    private String serviceName;

    /**
     * <p>
     * The ID of the endpoint service.
     * </p>
     */
    private String serviceId;

    /**
     * <p>
     * The type of service.
     * </p>
     */
    private java.util.List<ServiceTypeDetail> serviceType;

    /**
     * <p>
     * The Availability Zones in which the service is available.
     * </p>
     */
    private java.util.List<String> availabilityZones;

    /**
     * <p>
     * The AWS account ID of the service owner.
     * </p>
     */
    private String owner;

    /**
     * <p>
     * The DNS names for the service.
     * </p>
     */
    private java.util.List<String> baseEndpointDnsNames;

    /**
     * <p>
     * The private DNS name for the service.
     * </p>
     */
    private String privateDnsName;

    /**
     * <p>
     * Indicates whether the service supports endpoint policies.
     * </p>
     */
    private Boolean vpcEndpointPolicySupported;

    /**
     * <p>
     * Indicates whether VPC endpoint connection requests to the service must be
     * accepted by the service owner.
     * </p>
     */
    private Boolean acceptanceRequired;

    /**
     * <p>
     * Indicates whether the service manages its VPC endpoints. Management of
     * the service VPC endpoints using the VPC endpoint API is restricted.
     * </p>
     */
    private Boolean managesVpcEndpoints;

    /**
     * <p>
     * Any tags assigned to the service.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The verification state of the VPC endpoint service.
     * </p>
     * <p>
     * Consumers of the endpoint service cannot use the private name when the
     * state is not <code>verified</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pendingVerification, verified, failed
     */
    private String privateDnsNameVerificationState;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the service.
     *         </p>
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service.
     * </p>
     *
     * @param serviceName <p>
     *            The Amazon Resource Name (ARN) of the service.
     *            </p>
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceName <p>
     *            The Amazon Resource Name (ARN) of the service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceDetail withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * <p>
     * The ID of the endpoint service.
     * </p>
     *
     * @return <p>
     *         The ID of the endpoint service.
     *         </p>
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * <p>
     * The ID of the endpoint service.
     * </p>
     *
     * @param serviceId <p>
     *            The ID of the endpoint service.
     *            </p>
     */
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * <p>
     * The ID of the endpoint service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceId <p>
     *            The ID of the endpoint service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceDetail withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * <p>
     * The type of service.
     * </p>
     *
     * @return <p>
     *         The type of service.
     *         </p>
     */
    public java.util.List<ServiceTypeDetail> getServiceType() {
        return serviceType;
    }

    /**
     * <p>
     * The type of service.
     * </p>
     *
     * @param serviceType <p>
     *            The type of service.
     *            </p>
     */
    public void setServiceType(java.util.Collection<ServiceTypeDetail> serviceType) {
        if (serviceType == null) {
            this.serviceType = null;
            return;
        }

        this.serviceType = new java.util.ArrayList<ServiceTypeDetail>(serviceType);
    }

    /**
     * <p>
     * The type of service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceType <p>
     *            The type of service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceDetail withServiceType(ServiceTypeDetail... serviceType) {
        if (getServiceType() == null) {
            this.serviceType = new java.util.ArrayList<ServiceTypeDetail>(serviceType.length);
        }
        for (ServiceTypeDetail value : serviceType) {
            this.serviceType.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The type of service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceType <p>
     *            The type of service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceDetail withServiceType(java.util.Collection<ServiceTypeDetail> serviceType) {
        setServiceType(serviceType);
        return this;
    }

    /**
     * <p>
     * The Availability Zones in which the service is available.
     * </p>
     *
     * @return <p>
     *         The Availability Zones in which the service is available.
     *         </p>
     */
    public java.util.List<String> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * <p>
     * The Availability Zones in which the service is available.
     * </p>
     *
     * @param availabilityZones <p>
     *            The Availability Zones in which the service is available.
     *            </p>
     */
    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new java.util.ArrayList<String>(availabilityZones);
    }

    /**
     * <p>
     * The Availability Zones in which the service is available.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZones <p>
     *            The Availability Zones in which the service is available.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceDetail withAvailabilityZones(String... availabilityZones) {
        if (getAvailabilityZones() == null) {
            this.availabilityZones = new java.util.ArrayList<String>(availabilityZones.length);
        }
        for (String value : availabilityZones) {
            this.availabilityZones.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Availability Zones in which the service is available.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZones <p>
     *            The Availability Zones in which the service is available.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceDetail withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the service owner.
     * </p>
     *
     * @return <p>
     *         The AWS account ID of the service owner.
     *         </p>
     */
    public String getOwner() {
        return owner;
    }

    /**
     * <p>
     * The AWS account ID of the service owner.
     * </p>
     *
     * @param owner <p>
     *            The AWS account ID of the service owner.
     *            </p>
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The AWS account ID of the service owner.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param owner <p>
     *            The AWS account ID of the service owner.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceDetail withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * <p>
     * The DNS names for the service.
     * </p>
     *
     * @return <p>
     *         The DNS names for the service.
     *         </p>
     */
    public java.util.List<String> getBaseEndpointDnsNames() {
        return baseEndpointDnsNames;
    }

    /**
     * <p>
     * The DNS names for the service.
     * </p>
     *
     * @param baseEndpointDnsNames <p>
     *            The DNS names for the service.
     *            </p>
     */
    public void setBaseEndpointDnsNames(java.util.Collection<String> baseEndpointDnsNames) {
        if (baseEndpointDnsNames == null) {
            this.baseEndpointDnsNames = null;
            return;
        }

        this.baseEndpointDnsNames = new java.util.ArrayList<String>(baseEndpointDnsNames);
    }

    /**
     * <p>
     * The DNS names for the service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param baseEndpointDnsNames <p>
     *            The DNS names for the service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceDetail withBaseEndpointDnsNames(String... baseEndpointDnsNames) {
        if (getBaseEndpointDnsNames() == null) {
            this.baseEndpointDnsNames = new java.util.ArrayList<String>(baseEndpointDnsNames.length);
        }
        for (String value : baseEndpointDnsNames) {
            this.baseEndpointDnsNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The DNS names for the service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param baseEndpointDnsNames <p>
     *            The DNS names for the service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceDetail withBaseEndpointDnsNames(java.util.Collection<String> baseEndpointDnsNames) {
        setBaseEndpointDnsNames(baseEndpointDnsNames);
        return this;
    }

    /**
     * <p>
     * The private DNS name for the service.
     * </p>
     *
     * @return <p>
     *         The private DNS name for the service.
     *         </p>
     */
    public String getPrivateDnsName() {
        return privateDnsName;
    }

    /**
     * <p>
     * The private DNS name for the service.
     * </p>
     *
     * @param privateDnsName <p>
     *            The private DNS name for the service.
     *            </p>
     */
    public void setPrivateDnsName(String privateDnsName) {
        this.privateDnsName = privateDnsName;
    }

    /**
     * <p>
     * The private DNS name for the service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateDnsName <p>
     *            The private DNS name for the service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceDetail withPrivateDnsName(String privateDnsName) {
        this.privateDnsName = privateDnsName;
        return this;
    }

    /**
     * <p>
     * Indicates whether the service supports endpoint policies.
     * </p>
     *
     * @return <p>
     *         Indicates whether the service supports endpoint policies.
     *         </p>
     */
    public Boolean isVpcEndpointPolicySupported() {
        return vpcEndpointPolicySupported;
    }

    /**
     * <p>
     * Indicates whether the service supports endpoint policies.
     * </p>
     *
     * @return <p>
     *         Indicates whether the service supports endpoint policies.
     *         </p>
     */
    public Boolean getVpcEndpointPolicySupported() {
        return vpcEndpointPolicySupported;
    }

    /**
     * <p>
     * Indicates whether the service supports endpoint policies.
     * </p>
     *
     * @param vpcEndpointPolicySupported <p>
     *            Indicates whether the service supports endpoint policies.
     *            </p>
     */
    public void setVpcEndpointPolicySupported(Boolean vpcEndpointPolicySupported) {
        this.vpcEndpointPolicySupported = vpcEndpointPolicySupported;
    }

    /**
     * <p>
     * Indicates whether the service supports endpoint policies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcEndpointPolicySupported <p>
     *            Indicates whether the service supports endpoint policies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceDetail withVpcEndpointPolicySupported(Boolean vpcEndpointPolicySupported) {
        this.vpcEndpointPolicySupported = vpcEndpointPolicySupported;
        return this;
    }

    /**
     * <p>
     * Indicates whether VPC endpoint connection requests to the service must be
     * accepted by the service owner.
     * </p>
     *
     * @return <p>
     *         Indicates whether VPC endpoint connection requests to the service
     *         must be accepted by the service owner.
     *         </p>
     */
    public Boolean isAcceptanceRequired() {
        return acceptanceRequired;
    }

    /**
     * <p>
     * Indicates whether VPC endpoint connection requests to the service must be
     * accepted by the service owner.
     * </p>
     *
     * @return <p>
     *         Indicates whether VPC endpoint connection requests to the service
     *         must be accepted by the service owner.
     *         </p>
     */
    public Boolean getAcceptanceRequired() {
        return acceptanceRequired;
    }

    /**
     * <p>
     * Indicates whether VPC endpoint connection requests to the service must be
     * accepted by the service owner.
     * </p>
     *
     * @param acceptanceRequired <p>
     *            Indicates whether VPC endpoint connection requests to the
     *            service must be accepted by the service owner.
     *            </p>
     */
    public void setAcceptanceRequired(Boolean acceptanceRequired) {
        this.acceptanceRequired = acceptanceRequired;
    }

    /**
     * <p>
     * Indicates whether VPC endpoint connection requests to the service must be
     * accepted by the service owner.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param acceptanceRequired <p>
     *            Indicates whether VPC endpoint connection requests to the
     *            service must be accepted by the service owner.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceDetail withAcceptanceRequired(Boolean acceptanceRequired) {
        this.acceptanceRequired = acceptanceRequired;
        return this;
    }

    /**
     * <p>
     * Indicates whether the service manages its VPC endpoints. Management of
     * the service VPC endpoints using the VPC endpoint API is restricted.
     * </p>
     *
     * @return <p>
     *         Indicates whether the service manages its VPC endpoints.
     *         Management of the service VPC endpoints using the VPC endpoint
     *         API is restricted.
     *         </p>
     */
    public Boolean isManagesVpcEndpoints() {
        return managesVpcEndpoints;
    }

    /**
     * <p>
     * Indicates whether the service manages its VPC endpoints. Management of
     * the service VPC endpoints using the VPC endpoint API is restricted.
     * </p>
     *
     * @return <p>
     *         Indicates whether the service manages its VPC endpoints.
     *         Management of the service VPC endpoints using the VPC endpoint
     *         API is restricted.
     *         </p>
     */
    public Boolean getManagesVpcEndpoints() {
        return managesVpcEndpoints;
    }

    /**
     * <p>
     * Indicates whether the service manages its VPC endpoints. Management of
     * the service VPC endpoints using the VPC endpoint API is restricted.
     * </p>
     *
     * @param managesVpcEndpoints <p>
     *            Indicates whether the service manages its VPC endpoints.
     *            Management of the service VPC endpoints using the VPC endpoint
     *            API is restricted.
     *            </p>
     */
    public void setManagesVpcEndpoints(Boolean managesVpcEndpoints) {
        this.managesVpcEndpoints = managesVpcEndpoints;
    }

    /**
     * <p>
     * Indicates whether the service manages its VPC endpoints. Management of
     * the service VPC endpoints using the VPC endpoint API is restricted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param managesVpcEndpoints <p>
     *            Indicates whether the service manages its VPC endpoints.
     *            Management of the service VPC endpoints using the VPC endpoint
     *            API is restricted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceDetail withManagesVpcEndpoints(Boolean managesVpcEndpoints) {
        this.managesVpcEndpoints = managesVpcEndpoints;
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the service.
     * </p>
     *
     * @return <p>
     *         Any tags assigned to the service.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the service.
     * </p>
     *
     * @param tags <p>
     *            Any tags assigned to the service.
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
     * Any tags assigned to the service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceDetail withTags(Tag... tags) {
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
     * Any tags assigned to the service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceDetail withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The verification state of the VPC endpoint service.
     * </p>
     * <p>
     * Consumers of the endpoint service cannot use the private name when the
     * state is not <code>verified</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pendingVerification, verified, failed
     *
     * @return <p>
     *         The verification state of the VPC endpoint service.
     *         </p>
     *         <p>
     *         Consumers of the endpoint service cannot use the private name
     *         when the state is not <code>verified</code>.
     *         </p>
     * @see DnsNameState
     */
    public String getPrivateDnsNameVerificationState() {
        return privateDnsNameVerificationState;
    }

    /**
     * <p>
     * The verification state of the VPC endpoint service.
     * </p>
     * <p>
     * Consumers of the endpoint service cannot use the private name when the
     * state is not <code>verified</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pendingVerification, verified, failed
     *
     * @param privateDnsNameVerificationState <p>
     *            The verification state of the VPC endpoint service.
     *            </p>
     *            <p>
     *            Consumers of the endpoint service cannot use the private name
     *            when the state is not <code>verified</code>.
     *            </p>
     * @see DnsNameState
     */
    public void setPrivateDnsNameVerificationState(String privateDnsNameVerificationState) {
        this.privateDnsNameVerificationState = privateDnsNameVerificationState;
    }

    /**
     * <p>
     * The verification state of the VPC endpoint service.
     * </p>
     * <p>
     * Consumers of the endpoint service cannot use the private name when the
     * state is not <code>verified</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pendingVerification, verified, failed
     *
     * @param privateDnsNameVerificationState <p>
     *            The verification state of the VPC endpoint service.
     *            </p>
     *            <p>
     *            Consumers of the endpoint service cannot use the private name
     *            when the state is not <code>verified</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DnsNameState
     */
    public ServiceDetail withPrivateDnsNameVerificationState(String privateDnsNameVerificationState) {
        this.privateDnsNameVerificationState = privateDnsNameVerificationState;
        return this;
    }

    /**
     * <p>
     * The verification state of the VPC endpoint service.
     * </p>
     * <p>
     * Consumers of the endpoint service cannot use the private name when the
     * state is not <code>verified</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pendingVerification, verified, failed
     *
     * @param privateDnsNameVerificationState <p>
     *            The verification state of the VPC endpoint service.
     *            </p>
     *            <p>
     *            Consumers of the endpoint service cannot use the private name
     *            when the state is not <code>verified</code>.
     *            </p>
     * @see DnsNameState
     */
    public void setPrivateDnsNameVerificationState(DnsNameState privateDnsNameVerificationState) {
        this.privateDnsNameVerificationState = privateDnsNameVerificationState.toString();
    }

    /**
     * <p>
     * The verification state of the VPC endpoint service.
     * </p>
     * <p>
     * Consumers of the endpoint service cannot use the private name when the
     * state is not <code>verified</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pendingVerification, verified, failed
     *
     * @param privateDnsNameVerificationState <p>
     *            The verification state of the VPC endpoint service.
     *            </p>
     *            <p>
     *            Consumers of the endpoint service cannot use the private name
     *            when the state is not <code>verified</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DnsNameState
     */
    public ServiceDetail withPrivateDnsNameVerificationState(
            DnsNameState privateDnsNameVerificationState) {
        this.privateDnsNameVerificationState = privateDnsNameVerificationState.toString();
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
        if (getServiceName() != null)
            sb.append("ServiceName: " + getServiceName() + ",");
        if (getServiceId() != null)
            sb.append("ServiceId: " + getServiceId() + ",");
        if (getServiceType() != null)
            sb.append("ServiceType: " + getServiceType() + ",");
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: " + getAvailabilityZones() + ",");
        if (getOwner() != null)
            sb.append("Owner: " + getOwner() + ",");
        if (getBaseEndpointDnsNames() != null)
            sb.append("BaseEndpointDnsNames: " + getBaseEndpointDnsNames() + ",");
        if (getPrivateDnsName() != null)
            sb.append("PrivateDnsName: " + getPrivateDnsName() + ",");
        if (getVpcEndpointPolicySupported() != null)
            sb.append("VpcEndpointPolicySupported: " + getVpcEndpointPolicySupported() + ",");
        if (getAcceptanceRequired() != null)
            sb.append("AcceptanceRequired: " + getAcceptanceRequired() + ",");
        if (getManagesVpcEndpoints() != null)
            sb.append("ManagesVpcEndpoints: " + getManagesVpcEndpoints() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getPrivateDnsNameVerificationState() != null)
            sb.append("PrivateDnsNameVerificationState: " + getPrivateDnsNameVerificationState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
        hashCode = prime * hashCode
                + ((getServiceType() == null) ? 0 : getServiceType().hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode
                + ((getBaseEndpointDnsNames() == null) ? 0 : getBaseEndpointDnsNames().hashCode());
        hashCode = prime * hashCode
                + ((getPrivateDnsName() == null) ? 0 : getPrivateDnsName().hashCode());
        hashCode = prime
                * hashCode
                + ((getVpcEndpointPolicySupported() == null) ? 0 : getVpcEndpointPolicySupported()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getAcceptanceRequired() == null) ? 0 : getAcceptanceRequired().hashCode());
        hashCode = prime * hashCode
                + ((getManagesVpcEndpoints() == null) ? 0 : getManagesVpcEndpoints().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime
                * hashCode
                + ((getPrivateDnsNameVerificationState() == null) ? 0
                        : getPrivateDnsNameVerificationState().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceDetail == false)
            return false;
        ServiceDetail other = (ServiceDetail) obj;

        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null
                && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getServiceId() == null ^ this.getServiceId() == null)
            return false;
        if (other.getServiceId() != null
                && other.getServiceId().equals(this.getServiceId()) == false)
            return false;
        if (other.getServiceType() == null ^ this.getServiceType() == null)
            return false;
        if (other.getServiceType() != null
                && other.getServiceType().equals(this.getServiceType()) == false)
            return false;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null
                && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getBaseEndpointDnsNames() == null ^ this.getBaseEndpointDnsNames() == null)
            return false;
        if (other.getBaseEndpointDnsNames() != null
                && other.getBaseEndpointDnsNames().equals(this.getBaseEndpointDnsNames()) == false)
            return false;
        if (other.getPrivateDnsName() == null ^ this.getPrivateDnsName() == null)
            return false;
        if (other.getPrivateDnsName() != null
                && other.getPrivateDnsName().equals(this.getPrivateDnsName()) == false)
            return false;
        if (other.getVpcEndpointPolicySupported() == null
                ^ this.getVpcEndpointPolicySupported() == null)
            return false;
        if (other.getVpcEndpointPolicySupported() != null
                && other.getVpcEndpointPolicySupported().equals(
                        this.getVpcEndpointPolicySupported()) == false)
            return false;
        if (other.getAcceptanceRequired() == null ^ this.getAcceptanceRequired() == null)
            return false;
        if (other.getAcceptanceRequired() != null
                && other.getAcceptanceRequired().equals(this.getAcceptanceRequired()) == false)
            return false;
        if (other.getManagesVpcEndpoints() == null ^ this.getManagesVpcEndpoints() == null)
            return false;
        if (other.getManagesVpcEndpoints() != null
                && other.getManagesVpcEndpoints().equals(this.getManagesVpcEndpoints()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getPrivateDnsNameVerificationState() == null
                ^ this.getPrivateDnsNameVerificationState() == null)
            return false;
        if (other.getPrivateDnsNameVerificationState() != null
                && other.getPrivateDnsNameVerificationState().equals(
                        this.getPrivateDnsNameVerificationState()) == false)
            return false;
        return true;
    }
}
