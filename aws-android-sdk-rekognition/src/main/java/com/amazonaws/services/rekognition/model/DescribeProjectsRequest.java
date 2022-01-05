/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets information about your Amazon Rekognition Custom Labels projects.
 * </p>
 * <p>
 * This operation requires permissions to perform the
 * <code>rekognition:DescribeProjects</code> action.
 * </p>
 */
public class DescribeProjectsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * If the previous response was incomplete (because there is more results to
     * retrieve), Amazon Rekognition Custom Labels returns a pagination token in
     * the response. You can use this pagination token to retrieve the next set
     * of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results to return per paginated call. The largest
     * value you can specify is 100. If you specify a value greater than 100, a
     * ValidationException error occurs. The default value is 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * A list of the projects that you want Amazon Rekognition Custom Labels to
     * describe. If you don't specify a value, the response includes
     * descriptions for all the projects in your AWS account.
     * </p>
     */
    private java.util.List<String> projectNames;

    /**
     * <p>
     * If the previous response was incomplete (because there is more results to
     * retrieve), Amazon Rekognition Custom Labels returns a pagination token in
     * the response. You can use this pagination token to retrieve the next set
     * of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         If the previous response was incomplete (because there is more
     *         results to retrieve), Amazon Rekognition Custom Labels returns a
     *         pagination token in the response. You can use this pagination
     *         token to retrieve the next set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more results to
     * retrieve), Amazon Rekognition Custom Labels returns a pagination token in
     * the response. You can use this pagination token to retrieve the next set
     * of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param nextToken <p>
     *            If the previous response was incomplete (because there is more
     *            results to retrieve), Amazon Rekognition Custom Labels returns
     *            a pagination token in the response. You can use this
     *            pagination token to retrieve the next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more results to
     * retrieve), Amazon Rekognition Custom Labels returns a pagination token in
     * the response. You can use this pagination token to retrieve the next set
     * of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param nextToken <p>
     *            If the previous response was incomplete (because there is more
     *            results to retrieve), Amazon Rekognition Custom Labels returns
     *            a pagination token in the response. You can use this
     *            pagination token to retrieve the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeProjectsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return per paginated call. The largest
     * value you can specify is 100. If you specify a value greater than 100, a
     * ValidationException error occurs. The default value is 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of results to return per paginated call. The
     *         largest value you can specify is 100. If you specify a value
     *         greater than 100, a ValidationException error occurs. The default
     *         value is 100.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per paginated call. The largest
     * value you can specify is 100. If you specify a value greater than 100, a
     * ValidationException error occurs. The default value is 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return per paginated call.
     *            The largest value you can specify is 100. If you specify a
     *            value greater than 100, a ValidationException error occurs.
     *            The default value is 100.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per paginated call. The largest
     * value you can specify is 100. If you specify a value greater than 100, a
     * ValidationException error occurs. The default value is 100.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return per paginated call.
     *            The largest value you can specify is 100. If you specify a
     *            value greater than 100, a ValidationException error occurs.
     *            The default value is 100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeProjectsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * A list of the projects that you want Amazon Rekognition Custom Labels to
     * describe. If you don't specify a value, the response includes
     * descriptions for all the projects in your AWS account.
     * </p>
     *
     * @return <p>
     *         A list of the projects that you want Amazon Rekognition Custom
     *         Labels to describe. If you don't specify a value, the response
     *         includes descriptions for all the projects in your AWS account.
     *         </p>
     */
    public java.util.List<String> getProjectNames() {
        return projectNames;
    }

    /**
     * <p>
     * A list of the projects that you want Amazon Rekognition Custom Labels to
     * describe. If you don't specify a value, the response includes
     * descriptions for all the projects in your AWS account.
     * </p>
     *
     * @param projectNames <p>
     *            A list of the projects that you want Amazon Rekognition Custom
     *            Labels to describe. If you don't specify a value, the response
     *            includes descriptions for all the projects in your AWS
     *            account.
     *            </p>
     */
    public void setProjectNames(java.util.Collection<String> projectNames) {
        if (projectNames == null) {
            this.projectNames = null;
            return;
        }

        this.projectNames = new java.util.ArrayList<String>(projectNames);
    }

    /**
     * <p>
     * A list of the projects that you want Amazon Rekognition Custom Labels to
     * describe. If you don't specify a value, the response includes
     * descriptions for all the projects in your AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param projectNames <p>
     *            A list of the projects that you want Amazon Rekognition Custom
     *            Labels to describe. If you don't specify a value, the response
     *            includes descriptions for all the projects in your AWS
     *            account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeProjectsRequest withProjectNames(String... projectNames) {
        if (getProjectNames() == null) {
            this.projectNames = new java.util.ArrayList<String>(projectNames.length);
        }
        for (String value : projectNames) {
            this.projectNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the projects that you want Amazon Rekognition Custom Labels to
     * describe. If you don't specify a value, the response includes
     * descriptions for all the projects in your AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param projectNames <p>
     *            A list of the projects that you want Amazon Rekognition Custom
     *            Labels to describe. If you don't specify a value, the response
     *            includes descriptions for all the projects in your AWS
     *            account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeProjectsRequest withProjectNames(java.util.Collection<String> projectNames) {
        setProjectNames(projectNames);
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
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getProjectNames() != null)
            sb.append("ProjectNames: " + getProjectNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode
                + ((getProjectNames() == null) ? 0 : getProjectNames().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeProjectsRequest == false)
            return false;
        DescribeProjectsRequest other = (DescribeProjectsRequest) obj;

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
        if (other.getProjectNames() == null ^ this.getProjectNames() == null)
            return false;
        if (other.getProjectNames() != null
                && other.getProjectNames().equals(this.getProjectNames()) == false)
            return false;
        return true;
    }
}
