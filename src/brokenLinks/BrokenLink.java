package brokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class BrokenLink {
	private String str;

	public String brokenURL(String urlnew) {

		try {

			URL url = new URL(urlnew);

			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			connection.setConnectTimeout(3000);
			str = connection.getResponseMessage();

			if (connection.getResponseCode() == 200) {
				System.out.println(str);

			} else if (connection.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
				System.out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;

	}

}
