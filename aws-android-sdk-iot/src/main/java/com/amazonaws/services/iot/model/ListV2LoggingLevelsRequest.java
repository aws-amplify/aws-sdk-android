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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists logging levels.
 * </p>
 */
public class ListV2LoggingLevelsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The type of resource for which you are configuring logging. Must be
     * <code>THING_Group</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, THING_GROUP
     */
    private String targetType;

    /**
     * <p>
     * To retrieve the next set of results, the <code>nextToken</code> value
     * from a previous response; otherwise <b>null</b> to receive the first set
     * of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The type of resource for which you are configuring logging. Must be
     * <code>THING_Group</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, THING_GROUP
     *
     * @return <p>
     *         The type of resource for which you are configuring logging. Must
     *         be <code>THING_Group</code>.
     *         </p>
     * @see LogTargetType
     */
    public String getTargetType() {
        return targetType;
    }

    /**
     * <p>
     * The type of resource for which you are configuring logging. Must be
     * <code>THING_Group</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, THING_GROUP
     *
     * @param targetType <p>
     *            The type of resource for which you are configuring logging.
     *            Must be <code>THING_Group</code>.
     *            </p>
     * @see LogTargetType
     */
    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    /**
     * <p>
     * The type of resource for which you are configuring logging. Must be
     * <code>THING_Group</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, THING_GROUP
     *
     * @param targetType <p>
     *            The type of resource for which you are configuring logging.
     *            Must be <code>THING_Group</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LogTargetType
     */
    public ListV2LoggingLevelsRequest withTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * <p>
     * The type of resource for which you are configuring logging. Must be
     * <code>THING_Group</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, THING_GROUP
     *
     * @param targetType <p>
     *            The type of resource for which you are configuring logging.
     *            Must be <code>THING_Group</code>.
     *            </p>
     * @see LogTargetType
     */
    public void setTargetType(LogTargetType targetType) {
        this.targetType = targetType.toString();
    }

    /**
     * <p>
     * The type of resource for which you are configuring logging. Must be
     * <code>THING_Group</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, THING_GROUP
     *
     * @param targetType <p>
     *            The type of resource for which you are configuring logging.
     *            Must be <code>THING_Group</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LogTargetType
     */
    public ListV2LoggingLevelsRequest withTargetType(LogTargetType targetType) {
        this.targetType = targetType.toString();
        return this;
    }

    /**
     * <p>
     * To retrieve the next set of results, the <code>nextToken</code> value
     * from a previous response; otherwise <b>null</b> to receive the first set
     * of results.
     * </p>
     *
     * @return <p>
     *         To retrieve the next set of results, the <code>nextToken</code>
     *         value from a previous response; otherwise <b>null</b> to receive
     *         the first set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * To retrieve the next set of results, the <code>nextToken</code> value
     * from a previous response; otherwise <b>null</b> to receive the first set
     * of results.
     * </p>
     *
     * @param nextToken <p>
     *            To retrieve the next set of results, the
     *            <code>nextToken</code> value from a previous response;
     *            otherwise <b>null</b> to receive the first set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * To retrieve the next set of results, the <code>nextToken</code> value
     * from a previous response; otherwise <b>null</b> to receive the first set
     * of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            To retrieve the next set of results, the
     *            <code>nextToken</code> value from a previous response;
     *            otherwise <b>null</b> to receive the first set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListV2LoggingLevelsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @return <p>
     *         The maximum number of results to return at one time.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return at one time.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return at one time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListV2LoggingLevelsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
        if (getTargetType() != null)
            sb.append("targetType: " + getTargetType() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetType() == null) ? 0 : getTargetType().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListV2LoggingLevelsRequest == false)
            return false;
        ListV2LoggingLevelsRequest other = (ListV2LoggingLevelsRequest) obj;

        if (other.getTargetType() == null ^ this.getTargetType() == null)
            return false;
        if (other.getTargetType() != null
                && other.getTargetType().equals(this.getTargetType()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }
}
