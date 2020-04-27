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

public class ListCodeRepositoriesResult implements Serializable {
    /**
     * <p>
     * Gets a list of summaries of the Git repositories. Each summary specifies
     * the following values for the repository:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Name
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN)
     * </p>
     * </li>
     * <li>
     * <p>
     * Creation time
     * </p>
     * </li>
     * <li>
     * <p>
     * Last modified time
     * </p>
     * </li>
     * <li>
     * <p>
     * Configuration information, including the URL location of the repository
     * and the ARN of the AWS Secrets Manager secret that contains the
     * credentials used to access the repository.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<CodeRepositorySummary> codeRepositorySummaryList;

    /**
     * <p>
     * If the result of a <code>ListCodeRepositoriesOutput</code> request was
     * truncated, the response includes a <code>NextToken</code>. To get the
     * next set of Git repositories, use the token in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Gets a list of summaries of the Git repositories. Each summary specifies
     * the following values for the repository:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Name
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN)
     * </p>
     * </li>
     * <li>
     * <p>
     * Creation time
     * </p>
     * </li>
     * <li>
     * <p>
     * Last modified time
     * </p>
     * </li>
     * <li>
     * <p>
     * Configuration information, including the URL location of the repository
     * and the ARN of the AWS Secrets Manager secret that contains the
     * credentials used to access the repository.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Gets a list of summaries of the Git repositories. Each summary
     *         specifies the following values for the repository:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Name
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Resource Name (ARN)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Creation time
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Last modified time
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Configuration information, including the URL location of the
     *         repository and the ARN of the AWS Secrets Manager secret that
     *         contains the credentials used to access the repository.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<CodeRepositorySummary> getCodeRepositorySummaryList() {
        return codeRepositorySummaryList;
    }

    /**
     * <p>
     * Gets a list of summaries of the Git repositories. Each summary specifies
     * the following values for the repository:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Name
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN)
     * </p>
     * </li>
     * <li>
     * <p>
     * Creation time
     * </p>
     * </li>
     * <li>
     * <p>
     * Last modified time
     * </p>
     * </li>
     * <li>
     * <p>
     * Configuration information, including the URL location of the repository
     * and the ARN of the AWS Secrets Manager secret that contains the
     * credentials used to access the repository.
     * </p>
     * </li>
     * </ul>
     *
     * @param codeRepositorySummaryList <p>
     *            Gets a list of summaries of the Git repositories. Each summary
     *            specifies the following values for the repository:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Name
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Amazon Resource Name (ARN)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Creation time
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Last modified time
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Configuration information, including the URL location of the
     *            repository and the ARN of the AWS Secrets Manager secret that
     *            contains the credentials used to access the repository.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setCodeRepositorySummaryList(
            java.util.Collection<CodeRepositorySummary> codeRepositorySummaryList) {
        if (codeRepositorySummaryList == null) {
            this.codeRepositorySummaryList = null;
            return;
        }

        this.codeRepositorySummaryList = new java.util.ArrayList<CodeRepositorySummary>(
                codeRepositorySummaryList);
    }

    /**
     * <p>
     * Gets a list of summaries of the Git repositories. Each summary specifies
     * the following values for the repository:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Name
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN)
     * </p>
     * </li>
     * <li>
     * <p>
     * Creation time
     * </p>
     * </li>
     * <li>
     * <p>
     * Last modified time
     * </p>
     * </li>
     * <li>
     * <p>
     * Configuration information, including the URL location of the repository
     * and the ARN of the AWS Secrets Manager secret that contains the
     * credentials used to access the repository.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param codeRepositorySummaryList <p>
     *            Gets a list of summaries of the Git repositories. Each summary
     *            specifies the following values for the repository:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Name
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Amazon Resource Name (ARN)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Creation time
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Last modified time
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Configuration information, including the URL location of the
     *            repository and the ARN of the AWS Secrets Manager secret that
     *            contains the credentials used to access the repository.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCodeRepositoriesResult withCodeRepositorySummaryList(
            CodeRepositorySummary... codeRepositorySummaryList) {
        if (getCodeRepositorySummaryList() == null) {
            this.codeRepositorySummaryList = new java.util.ArrayList<CodeRepositorySummary>(
                    codeRepositorySummaryList.length);
        }
        for (CodeRepositorySummary value : codeRepositorySummaryList) {
            this.codeRepositorySummaryList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Gets a list of summaries of the Git repositories. Each summary specifies
     * the following values for the repository:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Name
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN)
     * </p>
     * </li>
     * <li>
     * <p>
     * Creation time
     * </p>
     * </li>
     * <li>
     * <p>
     * Last modified time
     * </p>
     * </li>
     * <li>
     * <p>
     * Configuration information, including the URL location of the repository
     * and the ARN of the AWS Secrets Manager secret that contains the
     * credentials used to access the repository.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param codeRepositorySummaryList <p>
     *            Gets a list of summaries of the Git repositories. Each summary
     *            specifies the following values for the repository:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Name
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Amazon Resource Name (ARN)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Creation time
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Last modified time
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Configuration information, including the URL location of the
     *            repository and the ARN of the AWS Secrets Manager secret that
     *            contains the credentials used to access the repository.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCodeRepositoriesResult withCodeRepositorySummaryList(
            java.util.Collection<CodeRepositorySummary> codeRepositorySummaryList) {
        setCodeRepositorySummaryList(codeRepositorySummaryList);
        return this;
    }

    /**
     * <p>
     * If the result of a <code>ListCodeRepositoriesOutput</code> request was
     * truncated, the response includes a <code>NextToken</code>. To get the
     * next set of Git repositories, use the token in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         If the result of a <code>ListCodeRepositoriesOutput</code>
     *         request was truncated, the response includes a
     *         <code>NextToken</code>. To get the next set of Git repositories,
     *         use the token in the next request.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the result of a <code>ListCodeRepositoriesOutput</code> request was
     * truncated, the response includes a <code>NextToken</code>. To get the
     * next set of Git repositories, use the token in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            If the result of a <code>ListCodeRepositoriesOutput</code>
     *            request was truncated, the response includes a
     *            <code>NextToken</code>. To get the next set of Git
     *            repositories, use the token in the next request.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the result of a <code>ListCodeRepositoriesOutput</code> request was
     * truncated, the response includes a <code>NextToken</code>. To get the
     * next set of Git repositories, use the token in the next request.
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
     *            If the result of a <code>ListCodeRepositoriesOutput</code>
     *            request was truncated, the response includes a
     *            <code>NextToken</code>. To get the next set of Git
     *            repositories, use the token in the next request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCodeRepositoriesResult withNextToken(String nextToken) {
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
        if (getCodeRepositorySummaryList() != null)
            sb.append("CodeRepositorySummaryList: " + getCodeRepositorySummaryList() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCodeRepositorySummaryList() == null) ? 0 : getCodeRepositorySummaryList()
                        .hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCodeRepositoriesResult == false)
            return false;
        ListCodeRepositoriesResult other = (ListCodeRepositoriesResult) obj;

        if (other.getCodeRepositorySummaryList() == null
                ^ this.getCodeRepositorySummaryList() == null)
            return false;
        if (other.getCodeRepositorySummaryList() != null
                && other.getCodeRepositorySummaryList().equals(this.getCodeRepositorySummaryList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
