/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates details about a specific evaluation form version in the specified
 * Amazon Connect instance. Question and section identifiers cannot be
 * duplicated within the same evaluation form.
 * </p>
 * <p>
 * This operation does not support partial updates. Instead it does a full
 * update of evaluation form content.
 * </p>
 */
public class UpdateEvaluationFormRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

    /**
     * <p>
     * The unique identifier for the evaluation form.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     */
    private String evaluationFormId;

    /**
     * <p>
     * A version of the evaluation form to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer evaluationFormVersion;

    /**
     * <p>
     * A flag indicating whether the operation must create a new version.
     * </p>
     */
    private Boolean createNewVersion;

    /**
     * <p>
     * A title of the evaluation form.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String title;

    /**
     * <p>
     * The description of the evaluation form.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * Items that are part of the evaluation form. The total number of sections
     * and questions must not exceed 100 each. Questions must be contained in a
     * section.
     * </p>
     */
    private java.util.List<EvaluationFormItem> items;

    /**
     * <p>
     * A scoring strategy of the evaluation form.
     * </p>
     */
    private EvaluationFormScoringStrategy scoringStrategy;

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. If not provided, the Amazon Web Services SDK
     * populates this field. For more information about idempotency, see <a
     * href=
     * "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     * >Making retries safe with idempotent APIs</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     */
    private String clientToken;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier of the Amazon Connect instance. You can <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *         >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *         the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can <a
     *            href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *            >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *            the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can <a
     *            href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *            >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *            the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEvaluationFormRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the evaluation form.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @return <p>
     *         The unique identifier for the evaluation form.
     *         </p>
     */
    public String getEvaluationFormId() {
        return evaluationFormId;
    }

    /**
     * <p>
     * The unique identifier for the evaluation form.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param evaluationFormId <p>
     *            The unique identifier for the evaluation form.
     *            </p>
     */
    public void setEvaluationFormId(String evaluationFormId) {
        this.evaluationFormId = evaluationFormId;
    }

    /**
     * <p>
     * The unique identifier for the evaluation form.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param evaluationFormId <p>
     *            The unique identifier for the evaluation form.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEvaluationFormRequest withEvaluationFormId(String evaluationFormId) {
        this.evaluationFormId = evaluationFormId;
        return this;
    }

    /**
     * <p>
     * A version of the evaluation form to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         A version of the evaluation form to update.
     *         </p>
     */
    public Integer getEvaluationFormVersion() {
        return evaluationFormVersion;
    }

    /**
     * <p>
     * A version of the evaluation form to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param evaluationFormVersion <p>
     *            A version of the evaluation form to update.
     *            </p>
     */
    public void setEvaluationFormVersion(Integer evaluationFormVersion) {
        this.evaluationFormVersion = evaluationFormVersion;
    }

    /**
     * <p>
     * A version of the evaluation form to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param evaluationFormVersion <p>
     *            A version of the evaluation form to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEvaluationFormRequest withEvaluationFormVersion(Integer evaluationFormVersion) {
        this.evaluationFormVersion = evaluationFormVersion;
        return this;
    }

    /**
     * <p>
     * A flag indicating whether the operation must create a new version.
     * </p>
     *
     * @return <p>
     *         A flag indicating whether the operation must create a new
     *         version.
     *         </p>
     */
    public Boolean isCreateNewVersion() {
        return createNewVersion;
    }

    /**
     * <p>
     * A flag indicating whether the operation must create a new version.
     * </p>
     *
     * @return <p>
     *         A flag indicating whether the operation must create a new
     *         version.
     *         </p>
     */
    public Boolean getCreateNewVersion() {
        return createNewVersion;
    }

    /**
     * <p>
     * A flag indicating whether the operation must create a new version.
     * </p>
     *
     * @param createNewVersion <p>
     *            A flag indicating whether the operation must create a new
     *            version.
     *            </p>
     */
    public void setCreateNewVersion(Boolean createNewVersion) {
        this.createNewVersion = createNewVersion;
    }

    /**
     * <p>
     * A flag indicating whether the operation must create a new version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createNewVersion <p>
     *            A flag indicating whether the operation must create a new
     *            version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEvaluationFormRequest withCreateNewVersion(Boolean createNewVersion) {
        this.createNewVersion = createNewVersion;
        return this;
    }

    /**
     * <p>
     * A title of the evaluation form.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         A title of the evaluation form.
     *         </p>
     */
    public String getTitle() {
        return title;
    }

    /**
     * <p>
     * A title of the evaluation form.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param title <p>
     *            A title of the evaluation form.
     *            </p>
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * A title of the evaluation form.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param title <p>
     *            A title of the evaluation form.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEvaluationFormRequest withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * <p>
     * The description of the evaluation form.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return <p>
     *         The description of the evaluation form.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the evaluation form.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param description <p>
     *            The description of the evaluation form.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the evaluation form.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param description <p>
     *            The description of the evaluation form.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEvaluationFormRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Items that are part of the evaluation form. The total number of sections
     * and questions must not exceed 100 each. Questions must be contained in a
     * section.
     * </p>
     *
     * @return <p>
     *         Items that are part of the evaluation form. The total number of
     *         sections and questions must not exceed 100 each. Questions must
     *         be contained in a section.
     *         </p>
     */
    public java.util.List<EvaluationFormItem> getItems() {
        return items;
    }

    /**
     * <p>
     * Items that are part of the evaluation form. The total number of sections
     * and questions must not exceed 100 each. Questions must be contained in a
     * section.
     * </p>
     *
     * @param items <p>
     *            Items that are part of the evaluation form. The total number
     *            of sections and questions must not exceed 100 each. Questions
     *            must be contained in a section.
     *            </p>
     */
    public void setItems(java.util.Collection<EvaluationFormItem> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<EvaluationFormItem>(items);
    }

    /**
     * <p>
     * Items that are part of the evaluation form. The total number of sections
     * and questions must not exceed 100 each. Questions must be contained in a
     * section.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            Items that are part of the evaluation form. The total number
     *            of sections and questions must not exceed 100 each. Questions
     *            must be contained in a section.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEvaluationFormRequest withItems(EvaluationFormItem... items) {
        if (getItems() == null) {
            this.items = new java.util.ArrayList<EvaluationFormItem>(items.length);
        }
        for (EvaluationFormItem value : items) {
            this.items.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Items that are part of the evaluation form. The total number of sections
     * and questions must not exceed 100 each. Questions must be contained in a
     * section.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            Items that are part of the evaluation form. The total number
     *            of sections and questions must not exceed 100 each. Questions
     *            must be contained in a section.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEvaluationFormRequest withItems(java.util.Collection<EvaluationFormItem> items) {
        setItems(items);
        return this;
    }

    /**
     * <p>
     * A scoring strategy of the evaluation form.
     * </p>
     *
     * @return <p>
     *         A scoring strategy of the evaluation form.
     *         </p>
     */
    public EvaluationFormScoringStrategy getScoringStrategy() {
        return scoringStrategy;
    }

    /**
     * <p>
     * A scoring strategy of the evaluation form.
     * </p>
     *
     * @param scoringStrategy <p>
     *            A scoring strategy of the evaluation form.
     *            </p>
     */
    public void setScoringStrategy(EvaluationFormScoringStrategy scoringStrategy) {
        this.scoringStrategy = scoringStrategy;
    }

    /**
     * <p>
     * A scoring strategy of the evaluation form.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scoringStrategy <p>
     *            A scoring strategy of the evaluation form.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEvaluationFormRequest withScoringStrategy(
            EvaluationFormScoringStrategy scoringStrategy) {
        this.scoringStrategy = scoringStrategy;
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. If not provided, the Amazon Web Services SDK
     * populates this field. For more information about idempotency, see <a
     * href=
     * "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     * >Making retries safe with idempotent APIs</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @return <p>
     *         A unique, case-sensitive identifier that you provide to ensure
     *         the idempotency of the request. If not provided, the Amazon Web
     *         Services SDK populates this field. For more information about
     *         idempotency, see <a href=
     *         "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     *         >Making retries safe with idempotent APIs</a>.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. If not provided, the Amazon Web Services SDK
     * populates this field. For more information about idempotency, see <a
     * href=
     * "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     * >Making retries safe with idempotent APIs</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param clientToken <p>
     *            A unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. If not provided, the Amazon
     *            Web Services SDK populates this field. For more information
     *            about idempotency, see <a href=
     *            "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     *            >Making retries safe with idempotent APIs</a>.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. If not provided, the Amazon Web Services SDK
     * populates this field. For more information about idempotency, see <a
     * href=
     * "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     * >Making retries safe with idempotent APIs</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param clientToken <p>
     *            A unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. If not provided, the Amazon
     *            Web Services SDK populates this field. For more information
     *            about idempotency, see <a href=
     *            "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     *            >Making retries safe with idempotent APIs</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEvaluationFormRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getEvaluationFormId() != null)
            sb.append("EvaluationFormId: " + getEvaluationFormId() + ",");
        if (getEvaluationFormVersion() != null)
            sb.append("EvaluationFormVersion: " + getEvaluationFormVersion() + ",");
        if (getCreateNewVersion() != null)
            sb.append("CreateNewVersion: " + getCreateNewVersion() + ",");
        if (getTitle() != null)
            sb.append("Title: " + getTitle() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getItems() != null)
            sb.append("Items: " + getItems() + ",");
        if (getScoringStrategy() != null)
            sb.append("ScoringStrategy: " + getScoringStrategy() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getEvaluationFormId() == null) ? 0 : getEvaluationFormId().hashCode());
        hashCode = prime
                * hashCode
                + ((getEvaluationFormVersion() == null) ? 0 : getEvaluationFormVersion().hashCode());
        hashCode = prime * hashCode
                + ((getCreateNewVersion() == null) ? 0 : getCreateNewVersion().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        hashCode = prime * hashCode
                + ((getScoringStrategy() == null) ? 0 : getScoringStrategy().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEvaluationFormRequest == false)
            return false;
        UpdateEvaluationFormRequest other = (UpdateEvaluationFormRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getEvaluationFormId() == null ^ this.getEvaluationFormId() == null)
            return false;
        if (other.getEvaluationFormId() != null
                && other.getEvaluationFormId().equals(this.getEvaluationFormId()) == false)
            return false;
        if (other.getEvaluationFormVersion() == null ^ this.getEvaluationFormVersion() == null)
            return false;
        if (other.getEvaluationFormVersion() != null
                && other.getEvaluationFormVersion().equals(this.getEvaluationFormVersion()) == false)
            return false;
        if (other.getCreateNewVersion() == null ^ this.getCreateNewVersion() == null)
            return false;
        if (other.getCreateNewVersion() != null
                && other.getCreateNewVersion().equals(this.getCreateNewVersion()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        if (other.getScoringStrategy() == null ^ this.getScoringStrategy() == null)
            return false;
        if (other.getScoringStrategy() != null
                && other.getScoringStrategy().equals(this.getScoringStrategy()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }
}
