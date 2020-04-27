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

package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves information about the specified finding.
 * </p>
 */
public class GetFindingRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the analyzer that generated the finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[^:]*:[^:]*:[^:]*:[^:]*:[^:]*:analyzer/.{1,255}$<br/>
     */
    private String analyzerArn;

    /**
     * <p>
     * The ID of the finding to retrieve.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The ARN of the analyzer that generated the finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[^:]*:[^:]*:[^:]*:[^:]*:[^:]*:analyzer/.{1,255}$<br/>
     *
     * @return <p>
     *         The ARN of the analyzer that generated the finding.
     *         </p>
     */
    public String getAnalyzerArn() {
        return analyzerArn;
    }

    /**
     * <p>
     * The ARN of the analyzer that generated the finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[^:]*:[^:]*:[^:]*:[^:]*:[^:]*:analyzer/.{1,255}$<br/>
     *
     * @param analyzerArn <p>
     *            The ARN of the analyzer that generated the finding.
     *            </p>
     */
    public void setAnalyzerArn(String analyzerArn) {
        this.analyzerArn = analyzerArn;
    }

    /**
     * <p>
     * The ARN of the analyzer that generated the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[^:]*:[^:]*:[^:]*:[^:]*:[^:]*:analyzer/.{1,255}$<br/>
     *
     * @param analyzerArn <p>
     *            The ARN of the analyzer that generated the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFindingRequest withAnalyzerArn(String analyzerArn) {
        this.analyzerArn = analyzerArn;
        return this;
    }

    /**
     * <p>
     * The ID of the finding to retrieve.
     * </p>
     *
     * @return <p>
     *         The ID of the finding to retrieve.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID of the finding to retrieve.
     * </p>
     *
     * @param id <p>
     *            The ID of the finding to retrieve.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the finding to retrieve.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The ID of the finding to retrieve.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFindingRequest withId(String id) {
        this.id = id;
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
        if (getAnalyzerArn() != null)
            sb.append("analyzerArn: " + getAnalyzerArn() + ",");
        if (getId() != null)
            sb.append("id: " + getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAnalyzerArn() == null) ? 0 : getAnalyzerArn().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFindingRequest == false)
            return false;
        GetFindingRequest other = (GetFindingRequest) obj;

        if (other.getAnalyzerArn() == null ^ this.getAnalyzerArn() == null)
            return false;
        if (other.getAnalyzerArn() != null
                && other.getAnalyzerArn().equals(this.getAnalyzerArn()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }
}
