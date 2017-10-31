import java.util.HashMap;
import java.util.Map;

public class songs{
    public static HashMap<String, String> trackLyrics = new HashMap<>();

    public static void main(String[] args){
        trackLyrics.put("song1", "this is song1");
        trackLyrics.put("song2", "this is song2");
        trackLyrics.put("song3", "this is song3");
        trackLyrics.put("song4", "this is song4");
        System.out.println(trackLyrics.get("song2"));

        for (Map.Entry<String, String> entry : trackLyrics.entrySet()){
            System.out.printf("Song: %s and Lyrics: %s", entry.getKey(), entry.getValue());
        }

    }

}