/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connectparticipant.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves a transcript of the session, including details about any
 * attachments. Note that ConnectionToken is used for invoking this API instead
 * of ParticipantToken.
 * </p>
 * <p>
 * The Amazon Connect Participant Service APIs do not use <a href=
 * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
 * >Signature Version 4 authentication</a>.
 * </p>
 */
public class GetTranscriptRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The contactId from the current contact chain for which transcript is
     * needed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String contactId;

    /**
     * <p>
     * The maximum number of results to return in the page. Default: 10.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The pagination token. Use the value returned previously in the next
     * subsequent request to retrieve the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The direction from StartPosition from which to retrieve message. Default:
     * BACKWARD when no StartPosition is provided, FORWARD with StartPosition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FORWARD, BACKWARD
     */
    private String scanDirection;

    /**
     * <p>
     * The sort order for the records. Default: DESCENDING.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DESCENDING, ASCENDING
     */
    private String sortOrder;

    /**
     * <p>
     * A filtering option for where to start.
     * </p>
     */
    private StartPosition startPosition;

    /**
     * <p>
     * The authentication token associated with the participant's connection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     */
    private String connectionToken;

    /**
     * <p>
     * The contactId from the current contact chain for which transcript is
     * needed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The contactId from the current contact chain for which transcript
     *         is needed.
     *         </p>
     */
    public String getContactId() {
        return contactId;
    }

    /**
     * <p>
     * The contactId from the current contact chain for which transcript is
     * needed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param contactId <p>
     *            The contactId from the current contact chain for which
     *            transcript is needed.
     *            </p>
     */
    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    /**
     * <p>
     * The contactId from the current contact chain for which transcript is
     * needed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param contactId <p>
     *            The contactId from the current contact chain for which
     *            transcript is needed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTranscriptRequest withContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in the page. Default: 10.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @return <p>
     *         The maximum number of results to return in the page. Default: 10.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the page. Default: 10.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return in the page. Default:
     *            10.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the page. Default: 10.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return in the page. Default:
     *            10.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTranscriptRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The pagination token. Use the value returned previously in the next
     * subsequent request to retrieve the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @return <p>
     *         The pagination token. Use the value returned previously in the
     *         next subsequent request to retrieve the next set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The pagination token. Use the value returned previously in the next
     * subsequent request to retrieve the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param nextToken <p>
     *            The pagination token. Use the value returned previously in the
     *            next subsequent request to retrieve the next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token. Use the value returned previously in the next
     * subsequent request to retrieve the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param nextToken <p>
     *            The pagination token. Use the value returned previously in the
     *            next subsequent request to retrieve the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTranscriptRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The direction from StartPosition from which to retrieve message. Default:
     * BACKWARD when no StartPosition is provided, FORWARD with StartPosition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FORWARD, BACKWARD
     *
     * @return <p>
     *         The direction from StartPosition from which to retrieve message.
     *         Default: BACKWARD when no StartPosition is provided, FORWARD with
     *         StartPosition.
     *         </p>
     * @see ScanDirection
     */
    public String getScanDirection() {
        return scanDirection;
    }

    /**
     * <p>
     * The direction from StartPosition from which to retrieve message. Default:
     * BACKWARD when no StartPosition is provided, FORWARD with StartPosition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FORWARD, BACKWARD
     *
     * @param scanDirection <p>
     *            The direction from StartPosition from which to retrieve
     *            message. Default: BACKWARD when no StartPosition is provided,
     *            FORWARD with StartPosition.
     *            </p>
     * @see ScanDirection
     */
    public void setScanDirection(String scanDirection) {
        this.scanDirection = scanDirection;
    }

    /**
     * <p>
     * The direction from StartPosition from which to retrieve message. Default:
     * BACKWARD when no StartPosition is provided, FORWARD with StartPosition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FORWARD, BACKWARD
     *
     * @param scanDirection <p>
     *            The direction from StartPosition from which to retrieve
     *            message. Default: BACKWARD when no StartPosition is provided,
     *            FORWARD with StartPosition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ScanDirection
     */
    public GetTranscriptRequest withScanDirection(String scanDirection) {
        this.scanDirection = scanDirection;
        return this;
    }

    /**
     * <p>
     * The direction from StartPosition from which to retrieve message. Default:
     * BACKWARD when no StartPosition is provided, FORWARD with StartPosition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FORWARD, BACKWARD
     *
     * @param scanDirection <p>
     *            The direction from StartPosition from which to retrieve
     *            message. Default: BACKWARD when no StartPosition is provided,
     *            FORWARD with StartPosition.
     *            </p>
     * @see ScanDirection
     */
    public void setScanDirection(ScanDirection scanDirection) {
        this.scanDirection = scanDirection.toString();
    }

    /**
     * <p>
     * The direction from StartPosition from which to retrieve message. Default:
     * BACKWARD when no StartPosition is provided, FORWARD with StartPosition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FORWARD, BACKWARD
     *
     * @param scanDirection <p>
     *            The direction from StartPosition from which to retrieve
     *            message. Default: BACKWARD when no StartPosition is provided,
     *            FORWARD with StartPosition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ScanDirection
     */
    public GetTranscriptRequest withScanDirection(ScanDirection scanDirection) {
        this.scanDirection = scanDirection.toString();
        return this;
    }

    /**
     * <p>
     * The sort order for the records. Default: DESCENDING.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DESCENDING, ASCENDING
     *
     * @return <p>
     *         The sort order for the records. Default: DESCENDING.
     *         </p>
     * @see SortKey
     */
    public String getSortOrder() {
        return sortOrder;
    }

    /**
     * <p>
     * The sort order for the records. Default: DESCENDING.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DESCENDING, ASCENDING
     *
     * @param sortOrder <p>
     *            The sort order for the records. Default: DESCENDING.
     *            </p>
     * @see SortKey
     */
    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The sort order for the records. Default: DESCENDING.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DESCENDING, ASCENDING
     *
     * @param sortOrder <p>
     *            The sort order for the records. Default: DESCENDING.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortKey
     */
    public GetTranscriptRequest withSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     * <p>
     * The sort order for the records. Default: DESCENDING.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DESCENDING, ASCENDING
     *
     * @param sortOrder <p>
     *            The sort order for the records. Default: DESCENDING.
     *            </p>
     * @see SortKey
     */
    public void setSortOrder(SortKey sortOrder) {
        this.sortOrder = sortOrder.toString();
    }

    /**
     * <p>
     * The sort order for the records. Default: DESCENDING.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DESCENDING, ASCENDING
     *
     * @param sortOrder <p>
     *            The sort order for the records. Default: DESCENDING.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortKey
     */
    public GetTranscriptRequest withSortOrder(SortKey sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * A filtering option for where to start.
     * </p>
     *
     * @return <p>
     *         A filtering option for where to start.
     *         </p>
     */
    public StartPosition getStartPosition() {
        return startPosition;
    }

    /**
     * <p>
     * A filtering option for where to start.
     * </p>
     *
     * @param startPosition <p>
     *            A filtering option for where to start.
     *            </p>
     */
    public void setStartPosition(StartPosition startPosition) {
        this.startPosition = startPosition;
    }

    /**
     * <p>
     * A filtering option for where to start.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startPosition <p>
     *            A filtering option for where to start.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTranscriptRequest withStartPosition(StartPosition startPosition) {
        this.startPosition = startPosition;
        return this;
    }

    /**
     * <p>
     * The authentication token associated with the participant's connection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @return <p>
     *         The authentication token associated with the participant's
     *         connection.
     *         </p>
     */
    public String getConnectionToken() {
        return connectionToken;
    }

    /**
     * <p>
     * The authentication token associated with the participant's connection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param connectionToken <p>
     *            The authentication token associated with the participant's
     *            connection.
     *            </p>
     */
    public void setConnectionToken(String connectionToken) {
        this.connectionToken = connectionToken;
    }

    /**
     * <p>
     * The authentication token associated with the participant's connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param connectionToken <p>
     *            The authentication token associated with the participant's
     *            connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTranscriptRequest withConnectionToken(String connectionToken) {
        this.connectionToken = connectionToken;
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
        if (getContactId() != null)
            sb.append("ContactId: " + getContactId() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getScanDirection() != null)
            sb.append("ScanDirection: " + getScanDirection() + ",");
        if (getSortOrder() != null)
            sb.append("SortOrder: " + getSortOrder() + ",");
        if (getStartPosition() != null)
            sb.append("StartPosition: " + getStartPosition() + ",");
        if (getConnectionToken() != null)
            sb.append("ConnectionToken: " + getConnectionToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContactId() == null) ? 0 : getContactId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getScanDirection() == null) ? 0 : getScanDirection().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode
                + ((getStartPosition() == null) ? 0 : getStartPosition().hashCode());
        hashCode = prime * hashCode
                + ((getConnectionToken() == null) ? 0 : getConnectionToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTranscriptRequest == false)
            return false;
        GetTranscriptRequest other = (GetTranscriptRequest) obj;

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
        if (other.getScanDirection() == null ^ this.getScanDirection() == null)
            return false;
        if (other.getScanDirection() != null
                && other.getScanDirection().equals(this.getScanDirection()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null
                && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        if (other.getStartPosition() == null ^ this.getStartPosition() == null)
            return false;
        if (other.getStartPosition() != null
                && other.getStartPosition().equals(this.getStartPosition()) == false)
            return false;
        if (other.getConnectionToken() == null ^ this.getConnectionToken() == null)
            return false;
        if (other.getConnectionToken() != null
                && other.getConnectionToken().equals(this.getConnectionToken()) == false)
            return false;
        return true;
    }
}
