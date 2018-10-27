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
		service.jwtToken = "...";
		String response = service.findSeries("supernatural");
		System.out.println(response);
	}
}
