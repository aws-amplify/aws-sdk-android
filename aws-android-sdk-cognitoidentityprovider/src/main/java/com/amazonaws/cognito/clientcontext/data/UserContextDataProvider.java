package com.amazonaws.cognito.clientcontext.data;

import com.amazonaws.cognito.clientcontext.datacollection.DataAggregator;
import com.amazonaws.cognito.clientcontext.datacollection.DataAggregatorImpl;
import com.amazonaws.android.util.Base64;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONException;
import org.json.JSONObject;

import com.amazonaws.cognito.clientcontext.util.SignatureGenerator;

/**
 * It provides the user context data that is sent to the server.
 */
public class UserContextDataProvider {
  
  public static DataAggregator sDefaultDataAggregator = new DataAggregatorImpl();

  private static final String TAG = UserContextDataProvider.class.getSimpleName();
  private static final Log LOGGER = LogFactory.getLog(UserContextDataProvider.class);
  
  public static final String VERSION = "ANDROID20171114";

  private DataAggregator aggregator;
  private SignatureGenerator signatureGenerator;

  /**
   * Private class to store an instance. This is used to ensure a singleton
   * instance of the class.
   */
  private static class InstanceHolder {
    private static final UserContextDataProvider INSTANCE = new UserContextDataProvider();
  }

  private UserContextDataProvider() {
    this(sDefaultDataAggregator, new SignatureGenerator());
  }

  /**
   * Protected constructor to instantiate a class object for unit testing.
   */
  protected UserContextDataProvider(DataAggregator aggregator, SignatureGenerator signatureGenerator) {
    this.aggregator = aggregator;
    this.signatureGenerator = signatureGenerator;
  }
  
  public static void setDefaultDataAggregator(DataAggregator dataAggregator) {
    sDefaultDataAggregator = dataAggregator;
  }

  /**
   * @return instance of the class
   */
  public static UserContextDataProvider getInstance() {
    return InstanceHolder.INSTANCE;
  }

  /**
   * It gets aggregated user context data, adds signature to it and provides
   * it in Base64 encoded form. Final data is JSON object with 'signature' and
   * 'payload'. Payload is a JSON object that contains 'username',
   * 'userPoolId', 'timestamp' and 'contextData'.
   *
   * @param username
   *            username for the user
   * @param userPoolId
   *            cognito userpoolId for the application
   * @param signatureSecret
   *            secret key used while generating signature. For now, this
   *            would be application clientId.
   * @return base64 encoded userContextData.
   */
  public String getEncodedContextData(String username, String userPoolId, String signatureSecret) {
    JSONObject jsonResponse = new JSONObject();

    try {
      final Map<String, String> contextData = aggregator.getAggregatedData();
      JSONObject payload = getJsonPayload(contextData, username, userPoolId);
      String payloadString = payload.toString();

      String signature = signatureGenerator.getSignature(payloadString, signatureSecret, VERSION);
      jsonResponse = getJsonResponse(payloadString, signature);
      return getEncodedResponse(jsonResponse);
    } catch (Exception e) {
      LOGGER.error("Exception in creating JSON from context data", e);
      return null;
    }
  }

  private JSONObject getJsonPayload(Map<String, String> contextData, String username, String userPoolId)
      throws JSONException {
    JSONObject payload = new JSONObject();
    payload.put(ContextDataJsonKeys.CONTEXT_DATA, new JSONObject(contextData));
    payload.put(ContextDataJsonKeys.USERNAME, username);
    payload.put(ContextDataJsonKeys.USER_POOL_ID, userPoolId);
    payload.put(ContextDataJsonKeys.TIMESTAMP_MILLI_SEC, getTimestamp());
    return payload;
  }

  /**
   * Protected to allow overriding in unit test.
   */
  protected String getTimestamp() {
    return String.valueOf(System.currentTimeMillis());
  }

  private JSONObject getJsonResponse(String payload, String signature) throws JSONException {
    JSONObject jsonResponse = new JSONObject();
    jsonResponse.put(ContextDataJsonKeys.DATA_PAYLOAD, payload);
    jsonResponse.put(ContextDataJsonKeys.SIGNATURE, signature);
    jsonResponse.put(ContextDataJsonKeys.VERSION, UserContextDataProvider.VERSION);
    return jsonResponse;
  }

  /**
   * Protected to allow overriding in unit test. Base64 is part of AndroidSdk
   * which cannot be directly invoked in unit test.
   */
  protected String getEncodedResponse(JSONObject jsonResponse) {
    byte[] responseBytes = jsonResponse.toString().getBytes(ConfigurationConstant.DEFAULT_CHARSET);
    return Base64.encodeToString(responseBytes, Base64.DEFAULT);
  }

  /**
   * Class defines constant keys that are used in JSON response object.
   */
  private class ContextDataJsonKeys {
    private static final String CONTEXT_DATA = "contextData";
    private static final String USERNAME = "username";
    private static final String USER_POOL_ID = "userPoolId";
    private static final String TIMESTAMP_MILLI_SEC = "timestamp";
    private static final String DATA_PAYLOAD = "payload";
    private static final String VERSION = "version";
    private static final String SIGNATURE = "signature";
  }
}
