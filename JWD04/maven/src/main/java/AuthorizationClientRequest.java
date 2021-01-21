//получилось залогиниться через Example2 JAAS/

//import java.util.Base64;

public class AuthorizationClientRequest {
 /*public static String getBase64(){
        return Base64
                .getEncoder()
                .encodeToString(
                        (USERNAME + ":" + PASSWORD)
                                .getBytes()
                );
    }

    public static String getRest(String request) {
        String res = "";
        try {
            URL url = new URL(request);

            String encoding = getBase64();

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setDoOutput(true);
            connection.setRequestProperty("Authorization", "Basic " + encoding);
            InputStream content = connection.getInputStream();
            BufferedReader in =
                    new BufferedReader(new InputStreamReader(content));
            String line;
            while ((line = in.readLine()) != null) {
                res += line + "\n";
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }

*/

}
