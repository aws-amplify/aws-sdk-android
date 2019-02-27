
package com.amazonaws.services.machinelearning;

import com.amazonaws.services.machinelearning.model.GetMLModelRequest;
import com.amazonaws.services.machinelearning.model.GetMLModelResult;
import com.amazonaws.services.machinelearning.model.PredictRequest;
import com.amazonaws.services.machinelearning.model.PredictResult;
import com.amazonaws.testutils.AWSTestBase;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;

public class AmazonMachineLearningIntegrationTest extends AWSTestBase {

    private static final String ML_MODEL_ID = "pr-hoMlig0hsoI";

    private static AmazonMachineLearningClient client;

    @BeforeClass
    public static void setUp() throws IOException {
        setUpCredentials();


        client = new AmazonMachineLearningClient(credentials);
        client.setSignerRegionOverride("us-west-2");
    }

    @Test
    public void testDescribePredict() {
        GetMLModelRequest getMLModelRequest = new GetMLModelRequest();
        getMLModelRequest.setMLModelId(ML_MODEL_ID);
        GetMLModelResult getMLModelResult = client.getMLModel(getMLModelRequest);
        System.out.println(getMLModelResult);

        String predictEndpoint = getMLModelResult.getEndpointInfo().getEndpointUrl();
        System.out.println("Predict endpoint URL: " + predictEndpoint);

        PredictRequest request = new PredictRequest();
        request.setPredictEndpoint(predictEndpoint);
        request.setMLModelId(ML_MODEL_ID);
        request.setRecord(new HashMap<String, String>());
        PredictResult result = client.predict(request);
        System.out.println(result);
    }
}
