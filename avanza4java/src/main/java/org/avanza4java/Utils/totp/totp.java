package org.avanza4java.Utils.totp;

import java.io.*;
import java.util.List;

public class totp {
    private static String totpKey;
    private static String totpSecret;
    private static final String SCRIPTPATH = "/src/main/java/org/avanza4java/Utils/totp/getTotp.py";
    public totp(String totpKey){
        this.totpKey = totpKey;
        this.totpSecret = generateSecret();
    }

    private String generateSecret() {
        String retVal = "";
        String userDirectory = System.getProperty("user.dir");
        try {
            String[] cmd = {
                    "python3",
                    String.valueOf(userDirectory + SCRIPTPATH),
                    "-t",
                    totpKey
            };
            ProcessBuilder pb = new ProcessBuilder(cmd);
            Process process = pb.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            BufferedReader stdError = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            String line = "";
            while ((line = reader.readLine()) != null) {
                retVal = line;
            }
            while ((line = stdError.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return retVal;
    }

    public static String getTotpSecret() {
        return totpSecret;
    }
}
