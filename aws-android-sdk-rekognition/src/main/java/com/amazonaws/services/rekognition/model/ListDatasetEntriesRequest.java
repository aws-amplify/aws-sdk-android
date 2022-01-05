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
 * Lists the entries (images) within a dataset. An entry is a JSON Line that
 * contains the information for a single image, including the image location,
 * assigned labels, and object location bounding boxes. For more information,
 * see <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/customlabels-dg/md-manifest-files.html"
 * >Creating a manifest file</a>.
 * </p>
 * <p>
 * JSON Lines in the response include information about non-terminal errors
 * found in the dataset. Non terminal errors are reported in <code>errors</code>
 * lists within each JSON Line. The same information is reported in the training
 * and testing validation result manifests that Amazon Rekognition Custom Labels
 * creates during model training.
 * </p>
 * <p>
 * You can filter the response in variety of ways, such as choosing which labels
 * to return and returning JSON Lines created after a specific date.
 * </p>
 * <p>
 * This operation requires permissions to perform the
 * <code>rekognition:ListDatasetEntries</code> action.
 * </p>
 */
public class ListDatasetEntriesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the dataset that you want to use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/dataset\/(train|test)\/[0-9]+$)<br/>
     */
    private String datasetArn;

    /**
     * <p>
     * Specifies a label filter for the response. The response includes an entry
     * only if one or more of the labels in <code>ContainsLabels</code> exist in
     * the entry.
     * </p>
     */
    private java.util.List<String> containsLabels;

    /**
     * <p>
     * Specify <code>true</code> to get only the JSON Lines where the image is
     * labeled. Specify <code>false</code> to get only the JSON Lines where the
     * image isn't labeled. If you don't specify <code>Labeled</code>,
     * <code>ListDatasetEntries</code> returns JSON Lines for labeled and
     * unlabeled images.
     * </p>
     */
    private Boolean labeled;

    /**
     * <p>
     * If specified, <code>ListDatasetEntries</code> only returns JSON Lines
     * where the value of <code>SourceRefContains</code> is part of the
     * <code>source-ref</code> field. The <code>source-ref</code> field contains
     * the Amazon S3 location of the image. You can use
     * <code>SouceRefContains</code> for tasks such as getting the JSON Line for
     * a single image, or gettting JSON Lines for all images within a specific
     * folder.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String sourceRefContains;

    /**
     * <p>
     * Specifies an error filter for the response. Specify <code>True</code> to
     * only include entries that have errors.
     * </p>
     */
    private Boolean hasErrors;

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
     * The Amazon Resource Name (ARN) for the dataset that you want to use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/dataset\/(train|test)\/[0-9]+$)<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the dataset that you want to
     *         use.
     *         </p>
     */
    public String getDatasetArn() {
        return datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the dataset that you want to use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/dataset\/(train|test)\/[0-9]+$)<br/>
     *
     * @param datasetArn <p>
     *            The Amazon Resource Name (ARN) for the dataset that you want
     *            to use.
     *            </p>
     */
    public void setDatasetArn(String datasetArn) {
        this.datasetArn = datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the dataset that you want to use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/dataset\/(train|test)\/[0-9]+$)<br/>
     *
     * @param datasetArn <p>
     *            The Amazon Resource Name (ARN) for the dataset that you want
     *            to use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDatasetEntriesRequest withDatasetArn(String datasetArn) {
        this.datasetArn = datasetArn;
        return this;
    }

    /**
     * <p>
     * Specifies a label filter for the response. The response includes an entry
     * only if one or more of the labels in <code>ContainsLabels</code> exist in
     * the entry.
     * </p>
     *
     * @return <p>
     *         Specifies a label filter for the response. The response includes
     *         an entry only if one or more of the labels in
     *         <code>ContainsLabels</code> exist in the entry.
     *         </p>
     */
    public java.util.List<String> getContainsLabels() {
        return containsLabels;
    }

    /**
     * <p>
     * Specifies a label filter for the response. The response includes an entry
     * only if one or more of the labels in <code>ContainsLabels</code> exist in
     * the entry.
     * </p>
     *
     * @param containsLabels <p>
     *            Specifies a label filter for the response. The response
     *            includes an entry only if one or more of the labels in
     *            <code>ContainsLabels</code> exist in the entry.
     *            </p>
     */
    public void setContainsLabels(java.util.Collection<String> containsLabels) {
        if (containsLabels == null) {
            this.containsLabels = null;
            return;
        }

        this.containsLabels = new java.util.ArrayList<String>(containsLabels);
    }

    /**
     * <p>
     * Specifies a label filter for the response. The response includes an entry
     * only if one or more of the labels in <code>ContainsLabels</code> exist in
     * the entry.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containsLabels <p>
     *            Specifies a label filter for the response. The response
     *            includes an entry only if one or more of the labels in
     *            <code>ContainsLabels</code> exist in the entry.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDatasetEntriesRequest withContainsLabels(String... containsLabels) {
        if (getContainsLabels() == null) {
            this.containsLabels = new java.util.ArrayList<String>(containsLabels.length);
        }
        for (String value : containsLabels) {
            this.containsLabels.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specifies a label filter for the response. The response includes an entry
     * only if one or more of the labels in <code>ContainsLabels</code> exist in
     * the entry.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containsLabels <p>
     *            Specifies a label filter for the response. The response
     *            includes an entry only if one or more of the labels in
     *            <code>ContainsLabels</code> exist in the entry.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDatasetEntriesRequest withContainsLabels(java.util.Collection<String> containsLabels) {
        setContainsLabels(containsLabels);
        return this;
    }

    /**
     * <p>
     * Specify <code>true</code> to get only the JSON Lines where the image is
     * labeled. Specify <code>false</code> to get only the JSON Lines where the
     * image isn't labeled. If you don't specify <code>Labeled</code>,
     * <code>ListDatasetEntries</code> returns JSON Lines for labeled and
     * unlabeled images.
     * </p>
     *
     * @return <p>
     *         Specify <code>true</code> to get only the JSON Lines where the
     *         image is labeled. Specify <code>false</code> to get only the JSON
     *         Lines where the image isn't labeled. If you don't specify
     *         <code>Labeled</code>, <code>ListDatasetEntries</code> returns
     *         JSON Lines for labeled and unlabeled images.
     *         </p>
     */
    public Boolean isLabeled() {
        return labeled;
    }

    /**
     * <p>
     * Specify <code>true</code> to get only the JSON Lines where the image is
     * labeled. Specify <code>false</code> to get only the JSON Lines where the
     * image isn't labeled. If you don't specify <code>Labeled</code>,
     * <code>ListDatasetEntries</code> returns JSON Lines for labeled and
     * unlabeled images.
     * </p>
     *
     * @return <p>
     *         Specify <code>true</code> to get only the JSON Lines where the
     *         image is labeled. Specify <code>false</code> to get only the JSON
     *         Lines where the image isn't labeled. If you don't specify
     *         <code>Labeled</code>, <code>ListDatasetEntries</code> returns
     *         JSON Lines for labeled and unlabeled images.
     *         </p>
     */
    public Boolean getLabeled() {
        return labeled;
    }

    /**
     * <p>
     * Specify <code>true</code> to get only the JSON Lines where the image is
     * labeled. Specify <code>false</code> to get only the JSON Lines where the
     * image isn't labeled. If you don't specify <code>Labeled</code>,
     * <code>ListDatasetEntries</code> returns JSON Lines for labeled and
     * unlabeled images.
     * </p>
     *
     * @param labeled <p>
     *            Specify <code>true</code> to get only the JSON Lines where the
     *            image is labeled. Specify <code>false</code> to get only the
     *            JSON Lines where the image isn't labeled. If you don't specify
     *            <code>Labeled</code>, <code>ListDatasetEntries</code> returns
     *            JSON Lines for labeled and unlabeled images.
     *            </p>
     */
    public void setLabeled(Boolean labeled) {
        this.labeled = labeled;
    }

    /**
     * <p>
     * Specify <code>true</code> to get only the JSON Lines where the image is
     * labeled. Specify <code>false</code> to get only the JSON Lines where the
     * image isn't labeled. If you don't specify <code>Labeled</code>,
     * <code>ListDatasetEntries</code> returns JSON Lines for labeled and
     * unlabeled images.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labeled <p>
     *            Specify <code>true</code> to get only the JSON Lines where the
     *            image is labeled. Specify <code>false</code> to get only the
     *            JSON Lines where the image isn't labeled. If you don't specify
     *            <code>Labeled</code>, <code>ListDatasetEntries</code> returns
     *            JSON Lines for labeled and unlabeled images.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDatasetEntriesRequest withLabeled(Boolean labeled) {
        this.labeled = labeled;
        return this;
    }

    /**
     * <p>
     * If specified, <code>ListDatasetEntries</code> only returns JSON Lines
     * where the value of <code>SourceRefContains</code> is part of the
     * <code>source-ref</code> field. The <code>source-ref</code> field contains
     * the Amazon S3 location of the image. You can use
     * <code>SouceRefContains</code> for tasks such as getting the JSON Line for
     * a single image, or gettting JSON Lines for all images within a specific
     * folder.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         If specified, <code>ListDatasetEntries</code> only returns JSON
     *         Lines where the value of <code>SourceRefContains</code> is part
     *         of the <code>source-ref</code> field. The <code>source-ref</code>
     *         field contains the Amazon S3 location of the image. You can use
     *         <code>SouceRefContains</code> for tasks such as getting the JSON
     *         Line for a single image, or gettting JSON Lines for all images
     *         within a specific folder.
     *         </p>
     */
    public String getSourceRefContains() {
        return sourceRefContains;
    }

    /**
     * <p>
     * If specified, <code>ListDatasetEntries</code> only returns JSON Lines
     * where the value of <code>SourceRefContains</code> is part of the
     * <code>source-ref</code> field. The <code>source-ref</code> field contains
     * the Amazon S3 location of the image. You can use
     * <code>SouceRefContains</code> for tasks such as getting the JSON Line for
     * a single image, or gettting JSON Lines for all images within a specific
     * folder.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param sourceRefContains <p>
     *            If specified, <code>ListDatasetEntries</code> only returns
     *            JSON Lines where the value of <code>SourceRefContains</code>
     *            is part of the <code>source-ref</code> field. The
     *            <code>source-ref</code> field contains the Amazon S3 location
     *            of the image. You can use <code>SouceRefContains</code> for
     *            tasks such as getting the JSON Line for a single image, or
     *            gettting JSON Lines for all images within a specific folder.
     *            </p>
     */
    public void setSourceRefContains(String sourceRefContains) {
        this.sourceRefContains = sourceRefContains;
    }

    /**
     * <p>
     * If specified, <code>ListDatasetEntries</code> only returns JSON Lines
     * where the value of <code>SourceRefContains</code> is part of the
     * <code>source-ref</code> field. The <code>source-ref</code> field contains
     * the Amazon S3 location of the image. You can use
     * <code>SouceRefContains</code> for tasks such as getting the JSON Line for
     * a single image, or gettting JSON Lines for all images within a specific
     * folder.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param sourceRefContains <p>
     *            If specified, <code>ListDatasetEntries</code> only returns
     *            JSON Lines where the value of <code>SourceRefContains</code>
     *            is part of the <code>source-ref</code> field. The
     *            <code>source-ref</code> field contains the Amazon S3 location
     *            of the image. You can use <code>SouceRefContains</code> for
     *            tasks such as getting the JSON Line for a single image, or
     *            gettting JSON Lines for all images within a specific folder.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDatasetEntriesRequest withSourceRefContains(String sourceRefContains) {
        this.sourceRefContains = sourceRefContains;
        return this;
    }

    /**
     * <p>
     * Specifies an error filter for the response. Specify <code>True</code> to
     * only include entries that have errors.
     * </p>
     *
     * @return <p>
     *         Specifies an error filter for the response. Specify
     *         <code>True</code> to only include entries that have errors.
     *         </p>
     */
    public Boolean isHasErrors() {
        return hasErrors;
    }

    /**
     * <p>
     * Specifies an error filter for the response. Specify <code>True</code> to
     * only include entries that have errors.
     * </p>
     *
     * @return <p>
     *         Specifies an error filter for the response. Specify
     *         <code>True</code> to only include entries that have errors.
     *         </p>
     */
    public Boolean getHasErrors() {
        return hasErrors;
    }

    /**
     * <p>
     * Specifies an error filter for the response. Specify <code>True</code> to
     * only include entries that have errors.
     * </p>
     *
     * @param hasErrors <p>
     *            Specifies an error filter for the response. Specify
     *            <code>True</code> to only include entries that have errors.
     *            </p>
     */
    public void setHasErrors(Boolean hasErrors) {
        this.hasErrors = hasErrors;
    }

    /**
     * <p>
     * Specifies an error filter for the response. Specify <code>True</code> to
     * only include entries that have errors.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hasErrors <p>
     *            Specifies an error filter for the response. Specify
     *            <code>True</code> to only include entries that have errors.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDatasetEntriesRequest withHasErrors(Boolean hasErrors) {
        this.hasErrors = hasErrors;
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
    public ListDatasetEntriesRequest withNextToken(String nextToken) {
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
    public ListDatasetEntriesRequest withMaxResults(Integer maxResults) {
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
        if (getDatasetArn() != null)
            sb.append("DatasetArn: " + getDatasetArn() + ",");
        if (getContainsLabels() != null)
            sb.append("ContainsLabels: " + getContainsLabels() + ",");
        if (getLabeled() != null)
            sb.append("Labeled: " + getLabeled() + ",");
        if (getSourceRefContains() != null)
            sb.append("SourceRefContains: " + getSourceRefContains() + ",");
        if (getHasErrors() != null)
            sb.append("HasErrors: " + getHasErrors() + ",");
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

        hashCode = prime * hashCode + ((getDatasetArn() == null) ? 0 : getDatasetArn().hashCode());
        hashCode = prime * hashCode
                + ((getContainsLabels() == null) ? 0 : getContainsLabels().hashCode());
        hashCode = prime * hashCode + ((getLabeled() == null) ? 0 : getLabeled().hashCode());
        hashCode = prime * hashCode
                + ((getSourceRefContains() == null) ? 0 : getSourceRefContains().hashCode());
        hashCode = prime * hashCode + ((getHasErrors() == null) ? 0 : getHasErrors().hashCode());
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

        if (obj instanceof ListDatasetEntriesRequest == false)
            return false;
        ListDatasetEntriesRequest other = (ListDatasetEntriesRequest) obj;

        if (other.getDatasetArn() == null ^ this.getDatasetArn() == null)
            return false;
        if (other.getDatasetArn() != null
                && other.getDatasetArn().equals(this.getDatasetArn()) == false)
            return false;
        if (other.getContainsLabels() == null ^ this.getContainsLabels() == null)
            return false;
        if (other.getContainsLabels() != null
                && other.getContainsLabels().equals(this.getContainsLabels()) == false)
            return false;
        if (other.getLabeled() == null ^ this.getLabeled() == null)
            return false;
        if (other.getLabeled() != null && other.getLabeled().equals(this.getLabeled()) == false)
            return false;
        if (other.getSourceRefContains() == null ^ this.getSourceRefContains() == null)
            return false;
        if (other.getSourceRefContains() != null
                && other.getSourceRefContains().equals(this.getSourceRefContains()) == false)
            return false;
        if (other.getHasErrors() == null ^ this.getHasErrors() == null)
            return false;
        if (other.getHasErrors() != null
                && other.getHasErrors().equals(this.getHasErrors()) == false)
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
