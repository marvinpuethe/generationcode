package de.generationcode.flightseries.backend.service;

import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URI;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.ClientHttpRequest;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.stereotype.Component;

import com.google.common.io.CharStreams;

@Component
public class SeriesDataService {
	@Value(value = "${THE_THVDB_TOKEN}")
	private String jwtToken;

	public String findSeries(String name) throws Exception {
		ClientHttpRequest request = new OkHttp3ClientHttpRequestFactory().createRequest(
				new URI("'Accept: application/json' 'https://api.thetvdb.com/search/series?name=" + name + "'"),
				HttpMethod.GET);
		request.getHeaders().add("Authorization", "Bearer " + jwtToken);
		ClientHttpResponse response = request.execute();
		String text = null;		
	    try (final Reader reader = new InputStreamReader(response.getBody())) {
	        text = CharStreams.toString(reader);
	    }
	    return text;
	}

	public static void main(String[] args) throws Exception {
		SeriesDataService service = new SeriesDataService();
		service.jwtToken = "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1NDA3Mjc4MDgsImlkIjoiRmxpZ2h0IFNlcmllcyIsIm9yaWdfaWF0IjoxNTQwNjQxNDA4LCJ1c2VyaWQiOjUxMzYzNSwidXNlcm5hbWUiOiJtYXJ2aW4ucHVldGhlb3gzIn0.S6RvZPkoHHSzHBFsH1uLKkmIpN5ds-K9MsIeXeBRAHWs0RCvr_Zu8ryiOfU_4YIbAgtdQWyBvmfkzWMm9KS1DnKVsbFY8ePms_DcIZ6HYDJ3SbuUmYmRkXu-dZUOdrXEJjP5WPCGl4TDV9dl3JH9t2ZHZ2vBH0q0yVSdJp8m6M8867ieWNtK9od6Eka-jCEzZZ14urvJTc8_yjR4NEpkic1C4lx0Zil8cll7ek8tsh1fUmVPcVmNUwiKzlp6WuLlEXOhQqtKLgPcGKDUtA_90MQmxXURH3TXp90SX05rrUBEMRCpSIwSkP_bQHUvObPz-RZF_9bjRyKpTk-mlLq8HA";
		String response = service.findSeries("supernatural");
		System.out.println(response);
	}
}
