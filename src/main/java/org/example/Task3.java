import com.google.gson.Gson;

import java.io.IOException;
import java.net.URISyntaxException;

public class Task3 {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        String jsonResponse = JokeApiClient.jokeApiRequest();
        System.out.println("Response from API: " + jsonResponse);

        // Convert JSON response to Joke object using Gson
        Gson gson = new Gson();
        Joke joke = gson.fromJson(jsonResponse, Joke.class);
        System.out.println("Joke object: " + joke);
        System.out.println(joke.toString());
    }
}
