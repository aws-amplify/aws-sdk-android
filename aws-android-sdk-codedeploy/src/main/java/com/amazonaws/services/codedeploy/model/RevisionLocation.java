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

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the location of an application revision.
 * </p>
 */
public class RevisionLocation implements Serializable {
    /**
     * <p>
     * The type of application revision:
     * </p>
     * <ul>
     * <li>
     * <p>
     * S3: An application revision stored in Amazon S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * GitHub: An application revision stored in GitHub (EC2/On-premises
     * deployments only).
     * </p>
     * </li>
     * <li>
     * <p>
     * String: A YAML-formatted or JSON-formatted string (AWS Lambda deployments
     * only).
     * </p>
     * </li>
     * <li>
     * <p>
     * AppSpecContent: An <code>AppSpecContent</code> object that contains the
     * contents of an AppSpec file for an AWS Lambda or Amazon ECS deployment.
     * The content is formatted as JSON or YAML stored as a RawString.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3, GitHub, String, AppSpecContent
     */
    private String revisionType;

    /**
     * <p>
     * Information about the location of a revision stored in Amazon S3.
     * </p>
     */
    private S3Location s3Location;

    /**
     * <p>
     * Information about the location of application artifacts stored in GitHub.
     * </p>
     */
    private GitHubLocation gitHubLocation;

    /**
     * <p>
     * Information about the location of an AWS Lambda deployment revision
     * stored as a RawString.
     * </p>
     */
    private RawString stringValue;

    /**
     * <p>
     * The content of an AppSpec file for an AWS Lambda or Amazon ECS
     * deployment. The content is formatted as JSON or YAML and stored as a
     * RawString.
     * </p>
     */
    private AppSpecContent appSpecContent;

    /**
     * <p>
     * The type of application revision:
     * </p>
     * <ul>
     * <li>
     * <p>
     * S3: An application revision stored in Amazon S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * GitHub: An application revision stored in GitHub (EC2/On-premises
     * deployments only).
     * </p>
     * </li>
     * <li>
     * <p>
     * String: A YAML-formatted or JSON-formatted string (AWS Lambda deployments
     * only).
     * </p>
     * </li>
     * <li>
     * <p>
     * AppSpecContent: An <code>AppSpecContent</code> object that contains the
     * contents of an AppSpec file for an AWS Lambda or Amazon ECS deployment.
     * The content is formatted as JSON or YAML stored as a RawString.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3, GitHub, String, AppSpecContent
     *
     * @return <p>
     *         The type of application revision:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         S3: An application revision stored in Amazon S3.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         GitHub: An application revision stored in GitHub (EC2/On-premises
     *         deployments only).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         String: A YAML-formatted or JSON-formatted string (AWS Lambda
     *         deployments only).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AppSpecContent: An <code>AppSpecContent</code> object that
     *         contains the contents of an AppSpec file for an AWS Lambda or
     *         Amazon ECS deployment. The content is formatted as JSON or YAML
     *         stored as a RawString.
     *         </p>
     *         </li>
     *         </ul>
     * @see RevisionLocationType
     */
    public String getRevisionType() {
        return revisionType;
    }

    /**
     * <p>
     * The type of application revision:
     * </p>
     * <ul>
     * <li>
     * <p>
     * S3: An application revision stored in Amazon S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * GitHub: An application revision stored in GitHub (EC2/On-premises
     * deployments only).
     * </p>
     * </li>
     * <li>
     * <p>
     * String: A YAML-formatted or JSON-formatted string (AWS Lambda deployments
     * only).
     * </p>
     * </li>
     * <li>
     * <p>
     * AppSpecContent: An <code>AppSpecContent</code> object that contains the
     * contents of an AppSpec file for an AWS Lambda or Amazon ECS deployment.
     * The content is formatted as JSON or YAML stored as a RawString.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3, GitHub, String, AppSpecContent
     *
     * @param revisionType <p>
     *            The type of application revision:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            S3: An application revision stored in Amazon S3.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            GitHub: An application revision stored in GitHub
     *            (EC2/On-premises deployments only).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            String: A YAML-formatted or JSON-formatted string (AWS Lambda
     *            deployments only).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            AppSpecContent: An <code>AppSpecContent</code> object that
     *            contains the contents of an AppSpec file for an AWS Lambda or
     *            Amazon ECS deployment. The content is formatted as JSON or
     *            YAML stored as a RawString.
     *            </p>
     *            </li>
     *            </ul>
     * @see RevisionLocationType
     */
    public void setRevisionType(String revisionType) {
        this.revisionType = revisionType;
    }

    /**
     * <p>
     * The type of application revision:
     * </p>
     * <ul>
     * <li>
     * <p>
     * S3: An application revision stored in Amazon S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * GitHub: An application revision stored in GitHub (EC2/On-premises
     * deployments only).
     * </p>
     * </li>
     * <li>
     * <p>
     * String: A YAML-formatted or JSON-formatted string (AWS Lambda deployments
     * only).
     * </p>
     * </li>
     * <li>
     * <p>
     * AppSpecContent: An <code>AppSpecContent</code> object that contains the
     * contents of an AppSpec file for an AWS Lambda or Amazon ECS deployment.
     * The content is formatted as JSON or YAML stored as a RawString.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3, GitHub, String, AppSpecContent
     *
     * @param revisionType <p>
     *            The type of application revision:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            S3: An application revision stored in Amazon S3.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            GitHub: An application revision stored in GitHub
     *            (EC2/On-premises deployments only).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            String: A YAML-formatted or JSON-formatted string (AWS Lambda
     *            deployments only).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            AppSpecContent: An <code>AppSpecContent</code> object that
     *            contains the contents of an AppSpec file for an AWS Lambda or
     *            Amazon ECS deployment. The content is formatted as JSON or
     *            YAML stored as a RawString.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RevisionLocationType
     */
    public RevisionLocation withRevisionType(String revisionType) {
        this.revisionType = revisionType;
        return this;
    }

    /**
     * <p>
     * The type of application revision:
     * </p>
     * <ul>
     * <li>
     * <p>
     * S3: An application revision stored in Amazon S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * GitHub: An application revision stored in GitHub (EC2/On-premises
     * deployments only).
     * </p>
     * </li>
     * <li>
     * <p>
     * String: A YAML-formatted or JSON-formatted string (AWS Lambda deployments
     * only).
     * </p>
     * </li>
     * <li>
     * <p>
     * AppSpecContent: An <code>AppSpecContent</code> object that contains the
     * contents of an AppSpec file for an AWS Lambda or Amazon ECS deployment.
     * The content is formatted as JSON or YAML stored as a RawString.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3, GitHub, String, AppSpecContent
     *
     * @param revisionType <p>
     *            The type of application revision:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            S3: An application revision stored in Amazon S3.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            GitHub: An application revision stored in GitHub
     *            (EC2/On-premises deployments only).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            String: A YAML-formatted or JSON-formatted string (AWS Lambda
     *            deployments only).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            AppSpecContent: An <code>AppSpecContent</code> object that
     *            contains the contents of an AppSpec file for an AWS Lambda or
     *            Amazon ECS deployment. The content is formatted as JSON or
     *            YAML stored as a RawString.
     *            </p>
     *            </li>
     *            </ul>
     * @see RevisionLocationType
     */
    public void setRevisionType(RevisionLocationType revisionType) {
        this.revisionType = revisionType.toString();
    }

    /**
     * <p>
     * The type of application revision:
     * </p>
     * <ul>
     * <li>
     * <p>
     * S3: An application revision stored in Amazon S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * GitHub: An application revision stored in GitHub (EC2/On-premises
     * deployments only).
     * </p>
     * </li>
     * <li>
     * <p>
     * String: A YAML-formatted or JSON-formatted string (AWS Lambda deployments
     * only).
     * </p>
     * </li>
     * <li>
     * <p>
     * AppSpecContent: An <code>AppSpecContent</code> object that contains the
     * contents of an AppSpec file for an AWS Lambda or Amazon ECS deployment.
     * The content is formatted as JSON or YAML stored as a RawString.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3, GitHub, String, AppSpecContent
     *
     * @param revisionType <p>
     *            The type of application revision:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            S3: An application revision stored in Amazon S3.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            GitHub: An application revision stored in GitHub
     *            (EC2/On-premises deployments only).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            String: A YAML-formatted or JSON-formatted string (AWS Lambda
     *            deployments only).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            AppSpecContent: An <code>AppSpecContent</code> object that
     *            contains the contents of an AppSpec file for an AWS Lambda or
     *            Amazon ECS deployment. The content is formatted as JSON or
     *            YAML stored as a RawString.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RevisionLocationType
     */
    public RevisionLocation withRevisionType(RevisionLocationType revisionType) {
        this.revisionType = revisionType.toString();
        return this;
    }

    /**
     * <p>
     * Information about the location of a revision stored in Amazon S3.
     * </p>
     *
     * @return <p>
     *         Information about the location of a revision stored in Amazon S3.
     *         </p>
     */
    public S3Location getS3Location() {
        return s3Location;
    }

    /**
     * <p>
     * Information about the location of a revision stored in Amazon S3.
     * </p>
     *
     * @param s3Location <p>
     *            Information about the location of a revision stored in Amazon
     *            S3.
     *            </p>
     */
    public void setS3Location(S3Location s3Location) {
        this.s3Location = s3Location;
    }

    /**
     * <p>
     * Information about the location of a revision stored in Amazon S3.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Location <p>
     *            Information about the location of a revision stored in Amazon
     *            S3.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RevisionLocation withS3Location(S3Location s3Location) {
        this.s3Location = s3Location;
        return this;
    }

    /**
     * <p>
     * Information about the location of application artifacts stored in GitHub.
     * </p>
     *
     * @return <p>
     *         Information about the location of application artifacts stored in
     *         GitHub.
     *         </p>
     */
    public GitHubLocation getGitHubLocation() {
        return gitHubLocation;
    }

    /**
     * <p>
     * Information about the location of application artifacts stored in GitHub.
     * </p>
     *
     * @param gitHubLocation <p>
     *            Information about the location of application artifacts stored
     *            in GitHub.
     *            </p>
     */
    public void setGitHubLocation(GitHubLocation gitHubLocation) {
        this.gitHubLocation = gitHubLocation;
    }

    /**
     * <p>
     * Information about the location of application artifacts stored in GitHub.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gitHubLocation <p>
     *            Information about the location of application artifacts stored
     *            in GitHub.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RevisionLocation withGitHubLocation(GitHubLocation gitHubLocation) {
        this.gitHubLocation = gitHubLocation;
        return this;
    }

    /**
     * <p>
     * Information about the location of an AWS Lambda deployment revision
     * stored as a RawString.
     * </p>
     *
     * @return <p>
     *         Information about the location of an AWS Lambda deployment
     *         revision stored as a RawString.
     *         </p>
     */
    public RawString getString() {
        return stringValue;
    }

    /**
     * <p>
     * Information about the location of an AWS Lambda deployment revision
     * stored as a RawString.
     * </p>
     *
     * @param stringValue <p>
     *            Information about the location of an AWS Lambda deployment
     *            revision stored as a RawString.
     *            </p>
     */
    public void setString(RawString stringValue) {
        this.stringValue = stringValue;
    }

    /**
     * <p>
     * Information about the location of an AWS Lambda deployment revision
     * stored as a RawString.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stringValue <p>
     *            Information about the location of an AWS Lambda deployment
     *            revision stored as a RawString.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RevisionLocation withString(RawString stringValue) {
        this.stringValue = stringValue;
        return this;
    }

    /**
     * <p>
     * The content of an AppSpec file for an AWS Lambda or Amazon ECS
     * deployment. The content is formatted as JSON or YAML and stored as a
     * RawString.
     * </p>
     *
     * @return <p>
     *         The content of an AppSpec file for an AWS Lambda or Amazon ECS
     *         deployment. The content is formatted as JSON or YAML and stored
     *         as a RawString.
     *         </p>
     */
    public AppSpecContent getAppSpecContent() {
        return appSpecContent;
    }

    /**
     * <p>
     * The content of an AppSpec file for an AWS Lambda or Amazon ECS
     * deployment. The content is formatted as JSON or YAML and stored as a
     * RawString.
     * </p>
     *
     * @param appSpecContent <p>
     *            The content of an AppSpec file for an AWS Lambda or Amazon ECS
     *            deployment. The content is formatted as JSON or YAML and
     *            stored as a RawString.
     *            </p>
     */
    public void setAppSpecContent(AppSpecContent appSpecContent) {
        this.appSpecContent = appSpecContent;
    }

    /**
     * <p>
     * The content of an AppSpec file for an AWS Lambda or Amazon ECS
     * deployment. The content is formatted as JSON or YAML and stored as a
     * RawString.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param appSpecContent <p>
     *            The content of an AppSpec file for an AWS Lambda or Amazon ECS
     *            deployment. The content is formatted as JSON or YAML and
     *            stored as a RawString.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RevisionLocation withAppSpecContent(AppSpecContent appSpecContent) {
        this.appSpecContent = appSpecContent;
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
        if (getRevisionType() != null)
            sb.append("revisionType: " + getRevisionType() + ",");
        if (getS3Location() != null)
            sb.append("s3Location: " + getS3Location() + ",");
        if (getGitHubLocation() != null)
            sb.append("gitHubLocation: " + getGitHubLocation() + ",");
        if (getString() != null)
            sb.append("string: " + getString() + ",");
        if (getAppSpecContent() != null)
            sb.append("appSpecContent: " + getAppSpecContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRevisionType() == null) ? 0 : getRevisionType().hashCode());
        hashCode = prime * hashCode + ((getS3Location() == null) ? 0 : getS3Location().hashCode());
        hashCode = prime * hashCode
                + ((getGitHubLocation() == null) ? 0 : getGitHubLocation().hashCode());
        hashCode = prime * hashCode + ((getString() == null) ? 0 : getString().hashCode());
        hashCode = prime * hashCode
                + ((getAppSpecContent() == null) ? 0 : getAppSpecContent().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RevisionLocation == false)
            return false;
        RevisionLocation other = (RevisionLocation) obj;

        if (other.getRevisionType() == null ^ this.getRevisionType() == null)
            return false;
        if (other.getRevisionType() != null
                && other.getRevisionType().equals(this.getRevisionType()) == false)
            return false;
        if (other.getS3Location() == null ^ this.getS3Location() == null)
            return false;
        if (other.getS3Location() != null
                && other.getS3Location().equals(this.getS3Location()) == false)
            return false;
        if (other.getGitHubLocation() == null ^ this.getGitHubLocation() == null)
            return false;
        if (other.getGitHubLocation() != null
                && other.getGitHubLocation().equals(this.getGitHubLocation()) == false)
            return false;
        if (other.getString() == null ^ this.getString() == null)
            return false;
        if (other.getString() != null && other.getString().equals(this.getString()) == false)
            return false;
        if (other.getAppSpecContent() == null ^ this.getAppSpecContent() == null)
            return false;
        if (other.getAppSpecContent() != null
                && other.getAppSpecContent().equals(this.getAppSpecContent()) == false)
            return false;
        return true;
    }
}
