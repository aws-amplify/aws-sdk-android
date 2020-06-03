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

package com.amazonaws.services.iam.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists the virtual MFA devices defined in the AWS account by assignment
 * status. If you do not specify an assignment status, the operation returns a
 * list of all virtual MFA devices. Assignment status can be
 * <code>Assigned</code>, <code>Unassigned</code>, or <code>Any</code>.
 * </p>
 * <p>
 * You can paginate the results using the <code>MaxItems</code> and
 * <code>Marker</code> parameters.
 * </p>
 */
public class ListVirtualMFADevicesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The status (<code>Unassigned</code> or <code>Assigned</code>) of the
     * devices to list. If you do not specify an <code>AssignmentStatus</code>,
     * the operation defaults to <code>Any</code>, which lists both assigned and
     * unassigned virtual MFA devices.,
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Assigned, Unassigned, Any
     */
    private String assignmentStatus;

    /**
     * <p>
     * Use this parameter only when paginating results and only after you
     * receive a response indicating that the results are truncated. Set it to
     * the value of the <code>Marker</code> element in the response that you
     * received to indicate where the next call should start.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     */
    private String marker;

    /**
     * <p>
     * Use this only when paginating results to indicate the maximum number of
     * items you want in the response. If additional items exist beyond the
     * maximum you specify, the <code>IsTruncated</code> response element is
     * <code>true</code>.
     * </p>
     * <p>
     * If you do not include this parameter, the number of items defaults to
     * 100. Note that IAM might return fewer results, even when there are more
     * results available. In that case, the <code>IsTruncated</code> response
     * element returns <code>true</code>, and <code>Marker</code> contains a
     * value to include in the subsequent call that tells the service where to
     * continue from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer maxItems;

    /**
     * <p>
     * The status (<code>Unassigned</code> or <code>Assigned</code>) of the
     * devices to list. If you do not specify an <code>AssignmentStatus</code>,
     * the operation defaults to <code>Any</code>, which lists both assigned and
     * unassigned virtual MFA devices.,
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Assigned, Unassigned, Any
     *
     * @return <p>
     *         The status (<code>Unassigned</code> or <code>Assigned</code>) of
     *         the devices to list. If you do not specify an
     *         <code>AssignmentStatus</code>, the operation defaults to
     *         <code>Any</code>, which lists both assigned and unassigned
     *         virtual MFA devices.,
     *         </p>
     * @see AssignmentStatusType
     */
    public String getAssignmentStatus() {
        return assignmentStatus;
    }

    /**
     * <p>
     * The status (<code>Unassigned</code> or <code>Assigned</code>) of the
     * devices to list. If you do not specify an <code>AssignmentStatus</code>,
     * the operation defaults to <code>Any</code>, which lists both assigned and
     * unassigned virtual MFA devices.,
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Assigned, Unassigned, Any
     *
     * @param assignmentStatus <p>
     *            The status (<code>Unassigned</code> or <code>Assigned</code>)
     *            of the devices to list. If you do not specify an
     *            <code>AssignmentStatus</code>, the operation defaults to
     *            <code>Any</code>, which lists both assigned and unassigned
     *            virtual MFA devices.,
     *            </p>
     * @see AssignmentStatusType
     */
    public void setAssignmentStatus(String assignmentStatus) {
        this.assignmentStatus = assignmentStatus;
    }

    /**
     * <p>
     * The status (<code>Unassigned</code> or <code>Assigned</code>) of the
     * devices to list. If you do not specify an <code>AssignmentStatus</code>,
     * the operation defaults to <code>Any</code>, which lists both assigned and
     * unassigned virtual MFA devices.,
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Assigned, Unassigned, Any
     *
     * @param assignmentStatus <p>
     *            The status (<code>Unassigned</code> or <code>Assigned</code>)
     *            of the devices to list. If you do not specify an
     *            <code>AssignmentStatus</code>, the operation defaults to
     *            <code>Any</code>, which lists both assigned and unassigned
     *            virtual MFA devices.,
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AssignmentStatusType
     */
    public ListVirtualMFADevicesRequest withAssignmentStatus(String assignmentStatus) {
        this.assignmentStatus = assignmentStatus;
        return this;
    }

    /**
     * <p>
     * The status (<code>Unassigned</code> or <code>Assigned</code>) of the
     * devices to list. If you do not specify an <code>AssignmentStatus</code>,
     * the operation defaults to <code>Any</code>, which lists both assigned and
     * unassigned virtual MFA devices.,
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Assigned, Unassigned, Any
     *
     * @param assignmentStatus <p>
     *            The status (<code>Unassigned</code> or <code>Assigned</code>)
     *            of the devices to list. If you do not specify an
     *            <code>AssignmentStatus</code>, the operation defaults to
     *            <code>Any</code>, which lists both assigned and unassigned
     *            virtual MFA devices.,
     *            </p>
     * @see AssignmentStatusType
     */
    public void setAssignmentStatus(AssignmentStatusType assignmentStatus) {
        this.assignmentStatus = assignmentStatus.toString();
    }

    /**
     * <p>
     * The status (<code>Unassigned</code> or <code>Assigned</code>) of the
     * devices to list. If you do not specify an <code>AssignmentStatus</code>,
     * the operation defaults to <code>Any</code>, which lists both assigned and
     * unassigned virtual MFA devices.,
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Assigned, Unassigned, Any
     *
     * @param assignmentStatus <p>
     *            The status (<code>Unassigned</code> or <code>Assigned</code>)
     *            of the devices to list. If you do not specify an
     *            <code>AssignmentStatus</code>, the operation defaults to
     *            <code>Any</code>, which lists both assigned and unassigned
     *            virtual MFA devices.,
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AssignmentStatusType
     */
    public ListVirtualMFADevicesRequest withAssignmentStatus(AssignmentStatusType assignmentStatus) {
        this.assignmentStatus = assignmentStatus.toString();
        return this;
    }

    /**
     * <p>
     * Use this parameter only when paginating results and only after you
     * receive a response indicating that the results are truncated. Set it to
     * the value of the <code>Marker</code> element in the response that you
     * received to indicate where the next call should start.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @return <p>
     *         Use this parameter only when paginating results and only after
     *         you receive a response indicating that the results are truncated.
     *         Set it to the value of the <code>Marker</code> element in the
     *         response that you received to indicate where the next call should
     *         start.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * Use this parameter only when paginating results and only after you
     * receive a response indicating that the results are truncated. Set it to
     * the value of the <code>Marker</code> element in the response that you
     * received to indicate where the next call should start.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param marker <p>
     *            Use this parameter only when paginating results and only after
     *            you receive a response indicating that the results are
     *            truncated. Set it to the value of the <code>Marker</code>
     *            element in the response that you received to indicate where
     *            the next call should start.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Use this parameter only when paginating results and only after you
     * receive a response indicating that the results are truncated. Set it to
     * the value of the <code>Marker</code> element in the response that you
     * received to indicate where the next call should start.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param marker <p>
     *            Use this parameter only when paginating results and only after
     *            you receive a response indicating that the results are
     *            truncated. Set it to the value of the <code>Marker</code>
     *            element in the response that you received to indicate where
     *            the next call should start.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVirtualMFADevicesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * Use this only when paginating results to indicate the maximum number of
     * items you want in the response. If additional items exist beyond the
     * maximum you specify, the <code>IsTruncated</code> response element is
     * <code>true</code>.
     * </p>
     * <p>
     * If you do not include this parameter, the number of items defaults to
     * 100. Note that IAM might return fewer results, even when there are more
     * results available. In that case, the <code>IsTruncated</code> response
     * element returns <code>true</code>, and <code>Marker</code> contains a
     * value to include in the subsequent call that tells the service where to
     * continue from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return <p>
     *         Use this only when paginating results to indicate the maximum
     *         number of items you want in the response. If additional items
     *         exist beyond the maximum you specify, the
     *         <code>IsTruncated</code> response element is <code>true</code>.
     *         </p>
     *         <p>
     *         If you do not include this parameter, the number of items
     *         defaults to 100. Note that IAM might return fewer results, even
     *         when there are more results available. In that case, the
     *         <code>IsTruncated</code> response element returns
     *         <code>true</code>, and <code>Marker</code> contains a value to
     *         include in the subsequent call that tells the service where to
     *         continue from.
     *         </p>
     */
    public Integer getMaxItems() {
        return maxItems;
    }

    /**
     * <p>
     * Use this only when paginating results to indicate the maximum number of
     * items you want in the response. If additional items exist beyond the
     * maximum you specify, the <code>IsTruncated</code> response element is
     * <code>true</code>.
     * </p>
     * <p>
     * If you do not include this parameter, the number of items defaults to
     * 100. Note that IAM might return fewer results, even when there are more
     * results available. In that case, the <code>IsTruncated</code> response
     * element returns <code>true</code>, and <code>Marker</code> contains a
     * value to include in the subsequent call that tells the service where to
     * continue from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxItems <p>
     *            Use this only when paginating results to indicate the maximum
     *            number of items you want in the response. If additional items
     *            exist beyond the maximum you specify, the
     *            <code>IsTruncated</code> response element is <code>true</code>
     *            .
     *            </p>
     *            <p>
     *            If you do not include this parameter, the number of items
     *            defaults to 100. Note that IAM might return fewer results,
     *            even when there are more results available. In that case, the
     *            <code>IsTruncated</code> response element returns
     *            <code>true</code>, and <code>Marker</code> contains a value to
     *            include in the subsequent call that tells the service where to
     *            continue from.
     *            </p>
     */
    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * Use this only when paginating results to indicate the maximum number of
     * items you want in the response. If additional items exist beyond the
     * maximum you specify, the <code>IsTruncated</code> response element is
     * <code>true</code>.
     * </p>
     * <p>
     * If you do not include this parameter, the number of items defaults to
     * 100. Note that IAM might return fewer results, even when there are more
     * results available. In that case, the <code>IsTruncated</code> response
     * element returns <code>true</code>, and <code>Marker</code> contains a
     * value to include in the subsequent call that tells the service where to
     * continue from.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxItems <p>
     *            Use this only when paginating results to indicate the maximum
     *            number of items you want in the response. If additional items
     *            exist beyond the maximum you specify, the
     *            <code>IsTruncated</code> response element is <code>true</code>
     *            .
     *            </p>
     *            <p>
     *            If you do not include this parameter, the number of items
     *            defaults to 100. Note that IAM might return fewer results,
     *            even when there are more results available. In that case, the
     *            <code>IsTruncated</code> response element returns
     *            <code>true</code>, and <code>Marker</code> contains a value to
     *            include in the subsequent call that tells the service where to
     *            continue from.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVirtualMFADevicesRequest withMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
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
        if (getAssignmentStatus() != null)
            sb.append("AssignmentStatus: " + getAssignmentStatus() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getMaxItems() != null)
            sb.append("MaxItems: " + getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAssignmentStatus() == null) ? 0 : getAssignmentStatus().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListVirtualMFADevicesRequest == false)
            return false;
        ListVirtualMFADevicesRequest other = (ListVirtualMFADevicesRequest) obj;

        if (other.getAssignmentStatus() == null ^ this.getAssignmentStatus() == null)
            return false;
        if (other.getAssignmentStatus() != null
                && other.getAssignmentStatus().equals(this.getAssignmentStatus()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }
}
