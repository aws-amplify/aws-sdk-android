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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

public class ListWorkteamsResult implements Serializable {
    /**
     * <p>
     * An array of <code>Workteam</code> objects, each describing a work team.
     * </p>
     */
    private java.util.List<Workteam> workteams;

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To
     * retrieve the next set of work teams, use it in the subsequent request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>Workteam</code> objects, each describing a work team.
     * </p>
     *
     * @return <p>
     *         An array of <code>Workteam</code> objects, each describing a work
     *         team.
     *         </p>
     */
    public java.util.List<Workteam> getWorkteams() {
        return workteams;
    }

    /**
     * <p>
     * An array of <code>Workteam</code> objects, each describing a work team.
     * </p>
     *
     * @param workteams <p>
     *            An array of <code>Workteam</code> objects, each describing a
     *            work team.
     *            </p>
     */
    public void setWorkteams(java.util.Collection<Workteam> workteams) {
        if (workteams == null) {
            this.workteams = null;
            return;
        }

        this.workteams = new java.util.ArrayList<Workteam>(workteams);
    }

    /**
     * <p>
     * An array of <code>Workteam</code> objects, each describing a work team.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param workteams <p>
     *            An array of <code>Workteam</code> objects, each describing a
     *            work team.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListWorkteamsResult withWorkteams(Workteam... workteams) {
        if (getWorkteams() == null) {
            this.workteams = new java.util.ArrayList<Workteam>(workteams.length);
        }
        for (Workteam value : workteams) {
            this.workteams.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>Workteam</code> objects, each describing a work team.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param workteams <p>
     *            An array of <code>Workteam</code> objects, each describing a
     *            work team.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListWorkteamsResult withWorkteams(java.util.Collection<Workteam> workteams) {
        setWorkteams(workteams);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To
     * retrieve the next set of work teams, use it in the subsequent request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         If the response is truncated, Amazon SageMaker returns this
     *         token. To retrieve the next set of work teams, use it in the
     *         subsequent request.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To
     * retrieve the next set of work teams, use it in the subsequent request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            If the response is truncated, Amazon SageMaker returns this
     *            token. To retrieve the next set of work teams, use it in the
     *            subsequent request.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To
     * retrieve the next set of work teams, use it in the subsequent request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            If the response is truncated, Amazon SageMaker returns this
     *            token. To retrieve the next set of work teams, use it in the
     *            subsequent request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListWorkteamsResult withNextToken(String nextToken) {
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
        if (getWorkteams() != null)
            sb.append("Workteams: " + getWorkteams() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkteams() == null) ? 0 : getWorkteams().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListWorkteamsResult == false)
            return false;
        ListWorkteamsResult other = (ListWorkteamsResult) obj;

        if (other.getWorkteams() == null ^ this.getWorkteams() == null)
            return false;
        if (other.getWorkteams() != null
                && other.getWorkteams().equals(this.getWorkteams()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
