package com.amazon.aws.amazonfreertossdk;

import com.amazon.aws.amazonfreertossdk.networkconfig.DeleteNetworkResp;
import com.amazon.aws.amazonfreertossdk.networkconfig.EditNetworkResp;
import com.amazon.aws.amazonfreertossdk.networkconfig.ListNetworkResp;
import com.amazon.aws.amazonfreertossdk.networkconfig.SaveNetworkResp;

public abstract class NetworkConfigCallback {

    public void onListNetworkResponse(ListNetworkResp response){}

    public void onSaveNetworkResponse(SaveNetworkResp response){}

    public void onEditNetworkResponse(EditNetworkResp response){}

    public void onDeleteNetworkResponse(DeleteNetworkResp response){}
}
