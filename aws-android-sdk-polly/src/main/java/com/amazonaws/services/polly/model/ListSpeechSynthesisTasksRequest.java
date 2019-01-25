/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.polly.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a list of SpeechSynthesisTask objects ordered by their creation date.
 * This operation can filter the tasks by their status, for example, allowing
 * users to list only tasks that are completed.
 * </p>
 */
public class ListSpeechSynthesisTasksRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Maximum number of speech synthesis tasks returned in a List operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The pagination token to use in the next request to continue the listing
     * of speech synthesis tasks.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Status of the speech synthesis tasks returned in a List operation
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>scheduled, inProgress, completed, failed
     */
    private String status;

    /**
     * <p>
     * Maximum number of speech synthesis tasks returned in a List operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         Maximum number of speech synthesis tasks returned in a List
     *         operation.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * Maximum number of speech synthesis tasks returned in a List operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            Maximum number of speech synthesis tasks returned in a List
     *            operation.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of speech synthesis tasks returned in a List operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            Maximum number of speech synthesis tasks returned in a List
     *            operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSpeechSynthesisTasksRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The pagination token to use in the next request to continue the listing
     * of speech synthesis tasks.
     * </p>
     *
     * @return <p>
     *         The pagination token to use in the next request to continue the
     *         listing of speech synthesis tasks.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The pagination token to use in the next request to continue the listing
     * of speech synthesis tasks.
     * </p>
     *
     * @param nextToken <p>
     *            The pagination token to use in the next request to continue
     *            the listing of speech synthesis tasks.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to use in the next request to continue the listing
     * of speech synthesis tasks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The pagination token to use in the next request to continue
     *            the listing of speech synthesis tasks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSpeechSynthesisTasksRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Status of the speech synthesis tasks returned in a List operation
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>scheduled, inProgress, completed, failed
     *
     * @return <p>
     *         Status of the speech synthesis tasks returned in a List operation
     *         </p>
     * @see TaskStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Status of the speech synthesis tasks returned in a List operation
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>scheduled, inProgress, completed, failed
     *
     * @param status <p>
     *            Status of the speech synthesis tasks returned in a List
     *            operation
     *            </p>
     * @see TaskStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of the speech synthesis tasks returned in a List operation
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>scheduled, inProgress, completed, failed
     *
     * @param status <p>
     *            Status of the speech synthesis tasks returned in a List
     *            operation
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TaskStatus
     */
    public ListSpeechSynthesisTasksRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Status of the speech synthesis tasks returned in a List operation
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>scheduled, inProgress, completed, failed
     *
     * @param status <p>
     *            Status of the speech synthesis tasks returned in a List
     *            operation
     *            </p>
     * @see TaskStatus
     */
    public void setStatus(TaskStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Status of the speech synthesis tasks returned in a List operation
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>scheduled, inProgress, completed, failed
     *
     * @param status <p>
     *            Status of the speech synthesis tasks returned in a List
     *            operation
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TaskStatus
     */
    public ListSpeechSynthesisTasksRequest withStatus(TaskStatus status) {
        this.status = status.toString();
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
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSpeechSynthesisTasksRequest == false)
            return false;
        ListSpeechSynthesisTasksRequest other = (ListSpeechSynthesisTasksRequest) obj;

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
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
