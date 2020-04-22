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

package com.amazonaws.services.firewallmanagementservice.model;

import java.io.Serializable;

public class GetProtectionStatusResult implements Serializable {
    /**
     * <p>
     * The ID of the AWS Firewall administrator account for this policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[0-9]+$<br/>
     */
    private String adminAccountId;

    /**
     * <p>
     * The service type that is protected by the policy. Currently, this is
     * always <code>SHIELD_ADVANCED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WAF, WAFV2, SHIELD_ADVANCED,
     * SECURITY_GROUPS_COMMON, SECURITY_GROUPS_CONTENT_AUDIT,
     * SECURITY_GROUPS_USAGE_AUDIT
     */
    private String serviceType;

    /**
     * <p>
     * Details about the attack, including the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Attack type
     * </p>
     * </li>
     * <li>
     * <p>
     * Account ID
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN of the resource attacked
     * </p>
     * </li>
     * <li>
     * <p>
     * Start time of the attack
     * </p>
     * </li>
     * <li>
     * <p>
     * End time of the attack (ongoing attacks will not have an end time)
     * </p>
     * </li>
     * </ul>
     * <p>
     * The details are in JSON format.
     * </p>
     */
    private String data;

    /**
     * <p>
     * If you have more objects than the number that you specified for
     * <code>MaxResults</code> in the request, the response includes a
     * <code>NextToken</code> value. To list more objects, submit another
     * <code>GetProtectionStatus</code> request, and specify the
     * <code>NextToken</code> value from the response in the
     * <code>NextToken</code> value in the next request.
     * </p>
     * <p>
     * AWS SDKs provide auto-pagination that identify <code>NextToken</code> in
     * a response and make subsequent request calls automatically on your
     * behalf. However, this feature is not supported by
     * <code>GetProtectionStatus</code>. You must submit subsequent requests
     * with <code>NextToken</code> using your own processes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The ID of the AWS Firewall administrator account for this policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[0-9]+$<br/>
     *
     * @return <p>
     *         The ID of the AWS Firewall administrator account for this policy.
     *         </p>
     */
    public String getAdminAccountId() {
        return adminAccountId;
    }

    /**
     * <p>
     * The ID of the AWS Firewall administrator account for this policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[0-9]+$<br/>
     *
     * @param adminAccountId <p>
     *            The ID of the AWS Firewall administrator account for this
     *            policy.
     *            </p>
     */
    public void setAdminAccountId(String adminAccountId) {
        this.adminAccountId = adminAccountId;
    }

    /**
     * <p>
     * The ID of the AWS Firewall administrator account for this policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[0-9]+$<br/>
     *
     * @param adminAccountId <p>
     *            The ID of the AWS Firewall administrator account for this
     *            policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetProtectionStatusResult withAdminAccountId(String adminAccountId) {
        this.adminAccountId = adminAccountId;
        return this;
    }

    /**
     * <p>
     * The service type that is protected by the policy. Currently, this is
     * always <code>SHIELD_ADVANCED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WAF, WAFV2, SHIELD_ADVANCED,
     * SECURITY_GROUPS_COMMON, SECURITY_GROUPS_CONTENT_AUDIT,
     * SECURITY_GROUPS_USAGE_AUDIT
     *
     * @return <p>
     *         The service type that is protected by the policy. Currently, this
     *         is always <code>SHIELD_ADVANCED</code>.
     *         </p>
     * @see SecurityServiceType
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * <p>
     * The service type that is protected by the policy. Currently, this is
     * always <code>SHIELD_ADVANCED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WAF, WAFV2, SHIELD_ADVANCED,
     * SECURITY_GROUPS_COMMON, SECURITY_GROUPS_CONTENT_AUDIT,
     * SECURITY_GROUPS_USAGE_AUDIT
     *
     * @param serviceType <p>
     *            The service type that is protected by the policy. Currently,
     *            this is always <code>SHIELD_ADVANCED</code>.
     *            </p>
     * @see SecurityServiceType
     */
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * <p>
     * The service type that is protected by the policy. Currently, this is
     * always <code>SHIELD_ADVANCED</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WAF, WAFV2, SHIELD_ADVANCED,
     * SECURITY_GROUPS_COMMON, SECURITY_GROUPS_CONTENT_AUDIT,
     * SECURITY_GROUPS_USAGE_AUDIT
     *
     * @param serviceType <p>
     *            The service type that is protected by the policy. Currently,
     *            this is always <code>SHIELD_ADVANCED</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SecurityServiceType
     */
    public GetProtectionStatusResult withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * <p>
     * The service type that is protected by the policy. Currently, this is
     * always <code>SHIELD_ADVANCED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WAF, WAFV2, SHIELD_ADVANCED,
     * SECURITY_GROUPS_COMMON, SECURITY_GROUPS_CONTENT_AUDIT,
     * SECURITY_GROUPS_USAGE_AUDIT
     *
     * @param serviceType <p>
     *            The service type that is protected by the policy. Currently,
     *            this is always <code>SHIELD_ADVANCED</code>.
     *            </p>
     * @see SecurityServiceType
     */
    public void setServiceType(SecurityServiceType serviceType) {
        this.serviceType = serviceType.toString();
    }

    /**
     * <p>
     * The service type that is protected by the policy. Currently, this is
     * always <code>SHIELD_ADVANCED</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WAF, WAFV2, SHIELD_ADVANCED,
     * SECURITY_GROUPS_COMMON, SECURITY_GROUPS_CONTENT_AUDIT,
     * SECURITY_GROUPS_USAGE_AUDIT
     *
     * @param serviceType <p>
     *            The service type that is protected by the policy. Currently,
     *            this is always <code>SHIELD_ADVANCED</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SecurityServiceType
     */
    public GetProtectionStatusResult withServiceType(SecurityServiceType serviceType) {
        this.serviceType = serviceType.toString();
        return this;
    }

    /**
     * <p>
     * Details about the attack, including the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Attack type
     * </p>
     * </li>
     * <li>
     * <p>
     * Account ID
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN of the resource attacked
     * </p>
     * </li>
     * <li>
     * <p>
     * Start time of the attack
     * </p>
     * </li>
     * <li>
     * <p>
     * End time of the attack (ongoing attacks will not have an end time)
     * </p>
     * </li>
     * </ul>
     * <p>
     * The details are in JSON format.
     * </p>
     *
     * @return <p>
     *         Details about the attack, including the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Attack type
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Account ID
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ARN of the resource attacked
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Start time of the attack
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         End time of the attack (ongoing attacks will not have an end
     *         time)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The details are in JSON format.
     *         </p>
     */
    public String getData() {
        return data;
    }

    /**
     * <p>
     * Details about the attack, including the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Attack type
     * </p>
     * </li>
     * <li>
     * <p>
     * Account ID
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN of the resource attacked
     * </p>
     * </li>
     * <li>
     * <p>
     * Start time of the attack
     * </p>
     * </li>
     * <li>
     * <p>
     * End time of the attack (ongoing attacks will not have an end time)
     * </p>
     * </li>
     * </ul>
     * <p>
     * The details are in JSON format.
     * </p>
     *
     * @param data <p>
     *            Details about the attack, including the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Attack type
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Account ID
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ARN of the resource attacked
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Start time of the attack
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            End time of the attack (ongoing attacks will not have an end
     *            time)
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The details are in JSON format.
     *            </p>
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * <p>
     * Details about the attack, including the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Attack type
     * </p>
     * </li>
     * <li>
     * <p>
     * Account ID
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN of the resource attacked
     * </p>
     * </li>
     * <li>
     * <p>
     * Start time of the attack
     * </p>
     * </li>
     * <li>
     * <p>
     * End time of the attack (ongoing attacks will not have an end time)
     * </p>
     * </li>
     * </ul>
     * <p>
     * The details are in JSON format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param data <p>
     *            Details about the attack, including the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Attack type
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Account ID
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ARN of the resource attacked
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Start time of the attack
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            End time of the attack (ongoing attacks will not have an end
     *            time)
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The details are in JSON format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetProtectionStatusResult withData(String data) {
        this.data = data;
        return this;
    }

    /**
     * <p>
     * If you have more objects than the number that you specified for
     * <code>MaxResults</code> in the request, the response includes a
     * <code>NextToken</code> value. To list more objects, submit another
     * <code>GetProtectionStatus</code> request, and specify the
     * <code>NextToken</code> value from the response in the
     * <code>NextToken</code> value in the next request.
     * </p>
     * <p>
     * AWS SDKs provide auto-pagination that identify <code>NextToken</code> in
     * a response and make subsequent request calls automatically on your
     * behalf. However, this feature is not supported by
     * <code>GetProtectionStatus</code>. You must submit subsequent requests
     * with <code>NextToken</code> using your own processes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @return <p>
     *         If you have more objects than the number that you specified for
     *         <code>MaxResults</code> in the request, the response includes a
     *         <code>NextToken</code> value. To list more objects, submit
     *         another <code>GetProtectionStatus</code> request, and specify the
     *         <code>NextToken</code> value from the response in the
     *         <code>NextToken</code> value in the next request.
     *         </p>
     *         <p>
     *         AWS SDKs provide auto-pagination that identify
     *         <code>NextToken</code> in a response and make subsequent request
     *         calls automatically on your behalf. However, this feature is not
     *         supported by <code>GetProtectionStatus</code>. You must submit
     *         subsequent requests with <code>NextToken</code> using your own
     *         processes.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If you have more objects than the number that you specified for
     * <code>MaxResults</code> in the request, the response includes a
     * <code>NextToken</code> value. To list more objects, submit another
     * <code>GetProtectionStatus</code> request, and specify the
     * <code>NextToken</code> value from the response in the
     * <code>NextToken</code> value in the next request.
     * </p>
     * <p>
     * AWS SDKs provide auto-pagination that identify <code>NextToken</code> in
     * a response and make subsequent request calls automatically on your
     * behalf. However, this feature is not supported by
     * <code>GetProtectionStatus</code>. You must submit subsequent requests
     * with <code>NextToken</code> using your own processes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @param nextToken <p>
     *            If you have more objects than the number that you specified
     *            for <code>MaxResults</code> in the request, the response
     *            includes a <code>NextToken</code> value. To list more objects,
     *            submit another <code>GetProtectionStatus</code> request, and
     *            specify the <code>NextToken</code> value from the response in
     *            the <code>NextToken</code> value in the next request.
     *            </p>
     *            <p>
     *            AWS SDKs provide auto-pagination that identify
     *            <code>NextToken</code> in a response and make subsequent
     *            request calls automatically on your behalf. However, this
     *            feature is not supported by <code>GetProtectionStatus</code>.
     *            You must submit subsequent requests with
     *            <code>NextToken</code> using your own processes.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If you have more objects than the number that you specified for
     * <code>MaxResults</code> in the request, the response includes a
     * <code>NextToken</code> value. To list more objects, submit another
     * <code>GetProtectionStatus</code> request, and specify the
     * <code>NextToken</code> value from the response in the
     * <code>NextToken</code> value in the next request.
     * </p>
     * <p>
     * AWS SDKs provide auto-pagination that identify <code>NextToken</code> in
     * a response and make subsequent request calls automatically on your
     * behalf. However, this feature is not supported by
     * <code>GetProtectionStatus</code>. You must submit subsequent requests
     * with <code>NextToken</code> using your own processes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @param nextToken <p>
     *            If you have more objects than the number that you specified
     *            for <code>MaxResults</code> in the request, the response
     *            includes a <code>NextToken</code> value. To list more objects,
     *            submit another <code>GetProtectionStatus</code> request, and
     *            specify the <code>NextToken</code> value from the response in
     *            the <code>NextToken</code> value in the next request.
     *            </p>
     *            <p>
     *            AWS SDKs provide auto-pagination that identify
     *            <code>NextToken</code> in a response and make subsequent
     *            request calls automatically on your behalf. However, this
     *            feature is not supported by <code>GetProtectionStatus</code>.
     *            You must submit subsequent requests with
     *            <code>NextToken</code> using your own processes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetProtectionStatusResult withNextToken(String nextToken) {
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
        if (getAdminAccountId() != null)
            sb.append("AdminAccountId: " + getAdminAccountId() + ",");
        if (getServiceType() != null)
            sb.append("ServiceType: " + getServiceType() + ",");
        if (getData() != null)
            sb.append("Data: " + getData() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAdminAccountId() == null) ? 0 : getAdminAccountId().hashCode());
        hashCode = prime * hashCode
                + ((getServiceType() == null) ? 0 : getServiceType().hashCode());
        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetProtectionStatusResult == false)
            return false;
        GetProtectionStatusResult other = (GetProtectionStatusResult) obj;

        if (other.getAdminAccountId() == null ^ this.getAdminAccountId() == null)
            return false;
        if (other.getAdminAccountId() != null
                && other.getAdminAccountId().equals(this.getAdminAccountId()) == false)
            return false;
        if (other.getServiceType() == null ^ this.getServiceType() == null)
            return false;
        if (other.getServiceType() != null
                && other.getServiceType().equals(this.getServiceType()) == false)
            return false;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
