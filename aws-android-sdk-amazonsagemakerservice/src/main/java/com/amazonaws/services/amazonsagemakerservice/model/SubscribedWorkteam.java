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

/**
 * <p>
 * Describes a work team of a vendor that does the a labelling job.
 * </p>
 */
public class SubscribedWorkteam implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vendor that you have subscribed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:workteam/.*<br/>
     */
    private String workteamArn;

    /**
     * <p>
     * The title of the service provided by the vendor in the Amazon
     * Marketplace.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>.+<br/>
     */
    private String marketplaceTitle;

    /**
     * <p>
     * The name of the vendor in the Amazon Marketplace.
     * </p>
     */
    private String sellerName;

    /**
     * <p>
     * The description of the vendor from the Amazon Marketplace.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>.+<br/>
     */
    private String marketplaceDescription;

    /**
     * <p/>
     */
    private String listingId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vendor that you have subscribed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:workteam/.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the vendor that you have
     *         subscribed.
     *         </p>
     */
    public String getWorkteamArn() {
        return workteamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vendor that you have subscribed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:workteam/.*<br/>
     *
     * @param workteamArn <p>
     *            The Amazon Resource Name (ARN) of the vendor that you have
     *            subscribed.
     *            </p>
     */
    public void setWorkteamArn(String workteamArn) {
        this.workteamArn = workteamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vendor that you have subscribed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:workteam/.*<br/>
     *
     * @param workteamArn <p>
     *            The Amazon Resource Name (ARN) of the vendor that you have
     *            subscribed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubscribedWorkteam withWorkteamArn(String workteamArn) {
        this.workteamArn = workteamArn;
        return this;
    }

    /**
     * <p>
     * The title of the service provided by the vendor in the Amazon
     * Marketplace.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @return <p>
     *         The title of the service provided by the vendor in the Amazon
     *         Marketplace.
     *         </p>
     */
    public String getMarketplaceTitle() {
        return marketplaceTitle;
    }

    /**
     * <p>
     * The title of the service provided by the vendor in the Amazon
     * Marketplace.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param marketplaceTitle <p>
     *            The title of the service provided by the vendor in the Amazon
     *            Marketplace.
     *            </p>
     */
    public void setMarketplaceTitle(String marketplaceTitle) {
        this.marketplaceTitle = marketplaceTitle;
    }

    /**
     * <p>
     * The title of the service provided by the vendor in the Amazon
     * Marketplace.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param marketplaceTitle <p>
     *            The title of the service provided by the vendor in the Amazon
     *            Marketplace.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubscribedWorkteam withMarketplaceTitle(String marketplaceTitle) {
        this.marketplaceTitle = marketplaceTitle;
        return this;
    }

    /**
     * <p>
     * The name of the vendor in the Amazon Marketplace.
     * </p>
     *
     * @return <p>
     *         The name of the vendor in the Amazon Marketplace.
     *         </p>
     */
    public String getSellerName() {
        return sellerName;
    }

    /**
     * <p>
     * The name of the vendor in the Amazon Marketplace.
     * </p>
     *
     * @param sellerName <p>
     *            The name of the vendor in the Amazon Marketplace.
     *            </p>
     */
    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    /**
     * <p>
     * The name of the vendor in the Amazon Marketplace.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sellerName <p>
     *            The name of the vendor in the Amazon Marketplace.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubscribedWorkteam withSellerName(String sellerName) {
        this.sellerName = sellerName;
        return this;
    }

    /**
     * <p>
     * The description of the vendor from the Amazon Marketplace.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @return <p>
     *         The description of the vendor from the Amazon Marketplace.
     *         </p>
     */
    public String getMarketplaceDescription() {
        return marketplaceDescription;
    }

    /**
     * <p>
     * The description of the vendor from the Amazon Marketplace.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param marketplaceDescription <p>
     *            The description of the vendor from the Amazon Marketplace.
     *            </p>
     */
    public void setMarketplaceDescription(String marketplaceDescription) {
        this.marketplaceDescription = marketplaceDescription;
    }

    /**
     * <p>
     * The description of the vendor from the Amazon Marketplace.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param marketplaceDescription <p>
     *            The description of the vendor from the Amazon Marketplace.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubscribedWorkteam withMarketplaceDescription(String marketplaceDescription) {
        this.marketplaceDescription = marketplaceDescription;
        return this;
    }

    /**
     * <p/>
     *
     * @return <p/>
     */
    public String getListingId() {
        return listingId;
    }

    /**
     * <p/>
     *
     * @param listingId <p/>
     */
    public void setListingId(String listingId) {
        this.listingId = listingId;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param listingId <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubscribedWorkteam withListingId(String listingId) {
        this.listingId = listingId;
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
        if (getWorkteamArn() != null)
            sb.append("WorkteamArn: " + getWorkteamArn() + ",");
        if (getMarketplaceTitle() != null)
            sb.append("MarketplaceTitle: " + getMarketplaceTitle() + ",");
        if (getSellerName() != null)
            sb.append("SellerName: " + getSellerName() + ",");
        if (getMarketplaceDescription() != null)
            sb.append("MarketplaceDescription: " + getMarketplaceDescription() + ",");
        if (getListingId() != null)
            sb.append("ListingId: " + getListingId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getWorkteamArn() == null) ? 0 : getWorkteamArn().hashCode());
        hashCode = prime * hashCode
                + ((getMarketplaceTitle() == null) ? 0 : getMarketplaceTitle().hashCode());
        hashCode = prime * hashCode + ((getSellerName() == null) ? 0 : getSellerName().hashCode());
        hashCode = prime
                * hashCode
                + ((getMarketplaceDescription() == null) ? 0 : getMarketplaceDescription()
                        .hashCode());
        hashCode = prime * hashCode + ((getListingId() == null) ? 0 : getListingId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubscribedWorkteam == false)
            return false;
        SubscribedWorkteam other = (SubscribedWorkteam) obj;

        if (other.getWorkteamArn() == null ^ this.getWorkteamArn() == null)
            return false;
        if (other.getWorkteamArn() != null
                && other.getWorkteamArn().equals(this.getWorkteamArn()) == false)
            return false;
        if (other.getMarketplaceTitle() == null ^ this.getMarketplaceTitle() == null)
            return false;
        if (other.getMarketplaceTitle() != null
                && other.getMarketplaceTitle().equals(this.getMarketplaceTitle()) == false)
            return false;
        if (other.getSellerName() == null ^ this.getSellerName() == null)
            return false;
        if (other.getSellerName() != null
                && other.getSellerName().equals(this.getSellerName()) == false)
            return false;
        if (other.getMarketplaceDescription() == null ^ this.getMarketplaceDescription() == null)
            return false;
        if (other.getMarketplaceDescription() != null
                && other.getMarketplaceDescription().equals(this.getMarketplaceDescription()) == false)
            return false;
        if (other.getListingId() == null ^ this.getListingId() == null)
            return false;
        if (other.getListingId() != null
                && other.getListingId().equals(this.getListingId()) == false)
            return false;
        return true;
    }
}
