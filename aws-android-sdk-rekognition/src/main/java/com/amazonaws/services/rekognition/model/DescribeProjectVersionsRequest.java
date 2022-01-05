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
 * Lists and describes the versions of a model in an Amazon Rekognition Custom
 * Labels project. You can specify up to 10 model versions in
 * <code>ProjectVersionArns</code>. If you don't specify a value, descriptions
 * for all model versions in the project are returned.
 * </p>
 * <p>
 * This operation requires permissions to perform the
 * <code>rekognition:DescribeProjectVersions</code> action.
 * </p>
 */
public class DescribeProjectVersionsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project that contains the models
     * you want to describe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     */
    private String projectArn;

    /**
     * <p>
     * A list of model version names that you want to describe. You can add up
     * to 10 model version names to the list. If you don't specify a value, all
     * model descriptions are returned. A version name is part of a model
     * (ProjectVersion) ARN. For example,
     * <code>my-model.2020-01-21T09.10.15</code> is the version name in the
     * following ARN.
     * <code>arn:aws:rekognition:us-east-1:123456789012:project/getting-started/version/<i>my-model.2020-01-21T09.10.15</i>/1234567890123</code>
     * .
     * </p>
     */
    private java.util.List<String> versionNames;

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
     * The Amazon Resource Name (ARN) of the project that contains the models
     * you want to describe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the project that contains the
     *         models you want to describe.
     *         </p>
     */
    public String getProjectArn() {
        return projectArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project that contains the models
     * you want to describe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     *
     * @param projectArn <p>
     *            The Amazon Resource Name (ARN) of the project that contains
     *            the models you want to describe.
     *            </p>
     */
    public void setProjectArn(String projectArn) {
        this.projectArn = projectArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project that contains the models
     * you want to describe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     *
     * @param projectArn <p>
     *            The Amazon Resource Name (ARN) of the project that contains
     *            the models you want to describe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeProjectVersionsRequest withProjectArn(String projectArn) {
        this.projectArn = projectArn;
        return this;
    }

    /**
     * <p>
     * A list of model version names that you want to describe. You can add up
     * to 10 model version names to the list. If you don't specify a value, all
     * model descriptions are returned. A version name is part of a model
     * (ProjectVersion) ARN. For example,
     * <code>my-model.2020-01-21T09.10.15</code> is the version name in the
     * following ARN.
     * <code>arn:aws:rekognition:us-east-1:123456789012:project/getting-started/version/<i>my-model.2020-01-21T09.10.15</i>/1234567890123</code>
     * .
     * </p>
     *
     * @return <p>
     *         A list of model version names that you want to describe. You can
     *         add up to 10 model version names to the list. If you don't
     *         specify a value, all model descriptions are returned. A version
     *         name is part of a model (ProjectVersion) ARN. For example,
     *         <code>my-model.2020-01-21T09.10.15</code> is the version name in
     *         the following ARN.
     *         <code>arn:aws:rekognition:us-east-1:123456789012:project/getting-started/version/<i>my-model.2020-01-21T09.10.15</i>/1234567890123</code>
     *         .
     *         </p>
     */
    public java.util.List<String> getVersionNames() {
        return versionNames;
    }

    /**
     * <p>
     * A list of model version names that you want to describe. You can add up
     * to 10 model version names to the list. If you don't specify a value, all
     * model descriptions are returned. A version name is part of a model
     * (ProjectVersion) ARN. For example,
     * <code>my-model.2020-01-21T09.10.15</code> is the version name in the
     * following ARN.
     * <code>arn:aws:rekognition:us-east-1:123456789012:project/getting-started/version/<i>my-model.2020-01-21T09.10.15</i>/1234567890123</code>
     * .
     * </p>
     *
     * @param versionNames <p>
     *            A list of model version names that you want to describe. You
     *            can add up to 10 model version names to the list. If you don't
     *            specify a value, all model descriptions are returned. A
     *            version name is part of a model (ProjectVersion) ARN. For
     *            example, <code>my-model.2020-01-21T09.10.15</code> is the
     *            version name in the following ARN.
     *            <code>arn:aws:rekognition:us-east-1:123456789012:project/getting-started/version/<i>my-model.2020-01-21T09.10.15</i>/1234567890123</code>
     *            .
     *            </p>
     */
    public void setVersionNames(java.util.Collection<String> versionNames) {
        if (versionNames == null) {
            this.versionNames = null;
            return;
        }

        this.versionNames = new java.util.ArrayList<String>(versionNames);
    }

    /**
     * <p>
     * A list of model version names that you want to describe. You can add up
     * to 10 model version names to the list. If you don't specify a value, all
     * model descriptions are returned. A version name is part of a model
     * (ProjectVersion) ARN. For example,
     * <code>my-model.2020-01-21T09.10.15</code> is the version name in the
     * following ARN.
     * <code>arn:aws:rekognition:us-east-1:123456789012:project/getting-started/version/<i>my-model.2020-01-21T09.10.15</i>/1234567890123</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versionNames <p>
     *            A list of model version names that you want to describe. You
     *            can add up to 10 model version names to the list. If you don't
     *            specify a value, all model descriptions are returned. A
     *            version name is part of a model (ProjectVersion) ARN. For
     *            example, <code>my-model.2020-01-21T09.10.15</code> is the
     *            version name in the following ARN.
     *            <code>arn:aws:rekognition:us-east-1:123456789012:project/getting-started/version/<i>my-model.2020-01-21T09.10.15</i>/1234567890123</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeProjectVersionsRequest withVersionNames(String... versionNames) {
        if (getVersionNames() == null) {
            this.versionNames = new java.util.ArrayList<String>(versionNames.length);
        }
        for (String value : versionNames) {
            this.versionNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of model version names that you want to describe. You can add up
     * to 10 model version names to the list. If you don't specify a value, all
     * model descriptions are returned. A version name is part of a model
     * (ProjectVersion) ARN. For example,
     * <code>my-model.2020-01-21T09.10.15</code> is the version name in the
     * following ARN.
     * <code>arn:aws:rekognition:us-east-1:123456789012:project/getting-started/version/<i>my-model.2020-01-21T09.10.15</i>/1234567890123</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versionNames <p>
     *            A list of model version names that you want to describe. You
     *            can add up to 10 model version names to the list. If you don't
     *            specify a value, all model descriptions are returned. A
     *            version name is part of a model (ProjectVersion) ARN. For
     *            example, <code>my-model.2020-01-21T09.10.15</code> is the
     *            version name in the following ARN.
     *            <code>arn:aws:rekognition:us-east-1:123456789012:project/getting-started/version/<i>my-model.2020-01-21T09.10.15</i>/1234567890123</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeProjectVersionsRequest withVersionNames(java.util.Collection<String> versionNames) {
        setVersionNames(versionNames);
        return this;
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
    public DescribeProjectVersionsRequest withNextToken(String nextToken) {
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
    public DescribeProjectVersionsRequest withMaxResults(Integer maxResults) {
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
        if (getProjectArn() != null)
            sb.append("ProjectArn: " + getProjectArn() + ",");
        if (getVersionNames() != null)
            sb.append("VersionNames: " + getVersionNames() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectArn() == null) ? 0 : getProjectArn().hashCode());
        hashCode = prime * hashCode
                + ((getVersionNames() == null) ? 0 : getVersionNames().hashCode());
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

        if (obj instanceof DescribeProjectVersionsRequest == false)
            return false;
        DescribeProjectVersionsRequest other = (DescribeProjectVersionsRequest) obj;

        if (other.getProjectArn() == null ^ this.getProjectArn() == null)
            return false;
        if (other.getProjectArn() != null
                && other.getProjectArn().equals(this.getProjectArn()) == false)
            return false;
        if (other.getVersionNames() == null ^ this.getVersionNames() == null)
            return false;
        if (other.getVersionNames() != null
                && other.getVersionNames().equals(this.getVersionNames()) == false)
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
