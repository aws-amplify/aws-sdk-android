/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Provides a list of analysis segments for a real-time analysis session.
 * </p>
 */
public class ListRealtimeContactAnalysisSegmentsV2Request extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String contactId;

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100000<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The Contact Lens output type to be returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Raw, Redacted
     */
    private String outputType;

    /**
     * <p>
     * Enum with segment types . Each value corresponds to a segment type
     * returned in the segments list of the API. Each segment type has its own
     * structure. Different channels may have different sets of supported
     * segment types.
     * </p>
     */
    private java.util.List<String> segmentTypes;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier of the Amazon Connect instance. You can <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *         >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *         the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can <a
     *            href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *            >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *            the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can <a
     *            href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *            >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *            the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRealtimeContactAnalysisSegmentsV2Request withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The identifier of the contact in this instance of Amazon Connect.
     *         </p>
     */
    public String getContactId() {
        return contactId;
    }

    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param contactId <p>
     *            The identifier of the contact in this instance of Amazon
     *            Connect.
     *            </p>
     */
    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param contactId <p>
     *            The identifier of the contact in this instance of Amazon
     *            Connect.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRealtimeContactAnalysisSegmentsV2Request withContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of results to return per page.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return per page.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return per page.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRealtimeContactAnalysisSegmentsV2Request withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100000<br/>
     *
     * @return <p>
     *         The token for the next set of results. Use the value returned in
     *         the previous response in the next request to retrieve the next
     *         set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100000<br/>
     *
     * @param nextToken <p>
     *            The token for the next set of results. Use the value returned
     *            in the previous response in the next request to retrieve the
     *            next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100000<br/>
     *
     * @param nextToken <p>
     *            The token for the next set of results. Use the value returned
     *            in the previous response in the next request to retrieve the
     *            next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRealtimeContactAnalysisSegmentsV2Request withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The Contact Lens output type to be returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Raw, Redacted
     *
     * @return <p>
     *         The Contact Lens output type to be returned.
     *         </p>
     * @see RealTimeContactAnalysisOutputType
     */
    public String getOutputType() {
        return outputType;
    }

    /**
     * <p>
     * The Contact Lens output type to be returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Raw, Redacted
     *
     * @param outputType <p>
     *            The Contact Lens output type to be returned.
     *            </p>
     * @see RealTimeContactAnalysisOutputType
     */
    public void setOutputType(String outputType) {
        this.outputType = outputType;
    }

    /**
     * <p>
     * The Contact Lens output type to be returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Raw, Redacted
     *
     * @param outputType <p>
     *            The Contact Lens output type to be returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RealTimeContactAnalysisOutputType
     */
    public ListRealtimeContactAnalysisSegmentsV2Request withOutputType(String outputType) {
        this.outputType = outputType;
        return this;
    }

    /**
     * <p>
     * The Contact Lens output type to be returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Raw, Redacted
     *
     * @param outputType <p>
     *            The Contact Lens output type to be returned.
     *            </p>
     * @see RealTimeContactAnalysisOutputType
     */
    public void setOutputType(RealTimeContactAnalysisOutputType outputType) {
        this.outputType = outputType.toString();
    }

    /**
     * <p>
     * The Contact Lens output type to be returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Raw, Redacted
     *
     * @param outputType <p>
     *            The Contact Lens output type to be returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RealTimeContactAnalysisOutputType
     */
    public ListRealtimeContactAnalysisSegmentsV2Request withOutputType(
            RealTimeContactAnalysisOutputType outputType) {
        this.outputType = outputType.toString();
        return this;
    }

    /**
     * <p>
     * Enum with segment types . Each value corresponds to a segment type
     * returned in the segments list of the API. Each segment type has its own
     * structure. Different channels may have different sets of supported
     * segment types.
     * </p>
     *
     * @return <p>
     *         Enum with segment types . Each value corresponds to a segment
     *         type returned in the segments list of the API. Each segment type
     *         has its own structure. Different channels may have different sets
     *         of supported segment types.
     *         </p>
     */
    public java.util.List<String> getSegmentTypes() {
        return segmentTypes;
    }

    /**
     * <p>
     * Enum with segment types . Each value corresponds to a segment type
     * returned in the segments list of the API. Each segment type has its own
     * structure. Different channels may have different sets of supported
     * segment types.
     * </p>
     *
     * @param segmentTypes <p>
     *            Enum with segment types . Each value corresponds to a segment
     *            type returned in the segments list of the API. Each segment
     *            type has its own structure. Different channels may have
     *            different sets of supported segment types.
     *            </p>
     */
    public void setSegmentTypes(java.util.Collection<String> segmentTypes) {
        if (segmentTypes == null) {
            this.segmentTypes = null;
            return;
        }

        this.segmentTypes = new java.util.ArrayList<String>(segmentTypes);
    }

    /**
     * <p>
     * Enum with segment types . Each value corresponds to a segment type
     * returned in the segments list of the API. Each segment type has its own
     * structure. Different channels may have different sets of supported
     * segment types.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param segmentTypes <p>
     *            Enum with segment types . Each value corresponds to a segment
     *            type returned in the segments list of the API. Each segment
     *            type has its own structure. Different channels may have
     *            different sets of supported segment types.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRealtimeContactAnalysisSegmentsV2Request withSegmentTypes(String... segmentTypes) {
        if (getSegmentTypes() == null) {
            this.segmentTypes = new java.util.ArrayList<String>(segmentTypes.length);
        }
        for (String value : segmentTypes) {
            this.segmentTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Enum with segment types . Each value corresponds to a segment type
     * returned in the segments list of the API. Each segment type has its own
     * structure. Different channels may have different sets of supported
     * segment types.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param segmentTypes <p>
     *            Enum with segment types . Each value corresponds to a segment
     *            type returned in the segments list of the API. Each segment
     *            type has its own structure. Different channels may have
     *            different sets of supported segment types.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRealtimeContactAnalysisSegmentsV2Request withSegmentTypes(
            java.util.Collection<String> segmentTypes) {
        setSegmentTypes(segmentTypes);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getContactId() != null)
            sb.append("ContactId: " + getContactId() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getOutputType() != null)
            sb.append("OutputType: " + getOutputType() + ",");
        if (getSegmentTypes() != null)
            sb.append("SegmentTypes: " + getSegmentTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getContactId() == null) ? 0 : getContactId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getOutputType() == null) ? 0 : getOutputType().hashCode());
        hashCode = prime * hashCode
                + ((getSegmentTypes() == null) ? 0 : getSegmentTypes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRealtimeContactAnalysisSegmentsV2Request == false)
            return false;
        ListRealtimeContactAnalysisSegmentsV2Request other = (ListRealtimeContactAnalysisSegmentsV2Request) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getContactId() == null ^ this.getContactId() == null)
            return false;
        if (other.getContactId() != null
                && other.getContactId().equals(this.getContactId()) == false)
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
        if (other.getOutputType() == null ^ this.getOutputType() == null)
            return false;
        if (other.getOutputType() != null
                && other.getOutputType().equals(this.getOutputType()) == false)
            return false;
        if (other.getSegmentTypes() == null ^ this.getSegmentTypes() == null)
            return false;
        if (other.getSegmentTypes() != null
                && other.getSegmentTypes().equals(this.getSegmentTypes()) == false)
            return false;
        return true;
    }
}
