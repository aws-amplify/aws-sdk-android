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

package com.amazonaws.services.codecommit.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns information about the differences in a valid commit specifier (such
 * as a branch, tag, HEAD, commit ID, or other fully qualified reference).
 * Results can be limited to a specified path.
 * </p>
 */
public class GetDifferencesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the repository where you want to get differences.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     */
    private String repositoryName;

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to
     * identify a commit (for example, the full commit ID). Optional. If not
     * specified, all changes before the <code>afterCommitSpecifier</code> value
     * are shown. If you do not use <code>beforeCommitSpecifier</code> in your
     * request, consider limiting the results with <code>maxResults</code>.
     * </p>
     */
    private String beforeCommitSpecifier;

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to
     * identify a commit.
     * </p>
     */
    private String afterCommitSpecifier;

    /**
     * <p>
     * The file path in which to check for differences. Limits the results to
     * this path. Can also be used to specify the previous name of a directory
     * or folder. If <code>beforePath</code> and <code>afterPath</code> are not
     * specified, differences are shown for all paths.
     * </p>
     */
    private String beforePath;

    /**
     * <p>
     * The file path in which to check differences. Limits the results to this
     * path. Can also be used to specify the changed name of a directory or
     * folder, if it has changed. If not specified, differences are shown for
     * all paths.
     * </p>
     */
    private String afterPath;

    /**
     * <p>
     * A non-zero, non-negative integer used to limit the number of returned
     * results.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * An enumeration token that, when provided in a request, returns the next
     * batch of the results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the repository where you want to get differences.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @return <p>
     *         The name of the repository where you want to get differences.
     *         </p>
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * <p>
     * The name of the repository where you want to get differences.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @param repositoryName <p>
     *            The name of the repository where you want to get differences.
     *            </p>
     */
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository where you want to get differences.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @param repositoryName <p>
     *            The name of the repository where you want to get differences.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDifferencesRequest withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to
     * identify a commit (for example, the full commit ID). Optional. If not
     * specified, all changes before the <code>afterCommitSpecifier</code> value
     * are shown. If you do not use <code>beforeCommitSpecifier</code> in your
     * request, consider limiting the results with <code>maxResults</code>.
     * </p>
     *
     * @return <p>
     *         The branch, tag, HEAD, or other fully qualified reference used to
     *         identify a commit (for example, the full commit ID). Optional. If
     *         not specified, all changes before the
     *         <code>afterCommitSpecifier</code> value are shown. If you do not
     *         use <code>beforeCommitSpecifier</code> in your request, consider
     *         limiting the results with <code>maxResults</code>.
     *         </p>
     */
    public String getBeforeCommitSpecifier() {
        return beforeCommitSpecifier;
    }

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to
     * identify a commit (for example, the full commit ID). Optional. If not
     * specified, all changes before the <code>afterCommitSpecifier</code> value
     * are shown. If you do not use <code>beforeCommitSpecifier</code> in your
     * request, consider limiting the results with <code>maxResults</code>.
     * </p>
     *
     * @param beforeCommitSpecifier <p>
     *            The branch, tag, HEAD, or other fully qualified reference used
     *            to identify a commit (for example, the full commit ID).
     *            Optional. If not specified, all changes before the
     *            <code>afterCommitSpecifier</code> value are shown. If you do
     *            not use <code>beforeCommitSpecifier</code> in your request,
     *            consider limiting the results with <code>maxResults</code>.
     *            </p>
     */
    public void setBeforeCommitSpecifier(String beforeCommitSpecifier) {
        this.beforeCommitSpecifier = beforeCommitSpecifier;
    }

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to
     * identify a commit (for example, the full commit ID). Optional. If not
     * specified, all changes before the <code>afterCommitSpecifier</code> value
     * are shown. If you do not use <code>beforeCommitSpecifier</code> in your
     * request, consider limiting the results with <code>maxResults</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param beforeCommitSpecifier <p>
     *            The branch, tag, HEAD, or other fully qualified reference used
     *            to identify a commit (for example, the full commit ID).
     *            Optional. If not specified, all changes before the
     *            <code>afterCommitSpecifier</code> value are shown. If you do
     *            not use <code>beforeCommitSpecifier</code> in your request,
     *            consider limiting the results with <code>maxResults</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDifferencesRequest withBeforeCommitSpecifier(String beforeCommitSpecifier) {
        this.beforeCommitSpecifier = beforeCommitSpecifier;
        return this;
    }

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to
     * identify a commit.
     * </p>
     *
     * @return <p>
     *         The branch, tag, HEAD, or other fully qualified reference used to
     *         identify a commit.
     *         </p>
     */
    public String getAfterCommitSpecifier() {
        return afterCommitSpecifier;
    }

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to
     * identify a commit.
     * </p>
     *
     * @param afterCommitSpecifier <p>
     *            The branch, tag, HEAD, or other fully qualified reference used
     *            to identify a commit.
     *            </p>
     */
    public void setAfterCommitSpecifier(String afterCommitSpecifier) {
        this.afterCommitSpecifier = afterCommitSpecifier;
    }

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to
     * identify a commit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param afterCommitSpecifier <p>
     *            The branch, tag, HEAD, or other fully qualified reference used
     *            to identify a commit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDifferencesRequest withAfterCommitSpecifier(String afterCommitSpecifier) {
        this.afterCommitSpecifier = afterCommitSpecifier;
        return this;
    }

    /**
     * <p>
     * The file path in which to check for differences. Limits the results to
     * this path. Can also be used to specify the previous name of a directory
     * or folder. If <code>beforePath</code> and <code>afterPath</code> are not
     * specified, differences are shown for all paths.
     * </p>
     *
     * @return <p>
     *         The file path in which to check for differences. Limits the
     *         results to this path. Can also be used to specify the previous
     *         name of a directory or folder. If <code>beforePath</code> and
     *         <code>afterPath</code> are not specified, differences are shown
     *         for all paths.
     *         </p>
     */
    public String getBeforePath() {
        return beforePath;
    }

    /**
     * <p>
     * The file path in which to check for differences. Limits the results to
     * this path. Can also be used to specify the previous name of a directory
     * or folder. If <code>beforePath</code> and <code>afterPath</code> are not
     * specified, differences are shown for all paths.
     * </p>
     *
     * @param beforePath <p>
     *            The file path in which to check for differences. Limits the
     *            results to this path. Can also be used to specify the previous
     *            name of a directory or folder. If <code>beforePath</code> and
     *            <code>afterPath</code> are not specified, differences are
     *            shown for all paths.
     *            </p>
     */
    public void setBeforePath(String beforePath) {
        this.beforePath = beforePath;
    }

    /**
     * <p>
     * The file path in which to check for differences. Limits the results to
     * this path. Can also be used to specify the previous name of a directory
     * or folder. If <code>beforePath</code> and <code>afterPath</code> are not
     * specified, differences are shown for all paths.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param beforePath <p>
     *            The file path in which to check for differences. Limits the
     *            results to this path. Can also be used to specify the previous
     *            name of a directory or folder. If <code>beforePath</code> and
     *            <code>afterPath</code> are not specified, differences are
     *            shown for all paths.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDifferencesRequest withBeforePath(String beforePath) {
        this.beforePath = beforePath;
        return this;
    }

    /**
     * <p>
     * The file path in which to check differences. Limits the results to this
     * path. Can also be used to specify the changed name of a directory or
     * folder, if it has changed. If not specified, differences are shown for
     * all paths.
     * </p>
     *
     * @return <p>
     *         The file path in which to check differences. Limits the results
     *         to this path. Can also be used to specify the changed name of a
     *         directory or folder, if it has changed. If not specified,
     *         differences are shown for all paths.
     *         </p>
     */
    public String getAfterPath() {
        return afterPath;
    }

    /**
     * <p>
     * The file path in which to check differences. Limits the results to this
     * path. Can also be used to specify the changed name of a directory or
     * folder, if it has changed. If not specified, differences are shown for
     * all paths.
     * </p>
     *
     * @param afterPath <p>
     *            The file path in which to check differences. Limits the
     *            results to this path. Can also be used to specify the changed
     *            name of a directory or folder, if it has changed. If not
     *            specified, differences are shown for all paths.
     *            </p>
     */
    public void setAfterPath(String afterPath) {
        this.afterPath = afterPath;
    }

    /**
     * <p>
     * The file path in which to check differences. Limits the results to this
     * path. Can also be used to specify the changed name of a directory or
     * folder, if it has changed. If not specified, differences are shown for
     * all paths.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param afterPath <p>
     *            The file path in which to check differences. Limits the
     *            results to this path. Can also be used to specify the changed
     *            name of a directory or folder, if it has changed. If not
     *            specified, differences are shown for all paths.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDifferencesRequest withAfterPath(String afterPath) {
        this.afterPath = afterPath;
        return this;
    }

    /**
     * <p>
     * A non-zero, non-negative integer used to limit the number of returned
     * results.
     * </p>
     *
     * @return <p>
     *         A non-zero, non-negative integer used to limit the number of
     *         returned results.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * A non-zero, non-negative integer used to limit the number of returned
     * results.
     * </p>
     *
     * @param maxResults <p>
     *            A non-zero, non-negative integer used to limit the number of
     *            returned results.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * A non-zero, non-negative integer used to limit the number of returned
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxResults <p>
     *            A non-zero, non-negative integer used to limit the number of
     *            returned results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDifferencesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * An enumeration token that, when provided in a request, returns the next
     * batch of the results.
     * </p>
     *
     * @return <p>
     *         An enumeration token that, when provided in a request, returns
     *         the next batch of the results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * An enumeration token that, when provided in a request, returns the next
     * batch of the results.
     * </p>
     *
     * @param nextToken <p>
     *            An enumeration token that, when provided in a request, returns
     *            the next batch of the results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An enumeration token that, when provided in a request, returns the next
     * batch of the results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            An enumeration token that, when provided in a request, returns
     *            the next batch of the results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDifferencesRequest withNextToken(String nextToken) {
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
        if (getRepositoryName() != null)
            sb.append("repositoryName: " + getRepositoryName() + ",");
        if (getBeforeCommitSpecifier() != null)
            sb.append("beforeCommitSpecifier: " + getBeforeCommitSpecifier() + ",");
        if (getAfterCommitSpecifier() != null)
            sb.append("afterCommitSpecifier: " + getAfterCommitSpecifier() + ",");
        if (getBeforePath() != null)
            sb.append("beforePath: " + getBeforePath() + ",");
        if (getAfterPath() != null)
            sb.append("afterPath: " + getAfterPath() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime
                * hashCode
                + ((getBeforeCommitSpecifier() == null) ? 0 : getBeforeCommitSpecifier().hashCode());
        hashCode = prime * hashCode
                + ((getAfterCommitSpecifier() == null) ? 0 : getAfterCommitSpecifier().hashCode());
        hashCode = prime * hashCode + ((getBeforePath() == null) ? 0 : getBeforePath().hashCode());
        hashCode = prime * hashCode + ((getAfterPath() == null) ? 0 : getAfterPath().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDifferencesRequest == false)
            return false;
        GetDifferencesRequest other = (GetDifferencesRequest) obj;

        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null
                && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getBeforeCommitSpecifier() == null ^ this.getBeforeCommitSpecifier() == null)
            return false;
        if (other.getBeforeCommitSpecifier() != null
                && other.getBeforeCommitSpecifier().equals(this.getBeforeCommitSpecifier()) == false)
            return false;
        if (other.getAfterCommitSpecifier() == null ^ this.getAfterCommitSpecifier() == null)
            return false;
        if (other.getAfterCommitSpecifier() != null
                && other.getAfterCommitSpecifier().equals(this.getAfterCommitSpecifier()) == false)
            return false;
        if (other.getBeforePath() == null ^ this.getBeforePath() == null)
            return false;
        if (other.getBeforePath() != null
                && other.getBeforePath().equals(this.getBeforePath()) == false)
            return false;
        if (other.getAfterPath() == null ^ this.getAfterPath() == null)
            return false;
        if (other.getAfterPath() != null
                && other.getAfterPath().equals(this.getAfterPath()) == false)
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
        return true;
    }
}
