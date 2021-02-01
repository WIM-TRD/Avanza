package org.avanza4java.Utils.totp;

import java.io.*;
import java.util.List;

public class totp {
    public static String totpKey;
    public static String totpSecret;
    public totp(String totpKey){
        this.totpKey = totpKey;
        this.totpSecret = generateSecret();
    }

    private String generateSecret() {
        String retVal = "";
        List command;
        try {
            String[] cmd = {
                    "python3",
                    "/home/wim/git/wtrader/domain/src/main/java/org/wTrader/utils/AvanzaAPI/Utils/totp/getTotp.py",
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
