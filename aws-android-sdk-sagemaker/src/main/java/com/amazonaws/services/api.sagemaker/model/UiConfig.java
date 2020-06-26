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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

/**
 * <p>
 * Provided configuration information for the worker UI for a labeling job.
 * </p>
 */
public class UiConfig implements Serializable {
    /**
     * <p>
     * The Amazon S3 bucket location of the UI template, or worker task
     * template. This is the template used to render the worker UI and tools for
     * labeling job tasks. For more information about the contents of a UI
     * template, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-custom-templates-step2.html"
     * > Creating Your Custom Labeling Task Template</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     */
    private String uiTemplateS3Uri;

    /**
     * <p>
     * The ARN of the worker task template used to render the worker UI and
     * tools for labeling job tasks. Do not use this parameter if you use
     * UiTemplateS3Uri.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:human-task-ui/.*<br/>
     */
    private String humanTaskUiArn;

    /**
     * <p>
     * The Amazon S3 bucket location of the UI template, or worker task
     * template. This is the template used to render the worker UI and tools for
     * labeling job tasks. For more information about the contents of a UI
     * template, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-custom-templates-step2.html"
     * > Creating Your Custom Labeling Task Template</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @return <p>
     *         The Amazon S3 bucket location of the UI template, or worker task
     *         template. This is the template used to render the worker UI and
     *         tools for labeling job tasks. For more information about the
     *         contents of a UI template, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-custom-templates-step2.html"
     *         > Creating Your Custom Labeling Task Template</a>.
     *         </p>
     */
    public String getUiTemplateS3Uri() {
        return uiTemplateS3Uri;
    }

    /**
     * <p>
     * The Amazon S3 bucket location of the UI template, or worker task
     * template. This is the template used to render the worker UI and tools for
     * labeling job tasks. For more information about the contents of a UI
     * template, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-custom-templates-step2.html"
     * > Creating Your Custom Labeling Task Template</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @param uiTemplateS3Uri <p>
     *            The Amazon S3 bucket location of the UI template, or worker
     *            task template. This is the template used to render the worker
     *            UI and tools for labeling job tasks. For more information
     *            about the contents of a UI template, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-custom-templates-step2.html"
     *            > Creating Your Custom Labeling Task Template</a>.
     *            </p>
     */
    public void setUiTemplateS3Uri(String uiTemplateS3Uri) {
        this.uiTemplateS3Uri = uiTemplateS3Uri;
    }

    /**
     * <p>
     * The Amazon S3 bucket location of the UI template, or worker task
     * template. This is the template used to render the worker UI and tools for
     * labeling job tasks. For more information about the contents of a UI
     * template, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-custom-templates-step2.html"
     * > Creating Your Custom Labeling Task Template</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @param uiTemplateS3Uri <p>
     *            The Amazon S3 bucket location of the UI template, or worker
     *            task template. This is the template used to render the worker
     *            UI and tools for labeling job tasks. For more information
     *            about the contents of a UI template, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-custom-templates-step2.html"
     *            > Creating Your Custom Labeling Task Template</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UiConfig withUiTemplateS3Uri(String uiTemplateS3Uri) {
        this.uiTemplateS3Uri = uiTemplateS3Uri;
        return this;
    }

    /**
     * <p>
     * The ARN of the worker task template used to render the worker UI and
     * tools for labeling job tasks. Do not use this parameter if you use
     * UiTemplateS3Uri.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:human-task-ui/.*<br/>
     *
     * @return <p>
     *         The ARN of the worker task template used to render the worker UI
     *         and tools for labeling job tasks. Do not use this parameter if
     *         you use UiTemplateS3Uri.
     *         </p>
     */
    public String getHumanTaskUiArn() {
        return humanTaskUiArn;
    }

    /**
     * <p>
     * The ARN of the worker task template used to render the worker UI and
     * tools for labeling job tasks. Do not use this parameter if you use
     * UiTemplateS3Uri.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:human-task-ui/.*<br/>
     *
     * @param humanTaskUiArn <p>
     *            The ARN of the worker task template used to render the worker
     *            UI and tools for labeling job tasks. Do not use this parameter
     *            if you use UiTemplateS3Uri.
     *            </p>
     */
    public void setHumanTaskUiArn(String humanTaskUiArn) {
        this.humanTaskUiArn = humanTaskUiArn;
    }

    /**
     * <p>
     * The ARN of the worker task template used to render the worker UI and
     * tools for labeling job tasks. Do not use this parameter if you use
     * UiTemplateS3Uri.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:human-task-ui/.*<br/>
     *
     * @param humanTaskUiArn <p>
     *            The ARN of the worker task template used to render the worker
     *            UI and tools for labeling job tasks. Do not use this parameter
     *            if you use UiTemplateS3Uri.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UiConfig withHumanTaskUiArn(String humanTaskUiArn) {
        this.humanTaskUiArn = humanTaskUiArn;
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
        if (getUiTemplateS3Uri() != null)
            sb.append("UiTemplateS3Uri: " + getUiTemplateS3Uri() + ",");
        if (getHumanTaskUiArn() != null)
            sb.append("HumanTaskUiArn: " + getHumanTaskUiArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUiTemplateS3Uri() == null) ? 0 : getUiTemplateS3Uri().hashCode());
        hashCode = prime * hashCode
                + ((getHumanTaskUiArn() == null) ? 0 : getHumanTaskUiArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UiConfig == false)
            return false;
        UiConfig other = (UiConfig) obj;

        if (other.getUiTemplateS3Uri() == null ^ this.getUiTemplateS3Uri() == null)
            return false;
        if (other.getUiTemplateS3Uri() != null
                && other.getUiTemplateS3Uri().equals(this.getUiTemplateS3Uri()) == false)
            return false;
        if (other.getHumanTaskUiArn() == null ^ this.getHumanTaskUiArn() == null)
            return false;
        if (other.getHumanTaskUiArn() != null
                && other.getHumanTaskUiArn().equals(this.getHumanTaskUiArn()) == false)
            return false;
        return true;
    }
}
