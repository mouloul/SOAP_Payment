package test;

import java.net.*;
import java.io.*;
import java.security.Security;
import java.util.Base64;

import org.json.JSONObject;
import org.json.JSONException;
import org.json.XML;

import org.junit.Test;
import org.junit.Ignore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QueryTransactionTest extends CyberSourceBaseTest {

	private static final Logger log = LoggerFactory.getLogger(QueryTransactionTest.class);

	// for test system, use https://ebctest.cybersource.com/ebctest/Query
	// for live system, use https://ebc.cybersource.com/ebc/Query
	private static String server     = "https://ebctest.cybersource.com/ebctest/Query";
	private static String username   = "itcybs";
	private static String passwd     = "Password100";

	@Test
	@Ignore
	public void shoudQuery() throws Exception {

		// <requestID> is a 22 digit numeric ID corresponding to a transaction in the CyberSource system
		String requestID = "5106476186716067204105";
		getTxnRecord(requestID);
	}

	/*
	 * This method takes a CyberSource request id as input,
	 * opens an https connection to CyberSource and posts the request id.
	 * The reply is in the form of an XML Transaction Detail Report record
	 */

	private static void getTxnRecord(String requestID) throws Exception {

		// add SSL provider to the java policy file
		System.setProperty("java.protocol.handler.pkgs", "com.sun.net.ssl.internal.www.protocol");
		Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());

		// Construct post data
		String data = "merchantID=" + MERCHANT_ID;
		data += "&type=transaction";
		//data += "&versionNumber=1.9"; // If the versionNumber is not submitted, the latest version of the DTD will be used
		data += "&subtype=transactionDetail";
		data += "&requestID=" + requestID;

		// Encode login info
		String credString = username + ":" + passwd;
		String encoding = Base64.getEncoder().encodeToString(credString.getBytes());

		// Send post data
		URL url = new URL(server);
		URLConnection conn = url.openConnection();
		conn.setDoOutput(true);
		
		// Handle basic authentication
		conn.setRequestProperty("Authorization","Basic " + encoding);
		OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
		wr.write(data);
		wr.flush();

		// Get the response
		BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		StringBuffer result = new StringBuffer();
		int c;
		String doc;

		while ((c = rd.read()) != -1) {
			result.append((char) c);
		}

		doc = result.toString();

		log.debug(doc);
		log.debug(convertXmltoJsonString(doc));

		wr.close();
		rd.close();
	}

	private static int PRETTY_PRINT_INDENT_FACTOR = 4;
    public static String convertXmltoJsonString(String strXml) {

    	String jsonPrettyPrintString = "";

        try {
            JSONObject xmlJSONObj = XML.toJSONObject(strXml);
            jsonPrettyPrintString = xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR);
            log.debug(jsonPrettyPrintString);
        }
        catch (JSONException je) {
            log.error(je.toString());
        }

        return jsonPrettyPrintString;
    }
}