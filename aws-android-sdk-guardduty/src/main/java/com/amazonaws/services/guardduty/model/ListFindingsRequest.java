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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists Amazon GuardDuty findings for the specified detector ID.
 * </p>
 */
public class ListFindingsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the detector that specifies the GuardDuty service whose
     * findings you want to list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     */
    private String detectorId;

    /**
     * <p>
     * Represents the criteria used for querying findings. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * JSON field name
     * </p>
     * </li>
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
     * When this attribute is set to 'true', only archived findings are listed.
     * When it's set to 'false', only unarchived findings are listed. When this
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
     * Type: Timestamp in Unix Epoch millisecond format: 1486685375000
     * </p>
     * </li>
     * </ul>
     */
    private FindingCriteria findingCriteria;

    /**
     * <p>
     * Represents the criteria used for sorting findings.
     * </p>
     */
    private SortCriteria sortCriteria;

    /**
     * <p>
     * You can use this parameter to indicate the maximum number of items you
     * want in the response. The default value is 50. The maximum value is 50.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * You can use this parameter when paginating results. Set the value of this
     * parameter to null on your first call to the list action. For subsequent
     * calls to the action, fill nextToken in the request with the value of
     * NextToken from the previous response to continue listing data.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ID of the detector that specifies the GuardDuty service whose
     * findings you want to list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @return <p>
     *         The ID of the detector that specifies the GuardDuty service whose
     *         findings you want to list.
     *         </p>
     */
    public String getDetectorId() {
        return detectorId;
    }

    /**
     * <p>
     * The ID of the detector that specifies the GuardDuty service whose
     * findings you want to list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param detectorId <p>
     *            The ID of the detector that specifies the GuardDuty service
     *            whose findings you want to list.
     *            </p>
     */
    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The ID of the detector that specifies the GuardDuty service whose
     * findings you want to list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param detectorId <p>
     *            The ID of the detector that specifies the GuardDuty service
     *            whose findings you want to list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFindingsRequest withDetectorId(String detectorId) {
        this.detectorId = detectorId;
        return this;
    }

    /**
     * <p>
     * Represents the criteria used for querying findings. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * JSON field name
     * </p>
     * </li>
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
     * When this attribute is set to 'true', only archived findings are listed.
     * When it's set to 'false', only unarchived findings are listed. When this
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
     * Type: Timestamp in Unix Epoch millisecond format: 1486685375000
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Represents the criteria used for querying findings. Valid values
     *         include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         JSON field name
     *         </p>
     *         </li>
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
     *         When this attribute is set to 'true', only archived findings are
     *         listed. When it's set to 'false', only unarchived findings are
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
     *         Type: Timestamp in Unix Epoch millisecond format: 1486685375000
     *         </p>
     *         </li>
     *         </ul>
     */
    public FindingCriteria getFindingCriteria() {
        return findingCriteria;
    }

    /**
     * <p>
     * Represents the criteria used for querying findings. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * JSON field name
     * </p>
     * </li>
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
     * When this attribute is set to 'true', only archived findings are listed.
     * When it's set to 'false', only unarchived findings are listed. When this
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
     * Type: Timestamp in Unix Epoch millisecond format: 1486685375000
     * </p>
     * </li>
     * </ul>
     *
     * @param findingCriteria <p>
     *            Represents the criteria used for querying findings. Valid
     *            values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            JSON field name
     *            </p>
     *            </li>
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
     *            When this attribute is set to 'true', only archived findings
     *            are listed. When it's set to 'false', only unarchived findings
     *            are listed. When this attribute is not set, all existing
     *            findings are listed.
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
     *            Type: Timestamp in Unix Epoch millisecond format:
     *            1486685375000
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setFindingCriteria(FindingCriteria findingCriteria) {
        this.findingCriteria = findingCriteria;
    }

    /**
     * <p>
     * Represents the criteria used for querying findings. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * JSON field name
     * </p>
     * </li>
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
     * When this attribute is set to 'true', only archived findings are listed.
     * When it's set to 'false', only unarchived findings are listed. When this
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
     * Type: Timestamp in Unix Epoch millisecond format: 1486685375000
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param findingCriteria <p>
     *            Represents the criteria used for querying findings. Valid
     *            values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            JSON field name
     *            </p>
     *            </li>
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
     *            When this attribute is set to 'true', only archived findings
     *            are listed. When it's set to 'false', only unarchived findings
     *            are listed. When this attribute is not set, all existing
     *            findings are listed.
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
     *            Type: Timestamp in Unix Epoch millisecond format:
     *            1486685375000
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFindingsRequest withFindingCriteria(FindingCriteria findingCriteria) {
        this.findingCriteria = findingCriteria;
        return this;
    }

    /**
     * <p>
     * Represents the criteria used for sorting findings.
     * </p>
     *
     * @return <p>
     *         Represents the criteria used for sorting findings.
     *         </p>
     */
    public SortCriteria getSortCriteria() {
        return sortCriteria;
    }

    /**
     * <p>
     * Represents the criteria used for sorting findings.
     * </p>
     *
     * @param sortCriteria <p>
     *            Represents the criteria used for sorting findings.
     *            </p>
     */
    public void setSortCriteria(SortCriteria sortCriteria) {
        this.sortCriteria = sortCriteria;
    }

    /**
     * <p>
     * Represents the criteria used for sorting findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sortCriteria <p>
     *            Represents the criteria used for sorting findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFindingsRequest withSortCriteria(SortCriteria sortCriteria) {
        this.sortCriteria = sortCriteria;
        return this;
    }

    /**
     * <p>
     * You can use this parameter to indicate the maximum number of items you
     * want in the response. The default value is 50. The maximum value is 50.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @return <p>
     *         You can use this parameter to indicate the maximum number of
     *         items you want in the response. The default value is 50. The
     *         maximum value is 50.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * You can use this parameter to indicate the maximum number of items you
     * want in the response. The default value is 50. The maximum value is 50.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>
     *            You can use this parameter to indicate the maximum number of
     *            items you want in the response. The default value is 50. The
     *            maximum value is 50.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * You can use this parameter to indicate the maximum number of items you
     * want in the response. The default value is 50. The maximum value is 50.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>
     *            You can use this parameter to indicate the maximum number of
     *            items you want in the response. The default value is 50. The
     *            maximum value is 50.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFindingsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * You can use this parameter when paginating results. Set the value of this
     * parameter to null on your first call to the list action. For subsequent
     * calls to the action, fill nextToken in the request with the value of
     * NextToken from the previous response to continue listing data.
     * </p>
     *
     * @return <p>
     *         You can use this parameter when paginating results. Set the value
     *         of this parameter to null on your first call to the list action.
     *         For subsequent calls to the action, fill nextToken in the request
     *         with the value of NextToken from the previous response to
     *         continue listing data.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * You can use this parameter when paginating results. Set the value of this
     * parameter to null on your first call to the list action. For subsequent
     * calls to the action, fill nextToken in the request with the value of
     * NextToken from the previous response to continue listing data.
     * </p>
     *
     * @param nextToken <p>
     *            You can use this parameter when paginating results. Set the
     *            value of this parameter to null on your first call to the list
     *            action. For subsequent calls to the action, fill nextToken in
     *            the request with the value of NextToken from the previous
     *            response to continue listing data.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * You can use this parameter when paginating results. Set the value of this
     * parameter to null on your first call to the list action. For subsequent
     * calls to the action, fill nextToken in the request with the value of
     * NextToken from the previous response to continue listing data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            You can use this parameter when paginating results. Set the
     *            value of this parameter to null on your first call to the list
     *            action. For subsequent calls to the action, fill nextToken in
     *            the request with the value of NextToken from the previous
     *            response to continue listing data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFindingsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getFindingCriteria() != null)
            sb.append("FindingCriteria: " + getFindingCriteria() + ",");
        if (getSortCriteria() != null)
            sb.append("SortCriteria: " + getSortCriteria() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode
                + ((getFindingCriteria() == null) ? 0 : getFindingCriteria().hashCode());
        hashCode = prime * hashCode
                + ((getSortCriteria() == null) ? 0 : getSortCriteria().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFindingsRequest == false)
            return false;
        ListFindingsRequest other = (ListFindingsRequest) obj;

        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null
                && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getFindingCriteria() == null ^ this.getFindingCriteria() == null)
            return false;
        if (other.getFindingCriteria() != null
                && other.getFindingCriteria().equals(this.getFindingCriteria()) == false)
            return false;
        if (other.getSortCriteria() == null ^ this.getSortCriteria() == null)
            return false;
        if (other.getSortCriteria() != null
                && other.getSortCriteria().equals(this.getSortCriteria()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
