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

package com.amazonaws.services.amazonguardduty.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a filter using the specified finding criteria.
 * </p>
 */
public class CreateFilterRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique ID of the detector of the GuardDuty account that you want to
     * create a filter for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     */
    private String detectorId;

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 64<br/>
     */
    private String name;

    /**
     * <p>
     * The description of the filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     */
    private String description;

    /**
     * <p>
     * Specifies the action that is to be applied to the findings that match the
     * filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>NOOP, ARCHIVE
     */
    private String action;

    /**
     * <p>
     * Specifies the position of the filter in the list of current filters. Also
     * specifies the order in which this filter is applied to the findings.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer rank;

    /**
     * <p>
     * Represents the criteria to be used in the filter for querying findings.
     * </p>
     * <p>
     * You can only use the following attributes to query findings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * accountId
     * </p>
     * </li>
     * <li>
     * <p>
     * region
     * </p>
     * </li>
     * <li>
     * <p>
     * confidence
     * </p>
     * </li>
     * <li>
     * <p>
     * id
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.accessKeyDetails.accessKeyId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.accessKeyDetails.principalId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.accessKeyDetails.userName
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.accessKeyDetails.userType
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.iamInstanceProfile.id
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.imageId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.instanceId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.outpostArn
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.ipv6Addresses
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.privateIpAddresses.
     * privateIpAddress
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.publicDnsName
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.publicIp
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.securityGroups.groupId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.securityGroups.groupName
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.subnetId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.vpcId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.tags.key
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.tags.value
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.resourceType
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.actionType
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.api
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.callerType
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.remoteIpDetails.city.cityName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.remoteIpDetails.country.countryName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.remoteIpDetails.ipAddressV4
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.remoteIpDetails.organization.asn
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.remoteIpDetails.organization.asnOrg
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.serviceName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.dnsRequestAction.domain
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.blocked
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.connectionDirection
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.localPortDetails.port
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.protocol
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remoteIpDetails.city.cityName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remoteIpDetails.country.
     * countryName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remoteIpDetails.ipAddressV4
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remoteIpDetails.organization.asn
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remoteIpDetails.organization.
     * asnOrg
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remotePortDetails.port
     * </p>
     * </li>
     * <li>
     * <p>
     * service.additionalInfo.threatListName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.archived
     * </p>
     * <p>
     * When this attribute is set to TRUE, only archived findings are listed.
     * When it's set to FALSE, only unarchived findings are listed. When this
     * attribute is not set, all existing findings are listed.
     * </p>
     * </li>
     * <li>
     * <p>
     * service.resourceRole
     * </p>
     * </li>
     * <li>
     * <p>
     * severity
     * </p>
     * </li>
     * <li>
     * <p>
     * type
     * </p>
     * </li>
     * <li>
     * <p>
     * updatedAt
     * </p>
     * <p>
     * Type: ISO 8601 string format: YYYY-MM-DDTHH:MM:SS.SSSZ or
     * YYYY-MM-DDTHH:MM:SSZ depending on whether the value contains
     * milliseconds.
     * </p>
     * </li>
     * </ul>
     */
    private FindingCriteria findingCriteria;

    /**
     * <p>
     * The idempotency token for the create request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     */
    private String clientToken;

    /**
     * <p>
     * The tags to be added to a new filter resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The unique ID of the detector of the GuardDuty account that you want to
     * create a filter for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @return <p>
     *         The unique ID of the detector of the GuardDuty account that you
     *         want to create a filter for.
     *         </p>
     */
    public String getDetectorId() {
        return detectorId;
    }

    /**
     * <p>
     * The unique ID of the detector of the GuardDuty account that you want to
     * create a filter for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param detectorId <p>
     *            The unique ID of the detector of the GuardDuty account that
     *            you want to create a filter for.
     *            </p>
     */
    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The unique ID of the detector of the GuardDuty account that you want to
     * create a filter for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param detectorId <p>
     *            The unique ID of the detector of the GuardDuty account that
     *            you want to create a filter for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFilterRequest withDetectorId(String detectorId) {
        this.detectorId = detectorId;
        return this;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 64<br/>
     *
     * @return <p>
     *         The name of the filter.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 64<br/>
     *
     * @param name <p>
     *            The name of the filter.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 64<br/>
     *
     * @param name <p>
     *            The name of the filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFilterRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The description of the filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     *
     * @return <p>
     *         The description of the filter.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     *
     * @param description <p>
     *            The description of the filter.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     *
     * @param description <p>
     *            The description of the filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFilterRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Specifies the action that is to be applied to the findings that match the
     * filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>NOOP, ARCHIVE
     *
     * @return <p>
     *         Specifies the action that is to be applied to the findings that
     *         match the filter.
     *         </p>
     * @see FilterAction
     */
    public String getAction() {
        return action;
    }

    /**
     * <p>
     * Specifies the action that is to be applied to the findings that match the
     * filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>NOOP, ARCHIVE
     *
     * @param action <p>
     *            Specifies the action that is to be applied to the findings
     *            that match the filter.
     *            </p>
     * @see FilterAction
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * Specifies the action that is to be applied to the findings that match the
     * filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>NOOP, ARCHIVE
     *
     * @param action <p>
     *            Specifies the action that is to be applied to the findings
     *            that match the filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FilterAction
     */
    public CreateFilterRequest withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * <p>
     * Specifies the action that is to be applied to the findings that match the
     * filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>NOOP, ARCHIVE
     *
     * @param action <p>
     *            Specifies the action that is to be applied to the findings
     *            that match the filter.
     *            </p>
     * @see FilterAction
     */
    public void setAction(FilterAction action) {
        this.action = action.toString();
    }

    /**
     * <p>
     * Specifies the action that is to be applied to the findings that match the
     * filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>NOOP, ARCHIVE
     *
     * @param action <p>
     *            Specifies the action that is to be applied to the findings
     *            that match the filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FilterAction
     */
    public CreateFilterRequest withAction(FilterAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the position of the filter in the list of current filters. Also
     * specifies the order in which this filter is applied to the findings.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         Specifies the position of the filter in the list of current
     *         filters. Also specifies the order in which this filter is applied
     *         to the findings.
     *         </p>
     */
    public Integer getRank() {
        return rank;
    }

    /**
     * <p>
     * Specifies the position of the filter in the list of current filters. Also
     * specifies the order in which this filter is applied to the findings.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param rank <p>
     *            Specifies the position of the filter in the list of current
     *            filters. Also specifies the order in which this filter is
     *            applied to the findings.
     *            </p>
     */
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    /**
     * <p>
     * Specifies the position of the filter in the list of current filters. Also
     * specifies the order in which this filter is applied to the findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param rank <p>
     *            Specifies the position of the filter in the list of current
     *            filters. Also specifies the order in which this filter is
     *            applied to the findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFilterRequest withRank(Integer rank) {
        this.rank = rank;
        return this;
    }

    /**
     * <p>
     * Represents the criteria to be used in the filter for querying findings.
     * </p>
     * <p>
     * You can only use the following attributes to query findings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * accountId
     * </p>
     * </li>
     * <li>
     * <p>
     * region
     * </p>
     * </li>
     * <li>
     * <p>
     * confidence
     * </p>
     * </li>
     * <li>
     * <p>
     * id
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.accessKeyDetails.accessKeyId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.accessKeyDetails.principalId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.accessKeyDetails.userName
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.accessKeyDetails.userType
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.iamInstanceProfile.id
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.imageId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.instanceId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.outpostArn
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.ipv6Addresses
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.privateIpAddresses.
     * privateIpAddress
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.publicDnsName
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.publicIp
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.securityGroups.groupId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.securityGroups.groupName
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.subnetId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.vpcId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.tags.key
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.tags.value
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.resourceType
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.actionType
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.api
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.callerType
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.remoteIpDetails.city.cityName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.remoteIpDetails.country.countryName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.remoteIpDetails.ipAddressV4
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.remoteIpDetails.organization.asn
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.remoteIpDetails.organization.asnOrg
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.serviceName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.dnsRequestAction.domain
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.blocked
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.connectionDirection
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.localPortDetails.port
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.protocol
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remoteIpDetails.city.cityName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remoteIpDetails.country.
     * countryName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remoteIpDetails.ipAddressV4
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remoteIpDetails.organization.asn
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remoteIpDetails.organization.
     * asnOrg
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remotePortDetails.port
     * </p>
     * </li>
     * <li>
     * <p>
     * service.additionalInfo.threatListName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.archived
     * </p>
     * <p>
     * When this attribute is set to TRUE, only archived findings are listed.
     * When it's set to FALSE, only unarchived findings are listed. When this
     * attribute is not set, all existing findings are listed.
     * </p>
     * </li>
     * <li>
     * <p>
     * service.resourceRole
     * </p>
     * </li>
     * <li>
     * <p>
     * severity
     * </p>
     * </li>
     * <li>
     * <p>
     * type
     * </p>
     * </li>
     * <li>
     * <p>
     * updatedAt
     * </p>
     * <p>
     * Type: ISO 8601 string format: YYYY-MM-DDTHH:MM:SS.SSSZ or
     * YYYY-MM-DDTHH:MM:SSZ depending on whether the value contains
     * milliseconds.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Represents the criteria to be used in the filter for querying
     *         findings.
     *         </p>
     *         <p>
     *         You can only use the following attributes to query findings:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         accountId
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         region
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         confidence
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         id
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         resource.accessKeyDetails.accessKeyId
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         resource.accessKeyDetails.principalId
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         resource.accessKeyDetails.userName
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         resource.accessKeyDetails.userType
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         resource.instanceDetails.iamInstanceProfile.id
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         resource.instanceDetails.imageId
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         resource.instanceDetails.instanceId
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         resource.instanceDetails.outpostArn
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         resource.instanceDetails.networkInterfaces.ipv6Addresses
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         resource.instanceDetails.networkInterfaces.privateIpAddresses.
     *         privateIpAddress
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         resource.instanceDetails.networkInterfaces.publicDnsName
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         resource.instanceDetails.networkInterfaces.publicIp
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         resource.instanceDetails.networkInterfaces.securityGroups.groupId
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         resource.instanceDetails.networkInterfaces.securityGroups.
     *         groupName
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         resource.instanceDetails.networkInterfaces.subnetId
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         resource.instanceDetails.networkInterfaces.vpcId
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         resource.instanceDetails.tags.key
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         resource.instanceDetails.tags.value
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         resource.resourceType
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.action.actionType
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.action.awsApiCallAction.api
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.action.awsApiCallAction.callerType
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.action.awsApiCallAction.remoteIpDetails.city.cityName
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.action.awsApiCallAction.remoteIpDetails.country.
     *         countryName
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.action.awsApiCallAction.remoteIpDetails.ipAddressV4
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.action.awsApiCallAction.remoteIpDetails.organization.asn
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.action.awsApiCallAction.remoteIpDetails.organization.
     *         asnOrg
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.action.awsApiCallAction.serviceName
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.action.dnsRequestAction.domain
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.action.networkConnectionAction.blocked
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.action.networkConnectionAction.connectionDirection
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.action.networkConnectionAction.localPortDetails.port
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.action.networkConnectionAction.protocol
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.action.networkConnectionAction.remoteIpDetails.city.
     *         cityName
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.action.networkConnectionAction.remoteIpDetails.country.
     *         countryName
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.action.networkConnectionAction.remoteIpDetails.
     *         ipAddressV4
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.action.networkConnectionAction.remoteIpDetails.
     *         organization.asn
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.action.networkConnectionAction.remoteIpDetails.
     *         organization.asnOrg
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.action.networkConnectionAction.remotePortDetails.port
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.additionalInfo.threatListName
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.archived
     *         </p>
     *         <p>
     *         When this attribute is set to TRUE, only archived findings are
     *         listed. When it's set to FALSE, only unarchived findings are
     *         listed. When this attribute is not set, all existing findings are
     *         listed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.resourceRole
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         severity
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         type
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         updatedAt
     *         </p>
     *         <p>
     *         Type: ISO 8601 string format: YYYY-MM-DDTHH:MM:SS.SSSZ or
     *         YYYY-MM-DDTHH:MM:SSZ depending on whether the value contains
     *         milliseconds.
     *         </p>
     *         </li>
     *         </ul>
     */
    public FindingCriteria getFindingCriteria() {
        return findingCriteria;
    }

    /**
     * <p>
     * Represents the criteria to be used in the filter for querying findings.
     * </p>
     * <p>
     * You can only use the following attributes to query findings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * accountId
     * </p>
     * </li>
     * <li>
     * <p>
     * region
     * </p>
     * </li>
     * <li>
     * <p>
     * confidence
     * </p>
     * </li>
     * <li>
     * <p>
     * id
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.accessKeyDetails.accessKeyId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.accessKeyDetails.principalId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.accessKeyDetails.userName
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.accessKeyDetails.userType
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.iamInstanceProfile.id
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.imageId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.instanceId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.outpostArn
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.ipv6Addresses
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.privateIpAddresses.
     * privateIpAddress
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.publicDnsName
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.publicIp
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.securityGroups.groupId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.securityGroups.groupName
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.subnetId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.vpcId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.tags.key
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.tags.value
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.resourceType
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.actionType
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.api
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.callerType
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.remoteIpDetails.city.cityName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.remoteIpDetails.country.countryName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.remoteIpDetails.ipAddressV4
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.remoteIpDetails.organization.asn
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.remoteIpDetails.organization.asnOrg
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.serviceName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.dnsRequestAction.domain
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.blocked
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.connectionDirection
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.localPortDetails.port
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.protocol
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remoteIpDetails.city.cityName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remoteIpDetails.country.
     * countryName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remoteIpDetails.ipAddressV4
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remoteIpDetails.organization.asn
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remoteIpDetails.organization.
     * asnOrg
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remotePortDetails.port
     * </p>
     * </li>
     * <li>
     * <p>
     * service.additionalInfo.threatListName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.archived
     * </p>
     * <p>
     * When this attribute is set to TRUE, only archived findings are listed.
     * When it's set to FALSE, only unarchived findings are listed. When this
     * attribute is not set, all existing findings are listed.
     * </p>
     * </li>
     * <li>
     * <p>
     * service.resourceRole
     * </p>
     * </li>
     * <li>
     * <p>
     * severity
     * </p>
     * </li>
     * <li>
     * <p>
     * type
     * </p>
     * </li>
     * <li>
     * <p>
     * updatedAt
     * </p>
     * <p>
     * Type: ISO 8601 string format: YYYY-MM-DDTHH:MM:SS.SSSZ or
     * YYYY-MM-DDTHH:MM:SSZ depending on whether the value contains
     * milliseconds.
     * </p>
     * </li>
     * </ul>
     *
     * @param findingCriteria <p>
     *            Represents the criteria to be used in the filter for querying
     *            findings.
     *            </p>
     *            <p>
     *            You can only use the following attributes to query findings:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            accountId
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            region
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            confidence
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            id
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            resource.accessKeyDetails.accessKeyId
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            resource.accessKeyDetails.principalId
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            resource.accessKeyDetails.userName
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            resource.accessKeyDetails.userType
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            resource.instanceDetails.iamInstanceProfile.id
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            resource.instanceDetails.imageId
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            resource.instanceDetails.instanceId
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            resource.instanceDetails.outpostArn
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            resource.instanceDetails.networkInterfaces.ipv6Addresses
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            resource.instanceDetails.networkInterfaces.privateIpAddresses.
     *            privateIpAddress
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            resource.instanceDetails.networkInterfaces.publicDnsName
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            resource.instanceDetails.networkInterfaces.publicIp
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            resource.instanceDetails.networkInterfaces.securityGroups.
     *            groupId
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            resource.instanceDetails.networkInterfaces.securityGroups.
     *            groupName
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            resource.instanceDetails.networkInterfaces.subnetId
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            resource.instanceDetails.networkInterfaces.vpcId
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            resource.instanceDetails.tags.key
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            resource.instanceDetails.tags.value
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            resource.resourceType
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.action.actionType
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.action.awsApiCallAction.api
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.action.awsApiCallAction.callerType
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.action.awsApiCallAction.remoteIpDetails.city.cityName
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.action.awsApiCallAction.remoteIpDetails.country.
     *            countryName
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.action.awsApiCallAction.remoteIpDetails.ipAddressV4
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.action.awsApiCallAction.remoteIpDetails.organization.
     *            asn
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.action.awsApiCallAction.remoteIpDetails.organization.
     *            asnOrg
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.action.awsApiCallAction.serviceName
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.action.dnsRequestAction.domain
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.action.networkConnectionAction.blocked
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.action.networkConnectionAction.connectionDirection
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.action.networkConnectionAction.localPortDetails.port
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.action.networkConnectionAction.protocol
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.action.networkConnectionAction.remoteIpDetails.city.
     *            cityName
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.action.networkConnectionAction.remoteIpDetails.country
     *            .countryName
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.action.networkConnectionAction.remoteIpDetails.
     *            ipAddressV4
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.action.networkConnectionAction.remoteIpDetails.
     *            organization.asn
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.action.networkConnectionAction.remoteIpDetails.
     *            organization.asnOrg
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.action.networkConnectionAction.remotePortDetails.port
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.additionalInfo.threatListName
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.archived
     *            </p>
     *            <p>
     *            When this attribute is set to TRUE, only archived findings are
     *            listed. When it's set to FALSE, only unarchived findings are
     *            listed. When this attribute is not set, all existing findings
     *            are listed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.resourceRole
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            severity
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            type
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            updatedAt
     *            </p>
     *            <p>
     *            Type: ISO 8601 string format: YYYY-MM-DDTHH:MM:SS.SSSZ or
     *            YYYY-MM-DDTHH:MM:SSZ depending on whether the value contains
     *            milliseconds.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setFindingCriteria(FindingCriteria findingCriteria) {
        this.findingCriteria = findingCriteria;
    }

    /**
     * <p>
     * Represents the criteria to be used in the filter for querying findings.
     * </p>
     * <p>
     * You can only use the following attributes to query findings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * accountId
     * </p>
     * </li>
     * <li>
     * <p>
     * region
     * </p>
     * </li>
     * <li>
     * <p>
     * confidence
     * </p>
     * </li>
     * <li>
     * <p>
     * id
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.accessKeyDetails.accessKeyId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.accessKeyDetails.principalId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.accessKeyDetails.userName
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.accessKeyDetails.userType
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.iamInstanceProfile.id
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.imageId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.instanceId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.outpostArn
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.ipv6Addresses
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.privateIpAddresses.
     * privateIpAddress
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.publicDnsName
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.publicIp
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.securityGroups.groupId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.securityGroups.groupName
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.subnetId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.vpcId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.tags.key
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.tags.value
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.resourceType
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.actionType
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.api
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.callerType
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.remoteIpDetails.city.cityName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.remoteIpDetails.country.countryName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.remoteIpDetails.ipAddressV4
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.remoteIpDetails.organization.asn
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.remoteIpDetails.organization.asnOrg
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.serviceName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.dnsRequestAction.domain
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.blocked
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.connectionDirection
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.localPortDetails.port
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.protocol
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remoteIpDetails.city.cityName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remoteIpDetails.country.
     * countryName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remoteIpDetails.ipAddressV4
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remoteIpDetails.organization.asn
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remoteIpDetails.organization.
     * asnOrg
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remotePortDetails.port
     * </p>
     * </li>
     * <li>
     * <p>
     * service.additionalInfo.threatListName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.archived
     * </p>
     * <p>
     * When this attribute is set to TRUE, only archived findings are listed.
     * When it's set to FALSE, only unarchived findings are listed. When this
     * attribute is not set, all existing findings are listed.
     * </p>
     * </li>
     * <li>
     * <p>
     * service.resourceRole
     * </p>
     * </li>
     * <li>
     * <p>
     * severity
     * </p>
     * </li>
     * <li>
     * <p>
     * type
     * </p>
     * </li>
     * <li>
     * <p>
     * updatedAt
     * </p>
     * <p>
     * Type: ISO 8601 string format: YYYY-MM-DDTHH:MM:SS.SSSZ or
     * YYYY-MM-DDTHH:MM:SSZ depending on whether the value contains
     * milliseconds.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param findingCriteria <p>
     *            Represents the criteria to be used in the filter for querying
     *            findings.
     *            </p>
     *            <p>
     *            You can only use the following attributes to query findings:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            accountId
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            region
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            confidence
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            id
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            resource.accessKeyDetails.accessKeyId
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            resource.accessKeyDetails.principalId
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            resource.accessKeyDetails.userName
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            resource.accessKeyDetails.userType
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            resource.instanceDetails.iamInstanceProfile.id
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            resource.instanceDetails.imageId
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            resource.instanceDetails.instanceId
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            resource.instanceDetails.outpostArn
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            resource.instanceDetails.networkInterfaces.ipv6Addresses
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            resource.instanceDetails.networkInterfaces.privateIpAddresses.
     *            privateIpAddress
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            resource.instanceDetails.networkInterfaces.publicDnsName
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            resource.instanceDetails.networkInterfaces.publicIp
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            resource.instanceDetails.networkInterfaces.securityGroups.
     *            groupId
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            resource.instanceDetails.networkInterfaces.securityGroups.
     *            groupName
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            resource.instanceDetails.networkInterfaces.subnetId
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            resource.instanceDetails.networkInterfaces.vpcId
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            resource.instanceDetails.tags.key
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            resource.instanceDetails.tags.value
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            resource.resourceType
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.action.actionType
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.action.awsApiCallAction.api
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.action.awsApiCallAction.callerType
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.action.awsApiCallAction.remoteIpDetails.city.cityName
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.action.awsApiCallAction.remoteIpDetails.country.
     *            countryName
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.action.awsApiCallAction.remoteIpDetails.ipAddressV4
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.action.awsApiCallAction.remoteIpDetails.organization.
     *            asn
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.action.awsApiCallAction.remoteIpDetails.organization.
     *            asnOrg
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.action.awsApiCallAction.serviceName
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.action.dnsRequestAction.domain
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.action.networkConnectionAction.blocked
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.action.networkConnectionAction.connectionDirection
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.action.networkConnectionAction.localPortDetails.port
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.action.networkConnectionAction.protocol
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.action.networkConnectionAction.remoteIpDetails.city.
     *            cityName
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.action.networkConnectionAction.remoteIpDetails.country
     *            .countryName
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.action.networkConnectionAction.remoteIpDetails.
     *            ipAddressV4
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.action.networkConnectionAction.remoteIpDetails.
     *            organization.asn
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.action.networkConnectionAction.remoteIpDetails.
     *            organization.asnOrg
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.action.networkConnectionAction.remotePortDetails.port
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.additionalInfo.threatListName
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.archived
     *            </p>
     *            <p>
     *            When this attribute is set to TRUE, only archived findings are
     *            listed. When it's set to FALSE, only unarchived findings are
     *            listed. When this attribute is not set, all existing findings
     *            are listed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            service.resourceRole
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            severity
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            type
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            updatedAt
     *            </p>
     *            <p>
     *            Type: ISO 8601 string format: YYYY-MM-DDTHH:MM:SS.SSSZ or
     *            YYYY-MM-DDTHH:MM:SSZ depending on whether the value contains
     *            milliseconds.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFilterRequest withFindingCriteria(FindingCriteria findingCriteria) {
        this.findingCriteria = findingCriteria;
        return this;
    }

    /**
     * <p>
     * The idempotency token for the create request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @return <p>
     *         The idempotency token for the create request.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * The idempotency token for the create request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param clientToken <p>
     *            The idempotency token for the create request.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The idempotency token for the create request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param clientToken <p>
     *            The idempotency token for the create request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFilterRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * The tags to be added to a new filter resource.
     * </p>
     *
     * @return <p>
     *         The tags to be added to a new filter resource.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to be added to a new filter resource.
     * </p>
     *
     * @param tags <p>
     *            The tags to be added to a new filter resource.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to be added to a new filter resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags to be added to a new filter resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFilterRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The tags to be added to a new filter resource.
     * </p>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFilterRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateFilterRequest clearTagsEntries() {
        this.tags = null;
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
        if (getDetectorId() != null)
            sb.append("DetectorId: " + getDetectorId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getAction() != null)
            sb.append("Action: " + getAction() + ",");
        if (getRank() != null)
            sb.append("Rank: " + getRank() + ",");
        if (getFindingCriteria() != null)
            sb.append("FindingCriteria: " + getFindingCriteria() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getRank() == null) ? 0 : getRank().hashCode());
        hashCode = prime * hashCode
                + ((getFindingCriteria() == null) ? 0 : getFindingCriteria().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFilterRequest == false)
            return false;
        CreateFilterRequest other = (CreateFilterRequest) obj;

        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null
                && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getRank() == null ^ this.getRank() == null)
            return false;
        if (other.getRank() != null && other.getRank().equals(this.getRank()) == false)
            return false;
        if (other.getFindingCriteria() == null ^ this.getFindingCriteria() == null)
            return false;
        if (other.getFindingCriteria() != null
                && other.getFindingCriteria().equals(this.getFindingCriteria()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
