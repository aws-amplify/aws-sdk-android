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

package com.amazonaws.services.a4b.model;

import java.io.Serializable;

/**
 * <p>
 * Granular information about the skill.
 * </p>
 */
public class SkillDetails implements Serializable {
    /**
     * <p>
     * The description of the product.
     * </p>
     */
    private String productDescription;

    /**
     * <p>
     * The phrase used to trigger the skill.
     * </p>
     */
    private String invocationPhrase;

    /**
     * <p>
     * The date when the skill was released.
     * </p>
     */
    private String releaseDate;

    /**
     * <p>
     * The URL of the end user license agreement.
     * </p>
     */
    private String endUserLicenseAgreement;

    /**
     * <p>
     * The generic keywords associated with the skill that can be used to find a
     * skill.
     * </p>
     */
    private java.util.List<String> genericKeywords;

    /**
     * <p>
     * The details about what the skill supports organized as bullet points.
     * </p>
     */
    private java.util.List<String> bulletPoints;

    /**
     * <p>
     * The updates added in bullet points.
     * </p>
     */
    private java.util.List<String> newInThisVersionBulletPoints;

    /**
     * <p>
     * The types of skills.
     * </p>
     */
    private java.util.List<String> skillTypes;

    /**
     * <p>
     * <i>This member has been deprecated.</i>
     * </p>
     * <p>
     * The list of reviews for the skill, including Key and Value pair.
     * </p>
     */
    private java.util.Map<String, String> reviews;

    /**
     * <p>
     * The details about the developer that published the skill.
     * </p>
     */
    private DeveloperInfo developerInfo;

    /**
     * <p>
     * The description of the product.
     * </p>
     *
     * @return <p>
     *         The description of the product.
     *         </p>
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * <p>
     * The description of the product.
     * </p>
     *
     * @param productDescription <p>
     *            The description of the product.
     *            </p>
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    /**
     * <p>
     * The description of the product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productDescription <p>
     *            The description of the product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SkillDetails withProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }

    /**
     * <p>
     * The phrase used to trigger the skill.
     * </p>
     *
     * @return <p>
     *         The phrase used to trigger the skill.
     *         </p>
     */
    public String getInvocationPhrase() {
        return invocationPhrase;
    }

    /**
     * <p>
     * The phrase used to trigger the skill.
     * </p>
     *
     * @param invocationPhrase <p>
     *            The phrase used to trigger the skill.
     *            </p>
     */
    public void setInvocationPhrase(String invocationPhrase) {
        this.invocationPhrase = invocationPhrase;
    }

    /**
     * <p>
     * The phrase used to trigger the skill.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param invocationPhrase <p>
     *            The phrase used to trigger the skill.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SkillDetails withInvocationPhrase(String invocationPhrase) {
        this.invocationPhrase = invocationPhrase;
        return this;
    }

    /**
     * <p>
     * The date when the skill was released.
     * </p>
     *
     * @return <p>
     *         The date when the skill was released.
     *         </p>
     */
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     * <p>
     * The date when the skill was released.
     * </p>
     *
     * @param releaseDate <p>
     *            The date when the skill was released.
     *            </p>
     */
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * <p>
     * The date when the skill was released.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param releaseDate <p>
     *            The date when the skill was released.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SkillDetails withReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    /**
     * <p>
     * The URL of the end user license agreement.
     * </p>
     *
     * @return <p>
     *         The URL of the end user license agreement.
     *         </p>
     */
    public String getEndUserLicenseAgreement() {
        return endUserLicenseAgreement;
    }

    /**
     * <p>
     * The URL of the end user license agreement.
     * </p>
     *
     * @param endUserLicenseAgreement <p>
     *            The URL of the end user license agreement.
     *            </p>
     */
    public void setEndUserLicenseAgreement(String endUserLicenseAgreement) {
        this.endUserLicenseAgreement = endUserLicenseAgreement;
    }

    /**
     * <p>
     * The URL of the end user license agreement.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endUserLicenseAgreement <p>
     *            The URL of the end user license agreement.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SkillDetails withEndUserLicenseAgreement(String endUserLicenseAgreement) {
        this.endUserLicenseAgreement = endUserLicenseAgreement;
        return this;
    }

    /**
     * <p>
     * The generic keywords associated with the skill that can be used to find a
     * skill.
     * </p>
     *
     * @return <p>
     *         The generic keywords associated with the skill that can be used
     *         to find a skill.
     *         </p>
     */
    public java.util.List<String> getGenericKeywords() {
        return genericKeywords;
    }

    /**
     * <p>
     * The generic keywords associated with the skill that can be used to find a
     * skill.
     * </p>
     *
     * @param genericKeywords <p>
     *            The generic keywords associated with the skill that can be
     *            used to find a skill.
     *            </p>
     */
    public void setGenericKeywords(java.util.Collection<String> genericKeywords) {
        if (genericKeywords == null) {
            this.genericKeywords = null;
            return;
        }

        this.genericKeywords = new java.util.ArrayList<String>(genericKeywords);
    }

    /**
     * <p>
     * The generic keywords associated with the skill that can be used to find a
     * skill.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param genericKeywords <p>
     *            The generic keywords associated with the skill that can be
     *            used to find a skill.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SkillDetails withGenericKeywords(String... genericKeywords) {
        if (getGenericKeywords() == null) {
            this.genericKeywords = new java.util.ArrayList<String>(genericKeywords.length);
        }
        for (String value : genericKeywords) {
            this.genericKeywords.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The generic keywords associated with the skill that can be used to find a
     * skill.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param genericKeywords <p>
     *            The generic keywords associated with the skill that can be
     *            used to find a skill.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SkillDetails withGenericKeywords(java.util.Collection<String> genericKeywords) {
        setGenericKeywords(genericKeywords);
        return this;
    }

    /**
     * <p>
     * The details about what the skill supports organized as bullet points.
     * </p>
     *
     * @return <p>
     *         The details about what the skill supports organized as bullet
     *         points.
     *         </p>
     */
    public java.util.List<String> getBulletPoints() {
        return bulletPoints;
    }

    /**
     * <p>
     * The details about what the skill supports organized as bullet points.
     * </p>
     *
     * @param bulletPoints <p>
     *            The details about what the skill supports organized as bullet
     *            points.
     *            </p>
     */
    public void setBulletPoints(java.util.Collection<String> bulletPoints) {
        if (bulletPoints == null) {
            this.bulletPoints = null;
            return;
        }

        this.bulletPoints = new java.util.ArrayList<String>(bulletPoints);
    }

    /**
     * <p>
     * The details about what the skill supports organized as bullet points.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bulletPoints <p>
     *            The details about what the skill supports organized as bullet
     *            points.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SkillDetails withBulletPoints(String... bulletPoints) {
        if (getBulletPoints() == null) {
            this.bulletPoints = new java.util.ArrayList<String>(bulletPoints.length);
        }
        for (String value : bulletPoints) {
            this.bulletPoints.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The details about what the skill supports organized as bullet points.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bulletPoints <p>
     *            The details about what the skill supports organized as bullet
     *            points.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SkillDetails withBulletPoints(java.util.Collection<String> bulletPoints) {
        setBulletPoints(bulletPoints);
        return this;
    }

    /**
     * <p>
     * The updates added in bullet points.
     * </p>
     *
     * @return <p>
     *         The updates added in bullet points.
     *         </p>
     */
    public java.util.List<String> getNewInThisVersionBulletPoints() {
        return newInThisVersionBulletPoints;
    }

    /**
     * <p>
     * The updates added in bullet points.
     * </p>
     *
     * @param newInThisVersionBulletPoints <p>
     *            The updates added in bullet points.
     *            </p>
     */
    public void setNewInThisVersionBulletPoints(
            java.util.Collection<String> newInThisVersionBulletPoints) {
        if (newInThisVersionBulletPoints == null) {
            this.newInThisVersionBulletPoints = null;
            return;
        }

        this.newInThisVersionBulletPoints = new java.util.ArrayList<String>(
                newInThisVersionBulletPoints);
    }

    /**
     * <p>
     * The updates added in bullet points.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param newInThisVersionBulletPoints <p>
     *            The updates added in bullet points.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SkillDetails withNewInThisVersionBulletPoints(String... newInThisVersionBulletPoints) {
        if (getNewInThisVersionBulletPoints() == null) {
            this.newInThisVersionBulletPoints = new java.util.ArrayList<String>(
                    newInThisVersionBulletPoints.length);
        }
        for (String value : newInThisVersionBulletPoints) {
            this.newInThisVersionBulletPoints.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The updates added in bullet points.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param newInThisVersionBulletPoints <p>
     *            The updates added in bullet points.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SkillDetails withNewInThisVersionBulletPoints(
            java.util.Collection<String> newInThisVersionBulletPoints) {
        setNewInThisVersionBulletPoints(newInThisVersionBulletPoints);
        return this;
    }

    /**
     * <p>
     * The types of skills.
     * </p>
     *
     * @return <p>
     *         The types of skills.
     *         </p>
     */
    public java.util.List<String> getSkillTypes() {
        return skillTypes;
    }

    /**
     * <p>
     * The types of skills.
     * </p>
     *
     * @param skillTypes <p>
     *            The types of skills.
     *            </p>
     */
    public void setSkillTypes(java.util.Collection<String> skillTypes) {
        if (skillTypes == null) {
            this.skillTypes = null;
            return;
        }

        this.skillTypes = new java.util.ArrayList<String>(skillTypes);
    }

    /**
     * <p>
     * The types of skills.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param skillTypes <p>
     *            The types of skills.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SkillDetails withSkillTypes(String... skillTypes) {
        if (getSkillTypes() == null) {
            this.skillTypes = new java.util.ArrayList<String>(skillTypes.length);
        }
        for (String value : skillTypes) {
            this.skillTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The types of skills.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param skillTypes <p>
     *            The types of skills.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SkillDetails withSkillTypes(java.util.Collection<String> skillTypes) {
        setSkillTypes(skillTypes);
        return this;
    }

    /**
     * <p>
     * <i>This member has been deprecated.</i>
     * </p>
     * <p>
     * The list of reviews for the skill, including Key and Value pair.
     * </p>
     *
     * @return <p>
     *         <i>This member has been deprecated.</i>
     *         </p>
     *         <p>
     *         The list of reviews for the skill, including Key and Value pair.
     *         </p>
     */
    public java.util.Map<String, String> getReviews() {
        return reviews;
    }

    /**
     * <p>
     * <i>This member has been deprecated.</i>
     * </p>
     * <p>
     * The list of reviews for the skill, including Key and Value pair.
     * </p>
     *
     * @param reviews <p>
     *            <i>This member has been deprecated.</i>
     *            </p>
     *            <p>
     *            The list of reviews for the skill, including Key and Value
     *            pair.
     *            </p>
     */
    public void setReviews(java.util.Map<String, String> reviews) {
        this.reviews = reviews;
    }

    /**
     * <p>
     * <i>This member has been deprecated.</i>
     * </p>
     * <p>
     * The list of reviews for the skill, including Key and Value pair.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reviews <p>
     *            <i>This member has been deprecated.</i>
     *            </p>
     *            <p>
     *            The list of reviews for the skill, including Key and Value
     *            pair.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SkillDetails withReviews(java.util.Map<String, String> reviews) {
        this.reviews = reviews;
        return this;
    }

    /**
     * <p>
     * <i>This member has been deprecated.</i>
     * </p>
     * <p>
     * The list of reviews for the skill, including Key and Value pair.
     * </p>
     * <p>
     * The method adds a new key-value pair into Reviews parameter, and returns
     * a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Reviews.
     * @param value The corresponding value of the entry to be added into
     *            Reviews.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SkillDetails addReviewsEntry(String key, String value) {
        if (null == this.reviews) {
            this.reviews = new java.util.HashMap<String, String>();
        }
        if (this.reviews.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.reviews.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Reviews.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public SkillDetails clearReviewsEntries() {
        this.reviews = null;
        return this;
    }

    /**
     * <p>
     * The details about the developer that published the skill.
     * </p>
     *
     * @return <p>
     *         The details about the developer that published the skill.
     *         </p>
     */
    public DeveloperInfo getDeveloperInfo() {
        return developerInfo;
    }

    /**
     * <p>
     * The details about the developer that published the skill.
     * </p>
     *
     * @param developerInfo <p>
     *            The details about the developer that published the skill.
     *            </p>
     */
    public void setDeveloperInfo(DeveloperInfo developerInfo) {
        this.developerInfo = developerInfo;
    }

    /**
     * <p>
     * The details about the developer that published the skill.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param developerInfo <p>
     *            The details about the developer that published the skill.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SkillDetails withDeveloperInfo(DeveloperInfo developerInfo) {
        this.developerInfo = developerInfo;
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
        if (getProductDescription() != null)
            sb.append("ProductDescription: " + getProductDescription() + ",");
        if (getInvocationPhrase() != null)
            sb.append("InvocationPhrase: " + getInvocationPhrase() + ",");
        if (getReleaseDate() != null)
            sb.append("ReleaseDate: " + getReleaseDate() + ",");
        if (getEndUserLicenseAgreement() != null)
            sb.append("EndUserLicenseAgreement: " + getEndUserLicenseAgreement() + ",");
        if (getGenericKeywords() != null)
            sb.append("GenericKeywords: " + getGenericKeywords() + ",");
        if (getBulletPoints() != null)
            sb.append("BulletPoints: " + getBulletPoints() + ",");
        if (getNewInThisVersionBulletPoints() != null)
            sb.append("NewInThisVersionBulletPoints: " + getNewInThisVersionBulletPoints() + ",");
        if (getSkillTypes() != null)
            sb.append("SkillTypes: " + getSkillTypes() + ",");
        if (getReviews() != null)
            sb.append("Reviews: " + getReviews() + ",");
        if (getDeveloperInfo() != null)
            sb.append("DeveloperInfo: " + getDeveloperInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getProductDescription() == null) ? 0 : getProductDescription().hashCode());
        hashCode = prime * hashCode
                + ((getInvocationPhrase() == null) ? 0 : getInvocationPhrase().hashCode());
        hashCode = prime * hashCode
                + ((getReleaseDate() == null) ? 0 : getReleaseDate().hashCode());
        hashCode = prime
                * hashCode
                + ((getEndUserLicenseAgreement() == null) ? 0 : getEndUserLicenseAgreement()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getGenericKeywords() == null) ? 0 : getGenericKeywords().hashCode());
        hashCode = prime * hashCode
                + ((getBulletPoints() == null) ? 0 : getBulletPoints().hashCode());
        hashCode = prime
                * hashCode
                + ((getNewInThisVersionBulletPoints() == null) ? 0
                        : getNewInThisVersionBulletPoints().hashCode());
        hashCode = prime * hashCode + ((getSkillTypes() == null) ? 0 : getSkillTypes().hashCode());
        hashCode = prime * hashCode + ((getReviews() == null) ? 0 : getReviews().hashCode());
        hashCode = prime * hashCode
                + ((getDeveloperInfo() == null) ? 0 : getDeveloperInfo().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SkillDetails == false)
            return false;
        SkillDetails other = (SkillDetails) obj;

        if (other.getProductDescription() == null ^ this.getProductDescription() == null)
            return false;
        if (other.getProductDescription() != null
                && other.getProductDescription().equals(this.getProductDescription()) == false)
            return false;
        if (other.getInvocationPhrase() == null ^ this.getInvocationPhrase() == null)
            return false;
        if (other.getInvocationPhrase() != null
                && other.getInvocationPhrase().equals(this.getInvocationPhrase()) == false)
            return false;
        if (other.getReleaseDate() == null ^ this.getReleaseDate() == null)
            return false;
        if (other.getReleaseDate() != null
                && other.getReleaseDate().equals(this.getReleaseDate()) == false)
            return false;
        if (other.getEndUserLicenseAgreement() == null ^ this.getEndUserLicenseAgreement() == null)
            return false;
        if (other.getEndUserLicenseAgreement() != null
                && other.getEndUserLicenseAgreement().equals(this.getEndUserLicenseAgreement()) == false)
            return false;
        if (other.getGenericKeywords() == null ^ this.getGenericKeywords() == null)
            return false;
        if (other.getGenericKeywords() != null
                && other.getGenericKeywords().equals(this.getGenericKeywords()) == false)
            return false;
        if (other.getBulletPoints() == null ^ this.getBulletPoints() == null)
            return false;
        if (other.getBulletPoints() != null
                && other.getBulletPoints().equals(this.getBulletPoints()) == false)
            return false;
        if (other.getNewInThisVersionBulletPoints() == null
                ^ this.getNewInThisVersionBulletPoints() == null)
            return false;
        if (other.getNewInThisVersionBulletPoints() != null
                && other.getNewInThisVersionBulletPoints().equals(
                        this.getNewInThisVersionBulletPoints()) == false)
            return false;
        if (other.getSkillTypes() == null ^ this.getSkillTypes() == null)
            return false;
        if (other.getSkillTypes() != null
                && other.getSkillTypes().equals(this.getSkillTypes()) == false)
            return false;
        if (other.getReviews() == null ^ this.getReviews() == null)
            return false;
        if (other.getReviews() != null && other.getReviews().equals(this.getReviews()) == false)
            return false;
        if (other.getDeveloperInfo() == null ^ this.getDeveloperInfo() == null)
            return false;
        if (other.getDeveloperInfo() != null
                && other.getDeveloperInfo().equals(this.getDeveloperInfo()) == false)
            return false;
        return true;
    }
}
